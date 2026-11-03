/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FlirtSpecial extends SpecialOrder {
    final CreatureEvent createEvent(BattleState param0, int param1) {
        RuntimeException var3 = null;
        BattleCreature var4 = null;
        FlirtEvent var5 = null;
        BattleCreature var6 = null;
        ew stackIn_4_0 = null;
        CreatureEvent stackIn_7_0 = null;
        FlirtEvent stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = this.creature.a(29, param0);
          var4 = this.field_j.a(18, param0);
          if (var4 != null &&
            !var4.isDown(75)) {
            var5 = new FlirtEvent(this.moveId, new CreatureRef(var6), this.field_j);
            var5.effects.a(new DamageEffect(new CreatureRef(var4), false, 1, 0, 37), true);
            if (param1 != 3) {
              stackIn_7_0 = (CreatureEvent) null;
              return stackIn_7_0;
            }
            var5.effects.a(new SetFriendlyEffect(new CreatureRef(var4), var6.ownerIndex), true);
            stackIn_9_0 = var5;
            return (CreatureEvent) ((Object) stackIn_9_0);
          }
          stackIn_4_0 = new ew(new CreatureRef(var6));
          return (CreatureEvent) ((Object) stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("ab.A(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    FlirtSpecial(int param0, BattleCreature param1, CreatureRef param2) {
        super(param0, param1);
        try {
          this.field_j = param2;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "ab.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
