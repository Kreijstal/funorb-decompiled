/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class di extends qf {
    static Random field_l;
    static int field_m;
    static String field_k;
    static String[] field_j;

    di(fe param0) {
        super(param0);
    }

    final static hl a(int param0, int param1, ue param2, int param3) {
        RuntimeException var4 = null;
        String var5 = null;
        hl stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!qb.a((byte) -76, param3, param1, param2)) {
            return null;
          }
          if (param0 != 130) {
            var5 = (String) null;
            di.a((byte) 118, (String) null);
          }
          stackIn_6_0 = uh.c((byte) 34);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("di.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    final String a(String param0, boolean param1) {
        RuntimeException var3 = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            di.f(-21);
          }
          if (this.a(param0, -26188) != sb.field_n) {
            return null;
          }
          stackIn_5_0 = pe.field_f;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("di.A(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final p a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        CharSequence var5 = null;
        p stackIn_3_0 = null;
        p stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = (CharSequence) ((Object) param0);
          if (!ba.a(6, var4)) {
            stackIn_3_0 = sb.field_n;
            return stackIn_3_0;
          }
          if (param1 != -26188) {
            field_j = (String[]) null;
          }
          var5 = (CharSequence) ((Object) param0);
          var3_int = pd.a(var5, 10);
          if (0 < var3_int &&
            var3_int <= 130) {
            return bf.field_x;
          }
          stackIn_10_0 = sb.field_n;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("di.B(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void f(int param0) {
        field_l = null;
        field_k = null;
        if (param0 != 24979) {
          return;
        }
        field_j = null;
    }

    final static boolean a(byte param0, String param1) {
        RuntimeException var2 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 89) {
            field_m = -11;
          }
          stackIn_5_0 = (null != hg.a(120, param1));
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("di.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    static {
        field_m = 0;
        field_k = "POWERUPS 2/2:";
        field_l = new Random();
        field_j = new String[]{"Defender", "Interstellar Fighter", "Alien Aggressor", "Interstellar Warrior", "Alien Dominator", "Zenon Warrior", "Missile Gunner", "Destroyer Pilot", "Battleship Pilot", "Dog Fighter", "Wolverine Fighter", "Fusion Engines", "High Five Fighter", "High Five Interceptor", "High Five Invader"};
    }
}
