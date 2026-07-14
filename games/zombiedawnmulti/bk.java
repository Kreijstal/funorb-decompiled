/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bk extends t {
    static boolean field_g;
    private java.nio.ByteBuffer field_h;
    static fa field_i;
    static String field_j;
    static String field_k;

    final byte[] a(int param0) {
        int var2 = 82 / ((-69 - param0) / 36);
        byte[] var3 = new byte[((bk) this).field_h.capacity()];
        java.nio.Buffer discarded$0 = ((bk) this).field_h.position(0);
        java.nio.ByteBuffer discarded$1 = ((bk) this).field_h.get(var3);
        return var3;
    }

    final static ja[] a(int param0, int param1, byte param2) {
        if (param2 != 28) {
            field_i = null;
            return h.a((byte) -112, param0, 1, param1);
        }
        return h.a((byte) -112, param0, 1, param1);
    }

    final void a(byte[] param0, byte param1) {
        ((bk) this).field_h = java.nio.ByteBuffer.allocateDirect(param0.length);
        if (param1 > -68) {
          ja[] discarded$10 = bk.a(112, 60, (byte) -105);
          java.nio.Buffer discarded$11 = ((bk) this).field_h.position(0);
          java.nio.ByteBuffer discarded$12 = ((bk) this).field_h.put(param0);
          return;
        } else {
          java.nio.Buffer discarded$13 = ((bk) this).field_h.position(0);
          java.nio.ByteBuffer discarded$14 = ((bk) this).field_h.put(param0);
          return;
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        String var2 = null;
        CharSequence var3 = null;
        var2 = param0.getParameter("username");
        if (param1 == -17708) {
          if (var2 != null) {
            var3 = (CharSequence) (Object) var2;
            if ((cq.a(param1 + 17708, var3) ^ -1L) == -1L) {
              return;
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public static void c(int param0) {
        field_i = null;
        field_j = null;
        if (param0 != 4912) {
            field_i = null;
            field_k = null;
            return;
        }
        field_k = null;
    }

    bk() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Loading patches";
        field_j = "You can join this game";
    }
}
