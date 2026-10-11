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
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param10 != 60) {
            field_c = 5;
          }
          stackIn_3_0 = param2.a((aa) null, param11, param4, 0, param7, fm.a(false, param9), (int[]) null, param6, fm.a(false, param3), param0, (byte) 88, param5, 0, (nh[]) null, param8, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12 = decompiledCaughtException;
          stackIn_6_0 = var12;
          stackIn_6_1 = new StringBuilder().append("be.J(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(')').toString());
        }
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4, int param5) {
        if (param3 == param4) {
          iqa.a(30237, param5, param1, param0, param4);
          return;
        }
        if (-param4 + param0 < pka.field_b) {
          za.a(param0, param3, param4, param1, (byte) 115, param5);
        } else {
          if (param0 + param4 > ss.field_c) {
            za.a(param0, param3, param4, param1, (byte) 115, param5);
          } else {
            if (param5 - param3 < gca.field_d) {
              za.a(param0, param3, param4, param1, (byte) 115, param5);
            } else {
              if (param3 + param5 > hc.field_h) {
                za.a(param0, param3, param4, param1, (byte) 115, param5);
              } else {
                iea.a(param0, param4, param1, param5, 110, param3);
              }
            }
          }
        }
        if (param2 == 71) {
          return;
        }
        be.a(59, -46, (byte) 78, 62, -53, 58);
    }

    static {
    }
}
