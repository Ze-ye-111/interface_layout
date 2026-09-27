# Android UI布局实验项目
> Android Studio 课程实验项目，演示多种UI布局方式与页面跳转，包含Java+XML传统View与Jetpack Compose两种开发方式。

## 📖 项目简介
本项目为Android课程实验作业，通过主菜单统一跳转，演示以下UI布局技术：
- 线性布局（LinearLayout）
- 表格布局（TableLayout）
- 约束布局（ConstraintLayout）—— 计算器页面
- 约束布局（ConstraintLayout）—— 太空旅行页面
- Jetpack Compose —— 任务清单页面

## ✨ 功能清单
| 页面 | 布局方式 | 说明 |
|------|----------|------|
| 主菜单 MainActivity | LinearLayout | 按钮列表，点击跳转各实验页面 |
| 线性布局页面 | LinearLayout | 演示线性排版与HelloWorld |
| 表格布局页面 | TableLayout | 表格行列布局演示 |
| 计算器页面 | ConstraintLayout | 数字按钮+结果显示，4×4按钮网格 |
| 太空旅行页面 | ConstraintLayout | DCA-MARS太空订票界面，含图标、开关、图片 |
| 任务清单页面 | Jetpack Compose | 可添加/勾选/删除任务，实时统计完成数 |

## 🛠️ 开发环境
- Android Studio：最新稳定版
- 开发语言：Java（传统View）+ Kotlin（Jetpack Compose）
- 构建工具：Gradle
- 测试设备：Android模拟器（AVD）
- 版本控制：Git + GitHub

## 📱 模拟器推荐配置
- RAM：4GB
- CPU核心：4核
- VM heap size：256MB
- Graphics acceleration：Software - GLES 2.0（稳定性优先）
- Internal Storage：10GB
- 前置要求：电脑开启CPU虚拟化（VT-x / SVM Mode）+ Windows「虚拟机平台」功能

## 🚀 项目运行步骤
1. 克隆仓库到本地
```bash
git clone https://github.com/你的用户名/你的仓库名.git
1. 使用 Android Studio 打开项目文件夹
2. 等待 Gradle 同步加载（建议配置国内镜像加速）
3. 打开 Device Manager，启动 Android 模拟器
4. 点击 Run ▶ 按钮，编译并安装 App 到模拟器
5. 进入主菜单，点击对应按钮进入各实验页面；使用模拟器返回键回到主菜单
<img width="408" height="798" alt="64297532-18e1-4676-be18-ababab82494d" src="https://github.com/user-attachments/assets/0d840f24-4806-4c0c-b3cb-153800b05d53" />
点击线性布局
<img width="388" height="783" alt="fa32f4d5-5966-4d7e-88ab-7ff6edae6158" src="https://github.com/user-attachments/assets/aad90c1d-0131-4c6f-9729-fb66e92f4059" />
点击table表格布局
<img width="403" height="796" alt="544e9fe6-a9d2-4739-8772-85dd0914bba6" src="https://github.com/user-attachments/assets/b89e9df8-f161-4d25-86b3-7c2208b92f64" />
点击约束布局1 计算器
<img width="400" height="775" alt="bfd2ae70-b2c7-498f-98ca-1a5ae7eb6a3b" src="https://github.com/user-attachments/assets/a7a87a6e-0523-46bd-a687-d9b77b4b0fed" />
点击约束布局2 太空页面
<img width="384" height="775" alt="ebe681ab-5c61-4c8e-9824-5c72bbfc17e1" src="https://github.com/user-attachments/assets/34d6ee2e-8f5f-4493-a560-fb17cf7ce0c4" />
点击compose 任务清单
<img width="424" height="760" alt="96718dda-bafe-4661-b82d-09398c8f4206" src="https://github.com/user-attachments/assets/10de2a63-4d35-4a97-837d-8113ca35b211" />

## 📂 项目结构

```
app/
└── src/main/
    ├── java/com/example/interfacelayout/
    │   ├── MainActivity.java              # 主菜单页面
    │   ├── LinearActivity.java           # 线性布局页面
    │   ├── TableActivity.java             # 表格布局页面
    │   ├── ConstraintCalcActivity.java   # 约束布局-计算器
    │   ├── ConstraintSpaceActivity.java   # 约束布局-太空页面
    │   └── TodoComposeActivity.kt         # Compose任务清单
    ├── res/
    │   ├── layout/
    │   │   ├── activity_main.xml          # 主菜单布局
    │   │   ├── activity_linear.xml         # 线性布局
    │   │   ├── activity_table.xml         # 表格布局
    │   │   ├── activity_constraint_calc.xml  # 计算器布局
    │   │   └── activity_constraint_space.xml # 太空页面布局
    │   └── drawable/                      # 图标资源
    └── AndroidManifest.xml
```







