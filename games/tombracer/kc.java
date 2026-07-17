/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class kc {
    static int field_b;
    static int field_a;

    final static int a(boolean param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int stackIn_18_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        var3 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var1_int = 0;
            L1: while (true) {
              if (!es.a(true)) {
                L2: {
                  lp.field_h.a(fk.a(jm.field_m, (byte) -113, lba.field_p), 35, fk.a(jba.field_j, (byte) -113, sta.field_B));
                  if (!lp.field_h.a(false)) {
                    break L2;
                  } else {
                    var1_int = 1;
                    break L2;
                  }
                }
                L3: {
                  var2 = 0;
                  if (var1_int == 0) {
                    break L3;
                  } else {
                    if (lp.field_h.field_h >= 0) {
                      var2 = rga.field_b[lp.field_h.field_h];
                      if (var2 == 2) {
                        qfa.a(-103);
                        break L3;
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                }
                stackOut_17_0 = var2;
                stackIn_18_0 = stackOut_17_0;
                break L0;
              } else {
                lp.field_h.c(18);
                if (lp.field_h.a(false)) {
                  var1_int = 1;
                  continue L1;
                } else {
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var1, "kc.B(" + 1 + 41);
        }
        return stackIn_18_0;
    }

    final static String a(String param0, int param1, boolean param2, String param3) {
        RuntimeException var4 = null;
        kh var5 = null;
        int var6 = 0;
        mu var7 = null;
        CharSequence var8 = null;
        int stackIn_3_0 = 0;
        String stackIn_6_0 = null;
        String stackIn_9_0 = null;
        String stackIn_12_0 = null;
        Object stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        String stackOut_5_0 = null;
        Object stackOut_13_0 = null;
        String stackOut_11_0 = null;
        String stackOut_8_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
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
            L1: {
              if (param2) {
                stackOut_2_0 = 0;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            var8 = (CharSequence) (Object) param0;
            if (fs.a(stackIn_3_0 == 0, var8)) {
              stackOut_5_0 = pk.field_v;
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0;
            } else {
              if (ae.field_g == 2) {
                var7 = uh.a(param3, 115);
                if (var7 != null) {
                  var7.p(105);
                  var7.c(-7975);
                  tba.field_k = tba.field_k - 1;
                  var5 = ql.field_k;
                  var5.k(param1, -2988);
                  var5.field_h = var5.field_h + 1;
                  var6 = var5.field_h;
                  var5.i(3, 0);
                  var5.a(param0, param2);
                  var5.d(-var6 + var5.field_h, (byte) 117);
                  stackOut_13_0 = null;
                  stackIn_14_0 = stackOut_13_0;
                  break L0;
                } else {
                  stackOut_11_0 = gl.a((byte) 119, uqa.field_A, new String[1]);
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0;
                }
              } else {
                stackOut_8_0 = rt.field_n;
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4;
            stackOut_15_1 = new StringBuilder().append("kc.A(");
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
          L3: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L3;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 41);
        }
        return (String) (Object) stackIn_14_0;
    }

    static {
    }
}
