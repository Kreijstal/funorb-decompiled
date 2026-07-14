/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la extends be {
    private int field_r;
    static volatile int field_s;
    private nf field_n;
    static int[] field_p;
    static String field_q;
    static int field_o;

    final int d(int param0, int param1) {
        int var6 = TrackController.field_F ? 1 : 0;
        int var3 = ((la) this).field_r >> -1900129789;
        int var4 = 8 + -(((la) this).field_r & 7);
        int var5 = param0;
        ((la) this).field_r = ((la) this).field_r + param1;
        while (var4 < param1) {
            var3++;
            var5 = var5 + ((pf.field_c[var4] & ((la) this).field_j[var3]) << -var4 + param1);
            param1 = param1 - var4;
            var4 = 8;
        }
        if (param1 == var4) {
            var5 = var5 + (((la) this).field_j[var3] & pf.field_c[var4]);
        } else {
            var5 = var5 + (((la) this).field_j[var3] >> var4 + -param1 & pf.field_c[param1]);
        }
        return var5;
    }

    la(byte[] param0) {
        super(param0);
    }

    final void a(int param0, boolean param1, int param2, byte[] param3) {
        int var5 = 0;
        int var6 = 0;
        var6 = TrackController.field_F ? 1 : 0;
        var5 = 0;
        if (param1) {
          return;
        } else {
          L0: while (true) {
            if (var5 < param0) {
              ((la) this).field_k = ((la) this).field_k + 1;
              param3[var5 + param2] = (byte)(((la) this).field_j[((la) this).field_k] + -((la) this).field_n.c(127));
              var5++;
              continue L0;
            } else {
              return;
            }
          }
        }
    }

    final void g(byte param0) {
        ((la) this).field_k = (((la) this).field_r - -7) / 8;
        if (param0 <= -25) {
            return;
        }
        field_p = null;
    }

    final void a(byte param0, int[] param1) {
        if (param0 != -83) {
            return;
        }
        ((la) this).field_n = new nf(param1);
    }

    la(int param0) {
        super(param0);
    }

    public static void d(boolean param0) {
        if (param0) {
            return;
        }
        field_p = null;
        field_q = null;
    }

    final void h(byte param0) {
        ((la) this).field_r = 8 * ((la) this).field_k;
        if (param0 == 31) {
            return;
        }
        ((la) this).field_r = -2;
    }

    final void c(int param0, int param1) {
        ((la) this).field_k = ((la) this).field_k + 1;
        ((la) this).field_j[((la) this).field_k] = (byte)(((la) this).field_n.c(126) + param0);
        if (param1 == 7) {
            return;
        }
        ((la) this).g((byte) 52);
    }

    final int e(boolean param0) {
        if (param0) {
            Object var3 = null;
            ((la) this).a(-123, false, 4, (byte[]) null);
            ((la) this).field_k = ((la) this).field_k + 1;
            return ((la) this).field_j[((la) this).field_k] - ((la) this).field_n.c(125) & 255;
        }
        ((la) this).field_k = ((la) this).field_k + 1;
        return ((la) this).field_j[((la) this).field_k] - ((la) this).field_n.c(125) & 255;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = -1;
        field_p = new int[8192];
    }
}
