
# Speed Enforcement Locations App

## 功能

這個應用程式顯示了從政府公開資料平台獲取的各地區測速照相機位置信息。使用者可以查看特定地點的詳細信息，包括城市名稱、地區名稱、地址、負責單位、分局名稱、經緯度、方向以及速度限制。

### 功能詳述

- **主畫面**：顯示所有測速照相機的位置列表。
- **詳細信息**：點擊列表項目可查看該位置的詳細信息，包括：
  - 城市名稱
  - 地區名稱
  - 地址
  - 負責單位
  - 分局名稱
  - 經緯度
  - 方向
  - 速度限制

## 資料來源

資料來源於政府公開資料平台：
- [交通速度執行地點資料](https://od.moi.gov.tw/api/v1/rest/datastore/A01010000C-000674-011)

## 執行結果畫面

### 主畫面

![Main Screen](imags/P1.png)

### 詳細信息畫面

![Detail Screen](imags/P2.png)

## 如何運行

1. 克隆此儲存庫到本地：
   ```bash
   git clone https://github.com/111b13812/App.git
   cd App
   ```

2. 在 Android Studio 中打開專案。

3. 確保你已經配置好 Android 開發環境。

4. 運行應用程式到模擬器或實體設備。

## 開發環境

- Android Studio 2023.1.1
- Java
- Groovy
