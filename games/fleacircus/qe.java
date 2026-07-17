/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qe extends hd {
    static int field_k;
    static Random field_j;
    private java.nio.ByteBuffer field_i;

    final static void a(int param0, int param1, dd param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        RuntimeException var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param7 == 5120) {
                break L1;
              } else {
                var12 = null;
                qe.a(-46, 27, (dd) null, -27, -105, -46, -75, -59, 119);
                break L1;
              }
            }
            var9_int = param4 + param8 + (param2.field_q - param3);
            var10 = param1 + (param8 + (param2.field_q + param4));
            var11 = param5 + param2.field_v - -(param2.field_t >> 1);
            gb.g(var9_int, 0, var10, var11 - -param0);
            param2.a(-1 + param8, param5 - 1, param6);
            param2.a(param8 - 1, param5 - -1, param6);
            gb.b(ab.field_c);
            gb.g(1 + var9_int, 0, var10 - -1, var11 - -param0);
            param2.a(1 + param8, param5 - 1, param6);
            param2.a(1 + param8, param5 + 1, param6);
            gb.b(ab.field_c);
            var10 = -param3 + param8 + param2.field_q + (param2.field_w + -param4);
            var9_int = param8 + param2.field_w + (param2.field_q - param4 + -param1);
            gb.g(var9_int, var11 + -param0, var10, 480);
            param2.a(param8 - 1, param5 - 1, param6);
            param2.a(param8 + -1, 1 + param5, param6);
            gb.b(ab.field_c);
            gb.g(1 + var9_int, var11 - param0, 1 + var10, 480);
            param2.a(param8 + 1, param5 + -1, param6);
            param2.a(1 + param8, 1 + param5, param6);
            gb.b(ab.field_c);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var9 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var9;
            stackOut_4_1 = new StringBuilder().append("qe.A(").append(param0).append(44).append(param1).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 41);
        }
    }

    final byte[] b(int param0) {
        byte[] var2 = null;
        byte[] var3 = null;
        if (param0 != 256) {
          return null;
        } else {
          var3 = new byte[((qe) this).field_i.capacity()];
          var2 = var3;
          java.nio.Buffer discarded$4 = ((qe) this).field_i.position(0);
          java.nio.ByteBuffer discarded$5 = ((qe) this).field_i.get(var3);
          return var3;
        }
    }

    public static void c() {
        field_j = null;
    }

    final void a(int param0, byte[] param1) {
        try {
            ((qe) this).field_i = java.nio.ByteBuffer.allocateDirect(param1.length);
            if (param0 >= -97) {
                Object var4 = null;
                qe.a(-71, 115, (dd) null, -77, 80, 37, 76, 99, 49);
            }
            java.nio.Buffer discarded$0 = ((qe) this).field_i.position(0);
            java.nio.ByteBuffer discarded$1 = ((qe) this).field_i.put(param1);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "qe.B(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    qe() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new Random();
    }
}
