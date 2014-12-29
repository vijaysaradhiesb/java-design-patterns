package com.saradhi;

/**
 * 
 * Visitor pattern defines mechanism to apply operations (UnitVisitor) on nodes
 * (Unit) in hierarchy. New operations can be added without altering the node
 * interface.
 * 
 */
public class App {

	public static void main(String[] args) {

		Commander commander = new Commander(new Sergeant(new Soldier(),
				new Soldier(), new Soldier()), new Sergeant(new Soldier(),
				new Soldier(), new Soldier()));
		commander.accept(new SoldierVisitor());
		commander.accept(new SergeantVisitor());
		commander.accept(new CommanderVisitor());

	}
}
