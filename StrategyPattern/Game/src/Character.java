public class Character {
    private AttackStrategy attackStrategy = new SwordAttackStrategy();

    public void setAttackStrategy(AttackStrategy attackStrategy){
        this.attackStrategy = attackStrategy;
    }
    public void attack(){
        attackStrategy.performAttack();
    }
}
