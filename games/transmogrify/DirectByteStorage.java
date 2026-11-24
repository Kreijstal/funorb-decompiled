/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DirectByteStorage extends ByteStorage {
    static String field_g;
    static int field_j;
    static char[] field_k;
    static char[] field_h;
    private java.nio.ByteBuffer buffer;
    static int[][] field_f;
    static int field_i;
    static Sprite[] field_d;

    public static void clearStaticReferences(byte param0) {
        if (param0 == 118) {
          field_h = null;
          field_g = null;
          field_d = null;
          field_k = null;
          field_f = (int[][]) null;
          return;
        }
        field_f = (int[][]) null;
        field_h = null;
        field_g = null;
        field_d = null;
        field_k = null;
        field_f = (int[][]) null;
    }

    final byte[] getBytes(boolean param0) {
        byte[] var3 = null;
        if (!param0) {
          var3 = new byte[this.buffer.capacity()];
          byte[] var2 = var3;
          this.buffer.position(0);
          this.buffer.get(var3);
          return var3;
        }
        return (byte[]) null;
    }

    DirectByteStorage() {
    }

    final void setBytes(byte[] param0, byte param1) {
        try {
          int var3_int = -63 % ((-59 - param1) / 55);
          this.buffer = java.nio.ByteBuffer.allocateDirect(param0.length);
          this.buffer.position(0);
          this.buffer.put(param0);
        } catch (RuntimeException runtimeException) {
          throw ch.wrapClientException((Throwable) ((Object) runtimeException), "hf.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_j = 0;
        field_k = new char[]{(char)91, (char)93, (char)35};
        field_h = new char[128];
    }
}
