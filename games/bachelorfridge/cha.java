/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cha extends lw {
    static rga field_m;
    static String field_l;

    cha() {
        super(true, new String[]{ng.field_n, fp.field_t, mu.field_b, oe.field_d}, fi.field_o);
        this.field_c = new int[][]{new int[]{80, 20}, new int[]{320, 380}, new int[]{330, 380}, new int[]{320, 400}};
    }

    final void a(int param0) {
        int var2 = -13 / ((59 - param0) / 33);
        this.c(117);
        bfa.field_a = true;
    }

    public static void d(int param0) {
        field_l = null;
        if (param0 != -30518) {
          cha.d(59);
          field_m = null;
          return;
        }
        field_m = null;
    }

    final void a(byte param0) {
        int var2 = 0;
        int var2Lifetime1;
        if (param0 < 103) {
          cha.d(-74);
          var2 = (int)((-Math.cos((double)(4 * vr.field_b) * 3.141592653589793 / 100.0) + 1.0) * 256.0);
          if (this.field_e == 0) {
            vg.a(sia.field_j, 7520, 22997, 1000, var2 + 4096, 1840, 4096 + var2, sia.field_j.field_o << 3, sia.field_j.field_n << 3);
            return;
          }
          return;
        }
        var2Lifetime1 = (int)((-Math.cos((double)(4 * vr.field_b) * 3.141592653589793 / 100.0) + 1.0) * 256.0);
        if (this.field_e != 0) {
          return;
        }
        vg.a(sia.field_j, 7520, 22997, 1000, var2Lifetime1 + 4096, 1840, 4096 + var2Lifetime1, sia.field_j.field_o << 3, sia.field_j.field_n << 3);
    }

    final void a(int param0, byte param1) {
        int var4;
        var4 = BachelorFridge.field_y;
        if (param1 == 73) {
          if (this.field_e == 0 &&
            11 == param0) {
            this.c(param1 ^ 43);
            return;
          }
          if (34 == param0) {
            if (this.field_e != 3) {
              return;
            }
            this.b((byte) 112);
            return;
          }
          if (this.field_e == 0 &&
            param0 == 16) {
            this.b(1);
            this.c(98);
            pea.d((byte) 120);
            return;
          }
          if (this.field_e == 1 &&
            17 == param0) {
            this.b(1);
            this.c(81);
            gi.field_a = true;
            return;
          }
          if (this.field_e != 2) {
            if (param0 != 37) {
              return;
            }
            if (this.field_e != 3) {
              return;
            }
            fla.b(23621);
            this.c(125);
            return;
          }
        } else {
          this.a(26);
          if (this.field_e != 0) {
            if (34 == param0) {
              if (this.field_e != 3) {
                return;
              }
              this.b((byte) 112);
              return;
            }
            if (this.field_e == 0 &&
              param0 == 16) {
              this.b(1);
              this.c(98);
              pea.d((byte) 120);
              return;
            }
            if (this.field_e != 1) {
              if (this.field_e == 2 &&
                param0 == 18) {
                this.b(1);
                gla.field_k = true;
                return;
              }
              if (param0 != 37) {
                return;
              }
              if (this.field_e != 3) {
                return;
              }
              fla.b(23621);
              this.c(125);
              return;
            }
            if (17 == param0) {
              this.b(1);
              this.c(81);
              gi.field_a = true;
              return;
            }
            if (this.field_e != 2) {
              if (param0 != 37) {
                return;
              }
              if (this.field_e != 3) {
                return;
              }
              fla.b(23621);
              this.c(125);
              return;
            }
          } else {
            if (11 == param0) {
              this.c(param1 ^ 43);
              return;
            }
            if (34 == param0) {
              if (this.field_e != 3) {
                return;
              }
              this.b((byte) 112);
              return;
            }
            if (this.field_e != 0) {
              if (this.field_e == 1 &&
                17 == param0) {
                this.b(1);
                this.c(81);
                gi.field_a = true;
                return;
              }
              if (this.field_e == 2 &&
                param0 == 18) {
                this.b(1);
                gla.field_k = true;
                return;
              }
              if (param0 == 37 &&
                this.field_e == 3) {
                fla.b(23621);
                this.c(125);
                return;
              }
              return;
            }
            if (param0 == 16) {
              this.b(1);
              this.c(98);
              pea.d((byte) 120);
              return;
            }
            if (this.field_e != 1) {
              if (this.field_e == 2 &&
                param0 == 18) {
                this.b(1);
                gla.field_k = true;
                return;
              }
              if (param0 == 37 &&
                this.field_e == 3) {
                fla.b(23621);
                this.c(125);
                return;
              }
              return;
            }
            if (17 == param0) {
              this.b(1);
              this.c(81);
              gi.field_a = true;
              return;
            }
            if (this.field_e != 2) {
              if (param0 == 37 &&
                this.field_e == 3) {
                fla.b(23621);
                this.c(125);
                return;
              }
              return;
            }
          }
        }
        if (param0 == 18) {
          this.b(1);
          gla.field_k = true;
        } else {
          if (param0 == 37 &&
            this.field_e == 3) {
            fla.b(23621);
            this.c(125);
          }
        }
    }

    static {
        field_m = new rga();
    }
}
