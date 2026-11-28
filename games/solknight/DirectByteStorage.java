/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DirectByteStorage extends ByteStorage {
    private java.nio.ByteBuffer buffer;
    static int field_d;
    static java.security.SecureRandom field_e;

    final static void attachKeyboardListeners(int param0, java.awt.Component param1) {
        try {
          param1.setFocusTraversalKeysEnabled(false);
          param1.addKeyListener(ModalDialogHost.field_J);
          if (param0 != 0) {
            java.awt.Component var3 = (java.awt.Component) null;
            DirectByteStorage.attachKeyboardListeners(24, (java.awt.Component) null);
          }
          param1.addFocusListener(ModalDialogHost.field_J);
        } catch (RuntimeException runtimeException) {
          throw MusicPatch.wrapClientException((Throwable) ((Object) runtimeException), "f.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    DirectByteStorage() {
    }

    final void setBytes(int param0, byte[] param1) {
        try {
          this.buffer = java.nio.ByteBuffer.allocateDirect(param1.length);
          this.buffer.position(param0);
          this.buffer.put(param1);
        } catch (RuntimeException runtimeException) {
          throw MusicPatch.wrapClientException((Throwable) ((Object) runtimeException), "f.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void clearStaticReferences(int param0) {
        if (param0 != 0) {
          return;
        }
        field_e = null;
    }

    final byte[] getBytes(int param0) {
        byte[] var3 = null;
        byte[] var2 = null;
        byte[] var3Lifetime1;
        byte[] var2Lifetime1;
        if (param0 >= 26) {
          var3 = new byte[this.buffer.capacity()];
          var2 = var3;
          this.buffer.position(0);
          this.buffer.get(var3);
          return var3;
        }
        this.getBytes(-87);
        var3Lifetime1 = new byte[this.buffer.capacity()];
        var2Lifetime1 = var3Lifetime1;
        this.buffer.position(0);
        this.buffer.get(var3Lifetime1);
        return var3Lifetime1;
    }

    static {
        field_d = 0;
    }
}
