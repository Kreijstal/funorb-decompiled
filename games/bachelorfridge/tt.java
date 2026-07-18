/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class tt extends aba {
    private String field_g;
    static String field_h;
    private boolean field_i;

    tt(lka param0) {
        super(param0);
        ((tt) this).field_i = false;
    }

    final void d(int param0) {
        ((tt) this).field_g = null;
        if (param0 >= -106) {
            ((tt) this).field_i = false;
        }
    }

    public static void e() {
        field_h = null;
    }

    final static String e(int param0) {
        if (!(ola.field_p != kq.field_j)) {
            return sc.field_n;
        }
        if (!(ut.field_m.a(false))) {
            return ut.field_m.b(25477);
        }
        if (!(kq.field_j != dka.field_G)) {
            return ut.field_m.b(25477);
        }
        return dk.field_p;
    }

    final jg a(String param0, boolean param1) {
        eq var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        jg stackIn_3_0 = null;
        jg stackIn_10_0 = null;
        jg stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        jg stackOut_2_0 = null;
        jg stackOut_9_0 = null;
        jg stackOut_16_0 = null;
        jg stackOut_15_0 = null;
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
            var4 = (CharSequence) (Object) param0;
            if (!vq.a((byte) -60, var4)) {
              stackOut_2_0 = jt.field_f;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                if (!param0.equals((Object) (Object) ((tt) this).field_g)) {
                  L2: {
                    var3 = du.a(param0, (byte) -43);
                    if (var3 == null) {
                      break L2;
                    } else {
                      if (var3.field_g != null) {
                        break L2;
                      } else {
                        ((tt) this).field_g = param0;
                        ((tt) this).field_i = var3.field_e;
                        break L1;
                      }
                    }
                  }
                  stackOut_9_0 = ji.field_f;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                } else {
                  break L1;
                }
              }
              L3: {
                if (!param1) {
                  break L3;
                } else {
                  field_h = null;
                  break L3;
                }
              }
              L4: {
                if (!((tt) this).field_i) {
                  stackOut_16_0 = jt.field_f;
                  stackIn_17_0 = stackOut_16_0;
                  break L4;
                } else {
                  stackOut_15_0 = cm.field_u;
                  stackIn_17_0 = stackOut_15_0;
                  break L4;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var3_ref;
            stackOut_18_1 = new StringBuilder().append("tt.C(");
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
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param1 + ')');
        }
        return stackIn_17_0;
    }

    final String a(byte param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        eq var4_ref_eq = null;
        int var4 = 0;
        CharSequence var5 = null;
        String stackIn_2_0 = null;
        String stackIn_12_0 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_13_0 = null;
        String stackOut_11_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            var5 = (CharSequence) (Object) param1;
            int discarded$2 = 0;
            var3 = hp.a(var5);
            if (var3 == null) {
              L1: {
                if (param1.equals((Object) (Object) ((tt) this).field_g)) {
                  break L1;
                } else {
                  var4_ref_eq = du.a(param1, (byte) -43);
                  if (var4_ref_eq != null) {
                    if (null == var4_ref_eq.field_g) {
                      ((tt) this).field_i = var4_ref_eq.field_e;
                      ((tt) this).field_g = param1;
                      break L1;
                    } else {
                      return null;
                    }
                  } else {
                    return null;
                  }
                }
              }
              if (((tt) this).field_i) {
                var4 = -59 % ((-8 - param0) / 45);
                stackOut_13_0 = su.field_a;
                stackIn_14_0 = stackOut_13_0;
                break L0;
              } else {
                stackOut_11_0 = uga.field_A;
                stackIn_12_0 = stackOut_11_0;
                return stackIn_12_0;
              }
            } else {
              stackOut_1_0 = (String) var3;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3_ref;
            stackOut_15_1 = new StringBuilder().append("tt.D(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L2;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
        }
        return stackIn_14_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Reload game";
    }
}
