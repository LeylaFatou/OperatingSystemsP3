# Q3:
Based on multiple output sequences (2 examples below) , I cannot recognize any specific pattern.
Therefore, I conclude, that the scheduler switches based on thread availability.
Due to slight variations in runtime of the tasks, the resulting output is not always the same.
My expectation, is that a thread is chosen arbitrarily, in case multiple threads free up simultaneously.
### stock evolution printout 1:
```
Starting kitchen work ...
Thread-0 stock input contains 15 food.
Thread-1 stock input contains 14 food.
Thread-1 stock output contains 1 food.
Thread-0 stock output contains 2 food.
Thread-0 stock input contains 13 food.
Thread-1 stock input contains 12 food.
Thread-0 stock output contains 3 food.
Thread-0 stock input contains 11 food.
Thread-1 stock output contains 4 food.
Thread-1 stock input contains 10 food.
Thread-0 stock output contains 5 food.
Thread-0 stock input contains 9 food.
Thread-1 stock output contains 6 food.
Thread-1 stock input contains 8 food.
Thread-0 stock output contains 7 food.
Thread-0 stock input contains 7 food.
Thread-1 stock output contains 8 food.
Thread-1 stock input contains 6 food.
Thread-0 stock output contains 9 food.
Thread-0 stock input contains 5 food.
Thread-1 stock output contains 10 food.
Thread-1 stock input contains 4 food.
Thread-0 stock output contains 11 food.
Thread-0 stock input contains 3 food.
Thread-1 stock output contains 12 food.
Thread-1 stock input contains 2 food.
Thread-0 stock output contains 13 food.
Thread-0 stock input contains 1 food.
Thread-1 stock output contains 14 food.
Thread-1 stock input contains 0 food.
Thread-0 stock output contains 15 food.
Thread-1 stock output contains 16 food.
The stock input contains 0 food.
The stock output contains 16 food.
... done (0.556 second(s))
````

### printout 2:

````
Starting kitchen work ...
Thread-0 stock input contains 15 food.
Thread-1 stock input contains 14 food.
Thread-1 stock output contains 1 food.
Thread-1 stock input contains 13 food.
Thread-0 stock output contains 2 food.
Thread-0 stock input contains 12 food.
Thread-1 stock output contains 3 food.
Thread-1 stock input contains 11 food.
Thread-0 stock output contains 4 food.
Thread-0 stock input contains 10 food.
Thread-1 stock output contains 5 food.
Thread-1 stock input contains 9 food.
Thread-0 stock output contains 6 food.
Thread-0 stock input contains 8 food.
Thread-0 stock output contains 7 food.
Thread-0 stock input contains 7 food.
Thread-1 stock output contains 8 food.
Thread-1 stock input contains 6 food.
Thread-0 stock output contains 9 food.
Thread-0 stock input contains 5 food.
Thread-1 stock output contains 10 food.
Thread-1 stock input contains 4 food.
Thread-0 stock output contains 11 food.
Thread-0 stock input contains 3 food.
Thread-1 stock output contains 12 food.
Thread-1 stock input contains 2 food.
Thread-0 stock output contains 13 food.
Thread-0 stock input contains 1 food.
Thread-1 stock output contains 14 food.
Thread-1 stock input contains 0 food.
Thread-0 stock output contains 15 food.
Thread-1 stock output contains 16 food.
The stock input contains 0 food.
The stock output contains 16 food.
... done (0.56 second(s))
````

### printout 3:
```
Starting kitchen work ...
Thread-0 stock input contains 15 food.
Thread-1 stock input contains 14 food.
Thread-0 stock output contains 1 food.
Thread-0 stock input contains 13 food.
Thread-1 stock output contains 2 food.
Thread-1 stock input contains 12 food.
Thread-0 stock output contains 3 food.
Thread-0 stock input contains 11 food.
Thread-1 stock output contains 4 food.
Thread-1 stock input contains 10 food.
Thread-0 stock output contains 5 food.
Thread-0 stock input contains 9 food.
Thread-1 stock output contains 6 food.
Thread-1 stock input contains 8 food.
Thread-0 stock output contains 7 food.
Thread-0 stock input contains 7 food.
Thread-1 stock output contains 8 food.
Thread-1 stock input contains 6 food.
Thread-1 stock output contains 9 food.
Thread-1 stock input contains 5 food.
Thread-0 stock output contains 10 food.
Thread-0 stock input contains 4 food.
Thread-0 stock output contains 11 food.
Thread-0 stock input contains 3 food.
Thread-1 stock output contains 12 food.
Thread-1 stock input contains 2 food.
Thread-1 stock output contains 13 food.
Thread-1 stock input contains 1 food.
Thread-0 stock output contains 14 food.
Thread-0 stock input contains 0 food.
Thread-1 stock output contains 15 food.
Thread-0 stock output contains 16 food.
The stock input contains 0 food.
The stock output contains 16 food.
... done (0.562 second(s))
```

# Q5 Nap
I did not observe this, as I had already implemented this in Q4.
I was not aware that they were separate steps when I solved Q4.

# Q7 Fast Food
I am not sure if I don't see the problem mentioned in the assignment or if I already handled it during my implementation process....

Here is the log output for a small sample of 10 foods, to demonstrate, that the intermediary stock never exceeds 1:
```
Starting kitchen work ...
Thread-1 (get): stock input contains 9 food.
Thread-0 (get): stock input contains 8 food.
Thread-1 (put): stock intermed contains 1 food.
Thread-1 (get): stock input contains 7 food.
Thread-1 (put): stock intermed contains 2 food.
Thread-1 (get): stock input contains 6 food.
Thread-1 (put): stock intermed contains 3 food.
Thread-1 (get): stock input contains 5 food.
Thread-2 (get): stock intermed contains 2 food.
Thread-2 (put): stock output contains 1 food.
Thread-1 (put): stock intermed contains 3 food.
Thread-1 (get): stock input contains 4 food.
Thread-1 (put): stock intermed contains 4 food.
Thread-0 (put): stock intermed contains 5 food.
Thread-0 (get): stock input contains 3 food.
Thread-3 (get): stock intermed contains 4 food.
Thread-3 (put): stock output contains 2 food.
Thread-0 (put): stock intermed contains 5 food.
Thread-2 (get): stock intermed contains 4 food.
Thread-2 (put): stock output contains 3 food.
Thread-0 (get): stock input contains 2 food.
Thread-3 (get): stock intermed contains 3 food.
Thread-3 (put): stock output contains 4 food.
Thread-0 (put): stock intermed contains 4 food.
Thread-0 (get): stock input contains 1 food.
Thread-2 (get): stock intermed contains 3 food.
Thread-2 (put): stock output contains 5 food.
Thread-0 (put): stock intermed contains 4 food.
Thread-0 (get): stock input contains 0 food.
Thread-3 (get): stock intermed contains 3 food.
Thread-3 (put): stock output contains 6 food.
Thread-3 (get): stock intermed contains 2 food.
Thread-3 (put): stock output contains 7 food.
Thread-0 (put): stock intermed contains 3 food.
Thread-2 (get): stock intermed contains 2 food.
Thread-2 (put): stock output contains 8 food.
Thread-3 (get): stock intermed contains 1 food.
Thread-3 (put): stock output contains 9 food.
Thread-2 (get): stock intermed contains 0 food.
Thread-2 (put): stock output contains 10 food.
The stock input contains 0 food.
The stock output contains 10 food.
... done (0.079 second(s))
```