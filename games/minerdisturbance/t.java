/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class t extends ni {
    static String field_d;
    private java.nio.ByteBuffer field_e;
    static volatile int field_c;

    final void a(byte param0, byte[] param1) {
        try {
            int var3_int = 33 % ((param0 - -54) / 63);
            ((t) this).field_e = java.nio.ByteBuffer.allocateDirect(param1.length);
            java.nio.Buffer discarded$0 = ((t) this).field_e.position(0);
            java.nio.ByteBuffer discarded$1 = ((t) this).field_e.put(param1);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "t.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(int param0) {
        field_d = null;
        if (param0 != 0) {
            t.b(56);
        }
    }

    final static void a(boolean param0, String param1) {
        wc.field_b = true;
        oh.field_F = param0 ? true : false;
        sj.field_h = new rg(mb.field_b, cn.field_g, param1, gd.field_B, oh.field_F);
        try {
            mb.field_b.b(1, (fe) (Object) sj.field_h);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "t.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + 0 + ')');
        }
    }

    final byte[] a(int param0) {
        byte[] var2 = null;
        byte[] var3 = null;
        var3 = new byte[((t) this).field_e.capacity()];
        var2 = var3;
        if (param0 != 3006) {
          ((t) this).field_e = null;
          java.nio.Buffer discarded$8 = ((t) this).field_e.position(0);
          java.nio.ByteBuffer discarded$9 = ((t) this).field_e.get(var3);
          return var3;
        } else {
          java.nio.Buffer discarded$10 = ((t) this).field_e.position(0);
          java.nio.ByteBuffer discarded$11 = ((t) this).field_e.get(var3);
          return var3;
        }
    }

    t() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Confirm Password: ";
        field_c = 0;
    }
}
