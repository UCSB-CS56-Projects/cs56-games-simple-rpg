package edu.ucsb.cs56.projects.games.simple_rpg;

/*
   * * * * * * * * * * * * *
   * @author Nick Perry    *
   * @version CS56-F16 1.0 *
   * * * * * * * * * * * * *
*/

public class Potion extends Item {

    public static final int MAX_HP_EFFECT = 100;
    public static final int MAX_MP_EFFECT = 100;
    public static final int MAX_XP_EFFECT = 100;
    
    private int hpEffect;
    private int mpEffect;
    private int xpEffect;

    //no-arg constructor for Potion object
    public Potion() {	
	super();
	this.hpEffect = 0;
	this.mpEffect = 0;
	this.xpEffect = 0;
    }

    // Constructor for Potion object by integer potion code
    public Potion(int code) {
	super(code);
	if (isValidItemCode(code) == true) {
	    this.hpEffect = retHPEffect();
	    this.mpEffect = retMPEffect();
	    this.xpEffect = retXPEffect();
	} else {
	    throw new IllegalArgumentException("String parameter is not valid potion code.");
	}
    }

    public int getHPEffect() {
	return this.hpEffect;
    }

    private int retHPEffect() {
	if (this.getCode() == 11)
	    return MAX_HP_EFFECT;
	else if (this.getCode() == 14)
	    return this.generateHPEffect();
	else
	    return 0;
    }

    public int getMPEffect() {
	return this.mpEffect;

    }

    private int retMPEffect() {
	if (this.getCode() == 12)
	    return MAX_MP_EFFECT;
	else if (this.getCode() == 14)
	    return this.generateMPEffect();
	else
	    return 0;
    }

    public int getXPEffect() {
	return this.xpEffect;

    }

    private int retXPEffect() {
	if (this.getCode() == 13)
	    return MAX_XP_EFFECT;
	else if (this.getCode() == 14)
	    return this.generateXPEffect();
	else
	    return 0;
    }

    private int generateHPEffect() {
	return (int)(Math.random() * MAX_HP_EFFECT);
    }

    private int generateMPEffect() {
	return (int)(Math.random() * MAX_MP_EFFECT);
    }

    private int generateXPEffect() {
	return (int)(Math.random() * MAX_XP_EFFECT);
    }
    
    public String toString() {
	return this.getName() + " - " + this.getPrice() + " gold";
    }
}
	
	   
