/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bda extends lw {
    static String field_o;
    static String[] field_n;
    static sna[] field_m;
    static String field_p;
    static int field_l;

    public static void d(int param0) {
        field_o = null;
        if (param0 <= 0) {
          field_p = null;
          field_n = null;
          field_m = null;
          return;
        }
        field_l = -113;
        field_p = null;
        field_n = null;
        field_m = null;
    }

    final void a(int param0, byte param1) {
        int var4;
        var4 = BachelorFridge.field_y;
        if (param0 != 34) {
          if (param0 == 19) {
            this.b(1);
            this.c(param1 ^ 17);
          } else {
            if (param0 == 18 &&
              this.field_e >= 1) {
              fla.b(param1 + 23548);
            }
          }
        } else {
          if (0 == this.field_e) {
            this.b(1);
            this.c(101);
          }
          if (this.field_e == 1) {
            wf.field_x = true;
          }
          if (um.a(true) &&
            this.c((byte) 95)) {
            fla.b(23621);
          }
        }
        if (param1 == 73) {
          return;
        }
        this.a(-88, (byte) -14);
    }

    final void a(int param0) {
        int var2 = -102 % ((59 - param0) / 33);
        this.c(98);
    }

    final void a(byte param0) {
        if (param0 < 103) {
          return;
        }
        int var2 = (int)((1.0 - Math.cos((double)(vr.field_b * 4) * 3.141592653589793 / 100.0)) * 256.0);
        if (this.field_e != 1) {
          return;
        }
        vg.a(sia.field_j, 8640, 22997, 33000, var2 + 4096, 6480, 4096 + var2, sia.field_j.field_o << 3, sia.field_j.field_n << 3);
    }

    bda() {
        super(true, new String[]{ek.field_k, el.field_g}, au.field_a);
        this.field_c = new int[][]{new int[]{180, 160}, new int[]{180, 390}};
    }

    static {
        field_o = "Encouraging rule breaking";
        field_n = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
        field_p = "Please remove <%0> from your ignore list first.";
    }
}
