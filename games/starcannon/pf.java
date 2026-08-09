/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pf {
    static String field_b;
    static ue field_a;
    static String field_c;
    static int field_d;
    static int field_e;

    public static void a(boolean param0) {
        field_a = null;
        if (!param0) {
            pf.a(false);
        }
        field_c = null;
        field_b = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean a(CharSequence param0, boolean param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = StarCannon.field_A;
        try {
          L0: {
            if (!tj.a((byte) -79, param1, param0)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (!param2) {
                  break L1;
                } else {
                  field_a = (ue) null;
                  break L1;
                }
              }
              var3_int = 0;
              L2: while (true) {
                if (param0.length() <= var3_int) {
                  stackIn_15_0 = 1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (!sa.a((byte) -121, param0.charAt(var3_int))) {
                    stackIn_12_0 = 0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var3_int++;
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
            stackIn_18_0 = (RuntimeException) (var3);

            stackIn_18_1 = new StringBuilder().append("pf.C(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L3;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L3;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0 != 0;
          } else {
            return stackIn_15_0 != 0;
          }
        }
    }

    final static hl[] a(int param0) {
        hl[] var1;
        int var2;
        int var3;
        int[] var6;
        int var6_int;
        int var7;
        int var8;
        int[] var9;
        int[] var13;
        int[] var16;
        byte[] var20;
        int[] var21;
        byte[] var22;
        L0: {
          var8 = StarCannon.field_A;
          if (param0 == 255) {
            break L0;
          } else {
            field_b = (String) null;
            break L0;
          }
        }
        var1 = new hl[bj.field_b];
        var2 = 0;
        L1: while (true) {
          if (bj.field_b <= var2) {
            rc.b((byte) -104);
            return var1;
          } else {
            var3 = gg.field_d[var2] * gh.field_C[var2];
            var20 = og.field_c[var2];
            if (hc.field_a[var2]) {
              var22 = ac.field_d[var2];
              var16 = new int[var3];
              var13 = var16;
              var6 = var13;
              var7 = 0;
              L2: while (true) {
                if (var7 >= var3) {
                  var1[var2] = (hl) ((Object) new pj(td.field_m, gb.field_w, fc.field_d[var2], qd.field_H[var2], gg.field_d[var2], gh.field_C[var2], var16));
                  var2++;
                  continue L1;
                } else {
                  var6[var7] = cl.a(w.a(255, (int) var22[var7]) << 1482998904, of.field_g[w.a(255, (int) var20[var7])]);
                  var7++;
                  continue L2;
                }
              }
            } else {
              var9 = new int[var3];
              var21 = var9;
              var6_int = 0;
              L3: while (true) {
                if (var6_int >= var3) {
                  var1[var2] = new hl(td.field_m, gb.field_w, fc.field_d[var2], qd.field_H[var2], gg.field_d[var2], gh.field_C[var2], var21);
                  var2++;
                  continue L1;
                } else {
                  var9[var6_int] = of.field_g[w.a((int) var20[var6_int], 255)];
                  var6_int++;
                  continue L3;
                }
              }
            }
          }
        }
    }

    static {
        field_b = "Login: ";
    }
}
