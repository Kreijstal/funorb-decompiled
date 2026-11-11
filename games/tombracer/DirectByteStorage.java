/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DirectByteStorage extends ByteStorage {
    private java.nio.ByteBuffer field_g;
    static int[] field_i;
    static UiComponent field_h;
    static IndexedSprite[] field_f;

    public static void releaseStatics(int param0) {
        field_i = null;
        if (param0 != -13170) {
          DirectByteStorage.releaseStatics(98);
          field_f = null;
          field_h = null;
          return;
        }
        field_f = null;
        field_h = null;
    }

    final byte[] toByteArray(boolean param0) {
        byte[] var3 = null;
        if (!param0) {
          var3 = new byte[this.field_g.capacity()];
          byte[] var2 = var3;
          this.field_g.position(0);
          this.field_g.get(var3);
          return var3;
        }
        return (byte[]) null;
    }

    final void setBytes(boolean param0, byte[] param1) {
        this.field_g = java.nio.ByteBuffer.allocateDirect(param1.length);
        if (!param0) {
          return;
        }
        try {
          this.field_g.position(0);
          this.field_g.put(param1);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "ie.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final byte[] getBytes(byte param0, int param1, int param2) {
        byte[] var5 = new byte[param1];
        byte[] var4 = var5;
        this.field_g.position(param2);
        this.field_g.get(var5, 0, param1);
        if (param0 <= -103) {
          return var5;
        }
        field_f = (IndexedSprite[]) null;
        return var5;
    }

    DirectByteStorage() {
    }

    static {
        field_i = new int[8192];
    }
}
