/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class ah extends g {
    int[] field_gb;
    private int field_lb;
    private boolean field_nb;
    private boolean field_hb;
    static int field_eb;
    int field_ub;
    fb field_sb;
    static String field_bb;
    private int field_rb;
    private nc field_cb;
    private int field_vb;
    int field_pb;
    int[] field_jb;
    boolean field_kb;
    int field_db;
    int field_mb;
    boolean field_ib;
    boolean field_fb;
    boolean field_ob;
    private int field_qb;
    static vn field_tb;

    final boolean p(int param0) {
        int var2 = -44 / ((-76 - param0) / 44);
        if (this.field_t == 28) {
          return false;
        }
        this.i((byte) -71);
        int var3 = this.j((byte) -123);
        if (-1 == var3) {
          return false;
        }
        this.field_nb = false;
        this.field_qb = 5;
        this.field_Y = this.field_jb[var3];
        this.field_X = this.field_gb[var3];
        ho.a(this.f(237239984), (byte) 54, this.a(true));
        pi.a(this.field_X, this.field_Y, (byte) 101);
        this.c(0, this.field_D);
        this.e(1, -6904);
        return true;
    }

    void c(int param0, int param1, int param2) {
        int stackIn_8_1 = 0;
        int var4;
        int var5;
        int var6;
        double var7;
        int var9;
        int var10;
        int var11;
        var11 = ZombieDawn.field_J;
        if (this.field_F == 18) {
          return;
        }
        if (this.field_F == 20) {
          return;
        }
        var4 = 200;
        var5 = param0 - this.a(true);
        if (param1 <= 24) {
          this.field_hb = false;
        }
        var6 = -this.f(237239984) + param2;
        var7 = (double)var4 / (double)so.b(var6 * var6 + var5 * var5);
        this.field_Y = this.a(true) - (int)((double)var5 * var7);
        this.field_X = -(int)((double)var6 * var7) + this.f(237239984);
        this.c(0, 401408);
        this.e(2, -6904);
        this.field_rb = 1;
        if (this.field_S != 3) {
          stackIn_8_1 = 3;
        } else {
          stackIn_8_1 = 1;
        }
        this.field_S = stackIn_8_1;
        ho.a(this.f(237239984), (byte) 54, this.a(true));
        var9 = -1;
        var10 = pb.a(so.field_a, 128, 1);
        if (var10 > 110) {
          var9 = this.field_db;
        } else {
          if (var10 > 50) {
            if (this.t(10)) {
              var9 = pb.a(so.field_a, 4, 1) + 40;
            } else {
              var9 = pb.a(so.field_a, 3, 1) + 37;
            }
          }
        }
        if (var9 != -1) {
          dc.a((byte) 18, var9);
        }
        return;
    }

    final boolean a(int param0, int param1, boolean param2) {
        fb var4;
        kd var5;
        int var6;
        fb stackIn_7_0 = null;
        boolean stackIn_22_0 = false;
        var6 = ZombieDawn.field_J;
        this.field_sb = null;
        this.field_fb = false;
        if (param0 > -28) {
          this.field_fb = true;
        }
        var4 = this.a((byte) -74, param1, 10);
        while (var4 != null) {
          if (var4 instanceof kd) {
            stackIn_7_0 = var4;
          } else {
            stackIn_7_0 = null;
          }
          var5 = (kd) (stackIn_7_0);
          if (var5 == null ||
            var5.x(79) ||
            this instanceof we &&
            var5.field_F != 9) {
            if (!param2 &&
              !this.a(72, var4)) {
              var4 = this.e((byte) 32);
              continue;
            }
            this.field_sb = var4;
            this.field_mb = this.field_s;
            if (var5 != null &&
              var5.field_bb > 0) {
              this.field_fb = true;
              return true;
            }
          }
          var4 = this.e((byte) 32);
        }
        stackIn_22_0 = (null != this.field_sb);
        return stackIn_22_0;
    }

    final int s(int param0) {
        int var2;
        int var3;
        var3 = ZombieDawn.field_J;
        var2 = this.field_t;
        if (0 == var2) {
          return lc.field_j;
        }
        if (var2 == 1) {
          return lc.field_j;
        }
        if (var2 == 2) {
          return uo.field_j;
        }
        if (3 == var2) {
          return lc.field_j;
        }
        if (4 == var2) {
          return uo.field_j;
        }
        if (var2 == 5) {
          return lc.field_j;
        }
        if (var2 == 6) {
          return da.field_n;
        }
        if (7 == var2) {
          return h.field_a;
        }
        if (var2 == 8) {
          return h.field_a;
        }
        if (var2 == 9) {
          return gg.field_b;
        }
        if (10 == var2) {
          return gg.field_b;
        }
        if (var2 == 11) {
          return da.field_h;
        }
        if (var2 == 12) {
          return da.field_h;
        }
        if (var2 == 13) {
          return pa.field_B;
        }
        if (var2 == 14) {
          return pa.field_B;
        }
        if (var2 == 15) {
          return gn.field_b;
        }
        if (var2 == 23) {
          return qc.field_a;
        }
        if (var2 == 16) {
          return qc.field_a;
        }
        if (var2 == 28) {
          return ke.field_h;
        }
        if (var2 == 18) {
          return ke.field_h;
        }
        if (var2 == 19) {
          return jc.field_h;
        }
        if (var2 == 29) {
          return h.field_a;
        }
        if (var2 == 26) {
          return h.field_a;
        }
        if (var2 == 24) {
          return h.field_a;
        }
        if (var2 == 25) {
          return h.field_a;
        }
        if (22 == var2) {
          return h.field_a;
        }
        if (var2 == 21) {
          return h.field_a;
        }
        if (var2 == 30) {
          return da.field_n;
        }
        if (param0 == 24478) {
          return 0;
        }
        this.field_db = -10;
        return 0;
    }

    private final String k(byte param0) {
        int var2;
        int var3;
        var3 = ZombieDawn.field_J;
        if (param0 != -34) {
          return (String) null;
        }
        var2 = this.field_F;
        if (var2 == 0) {
          return "IDLE";
        }
        if (1 == var2) {
          return "RUNNING";
        }
        if (var2 == 3) {
          return "COWERING";
        }
        if (16 == var2) {
          return "SCREECHCOWER";
        }
        if (var2 == 11) {
          return "AIMING";
        }
        if (var2 == 10) {
          return "SHOOTING";
        }
        if (var2 != 2) {
          return "ILLEGAL";
        }
        return "KNOCKBACK";
    }

    final void a(int param0, byte param1, int param2) {
        kk var7 = null;
        kk var6 = null;
        int var4 = -5 % ((43 - param1) / 57);
        qh var5 = dj.field_e.field_H.a(true, this.a(true), param2, param0, this.f(237239984));
        if (var5 != null) {
          var7 = (kk) (var5.b((byte) 26));
          var6 = var7;
          if (this.a(true) == var7.field_l &&
            this.f(237239984) == var7.field_h) {
            var6 = (kk) (var5.a(false));
          }
          if (var6 == null) {
            return;
          }
          this.field_Y = var6.field_l;
          this.field_X = var6.field_h;
          this.c(0, this.field_D);
          this.e(1, -6904);
        }
    }

    final void n(int param0) {
        int stackIn_8_0 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        fb var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var4Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        var10 = ZombieDawn.field_J;
        var3 = -110 % ((param0 - 24) / 52);
        var2 = 0;
        for (var4 = 0; var4 < this.field_ub; var4++) {
          h.field_e[var4] = 0;
          if (0 >= this.field_z) {
            stackIn_8_0 = (mf.a(this.field_gb[var4], this.field_jb[var4], 0)) ? 1 : 0;
          } else {
            stackIn_8_0 = 1;
          }
          L6: {
            var5 = stackIn_8_0;
            if (-1 + this.field_ub != var4 && (var5 == 0 ||
              -1 == dj.field_e.field_H.a(this.field_gb[var4], this.f(237239984), this.field_jb[var4], this.a(true), 124))) {
              h.field_e[var4] = -1;
              break L6;
            }
            var6 = this.b(250, 16);
            while (var6 != null) {
              L10: {
                if ((!(var6 instanceof kd) ||
                  !((kd) (var6)).x(53)) &&
                  !(var6 instanceof vb)) {
                  if (0 == this.field_z) {
                    break L10;
                  }
                  if (!(var6 instanceof id)) {
                    break L10;
                  }
                  if (this.field_z != var6.field_z) {
                    var6 = this.e((byte) 32);
                    continue;
                  }
                  var7 = this.field_jb[var4] - var6.a(true);
                  var8 = this.field_gb[var4] - var6.f(237239984);
                  var9 = var8 * var8 + var7 * var7;
                  if (var9 >= 625) {
                    var6 = this.e((byte) 32);
                    continue;
                  }
                  var2 = 1;
                  h.field_e[var4] = -1 - var9;
                  var6 = this.e((byte) 32);
                  continue;
                }
                var7Lifetime1 = this.field_jb[var4] - var6.a(true);
                var8Lifetime1 = this.field_gb[var4] - var6.f(237239984);
                var9Lifetime1 = var7Lifetime1 * var7Lifetime1 + var8Lifetime1 * var8Lifetime1;
                if (0 != h.field_e[var4] &&
                  h.field_e[var4] <= var9Lifetime1) {
                  var6 = this.e((byte) 32);
                  continue;
                }
                h.field_e[var4] = var9Lifetime1;
              }
              var6 = this.e((byte) 32);
            }
          }
        }
        if (var2 != 0) {
          for (var4Lifetime1 = 0; this.field_ub > var4Lifetime1; var4Lifetime1++) {
            if (h.field_e[var4Lifetime1] > 0) {
              h.field_e[var4Lifetime1] = 0;
            }
            if (h.field_e[var4Lifetime1] < -1) {
              h.field_e[var4Lifetime1] = -h.field_e[var4Lifetime1] + 1000000;
            }
          }
        }
    }

    void a(byte param0, wk param1) {
        vn stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_21_2 = 0;
        int stackIn_64_0;
        int stackIn_64_1;
        int stackIn_64_2;
        int stackIn_64_3;
        int stackIn_65_4 = 0;
        int stackIn_67_0;
        int stackIn_67_1;
        int stackIn_67_2;
        int stackIn_67_3;
        int stackIn_68_4;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_79_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var5Lifetime1;
        int var6Lifetime1;
        var8 = ZombieDawn.field_J;
        try {
          if (20 != this.field_F &&
            !this.field_J) {
            var3_int = -24 + param1.a(this.a(true), (byte) -81);
            var4 = param1.a(this.f(237239984), 0) - 48;
            if (null != this.field_U) {
              if (this.field_U.l()) {
                this.field_U = null;
              } else {
                this.field_U.h(pj.a(var4, 84, var3_int));
              }
            }
            if (b.field_h) {
              bj.field_q.c(this.k((byte) -34), var3_int, var4, 16777215, 0);
              this.a(param1, 5060);
            }
            if (var3_int >= -48 &&
              var4 >= -48 &&
              qj.field_d >= var3_int &&
              var4 <= me.field_Bb) {
              if (this.field_F != 17) {
                stackIn_20_0 = nb.field_k[1];
                stackIn_20_1 = 12;
                if (this.field_S == 3) {
                  stackIn_21_2 = -2 + var3_int;
                } else {
                  stackIn_21_2 = -3 + var3_int;
                }
                so.a(stackIn_20_0, stackIn_20_1 + stackIn_21_2, 43 + var4);
              }
              if (this.field_z > 0) {
                Math.abs(ip.field_p[0].field_w * fb.a(1311979239, (int)tp.field_p << 6) >> 16);
                var5 = 6 * fb.a(1311979239, (int)tp.field_p << 6) >> 16;
                var6 = rd.a(true, (int)tp.field_p << 7) * 3 >> 16;
                ip.field_p[0].g(var5 + 24 + (var3_int - 7), 2 + (var4 + var6), bb.field_e[-1 + this.field_z]);
              }
              var5Lifetime1 = cg.field_d[this.field_F] + this.field_G;
              var6Lifetime1 = var3_int;
              var7 = var4;
              if (!(this.field_Z <= 0) ||
                ng.field_e &&
                (this.field_ib ||
                this.field_C) &&
                !bo.field_p[86]) {
                ki.a((byte) -114, dn.field_E);
                var4 = 0;
                bi.d();
                var3_int = 0;
              }
              if (param0 > -76) {
                this.n(-60);
              }
              if (this.field_F != 10 &&
                this.field_F != 11) {
                if (3 != this.field_S &&
                  this.field_S != 2) {
                  ld.field_l[this.field_t][var5Lifetime1].c(var3_int, var4);
                } else {
                  ld.field_l[this.field_t][var5Lifetime1].b(var3_int, var4);
                }
              } else {
                if (this.field_S == 2) {
                  ld.field_l[this.field_t][var5Lifetime1 + 2].b(var3_int, var4);
                } else {
                  if (this.field_S == 0) {
                    ld.field_l[this.field_t][var5Lifetime1 + 4].b(var3_int, var4);
                  } else {
                    if (this.field_S == 3) {
                      ld.field_l[this.field_t][var5Lifetime1].b(var3_int, var4);
                    } else {
                      if (this.field_S == 1) {
                        ld.field_l[this.field_t][var5Lifetime1].c(var3_int, var4);
                      }
                    }
                  }
                }
              }
              boolean decompiledFrameRemainder0 = true;
              if ((0 >= this.field_Z) &&
                (decompiledFrameRemainder0 = !(!ng.field_e)) &&
                (decompiledFrameRemainder0 = (this.field_ib ||
                this.field_C))) {
                decompiledFrameRemainder0 = !(bo.field_p[86]);
              }
              if (decompiledFrameRemainder0) {
                if (ng.field_e && (this.field_ib ||
                  this.field_C)) {
                  stackIn_64_0 = 0;
                  stackIn_64_1 = 0;
                  stackIn_64_2 = dn.field_E.field_w;
                  stackIn_64_3 = dn.field_E.field_t;
                  if (this.field_C) {
                    stackIn_65_4 = 8921617;
                  } else {
                    stackIn_65_4 = 43775;
                  }
                  so.a(stackIn_64_0, stackIn_64_1, stackIn_64_2, stackIn_64_3, stackIn_65_4);
                  stackIn_67_0 = 0;
                  stackIn_67_1 = 0;
                  stackIn_67_2 = dn.field_E.field_w;
                  stackIn_67_3 = dn.field_E.field_t;
                  if (this.field_C) {
                    stackIn_68_4 = 16711680;
                  } else {
                    stackIn_68_4 = 255;
                  }
                  so.a(stackIn_67_0, stackIn_67_1, stackIn_67_2, stackIn_67_3, stackIn_68_4);
                  pa.a(-21189);
                  var4 = var7;
                  var3_int = var6Lifetime1;
                  dn.field_E.b(var3_int, var4);
                  decompiledFrameRemainder0 = false;
                }
                else {
                  pa.a(-21189);
                  var4 = var7;
                  var3_int = var6Lifetime1;
                  dn.field_E.d(var3_int, var4, 142);
                }
              }
              if (kc.field_Q) {
                pc.field_k.a(s.a(1938762664, "<%0>,<%1>", new String[]{Integer.toString(this.field_B), Integer.toString(this.field_u)}), 24 + var3_int, -5 + var4, 16777215, 0);
              }
              if (this.field_ob) {
                nb.field_k[0].b(var3_int, var4, 128, 16711680);
              }
              return;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_78_0 = var3;
          stackIn_78_1 = new StringBuilder().append("ah.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_79_2 = "null";
          } else {
            stackIn_79_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_78_0), ((StringBuilder) (Object) stackIn_78_1).append(stackIn_79_2).append(')').toString());
        }
    }

    final void j(int param0) {
        super.j(124);
        this.e(3, -6904);
        if (param0 < 66) {
          this.n(53);
        }
    }

    int j(byte param0) {
        int var2;
        int var3;
        int var4;
        var4 = ZombieDawn.field_J;
        this.n(87);
        var2 = -1;
        var3 = 0;
        if (param0 >= -42) {
          return -120;
        }
        while (this.field_ub > var3) {
          if (-1 != h.field_e[var3] && (-1 == var2 ||
            !(h.field_e[var3] < h.field_e[var2]))) {
            var2 = var3;
          }
          var3++;
        }
        if (-1 + this.field_ub == var2) {
          var2 = -1;
        }
        return var2;
    }

    final boolean a(int param0, fb param1) {
        ej var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        wk var8 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = dj.field_e.field_H;
          if (param0 <= 52) {
            var8 = (wk) null;
            this.a((byte) -36, (wk) null);
          }
          var4 = this.field_y >> 16;
          var5 = this.field_x >> 16;
          var6 = param1.field_y >> 16;
          var7 = param1.field_x >> 16;
          stackIn_7_0 = (var3.a(var7, var4, var5, (byte) -111, false, var6) != -1) || (var3.a(-48 + var7 + 10, var4, 10 + (-48 + var5), (byte) -123, false, var6) != -1);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("ah.JA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    void g(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        boolean stackIn_30_1 = false;
        boolean stackIn_51_1 = false;
        boolean stackIn_92_1 = false;
        int stackIn_96_1 = 0;
        int var2;
        le var3;
        int var4;
        int var2Lifetime1;
        var4 = ZombieDawn.field_J;
        if (400 + this.field_t > dj.field_e.field_r &&
          dj.field_e.field_r > 200 &&
          pb.a(so.field_a, 25, 1) == 0) {
          this.c(this.a(true) + pb.a(so.field_a, 1000, 1) - 500, 78, this.f(237239984) - (-pb.a(so.field_a, 1000, 1) + 500));
        }
        if (param0 < 95) {
          this.field_gb = (int[]) null;
        }
        this.m(-67);
        this.d(this.field_F, -26109);
        if (this.field_V) {
          if (this.field_F != 2) {
            return;
          }
          if (-3 + cg.field_h[2] == this.field_G) {
            this.field_N = 0;
          }
          return;
        }
        L2: {
          boolean decompiledFrameRemainder0 = true;
          if (this.field_F == 0) {
            fieldTemp$0 = this.field_vb + 1;
            this.field_vb = this.field_vb + 1;
            if (this.field_lb < fieldTemp$0) {
              stackIn_92_1 = !(this.field_hb);
              this.field_hb = stackIn_92_1;
              this.field_vb = 0;
              if (this.field_hb) {
                this.field_lb = 53;
              } else {
                if (!this.field_hb) {
                  stackIn_96_1 = pb.a(so.field_a, 200, 1) + 20;
                } else {
                  stackIn_96_1 = 65;
                }
                this.field_lb = stackIn_96_1;
              }
            }
            if (!this.field_hb) {
              this.field_G = 0;
            }
            fieldTemp$1 = this.field_qb;
            this.field_qb = this.field_qb + 1;
            if (fieldTemp$1 < 5) {
              break L2;
            }
            this.field_qb = 0;
            this.l((byte) 52);
          } else {
            if (2 == this.field_F) {
              if (0 != this.field_O ||
                this.field_T != 0) {
                this.g((byte) -113);
                if (!dj.field_e.field_H.a(false, this.field_T + this.field_x >> 16, this.field_y + this.field_O >> 16, true)) {
                  this.field_x = this.field_x - this.field_T;
                  this.field_y = this.field_y - this.field_O;
                  if (this.field_O != 0 &&
                    dj.field_e.field_H.a(false, this.f(237239984), this.field_O + this.field_y >> 16, true)) {
                    this.field_T = 0;
                    this.field_y = this.field_y + this.field_O;
                    this.field_X = this.field_x >> 16;
                  } else {
                    if (this.field_T != 0 &&
                      dj.field_e.field_H.a(false, this.field_x + this.field_T >> 16, this.field_y >> 16, true)) {
                      this.field_O = 0;
                      this.field_Y = this.field_y >> 16;
                      this.field_x = this.field_x + this.field_T;
                    } else {
                      this.field_O = 0;
                      this.field_T = 0;
                    }
                  }
                }
              }
              if (this.field_G < 4) {
                this.field_N = this.field_N + 1;
              } else {
                if (this.field_G != 4) {
                  if ((6 == this.field_G)) {
                    this.e(0, -6904);
                    pi.a(this.f(237239984), this.a(true), (byte) 101);
                  }
                } else {
                  this.field_N = 0;
                  fieldTemp$2 = this.field_rb;
                  this.field_rb = this.field_rb + 1;
                  if (fieldTemp$2 >= 400) {
                    this.field_G = this.field_G + 1;
                  }
                  this.field_T = 0;
                  this.field_O = 0;
                }
              }
              break L2;
            }
            if (this.field_F == 1) {
              fieldTemp$6 = this.field_qb;
              this.field_qb = this.field_qb + 1;
              if (fieldTemp$6 >= 5) {
                this.field_qb = 0;
                var2 = 0;
                var3 = dj.field_e.field_lb.b((byte) 26);
                while (var3 instanceof mm) {
                  var2 = var2 != 0 | ((mm) (var3)).a(this, (byte) 108) ? 1 : 0;
                  var3 = var3.field_b;
                }
                if (!this.field_nb &&
                  var2 != 0) {
                  this.c(0, this.field_D >> 2);
                } else {
                  if (this.field_nb &&
                    var2 == 0) {
                    this.c(0, this.field_D);
                  }
                }
                stackIn_30_1 = (var2 != 0);
                this.field_nb = stackIn_30_1;
              }
              this.g((byte) 113);
              if (!(!this.h((byte) 126))) {
                this.e(0, -6904);
                this.l((byte) 52);
              }
              break L2;
            }
            if (23 == this.field_F) {
              fieldTemp$5 = this.field_qb;
              this.field_qb = this.field_qb + 1;
              if (5 <= fieldTemp$5) {
                this.field_qb = 0;
                var2Lifetime1 = 0;
                var3 = dj.field_e.field_lb.b((byte) 26);
                while (var3 instanceof mm) {
                  var2Lifetime1 = var2Lifetime1 != 0 | ((mm) (var3)).a(this, (byte) 79) ? 1 : 0;
                  var3 = var3.field_b;
                }
                if (!this.field_nb &&
                  var2Lifetime1 != 0) {
                  this.c(0, this.field_D >> 2);
                } else {
                  if (this.field_nb &&
                    var2Lifetime1 == 0) {
                    this.c(0, this.field_D);
                  }
                }
                stackIn_51_1 = (var2Lifetime1 != 0);
                this.field_nb = stackIn_51_1;
                this.l((byte) 52);
              }
              this.g((byte) -104);
              if (!(!this.h((byte) -127))) {
                this.e(0, -6904);
                this.l((byte) 52);
              }
              break L2;
            }
            if (this.field_F != 3) {
              if (this.field_F == 16) {
                fieldTemp$3 = this.field_qb;
                this.field_qb = this.field_qb + 1;
                if (fieldTemp$3 < 5) {
                  break L2;
                }
                this.field_qb = 0;
                decompiledFrameRemainder0 = (this.field_cb == null ||
                  this.field_cb.c(111));
                if (decompiledFrameRemainder0) {
                  this.field_cb = null;
                  this.e(0, -6904);
                  this.l((byte) 52);
                  break L2;
                }
              }
              if ((decompiledFrameRemainder0) &&
                (this.field_F == 20)) {
              }
            } else {
              fieldTemp$4 = this.field_qb;
              this.field_qb = this.field_qb + 1;
              if (fieldTemp$4 >= 5) {
                this.field_qb = 0;
                this.l((byte) 52);
              }
            }
          }
        }
    }

    final void k(int param0) {
        if (param0 != 0) {
          return;
        }
        this.o(-6253);
    }

    ah(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3);
        this.field_nb = false;
        this.field_ub = 61;
        this.field_cb = null;
        this.field_lb = 0;
        this.field_rb = 0;
        this.field_kb = false;
        this.field_ib = false;
        this.field_hb = false;
        this.field_ob = false;
        this.field_vb = 0;
        vn discarded$0 = new vn(48, 48);
        this.field_lb = pb.a(so.field_a, 200, 1);
        this.field_jb = new int[61];
        this.field_gb = new int[61];
        this.i((byte) 79);
        this.field_qb = pb.a(so.field_a, 5, 1);
        if (this.t(10)) {
          this.field_db = 49 + pb.a(so.field_a, 4, 1);
        } else {
          this.field_db = pb.a(so.field_a, 3, 1) + 26;
        }
    }

    final void f(byte param0) {
        if (param0 != -85) {
          this.k(76);
        }
        this.field_J = true;
        this.e(2, param0 - 6819);
        this.field_G = 2;
    }

    final boolean a(boolean param0, boolean param1, int param2, int param3) {
        fb var5;
        kd var6;
        int var7;
        var7 = ZombieDawn.field_J;
        if (param2 >= -83) {
          this.field_hb = true;
        }
        var5 = this.a((byte) -74, param3, 10);
        while (var5 != null) {
          if (var5 instanceof kd) {
            var6 = (kd) (var5);
            if (var6 != null && (param0 ||
              var6.field_F != 8) && (var6.x(87) ||
              this instanceof we)) {
              if (var6.field_hb) {
                var5 = this.e((byte) 32);
                continue;
              }
              if (param1 ||
                dj.field_e.field_H.a(var6.f(237239984), this.a(true), this.f(237239984), (byte) -91, false, var6.a(true)) != -1 ||
                dj.field_e.field_H.a(var6.f(237239984) - 48, this.a(true), -48 + this.f(237239984), (byte) -109, false, var6.a(true)) != -1) {
                return true;
              }
            }
          }
          var5 = this.e((byte) 32);
        }
        return false;
    }

    final void a(nc param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var3_int = param0.field_m - this.a(true);
          var4 = param0.field_q - this.f(param1 ^ -237213750);
          if (param1 != -26246) {
            return;
          }
          stackIn_5_0 = (var4 * var4 + var3_int * var3_int >= 102400) ? 0 : 1;
          var5 = stackIn_5_0;
          if (this.field_cb == param0) {
            if (var5 == 0) {
              this.field_cb = null;
              this.e(0, param1 ^ 31858);
              this.l((byte) 52);
            }
          } else {
            if (this.field_cb == null &&
              var5 != 0) {
              this.a(param0, (byte) -124);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("ah.W(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    final void q(int param0) {
        if (param0 <= 5) {
          this.c(22, 55, 42);
        }
        this.e(0, -6904);
    }

    abstract void l(byte param0);

    void o(int param0) {
        if (param0 != -6253) {
          return;
        }
        this.e(18, -6904);
        this.b(-27598);
        this.d(0);
        if (!(0 >= this.field_z)) {
          dj.field_e.field_J[-1 + this.field_z] = dj.field_e.field_J[-1 + this.field_z] - 1;
        }
    }

    public static void u(int param0) {
        field_tb = null;
        field_bb = null;
        if (param0 < 21) {
          field_bb = (String) null;
        }
    }

    private final void i(byte param0) {
        int var5 = 0;
        int var6 = ZombieDawn.field_J;
        int var2 = 99 % ((param0 - 0) / 50);
        int var3 = this.a(true);
        int var4 = this.f(237239984);
        for (var5 = 0; var5 < this.field_ub - 1; var5++) {
          this.field_jb[var5] = qd.field_a[var5] + var3;
          this.field_gb[var5] = var4 + qd.field_f[var5];
        }
        this.field_jb[this.field_ub - 1] = var3;
        this.field_gb[-1 + this.field_ub] = var4;
    }

    final boolean t(int param0) {
        boolean stackIn_35_0 = false;
        int var2;
        int var3;
        var3 = ZombieDawn.field_J;
        if (param0 != 10) {
          this.r(4);
        }
        var2 = this.field_t;
        if (var2 == 0) {
          return false;
        }
        L1: {
          if (var2 != 1 &&
            var2 != 2) {
            if (var2 != 3 &&
              var2 != 4 &&
              5 != var2) {
              switch (var2) {
                case 6:
                  return true;
                case 7:
                  return true;
                case 8:
                  return true;
                case 9:
                  return false;
                case 10:
                  return true;
                case 11:
                  return false;
                case 15:
                case 16:
                case 18:
                case 19:
                case 20:
                case 29:
                default:
                  if (var2 != 12 &&
                    var2 != 13 &&
                    var2 != 14) {
                    switch (var2) {
                      case 15:
                        return true;
                      case 16:
                        return true;
                      case 18:
                        return true;
                      case 19:
                        return true;
                      case 20:
                        return true;
                      case 29:
                      default:
                        if (var2 != 21 &&
                          var2 != 27 &&
                          var2 != 30) {
                          if (29 != var2) {
                            return true;
                          }
                          stackIn_35_0 = false;
                          break L1;
                        }
                        return false;
                    }
                  }
                  return true;
              }
            }
            return true;
          }
          stackIn_35_0 = false;
        }
        return stackIn_35_0;
    }

    abstract void a(wk param0, int param1);

    void a(nc param0, byte param1) {
        if (this.field_F == 18 ||
          20 == this.field_F ||
          this.field_F == 16 ||
          this.field_F == 2) {
          return;
        }
        try {
          this.e(16, -6904);
          this.field_cb = param0;
          int var3_int = -89 % ((param1 + 53) / 54);
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "ah.O(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void r(int param0) {
        this.e(param0, param0 ^ -6884);
    }

    static {
        field_bb = "PHANTOM";
    }
}
