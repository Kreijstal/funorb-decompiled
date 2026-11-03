/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RefreshingSpecial extends SpecialOrder {
    static oa field_p;
    static long field_q;

    final CreatureEvent createEvent(BattleState param0, int param1) {
        int var5 = 0;
        RuntimeException var3 = null;
        RefreshingEvent var4 = null;
        BattleCreature var6 = null;
        int var7 = 0;
        BattleCreature var8 = null;
        CreatureEvent stackIn_3_0 = null;
        RefreshingEvent stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = BachelorFridge.field_y;
        try {
          var8 = this.creature.a(77, param0);
          var4 = new RefreshingEvent(this.moveId, new CreatureRef(var8));
          if (param1 != 3) {
            stackIn_3_0 = (CreatureEvent) null;
            return stackIn_3_0;
          }
          for (var5 = 0; var5 < 7; var5++) {
            var6 = param0.rosters[var8.ownerIndex].field_b[var5];
            if (var6 != null) {
              var4.effects.a(new DamageEffect(new CreatureRef(var6), false, 1, 0, var6.statusId), true);
              var4.effects.a(new ks(new CreatureRef(var6)), true);
            }
          }
          stackIn_11_0 = var4;
          return (CreatureEvent) ((Object) stackIn_11_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("wh.A(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    RefreshingSpecial(int param0, BattleCreature param1) {
        super(param0, param1);
    }

    public static void releaseStatics(int param0) {
        if (param0 != 0) {
          RefreshingSpecial.releaseStatics(-93);
        }
        field_p = null;
    }

    static {
    }
}
