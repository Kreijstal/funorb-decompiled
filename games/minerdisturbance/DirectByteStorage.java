/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DirectByteStorage extends ByteStorage {
    static String field_d;
    private java.nio.ByteBuffer buffer;
    static volatile int field_c;

    final void setBytes(byte param0, byte[] param1) {
        try {
          int var3_int = 33 % ((param0 + 54) / 63);
          this.buffer = java.nio.ByteBuffer.allocateDirect(param1.length);
          this.buffer.position(0);
          this.buffer.put(param1);
        } catch (RuntimeException runtimeException) {
          throw lj.wrapClientException((Throwable) ((Object) runtimeException), "t.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void clearStaticReferences(int param0) {
        field_d = null;
        if (param0 != 0) {
          DirectByteStorage.clearStaticReferences(56);
        }
    }

    final static void a(boolean param0, String param1, int param2) {
        wc.field_b = true;
        oh.field_F = param0 ? true : false;
        sj.field_h = new rg(mb.field_b, Bzip2State.field_g, param1, MusicPatchPcmStream.field_B, oh.field_F);
        if (param2 != 0) {
          return;
        }
        try {
          mb.field_b.showDialog(1, sj.field_h);
        } catch (RuntimeException runtimeException) {
          throw lj.wrapClientException((Throwable) ((Object) runtimeException), "t.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final byte[] getBytes(int param0) {
        byte[] var3 = new byte[this.buffer.capacity()];
        byte[] var2 = var3;
        if (param0 == 3006) {
          this.buffer.position(0);
          this.buffer.get(var3);
          return var3;
        }
        this.buffer = (java.nio.ByteBuffer) null;
        this.buffer.position(0);
        this.buffer.get(var3);
        return var3;
    }

    DirectByteStorage() {
    }

    static {
        field_d = "Confirm Password: ";
        field_c = 0;
    }
}
