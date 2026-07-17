/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dd {
    static String field_e;
    static String field_d;
    static String field_c;
    static boolean field_a;
    static String field_f;
    static jm field_b;

    final static boolean a(String param0, boolean param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (qc.field_h) {
              L1: {
                if (sd.field_e != 2) {
                  break L1;
                } else {
                  if (null == d.field_Gb) {
                    break L1;
                  } else {
                    var3 = (CharSequence) (Object) param0;
                    if (!d.field_Gb.equals((Object) (Object) c.a(var3, true))) {
                      break L1;
                    } else {
                      if (!param1) {
                        stackOut_12_0 = 1;
                        stackIn_13_0 = stackOut_12_0;
                        break L0;
                      } else {
                        stackOut_10_0 = 1;
                        stackIn_11_0 = stackOut_10_0;
                        return stackIn_11_0 != 0;
                      }
                    }
                  }
                }
              }
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0 != 0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var2;
            stackOut_14_1 = new StringBuilder().append("dd.B(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param1 + 41);
        }
        return stackIn_13_0 != 0;
    }

    final static mg[] a(byte param0) {
        mg[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int[] var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var10 = null;
        int[] var14 = null;
        int[] var17 = null;
        int[] var21 = null;
        byte[] var22 = null;
        int[] var23 = null;
        byte[] var24 = null;
        int[] var25 = null;
        var8 = Virogrid.field_F ? 1 : 0;
        var1 = new mg[rj.field_h];
        var2 = 0;
        L0: while (true) {
          if (rj.field_h <= var2) {
            pe.b((byte) -28);
            return var1;
          } else {
            var3 = db.field_k[var2] * gb.field_F[var2];
            var22 = lj.field_j[var2];
            if (ei.field_d[var2]) {
              var24 = md.field_g[var2];
              var25 = new int[var3];
              var21 = var25;
              var17 = var21;
              var14 = var17;
              var6 = var14;
              var7 = 0;
              L1: while (true) {
                if (var7 >= var3) {
                  var1[var2] = (mg) (Object) new kc(oj.field_Kb, se.field_d, el.field_w[var2], mb.field_bb[var2], db.field_k[var2], gb.field_F[var2], var25);
                  var2++;
                  continue L0;
                } else {
                  var6[var7] = oh.a(rb.a((int) var24[var7], 255) << 24, k.field_c[rb.a((int) var22[var7], 255)]);
                  var7++;
                  continue L1;
                }
              }
            } else {
              var10 = new int[var3];
              var23 = var10;
              var6_int = 0;
              L2: while (true) {
                if (var3 <= var6_int) {
                  var1[var2] = new mg(oj.field_Kb, se.field_d, el.field_w[var2], mb.field_bb[var2], db.field_k[var2], gb.field_F[var2], var23);
                  var2++;
                  continue L0;
                } else {
                  var10[var6_int] = k.field_c[rb.a((int) var22[var6_int], 255)];
                  var6_int++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    public static void b(byte param0) {
        field_e = null;
        field_f = null;
        field_b = null;
        field_d = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Just play";
        field_d = "<%0> ran out of time";
        field_f = "start using this feature.";
        field_c = "Invalid password.";
    }
}
