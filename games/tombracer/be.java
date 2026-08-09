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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_3_0 = param2.a((aa) null, param11, param4, 0, param7, fm.a(false, param9), (int[]) null, param6, fm.a(false, param3), param0, (byte) 88, param5, 0, (nh[]) null, param8, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var12 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var12);

            stackIn_6_1 = new StringBuilder().append("be.J(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ')');
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
              if (param2 != 71) {
                be.a(59, -46, (byte) 78, 62, -53, 58);
                return;
              } else {
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
                  if (param2 == 71) {
                    return;
                  } else {
                    be.a(59, -46, (byte) 78, 62, -53, 58);
                    return;
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
