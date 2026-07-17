/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class qi extends cb {
    private boolean field_k;
    static int field_j;
    private String field_i;

    final static boolean f() {
        int stackIn_7_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          L1: {
            if (kj.a(false)) {
              break L1;
            } else {
              if (si.field_a) {
                break L1;
              } else {
                stackOut_4_0 = 1;
                stackIn_7_0 = stackOut_4_0;
                break L0;
              }
            }
          }
          stackOut_6_0 = 0;
          stackIn_7_0 = stackOut_6_0;
          break L0;
        }
        return stackIn_7_0 != 0;
    }

    final static boolean a(String param0, int param1, ik param2, boolean param3, int param4, String param5, String param6) {
        RuntimeException var7 = null;
        uk var8 = null;
        int stackIn_4_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        try {
          L0: {
            if (mc.field_t != ic.field_l) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              var8 = new uk(mb.field_b, param2);
              mb.field_b.b(1, (fe) (Object) var8);
              int discarded$1 = 1;
              if (!cm.a()) {
                L1: {
                  qf.field_r = param5;
                  km.field_b = param6;
                  wm.field_d = param0;
                  ic.field_l = ci.field_e;
                  if (!param3) {
                    stackOut_13_0 = 0;
                    stackIn_14_0 = stackOut_13_0;
                    break L1;
                  } else {
                    stackOut_12_0 = 1;
                    stackIn_14_0 = stackOut_12_0;
                    break L1;
                  }
                }
                g.field_o = stackIn_14_0 != 0;
                vk.field_g = null;
                me.field_j = param1;
                return true;
              } else {
                var8.t(23101);
                stackOut_15_0 = 1;
                stackIn_16_0 = stackOut_15_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var7;
            stackOut_17_1 = new StringBuilder().append("qi.A(");
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L2;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L2;
            }
          }
          L3: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(44).append(param1).append(44);
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param2 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L3;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L3;
            }
          }
          L4: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(44).append(param3).append(44).append(-83).append(44);
            stackIn_28_0 = stackOut_25_0;
            stackIn_28_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param5 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L4;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_29_0 = stackOut_26_0;
              stackIn_29_1 = stackOut_26_1;
              stackIn_29_2 = stackOut_26_2;
              break L4;
            }
          }
          L5: {
            stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(44);
            stackIn_32_0 = stackOut_29_0;
            stackIn_32_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param6 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L5;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_33_0 = stackOut_30_0;
              stackIn_33_1 = stackOut_30_1;
              stackIn_33_2 = stackOut_30_2;
              break L5;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + 41);
        }
        return stackIn_16_0 != 0;
    }

    qi(ui param0) {
        super(param0);
        ((qi) this).field_k = false;
    }

    final ag a(String param0, int param1) {
        RuntimeException var3 = null;
        ed var3_ref = null;
        CharSequence var4 = null;
        ag stackIn_2_0 = null;
        ag stackIn_11_0 = null;
        Object stackIn_15_0 = null;
        ag stackIn_20_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        ag stackOut_10_0 = null;
        ag stackOut_19_0 = null;
        ag stackOut_17_0 = null;
        Object stackOut_14_0 = null;
        ag stackOut_1_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            var4 = (CharSequence) (Object) param0;
            if (ra.a((byte) -38, var4)) {
              L1: {
                if (!param0.equals((Object) (Object) ((qi) this).field_i)) {
                  L2: {
                    var3_ref = rf.a((byte) -75, param0);
                    if (var3_ref == null) {
                      break L2;
                    } else {
                      if (var3_ref.field_h != null) {
                        break L2;
                      } else {
                        ((qi) this).field_i = param0;
                        ((qi) this).field_k = var3_ref.field_c;
                        break L1;
                      }
                    }
                  }
                  stackOut_10_0 = bm.field_o;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                } else {
                  break L1;
                }
              }
              if (param1 == 5) {
                L3: {
                  if (((qi) this).field_k) {
                    stackOut_19_0 = sc.field_a;
                    stackIn_20_0 = stackOut_19_0;
                    break L3;
                  } else {
                    stackOut_17_0 = fg.field_d;
                    stackIn_20_0 = stackOut_17_0;
                    break L3;
                  }
                }
                break L0;
              } else {
                stackOut_14_0 = null;
                stackIn_15_0 = stackOut_14_0;
                return (ag) (Object) stackIn_15_0;
              }
            } else {
              stackOut_1_0 = fg.field_d;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var3;
            stackOut_21_1 = new StringBuilder().append("qi.D(");
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L4;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L4;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param1 + 41);
        }
        return stackIn_20_0;
    }

    final void b(byte param0) {
        if (param0 >= -30) {
            ((qi) this).field_k = false;
        }
        ((qi) this).field_i = null;
    }

    final String a(byte param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        ed var5 = null;
        CharSequence var6 = null;
        String stackIn_2_0 = null;
        Object stackIn_8_0 = null;
        String stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_7_0 = null;
        String stackOut_12_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            var6 = (CharSequence) (Object) param1;
            var3 = qa.a((byte) 31, var6);
            var4 = 98 / ((49 - param0) / 56);
            if (var3 == null) {
              L1: {
                if (param1.equals((Object) (Object) ((qi) this).field_i)) {
                  break L1;
                } else {
                  var5 = rf.a((byte) -75, param1);
                  if (null != var5) {
                    if (var5.field_h == null) {
                      ((qi) this).field_k = var5.field_c;
                      ((qi) this).field_i = param1;
                      break L1;
                    } else {
                      stackOut_7_0 = null;
                      stackIn_8_0 = stackOut_7_0;
                      return (String) (Object) stackIn_8_0;
                    }
                  } else {
                    return null;
                  }
                }
              }
              if (!((qi) this).field_k) {
                stackOut_12_0 = hm.field_L;
                stackIn_13_0 = stackOut_12_0;
                break L0;
              } else {
                return lg.field_a;
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
            stackOut_14_0 = (RuntimeException) var3_ref;
            stackOut_14_1 = new StringBuilder().append("qi.C(").append(param0).append(44);
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L2;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
        return stackIn_13_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = 0;
    }
}
