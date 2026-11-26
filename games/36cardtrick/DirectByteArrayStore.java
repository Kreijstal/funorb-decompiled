/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DirectByteArrayStore extends ByteArrayStore {
    private java.nio.ByteBuffer buffer;
    static boolean field_e;
    static int field_f;
    static AccountRequestState field_d;

    final void setBytes(byte[] param0, byte param1) {
        this.buffer = java.nio.ByteBuffer.allocateDirect(param0.length);
        if (param1 < 113) {
          return;
        }
        try {
          this.buffer.position(0);
          this.buffer.put(param0);
        } catch (RuntimeException runtimeException) {
          throw ma.wrapException((Throwable) ((Object) runtimeException), "ei.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final byte[] getBytes(byte param0) {
        byte[] var4 = new byte[this.buffer.capacity()];
        byte[] var2 = var4;
        if (param0 == 25) {
          this.buffer.position(0);
          this.buffer.get(var4);
          return var4;
        }
        byte[] var3 = (byte[]) null;
        this.setBytes((byte[]) null, (byte) -86);
        this.buffer.position(0);
        this.buffer.get(var4);
        return var4;
    }

    public static void clearDeclaredStaticReferences(int param0) {
        if (param0 != 0) {
          return;
        }
        field_d = null;
    }

    final static int c(int param0) {
        if (param0 != 0) {
          return 57;
        }
        ja.field_b.a((byte) -50);
        if (dg.field_H.b((byte) -125)) {
          return 0;
        }
        return kf.a(76);
    }

    DirectByteArrayStore() {
    }

    final static void a(int param0, uh param1, int param2) {
        w var3 = null;
        try {
          if (param0 >= -40) {
            field_d = (AccountRequestState) null;
          }
          var3 = na.field_r;
          var3.h(param2, 0);
          var3.writeByte(-9469, 5);
          var3.writeByte(-9469, 0);
          var3.writeShort(param1.field_g, 26040);
          var3.writeByte(-9469, param1.field_k);
          var3.writeByte(-9469, param1.field_h);
        } catch (RuntimeException runtimeException) {
          throw ma.wrapException((Throwable) ((Object) runtimeException), "ei.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
    }
}
