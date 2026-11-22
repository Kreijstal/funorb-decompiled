/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DirectByteStorage extends ByteStorage {
    static tg[] field_d;
    static int field_f;
    static int field_c;
    static int field_b;
    static int[] field_e;
    private java.nio.ByteBuffer buffer;

    final byte[] getBytes(int param0) {
        byte[] var3 = new byte[this.buffer.capacity()];
        byte[] var2 = var3;
        this.buffer.position(param0);
        this.buffer.get(var3);
        return var3;
    }

    DirectByteStorage() {
    }

    final void setBytes(byte param0, byte[] param1) {
        try {
          this.buffer = java.nio.ByteBuffer.allocateDirect(param1.length);
          if (param0 != 68) {
            this.buffer = (java.nio.ByteBuffer) null;
          }
          this.buffer.position(0);
          this.buffer.put(param1);
        } catch (RuntimeException runtimeException) {
          throw CipherPacketBuffer.a((Throwable) ((Object) runtimeException), "de.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void clearStaticReferences(int param0) {
        field_d = null;
        if (param0 != 11041) {
          return;
        }
        field_e = null;
    }

    static {
    }
}
