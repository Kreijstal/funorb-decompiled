/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class EventEffect extends IntrusiveNode {
    static String[] field_g;
    int field_f;
    CreatureRef target;

    final static void a(int param0, int param1, String param2, int param3, String param4) {
        try {
          HailAnimation.field_A.field_sb = HailAnimation.field_A.field_sb + DisableSpecial.field_r.field_sb;
          if (param1 != 5) {
            EventEffect.c((byte) 17);
          }
          HailAnimation.field_A.field_Z = param2;
          HailAnimation.field_A.field_gb = param0;
          HailAnimation.field_A.name = param4;
          DisableSpecial.field_r.field_kb = DisableSpecial.field_r.field_kb + DisableSpecial.field_r.field_sb;
          DisableSpecial.field_r.field_sb = param3;
          HailAnimation.field_A.field_sb = HailAnimation.field_A.field_sb - DisableSpecial.field_r.field_sb;
          DisableSpecial.field_r.field_kb = DisableSpecial.field_r.field_kb - DisableSpecial.field_r.field_sb;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "pp.H(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(String param0, int param1, Sprite param2) {
        try {
          rr.field_r = param0;
          if (param1 > -81) {
            String var4 = (String) null;
            EventEffect.a(-97, -115, (String) null, -107, (String) null);
          }
          BagpipeAnimation.field_x = param2;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "pp.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    abstract void apply(BattleCreature param0, BattleState param1, int param2);

    void write(PacketBuffer param0, byte param1) {
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = BachelorFridge.field_y;
        try {
          var3_int = -43 / ((param1 - 34) / 58);
          if (this instanceof DamageEffect) {
            param0.writeByte(1, 0);
            return;
          }
          if (this instanceof PlaceCreatureEffect) {
            param0.writeByte(2, 0);
            return;
          }
          if (this instanceof MoveCreatureEffect) {
            param0.writeByte(3, 0);
            return;
          }
          if (this instanceof DamageTileEffect) {
            param0.writeByte(4, 0);
            return;
          }
          if (this instanceof o) {
            param0.writeByte(5, 0);
            return;
          }
          if (this instanceof SetFriendlyEffect) {
            param0.writeByte(6, 0);
            return;
          }
          if (this instanceof ela) {
            param0.writeByte(7, 0);
            return;
          }
          if (this instanceof SnowEffect) {
            param0.writeByte(8, 0);
            return;
          }
          if (this instanceof dh) {
            param0.writeByte(9, 0);
            return;
          }
          if (this instanceof fda) {
            param0.writeByte(10, 0);
            return;
          }
          if (this instanceof ic) {
            param0.writeByte(11, 0);
            return;
          }
          if (this instanceof ClearTileFlagEffect) {
            param0.writeByte(12, 0);
            return;
          }
          if (this instanceof tfa) {
            param0.writeByte(13, 0);
            return;
          }
          if (this instanceof kq) {
            param0.writeByte(14, 0);
            return;
          }
          if (this instanceof bm) {
            param0.writeByte(15, 0);
            return;
          }
          if (!(this instanceof pea)) {
            throw new RuntimeException("CreatureEffect type not found");
          }
          param0.writeByte(16, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_37_0 = var3;
          stackIn_37_1 = new StringBuilder().append("pp.A(");
          if (param0 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',').append(param1).append(')').toString());
        }
    }

    EventEffect() {
    }

    public static void c(byte param0) {
        field_g = null;
        if (param0 != -75) {
          String var2 = (String) null;
          EventEffect.a(-77, 19, (String) null, 41, (String) null);
        }
    }

    static {
        field_g = new String[]{"Livin' in the Fridge", "A Fridge Too Far", "Use Your Loaf", "10-second Rule", "Mighty Meaty", "Who Dairies Wins", "Green Machine", "Don't Put That In Your Mouth", "Do You Have Any...?", "Pick-up or Delivery?", "You Drink, You Fight, You Spill", "A Bit Fishy", "Om Nom Nom", "Full English", "Clerical Error", "Just Desserts", "Cowabunga", "I Love the Smell of Curry in the Morning", "Coup de Grease", "The Spices Must Flow", "Don't Play With Your Food", "Leftovers", "Lord of the Flies", "Exterminate, Annihilate", "Maggots to Go", "Superfly", "Tough as Old Boots", "Happy Maggot Appreciation Society", "Omnivore", "Play With Your Food", "Splort, Eater of Worlds", "The Devastator", "Not the Face!", "The Creature With the Lamp", "Medic!", "Generalist", "Monstrous Regiment", "The Devourer", "Sandpit Lord", "Specialist", "Frequent Flier", "To Live is to Fly", "Gross Points", "La Reine Maggot", "Pigs Might Fly", "Multiple Personalities", "Mass Effect", "You're in a Bit of a State", "Only Thing That Can Kill a Vindaloony", "Order of the Golden Sporx"};
    }
}
