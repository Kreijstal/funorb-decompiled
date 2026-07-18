/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kh extends dj {
    static ji field_j;
    static int field_h;
    private java.nio.ByteBuffer field_i;
    static byte[] field_f;
    static long field_g;

    final void a(byte[] param0, int param1) {
        try {
            ((kh) this).field_i = java.nio.ByteBuffer.allocateDirect(param0.length);
            java.nio.Buffer discarded$0 = ((kh) this).field_i.position(0);
            int var3_int = -117 % ((param1 - 75) / 38);
            java.nio.ByteBuffer discarded$1 = ((kh) this).field_i.put(param0);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "kh.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void c() {
        field_j = null;
        field_f = null;
    }

    final byte[] a(int param0) {
        int var2 = -11 / ((param0 - -78) / 47);
        byte[] var3 = new byte[((kh) this).field_i.capacity()];
        java.nio.Buffer discarded$0 = ((kh) this).field_i.position(0);
        java.nio.ByteBuffer discarded$1 = ((kh) this).field_i.get(var3);
        return var3;
    }

    kh() {
    }

    static {
    }
}
