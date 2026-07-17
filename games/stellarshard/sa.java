/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa extends i {
    static int field_h;
    static pb[] field_g;
    static int field_i;
    private java.nio.ByteBuffer field_f;

    final byte[] a(int param0) {
        byte[] var4 = new byte[((sa) this).field_f.capacity()];
        byte[] var2 = var4;
        java.nio.Buffer discarded$0 = ((sa) this).field_f.position(0);
        int var3 = 12 / ((param0 - 74) / 44);
        java.nio.ByteBuffer discarded$1 = ((sa) this).field_f.get(var4);
        return var4;
    }

    final static boolean a() {
        return el.field_E == dj.field_a;
    }

    public static void c() {
        field_g = null;
    }

    final void a(byte[] param0, byte param1) {
        try {
            ((sa) this).field_f = java.nio.ByteBuffer.allocateDirect(param0.length);
            java.nio.Buffer discarded$0 = ((sa) this).field_f.position(0);
            java.nio.ByteBuffer discarded$1 = ((sa) this).field_f.put(param0);
            int var3_int = -42 % ((param1 - 19) / 40);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "sa.D(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final static bm a(int param0, byte[] param1) {
        bm var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        bm stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        bm stackOut_3_0 = null;
        Object stackOut_1_0 = null;
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
            if (param1 != null) {
              var2 = new bm(param1, ak.field_c, vi.field_c, vc.field_b, ih.field_d, gj.field_w, ih.field_b);
              tb.f((byte) -62);
              stackOut_3_0 = (bm) var2;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (bm) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2_ref;
            stackOut_5_1 = new StringBuilder().append("sa.I(").append(2376).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_4_0;
    }

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    sa() {
    }

    static {
    }
}
