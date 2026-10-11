/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class wb extends ti {
    private int field_yb;
    gm field_Eb;
    private int field_fb;
    int field_Lb;
    static int field_db;
    private int field_Jb;
    static java.awt.Font field_hb;
    private int field_qb;
    private ve field_kb;
    private boolean field_xb;
    int field_ib;
    private boolean field_nb;
    boolean field_Bb;
    int field_Kb;
    private boolean field_wb;
    private int field_ob;
    private int field_Nb;
    private pq field_jb;
    private int field_ub;
    private int field_Ob;
    int field_Ib;
    private int field_sb;
    private int field_pb;
    private int field_lb;
    boolean field_Hb;
    private int field_mb;
    boolean field_eb;
    private boolean field_rb;
    private int field_vb;
    private int field_Mb;
    private int field_cb;
    static int field_Ab;
    private int field_Fb;
    boolean field_zb;
    private int field_tb;
    private boolean field_Cb;
    private qk field_Db;
    private th field_gb;
    private boolean field_Gb;

    final void p(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 != 72) {
            wb.l((byte) 29);
          }
          if (!this.m(-2)) {
            this.field_U = qq.b(1481485697, 72 + hp.a((byte) -68, g.field_a, 2));
            if (!ZombieDawnMulti.field_E) {
              return;
            }
          }
          this.field_U = qq.b(1481485697, 70 + hp.a((byte) -90, g.field_a, 2));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "wb.BA(" + param0 + ')');
        }
    }

    final static l a(int param0, java.awt.Component param1, int param2, int param3) {
        try {
          Class var4 = null;
          Throwable var4_ref = null;
          RuntimeException var4_ref2 = null;
          l var5 = null;
          dq var5_ref = null;
          l stackIn_2_0 = null;
          l stackIn_4_0 = null;
          dq stackIn_6_0 = null;
          RuntimeException stackIn_10_0 = null;
          StringBuilder stackIn_10_1 = null;
          String stackIn_11_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              if (param0 != 1) {
                stackIn_2_0 = (l) null;
                return stackIn_2_0;
              }
              var4 = Class.forName("qn");
              var5 = (l) (var4.newInstance());
              var5.a(-6, param1, param3, param2);
              stackIn_4_0 = var5;
              return stackIn_4_0;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              var5_ref = new dq();
              ((l) ((Object) var5_ref)).a(param0 - 7, param1, param3, param2);
              stackIn_6_0 = var5_ref;
              return (l) ((Object) stackIn_6_0);
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_10_0 = var4_ref2;
            stackIn_10_1 = new StringBuilder().append("wb.BB(").append(param0).append(',');
            if (param1 == null) {
              stackIn_11_2 = "null";
            } else {
              stackIn_11_2 = "{...}";
            }
            throw fa.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void b(int param0, int param1) {
        boolean stackIn_5_1 = false;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var3_intLifetime1;
        int var4Lifetime1;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          stackIn_5_1 = (this.field_K == 33);
          this.field_rb = stackIn_5_1;
          if (this.field_K == 9) {
            return;
          }
          if (34 == this.field_K &&
            param0 != 9 &&
            param0 != 21) {
            return;
          }
          if (null != this.field_jb && (param0 == 9 ||
            21 == param0)) {
            this.field_jb.c(-24421);
          }
          super.b(param0, param1);
          if (this.field_K == 21) {
            this.field_Bb = false;
            if (var5 == 0) {
              return;
            }
          }
          if (this.field_K != 23) {
            if (4 != this.field_K) {
              if (this.field_K != 7) {
                if (this.field_K == 9) {
                  this.field_U = nm.b(-126, 66);
                  if (var5 == 0) {
                    return;
                  }
                }
                if (this.field_K != 27 &&
                  this.field_K != 28 &&
                  19 != this.field_K &&
                  this.field_K != 24) {
                  if (this.field_K == 29) {
                    this.field_Cb = true;
                    this.field_yb = 0;
                    this.field_Ob = -65536000;
                    this.field_vb = -65536000;
                    if (var5 == 0) {
                      return;
                    }
                  }
                  if (this.field_K == 33) {
                    this.field_rb = true;
                    this.field_yb = -100;
                    if (var5 == 0) {
                      return;
                    }
                  }
                  if (this.field_K == 22) {
                    this.field_lb = 70;
                    if (var5 == 0) {
                      return;
                    }
                  }
                  if (this.field_K != 8) {
                    return;
                  }
                  if (this.field_Eb == null) {
                    return;
                  }
                  var3_int = (this.field_Eb.g(-97) - this.g(-47)) / 2;
                  var4 = (this.field_Eb.h(123) - this.h(-99)) / 2;
                  this.field_Eb.n(20);
                  this.field_cb = var4;
                  this.field_mb = var3_int;
                  if (var5 == 0) {
                    return;
                  }
                }
                this.field_xb = false;
                this.field_Nb = 0;
                this.field_ub = 0;
                if (var5 == 0) {
                  return;
                }
              }
              if (!this.m(-2)) {
                this.field_U = qq.b(1481485697, 25);
                if (var5 == 0) {
                  return;
                }
              }
              this.field_U = qq.b(1481485697, 15);
              if (var5 == 0) {
                return;
              }
            }
            this.field_S = 0;
            this.field_X = 0;
            if (null != this.field_gb) {
              var3_intLifetime1 = this.field_tb - this.g(-99);
              var4Lifetime1 = this.field_Jb - this.h(-56);
              if (var3_intLifetime1 * var3_intLifetime1 + var4Lifetime1 * var4Lifetime1 < 400) {
                this.field_gb = null;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var3), "wb.T(" + param0 + ',' + param1 + ')');
        }
    }

    public static void o(byte param0) {
        try {
          field_hb = null;
          int var1_int = -96 % ((param0 - 52) / 58);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "wb.AB(" + param0 + ')');
        }
    }

    final boolean o(int param0) {
        boolean stackIn_46_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 <= 86) {
            return true;
          }
          stackIn_46_0 = (this.field_K == 8) || (21 == this.field_K) || (this.field_K == 9) || (this.field_K == 12) || (this.field_K == 7) || (this.field_K == 13) || (this.field_K == 14) || (this.field_K == 26) || (this.field_K == 27) || (this.field_K == 15) || (this.field_K == 17) || (28 == this.field_K) || (24 == this.field_K) || (19 == this.field_K);
          return stackIn_46_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "wb.U(" + param0 + ')');
        }
    }

    final void e(boolean param0) {
        try {
          this.field_Fb = 250;
          if (param0) {
            this.a(87, (nm) null);
          }
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "wb.I(" + param0 + ')');
        }
    }

    private final void n(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 != 0) {
            this.field_kb = (ve) null;
          }
          if (this.field_xb &&
            this.field_nb &&
            ~this.field_Lb == ~fb.field_e.field_M) {
            gd.field_B = fb.field_d[wf.field_m % fb.field_d.length];
            mo.field_Ib = ej.field_p[wf.field_m % ej.field_p.length];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "wb.KB(" + param0 + ')');
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        boolean stackIn_19_0 = false;
        RuntimeException decompiledCaughtException = null;
        int var6_intLifetime1;
        int var6_intLifetime2;
        try {
          if (param4 < param0) {
            var6_int = param0;
            param0 = param4;
            param4 = var6_int;
          }
          if (param2 > param1) {
            var6_intLifetime1 = param2;
            param2 = param1;
            param1 = var6_intLifetime1;
          }
          var6_intLifetime2 = 24 + (this.field_z >> 16);
          var7 = var6_intLifetime2 - param3;
          var8 = this.field_E >> 16;
          var9 = var8 - 48;
          stackIn_19_0 = (param0 < var6_intLifetime2) && (param4 > var7) && (var8 > param2) && (param1 > var9);
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var6), "wb.IB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void r(int param0) {
        try {
          this.field_Bb = true;
          this.field_qb = param0;
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "wb.SB(" + param0 + ')');
        }
    }

    private final void s(int param0) {
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (0 < this.field_Fb) {
            var2_int = this.field_Fb / 2;
            var2_int = (int)(128.0 * Math.sin((double)var2_int / 10.0 * (1.0 + (double)var2_int / 33.3)));
            var2_int = var2_int + this.field_Fb / 250;
            if (var2_int < 0) {
              return;
            }
            gd.field_B = 13421772;
            mo.field_Ib = 13421772;
          }
          if (param0 != 2) {
            this.field_ub = 112;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "wb.M(" + param0 + ')');
        }
    }

    private final boolean n(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -64 % ((-15 - param0) / 42);
          if (this.o(106)) {
            return false;
          }
          this.b(17, -27655);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "wb.CB(" + param0 + ')');
        }
    }

    final void a(int param0, nm param1) {
        int stackIn_5_0 = 0;
        boolean stackIn_17_1 = false;
        int stackIn_131_0 = 0;
        int stackIn_135_0 = 0;
        ja stackIn_191_0 = null;
        int stackIn_191_1 = 0;
        int stackIn_192_2 = 0;
        int stackIn_313_0 = 0;
        int stackIn_317_1 = 0;
        int stackIn_330_0 = 0;
        int stackIn_370_0 = 0;
        int stackIn_370_1 = 0;
        ri stackIn_389_0 = null;
        int stackIn_389_1 = 0;
        int stackIn_390_2 = 0;
        RuntimeException stackIn_459_0 = null;
        StringBuilder stackIn_459_1 = null;
        String stackIn_460_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        ja var12_ref_ja = null;
        int var13 = 0;
        int var14 = 0;
        int[] var14_ref_int__ = null;
        int var15 = 0;
        int var16 = 0;
        ja[][] var17 = null;
        int var18 = 0;
        int var19 = 0;
        ja var20_ref_ja = null;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int[] var23 = null;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        var27 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var3_int = ub.p(-124);
          stackIn_5_0 = (var3_int <= 0) ? 0 : 1;
          var4 = stackIn_5_0;
          if (param0 != -10136) {
            return;
          }
          var5 = this.field_K;
          var6 = this.field_ab;
          if (var4 != 0 &&
            hp.a((byte) 59, g.field_a, 30) == 0) {
            stackIn_17_1 = !(this.field_wb);
            this.field_wb = stackIn_17_1;
          }
          if (var4 != 0 &&
            !this.field_wb) {
            var7 = this.field_K;
            switch ((var27 == 0
              || var7 == 4
              || var7 == 9
              || var7 == 13
              || var7 == 15
              || var7 == 17
              || var7 == 19
              || var7 == 23
              || var7 == 27
              || var7 == 28
              || var7 == 31
              || var7 == 33
              || var7 == 34
              ) ? var7 : -1) {
              case 22:
                var5 = 30;
                if (var27 == 0) {
                  break;
                }
              case 34:
              case 5:
              case 7:
                var5 = 1;
                if (var27 == 0) {
                  break;
                }
              case 13:
              case 27:
                var5 = 30;
                if (var27 == 0) {
                  break;
                }
              case 14:
              case 26:
              case 19:
              case 24:
              case 29:
              case 33:
              case 4:
                var5 = 0;
                if (var27 == 0) {
                  break;
                }
              case 23:
                var5 = 25;
                if (var27 == 0) {
                  break;
                }
              case 12:
                var5 = 2;
                if (var27 == 0) {
                  break;
                }
              case 536870912:
              case 15:
              case 28:
                var5 = 16;
                if (var27 == 0) {
                  break;
                }
              case 9:
              case 17:
                var5 = 32;
                if (var27 == 0) {
                  break;
                }
              case 31:
                var5 = 3;
                if (var27 == 0) {
                  break;
                }
              default:
                var5 = 0;
            }
            if (gg.field_j[var5] <= var6) {
              var6 = 0;
            }
          }
          var7 = -24 + param1.c(this.g(87), -20126);
          var8 = -48 + param1.d(this.h(param0 + 10063), 108);
          if (!this.field_Cb &&
            this.field_yb == 0) {
            stackIn_131_0 = 0;
          } else {
            stackIn_131_0 = 1;
          }
          var9 = stackIn_131_0;
          var10 = 12303359;
          stackIn_135_0 = (var9 != 0) ? 0 : 1;
          var11 = stackIn_135_0;
          while (var11 < 2) {
            if (var27 != 0) {
              return;
            }
            boolean decompiledFrameRemainder5 = true;
            if (this.field_rb) {
              if (var11 != 1) {
                var7 = param1.c(this.g(param0 ^ 10153), param0 - 9990);
                var8 = param1.d(this.h(102), param0 ^ -10212) - 24;
              } else {
                var7 = param1.c(this.field_Ob >> 16, -20126);
                var8 = -12 + param1.d(this.field_vb >> 16, 125);
              }
              if (1 != ll.field_k.field_k) {
                if (null == this.field_kb) {
                  this.field_kb = new ve(var7, var8, 8, 0.0, 8.0, 3.0, 4, 1.5, 0.99, 1);
                }
                this.field_kb.field_k = 13 * var7 + (wf.field_m + 79 * var8);
                var12 = 200;
                var13 = 128 * var12;
                var14 = var12 * 64;
                var13 = var13 >> 8;
                var15 = 255 * var12;
                var14 = var14 >> 8;
                var14 = var14 << 8;
                var13 = var13 << 16;
                var15 = var15 >> 8;
                this.field_kb.a(var13 | var14 | var15, var7, true, var8, var10, -1963);
              }
              decompiledFrameRemainder5 = (var11 != 0 ||
                var27 != 0);
            }
            if (decompiledFrameRemainder5) {
              if (var11 != 0) {
                var7 = param1.c(this.g(88), -20126) - 24;
                var8 = -48 + param1.d(this.h(param0 ^ 10225), 111);
              }
              if (this.field_K == 8) {
                gd.field_B = op.field_m.field_D[this.field_Lb][0];
                mo.field_Ib = op.field_m.field_D[this.field_Lb][1];
                this.n(0);
                this.s(2);
                var12_ref_ja = nk.a(ig.field_d[var6 + (gg.field_l[var5] + this.field_fb)], mo.field_Ib, 255, gd.field_B);
                var12_ref_ja.g(var7 + this.field_mb - 3, var8 + this.field_cb - 3);
                return;
              }
              if (!ei.field_f) {
              }
              if (null != this.field_U) {
                if (!this.field_U.k()) {
                  this.field_U.h(sd.b(-49, var8, var7));
                  this.field_U.f(pb.a(var8, var7, false));
                } else {
                  this.field_U = null;
                }
              }
              if (!io.a(var7, var8, (byte) -99, param1) &&
                var27 == 0) {
                return;
              }
              if (17 != this.field_K &&
                !this.field_Gb) {
                stackIn_191_0 = ig.field_d[1];
                stackIn_191_1 = 12;
                if (this.field_F != 3) {
                  stackIn_192_2 = var7;
                } else {
                  stackIn_192_2 = var7 - 5;
                }
                g.a(stackIn_191_0, stackIn_191_1 + stackIn_192_2, 43 + var8);
              }
              var12 = 0;
              var13 = 0;
              if (this.field_Cb ||
                33 == this.field_K) {
                if (nk.field_h == null) {
                  g.c(bb.field_n);
                  nk.field_h = new ea();
                  g.d();
                }
                g.c(bb.field_n);
                oo.b();
                oo.d(oo.field_l / 2, oo.field_l / 2, oo.field_l / 2, 1);
                if (0 >= this.field_yb) {
                  var14_ref_int__ = nk.a(1052800, 455739624, 8454143);
                  var15 = 1073741824 + this.field_y - wf.field_m;
                } else {
                  var14_ref_int__ = nk.a(8392720, 455739624, 16744448);
                  var15 = -this.field_y + wf.field_m;
                }
                nk.field_h.a(2, (double)var15 / 7.0, var14_ref_int__);
                g.d();
                if (this.field_Cb) {
                  bb.field_n.c(var7, var8, 200);
                } else {
                  if (this.field_yb < 0) {
                    var12 = bb.field_n.field_x * -this.field_yb / 100;
                  } else if (this.field_yb > 0) {
                    var12 = this.field_yb * bb.field_n.field_x / 100;
                  } else {
                    this.field_E = this.field_vb;
                    this.field_z = this.field_Ob;
                  }
                  var13 = -(var12 / 2) + 24;
                  if (var12 != 0) {
                    bb.field_n.f(var7 + var13, var8 + var13, var12, var12);
                  }
                }
              }
              var14 = var6;
              if (null != gg.field_i[var5]) {
                var14 = gg.field_i[var5][var6];
              }
              boolean decompiledFrameRemainder4 = true;
              var15 = var14 + gg.field_l[var5];
              if (this.field_xb) {
                if (this.i((byte) 122) &&
                  var4 == 0) {
                  if (!(14 <= var15)) {
                    var15 += 70;
                  }
                  decompiledFrameRemainder4 = false;
                }
                else {
                  if (!this.field_nb) {
                    this.a(var7, var8, 256, (byte) -91);
                    return;
                  }
                }
              }
              L55: {
                if (null != fb.field_e) {
                  var16 = this.field_Lb;
                  if (this.field_xb &&
                    this.field_nb) {
                    var16 = fb.field_e.field_M;
                    if (var16 < 0) {
                      var16 = (this.field_Lb + 1) % op.field_m.field_t;
                    }
                  }
                  gd.field_B = op.field_m.field_D[var16][0];
                  mo.field_Ib = op.field_m.field_D[var16][1];
                  this.n(param0 + 10136);
                  this.s(2);
                } else {
                  boolean decompiledFrameRemainder1 = true;
                  boolean decompiledFrameRemainder2 = true;
                  boolean decompiledFrameRemainder0 = true;
                  var16 = this.field_Lb;
                  if (var16 != 0 ||
                    var27 != 0) {
                    if ((var16 != 1 ||
                      var27 != 0) &&
                      (decompiledFrameRemainder0 = (var16 != 2))) {
                      decompiledFrameRemainder1 = (var16 == 3);
                      decompiledFrameRemainder2 = !(decompiledFrameRemainder1);
                    }
                  } else {
                    mo.field_Ib = 2473480;
                    gd.field_B = 12222482;
                    break L55;
                  }
                  if ((decompiledFrameRemainder2) &&
                    (decompiledFrameRemainder1) &&
                    (decompiledFrameRemainder0)) {
                    gd.field_B = 11498997;
                    mo.field_Ib = 8165621;
                    break L55;
                  }
                  if ((decompiledFrameRemainder2) &&
                    (decompiledFrameRemainder1)) {
                    mo.field_Ib = 13843485;
                    gd.field_B = 13542477;
                    break L55;
                  }
                  if (decompiledFrameRemainder1) {
                    gd.field_B = 9796223;
                    mo.field_Ib = 16054718;
                    break L55;
                  }
                  gd.field_B = 3178624;
                  mo.field_Ib = 3176576;
                }
              }
              var16 = this.field_C;
              var17 = no.field_Hb;
              if (var4 != 0 &&
                !this.field_wb) {
                var17 = wq.field_c;
              }
              boolean decompiledFrameRemainder3 = true;
              if (!he.field_a &&
                !this.field_xb &&
                var4 == 0 &&
                this.field_Ib > op.field_m.field_H &&
                op.field_m.field_H > this.field_Ib + (-100 + this.field_y * 19 % 35)) {
                stackIn_313_0 = (this.field_tb >= this.g(param0 + 10218)) ? 0 : 1;
                if (this.field_F != 3) {
                  stackIn_317_1 = 0;
                } else {
                  stackIn_317_1 = 1;
                }
                if ((stackIn_313_0 ^ stackIn_317_1) != 0 && (this.field_K == 5 ||
                  4 == this.field_K ||
                  6 == this.field_K)) {
                  stackIn_330_0 = 1;
                  decompiledFrameRemainder3 = false;
                }
              }
              if (decompiledFrameRemainder3) {
                stackIn_330_0 = 0;
              }
              var18 = stackIn_330_0;
              if (var18 == 0) {
                nk.a(var17[var16][var15], mo.field_Ib, param0 + 10391, gd.field_B);
              } else {
                g.c(vb.field_b);
                var19 = 117;
                var20_ref_ja = no.field_Hb[var16][var15];
                var21 = 6;
                var22 = 3;
                if (ic.field_h.length > var15) {
                  var21 = ic.field_h[var15];
                  var22 = ui.field_i[var15];
                }
                if (!this.m(-2)) {
                  var22++;
                  var21 -= 3;
                }
                oo.b();
                var20_ref_ja.g(3, 3);
                no.field_Hb[var16][var19].g(var21, var22);
                var23 = oo.field_i;
                var24 = 0;
                while (var24 < var23.length) {
                  var25 = var23[var24];
                  stackIn_370_0 = ~var25;
                  stackIn_370_1 = -1;
                  if (stackIn_370_0 != stackIn_370_1 ||
                    var27 != 0) {
                    if ((var25 & 65535) != 0) {
                      if (0 == (16711935 & var25)) {
                        var26 = var25 >> 8;
                        var23[var24] = cr.b(cr.b(tq.b(65280, tq.b(255, mo.field_Ib >> 8) * var26), tq.b(mo.field_Ib, 255) * var26 >> 8), tq.b(16711777, (tq.b(mo.field_Ib, 16754034) >> 16) * var26 << 8));
                      }
                    } else {
                      var26 = var25 >> 16;
                      var23[var24] = cr.b(cr.b(var26 * tq.b(255, gd.field_B) >> 8, tq.b(65280, var26 * (tq.b(65430, gd.field_B) >> 8))), tq.b(1895890688, var26 * tq.b(255, gd.field_B >> 16)) << 8);
                    }
                  }
                  var24++;
                }
                g.d();
              }
              if (this.i((byte) 119) ||
                this.field_xb &&
                this.field_nb) {
                g.c(vb.field_b);
                stackIn_370_0 = 0;
                stackIn_370_1 = 0;
                g.a(stackIn_370_0, stackIn_370_1, 54, 54, gd.field_B);
                g.d();
              }
              if (this.field_K != 21) {
                var19 = wf.field_m / 4 % aa.field_h.length;
                if (this.field_F == 3) {
                  g.a(vb.field_b);
                }
                var20 = 3 + var8;
                if (this.field_K == 23) {
                  aa.field_h[var19].a(var7, var20);
                } else if (this.field_Nb > 0) {
                  var21 = pn.field_c.length;
                  var19 = -var21 + (1 + wf.field_m / 4 % (-1 + var21 * 2));
                  if (0 > var19) {
                    var19 = -var19;
                  }
                  stackIn_389_0 = pn.field_c[var19];
                  stackIn_389_1 = var7;
                  if (this.field_F != 3) {
                    stackIn_390_2 = 2;
                  } else {
                    stackIn_390_2 = -2;
                  }
                  ((ri) (Object) stackIn_389_0).a(stackIn_389_1 + stackIn_390_2, var20 - 7);
                } else {
                  if (this.field_ub > 0) {
                    var21 = 72;
                    if (24 <= this.field_ub / 2) {
                      if ((this.field_Mb - 48) < this.field_ub) {
                        var21 = 48 + (this.field_Mb - this.field_ub) / 2;
                      }
                    } else {
                      var21 = this.field_ub / 2 + 48;
                    }
                    vb.field_b.a(var7 - 3 - (var21 - 48) / 2, -var21 + 48 - 3 + var8, var21, var21, 128);
                  }
                }
                if (this.field_K == 33) {
                  vb.field_b.f(var13 + var7, var8 + var13, var12, var12);
                } else if (this.field_G <= 0) {
                  vb.field_b.g(var7 - 3, var8 - 3);
                } else {
                  vb.field_b.d(-3 + var7, var8 - 3, 142);
                }
                if (this.field_K == 23 ||
                  this.field_Nb > 0) {
                  g.c();
                  oo.h(var7, var20 + aa.field_h[var19].field_b / 2, 640, aa.field_h[var19].field_b + var20);
                  if (23 == this.field_K) {
                    aa.field_h[var19].a(var7, var20);
                  }
                  g.b();
                }
              } else {
                vb.field_b.c(-3 + var7, -3 + var8, this.field_N);
              }
              if (this.field_zb) {
                ig.field_d[0].e(1 + var7, var8 + 2, 128, 16711680);
              } else {
                if (!this.field_Bb) {
                  if ((this.field_eb)) {
                    ig.field_d[0].c(var7, var8 + 2, 96);
                  }
                  decompiledFrameRemainder5 = false;
                }
                else {
                  if (!(param1.field_d > 1.25f)) {
                    ig.field_d[0].g(var7, var8 + 3);
                    if ((0 != this.field_Kb)) {
                      qp.field_w.a((char)(48 + this.field_Kb), 1 + (var7 - (-ig.field_d[0].field_x - 9)), var8 + 7 + ig.field_d[0].field_w + 1, 0);
                      qp.field_w.a((char)(48 + this.field_Kb), 9 + var7 + ig.field_d[0].field_x, 7 + (var8 + ig.field_d[0].field_w), 16777215);
                    }
                    decompiledFrameRemainder5 = false;
                  }
                  else {
                    ig.field_d[0].f(var7, var8 + 3, 1);
                    ig.field_d[0].f(var7, var8, 16777215);
                    if (0 != this.field_Kb) {
                      pb.field_e.a((char)(this.field_Kb + 48), var7 - (-ig.field_d[0].field_x - 9) + 1, ig.field_d[0].field_w + (7 + (var8 + 1)), 0);
                      pb.field_e.a((char)(48 + this.field_Kb), 9 + (ig.field_d[0].field_x + var7), 7 + (var8 + ig.field_d[0].field_w), 16777215);
                    }
                  }
                }
              }
            }
            var11++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_459_0 = var3;
          stackIn_459_1 = new StringBuilder().append("wb.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_460_2 = "null";
          } else {
            stackIn_460_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_459_0), ((StringBuilder) (Object) stackIn_459_1).append(stackIn_460_2).append(')').toString());
        }
    }

    private final boolean m(int param0) {
        RuntimeException var2 = null;
        boolean stackIn_7_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -2) {
            this.field_fb = -112;
          }
          stackIn_7_0 = (0 == this.field_C);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "wb.CA(" + param0 + ')');
        }
    }

    final void a(boolean param0, nm param1) {
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        th var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ja var10 = null;
        int var6Lifetime1;
        try {
          var3 = this.field_gb;
          if (var3 == null) {
            return;
          }
          param1.c(this.g(-127), -20126);
          param1.d(this.h(-59), 126);
          param1.c(this.field_O, -20126);
          param1.d(this.field_P, 125);
          if (!param0) {
            this.field_sb = 20;
          }
          var4 = param1.c(this.field_tb, -20126);
          var5 = param1.d(this.field_Jb, 108) - 24;
          var6 = 50;
          var7 = 50;
          if (-op.field_m.field_H + this.field_Ib < 50) {
            var6Lifetime1 = this.field_Ib - op.field_m.field_H;
            if (20 > var6Lifetime1) {
              var6Lifetime1 = 20;
            }
            var7 = var6Lifetime1;
          }
          var8 = op.field_m.field_D[this.field_Lb][0];
          var9 = op.field_m.field_D[this.field_Lb][1];
          var10 = am.a(0, var9, this.field_C, 1, var8);
          var10.c(-24 + var4, -24 + var5, var7 * 2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("wb.JB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final boolean i(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_7_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (fb.field_e == null) {
            return false;
          }
          var2_int = 97 % ((58 - param0) / 58);
          stackIn_7_0 = (~this.field_Lb == ~fb.field_e.field_M);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "wb.W(" + param0 + ')');
        }
    }

    final int l(int param0) {
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          var2_int = -32 % ((param0 - 12) / 53);
          stackIn_1_0 = 350;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "wb.GB(" + param0 + ')');
        }
    }

    final static int h(byte param0) {
        RuntimeException var1 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -80) {
            wb.k((byte) 98);
          }
          stackIn_4_0 = rj.field_J;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1), "wb.DB(" + param0 + ')');
        }
    }

    final static void l(byte param0) {
        int var1_int = 0;
        Throwable decompiledCaughtException = null;
        Exception var1 = null;
        RuntimeException var1_ref = null;
        try {
          try {
            gj.a(6962);
            bi.field_e = true;
            cf.field_s = null;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (Exception) (Object) decompiledCaughtException;
            var1.printStackTrace();
          }
          var1_int = -32 / ((param0 - 51) / 48);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1_ref), "wb.DA(" + param0 + ')');
        }
    }

    wb(int param0, int param1, boolean param2) {
        this(param0, param1, param2 ? 0 : 1);
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        int stackIn_3_3 = 0;
        stackIn_2_1 = param0;
        stackIn_2_2 = param1;
        if (!param2) {
          stackIn_3_3 = 1;
        } else {
          stackIn_3_3 = 0;
        }
    }

    private final void c(boolean param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            this.field_Lb = -36;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "wb.EA(" + param0 + ')');
        }
    }

    final void d(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null != this.field_jb) {
            this.field_K = 15;
            this.field_jb.a(true);
            this.field_jb = null;
            this.b(4, -27655);
          }
          if (param0) {
            wb.k((byte) -17);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "wb.HB(" + param0 + ')');
        }
    }

    final static boolean k(byte param0) {
        RuntimeException var1 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > 91) {
            stackIn_4_0 = jg.field_a;
            return stackIn_4_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1), "wb.K(" + param0 + ')');
        }
    }

    final void a(th param0, int param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 95 / ((36 - param1) / 40);
          if (null != param0 &&
            !param0.f(28113)) {
            this.field_Db = (qk) (param0.a((byte) -39));
            if (this.field_Db != null) {
            }
            this.field_qb = 0;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_11_0 = runtimeException;
          stackIn_11_1 = new StringBuilder().append("wb.RB(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param0 < 19) {
            return;
          }
          if (!this.o(124)) {
            if (this.field_Cb) {
              this.field_vb = param3 << 16;
              this.field_Ob = param2 << 16;
            }
            this.field_Jb = param3;
            this.field_Ib = param1;
            this.field_tb = param2;
            this.field_gb = fb.field_e.field_u.b(this.g(126), this.field_Jb, this.h(-73), this.field_tb, 8760);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var5), "wb.GA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void m(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 != 6) {
            this.e(false);
          }
          this.b(4, param0 ^ -27649);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "wb.FB(" + param0 + ')');
        }
    }

    final void j(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 != -13) {
            this.field_ob = 69;
          }
          this.field_Nb = 0;
          this.field_xb = false;
          this.field_ub = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "wb.EB(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, byte param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_6_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (!this.field_nb) {
            var5_int = 0;
            var6 = this.field_ab % gg.field_j[var5_int];
            var7 = op.field_m.field_h.field_j;
            stackIn_6_0 = (var7 != 0) ? 6 : 2;
            var8 = stackIn_6_0;
            var9 = gg.field_l[var5_int] + var6;
            if (param2 >= 256) {
              if (this.field_F != 1) {
                wq.field_c[var8][var9].g(param0, param1);
                if (var10 != 0) {
                  wq.field_c[var8][var9].b(param0, param1);
                  wq.field_c[var8][var9].c(param0, param1, param2);
                }
              } else {
                wq.field_c[var8][var9].b(param0, param1);
                if (var10 != 0) {
                  wq.field_c[var8][var9].c(param0, param1, param2);
                }
              }
            } else {
              wq.field_c[var8][var9].c(param0, param1, param2);
            }
          }
          if (param3 >= -54) {
            this.a(true, (nm) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) runtimeException), "wb.AA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void f(byte param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        boolean discarded$2 = false;
        th stackIn_158_0;
        jj stackIn_158_1;
        jj stackIn_158_2;
        int stackIn_158_3;
        int stackIn_158_4;
        int stackIn_158_5;
        int stackIn_158_6;
        jj stackIn_159_1 = null;
        jj stackIn_159_2 = null;
        boolean stackIn_159_7 = false;
        boolean stackIn_248_1 = false;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param0 >= -79) {
            this.a(true, (wb) null);
          }
          super.f((byte) -92);
          this.c(30818, this.field_K);
          if (this.field_K != 33) {
            this.field_yb = 0;
          }
          if (this.field_ub > 0) {
            this.field_ub = this.field_ub - 1;
          }
          if (0 < this.field_Fb) {
            this.field_Fb = this.field_Fb - 1;
          }
          if (this.field_K != 29) {
            this.field_Cb = false;
          }
          if (this.field_Nb > 0) {
            this.field_Nb = this.field_Nb - 1;
          }
          L6: {
            if (this.field_K == 4) {
              if (!this.field_xb) {
                break L6;
              }
              if (this.field_ab >= 2) {
                break L6;
              }
              this.field_Q = this.field_Q + 3;
              if (var3 == 0) {
                break L6;
              }
            }
            if (this.field_K != 31) {
              if (this.field_K != 5) {
                if (this.field_K == 29) {
                  this.field_yb = -100;
                  if (var3 == 0) {
                    break L6;
                  }
                }
                if (this.field_K != 33) {
                  if (6 == this.field_K) {
                    if (this.field_sb > 0) {
                      this.field_sb = this.field_sb - 1;
                    }
                    this.i(5197);
                    if (!this.k(-106)) {
                      if (0 != this.field_X) {
                        break L6;
                      }
                      if (0 != this.field_S) {
                        break L6;
                      }
                    }
                    this.b(4, -27655);
                    if (var3 == 0) {
                      break L6;
                    }
                  }
                  if (7 == this.field_K) {
                    this.i(5197);
                    if (this.field_Eb != null &&
                      this.field_Eb.field_K != 18 &&
                      this.field_Eb.field_K != 21 &&
                      20 != this.field_Eb.field_K) {
                      fieldTemp$0 = this.field_sb;
                      this.field_sb = this.field_sb + 1;
                      if (fieldTemp$0 <= 60) {
                        if (((this.field_Eb.field_K != 1)) &&
                          (this.field_Eb.field_K != 2)) {
                          break L6;
                        }
                        break L6;
                      }
                    }
                    this.field_Eb = null;
                    this.b(4, -27655);
                    if (var3 == 0) {
                      break L6;
                    }
                  }
                  if (this.field_K == 8) {
                    this.field_xb = false;
                    if ((this.field_ab == 0 ||
                      this.field_ab == 2) && this.field_Q == 0) {
                      var2_int = 0;
                      if (0 == hp.a((byte) -112, g.field_a, 3)) {
                        if (this.field_Eb != null &&
                          !this.field_Eb.m(15684)) {
                          var2_intLifetime2 = 37 + hp.a((byte) 14, g.field_a, 3);
                          if (var3 != 0) {
                            var2_intLifetime2 = 40 + hp.a((byte) -118, g.field_a, 4);
                            var2_intLifetime2 = hp.a((byte) -103, g.field_a, 5) + 30;
                          }
                        } else {
                          var2_intLifetime2 = 40 + hp.a((byte) -118, g.field_a, 4);
                          if (var3 != 0) {
                            var2_intLifetime2 = hp.a((byte) -103, g.field_a, 5) + 30;
                          }
                        }
                      } else {
                        var2_intLifetime2 = hp.a((byte) -103, g.field_a, 5) + 30;
                      }
                      this.field_U = qq.b(1481485697, var2_intLifetime2);
                    }
                    if (this.field_lb != 30) {
                      break L6;
                    }
                    fb.field_e.a(1, this.field_Eb.g(76), this.field_Eb.h(117));
                    if (var3 == 0) {
                      break L6;
                    }
                  }
                  if (this.field_K != 22) {
                    if (this.field_K == 9) {
                      if (this.field_pb != 0) {
                        this.field_z = this.field_z + (this.field_pb << 16);
                      }
                      if (this.field_ab != 5) {
                        break L6;
                      }
                      fb.field_e.a(1, this.g(124), this.h(-105));
                      fb.field_e.a(true, this);
                      if (this.field_jb == null) {
                        break L6;
                      }
                      this.field_jb.c(-24421);
                      this.field_jb.a(true);
                      this.field_jb = null;
                      if (var3 == 0) {
                        break L6;
                      }
                    }
                    if (this.field_K != 12) {
                      if (this.field_K != 13) {
                        if (this.field_K == 14 ||
                          this.field_K == 26) {
                          this.field_xb = false;
                          this.field_F = 1;
                          if (4 != this.field_ab) {
                            break L6;
                          }
                          stackIn_158_0 = fb.field_e.field_H;
                          stackIn_158_1 = null;
                          stackIn_158_2 = null;
                          stackIn_158_3 = this.g(113);
                          stackIn_158_4 = this.h(101);
                          stackIn_158_5 = this.field_C;
                          stackIn_158_6 = this.field_Lb;
                          if (26 != this.field_K) {
                            stackIn_159_1 = null;
                            stackIn_159_2 = null;
                            stackIn_159_7 = false;
                          } else {
                            stackIn_159_1 = null;
                            stackIn_159_2 = null;
                            stackIn_159_7 = true;
                          }
                          ((th) (Object) stackIn_158_0).a(new jj(stackIn_158_3, stackIn_158_4, stackIn_158_5, stackIn_158_6, stackIn_159_7), false);
                          this.b(4, -27655);
                          if (var3 == 0) {
                            break L6;
                          }
                        }
                        if (this.field_K == 34) {
                          if (this.field_ab != 4) {
                            break L6;
                          }
                          this.field_Q = this.field_Q - 1;
                          this.field_xb = false;
                          if (this.field_jb == null) {
                            this.field_jb = new pq(this.g(-74), this.h(-61) - 30, op.field_m.a((byte) 32, this.field_Lb, 750));
                            op.field_m.field_G.a(this.field_jb, false);
                            if (var3 == 0) {
                              break L6;
                            }
                          }
                          if (!this.field_jb.d(67)) {
                            this.i(5197);
                            if (this.k(-100) ||
                              0 == this.field_X &&
                              this.field_S == 0) {
                              this.m((byte) 6);
                            }
                            this.field_jb.a(this.h(92) - 30, this.g(71), 0);
                            if (var3 == 0) {
                              break L6;
                            }
                          }
                          this.field_jb.a(true);
                          this.field_jb = null;
                          this.field_K = 15;
                          this.b(4, -27655);
                          if (var3 == 0) {
                            break L6;
                          }
                        }
                        if (15 != this.field_K) {
                          if (this.field_K == 17) {
                            if (this.field_ab == 3 &&
                              this.field_Q == 0) {
                              fb.field_e.a((byte) 126, this.g(-113), this.h(-82), this.field_Lb);
                            }
                            if (this.field_ab < 5) {
                              break L6;
                            }
                            fb.field_e.a(true, this);
                            op.field_m.a(-119, (ff) (this));
                            if (var3 == 0) {
                              break L6;
                            }
                          }
                          if (this.field_K != 19 &&
                            this.field_K != 24) {
                            if (this.field_K == 27) {
                              if (~(gg.field_j[27] / 2) == ~this.field_ab) {
                                this.field_ub = 0;
                                this.field_xb = false;
                                this.field_Nb = op.field_m.a((byte) 32, this.field_Lb, 2250);
                              }
                              if (gg.field_j[27] - 1 != this.field_ab) {
                                break L6;
                              }
                              this.b(4, -27655);
                              if (var3 == 0) {
                                break L6;
                              }
                            }
                            if (this.field_K != 28) {
                              break L6;
                            }
                            if (this.field_ab == gg.field_j[28] / 2) {
                              this.field_xb = false;
                              this.field_Nb = 0;
                              this.field_Mb = op.field_m.a((byte) 32, this.field_Lb, 2250);
                              this.field_ub = this.field_Mb;
                            }
                            if (this.field_ab != -1 + gg.field_j[28]) {
                              break L6;
                            }
                            this.b(4, -27655);
                            if (var3 == 0) {
                              break L6;
                            }
                          }
                          if (5 != this.field_ab) {
                            break L6;
                          }
                          stackIn_248_1 = (this.field_K == 24);
                          this.field_nb = stackIn_248_1;
                          this.field_xb = true;
                          this.b(4, -27655);
                          if (var3 == 0) {
                            break L6;
                          }
                        }
                        if (this.field_ab != 4) {
                          break L6;
                        }
                        this.field_Q = this.field_Q - 1;
                        this.field_xb = false;
                        if (this.field_jb == null) {
                          this.field_jb = new pq(this.g(73), this.h(-104) - 30, op.field_m.a((byte) 32, this.field_Lb, 750));
                          op.field_m.field_G.a(this.field_jb, false);
                        }
                        if (!this.field_jb.d(124)) {
                          break L6;
                        }
                        this.field_jb.a(true);
                        this.field_jb = null;
                        this.b(4, -27655);
                        if (var3 == 0) {
                          break L6;
                        }
                      }
                      if (this.field_xb) {
                        this.field_ab = 2;
                      }
                      if (2 != this.field_ab) {
                        break L6;
                      }
                      this.field_ab = 0;
                      this.field_xb = false;
                      fb.field_e.b(this.field_Hb, 0, this.h(-71), this.g(-88));
                      this.b(false);
                      if (var3 == 0) {
                        break L6;
                      }
                    }
                    this.field_xb = false;
                    this.i(5197);
                    if (var3 == 0) {
                      break L6;
                    }
                  }
                  fieldTemp$1 = this.field_lb - 1;
                  this.field_lb = this.field_lb - 1;
                  if (fieldTemp$1 <= 0) {
                    this.b(4, -27655);
                    if (var3 == 0) {
                      break L6;
                    }
                  }
                  if (this.field_z < this.field_V) {
                    this.field_z = this.field_z + 32768;
                    if (this.field_V < this.field_z) {
                      this.field_z = this.field_V;
                    }
                  }
                  if (this.field_z > this.field_V) {
                    this.field_z = this.field_z - 32768;
                    if (this.field_V > this.field_z) {
                      this.field_z = this.field_V;
                    }
                  }
                  if (this.field_E < this.field_L) {
                    this.field_E = this.field_E + 32768;
                    if (this.field_E > this.field_L) {
                      this.field_E = this.field_L;
                    }
                  }
                  if (this.field_E > this.field_L) {
                    this.field_E = this.field_E - 32768;
                    if (this.field_E < this.field_L) {
                      this.field_E = this.field_L;
                    }
                  }
                  if (this.field_ab != 0) {
                    break L6;
                  }
                  if (this.field_Q != 0) {
                    break L6;
                  }
                  var2_intLifetime1 = 30 + hp.a((byte) 22, g.field_a, 5);
                  this.field_U = qq.b(1481485697, var2_intLifetime1);
                  if (var3 == 0) {
                    break L6;
                  }
                }
                this.field_yb = this.field_yb + 1;
                if (this.field_yb != 0) {
                  if (this.field_yb <= 100) {
                    break L6;
                  }
                  this.b(4, -27655);
                  if (var3 == 0) {
                    break L6;
                  }
                }
                this.field_E = this.field_vb;
                this.field_z = this.field_Ob;
                if (var3 == 0) {
                  break L6;
                }
              }
              if (0 < this.field_sb) {
                this.field_sb = this.field_sb - 1;
              }
              this.c(true);
              this.i(5197);
              if (this.field_Bb &&
                this.field_qb < 128) {
                this.field_qb = this.field_qb + 8;
              }
              if (!this.k(-71)) {
                if (0 != this.field_X) {
                  break L6;
                }
                if (this.field_S != 0) {
                  break L6;
                }
              }
              this.m((byte) 6);
              if (var3 == 0) {
                break L6;
              }
            }
            if (this.field_ab == gg.field_j[31] / 4) {
              if (this.i((byte) -54)) {
                if (this.field_Bb) {
                  this.t(16);
                  this.a(-4564);
                }
                this.field_gb = null;
              }
              this.field_Lb = this.field_ib;
            }
            if (~(-1 + gg.field_j[31]) == ~this.field_ab) {
              this.b(4, -27655);
            }
          }
          if (null != op.field_m &&
            op.field_m.field_c &&
            !this.o(109)) {
            if ((13 * op.field_m.field_H + 17 * this.field_y) % 71 != 0 ||
              this.field_K == 9) {
              if ((25 * this.field_y + op.field_m.field_H * 37) % 59 != 0) {
                return;
              }
              if (this.field_K == 17) {
                return;
              }
              this.b(false);
              if (var3 == 0) {
                return;
              }
            }
            discarded$2 = this.n((byte) -119);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "wb.N(" + param0 + ')');
        }
    }

    wb(int param0, int param1, int param2) {
        super(param0, param1, param2, 57344);
        this.field_qb = 0;
        this.field_Eb = null;
        this.field_wb = false;
        this.field_Kb = 0;
        this.field_ob = 0;
        this.field_yb = 0;
        this.field_xb = false;
        this.field_mb = 0;
        this.field_lb = 0;
        this.field_cb = 0;
        this.field_rb = false;
        this.field_pb = 0;
        this.field_Cb = false;
        this.field_Bb = false;
        this.field_jb = null;
        this.field_zb = false;
        this.field_Gb = false;
        try {
          this.field_X = 0;
          this.field_S = 0;
          hp.a((byte) 57, g.field_a, 5);
          hp.a((byte) 82, g.field_a, 120);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "wb.<init>(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean q(int param0) {
        RuntimeException var2 = null;
        boolean stackIn_16_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -14945) {
            this.field_Bb = true;
          }
          stackIn_16_0 = ((!this.field_xb ||
            this.field_K == 33 ||
            this.field_K == 29) &&
            this.field_K != 9);
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "wb.V(" + param0 + ')');
        }
    }

    final void a(boolean param0, wb param1) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          this.b(22, -27655);
          param1.b(22, -27655);
          if (this.field_z < param1.field_z) {
            this.field_F = 1;
            if (ZombieDawnMulti.field_E) {
              this.field_F = 3;
            }
          } else {
            this.field_F = 3;
          }
          param1.field_F = 4 - this.field_F;
          if (param0) {
            this.field_qb = -98;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("wb.FA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final void t(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 != 16) {
            wb.l((byte) -55);
          }
          this.field_Bb = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "wb.L(" + param0 + ')');
        }
    }

    private final void b(boolean param0) {
        int fieldTemp$1 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          fieldTemp$1 = this.field_ob;
          this.field_ob = this.field_ob - 1;
          if (0 >= fieldTemp$1 &&
            this.field_K != 9) {
            if (this.field_K == 8 &&
              this.field_Eb != null) {
              this.field_Eb.l(-95);
            }
            if (param0) {
              field_hb = (java.awt.Font) null;
            }
            this.b(9, -27655);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "wb.J(" + param0 + ')');
        }
    }

    static {
        field_Ab = 0;
    }
}
