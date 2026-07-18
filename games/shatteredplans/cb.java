/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cb extends le {
    private java.nio.ByteBuffer field_k;
    static pf field_h;
    static String field_g;
    static String field_m;
    static int[] field_f;
    static int[] field_o;
    static int[] field_i;
    static qr field_l;
    static int field_j;
    static int field_n;

    cb() {
    }

    final void a(byte[] param0, byte param1) {
        try {
            ((cb) this).field_k = java.nio.ByteBuffer.allocateDirect(param0.length);
            java.nio.Buffer discarded$6 = ((cb) this).field_k.position(0);
            if (param1 != 95) {
                cb.a((byte) -7);
            }
            java.nio.ByteBuffer discarded$7 = ((cb) this).field_k.put(param0);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "cb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean c(byte param0) {
        int var1 = 0;
        var1 = 72 / ((param0 - -17) / 62);
        if (bh.field_p != null) {
          if (!bh.field_p.b(-1)) {
            return false;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final static boolean b(byte param0) {
        if (param0 >= -112) {
            return true;
        }
        if (null == wg.field_f) {
            return false;
        }
        if (ih.field_f != cs.field_j) {
            return false;
        }
        return true;
    }

    public static void a(byte param0) {
        field_m = null;
        field_g = null;
        field_l = null;
        field_i = null;
        field_h = null;
        field_o = null;
        if (param0 != 104) {
          boolean discarded$2 = cb.c((byte) 27);
          field_f = null;
          return;
        } else {
          field_f = null;
          return;
        }
    }

    final byte[] a(boolean param0) {
        byte[] var2 = null;
        byte[] var3 = null;
        var3 = new byte[((cb) this).field_k.capacity()];
        var2 = var3;
        java.nio.Buffer discarded$9 = ((cb) this).field_k.position(0);
        if (param0) {
          return null;
        } else {
          java.nio.ByteBuffer discarded$10 = ((cb) this).field_k.get(var3);
          return var3;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Our territory currently has balanced production, so you should seek to acquire all resources equally.";
        field_g = "Show players in <%0>'s game";
        field_f = new int[4];
        field_j = 22;
        field_n = -1;
    }
}
