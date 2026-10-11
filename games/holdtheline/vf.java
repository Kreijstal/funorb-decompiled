/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vf extends hl {
    private int field_r;
    private int field_p;
    static de field_l;
    private float field_x;
    private int field_z;
    static boolean field_v;
    private int field_o;
    private int field_m;
    int field_i;
    static int field_t;
    private int field_A;
    private int field_y;
    static md field_j;
    static String field_u;
    private int field_n;
    private int field_k;
    int field_B;
    static int field_w;
    private int field_q;
    private int field_s;

    private final void a(int param0, byte param1, int param2) {
        this.field_B = param0;
        this.field_i = param2;
        this.field_r = this.field_i << 16;
        this.field_p = this.field_B << 16;
        if (param1 == 44) {
          this.a(true, 0);
          this.field_z = kj.b(param1 - 42, 500);
          return;
        }
    }

    final void d(byte param0) {
        int var3;
        int stackIn_7_0 = 0;
        int stackIn_15_0 = 0;
        int var2;
        if (param0 == -99) {
          var3 = this.field_m;
          if (3 == var3) {
            va.field_d[this.field_k][7 + this.field_s].a(this.field_x, param0 ^ -27887).a(this.field_B, this.field_i);
          } else {
            if (this.field_s >= 6) {
              stackIn_7_0 = 11 - this.field_s;
            } else {
              stackIn_7_0 = this.field_s;
            }
            var2 = stackIn_7_0;
            va.field_d[this.field_k][var2].a(this.field_x, 27788).a(this.field_B, this.field_i);
          }
        } else {
          field_l = (de) null;
          var3 = this.field_m;
          if (3 == var3) {
            va.field_d[this.field_k][7 + this.field_s].a(this.field_x, param0 ^ -27887).a(this.field_B, this.field_i);
          } else {
            if (this.field_s >= 6) {
              stackIn_15_0 = 11 - this.field_s;
            } else {
              stackIn_15_0 = this.field_s;
            }
            var2 = stackIn_15_0;
            va.field_d[this.field_k][var2].a(this.field_x, 27788).a(this.field_B, this.field_i);
          }
        }
    }

    private final void b(byte param0) {
        int var2;
        int var3;
        var3 = HoldTheLine.field_D;
        var2 = kj.b(2, 2240);
        if (param0 > -58) {
          return;
        }
        if (var2 < 640) {
          this.a(var2, (byte) 44, -50);
        } else {
          var2 -= 640;
          if (var2 < 480) {
            this.a(-50, (byte) 44, var2);
          } else {
            var2 -= 480;
            if (var2 >= 640) {
              this.a(640, (byte) 44, var2 - 640);
            } else {
              this.a(var2, (byte) 44, 480);
            }
          }
        }
        this.field_k = kj.b(2, 4);
    }

    final void g(int param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        int stackIn_4_0 = 0;
        int var2;
        int var3;
        int var2Lifetime1;
        var3 = HoldTheLine.field_D;
        int fieldTemp$0 = this.field_A - 1;
        this.field_A = this.field_A - 1;
        if (0 <= fieldTemp$0) {
          boolean decompiledFrameRemainder0 = true;
          var2 = this.field_m;
          if (0 == var2) {
            fieldTemp$1 = this.field_z - 1;
            this.field_z = this.field_z - 1;
            if (0 >= fieldTemp$1) {
              this.a((byte) 50);
            }
          } else {
            if (var2 != 2 &&
              1 != var2) {
              if ((var2 == 3)) {
                this.field_r = this.field_r + this.field_o;
                this.field_p = this.field_p + this.field_n;
                fieldTemp$2 = this.field_z - 1;
                this.field_z = this.field_z - 1;
                if (!(fieldTemp$2 > 0)) {
                  this.a(25500);
                  this.b((byte) -65);
                }
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              if (this.a(false)) {
                this.a((byte) 62);
              }
            }
          }
          this.field_i = this.field_r >> 16;
          if (param0 != -19895) {
            return;
          }
          this.field_B = this.field_p >> 16;
          return;
        }
        stackIn_4_0 = (this.field_m == 3) ? 7 : 11;
        var2Lifetime1 = stackIn_4_0;
        fieldTemp$3 = this.field_s + 1;
        this.field_s = this.field_s + 1;
        if (fieldTemp$3 < var2Lifetime1) {
          this.field_A = this.e(5);
          var2Lifetime1 = this.field_m;
          if (0 == var2Lifetime1) {
            fieldTemp$4 = this.field_z - 1;
            this.field_z = this.field_z - 1;
            if (0 >= fieldTemp$4) {
              this.a((byte) 50);
              this.field_i = this.field_r >> 16;
              if (param0 != -19895) {
                return;
              }
              this.field_B = this.field_p >> 16;
              return;
            }
          } else {
            if (var2Lifetime1 == 2) {
              if (this.a(false)) {
                this.a((byte) 62);
              }
            } else {
              if (1 == var2Lifetime1) {
                if (this.a(false)) {
                  this.a((byte) 62);
                }
              } else {
                if (var2Lifetime1 == 3) {
                  this.field_r = this.field_r + this.field_o;
                  this.field_p = this.field_p + this.field_n;
                  fieldTemp$5 = this.field_z - 1;
                  this.field_z = this.field_z - 1;
                  if (fieldTemp$5 <= 0) {
                    this.a(25500);
                    this.b((byte) -65);
                    this.field_i = this.field_r >> 16;
                    if (param0 != -19895) {
                      return;
                    }
                    this.field_B = this.field_p >> 16;
                    return;
                  }
                }
              }
            }
          }
        } else {
          this.field_s = 0;
          this.field_A = this.e(5);
          var2Lifetime1 = this.field_m;
          if (0 == var2Lifetime1) {
            fieldTemp$6 = this.field_z - 1;
            this.field_z = this.field_z - 1;
            if (0 >= fieldTemp$6) {
              this.a((byte) 50);
            }
            this.field_i = this.field_r >> 16;
            if (param0 != -19895) {
              return;
            }
            this.field_B = this.field_p >> 16;
            return;
          }
          if (var2Lifetime1 != 2 &&
            1 != var2Lifetime1) {
            if (var2Lifetime1 != 3) {
              this.field_i = this.field_r >> 16;
              if (param0 != -19895) {
                return;
              }
              this.field_B = this.field_p >> 16;
              return;
            }
            this.field_r = this.field_r + this.field_o;
            this.field_p = this.field_p + this.field_n;
            fieldTemp$7 = this.field_z - 1;
            this.field_z = this.field_z - 1;
            if (fieldTemp$7 <= 0) {
              this.a(25500);
              this.b((byte) -65);
            }
            this.field_i = this.field_r >> 16;
            if (param0 != -19895) {
              return;
            }
            this.field_B = this.field_p >> 16;
            return;
          }
          if (this.a(false)) {
            this.a((byte) 62);
          }
        }
        this.field_i = this.field_r >> 16;
        if (param0 != -19895) {
          return;
        }
        this.field_B = this.field_p >> 16;
        return;
    }

    private final void a(int param0) {
        if (param0 == 25500) {
          vb.a(param0 - 25551, bl.field_r.field_qb);
          p.a((byte) -61, this.field_B, this.field_i);
          p.a((byte) -61, this.field_B + 6, this.field_i);
          p.a((byte) -61, this.field_B - 6, this.field_i);
          p.a((byte) -61, this.field_B, this.field_i + 6);
          p.a((byte) -61, this.field_B, this.field_i - 6);
          ug.b(param0 - 25501);
          return;
        }
        this.a(-70);
        vb.a(param0 - 25551, bl.field_r.field_qb);
        p.a((byte) -61, this.field_B, this.field_i);
        p.a((byte) -61, this.field_B + 6, this.field_i);
        p.a((byte) -61, this.field_B - 6, this.field_i);
        p.a((byte) -61, this.field_B, this.field_i + 6);
        p.a((byte) -61, this.field_B, this.field_i - 6);
        ug.b(param0 - 25501);
    }

    public static void f(int param0) {
        field_l = null;
        if (param0 < 20) {
          vf.f(-50);
          field_u = null;
          return;
        }
        field_u = null;
    }

    private final void a(boolean param0, int param1) {
        this.field_m = param1;
        this.field_s = 0;
        this.field_A = this.e(5);
        if (!param0) {
          this.field_p = 114;
        }
    }

    final void a(ja param0, int param1, byte param2, int param3) {
        if (this.field_m == 3) {
          return;
        }
        try {
          if (param2 < 6) {
            this.c((byte) 80);
          }
          if (param0 != null) {
            param0.field_Sb = param0.field_Sb + 1;
          }
          this.a(true, 3);
          this.field_z = 4 * this.e(5);
          this.field_n = param1;
          this.field_o = param3;
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "vf.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean c(byte param0) {
        if (param0 <= -109) {
          return this.field_m != 3 ? true : false;
        }
        this.b((byte) 70);
        return this.field_m != 3 ? true : false;
    }

    private final int e(int param0) {
        if (param0 == 5) {
          return this.field_m == 3 ? 2 : 5;
        }
        field_t = -26;
        return this.field_m == 3 ? 2 : 5;
    }

    private final boolean a(boolean param0) {
        int var2 = this.field_m != 1 ? 4096 : 16384;
        int var3 = -(this.field_p >> 8) + (this.field_q << 8);
        int var4 = (this.field_y << 8) - (this.field_r >> 8);
        int var5 = pg.b(var4, 4805, var3);
        if (var5 < var2 >> 8) {
          return true;
        }
        if (!param0) {
          var4 = var4 * var2 / var5;
          var3 = var3 * var2 / var5;
          this.field_r = this.field_r + var4;
          this.field_p = this.field_p + var3;
          return false;
        }
        int discarded$0 = this.e(-93);
        var4 = var4 * var2 / var5;
        var3 = var3 * var2 / var5;
        this.field_r = this.field_r + var4;
        this.field_p = this.field_p + var3;
        return false;
    }

    private final void a(byte param0) {
        int var3 = HoldTheLine.field_D;
        int var2 = 56 % ((param0 - 9) / 40);
        do {
          this.field_q = kj.b(2, 640);
          this.field_y = kj.b(2, 480);
        } while (!bl.field_r.a(0, this.field_y, true, this.field_q));
        this.a(true, 1);
        this.field_x = (float)Math.atan2((double)(this.field_i - this.field_y), (double)(-this.field_B + this.field_q));
    }

    vf() {
        this.b((byte) -79);
    }

    static {
        field_u = "Kills";
        field_j = null;
    }
}
