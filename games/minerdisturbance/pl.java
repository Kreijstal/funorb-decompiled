/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pl {
    private int field_p;
    private int field_g;
    static int field_c;
    static int field_h;
    private int field_e;
    private int field_d;
    private int field_u;
    private float field_i;
    private int field_w;
    static String field_a;
    private int field_o;
    private int field_t;
    private int field_f;
    private int field_v;
    private int field_r;
    private int field_j;
    private int field_q;
    private boolean field_n;
    static int[] field_b;
    private mi field_l;
    private int field_s;
    static ea field_k;
    private int field_m;

    final void b(int param0) {
        if (param0 <= -81) {
          this.field_l.a(this.field_e, (byte) -64, this.field_q);
          return;
        }
        this.field_p = 8;
        this.field_l.a(this.field_e, (byte) -64, this.field_q);
    }

    final void a(boolean param0, int param1, int param2) {
        if (!param0) {
          this.field_r = param2;
          this.field_d = param1;
          return;
        }
        this.d(90);
        this.field_r = param2;
        this.field_d = param1;
    }

    final l a(byte param0) {
        l var2 = null;
        l var2Lifetime1;
        if (param0 == -70) {
          this.field_e = ml.field_a;
          this.field_q = nk.field_x;
          this.field_l.a(this.field_j, (byte) -53, this.field_u);
          fa.field_a = false;
          var2 = pe.a((byte) -89, this.field_u, 0, this.field_j, 0, qa.field_a);
          if (var2 == null) {
            this.b(-123);
          }
          return var2;
        }
        this.a(71);
        this.field_e = ml.field_a;
        this.field_q = nk.field_x;
        this.field_l.a(this.field_j, (byte) -53, this.field_u);
        fa.field_a = false;
        var2Lifetime1 = pe.a((byte) -89, this.field_u, 0, this.field_j, 0, qa.field_a);
        if (var2Lifetime1 == null) {
          this.b(-123);
        }
        return var2Lifetime1;
    }

    final boolean d(int param0) {
        if (param0 >= -116) {
          field_h = 12;
          if (ec.field_e < this.field_s) {
            return false;
          }
          if (pj.field_a > 0) {
            return true;
          }
          return false;
        }
        if (ec.field_e < this.field_s) {
          return false;
        }
        if (pj.field_a > 0) {
          return true;
        }
        return false;
    }

    private final void a(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var3Lifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        var5 = MinerDisturbance.field_ab;
        var2 = this.field_r;
        if (param0 == 2) {
          var3 = this.field_d;
          if (!this.d(-122)) {
            this.field_n = false;
            return;
          }
          if (this.field_p >= var2) {
            if (var2 < this.field_w) {
              var2 = this.field_w;
            }
          } else {
            var2 = this.field_p;
          }
          boolean decompiledFrameRemainder0 = true;
          if (this.field_f < var3) {
            var3 = this.field_f;
          } else {
            if (this.field_g > var3) {
              var3 = this.field_g;
              if (0.0f < this.field_i) {
                var4 = (int)(0.5f + (float)var3 * this.field_i);
                if (var4 <= var2) {
                  if (var4 < var2) {
                    var2 = var4;
                  }
                } else {
                  var3 = (int)((float)var2 / this.field_i);
                }
              }
              decompiledFrameRemainder0 = false;
            }
          }
          if ((decompiledFrameRemainder0) &&
            (0.0f < this.field_i)) {
            var4Lifetime3 = (int)(0.5f + (float)var3 * this.field_i);
            if (var4Lifetime3 > var2) {
              var3 = (int)((float)var2 / this.field_i);
            } else {
              if (var4Lifetime3 < var2) {
                var2 = var4Lifetime3;
              }
            }
          }
          if (nk.field_x != var2) {
            this.field_l.a(var3, (byte) -82, var2);
          } else {
            if (ml.field_a != var3) {
              this.field_l.a(var3, (byte) -82, var2);
            }
          }
          if (this.field_r > 0) {
            tg.field_f = (this.field_r - nk.field_x) / 2;
          }
          return;
        }
        this.field_f = 95;
        var3Lifetime1 = this.field_d;
        if (!this.d(-122)) {
          this.field_n = false;
          return;
        }
        if (this.field_p >= var2) {
          if (var2 < this.field_w) {
            var2 = this.field_w;
          }
        } else {
          var2 = this.field_p;
        }
        if (this.field_f < var3Lifetime1) {
          var3Lifetime1 = this.field_f;
        } else {
          if (this.field_g > var3Lifetime1) {
            var3Lifetime1 = this.field_g;
            if (!(0.0f < this.field_i)) {
              if (nk.field_x != var2) {
                this.field_l.a(var3Lifetime1, (byte) -82, var2);
              } else {
                if (ml.field_a != var3Lifetime1) {
                  this.field_l.a(var3Lifetime1, (byte) -82, var2);
                }
              }
              if (this.field_r > 0) {
                tg.field_f = (this.field_r - nk.field_x) / 2;
              }
              return;
            }
            var4Lifetime1 = (int)(0.5f + (float)var3Lifetime1 * this.field_i);
            if (var4Lifetime1 <= var2) {
              if (var4Lifetime1 < var2) {
                var2 = var4Lifetime1;
              }
            } else {
              var3Lifetime1 = (int)((float)var2 / this.field_i);
            }
            if (nk.field_x != var2) {
              this.field_l.a(var3Lifetime1, (byte) -82, var2);
            } else {
              if (ml.field_a != var3Lifetime1) {
                this.field_l.a(var3Lifetime1, (byte) -82, var2);
              }
            }
            if (this.field_r <= 0) {
              return;
            }
            tg.field_f = (this.field_r - nk.field_x) / 2;
            return;
          }
        }
        if (0.0f < this.field_i) {
          var4Lifetime2 = (int)(0.5f + (float)var3Lifetime1 * this.field_i);
          if (var4Lifetime2 > var2) {
            var3Lifetime1 = (int)((float)var2 / this.field_i);
            if (nk.field_x == var2 &&
              ml.field_a == var3Lifetime1) {
              if (this.field_r <= 0) {
                return;
              }
              tg.field_f = (this.field_r - nk.field_x) / 2;
              return;
            }
            this.field_l.a(var3Lifetime1, (byte) -82, var2);
            if (this.field_r > 0) {
              tg.field_f = (this.field_r - nk.field_x) / 2;
            }
            return;
          }
          if (var4Lifetime2 < var2) {
            var2 = var4Lifetime2;
          }
        }
        if (nk.field_x != var2) {
          this.field_l.a(var3Lifetime1, (byte) -82, var2);
        } else {
          if (ml.field_a != var3Lifetime1) {
            this.field_l.a(var3Lifetime1, (byte) -82, var2);
          }
        }
        if (this.field_r <= 0) {
          return;
        }
        tg.field_f = (this.field_r - nk.field_x) / 2;
        return;
    }

    final void c(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        if (null != kf.field_d) {
          return;
        }
        if (pj.field_a > 0) {
          if (this.field_n) {
            fieldTemp$0 = this.field_m - 1;
            this.field_m = this.field_m - 1;
            if (fieldTemp$0 > 0) {
              return;
            }
            if (param0 != 565) {
              return;
            }
            this.field_m = this.field_v;
            if (ec.field_e < this.field_s) {
              this.field_n = false;
            } else {
              this.a(2);
            }
            return;
          }
          if (this.field_r > nk.field_x) {
            tg.field_f = (-nk.field_x + this.field_r) / 2;
          } else {
            if (0 < this.field_r) {
              tg.field_f = 0;
            }
          }
          if (this.field_o == nk.field_x &&
            ml.field_a == this.field_t) {
            return;
          }
          this.field_l.a(this.field_t, (byte) -27, this.field_o);
          return;
        }
        this.field_n = false;
        if (!this.field_n) {
          if (this.field_r <= nk.field_x) {
            if (0 < this.field_r) {
              tg.field_f = 0;
            }
          } else {
            tg.field_f = (-nk.field_x + this.field_r) / 2;
          }
          if (this.field_o != nk.field_x) {
            this.field_l.a(this.field_t, (byte) -27, this.field_o);
          } else {
            if (ml.field_a != this.field_t) {
              this.field_l.a(this.field_t, (byte) -27, this.field_o);
            }
          }
          return;
        }
        fieldTemp$1 = this.field_m - 1;
        this.field_m = this.field_m - 1;
        if (fieldTemp$1 > 0) {
          return;
        }
        if (param0 != 565) {
          return;
        }
        this.field_m = this.field_v;
        if (ec.field_e < this.field_s) {
          this.field_n = false;
        } else {
          this.a(2);
        }
        return;
    }

    final static int b(byte param0) {
        if (param0 != -116) {
          field_a = (String) null;
          return (int)(1000000000L / rj.field_c);
        }
        return (int)(1000000000L / rj.field_c);
    }

    public static void e(int param0) {
        field_b = null;
        field_a = null;
        field_k = null;
        if (param0 != -26537) {
          pl.e(9);
        }
    }

    private pl() throws Throwable {
        throw new Error();
    }

    static {
        field_b = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
    }
}
