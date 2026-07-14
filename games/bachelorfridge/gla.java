/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gla extends nu {
    static kv field_j;
    private java.nio.ByteBuffer field_i;
    static boolean field_k;

    public static void a(byte param0) {
        field_j = null;
        if (param0 != -62) {
            Object var2 = null;
            cj discarded$0 = gla.a((lu) null, (byte) -126);
        }
    }

    final static cj a(lu param0, byte param1) {
        if (param1 != -19) {
            field_j = null;
            return (cj) (Object) new vg(param0);
        }
        return (cj) (Object) new vg(param0);
    }

    final byte[] a(boolean param0) {
        byte[] var2 = null;
        byte[] var3 = null;
        var3 = new byte[((gla) this).field_i.capacity()];
        var2 = var3;
        if (param0) {
          ((gla) this).field_i = null;
          java.nio.Buffer discarded$8 = ((gla) this).field_i.position(0);
          java.nio.ByteBuffer discarded$9 = ((gla) this).field_i.get(var3);
          return var3;
        } else {
          java.nio.Buffer discarded$10 = ((gla) this).field_i.position(0);
          java.nio.ByteBuffer discarded$11 = ((gla) this).field_i.get(var3);
          return var3;
        }
    }

    final static void a(int param0, int param1, int param2, kv[] param3) {
        Object var5 = null;
        if (param0 > -97) {
          var5 = null;
          cj discarded$2 = gla.a((lu) null, (byte) 47);
          it.field_s = new lda(param3);
          fh.field_v = param2;
          lda.field_a = param1;
          oba.d(-1488922239);
          return;
        } else {
          it.field_s = new lda(param3);
          fh.field_v = param2;
          lda.field_a = param1;
          oba.d(-1488922239);
          return;
        }
    }

    gla() {
    }

    final void a(byte param0, byte[] param1) {
        ((gla) this).field_i = java.nio.ByteBuffer.allocateDirect(param1.length);
        java.nio.Buffer discarded$10 = ((gla) this).field_i.position(0);
        java.nio.ByteBuffer discarded$16 = ((gla) this).field_i.put(param1);
        if (param0 < 14) {
            Object var4 = null;
            cj discarded$17 = gla.a((lu) null, (byte) 36);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = true;
    }
}
