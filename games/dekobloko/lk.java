/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class lk {
    int field_g;
    rf[] field_X;
    int[] field_P;
    int field_zb;
    private int field_o;
    String field_vb;
    private int field_wb;
    sa field_W;
    private int field_M;
    int field_gb;
    private boolean field_r;
    private int field_p;
    int field_k;
    private int field_Cb;
    static String field_i;
    private int field_E;
    private int[] field_T;
    private int field_Ab;
    int field_j;
    private int[] field_b;
    int field_eb;
    boolean field_Bb;
    static int field_I;
    int field_Q;
    private int[] field_N;
    int field_K;
    int field_O;
    int field_q;
    int field_n;
    int field_lb;
    private int field_mb;
    private int field_V;
    private boolean field_Y;
    int field_U;
    int field_sb;
    private int field_e;
    int field_f;
    int field_t;
    int field_x;
    int[] field_w;
    int field_ib;
    private int field_G;
    private int field_db;
    int field_xb;
    int field_c;
    boolean field_S;
    int field_R;
    int field_z;
    vj field_cb;
    int field_J;
    int field_hb;
    private int[] field_tb;
    private boolean field_y;
    int field_m;
    int field_d;
    int field_qb;
    private int field_ob;
    boolean field_kb;
    int field_jb;
    private int field_l;
    int field_L;
    int field_D;
    ee field_u;
    static boolean field_F;
    int field_Z;
    private boolean field_v;
    private int field_ab;
    private int[] field_B;
    private boolean field_s;
    int field_fb;
    vj field_rb;
    int field_yb;
    int field_ub;
    int field_a;
    private int field_h;
    int field_nb;
    private int field_A;
    int field_H;
    int field_bb;
    int field_C;
    int field_pb;

    final int f(int param0) {
        int var4 = 0;
        int var2;
        int var3;
        int var5;
        int var6;
        var6 = client.field_A ? 1 : 0;
        var2 = -1;
        var3 = this.field_C * this.field_zb;
        if (param0 > -36) {
          this.k(5);
        }
        for (var4 = 0; var4 < var3; var4++) {
          var5 = this.field_T[var4];
          if ((var5 & 24) == 24) {
            var5 = var5 & 7;
            if (var5 > var2) {
              var2 = var5;
            }
          }
        }
        return var2;
    }

    private final boolean q(int param0) {
        int[] array$0 = null;
        int incrementValue$1 = 0;
        int var7 = 0;
        int[] var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var8;
        int[] var9;
        int[] var10;
        int[] var11;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        var8 = client.field_A ? 1 : 0;
        var11 = this.field_B;
        var10 = var11;
        var9 = var10;
        var2 = var9;
        if (var9 == null ||
          var11.length < this.field_C * this.field_zb) {
          array$0 = new int[this.field_C * this.field_zb];
          var2 = array$0;
          this.field_B = array$0;
        }
        var3 = 0;
        if (param0 != 21200) {
          this.field_vb = (String) null;
        }
        for (var4 = 0; var4 < this.field_zb; var4++) {
          var5 = -var4 + (-1 + this.field_zb);
          for (var6 = 0; this.field_C > var6; var6++) {
            incrementValue$1 = var3;
            var3++;
            this.field_B[var5] = this.field_T[incrementValue$1];
            var5 = var5 + this.field_zb;
          }
        }
        var4Lifetime1 = this.field_db - this.field_zb + this.field_C + this.field_o >> 1;
        var5Lifetime1 = this.field_o + (this.field_zb + (-this.field_C - this.field_db)) >> 1;
        this.field_q = this.field_q + var4Lifetime1;
        var3Lifetime1 = this.field_C;
        this.field_L = this.field_L + var5Lifetime1;
        this.field_C = this.field_zb;
        this.field_B = this.field_T;
        this.field_zb = var3Lifetime1;
        this.field_T = var2;
        if (this.c((byte) -117)) {
          this.field_T = this.field_B;
          this.field_B = var2;
          this.field_zb = this.field_C;
          this.field_L = this.field_L - var5Lifetime1;
          this.field_C = var3Lifetime1;
          this.field_q = this.field_q - var4Lifetime1;
          return false;
        }
        this.field_ab = this.field_ab + 1;
        var3Lifetime2 = this.field_db;
        this.field_db = -this.field_o;
        this.field_o = var3Lifetime2;
        this.d(30968);
        var3Lifetime3 = 0;
        this.h(-1);
        for (var6Lifetime1 = 0; var6Lifetime1 < this.field_zb; var6Lifetime1++) {
          for (var7 = 0; var7 < this.field_C; var7++) {
            this.field_tb[var3Lifetime3] = 0;
            this.field_b[var3Lifetime3] = (-1 + (this.field_C + this.field_db - var7 * 2)) * -8 / this.field_C;
            var3Lifetime3++;
          }
        }
        ge.a(this.field_lb, this.field_k / 4, (byte) 127, ib.field_ob);
        return true;
    }

    private final void a(int param0, boolean param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var6Lifetime1;
        var9 = client.field_A ? 1 : 0;
        if (param0 > -88) {
          return;
        }
        var4 = 0;
        var5 = 0;
        for (var6 = 0; this.field_a * this.field_O > var6; var6++) {
          var7 = this.field_P[var6];
          if ((1879048192 & var7) == 0) {
            this.field_P[var6] = lb.a(2147483647, var7);
          } else {
            if (8 == (var7 & 24)) {
              var5++;
            }
            if (16 == (var7 & 24)) {
              var4++;
            }
            var8 = (1879048192 & var7) / 268435456;
            if (8 == (var7 & 24) &&
              var8 > mk.field_e) {
              mk.field_e = var8;
            }
            this.field_ib = param2;
            if ((-1879048193 & var7) == 23 &&
              var8 > fk.field_H) {
              fk.field_H = var8;
            }
            if (param1) {
              this.field_P[var6] = 56;
            } else {
              this.field_P[var6] = de.b(32, lb.a(var7, 268435455));
            }
          }
        }
        if (param1) {
          var6Lifetime1 = ((int)((double)this.field_k * Math.sqrt((double)(var4 + (16 + var5)))) + 8) / 16;
          if (this.field_k < var6Lifetime1) {
            var6Lifetime1 = this.field_k;
          }
          ge.a(this.field_lb, var6Lifetime1, (byte) 127, ee.field_g);
        } else {
          if (var4 > 0) {
            var6Lifetime1 = ((int)((double)this.field_k * Math.sqrt((double)var4)) + 1) / 2;
            if (this.field_k < var6Lifetime1) {
              var6Lifetime1 = this.field_k;
            }
            ge.a(this.field_lb, var6Lifetime1, (byte) 127, wd.field_c);
          }
          if (0 < var5) {
            var6Lifetime1 = (2 + (int)((double)this.field_k * Math.sqrt((double)var5))) / 4;
            if (var6Lifetime1 > this.field_k) {
              var6Lifetime1 = this.field_k;
            }
            ge.a(this.field_lb, var6Lifetime1, (byte) 127, sa.field_w);
          }
        }
        return;
    }

    private final int l(int param0) {
        int var2 = 95 % ((param0 - 43) / 54);
        return 80 + this.field_g * this.field_a;
    }

    final int a(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        var4 = 0;
        if (param0 >= 0 &&
          param2 >= 0 &&
          param0 < this.field_O &&
          this.field_a > param2) {
          var4 = this.field_P[param0 + this.field_O * param2];
        }
        var5 = 101 / ((param1 - 24) / 52);
        if (this.field_C != 0 &&
          !this.field_S) {
          var6 = -this.field_q + param0;
          var7 = -this.field_L + param2;
          if (var6 >= 0 &&
            var7 >= 0 &&
            this.field_C > var6 &&
            this.field_zb > var7) {
            var8 = this.field_T[var7 * this.field_C + var6];
            if (var8 != 0) {
              var4 = var8;
            }
          }
        }
        return var4;
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4, int param5, boolean param6, int param7, boolean param8, boolean param9, boolean param10, boolean param11) {
        th.a(16777215, param2, param6, param7, param10, param11, param1, 16777215, param0, param4, param3, (byte) 103, param5, param8);
        if (!param9) {
          lk.g(-50);
        }
    }

    private final void h(int param0) {
        if (param0 != -1) {
          return;
        }
        if (!this.field_y) {
        } else {
          if (!this.a((byte) -93, true)) {
            this.field_y = false;
            this.c(30000, this.field_g, 1);
          } else {
            this.field_e = 20;
          }
        }
    }

    private final int a(boolean param0, int param1, int param2, lk param3, boolean param4, int param5, int param6, int param7, oi param8, boolean param9, byte param10) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        Object stackIn_77_0;
        lk stackIn_77_1;
        oi stackIn_77_2;
        int stackIn_77_3;
        int stackIn_77_4;
        Object stackIn_78_0;
        int stackIn_78_5;
        int stackIn_89_0 = 0;
        RuntimeException stackIn_92_0 = null;
        StringBuilder stackIn_92_1 = null;
        String stackIn_93_2 = null;
        StringBuilder stackIn_95_1 = null;
        String stackIn_96_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var12_int = 0;
        RuntimeException var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var14Lifetime1;
        int var21Lifetime1;
        int var21Lifetime2;
        var22 = client.field_A ? 1 : 0;
        try {
          var12_int = this.field_P[param6];
          if ((var12_int & -1879048193) >> 3 != param1) {
            stackIn_4_0 = 0;
            return stackIn_4_0;
          }
          var13 = 0;
          if (param5 < 0 &&
            (var12_int & -1879048193) == 23) {
            if (-2 == param5) {
              for (var14 = 0; var14 < 7; var14++) {
                var13 = var13 + this.a(param0, param1, param2, param3, param4, var14, param6, param7, param8, param9, (byte) 111);
              }
            }
            stackIn_13_0 = var13;
            return stackIn_13_0;
          }
          if (this.field_v) {
            param7 = 3;
          }
          var14Lifetime1 = 0;
          this.field_w[0] = param6;
          var15 = 1;
          this.field_P[param6] = de.b(-2147483648, var12_int);
          var16 = 0;
          if (param5 >= 0) {
            var16 = 1;
            var12_int = (-1879048200 & var12_int) + param5;
          }
          boolean decompiledFrameRemainder0 = true;
          if (!param0) {
            var17 = -119 / ((param10 - 7) / 60);
            decompiledFrameRemainder0 = (var16 == 0);
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameRemainder0 = !(var15 < param2))) {
              var12_int = 8 | var12_int & 7;
              var14Lifetime1 = 0;
              for (var18 = 0; var18 < var15; var18++) {
                var19 = this.field_w[var18];
                var20 = this.field_P[var19];
                if (1879048192 > (1879048192 & var20)) {
                  this.field_P[var19] = var20 + 268435456;
                }
              }
            }
          } else {
            if (param9) {
              var17 = 24 ^ var12_int;
            } else {
              var17 = 23;
            }
            while (var14Lifetime1 < var15) {
              incrementValue$0 = var14Lifetime1;
              var14Lifetime1++;
              var18 = this.field_w[incrementValue$0];
              if (var16 != 0 &&
                23 != (this.field_P[var18] & 268435455)) {
                var16 = 0;
              }
              if (0 < var18 % this.field_O) {
                var15 = this.a(-1 + var18, 124, var17, var15, var12_int);
              }
              if (this.field_O - 1 > var18 % this.field_O) {
                var15 = this.a(1 + var18, 126, var17, var15, var12_int);
              }
              if (var18 >= this.field_O) {
                var15 = this.a(-this.field_O + var18, 126, var17, var15, var12_int);
              }
              if ((-1 + this.field_a) * this.field_O <= var18) {
                continue;
              }
              var15 = this.a(var18 + this.field_O, 125, var17, var15, var12_int);
            }
            var17 = -119 / ((param10 - 7) / 60);
            decompiledFrameRemainder0 = (var16 == 0);
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameRemainder0 = !(var15 < param2))) {
              var12_int = 8 | var12_int & 7;
              var14Lifetime1 = 0;
              for (var18 = 0; var18 < var15; var18++) {
                var19 = this.field_w[var18];
                var20 = this.field_P[var19];
                if (1879048192 > (1879048192 & var20)) {
                  this.field_P[var19] = var20 + 268435456;
                }
              }
            }
          }
          if (decompiledFrameRemainder0) {
            var18 = var15;
            if (param4) {
              while (var15 > var14Lifetime1) {
                incrementValue$1 = var14Lifetime1;
                var14Lifetime1++;
                var19 = this.field_w[incrementValue$1];
                if (var19 % this.field_O > 0) {
                  var15 = this.a(var15, var19 - 1, (byte) -44, var12_int);
                }
                if (var19 % this.field_O < -1 + this.field_O) {
                  var15 = this.a(var15, var19 + 1, (byte) -44, var12_int);
                }
                if (this.field_O <= var19) {
                  var15 = this.a(var15, -this.field_O + var19, (byte) -44, var12_int);
                }
                if (var19 >= (this.field_a - 1) * this.field_O) {
                  continue;
                }
                var15 = this.a(var15, this.field_O + var19, (byte) -44, var12_int);
              }
            }
            if (!param9 &&
              null != this.field_rb) {
              if (param7 == 3 &&
                null != this.field_rb) {
                var19 = gg.b(var15, 27935);
                var20 = var19;
                he.field_ab = he.field_ab + var20;
                fb.field_e = fb.field_e + var20;
                this.field_hb = this.field_hb + var19;
                this.field_rb.a(new sa(false, this.b(0, var15, 81), this.a(true, var15, 0), var19, a.field_u, -1 + var15, 8 | 7 & var12_int, new String[]{" <times> ", Integer.toString(var15), " = <b>", Integer.toString(var19)}), 2777);
              } else {
                if (this.field_rb != null) {
                  var19 = pa.b(var18, 65);
                  var20 = gg.b(var15 - var18, 27935);
                  this.field_f = this.field_f + var19;
                  var21 = var19;
                  he.field_ab = he.field_ab + var21;
                  fb.field_e = fb.field_e + var21;
                  this.field_hb = this.field_hb + var20;
                  var21Lifetime2 = var20;
                  fb.field_e = fb.field_e + var21Lifetime2;
                  he.field_ab = he.field_ab + var21Lifetime2;
                  if (0 < var20) {
                    this.field_rb.a(new sa(false, this.b(var18, var15, 65), this.a(true, var15, var18), var20, a.field_u, var15 - var18 - 1, 8 | 7 & var12_int, new String[]{" <times> ", Integer.toString(var15 - var18), " = <b>", Integer.toString(var20)}), 2777);
                  }
                  this.field_rb.a(new sa(false, this.b(0, var18, 112), this.a(true, var18, 0), var19, bc.field_J, -4 + var18, 16 | 7 & var12_int, new String[]{" <times> ", Integer.toString(var18), " = <b>", Integer.toString(var19)}), 2777);
                }
              }
            }
            var13 = var15;
            if (this.field_D >= param7) {
              stackIn_77_0 = this;
              stackIn_77_1 = (lk) (param3);
              stackIn_77_2 = (oi) (param8);
              stackIn_77_3 = var12_int;
              stackIn_77_4 = 0;
              if (this.field_D < 2) {
                stackIn_78_0 = this;
                stackIn_78_5 = var18;
              } else {
                stackIn_78_0 = this;
                stackIn_78_5 = var15;
              }
              this.a(stackIn_77_1, stackIn_77_2, stackIn_77_3, stackIn_77_4, stackIn_78_5);
            }
          }
          if (!param9) {
            for (var18 = 0; var18 < var15; var18++) {
              var19 = this.field_w[var18];
              var20 = this.field_P[var19];
              var21Lifetime1 = var20 & 268435455;
              if (23 == var21Lifetime1 ||
                var21Lifetime1 >> 3 != 2) {
                var20 = var20 & 2147483647;
                this.field_P[var19] = var20;
              }
            }
          }
          stackIn_89_0 = var13;
          return stackIn_89_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12 = decompiledCaughtException;
          stackIn_92_0 = var12;
          stackIn_92_1 = new StringBuilder().append("lk.SA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_93_2 = "null";
          } else {
            stackIn_93_2 = "{...}";
          }
          stackIn_95_1 = ((StringBuilder) (Object) stackIn_92_1).append(stackIn_93_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_96_2 = "null";
          } else {
            stackIn_96_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_92_0), ((StringBuilder) (Object) stackIn_95_1).append(stackIn_96_2).append(',').append(param9).append(',').append(param10).append(')').toString());
        }
    }

    final void d(int param0, int param1) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int var3;
        int var4;
        int var5;
        var5 = client.field_A ? 1 : 0;
        if (0 == this.field_C) {
          throw new IllegalStateException();
        }
        var3 = ~this.field_A & param0;
        this.field_A = param0;
        var4 = 0;
        if (this.field_Ab <= 0) {
          var4 = 1;
        } else {
          this.field_Ab = this.field_Ab - 1;
          if (0 != (1 & var3)) {
            this.b((byte) -116);
            this.field_Cb = -10;
          } else {
            if ((var3 & 2) != 0) {
              this.j(param1 ^ -1674843003);
              this.field_Cb = 10;
            }
          }
          if (0 > this.field_Cb) {
            if ((param0 & 1) != 0) {
              fieldTemp$0 = this.field_Cb + 1;
              this.field_Cb = this.field_Cb + 1;
              if (fieldTemp$0 == 0) {
                this.b((byte) -116);
                this.field_Cb = -3;
              }
            } else {
              this.field_Cb = 0;
            }
          } else {
            if (this.field_Cb > 0) {
              if ((param0 & 2) == 0) {
                this.field_Cb = 0;
              } else {
                fieldTemp$1 = this.field_Cb - 1;
                this.field_Cb = this.field_Cb - 1;
                if (fieldTemp$1 == 0) {
                  this.j(4);
                  this.field_Cb = 3;
                }
              }
            }
          }
          if (0 != (var3 & 4)) {
            this.c(false);
          }
          if (0 != (16 & param0)) {
            var4 = 1;
          }
          if ((8 & var3) != 0) {
            this.i(0);
          }
        }
        if (param1 != -1674843007) {
          lk.a(50, -101, 127, 94, false, 20, 66);
        }
        if (var4 != 0) {
          if (0 != this.field_Ab &&
            (param0 & 16) == 0) {
            var4 = 0;
          } else {
            if (this.field_e > 2) {
              if (!this.field_y &&
                this.field_Ab > 0 &&
                this.field_g == this.field_e &&
                this.o(32) == this.field_M &&
                null != this.field_rb) {
                this.field_H = this.field_H + 5;
                he.field_ab = he.field_ab + 5;
                fb.field_e = fb.field_e + 5;
              }
              this.field_e = 2;
            }
          }
        }
        if (this.field_e > 0) {
          this.c(30000, -1 + this.field_e, 0);
        }
        return;
    }

    final rf b(int param0) {
        int var2;
        rf var3;
        int var4;
        var4 = client.field_A ? 1 : 0;
        this.c(0);
        for (var2 = 0; this.field_t > var2; var2++) {
          if (this.field_X[var2].field_e != 0) {
            continue;
          }
          break;
        }
        if (this.field_t <= var2) {
          throw new IllegalStateException();
        }
        if (param0 != -19939) {
          return (rf) null;
        }
        var3 = this.field_X[var2];
        var3.field_e = var3.field_e + 1;
        return var3;
    }

    final void a(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        int[] var15 = null;
        int[] var14 = null;
        int[] var13 = null;
        int[] var7 = null;
        int[] array$0 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int incrementValue$1 = 0;
        int var12 = client.field_A ? 1 : 0;
        int var8Lifetime1;
        this.field_L = param5;
        this.field_q = param4;
        for (param2 = param0 & -this.field_ab + param2; param2 > 0; param2--) {
          var15 = this.field_B;
          var14 = var15;
          var13 = var14;
          var7 = var13;
          if (var13 == null ||
            this.field_zb * this.field_C > var15.length) {
            array$0 = new int[this.field_C * this.field_zb];
            var7 = array$0;
            this.field_B = array$0;
          }
          var8 = 0;
          for (var9 = 0; this.field_zb > var9; var9++) {
            var10 = -1 + this.field_zb - var9;
            for (var11 = 0; this.field_C > var11; var11++) {
              incrementValue$1 = var8;
              var8++;
              this.field_B[var10] = this.field_T[incrementValue$1];
              var10 = var10 + this.field_zb;
            }
          }
          var8Lifetime1 = this.field_C;
          this.field_C = this.field_zb;
          this.field_B = this.field_T;
          this.field_zb = var8Lifetime1;
          this.field_T = var7;
        }
        this.a(param1, (byte) 126, param3);
    }

    final void a(int param0, int param1, rf param2) {
        int stackIn_33_1 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var4_intLifetime1;
        int var4_intLifetime2;
        int var8Lifetime1;
        int var9Lifetime1;
        var10 = client.field_A ? 1 : 0;
        try {
          this.field_zb = param2.field_n;
          this.field_U = this.field_U + 1;
          this.field_C = param2.field_b;
          this.field_b = new int[this.field_C * this.field_zb];
          this.field_T = new int[this.field_C * this.field_zb];
          if (param0 <= 73) {
            this.a(false);
          }
          this.field_tb = new int[this.field_C * this.field_zb];
          for (var4_int = 0; this.field_zb * this.field_C > var4_int; var4_int++) {
            this.field_T[var4_int] = lb.a(255, (int) param2.field_c[var4_int]);
          }
          for (var4_intLifetime1 = 0; this.field_C * this.field_zb > var4_intLifetime1; var4_intLifetime1++) {
            this.field_b[var4_intLifetime1] = 8;
          }
          this.field_o = 0;
          this.field_db = 0;
          if ((1 & (this.field_C ^ this.field_zb)) != 0) {
            var4_intLifetime2 = 0;
            var5 = 0;
            var6 = 0;
            var7 = 0;
            for (var8 = 0; var8 < this.field_zb; var8++) {
              for (var9 = 0; var9 < this.field_C; var9++) {
                if (0 != this.field_T[var7]) {
                  var5 = var5 + var8;
                  var6++;
                  var4_intLifetime2 = var4_intLifetime2 + var9;
                }
                var7++;
              }
            }
            var8Lifetime1 = (-1 + this.field_C) * var6 >> 1;
            var9Lifetime1 = var6 * (this.field_zb - 1) >> 1;
            if (-var9Lifetime1 + var5 > var4_intLifetime2 - var8Lifetime1 &&
              var5 - var9Lifetime1 > var8Lifetime1 - var4_intLifetime2) {
              this.field_o = 1;
            } else {
              if (var5 - var9Lifetime1 < -var8Lifetime1 + var4_intLifetime2 &&
                -var9Lifetime1 + var5 < -var4_intLifetime2 + var8Lifetime1) {
                this.field_o = -1;
              } else {
                if (var4_intLifetime2 < var8Lifetime1) {
                  this.field_db = -1;
                } else {
                  this.field_db = 1;
                }
              }
            }
          }
          this.field_Cb = 0;
          this.field_q = -this.field_C + this.field_O >> 1;
          this.field_A = 0;
          this.field_L = -this.field_zb + 1 + this.field_z;
          this.field_yb = param1;
          this.field_ab = 0;
          if (this.field_g >= 2) {
            stackIn_33_1 = this.field_g;
          } else {
            stackIn_33_1 = 2;
          }
          this.field_e = stackIn_33_1;
          this.field_y = false;
          this.field_Ab = this.l(123);
          this.field_M = this.o(32);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_37_0 = var4;
          stackIn_37_1 = new StringBuilder().append("lk.AA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(')').toString());
        }
    }

    final void a(rf param0, byte param1) {
        rf[] var6 = null;
        rf[] var7 = null;
        int var4 = 0;
        int fieldTemp$0 = 0;
        int var5 = client.field_A ? 1 : 0;
        try {
          if (this.field_t >= this.field_X.length) {
            var6 = new rf[2 * this.field_X.length];
            var7 = var6;
            rf[] var3 = var7;
            for (var4 = 0; var4 < this.field_X.length; var4++) {
              var6[var4] = this.field_X[var4];
            }
            this.field_X = var7;
          }
          if (param1 > -116) {
            this.field_o = 45;
          }
          param0.field_l = this.field_wb;
          this.field_wb = this.field_wb + 3;
          fieldTemp$0 = this.field_t;
          this.field_t = this.field_t + 1;
          this.field_X[fieldTemp$0] = param0;
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "lk.O(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final boolean c(int param0, int param1) {
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int stackIn_37_0Lifetime1;
        int stackIn_37_1Lifetime1;
        var12 = client.field_A ? 1 : 0;
        if (param0 != 5) {
          return false;
        }
        if (param1 != -15303) {
          this.field_Bb = false;
        }
        var3 = 0;
        while (true) {
          if (var3 >= 5) {
            return false;
          }
          var4 = this.field_w[var3];
          var5 = var4 % this.field_O;
          var6 = var4 / this.field_O;
          var7 = 15;
          var8 = 0;
          L3: while (true) {
            if (5 > var8) {
              stackIn_37_0 = var8;
              stackIn_37_1 = var3;
              boolean decompiledFrameRemainder0 = true;
              if (stackIn_37_0 != stackIn_37_1) {
                var9 = this.field_w[var8];
                var10 = var9 % this.field_O;
                var10 = var10 - var5;
                var11 = var9 / this.field_O;
                var11 = var11 - var6;
                if (var11 == 0 && (var10 == -1 ||
                  var10 == 1)) {
                  var7 = var7 & 3;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  if (var10 == 0 && (var11 == -1 ||
                    var11 == 1)) {
                    var7 = var7 & 12;
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    if (-1 == var10 &&
                      var11 == -1) {
                      var7 = var7 & 5;
                    } else {
                      if (var10 == 1 &&
                        var11 == -1) {
                        var7 = var7 & 9;
                      } else {
                        if (var10 == -1 &&
                          var11 == 1) {
                          var7 = var7 & 6;
                        } else {
                          if (var10 != 1) {
                            break L3;
                          }
                          if (var11 != 1) {
                            break L3;
                          }
                          var7 = var7 & 10;
                        }
                      }
                    }
                  }
                }
              }
              var8++;
              continue;
            }
            stackIn_37_0Lifetime1 = -1;
            stackIn_37_1Lifetime1 = ~var7;
            if (stackIn_37_0Lifetime1 != stackIn_37_1Lifetime1) {
              return true;
            }
            break;
          }
          var3++;
        }
    }

    final void k(int param0) {
        if (param0 != -9897) {
          this.field_V = 92;
        }
        if (this.field_C > 0 &&
          !this.field_S) {
          this.field_V = this.field_C;
          this.field_E = this.field_L;
          this.field_mb = 1;
          this.field_h = this.field_zb;
          this.field_ob = this.field_q;
          this.field_N = this.field_T;
          ge.a(this.field_lb, this.field_k / 2, (byte) 127, ul.field_i);
          this.field_S = true;
          this.field_K = 0;
          this.field_p = 0;
          this.field_Bb = false;
          this.field_nb = 0;
        }
        this.field_C = 0;
    }

    private final void b(boolean param0) {
        int var2 = -300 + ka.a((byte) 122, 601, tf.field_cb);
        var2 = var2 * (var2 * var2) / 90000;
        a.a(var2, this.field_J / 4, ak.field_b, this.field_sb, 256);
        if (param0) {
          this.field_M = -21;
        }
    }

    private final void i(int param0) {
        if (this.q(21200)) {
          return;
        }
        if ((this.field_db | this.field_o) != param0) {
          this.field_o = -this.field_o;
          this.field_db = -this.field_db;
          if (this.q(param0 ^ 21200)) {
            return;
          }
          this.field_o = -this.field_o;
          this.field_db = -this.field_db;
        }
    }

    private final int a(byte param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = client.field_A ? 1 : 0;
        int var2 = this.field_C * this.field_zb;
        for (var3 = 0; var2 > var3; var3++) {
          var4 = this.field_T[var3];
          if (0 != var4) {
            return (var4 & 24) >> 3;
          }
        }
        if (param0 < 35) {
          this.field_T = (int[]) null;
          return 0;
        }
        return 0;
    }

    final boolean n(int param0) {
        int var3 = 0;
        int var2;
        int var4;
        int var5;
        lk var6;
        var5 = client.field_A ? 1 : 0;
        var2 = this.field_O * this.field_a;
        for (var3 = 0; var2 > var3; var3++) {
          var4 = this.field_P[var3];
          if ((24 & var4) == 24) {
            var4 = var4 & 7;
            if (1 != var4 &&
              var4 != 3) {
              return true;
            }
          }
        }
        if (param0 != -22477) {
          var6 = (lk) null;
          this.a((oi) null, 112, true, (lk) null);
        }
        return false;
    }

    final static boolean a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6) {
        int var7 = -122 / ((param1 + 36) / 55);
        if (ea.d((byte) 69)) {
          im.a(-93, param6, param4, param5);
          if (w.field_H != null &&
            w.field_H.a(param4, param3, param0, 0, param5)) {
            param4 = false;
            tf.i((byte) -78);
          }
          ll.a(param4, 0, param5);
          ji.a(param2, 0, param4);
          param4 = false;
        }
        return param4;
    }

    final void a(boolean param0) {
        if (param0) {
          return;
        }
        this.field_nb = 0;
        this.field_p = 0;
        this.field_S = true;
        this.field_K = 0;
    }

    final void a(oi param0, int param1, boolean param2, lk param3) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int discarded$4 = 0;
        int discarded$5 = 0;
        int discarded$2 = 0;
        int discarded$3 = 0;
        ud stackIn_90_0 = null;
        RuntimeException stackIn_316_0 = null;
        StringBuilder stackIn_316_1 = null;
        String stackIn_317_2 = null;
        StringBuilder stackIn_319_1 = null;
        String stackIn_320_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ud var9_ref_ud = null;
        int var10 = 0;
        ei var10_ref_ei = null;
        ei var11_ref_ei = null;
        int var11 = 0;
        ei[] var11_ref_ei__ = null;
        int var12 = 0;
        ei var13 = null;
        int var14 = 0;
        ei var15 = null;
        ei var16 = null;
        ei var17 = null;
        ei var18 = null;
        ei[] var11_ref_ei__Lifetime1;
        ei var13Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var11Lifetime2;
        int var12Lifetime1;
        int var12Lifetime2;
        int var10Lifetime3;
        int var10Lifetime4;
        int var9Lifetime1Lifetime1;
        int var9Lifetime1Lifetime2;
        int var9Lifetime2Lifetime1;
        int var10Lifetime1Lifetime1;
        int var10Lifetime1Lifetime2;
        int var10Lifetime1Lifetime3;
        int var10Lifetime1Lifetime4;
        var14 = client.field_A ? 1 : 0;
        try {
          mk.field_e = 0;
          if (param1 <= 124) {
            return;
          }
          boolean decompiledFrameRemainder0 = true;
          boolean decompiledFrameRemainder3 = true;
          boolean decompiledFrameRemainder2 = true;
          dn.field_i = false;
          fk.field_H = 0;
          bj.field_a = false;
          pn.field_db = false;
          var5_int = 0;
          if (1 == this.field_ib) {
            var6 = 1;
            for (var7 = 0; this.field_a * this.field_O > var7; var7++) {
              var8 = this.field_P[var7];
              if (var8 >= 32) {
                var8 += 32;
                if (var8 < 416) {
                  var6 = 0;
                } else {
                  var8 = 0;
                }
                var5_int = 1;
                this.field_P[var7] = var8;
              }
            }
            if (var6 != 0) {
              this.field_ib = 0;
              decompiledFrameRemainder2 = false;
            }
            else {
              decompiledFrameRemainder0 = (var5_int == 0);
              if ((decompiledFrameRemainder0) &&
                (decompiledFrameRemainder0 = !(this.field_s)) &&
                (decompiledFrameRemainder0 = !(param2))) {
                gg.field_B = 2147483647;
                gi.field_a = 0;
                var6 = 0;
                for (var7 = 0; var7 < this.field_a * this.field_O; var7++) {
                  var8 = this.a(true, 2, 4, param3, true, -1, var7, 1, param0, false, (byte) 71);
                  if (var8 > 0) {
                    if (this.field_kb) {
                      if (this.a(-101, var8)) {
                        bj.field_a = true;
                      }
                      if (this.c(var8, -15303)) {
                        dn.field_i = true;
                      }
                      if (this.b(var8, -1)) {
                        pn.field_db = true;
                      }
                    }
                    var6++;
                  }
                }
                decompiledFrameRemainder3 = false;
              }
            }
          }
          if ((decompiledFrameRemainder3) &&
            (decompiledFrameRemainder2) &&
            (decompiledFrameRemainder0) &&
            (this.field_ib == 0)) {
            var6 = 0;
            var7 = 0;
            var8 = -1 + this.field_a * this.field_O;
            for (var9 = this.field_a - 1; var9 >= 0; var9--) {
              for (var10 = -1 + this.field_O; var10 >= 0; var10--) {
                boolean decompiledFrameRemainder1 = true;
                var11 = this.field_P[var8];
                if (var11 != 0) {
                  if (!param2 && (16 == (var11 & 24) ||
                    (var11 & 24) == 24) && (var9 < -1 + this.field_a &&
                    this.field_P[var8 + this.field_O] == 0)) {
                    this.field_P[var8 + this.field_O] = de.b(lb.a(var11, 31), 32);
                    this.field_P[var8] = 0;
                    var6++;
                    var5_int = 1;
                    decompiledFrameRemainder1 = false;
                  }
                  else {
                    if (!param2 && ((var11 & 24) == 16 ||
                      (24 & var11) == 24) && (this.field_a - 1 > var9 &&
                      var10 + this.field_l >= 0 &&
                      var10 + this.field_l < this.field_O &&
                      this.field_P[this.field_l + var8] == 0 &&
                      this.field_P[this.field_O + var8 + this.field_l] == 0)) {
                      this.field_P[this.field_l + var8] = de.b(lb.a(31, var11), 32);
                      this.field_P[var8] = 0;
                      var5_int = 1;
                      var6++;
                      decompiledFrameRemainder1 = false;
                    }
                    else {
                      if (!param2 && ((var11 & 24) == 16 ||
                        (var11 & 24) == 24) && (this.field_a - 1 > var9 &&
                        -this.field_l + var10 >= 0 &&
                        this.field_O > -this.field_l + var10 &&
                        this.field_P[-this.field_l + var8] == 0 &&
                        this.field_P[-this.field_l + (var8 + this.field_O)] == 0)) {
                        this.field_P[-this.field_l + var8] = de.b(lb.a(31, var11), 32);
                        var5_int = 1;
                        this.field_P[var8] = 0;
                        var6++;
                        decompiledFrameRemainder1 = false;
                      }
                      else {
                        if (32 <= var11) {
                          if (param2 &&
                            var11 < 64) {
                            var11 = var11 & 31;
                          } else {
                            if (var11 < 64) {
                              var7++;
                            }
                            var11 += 32;
                            if (var11 >= 448) {
                              var11 = var11 & 31;
                            }
                          }
                          this.field_P[var8] = var11;
                          var5_int = 1;
                        }
                      }
                    }
                  }
                }
                var8--;
              }
            }
            if (this.field_l != 0) {
              stackIn_90_0 = rc.field_i;
            } else {
              stackIn_90_0 = bf.field_u;
            }
            var9_ref_ud = stackIn_90_0;
            if (var6 > 0) {
              pg.field_a[this.field_Q] = true;
              var10Lifetime3 = (int)(0.5 + (double)this.field_k * Math.sqrt((double)var6));
              if (4 * this.field_k < var10Lifetime3) {
                var10Lifetime3 = 4 * this.field_k;
              }
              var15 = wf.field_l[this.field_Q];
              var11_ref_ei = var15;
              if (var11_ref_ei != null) {
                var15.f(-1);
              }
              if (var11_ref_ei != null &&
                var15.a((byte) 93) &&
                var15.field_q == var9_ref_ud) {
                var11_ref_ei.b(en.field_o / 50, var10Lifetime3 * pb.field_d, this.field_lb << 6);
              } else {
                if (var11_ref_ei != null) {
                  var15.g(en.field_o / 50);
                }
                var16 = ei.c(var9_ref_ud, 100, var10Lifetime3 * pb.field_d, this.field_lb << 6);
                var11_ref_ei = var16;
                var16.f(-1);
                dg.field_c.a(var16);
                wf.field_l[this.field_Q] = var16;
              }
            } else {
              var10_ref_ei = wf.field_l[this.field_Q];
              if (var10_ref_ei != null) {
                var10_ref_ei.g(en.field_o / 50);
                wf.field_l[this.field_Q] = null;
              }
            }
            if (0 < var7) {
              var10Lifetime4 = (2 + (int)((double)this.field_k * Math.sqrt((double)var7))) / 4;
              if (this.field_k < var10Lifetime4) {
                var10Lifetime4 = this.field_k;
              }
              ge.a(this.field_lb, var10Lifetime4, (byte) 127, bj.field_e);
            }
            if (var5_int != 0) {
              this.field_l = -this.field_l;
            } else {
              this.field_ib = 2;
              this.field_l = 0;
            }
          }
          if ((decompiledFrameRemainder3) && ((decompiledFrameRemainder0) &&
            (decompiledFrameRemainder0 = (var5_int == 0)) &&
            (decompiledFrameRemainder0 = !(this.field_s)) &&
            (decompiledFrameRemainder0 = !(param2)))) {
            gg.field_B = 2147483647;
            gi.field_a = 0;
            var6 = 0;
            for (var7 = 0; var7 < this.field_a * this.field_O; var7++) {
              var8 = this.a(true, 2, 4, param3, true, -1, var7, 1, param0, false, (byte) 71);
              if (var8 > 0) {
                if (this.field_kb) {
                  if (this.a(-101, var8)) {
                    bj.field_a = true;
                  }
                  if (this.c(var8, -15303)) {
                    dn.field_i = true;
                  }
                  if (this.b(var8, -1)) {
                    pn.field_db = true;
                  }
                }
                var6++;
              }
            }
          }
          if (decompiledFrameRemainder0) {
            this.a(-99, false, 1);
            if (var6 > 0) {
              this.field_K = this.field_K + var6;
              if (var6 >= 2) {
                var7 = ((int)((double)this.field_k * Math.sqrt((double)var6)) + 1) / 2;
                if (this.field_k < var7) {
                  var7 = this.field_k;
                }
                ge.a(this.field_lb, var7, (byte) 127, bf.field_w);
              }
              this.field_nb = this.field_nb + 1;
              if (this.field_nb >= 2) {
                var7 = (this.field_nb - 1) % 4;
                var8 = (-1 + this.field_nb) / 4 * 3;
                if (var7 == 3) {
                  var8++;
                }
                ai.a(62, var8, jm.field_v[var7], this.field_lb, this.field_k);
              }
              if (null != this.field_rb) {
                var7 = ik.a((byte) 126, var6);
                var8 = var7;
                fb.field_e = fb.field_e + var8;
                he.field_ab = he.field_ab + var8;
                this.field_ub = this.field_ub + var7;
                if (0 < var7) {
                  fieldTemp$0 = gg.field_B;
                  gg.field_B = gg.field_B - 1;
                  this.field_rb.a(new sa(true, this.field_O * 128, -384 + fieldTemp$0 * 256, var7, jg.field_f, -2 + var6, 0, new String[]{cm.$cfr$intArgs$a$53ce4ab4c593(85, on.field_h, new String[]{Integer.toString(var6)}), " = <b>", Integer.toString(var7)}), 2777);
                }
                var8 = le.b(32085, this.field_nb);
                if (0 < var8) {
                  fieldTemp$1 = gg.field_B;
                  gg.field_B = gg.field_B - 1;
                  this.field_W = new sa(true, 128 * this.field_O, -384 + fieldTemp$1 * 256, var8, nf.field_f, this.field_nb - 2, 0, new String[]{cm.$cfr$intArgs$a$53ce4ab4c593(115, e.field_d, new String[]{Integer.toString(this.field_nb)}), " = <b>", Integer.toString(var8)});
                }
              }
              var5_int = 1;
            } else {
              this.field_s = true;
            }
          }
          if (var5_int == 0 &&
            !param2) {
            var6 = 1;
            for (var7 = 0; var7 < this.field_a * this.field_O; var7++) {
              var8 = this.field_P[var7];
              if (var8 >= 32 &&
                (var8 & 31) != 25 &&
                (var8 & 31) != 27) {
                var8 += 32;
                if (var8 < 416) {
                  var6 = 0;
                } else {
                  var8 = 0;
                }
                this.field_P[var7] = var8;
                var5_int = 1;
              }
            }
            var7 = -1 + (-1 + this.field_a) * this.field_O;
            for (var8 = this.field_a - 2; var8 >= 0; var8--) {
              for (var9Lifetime1 = -1 + this.field_O; var9Lifetime1 >= 0; var9Lifetime1--) {
                var10Lifetime1 = this.field_P[var7];
                if (var10Lifetime1 == 25) {
                  discarded$4 = this.a(false, 2, 1, param3, false, -2, this.field_O + var7, 3, param0, false, (byte) 109);
                  this.b(-1, this.field_O + var7, false);
                }
                if (27 == var10Lifetime1) {
                  discarded$5 = this.a(true, 2, 1, param3, true, -2, this.field_O + var7, 3, param0, false, (byte) -99);
                  this.b(-1, var7 + this.field_O, false);
                }
                var7--;
              }
            }
            var7 = this.field_O * (-1 + this.field_a) - 1;
            for (var8 = -2 + this.field_a; var8 >= 0; var8--) {
              for (var9Lifetime1Lifetime1 = -1 + this.field_O; var9Lifetime1Lifetime1 >= 0; var9Lifetime1Lifetime1--) {
                var10Lifetime1Lifetime1 = this.field_P[var7];
                if (var10Lifetime1Lifetime1 == 25 &&
                  (this.field_P[var7 + this.field_O] & 1879048192) == 0) {
                  discarded$2 = this.a(false, 1, 1, param3, false, -1, var7 + this.field_O, 3, param0, false, (byte) 123);
                }
                if (var10Lifetime1Lifetime1 == 27 &&
                  0 == (this.field_P[this.field_O + var7] & 1879048192)) {
                  discarded$3 = this.a(false, 1, 1, param3, true, -1, this.field_O + var7, 3, param0, false, (byte) 72);
                }
                var7--;
              }
            }
            this.a(-121, false, 2);
            var8 = 0;
            var7 = -1 + this.field_O * this.field_a;
            var9Lifetime1Lifetime2 = 0;
            for (var10Lifetime1Lifetime2 = -1 + this.field_a; var10Lifetime1Lifetime2 >= 0; var10Lifetime1Lifetime2--) {
              for (var11Lifetime1 = this.field_O - 1; var11Lifetime1 >= 0; var11Lifetime1--) {
                var12 = this.field_P[var7];
                if ((31 & var12) == 25 ||
                  27 == (var12 & 31)) {
                  var5_int = 1;
                  if (32 > var12) {
                    if (-1 + this.field_a > var10Lifetime1Lifetime2) {
                      this.field_P[var7 + this.field_O] = var12;
                    }
                    this.field_P[var7] = var12 + 32;
                    var6 = 0;
                    if ((7 & var12) == 3) {
                      var9Lifetime1Lifetime2++;
                    } else {
                      var8++;
                    }
                  } else {
                    var12 += 32;
                    if (var12 < 416) {
                      var6 = 0;
                    } else {
                      var12 = 0;
                    }
                    this.field_P[var7] = var12;
                  }
                }
                var7--;
              }
            }
            if (0 < var8) {
              var10Lifetime1Lifetime3 = kd.field_s[0][this.field_Q];
              var11_ref_ei__ = sk.field_a[0];
              var12Lifetime1 = (1 + (int)((double)this.field_k * Math.sqrt((double)var8))) / 2;
              if (var12Lifetime1 > this.field_k) {
                var12Lifetime1 = this.field_k;
              }
              if (var12Lifetime1 < var10Lifetime1Lifetime3) {
                var12Lifetime1 = var10Lifetime1Lifetime3;
              }
              kd.field_s[0][this.field_Q] = var12Lifetime1;
              var13 = var11_ref_ei__[this.field_Q];
              if (var13 == null) {
                var17 = ei.c(ob.field_n, 100, pb.field_d * var12Lifetime1, this.field_lb << 6);
                var17.f(-1);
                dg.field_c.a(var17);
                var11_ref_ei__[this.field_Q] = var17;
              } else {
                var13.b(en.field_o / 50, var12Lifetime1 * pb.field_d, this.field_lb << 6);
              }
            }
            if (0 < var9Lifetime1Lifetime2) {
              var10Lifetime1Lifetime4 = kd.field_s[1][this.field_Q];
              var11_ref_ei__Lifetime1 = sk.field_a[1];
              var12Lifetime2 = (1 + (int)((double)this.field_k * Math.sqrt((double)var9Lifetime1Lifetime2))) / 2;
              if (this.field_k < var12Lifetime2) {
                var12Lifetime2 = this.field_k;
              }
              if (var12Lifetime2 < var10Lifetime1Lifetime4) {
                var12Lifetime2 = var10Lifetime1Lifetime4;
              }
              kd.field_s[1][this.field_Q] = var12Lifetime2;
              var13Lifetime1 = var11_ref_ei__Lifetime1[this.field_Q];
              if (var13Lifetime1 == null) {
                var18 = ei.c(ob.field_n, 120, var12Lifetime2 * pb.field_d, this.field_lb << 6);
                var18.f(-1);
                dg.field_c.a(var18);
                var11_ref_ei__Lifetime1[this.field_Q] = var18;
              } else {
                var13Lifetime1.b(en.field_o / 50, pb.field_d * var12Lifetime2, this.field_lb << 6);
              }
            }
            if (var5_int != 0 &&
              var6 != 0) {
              this.field_ib = 0;
              this.field_s = false;
            }
          }
          if (!param2 &&
            this.field_G != 0) {
            var6 = this.field_G;
            this.field_G = 0;
            var7 = 0;
            for (var8 = 0; this.field_a * this.field_O > var8; var8++) {
              var9Lifetime2 = this.field_P[var8];
              var10Lifetime2 = var9Lifetime2 >> 3;
              if (2 == var10Lifetime2 ||
                var10Lifetime2 == 1) {
                var11Lifetime2 = 1 << (7 & var9Lifetime2);
                if (0 != (var6 & var11Lifetime2)) {
                  var7 = var7 + this.a(true, var10Lifetime2, 1, param3, false, -1, var8, 3, param0, true, (byte) -72);
                }
              }
            }
            this.a(-107, true, this.field_ib);
            if (var7 > 0) {
              var5_int = 1;
              if (null != this.field_rb) {
                var8 = gg.b(var7, 27935);
                var9Lifetime2Lifetime1 = var8;
                he.field_ab = he.field_ab + var9Lifetime2Lifetime1;
                fb.field_e = fb.field_e + var9Lifetime2Lifetime1;
                this.field_hb = this.field_hb + var8;
                this.field_rb.a(new sa(true, this.field_O * 128, this.field_O * -32, var8, oh.field_c, -1 + h.a(var6, 63), 26, new String[]{" = <b>", Integer.toString(var8)}), 2777);
              }
            }
          }
          if (!param2 && (this.field_r ||
            this.field_Y)) {
            for (var6 = 0; this.field_O * this.field_a > var6; var6++) {
              var7 = this.field_P[var6];
              if (var7 != 23 && (this.field_r &&
                var7 >> 3 == 1 ||
                this.field_Y &&
                var7 >> 3 == 2)) {
                this.field_P[var6] = qm.b(24, var7);
              }
            }
            if (this.field_r) {
              this.field_v = true;
              ge.a(this.field_lb, this.field_k, (byte) 127, fj.field_k);
            }
            if (this.field_Y) {
              ge.a(this.field_lb, this.field_k, (byte) 127, w.field_Eb);
            }
            this.field_Y = false;
            this.field_r = false;
          }
          if (this.field_N != null) {
            this.field_mb = this.field_mb + 1;
            if (13 == this.field_mb) {
              this.field_N = null;
            }
          }
          if (!param2 &&
            var5_int == 0 &&
            null == this.field_N &&
            this.field_jb > 0 &&
            this.field_Z != this.field_z) {
            ge.a(this.field_lb, this.field_k, (byte) 127, qa.field_s);
            for (var6 = this.field_z; var6 < this.field_Z; var6++) {
              for (var7 = 0; var7 < this.field_O; var7++) {
                var8 = this.field_P[var6 * this.field_O + var7];
                if (var8 != 0) {
                  this.field_P[var6 * this.field_O + var7] = 32 + var8;
                  this.field_ib = 1;
                }
              }
            }
            this.field_L = this.field_L + (this.field_Z - this.field_z);
            var5_int = 1;
            this.field_z = this.field_Z;
          }
          if (var5_int == 0 &&
            this.field_N == null) {
            if (param2) {
              return;
            }
            this.field_S = false;
            this.field_s = false;
            this.field_ib = 0;
            this.field_v = false;
            if (this.field_rb != null &&
              this.field_W != null) {
              this.field_j = this.field_j + this.field_W.field_t;
              var6 = this.field_W.field_t;
              fb.field_e = fb.field_e + var6;
              he.field_ab = he.field_ab + var6;
              this.field_rb.a(this.field_W, 2777);
              this.field_W = null;
            }
            if (this.c((byte) -117)) {
              this.field_L = this.field_L - 1;
            }
            this.field_M = this.o(32);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_316_0 = var5;
          stackIn_316_1 = new StringBuilder().append("lk.WA(");
          if (param0 == null) {
            stackIn_317_2 = "null";
          } else {
            stackIn_317_2 = "{...}";
          }
          stackIn_319_1 = ((StringBuilder) (Object) stackIn_316_1).append(stackIn_317_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_320_2 = "null";
          } else {
            stackIn_320_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_316_0), ((StringBuilder) (Object) stackIn_319_1).append(stackIn_320_2).append(')').toString());
        }
    }

    public static void g(int param0) {
        if (param0 < 35) {
          mm var2 = (mm) null;
          lk.a((mm) null, true, (mm) null, -73);
        }
        field_i = null;
    }

    private final void b(byte param0) {
        this.field_q = this.field_q - 1;
        if (this.c((byte) -117)) {
          this.field_q = this.field_q + 1;
        } else {
          this.h(param0 + 115);
          ge.a(this.field_lb, this.field_k / 4, (byte) 127, hm.field_d);
        }
        if (param0 != -116) {
          this.field_j = 63;
        }
    }

    private final void c(int param0) {
        if (param0 != 0) {
          this.field_pb = -32;
        }
        ge.a(this.field_sb, this.field_J / 8, (byte) 127, ul.field_i);
    }

    private final rf p(int param0) {
        int var3 = 0;
        int var4 = client.field_A ? 1 : 0;
        if (this.field_t <= 0) {
          throw new IllegalStateException();
        }
        rf var2 = this.field_X[0];
        for (var3 = 1; this.field_t > var3; var3++) {
          this.field_X[-1 + var3] = this.field_X[var3];
        }
        this.field_m = this.field_m + 1;
        if (param0 <= 121) {
          return (rf) null;
        }
        this.field_t = this.field_t - 1;
        return var2;
    }

    final void a(boolean param0, wl param1, byte param2) {
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        var8 = client.field_A ? 1 : 0;
        try {
          var4_int = param1.e(3);
          stackIn_4_1 = ((var4_int & 256) != 0);
          this.field_S = stackIn_4_1;
          this.field_ab = (1616 & var4_int) >> 9;
          this.field_o = (-1073741824 & var4_int << 27) >> 30;
          stackIn_7_1 = (0 != (64 & var4_int));
          this.field_y = stackIn_7_1;
          if ((32 & var4_int) == 0) {
            this.field_ib = 1;
          } else {
            this.field_ib = 0;
          }
          this.field_db = (-1073741824 & var4_int << 29) >> 30;
          this.field_jb = param1.d((byte) -74);
          if (param0) {
            for (var5 = this.field_jb; 3 > var5; var5++) {
              rk.field_cb = rk.field_cb + 30000;
              fh.field_h = fh.field_h + 30000;
            }
          }
          for (var5Lifetime1 = 0; this.field_a * this.field_O > var5Lifetime1; var5Lifetime1++) {
            var6 = param1.d((byte) -40);
            if (var6 >= 128) {
              var7 = param1.d((byte) -102);
              var6 = 127 & var6 | var7 << 7;
            }
            this.field_P[var5Lifetime1] = var6;
          }
          this.field_U = param1.d((byte) -71);
          this.field_C = param1.d((byte) -38);
          this.field_zb = param1.d((byte) -39);
          this.field_T = new int[this.field_C * this.field_zb];
          this.field_b = new int[this.field_C * this.field_zb];
          this.field_tb = new int[this.field_zb * this.field_C];
          for (var5Lifetime2 = 0; var5Lifetime2 < this.field_C * this.field_zb; var5Lifetime2++) {
            this.field_T[var5Lifetime2] = param1.d((byte) -42);
          }
          for (var5Lifetime3 = 0; this.field_C * this.field_zb > var5Lifetime3; var5Lifetime3++) {
            this.field_b[var5Lifetime3] = 8;
          }
          this.field_q = param1.g((byte) -123);
          this.field_L = param1.g((byte) -84);
          this.field_e = param1.d((byte) -45);
          this.field_Ab = param1.e(3);
          this.field_A = param1.d((byte) -104);
          this.field_Cb = param1.g((byte) -122);
          this.field_yb = param1.d((byte) -102);
          if (param2 < 116) {
            this.a(84, false, 99);
          }
          this.field_K = param1.d((byte) -52);
          this.field_z = param1.d((byte) -100);
          this.field_Bb = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_32_0 = var4;
          stackIn_32_1 = new StringBuilder().append("lk.JA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param2).append(')').toString());
        }
    }

    private final int o(int param0) {
        if (param0 != 32) {
          field_i = (String) null;
        }
        return this.field_o + this.field_zb + 2 * this.field_L;
    }

    private final void d(int param0) {
        int var2 = this.o(32);
        if (this.field_M < var2) {
          this.field_M = var2;
        }
        if (param0 != 30968) {
          lk var3 = (lk) null;
          this.a((oi) null, -76, false, (lk) null);
        }
    }

    private final int a(int param0, int param1, int param2, int param3, int param4) {
        int incrementValue$0 = 0;
        if (param1 <= 123) {
          this.field_pb = -105;
        }
        int var6 = this.field_P[param0];
        if ((-1879048193 & var6) == param4 ||
          (var6 & -1879048193) == param2) {
          incrementValue$0 = param3;
          param3++;
          this.field_w[incrementValue$0] = param0;
          this.field_P[param0] = var6 + -2147483648;
        }
        return param3;
    }

    private final void b(int param0, int param1, boolean param2) {
        int var4;
        var4 = this.field_P[param1];
        if (param2) {
          return;
        }
        if (24 == (-1879048200 & var4)) {
          if (1 == (7 & var4)) {
            return;
          }
          if ((7 & var4) == 3) {
            return;
          }
          if ((var4 & -1879048193) == 24 &&
            0 == this.field_l) {
            this.field_l = 1;
            ge.a(this.field_lb, this.field_k / 2, (byte) 127, pk.field_q);
          }
          if ((var4 & -1879048193) == 29) {
            this.field_Y = true;
          }
          if ((var4 & -1879048193) == 26 &&
            param0 >= 0) {
            this.field_G = this.field_G | 1 << param0;
          }
          if ((-1879048193 & var4) == 28) {
            this.field_r = true;
          }
          if ((1879048192 & var4) == 0) {
            this.field_P[param1] = 268435456 + var4;
            if (this.field_rb != null) {
              he.field_ab = he.field_ab + 2000;
              fb.field_e = fb.field_e + 2000;
              this.field_bb = this.field_bb + 2000;
              this.field_rb.a(new sa(true, 128 + 256 * (param1 % this.field_O), param1 / this.field_O * 256 + 128, 2000, (int[]) null, 13684944, var4, new String[]{" = <b>", Integer.toString(2000)}), 2777);
            }
          }
        }
    }

    private final boolean t(int param0) {
        int[] array$2 = null;
        int incrementValue$3 = 0;
        int var7 = 0;
        int[] var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var8;
        int[] var9;
        int[] var10;
        int[] var11;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        var8 = client.field_A ? 1 : 0;
        var11 = this.field_B;
        var10 = var11;
        var9 = var10;
        var2 = var9;
        if (var9 == null ||
          var11.length < this.field_C * this.field_zb) {
          array$2 = new int[this.field_C * this.field_zb];
          var2 = array$2;
          this.field_B = array$2;
        }
        var3 = param0;
        for (var4 = 0; this.field_zb > var4; var4++) {
          var5 = (-1 + this.field_C) * this.field_zb + var4;
          for (var6 = 0; var6 < this.field_C; var6++) {
            incrementValue$3 = var3;
            var3++;
            this.field_B[var5] = this.field_T[incrementValue$3];
            var5 = var5 - this.field_zb;
          }
        }
        var4Lifetime1 = -this.field_o - this.field_zb + (this.field_C + this.field_db) >> 1;
        this.field_q = this.field_q + var4Lifetime1;
        var5Lifetime1 = this.field_o + this.field_db + (-this.field_C + this.field_zb) >> 1;
        this.field_L = this.field_L + var5Lifetime1;
        var3Lifetime1 = this.field_C;
        this.field_C = this.field_zb;
        this.field_zb = var3Lifetime1;
        this.field_B = this.field_T;
        this.field_T = var2;
        if (this.c((byte) -117)) {
          this.field_T = this.field_B;
          this.field_zb = this.field_C;
          this.field_B = var2;
          this.field_L = this.field_L - var5Lifetime1;
          this.field_q = this.field_q - var4Lifetime1;
          this.field_C = var3Lifetime1;
          return false;
        }
        this.field_ab = this.field_ab - 1;
        var3Lifetime2 = this.field_db;
        this.field_db = this.field_o;
        this.field_o = -var3Lifetime2;
        this.d(30968);
        var3Lifetime3 = 0;
        this.h(~param0);
        for (var6Lifetime1 = 0; this.field_zb > var6Lifetime1; var6Lifetime1++) {
          for (var7 = 0; var7 < this.field_C; var7++) {
            this.field_tb[var3Lifetime3] = 0;
            this.field_b[var3Lifetime3] = 8 * (-1 - var7 * 2 + this.field_db + this.field_C) / this.field_C;
            var3Lifetime3++;
          }
        }
        ge.a(this.field_lb, this.field_k / 4, (byte) 127, ib.field_ob);
        return true;
    }

    final int a(int param0, byte param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var4 = 0;
        int var4Lifetime1;
        if (0 != this.field_C &&
          !this.field_S) {
          var4 = param2 - this.field_q;
          var5 = -this.field_L + param0;
          if (var4 >= 0 &&
            var5 >= 0 &&
            this.field_C > var4) {
            if (var5 >= this.field_zb) {
              var4 = 119 / ((45 - param1) / 37);
              return 0;
            }
            var6 = var5 * this.field_C + var4;
            if (this.field_T[var6] != 0) {
              return this.field_tb[var6];
            }
          }
        }
        var4Lifetime1 = 119 / ((45 - param1) / 37);
        return 0;
    }

    private final int b(int param0, int param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int discarded$0 = 0;
        int var7 = client.field_A ? 1 : 0;
        int var4 = 0;
        for (var5 = param0; var5 < param1; var5++) {
          var6 = this.field_w[var5];
          var4 = var4 + var6 % this.field_O;
        }
        if (param2 <= 49) {
          discarded$0 = this.a((byte) -117);
        }
        return 128 + var4 * 256 / (-param0 + param1);
    }

    final int r(int param0) {
        if (param0 != 3837) {
          return -4;
        }
        if (0 > this.field_L) {
          return this.field_L;
        }
        return 0;
    }

    private final boolean a(byte param0, boolean param1) {
        int var3 = 0;
        int var4 = client.field_A ? 1 : 0;
        int var3Lifetime1;
        this.field_L = this.field_L + 1;
        if (this.c((byte) -117)) {
          this.field_L = this.field_L - 1;
          return true;
        }
        this.d(30968);
        if (param1) {
          var3 = this.a((byte) 103);
          if (var3 != 1) {
            ge.a(this.field_lb, this.field_k / 4, (byte) 127, pg.field_d);
          } else {
            ge.a(this.field_lb, this.field_k / 8, (byte) 127, client.field_F);
          }
        }
        int var5 = 0;
        var3Lifetime1 = var5;
        while (this.field_zb * this.field_C > var5) {
          this.field_tb[var5] = 0;
          this.field_b[var5] = 8;
          var5++;
        }
        if (param0 >= -27) {
          this.a(-71, (byte) 28, false);
        }
        return false;
    }

    private final boolean c(byte param0) {
        int var4 = 0;
        int var5 = 0;
        int var2;
        int var3;
        int var6;
        var6 = client.field_A ? 1 : 0;
        var2 = 0;
        var3 = this.field_q + this.field_L * this.field_O;
        for (var4 = 0; var4 < this.field_zb; var4++) {
          for (var5 = 0; this.field_C > var5; var5++) {
            boolean decompiledFrameRemainder0 = true;
            if (this.field_T[var2] != 0) {
              if (this.field_q + var5 >= 0 &&
                this.field_O > this.field_q + var5) {
                if (this.field_L + var4 >= this.field_a) {
                  return true;
                }
                if ((!(var4 + this.field_L < 0)) &&
                  (this.field_P[var3] != 0)) {
                  return true;
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                return true;
              }
            }
            var2++;
            var3++;
          }
          var3 = var3 + (this.field_O - this.field_C);
        }
        if (param0 == -117) {
          return false;
        }
        return true;
    }

    final int b(int param0, byte param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var4 = 0;
        if (param1 <= 102) {
          return -33;
        }
        if (this.field_N != null) {
          var5 = -this.field_ob + param0;
          var6 = -this.field_E + param2;
          if (var5 >= 0 &&
            var6 >= 0 &&
            var5 < this.field_V &&
            var6 < this.field_h) {
            var7 = this.field_N[var6 * this.field_V + var5];
            if (var7 != 0) {
              var4 = this.field_mb;
            }
          }
        }
        return var4;
    }

    final void a(int param0, byte param1, boolean param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var5Lifetime1;
        int var4Lifetime1;
        var10 = client.field_A ? 1 : 0;
        var4 = 0;
        var5 = -97 % ((83 - param1) / 37);
        while (this.field_C * this.field_zb > var4) {
          if (this.field_T[var4] != 0) {
            this.field_qb = this.field_qb + 1;
          }
          var4++;
        }
        this.field_Z = param0;
        if (this.field_z <= this.field_L) {
          var4Lifetime1 = 0;
          var5Lifetime1 = this.field_L * this.field_O + this.field_q;
          var6 = 0;
          for (var7 = 0; var7 < this.field_zb; var7++) {
            for (var8 = 0; var8 < this.field_C; var8++) {
              var9 = this.field_T[var4Lifetime1];
              if (var9 != 0) {
                if ((24 & var9) == 16 ||
                  var7 == 0 ||
                  this.field_T[-this.field_C + var4Lifetime1] == 0) {
                  var9 = var9 | 32;
                }
                this.field_P[var5Lifetime1] = var9;
                if ((24 & var9) == 16 &&
                  this.field_rb != null) {
                  this.field_x = this.field_x + 25;
                  fb.field_e = fb.field_e + 25;
                  he.field_ab = he.field_ab + 25;
                }
                if (8 == (24 & var9)) {
                  var6++;
                }
              }
              var5Lifetime1++;
              var4Lifetime1++;
            }
            var5Lifetime1 = var5Lifetime1 + (this.field_O - this.field_C);
          }
          if (0 < var6) {
            var7 = ((int)((double)this.field_k * Math.sqrt((double)var6)) + 4) / 8;
            if (var7 > this.field_k) {
              var7 = this.field_k;
            }
            ge.a(this.field_lb, var7, (byte) 127, fh.field_c);
          }
        } else {
          this.field_jb = this.field_jb - 1;
          if (param2) {
            fh.field_h = fh.field_h + 30000;
            rk.field_cb = rk.field_cb + 30000;
          }
          if (this.field_jb <= 0) {
            this.k(-9897);
            return;
          }
          this.field_E = this.field_L;
          this.field_V = this.field_C;
          this.field_ob = this.field_q;
          this.field_h = this.field_zb;
          var4Lifetime1 = this.field_V * this.field_h;
          this.field_N = new int[var4Lifetime1];
          var5Lifetime1 = var4Lifetime1;
          for (var6 = -1 + (this.field_L + this.field_zb); this.field_L <= var6; var6--) {
            for (var7 = -1 + (this.field_q + this.field_C); this.field_q <= var7; var7--) {
              var5Lifetime1--;
              var8 = this.field_T[var5Lifetime1];
              if ((24 & var8) != 16 &&
                24 != (var8 & 24)) {
                this.field_N[var5Lifetime1] = var8;
              } else {
                var9 = var6;
                if (var9 < this.field_z) {
                  var9 = this.field_z;
                }
                if (this.field_a > var9 &&
                  this.field_P[var7 + this.field_O * var9] == 0) {
                  this.field_P[var7 + this.field_O * var9] = 32 + var8;
                  if (16 == (var8 & 24) &&
                    this.field_rb != null) {
                    fb.field_e = fb.field_e + 25;
                    he.field_ab = he.field_ab + 25;
                    this.field_x = this.field_x + 25;
                  }
                } else {
                  this.field_N[var5Lifetime1] = var8;
                }
              }
            }
          }
          this.field_mb = 1;
          ge.a(this.field_lb, this.field_k / 2, (byte) 127, ul.field_i);
        }
        this.field_p = 0;
        this.field_S = true;
        this.field_Bb = false;
        this.field_nb = 0;
        this.field_K = 0;
        this.field_C = 0;
    }

    final static void a(mm param0, boolean param1, mm param2, int param3) {
        try {
          rk.field_R = param2;
          om.field_a = param3;
          bg.field_g = param0;
          pj.a(31004, hk.field_j / 2, hk.field_i / 2);
          s.a(param2.field_C, param0.field_K + param0.field_C, (byte) -91, param0.field_C, param2.field_C + param2.field_K);
          if (!param1) {
            field_i = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "lk.HA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    private final boolean b(int param0, int param1) {
        int var5 = 0;
        int var3;
        int var4;
        int var6;
        int var7;
        boolean stackIn_16_0 = false;
        var7 = client.field_A ? 1 : 0;
        var3 = 0;
        var4 = 0;
        for (var5 = 0; var5 < param0; var5++) {
          var6 = this.field_w[var5];
          if (var6 < this.field_O) {
            var3 = 1;
          }
          if (this.field_O * (this.field_a - 1) <= var6) {
            var4 = 1;
          }
        }
        if (param1 != -1) {
          return true;
        }
        stackIn_16_0 = (var3 != 0) && (var4 != 0);
        return stackIn_16_0;
    }

    private final void c(int param0, int param1, int param2) {
        int var5;
        int stackIn_7_1 = 0;
        boolean stackIn_8_2 = false;
        int var4;
        var5 = client.field_A ? 1 : 0;
        if (param0 != 30000) {
          this.field_O = -79;
        }
        this.field_e = param1;
        while (param1 == 0) {
          if (this.field_y) {
            this.field_Bb = true;
          } else {
            stackIn_7_1 = -126;
            stackIn_8_2 = (0 == param2);
            if (!this.a((byte) stackIn_7_1, stackIn_8_2)) {
              param2++;
              param1 = this.field_g;
              this.field_e = this.field_g;
              continue;
            }
            this.field_e = 20;
            this.field_y = true;
          }
          break;
        }
        if (this.field_g == 0 &&
          param2 > 0) {
          var4 = ((int)((double)this.field_k * Math.sqrt((double)(this.field_a + param2) / ((double)this.field_a * 2.0))) + 4) / 8;
          if (var4 > this.field_k) {
            var4 = this.field_k;
          }
          ge.a(this.field_lb, var4, (byte) 127, fh.field_c);
        }
    }

    final boolean e(int param0) {
        int var2 = -106 % ((param0 + 22) / 51);
        if (this.field_t > 0 &&
          this.field_X[0].field_l == 0) {
          return true;
        }
        if (this.field_pb >= 18) {
          return true;
        }
        return false;
    }

    private final boolean a(int param0, int param1) {
        int discarded$1 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var11;
        int var8;
        int var9;
        int var10;
        var11 = client.field_A ? 1 : 0;
        if (4 != param1) {
          return false;
        }
        if (param0 >= -45) {
          discarded$1 = this.a(-31, -66, (byte) 71, -102);
        }
        var3 = 0;
        L1: while (true) {
          if (var3 >= 4) {
            return false;
          }
          var4 = this.field_w[var3];
          var5 = var4 % this.field_O;
          var6 = var4 / this.field_O;
          var7 = 0;
          while (4 > var7) {
            if (var3 != var7) {
              var8 = this.field_w[var7];
              var9 = var8 % this.field_O;
              var10 = var8 / this.field_O;
              var9 = var9 - var5;
              var10 = var10 - var6;
              if ((0 != var9 ||
                var10 != -1 &&
                var10 != 1) &&
                (0 != var10 ||
                var9 != -1 &&
                var9 != 1)) {
                var3++;
                continue L1;
              }
            }
            var7++;
          }
          break;
        }
        return true;
    }

    private final void a(lk param0, oi param1, int param2, int param3, int param4) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Object var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        rf var21 = null;
        int var10Lifetime1;
        int var11Lifetime1;
        int var13Lifetime1;
        int var15Lifetime1;
        int var12Lifetime1;
        var19 = client.field_A ? 1 : 0;
        try {
          if (param0 == null &&
            param1 == null) {
            return;
          }
          var6_int = -1 + this.field_O;
          var7 = -1 + this.field_a;
          var8 = param3;
          var9 = 0;
          for (var10 = 0; param4 > var10; var10++) {
            var11 = this.field_w[var10];
            var12 = var11 % this.field_O;
            var13 = var11 / this.field_O;
            if (var12 < var6_int) {
              var6_int = var12;
            }
            if (var12 > var8) {
              var8 = var12;
            }
            if (var9 < var13) {
              var9 = var13;
            }
            if (var13 < var7) {
              var7 = var13;
            }
          }
          var10Lifetime1 = -var6_int + 1 + var8;
          var11Lifetime1 = var9 + 1 - var7;
          var12Lifetime1 = var10Lifetime1 * var11Lifetime1;
          fieldTemp$0 = this.field_fb;
          this.field_fb = this.field_fb + 1;
          var13Lifetime1 = fieldTemp$0;
          var14 = null;
          if (param1 != null) {
            var14 = param1.a(false, var13Lifetime1);
          }
          if (var14 == null) {
            var21 = new rf(var13Lifetime1);
            var14 = var21;
            fieldTemp$1 = this.field_p;
            this.field_p = this.field_p + 1;
            var21.field_m = fieldTemp$1;
            if (param1 != null) {
              param1.a(var21, 0);
            }
          }
          ((rf) (var14)).field_b = var10Lifetime1;
          ((rf) (var14)).field_c = new byte[var12Lifetime1];
          ((rf) (var14)).field_n = var11Lifetime1;
          for (var15 = 0; var15 < var12Lifetime1; var15++) {
            ((rf) (var14)).field_c[var15] = (byte) 0;
          }
          var20 = 0;
          var15Lifetime1 = var20;
          while (var20 < param4) {
            var16 = this.field_w[var20];
            var17 = -var6_int + var16 % this.field_O;
            var18 = var16 / this.field_O - var7;
            ((rf) (var14)).field_c[var17 + var18 * var10Lifetime1] = (byte)param2;
            var20++;
          }
          if (param0 != null) {
            param0.a((rf) (var14), (byte) -128);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_36_0 = var6;
          stackIn_36_1 = new StringBuilder().append("lk.T(");
          if (param0 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          stackIn_39_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',');
          if (param1 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void a(int param0, int param1, boolean param2) {
        int discarded$0 = 0;
        if (param1 != 2113050941) {
          discarded$0 = this.a(80, 86, (byte) -26, -11);
        }
        if (!param2) {
          this.field_g = mn.field_b[param0];
        } else {
          this.field_g = pn.field_eb[param0];
        }
    }

    private final void c(boolean param0) {
        boolean discarded$0 = false;
        if (this.t(0)) {
          return;
        }
        if (param0) {
          discarded$0 = this.c(61, 75);
        }
        if ((this.field_db | this.field_o) != 0) {
          this.field_db = -this.field_db;
          this.field_o = -this.field_o;
          if (this.t(0)) {
            return;
          }
          this.field_db = -this.field_db;
          this.field_o = -this.field_o;
        }
    }

    private final int a(int param0, int param1, byte param2, int param3) {
        int incrementValue$0 = 0;
        int discarded$1 = 0;
        int var5 = this.field_P[param1];
        if (param3 != (-1879048193 & var5)) {
          this.b(7 & param3, param1, false);
        } else {
          if ((var5 & 1879048192) < 1879048192) {
            var5 = var5 + 268435456;
          }
          incrementValue$0 = param0;
          param0++;
          this.field_w[incrementValue$0] = param1;
          this.field_P[param1] = var5 + -2147483648;
        }
        if (param2 != -44) {
          oi var6 = (oi) null;
          discarded$1 = this.a(true, 26, -7, (lk) null, true, 84, -39, 24, (oi) null, false, (byte) -94);
        }
        return param0;
    }

    private final void j(int param0) {
        this.field_q = this.field_q + 1;
        if (!this.c((byte) -117)) {
          this.h(-1);
          ge.a(this.field_lb, this.field_k / 4, (byte) 127, hm.field_d);
        } else {
          this.field_q = this.field_q - 1;
        }
        if (param0 != 4) {
          this.field_mb = -42;
        }
    }

    private final int a(boolean param0, int param1, int param2) {
        int var6 = 0;
        int var7 = 0;
        int var8 = client.field_A ? 1 : 0;
        int var4 = 0;
        int var5 = param2;
        if (!param0) {
          this.field_N = (int[]) null;
        }
        while (var5 < param1) {
          var6 = this.field_w[var5];
          var7 = var6 / this.field_O;
          if (gg.field_B > var7) {
            gg.field_B = var7;
          }
          if (gi.field_a < var7) {
            gi.field_a = var7;
          }
          var4 = var4 + var7;
          var5++;
        }
        return 128 + var4 * 256 / (param1 - param2);
    }

    final int a(int param0) {
        if (param0 != 0) {
          this.field_A = -70;
        }
        return this.field_j + (this.field_ub + this.field_hb) + (this.field_H + this.field_x) - (-this.field_bb - this.field_f);
    }

    final int m(int param0) {
        int var2 = 0;
        if (1 <= this.field_c) {
          var2++;
        }
        int var3 = this.field_u.a(79, var2 + this.field_d);
        int var4 = this.field_u.a(107, this.field_d + var2);
        if (param0 != 26580) {
          return -69;
        }
        if (this.field_d == var3) {
          var3 = 7;
        }
        if (this.field_d == var4) {
          var4 = 7;
        }
        return var4 + (var3 << 4);
    }

    final void s(int param0) {
        rf discarded$0 = null;
        int stackIn_104_0 = 0;
        int stackIn_111_0 = 0;
        int stackIn_111_1 = 0;
        int stackIn_122_0 = 0;
        int var2;
        int var3;
        int var4;
        rf var4_ref_rf;
        int var5_int;
        ei var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        ei var11;
        ei var13;
        int[] var16;
        int var2Lifetime1;
        int var3Lifetime1;
        int var3Lifetime2;
        int var4Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var2Lifetime2;
        int var3Lifetime3;
        int var4Lifetime2;
        int var6Lifetime2;
        int var7Lifetime2;
        int var8Lifetime1;
        int var9Lifetime1;
        int var7Lifetime3;
        int var8Lifetime2;
        int var2Lifetime2Lifetime1;
        int var6Lifetime2Lifetime1;
        int var8Lifetime1Lifetime1;
        var10 = client.field_A ? 1 : 0;
        if (!this.field_S) {
          var2 = 0;
          for (var3 = 0; this.field_zb > var3; var3++) {
            for (var4 = 0; this.field_C > var4; var4++) {
              var5_int = this.field_tb[var2];
              var6 = this.field_b[var2];
              if (var5_int < 0) {
                var6 = var6 - (var5_int >> 1);
              } else {
                var6 = var6 + (-var5_int >> 1);
              }
              var5_int = var5_int + var6;
              if (0 <= var5_int) {
                var5_int = var5_int + (-var5_int >> 4);
              } else {
                var5_int = var5_int - (var5_int >> 4);
              }
              this.field_tb[var2] = var5_int;
              this.field_b[var2] = var6;
              var2++;
            }
          }
          for (var3Lifetime3 = 0; var3Lifetime3 < this.field_C; var3Lifetime3++) {
            var4Lifetime2 = -1073741824;
            for (var5_int = 0; var5_int < this.field_zb; var5_int++) {
              var2Lifetime2 = var3Lifetime3 + var5_int * this.field_C;
              var6Lifetime2 = this.field_q + var3Lifetime3;
              if (var6Lifetime2 >= 0 &&
                this.field_O > var6Lifetime2) {
                var7 = this.field_L - (-var5_int + 1);
                var8 = 0;
                while (var7 >= 0) {
                  if (var4Lifetime2 >= var8) {
                    break;
                  }
                  if (var7 < this.field_a &&
                    0 != this.field_P[var6Lifetime2 + var7 * this.field_O]) {
                    var4Lifetime2 = var8;
                    break;
                  }
                  var7--;
                  var8 -= 80;
                }
              }
              var7Lifetime3 = this.field_tb[var2Lifetime2];
              var8Lifetime2 = this.field_b[var2Lifetime2];
              if (var7Lifetime3 < var4Lifetime2) {
                var7Lifetime3 = var4Lifetime2;
                if (0 > var8Lifetime2) {
                  var8Lifetime2 = -var8Lifetime2;
                }
              }
              this.field_tb[var2Lifetime2] = var7Lifetime3;
              this.field_b[var2Lifetime2] = var8Lifetime2;
              var4Lifetime2 -= 80;
              if (this.field_T[var2Lifetime2] != 0 &&
                var4Lifetime2 < var7Lifetime3) {
                var4Lifetime2 = var7Lifetime3;
              }
            }
            var5_int = 1073741823;
            for (var6Lifetime2Lifetime1 = -1 + this.field_zb; 0 <= var6Lifetime2Lifetime1; var6Lifetime2Lifetime1--) {
              var2Lifetime2Lifetime1 = this.field_C * var6Lifetime2Lifetime1 + var3Lifetime3;
              var7Lifetime2 = var3Lifetime3 + this.field_q;
              if (var7Lifetime2 >= 0 &&
                this.field_O > var7Lifetime2) {
                var8Lifetime1 = this.field_L + var6Lifetime2Lifetime1 + 1;
                var9 = 0;
                while (var5_int > var9) {
                  if (var8Lifetime1 < this.field_a && (var8Lifetime1 < 0 ||
                    this.field_P[var7Lifetime2 + this.field_O * var8Lifetime1] == 0)) {
                    var9 += 80;
                    var8Lifetime1++;
                    continue;
                  }
                  var5_int = var9;
                  break;
                }
              }
              var8Lifetime1Lifetime1 = this.field_tb[var2Lifetime2Lifetime1];
              var9Lifetime1 = this.field_b[var2Lifetime2Lifetime1];
              if (var8Lifetime1Lifetime1 > var5_int) {
                if (var9Lifetime1 > 0) {
                  var9Lifetime1 = -var9Lifetime1;
                }
                var8Lifetime1Lifetime1 = var5_int;
              }
              this.field_tb[var2Lifetime2Lifetime1] = var8Lifetime1Lifetime1;
              this.field_b[var2Lifetime2Lifetime1] = var9Lifetime1;
              var5_int += 80;
              if (this.field_T[var2Lifetime2Lifetime1] != 0 &&
                var5_int > var8Lifetime1Lifetime1) {
                var5_int = var8Lifetime1Lifetime1;
              }
            }
          }
        }
        if (this.field_vb != null) {
          this.field_R = this.field_R + 1;
          if (100 <= this.field_R) {
            this.field_vb = null;
          }
        }
        var2Lifetime1 = 1;
        for (var3Lifetime1 = 0; this.field_t > var3Lifetime1; var3Lifetime1++) {
          var4_ref_rf = this.field_X[var3Lifetime1];
          if (null == var4_ref_rf.field_c &&
            var4_ref_rf.field_l <= 18) {
            var2Lifetime1 = 0;
          }
          if (var2Lifetime1 != 0 &&
            0 < var4_ref_rf.field_l) {
            if (18 == var4_ref_rf.field_l) {
              this.b(false);
            }
            var4_ref_rf.field_l = var4_ref_rf.field_l - 1;
            var5_int = var4_ref_rf.field_m + 1;
            if (var4_ref_rf.field_l == 12 &&
              var5_int >= 5) {
              this.field_vb = cm.$cfr$intArgs$a$53ce4ab4c593(105, uj.field_b, new String[]{Integer.toString(var5_int)});
              this.field_eb = ka.a((byte) 62, 7, tf.field_cb) - 3;
              this.field_n = ka.a((byte) 126, 7, tf.field_cb) - 3;
              this.field_R = 0;
              var16 = vl.field_G;
              var7Lifetime1 = var5_int / 10;
              if (var16.length <= var7Lifetime1) {
                var7Lifetime1 = var16.length - 1;
              }
              this.field_xb = var16[var7Lifetime1];
            }
          }
          if (var4_ref_rf.field_e > 0) {
            var4_ref_rf.field_e = var4_ref_rf.field_e + 1;
          }
        }
        if (param0 != -21142) {
          this.h(13);
        }
        stackIn_104_0 = (!this.e(-124)) ? 0 : 1;
        var3Lifetime2 = stackIn_104_0;
        while (this.field_t > 0) {
          if (this.field_X[0].field_e >= 13) {
            discarded$0 = this.p(127);
            continue;
          }
          break;
        }
        if (this.field_cb != null &&
          this.field_cb.c((byte) 70) != null) {
          stackIn_111_0 = -1;
          stackIn_111_1 = ~this.field_pb;
          if (stackIn_111_0 == stackIn_111_1) {
            this.b(false);
          }
          if (this.field_pb == 322) {
            this.c(0);
          }
          this.field_pb = this.field_pb + 1;
          if (335 == this.field_pb) {
            this.field_pb = 0;
            this.field_cb.a(param0 + 21146);
          }
        }
        stackIn_122_0 = (!this.e(param0 ^ 21190)) ? 0 : 1;
        var4Lifetime1 = stackIn_122_0;
        if (var2Lifetime1 != 0 &&
          18 < this.field_wb) {
          this.field_wb = this.field_wb - 1;
        }
        if (var3Lifetime2 != 0 &&
          var4Lifetime1 == 0) {
          ge.a(this.field_sb, this.field_J / 8, (byte) 127, ig.field_ac);
        }
        if (var4Lifetime1 != 0) {
          ah.field_b[this.field_Q] = true;
          var5 = ik.field_c[this.field_Q];
          if (var5 == null) {
            var6Lifetime1 = 100 + rd.a((byte) 16, 4, this.field_Q);
            var11 = ei.c(kf.field_P, var6Lifetime1, pb.field_d * this.field_J, this.field_sb << 6);
            var13 = var11;
            var13.f(-1);
            dg.field_c.a(var11);
            ik.field_c[this.field_Q] = var11;
          } else {
            var5.b(en.field_o / 50, pb.field_d * this.field_J, this.field_sb << 6);
          }
        }
    }

    lk(boolean param0, int param1, int param2, int param3, int param4) {
        this.field_k = 128;
        this.field_r = false;
        this.field_j = 0;
        this.field_wb = 18;
        this.field_U = -1;
        this.field_K = 0;
        this.field_vb = null;
        this.field_X = new rf[1];
        this.field_sb = 48;
        this.field_G = 0;
        this.field_lb = 128;
        this.field_Y = false;
        this.field_R = 0;
        this.field_S = false;
        this.field_x = 0;
        this.field_f = 0;
        this.field_l = 0;
        this.field_ib = 0;
        this.field_u = null;
        this.field_Q = -1;
        this.field_v = false;
        this.field_J = 128;
        this.field_hb = 0;
        this.field_ub = 0;
        this.field_s = false;
        this.field_Bb = false;
        this.field_bb = 0;
        this.field_H = 0;
        this.field_jb = 3;
        this.field_pb = 0;
        if (param0) {
          this.field_O = 12;
          this.field_a = 27;
        } else {
          this.field_a = 18;
          this.field_O = 8;
        }
        this.field_d = param3;
        this.field_w = new int[this.field_O * this.field_a];
        this.field_D = param2;
        this.field_c = param4;
        this.field_P = new int[this.field_O * this.field_a];
        this.a(param1, 2113050941, false);
        this.field_t = 0;
        this.field_m = 0;
    }

    static {
        field_I = 3;
        field_i = "There are no valid types of game that match your preferences.";
    }
}
