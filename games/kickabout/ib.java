/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ib extends wt implements vh {
    static String field_F;
    static String field_H;
    private fb field_G;
    static boolean field_E;
    static String field_B;
    static int[] field_C;
    private wi field_D;

    final void a(byte param0, fd param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        ((ib) this).field_D.field_y = ((ib) this).field_G.a((byte) -125).c(-24407) == he.field_yb ? true : false;
    }

    public final void a(int param0, wi param1, int param2, byte param3, int param4) {
        if (param3 < 64) {
            return;
        }
        if (!(((ib) this).field_G.a((byte) -125).c(-24407) == he.field_yb)) {
            return;
        }
        pu.a((byte) -113, ((ib) this).field_G.m(-1), ((ib) this).field_G.h((byte) 48), ((ib) this).field_G.l(85));
    }

    final static byte[] a(String param0, int param1) {
        if (param1 >= -79) {
            field_H = null;
            return up.field_m.a(param0, "", 120);
        }
        return up.field_m.a(param0, "", 120);
    }

    final void a(byte param0) {
        int var2 = 0;
        var2 = 250;
        ((ib) this).field_G.a(25, param0 + 119, -var2 + ((ib) this).field_n >> 905215457, 140, 20 + ((ib) this).field_i - 25 >> 122154785);
        ((ib) this).field_D.a(30, 1, 140 + (((ib) this).field_n - var2 >> 2047510913) + 10, 100, (20 + (((ib) this).field_i + -30) >> 2056528513) + 2);
        if (param0 != -118) {
          field_C = null;
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, (int) (char)param1, param2, param3);
        qo.field_k.a(kd.field_v, 4 + param2 - -((ib) this).field_t, 4 + qo.field_k.field_G + (((ib) this).field_g + param3), 16777215, -1);
    }

    ib(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3, (gj) null);
        ((ib) this).field_G = new fb((gj) (Object) new ri(10000536), field_E, 0, 0, 140, 25);
        ((ib) this).field_G.a(new hl(), -20274);
        ((ib) this).field_D = new wi(es.field_g, (jv) this);
        ((ib) this).field_w = new fd[]{(fd) (Object) ((ib) this).field_G, (fd) (Object) ((ib) this).field_D};
        ((ib) this).field_D.field_r = (gj) (Object) new op();
        ((ib) this).e(-1947);
    }

    public static void a(int param0) {
        field_F = null;
        field_B = null;
        field_H = null;
        if (param0 != 905215457) {
            ib.a(-67);
            field_C = null;
            return;
        }
        field_C = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = "user";
        field_B = "This is your RuneScape clan if you have one.";
        field_F = "Players: <%0>/<%1>";
        field_C = new int[8192];
    }
}
