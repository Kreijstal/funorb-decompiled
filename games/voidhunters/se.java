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
        java.nio.Buffer discarded$0 = null;
        java.nio.ByteBuffer discarded$1 = null;
        if (param0 != -28) {
            return;
        }
        try {
            this.field_c = java.nio.ByteBuffer.allocateDirect(param1.length);
            discarded$0 = this.field_c.position(0);
            discarded$1 = this.field_c.put(param1);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "se.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final byte[] a(int param0, int param1, int param2) {
        int discarded$14 = 0;
        java.nio.ByteBuffer discarded$15 = null;
        java.nio.ByteBuffer discarded$16 = null;
        byte[] var4 = null;
        byte[] var5 = null;
        var5 = new byte[param0];
        var4 = var5;
        java.nio.Buffer discarded$13 = this.field_c.position(param2);
        if (param1 > -97) {
          discarded$14 = se.a(false);
          discarded$15 = this.field_c.get(var5, 0, param0);
          return var5;
        } else {
          discarded$16 = this.field_c.get(var5, 0, param0);
          return var5;
        }
    }

    final byte[] b(int param0) {
        byte[] var2 = null;
        byte[] var3 = null;
        var3 = new byte[this.field_c.capacity()];
        var2 = var3;
        java.nio.Buffer discarded$19 = this.field_c.position(0);
        java.nio.ByteBuffer discarded$20 = this.field_c.get(var3);
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
