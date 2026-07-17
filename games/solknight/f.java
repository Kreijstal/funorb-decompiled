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
            param1.addKeyListener((java.awt.event.KeyListener) (Object) i.field_J);
            if (param0 != 0) {
                Object var3 = null;
                f.a(24, (java.awt.Component) null);
            }
            param1.addFocusListener((java.awt.event.FocusListener) (Object) i.field_J);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "f.C(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    f() {
    }

    final void a(int param0, byte[] param1) {
        try {
            ((f) this).field_f = java.nio.ByteBuffer.allocateDirect(param1.length);
            java.nio.Buffer discarded$0 = ((f) this).field_f.position(param0);
            java.nio.ByteBuffer discarded$1 = ((f) this).field_f.put(param1);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "f.D(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public static void b() {
        field_e = null;
    }

    final byte[] a(int param0) {
        byte[] var2 = null;
        byte[] var3 = null;
        if (param0 < 26) {
          byte[] discarded$10 = ((f) this).a(-87);
          var3 = new byte[((f) this).field_f.capacity()];
          var2 = var3;
          java.nio.Buffer discarded$11 = ((f) this).field_f.position(0);
          java.nio.ByteBuffer discarded$12 = ((f) this).field_f.get(var3);
          return var3;
        } else {
          var3 = new byte[((f) this).field_f.capacity()];
          var2 = var3;
          java.nio.Buffer discarded$13 = ((f) this).field_f.position(0);
          java.nio.ByteBuffer discarded$14 = ((f) this).field_f.get(var3);
          return var3;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 0;
    }
}
