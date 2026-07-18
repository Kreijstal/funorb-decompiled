/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wi extends bg {
    static int field_h;
    static String field_i;
    static String field_g;
    static na field_f;
    private java.nio.ByteBuffer field_k;
    static String field_j;

    final static boolean a(int param0, int[] param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
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
            if (param2 == 0) {
              L1: {
                if ((param1[param0 >> 5] & 1 << (param0 & 31)) == 0) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                }
              }
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("wi.H(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param2 + ')');
        }
        return stackIn_6_0 != 0;
    }

    public static void a(int param0) {
        field_i = null;
        field_g = null;
        field_j = null;
        field_f = null;
    }

    final void a(int param0, byte[] param1) {
        try {
            ((wi) this).field_k = java.nio.ByteBuffer.allocateDirect(param1.length);
            int var3_int = -111 / ((param0 - 25) / 44);
            java.nio.Buffer discarded$0 = ((wi) this).field_k.position(0);
            java.nio.ByteBuffer discarded$1 = ((wi) this).field_k.put(param1);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "wi.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final byte[] b(byte param0) {
        byte[] var2 = null;
        Object var3 = null;
        byte[] var4 = null;
        var4 = new byte[((wi) this).field_k.capacity()];
        var2 = var4;
        if (param0 >= 0) {
          var3 = null;
          boolean discarded$10 = wi.a(20, (int[]) null, -59);
          java.nio.Buffer discarded$11 = ((wi) this).field_k.position(0);
          java.nio.ByteBuffer discarded$12 = ((wi) this).field_k.get(var4);
          return var4;
        } else {
          java.nio.Buffer discarded$13 = ((wi) this).field_k.position(0);
          java.nio.ByteBuffer discarded$14 = ((wi) this).field_k.get(var4);
          return var4;
        }
    }

    wi() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = 0;
        field_i = "Just one target left; you're almost there!";
        field_g = "Asking for or providing contact information";
        field_j = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
    }
}
