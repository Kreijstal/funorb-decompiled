/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class lda {
    static String field_d;
    static String field_b;
    static int field_a;
    private kv[] field_c;

    final void a(int param0, int param1, int param2, int param3, int param4) {
        Object var7 = null;
        if (param1 <= 8) {
          var7 = null;
          String discarded$2 = lda.a(26, 32, (String) null);
          hp.a(param4, param2, (byte) 108, param0, ((lda) this).field_c, param3);
          return;
        } else {
          hp.a(param4, param2, (byte) 108, param0, ((lda) this).field_c, param3);
          return;
        }
    }

    final static rma a(String param0, int param1) {
        dm var3 = null;
        RuntimeException var3_ref = null;
        dm stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        dm stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3 = new dm();
            ((rma) (Object) var3).field_a = param0;
            ((rma) (Object) var3).field_b = param1;
            stackOut_0_0 = (dm) var3;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3_ref;
            stackOut_2_1 = new StringBuilder().append("lda.E(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + param1 + ',' + -113 + ')');
        }
        return (rma) (Object) stackIn_1_0;
    }

    final static int a(int param0, byte param1) {
        if (param1 >= -15) {
            return -52;
        }
        return param0 & 255;
    }

    final static String a(int param0, int param1, String param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        pf var5 = null;
        CharSequence var6 = null;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_8_0 = null;
        String stackIn_12_0 = null;
        String stackIn_16_0 = null;
        String stackIn_22_0 = null;
        String stackIn_25_0 = null;
        Object stackIn_27_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_11_0 = null;
        String stackOut_15_0 = null;
        String stackOut_21_0 = null;
        Object stackOut_26_0 = null;
        String stackOut_24_0 = null;
        String stackOut_7_0 = null;
        String stackOut_4_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        try {
          L0: {
            var6 = (CharSequence) (Object) param2;
            if (wc.a(0, var6)) {
              if (um.field_c == 2) {
                if (!wb.a((byte) 52, param2)) {
                  if (gl.a(3, param2)) {
                    stackOut_11_0 = lga.a(true, new String[1], rt.field_c);
                    stackIn_12_0 = stackOut_11_0;
                    return stackIn_12_0;
                  } else {
                    L1: {
                      if (maa.field_v < 100) {
                        break L1;
                      } else {
                        if (0 < dm.field_f) {
                          break L1;
                        } else {
                          stackOut_15_0 = he.field_m;
                          stackIn_16_0 = stackOut_15_0;
                          return stackIn_16_0;
                        }
                      }
                    }
                    L2: {
                      if (param0 == -26181) {
                        break L2;
                      } else {
                        field_d = null;
                        break L2;
                      }
                    }
                    if (maa.field_v >= 200) {
                      stackOut_21_0 = he.field_m;
                      stackIn_22_0 = stackOut_21_0;
                      return stackIn_22_0;
                    } else {
                      if (!bna.a((byte) 5, param2)) {
                        var5 = sja.field_fb;
                        var5.c(param1, (byte) 116);
                        var5.field_g = var5.field_g + 1;
                        var4 = var5.field_g;
                        var5.d(0, 0);
                        var5.a((byte) -50, param2);
                        var5.b((byte) 124, -var4 + var5.field_g);
                        stackOut_26_0 = null;
                        stackIn_27_0 = stackOut_26_0;
                        break L0;
                      } else {
                        stackOut_24_0 = lga.a(true, new String[1], bda.field_p);
                        stackIn_25_0 = stackOut_24_0;
                        return stackIn_25_0;
                      }
                    }
                  }
                } else {
                  stackOut_7_0 = cea.field_a;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                }
              } else {
                stackOut_4_0 = ama.field_l;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = mk.field_f;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var3;
            stackOut_28_1 = new StringBuilder().append("lda.B(").append(param0).append(',').append(param1).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param2 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L3;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ')');
        }
        return (String) (Object) stackIn_27_0;
    }

    public static void a() {
        int var1 = 0;
        field_d = null;
        field_b = null;
    }

    lda(kv[] param0) {
        try {
            ((lda) this).field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "lda.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Unfortunately you are not eligible to create an account.";
        field_d = "You have entered another game.";
    }
}
