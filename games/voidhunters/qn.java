/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qn extends ksa {
    static String field_d;
    static int field_f;
    int field_e;
    int field_i;
    static ida field_h;
    int field_g;

    final static void c(byte param0) {
        ms.field_y = new ij();
        gtb.field_d = new ij();
        if (param0 < 52) {
          boolean discarded$2 = qn.a(11, (byte) 95);
          jp.field_Jc = new Random();
          return;
        } else {
          jp.field_Jc = new Random();
          return;
        }
    }

    final static boolean a(int param0, byte param1) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param1 == -25) {
          if (tla.b(111, param0)) {
            if (!fwa.field_g.a(param0, false)) {
              return false;
            } else {
              return true;
            }
          } else {
            if (!fwa.field_g.b(param0, param1 ^ -29)) {
              return false;
            } else {
              L0: {
                if (!fwa.field_g.a(param0, false)) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L0;
                }
              }
              return stackIn_7_0 != 0;
            }
          }
        } else {
          return true;
        }
    }

    final static int a(char param0, byte param1, CharSequence param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var6 = VoidHunters.field_G;
        try {
          L0: {
            var3_int = 0;
            if (param1 == 58) {
              var4 = param2.length();
              var5 = 0;
              L1: while (true) {
                if (var4 <= var5) {
                  stackOut_13_0 = var3_int;
                  stackIn_14_0 = stackOut_13_0;
                  break L0;
                } else {
                  L2: {
                    if (param0 == param2.charAt(var5)) {
                      var3_int++;
                      var5++;
                      break L2;
                    } else {
                      var5++;
                      break L2;
                    }
                  }
                  var5++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = -52;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3;
            stackOut_15_1 = new StringBuilder().append("qn.D(").append(param0).append(44).append(param1).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
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
          throw rta.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
        return stackIn_14_0;
    }

    public static void a(boolean param0) {
        field_h = null;
        field_d = null;
    }

    private qn() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 20;
        field_d = "Decreased map width";
    }
}
