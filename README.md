## Joana Taint Analysis

A small benchmark for testin the Joana capabilities for taint analysis.

### Setup

In the very first moment, execute the `./setup.sh` script to download the Joana 
library and configure it as a local maven dependency. 

## TEST

Run an specific test: `mvn test -Dtest="br.unb.cic.joana.securibench.v1.micro.suite.SpecificTest"`

### Executing the micro securibench

Currently, you might run the 'securibench' benchmark using JUnit test cases. Such as:

   * Aliasing test suite: `mvn test -Dtest="br.unb.cic.joana.securibench.v1.micro.suite.AliasingTestSuite"`
   * Array test suite: `mvn test -Dtest="br.unb.cic.joana.securibench.v1.micro.suite.ArrayTestSuite"`
   * Basic test suite: `mvn test -Dtest="br.unb.cic.joana.securibench.v1.micro.suite.BasicTestSuite"`
   * Collection test suite: `mvn test -Dtest="br.unb.cic.joana.securibench.v1.micro.suite.CollectionTestSuite"`
   * Datastructure test suite: `mvn test -Dtest="br.unb.cic.joana.securibench.v1.micro.suite.DatastructureTestSuite"`
   * Factory test suite: `mvn test -Dtest="br.unb.cic.joana.securibench.v1.micro.suite.FactoryTestSuite"`
   * Inter test suite: `mvn test -Dtest="br.unb.cic.joana.securibench.v1.micro.suite.InterTestSuite"`
   * Session test suite: `mvn test -Dtest="br.unb.cic.joana.securibench.v1.micro.suite.SessionTestSuite"`
   * StrongUpdate test suite: `mvn test -Dtest="br.unb.cic.joana.securibench.v1.micro.suite.StrongUpdateTestSuite"`
   * All test suite: `mvn test -Dtest="br.unb.cic.joana.securibench.v1.micro.suite.AllTestSuite"`
   
<!-- ### Executing the micro securibench

Currently, you might run the 'securibench' benchmark using JUnit test cases. Such as:

   * Aliasing test suite: `mvn test -Dtest="br.unb.cic.joana.securibench.v2.micro.suite.AliasingTestSuite"`
   * Array test suite: `mvn test -Dtest="br.unb.cic.joana.securibench.v2.micro.suite.ArrayTestSuite"`
   * Basic test suite: `mvn test -Dtest="br.unb.cic.joana.securibench.v2.micro.suite.BasicTestSuite"`
   * Collection test suite: `mvn test -Dtest="br.unb.cic.joana.securibench.v2.micro.suite.CollectionTestSuite"`
   * Datastructure test suite: `mvn test -Dtest="br.unb.cic.joana.securibench.v2.micro.suite.DatastructureTestSuite"`
   * Factory test suite: `mvn test -Dtest="br.unb.cic.joana.securibench.v2.micro.suite.FactoryTestSuite"`
   * Inter test suite: `mvn test -Dtest="br.unb.cic.joana.securibench.v2.micro.suite.InterTestSuite"`
   * Session test suite: `mvn test -Dtest="br.unb.cic.joana.securibench.v2.micro.suite.SessionTestSuite"`
   * StrongUpdate test suite: `mvn test -Dtest="br.unb.cic.joana.securibench.v2.micro.suite.StrongUpdateTestSuite"` -->


###### failed: 31, passed: 72, ignored: 0 of 103 test (69.90%)

|     Test      |   TP    | FP  | FN  | 
|:-------------:|:-------:|:---:|:---:|
|   Aliasing    |   2/11  |  2  |  7  |   
|     Array     |   0/0   |  0  |  0  |   
|     Basic     |   0/0   |  0  |  0  |  
|  Collection   |   0/0   |  0  |  0  | 
| DataStructure |   0/0   |  0  |  0  |  
|    Factory    |   0/0   |  0  |  0  |  
|     Inter     |   0/0   |  0  |  0  |  
|    Session    |   0/0   |  0  |  0  |  
| StrongUpdate  |   0/0   |  0  |  0  |   
|   **TOTAL**   |   0/0   |  0  |  0  |   

- **Violations:** 123/138
- **Precision:** 0.82
- **Recall:** 0.72
- **F-score:** 0.76


#### Detailed information

- **AliasingTest** - ❌ed: 4, ✅ed: 2 of 6 tests. `(33.33%)`

| Test      | Found | Expected | Status | TP | FP | FN | Precision | Recall | F1   |
|-----------|-------|----------|--------|----|----|----|-----------|--------|------|
| Aliasing6 | 1     | 7        | ❌      | 0  | 0  | 6  | 0.00      | 0.00   | 0.00 |
| Aliasing4 | 1     | 2        | ❌      | 0  | 0  | 1  | 0.00      | 0.00   | 0.00 |
| Aliasing5 | 1     | 1        | ✅      | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Aliasing2 | 1     | 0        | ❌      | 0  | 1  | 0  | 0.00      | 0.00   | 0.00 |
| Aliasing3 | 1     | 0        | ❌      | 0  | 1  | 0  | 0.00      | 0.00   | 0.00 |
| Aliasing1 | 1     | 1        | ✅      | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| TOTAL     | 6     | 11       | 2/6    | 2  | 2  | 7  | 0.50      | 0.22   | 0.31 |


- **ArraysTest** - failed: 1, passed: 9 of 10 tests. `(90.00%)`

| Test     | Found | Expected | Status  | TP  | FP  | FN  | Precision | Recall   | F1   |
|----------|-------|----------|---------|-----|-----|-----|-----------|----------|------|
| Arrays5  | 1     | 0        | FAIL    | 0   | 1   | 0   | 0.00      | 0.00     | 0.00 |
| Arrays4  | 1     | 1        | PASS    | 1   | 0   | 0   | 1.00      | 1.00     | 1.00 |
| Arrays3  | 1     | 1        | PASS    | 1   | 0   | 0   | 1.00      | 1.00     | 1.00 |
| Arrays2  | 1     | 1        | PASS    | 1   | 0   | 0   | 1.00      | 1.00     | 1.00 |
| Arrays9  | 1     | 1        | PASS    | 1   | 0   | 0   | 1.00      | 1.00     | 1.00 |
| Arrays8  | 1     | 1        | PASS    | 1   | 0   | 0   | 1.00      | 1.00     | 1.00 |
| Arrays7  | 1     | 1        | PASS    | 1   | 0   | 0   | 1.00      | 1.00     | 1.00 |
| Arrays6  | 1     | 1        | PASS    | 1   | 0   | 0   | 1.00      | 1.00     | 1.00 |
| Arrays1  | 1     | 1        | PASS    | 1   | 0   | 0   | 1.00      | 1.00     | 1.00 |
| Arrays10 | 1     | 1        | PASS    | 1   | 0   | 0   | 1.00      | 1.00     | 1.00 |
| TOTAL    | 10    | 9        | 9/10    | 9   | 1   | 0   | 0.90      | 1.00     | 0.95 |


- **BasicTest** - failed: 17, passed: 25 of 42 tests. `(59.52%)`

| Test    | Found  | Expected  | Status  | TP  | FP  | FN  | Precision  | Recall  | F1   |
|---------|--------|-----------|---------|-----|-----|-----|------------|---------|------|
| Basic9  | 1      | 1         | PASS    | 1   | 0   | 0   | 1.00       | 1.00    | 1.00 |
| Basic8  | 1      | 1         | PASS    | 1   | 0   | 0   | 1.00       | 1.00    | 1.00 |
| Basic7  | 1      | 1         | PASS    | 1   | 0   | 0   | 1.00       | 1.00    | 1.00 |
| Basic6  | 1      | 1         | PASS    | 1   | 0   | 0   | 1.00       | 1.00    | 1.00 |
| Basic5  | 1      | 3         | FAIL    | 0   | 0   | 2   | 0.00       | 0.00    | 0.00 |
| Basic4  | 1      | 1         | PASS    | 1   | 0   | 0   | 1.00       | 1.00    | 1.00 |
| Basic3  | 1      | 1         | PASS    | 1   | 0   | 0   | 1.00       | 1.00    | 1.00 |
| Basic2  | 1      | 1         | PASS    | 1   | 0   | 0   | 1.00       | 1.00    | 1.00 |
| Basic1  | 1      | 1         | PASS    | 1   | 0   | 0   | 1.00       | 1.00    | 1.00 |
| Basic19 | 0      | 1         | FAIL    | 0   | 0   | 1   | 0.00       | 0.00    | 0.00 |
| Basic39 | 1      | 1         | PASS    | 1   | 0   | 0   | 1.00       | 1.00    | 1.00 |
| Basic17 | 1      | 1         | PASS    | 1   | 0   | 0   | 1.00       | 1.00    | 1.00 |
| Basic18 | 1      | 1         | PASS    | 1   | 0   | 0   | 1.00       | 1.00    | 1.00 |
| Basic15 | 1      | 1         | PASS    | 1   | 0   | 0   | 1.00       | 1.00    | 1.00 |
| Basic37 | 1      | 1         | PASS    | 1   | 0   | 0   | 1.00       | 1.00    | 1.00 |
| Basic38 | 1      | 1         | PASS    | 1   | 0   | 0   | 1.00       | 1.00    | 1.00 |
| Basic16 | 1      | 1         | PASS    | 1   | 0   | 0   | 1.00       | 1.00    | 1.00 |
| Basic35 | 12     | 6         | FAIL    | 0   | 6   | 0   | 0.00       | 0.00    | 0.00 |
| Basic13 | 0      | 1         | FAIL    | 0   | 0   | 1   | 0.00       | 0.00    | 0.00 |
| Basic14 | 0      | 1         | FAIL    | 0   | 0   | 1   | 0.00       | 0.00    | 0.00 |
| Basic36 | 1      | 1         | PASS    | 1   | 0   | 0   | 1.00       | 1.00    | 1.00 |
| Basic11 | 1      | 2         | FAIL    | 0   | 0   | 1   | 0.00       | 0.00    | 0.00 |
| Basic33 | 0      | 1         | FAIL    | 0   | 0   | 1   | 0.00       | 0.00    | 0.00 |
| Basic34 | 2      | 2         | PASS    | 2   | 0   | 0   | 1.00       | 1.00    | 1.00 |
| Basic12 | 1      | 2         | FAIL    | 0   | 0   | 1   | 0.00       | 0.00    | 0.00 |
| Basic31 | 0      | 3         | FAIL    | 0   | 0   | 3   | 0.00       | 0.00    | 0.00 |
| Basic32 | 1      | 1         | PASS    | 1   | 0   | 0   | 1.00       | 1.00    | 1.00 |
| Basic10 | 1      | 1         | PASS    | 1   | 0   | 0   | 1.00       | 1.00    | 1.00 |
| Basic30 | 1      | 1         | PASS    | 1   | 0   | 0   | 1.00       | 1.00    | 1.00 |
| Basic28 | 1      | 2         | FAIL    | 0   | 0   | 1   | 0.00       | 0.00    | 0.00 |
| Basic29 | 1      | 2         | FAIL    | 0   | 0   | 1   | 0.00       | 0.00    | 0.00 |
| Basic26 | 1      | 1         | PASS    | 1   | 0   | 0   | 1.00       | 1.00    | 1.00 |
| Basic27 | 1      | 1         | PASS    | 1   | 0   | 0   | 1.00       | 1.00    | 1.00 |
| Basic24 | 1      | 1         | PASS    | 1   | 0   | 0   | 1.00       | 1.00    | 1.00 |
| Basic25 | 1      | 1         | PASS    | 1   | 0   | 0   | 1.00       | 1.00    | 1.00 |
| Basic22 | 1      | 1         | PASS    | 1   | 0   | 0   | 1.00       | 1.00    | 1.00 |
| Basic23 | 2      | 3         | FAIL    | 0   | 0   | 1   | 0.00       | 0.00    | 0.00 |
| Basic42 | 0      | 1         | FAIL    | 0   | 0   | 1   | 0.00       | 0.00    | 0.00 |
| Basic20 | 0      | 1         | FAIL    | 0   | 0   | 1   | 0.00       | 0.00    | 0.00 |
| Basic21 | 0      | 4         | FAIL    | 0   | 0   | 4   | 0.00       | 0.00    | 0.00 |
| Basic40 | 0      | 1         | FAIL    | 0   | 0   | 1   | 0.00       | 0.00    | 0.00 |
| Basic41 | 0      | 1         | FAIL    | 0   | 0   | 1   | 0.00       | 0.00    | 0.00 |
| TOTAL   | 45     | 61        | 25/42   | 26  | 6   | 22  | 0.81       | 0.54    | 0.65 |

- **CollectionTest** - failed: 1, passed: 13 of 14 tests. `(92.86%)`

| Test          | Found  | Expected  | Status  | TP  | FP  | FN | Precision | Recall | F1   |
|---------------|--------|-----------|---------|-----|-----|----|-----------|--------|------|
| Collections8  | 1      | 1         | PASS    | 1   | 0   | 0  | 1.00      | 1.00   | 1.00 |
| Collections9  | 1      | 0         | FAIL    | 0   | 1   | 0  | 0.00      | 0.00   | 0.00 |
| Collections10 | 1      | 1         | PASS    | 1   | 0   | 0  | 1.00      | 1.00   | 1.00 |
| Collections1  | 1      | 1         | PASS    | 1   | 0   | 0  | 1.00      | 1.00   | 1.00 |
| Collections2  | 1      | 1         | PASS    | 1   | 0   | 0  | 1.00      | 1.00   | 1.00 |
| Collections3  | 2      | 2         | PASS    | 2   | 0   | 0  | 1.00      | 1.00   | 1.00 |
| Collections4  | 1      | 1         | PASS    | 1   | 0   | 0  | 1.00      | 1.00   | 1.00 |
| Collections5  | 1      | 1         | PASS    | 1   | 0   | 0  | 1.00      | 1.00   | 1.00 |
| Collections6  | 1      | 1         | PASS    | 1   | 0   | 0  | 1.00      | 1.00   | 1.00 |
| Collections7  | 1      | 1         | PASS    | 1   | 0   | 0  | 1.00      | 1.00   | 1.00 |
| Collections14 | 1      | 1         | PASS    | 1   | 0   | 0  | 1.00      | 1.00   | 1.00 |
| Collections13 | 1      | 1         | PASS    | 1   | 0   | 0  | 1.00      | 1.00   | 1.00 |
| Collections12 | 1      | 1         | PASS    | 1   | 0   | 0  | 1.00      | 1.00   | 1.00 |
| Collections11 | 1      | 1         | PASS    | 1   | 0   | 0  | 1.00      | 1.00   | 1.00 |
| TOTAL         | 15     | 14        | 13/14   | 14  | 1   | 0  | 0.93      | 1.00   | 0.96 |


- **DataStructureTest** - failed: 1, passed: 5 of 6 tests. `(83.33%)`

| Test            | Found | Expected | Status | TP | FP | FN | Precision | Recall | F1   |
|-----------------|-------|----------|--------|----|----|----|-----------|--------|------|
| Datastructures1 | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Datastructures6 | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Datastructures4 | 1     | 0        | FAIL   | 0  | 1  | 0  | 0.00      | 0.00   | 0.00 |
| Datastructures5 | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Datastructures2 | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Datastructures3 | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| TOTAL           | 6     | 5        | 5/6    | 5  | 1  | 0  | 0.83      | 1.00   | 0.91 |


- **FactoryTest** - failed: 0, passed: 3 of 3 tests. `(100.00%)`

| Test       | Found | Expected | Status | TP | FP | FN | Precision | Recall | F1   |
|------------|-------|----------|--------|----|----|----|-----------|--------|------|
| Factories1 | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Factories2 | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Factories3 | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| TOTAL      | 3     | 3        | 3/3    | 3  | 0  | 0  | 1.00      | 1.00   | 1.00 |


- **InterTest** - failed: 3, passed: 11 of 14 tests. `(78.57%)`

| Test    | Found | Expected | Status | TP | FP | FN | Precision | Recall | F1   |
|---------|-------|----------|--------|----|----|----|-----------|--------|------|
| Inter11 | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Inter12 | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Inter10 | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Inter8  | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Inter9  | 1     | 2        | FAIL   | 0  | 0  | 1  | 0.00      | 0.00   | 0.00 |
| Inter13 | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Inter6  | 0     | 1        | FAIL   | 0  | 0  | 1  | 0.00      | 0.00   | 0.00 |
| Inter14 | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Inter7  | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Inter1  | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Inter4  | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Inter5  | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Inter2  | 1     | 2        | FAIL   | 0  | 0  | 1  | 0.00      | 0.00   | 0.00 |
| Inter3  | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| TOTAL   | 13    | 16       | 11/14  | 11 | 0  | 3  | 1.00      | 0.79   | 0.88 |


- **SessionTest** - failed: 0, passed: 3 of 3 tests. `(100.00%)`

| Test     | Found | Expected | Status | TP | FP | FN | Precision | Recall | F1   |
|----------|-------|----------|--------|----|----|----|-----------|--------|------|
| Session3 | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Session2 | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| Session1 | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| TOTAL    | 3     | 3        | 3/3    | 3  | 0  | 0  | 1.00      | 1.00   | 1.00 |


- **StrongUpdateTest** - failed: 4, passed: 1 of 5 tests. `(20.00%)`

| Test           | Found | Expected | Status | TP | FP | FN | Precision | Recall | F1   |
|----------------|-------|----------|--------|----|----|----|-----------|--------|------|
| StrongUpdates2 | 1     | 0        | FAIL   | 0  | 1  | 0  | 0.00      | 0.00   | 0.00 |
| StrongUpdates1 | 1     | 0        | FAIL   | 0  | 1  | 0  | 0.00      | 0.00   | 0.00 |
| StrongUpdates4 | 1     | 1        | PASS   | 1  | 0  | 0  | 1.00      | 1.00   | 1.00 |
| StrongUpdates3 | 1     | 0        | FAIL   | 0  | 1  | 0  | 0.00      | 0.00   | 0.00 |
| StrongUpdates5 | 1     | 0        | FAIL   | 0  | 1  | 0  | 0.00      | 0.00   | 0.00 |
| TOTAL          | 5     | 1        | 1/5    | 1  | 4  | 0  | 0.20      | 1.00   | 0.33 |