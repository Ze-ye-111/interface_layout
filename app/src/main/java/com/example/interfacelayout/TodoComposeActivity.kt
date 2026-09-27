package com.example.interfacelayout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

// 任务数据类
data class Task(
    val name: String,
    var isCompleted: Boolean
)

class TodoComposeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    TaskListPage()
                }
            }
        }
    }
}

@Composable
fun TaskListPage() {
    // 初始3项任务，第一项默认完成，和PPT完全一致
    val taskList = remember {
        mutableStateListOf(
            Task("学习Column和Row", true),
            Task("学习状态管理", false),
            Task("完成Compose实验", false)
        )
    }
    var inputText by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // 标题
        Text(
            text = "课程学习任务",
            color = Color(0xFFAA0000),
            style = MaterialTheme.typography.headlineSmall
        )

        // 输入框 + 添加按钮一行
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            OutlinedTextField(
                value = inputText,
                onValueChange = { inputText = it },
                placeholder = { Text("请输入学习任务") },
                modifier = Modifier.weight(1f),
                singleLine = true
            )
            Button(
                onClick = {
                    if (inputText.isNotBlank()) {
                        taskList.add(Task(inputText, false))
                        inputText = ""
                    }
                },
                modifier = Modifier.padding(start = 8.dp)
            ) {
                Text("添加")
            }
        }

        // 已完成统计文字
        val completeCount = taskList.count { it.isCompleted }
        Text(
            text = "已完成: $completeCount / ${taskList.size}",
            modifier = Modifier.padding(vertical = 12.dp)
        )

        // LazyColumn 任务列表
        LazyColumn(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(taskList) { task ->
                TaskItem(
                    task = task,
                    onCheckChange = { checked ->
                        task.isCompleted = checked
                    },
                    onDelete = {
                        taskList.remove(task)
                    }
                )
            }
        }
    }
}

// 单行任务组件：复选框 + 任务文字(带删除线) + 删除按钮
@Composable
fun TaskItem(
    task: Task,
    onCheckChange: (Boolean) -> Unit,
    onDelete: () -> Unit
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Checkbox(
            checked = task.isCompleted,
            onCheckedChange = onCheckChange
        )
        Text(
            text = task.name,
            modifier = Modifier.weight(1f),
            textDecoration = if (task.isCompleted) TextDecoration.LineThrough else TextDecoration.None
        )
        Button(onClick = onDelete) {
            Text("删除", color = Color.White)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TaskPreview() {
    MaterialTheme {
        TaskListPage()
    }
}
