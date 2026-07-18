/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class im implements Iterable {
    int field_g;
    static int[] field_h;
    hl[] field_j;
    static volatile int field_e;
    static byte[] field_i;
    static hj field_b;
    static hj field_k;
    static String field_f;
    static int field_a;
    static long field_c;
    private hl field_d;

    final void a(byte param0, hl param1, long param2) {
        hl var5 = null;
        try {
            if (!(param1.field_a == null)) {
                param1.d(0);
            }
            var5 = ((im) this).field_j[(int)(param2 & (long)(-1 + ((im) this).field_g))];
            param1.field_a = var5.field_a;
            param1.field_h = var5;
            param1.field_a.field_h = param1;
            param1.field_f = param2;
            if (param0 != 27) {
                im.a(114);
            }
            param1.field_h.field_a = param1;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "im.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final hl a(long param0, int param1) {
        hl var4 = null;
        int var5_int = 0;
        hl var5 = null;
        int var6 = 0;
        var6 = HoldTheLine.field_D;
        var4 = ((im) this).field_j[(int)((long)(((im) this).field_g - 1) & param0)];
        ((im) this).field_d = var4.field_h;
        L0: while (true) {
          if (((im) this).field_d != var4) {
            if (~param0 != ~((im) this).field_d.field_f) {
              ((im) this).field_d = ((im) this).field_d.field_h;
              continue L0;
            } else {
              var5 = ((im) this).field_d;
              ((im) this).field_d = ((im) this).field_d.field_h;
              return var5;
            }
          } else {
            ((im) this).field_d = null;
            var5_int = 104 / ((param1 - 83) / 36);
            return null;
          }
        }
    }

    public static void a(int param0) {
        int var1 = -60 / ((param0 - 29) / 46);
        field_i = null;
        field_k = null;
        field_b = null;
        field_f = null;
        field_h = null;
    }

    final static boolean a(ee param0, ee param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        boolean stackIn_17_0 = false;
        boolean stackIn_20_0 = false;
        int stackIn_23_0 = 0;
        boolean stackIn_25_0 = false;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        boolean stackOut_16_0 = false;
        boolean stackOut_24_0 = false;
        int stackOut_22_0 = 0;
        boolean stackOut_19_0 = false;
        int stackOut_11_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        try {
          L0: {
            if (!param0.field_z) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (param1.field_z) {
                L1: {
                  if (-param1.field_q + param0.field_q > 1) {
                    break L1;
                  } else {
                    if (-1 > -param1.field_q + param0.field_q) {
                      break L1;
                    } else {
                      if ((param1.field_B + param0.field_B) * (param0.field_B + param1.field_B) >= (-param0.field_A.field_f + param1.field_A.field_f) * (param1.field_A.field_f + -param0.field_A.field_f) + (-param0.field_A.field_h + param1.field_A.field_h) * (-param0.field_A.field_h + param1.field_A.field_h)) {
                        L2: {
                          if (!param0.field_p) {
                            break L2;
                          } else {
                            if (!param1.field_p) {
                              break L2;
                            } else {
                              stackOut_16_0 = l.a(0, param0.field_i, param1.field_k, param0.field_k, param0.field_w, param1.field_i, param0.field_A, param1.field_w, param1.field_A);
                              stackIn_17_0 = stackOut_16_0;
                              return stackIn_17_0;
                            }
                          }
                        }
                        if (!param0.field_p) {
                          if (param1.field_p) {
                            stackOut_24_0 = ca.a(param0.field_A, param1.field_i, param1.field_A, param0.field_B, param1.field_w, param1.field_k, 109);
                            stackIn_25_0 = stackOut_24_0;
                            break L0;
                          } else {
                            stackOut_22_0 = 1;
                            stackIn_23_0 = stackOut_22_0;
                            return stackIn_23_0 != 0;
                          }
                        } else {
                          stackOut_19_0 = ca.a(param1.field_A, param0.field_i, param0.field_A, param1.field_B, param0.field_w, param0.field_k, 107);
                          stackIn_20_0 = stackOut_19_0;
                          return stackIn_20_0;
                        }
                      } else {
                        stackOut_11_0 = 0;
                        stackIn_12_0 = stackOut_11_0;
                        return stackIn_12_0 != 0;
                      }
                    }
                  }
                }
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0 != 0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var3;
            stackOut_26_1 = new StringBuilder().append("im.E(");
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param0 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L3;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L3;
            }
          }
          L4: {
            stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param1 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L4;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L4;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + ',' + 32758 + ')');
        }
        return stackIn_25_0;
    }

    final static void a(int param0, th param1) {
        int var2_int = 0;
        try {
            si.field_jb = param1.k(-70) << 5;
            var2_int = param1.f((byte) -28);
            ef.field_b = var2_int << 18 & 1835008;
            si.field_jb = si.field_jb + (var2_int >> 3);
            ef.field_b = ef.field_b + (param1.k(-125) << 2);
            var2_int = param1.f((byte) -48);
            ae.field_a = var2_int << 15 & 2064384;
            ef.field_b = ef.field_b + (var2_int >> 6);
            ae.field_a = ae.field_a + (param1.f((byte) -117) << 7);
            var2_int = param1.f((byte) -97);
            ae.field_a = ae.field_a + (var2_int >> 1);
            dk.field_l = (1 & var2_int) << 16;
            dk.field_l = dk.field_l + param1.k(82);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "im.D(" + 76 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private im() throws Throwable {
        throw new Error();
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new nc((im) this);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 0;
        field_c = 0L;
        field_f = "(green)";
    }
}
