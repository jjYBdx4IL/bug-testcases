# NetBeans 8.2 bug demo for Bug ID 218658

* http://netbeans.org/bugzilla/show_bug.cgi?id=218658

## Steps to reproduce

* clean project
* trigger CoS for SomeClass.java
* clean install project
* trigger CoS for SomeClass.java, error will pop up for SomeTypedQueryFactory.java
* fix error "permanently" by triggering CoS for SomeEntity.java, "permanently" is until you trigger CoS for SomeClass.java again when project is in cleaned state.


