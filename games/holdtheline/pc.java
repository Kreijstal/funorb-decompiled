/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class pc {
    static an field_n;
    int field_a;
    boolean field_k;
    int field_j;
    boolean field_g;
    int field_c;
    static ga field_b;
    static String field_i;
    int field_f;
    static int field_h;
    int field_m;
    private int field_d;
    static int[] field_l;
    static ah field_e;

    abstract void a(int param0, int param1);

    int a(boolean param0, int param1, int param2) {
        if (this.field_m > param2) {
          return -1;
        }
        if (this.field_f <= param2) {
          return -1;
        }
        if (this.field_j > param1) {
          return -1;
        }
        if (param0) {
          return 66;
        }
        int var4 = (param1 - this.field_j) / this.field_d;
        if (var4 >= this.field_a) {
          return -1;
        }
        return var4;
    }

    final void b(int param0) {
        int var2;
        int var3;
        int var2Lifetime1;
        int var2Lifetime2;
        var3 = HoldTheLine.field_D;
        if (param0 != 12515) {
          this.a(true, 122, -88);
        }
        if (gg.field_J != 0) {
          var2 = this.a(false, jb.field_U, lb.field_x);
          this.field_c = var2;
          if (var2 == -1) {
            this.field_k = false;
          } else {
            this.field_k = true;
            this.a(-(this.field_d * var2) + (jb.field_U - this.field_j), var2, gg.field_J, param0 ^ -12428, lb.field_x, false);
          }
          return;
        }
        if (rd.field_f != 0 &&
          this.field_k) {
          var2Lifetime1 = this.field_c;
          if (var2Lifetime1 == -1) {
            return;
          }
          this.a(-(this.field_d * var2Lifetime1) + rf.field_X - this.field_j, var2Lifetime1, rd.field_f, param0 - 12639, nc.field_g, true);
          return;
        }
        this.field_k = false;
        if (!na.field_k) {
          return;
        }
        var2Lifetime2 = this.a(false, rf.field_X, nc.field_g);
        if (var2Lifetime2 == -1 &&
          this.field_g) {
          return;
        }
        this.field_g = false;
        this.field_c = var2Lifetime2;
    }

    abstract void d(int param0, int param1);

    public static void c(int param0) {
        if (param0 == -1) {
          field_l = null;
          field_n = null;
          field_e = null;
          field_b = null;
          field_i = null;
          return;
        }
        pc.c(-52);
        field_l = null;
        field_n = null;
        field_e = null;
        field_b = null;
        field_i = null;
    }

    void b(int param0, int param1) {
        int var4 = HoldTheLine.field_D;
        if (param1 != -24489) {
          this.field_m = -80;
          if (aa.field_n == 96) {
            this.a(1, param0);
            return;
          }
          if (aa.field_n == 97) {
            this.d(108, param0);
            return;
          }
          if (aa.field_n == 84) {
            this.c(param0, -3565);
            return;
          }
          if (aa.field_n != 83) {
            return;
          }
          this.c(param0, -3565);
          return;
        }
        if (aa.field_n == 96) {
          this.a(1, param0);
          return;
        }
        if (aa.field_n == 97) {
          this.d(108, param0);
          return;
        }
        if (aa.field_n == 84) {
          this.c(param0, -3565);
          return;
        }
        if (aa.field_n != 83) {
          return;
        }
        this.c(param0, -3565);
    }

    void a(int param0, int param1, int param2, int param3, int param4, boolean param5) {
        int var8;
        int var7;
        int var7Lifetime1;
        var8 = HoldTheLine.field_D;
        if (!param5) {
          if (1 == param2) {
            this.c(param1, -3565);
          } else {
            this.a(1, param1);
          }
          r.field_b = cg.field_i;
        } else {
          r.field_b = r.field_b - 1;
          if (0 >= r.field_b) {
            if (1 != param2) {
              this.a(1, param1);
              r.field_b = ki.field_o;
              var7 = 14 % ((param3 + 51) / 46);
              return;
            }
            this.c(param1, -3565);
            r.field_b = ki.field_o;
          }
        }
        var7Lifetime1 = 14 % ((param3 + 51) / 46);
    }

    void a(boolean param0) {
        int var3 = HoldTheLine.field_D;
        if (!param0) {
          return;
        }
        if (this.field_k) {
          return;
        }
        if (aa.field_n == 98) {
          if (this.field_c <= 0) {
            this.field_c = this.field_a;
          }
          this.field_c = this.field_c - 1;
          this.field_g = true;
          return;
        }
        if (99 != aa.field_n) {
          if (this.field_c < 0) {
            return;
          }
          this.b(this.field_c, -24489);
          return;
        }
        this.field_c = this.field_c + 1;
        if (this.field_c >= this.field_a) {
          this.field_c = 0;
        } else {
          this.field_g = true;
          return;
        }
        this.field_g = true;
    }

    abstract void c(int param0, int param1);

    final void a(byte param0) {
        int var2 = 0;
        int var2Lifetime1;
        if (this.field_g) {
          var2 = -85 / ((param0 - 13) / 45);
          this.field_k = false;
          return;
        }
        this.field_c = -1;
        var2Lifetime1 = -85 / ((param0 - 13) / 45);
        this.field_k = false;
    }

    void a(int param0) {
        int var2;
        int var3;
        int var4;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        Object stackIn_6_0;
        boolean stackIn_6_3;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        Object stackIn_15_0;
        boolean stackIn_15_3;
        var4 = HoldTheLine.field_D;
        if (param0 == -55) {
          var2 = 0;
          var3 = this.field_j;
          while (var2 < this.field_a) {
            stackIn_5_1 = var3;
            stackIn_5_2 = var2;
            if (var2 != this.field_c) {
              stackIn_6_0 = this;
              stackIn_6_3 = false;
            } else {
              stackIn_6_0 = this;
              stackIn_6_3 = true;
            }
            this.a(stackIn_5_1, stackIn_5_2, stackIn_6_3, (byte) -124);
            var2++;
            var3 = var3 + this.field_d;
          }
        } else {
          this.field_a = 124;
          var2 = 0;
          var3 = this.field_j;
          while (var2 < this.field_a) {
            stackIn_14_1 = var3;
            stackIn_14_2 = var2;
            if (var2 != this.field_c) {
              stackIn_15_0 = this;
              stackIn_15_3 = false;
            } else {
              stackIn_15_0 = this;
              stackIn_15_3 = true;
            }
            this.a(stackIn_14_1, stackIn_14_2, stackIn_15_3, (byte) -124);
            var2++;
            var3 = var3 + this.field_d;
          }
        }
    }

    abstract void a(int param0, int param1, boolean param2, byte param3);

    protected pc() {
        this.field_g = true;
        this.field_c = 0;
    }

    pc(int param0, int param1, int param2, int param3, int param4) {
        this.field_g = true;
        this.field_c = 0;
        this.field_j = param3;
        this.field_d = param4;
        this.field_a = param0;
        this.field_m = param1;
        this.field_f = param2;
    }

    static {
        field_i = "This password contains your email address, and would be easy to guess";
        field_n = new an();
        field_e = new ah();
    }
}
