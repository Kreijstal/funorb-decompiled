/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DirectByteStorage extends ByteStorage {
    private java.nio.ByteBuffer buffer;
    static String field_b;

    DirectByteStorage() {
    }

    final static int a(boolean param0) {
        if (param0) {
          DirectByteStorage.clearSharedReferences(-109);
          return 495;
        }
        return 495;
    }

    final void setBytes(byte param0, byte[] param1) {
        if (param0 != -28) {
          return;
        }
        try {
          this.buffer = java.nio.ByteBuffer.allocateDirect(param1.length);
          this.buffer.position(0);
          this.buffer.put(param1);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "se.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final byte[] getRange(int param0, int param1, int param2) {
        byte[] var5 = new byte[param0];
        byte[] var4 = var5;
        this.buffer.position(param2);
        if (param1 <= -97) {
          this.buffer.get(var5, 0, param0);
          return var5;
        }
        DirectByteStorage.a(false);
        this.buffer.get(var5, 0, param0);
        return var5;
    }

    final byte[] getBytes(int param0) {
        byte[] var3 = new byte[this.buffer.capacity()];
        byte[] var2 = var3;
        this.buffer.position(0);
        this.buffer.get(var3);
        if (param0 == 3) {
          return var3;
        }
        return (byte[]) null;
    }

    public static void clearSharedReferences(int param0) {
        if (param0 != -27982) {
          return;
        }
        field_b = null;
    }

    static {
        field_b = "Zoom";
    }
}
