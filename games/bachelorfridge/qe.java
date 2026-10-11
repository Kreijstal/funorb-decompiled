/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qe {
    private int field_n;
    private int field_e;
    private int field_f;
    private int field_s;
    private int field_a;
    private int field_m;
    private int field_i;
    private int field_g;
    private float field_c;
    private ila field_j;
    private int field_h;
    private boolean field_k;
    static boolean field_l;
    private int field_b;
    private int field_t;
    private int field_u;
    static String field_d;
    private int field_p;
    private int field_r;
    private int field_o;
    static int[] field_q;

    final kg c(byte param0) {
        this.field_t = nn.field_b;
        this.field_f = dda.field_j;
        this.field_j.a(this.field_b, (byte) 19, this.field_m);
        daa.field_vb = false;
        kg var2 = mfa.a(true, this.field_m, 0, this.field_b, ju.field_r, 0);
        if (var2 == null) {
          this.a(true);
        }
        int var3 = -24 / ((param0 + 30) / 54);
        return var2;
    }

    final void a(boolean param0, int param1, int param2) {
        if (param0) {
          return;
        }
        this.field_e = param2;
        this.field_i = param1;
    }

    final boolean b(int param0) {
        if (param0 != -8455) {
          this.a(true);
          if (this.field_g > aja.field_o) {
            return false;
          }
          if (dm.field_f > 0) {
            return true;
          }
          return false;
        }
        if (this.field_g > aja.field_o) {
          return false;
        }
        if (dm.field_f > 0) {
          return true;
        }
        return false;
    }

    public static void a(byte param0) {
        field_d = null;
        field_q = null;
        int var1 = 101 / ((param0 - 34) / 50);
    }

    private final void a(int param0) {
        int var2;
        int var3;
        int var5;
        int var4;
        int var4Lifetime1;
        var5 = BachelorFridge.field_y;
        var2 = this.field_i;
        var3 = this.field_e;
        if (!this.b(-8455)) {
          this.field_k = false;
          return;
        }
        if (param0 != 33) {
          return;
        }
        if (this.field_o >= var2) {
          if (var2 < this.field_n) {
            var2 = this.field_n;
          }
        } else {
          var2 = this.field_o;
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_u < var3) {
          var3 = this.field_u;
        } else {
          if (this.field_r > var3) {
            var3 = this.field_r;
            decompiledFrameRemainder0 = !(!(0.0f < this.field_c));
            if (decompiledFrameRemainder0) {
              var4 = (int)(0.5f + (float)var3 * this.field_c);
              if (var4 > var2) {
                var3 = (int)((float)var2 / this.field_c);
              } else {
                if (var4 < var2) {
                  var2 = var4;
                }
              }
              if (var2 != dda.field_j) {
                this.field_j.a(var3, (byte) 19, var2);
              } else {
                if (var3 != nn.field_b) {
                  this.field_j.a(var3, (byte) 19, var2);
                }
              }
              if (this.field_i > 0) {
                qw.field_d = (this.field_i - dda.field_j) / 2;
              }
              return;
            }
          }
        }
        if ((decompiledFrameRemainder0) &&
          (0.0f < this.field_c)) {
          var4Lifetime1 = (int)(0.5f + (float)var3 * this.field_c);
          if (var4Lifetime1 <= var2) {
            if (var4Lifetime1 < var2) {
              var2 = var4Lifetime1;
            }
          } else {
            var3 = (int)((float)var2 / this.field_c);
          }
        }
        if (var2 != dda.field_j) {
          this.field_j.a(var3, (byte) 19, var2);
        } else {
          if (var3 != nn.field_b) {
            this.field_j.a(var3, (byte) 19, var2);
          }
        }
        if (this.field_i > 0) {
          qw.field_d = (this.field_i - dda.field_j) / 2;
        }
    }

    final void a(boolean param0) {
        if (param0) {
          this.field_j.a(this.field_t, (byte) 19, this.field_f);
          return;
        }
        this.field_m = 31;
        this.field_j.a(this.field_t, (byte) 19, this.field_f);
    }

    final void b(byte param0) {
        int fieldTemp$0 = 0;
        if (null != kga.field_c) {
          return;
        }
        if (dm.field_f <= 0) {
          this.field_k = false;
        }
        if (this.field_k) {
          fieldTemp$0 = this.field_p - 1;
          this.field_p = this.field_p - 1;
          if (0 < fieldTemp$0) {
            return;
          }
          this.field_p = this.field_a;
          if (aja.field_o < this.field_g) {
            this.field_k = false;
          } else {
            if (param0 != 106) {
              this.b(70);
            }
            this.a(param0 - 73);
          }
          return;
        }
        if (dda.field_j < this.field_i) {
          qw.field_d = (this.field_i - dda.field_j) / 2;
        } else {
          if (0 < this.field_i) {
            qw.field_d = 0;
          }
        }
        if (dda.field_j == this.field_h &&
          this.field_s == nn.field_b) {
          return;
        }
        this.field_j.a(this.field_s, (byte) 19, this.field_h);
    }

    private qe() throws Throwable {
        throw new Error();
    }

    static {
        field_d = "Service unavailable";
        field_q = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 9, 12, 16, 17, 18, 19, 28, 29, 31, 32, 33, 34, 35, 36, 37, 39, 40, 44, 51, 52, 53, 8};
    }
}
