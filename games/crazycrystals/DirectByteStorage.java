/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DirectByteStorage extends ByteStorage {
    private java.nio.ByteBuffer buffer;
    static dl[] field_c;

    public static void clearStaticReferences(int param0) {
        if (param0 != 0) {
          field_c = (dl[]) null;
          field_c = null;
          return;
        }
        field_c = null;
    }

    final byte[] getBytes(int param0) {
        int var2 = 73 % ((-21 - param0) / 35);
        byte[] var3 = new byte[this.buffer.capacity()];
        this.buffer.position(0);
        this.buffer.get(var3);
        return var3;
    }

    final void setBytes(byte[] param0, int param1) {
        try {
          this.buffer = java.nio.ByteBuffer.allocateDirect(param0.length);
          this.buffer.position(0);
          int var3_int = 81 / ((-54 - param1) / 37);
          this.buffer.put(param0);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "af.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    DirectByteStorage() {
    }

    static {
    }
}
