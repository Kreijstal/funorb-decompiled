/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class af extends qb {
    private java.nio.ByteBuffer field_d;
    static dl[] field_c;

    public static void c(int param0) {
        if (param0 != 0) {
            field_c = (dl[]) null;
            field_c = null;
            return;
        }
        field_c = null;
    }

    final byte[] a(int param0) {
        int var2 = 73 % ((-21 - param0) / 35);
        byte[] var3 = new byte[this.field_d.capacity()];
        this.field_d.position(0);
        this.field_d.get(var3);
        return var3;
    }

    final void a(byte[] param0, int param1) {
        try {
            this.field_d = java.nio.ByteBuffer.allocateDirect(param0.length);
            this.field_d.position(0);
            int var3_int = 81 / ((-54 - param1) / 37);
            this.field_d.put(param0);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "af.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    af() {
    }

    static {
    }
}
