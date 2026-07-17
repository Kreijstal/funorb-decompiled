/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ie extends qu {
    private java.nio.ByteBuffer field_g;
    static int[] field_i;
    static jea field_h;
    static hja[] field_f;

    public static void b(int param0) {
        field_i = null;
        if (param0 != -13170) {
            ie.b(98);
            field_f = null;
            field_h = null;
            return;
        }
        field_f = null;
        field_h = null;
    }

    final byte[] a(boolean param0) {
        byte[] var2 = null;
        byte[] var3 = null;
        if (param0) {
          return null;
        } else {
          var3 = new byte[((ie) this).field_g.capacity()];
          var2 = var3;
          java.nio.Buffer discarded$4 = ((ie) this).field_g.position(0);
          java.nio.ByteBuffer discarded$5 = ((ie) this).field_g.get(var3);
          return var3;
        }
    }

    final void a(boolean param0, byte[] param1) {
        ((ie) this).field_g = java.nio.ByteBuffer.allocateDirect(param1.length);
        if (!param0) {
            return;
        }
        try {
            java.nio.Buffer discarded$0 = ((ie) this).field_g.position(0);
            java.nio.ByteBuffer discarded$1 = ((ie) this).field_g.put(param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "ie.C(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final byte[] a(byte param0, int param1, int param2) {
        byte[] var4 = null;
        byte[] var5 = null;
        var5 = new byte[param1];
        var4 = var5;
        java.nio.Buffer discarded$21 = ((ie) this).field_g.position(param2);
        java.nio.ByteBuffer discarded$22 = ((ie) this).field_g.get(var5, 0, param1);
        if (param0 > -103) {
          field_f = null;
          return var5;
        } else {
          return var5;
        }
    }

    ie() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new int[8192];
    }
}
