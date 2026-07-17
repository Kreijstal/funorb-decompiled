/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class fj extends pm {
    private tb field_f;
    static vo field_i;
    static char[] field_h;
    static am field_g;

    final static vn a(vn param0, int param1, int param2, boolean param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        vn stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        vn stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            ki.a((byte) -116, md.field_vb);
            if (param2 == 339) {
              bi.d();
              param0.b(3, 3);
              ho.a(md.field_vb, false, param1, -109);
              pa.a(-21189);
              stackOut_3_0 = md.field_vb;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (vn) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("fj.M(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 44 + param2 + 44 + 0 + 41);
        }
        return stackIn_4_0;
    }

    final static boolean a(int param0, int param1) {
        int var2 = 0;
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        var2 = -102 / ((29 - param1) / 54);
        if (-1 == param0) {
          return true;
        } else {
          L0: {
            if ((hf.field_I & 1 << param0) == 0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    fj(tb param0, tb param1) {
        super(param0);
        try {
            ((fj) this).field_f = param1;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "fj.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public static void e(byte param0) {
        field_h = null;
        field_i = null;
        field_g = null;
    }

    final String a(String param0, byte param1) {
        vc var3 = null;
        RuntimeException var3_ref = null;
        Object var4 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        String stackIn_10_0 = null;
        Object stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_4_0 = null;
        String stackOut_6_0 = null;
        Object stackOut_13_0 = null;
        String stackOut_9_0 = null;
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
            L1: {
              if (!(((fj) this).field_f instanceof mi)) {
                break L1;
              } else {
                var3 = ((mi) (Object) ((fj) this).field_f).a(0);
                if (var3 == null) {
                  break L1;
                } else {
                  L2: {
                    if (var3.a((byte) -75) != mc.field_g) {
                      break L2;
                    } else {
                      if (param0.equals((Object) (Object) ((fj) this).field_f.field_o)) {
                        break L2;
                      } else {
                        stackOut_4_0 = ne.field_a;
                        stackIn_5_0 = stackOut_4_0;
                        return stackIn_5_0;
                      }
                    }
                  }
                  stackOut_6_0 = var3.b((byte) -125);
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0;
                }
              }
            }
            if (param0.equals((Object) (Object) ((fj) this).field_f.field_o)) {
              if (param1 >= -94) {
                var4 = null;
                String discarded$2 = ((fj) this).a((String) null, (byte) -42);
                stackOut_13_0 = null;
                stackIn_14_0 = stackOut_13_0;
                break L0;
              } else {
                return null;
              }
            } else {
              stackOut_9_0 = ne.field_a;
              stackIn_10_0 = stackOut_9_0;
              return stackIn_10_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3_ref;
            stackOut_15_1 = new StringBuilder().append("fj.B(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param1 + 41);
        }
        return (String) (Object) stackIn_14_0;
    }

    final rh a(String param0, int param1) {
        vc var3 = null;
        RuntimeException var3_ref = null;
        rh stackIn_5_0 = null;
        rh stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        rh stackOut_4_0 = null;
        rh stackOut_10_0 = null;
        rh stackOut_9_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              if (((fj) this).field_f instanceof mi) {
                var3 = ((mi) (Object) ((fj) this).field_f).a(0);
                if (var3 == null) {
                  break L1;
                } else {
                  if (var3.a((byte) -105) == mc.field_g) {
                    break L1;
                  } else {
                    stackOut_4_0 = uc.field_b;
                    stackIn_5_0 = stackOut_4_0;
                    return stackIn_5_0;
                  }
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 == 2) {
                break L2;
              } else {
                ((fj) this).field_f = null;
                break L2;
              }
            }
            L3: {
              if (!param0.equals((Object) (Object) ((fj) this).field_f.field_o)) {
                stackOut_10_0 = uc.field_b;
                stackIn_11_0 = stackOut_10_0;
                break L3;
              } else {
                stackOut_9_0 = mc.field_g;
                stackIn_11_0 = stackOut_9_0;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3_ref;
            stackOut_12_1 = new StringBuilder().append("fj.I(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 41);
        }
        return stackIn_11_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new char[]{'€', ' ', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', ' ', 'Ž', ' ', ' ', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', ' ', 'ž', 'Ÿ'};
        field_i = new vo();
    }
}
