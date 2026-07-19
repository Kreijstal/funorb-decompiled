/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class f extends rk {
    private java.nio.ByteBuffer field_f;
    static int field_d;
    static java.security.SecureRandom field_e;

    final static void a(int param0, java.awt.Component param1) {
        try {
            param1.setFocusTraversalKeysEnabled(false);
            param1.addKeyListener(i.field_J);
            if (param0 != 0) {
                java.awt.Component var3 = (java.awt.Component) null;
                f.a(24, (java.awt.Component) null);
            }
            param1.addFocusListener(i.field_J);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "f.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    f() {
    }

    final void a(int param0, byte[] param1) {
        java.nio.Buffer discarded$0 = null;
        java.nio.ByteBuffer discarded$1 = null;
        try {
            this.field_f = java.nio.ByteBuffer.allocateDirect(param1.length);
            discarded$0 = this.field_f.position(param0);
            discarded$1 = this.field_f.put(param1);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "f.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(int param0) {
        if (param0 != 0) {
            return;
        }
        field_e = null;
    }

    final byte[] a(int param0) {
        byte[] discarded$10 = null;
        java.nio.Buffer discarded$11 = null;
        java.nio.ByteBuffer discarded$12 = null;
        java.nio.Buffer discarded$13 = null;
        java.nio.ByteBuffer discarded$14 = null;
        byte[] var2 = null;
        byte[] var3 = null;
        if (param0 < 26) {
          discarded$10 = this.a(-87);
          var3 = new byte[this.field_f.capacity()];
          var2 = var3;
          discarded$11 = this.field_f.position(0);
          discarded$12 = this.field_f.get(var3);
          return var3;
        } else {
          var3 = new byte[this.field_f.capacity()];
          var2 = var3;
          discarded$13 = this.field_f.position(0);
          discarded$14 = this.field_f.get(var3);
          return var3;
        }
    }

    static {
        field_d = 0;
    }
}
