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
        boolean discarded$2 = false;
        ms.field_y = new ij();
        gtb.field_d = new ij();
        if (param0 < 52) {
          discarded$2 = qn.a(11, (byte) 95);
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
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var6 = VoidHunters.field_G;
        try {
          L0: {
            var3_int = 0;
            if (param1 == 58) {
              var4 = param2.length();
              var5 = 0;
              L1: while (true) {
                if (var4 <= var5) {
                  stackOut_11_0 = var3_int;
                  stackIn_12_0 = stackOut_11_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    if (param0 == param2.charAt(var5)) {
                      var3_int++;
                      break L2;
                    } else {
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
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var3);
            stackOut_13_1 = new StringBuilder().append("qn.D(").append(param0).append(',').append(param1).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_12_0;
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            qn.c((byte) -115);
            field_h = null;
            field_d = null;
            return;
        }
        field_h = null;
        field_d = null;
    }

    private qn() throws Throwable {
        throw new Error();
    }

    static {
        field_f = 20;
        field_d = "Decreased map width";
    }
}
