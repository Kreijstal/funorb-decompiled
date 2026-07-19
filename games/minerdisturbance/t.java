/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class t extends ni {
    static String field_d;
    private java.nio.ByteBuffer field_e;
    static volatile int field_c;

    final void a(byte param0, byte[] param1) {
        java.nio.Buffer discarded$0 = null;
        java.nio.ByteBuffer discarded$1 = null;
        try {
            int var3_int = 33 % ((param0 - -54) / 63);
            this.field_e = java.nio.ByteBuffer.allocateDirect(param1.length);
            discarded$0 = this.field_e.position(0);
            discarded$1 = this.field_e.put(param1);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "t.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(int param0) {
        field_d = null;
        if (param0 != 0) {
            t.b(56);
        }
    }

    final static void a(boolean param0, String param1, int param2) {
        wc.field_b = true;
        oh.field_F = param0 ? true : false;
        sj.field_h = new rg(mb.field_b, cn.field_g, param1, gd.field_B, oh.field_F);
        if (param2 != 0) {
            return;
        }
        try {
            mb.field_b.b(1, sj.field_h);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "t.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final byte[] a(int param0) {
        java.nio.Buffer discarded$8 = null;
        java.nio.ByteBuffer discarded$9 = null;
        java.nio.Buffer discarded$10 = null;
        java.nio.ByteBuffer discarded$11 = null;
        byte[] var2 = null;
        byte[] var3 = null;
        var3 = new byte[this.field_e.capacity()];
        var2 = var3;
        if (param0 != 3006) {
          this.field_e = (java.nio.ByteBuffer) null;
          discarded$8 = this.field_e.position(0);
          discarded$9 = this.field_e.get(var3);
          return var3;
        } else {
          discarded$10 = this.field_e.position(0);
          discarded$11 = this.field_e.get(var3);
          return var3;
        }
    }

    t() {
    }

    static {
        field_d = "Confirm Password: ";
        field_c = 0;
    }
}
