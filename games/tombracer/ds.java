/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ds {
    private int[] field_e;
    static jpa field_g;
    static String field_k;
    static String field_l;
    private int[] field_b;
    private boolean[] field_i;
    static int[] field_f;
    private int[] field_p;
    static qla field_n;
    private int[] field_a;
    private int[] field_c;
    private int[] field_m;
    private int[] field_j;
    private boolean[] field_d;
    private int[] field_h;
    private int[] field_o;

    final void b(int param0, int param1, int param2) {
        ((ds) this).field_c[param0] = ((ds) this).field_c[param0] + param2;
        if (param1 != 65408) {
            this.e(-108, -74);
        }
    }

    private final void f(int param0, int param1) {
        ((ds) this).field_j[param1] = ((ds) this).field_j[param1] + 1;
        int var3 = 0;
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        if (param2 == -4) {
          var4 = param0;
          if (var4 != 7) {
            if (5 == var4) {
              this.e(-127, param1);
              this.d(param1, -98);
              return;
            } else {
              if (var4 == 12) {
                this.f(-112, param1);
                this.d(param1, -98);
                return;
              } else {
                if (var4 == 10) {
                  this.c(param1, -11);
                  this.d(param1, -98);
                  return;
                } else {
                  if (15 == var4) {
                    this.c(param1, -11);
                    this.d(param1, -98);
                    return;
                  } else {
                    if (var4 == 14) {
                      this.b(-5, param1);
                      this.d(param1, -98);
                      return;
                    } else {
                      if (var4 != 3) {
                        if (var4 == 4) {
                          this.b(-5, param1);
                          this.d(param1, -98);
                          return;
                        } else {
                          this.d(param1, -98);
                          return;
                        }
                      } else {
                        this.b(-5, param1);
                        this.d(param1, -98);
                        return;
                      }
                    }
                  }
                }
              }
            }
          } else {
            this.a(param1, 9266);
            this.d(param1, -98);
            return;
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, boolean param2) {
        if (!param2) {
            return;
        }
        ((ds) this).field_b[param0] = fh.a(((ds) this).field_b[param0], 1 << param1);
    }

    final static void a(byte param0, boolean param1) {
        int var2 = 0;
        var2 = 0;
        if (!lca.a(false)) {
          return;
        } else {
          bea.c(0, 0, bea.field_g, bea.field_a, 0, 192);
          wu.field_a.b(-108, 0, 0);
          return;
        }
    }

    final void d(int param0, int param1, int param2) {
        ((ds) this).field_e[param2] = ((ds) this).field_e[param2] + param0;
        int var4 = 41 % ((param1 - -34) / 36);
    }

    private final void e(int param0, int param1) {
        ((ds) this).field_h[param1] = ((ds) this).field_h[param1] + 1;
        if (param0 != -127) {
            ((ds) this).field_h = null;
        }
    }

    final void a(byte param0) {
        if (param0 < 42) {
            this.c(-107, 24);
        }
    }

    private final void c(int param0, int param1) {
        ((ds) this).field_a[param0] = ((ds) this).field_a[param0] + 1;
        if (param1 != -11) {
            ((ds) this).a(43, false);
        }
    }

    public static void a(boolean param0) {
        field_l = null;
        field_k = null;
        field_g = null;
        field_f = null;
        field_n = null;
    }

    private final void b(int param0, int param1) {
        ((ds) this).field_m[param1] = ((ds) this).field_m[param1] + 1;
    }

    private final void a(int param0, int param1) {
        ((ds) this).field_p[param0] = ((ds) this).field_p[param0] + 1;
    }

    final void a(int param0, byte param1, int param2) {
        ((ds) this).field_o[param0] = fh.a(((ds) this).field_o[param0], 1 << param2);
        if (param1 != -52) {
            ds.a(false);
        }
    }

    private final void d(int param0, int param1) {
        int var3 = 0;
        ((ds) this).field_i[param0] = true;
    }

    final static int c(int param0, int param1, int param2) {
        param2 = (127 & param1) * param2 >> 7;
        if (2 <= param2) {
          if (param2 <= 126) {
            return (param1 & 65408) + param2;
          } else {
            param2 = 126;
            return (param1 & 65408) + param2;
          }
        } else {
          param2 = 2;
          return (param1 & 65408) + param2;
        }
    }

    ds(int param0) {
        ((ds) this).field_j = new int[param0];
        ((ds) this).field_e = new int[param0];
        ((ds) this).field_p = new int[param0];
        ((ds) this).field_b = new int[param0];
        ((ds) this).field_m = new int[param0];
        ((ds) this).field_h = new int[param0];
        ((ds) this).field_d = new boolean[param0];
        ((ds) this).field_i = new boolean[param0];
        ((ds) this).field_a = new int[param0];
        ((ds) this).field_c = new int[param0];
        ((ds) this).field_o = new int[param0];
    }

    final void a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        if (param1) {
          return;
        } else {
          var3 = 0;
          L0: while (true) {
            if (((ds) this).field_d.length <= var3) {
              return;
            } else {
              if (var3 == param0) {
                var3++;
                var3++;
                var3++;
                continue L0;
              } else {
                ((ds) this).field_d[var3] = true;
                var3++;
                var3++;
                continue L0;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "+1 Idol";
        field_f = new int[8192];
        field_l = "Players: ";
    }
}
