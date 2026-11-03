/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LevitateSpecial extends SpecialOrder {
    static jla[] field_p;
    static String field_q;

    LevitateSpecial(int param0, BattleCreature param1, CreatureRef param2) {
        super(param0, param1);
        try {
          this.field_j = param2;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "eg.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void c(byte param0) {
        field_p = null;
        field_q = null;
        if (param0 > -71) {
          LevitateSpecial.c((byte) -75);
        }
    }

    final CreatureEvent createEvent(BattleState param0, int param1) {
        RuntimeException var3 = null;
        BattleCreature var4 = null;
        LevitateEvent var5 = null;
        BattleCreature var6 = null;
        BattleCreature var7 = null;
        ew stackIn_4_0 = null;
        LevitateEvent stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = this.creature.a(param1 ^ 48, param0);
          var7 = var6;
          var4 = this.field_j.a(79, param0);
          if (var4 != null &&
            !var4.isDown(-127)) {
            var5 = new LevitateEvent(this.moveId, new CreatureRef(var7));
            var5.effects.a(new DamageEffect(new CreatureRef(var4), false, 1, 0, 32), true);
            if (param1 != 3) {
              field_p = (jla[]) null;
            }
            if (var4.field_o.field_b == 1 ||
              var4.field_o.field_b == 0) {
              param0.field_T.field_u[var6.ownerIndex] = true;
            }
            stackIn_12_0 = var5;
            return (CreatureEvent) ((Object) stackIn_12_0);
          }
          stackIn_4_0 = new ew(new CreatureRef(var7));
          return (CreatureEvent) ((Object) stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("eg.A(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_p = new jla[16];
        field_q = "Drawn";
    }
}
