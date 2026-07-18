/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.awt.Frame;

final class m {
    static int field_c;
    static int[] field_d;
    static int[] field_a;
    static String field_e;
    static int field_b;

    public static void a() {
        field_a = null;
        field_e = null;
        field_d = null;
    }

    final static java.awt.Frame a(int param0, int param1, int param2, int param3, int param4, be param5) {
        RuntimeException var6 = null;
        db[] var6_array = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        db[] var10 = null;
        eb var11 = null;
        Object stackIn_3_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_22_0 = null;
        Object stackIn_25_0 = null;
        java.awt.Frame stackIn_27_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_7_0 = null;
        java.awt.Frame stackOut_26_0 = null;
        Object stackOut_24_0 = null;
        Object stackOut_21_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var9 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (param5.b((byte) -100)) {
              L1: {
                if (param1 == 0) {
                  int discarded$2 = -119;
                  var10 = a.a(param5);
                  var6_array = var10;
                  if (var6_array != null) {
                    var7_int = 0;
                    var8 = 0;
                    L2: while (true) {
                      if (var8 >= var10.length) {
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          return null;
                        }
                      } else {
                        L3: {
                          if (var10[var8].field_d != param0) {
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        var8++;
                        continue L2;
                      }
                    }
                  } else {
                    stackOut_7_0 = null;
                    stackIn_8_0 = stackOut_7_0;
                    return (java.awt.Frame) (Object) stackIn_8_0;
                  }
                } else {
                  break L1;
                }
              }
              var11 = param5.a(param1, param0, param2, 28252, param4);
              L4: while (true) {
                if (var11.field_a != 0) {
                  var7 = (java.awt.Frame) var11.field_g;
                  if (var7 != null) {
                    if (var11.field_a != 2) {
                      stackOut_26_0 = (java.awt.Frame) var7;
                      stackIn_27_0 = stackOut_26_0;
                      break L0;
                    } else {
                      int discarded$3 = -23144;
                      tj.a(param5, var7);
                      stackOut_24_0 = null;
                      stackIn_25_0 = stackOut_24_0;
                      return (java.awt.Frame) (Object) stackIn_25_0;
                    }
                  } else {
                    stackOut_21_0 = null;
                    stackIn_22_0 = stackOut_21_0;
                    return (java.awt.Frame) (Object) stackIn_22_0;
                  }
                } else {
                  hb.a(10L, 121);
                  continue L4;
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (java.awt.Frame) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var6;
            stackOut_28_1 = new StringBuilder().append("m.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(-1).append(',').append(param4).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param5 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L5;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L5;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ')');
        }
        return stackIn_27_0;
    }

    final static void a(boolean param0) {
        bm.field_d.a((byte) 82, 0, 0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new int[12];
        field_d[1] = 1;
        field_d[4] = 5000;
        field_d[5] = 1000;
        field_d[3] = 5000;
        field_d[6] = 1;
        field_d[7] = 10;
        field_d[10] = 10;
        field_d[8] = 1;
        field_d[2] = 10;
        field_d[11] = 5000;
        field_d[0] = 1;
        field_d[9] = 10;
        field_e = "Unpacking music";
    }
}
