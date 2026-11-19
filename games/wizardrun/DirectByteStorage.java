/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DirectByteStorage extends ByteStorage {
    static MidiTrack field_j;
    static int field_h;
    private java.nio.ByteBuffer field_i;
    static byte[] field_f;
    static long field_g;

    final void putBytes(byte[] param0, int param1) {
        try {
          this.field_i = java.nio.ByteBuffer.allocateDirect(param0.length);
          this.field_i.position(0);
          int var3_int = -117 % ((param1 - 75) / 38);
          this.field_i.put(param0);
        } catch (RuntimeException runtimeException) {
          throw bd.wrapException((Throwable) ((Object) runtimeException), "kh.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_j = null;
        if (param0 != 0) {
          field_j = (MidiTrack) null;
          field_f = null;
          return;
        }
        field_f = null;
    }

    final byte[] getBytes(int param0) {
        int var2 = -11 / ((param0 + 78) / 47);
        byte[] var3 = new byte[this.field_i.capacity()];
        this.field_i.position(0);
        this.field_i.get(var3);
        return var3;
    }

    DirectByteStorage() {
    }

    static {
    }
}
