/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dg {
    int field_b;
    double field_c;
    static String field_k;
    double field_h;
    static uf field_e;
    int field_d;
    private int field_g;
    double field_j;
    static tg[] field_a;
    static String[] field_f;
    static String field_i;

    final void a(int param0, int param1) {
        int var3;
        int var4;
        int var5_int;
        double var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var3Lifetime4;
        boolean decompiledFrameRemainder0 = true;
        var9 = Bounce.field_N;
        var4 = this.field_d;
        if (var4 == 0) {
          if (this.field_b != 0) {
            kc.field_c.a((int)((double)param1 + this.field_c - 64.0), (int)this.field_h - od.field_f.field_s * (this.field_b + 2));
            var4 = param1 + (int)this.field_c;
            var5_int = -(od.field_f.field_s * (2 + this.field_b)) + (16 + ((int)this.field_h + 16));
            var5_int -= 64;
            var6 = od.field_f.b(hf.field_c);
            var7 = od.field_f.field_s;
            ii.a(var4, hf.field_c, var5_int, 16744512, param0 + 7);
            ve.a(8 + (var7 + 16), var5_int - 27, ig.field_d, (byte) -82, 8 + (var6 + 8), -8 + var4 - var6 / 2);
          } else {
            kc.field_c.a((int)((double)param1 + this.field_c - 64.0), (int)this.field_h);
          }
        } else {
          if (var4 != 1) {
            if (var4 != 2) {
              if (var4 != 3 &&
                var4 != 4) {
                if ((5 == var4)) {
                  if (this.field_b == 2) {
                    var3 = this.field_g * 4 / 256;
                    nk.field_h[var3].a((int)(-64.0 + (this.field_c + (double)param1)), (int)this.field_h);
                    var3Lifetime4 = this.field_g * 16 / 256 % 20;
                    if (var3Lifetime4 > 1) {
                      var3Lifetime4 = 0;
                    }
                    nl.field_d[var3Lifetime4].a((int)((double)param1 + this.field_c - 64.0), -16 + (int)this.field_h);
                  }
                  if (this.field_b == 0) {
                    var3Lifetime2 = 3 * this.field_g / 256;
                    wb.field_e[var3Lifetime2].a((int)(this.field_c + (double)param1 - 64.0), (int)this.field_h);
                  }
                  if ((this.field_b == 1)) {
                    var3Lifetime3 = this.field_g * 3 / 256;
                    bd.field_j[var3Lifetime3].a((int)(this.field_c + (double)param1 - 64.0), (int)this.field_h);
                  }
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                var3Lifetime1 = this.field_b * 6 / 256;
                if (4 == this.field_d) {
                  fd.field_n[var3Lifetime1].a((int)(-64.0 + (this.field_c + (double)param1)), (int)this.field_h);
                } else {
                  fd.field_n[var3Lifetime1].d((int)((double)param1 + this.field_c - 64.0), (int)this.field_h);
                }
              }
            } else {
              if (this.field_b < 16) {
                q.field_F.d((int)(-64.0 + (this.field_c + (double)param1)), (int)this.field_h, -(this.field_b * 16) + 256);
              }
              if (vh.a(0, (byte) 88)) {
                for (var4 = 0; 2 > var4; var4++) {
                  var5 = 3.14 * (double)var4 + (0.05 * this.field_h + this.field_c);
                  var7 = (int)(Math.abs(this.field_h) / 10.0 + (double)var4) % 4;
                  var8 = 16 + this.field_b;
                  uk.field_f[var7].a((int)(this.field_c + (double)param1 + Math.sin(var5) * (double)(4 * var8) - (double)(uk.field_f[var7].field_t / 2)), (int)(this.field_h + Math.cos((double)(1 + var4) * var5) * (double)var8 - (double)(4 * this.field_b)));
                }
              }
            }
          } else {
            if (0 >= this.field_b) {
              re.field_a.a((int)(-64.0 + ((double)param1 + this.field_c)), -re.field_a.field_q + (int)this.field_h + a.field_f.field_q);
            } else {
              a.field_f.a((int)(-64.0 + (this.field_c + (double)param1)), (int)this.field_h);
            }
          }
        }
        if (param0 != 1) {
          this.a(87, 11);
        }
    }

    public static void a(byte param0) {
        field_i = null;
        field_f = null;
        field_k = null;
        field_a = null;
        if (param0 != 64) {
          return;
        }
        field_e = null;
    }

    final void a(int param0) {
        int var2;
        int var3;
        var3 = Bounce.field_N;
        var2 = this.field_d;
        if (var2 != 0) {
          if (1 != var2) {
            if (var2 == 2) {
              this.field_j = this.field_h;
              if (this.field_b > 0) {
                if (16 < this.field_b) {
                  this.field_j = 580.0;
                }
                this.field_b = this.field_b + 1;
              }
            } else {
              if (3 != var2) {
                if (4 != var2) {
                  if (5 == var2) {
                    this.field_j = this.field_h;
                    this.field_g = this.field_g + 10;
                    if (this.field_g >= 256) {
                      this.field_g = this.field_g - 256;
                    }
                  } else {
                    if (var2 == 6) {
                      this.field_j = this.field_h;
                    }
                  }
                } else {
                  this.field_j = this.field_h;
                  this.field_b = this.field_b + 10;
                  if (this.field_b >= 256) {
                    this.field_b = this.field_b - 256;
                  }
                }
              } else {
                this.field_j = this.field_h;
                this.field_b = this.field_b + 10;
                if (this.field_b >= 256) {
                  this.field_b = this.field_b - 256;
                }
              }
            }
          } else {
            this.field_j = (double)(-re.field_a.field_q) + ((double)a.field_f.field_q + this.field_h);
            if (0 < this.field_b) {
              this.field_b = this.field_b + 1;
              this.field_j = (double)(-re.field_a.field_q) + (this.field_h + (double)a.field_f.field_q);
              if (this.field_b >= 24) {
                this.field_b = 0;
              }
            }
          }
        } else {
          this.field_j = this.field_h;
          if (this.field_b > 0) {
            this.field_j = this.field_j - (double)((2 + this.field_b) * od.field_f.field_s);
          }
        }
        if (param0 != -64) {
          field_e = (uf) null;
        }
    }

    final static void b(int param0) {
        hf.field_b = false;
        if (param0 != 16) {
          field_a = (tg[]) null;
        }
        jc.field_g.d((byte) -72);
    }

    final void a(int param0, int param1, double param2) {
        this.field_c = param2;
        this.field_h = 32.0 * Math.random() + 480.0;
        this.field_d = param1;
        this.field_b = 0;
        this.field_j = this.field_h;
        this.field_g = 0;
        if (this.field_d == 5) {
          this.field_b = (int)(Math.random() * 3.0);
        }
        if (param0 <= 23) {
          this.field_j = -0.44957444926435286;
        }
    }

    dg() {
        this.field_d = 0;
        this.field_c = 0.0;
        this.field_b = 0;
        this.field_h = 0.0;
        this.field_j = 0.0;
    }

    final static String a(int param0, char param1, int param2) {
        int var5 = Bounce.field_N;
        char[] var3 = new char[param0];
        int var4 = 0;
        if (param2 != -13810) {
          dg.b(32);
        }
        while (var4 < param0) {
          var3[var4] = param1;
          var4++;
        }
        return new String(var3);
    }

    static {
        field_k = "Error connecting to server. Please try using a different server.";
        field_e = new uf();
        field_f = new String[]{"By rating", "By win percentage"};
        field_i = "Player names can be up to 12 letters, numbers and underscores";
    }
}
