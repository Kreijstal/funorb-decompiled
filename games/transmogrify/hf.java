/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hf extends dj {
    static String field_g;
    static int field_j;
    static char[] field_k;
    static char[] field_h;
    private java.nio.ByteBuffer field_e;
    static int[][] field_f;
    static int field_i;
    static ti[] field_d;

    public static void a(byte param0) {
        if (param0 != 118) {
          field_f = null;
          field_h = null;
          field_g = null;
          field_d = null;
          field_k = null;
          field_f = null;
          return;
        } else {
          field_h = null;
          field_g = null;
          field_d = null;
          field_k = null;
          field_f = null;
          return;
        }
    }

    final byte[] a(boolean param0) {
        byte[] var2 = null;
        byte[] var3 = null;
        if (param0) {
          return null;
        } else {
          var3 = new byte[((hf) this).field_e.capacity()];
          var2 = var3;
          java.nio.Buffer discarded$4 = ((hf) this).field_e.position(0);
          java.nio.ByteBuffer discarded$5 = ((hf) this).field_e.get(var3);
          return var3;
        }
    }

    hf() {
    }

    final void a(byte[] param0, byte param1) {
        int var3 = -63 % ((-59 - param1) / 55);
        ((hf) this).field_e = java.nio.ByteBuffer.allocateDirect(param0.length);
        java.nio.Buffer discarded$0 = ((hf) this).field_e.position(0);
        java.nio.ByteBuffer discarded$1 = ((hf) this).field_e.put(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = 0;
        field_k = new char[]{(char)91, (char)93, (char)35};
        field_h = new char[128];
    }
}
