/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class be {
    static int field_c;
    String field_a;
    int field_b;

    abstract java.net.Socket a(int param0) throws IOException;

    final java.net.Socket a(byte param0) throws IOException {
        int var2 = -71 % ((param0 - 64) / 36);
        return new java.net.Socket(this.field_a, this.field_b);
    }

    final static int a(String param0, int param1, da param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, byte param10, int param11) {
        RuntimeException var12 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param10 == 60) {
                break L1;
              } else {
                field_c = 5;
                break L1;
              }
            }
            stackOut_2_0 = param2.a((aa) null, param11, param4, 0, param7, fm.a(false, param9), (int[]) null, param6, fm.a(false, param3), param0, (byte) 88, param5, 0, (nh[]) null, param8, param1);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var12 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var12);
            stackOut_4_1 = new StringBuilder().append("be.J(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4, int param5) {
        if (param3 == param4) {
          iqa.a(30237, param5, param1, param0, param4);
          return;
        } else {
          if (-param4 + param0 < pka.field_b) {
            za.a(param0, param3, param4, param1, (byte) 115, param5);
            if (param2 == 71) {
              return;
            } else {
              be.a(59, -46, (byte) 78, 62, -53, 58);
              return;
            }
          } else {
            if (param0 + param4 > ss.field_c) {
              za.a(param0, param3, param4, param1, (byte) 115, param5);
              if (param2 == 71) {
                return;
              } else {
                be.a(59, -46, (byte) 78, 62, -53, 58);
                return;
              }
            } else {
              if (param5 + -param3 < gca.field_d) {
                za.a(param0, param3, param4, param1, (byte) 115, param5);
                if (param2 != 71) {
                  be.a(59, -46, (byte) 78, 62, -53, 58);
                  return;
                } else {
                  return;
                }
              } else {
                if (param3 + param5 > hc.field_h) {
                  za.a(param0, param3, param4, param1, (byte) 115, param5);
                  if (param2 != 71) {
                    be.a(59, -46, (byte) 78, 62, -53, 58);
                    return;
                  } else {
                    return;
                  }
                } else {
                  iea.a(param0, param4, param1, param5, 110, param3);
                  if (!TombRacer.field_G) {
                    if (param2 != 71) {
                      be.a(59, -46, (byte) 78, 62, -53, 58);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    za.a(param0, param3, param4, param1, (byte) 115, param5);
                    if (param2 != 71) {
                      be.a(59, -46, (byte) 78, 62, -53, 58);
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
            }
          }
        }
    }

    static {
    }
}
