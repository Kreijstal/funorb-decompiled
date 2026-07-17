/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class af extends qb {
    private java.nio.ByteBuffer field_d;
    static dl[] field_c;

    public static void c(int param0) {
        field_c = null;
    }

    final byte[] a(int param0) {
        int var2 = 73 % ((-21 - param0) / 35);
        byte[] var3 = new byte[((af) this).field_d.capacity()];
        java.nio.Buffer discarded$0 = ((af) this).field_d.position(0);
        java.nio.ByteBuffer discarded$1 = ((af) this).field_d.get(var3);
        return var3;
    }

    final void a(byte[] param0, int param1) {
        try {
            ((af) this).field_d = java.nio.ByteBuffer.allocateDirect(param0.length);
            java.nio.Buffer discarded$0 = ((af) this).field_d.position(0);
            int var3_int = 81 / ((-54 - param1) / 37);
            java.nio.ByteBuffer discarded$1 = ((af) this).field_d.put(param0);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "af.E(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    af() {
    }

    static {
    }
}
