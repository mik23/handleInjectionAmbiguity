# Handle Injection Ambiguity with Spring
How can ambiguity be managed in the case of multiple autowired Component (or Beans)?
You can use the annotation qualifier and associate a particular label to the components in case you get two Component classes that implement the same interface; but what if you want to use two qualifiers with the same key?
Spring is not able to recognize the right class to be injected, because ambiguity is obtained once again, ie two components with the same key.
You need to introduce another Qualifier name to distinguish them.
Unfortunately, java does not allow you to repeat multiple annotations of the same type on the same object.
You must write one or more (different) annotations annotated as Qualifier and apply it on the class to distinguish it from the others.
