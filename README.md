# CPU-Scheduling

Implement a priority queue PQueue class using a max-heap and
implement a MaxHeap class using an array. Each node in the max-heap contains a Process object.
The Process class implements the ’Comparable interface’ so that the comparison between nodes in
max-heap can be made by calling the compareTo method of Process.


## Usage

java CPUScheduling <maxProcessTime> <maxPriorityLevel> <timeToIncrementPriority>
<simulationTime> <processArrivalRate>
where
- maxProcessTime: largest possible time units required to finish a process;
- maxPriorityLevel: highest possible priority in this simulation. That is, a process can
have a priority, ranging from 1, 2, . . . , maxPriorityLevel.
- timeToIncrementPriority: if a process didn’t get any CPU time for this timeToIncrementPriority time units, the process’s priority will be increased by one.
- simulationTime: the total time units for the simulation.
- processArrivalRate: using this rate to decide whether to generate a new process in
each time unit.

## License
[MIT](https://choosealicense.com/licenses/mit/)
