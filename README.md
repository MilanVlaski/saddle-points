#Instructions
Write a program to search for the "saddle points" in a 5 by 5 array of integers. A saddle point is a cell whose value is greater than or equal to any in its row, and less than or equal to any in its column.

There may be more than one saddle point in the array. Print out the coordinates of any saddle points your program finds. Print out "No saddle points" if there are none.
#TODO
- [ ] Print saddle points ([1, 1]), or "no saddle points"
- [ ] Return an array of Saddle points
- [ ] Change code to use arrayOf and matrixOf methods everywhere
- [X] Find max elements in each array (row)
	- [X] Find max value in array
	- [X] Then, find indexes of all elements with that value
- [X] Evaluate whether the elements have the minimum value in their respective columns
	- [X] Find min value in array
	- [X] Then, find index of all elements with that value