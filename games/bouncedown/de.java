/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class de extends ah {
    static tg[] field_d;
    static int field_f;
    static int field_c;
    static int field_b;
    static int[] field_e;
    private java.nio.ByteBuffer field_a;

    final byte[] a(int param0) {
        byte[] var3 = new byte[this.field_a.capacity()];
        byte[] var2 = var3;
        java.nio.Buffer discarded$0 = this.field_a.position(param0);
        java.nio.ByteBuffer discarded$1 = this.field_a.get(var3);
        return var3;
    }

    de() {
    }

    final void a(byte param0, byte[] param1) {
        java.nio.Buffer discarded$0 = null;
        java.nio.ByteBuffer discarded$1 = null;
        try {
            this.field_a = java.nio.ByteBuffer.allocateDirect(param1.length);
            if (param0 != 68) {
                this.field_a = (java.nio.ByteBuffer) null;
            }
            discarded$0 = this.field_a.position(0);
            discarded$1 = this.field_a.put(param1);
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "de.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(int param0) {
        field_d = null;
        if (param0 != 11041) {
            return;
        }
        field_e = null;
    }

    static {
    }
}
