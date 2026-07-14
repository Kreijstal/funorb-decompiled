/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class al extends sh {
    int field_C;
    la field_D;
    static ej[] field_x;
    static int[][] field_A;
    byte[] field_y;
    static int field_z;

    final byte[] e(int param0) {
        if (((al) this).field_v) {
          throw new RuntimeException();
        } else {
          if (param0 != 2) {
            int discarded$2 = ((al) this).f(34);
            return ((al) this).field_y;
          } else {
            return ((al) this).field_y;
          }
        }
    }

    final int f(int param0) {
        if (param0 != 100) {
            return -32;
        }
        if (!(!((al) this).field_v)) {
            return 0;
        }
        return 100;
    }

    public static void c(byte param0) {
        if (param0 < 3) {
            al.c((byte) 59);
            field_A = null;
            field_x = null;
            return;
        }
        field_A = null;
        field_x = null;
    }

    final static void b(int param0, boolean param1) {
        cj.field_i = 1000000000L / (long)param0;
        if (!param1) {
            field_x = null;
        }
    }

    final static void c(boolean param0) {
        Object var2 = null;
        wk.a((String) null, -105, mj.field_d);
        if (param0) {
            field_A = null;
        }
    }

    final static Boolean d(byte param0) {
        Boolean var1 = bd.field_k;
        bd.field_k = null;
        if (param0 != -48) {
            return null;
        }
        return var1;
    }

    final static nf a(lj param0, int param1, int param2, lj param3, int param4) {
        int var5 = 0;
        if (!lk.a(160, param0, param2, param1)) {
          return null;
        } else {
          var5 = 69 / ((param4 - -78) / 40);
          return gl.a(param3.c(param2, param1, 0), (byte) 110);
        }
    }

    al() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = new int[][]{new int[1], new int[1], new int[1], new int[1], new int[1], new int[2]};
        field_x = new ej[14];
        field_z = -2;
    }
}
