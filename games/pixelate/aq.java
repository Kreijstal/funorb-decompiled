/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class aq {
    static int field_a;
    static String field_c;
    static String field_b;

    final static String a(String param0, int param1, String param2, int param3) {
        RuntimeException var4 = null;
        pc var5 = null;
        int var6 = 0;
        im var7 = null;
        CharSequence var8 = null;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_10_0 = null;
        Object stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8 = (CharSequence) ((Object) param0);
          if (!ai.a((byte) -128, var8)) {
            stackIn_2_0 = qn.field_n;
            return stackIn_2_0;
          }
          if (2 != gk.field_db) {
            stackIn_5_0 = ok.field_b;
            return stackIn_5_0;
          }
          if (param3 != -20867) {
            aq.a((byte) 117);
          }
          var7 = fh.a(param2, 114);
          if (var7 == null) {
            stackIn_10_0 = sd.a(ug.field_p, param3 + 20935, new String[]{param2});
            return stackIn_10_0;
          }
          var7.c(param3 ^ -23386);
          var7.e(param3 + 20884);
          aj.field_t = aj.field_t - 1;
          var5 = aa.field_f;
          var5.g(param1, 15514);
          var5.field_m = var5.field_m + 1;
          var6 = var5.field_m;
          var5.e(160, 3);
          var5.b((byte) -41, param0);
          var5.f(var5.field_m - var6, -1);
          stackIn_12_0 = null;
          return (String) (stackIn_12_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("aq.D(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(boolean param0) {
        int var1_int = 0;
        int var6 = 0;
        int var3 = 0;
        int var4 = 0;
        int var2 = 0;
        int var5 = Pixelate.field_H ? 1 : 0;
        int var2Lifetime1;
        try {
          var1_int = 8;
          if (!param0) {
            aq.a(false);
          }
          jm.field_g = new int[var1_int];
          for (var2 = 0; var1_int > var2; var2++) {
            jm.field_g[var2] = var2;
          }
          var6 = 1;
          var2Lifetime1 = var6;
          while (var1_int > var6) {
            var3 = var6 + ok.a(ea.field_b, -109, var1_int - var6);
            var4 = jm.field_g[var6];
            jm.field_g[var6] = jm.field_g[var3];
            jm.field_g[var3] = var4;
            var6++;
          }
          ko.field_hb = 0;
          aq.a(jm.field_g[ko.field_hb], !param0 ? true : false);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "aq.C(" + param0 + ')');
        }
    }

    final static int a(byte param0, int param1) {
        int var2;
        var2 = 0;
        if (param1 < 0) {
          param1 = param1 >>> 16;
          var2 += 16;
        } else {
          if (param1 >= 65536) {
            param1 = param1 >>> 16;
            var2 += 16;
          }
        }
        if (param1 >= 256) {
          param1 = param1 >>> 8;
          var2 += 8;
        }
        if (16 <= param1) {
          var2 += 4;
          param1 = param1 >>> 4;
        }
        if (param0 <= 5) {
          return -101;
        }
        if (param1 >= 4) {
          var2 += 2;
          param1 = param1 >>> 2;
        }
        if (param1 >= 1) {
          var2++;
          param1 = param1 >>> 1;
        }
        return param1 + var2;
    }

    public static void a(byte param0) {
        field_b = null;
        field_c = null;
        int var1 = 17 / ((param0 - 13) / 60);
    }

    final static void a(int param0, boolean param1) {
        rg.field_e = rj.field_C[param0];
        fq.field_o = null;
        if (!param1) {
          ci.field_o = param0;
          hn.field_d = 0;
          dg.a(param0 + 2, (byte) -100);
          return;
        }
    }

    final static boolean a(char param0, CharSequence param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!vf.a((byte) -3, param0)) {
            return false;
          }
          if (param1 == null) {
            return false;
          }
          if (param2 >= -38) {
            return false;
          }
          var3_int = param1.length();
          if (var3_int >= 12) {
            return false;
          }
          if (ii.a((byte) 125, param0) &&
            0 == var3_int) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_21_0 = var3;
          stackIn_21_1 = new StringBuilder().append("aq.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_b = "This game has been updated! Please reload this page.";
        field_c = "You do not have a suitable number of players for the current options.";
    }
}
