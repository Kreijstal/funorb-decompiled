/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RageEvent extends SpecialEvent {
    CreatureRef field_r;
    static String field_q;

    RageEvent(PacketBuffer param0) {
        super(param0);
        int var2_int = 0;
        try {
          this.moveId = param0.readUnsignedShort((byte) 123);
          this.effects = new IntrusiveDeque();
          var2_int = param0.readUnsignedByte(16711935);
          while (true) {
            var2_int--;
            if (var2_int < 0) {
              break;
            }
            this.effects.a(TBomberAnimation.a((byte) 102, param0), true);
          }
          this.field_r = qi.a(param0, (byte) 68);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "pg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final AnimationNode createAnimation(int param0, BattleScreen param1) {
        RuntimeException var3 = null;
        AnimationNode stackIn_2_0 = null;
        RageAnimation stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 5) {
            stackIn_4_0 = new RageAnimation(param1, this);
            return (AnimationNode) ((Object) stackIn_4_0);
          }
          stackIn_2_0 = (AnimationNode) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("pg.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static void e(int param0) {
        fja.field_a.a(18, 31407, tv.field_o.field_sb - (IntrusiveDeque.field_c ? 2 + (rj.field_j + 2 + 40) : 0), 0, 0);
        oca.field_n.a(18, param0 ^ 31407, rj.field_j + 42, tv.field_o.field_sb - (rj.field_j + 2 + 40), param0);
        qba.field_m.a((byte) -58, tv.field_o.field_p - 20, 0, 20, tv.field_o.field_sb, rj.field_j, 2);
    }

    RageEvent(int param0, CreatureRef param1, CreatureRef param2) {
        super(param0, param1);
        try {
          this.field_r = param2;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "pg.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(BattleState param0, int param1) {
        try {
          int var3_int = 56 / ((param1 - 12) / 35);
          this.a(param0, (byte) -2);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "pg.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_q = null;
        if (param0 != 0) {
          RageEvent.e(1);
        }
    }

    final void a(byte param0, PacketBuffer param1) {
        try {
          super.a((byte) -95, param1);
          FlirtAnimation.a(this.field_r, 127, param1);
          if (param0 >= -12) {
            this.field_r = (CreatureRef) null;
          }
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "pg.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
