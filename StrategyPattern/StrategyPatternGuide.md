# Strategy Pattern

Strategy Pattern is a behavioral pattern that is used to encapsulate a family of behaviors (algorithms) and allow objects to dynamically select and use them interchangebly in runtime.

In cases where an object may use multiple behaviors, the Strategy Pattern comes in handy. It allows us to encapsulate these behaviors (algorithms) into distinct classes known as concrete strategies.
Each of these concrete strategies implements a common behavior interface known as the Strategy.

Programming to the strategy interface decouples the context object from the behaviors.
This decoupling allows us to extend the class by adding more concrete behaviors without modifying the context class adhering to the open-closed principle.
It also makes the object more flexibile as it would be able to change its behavior during runtime.

**Example: Game Character Abilities**

In a role-playing game, a hero character may possess various abilities, such as melee attacks, ranged attacks, and magic spells. Each ability has distinct behaviors. The Strategy Pattern can be employed to manage these abilities efficiently.

- **Define the Context Class**: Create a `Character` class representing the game character, which maintains a reference to a `AttackStrategy` interface.

- **Create the Strategy Interface**: Define a `AttackStrategy` interface with a `performAttack()` method.

- **Implement Concrete Strategies**: Develop concrete strategy classes for abilities, such as `SwordAttackStrategy`, `RangedAttackStrategy`, and `MagicSpellAttackStrategy`.

- **Dynamically Select Abilities**: The player can dynamically switch between abilities based on the situation.

- **Performing Attacks**: When an attack is initiated, the `Character` class calls the `performAttack()` method on the selected strategy.
