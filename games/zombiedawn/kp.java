/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kp extends rf {
    private java.nio.ByteBuffer field_e;
    static dj field_f;

    final static void a(int param0, byte param1) {
        ea.field_a = 1000000000L / (long)param0;
        if (param1 != 3) {
            field_f = null;
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
        Object var4 = null;
        if (param0 != 4) {
          var4 = null;
          ((kp) this).a(-113, (byte[]) null);
          ((kp) this).field_e = java.nio.ByteBuffer.allocateDirect(param1.length);
          java.nio.Buffer discarded$8 = ((kp) this).field_e.position(0);
          java.nio.ByteBuffer discarded$9 = ((kp) this).field_e.put(param1);
          return;
        } else {
          ((kp) this).field_e = java.nio.ByteBuffer.allocateDirect(param1.length);
          java.nio.Buffer discarded$10 = ((kp) this).field_e.position(0);
          java.nio.ByteBuffer discarded$11 = ((kp) this).field_e.put(param1);
          return;
        }
    }

    kp() {
    }

    final byte[] a(byte param0) {
        byte[] var2 = null;
        byte[] var3 = null;
        var3 = new byte[((kp) this).field_e.capacity()];
        var2 = var3;
        if (param0 != -116) {
          byte[] discarded$10 = ((kp) this).a((byte) 9);
          java.nio.Buffer discarded$11 = ((kp) this).field_e.position(0);
          java.nio.ByteBuffer discarded$12 = ((kp) this).field_e.get(var3);
          return var3;
        } else {
          java.nio.Buffer discarded$13 = ((kp) this).field_e.position(0);
          java.nio.ByteBuffer discarded$14 = ((kp) this).field_e.get(var3);
          return var3;
        }
    }

    static {
    }
}
