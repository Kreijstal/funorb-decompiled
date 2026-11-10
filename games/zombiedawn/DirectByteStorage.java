/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DirectByteStorage extends ByteStorage {
    private java.nio.ByteBuffer field_e;
    static Js5Archive field_f;

    final static void setTargetFrameRate(int param0, byte param1) {
        KeyHandlerHolder.field_a = 1000000000L / (long)param0;
        if (param1 != 3) {
          field_f = (Js5Archive) null;
        }
    }

    public static void releaseStatics(byte param0) {
        if (param0 > -45) {
          DirectByteStorage.setTargetFrameRate(-104, (byte) -43);
          field_f = null;
          return;
        }
        field_f = null;
    }

    final void setBytes(int param0, byte[] param1) {
        try {
          if (param0 != 4) {
            byte[] var4 = (byte[]) null;
            this.setBytes(-113, (byte[]) null);
          }
          this.field_e = java.nio.ByteBuffer.allocateDirect(param1.length);
          this.field_e.position(0);
          this.field_e.put(param1);
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "kp.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    DirectByteStorage() {
    }

    final byte[] getBytes(byte param0) {
        byte[] var3 = new byte[this.field_e.capacity()];
        byte[] var2 = var3;
        if (param0 == -116) {
          this.field_e.position(0);
          this.field_e.get(var3);
          return var3;
        }
        this.getBytes((byte) 9);
        this.field_e.position(0);
        this.field_e.get(var3);
        return var3;
    }

    static {
    }
}
