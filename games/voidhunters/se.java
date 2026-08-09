/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class se extends ps {
    private java.nio.ByteBuffer field_c;
    static String field_b;

    se() {
    }

    final static int a(boolean param0) {
        if (param0) {
            se.c(-109);
            return 495;
        }
        return 495;
    }

    final void a(byte param0, byte[] param1) {
        if (param0 != -28) {
            return;
        }
        try {
            this.field_c = java.nio.ByteBuffer.allocateDirect(param1.length);
            this.field_c.position(0);
            this.field_c.put(param1);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "se.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final byte[] a(int param0, int param1, int param2) {
        byte[] var4;
        byte[] var5;
        var5 = new byte[param0];
        var4 = var5;
        this.field_c.position(param2);
        if (param1 > -97) {
          se.a(false);
          this.field_c.get(var5, 0, param0);
          return var5;
        } else {
          this.field_c.get(var5, 0, param0);
          return var5;
        }
    }

    final byte[] b(int param0) {
        byte[] var2;
        byte[] var3;
        var3 = new byte[this.field_c.capacity()];
        var2 = var3;
        this.field_c.position(0);
        this.field_c.get(var3);
        if (param0 != 3) {
          return (byte[]) null;
        } else {
          return var3;
        }
    }

    public static void c(int param0) {
        if (param0 != -27982) {
            return;
        }
        field_b = null;
    }

    static {
        field_b = "Zoom";
    }
}
