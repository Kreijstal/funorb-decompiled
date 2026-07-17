/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bk extends t {
    static boolean field_g;
    private java.nio.ByteBuffer field_h;
    static fa field_i;
    static String field_j;
    static String field_k;

    final byte[] a(int param0) {
        int var2 = 82 / ((-69 - param0) / 36);
        byte[] var3 = new byte[((bk) this).field_h.capacity()];
        java.nio.Buffer discarded$0 = ((bk) this).field_h.position(0);
        java.nio.ByteBuffer discarded$1 = ((bk) this).field_h.get(var3);
        return var3;
    }

    final static ja[] a(int param0, int param1, byte param2) {
        if (param2 != 28) {
            field_i = null;
            return h.a((byte) -112, param0, 1, param1);
        }
        return h.a((byte) -112, param0, 1, param1);
    }

    final void a(byte[] param0, byte param1) {
        try {
            ((bk) this).field_h = java.nio.ByteBuffer.allocateDirect(param0.length);
            if (param1 > -68) {
                ja[] discarded$0 = bk.a(112, 60, (byte) -105);
            }
            java.nio.Buffer discarded$1 = ((bk) this).field_h.position(0);
            java.nio.ByteBuffer discarded$2 = ((bk) this).field_h.put(param0);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "bk.D(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final static void a(java.applet.Applet param0) {
        String var2 = null;
        RuntimeException var2_ref = null;
        CharSequence var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var2 = param0.getParameter("username");
            L1: {
              if (var2 == null) {
                break L1;
              } else {
                var3 = (CharSequence) (Object) var2;
                if (cq.a(0, var3) != 0L) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2_ref;
            stackOut_5_1 = new StringBuilder().append("bk.G(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + -17708 + 41);
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void c() {
        field_i = null;
        field_j = null;
        field_k = null;
    }

    bk() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Loading patches";
        field_j = "You can join this game";
    }
}
