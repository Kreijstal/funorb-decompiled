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
        } else {
          java.nio.Buffer discarded$4 = ((ei) this).field_c.position(0);
          java.nio.ByteBuffer discarded$5 = ((ei) this).field_c.put(param0);
          return;
        }
    }

    final byte[] a(byte param0) {
        byte[] var2 = null;
        byte[] var3 = null;
        byte[] var4 = null;
        var4 = new byte[((ei) this).field_c.capacity()];
        var2 = var4;
        if (param0 != 25) {
          var3 = (byte[]) null;
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
        if (param0 >= -40) {
          field_d = (sc) null;
          var3 = na.field_r;
          var3.h(param2, 0);
          var3.b(-9469, 5);
          var3.b(-9469, 0);
          var3.e(((uh) param1).field_g, 26040);
          var3.b(-9469, ((uh) param1).field_k);
          var3.b(-9469, ((uh) param1).field_h);
          return;
        } else {
          var3 = na.field_r;
          var3.h(param2, 0);
          var3.b(-9469, 5);
          var3.b(-9469, 0);
          var3.e(((uh) param1).field_g, 26040);
          var3.b(-9469, ((uh) param1).field_k);
          var3.b(-9469, ((uh) param1).field_h);
          return;
        }
    }

    static {
    }
}
