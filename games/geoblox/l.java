/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class l extends oj {
    static tf field_g;
    private java.nio.ByteBuffer field_f;
    static fd[] field_i;
    static rh field_h;

    public static void b(int param0) {
        field_g = null;
        field_i = null;
        field_h = null;
        if (param0 > -1) {
            field_i = null;
        }
    }

    l() {
    }

    final byte[] a(byte param0) {
        byte[] var4 = new byte[((l) this).field_f.capacity()];
        byte[] var2 = var4;
        java.nio.Buffer discarded$0 = ((l) this).field_f.position(0);
        java.nio.ByteBuffer discarded$1 = ((l) this).field_f.get(var4);
        int var3 = 39 / ((param0 - 8) / 46);
        return var4;
    }

    final void a(byte[] param0, boolean param1) {
        ((l) this).field_f = java.nio.ByteBuffer.allocateDirect(param0.length);
        java.nio.Buffer discarded$9 = ((l) this).field_f.position(0);
        if (!param1) {
          return;
        } else {
          java.nio.ByteBuffer discarded$10 = ((l) this).field_f.put(param0);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new tf();
    }
}
