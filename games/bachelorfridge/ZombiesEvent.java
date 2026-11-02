/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ZombiesEvent extends SpecialEvent {
    static IndexedSprite field_q;

    public static void d(byte param0) {
        if (param0 >= -8) {
          ZombiesEvent.d((byte) -65);
          field_q = null;
          return;
        }
        field_q = null;
    }

    final AnimationNode a(int param0, gj param1) {
        RuntimeException var3 = null;
        AnimationNode stackIn_2_0 = null;
        ZombiesAnimation stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 5) {
            stackIn_4_0 = new ZombiesAnimation(param1, this);
            return (AnimationNode) ((Object) stackIn_4_0);
          }
          stackIn_2_0 = (AnimationNode) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ps.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    ZombiesEvent(int param0, CreatureRef param1) {
        super(param0, param1);
    }

    ZombiesEvent(PacketBuffer param0) {
        super(param0);
        int var2_int = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          this.moveId = param0.readUnsignedShort((byte) 104);
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
          stackIn_7_1 = new StringBuilder().append("ps.<init>(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final void a(BattleState param0, int param1) {
        try {
          int var3_int = 45 % ((param1 - 12) / 35);
          this.a(param0, (byte) -2);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "ps.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean d(int param0) {
        if (param0 < -116) {
          return SnowAnimation.field_w.field_Sb == ge.field_F ? true : false;
        }
        field_q = (IndexedSprite) null;
        return SnowAnimation.field_w.field_Sb == ge.field_F ? true : false;
    }

    static {
    }
}
