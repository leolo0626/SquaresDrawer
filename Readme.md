<h1> Square Drawer</h1>


<h3> Add Single Square </h3>

````
SquareDrawer2 squareDrawer = new SquareDrawer2();
squareDrawer.addEdgeLength(5);
System.out.print(squareDrawer.drawSquares());
````
output
```aidl
#####
#   #
#   #
#   #
#####
```

<h3> Add Multiple Square </h3>

````
SquareDrawer2 squareDrawer = new SquareDrawer2();
squareDrawer.addEdgeLength(5);
squareDrawer.addEdgeLength(10);
System.out.print(squareDrawer.drawSquares());
````

output
```aidl
##########
#   #    #
#   #    #
#   #    #
#####    #
#        #
#        #
#        #
#        #
##########


```