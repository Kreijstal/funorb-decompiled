/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class HazmatEvent extends SpecialEvent {
    int field_r;
    static int field_q;
    static int[] field_u;
    int field_t;
    static int field_s;

    final void a(BattleState param0, int param1) {
        try {
          param0.setTerrain((byte) 40, 33, this.field_t, this.field_r);
          int var3_int = -24 / ((param1 - 12) / 35);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "jaa.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 > -88) {
          field_u = (int[]) null;
          field_u = null;
          return;
        }
        field_u = null;
    }

    HazmatEvent(int param0, CreatureRef param1, int param2, int param3) {
        super(param0, param1);
        try {
          this.field_r = param3;
          this.field_t = param2;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "jaa.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final AnimationNode createAnimation(int param0, BattleScreen param1) {
        RuntimeException var3 = null;
        AnimationNode stackIn_2_0 = null;
        HazmatAnimation stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 5) {
            stackIn_4_0 = new HazmatAnimation(param1, this);
            return (AnimationNode) ((Object) stackIn_4_0);
          }
          stackIn_2_0 = (AnimationNode) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("jaa.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    HazmatEvent(PacketBuffer param0) {
        super(param0);
        int var2_int = 0;
        try {
          this.moveId = param0.readUnsignedShort((byte) 49);
          this.effects = new IntrusiveDeque();
          var2_int = param0.readUnsignedByte(16711935);
          while (true) {
            var2_int--;
            if (var2_int < 0) {
              break;
            }
            this.effects.a(TBomberAnimation.a((byte) 102, param0), true);
          }
          this.field_t = param0.readUnsignedByte(16711935);
          this.field_r = param0.readUnsignedByte(16711935);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "jaa.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, PacketBuffer param1) {
        if (param0 >= -12) {
          return;
        }
        try {
          super.a((byte) -88, param1);
          param1.writeByte(this.field_t, 0);
          param1.writeByte(this.field_r, 0);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "jaa.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_u = new int[5];
        field_s = 0;
    }
}
