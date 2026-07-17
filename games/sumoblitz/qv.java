/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class qv extends ms {
    static String field_l;
    static String field_o;
    int[] field_m;
    int field_n;
    static da field_k;

    final static void a() {
        ts.field_a = ts.field_a + 13;
        fb.field_a = fb.field_a - 9;
        kn.field_b = kn.field_b - 4;
        ha.field_f = ha.field_f + 18;
    }

    final static void a(int param0, int param1) {
        mf var2 = fh.field_n[param0];
        var2.c(-1);
        dj discarded$0 = qq.a(18416, var2);
    }

    final static String a(boolean param0, int param1, CharSequence param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        String stackIn_14_0 = null;
        String stackIn_19_0 = null;
        String stackIn_27_0 = null;
        String stackIn_32_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_31_0 = null;
        String stackOut_26_0 = null;
        String stackOut_18_0 = null;
        String stackOut_13_0 = null;
        String stackOut_8_0 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (param2 == null) {
              stackOut_3_0 = qq.field_Q;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              L1: {
                var3_int = param2.length();
                if (var3_int < 1) {
                  break L1;
                } else {
                  if (12 >= var3_int) {
                    L2: {
                      var4 = uk.a(-1, param2);
                      if (var4 == null) {
                        break L2;
                      } else {
                        if (var4.length() >= 1) {
                          L3: {
                            if (wv.a((byte) -88, var4.charAt(0))) {
                              break L3;
                            } else {
                              if (!wv.a((byte) -86, var4.charAt(-1 + var4.length()))) {
                                var5 = 0;
                                var6 = 0;
                                L4: while (true) {
                                  if (var6 >= param2.length()) {
                                    if (var5 > 0) {
                                      stackOut_31_0 = m.field_T;
                                      stackIn_32_0 = stackOut_31_0;
                                      break L0;
                                    } else {
                                      var6 = 54;
                                      return null;
                                    }
                                  } else {
                                    L5: {
                                      var7 = param2.charAt(var6);
                                      if (!wv.a((byte) -99, (char) var7)) {
                                        var5 = 0;
                                        break L5;
                                      } else {
                                        var5++;
                                        break L5;
                                      }
                                    }
                                    if (var5 < 2) {
                                      var6++;
                                      continue L4;
                                    } else {
                                      stackOut_26_0 = ma.field_a;
                                      stackIn_27_0 = stackOut_26_0;
                                      return stackIn_27_0;
                                    }
                                  }
                                }
                              } else {
                                break L3;
                              }
                            }
                          }
                          stackOut_18_0 = m.field_T;
                          stackIn_19_0 = stackOut_18_0;
                          return stackIn_19_0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    stackOut_13_0 = qq.field_Q;
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0;
                  } else {
                    break L1;
                  }
                }
              }
              stackOut_8_0 = qq.field_Q;
              stackIn_9_0 = stackOut_8_0;
              return stackIn_9_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) var3;
            stackOut_33_1 = new StringBuilder().append("qv.A(").append(0).append(44).append(97).append(44);
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param2 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L6;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L6;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + 41);
        }
        return stackIn_32_0;
    }

    public static void c() {
        field_l = null;
        field_k = null;
        field_o = null;
    }

    private qv() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
