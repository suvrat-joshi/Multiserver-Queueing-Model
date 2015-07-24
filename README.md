# Multiserver-Queueing-Model
This repository contains simulation of a multiserver queueing system for the given case "In a manufacturing system parts are being made at a rate of one every 6 minutes. They are two types A and B and are mixed randomly with about 10 percent of type B. A separate inspector is assigned to examine each type of parts. The inspection of a part takes a mean time of 4 minutes with a standard deviation of 2 minutes, but part B takes a mean time of 20 minutes and a standard deviation of 10 minutes. Both inspectors reject about 10% of the parts they inspect. Simulate the system for total of 50 type A parts accepted and determine idle time of inspectors and average time a part spends in system."

Below is the output obtained from the simulation.


| Arrival Time | Arrival | Queue A | Queue B | Service Time A | Service Time B | Idle Time A | Idle Time B | Accepted A | Accepted B |
|:------------:|:-------:|:-------:|:-------:|:--------------:|:--------------:|:-----------:|:-----------:|:----------:|:----------:|
| 0 | A | 0 | 0 | 3.548845 | 0.000000 | 2.451155 | 6.000000 | 1 | 0 |
| 6 | A | 0 | 0 | 3.625425 | 0.000000 | 4.825731 | 12.000000 | 2 | 0 | 
| 12 | A | 0 | 0 | 3.702004 | 0.000000 | 7.123726   |    18.000000 | 3 | 0 | 
| 18 | A | 0 | 0 | 3.778584 | 0.000000 | 9.345142 | 24.000000 | 4 | 0 | 
| 24 | A | 0 | 0 | 3.855164 | 0.000000 | 11.489978 | 30.000000 | 5 | 0 | 
| 30 | A | 0 | 0 | 3.931744 | 0.000000 | 13.558234 | 36.000000 | 6 | 0 | 
| 36 | A | 0 | 0 | 4.008324 | 0.000000 | 15.549910 | 42.000000 | 7 | 0 | 
| 42 | A | 0 | 0 | 4.084904 | 0.000000 | 17.465006 | 48.000000 | 8 | 0 | 
| 48 | A | 0 | 0 | 4.161484 | 0.000000 | 19.303523 | 54.000000 | 9 | 0 | 
| 54 | A | 0 | 0 | 4.238064 | 0.000000 | 21.065459 | 60.000000 | 10 | 0 | 
| 60 | A | 0 | 0 | 4.314643 | 0.000000 | 22.750816 | 66.000000 | 11 |0 | 
| 66 | A | 0 | 0 | 4.391223 | 0.000000 | 24.359592 | 72.000000 | 12 | 0 | 
| 72 | A | 0 | 0 | 4.467803 | 0.000000 | 25.891789 | 78.000000 | 12 | 0 | 
| 78 | B | 0 | 0 | 0.000000 | 22.721915 | 31.891789 | 78.000000 | 12 | 0 | 
| 84 | A | 0 | 0 | 3.485583 | 0.000000 | 34.406206 | 78.000000 | 13 | 0 | 
| 90 | A | 0 | 0 | 3.562163 | 0.000000 | 36.844043 | 78.000000 | 14 | 0 | 
| 96 | A | 0 | 0 | 3.638743 | 0.000000 | 39.205301 | 79.278085 | 15 | 1 | 
| 102 | A | 0 | 0 | 3.740849 | 0.000000 | 41.464451 | 85.278085 | 16 | 1 | 
| 108 | A | 0 | 0 | 3.817429 | 0.000000 | 43.647022 | 91.278085 | 17 | 1 | 
| 114 | A | 0 | 0 | 3.894009 | 0.000000 | 45.753013 | 97.278085 | 18 | 1 | 
| 120 | A | 0 | 0 | 3.970589 | 0.000000 | 47.782424 | 103.278085 | 19 | 1 | 
| 126 | A | 0 | 0 | 4.047169 | 0.000000 | 49.735256 | 109.278085 | 20 | 1 | 
| 132 | A | 0 | 0 | 4.123749 | 0.000000 | 51.611507 | 115.278085 | 21 | 1 | 
| 138 | A | 0 | 0 | 4.200329 | 0.000000 | 53.411178 | 121.278085 | 22 | 1 | 
