/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pl {
    static Random field_d;
    static ka[] field_f;
    static ka[] field_c;
    static int field_a;
    static int[] field_b;
    static int[] field_e;

    final static vi a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        vi var7 = null;
        int var8 = 0;
        vi stackIn_3_0 = null;
        vi stackIn_7_0 = null;
        vi stackIn_11_0 = null;
        vi stackIn_14_0 = null;
        vi stackIn_19_0 = null;
        vi stackIn_22_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = TorChallenge.field_F ? 1 : 0;
        try {
          var2_int = param0.length();
          if (0 == var2_int) {
            stackIn_3_0 = dj.field_W;
            return stackIn_3_0;
          }
          if (var2_int > 255) {
            stackIn_7_0 = uk.field_I;
            return stackIn_7_0;
          }
          var3 = dl.a(param0, '.', -60);
          if (var3.length < 2) {
            stackIn_11_0 = dj.field_W;
            return stackIn_11_0;
          }
          var4 = var3;
          if (param1 != 96) {
            stackIn_14_0 = (vi) null;
            return stackIn_14_0;
          }
          var5 = 0;
          while (true) {
            if (var5 >= var4.length) {
              stackIn_22_0 = gb.a(param1 - 209, var3[-1 + var3.length]);
              return stackIn_22_0;
            }
            var6 = var4[var5];
            var7 = ma.b(var6, (byte) -25);
            if (var7 == null) {
              var5++;
              continue;
            }
            break;
          }
          stackIn_19_0 = var7;
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_25_0 = var2;
          stackIn_25_1 = new StringBuilder().append("pl.A(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean a(int param0, int param1, int param2) {
        int var7 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param1 != -4346) {
            return false;
          }
          for (var7 = 0; w.field_m > var7; var7++) {
            var3_int = cb.field_c[var7][0];
            var4 = cb.field_c[var7][2];
            var6 = cb.field_c[var7][3];
            var5 = cb.field_c[var7][1];
            if (param2 == var3_int &&
              var5 == param0) {
              return true;
            }
            if (param2 == var4 &&
              var6 == param0) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var3), "pl.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
          pa.a("", 8, param1);
          ek.a((byte) -126, param1);
          if (param0 < 112) {
            field_f = (ka[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "pl.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, String param1, ka param2) {
        try {
          lj.field_f = param2;
          if (param0 != 13267) {
            field_b = (int[]) null;
          }
          ia.field_l = param1;
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "pl.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(lj param0, lj param1, byte param2, lj param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param3.b(param2 ^ 8055)) {
            return false;
          }
          if (!param3.b(5, "commonui")) {
            return false;
          }
          if (param0.b(param2 - 7857) &&
            param0.b(param2 ^ -103, "commonui")) {
            if (param2 != -100) {
              return true;
            }
            if (param1.b(param2 - 7857) &&
              param1.b(5, "button.gif")) {
              return true;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_20_0 = var4;
          stackIn_20_1 = new StringBuilder().append("pl.D(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        if (param0 != -74) {
          field_a = -21;
        }
        field_e = null;
        field_c = null;
        field_b = null;
        field_d = null;
        field_f = null;
    }

    static {
        field_d = new Random();
        field_a = 20;
        field_b = new int[]{64, 64, 96, 64, 96, 96, 64, 64, 64, 128};
        field_e = new int[]{-1, -1, -1, 0, 1, 2, 4, 5, -1, 6, 3, -1, -1, -1, -1, -1, -1, -1};
    }
}
