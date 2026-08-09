/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class so extends qe {
    static qr field_v;
    static qd field_q;
    int field_u;
    static int field_m;
    static byte[] field_r;
    static qr field_t;
    int field_p;
    static String field_s;
    static int field_o;
    int field_n;

    final static void a(int param0, int param1, int param2, bi param3) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        try {
          L0: {
            L1: {
              var4_int = param1 + gf.field_b * param2;
              var5 = param0;
              var6 = param3.field_w;
              var7 = param3.field_z;
              var8 = -var7 + gf.field_b;
              var9 = 0;
              if (gf.field_a <= param2) {
                break L1;
              } else {
                var10 = gf.field_a + -param2;
                var6 = var6 - var10;
                param2 = gf.field_a;
                var5 = var5 + var10 * var7;
                var4_int = var4_int + gf.field_b * var10;
                break L1;
              }
            }
            L2: {
              if (param1 >= gf.field_i) {
                break L2;
              } else {
                var10 = -param1 + gf.field_i;
                var5 = var5 + var10;
                var9 = var9 + var10;
                var8 = var8 + var10;
                var4_int = var4_int + var10;
                var7 = var7 - var10;
                param1 = gf.field_i;
                break L2;
              }
            }
            L3: {
              if (var6 + param2 <= gf.field_f) {
                break L3;
              } else {
                var6 = var6 - (param2 - (-var6 - -gf.field_f));
                break L3;
              }
            }
            L4: {
              if (gf.field_l >= param1 - -var7) {
                break L4;
              } else {
                var10 = -gf.field_l + (param1 + var7);
                var7 = var7 - var10;
                var9 = var9 + var10;
                var8 = var8 + var10;
                break L4;
              }
            }
            L5: {
              if (0 >= var7) {
                break L5;
              } else {
                if (var6 <= 0) {
                  break L5;
                } else {
                  ge.a(param3.field_B, var5, gf.field_h, 0, param0 + -28646, var7, var4_int, var9, var6, var8);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var4);

            stackIn_16_1 = new StringBuilder().append("so.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L6;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L6;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, boolean param1, int param2, boolean param3, int param4, int param5, boolean param6, int param7, int param8, int param9, int param10, boolean param11, int param12, boolean param13) {
        dn.field_k = null;
        wf.a(-15887);
        param13 = ak.a(true, param7, param5, param13, param8, param10, param9);
        fb.a(param13, param11, param10, param2, param12, param6, param4, param3, param1, param0 + param0);
        pf.a(param12, param11, -1043);
        cc.a(-115, param7, param12, param13);
    }

    public static void d(int param0) {
        field_t = null;
        field_s = null;
        field_q = null;
        field_v = null;
        field_r = null;
        if (param0 != 2) {
            field_o = -40;
        }
    }

    final static String[] a(String param0, char param1, int param2) {
        int incrementValue$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        CharSequence var10 = null;
        String[] stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var10 = (CharSequence) ((Object) param0);
            var3_int = ak.a(-116, var10, param1);
            var4 = new String[var3_int + 1];
            var5 = 0;
            var6 = 0;
            var7 = 0;
            L1: while (true) {
              if (var3_int <= var7) {
                var7 = -81 % ((param2 - -33) / 57);
                var4[var3_int] = param0.substring(var6);
                stackIn_8_0 = (String[]) (var4);
                break L0;
              } else {
                var8 = var6;
                L2: while (true) {
                  if (param1 == param0.charAt(var8)) {
                    incrementValue$1 = var5;
                    var5++;
                    var4[incrementValue$1] = param0.substring(var6, var8);
                    var6 = var8 - -1;
                    var7++;
                    continue L1;
                  } else {
                    var8++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("so.A(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_8_0;
    }

    so(ln param0) {
        double var2_double = 0.0;
        int var4 = 0;
        try {
            this.field_h = param0;
            this.field_i = rp.a(96, pd.field_m, 0);
            var2_double = Math.random() * 3.141592653589793 * 2.0;
            var4 = 16384 + vc.a((byte) -39, 16384);
            this.field_p = (int)((double)var4 * Math.sin(var2_double));
            this.field_n = (int)(Math.cos(var2_double) * (double)var4);
            this.field_u = 0;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "so.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_s = "Show game chat from my friends";
        field_m = 0;
    }
}
