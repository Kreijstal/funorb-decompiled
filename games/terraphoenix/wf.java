/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wf extends uf {
    static int field_q;
    mf[] field_j;
    int field_p;
    int field_i;
    static int field_l;
    static boolean field_h;
    static int field_n;
    mf[] field_s;
    int[] field_r;
    int[] field_k;
    int[] field_m;
    byte[][][] field_o;
    static int field_t;

    final static int a(String param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Terraphoenix.field_V;
        try {
          L0: {
            if (param1) {
              var2_int = 0;
              L1: while (true) {
                if (ph.field_n.length <= var2_int) {
                  stackIn_12_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (param0.equals(ph.field_n[var2_int])) {
                    stackIn_9_0 = var2_int;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var2_int++;
                    continue L1;
                  }
                }
              }
            } else {
              stackIn_3_0 = -51;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var2);

            stackIn_15_1 = new StringBuilder().append("wf.B(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            return stackIn_12_0;
          }
        }
    }

    final static void c(int param0) {
        dg.field_d = false;
        ia.field_r = null;
        kj.field_c = null;
        if (param0 != 25501) {
            return;
        }
        ec.field_d = null;
        km.field_c = null;
    }

    final static boolean a(int param0) {
        int stackIn_6_0 = 0;
        L0: {
          if (param0 == 31996) {
            break L0;
          } else {
            wf.a(-109);
            break L0;
          }
        }
        L1: {
          L2: {
            if (-11 < (q.field_Jb ^ -1)) {
              break L2;
            } else {
              if (uh.field_H < 13) {
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    wf() {
    }

    final static oa a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        oa stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Terraphoenix.field_V;
        try {
          L0: {
            var2_int = param1.length();
            var3 = param0;
            L1: while (true) {
              if (var3 >= var2_int) {
                stackIn_10_0 = ge.field_a;
                break L0;
              } else {
                var4 = param1.charAt(var3);
                if (48 <= var4) {
                  if (var4 <= 57) {
                    var3++;
                    continue L1;
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var2);

            stackIn_13_1 = new StringBuilder().append("wf.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        return stackIn_10_0;
    }

    static {
        field_n = -1;
        field_t = -1;
    }
}
