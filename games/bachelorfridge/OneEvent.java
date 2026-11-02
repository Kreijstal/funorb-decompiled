/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class OneEvent extends SpecialEvent {
    static String field_s;
    static String field_r;
    static int field_q;

    final AnimationNode a(int param0, gj param1) {
        RuntimeException var3 = null;
        OneAnimation stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 5) {
            OneEvent.c(-33, 53);
          }
          stackIn_3_0 = new OneAnimation(param1, this);
          return (AnimationNode) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ct.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void c(boolean param0) {
        if (!param0) {
          field_s = (String) null;
          AirstrikeAnimation.field_z = new IntrusiveDeque();
          return;
        }
        AirstrikeAnimation.field_z = new IntrusiveDeque();
    }

    final static void c(int param0, int param1) {
        kr.field_vb = param0;
        if (param1 > -112) {
          OneEvent.c(-123, 40);
        }
    }

    public static void d(byte param0) {
        field_s = null;
        field_r = null;
        if (param0 > -66) {
          field_q = -88;
        }
    }

    OneEvent(PacketBuffer param0) {
        super(param0);
        int var2_int = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          this.moveId = param0.readUnsignedShort((byte) 71);
          this.effects = new IntrusiveDeque();
          var2_int = param0.readUnsignedByte(16711935);
          while (true) {
            var2_int--;
            if (var2_int < 0) {
              return;
            }
            this.effects.a(TBomberAnimation.a((byte) 102, param0), true);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("ct.<init>(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final void a(byte param0, PacketBuffer param1) {
        try {
          super.a((byte) -41, param1);
          if (param0 >= -12) {
            field_q = 10;
          }
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "ct.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(BattleState param0, int param1) {
        try {
          int var3_int = -99 % ((12 - param1) / 35);
          this.a(param0, (byte) -2);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "ct.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    OneEvent(int param0, CreatureRef param1) {
        super(param0, param1);
    }

    static {
        field_s = "Open";
        field_r = "Data server full or too many connections from your address. Please try again in a few minutes.";
    }
}
