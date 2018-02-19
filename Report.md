
## Population Size = 10
### Cooperator = 1 and Defectors = 9

| Organism |Cooperator | Defector | Partial Cooperator | Mean Cooperation |
| -------- | --------- | -------- | ------------------ | ---------------- |
| Before tick | 1 | 9 | 0 | X |
| Predictions | 0 | 10 | 0 | 0.0 |
| Tick 1 | 0 | 10 | 0 | 0.0 |
| Tick 2 | 0 | 10 | 0 | 0.0 |
| Tick 3 | 0 | 10 | 0 | 0.0 |
| Tick 4 | 0 | 10 | 0 | 0.0 |
| Tick 5 | 1 | 9 | 0 | 0.1 |
| Tick 6 | 0 | 10 | 0 | 0.0 |
| Tick 7 | 0 | 10 | 0 | 0.0 |
| Tick 8 | 0 | 10 | 0 | 0.0 |
| Tick 9 | 0 | 10 | 0 | 0.0 |
| Tick 10 | 1 | 9 | 0 | 0.1 |
| Average |  |  |  | 0.02 | 
- Report:
   We predict that after 10 ticks, the number of cooperator will reduce from 1 to 0,
  and the number of defectors will increase from 9 to 10 because cooperators and defectors
  at the beginning of the experiment have 0 point of energy. Every time the only cooperator 
  cooperates with other organisms, it will lose 1 point of energy it gains through 'update', 
  while the defectors can never cooperate, so the only cooperator's energy can never exceed 1.
  This means that cooperator cannot reproduce a new organism of type Cooperator. As a result,
  with the defectors keep on increasing their energy, they will have higher chance of
  replacing the only cooperator, resulting in 0 cooperator and 10 defectors. The means of 
  cooperation probability are indicated in the above table. The results of 10 experiments 
  support our prediction.

### Cooperators = 9 and Defector = 1

| Organism |Cooperator | Defector | Partial Cooperator | Mean Cooperation |
| -------- | --------- | -------- | ------------------ | ---------------- |
| Before tick | 9 | 1 | 0 | X |
| Predictions | 10 | 0 | 0 | 1.0 |
| Tick 1 | 5 | 5 | 0 | 0.5 |
| Tick 2 | 3 | 7 | 0 | 0.3 |
| Tick 3 | 5 | 5 | 0 | 0.5 |
| Tick 4 | 10 | 0 | 0 | 1.0 |
| Tick 5 | 10 | 0 | 0 | 1.0|
| Tick 6 | 8 | 2 | 0 | 0.8 |
| Tick 7 | 10 | 0 | 0 | 1.0 |
| Tick 8 | 4 | 6 | 0 | 0.4 |
| Tick 9 | 10 | 0 | 0 | 1.0 |
| Tick 10 | 5 | 5 | 0 | 0.5 |
| Average |  |  |  | 0.7 | 
Report:
    We predict that after 10 ticks, the number of cooperators will increase from 9 to 10,
  and the number of defector will decrease from 1 to 0 because cooperators can grow rapidly using
  the energy given by the other cooperator, and when they reach 10 energy points, they will have higher 
  a chance to reproduce the new Cooperators and then replace the only one defector, causing the defector
  to become 0 forever. The means of cooperation probability are indicated in the above table. 
  The results of 10 experiments do not support our prediction. The reason is that the only one defector 
  gained the energy given by the 9 cooperators and through 'update' method and thus grew faster
  while cooperators lost energy through cooperating besides gaining energy through 'update'. 
  Therefore the number of defectors tend to be greater than 0. 

### Cooperators = 3 and Defectors = 3 and Partial Cooperators = 4

| Organism |Cooperator | Defector | Partial Cooperator | Mean Cooperation |
| -------- | --------- | -------- | ------------------ | ---------------- |
| Before tick | 3 | 3 | 4 | X |
| Predictions | 2 | 7 | 1 | 0.25 |
| Tick 1 | 0 | 4 | 6 | 0.3 
| Tick 2 | 0 | 9 | 1 | 0.05 |
| Tick 3 | 0 | 5 | 5 | 0.25 |
| Tick 4 | 4 | 6 | 0 | 0.4 |
| Tick 5 | 2 | 2 | 6 | 0.5 |
| Tick 6 | 1 | 6 | 3 | 0.25 |
| Tick 7 | 0 | 2 | 8 | 0.4 |
| Tick 8 | 4 | 3 | 3 | 0.55|
| Tick 9 | 2 | 8 | 0 | 0.2 |
| Tick 10 | 1 | 7 | 2 | 0.2 |
| Average |  |  |  | 0.31 | 
- Report: 
Prediction: We predicted that the number of the defectors will be the most, because they have 
the ability to enjoy energy points produced by cooperations without losing energy in 'update's.
The number of cooperators will decrease because they will likely be replaced by other two types 
before they gain enough energy to reproduce. 
The results partly support our prediction. The exceptions are tick 4, tick 5 and tick 8: The 
reason maybe deal with randomness, few iterations and the little population over all. 

## Population Size = 100
### Cooperator = 1 and Defectors = 99

| Organism |Cooperator | Defector | Partial Cooperator | Mean Cooperation |
| -------- | --------- | -------- | ------------------ | ---------------- |
| Before tick | 1 | 99 | 0 | X |
| Predictions | 0 | 100| 0 | 0.0 |
| Tick 1 | 0 | 100 | 0 | 0.0 |
| Tick 2 | 0 | 100 | 0 | 0.0 |
| Tick 3 | 0 | 100 | 0 | 0.0 |
| Tick 4 | 0 | 100 | 0 | 0.0 |
| Tick 5 | 0 | 100 | 0 | 0.0 |
| Tick 6 | 0 | 100 | 0 | 0.0 |
| Tick 7 | 0 | 100 | 0 | 0.0 |
| Tick 8 | 0 | 100 | 0 | 0.0 |
| Tick 9 | 0 | 100 | 0 | 0.0 |
| Tick 10 | 0 | 100 | 0 | 0.0 |
| Average |  |  |  | 0.0| 
- Report:
  We predict that after 10 ticks, the number of cooperator will reduce from 1 to 0,
  and the number of defectors will increase from 99 to 100 because cooperators and defectors
  at the beginning of the experiment have 0 point of energy. Every time the only cooperator 
  cooperates with other organisms, it will lose 1 point of energy it gains through 'update', 
  while the defectors can never cooperate, so the only cooperator's energy can never exceed 1.
  This means that cooperator cannot reproduce a new organism of type Cooperator. As a result,
  with 99 defectors keep on increasing their energy, they will have higher chance of
  replacing the only cooperator, resulting in 0 cooperator and 100 defectors. The means of 
  cooperation probability are indicated in the above table. The results of 10 experiments 
  support our prediction.

### Cooperators = 99 and Defector = 1

| Organism |Cooperator | Defector | Partial Cooperator | Mean Cooperation |
| -------- | --------- | -------- | ------------------ | ---------------- |
| Before tick | 99 | 1 | 0 | X |
| Predictions | 100 | 0 | 0 | 1.0 |
| Tick 1 | 100 | 0 | 0 | 1.0 |
| Tick 2 | 100 | 0 | 0 | 1.0 |
| Tick 3 | 100 | 0 | 0 | 1.0 |
| Tick 4 | 100 | 0 | 0 | 1.0 |
| Tick 5 | 100 | 0 | 0 | 1.0 |
| Tick 6 | 100 | 0 | 0 | 1.0 |
| Tick 7 | 100 | 0 | 0 | 1.0 |
| Tick 8 | 100 | 0 | 0 | 1.0 |
| Tick 9 | 100 | 0 | 0 | 1.0 |
| Tick 10 | 100 | 0 | 0 | 1.0 |
| Average |  |  |  | 1.0 | 
- Report:
  We predict that after 100 ticks, the number of cooperators will increase from 99 to 100,
  and the number of defector will decrease from 1 to 0 because cooperators can grow rapidly using
  the energy given by the other cooperators, and when they reach 10 energy points, 99 cooperators
  will have a higher chance to reproduce the new Cooperators and then replace the only one defector, 
  causing the defector to be wiped out. The means of cooperation probability are indicated in the above table. 
  The results of 10 experiments suuport our prediction.

| Organism |Cooperator | Defector | Partial Cooperator | Mean Cooperation |
| -------- | --------- | -------- | ------------------ | ---------------- |
| Before tick | 33 | 33 | 34 | X |
| Predictions | 34 | 33 | 33 | 0.505 |
| Tick 1 | 0 | 98 | 2 | 0.01 |
| Tick 2 | 0 | 97 | 3 | 0.015|
| Tick 3 | 0 | 100 | 0 | 0.0 |
| Tick 4 | 0 | 98 | 2 | 0.01 |
| Tick 5 | 0 | 99 | 1 | 0.005 |
| Tick 6 | 0 | 91 | 9 | 0.045 |
| Tick 7 | 0 | 98 | 2 | 0.01 |
| Tick 8 | 0 | 99 | 1 | 0.005 |
| Tick 9 | 0 | 94 | 6 | 0.03 |
| Tick 10 | 0 | 100 | 0 | 0.0 |
| Average |  |  |  | 0.013| 
- Report:
Prediction: We predicted that the number of the defectors will be the most, because they have 
the ability to enjoy energy points produced by cooperations without losing energy in 'update's.
The number of cooperators will decrease because they will likely be replaced by other two types 
before they gain enough energy to reproduce. 
The results support our prediciton. 
