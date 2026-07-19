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
        java.nio.Buffer discarded$6 = null;
        java.nio.ByteBuffer discarded$7 = null;
        try {
            this.field_k = java.nio.ByteBuffer.allocateDirect(param0.length);
            discarded$6 = this.field_k.position(0);
            if (param1 != 95) {
                cb.a((byte) -7);
            }
            discarded$7 = this.field_k.put(param0);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "cb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
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
        boolean discarded$2 = false;
        field_m = null;
        field_g = null;
        field_l = null;
        field_i = null;
        field_h = null;
        field_o = null;
        if (param0 != 104) {
          discarded$2 = cb.c((byte) 27);
          field_f = null;
          return;
        } else {
          field_f = null;
          return;
        }
    }

    final byte[] a(boolean param0) {
        java.nio.ByteBuffer discarded$10 = null;
        byte[] var2 = null;
        byte[] var3 = null;
        var3 = new byte[this.field_k.capacity()];
        var2 = var3;
        java.nio.Buffer discarded$9 = this.field_k.position(0);
        if (param0) {
          return (byte[]) null;
        } else {
          discarded$10 = this.field_k.get(var3);
          return var3;
        }
    }

    static {
        field_m = "Our territory currently has balanced production, so you should seek to acquire all resources equally.";
        field_g = "Show players in <%0>'s game";
        field_f = new int[4];
        field_j = 22;
        field_n = -1;
    }
}
