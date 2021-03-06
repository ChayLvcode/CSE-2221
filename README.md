# CSE-2221 OSU
> It's just a revision for the class materials. Leave me a meesage if there is any wrong in it.
> Here is the [CSE 2221 Schedule](http://web.cse.ohio-state.edu/software/2221/web-sw1/schedule.html)


Describe for projects:

## Project 1: Create Your Own Home Page
The lingua franca of the web is HTML: Hyper Text Markup Language. Your job is to learn enough about well-formed HTML to create a personal home page that includes the following elements: at least one heading, at least one paragraph, at least one image (e.g., a picture of yourself), at least one ordered or unordered list, at least one table (e.g., information about yourself that you are willing to share publicly), and at least one hyperlink to an external page.



## Project 2: Compute Roots Using Newton Iteration
Your first job is to create a Java program that repeatedly asks the user whether they wish to calculate another square root. If the response is "y", then the program should proceed; if it is anything else, then the program should quit. Whenever it proceeds, the program should prompt the user for a number (a positive double, and your program may simply assume the input is consistent with this requirement) and then report the square root of that number to within a relative error of no more than 0.01%. The computation must be done using Newton iteration.

The intuitive idea of Newton iteration for computing square roots is fairly straightforward. Suppose you have a guess r for x1/2 that is too large; the argument is similar if it is too small. If r is too large to be the square root of x, then x/r must be too small, so the average of r and x/r should be a better guess than either r or x/r. This suggests that if you repeatedly replace your current guess r by (r + x/r)/2, then your sequence of guesses should converge to x1/2. And indeed it can be proved that it does. A good initial guess for x1/2 is simply r = x. If you continue updating r until |r2 – x |/x < ε2, then the relative error of the guess r will be less than ε.
