/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wj extends tc {
    int[][] field_m;
    static hd field_n;
    int field_p;
    static volatile boolean field_l;
    boolean field_o;
    int field_k;
    int field_r;
    String[][] field_s;
    static int field_q;

    public static void a(boolean param0) {
        if (!param0) {
            wk[] var2 = (wk[]) null;
            wj.a(96, (wk[]) null);
            field_n = null;
            return;
        }
        field_n = null;
    }

    wj() {
    }

    final static wk[] a(int param0, wk[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        wk var3 = null;
        int var4 = 0;
        wk[] stackIn_3_0 = null;
        wk[] stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param0 == -12310) {
              var2_int = 0;
              L1: while (true) {
                if (param1.length <= var2_int) {
                  stackIn_8_0 = (wk[]) (param1);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var3 = param1[var2_int];
                  param1[var2_int].field_z = 0;
                  var3.field_w = 0;
                  param1[var2_int].field_A = param1[var2_int].field_y;
                  param1[var2_int].field_x = param1[var2_int].field_v;
                  var2_int++;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = (wk[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var2);

            stackIn_11_1 = new StringBuilder().append("wj.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_8_0;
        }
    }

    final static void a(int param0) {
        try {
            Exception var1 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            L0: {
              if (null == le.field_d) {
                break L0;
              } else {
                try {
                  L1: {
                    le.field_d.a(-1, 0L);
                    le.field_d.a(24, mg.field_e.field_q, (byte) 46, mg.field_e.field_o);
                    decompiledRegionSelector0 = 0;
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var1 = (Exception) (Object) decompiledCaughtException;
                    decompiledRegionSelector0 = 1;
                    break L2;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  L3: {
                    if (param0 == 0) {
                      break L3;
                    } else {
                      field_n = (hd) null;
                      break L3;
                    }
                  }
                  mg.field_e.field_q = mg.field_e.field_q + 24;
                  return;
                } else {
                  break L0;
                }
              }
            }
            if (param0 != 0) {
              field_n = (hd) null;
              mg.field_e.field_q = mg.field_e.field_q + 24;
              return;
            } else {
              mg.field_e.field_q = mg.field_e.field_q + 24;
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_l = true;
        field_q = 0;
    }
}
