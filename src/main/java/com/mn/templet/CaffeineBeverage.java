package com.mn.templet;

public abstract class CaffeineBeverage {

    final void prepareRecipe() {

        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }

    }

    /**
     * 钩子方法是一种声明在抽象类中的方法，但是只有空或者默认实现
     * 钩子的存在可以让子类有能力对算法的不同点进行挂钩
     * 要不要挂钩，有子类自行决定
     * @return
     */
    public boolean customerWantsCondiments() {
        return true;
    }

    private void boilWater() {
        System.out.println("Boiling Water");
    }

    private void pourInCup() {
        System.out.println("Pouring into Cup");
    }

    abstract void brew();
    abstract void addCondiments();
}
