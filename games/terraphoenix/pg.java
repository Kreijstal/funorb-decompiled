/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pg {
    int[] field_c;
    static int field_f;
    int[] field_a;
    int[] field_e;
    int[] field_b;
    String field_d;
    int[] field_g;

    final static void a(float param0, boolean param1, String param2, int param3) {
        if (vi.field_n == null) {
            vi.field_n = new na(jl.field_I, m.field_e);
            jl.field_I.a((gl) (vi.field_n), (byte) -1);
        }
        vi.field_n.a((byte) 60, param1, param2, param0);
        l.a();
        if (param3 <= 53) {
            return;
        }
        try {
            oi.a(-22417, true);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "pg.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    pg(int param0) {
        int var2 = 0;
        this.field_c = new int[3];
        this.field_e = new int[3];
        this.field_a = new int[3];
        this.field_b = new int[3];
        this.field_g = new int[3];
        var2 = param0;
        if (-1 == (var2 ^ -1)) {
          this.field_c[0] = 30;
          this.field_d = ab.field_h;
          this.field_g[0] = 0;
          this.field_a[0] = 40;
          this.field_c[1] = 35;
          this.field_g[1] = 5;
          this.field_a[1] = 45;
          this.field_c[2] = 40;
          this.field_g[2] = 5;
          this.field_a[2] = 50;
          this.field_e[0] = 30;
          this.field_e[1] = 45;
          this.field_e[2] = 60;
          return;
        } else {
          if ((var2 ^ -1) == -2) {
            this.field_d = ab.field_j;
            this.field_c[0] = 30;
            this.field_g[0] = 4;
            this.field_c[1] = 35;
            this.field_a[0] = 45;
            this.field_g[1] = 6;
            this.field_c[2] = 45;
            this.field_a[1] = 48;
            this.field_g[2] = 8;
            this.field_a[2] = 64;
            this.field_e[0] = 35;
            this.field_e[1] = 50;
            this.field_e[2] = 64;
            return;
          } else {
            if (2 == var2) {
              this.field_c[0] = 70;
              this.field_d = kk.field_c;
              this.field_g[0] = 30;
              this.field_c[1] = 80;
              this.field_a[0] = 45;
              this.field_g[1] = 40;
              this.field_a[1] = 48;
              this.field_c[2] = 90;
              this.field_g[2] = 50;
              this.field_a[2] = 64;
              this.field_e[1] = 50;
              this.field_e[0] = 35;
              this.field_e[2] = 64;
              return;
            } else {
              if ((var2 ^ -1) == -4) {
                this.field_d = gm.field_a;
                this.field_c[0] = 45;
                this.field_g[0] = 10;
                this.field_a[0] = 50;
                this.field_c[1] = 50;
                this.field_g[1] = 20;
                this.field_c[2] = 60;
                this.field_a[1] = 53;
                this.field_g[2] = 40;
                this.field_b[1] = 40;
                this.field_b[0] = 40;
                this.field_a[2] = 70;
                this.field_b[2] = 40;
                this.field_e[1] = 55;
                this.field_e[0] = 40;
                this.field_e[2] = 70;
                return;
              } else {
                if ((var2 ^ -1) == -5) {
                  this.field_c[0] = 80;
                  this.field_d = qe.field_g;
                  this.field_g[0] = 35;
                  this.field_c[1] = 90;
                  this.field_a[0] = 60;
                  this.field_g[1] = 45;
                  this.field_a[1] = 65;
                  this.field_c[2] = 100;
                  this.field_g[2] = 65;
                  this.field_a[2] = 80;
                  this.field_b[1] = 40;
                  this.field_b[0] = 40;
                  this.field_e[1] = 65;
                  this.field_e[0] = 45;
                  this.field_b[2] = 40;
                  this.field_e[2] = 85;
                  return;
                } else {
                  if ((var2 ^ -1) == -6) {
                    this.field_d = fa.field_c;
                    this.field_c[0] = 55;
                    this.field_g[0] = 35;
                    this.field_a[0] = 55;
                    this.field_c[1] = 60;
                    this.field_g[1] = 45;
                    this.field_c[2] = 70;
                    this.field_a[1] = 58;
                    this.field_g[2] = 65;
                    this.field_b[1] = 40;
                    this.field_b[0] = 40;
                    this.field_a[2] = 74;
                    this.field_b[2] = 40;
                    this.field_e[1] = 75;
                    this.field_e[0] = 50;
                    this.field_e[2] = 80;
                    return;
                  } else {
                    if (-7 == (var2 ^ -1)) {
                      this.field_d = qd.field_j;
                      this.field_c[0] = 60;
                      this.field_g[0] = 30;
                      this.field_a[0] = 60;
                      this.field_c[1] = 65;
                      this.field_g[1] = 50;
                      this.field_a[1] = 65;
                      this.field_c[2] = 70;
                      this.field_g[2] = 80;
                      this.field_a[2] = 80;
                      this.field_b[1] = 40;
                      this.field_b[0] = 40;
                      this.field_b[2] = 40;
                      this.field_e[0] = 55;
                      this.field_e[1] = 80;
                      this.field_e[2] = 90;
                      return;
                    } else {
                      if ((var2 ^ -1) == -8) {
                        this.field_c[2] = 20;
                        this.field_d = vh.field_n;
                        this.field_g[2] = 0;
                        this.field_c[1] = 20;
                        this.field_a[2] = 40;
                        this.field_g[1] = 0;
                        this.field_a[1] = 40;
                        this.field_c[0] = 20;
                        this.field_g[0] = 0;
                        this.field_a[0] = 40;
                        this.field_e[2] = 40;
                        this.field_e[1] = 40;
                        this.field_e[0] = 40;
                        return;
                      } else {
                        if ((var2 ^ -1) == -9) {
                          this.field_d = qk.field_g;
                          this.field_c[0] = 120;
                          this.field_g[0] = 100;
                          this.field_c[1] = 110;
                          this.field_a[0] = 100;
                          this.field_g[1] = 90;
                          this.field_c[2] = 100;
                          this.field_a[1] = 100;
                          this.field_g[2] = 80;
                          this.field_e[0] = 100;
                          this.field_e[1] = 90;
                          this.field_a[2] = 100;
                          this.field_e[2] = 80;
                          return;
                        } else {
                          if ((var2 ^ -1) == -10) {
                            this.field_d = tb.field_x;
                            this.field_c[0] = 10;
                            this.field_g[0] = 0;
                            this.field_c[1] = 10;
                            this.field_a[0] = 30;
                            this.field_g[1] = 0;
                            this.field_c[2] = 10;
                            this.field_a[1] = 45;
                            this.field_g[2] = 0;
                            this.field_a[2] = 60;
                            this.field_e[1] = 45;
                            this.field_e[0] = 30;
                            this.field_e[2] = 60;
                            return;
                          } else {
                            return;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    static {
    }
}
