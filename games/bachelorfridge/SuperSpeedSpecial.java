/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SuperSpeedSpecial extends SpecialOrder {
    static java.math.BigInteger field_p;

    final static boolean c(int param0) {
        int var2 = 0;
        fka var1 = null;
        RuntimeException var1_ref = null;
        int var3 = 0;
        fka var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = BachelorFridge.field_y;
        try {
          var4 = (fka) (AirstrikeAnimation.field_z.b((byte) 90));
          var1 = var4;
          if (var1 == null) {
            return false;
          }
          if (param0 > -38) {
            return true;
          }
          for (var2 = 0; var1.field_k > var2; var2++) {
            if (var4.field_i[var2] != null &&
              var4.field_i[var2].field_f == 0) {
              return false;
            }
            if (var4.field_j[var2] != null &&
              0 == var4.field_j[var2].field_f) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw pe.wrapException((Throwable) ((Object) var1_ref), "tg.B(" + param0 + ')');
        }
    }

    final CreatureEvent a(BattleState param0, int param1) {
        BattleCreature var3 = null;
        RuntimeException var3_ref = null;
        SuperSpeedEvent var4 = null;
        SuperSpeedEvent stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.creature.a(param1 ^ 104, param0);
          var4 = new SuperSpeedEvent(this.moveId, new CreatureRef(var3));
          if (param1 != 3) {
            SuperSpeedSpecial.c(-1);
          }
          var4.effects.a(new DamageEffect(new CreatureRef(var3), false, 1, 0, 28), true);
          stackIn_3_0 = var4;
          return (CreatureEvent) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("tg.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_p = null;
        if (param0 != 1) {
          SuperSpeedSpecial.c(-2);
        }
    }

    SuperSpeedSpecial(int param0, BattleCreature param1) {
        super(param0, param1);
    }

    static {
        field_p = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
    }
}
