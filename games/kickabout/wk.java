/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class wk {
    static vd field_f;
    static String field_a;
    static String field_e;
    static String field_b;
    static ut[] field_d;
    static la[] field_g;
    static up field_c;

    final static short a(int param0, int param1) {
        float stackIn_8_0 = 0.0f;
        float stackIn_15_0 = 0.0f;
        float stackIn_33_0 = 0.0f;
        short stackIn_34_0 = 0;
        RuntimeException decompiledCaughtException = null;
        float var2_float = 0.0f;
        RuntimeException var2 = null;
        float var3 = 0.0f;
        float var4 = 0.0f;
        float var5 = 0.0f;
        float var6 = 0.0f;
        float var7 = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = Kickabout.field_G;
        try {
          var2_float = (float)((param0 & 16711680) >> 16) / 255.0f;
          var3 = (float)((param0 & 65280) >> 8) / 255.0f;
          var4 = (float)(param0 & 255) / 255.0f;
          if (var2_float > var3) {
            stackIn_8_0 = (!(var2_float > var4)) ? var4 : var2_float;
          } else {
            stackIn_8_0 = (var3 > var4) ? var3 : var4;
          }
          var5 = stackIn_8_0;
          if (var2_float < var3) {
            stackIn_15_0 = (var2_float < var4) ? var2_float : var4;
          } else {
            stackIn_15_0 = (!(var3 < var4)) ? var4 : var3;
          }
          var6 = stackIn_15_0;
          if (var6 == var5) {
            var7 = 0.0f;
          } else {
            if (var2_float != var5) {
              if (var5 != var3) {
                var7 = (-var3 + var2_float) / (-var6 + var5) + 4.0f;
              } else {
                var7 = (var4 - var2_float) / (-var6 + var5) + 2.0f;
              }
            } else {
              var7 = (-var4 + var3) / (var5 - var6);
            }
          }
          for (var7 = var7 / 6.0f; 0.0f > var7; var7 = var7 + 1.0f) {
          }
          while (var7 > 1.0f) {
            var7 = var7 - 1.0f;
          }
          var9 = (var5 + var6) / 2.0f;
          if (0.0f != var9 &&
            var6 != var5) {
            if (!(0.5f > var9)) {
              stackIn_33_0 = (var5 - var6) / (-(2.0f * var9) + 2.0f);
            } else {
              stackIn_33_0 = (var5 - var6) / (var9 * 2.0f);
            }
          } else {
            stackIn_33_0 = 0.0f;
          }
          var8 = stackIn_33_0;
          var10 = (int)(0.5f + var7 * (float)param1);
          var11 = (int)(7.0f * var8 + 0.5f);
          var12 = (int)(0.5f + var9 * 127.0f);
          stackIn_34_0 = ks.a(var12, var10, -87, var11);
          return stackIn_34_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var2), "wk.D(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(byte param0) {
        field_f = null;
        field_e = null;
        int var1 = 14 / ((-6 - param0) / 57);
        field_g = null;
        field_d = null;
        field_b = null;
        field_a = null;
        field_c = null;
    }

    final static void a(int param0) {
        hn var3 = null;
        int var2 = Kickabout.field_G;
        try {
          if (param0 != 50) {
            field_a = (String) null;
          }
          var3 = (hn) (da.field_h.g(24009));
          while (var3 != null) {
            tu.field_E.a(var3, false, 0);
            var3 = (hn) (da.field_h.c(param0 ^ 19));
          }
          da.field_h.b(22997);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "wk.E(" + param0 + ')');
        }
    }

    final static gr a(boolean param0, boolean param1) {
        Random var3;
        int var4;
        up var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        gr var11;
        var10 = Kickabout.field_G;
        var11 = new gr();
        var3 = new Random();
        var4 = 0;
        if (!param1) {
          wk.a(-87L, -8);
        }
        while (var4 < 5) {
          var5 = new up();
          var5.field_q = 0;
          if (var4 == 0) {
            var5.field_q = 0;
          }
          if (var4 == 2) {
            var5.field_q = 3;
          }
          if (var4 == 3) {
            var5.field_q = 1;
          }
          if (param0) {
            var5.field_q = 0;
          }
          var5.field_e = dq.$cfr$intArgs$a$7f8aad568c81(-126, td.field_a.length, var3);
          var5.field_l = 1 + dq.$cfr$intArgs$a$7f8aad568c81(-62, -1 + ce.field_G[var5.field_q].length, var3);
          var5.field_r = 0;
          if (param0 &&
            var4 != 3) {
            var5.field_g = 10;
            var5.field_o = 10;
            var5.field_n = 10;
          } else {
            var5.field_o = 50;
            var5.field_g = 50;
            var5.field_n = 50;
          }
          var5.field_h = new int[]{};
          var6 = dq.$cfr$intArgs$a$7f8aad568c81(-48, 5, var3);
          var7 = dq.$cfr$intArgs$a$7f8aad568c81(-40, 3, var3);
          var8 = dq.$cfr$intArgs$a$7f8aad568c81(107, 3, var3);
          var9 = var8;
          var9 = var9 | var7 << 4;
          var9 = var9 | var6 << 8;
          var5.field_j = var9;
          var11.field_i[var4] = var5;
          var4++;
        }
        return var11;
    }

    final static void a(long param0, int param1) {
        oa.field_a.setTime(new Date(param0));
        if (param1 != 0) {
          field_d = (ut[]) null;
        }
    }

    static {
        field_e = "games in progress (<%0>)";
        field_a = "Kick";
        field_g = new la[]{new la(0, 0, 896, 1344)};
    }
}
