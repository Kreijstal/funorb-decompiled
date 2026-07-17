/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ei extends vf {
    private java.nio.ByteBuffer field_c;
    static boolean field_e;
    static int field_f;
    static sc field_d;

    final void a(byte[] param0, byte param1) {
        ((ei) this).field_c = java.nio.ByteBuffer.allocateDirect(param0.length);
        if (param1 < 113) {
            return;
        }
        try {
            java.nio.Buffer discarded$0 = ((ei) this).field_c.position(0);
            java.nio.ByteBuffer discarded$1 = ((ei) this).field_c.put(param0);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "ei.E(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final byte[] a(byte param0) {
        byte[] var2 = null;
        Object var3 = null;
        byte[] var4 = null;
        var4 = new byte[((ei) this).field_c.capacity()];
        var2 = var4;
        if (param0 != 25) {
          var3 = null;
          ((ei) this).a((byte[]) null, (byte) -86);
          java.nio.Buffer discarded$8 = ((ei) this).field_c.position(0);
          java.nio.ByteBuffer discarded$9 = ((ei) this).field_c.get(var4);
          return var4;
        } else {
          java.nio.Buffer discarded$10 = ((ei) this).field_c.position(0);
          java.nio.ByteBuffer discarded$11 = ((ei) this).field_c.get(var4);
          return var4;
        }
    }

    public static void d() {
        field_d = null;
    }

    final static int c() {
        ja.field_b.a((byte) -50);
        if (dg.field_H.b((byte) -125)) {
            return 0;
        }
        int discarded$0 = 76;
        return kf.a();
    }

    ei() {
    }

    final static void a(int param0, uh param1, int param2) {
        w var3 = null;
        try {
            if (param0 >= -40) {
                field_d = null;
            }
            var3 = na.field_r;
            var3.h(param2, 0);
            var3.b(-9469, 5);
            var3.b(-9469, 0);
            var3.e(param1.field_g, 26040);
            var3.b(-9469, param1.field_k);
            var3.b(-9469, param1.field_h);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "ei.H(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    static {
    }
}
