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
        try {
            ((tt) this).field_g = null;
            if (param0 >= -106) {
                ((tt) this).field_i = false;
            }
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "tt.A(" + param0 + ')');
        }
    }

    public static void e(byte param0) {
        try {
            field_h = null;
            if (param0 != 84) {
                String discarded$0 = tt.e(110);
            }
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "tt.B(" + param0 + ')');
        }
    }

    final static String e(int param0) {
        RuntimeException var1 = null;
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        Object stackIn_12_0 = null;
        String stackIn_17_0 = null;
        String stackIn_19_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_8_0 = null;
        String stackOut_16_0 = null;
        String stackOut_18_0 = null;
        Object stackOut_11_0 = null;
        try {
          L0: {
            if (ola.field_p == kq.field_j) {
              stackOut_3_0 = sc.field_n;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (!ut.field_m.a(false)) {
                stackOut_8_0 = ut.field_m.b(25477);
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0;
              } else {
                if (param0 == 21240) {
                  if (kq.field_j == dka.field_G) {
                    stackOut_16_0 = ut.field_m.b(25477);
                    stackIn_17_0 = stackOut_16_0;
                    return stackIn_17_0;
                  } else {
                    stackOut_18_0 = dk.field_p;
                    stackIn_19_0 = stackOut_18_0;
                    break L0;
                  }
                } else {
                  stackOut_11_0 = null;
                  stackIn_12_0 = stackOut_11_0;
                  return (String) (Object) stackIn_12_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var1, "tt.E(" + param0 + ')');
        }
        return stackIn_19_0;
    }

    final jg a(String param0, boolean param1) {
        RuntimeException var3 = null;
        eq var3_ref = null;
        jg stackIn_4_0 = null;
        jg stackIn_15_0 = null;
        jg stackIn_24_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        jg stackOut_3_0 = null;
        jg stackOut_14_0 = null;
        jg stackOut_23_0 = null;
        jg stackOut_21_0 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        try {
          L0: {
            if (!vq.a((byte) -60, (CharSequence) (Object) param0)) {
              stackOut_3_0 = jt.field_f;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              L1: {
                if (!param0.equals((Object) (Object) ((tt) this).field_g)) {
                  L2: {
                    var3_ref = du.a(param0, (byte) -43);
                    if (null == var3_ref) {
                      break L2;
                    } else {
                      if (var3_ref.field_g != null) {
                        break L2;
                      } else {
                        ((tt) this).field_g = param0;
                        ((tt) this).field_i = var3_ref.field_e;
                        break L1;
                      }
                    }
                  }
                  stackOut_14_0 = ji.field_f;
                  stackIn_15_0 = stackOut_14_0;
                  return stackIn_15_0;
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
                  stackOut_23_0 = jt.field_f;
                  stackIn_24_0 = stackOut_23_0;
                  break L4;
                } else {
                  stackOut_21_0 = cm.field_u;
                  stackIn_24_0 = stackOut_21_0;
                  break L4;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var3;
            stackOut_25_1 = new StringBuilder().append("tt.C(");
            stackIn_28_0 = stackOut_25_0;
            stackIn_28_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L5;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_29_0 = stackOut_26_0;
              stackIn_29_1 = stackOut_26_1;
              stackIn_29_2 = stackOut_26_2;
              break L5;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ',' + param1 + ')');
        }
        return stackIn_24_0;
    }

    final String a(byte param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        eq var4_ref_eq = null;
        int var4 = 0;
        String stackIn_2_0 = null;
        Object stackIn_11_0 = null;
        String stackIn_15_0 = null;
        String stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_10_0 = null;
        String stackOut_16_0 = null;
        String stackOut_14_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            var3 = hp.a((CharSequence) (Object) param1, 0);
            if (var3 == null) {
              L1: {
                if (param1.equals((Object) (Object) ((tt) this).field_g)) {
                  break L1;
                } else {
                  L2: {
                    var4_ref_eq = du.a(param1, (byte) -43);
                    if (var4_ref_eq == null) {
                      break L2;
                    } else {
                      if (null != var4_ref_eq.field_g) {
                        break L2;
                      } else {
                        ((tt) this).field_i = var4_ref_eq.field_e;
                        ((tt) this).field_g = param1;
                        break L1;
                      }
                    }
                  }
                  stackOut_10_0 = null;
                  stackIn_11_0 = stackOut_10_0;
                  return (String) (Object) stackIn_11_0;
                }
              }
              if (((tt) this).field_i) {
                var4 = -59 % ((-8 - param0) / 45);
                stackOut_16_0 = su.field_a;
                stackIn_17_0 = stackOut_16_0;
                break L0;
              } else {
                stackOut_14_0 = uga.field_A;
                stackIn_15_0 = stackOut_14_0;
                return stackIn_15_0;
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
            stackOut_18_1 = new StringBuilder().append("tt.D(").append(param0).append(',');
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L3;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ')');
        }
        return stackIn_17_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Reload game";
    }
}
