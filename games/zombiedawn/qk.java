/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class qk extends ah {
    static int[] field_Kb;
    private int field_Lb;
    static vn[] field_Hb;
    private boolean field_wb;
    kd field_yb;
    int field_Ab;
    private int field_Fb;
    int field_Eb;
    static al[] field_Jb;
    static int[] field_Cb;
    static int field_Db;
    private int field_zb;
    int field_Gb;
    static int field_Mb;
    private int field_xb;
    private int field_Ib;
    private boolean field_Bb;

    final static vn c(int param0, byte param1, int param2) {
        int var5 = ZombieDawn.field_J;
        vn var6 = new vn(param2, param2);
        vn var3 = var6;
        int var4 = 0;
        if (param1 != -71) {
          return (vn) null;
        }
        while (var4 < var3.field_z.length) {
          var6.field_z[var4] = param0;
          var4++;
        }
        return var3;
    }

    public static void v(int param0) {
        field_Hb = null;
        if (param0 != 15213) {
          return;
        }
        field_Cb = null;
        field_Jb = null;
        field_Kb = null;
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4) {
        int var5 = 0;
        if (bi.field_f == bd.field_e) {
          if (bi.field_a != nh.field_P) {
            return;
          }
          if (param4) {
            qk.v(32);
          }
          var5 = 3;
          bi.a(param3, param0, param1, param2, 0, 96);
          bi.h(var5, var5, param3, param0, param1, param2);
          return;
        }
    }

    void a(byte param0, wk param1) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          super.a((byte) -83, param1);
          if (param0 > -76) {
            return;
          }
          if (this.field_G == 1 &&
            this.field_F == 10) {
            this.b(param1.a(this.a(true), (byte) -70), (byte) -114, param1.a(this.f(237239984), 0));
          }
          if (ng.field_e) {
            if (this.field_t == 28) {
              this.a(param1, 5060);
              return;
            }
            if (this.field_t == 23) {
              this.a(param1, 5060);
              return;
            }
            if (18 == this.field_t) {
              this.a(param1, 5060);
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("qk.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final void e(int param0, int param1) {
        if (param0 != 10 &&
          param0 != 11 &&
          null != this.field_yb) {
          this.field_yb.field_hb = false;
          this.field_yb = null;
        }
        super.e(param0, param1);
    }

    final static void n(byte param0) {
        int var2 = 0;
        va[] var1 = null;
        va var3 = null;
        int var4 = 0;
        va[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = ZombieDawn.field_J;
        try {
          if (param0 <= 79) {
            return;
          }
          var5 = pa.field_x;
          var1 = var5;
          for (var2 = 0; var2 < var5.length; var2++) {
            var3 = var5[var2];
            var3.a((byte) 126);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var1_ref), "qk.G(" + param0 + ')');
        }
    }

    private final boolean a(int param0, boolean param1, int param2) {
        kd var5 = null;
        int var6 = ZombieDawn.field_J;
        this.field_mb = 2147483647;
        this.field_sb = null;
        this.field_fb = false;
        if (param0 != -19718) {
          this.g(-115);
        }
        fb var4 = this.a((byte) -74, param2, 2);
        while (var4 != null) {
          var5 = (kd) (var4);
          if (!var5.field_hb && var5.field_F != 9 && var5.x(param0 ^ -19794) &&
            (param1 || this.a(57, var4))) {
            if (this.field_mb > this.field_s) {
              this.field_sb = var4;
              this.field_mb = this.field_s;
            }
            this.field_fb = var5.field_bb > 0 ? true : false;
          }
          var4 = this.e((byte) 32);
        }
        return this.field_sb != null ? true : false;
    }

    void l(byte param0) {
        int var2;
        int var3;
        int var4;
        wk var5;
        var4 = ZombieDawn.field_J;
        if (this.field_F != 0 &&
          this.field_F != 3) {
          return;
        }
        if (param0 != 52) {
          var5 = (wk) null;
          this.a((wk) null, 14);
        }
        boolean decompiledFrameRemainder1 = true;
        var2 = this.field_Eb;
        var3 = this.field_Eb / 2;
        if ((this.field_t == 28 ||
          !this.a(-68, var2, false)) && (this.field_t != 28 ||
          !this.a(-19718, false, var2))) {
          if ((this.field_F == 3)) {
            this.e(0, param0 ^ -6852);
          }
          decompiledFrameRemainder1 = false;
        }
        else {
          boolean decompiledFrameRemainder0 = true;
          if (!this.field_fb &&
            0 < this.field_Ab) {
            if (this.field_mb >= var3 * var3) {
              if (!this.field_Bb) {
                this.m((byte) -116);
                decompiledFrameRemainder1 = false;
              }
              else {
                if (!this.p(param0 ^ -79)) {
                  this.m((byte) -116);
                  decompiledFrameRemainder1 = false;
                }
                else {
                  decompiledFrameRemainder0 = (this.field_F == 3);
                  if (decompiledFrameRemainder0) {
                    this.e(0, -6904);
                    decompiledFrameRemainder1 = false;
                  }
                }
              }
            }
            if ((decompiledFrameRemainder1) &&
              (decompiledFrameRemainder0)) {
              if (this.field_Bb) {
                this.m((byte) -90);
                decompiledFrameRemainder1 = false;
              }
              else {
                if (!this.p(param0 ^ -79)) {
                  this.m((byte) -90);
                  decompiledFrameRemainder1 = false;
                }
                else {
                  decompiledFrameRemainder0 = (this.field_F == 3);
                  if (decompiledFrameRemainder0) {
                    this.e(0, -6904);
                    decompiledFrameRemainder1 = false;
                  }
                }
              }
            }
          }
          if ((decompiledFrameRemainder1) &&
            (decompiledFrameRemainder0) &&
            (!this.p(-120))) {
            this.e(3, -6904);
          }
        }

    }

    qk(int param0, int param1, int param2) {
        super(0, 0, 0, 0);
        Object stackIn_2_0;
        int stackIn_2_1;
        int stackIn_2_2;
        int stackIn_2_3;
        int stackIn_3_4 = 0;
        stackIn_2_0 = this;
        stackIn_2_1 = param0;
        stackIn_2_2 = param1;
        stackIn_2_3 = param2;
        if (param2 != 23) {
          stackIn_3_4 = 200704;
        } else {
          stackIn_3_4 = 143360;
        }
        this.field_yb = null;
        this.field_zb = -1;
        this.field_wb = false;
        this.field_Eb = 250;
        this.field_Gb = 0;
        if (this.field_t == 11 ||
          this.field_t == 12) {
          this.field_D = 143360;
          this.field_Ib = 8;
          this.field_Ab = 6;
          this.field_Bb = true;
          this.field_Fb = 3;
        }
        if (this.field_t == 13 ||
          this.field_t == 14) {
          this.field_Ab = 12;
          this.field_Ib = 8;
          this.field_D = 143360;
          this.field_Bb = true;
          this.field_Fb = 2;
        }
        if (this.field_t == 15 ||
          this.field_t == 23) {
          this.field_Ib = 8;
          this.field_D = 200704;
          this.field_Bb = false;
          this.field_Ab = 24;
          this.field_Fb = 2;
        }
        if (this.field_t == 16) {
          this.field_D = 200704;
          this.field_Ib = 6;
          this.field_Fb = 2;
          this.field_Ab = 2147483647;
          this.field_Bb = false;
        }
        if (this.field_t == 19) {
          this.field_Ab = 2147483647;
          this.field_Bb = false;
          this.field_D = 143360;
          this.field_Fb = 5;
          this.field_Ib = 0;
        }
        if (28 == this.field_t) {
          this.field_Bb = false;
          this.field_Eb = 330;
          this.field_D = 143360;
          this.field_Ib = 6;
          this.field_Fb = 1;
          this.field_Ab = 2147483647;
        }
        if (this.field_t == 20) {
          this.field_Ab = 2147483647;
          this.field_Ib = 0;
          this.field_D = 0;
          this.field_Bb = false;
          this.field_Fb = 5;
        }
        if (27 == this.field_t) {
          this.field_Ab = 2147483647;
          this.field_Bb = false;
          this.field_Ib = 0;
          this.field_Fb = 5;
          this.field_D = 0;
        }
    }

    void a(wk param0, int param1) {
        String var3 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          if (param1 != 5060) {
            this.field_Fb = -109;
          }
          bi.d(param0.a(this.a(true), (byte) -98), param0.a(this.f(237239984), 0), this.field_Eb, 16711680);
          var3 = Integer.toString(this.field_Ab);
          if (this.field_Ab > 100) {
            var3 = "oo";
          }
          bj.field_q.c(var3, param0.a(this.a(true), (byte) -128), -48 + param0.a(this.f(param1 ^ 237235572), 0), 16777215, 0);
          if (null != this.field_yb) {
            bi.e(param0.a(this.a(true), (byte) -93), param0.a(this.f(237239984), 0), param0.a(this.field_yb.a(true), (byte) -81), param0.a(this.field_yb.f(param1 + 237234924), 0), 65280);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("qk.L(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    void b(int param0, byte param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        var8 = ZombieDawn.field_J;
        var4 = 2 + this.field_Gb;
        if (var4 == 0) {
          return;
        }
        var5 = var4;
        var6 = var4 / 2;
        if (param1 > -91) {
          qk.a(-55, -46, -124, -122, -112);
        }
        var7 = -var4 + 8;
        if (this.field_S != 1) {
          if (this.field_S != 3) {
            if (0 == this.field_S) {
              bi.d(param0 - 2, param2 - 54 + var7, var5, 0, 64);
              bi.d(-2 + param0, -50 + param2, var6, 0, 128);
              bi.a(-2 + param0 << 4, param2 - 54 + var7 << 4, var5 << 4, 250, dm.field_p);
              bi.a(-2 + param0 << 4, param2 - 50 << 4, var6 << 4, 200, dm.field_r);
            } else {
              if (this.field_S == 2) {
                bi.d(-2 + param0, param2 - 10 - var7, var5 - 1, 0, 64);
                bi.d(param0 - 2, param2 - 16, var6 - 1, 0, 128);
                bi.a(param0 - 2 << 4, param2 + (-10 - var7) << 4, var5 << 4, 250, dm.field_p);
                bi.a(-2 + param0 << 4, param2 - 16 << 4, var6 << 4, 200, dm.field_r);
              }
            }
          } else {
            bi.d(var7 + (param0 - 23), -36 + param2, var5, 0, 64);
            bi.d(-18 + param0, param2 - 36, var6, 0, 128);
            bi.a(var7 + param0 - 23 << 4, param2 - 36 << 4, var5 << 4, 250, dm.field_p);
            bi.a(-18 + param0 << 4, param2 - 36 << 4, var6 << 4, 200, dm.field_r);
          }
        } else {
          bi.d(-var7 + param0 + 22, -36 + param2, -1 + var5, 0, 64);
          bi.d(param0 + 17, -36 + param2, -1 + var6, 0, 128);
          bi.a(-var7 + (22 + param0) << 4, param2 - 36 << 4, var5 << 4, 250, dm.field_p);
          bi.a(17 + param0 << 4, param2 - 36 << 4, var6 << 4, 200, dm.field_r);
        }
    }

    void g(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_32_1 = 0;
        int var3;
        var3 = ZombieDawn.field_J;
        if (param0 <= 95) {
          field_Db = -122;
        }
        super.g(112);
        if (0 < this.field_xb) {
          this.field_xb = this.field_xb - 1;
        }
        if (11 != this.field_F) {
          if (this.field_F != 10) {
            if (this.field_F == 0) {
            }
          } else {
            if (this.field_G != 1) {
              if (this.field_G == 2) {
                this.field_xb = this.field_Ib;
                if (4 != this.field_W) {
                  this.field_xb = 4 * this.field_xb / this.field_W;
                }
                if (this.field_zb == this.field_Lb &&
                  this.field_yb != null) {
                  fieldTemp$0 = this.field_Ab - 1;
                  this.field_Ab = this.field_Ab - 1;
                  if (fieldTemp$0 >= 0) {
                    if (28 != this.field_t) {
                      this.field_yb.z(0);
                    } else {
                      dj.field_e.b(2, this.field_yb.f(237239984), true, this.field_yb.a(true));
                    }
                    if (this.field_Ab > 2000) {
                      this.field_Ab = 3000;
                    }
                  }
                }
                fieldTemp$1 = this.field_Lb - 1;
                this.field_Lb = this.field_Lb - 1;
                if (fieldTemp$1 != 0) {
                  stackIn_32_1 = 11;
                } else {
                  stackIn_32_1 = 0;
                }
                this.e(stackIn_32_1, -6904);
              }
            } else {
              if (this.field_Gb > 0) {
                this.field_Gb = this.field_Gb - 1;
              }
            }
          }
        } else {
          if (0 == this.field_xb) {
            this.e(10, -6904);
            if (0 >= this.field_Ab) {
              this.field_Gb = -2;
              this.field_U = dc.a((byte) 18, 63);
            } else {
              this.field_Gb = 8;
              if (!(this instanceof we)) {
                this.field_U = dc.a((byte) 18, 44);
              }
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = ZombieDawn.field_J;
        try {
          if (param3 >= -72) {
            return;
          }
          var5_int = 0;
          while (true) {
            if (bm.field_a.length <= var5_int) {
              return;
            }
            if (bm.field_a[var5_int] != 0) {
              var5_int++;
              continue;
            }
            break;
          }
          bm.field_a[var5_int] = param1;
          hg.field_a[var5_int] = param2;
          si.field_Qb[var5_int] = param4;
          hd.field_u[var5_int] = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var5), "qk.K(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void m(byte param0) {
        int stackIn_29_1 = 0;
        int stackIn_33_1 = 0;
        Object var2;
        int var3;
        fb var4_ref_fb;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        Object var11;
        int var5Lifetime1;
        var10 = ZombieDawn.field_J;
        if (this.field_wb) {
          this.e(3, -6904);
          return;
        }
        if (0 < this.field_xb) {
          return;
        }
        var11 = null;
        var2 = var11;
        if (param0 > -87) {
          this.field_Ib = -17;
        }
        var3 = this.field_Eb * this.field_Eb;
        if (var2 == null ||
          ((kd) (var11)).field_hb) {
          var4_ref_fb = this.a((byte) -74, this.field_Eb, 2);
          while (var4_ref_fb != null) {
            if ((((kd) (var4_ref_fb)).x(42) ||
              this instanceof we) &&
              !((kd) (var4_ref_fb)).field_hb) {
              var5 = var4_ref_fb.a(true);
              var6 = var4_ref_fb.f(237239984);
              var7 = -var5 + this.a(true);
              var8 = -var6 + this.f(237239984);
              var9 = var7 * var7 + var8 * var8;
              if (var3 > var9) {
                if (dj.field_e.field_H.a(var6, this.f(237239984), var5, this.a(true), 123) == -1 &&
                  dj.field_e.field_H.a(-24 + var6, -24 + this.f(237239984), var5, this.a(true), 105) == -1) {
                  var4_ref_fb = this.e((byte) 32);
                  continue;
                }
                var2 = (kd) (var4_ref_fb);
                var3 = var9;
              }
            }
            var4_ref_fb = this.e((byte) 32);
          }
        }
        if (var2 != null) {
          ((kd) (var2)).field_hb = true;
          var4 = ((kd) (var2)).a(true) - this.a(true);
          var5Lifetime1 = ((kd) (var2)).f(237239984) - this.f(237239984);
          if (Math.abs(var5Lifetime1) > Math.abs(var4)) {
            if (var5Lifetime1 > 0) {
              stackIn_33_1 = 2;
            } else {
              stackIn_33_1 = 0;
            }
            this.field_S = stackIn_33_1;
          } else {
            if (var4 <= 0) {
              stackIn_29_1 = 3;
            } else {
              stackIn_29_1 = 1;
            }
            this.field_S = stackIn_29_1;
          }
          this.field_yb = (kd) (var2);
          this.e(10, -6904);
          if (0 >= this.field_Ab) {
            this.field_wb = true;
            this.field_Gb = -2;
            this.field_U = dc.a((byte) 18, 63);
          } else {
            this.field_Gb = 8;
            if (!(this instanceof we)) {
              if (this.field_t == 28) {
                this.field_U = dc.a((byte) 18, 92);
              } else {
                this.field_U = dc.a((byte) 18, 44);
              }
            } else {
              this.field_U = dc.a((byte) 18, 8);
            }
          }
          this.field_Lb = this.field_Fb;
          this.field_zb = pb.a(so.field_a, this.field_Fb, 1) + 1;
        }
        return;
    }

    static {
        field_Hb = new vn[5];
        field_Cb = new int[8192];
        field_Jb = new al[15];
    }
}
