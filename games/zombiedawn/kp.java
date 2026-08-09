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
        try {
            if (param0 != 4) {
                byte[] var4 = (byte[]) null;
                this.a(-113, (byte[]) null);
            }
            this.field_e = java.nio.ByteBuffer.allocateDirect(param1.length);
            this.field_e.position(0);
            this.field_e.put(param1);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "kp.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    kp() {
    }

    final byte[] a(byte param0) {
        byte[] var2;
        byte[] var3;
        var3 = new byte[this.field_e.capacity()];
        var2 = var3;
        if (param0 != -116) {
          this.a((byte) 9);
          this.field_e.position(0);
          this.field_e.get(var3);
          return var3;
        } else {
          this.field_e.position(0);
          this.field_e.get(var3);
          return var3;
        }
    }

    static {
    }
}
