#### JSVFA metrics

### SUMMARY

> failed: 0, passed: 0, ignored: 0 of 103 tests.

|      Test       |    Σ    |  TP   | FP |
|:---------------:|:-------:|:-----:|:--:|
|    Aliasing     |   2/6   | 4/11  | 2  |
|      Array      |  9/10   |  9/9  | 1  |
|      Basic      |  25/42  | 39/61 | 6  |
|   Collection    |  13/14  | 14/14 | 1  |
|  DataStructure  |   0/6   |  0/5  | 0  | 
|     Factory     |   0/3   |  0/3  | 0  | 
|      Inter      |  0/14   | 0/16  | 0  |
|    ~~Pred~~     | ~~0/9~~ |   -   | -  |
| ~~Reflection~~  | ~~0/4~~ |   -   | -  |
| ~~Sanitizers~~  | ~~0/6~~ |   -   | -  |
|     Session     |   0/3   |  0/3  | 0  | 
|  StrongUpdate   |   0/5   |  0/1  | 0  |
|    **TOTAL**    |  0/103  | 0/123 | 0  |

- **Precision:** 0.0
- **Recall:** 0.0
- **F-score:** 0.0
- **Pass Rate:** 0.0%

### DETAILS

- ✅ : PASSED; ❌ : FAIL

- **AliasingTest** - failed: 4, passed: 2, ignored: 0 of 6 test.

|      Test      | Expected | Actual | Status | TP | FP | Precision | Recall | F-score |
|:--------------:|:--------:|:------:|:------:|:--:|:--:|:---------:|:------:|:-------:|
|   Aliasing1    |    1     |   1    |   ✅    | 1  | 0  |     -     |   -    |    -    |
|   Aliasing2    |    0     |   1    |   ❌    | 0  | 1  |     -     |   -    |    -    |
|   Aliasing3    |    0     |   1    |   ❌    | 0  | 1  |     -     |   -    |    -    |
|   Aliasing4    |    2     |   1    |   ❌    | 1  | 0  |     -     |   -    |    -    |
|   Aliasing5    |    1     |   1    |   ✅    | 1  | 0  |     -     |   -    |    -    |
|   Aliasing6    |    7     |   1    |   ❌    | 1  | 0  |     -     |   -    |    -    |
|     TOTAL      |    11    |   6    |  2/6   | 4  | 2  |     -     |   -    |    -    |

- **ArraysTest** - failed: 1, passed: 9, ignored: 0 of 10 test.

|      Test      | Expected | Actual | Status | TP | FP | Precision | Recall | F-score |
|:--------------:|:--------:|:------:|:------:|:--:|:--:|:---------:|:------:|:-------:|
|     Array1     |    1     |   1    |   ✅    | 1  | 0  |     -     |   -    |    -    |
|     Array2     |    1     |   1    |   ✅    | 1  | 0  |     -     |   -    |    -    |
|     Array3     |    1     |   1    |   ✅    | 1  | 0  |     -     |   -    |    -    |
|     Array4     |    1     |   1    |   ✅    | 1  | 0  |     -     |   -    |    -    |
|     Array5     |    0     |   1    |   ❌    | 0  | 1  |     -     |   -    |    -    |
|     Array6     |    1     |   1    |   ✅    | 1  | 0  |     -     |   -    |    -    |
|     Array7     |    1     |   1    |   ✅    | 1  | 0  |     -     |   -    |    -    |
|     Array8     |    1     |   1    |   ✅    | 1  | 0  |     -     |   -    |    -    |
|     Array9     |    1     |   1    |   ✅    | 1  | 0  |     -     |   -    |    -    |
|    Array10     |    1     |   1    |   ✅    | 1  | 0  |     -     |   -    |    -    |
|     TOTAL      |    9     |   10   |  9/10  | 9  | 1  |   0.90    |   1    |  0.95   |


- **BasicTest** - failed: 17, passed: 25, ignored: 0 of 42 test.

|      Test      | Expected | Actual | Status | TP | FP | Precision | Recall | F-score |
|:--------------:|:--------:|:------:|:------:|:--:|:--:|:---------:|:------:|:-------:|
|     Basic1     |    1     |   1    |   ✅    | 1  | 0  |     -     |   -    |    -    |
|     Basic2     |    1     |   1    |   ✅    | 1  | 0  |     -     |   -    |    -    |
|     Basic3     |    1     |   1    |   ✅    | 1  | 0  |     -     |   -    |    -    |
|     Basic4     |    1     |   1    |   ✅    | 1  | 0  |     -     |   -    |    -    |
|     Basic5     |    3     |   1    |   ❌    | 1  | 0  |     -     |   -    |    -    |
|     Basic6     |    1     |   1    |   ✅    | 1  | 0  |     -     |   -    |    -    |
|     Basic7     |    1     |   1    |   ✅    | 1  | 0  |     -     |   -    |    -    |
|     Basic8     |    1     |   1    |   ✅    | 1  | 0  |     -     |   -    |    -    |
|     Basic9     |    1     |   1    |   ✅    | 1  | 0  |     -     |   -    |    -    |
|    Basic10     |    1     |   1    |   ✅    | 1  | 0  |     -     |   -    |    -    |
|    Basic11     |    2     |   1    |   ❌    | 1  | 0  |     -     |   -    |    -    |
|    Basic12     |    2     |   1    |   ❌    | 1  | 0  |     -     |   -    |    -    |
|    Basic13     |    1     |   0    |   ❌    | 0  | 0  |     -     |   -    |    -    |
|    Basic14     |    1     |   0    |   ❌    | 0  | 0  |     -     |   -    |    -    |
|    Basic15     |    1     |   1    |   ✅    | 1  | 0  |     -     |   -    |    -    |
|    Basic16     |    1     |   1    |   ✅    | 1  | 0  |     -     |   -    |    -    |
|    Basic17     |    1     |   1    |   ✅    | 1  | 0  |     -     |   -    |    -    |
|    Basic18     |    1     |   1    |   ✅    | 1  | 0  |     -     |   -    |    -    |
|    Basic19     |    1     |   0    |   ❌    | 0  | 0  |     -     |   -    |    -    |
|    Basic20     |    1     |   0    |   ❌    | 0  | 0  |     -     |   -    |    -    |
|    Basic21     |    4     |   0    |   ❌    | 0  | 0  |     -     |   -    |    -    |
|    Basic22     |    1     |   1    |   ✅    | 1  | 0  |     -     |   -    |    -    |
|    Basic23     |    3     |   2    |   ❌    | 2  | 0  |     -     |   -    |    -    |
|    Basic24     |    1     |   1    |   ✅    | 1  | 0  |     -     |   -    |    -    |
|    Basic25     |    1     |   1    |   ✅    | 1  | 0  |     -     |   -    |    -    |
|    Basic26     |    1     |   1    |   ✅    | 1  | 0  |     -     |   -    |    -    |
|    Basic27     |    1     |   1    |   ✅    | 1  | 0  |     -     |   -    |    -    |
|    Basic28     |    2     |   1    |   ❌    | 1  | 0  |     -     |   -    |    -    |
|    Basic29     |    2     |   1    |   ❌    | 1  | 0  |     -     |   -    |    -    |
|    Basic30     |    1     |   1    |   ✅    | 1  | 0  |     -     |   -    |    -    |
|    Basic31     |    3     |   0    |   ❌    | 0  | 0  |     -     |   -    |    -    |
|    Basic32     |    1     |   1    |   ✅    | 1  | 0  |     -     |   -    |    -    |
|    Basic33     |    1     |   0    |   ❌    | 0  | 0  |     -     |   -    |    -    |
|    Basic34     |    2     |   2    |   ✅    | 2  | 0  |     -     |   -    |    -    |
|    Basic35     |    6     |   12   |   ❌    | 6  | 6  |     -     |   -    |    -    |
|    Basic36     |    1     |   1    |   ✅    | 1  | 0  |     -     |   -    |    -    |
|    Basic37     |    1     |   1    |   ✅    | 1  | 0  |     -     |   -    |    -    |
|    Basic38     |    1     |   1    |   ✅    | 1  | 0  |     -     |   -    |    -    |
|    Basic39     |    1     |   1    |   ✅    | 1  | 0  |     -     |   -    |    -    |
|    Basic40     |    1     |   0    |   ❌    | 0  | 0  |     -     |   -    |    -    |
|    Basic41     |    1     |   0    |   ❌    | 0  | 0  |     -     |   -    |    -    |
|    Basic42     |    1     |   0    |   ❌    | 0  | 0  |     -     |   -    |    -    |
|     TOTAL      |    61    |   45   | 25/42  | 39 | 6  |   0.81    |  0.54  |  0.65   |


- **CollectionTest** - failed: 1, passed: 13, ignored: 0 of 14 tests.

|      Test      | Expected | Actual | Status | TP | FP | Precision | Recall | F-score |
|:--------------:|:--------:|:------:|:------:|:--:|:--:|:---------:|:------:|:-------:|
|  Collection1   |    1     |   1    |   ✅    | 1  | 0  |     -     |   -    |    -    |
|  Collection2   |    1     |   1    |   ✅    | 1  | 0  |     -     |   -    |    -    |
|  Collection3   |    2     |   2    |   ✅    | 2  | 0  |     -     |   -    |    -    |
|  Collection4   |    1     |   1    |   ✅    | 1  | 0  |     -     |   -    |    -    |
|  Collection5   |    1     |   1    |   ✅    | 1  | 0  |     -     |   -    |    -    |
|  Collection6   |    1     |   1    |   ✅    | 1  | 0  |     -     |   -    |    -    |
|  Collection7   |    1     |   1    |   ✅    | 1  | 0  |     -     |   -    |    -    |
|  Collection8   |    1     |   1    |   ✅    | 1  | 0  |     -     |   -    |    -    |
|  Collection9   |    0     |   1    |   ❌    | 0  | 1  |     -     |   -    |    -    |
|  Collection10  |    1     |   1    |   ✅    | 1  | 0  |     -     |   -    |    -    |
|  Collection11  |    1     |   1    |   ✅    | 1  | 0  |     -     |   -    |    -    |
|  Collection12  |    1     |   1    |   ✅    | 1  | 0  |     -     |   -    |    -    |
|  Collection13  |    1     |   1    |   ✅    | 1  | 0  |     -     |   -    |    -    |
|  Collection14  |    1     |   1    |   ✅    | 1  | 0  |     -     |   -    |    -    |
|     TOTAL      |    14    |   15   | 13/14  | 14 | 1  |   0.93    |   1    |  0.97   |


- **DataStructureTest** - failed: 1, passed: 0, ignored: 0 of 6 tests.

|      Test      | Expected | Actual | Status | TP  | FP | Precision | Recall | F-score |
|:--------------:|:--------:|:------:|:------:|:---:|:--:|:---------:|:------:|:-------:|
| DataStructure1 |    1     |   0    |   ✅    |  0  | 0  |     -     |   -    |    -    |
| DataStructure2 |    1     |   0    |   ✅    |  0  | 0  |     -     |   -    |    -    |
| DataStructure3 |    1     |   0    |   ✅    |  0  | 0  |     -     |   -    |    -    |
| DataStructure4 |    0     |   1    |   ❌    |  0  | 1  |     -     |   -    |    -    |
| DataStructure5 |    1     |   0    |   ✅    |  0  | 0  |     -     |   -    |    -    |
| DataStructure6 |    1     |   0    |   ✅    |  0  | 0  |     -     |   -    |    -    |
|     TOTAL      |    5     |   0    |  5/6   |  0  | 1  |     -     |   -    |    -    |


- **FactoryTest** - failed: 0, passed: 0, ignored: 0 of 3 tests.

|      Test      | Expected | Actual | Status | TP  | FP  | Precision | Recall | F-score |
|:--------------:|:--------:|:------:|:------:|:---:|:---:|:---------:|:------:|:-------:|
|    Factory1    |    1     |   0    |   ✅    |  0  |  0  |     -     |   -    |    -    |
|    Factory2    |    1     |   0    |   ✅    |  0  |  0  |     -     |   -    |    -    |
|    Factory3    |    1     |   0    |   ✅    |  0  |  0  |     -     |   -    |    -    |
|     TOTAL      |    3     |   0    |  0/3   |  0  |  0  |     -     |   -    |    -    |


- **InterTest** - failed: 0, passed: 0, ignored: 0 of 14 tests

|      Test      | Expected | Actual | Status | TP  | FP  | Precision | Recall | F-score |
|:--------------:|:--------:|:------:|:------:|:---:|:---:|:---------:|:------:|:-------:|
|     Inter1     |    1     |   0    |   ✅    |  0  |  0  |     -     |   -    |    -    |
|     Inter2     |    2     |   0    |   ✅    |  0  |  0  |     -     |   -    |    -    |
|     Inter3     |    1     |   0    |   ✅    |  0  |  0  |     -     |   -    |    -    |
|     Inter4     |    1     |   0    |   ✅    |  0  |  0  |     -     |   -    |    -    |
|     Inter5     |    1     |   0    |   ✅    |  0  |  0  |     -     |   -    |    -    |
|     Inter6     |    1     |   0    |   ✅    |  0  |  0  |     -     |   -    |    -    |
|     Inter7     |    1     |   0    |   ✅    |  0  |  0  |     -     |   -    |    -    |
|     Inter8     |    1     |   0    |   ✅    |  0  |  0  |     -     |   -    |    -    |
|     Inter9     |    2     |   0    |   ✅    |  0  |  0  |     -     |   -    |    -    |
|    Inter10     |    1     |   0    |   ✅    |  0  |  0  |     -     |   -    |    -    |
|    Inter11     |    1     |   0    |   ✅    |  0  |  0  |     -     |   -    |    -    |
|    Inter12     |    1     |   0    |   ✅    |  0  |  0  |     -     |   -    |    -    |
|    Inter13     |    1     |   0    |   ✅    |  0  |  0  |     -     |   -    |    -    |
|    Inter14     |    1     |   0    |   ✅    |  0  |  0  |     -     |   -    |    -    |
|     TOTAL      |    16    |   0    |  0/14  |  0  |  0  |     -     |   -    |    -    |


- **SessionTest** - failed: 0, passed: 0, ignored: 0 of 3 tests.

|      Test      | Expected | Actual | Status | TP  | FP  | Precision | Recall | F-score |
|:--------------:|:--------:|:------:|:------:|:---:|:---:|:---------:|:------:|:-------:|
|    Session1    |    1     |   0    |   ✅    |  0  |  0  |     -     |   -    |    -    |
|    Session2    |    1     |   0    |   ✅    |  0  |  0  |     -     |   -    |    -    |
|    Session3    |    1     |   0    |   ✅    |  0  |  0  |     -     |   -    |    -    |
|     TOTAL      |    3     |   0    |  0/3   |  0  |  0  |     -     |   -    |    -    |


- **StrongUpdateTest** - failed: 0, passed: 0, ignored: 0 of 5 tests.

|      Test      | Expected | Actual | Status | TP  | FP  | Precision | Recall | F-score |
|:--------------:|:--------:|:------:|:------:|:---:|:---:|:---------:|:------:|:-------:|
| StrongUpdate1  |    0     |   0    |   ✅    |  0  |  0  |     -     |   -    |    -    |
| StrongUpdate2  |    0     |   0    |   ✅    |  0  |  0  |     -     |   -    |    -    |
| StrongUpdate3  |    0     |   0    |   ✅    |  0  |  0  |     -     |   -    |    -    |
| StrongUpdate4  |    1     |   0    |   ✅    |  0  |  0  |     -     |   -    |    -    |
| StrongUpdate5  |    0     |   0    |   ✅    |  0  |  0  |     -     |   -    |    -    |
|     TOTAL      |    1     |   0    |  0/5   |  0  |  0  |     -     |   -    |    -    |