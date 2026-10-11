/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jh {
    static kb field_d;
    static String field_b;
    static ld field_a;
    static hj field_c;

    final static String a(int[] param0, int param1, String param2) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -118) {
            field_b = (String) null;
          }
          stackIn_3_0 = sd.a(pe.field_d, new String[]{param2, ih.a(param0[0], 5), ih.a(param0[1], 5), ih.a(param0[2], 5)}, true);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("jh.D(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 <= -24) {
          field_b = null;
          field_a = null;
          field_c = null;
          return;
        }
        jh.a(-125);
        field_b = null;
        field_a = null;
        field_c = null;
    }

    final static void b(int param0) {
        if (param0 > 67) {
          return;
        }
        field_d = (kb) null;
    }

    final static void a(hj param0, byte param1, float param2, int[] param3) {
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        var22 = HoldTheLine.field_D;
        try {
          gf.a();
          gf.a(param3, 0, param3.length);
          gf.c();
          if (param1 <= 46) {
            field_d = (kb) null;
          }
          stackIn_5_0 = gf.d();
          while (true) {
            if (!stackIn_5_0) {
              return;
            }
            var4_int = gf.field_g;
            if (var4_int < 0) {
              var4_int = 0;
            }
            var5 = gf.field_b;
            if (tc.field_j <= var5) {
              var5 = -1 + tc.field_j;
            }
            var6 = gf.field_a;
            if (var6 < 0) {
              var6 = 0;
            }
            if (tc.field_c <= var6) {
              var6 = tc.field_c - 1;
            }
            var7 = var4_int % param0.field_s;
            var8 = var6 % param0.field_y;
            var9 = var6 * tc.field_j + var4_int;
            var10 = param0.field_s * var8 + var7;
            var11 = -var7 + param0.field_s;
            var12 = var5 - var4_int;
            while (true) {
              var12--;
              if (var12 < 0) {
                stackIn_5_0 = gf.d();
                break;
              }
              var13 = tc.field_b[var9] & 16711680;
              var14 = tc.field_b[var9] & 65280;
              var15 = 255 & tc.field_b[var9];
              var16 = param0.field_z[var10] & 16711680;
              var17 = 65280 & param0.field_z[var10];
              var18 = param0.field_z[var10] & 255;
              var19 = var13 + (int)(param2 * (float)(var16 - var13));
              var20 = var14 + (int)((float)(-var14 + var17) * param2);
              var21 = (int)((float)(var18 - var15) * param2) + var15;
              tc.field_b[var9] = kc.a(kc.a(pk.a(65280, var20), pk.a(16711680, var19)), pk.a(255, var21));
              var9++;
              var10++;
              var11--;
              if (var11 != 0) {
                continue;
              }
              var10 = var8 * param0.field_s;
              var11 = param0.field_s;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_24_0 = var4;
          stackIn_24_1 = new StringBuilder().append("jh.A(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    final static void a(int param0, byte param1) {
        nd.field_l = param0 >> 4 & 3;
        if (!(2 >= nd.field_l)) {
          nd.field_l = 2;
        }
        m.field_a = (param0 & 14) >> 2;
        if (m.field_a > 2) {
          m.field_a = 2;
          pe.field_f = param0 & 3;
          if (2 >= pe.field_f) {
            if (param1 != 61) {
              field_a = (ld) null;
              return;
            }
            return;
          }
          pe.field_f = 2;
          if (param1 != 61) {
            field_a = (ld) null;
            return;
          }
          return;
        }
        pe.field_f = param0 & 3;
        if (2 < pe.field_f) {
          pe.field_f = 2;
          if (param1 != 61) {
            field_a = (ld) null;
            return;
          }
          return;
        }
        if (param1 != 61) {
          field_a = (ld) null;
          return;
        }
    }

    static {
        field_d = new kb(2);
        field_b = "<img=8>, <img=7>, <img=9>";
    }
}
