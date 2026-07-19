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
          field_f = (int[][]) null;
          field_h = null;
          field_g = null;
          field_d = null;
          field_k = null;
          field_f = (int[][]) null;
          return;
        } else {
          field_h = null;
          field_g = null;
          field_d = null;
          field_k = null;
          field_f = (int[][]) null;
          return;
        }
    }

    final byte[] a(boolean param0) {
        java.nio.Buffer discarded$4 = null;
        java.nio.ByteBuffer discarded$5 = null;
        byte[] var2 = null;
        byte[] var3 = null;
        if (param0) {
          return (byte[]) null;
        } else {
          var3 = new byte[this.field_e.capacity()];
          var2 = var3;
          discarded$4 = this.field_e.position(0);
          discarded$5 = this.field_e.get(var3);
          return var3;
        }
    }

    hf() {
    }

    final void a(byte[] param0, byte param1) {
        java.nio.Buffer discarded$0 = null;
        java.nio.ByteBuffer discarded$1 = null;
        try {
            int var3_int = -63 % ((-59 - param1) / 55);
            this.field_e = java.nio.ByteBuffer.allocateDirect(param0.length);
            discarded$0 = this.field_e.position(0);
            discarded$1 = this.field_e.put(param0);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "hf.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_j = 0;
        field_k = new char[]{(char)91, (char)93, (char)35};
        field_h = new char[128];
    }
}
