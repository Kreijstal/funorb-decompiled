/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fc extends ll {
    static boolean field_d;
    private java.nio.ByteBuffer field_c;

    final void a(int param0, byte[] param1) {
        ((fc) this).field_c = java.nio.ByteBuffer.allocateDirect(param1.length);
        int var3 = 38 % ((param0 - 55) / 53);
        java.nio.Buffer discarded$0 = ((fc) this).field_c.position(0);
        java.nio.ByteBuffer discarded$1 = ((fc) this).field_c.put(param1);
    }

    final byte[] a(byte param0) {
        byte[] var2 = null;
        Object var3 = null;
        byte[] var4 = null;
        var4 = new byte[((fc) this).field_c.capacity()];
        var2 = var4;
        java.nio.Buffer discarded$13 = ((fc) this).field_c.position(0);
        if (param0 != 99) {
          var3 = null;
          sc discarded$14 = fc.a((byte[]) null, -5);
          java.nio.ByteBuffer discarded$15 = ((fc) this).field_c.get(var4);
          return var4;
        } else {
          java.nio.ByteBuffer discarded$16 = ((fc) this).field_c.get(var4);
          return var4;
        }
    }

    final static sc a(byte[] param0, int param1) {
        sc var2 = null;
        if (param0 != null) {
          var2 = new sc(param0, jd.field_g, wc.field_a, wh.field_b, m.field_a, fl.field_a);
          if (param1 >= -19) {
            field_d = false;
            md.a((byte) -115);
            return var2;
          } else {
            md.a((byte) -115);
            return var2;
          }
        } else {
          return null;
        }
    }

    final static boolean a(byte param0, String param1) {
        int var2 = -115 / ((-91 - param0) / 34);
        CharSequence var3 = (CharSequence) (Object) param1;
        return sg.field_E.equals((Object) (Object) ua.a(122, var3));
    }

    fc() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = false;
    }
}
