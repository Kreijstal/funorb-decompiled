/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DirectByteStorage extends ByteStorage {
    static int field_j;
    private java.nio.ByteBuffer buffer;
    static Archive field_i;
    static String field_k;
    static PlatformTaskDispatcher field_l;

    final void setBytes(byte[] param0, boolean param1) {
        try {
          this.buffer = java.nio.ByteBuffer.allocateDirect(param0.length);
          if (param1) {
            field_i = (Archive) null;
          }
          this.buffer.position(0);
          this.buffer.put(param0);
        } catch (RuntimeException runtimeException) {
          throw qk.wrapException((Throwable) ((Object) runtimeException), "nj.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final byte[] getBytes(boolean param0) {
        byte[] var4 = new byte[this.buffer.capacity()];
        byte[] var2 = var4;
        if (!param0) {
          this.buffer.position(0);
          this.buffer.get(var4);
          return var4;
        }
        byte[] var3 = (byte[]) null;
        this.setBytes((byte[]) null, true);
        this.buffer.position(0);
        this.buffer.get(var4);
        return var4;
    }

    public static void clearStaticReferences(int param0) {
        field_k = null;
        if (param0 != 0) {
          field_k = (String) null;
          field_l = null;
          field_i = null;
          return;
        }
        field_l = null;
        field_i = null;
    }

    DirectByteStorage() {
    }

    static {
        field_k = "members-only content";
    }
}
