/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dk extends da {
    static ve field_o;
    static String field_m;
    static String field_l;
    static String field_n;

    final static er[] a(int[] param0, boolean param1, er[] param2) {
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int incrementValue$0 = 0;
        er[] stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        er[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        er var8 = null;
        int var11 = 0;
        var11 = Vertigo2.field_L ? 1 : 0;
        try {
          var3 = new er[96];
          var4 = 0;
          var5 = 0;
          if (!param1) {
            dk.c((byte) -110);
          }
          while (true) {
            if (6 <= var5) {
              ro.field_g.a(89);
              stackIn_20_0 = var3;
              return stackIn_20_0;
            }
            if (param2[var5].field_y != param2[var5].field_t) {
              throw new IllegalArgumentException("img_in pix32s must be exactly square.");
            }
            param0[var5] = (-param2[var5].field_y + 512) / 8;
            for (var6 = 0; var6 < 4; var6++) {
              for (var7 = 0; 4 > var7; var7++) {
                var8 = new er(128, 128);
                var8.d();
                param2[var5].c(param0[var5] - param2[var5].field_y * var7 / 4, param0[var5] - var6 * param2[var5].field_t / 4);
                for (var9 = param0[var5] - 1; var9 >= 0; var9--) {
                  for (var10 = 0; var8.field_y > var10; var10++) {
                    var8.field_F[var8.field_y * var10 + var9] = var8.field_F[var8.field_y * var10 + param0[var5]];
                    var8.field_F[-var9 + ((1 + var10) * var8.field_y - 1)] = var8.field_F[-param0[var5] + var8.field_y * (var10 + 1) - 1];
                    var8.field_F[var8.field_y * var9 + var10] = var8.field_F[param0[var5] * var8.field_y + var10];
                    var8.field_F[var10 + var8.field_y * (-var9 + (-1 + var8.field_t))] = var8.field_F[var8.field_y * (-param0[var5] - 1 + var8.field_t) + var10];
                  }
                }
                incrementValue$0 = var4;
                var4++;
                var3[incrementValue$0] = var8;
              }
            }
            var5++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_23_0 = var3_ref;
          stackIn_23_1 = new StringBuilder().append("dk.F(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    public static void c(byte param0) {
        field_o = null;
        field_n = null;
        field_m = null;
        if (param0 != -73) {
          field_n = (String) null;
        }
        field_l = null;
    }

    final static void d(byte param0) {
        int var1 = 0;
        int var1Lifetime1;
        if (tg.field_e > 32) {
          var1 = tg.field_e % 32;
          if (0 == var1) {
            var1 = 32;
          }
          pk.b(-88, -var1 + tg.field_e);
        } else {
          pk.b(-128, 0);
        }
        var1Lifetime1 = -81 % ((-22 - param0) / 52);
    }

    final String b(int param0, String param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 3614) {
            stackIn_2_0 = (String) null;
            return stackIn_2_0;
          }
          if (this.a(-1, param1) != ir.field_a) {
            return mh.field_b;
          }
          stackIn_6_0 = sr.field_d;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("dk.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    dk(kp param0) {
        super(param0);
    }

    final ba a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        ba stackIn_2_0 = null;
        int stackIn_6_0 = 0;
        ba stackIn_8_0 = null;
        ba stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -1) {
            stackIn_2_0 = (ba) null;
            return stackIn_2_0;
          }
          stackIn_6_0 = (null != ol.a(param1, param0 - 6674)) ? 0 : 1;
          var3_int = stackIn_6_0;
          if (var3_int != 0) {
            stackIn_10_0 = qm.field_G;
            return stackIn_10_0;
          }
          stackIn_8_0 = ir.field_a;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("dk.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    static {
        field_o = new ve(1, 2, 2, 0);
        field_n = "Loading extra data";
        field_l = "Macroing or use of bots";
        field_m = "<%0> is RED";
    }
}
