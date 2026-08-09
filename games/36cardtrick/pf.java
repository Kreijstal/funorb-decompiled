/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pf extends qb {
    static String field_g;
    static int field_h;

    public static void e(int param0) {
        int var1 = -106 % ((46 - param0) / 43);
        field_g = null;
    }

    final static void d(int param0) {
        int var1_int = 0;
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var4 = Main.field_T;
        try {
          L0: {
            jb.b();
            th.field_a = 11;
            sh.field_l = new int[param0];
            var1_int = 0;
            L1: while (true) {
              if (-257 >= (var1_int ^ -1)) {
                var5 = 256;
                var1_int = var5;
                L2: while (true) {
                  if (var5 >= sh.field_l.length) {
                    break L0;
                  } else {
                    sh.field_l[var5] = 255;
                    var5++;
                    continue L2;
                  }
                }
              } else {
                var2 = 15.0;
                sh.field_l[var1_int] = (int)(Math.pow((double)((float)var1_int / 256.0f), var2) * 255.0);
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var1), "pf.E(" + param0 + ')');
        }
    }

    final static kc[] a(int param0) {
        int var2 = 0;
        int var4 = 0;
        byte[] var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = Main.field_T;
        kc[] var1 = new kc[cf.field_c];
        int var3 = -56 / ((param0 - 69) / 40);
        for (var2 = 0; var2 < cf.field_c; var2++) {
            var4 = na.field_q[var2] * hb.field_a[var2];
            var5 = rd.field_k[var2];
            var6 = new int[var4];
            for (var7 = 0; var7 < var4; var7++) {
                var6[var7] = jf.field_i[bc.a((int) var5[var7], 255)];
            }
            var1[var2] = new kc(p.field_l, gk.field_a, kb.field_c[var2], ml.field_b[var2], na.field_q[var2], hb.field_a[var2], var6);
        }
        rh.d(77);
        return var1;
    }

    private pf() throws Throwable {
        throw new Error();
    }

    final static String a(qk param0, String param1, String param2, boolean param3) {
        RuntimeException var4 = null;
        String stackIn_4_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3) {
                break L1;
              } else {
                pf.a(3);
                break L1;
              }
            }
            if (param0.b(4)) {
              stackIn_6_0 = param2 + " - " + param0.a(2) + "%";
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = (String) (param1);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("pf.D(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_10_0), stackIn_16_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
    }

    final static void b(byte param0) {
        if (!(vg.field_d)) {
            throw new IllegalStateException();
        }
        tj.field_K = true;
        gh.a((byte) 59, true);
        cd.field_e = 0;
        if (param0 <= 126) {
            field_g = (String) null;
        }
    }

    final static nk a(int param0, String[] param1) {
        nk var2 = null;
        RuntimeException var2_ref = null;
        nk stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2 = new nk(false);
              var2.field_c = param1;
              if (param0 <= -95) {
                break L1;
              } else {
                field_h = -16;
                break L1;
              }
            }
            stackIn_3_0 = (nk) (var2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2_ref);

            stackIn_6_1 = new StringBuilder().append("pf.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_g = "Your email address is used to identify this account";
    }
}
