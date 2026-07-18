/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class sf {
    static ao field_d;
    static int field_g;
    static String field_c;
    static int field_e;
    static String field_f;
    static int field_b;
    static int field_a;

    public static void a(int param0) {
        field_c = null;
        field_d = null;
        field_f = null;
    }

    final static fc a(byte param0, byte[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        bm stackIn_6_0 = null;
        Object stackIn_9_0 = null;
        bm stackIn_11_0 = null;
        bm stackIn_13_0 = null;
        bm stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        bm stackOut_14_0 = null;
        bm stackOut_12_0 = null;
        bm stackOut_10_0 = null;
        Object stackOut_8_0 = null;
        bm stackOut_5_0 = null;
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
            var2_int = re.a(param1, 0, (byte) 77);
            if (var2_int == 3) {
              stackOut_14_0 = gd.a(param1, (byte) 46);
              stackIn_15_0 = stackOut_14_0;
              break L0;
            } else {
              if (4 == var2_int) {
                stackOut_12_0 = ij.a(param1, 7);
                stackIn_13_0 = stackOut_12_0;
                return (fc) (Object) stackIn_13_0;
              } else {
                if (5 != var2_int) {
                  if (var2_int == 6) {
                    stackOut_10_0 = no.a((byte) 104, param1);
                    stackIn_11_0 = stackOut_10_0;
                    return (fc) (Object) stackIn_11_0;
                  } else {
                    stackOut_8_0 = null;
                    stackIn_9_0 = stackOut_8_0;
                    return (fc) (Object) stackIn_9_0;
                  }
                } else {
                  stackOut_5_0 = bo.a(param1, 24);
                  stackIn_6_0 = stackOut_5_0;
                  return (fc) (Object) stackIn_6_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var2;
            stackOut_16_1 = new StringBuilder().append("sf.A(").append(-96).append(',');
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
              break L1;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L1;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
        return (fc) (Object) stackIn_15_0;
    }

    final static String a(int param0, int param1, String param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        ga var5 = null;
        CharSequence var6 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_9_0 = null;
        String stackIn_12_0 = null;
        String stackIn_15_0 = null;
        String stackIn_18_0 = null;
        Object stackIn_22_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        Object stackOut_21_0 = null;
        String stackOut_17_0 = null;
        String stackOut_14_0 = null;
        String stackOut_11_0 = null;
        String stackOut_8_0 = null;
        String stackOut_5_0 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          L0: {
            var6 = (CharSequence) (Object) param2;
            if (!em.a(var6, (byte) -38)) {
              stackOut_2_0 = u.field_f;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              if (!sf.a(1, param2)) {
                if (ge.field_zb == 2) {
                  if (!hp.a(param2, 1020)) {
                    if (fn.field_d < 100) {
                      if (!kj.a((byte) -94, param2)) {
                        L1: {
                          if (param0 < -75) {
                            break L1;
                          } else {
                            field_d = null;
                            break L1;
                          }
                        }
                        var5 = ma.field_a;
                        var5.b((byte) -35, param1);
                        var5.field_j = var5.field_j + 1;
                        var4 = var5.field_j;
                        var5.a(125, 2);
                        var5.a(param2, (byte) 105);
                        var5.e(100, -var4 + var5.field_j);
                        stackOut_21_0 = null;
                        stackIn_22_0 = stackOut_21_0;
                        break L0;
                      } else {
                        stackOut_17_0 = vl.a(lo.field_h, new String[1], 2);
                        stackIn_18_0 = stackOut_17_0;
                        return stackIn_18_0;
                      }
                    } else {
                      stackOut_14_0 = th.field_c;
                      stackIn_15_0 = stackOut_14_0;
                      return stackIn_15_0;
                    }
                  } else {
                    stackOut_11_0 = vl.a(lo.field_i, new String[1], 2);
                    stackIn_12_0 = stackOut_11_0;
                    return stackIn_12_0;
                  }
                } else {
                  stackOut_8_0 = bg.field_d;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                }
              } else {
                stackOut_5_0 = hf.field_b;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var3;
            stackOut_23_1 = new StringBuilder().append("sf.D(").append(param0).append(',').append(param1).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param2 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L2;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L2;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ')');
        }
        return (String) (Object) stackIn_22_0;
    }

    final static boolean a(int param0, String param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            var3 = (CharSequence) (Object) param1;
            stackOut_2_0 = kf.field_k.equals((Object) (Object) tg.a(var3, false));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("sf.B(").append(1).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Waiting for levels";
        field_g = 32;
        field_b = 17;
        field_e = 39;
        field_c = "<%0> cannot join; the game has started.";
        field_a = (640 - ((field_b - 1) * (-field_g + field_e) + field_g * field_b)) / 2;
        field_d = new ao(1, 2, 2, 0);
    }
}
