/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SlowAllEvent extends SpecialEvent {
    static sna field_s;
    static java.math.BigInteger field_q;
    static int field_r;

    final void a(BattleState param0, int param1) {
        try {
          this.a(param0, (byte) -2);
          int var3_int = -93 % ((12 - param1) / 35);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "sm.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    SlowAllEvent(PacketBuffer param0) {
        super(param0);
        int var2_int = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          this.moveId = param0.readUnsignedShort((byte) 59);
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
          stackIn_7_1 = new StringBuilder().append("sm.<init>(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final AnimationNode a(int param0, gj param1) {
        RuntimeException var3 = null;
        AnimationNode stackIn_2_0 = null;
        SlowAllAnimation stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 5) {
            stackIn_4_0 = new SlowAllAnimation(param1, this);
            return (AnimationNode) ((Object) stackIn_4_0);
          }
          stackIn_2_0 = (AnimationNode) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("sm.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1, int param2, int param3) {
        if (param0) {
          SlowAllEvent.e(-51);
          if (!AttackUpAllAnimation.e(-29919)) {
            sja.field_fb.writeCipheredByte(81, (byte) 126);
            sja.field_fb.writeByte(param1, 0);
            sja.field_fb.writeByte(param2, 0);
            sja.field_fb.writeByte(param3, 0);
            return;
          }
          return;
        }
        if (AttackUpAllAnimation.e(-29919)) {
          return;
        }
        sja.field_fb.writeCipheredByte(81, (byte) 126);
        sja.field_fb.writeByte(param1, 0);
        sja.field_fb.writeByte(param2, 0);
        sja.field_fb.writeByte(param3, 0);
    }

    SlowAllEvent(int param0, CreatureRef param1) {
        super(param0, param1);
    }

    final static String e(int param0) {
        int var1 = -30 / ((19 - param0) / 63);
        return ig.field_m.readString(-32);
    }

    public static void d(int param0) {
        if (param0 != -1) {
          SlowAllEvent.e(-8);
          field_s = null;
          field_q = null;
          return;
        }
        field_s = null;
        field_q = null;
    }

    static {
        field_r = 33;
        field_q = new java.math.BigInteger("65537");
    }
}
