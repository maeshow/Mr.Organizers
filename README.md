## Mr.Organizers

幹事くん

## Overview

合計金額と、男性、女性の人数から、それぞれの支払金額を計算する。

## Detail

使用する変数は以下の通り

| 変数名 | タイプ | 備考 |
| ---- | ---- | ---- |
| totalPrice | 数値 | 合計金額 |
| numberOfMale | 数値 | 男性の数 |
| numberOfFemale | 数値 | 女性の数 |

### インターフェース

#### CUI

課題1

数値が以下のとき

| 変数名 | 値 |
| ---- | ---- |
| totalPrice | 12000 |
| numberOfMale | 3 |
| numberOfFemale | 3 |

実行例

``` console
男性：2000 円
女性：2000 円
```

課題2

男性は女性よりも1000円多く支払うときの計算を行う

数値が以下のとき

| 変数名 | 値 |
| ---- | ---- |
| totalPrice | 12000 |
| numberOfMale | 3 |
| numberOfFemale | 3 |

実行例

``` console
男性：2500 円
女性：1500 円
```

## Structure Overview

- src/
    - Task1
        - int[] RESULT
        - enum Type { MALE, FEMALE }
        - main()
        - dividePrice(int totalPrice, int numberOfMale, int numberOfFemale)
        - computePrice(int totalPrice, int numberOfMale, int numberOfFemale)
        - showResult()
    - Task2
        - int[] RESULT
        - enum Type { MALE, FEMALE }
        - main()
        - dividePrice(int totalPrice, int numberOfMale, int numberOfFemale)
        - computePrice(int totalPrice, int numberOfMale, int numberOfFemale)
        - showResult()
    - Messages