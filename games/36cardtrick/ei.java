/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ei extends vf {
    private java.nio.ByteBuffer field_c;
    static boolean field_e;
    static int field_f;
    static sc field_d;

    final void a(byte[] param0, byte param1) {
        java.nio.Buffer discarded$0 = null;
        java.nio.ByteBuffer discarded$1 = null;
        this.field_c = java.nio.ByteBuffer.allocateDirect(param0.length);
        if (param1 < 113) {
            return;
        }
        try {
            discarded$0 = this.field_c.position(0);
            discarded$1 = this.field_c.put(param0);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "ei.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final byte[] a(byte param0) {
        java.nio.Buffer discarded$8 = null;
        java.nio.ByteBuffer discarded$9 = null;
        java.nio.Buffer discarded$10 = null;
        java.nio.ByteBuffer discarded$11 = null;
        byte[] var2 = null;
        byte[] var3 = null;
        byte[] var4 = null;
        var4 = new byte[this.field_c.capacity()];
        var2 = var4;
        if (param0 != 25) {
          var3 = (byte[]) null;
          this.a((byte[]) null, (byte) -86);
          discarded$8 = this.field_c.position(0);
          discarded$9 = this.field_c.get(var4);
          return var4;
        } else {
          discarded$10 = this.field_c.position(0);
          discarded$11 = this.field_c.get(var4);
          return var4;
        }
    }

    public static void d(int param0) {
        if (param0 != 0) {
            return;
        }
        field_d = null;
    }

    final static int c(int param0) {
        if (param0 != 0) {
            return 57;
        }
        ja.field_b.a((byte) -50);
        if (dg.field_H.b((byte) -125)) {
            return 0;
        }
        return kf.a(76);
    }

    ei() {
    }

    final static void a(int param0, uh param1, int param2) {
        w var3 = null;
        try {
            if (param0 >= -40) {
                field_d = (sc) null;
            }
            var3 = na.field_r;
            var3.h(param2, 0);
            var3.b(-9469, 5);
            var3.b(-9469, 0);
            var3.e(param1.field_g, 26040);
            var3.b(-9469, param1.field_k);
            var3.b(-9469, param1.field_h);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "ei.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
    }
}
