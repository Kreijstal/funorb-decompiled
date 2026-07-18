/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class df extends a {
    private String field_j;
    private boolean field_k;

    final static void a(int param0, boolean param1) {
        we.field_h = 0;
        ua.field_L = 0;
        wd.field_a = 0;
        ti.field_e = uc.field_e;
        qh.field_b = new sf(2);
        qh.field_b.a(true, -1, ad.a(ad.field_m, gb.field_j, 0), 121);
    }

    final String a(String param0, boolean param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        wg var4 = null;
        Object var5 = null;
        CharSequence var6 = null;
        String stackIn_5_0 = null;
        Object stackIn_11_0 = null;
        String stackIn_15_0 = null;
        String stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_4_0 = null;
        Object stackOut_10_0 = null;
        String stackOut_16_0 = null;
        String stackOut_14_0 = null;
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
            L1: {
              if (!param1) {
                break L1;
              } else {
                var5 = null;
                String discarded$2 = ((df) this).a((String) null, true);
                break L1;
              }
            }
            var6 = (CharSequence) (Object) param0;
            var3 = sj.a(var6, 0);
            if (var3 != null) {
              stackOut_4_0 = (String) var3;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              L2: {
                if (param0.equals((Object) (Object) ((df) this).field_j)) {
                  break L2;
                } else {
                  var4 = gb.a(param0, (byte) 122);
                  if (var4 != null) {
                    if (null == var4.field_d) {
                      ((df) this).field_k = var4.field_c;
                      ((df) this).field_j = param0;
                      break L2;
                    } else {
                      stackOut_10_0 = null;
                      stackIn_11_0 = stackOut_10_0;
                      return (String) (Object) stackIn_11_0;
                    }
                  } else {
                    return null;
                  }
                }
              }
              if (((df) this).field_k) {
                stackOut_16_0 = hj.field_o;
                stackIn_17_0 = stackOut_16_0;
                break L0;
              } else {
                stackOut_14_0 = pc.field_d;
                stackIn_15_0 = stackOut_14_0;
                return stackIn_15_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var3_ref;
            stackOut_18_1 = new StringBuilder().append("df.K(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
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
          throw fc.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param1 + ')');
        }
        return stackIn_17_0;
    }

    final void a(boolean param0) {
        ((df) this).field_j = null;
        if (!param0) {
            Object var3 = null;
            String discarded$0 = ((df) this).a((String) null, true);
        }
    }

    final static void h(int param0) {
        kd.field_c = -1;
        s.field_ib = null;
        bf.field_a = -1;
        kk.field_d = 0;
        ab.field_u = false;
    }

    final qf a(String param0, byte param1) {
        wg var3 = null;
        RuntimeException var3_ref = null;
        Object var4 = null;
        CharSequence var5 = null;
        qf stackIn_2_0 = null;
        qf stackIn_8_0 = null;
        qf stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        qf stackOut_7_0 = null;
        qf stackOut_14_0 = null;
        qf stackOut_13_0 = null;
        qf stackOut_1_0 = null;
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
            var5 = (CharSequence) (Object) param0;
            if (rc.a(111, var5)) {
              L1: {
                if (param0.equals((Object) (Object) ((df) this).field_j)) {
                  break L1;
                } else {
                  L2: {
                    var3 = gb.a(param0, (byte) 100);
                    if (var3 == null) {
                      break L2;
                    } else {
                      if (var3.field_d != null) {
                        break L2;
                      } else {
                        ((df) this).field_j = param0;
                        ((df) this).field_k = var3.field_c;
                        break L1;
                      }
                    }
                  }
                  stackOut_7_0 = db.field_u;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                }
              }
              L3: {
                if (param1 <= -109) {
                  break L3;
                } else {
                  var4 = null;
                  String discarded$2 = ((df) this).a((String) null, true);
                  break L3;
                }
              }
              L4: {
                if (!((df) this).field_k) {
                  stackOut_14_0 = rg.field_f;
                  stackIn_15_0 = stackOut_14_0;
                  break L4;
                } else {
                  stackOut_13_0 = ph.field_g;
                  stackIn_15_0 = stackOut_13_0;
                  break L4;
                }
              }
              break L0;
            } else {
              stackOut_1_0 = rg.field_f;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3_ref;
            stackOut_16_1 = new StringBuilder().append("df.J(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
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
          throw fc.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param1 + ')');
        }
        return stackIn_15_0;
    }

    df(vg param0) {
        super(param0);
        ((df) this).field_k = false;
    }

    static {
    }
}
