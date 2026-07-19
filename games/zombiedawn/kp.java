/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kp extends rf {
    private java.nio.ByteBuffer field_e;
    static dj field_f;

    final static void a(int param0, byte param1) {
        ea.field_a = 1000000000L / (long)param0;
        if (param1 != 3) {
            field_f = (dj) null;
        }
    }

    public static void b(byte param0) {
        if (param0 > -45) {
            kp.a(-104, (byte) -43);
            field_f = null;
            return;
        }
        field_f = null;
    }

    final void a(int param0, byte[] param1) {
        java.nio.Buffer discarded$0 = null;
        java.nio.ByteBuffer discarded$1 = null;
        try {
            if (param0 != 4) {
                byte[] var4 = (byte[]) null;
                this.a(-113, (byte[]) null);
            }
            this.field_e = java.nio.ByteBuffer.allocateDirect(param1.length);
            discarded$0 = this.field_e.position(0);
            discarded$1 = this.field_e.put(param1);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "kp.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    kp() {
    }

    final byte[] a(byte param0) {
        byte[] discarded$10 = null;
        java.nio.Buffer discarded$11 = null;
        java.nio.ByteBuffer discarded$12 = null;
        java.nio.Buffer discarded$13 = null;
        java.nio.ByteBuffer discarded$14 = null;
        byte[] var2 = null;
        byte[] var3 = null;
        var3 = new byte[this.field_e.capacity()];
        var2 = var3;
        if (param0 != -116) {
          discarded$10 = this.a((byte) 9);
          discarded$11 = this.field_e.position(0);
          discarded$12 = this.field_e.get(var3);
          return var3;
        } else {
          discarded$13 = this.field_e.position(0);
          discarded$14 = this.field_e.get(var3);
          return var3;
        }
    }

    static {
    }
}
