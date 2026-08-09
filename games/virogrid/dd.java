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
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
                    var3 = (CharSequence) ((Object) param0);
                    if (!d.field_Gb.equals(c.a(var3, true))) {
                      break L1;
                    } else {
                      if (!param1) {
                        stackIn_13_0 = 1;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        stackIn_11_0 = 1;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    }
                  }
                }
              }
              stackIn_8_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var2);

            stackIn_16_1 = new StringBuilder().append("dd.B(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0 != 0;
            } else {
              return stackIn_13_0 != 0;
            }
          }
        }
    }

    final static mg[] a(byte param0) {
        mg[] var1;
        int var2;
        int var3;
        int[] var6;
        int var6_int;
        int var7;
        int var8;
        String var9;
        int[] var10;
        int[] var14;
        int[] var17;
        byte[] var21;
        int[] var22;
        byte[] var23;
        var8 = Virogrid.field_F ? 1 : 0;
        var1 = new mg[rj.field_h];
        var2 = 0;
        L0: while (true) {
          if (rj.field_h <= var2) {
            L1: {
              if (param0 <= -106) {
                break L1;
              } else {
                var9 = (String) null;
                dd.a((String) null, true);
                break L1;
              }
            }
            pe.b((byte) -28);
            return var1;
          } else {
            var3 = db.field_k[var2] * gb.field_F[var2];
            var21 = lj.field_j[var2];
            if (ei.field_d[var2]) {
              var23 = md.field_g[var2];
              var17 = new int[var3];
              var14 = var17;
              var6 = var14;
              var7 = 0;
              L2: while (true) {
                if (var7 >= var3) {
                  var1[var2] = (mg) ((Object) new kc(oj.field_Kb, se.field_d, el.field_w[var2], mb.field_bb[var2], db.field_k[var2], gb.field_F[var2], var17));
                  var2++;
                  continue L0;
                } else {
                  var6[var7] = oh.a(rb.a((int) var23[var7], 255) << -524447496, k.field_c[rb.a((int) var21[var7], 255)]);
                  var7++;
                  continue L2;
                }
              }
            } else {
              var10 = new int[var3];
              var22 = var10;
              var6_int = 0;
              L3: while (true) {
                if (var3 <= var6_int) {
                  var1[var2] = new mg(oj.field_Kb, se.field_d, el.field_w[var2], mb.field_bb[var2], db.field_k[var2], gb.field_F[var2], var22);
                  var2++;
                  continue L0;
                } else {
                  var10[var6_int] = k.field_c[rb.a((int) var21[var6_int], 255)];
                  var6_int++;
                  continue L3;
                }
              }
            }
          }
        }
    }

    public static void b(byte param0) {
        if (param0 != -58) {
            return;
        }
        field_e = null;
        field_f = null;
        field_b = null;
        field_d = null;
        field_c = null;
    }

    static {
        field_e = "Just play";
        field_d = "<%0> ran out of time";
        field_f = "start using this feature.";
        field_c = "Invalid password.";
    }
}
