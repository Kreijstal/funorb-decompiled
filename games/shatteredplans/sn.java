/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sn {
    static String field_a;
    static String field_b;

    public static void a(int param0) {
        field_a = null;
        if (param0 < 6) {
          sn.a(-121, 89, 108, 123, 4, -128);
        }
        field_b = null;
    }

    final static void a(int param0, int param1, int param2) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var6Lifetime1;
        int var7Lifetime1;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        if (js.field_j < 0) {
          return;
        }
        var3 = param2 - 135;
        var4 = -35 + param0;
        var5 = 256;
        if (js.field_j < 75) {
          var5 = (js.field_j << 8) / 75;
        }
        if (js.field_j > 200) {
          var5 = (-js.field_j + 250 << 8) / 50;
        }
        aq.a((byte) -40, in.field_i);
        wn.c();
        gf.b();
        gq.e(-70);
        if (var5 < 256) {
          gf.c(0, 0, gf.field_b, gf.field_k, 0, 256 - var5);
        }
        ln.f((byte) -47);
        if (param1 != 28318) {
          return;
        }
        if (js.field_j >= 150) {
          qa.field_q.a(15 + var3, var4 + 10, var5);
        } else {
          in.field_i.d(var3, var4);
        }
        var6 = -125 + js.field_j;
        if (var6 > 0 &&
          var6 < 50) {
          if (var6 >= 20) {
            if (var6 < 30) {
              rf.field_h.c(var3, var4, 256);
            } else {
              var7 = 256 * (50 - var6) / 20;
              rf.field_h.c(var3, var4, var7);
            }
          } else {
            var7 = var6 * 256 / 20;
            rf.field_h.c(var3, var4, var7);
          }
        }
        var6Lifetime1 = js.field_j - 140;
        if (var6Lifetime1 > 0) {
          var7Lifetime1 = 256;
          if (var6Lifetime1 < 20) {
            var7Lifetime1 = var6Lifetime1 * 256 / 20;
          }
          ak.field_z.a(15 + var3, 10 + var4, var7Lifetime1 * var5 >> 8);
        }
        return;
    }

    final static String a(char param0, byte param1) {
        if (param1 >= -25) {
          return (String) null;
        }
        return String.valueOf(param0);
    }

    final static void a(int[] param0, byte param1, sd param2) {
        int var3_int = 0;
        ln var4 = null;
        int var5 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param1 != -76) {
            sn.a(72);
          }
          var4 = param2.j(18229);
          while (var4 != null) {
            for (var3_int = 0; 4 > var3_int; var3_int++) {
              param0[var3_int] = param0[var3_int] + var4.field_G[var3_int];
            }
            var4 = param2.h(-23410);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("sn.C(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var8 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var9 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var11Lifetime1;
        var14 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param3 == 256) {
            return;
          }
          if (param3 == 0) {
            gf.d(param4, param5, param0, param2, 0);
            return;
          }
          if (param3 == 128) {
            gf.h(param4, param5, param0, param2);
            return;
          }
          if (param4 < 0) {
            param0 = param0 + param4;
            param4 = 0;
          }
          if (0 > param5) {
            param2 = param2 + param5;
            param5 = 0;
          }
          if (param4 + param0 > gf.field_b) {
            param0 = gf.field_b - param4;
          }
          var6_int = 49 / ((param1 - 38) / 61);
          if (param2 + param5 > gf.field_k) {
            param2 = gf.field_k - param5;
          }
          param4--;
          var7 = param5 + param2;
          for (var8 = param5; var8 < var7; var8++) {
            var9 = param4 + var8 * gf.field_b;
            for (var10 = param0; 0 < var10; var10--) {
              var9++;
              var11 = gf.field_h[var9];
              var12 = var11 & 16711935;
              var13 = var11 & 65280;
              var12 = var12 * param3;
              var12 = var12 & -16711936;
              var13 = var13 * param3;
              var13 = var13 & 16711680;
              var11Lifetime1 = (var13 | var12) >> 8;
              gf.field_h[var9] = var11Lifetime1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var6), "sn.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        field_a = "Quick Chat game";
        field_b = "Fullscreen";
    }
}
