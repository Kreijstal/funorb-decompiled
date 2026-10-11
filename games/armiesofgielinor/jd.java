/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jd extends tc implements uo {
    int field_E;
    hr field_x;
    int field_ab;
    boolean field_eb;
    boolean field_Z;
    boolean field_U;
    int field_Y;
    static String field_n;
    int field_B;
    int field_N;
    private int field_k;
    int field_J;
    ha field_l;
    boolean field_I;
    boolean field_F;
    int field_fb;
    int field_m;
    int field_t;
    boolean field_D;
    static boolean field_L;
    int field_A;
    boolean field_u;
    int field_V;
    static String field_y;
    int field_o;
    int field_cb;
    int field_H;
    cl field_p;
    int[] field_R;
    static String field_T;
    int field_z;
    boolean field_C;
    boolean field_X;
    boolean field_S;
    private int field_db;
    int field_r;
    int field_q;
    int field_w;
    String field_K;
    int field_P;
    int field_O;
    int field_M;
    boolean field_W;
    boolean field_s;
    boolean field_G;
    boolean field_v;
    boolean field_bb;

    final boolean c(boolean param0) {
        if (param0) {
          this.field_bb = true;
        }
        return (1 & this.field_V) != 0 ? true : false;
    }

    final int a(boolean param0) {
        if (param0) {
          jd var3 = (jd) null;
          this.a((jd) null, (byte) 94);
        }
        return this.field_db;
    }

    final boolean p(byte param0) {
        if (param0 >= -94) {
          this.field_m = -85;
        }
        return (2 & bw.field_m[this.field_N][10]) > 0 ? true : false;
    }

    final int h(byte param0) {
        int var2 = 0;
        if (this.field_bb) {
          var2 = var2 | 256;
        }
        if (this.field_I) {
          var2 = var2 | 16;
        }
        if (this.field_W) {
          var2 = var2 | 8;
        }
        if (this.field_C) {
          var2 = var2 | 64;
        }
        if (this.field_F) {
          var2 = var2 | 32;
        }
        if (this.field_s) {
          var2 = var2 | 4;
        }
        if (this.field_D) {
          var2 = var2 | 512;
        }
        if (param0 < 96) {
          this.field_ab = -60;
        }
        var2 = var2 | 3 & this.field_B;
        return var2;
    }

    final boolean e(byte param0) {
        if (param0 < 73) {
          this.field_w = -27;
        }
        return this.field_N == 39 ? true : false;
    }

    final void c(int param0, int param1) {
        if (param1 != 8) {
          this.n((byte) 80);
        }
        if (this.field_x == null) {
          this.field_x = new hr(this.field_R, param0, this.field_fb);
        } else {
          this.field_x.a((byte) 59, param0);
        }
    }

    final boolean k(byte param0) {
        if (param0 < 75) {
          this.field_p = (cl) null;
        }
        return this.field_N == 27 ? true : false;
    }

    final void n(byte param0) {
        int stackIn_6_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_19_1 = 0;
        Object var3;
        int var4;
        jd var5;
        jd var6;
        jd var7;
        jd var8;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        if (0 < this.field_A) {
          this.field_l.field_l.a((byte) -119, (tc) (new st(this, 5)));
        }
        if (this.a(param0 ^ -23050)) {
          var3 = this;
          var4 = 0;
          var5 = this.field_l.c(((jd) (var3)).field_w, true, -1 + ((jd) (var3)).field_J);
          stackIn_6_0 = var4;
          if (var5 != null &&
            0 != (8 & bw.field_m[var5.field_N][10])) {
            stackIn_7_1 = 1;
          } else {
            stackIn_7_1 = 0;
          }
          var4Lifetime1 = stackIn_6_0 | stackIn_7_1;
          var6 = this.field_l.c(((jd) (var3)).field_w, true, 1 + ((jd) (var3)).field_J);
          stackIn_10_0 = var4Lifetime1;
          if (var6 != null &&
            (8 & bw.field_m[var6.field_N][10]) != 0) {
            stackIn_11_1 = 1;
          } else {
            stackIn_11_1 = 0;
          }
          var4Lifetime2 = stackIn_10_0 | stackIn_11_1;
          var7 = this.field_l.c(1 + ((jd) (var3)).field_w, true, ((jd) (var3)).field_J);
          stackIn_14_0 = var4Lifetime2;
          if (var7 != null &&
            (bw.field_m[var7.field_N][10] & 8) != 0) {
            stackIn_15_1 = 1;
          } else {
            stackIn_15_1 = 0;
          }
          var4Lifetime3 = stackIn_14_0 | stackIn_15_1;
          var8 = this.field_l.c(-1 + ((jd) (var3)).field_w, true, ((jd) (var3)).field_J);
          stackIn_18_0 = var4Lifetime3;
          if (var8 != null &&
            0 != (bw.field_m[var8.field_N][10] & 8)) {
            stackIn_19_1 = 1;
          } else {
            stackIn_19_1 = 0;
          }
          var4Lifetime4 = stackIn_18_0 | stackIn_19_1;
          if (var4Lifetime4 == 0) {
            this.field_l.field_l.a((byte) -119, (tc) (new st(this, 3)));
          }
        }
        if (this.field_I) {
          this.field_l.field_l.a((byte) -119, (tc) (new st(this, 2)));
        }
        if (param0 != -42) {
          jd.m(45);
        }
    }

    final int l(byte param0) {
        if (param0 != -79) {
          this.c((byte) -122);
        }
        int var2 = bw.field_m[this.field_N][6];
        if (this.field_W &&
          this.field_N == 34) {
          var2 = 2;
        }
        return var2;
    }

    final int j(int param0) {
        if (0 > this.field_r) {
          return -1;
        }
        if (param0 != 20640) {
          this.field_C = true;
        }
        return this.field_r >> 5;
    }

    final boolean i(int param0) {
        boolean stackIn_7_0 = false;
        if (param0 != -21428) {
          return false;
        }
        stackIn_7_0 = !((512 & bw.field_m[this.field_N][10]) <= 0) || (this.field_ab == 1);
        return stackIn_7_0;
    }

    final int d(int param0, int param1) {
        if (0 > this.field_r) {
          return 0;
        }
        int var3 = 62 / ((-23 - param1) / 63);
        return np.field_Vb[this.field_r & 31][param0];
    }

    final int g(byte param0) {
        if (param0 != 122) {
          return 34;
        }
        return this.field_Y + this.field_A;
    }

    final boolean n(int param0) {
        int var2;
        boolean stackIn_5_0 = false;
        var2 = 106 % ((80 - param0) / 34);
        stackIn_5_0 = !((bw.field_m[this.field_N][10] & 2048) <= 0) || (this.field_ab == 2);
        return stackIn_5_0;
    }

    final jd b(int param0, int param1) {
        this.e(-97);
        if (param1 != -1) {
          this.field_K = (String) null;
        }
        if (this.field_S) {
          return null;
        }
        if (this.field_Y + this.field_A == 0) {
          return null;
        }
        jd var3 = new jd(this.field_J, this.field_w, this.field_N, param0, this.field_t, this.field_Y, this.h((byte) 105), this.field_ab, this.field_A, this.field_l, this.field_P, this.field_o, this.field_r, false, this.field_cb);
        this.field_l.a(8288, var3);
        return var3;
    }

    final boolean p(int param0) {
        int var2;
        boolean stackIn_8_0 = false;
        var2 = -69 % ((3 - param0) / 46);
        stackIn_8_0 = (this.field_N == 58) || (this.field_N == 63) || (this.field_N == 59) || (this.field_N == 53) || (this.field_N == 43);
        return stackIn_8_0;
    }

    final int l(int param0) {
        int var2 = 0;
        if (!this.field_s) {
          var2 = var2 | 1;
        }
        if (0 < this.field_B) {
          var2 = var2 | 2;
        }
        if (this.field_I) {
          var2 = var2 | 4;
        }
        if (this.field_Z) {
          var2 = var2 | 8;
        }
        if (this.field_v) {
          var2 = var2 | 16;
        }
        if (this.field_eb) {
          var2 = var2 | 32;
        }
        if (this.field_F) {
          var2 = var2 | 64;
        }
        if (this.field_bb) {
          var2 = var2 | 128;
        }
        if (this.field_C) {
          var2 = var2 | 256;
        }
        if (param0 != -27014) {
          return 27;
        }
        if (-1 < this.field_r) {
          var2 = var2 | 512;
        }
        if (0 < this.field_o) {
          var2 = var2 | 1024;
        }
        if (this.field_ab != 0) {
          var2 = var2 | 2048;
        }
        if (this.field_cb > 0) {
          var2 = var2 | 4096;
        }
        return var2;
    }

    final boolean a(jd param0, byte param1) {
        RuntimeException var3 = null;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.k((byte) 107)) {
            return false;
          }
          if (param0.field_W &&
            param0.field_N != 0) {
            return false;
          }
          if (param1 < 113) {
            this.field_z = -18;
          }
          stackIn_12_0 = !(this.field_A + this.field_Y < param0.field_Y + param0.field_A);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("jd.T(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, boolean param1) {
        int var4;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (this.field_P != 7 &&
          this.field_P != 8) {
          this.field_Y = this.field_Y - param0;
        } else {
          if (this.field_o > 1) {
            this.field_o = this.field_o - 1;
          } else {
            this.field_P = 0;
          }
        }
        if (!param1) {
          return;
        }
        this.w(22331);
    }

    final boolean j(byte param0) {
        int var2;
        boolean stackIn_11_0 = false;
        var2 = 31 % ((-9 - param0) / 61);
        if (this.field_N == 34 &&
          this.field_W) {
          return true;
        }
        stackIn_11_0 = (bw.field_m[this.field_N][0] == 4) || (bw.field_m[this.field_N][0] == 3) || (bw.field_m[this.field_N][0] == 2) || !((2048 & bw.field_m[this.field_N][10]) <= 0) || (this.field_ab == 2);
        return stackIn_11_0;
    }

    final int D(int param0) {
        if (param0 > -63) {
          this.field_J = 66;
        }
        return this.field_k;
    }

    final static boolean i(byte param0) {
        Object var1 = null;
        int var2 = 0;
        Throwable var3 = null;
        boolean stackIn_6_0 = false;
        Throwable decompiledCaughtException = null;
        var1 = va.field_w;
        synchronized (var1) {
          if (rd.field_d == be.field_E) {
            return false;
          }
          rs.field_q = gt.field_d[be.field_E];
          ui.field_i = ua.field_u[be.field_E];
          var2 = 86 % ((param0 - 0) / 48);
          be.field_E = 127 & be.field_E + 1;
          stackIn_6_0 = true;
        }
        return stackIn_6_0;
    }

    final void m(byte param0) {
        if (!this.field_I &&
          !this.a(23072) &&
          this.field_t > this.field_Y &&
          !this.field_s &&
          0 < this.field_B) {
          this.field_l.field_l.a((byte) -119, (tc) (new st(this, 1)));
        }
        if (0 < this.field_cb) {
          this.field_cb = this.field_cb - 1;
        }
        if (param0 != -36) {
          this.field_x = (hr) null;
        }
        if (this.field_cb != 0) {
        } else {
          if (!this.h(param0 - 13458)) {
            this.field_s = false;
          } else {
            this.field_s = true;
          }
          this.field_B = 1;
          this.field_D = false;
          if (74 == this.field_N) {
            this.field_B = 2;
          }
        }
    }

    final boolean f(byte param0) {
        if (param0 >= -99) {
          return true;
        }
        return 0 < (8 & bw.field_m[this.field_N][10]) ? true : false;
    }

    final String q(byte param0) {
        if (param0 <= 37) {
          this.b(true);
        }
        String var2 = new String(this.field_K);
        if (this.c(false)) {
          var2 = var2 + " " + og.field_r;
        }
        if (this.u(8)) {
          var2 = var2 + " " + fa.field_f;
        }
        return var2;
    }

    final boolean t(int param0) {
        if (param0 != 26440) {
          return true;
        }
        return this != this.field_l.field_Eb[this.field_l.field_v * this.field_w + this.field_J].field_c ? true : false;
    }

    final void z(int param0) {
        if (null != this.field_x) {
          if (this.field_N == 34) {
            this.field_x.a((byte) 115, 75);
          }
          if (this.field_N == 7) {
            this.field_x.a((byte) 77, 76);
          }
          this.field_x.a(-23162, 0);
        }
        if (param0 != 10) {
          this.field_R = (int[]) null;
        }
    }

    final boolean o(byte param0) {
        boolean stackIn_7_0 = false;
        if (param0 != 98) {
          this.o(-50);
        }
        stackIn_7_0 = (this.field_N == 73) || (this.field_ab == 4);
        return stackIn_7_0;
    }

    final void e(int param0, int param1) {
        if (param1 > -1 &&
          param1 < 2048) {
          this.field_fb = param1;
        }
        if (this.field_x != null) {
          this.field_x.a(false, param1);
        }
        int var3 = 114 / ((-56 - param0) / 54);
    }

    public static void q(int param0) {
        field_T = null;
        field_n = null;
        if (param0 != -9480) {
          field_n = (String) null;
        }
        field_y = null;
    }

    final void e(int param0) {
        this.field_l.field_Eb[this.field_l.field_v * this.field_w + this.field_J].field_c = null;
        this.d(-100);
        this.field_l.a(this.field_w, this.field_J, 0, 3);
        if (param0 > -82) {
          field_y = (String) null;
        }
    }

    final boolean a(int param0) {
        boolean stackIn_4_0 = false;
        boolean stackIn_5_1 = false;
        boolean stackIn_9_0 = false;
        if (param0 != 23072) {
          this.field_o = -127;
        }
        stackIn_4_0 = this.field_C;
        stackIn_5_1 = ((256 & bw.field_m[this.field_N][10]) <= 0) ? false : true;
        stackIn_9_0 = (stackIn_4_0 | stackIn_5_1) && (!this.c(false));
        return stackIn_9_0;
    }

    public final void a(int param0, bv param1, String param2, byte param3) {
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_48_2 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_51_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          if (param3 != 37) {
            this.field_F = false;
          }
          if (param2.equals("c")) {
            if (param0 <= 0) {
              return;
            }
            this.field_N = (int)tn.a(false, param0, param1);
          } else {
            if (param2.equals("o")) {
              if (param0 <= 0) {
                return;
              }
              this.field_O = (int)tn.a(false, param0, param1);
              return;
            }
            if (param2.equals("str")) {
              if (param0 > 0) {
                this.field_Y = (int)tn.a(false, param0, param1);
                return;
              }
            } else {
              if (param2.equals("max")) {
                if (param0 <= 0) {
                  return;
                }
                this.field_t = (int)tn.a(false, param0, param1);
                return;
              }
              if (param2.equals("x")) {
                if (0 >= param0) {
                  return;
                }
                this.field_J = (int)tn.a(false, param0, param1);
                return;
              }
              if (!param2.equals("y")) {
                if (param2.equals("mf")) {
                  if (param0 > 0) {
                    this.field_V = (int)tn.a(false, param0, param1);
                    return;
                  }
                } else {
                  if (param2.equals("nm")) {
                    if (0 >= param0) {
                      return;
                    }
                    this.field_K = up.a(param1, param0, (byte) -122);
                    return;
                  }
                  if (param2.equals("tag")) {
                    if (param0 <= 0) {
                      return;
                    }
                    this.field_E = (int)tn.a(false, param0, param1);
                    return;
                  }
                  if (param2.equals("obj")) {
                    if (param0 <= 0) {
                      return;
                    }
                    this.field_H = (int)tn.a(false, param0, param1);
                    return;
                  }
                  if (param2.equals("tnk")) {
                    if (param0 <= 0) {
                      return;
                    }
                    this.field_q = (int)tn.a(false, param0, param1);
                    return;
                  }
                }
              } else {
                if (param0 > 0) {
                  this.field_w = (int)tn.a(false, param0, param1);
                  return;
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_47_0 = var5;
          stackIn_47_1 = new StringBuilder().append("jd.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_48_2 = "null";
          } else {
            stackIn_48_2 = "{...}";
          }
          stackIn_50_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_48_2).append(',');
          if (param2 == null) {
            stackIn_51_2 = "null";
          } else {
            stackIn_51_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_47_0), ((StringBuilder) (Object) stackIn_50_1).append(stackIn_51_2).append(',').append(param3).append(')').toString());
        }
    }

    final void w(int param0) {
        int var2 = 0;
        if (param0 != 22331) {
          this.field_H = 111;
        }
        if (this.field_S) {
          return;
        }
        if (this.g((byte) 122) < 1) {
          this.field_S = true;
          var2 = -1;
          if (this.field_ab == 5) {
            var2 = this.field_l.a(this.field_w, this.field_O, this.field_J, (byte) -53);
          }
          if (var2 > -1) {
            this.field_l.field_Eb[var2].field_l = true;
            this.field_l.field_l.a(750, new rt(this, var2 % this.field_l.field_v, var2 / this.field_l.field_v));
          } else {
            this.field_l.field_l.a(750, new hp(this));
          }
        }
    }

    final boolean h(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != -13494) {
          return false;
        }
        stackIn_6_0 = (34 == this.field_N) && (this.field_W);
        return stackIn_6_0;
    }

    final void a(boolean param0, byte param1) {
        ne var3;
        int var4;
        int var5;
        ne var6;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        this.field_Y = 0;
        this.field_S = true;
        this.field_A = 0;
        var6 = this.field_l.field_Eb[this.field_J + this.field_l.field_v * this.field_w];
        var3 = var6;
        var3.field_m = var6.e(10);
        if (0 == this.field_N &&
          !this.field_W) {
        }
        var4 = this.field_N;
        switch (var4) {
          case 53:
            this.field_l.a(this.field_w, this.field_J, 0, 1);
            if (this.v(10)) {
              break;
            }
            if (!param0) {
              break;
            }
            var6.a(106);
            break;
          case 59:
            this.field_l.a(this.field_w, this.field_J, 0, 1);
            if (this.v(10)) {
              break;
            }
            if (!param0) {
              break;
            }
            var6.a(106);
            break;
          default:
            if (this.v(10)) {
              break;
            }
            if (!param0) {
              break;
            }
            var6.a(106);
            break;
          case 63:
            this.field_l.a(this.field_w, this.field_J, 0, 1);
            if (this.v(10)) {
              break;
            }
            if (!param0) {
              break;
            }
            var6.a(106);
            break;
          case 43:
          case 58:
            this.field_l.a(this.field_w, this.field_J, 0, 1);
            if (!this.v(10) &&
              param0) {
              var6.a(106);
            }
            break;
        }
        if (this == var6.field_c) {
          var3.field_c = null;
        }
        this.d(39);
        if (param1 != 105) {
          this.field_X = false;
        }
        this.field_l.a(this.field_w, this.field_J, 0, 3);
        if (this.c(false)) {
          this.field_l.a((byte) 89, this.field_O);
        }
        if (this.field_l.field_b) {
          this.field_l.field_h[this.field_O] = this.field_l.field_h[this.field_O] + 1;
        }
        this.field_l.b(this.field_O, true);
    }

    final boolean s(int param0) {
        if (param0 < 123) {
          this.k((byte) -126);
        }
        return (32 & bw.field_m[this.field_N][10]) > 0 ? true : false;
    }

    final boolean o(int param0) {
        boolean stackIn_9_0 = false;
        if (this.field_db == this.field_J &&
          this.field_k == this.field_w) {
          this.A(-1);
        }
        if (param0 != -28467) {
          this.field_W = false;
        }
        stackIn_9_0 = (this.field_db != -1) && (this.field_k != -1);
        return stackIn_9_0;
    }

    final int g(int param0) {
        if (param0 != 0) {
          this.o(82);
        }
        return bw.field_m[this.field_N][0];
    }

    final int c(byte param0) {
        if (param0 != 81) {
          this.g((byte) -105);
        }
        if (0 > this.field_r) {
          return 0;
        }
        return 31 & this.field_r;
    }

    final boolean y(int param0) {
        if (param0 > -92) {
          this.field_A = -12;
        }
        return (64 & bw.field_m[this.field_N][10]) > 0 ? true : false;
    }

    final jd b(boolean param0) {
        if (param0) {
          return (jd) null;
        }
        return new jd(this.field_J, this.field_w, this.field_N, this.field_O, this.field_t, this.field_Y, this.h((byte) 110), this.field_ab, this.field_A, this.field_l, this.field_P, this.field_o, this.field_r, true, this.field_cb);
    }

    final int f(int param0) {
        if (this.field_N == 34 &&
          !this.field_W) {
          return 0;
        }
        if (this.field_N == 39) {
          return 2;
        }
        if (param0 != 16) {
          this.field_q = -22;
        }
        if (this.field_N == 17) {
          return 1;
        }
        if (this.field_N == 72) {
          return 3;
        }
        if (7 == this.field_N &&
          !this.field_W) {
          return 4;
        }
        return -1;
    }

    final void a(jd param0, int param1) {
        if (this.field_J == param0.field_J &&
          this.field_w == param0.field_w) {
          return;
        }
        try {
          this.e(param1 ^ 2079, 256 + (param1 - (int)(2048.0 * Math.atan2((double)(-(this.field_w - param0.field_w)), (double)(this.field_J - param0.field_J)) / 3.141592653589793 / 2.0)) & 2047);
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "jd.HB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean u(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != 8) {
          jd.i((byte) 14);
        }
        stackIn_6_0 = (0 != (this.field_V & 8)) && (this.field_Y >= this.field_t);
        return stackIn_6_0;
    }

    final boolean x(int param0) {
        if (param0 >= -80) {
          jd var3 = (jd) null;
          this.a((jd) null, -117);
        }
        return 4 == this.g(0) ? true : false;
    }

    final boolean r(byte param0) {
        boolean stackIn_7_0 = false;
        if (param0 <= 41) {
          return false;
        }
        stackIn_7_0 = (0 != (bw.field_m[this.field_N][10] & 4096)) || (this.field_ab == 3);
        return stackIn_7_0;
    }

    final void k(int param0) {
        if (this.e((byte) 102)) {
          this.field_l.field_l.a((byte) -119, (tc) (new qj(this.field_J, this.field_w)));
        }
        if (this.p((byte) -128)) {
          this.field_l.field_l.a((byte) -119, (tc) (new qq(2, this.field_J, this.field_w, this.field_O)));
        }
        if (this.d((byte) 105)) {
          this.field_l.field_l.a((byte) -119, (tc) (new qq(3, this.field_J, this.field_w, this.field_O)));
        }
        if (this.f((byte) -116)) {
          this.field_l.field_l.a((byte) -119, (tc) (new qq(1, this.field_J, this.field_w, this.field_O)));
        }
        if (param0 != -1) {
          return;
        }
        if (this.s(124)) {
          this.field_l.field_l.a((byte) -119, (tc) (new qq(4, this.field_J, this.field_w, this.field_O)));
        }
        if (this.t(26440)) {
          this.field_l.field_l.a((byte) -119, (tc) (new kn(this)));
        }
    }

    final int B(int param0) {
        int var2;
        int var3;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = bw.field_m[this.field_N][7];
        if (this.field_W &&
          this.field_N == 34) {
          var2 = 7;
          if (this.j(20640) == 3) {
            var2 = var2 + this.d(1, -93);
          }
        }
        if ((this.field_N == 81 ||
          this.field_N == 4 ||
          this.field_N == 74) &&
          3 == this.j(20640)) {
          var2 = var2 + this.d(1, 83);
        } else if (3 == this.g(param0 - 3257) &&
          this.j(20640) == 2) {
          var2 = var2 + this.d(1, param0 - 3158);
        } else {
          if (this.g(0) == 2 &&
            this.j(20640) == 1) {
            var2 = var2 + this.d(1, 88);
          }
        }
        if (param0 == 3257) {
          return var2;
        }
        return 117;
    }

    private final boolean v(int param0) {
        if (param0 != 10) {
          this.field_u = true;
        }
        return (bw.field_m[this.field_N][10] & 1) > 0 ? true : false;
    }

    final boolean r(int param0) {
        if (param0 != -40) {
          return true;
        }
        return this.field_N != 39 ? true : false;
    }

    final void A(int param0) {
        this.field_db = param0;
        this.field_k = -1;
    }

    final boolean d(byte param0) {
        if (param0 != 105) {
          return true;
        }
        return (bw.field_m[this.field_N][10] & 16) > 0 ? true : false;
    }

    final static void m(int param0) {
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int[] var8 = null;
        int[] var10 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        int[] var1Lifetime1;
        int[] var1Lifetime2;
        int[] var1Lifetime3;
        int var3Lifetime1;
        int var3Lifetime2;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          if (!io.a(rq.field_n, (byte) 108)) {
            return;
          }
          if (!as.field_B) {
            return;
          }
          var17 = rq.field_n;
          var13 = var17;
          var6 = var13;
          var1 = var6;
          var24 = ei.field_e;
          for (var3 = 0; var3 < 8; var3++) {
            var6[var3] = rn.a(var17[var3], ~var24[var3]);
          }
          for (var1_int = 0; var1_int < so.field_a.length; var1_int++) {
            if (rb.a(var1_int, rq.field_n, 1)) {
              ai.field_P.a((byte) -119, (tc) (new jg(var1_int)));
            }
          }
          var18 = ei.field_e;
          var14 = var18;
          var8 = var14;
          var1Lifetime1 = var8;
          var25 = rq.field_n;
          for (var3Lifetime1 = 0; var3Lifetime1 < 8; var3Lifetime1++) {
            var8[var3Lifetime1] = oe.c(var18[var3Lifetime1], var25[var3Lifetime1]);
          }
          var19 = i.field_Nb;
          var15 = var19;
          var10 = var15;
          var1Lifetime2 = var10;
          var26 = rq.field_n;
          var3Lifetime2 = 0;
          var4 = 124 % ((-63 - param0) / 63);
          while (var3Lifetime2 < 8) {
            var10[var3Lifetime2] = oe.c(var19[var3Lifetime2], var26[var3Lifetime2]);
            var3Lifetime2++;
          }
          var20 = rq.field_n;
          var16 = var20;
          var12 = var16;
          var1Lifetime3 = var12;
          for (var2 = 0; var2 < 8; var2++) {
            var20[var2] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var1_ref), "jd.VA(" + param0 + ')');
        }
    }

    final void a(byte param0) {
        int var2 = 8 / ((19 - param0) / 34);
        this.field_l.a(this, -97);
    }

    jd(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, ha param9, int param10, int param11, int param12, boolean param13, int param14) {
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        boolean stackIn_13_1 = false;
        boolean stackIn_16_1 = false;
        boolean stackIn_19_1 = false;
        boolean stackIn_22_1 = false;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var16 = null;
        this.field_E = 0;
        this.field_q = -1;
        this.field_k = -1;
        this.field_db = -1;
        this.field_H = 0;
        this.field_S = false;
        this.field_G = false;
        try {
          this.field_J = param0;
          this.field_A = param8;
          stackIn_4_1 = ((param6 & 64) != 0);
          this.field_C = stackIn_4_1;
          this.field_B = 3 & param6;
          stackIn_7_1 = ((256 & param6) != 0);
          this.field_bb = stackIn_7_1;
          this.field_r = param12;
          stackIn_10_1 = ((param6 & 4) != 0);
          this.field_s = stackIn_10_1;
          this.field_l = param9;
          this.field_m = 0;
          this.field_t = param4;
          this.field_M = 0;
          this.field_cb = param14;
          this.field_N = param2;
          this.field_ab = param7;
          stackIn_13_1 = (0 != (param6 & 8));
          this.field_W = stackIn_13_1;
          stackIn_16_1 = ((512 & param6) != 0);
          this.field_D = stackIn_16_1;
          this.field_O = param3;
          stackIn_19_1 = (0 != (param6 & 32));
          this.field_F = stackIn_19_1;
          this.field_Y = param5;
          stackIn_22_1 = ((16 & param6) != 0);
          this.field_I = stackIn_22_1;
          this.field_o = param11;
          this.field_P = param10;
          this.field_w = param1;
          if (!param13) {
            param9.field_Eb[param0 + param9.field_v * param1].field_c = this;
            this.a((byte) -122);
          }
          this.field_z = -1;
          this.field_R = new int[3];
          this.field_fb = 1792;
          if (0 == this.field_N &&
            this.field_W) {
            this.field_K = ov.field_a;
            return;
          }
          if (this.field_N < dn.field_Pb.length) {
            this.field_K = dn.field_Pb[this.field_N];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var16 = decompiledCaughtException;
          stackIn_32_0 = var16;
          stackIn_32_1 = new StringBuilder().append("jd.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(')').toString());
        }
    }

    jd() {
        this.field_E = 0;
        this.field_q = -1;
        this.field_k = -1;
        this.field_db = -1;
        this.field_H = 0;
        this.field_S = false;
        this.field_G = false;
    }

    jd(int param0, int param1, int param2) {
        this.field_E = 0;
        this.field_q = -1;
        this.field_k = -1;
        this.field_db = -1;
        this.field_H = 0;
        this.field_S = false;
        this.field_G = false;
        this.field_w = param1;
        this.field_J = param0;
        this.field_N = param2;
    }

    static {
        field_n = "Resizable";
        field_y = "Level:<nbsp><col=ff0000><%0></col>  Speed:<nbsp><col=ff0000><%1></col>  Strength:<nbsp><col=ff0000><%2></col>  Range:<nbsp><col=ff0000><%4></col>  Cost:<nbsp><col=ff0000><%5></col>";
        field_T = "This unit is already poisoned.";
    }
}
