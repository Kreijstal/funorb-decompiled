/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TeleportEvent extends SpecialEvent {
    int field_q;
    static int field_s;
    static int field_r;
    int field_t;

    final void a(byte param0, PacketBuffer param1) {
        try {
          super.a((byte) -38, param1);
          param1.writeByte(this.field_q, 0);
          if (param0 > -12) {
            gj var4 = (gj) null;
            this.a(-92, (gj) null);
          }
          param1.writeByte(this.field_t, 0);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "ima.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final AnimationNode a(int param0, gj param1) {
        RuntimeException var3 = null;
        PacketBuffer var4 = null;
        TeleportAnimation stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 5) {
            var4 = (PacketBuffer) null;
            this.a((byte) -31, (PacketBuffer) null);
          }
          stackIn_3_0 = new TeleportAnimation(param1, this);
          return (AnimationNode) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ima.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    TeleportEvent(int param0, CreatureRef param1) {
        super(param0, param1);
    }

    final static jna a(PacketBuffer param0, boolean param1) {
        jna var2 = null;
        RuntimeException var2_ref = null;
        jna stackIn_2_0 = null;
        jna stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            stackIn_2_0 = (jna) null;
            return stackIn_2_0;
          }
          var2 = new jna();
          var2.a(-115, param0);
          stackIn_4_0 = var2;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_7_0 = var2_ref;
          stackIn_7_1 = new StringBuilder().append("ima.B(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    TeleportEvent(PacketBuffer param0) {
        super(param0);
        int var2_int = 0;
        try {
          this.moveId = param0.readUnsignedShort((byte) 76);
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
          throw pe.wrapException((Throwable) ((Object) runtimeException), "ima.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(BattleState param0, int param1) {
        try {
          this.a(param0, (byte) -2);
          int var3_int = -3 / ((param1 - 12) / 35);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "ima.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_s = 9;
    }
}
