/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SleepEvent extends SpecialEvent {
    static String field_r;
    int field_q;

    final void a(byte param0, PacketBuffer param1) {
        super.a((byte) -20, param1);
        if (param0 > -12) {
          return;
        }
        try {
          param1.writeByte(this.field_q, 0);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "mna.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void d(byte param0) {
        field_r = null;
        int var1 = 9 % ((55 - param0) / 43);
    }

    SleepEvent(PacketBuffer param0) {
        super(param0);
        int var2_int = 0;
        try {
          this.moveId = param0.readUnsignedShort((byte) 110);
          this.effects = new IntrusiveDeque();
          var2_int = param0.readUnsignedByte(16711935);
          while (true) {
            var2_int--;
            if (var2_int < 0) {
              break;
            }
            this.effects.a(TBomberAnimation.a((byte) 102, param0), true);
          }
          this.field_q = param0.readUnsignedByte(16711935);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "mna.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(BattleState param0, int param1) {
        try {
          this.a(param0, (byte) -2);
          int var3_int = -5 % ((param1 - 12) / 35);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "mna.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    SleepEvent(int param0, CreatureRef param1) {
        super(param0, param1);
    }

    final static void a(int param0, int[] param1, long param2, String param3, String param4, int param5, int param6, sga param7, sna param8) {
        if (param6 > -63) {
          return;
        }
        try {
          bga.field_m = param7;
          NetworkGameClient.field_u = new ik(param8, param2, param4, param3, param0, param5, param1);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "mna.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ',' + (param8 != null ? "{...}" : "null") + ')');
        }
    }

    final AnimationNode a(int param0, gj param1) {
        RuntimeException var3 = null;
        SleepAnimation stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 5) {
            this.field_q = -12;
          }
          stackIn_3_0 = new SleepAnimation(param1, this);
          return (AnimationNode) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("mna.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final int[][] a(int param0, byte param1, BattleCreature param2, BattleState param3) {
        RuntimeException var5 = null;
        PacketBuffer var6 = null;
        int[][] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 106) {
            var6 = (PacketBuffer) null;
            this.a((byte) 34, (PacketBuffer) null);
          }
          stackIn_3_0 = (int[][]) null;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("mna.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    static {
        field_r = "Remove name";
    }
}
