/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ol extends tj {
    static bi field_l;
    private boolean field_o;
    static String field_n;
    private String field_m;
    static String field_p;

    ol(rl param0) {
        super(param0);
        ((ol) this).field_o = false;
    }

    final sc a(int param0, String param1) {
        mb var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        sc stackIn_2_0 = null;
        sc stackIn_8_0 = null;
        sc stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        sc stackOut_7_0 = null;
        sc stackOut_14_0 = null;
        sc stackOut_13_0 = null;
        sc stackOut_1_0 = null;
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
            int discarded$5 = 3;
            if (bd.a(var4)) {
              L1: {
                if (param1.equals((Object) (Object) ((ol) this).field_m)) {
                  break L1;
                } else {
                  L2: {
                    var3 = ta.a(250, param1);
                    if (var3 == null) {
                      break L2;
                    } else {
                      if (null != var3.field_e) {
                        break L2;
                      } else {
                        ((ol) this).field_m = param1;
                        ((ol) this).field_o = var3.field_c;
                        break L1;
                      }
                    }
                  }
                  stackOut_7_0 = be.field_q;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                }
              }
              L3: {
                if (param0 == 0) {
                  break L3;
                } else {
                  ((ol) this).field_o = false;
                  break L3;
                }
              }
              L4: {
                if (((ol) this).field_o) {
                  stackOut_14_0 = rh.field_p;
                  stackIn_15_0 = stackOut_14_0;
                  break L4;
                } else {
                  stackOut_13_0 = ni.field_b;
                  stackIn_15_0 = stackOut_13_0;
                  break L4;
                }
              }
              break L0;
            } else {
              stackOut_1_0 = ni.field_b;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3_ref;
            stackOut_16_1 = new StringBuilder().append("ol.H(").append(param0).append(',');
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
          throw ld.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
        return stackIn_15_0;
    }

    final String a(byte param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        mb var4 = null;
        Object var5 = null;
        CharSequence var6 = null;
        String stackIn_3_0 = null;
        Object stackIn_10_0 = null;
        String stackIn_15_0 = null;
        String stackIn_19_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        Object stackOut_9_0 = null;
        String stackOut_14_0 = null;
        String stackOut_18_0 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            var6 = (CharSequence) (Object) param1;
            var3 = ea.a(var6, param0 ^ 125);
            if (var3 != null) {
              stackOut_2_0 = (String) var3;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                if (!param1.equals((Object) (Object) ((ol) this).field_m)) {
                  var4 = ta.a(250, param1);
                  if (var4 != null) {
                    if (var4.field_e == null) {
                      ((ol) this).field_m = param1;
                      ((ol) this).field_o = var4.field_c;
                      break L1;
                    } else {
                      stackOut_9_0 = null;
                      stackIn_10_0 = stackOut_9_0;
                      return (String) (Object) stackIn_10_0;
                    }
                  } else {
                    return null;
                  }
                } else {
                  break L1;
                }
              }
              if (!((ol) this).field_o) {
                stackOut_14_0 = nh.field_b;
                stackIn_15_0 = stackOut_14_0;
                return stackIn_15_0;
              } else {
                L2: {
                  if (param0 == -126) {
                    break L2;
                  } else {
                    var5 = null;
                    sc discarded$2 = ((ol) this).a(9, (String) null);
                    break L2;
                  }
                }
                stackOut_18_0 = mh.field_D;
                stackIn_19_0 = stackOut_18_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var3_ref;
            stackOut_20_1 = new StringBuilder().append("ol.F(").append(param0).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L3;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L3;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ')');
        }
        return stackIn_19_0;
    }

    final void e(int param0) {
        ((ol) this).field_m = null;
        if (param0 <= 79) {
            int discarded$0 = 0;
            ol.c();
        }
    }

    public static void c() {
        field_l = null;
        field_p = null;
        field_n = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new bi();
        field_p = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
