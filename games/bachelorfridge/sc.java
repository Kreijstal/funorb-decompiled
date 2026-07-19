/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sc extends lw {
    static String field_n;
    static String field_l;
    static int[] field_o;
    static nv field_m;

    final void a(byte param0) {
        int var2 = 0;
        var2 = (int)((1.0 - Math.cos((double)(vr.field_b * 4) * 3.141592653589793 / 100.0)) * 256.0);
        if (param0 <= 103) {
          this.a(48, (byte) -20);
          vg.a(sia.field_j, 8640, 22997, 32000, var2 + 4096, 6400, var2 + 4096, sia.field_j.field_o << 2021307907, sia.field_j.field_n << 1265191587);
          return;
        } else {
          vg.a(sia.field_j, 8640, 22997, 32000, var2 + 4096, 6400, var2 + 4096, sia.field_j.field_o << 2021307907, sia.field_j.field_n << 1265191587);
          return;
        }
    }

    final void a(int param0) {
        int var2 = 26 % ((59 - param0) / 33);
        this.c(126);
    }

    final void a(int param0, byte param1) {
        L0: {
          if (param0 == 39) {
            this.b(1);
            fla.b(23621);
            mka.field_j = true;
            pka.field_f = true;
            iaa.field_a = true;
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 != 73) {
          sc.d(-97);
          return;
        } else {
          return;
        }
    }

    sc() {
        super(true, new String[]{rn.field_t}, ls.field_d);
        this.field_c = new int[][]{new int[]{170, 160}};
    }

    public static void d(int param0) {
        field_o = null;
        field_l = null;
        field_n = null;
        field_m = null;
        if (param0 != -31258) {
            field_l = (String) null;
        }
    }

    static {
        field_l = "If you do nothing the game will revert to normal view in <%0> seconds.";
    }
}
