/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ku extends af {
    private java.nio.ByteBuffer field_d;
    static int field_h;
    static java.awt.Frame field_f;
    static String field_g;
    static int[] field_e;

    public static void c(int param0) {
        if (param0 <= 42) {
          ku.c(-67);
          field_e = null;
          field_f = null;
          field_g = null;
          return;
        } else {
          field_e = null;
          field_f = null;
          field_g = null;
          return;
        }
    }

    final void a(byte param0, byte[] param1) {
        try {
            this.field_d = java.nio.ByteBuffer.allocateDirect(param1.length);
            this.field_d.position(0);
            if (param0 != 56) {
                byte[] var4 = (byte[]) null;
                this.a((byte) -3, (byte[]) null);
            }
            this.field_d.put(param1);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "ku.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final byte[] b(int param0) {
        byte[] var4 = new byte[this.field_d.capacity()];
        byte[] var2 = var4;
        this.field_d.position(0);
        int var3 = -63 % ((-63 - param0) / 63);
        this.field_d.get(var4);
        return var4;
    }

    final byte[] a(int param0, int param1, int param2) {
        byte[] var4;
        byte[] var5;
        this.field_d.position(param1);
        var5 = new byte[param2];
        var4 = var5;
        if (param0 != -19920) {
          field_g = (String) null;
          this.field_d.get(var5, 0, param2);
          return var5;
        } else {
          this.field_d.get(var5, 0, param2);
          return var5;
        }
    }

    ku() {
    }

    static {
    }
}
