/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class uj extends mk {
    private boolean field_k;
    static je field_n;
    private String field_m;
    static int[] field_o;
    static je field_l;
    static int field_j;

    final gu a(int param0, String param1) {
        wd var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        gu stackIn_2_0 = null;
        gu stackIn_10_0 = null;
        gu stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        gu stackOut_9_0 = null;
        gu stackOut_14_0 = null;
        gu stackOut_13_0 = null;
        gu stackOut_1_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            var4 = (CharSequence) (Object) param1;
            int discarded$5 = 1;
            if (vq.a(var4)) {
              L1: {
                if (param0 == -3137) {
                  break L1;
                } else {
                  field_o = null;
                  break L1;
                }
              }
              L2: {
                if (param1.equals((Object) (Object) ((uj) this).field_m)) {
                  break L2;
                } else {
                  L3: {
                    var3 = ji.a(0, param1);
                    if (var3 == null) {
                      break L3;
                    } else {
                      if (null == var3.field_i) {
                        ((uj) this).field_m = param1;
                        ((uj) this).field_k = var3.field_a;
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  stackOut_9_0 = so.field_e;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                }
              }
              L4: {
                if (((uj) this).field_k) {
                  stackOut_14_0 = oo.field_g;
                  stackIn_15_0 = stackOut_14_0;
                  break L4;
                } else {
                  stackOut_13_0 = rn.field_e;
                  stackIn_15_0 = stackOut_13_0;
                  break L4;
                }
              }
              break L0;
            } else {
              stackOut_1_0 = rn.field_e;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3_ref;
            stackOut_16_1 = new StringBuilder().append("uj.R(").append(param0).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
        return stackIn_15_0;
    }

    final String a(byte param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        wd var4 = null;
        CharSequence var5 = null;
        String stackIn_2_0 = null;
        String stackIn_13_0 = null;
        String stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_16_0 = null;
        String stackOut_12_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            var5 = (CharSequence) (Object) param1;
            var3 = hw.a(var5, false);
            if (var3 == null) {
              L1: {
                if (!param1.equals((Object) (Object) ((uj) this).field_m)) {
                  var4 = ji.a(0, param1);
                  if (var4 != null) {
                    if (var4.field_i == null) {
                      ((uj) this).field_k = var4.field_a;
                      ((uj) this).field_m = param1;
                      break L1;
                    } else {
                      return null;
                    }
                  } else {
                    return null;
                  }
                } else {
                  break L1;
                }
              }
              if (((uj) this).field_k) {
                L2: {
                  if (param0 >= 89) {
                    break L2;
                  } else {
                    ((uj) this).g(5);
                    break L2;
                  }
                }
                stackOut_16_0 = fa.field_d;
                stackIn_17_0 = stackOut_16_0;
                break L0;
              } else {
                stackOut_12_0 = oc.field_Ob;
                stackIn_13_0 = stackOut_12_0;
                return stackIn_13_0;
              }
            } else {
              stackOut_1_0 = (String) var3;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var3_ref;
            stackOut_18_1 = new StringBuilder().append("uj.O(").append(param0).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L3;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L3;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 41);
        }
        return stackIn_17_0;
    }

    public static void h() {
        field_n = null;
        field_o = null;
        field_l = null;
    }

    final void g(int param0) {
        if (param0 != 50) {
            ((uj) this).field_k = false;
            ((uj) this).field_m = null;
            return;
        }
        ((uj) this).field_m = null;
    }

    final static me[] c() {
        return new me[]{jk.field_b, na.field_G, oa.field_F, vh.field_l, tl.field_i, nn.field_c, ab.field_d, lg.field_e, du.field_e, kb.field_y, lo.field_q, nf.field_Ib, rs.field_v, kq.field_M};
    }

    uj(fn param0) {
        super(param0);
        ((uj) this).field_k = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = 3;
        field_o = new int[]{53, 52, 49, 50, 51};
    }
}
