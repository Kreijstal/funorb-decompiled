/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nj extends ke {
    static int field_j;
    private java.nio.ByteBuffer field_h;
    static fa field_i;
    static String field_k;
    static he field_l;

    final void a(byte[] param0, boolean param1) {
        ((nj) this).field_h = java.nio.ByteBuffer.allocateDirect(param0.length);
        if (param1) {
          field_i = null;
          java.nio.Buffer discarded$8 = ((nj) this).field_h.position(0);
          java.nio.ByteBuffer discarded$9 = ((nj) this).field_h.put(param0);
          return;
        } else {
          java.nio.Buffer discarded$10 = ((nj) this).field_h.position(0);
          java.nio.ByteBuffer discarded$11 = ((nj) this).field_h.put(param0);
          return;
        }
    }

    final byte[] c(boolean param0) {
        byte[] var2 = null;
        Object var3 = null;
        byte[] var4 = null;
        var4 = new byte[((nj) this).field_h.capacity()];
        var2 = var4;
        if (param0) {
          var3 = null;
          ((nj) this).a((byte[]) null, true);
          java.nio.Buffer discarded$8 = ((nj) this).field_h.position(0);
          java.nio.ByteBuffer discarded$9 = ((nj) this).field_h.get(var4);
          return var4;
        } else {
          java.nio.Buffer discarded$10 = ((nj) this).field_h.position(0);
          java.nio.ByteBuffer discarded$11 = ((nj) this).field_h.get(var4);
          return var4;
        }
    }

    public static void a(int param0) {
        field_k = null;
        if (param0 != 0) {
            field_k = null;
            field_l = null;
            field_i = null;
            return;
        }
        field_l = null;
        field_i = null;
    }

    nj() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "members-only content";
    }
}
