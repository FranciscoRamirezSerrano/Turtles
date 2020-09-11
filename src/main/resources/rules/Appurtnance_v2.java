/*    */ package org.wakingstones.turtles.rules;
/*    */ 
/*    */ import battle.Unit;
/*    */ import battle.effect.Effect;
import battle.rule.enchantment.EnchantmentRule;
/*    */ import battle.rule.modifier.Modifier;
/*    */ import battle.rule.modifier.ModifierAttributes;
/*    */ import battle.rule.modifier.ModifierType;
/*    */ import battle.rule.modifier.SelfModifier;
/*    */ import battle.rule.modifier.actions.AddSubType;
import battle.rule.modifier.atoms.IncHp;
/*    */ import battle.rule.modifier.targets.atoms.Self;
/*    */ import battle.update.SelectableTiles;
/*    */ import java.util.Collections;
/*    */ import java.util.EnumSet;
/*    */ import java.util.List;
/*    */ import platform.model.entity.card.CardType;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Appurtnance_v2
/*    */   extends EnchantmentRule
/*    */ {
/* 23 */   public SelectableTiles selectableTiles() { return allCreaturesSel(); }
/*    */ 
/*    */ 
/*    */   
/*    */   protected List<Effect> enchant(Unit unit) {
			 add(new IncHp(unit, player().unitFilter().subType(CardType.SubType.Beast).count()));
/* 28 */     add(new Modifier((new Self()).init(unit), new AddSubType(CardType.SubType.Beast)));
/* 30 */     return Collections.emptyList();
/*    */   }
/*    */   
/*    */ }


/* Location:              C:\Users\Paco-PC\Desktop\Turtles-master\lib\callersbane-server.jar!/battle/rule/enchantment/MetalHeart.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.0.7
 */
