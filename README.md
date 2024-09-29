## Joana Taint Analysis

A small benchmark for testin the Joana capabilities for taint analysis.

### Setup

In the very first moment, execute the `setup.sh` script to download the Joana 
library and configure it as a local maven dependency. 

### Executing the micro securibench

Currently, you might run the 'securibench' benchmark using JUnit test cases. Such as:

   * Aliasing test suite: `mvn test -Dtest="br.unb.cic.joana.securibench.micro.suite.AliasingTestSuite"`
   * Array test suite: `mvn test -Dtest="br.unb.cic.joana.securibench.micro.suite.ArrayTestSuite"`
   * Basic test suite: `mvn test -Dtest="br.unb.cic.joana.securibench.micro.suite.BasicTestSuite"`
   * Collection test suite: `mvn test -Dtest="br.unb.cic.joana.securibench.micro.suite.CollectionTestSuite"`
   * Datastructure test suite: `mvn test -Dtest="br.unb.cic.joana.securibench.micro.suite.DatastructureTestSuite"`
   * Factory test suite: `mvn test -Dtest="br.unb.cic.joana.securibench.micro.suite.FactoryTestSuite"`
   * Inter test suite: `mvn test -Dtest="br.unb.cic.joana.securibench.micro.suite.InterTestSuite"`
   * Session test suite: `mvn test -Dtest="br.unb.cic.joana.securibench.micro.suite.SessionTestSuite"`
   * StrongUpdate test suite: `mvn test -Dtest="br.unb.cic.joana.securibench.micro.suite.StrongUpdateTestSuite"`
   
## TEST

###### failed: 22, passed: 82, ignored: 0 of 104 test (78.85%)

- **AliasingTest** - failed: 1, passed: 5, ignored: 0 of 6 test `(83.33%)`
   - *Fails :*
      - [6]
   - *Violations :* `6/12`
   - *Precision :* `100%` 
   - *Recall :* `45%`
   - *fScore :* `63%`

- **ArraysTest** - failed: 1, passed: 9, ignored: 0 of 10 test `(90%)`
   - *Fails :*
      - [5]
   - *Violations :* `10/9`
   - *Precision :* `90%` 
   - *Recall :* `100%`
   - *fScore :* `95%`

- **BasicTest** - failed: 14, passed: 29, ignored: 0 of 43 test `(67.44%)`
   - *Fails :*
      - [5]
      - [11]
      - [12]
      - [16]
      - [19]
      - [20]
      - [21]
      - [23]
      - [28]
      - [29]
      - [31]
      - [33]
      - [35]
      - [42]
   - *Violations :* `50/60`
   - *Precision :* `81%` 
   - *Recall :* `63%`
   - *fScore :* `71%`
  
- **CollectionTest** - failed: 0, passed: 14, ignored: 0 of 14 test `(100%)`
   - *Violations :* `15/15`

- **DataStructureTest** - failed: 0, passed: 6, ignored: 0 of 6 test `(100%)`
   - *Violations :* `15/15`

- **FactoryTest** - failed: 0, passed: 3, ignored: 0 of 3 test `(100%)`
   - *Violations :* `3/3`

- **InterTest** - failed: 2, passed: 12, ignored: 0 of 14 test `(85.71%)`
   - *Fails :*
      - [2]
      - [6]
   - *Violations :* `13/15`
   - *Precision :* `100%` 
   - *Recall :* `86%`
   - *fScore :* `92%`

- **SessionTest** - failed: 0, passed: 3, ignored: 0 of 3 test `(100%)`
   - *Violations :* `3/3`

- **StrongUpdateTest** - failed: 4, passed: 1, ignored: 0 of 5 test `(20%)`
   - *Fails :*
      - [1]
      - [2]
      - [3]
      - [5]
   - *Violations :* `5/1`
   - *Precision :* `20%` 
   - *Recall :* `100%`
   - *fScore :* `33%`

