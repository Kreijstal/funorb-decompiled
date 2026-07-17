/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class lh extends tm {
    static int[][] field_E;
    static al field_D;
    static String field_A;
    static String field_C;
    static String field_F;

    final static ut a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = Kickabout.field_G;
        ut var6 = new ut(param2, param2);
        ut var3 = var6;
        for (var4 = 0; var3.field_y.length > var4; var4++) {
            var6.field_y[var4] = param0;
        }
        return var3;
    }

    lh(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static String a(int param0, int param1, String param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        ml var5 = null;
        CharSequence var6 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        String stackIn_13_0 = null;
        String stackIn_17_0 = null;
        String stackIn_20_0 = null;
        String stackIn_24_0 = null;
        Object stackIn_26_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_5_0 = null;
        String stackOut_9_0 = null;
        String stackOut_16_0 = null;
        String stackOut_23_0 = null;
        Object stackOut_25_0 = null;
        String stackOut_19_0 = null;
        String stackOut_12_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        try {
          L0: {
            var6 = (CharSequence) (Object) param2;
            int discarded$1 = -9907;
            if (ef.a(var6)) {
              if (ts.field_d != 2) {
                stackOut_5_0 = ss.field_h;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              } else {
                if (hm.a((byte) 82, param2)) {
                  stackOut_9_0 = ec.field_g;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                } else {
                  if (!lf.a(param2, -64)) {
                    L1: {
                      if (100 > bc.field_d) {
                        break L1;
                      } else {
                        if (eq.field_d > 0) {
                          break L1;
                        } else {
                          stackOut_16_0 = jg.field_A;
                          stackIn_17_0 = stackOut_16_0;
                          return stackIn_17_0;
                        }
                      }
                    }
                    if (bc.field_d < 200) {
                      if (hi.a(0, param2)) {
                        stackOut_23_0 = vo.a((byte) -18, at.field_Gb, new String[1]);
                        stackIn_24_0 = stackOut_23_0;
                        return stackIn_24_0;
                      } else {
                        var5 = or.field_d;
                        var5.b(param0, (byte) 93);
                        var5.field_n = var5.field_n + 1;
                        var4 = var5.field_n;
                        var5.a(123, 0);
                        var5.a(14190, param2);
                        var5.c(62, -var4 + var5.field_n);
                        stackOut_25_0 = null;
                        stackIn_26_0 = stackOut_25_0;
                        break L0;
                      }
                    } else {
                      stackOut_19_0 = jg.field_A;
                      stackIn_20_0 = stackOut_19_0;
                      return stackIn_20_0;
                    }
                  } else {
                    stackOut_12_0 = vo.a((byte) -18, ah.field_m, new String[1]);
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0;
                  }
                }
              }
            } else {
              stackOut_1_0 = kq.field_Ib;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var3;
            stackOut_27_1 = new StringBuilder().append("lh.B(").append(param0).append(44).append(100).append(44);
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param2 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L2;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 41);
        }
        return (String) (Object) stackIn_26_0;
    }

    public static void g() {
        field_A = null;
        field_C = null;
        field_F = null;
        field_D = null;
        field_E = null;
    }

    final li a(byte param0, li[] param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        li stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        li stackOut_3_0 = null;
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
            if (param0 == 84) {
              lb.a(-28153, (String) param1[0].field_d);
              stackOut_3_0 = new li((Object) (Object) "void");
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (li) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("lh.C(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
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
          throw nb.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_4_0;
    }

    final static bc a(iw param0) {
        bc var2 = null;
        RuntimeException var2_ref = null;
        bc stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        bc stackOut_0_0 = null;
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
            var2 = new bc();
            var2.a(param0, 62);
            stackOut_0_0 = (bc) var2;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2_ref;
            stackOut_2_1 = new StringBuilder().append("lh.D(");
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
          throw nb.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + 18653 + 41);
        }
        return stackIn_1_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = "Amateur Teams";
        field_F = "Go to Auctions";
    }
}
