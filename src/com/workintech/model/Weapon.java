package com.workintech.model;

public enum Weapon {
        GUN(23,18),
        SWORD(20,13),
        KNIFE(18,11);

        private int damage;
        private double attackSpeed;

        Weapon(int damage, double attackSpeed) {
            this.damage = damage;
            this.attackSpeed = attackSpeed;
        }
        public int getDamage(){
            return damage;
        }
        public double getAttackSpeed(){
            return attackSpeed;
        }
    }

