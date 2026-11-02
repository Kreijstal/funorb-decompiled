/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DreamsEvent extends SpecialEvent {
    static Sprite[] field_r;
    static int field_s;
    static String field_q;

    DreamsEvent(PacketBuffer param0) {
        super(param0);
        int var2_int = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          this.moveId = param0.readUnsignedShort((byte) 77);
          this.effects = new IntrusiveDeque();
          var2_int = param0.readUnsignedByte(16711935);
          while (true) {
            var2_int--;
            if (0 > var2_int) {
              return;
            }
            this.effects.a(TBomberAnimation.a((byte) 102, param0), true);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("bt.<init>(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public static void d(int param0) {
        field_r = null;
        field_q = null;
        if (param0 != -17811) {
          field_s = -49;
        }
    }

    final void a(BattleState param0, int param1) {
        try {
          int var3_int = -47 / ((12 - param1) / 35);
          this.a(param0, (byte) -2);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "bt.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    DreamsEvent(int param0, CreatureRef param1) {
        super(param0, param1);
    }

    final AnimationNode a(int param0, gj param1) {
        RuntimeException var3 = null;
        AnimationNode stackIn_2_0 = null;
        DreamsAnimation stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 5) {
            stackIn_4_0 = new DreamsAnimation(param1, this);
            return (AnimationNode) ((Object) stackIn_4_0);
          }
          stackIn_2_0 = (AnimationNode) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("bt.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    static {
        field_s = 1;
        field_q = "Unable to add name - system busy";
    }
}
