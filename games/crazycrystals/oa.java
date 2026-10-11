/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oa {
    static int field_b;
    static ko field_e;
    private int field_h;
    private int field_a;
    private int field_m;
    private int field_k;
    private int field_j;
    private int field_l;
    private int field_p;
    private int field_r;
    private int field_g;
    private int field_d;
    private float field_n;
    private op field_q;
    private int field_i;
    private boolean field_c;
    private int field_f;
    private int field_o;

    private final void a(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime1Lifetime1;
        var5 = CrazyCrystals.field_B;
        if (param0 == 2) {
          var2 = this.field_h;
          var3 = this.field_f;
          if (!this.b(true)) {
            this.field_c = false;
            return;
          }
          if (this.field_d >= var3) {
            if (this.field_j > var3) {
              var3 = this.field_j;
            }
          } else {
            var3 = this.field_d;
          }
          boolean decompiledFrameRemainder1 = true;
          if (var2 <= this.field_p) {
            if (var2 >= this.field_k) {
              if (0.0f < this.field_n) {
                var4 = (int)(0.5f + this.field_n * (float)var3);
                if (var2 >= var4) {
                  if (var4 < var2) {
                    var2 = var4;
                  }
                } else {
                  var3 = (int)((float)var2 / this.field_n);
                }
              }
              decompiledFrameRemainder1 = false;
            }
            else {
              var2 = this.field_k;
            }
          } else {
            var2 = this.field_p;
          }
          if ((decompiledFrameRemainder1) &&
            (0.0f < this.field_n)) {
            var4Lifetime2 = (int)(0.5f + this.field_n * (float)var3);
            if (var2 < var4Lifetime2) {
              var3 = (int)((float)var2 / this.field_n);
            } else {
              if (var4Lifetime2 < var2) {
                var2 = var4Lifetime2;
              }
            }
          }
          if (ap.field_r != var2) {
            this.field_q.a(118, var3, var2);
          } else {
            if (var3 != rh.field_f) {
              this.field_q.a(118, var3, var2);
            }
          }
          if (this.field_h > 0) {
            ui.field_a = (this.field_h - ap.field_r) / 2;
          }
          return;
        }
        this.a(-86);
        var2Lifetime1 = this.field_h;
        var3Lifetime1 = this.field_f;
        if (!this.b(true)) {
          this.field_c = false;
          return;
        }
        if (this.field_d >= var3Lifetime1) {
          if (this.field_j > var3Lifetime1) {
            var3Lifetime1 = this.field_j;
          }
        } else {
          var3Lifetime1 = this.field_d;
        }
        boolean decompiledFrameRemainder0 = true;
        if (var2Lifetime1 <= this.field_p) {
          if (var2Lifetime1 >= this.field_k) {
            if (!(!(0.0f < this.field_n))) {
              var4Lifetime1 = (int)(0.5f + this.field_n * (float)var3Lifetime1);
              if (var2Lifetime1 >= var4Lifetime1) {
                if (var4Lifetime1 < var2Lifetime1) {
                  var2Lifetime1 = var4Lifetime1;
                }
              } else {
                var3Lifetime1 = (int)((float)var2Lifetime1 / this.field_n);
              }
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            var2Lifetime1 = this.field_k;
          }
        } else {
          var2Lifetime1 = this.field_p;
        }
        if ((decompiledFrameRemainder0) &&
          (0.0f < this.field_n)) {
          var4Lifetime1Lifetime1 = (int)(0.5f + this.field_n * (float)var3Lifetime1);
          if (var2Lifetime1 < var4Lifetime1Lifetime1) {
            var3Lifetime1 = (int)((float)var2Lifetime1 / this.field_n);
          } else {
            if (var4Lifetime1Lifetime1 < var2Lifetime1) {
              var2Lifetime1 = var4Lifetime1Lifetime1;
            }
          }
        }
        if (ap.field_r != var2Lifetime1) {
          this.field_q.a(118, var3Lifetime1, var2Lifetime1);
        } else {
          if (var3Lifetime1 != rh.field_f) {
            this.field_q.a(118, var3Lifetime1, var2Lifetime1);
          }
        }
        if (this.field_h > 0) {
          ui.field_a = (this.field_h - ap.field_r) / 2;
        }
        return;
    }

    final boolean b(boolean param0) {
        if (!param0) {
          this.a(true);
          if (this.field_l > jk.field_f) {
            return false;
          }
          if (mo.field_l > 0) {
            return true;
          }
          return false;
        }
        if (this.field_l > jk.field_f) {
          return false;
        }
        if (mo.field_l > 0) {
          return true;
        }
        return false;
    }

    final void a(boolean param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        if (ph.field_E != null) {
          return;
        }
        if (!param0) {
          return;
        }
        if (mo.field_l <= 0) {
          this.field_c = false;
          if (this.field_c) {
            fieldTemp$1 = this.field_i - 1;
            this.field_i = this.field_i - 1;
            if (fieldTemp$1 > 0) {
              return;
            }
            this.field_i = this.field_o;
            if (jk.field_f < this.field_l) {
              this.field_c = false;
            } else {
              this.a(2);
            }
            return;
          }
        } else {
          if (this.field_c) {
            fieldTemp$0 = this.field_i - 1;
            this.field_i = this.field_i - 1;
            if (fieldTemp$0 > 0) {
              return;
            }
            this.field_i = this.field_o;
            if (jk.field_f < this.field_l) {
              this.field_c = false;
            } else {
              this.a(2);
            }
            return;
          }
        }
        if (ap.field_r < this.field_h) {
          ui.field_a = (-ap.field_r + this.field_h) / 2;
        } else {
          if (0 < this.field_h) {
            ui.field_a = 0;
          }
        }
        if (this.field_r == ap.field_r &&
          rh.field_f == this.field_g) {
          return;
        }
        this.field_q.a(126, this.field_g, this.field_r);
    }

    final void a(byte param0) {
        if (param0 == 96) {
          this.field_q.a(117, this.field_m, this.field_a);
          return;
        }
        oa.b(-71);
        this.field_q.a(117, this.field_m, this.field_a);
    }

    public static void b(int param0) {
        field_e = null;
        int var1 = -115 / ((-37 - param0) / 57);
    }

    final void a(int param0, byte param1, int param2) {
        this.field_h = param2;
        this.field_f = param0;
        if (param1 < 18) {
          field_e = (ko) null;
        }
    }

    private oa() throws Throwable {
        throw new Error();
    }

    static {
    }
}
