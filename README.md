# Magical Arena Battle Game

**Magical Arena** is a simple Java-based console game where two players engage in a turn-based battle. Each player takes turns attacking, and the battle continues until one player's health is reduced to zero. The winner is determined based on the remaining health of the players. This game demonstrates object-oriented programming principles, randomness, and basic gameplay mechanics.

---

## Features
- **Player Attributes**: Each player has unique attributes like health, strength, and attack power.
- **Battle Mechanics**: Players roll dice to determine attack and defense power for each turn.
- **Turn-Based Gameplay**: Alternating turns between players to simulate a real battle.
- **Randomized Stats**: Player stats (strength and attack) are randomly generated at the start.
- **Winner Determination**: Declares the winner once one player's health reaches zero.

---

## Files and Structure
1. **`MagicalArena.java`**  
   - Entry point of the game.  
   - Takes player names, initializes their attributes, and starts the battle.  

2. **`Arena.java`**  
   - Manages the gameplay mechanics, including turn switching, health checks, and winner determination.  

3. **`Player.java`**  
   - Defines the `Player` class with attributes like health, strength, and attack.  
   - Includes getters and setters for player properties.  

4. **`Dice.java`**  
   - Simulates dice rolls for attack and defense calculations.  

---

## Getting Started
### Prerequisites
- **Java Development Kit (JDK)** installed on your machine.

## How to Play

1. **Clone the repository or download the files**  
   Clone the repository using Git or download the project files directly.  
   ```bash
   git clone https://github.com/your-repo/magical-arena.git
   cd magical-arena
2. **Compile all .java files**
   Use the following command to compile all Java source files:
   ```bash
   javac *.java
3. **Run the game**
   Execute the MagicalArena class to start the game:

# Magical Arena
## Overview
A Java-based console game simulating battles using OOP principles.
## Tech Stack
- Java
## Features
- Player battles with dice rolls, OOP design (encapsulation, inheritance)
## Setup
1. Clone: `git clone https://github.com/Manohar7730/Magical-Arena`
2. Run: `javac Main.java && java Main`
   ```bash
   java MagicalArena
4. **Enter player names**
   Follow the prompts in the console to input player names.
5. **Watch the battle unfold**
   The game will simulate a turn-based battle, displaying stats and actions after each round. The winner will be announced once the battle concludes.
