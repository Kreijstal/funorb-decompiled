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
            field_i = (fd[]) null;
        }
    }

    l() {
    }

    final byte[] a(byte param0) {
        byte[] var4 = new byte[this.field_f.capacity()];
        byte[] var2 = var4;
        java.nio.Buffer discarded$0 = this.field_f.position(0);
        java.nio.ByteBuffer discarded$1 = this.field_f.get(var4);
        int var3 = 39 / ((param0 - 8) / 46);
        return var4;
    }

    final void a(byte[] param0, boolean param1) {
        java.nio.ByteBuffer discarded$7 = null;
        this.field_f = java.nio.ByteBuffer.allocateDirect(param0.length);
        java.nio.Buffer discarded$6 = this.field_f.position(0);
        if (!param1) {
            return;
        }
        try {
            discarded$7 = this.field_f.put(param0);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "l.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_g = new tf();
    }
}
