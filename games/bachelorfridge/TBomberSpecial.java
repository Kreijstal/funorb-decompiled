/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TBomberSpecial extends SpecialOrder {
    final CreatureEvent createEvent(BattleState param0, int param1) {
        BattleCreature var3 = null;
        RuntimeException var3_ref = null;
        TBomberEvent var4 = null;
        CreatureEvent stackIn_2_0 = null;
        TBomberEvent stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.creature.a(45, param0);
          var4 = new TBomberEvent(this.moveId, new CreatureRef(var3));
          if (param1 != 3) {
            stackIn_2_0 = (CreatureEvent) null;
            return stackIn_2_0;
          }
          var4.field_t = this.field_n;
          var4.field_q = this.field_k;
          stackIn_4_0 = var4;
          return (CreatureEvent) ((Object) stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_7_0 = var3_ref;
          stackIn_7_1 = new StringBuilder().append("kl.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        BitPacketBuffer var2 = sja.field_fb;
        var2.writeCipheredByte(param1, (byte) 125);
        var2.writeByte(1, 0);
        if (param0 > 19) {
          var2.writeByte(3, 0);
          return;
        }
    }

    final static void a(byte param0, Sprite param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          kka.field_h = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("kl.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    TBomberSpecial(int param0, BattleCreature param1, int param2, int param3) {
        super(param0, param1);
        try {
          this.field_k = param2;
          this.field_n = param3;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "kl.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
    }
}
