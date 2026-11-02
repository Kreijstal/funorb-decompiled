/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class LevitateEvent extends SpecialEvent {
    static int field_q;
    static byte[] field_r;
    static int field_t;
    static String field_s;

    LevitateEvent(PacketBuffer param0) {
        super(param0);
        int var2_int = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          this.moveId = param0.readUnsignedShort((byte) 87);
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
          stackIn_7_1 = new StringBuilder().append("fia.<init>(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static void c(int param0, int param1) {
        ol.a(pja.field_a[param1][param0 + DiveBomberAnimation.a(3, m.field_a, -2147483648)], true);
    }

    LevitateEvent(int param0, CreatureRef param1) {
        super(param0, param1);
    }

    public static void c(boolean param0) {
        if (param0) {
          return;
        }
        field_s = null;
        field_r = null;
    }

    final void a(BattleState param0, int param1) {
        try {
          int var3_int = -91 / ((param1 - 12) / 35);
          this.a(param0, (byte) -2);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "fia.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final AnimationNode a(int param0, gj param1) {
        RuntimeException var3 = null;
        LevitateAnimation stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 5) {
            field_t = -44;
          }
          stackIn_3_0 = new LevitateAnimation(param1, this);
          return (AnimationNode) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("fia.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
        field_q = 0;
        field_t = 0;
    }
}
