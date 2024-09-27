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

###### failed: 44, passed: 60, ignored: 0 of 104 test (57.69%)

- **AliasingTest** - failed: 2, passed: 4, ignored: 0 of 6 test `(66.67%)`
   - *Fails :*
      - [4]
      - [6]
   - *Violations :* `4/26`

- **ArraysTest** - failed: 1, passed: 9, ignored: 0 of 10 test `(90%)`
   - *Fails :*
      - [5]
   - *Violations :* `10/9`

- **BasicTest** - failed: 18, passed: 25, ignored: 0 of 43 test `(58.14%)`
   - *Fails :*
      - [5]
      - [11]
      - [12]
      - [13]
      - [14]
      - [16]
      - [19]
      - [20]
      - [21]
      - [23]
      - [25]
      - [26]
      - [28]
      - [29]
      - [31]
      - [33]
      - [39]
      - [42]
   - *Violations :* `39/70`
  
- **CollectionTest** - failed: 0, passed: 14, ignored: 0 of 14 test `(100%)`

- **DataStructureTest** - failed: 0, passed: 6, ignored: 0 of 6 test `(100%)`

- **FactoryTest** - failed: 0, passed: 3, ignored: 0 of 3 test `(100%)`

- **InterTest** - failed: 4, passed: 10, ignored: 0 of 14 test `(71.43%)`
   - *Fails :*
      - [2]
      - [4]
      - [5]
      - [6]
   - *Violations :* `13/17`

- **SessionTest** - failed: 0, passed: 3, ignored: 0 of 3 test `(100%)`

- **StrongUpdateTest** - failed: 4, passed: 1, ignored: 0 of 5 test `(20%)`
   - *Fails :*
      - [1]
      - [2]
      - [3]
      - [5]
   - *Violations :* `5/1`

