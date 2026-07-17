/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ku extends af {
    private java.nio.ByteBuffer field_d;
    static int field_h;
    static java.awt.Frame field_f;
    static String field_g;
    static int[] field_e;

    public static void c(int param0) {
        if (param0 <= 42) {
          ku.c(-67);
          field_e = null;
          field_f = null;
          field_g = null;
          return;
        } else {
          field_e = null;
          field_f = null;
          field_g = null;
          return;
        }
    }

    final void a(byte param0, byte[] param1) {
        try {
            ((ku) this).field_d = java.nio.ByteBuffer.allocateDirect(param1.length);
            java.nio.Buffer discarded$6 = ((ku) this).field_d.position(0);
            if (param0 != 56) {
                Object var4 = null;
                ((ku) this).a((byte) -3, (byte[]) null);
            }
            java.nio.ByteBuffer discarded$7 = ((ku) this).field_d.put(param1);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "ku.C(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final byte[] b(int param0) {
        byte[] var4 = new byte[((ku) this).field_d.capacity()];
        byte[] var2 = var4;
        java.nio.Buffer discarded$0 = ((ku) this).field_d.position(0);
        int var3 = -63 % ((-63 - param0) / 63);
        java.nio.ByteBuffer discarded$1 = ((ku) this).field_d.get(var4);
        return var4;
    }

    final byte[] a(int param0, int param1, int param2) {
        byte[] var4 = null;
        byte[] var5 = null;
        java.nio.Buffer discarded$6 = ((ku) this).field_d.position(param1);
        var5 = new byte[param2];
        var4 = var5;
        if (param0 != -19920) {
          field_g = null;
          java.nio.ByteBuffer discarded$7 = ((ku) this).field_d.get(var5, 0, param2);
          return var5;
        } else {
          java.nio.ByteBuffer discarded$8 = ((ku) this).field_d.get(var5, 0, param2);
          return var5;
        }
    }

    ku() {
    }

    static {
    }
}
