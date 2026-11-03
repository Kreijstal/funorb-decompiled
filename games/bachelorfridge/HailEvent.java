/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class HailEvent extends SpecialEvent {
    static String field_v;
    int field_t;
    int field_q;
    static du field_u;
    static UiComponent field_r;
    static char[] field_s;

    HailEvent(PacketBuffer param0) {
        super(param0);
        int var2_int = 0;
        try {
          this.moveId = param0.readUnsignedShort((byte) 59);
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
          this.field_t = param0.readUnsignedByte(16711935);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "uj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, PacketBuffer param1) {
        try {
          super.a((byte) -108, param1);
          param1.writeByte(this.field_q, 0);
          if (param0 > -12) {
            field_s = (char[]) null;
          }
          param1.writeByte(this.field_t, 0);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "uj.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void d(byte param0) {
        field_v = null;
        field_s = null;
        field_u = null;
        field_r = null;
        if (param0 != 20) {
          HailEvent.d((byte) 88);
        }
    }

    final AnimationNode createAnimation(int param0, BattleScreen param1) {
        RuntimeException var3 = null;
        AnimationNode stackIn_2_0 = null;
        HailAnimation stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 5) {
            stackIn_4_0 = new HailAnimation(param1, this);
            return (AnimationNode) ((Object) stackIn_4_0);
          }
          stackIn_2_0 = (AnimationNode) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("uj.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final int[][] d(int param0) {
        int[][] var3 = new int[17][17];
        int[][] var2 = var3;
        var3[8][7] = 1;
        var3[7][8] = 1;
        var3[8][8] = param0;
        var3[8][9] = 1;
        var3[9][8] = 1;
        return var2;
    }

    final void a(BattleState param0, int param1) {
        try {
          param0.a(0, this.field_q, this.field_t, false, this.d(1), 28);
          int var3_int = -67 / ((param1 - 12) / 35);
          this.a(param0, (byte) -2);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "uj.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    HailEvent(int param0, CreatureRef param1) {
        super(param0, param1);
    }

    static {
        field_v = "Ignore";
        field_u = new du(4, 1, 1, 1);
        field_s = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
    }
}
