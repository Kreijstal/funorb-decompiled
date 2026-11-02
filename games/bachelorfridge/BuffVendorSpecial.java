/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BuffVendorSpecial extends SpecialOrder {
    static int field_q;
    static Sprite field_r;
    static PacketBuffer field_p;

    final CreatureEvent a(BattleState param0, int param1) {
        BattleCreature var3 = null;
        RuntimeException var3_ref = null;
        BuffVendorEvent var4 = null;
        BoardTile var5 = null;
        BattleCreature var6 = null;
        DamageEffect var7 = null;
        CreatureEvent stackIn_2_0 = null;
        BuffVendorEvent stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.creature.a(param1 + 47, param0);
          if (param1 != 3) {
            stackIn_2_0 = (CreatureEvent) null;
            return stackIn_2_0;
          }
          var4 = new BuffVendorEvent(this.moveId, new CreatureRef(var3));
          var4.field_u = this.field_n;
          var4.field_r = this.field_k;
          var5 = param0.tiles[this.field_k][this.field_n];
          var6 = var5.occupant;
          if (var6 != null) {
            var7 = new DamageEffect(new CreatureRef(var6), false, 1, 200, 0);
            var4.effects.a(var7, true);
          }
          stackIn_6_0 = var4;
          return (CreatureEvent) ((Object) stackIn_6_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("rl.A(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_r = null;
        if (param0 != 0) {
          BuffVendorSpecial.b(-128);
          field_p = null;
          return;
        }
        field_p = null;
    }

    BuffVendorSpecial(int param0, BattleCreature param1, int param2, int param3) {
        super(param0, param1);
        try {
          this.field_k = param2;
          this.field_n = param3;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "rl.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_q = 100;
        field_r = new Sprite(540, 140);
    }
}
