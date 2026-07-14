/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pi extends fh {
    static String field_h;
    private java.nio.ByteBuffer field_g;
    static String field_f;

    final static void a(int param0, int param1, int param2, int param3, qj[] param4, int param5, int param6, int param7, qj[] param8, int param9, int param10, int param11, qj[] param12, int param13, oh param14, int param15, int param16, int param17, int param18, oh param19, int param20) {
        if (param17 != 0) {
          return;
        } else {
          hf.a(param19, param5, param3, param10, false, param11, param20, param14, param15, param7, new na(param12), param0, param1, param2, new na(param8), param6, param13, param9, new na(param4), param18, param16);
          return;
        }
    }

    final void a(byte[] param0, int param1) {
        ((pi) this).field_g = java.nio.ByteBuffer.allocateDirect(param0.length);
        java.nio.Buffer discarded$12 = ((pi) this).field_g.position(0);
        java.nio.ByteBuffer discarded$19 = ((pi) this).field_g.put(param0);
        if (param1 != 13673) {
            Object var4 = null;
            ((pi) this).a((byte[]) null, -51);
        }
    }

    final byte[] b(byte param0) {
        byte[] var2 = null;
        Object var3 = null;
        byte[] var4 = null;
        if (param0 != -2) {
          var3 = null;
          ((pi) this).a((byte[]) null, -91);
          var4 = new byte[((pi) this).field_g.capacity()];
          var2 = var4;
          java.nio.Buffer discarded$8 = ((pi) this).field_g.position(0);
          java.nio.ByteBuffer discarded$9 = ((pi) this).field_g.get(var4);
          return var4;
        } else {
          var4 = new byte[((pi) this).field_g.capacity()];
          var2 = var4;
          java.nio.Buffer discarded$10 = ((pi) this).field_g.position(0);
          java.nio.ByteBuffer discarded$11 = ((pi) this).field_g.get(var4);
          return var4;
        }
    }

    public static void b(int param0) {
        if (param0 != 0) {
            pi.b(81);
            field_h = null;
            field_f = null;
            return;
        }
        field_h = null;
        field_f = null;
    }

    pi() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Unfortunately you are not eligible to create an account.";
        field_f = "CONGRATULATIONS!";
    }
}
