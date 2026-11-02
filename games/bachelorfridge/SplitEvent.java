/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SplitEvent extends SpecialEvent {
    static String field_s;
    static vr field_r;
    static String field_q;

    final void a(BattleState param0, int param1) {
        BattleCreature var3 = null;
        try {
          var3 = this.creature.a(63, param0);
          int var4 = 99 % ((param1 - 12) / 35);
          this.effects.b((byte) 90);
          this.field_p = null == param0.a(var3, (byte) -92) ? true : false;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "l.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    SplitEvent(int param0, CreatureRef param1) {
        super(param0, param1);
    }

    final AnimationNode createAnimation(int param0, BattleScreen param1) {
        RuntimeException var3 = null;
        PacketBuffer var4 = null;
        SplitAnimation stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 5) {
            var4 = (PacketBuffer) null;
            this.a((byte) 112, (PacketBuffer) null);
          }
          stackIn_3_0 = new SplitAnimation(param1, this);
          return (AnimationNode) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("l.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void d(byte param0) {
        field_r = null;
        field_q = null;
        field_s = null;
        if (param0 >= -116) {
          SplitEvent.d((byte) -64);
        }
    }

    SplitEvent(PacketBuffer param0) {
        super(param0);
        int var2_int = 0;
        try {
          this.moveId = param0.readUnsignedShort((byte) 124);
          this.effects = new IntrusiveDeque();
          var2_int = param0.readUnsignedByte(16711935);
          while (true) {
            var2_int--;
            if (var2_int < 0) {
              break;
            }
            this.effects.a(TBomberAnimation.a((byte) 102, param0), true);
          }
          this.field_p = 1 == param0.readUnsignedByte(16711935) ? true : false;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "l.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, PacketBuffer param1) {
        EventEffect var5 = null;
        int var4 = BachelorFridge.field_y;
        try {
          if (param0 > -12) {
            SplitEvent.d((byte) -18);
          }
          param1.b(this.moveId, -125);
          param1.writeByte(this.effects.g(0), 0);
          var5 = (EventEffect) (this.effects.b((byte) 90));
          while (var5 != null) {
            var5.write(param1, (byte) -54);
            var5 = (EventEffect) (this.effects.c(0));
          }
          param1.writeByte(this.field_p ? 1 : 0, 0);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "l.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_s = "This option cannot be combined with the current '<%0>' setting.";
        field_q = "Start Game";
    }
}
