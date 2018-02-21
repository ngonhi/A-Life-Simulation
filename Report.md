# Experiment Report

## Iterations = 10 and Population = 10
### Cooperator = 1 and Defectors = 9
| Organism |Cooperator | Defector | Partial Cooperator | Mean Cooperation |
| -------- | --------- | -------- | ------------------ | ---------------- |
| Before tick | 1 | 9 | 0 | X |
| Predictions | 0 | 10 | 0 | 0.0 |
| Run 1 | 0 | 10 | 0 | 0.0 |
| Run 2 | 0 | 10 | 0 | 0.0 |
| Run 3 | 1 | 9 | 0 | 0.1 |
| Run 4 | 1 | 9 | 0 | 0.1 |
| Run 5 | 1 | 9 | 0 | 0.1 |
| Run 6 | 0 | 10 | 0 | 0.0 |
| Run 7 | 0 | 10 | 0 | 0.0 |
| Run 8 | 0 | 10 | 0 | 0.0 |
| Run 9 | 0 | 10 | 0 | 0.0 |
| Run 10 | 0 | 10 | 0 | 0.0 |
| Average |  |  |  | 0.03 | 
 #### Report:

   - We predict that after 10 ticks, the number of cooperator will reduce from 1 to 0,
  and the number of defectors will increase from 9 to 10 because cooperators and defectors
  at the beginning of the experiment have 0 point of energy. Every time the only cooperator 
  cooperates with other organisms, it will lose 1 point of energy it gains through 'update', 
  while the defectors can never cooperate, so the only cooperator's energy can never exceed 1.
  This means that cooperator cannot reproduce a new organism of type Cooperator. As a result,
  with the defectors keep on increasing their energy, they will have higher chance of
  replacing the only cooperator, resulting in 0 cooperator and 10 defectors. 
   - The means of cooperation probability are indicated in the above table. 
   - The results of 10 experiments support our prediction.

### Cooperators = 9 and Defector = 1
| Organism |Cooperator | Defector | Partial Cooperator | Mean Cooperation |
| -------- | --------- | -------- | ------------------ | ---------------- |
| Before tick | 9 | 1 | 0 | X |
| Predictions | 10 | 0 | 0 | 1.0 |
| Run 1 | 10 | 0 | 0 | 1.0 |
| Run 2 | 10 | 0 | 0 | 1.0 |
| Run 3 | 7 | 3 | 0 | 0.7 |
| Run 4 | 10 | 0 | 0 | 1.0 |
| Run 5 | 5  | 5 | 0 | 0.5 |
| Run 6 | 10 | 0 | 0 | 1.0 |
| Run 7 | 10 | 0 | 0 | 1.0 |
| Run 8 | 10 | 0 | 0 | 1.0 |
| Run 9 | 5 | 5 | 0 | 0.5 |
| Run 10 | 10 | 0 | 0 | 1.0 |
| Average |  |  |  | 0.87 | 
#### Report:

  - We predict that after 10 ticks, the number of cooperators will increase from 9 to 10,
  and the number of defector will decrease from 1 to 0 because cooperators can grow rapidly using
  the energy given by the other cooperator although they also lose 1 energy point when cooperating,
  and when they reach 10 energy points, they will have higher a chance to reproduce the new Cooperators 
  and then replace the only one defector, causing the defector to become 0 forever.
    - The means of cooperation probability are indicated in the above table. 
    - The results of 10 experiments partially support our prediction. There are cases when the single defectors
  gained a lot of energy given by the 9 cooperators through 'update' method and thus grew faster
  while cooperators lost energy through cooperating besides gaining energy through 'update'. 
  Therefore the number of defectors can occasionally be more than 0.

### Cooperators = 3 and Defectors = 3 and Partial Cooperators = 4
| Organism |Cooperator | Defector | Partial Cooperator | Mean Cooperation |
| -------- | --------- | -------- | ------------------ | ---------------- |
| Before tick | 3 | 3 | 4 | X |
| Predictions | 1 | 7 | 2 | 0.2 |
| Run 1 | 0 | 7 | 3 | 0.15 | 
| Run 2 | 7 | 3 | 0 | 0.7 |
| Run 3 | 1 | 6 | 3 | 0.25 |
| Run 4 | 3 | 6 | 1 | 0.35 |
| Run 5 | 1 | 2 | 7 | 0.45 |
| Run 6 | 1 | 6 | 3 | 0.25 |
| Run 7 | 1 | 7 | 2 | 0.2 |
| Run 8 | 2 | 4 | 4 | 0.4 |
| Run 9 | 1 | 7 | 2 | 0.2 |
| Run 10 | 1 | 4 | 5 | 0.35 |
| Average |  |  |  | 0.33 | 
#### Report: 

- We predicted that the number of the defectors will be the largest, because they have 
the ability to receive energy points produced by cooperations without losing energy in 'update's.
The number of cooperators will decrease because they will likely be replaced by other two types 
before they gain enough energy to reproduce. 
- The means of cooperation probability are indicated in the above table.
- The results partly support our prediction. The exceptions are Run 2, Run 5 and Run 10: The 
reason maybe deal with randomness of which organisms receive the energy from cooperating,
randomness of which partial cooperators will cooperate, few iterations and the small population over all. 


## Iterations = 100 and Population Size = 100
### Cooperator = 1 and Defectors = 99
| Organism |Cooperator | Defector | Partial Cooperator | Mean Cooperation |
| -------- | --------- | -------- | ------------------ | ---------------- |
| Before tick | 1 | 99 | 0 | X |
| Predictions | 0 | 100| 0 | 0.0 |
| Run 1 | 0 | 100 | 0 | 0.0 |
| Run 2 | 0 | 100 | 0 | 0.0 |
| Run 3 | 0 | 100 | 0 | 0.0 |
| Run 4 | 0 | 100 | 0 | 0.0 |
| Run 5 | 0 | 100 | 0 | 0.0 |
| Run 6 | 0 | 100 | 0 | 0.0 |
| Run 7 | 0 | 100 | 0 | 0.0 |
| Run 8 | 0 | 100 | 0 | 0.0 |
| Run 9 | 0 | 100 | 0 | 0.0 |
| Run 10 | 0 | 100 | 0 | 0.0 |
| Average |  |  |  | 0.0| 
#### Report:

  - We predict that after 10 ticks, the number of cooperator will reduce from 1 to 0,
  and the number of defectors will increase from 99 to 100 because cooperators and defectors
  at the beginning of the experiment have 0 point of energy. Every time the only cooperator 
  cooperates with other organisms, it will lose 1 point of energy it gains through 'update', 
  while the defectors can never cooperate, so the only cooperator's energy can never exceed 1.
  This means that cooperator cannot reproduce a new organism of type Cooperator. As a result,
  with 99 defectors keep on increasing their energy, they will have higher chance of
  replacing the only cooperator, resulting in 0 cooperator and 100 defectors. 
  - The means of cooperation probability are indicated in the above table. 
  - The results of 10 experiments support our prediction.

### Cooperators = 99 and Defector = 1
| Organism |Cooperator | Defector | Partial Cooperator | Mean Cooperation |
| -------- | --------- | -------- | ------------------ | ---------------- |
| Before tick | 99 | 1 | 0 | X |
| Predictions | 100 | 0 | 0 | 1.0 |
| Run 1 | 100 | 0 | 0 | 1.0 |
| Run 2 | 100 | 0 | 0 | 1.0 |
| Run 3 | 100 | 0 | 0 | 1.0 |
| Run 4 | 0 | 100 | 0 | 0.0 |
| Run 5 | 100 | 0 | 0 | 1.0 |
| Run 6 | 100 | 0 | 0 | 1.0 |
| Run 7 | 100 | 0 | 0 | 1.0 |
| Run 8 | 100 | 0 | 0 | 1.0 |
| Run 9 | 2 | 98 | 0 | 0.02 |
| Run 10 | 100 | 0 | 0 | 1.0 |
| Average |  |  |  | 0.802 | 
#### Report:

   - We predict that after 100 ticks, the number of cooperators will increase from 99 to 100,
  and the number of defector will decrease from 1 to 0 because 99 cooperators can grow rapidly using
  the energy given by the other cooperators, and when they reach 10 energy points, 99 cooperators
  will have a higher chance to reproduce new Cooperators and then replace the only one defector, 
  causing the defector to be wiped out. 
   - The means of cooperation probability are indicated in the above table. 
   - The results of 10 experiments partly support our prediction except for Run 4 and Run 9 where
   the majority of the population are defectors with only 1 or 2 coorperators out of 100 organisms.
  The reason is that the only one defector could possibly gain multiple energy points for every update,
  giving it a higher chance to grow faster because it didn't lose energy during cooperation. Thus,
  it would reproduce faster and once it was able to increase Defector population, the number of defectors
  would grow exceptionally fast, replacing cooperators.
  
### Cooperators = 99 and Defector = 1
| Organism |Cooperator | Defector | Partial Cooperator | Mean Cooperation |
| -------- | --------- | -------- | ------------------ | ---------------- |
| Before tick | 33 | 33 | 34 | X |
| Predictions | 10 | 70 | 20 | 0.2|
| Run 1 | 0 | 99 | 1 | 0.005 |
| Run 2 | 1 | 99 | 0 | 0.01 |
| Run 3 | 0 | 95 | 5 | 0.025|
| Run 4 | 1 | 99 | 0 | 0.01 |
| Run 5 | 0 | 71 | 29 | 0.145 |
| Run 6 | 0 | 99 | 1 | 0.005 |
| Run 7 | 0 | 97 | 3 | 0.015 |
| Run 8 | 1 | 95 | 4 | 0.03 |
| Run 9 | 0 | 100 | 0 | 0.0 |
| Run 10 | 0 | 95 | 5 | 0.025 |
| Average |  |  |  | 0.027 | 
#### Report:

- We predicted that the number of the defectors will be the most, because they have 
the ability to enjoy energy points produced by cooperations without losing energy in 'update's.
The number of cooperators will decrease because they will likely be replaced by other two types 
before they gain enough energy to reproduce. 
- The means of cooperation probability are indicated in the above table.
- The results support our prediction. Since we have more iterations and the population is larger, the result
will be more extreme than the experiment with population size of 10 and 10 iterations.

