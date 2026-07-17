/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bh extends gf {
    static boolean[][] field_h;
    static String field_m;
    private java.nio.ByteBuffer field_j;
    static int field_k;
    static String field_i;
    static String field_n;
    static String field_l;

    bh() {
    }

    final static boolean b(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        Object var3 = null;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        var1 = (Object) (Object) mc.field_r;
        synchronized (var1) {
          L0: {
            L1: {
              if (param0 >= 105) {
                break L1;
              } else {
                var3 = null;
                bh.a(42, (hf) null, -69);
                break L1;
              }
            }
            if (ln.field_p == qn.field_p) {
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0 != 0;
            } else {
              ke.field_a = gn.field_z[qn.field_p];
              nj.field_f = fm.field_d[qn.field_p];
              qn.field_p = 1 + qn.field_p & 127;
              stackOut_7_0 = 1;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            }
          }
        }
        return stackIn_8_0 != 0;
    }

    final byte[] b(int param0) {
        byte[] var2 = null;
        byte[] var3 = null;
        var3 = new byte[((bh) this).field_j.capacity()];
        var2 = var3;
        java.nio.Buffer discarded$19 = ((bh) this).field_j.position(0);
        java.nio.ByteBuffer discarded$20 = ((bh) this).field_j.get(var3);
        if (param0 != 32) {
          return null;
        } else {
          return var3;
        }
    }

    public static void a(byte param0) {
        field_h = null;
        field_l = null;
        field_i = null;
        field_m = null;
        field_n = null;
    }

    final static void a(int param0, hf param1, int param2) {
        try {
            int var3_int = 113 / ((59 - param0) / 39);
            dh.field_a.a(22125, (fa) (Object) param1);
            id.a((byte) -109, param1, param2);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "bh.E(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final void a(byte[] param0, boolean param1) {
        try {
            ((bh) this).field_j = java.nio.ByteBuffer.allocateDirect(param0.length);
            if (!param1) {
                field_m = null;
            }
            java.nio.Buffer discarded$0 = ((bh) this).field_j.position(0);
            java.nio.ByteBuffer discarded$1 = ((bh) this).field_j.put(param0);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "bh.C(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "to return to the normal view.";
        field_i = "The following settings need to be changed:  ";
        field_l = "Honour";
    }
}
