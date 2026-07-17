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

    final static void c() {
        ms.field_y = new ij();
        gtb.field_d = new ij();
        jp.field_Jc = new Random();
    }

    final static boolean a(int param0) {
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (tla.b(111, param0)) {
          if (!fwa.field_g.a(param0, false)) {
            return false;
          } else {
            return true;
          }
        } else {
          if (!fwa.field_g.b(param0, 4)) {
            return false;
          } else {
            L0: {
              if (!fwa.field_g.a(param0, false)) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    final static int a(char param0, byte param1, CharSequence param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var6 = VoidHunters.field_G;
        try {
          L0: {
            var3_int = 0;
            var4 = param2.length();
            var5 = 0;
            L1: while (true) {
              if (var4 <= var5) {
                stackOut_12_0 = var3_int;
                stackIn_13_0 = stackOut_12_0;
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
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("qn.D(").append(param0).append(44).append(58).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
        return stackIn_13_0;
    }

    public static void a() {
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
