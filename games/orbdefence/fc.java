/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fc extends ll {
    static boolean field_d;
    private java.nio.ByteBuffer field_c;

    final void a(int param0, byte[] param1) {
        try {
            ((fc) this).field_c = java.nio.ByteBuffer.allocateDirect(param1.length);
            int var3_int = 38 % ((param0 - 55) / 53);
            java.nio.Buffer discarded$0 = ((fc) this).field_c.position(0);
            java.nio.ByteBuffer discarded$1 = ((fc) this).field_c.put(param1);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "fc.C(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final byte[] a(byte param0) {
        byte[] var2 = null;
        Object var3 = null;
        byte[] var4 = null;
        var4 = new byte[((fc) this).field_c.capacity()];
        var2 = var4;
        java.nio.Buffer discarded$13 = ((fc) this).field_c.position(0);
        if (param0 != 99) {
          var3 = null;
          sc discarded$14 = fc.a((byte[]) null, -5);
          java.nio.ByteBuffer discarded$15 = ((fc) this).field_c.get(var4);
          return var4;
        } else {
          java.nio.ByteBuffer discarded$16 = ((fc) this).field_c.get(var4);
          return var4;
        }
    }

    final static sc a(byte[] param0, int param1) {
        sc var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        sc stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        sc stackOut_5_0 = null;
        Object stackOut_1_0 = null;
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
            if (param0 != null) {
              L1: {
                var2 = new sc(param0, jd.field_g, wc.field_a, wh.field_b, m.field_a, fl.field_a);
                if (param1 < -19) {
                  break L1;
                } else {
                  field_d = false;
                  break L1;
                }
              }
              md.a((byte) -115);
              stackOut_5_0 = (sc) var2;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (sc) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var2_ref;
            stackOut_7_1 = new StringBuilder().append("fc.A(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
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
          throw dd.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 41);
        }
        return stackIn_6_0;
    }

    final static boolean a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        CharSequence var3 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2_int = -115 / ((-91 - param0) / 34);
            var3 = (CharSequence) (Object) param1;
            stackOut_0_0 = sg.field_E.equals((Object) (Object) ua.a(122, var3));
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("fc.D(").append(param0).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 41);
        }
        return stackIn_1_0;
    }

    fc() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = false;
    }
}
