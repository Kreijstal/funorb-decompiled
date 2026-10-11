/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class re {
    private int field_m;
    private int field_t;
    private int field_J;
    private boolean field_u;
    private be field_C;
    static ub field_r;
    private bd field_H;
    private le[] field_b;
    private int field_s;
    private int field_e;
    private pb field_z;
    private le[][] field_w;
    private int field_j;
    static bd[][] field_D;
    private boolean field_c;
    private int field_x;
    private th field_F;
    static boolean field_k;
    int field_p;
    private fj field_h;
    th field_E;
    private int field_y;
    private int field_v;
    static String field_B;
    int field_d;
    int field_f;
    private int field_o;
    private int field_a;
    static oj[] field_n;
    boolean field_K;
    private th field_G;
    private int field_g;
    static java.awt.Color field_A;
    static bl field_i;
    static boolean field_l;
    static String field_I;
    static bd field_q;

    private final void b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = HostileSpawn.field_I ? 1 : 0;
        var5 = 35 / ((param1 + 16) / 62);
        var4 = 54;
        if (18 == param0) {
          var4 = -11 - var4 + 640;
        }
        boolean decompiledFrameRemainder0 = true;
        var5 = 325;
        var6 = 8421376;
        if (!this.field_K &&
          ka.a(var5, 0, 21, 11, var4)) {
          if (param0 != 18) {
            decompiledFrameRemainder0 = !(!this.c(24834));
          } else {
            decompiledFrameRemainder0 = !(!this.g((byte) 30));
          }
          if (decompiledFrameRemainder0) {
            this.field_t = param2;
            this.field_u = true;
            var6 = 16776960;
          }
        }
        if (this.field_t == param2 &&
          0 == this.field_j) {
          var6 = 16776960;
        }
        si.b(var4, var5, 11, 21, 2, var6);
        if (param0 == 18 &&
          !this.g((byte) 30) ||
          param0 == 17 &&
          !this.c(24834)) {
          si.a(var4, var5, 11, 21, 0, 192);
        }
        L7: {
          boolean decompiledFrameCompleted0 = true;
          var5 += 5;
          if (param0 != 18) {
            var4 += 9;
            var7 = 1;
            while (true) {
              if (var7 <= 6) {
                si.a(-var7 + var4, var5, var7, 0);
                si.e(-var7 + (var4 - 1), var5, 1, 0, 128);
                var5++;
                var7++;
                if (var8 == 0) {
                  continue;
                }
              } else {
                var7 = 5;
              }
              break;
            }
            while (var7 >= 1) {
              si.a(var4 - var7, var5, var7, 0);
              si.e(-var7 + var4 - 1, var5, 1, 0, 128);
              var5++;
              var7--;
              if (var8 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
          }
          if ((decompiledFrameCompleted0) &&
            (param0 == 18 ||
            var8 != 0)) {
            var4 += 2;
            var7 = 1;
            do {
              if (var7 > 6) {
                var7 = 5;
                break;
              }
              si.a(var4, var5, var7, 0);
              si.e(var7 + var4, var5, 1, 0, 128);
              var5++;
              var7++;
            } while (var8 == 0);
            while (var7 >= 1) {
              si.a(var4, var5, var7, 0);
              si.e(var4 + var7, var5, 1, 0, 128);
              var5++;
              var7--;
              if (var8 != 0) {
                break;
              }
            }
          }
        }
    }

    private final void a(int param0, boolean param1) {
        int stackIn_10_0 = 0;
        int[] stackIn_10_1 = null;
        boolean stackIn_11_2 = false;
        int stackIn_14_0 = 0;
        boolean stackIn_35_0 = false;
        int stackIn_44_0 = 0;
        int[] stackIn_44_1 = null;
        boolean stackIn_45_2 = false;
        int stackIn_56_0 = 0;
        int[] stackIn_56_1 = null;
        boolean stackIn_57_2 = false;
        int stackIn_60_0 = 0;
        int var3 = 0;
        int var4 = 0;
        bd var5_ref_bd = null;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        String var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var4Lifetime1;
        int var6Lifetime1;
        var9 = HostileSpawn.field_I ? 1 : 0;
        if (!param1) {
          this.field_C = (be) null;
        }
        boolean decompiledFrameCompleted1 = true;
        this.l(-7);
        this.a((byte) -119, ob.field_E.toUpperCase());
        si.d(0, 0, 640, 400);
        var3 = ib.a((byte) -72) ? 1 : 0;
        if (!ta.p(3)) {
          var4 = 0;
          while (var4 < 42) {
            stackIn_35_0 = hb.a(var4, mc.field_E, false);
            if (var9 != 0) {
              decompiledFrameCompleted1 = false;
              break;
            }
            if (!stackIn_35_0) {
              var5_ref_bd = this.field_b[var4].field_Y;
              if (var5_ref_bd != null) {
                var5_ref_bd.a();
                si.d();
                stackIn_10_0 = var4;
                stackIn_10_1 = uk.field_c;
                stackIn_11_2 = !(param1);
                stackIn_14_0 = (!hb.a(stackIn_10_0, stackIn_10_1, stackIn_11_2)) ? 0 : 1;
                var6 = stackIn_14_0;
                if (var6 == 0) {
                  qc.field_v.c(3, 3);
                  if (var4 != this.field_J) {
                    var7_int = 0;
                    while (var5_ref_bd.field_D.length > var7_int) {
                      var5_ref_bd.field_D[var7_int] = he.c(var5_ref_bd.field_D[var7_int], (byte) -127);
                      var7_int++;
                    }
                  }
                } else {
                  fj.field_Kb[var4].b(3, 3);
                }
                if (~this.field_J == ~var4 &&
                  var6 != 0) {
                  var5_ref_bd.e(16776960);
                }
                if (~this.field_x == ~var4 ||
                  this.field_x < 0 &&
                  ~this.field_J == ~var4) {
                  var5_ref_bd.a();
                  this.a(-1 + var5_ref_bd.field_A, 0, 0, -18, -1 + var5_ref_bd.field_z);
                }
                this.field_b[var4].field_Y = var5_ref_bd;
              }
            }
            var4++;
          }
        }
        if (decompiledFrameCompleted1) {
          o.field_n.b((byte) 108);
          this.a(100, (byte) -55, 286, 72, 496);
          si.d(72, 286, 568, 386);
          this.field_F.a(103, false);
          si.c();
          stackIn_35_0 = ta.p(3);
        }
        boolean decompiledFrameRemainder0 = true;
        if (!stackIn_35_0) {
          if (this.field_x == -1 &&
            this.field_J == -1) {
            id.field_A.b(jd.field_i.toUpperCase(), 320, 177, 8421376, -1);
            decompiledFrameRemainder0 = (var9 != 0);
          }
          if (decompiledFrameRemainder0) {
            this.a(160, (byte) -55, 92, 58, 160);
            this.a(160, (byte) -55, 92, 244, 340);
            var4Lifetime1 = this.field_x;
            if (var4Lifetime1 == -1) {
              var4Lifetime1 = this.field_J;
            }
            stackIn_44_0 = var4Lifetime1;
            stackIn_44_1 = uk.field_c;
            stackIn_45_2 = !(param1);
            var5 = hb.a(stackIn_44_0, stackIn_44_1, stackIn_45_2) ? 1 : 0;
            wh.field_d.c(il.field_b[var4Lifetime1].toUpperCase(), 260, 121, 16776960, -1);
            if (var5 == 0) {
              if (var3 == 0 &&
                !qa.a(e.field_w, var4Lifetime1, param1)) {
                de.field_i.e(74, 108);
                if (var9 != 0) {
                  qc.field_v.a(74, 108);
                  fj.field_Kb[var4Lifetime1].e(74, 108);
                }
              } else {
                qc.field_v.a(74, 108);
                if (var9 != 0) {
                  fj.field_Kb[var4Lifetime1].e(74, 108);
                }
              }
            } else {
              fj.field_Kb[var4Lifetime1].e(74, 108);
            }
            var6Lifetime1 = 0;
            if (var5 == 0) {
              al.field_Z.c(vc.field_j.toUpperCase(), 260, 140, 16776960, -1);
              stackIn_56_0 = var4Lifetime1;
              stackIn_56_1 = e.field_g;
              stackIn_57_2 = !(param1);
              stackIn_60_0 = (!hb.a(stackIn_56_0, stackIn_56_1, stackIn_57_2)) ? 0 : 1;
              var6Lifetime1 = stackIn_60_0;
            }
            if (var5 != 0 ||
              var9 != 0) {
              al.field_Z.c(g.field_N.toUpperCase(), 260, 140, 16776960, -1);
            }
            var7 = bh.field_g[var4Lifetime1];
            if (var6Lifetime1 != 0) {
              var7 = qc.field_t;
            }
            boolean decompiledFrameCompleted0 = true;
            al.field_Z.a(var7.toUpperCase(), 260, 150, 320, 64, 16776960, -1, 0, 0, 16);
            if (var6Lifetime1 == 0) {
              al.field_Z.c(ml.field_b.toUpperCase() + j.field_d[var4Lifetime1] * 100, 260, 233, 16776960, -1);
              al.field_Z.c(li.field_v.toUpperCase(), 420, 233, 16776960, -1);
              if (10 != j.field_d[var4Lifetime1]) {
                var8 = 0;
                while (j.field_d[var4Lifetime1] > var8) {
                  ob.field_B[0].a(var8 * 8 + 500, 209);
                  var8++;
                  if (var9 != 0) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                }
                if ((decompiledFrameCompleted0) &&
                  (var9 != 0)) {
                  ob.field_B[1].a(500, 209);
                }
              } else {
                ob.field_B[1].a(500, 209);
              }
            }
            if (var9 != 0) {
              id.field_A.b(u.field_a.toUpperCase(), 320, 199, 8421376, -1);
            }
          }
        } else {
          id.field_A.b(u.field_a.toUpperCase(), 320, 199, 8421376, -1);
        }

    }

    final void k(int param0) {
        int var3;
        var3 = HostileSpawn.field_I ? 1 : 0;
        if (12 == this.field_f) {
          uh.field_i = uh.field_i - 8;
          if (0 >= uh.field_i) {
            uh.field_i = 0;
            if (1 == uj.field_l) {
              this.f((byte) 76);
            }
          }
          ed.a(uh.field_i, (byte) -99);
          if ((var3 != 0) &&
            (this.field_f == 13)) {
            qg.field_p = qg.field_p - 32;
            if (0 >= qg.field_p) {
              qg.field_p = 0;
            }
            qi.b(qg.field_p, (byte) -116);
          }
        } else {
          if (this.field_f == 13) {
            qg.field_p = qg.field_p - 32;
            if (0 >= qg.field_p) {
              qg.field_p = 0;
            }
            qi.b(qg.field_p, (byte) -116);
          }
        }
        if (this.field_d != 16) {
          if (this.field_d == 4) {
            if (this.field_C.field_b == 5) {
              if (!(this.field_t >= 4)) {
                this.field_t = this.field_t - 1;
                if (!(this.field_t >= 0)) {
                  this.field_t = this.field_t + 4;
                  if (var3 != 0) {
                    this.field_t = this.field_t - 1;
                    if (this.field_t < 0) {
                      this.field_t = this.field_t + this.field_C.field_b;
                      this.field_t = 0;
                    }
                  }
                }
              }
            } else {
              this.field_t = this.field_t - 1;
              if (this.field_t < 0) {
                this.field_t = this.field_t + this.field_C.field_b;
                if (var3 != 0) {
                  this.field_t = 0;
                }
              }
            }
          }
        } else {
          this.field_t = 0;
        }
        if (param0 > -11) {
          field_i = (bl) null;
        }
        if (this.field_d == 6) {
          if (this.field_C.field_b != 3) {
            if (!(1 >= this.field_C.field_b)) {
              this.field_t = this.field_t - 1;
              if (0 > this.field_t) {
                this.field_t = this.field_C.field_b - 1;
                if (var3 != 0) {
                  this.field_t = 1;
                }
              }
            }
          } else {
            this.field_t = 1;
          }
        }
        if (this.field_d == 2) {
          this.field_t = 1;
          if (3 == this.field_C.field_b) {
            this.field_t = 1;
          }
        }
        if (1 == this.field_d ||
          7 == this.field_d) {
          this.field_t = 0;
        }
        if (this.field_d == 12 ||
          this.field_d == 14 ||
          this.field_d == 15 ||
          this.field_d == 13 ||
          this.field_d == 11 ||
          this.field_d == 10) {
          this.field_t = this.field_t - 1;
          if (this.field_t < 0) {
            this.field_t = -1 + this.field_C.field_b;
          }
        }
        if (this.field_d == 8) {
          this.field_t = 0;
        }
    }

    private final boolean g(byte param0) {
        if (param0 != 30) {
          this.field_o = 3;
        }
        return (lh.field_b.length - 1) * 500 > -jj.field_g ? true : false;
    }

    final void c(byte param0) {
        int var2;
        int var3;
        int var2Lifetime1;
        boolean decompiledFrameRemainder1 = true;
        boolean decompiledFrameRemainder0 = true;
        var3 = HostileSpawn.field_I ? 1 : 0;
        if (this.field_d != 16) {
          if (this.field_d != 1 &&
            this.field_d != 7) {
            if (6 != this.field_d) {
              if (this.field_d != 4) {
                if (2 == this.field_d &&
                  this.a((byte) -126) < 0) {
                  this.field_t = 1;
                  decompiledFrameRemainder0 = (var3 != 0);
                }
                if (decompiledFrameRemainder0) {
                  this.field_t = this.field_t + 1;
                  decompiledFrameRemainder0 = !(this.field_t < this.field_C.field_b);
                  if (decompiledFrameRemainder0) {
                    this.field_t = 0;
                    decompiledFrameRemainder0 = (var3 != 0);
                  }
                }
              }
              if ((decompiledFrameRemainder0) &&
                (this.field_C.field_b == 5)) {
                if (4 != this.field_t) {
                  var2 = 81 / ((77 - param0) / 45);
                  decompiledFrameRemainder1 = false;
                }
                else {
                  this.field_t = 3;
                  if (var3 != 0 &&
                    3 == this.field_C.field_b) {
                    this.field_t = 0;
                    this.field_t = 2;
                  }
                }
              }
            } else {
              if (3 == this.field_C.field_b) {
                this.field_t = 0;
                if (var3 != 0) {
                  this.field_t = 2;
                }
              }
            }
          }
        } else {
          this.field_t = 2;
        }
        if (decompiledFrameRemainder1) {
          var2Lifetime1 = 81 / ((77 - param0) / 45);
        }

    }

    private final void a(int param0, int param1, int param2, String param3, boolean param4, int param5) {
        String dupTemp$0 = null;
        int stackIn_11_0;
        int stackIn_11_1;
        boolean stackIn_11_2;
        nc stackIn_11_3;
        int stackIn_11_4;
        int stackIn_11_5;
        String stackIn_12_6;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        String var10_ref = null;
        int var11 = 0;
        String var12 = null;
        String var10_refLifetime1;
        try {
          if (param4) {
            si.a(60, param1 - 14, 520, 18, 16776960, 32);
          }
          var7_int = de.a(19926, 20, param0);
          if (param2 >= -114) {
            this.a(-24, 74, -79, 78, -101);
          }
          param0 = um.a(20, param0, 10179);
          var8 = de.a(19926, 11, param0);
          var9 = um.a(11, param0, 10179);
          var10 = null;
          var11 = bm.field_c;
          if (var8 >= 10) {
            var10_ref = ae.field_r;
          } else {
            var10_ref = kh.field_fb[var11][var8];
          }
          dupTemp$0 = var10_ref.toUpperCase();
          var12 = dupTemp$0;
          var10_refLifetime1 = dupTemp$0;
          if (param5 > 0) {
            stackIn_11_0 = 8;
            stackIn_11_1 = param1;
            stackIn_11_2 = false;
            stackIn_11_3 = al.field_Z;
            stackIn_11_4 = -16 + ce.field_b[0];
            stackIn_11_5 = 16776960;
            if (param5 >= 10) {
              stackIn_12_6 = "10";
            } else {
              stackIn_12_6 = "0" + param5;
            }
            ec.a(stackIn_11_0, stackIn_11_1, stackIn_11_2, stackIn_11_3, stackIn_11_4, stackIn_11_5, stackIn_12_6);
          }
          al.field_Z.c(param3, ce.field_b[0], param1, 16776960, -1);
          al.field_Z.c(t.field_k[var7_int].toUpperCase(), ce.field_b[1], param1, 16776960, -1);
          al.field_Z.c(var12, ce.field_b[2], param1, 16776960, -1);
          ec.a(9, param1, false, al.field_Z, ce.field_b[3], 16776960, Integer.toString(var9));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_17_0 = var7;
          stackIn_17_1 = new StringBuilder().append("re.KA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final void d(byte param0) {
        int var2;
        int var3;
        int var4;
        var4 = HostileSpawn.field_I ? 1 : 0;
        var2 = 108 / ((param0 - 33) / 53);
        var3 = this.field_d;
        if (var3 != 0 ||
          var4 != 0) {
          boolean decompiledFrameRemainder8 = true;
          boolean decompiledFrameRemainder7 = true;
          boolean decompiledFrameRemainder6 = true;
          boolean decompiledFrameRemainder5 = true;
          boolean decompiledFrameRemainder4 = true;
          boolean decompiledFrameRemainder3 = true;
          boolean decompiledFrameRemainder2 = true;
          boolean decompiledFrameRemainder1 = true;
          boolean decompiledFrameRemainder0 = true;
          if ((var3 != 1 ||
            var4 != 0) &&
            (decompiledFrameRemainder0 = (var3 != 7)) &&
            (decompiledFrameRemainder1 = (var3 != 2 ||
            var4 != 0)) &&
            (decompiledFrameRemainder2 = (var3 != 16)) &&
            (decompiledFrameRemainder3 = (var3 != 8)) &&
            (decompiledFrameRemainder4 = (var3 != 4)) &&
            (decompiledFrameRemainder5 = (var3 != 6 ||
            var4 != 0)) &&
            (decompiledFrameRemainder6 = (var3 != 5 ||
            var4 != 0)) &&
            (decompiledFrameRemainder8 = (17 == var3))) {
            decompiledFrameRemainder7 = (var4 != 0);
          }
          if ((decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3) &&
            (decompiledFrameRemainder2) &&
            (decompiledFrameRemainder1) &&
            (decompiledFrameRemainder0)) {
            this.field_f = 5;
            this.a((byte) -79, false);
            decompiledFrameRemainder8 = (var4 != 0);
          }
          if ((decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3) &&
            (decompiledFrameRemainder2) &&
            (decompiledFrameRemainder1)) {
            this.field_f = 6;
            this.a((byte) 117, false);
            decompiledFrameRemainder8 = (var4 != 0);
          }
          if ((decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3) &&
            (decompiledFrameRemainder2)) {
            this.field_f = 5;
            this.a((byte) 106, false);
            decompiledFrameRemainder8 = (var4 != 0);
          }
          if ((decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3)) {
            this.field_f = 5;
            this.a((byte) -59, false);
            decompiledFrameRemainder8 = (var4 != 0);
          }
          if (((decompiledFrameRemainder8) && (decompiledFrameRemainder7) && (decompiledFrameRemainder6) && (decompiledFrameRemainder5) && (decompiledFrameRemainder4)) &&
            (decompiledFrameRemainder8 = (u.field_f[7] == nl.field_f))) {
            this.field_f = 7;
            this.a((byte) -56, false);
            decompiledFrameRemainder8 = (var4 != 0);
          }
          if ((decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5)) {
            this.field_f = 5;
            this.a((byte) -33, false);
            decompiledFrameRemainder8 = (var4 != 0);
          }
          if ((decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6)) {
            this.field_f = 5;
            this.a((byte) 103, false);
            decompiledFrameRemainder8 = (var4 != 0);
          }
          if ((decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7)) {
            this.field_f = 1;
            this.a((byte) 104, false);
            decompiledFrameRemainder8 = (var4 != 0);
          }
          if (decompiledFrameRemainder8) {
            this.field_f = 5;
            this.a((byte) 125, false);
          }
        }
    }

    private final bd e(byte param0, int param1) {
        if (param0 != -44) {
          this.a(false);
        }
        int var3 = an.field_r[param1];
        bd var4 = new bd(128, 128);
        int[] var5 = new int[4];
        si.b(var5);
        var4.a();
        if (param1 >= 0) {
          qa.field_g[param1].e(16, 0);
        }
        if (var3 >= 0) {
          hh.field_a[var3].e(32, 48);
        }
        var4.e();
        o.field_n.b((byte) 121);
        si.a(var5);
        return var4;
    }

    private final void a(boolean param0) {
        le var3 = null;
        le var4 = null;
        le var5 = null;
        int var7 = 0;
        int var8 = 0;
        le var9 = null;
        int[] var13 = null;
        var8 = HostileSpawn.field_I ? 1 : 0;
        if (null != this.field_z) {
          return;
        }
        var9 = new le(0L, (le) null);
        if (param0) {
          this.a(-34, 19, 26, -62);
        }
        var3 = new le(0L, (le) null);
        var4 = new le(0L, (le) null);
        var5 = new le(0L, (le) null);
        var9.field_pb = nm.field_f.h();
        var13 = var9.field_pb.field_D;
        var7 = 0;
        while (var13.length > var7) {
          if (var8 != 0) {
            return;
          }
          if ((var13[var7] & 16711680) <= 1048576) {
            var13[var7] = 16776960;
          } else {
            var13[var7] = 0;
          }
          var7++;
        }
        if (null != var9.field_Y) {
          var3.field_Y = var9.field_Y.h();
          var3.field_Y.f();
        }
        var3.field_pb = var9.field_pb.h();
        var3.field_pb.f();
        var5.field_nb = oa.field_m;
        var9.field_pb = var9.field_pb.h();
        this.field_z = new pb(0L, var9, var3, var4, var5, false);
        return;
    }

    private final void e(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = HostileSpawn.field_I ? 1 : 0;
        if (param0 != 16777215) {
          this.k(38);
        }
        var3 = ec.a(bm.field_b, (byte) 19);
        if (var3 > 0) {
          var4 = -(16 * var3) + 320;
          var5 = 0;
          while (il.field_b.length > var5) {
            if (var6 != 0) {
              break;
            }
            if (hb.a(var5, bm.field_b, false)) {
              if (!(var4 <= j.field_c) ||
                !(param1 <= rb.field_m) ||
                !((var4 + 32) > j.field_c) ||
                !(rb.field_m < 32 + param1)) {
                fj.field_Kb[var5].b(var4, param1);
              } else {
                fj.field_Kb[var5].a(-6 + var4, param1 - 6, 44, 44);
                al.field_Z.b(il.field_b[var5].toUpperCase(), var4 + 16, -8 + param1, 16776960, -1);
                al.field_Z.b(bh.field_g[var5].toUpperCase(), 320, param1 + 50, 16777215, -1);
              }
              var4 += 32;
            }
            var5++;
          }
        }
    }

    private final void d(byte param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = HostileSpawn.field_I ? 1 : 0;
        var3 = 79 % ((-56 - param0) / 44);
        this.a((byte) 114, nl.field_f);
        var4 = -3 + (448 - dd.field_o[this.field_d].length * 30);
        var5 = -10 + (-99 + var4);
        if (~var5 != ~this.field_E.field_sb) {
          this.field_E.field_sb = var5;
          this.field_E.a(16, 0, (byte) -101);
        }
        if (ib.a((byte) -72)) {
          this.a(288, (byte) -55, 74, 57, 228);
          this.a(288, (byte) -55, 74, 290, 20);
          if (var6 != 0) {
            this.a(288, (byte) -55, 74, 57, 240);
          }
        } else {
          this.a(288, (byte) -55, 74, 57, 240);
        }
        if (rl.field_c < 0) {
          if (!ta.p(3)) {
            ul.field_O = false;
            if (var6 != 0) {
              this.a(138, (byte) -55, 74, 324, 235);
              nj.field_d[bm.field_c][rl.field_c].b(327, 77);
              this.a(146, (byte) -55, 216, 324, 235);
              this.a(146, (byte) -55, 216, 567, 20);
              if (null != this.field_G) {
                this.field_G.a(106, false);
              }
              ul.field_O = false;
            }
          }
        } else {
          this.a(138, (byte) -55, 74, 324, 235);
          nj.field_d[bm.field_c][rl.field_c].b(327, 77);
          this.a(146, (byte) -55, 216, 324, 235);
          this.a(146, (byte) -55, 216, 567, 20);
          if (null != this.field_G) {
            this.field_G.a(106, false);
          }
          ul.field_O = false;
        }
        if (ul.field_O) {
          this.a(70, (byte) -55, 74, 324, 235);
          al.field_Z.a(la.field_i.toUpperCase(), 334, 80, 215, 200, 16776960, -1, 0, 0, 16);
        }
        this.field_E.a(124, false);
    }

    private final void e(byte param0) {
        if (param0 != -29) {
          this.h(-58, -28);
        }
        if (this.field_d != 2) {
          ul.field_O = false;
          this.field_E = null;
          if ((HostileSpawn.field_I) &&
            (null == this.field_E)) {
            this.h((byte) 33);
          }
        } else {
          if (null == this.field_E) {
            this.h((byte) 33);
          }
        }
    }

    private final int a(byte param0) {
        int var5;
        int stackIn_5_0 = 0;
        int stackIn_19_0 = 0;
        bd[] stackIn_27_0 = null;
        int var2;
        int var3;
        int var4;
        var5 = HostileSpawn.field_I ? 1 : 0;
        if (10 == gn.field_k[0] &&
          null != this.field_w[0][10]) {
          stackIn_5_0 = 11;
        } else {
          stackIn_5_0 = 10;
        }
        var2 = stackIn_5_0;
        var3 = -9 % ((-59 - param0) / 46);
        var4 = 0;
        L3: while (true) {
          boolean decompiledFrameRemainder0 = true;
          if (var4 < var2) {
            stackIn_27_0 = this.field_w[0][var4].field_nb;
            if (var5 != 0) {
              if (stackIn_27_0 == null) {
                var3++;
                break L3;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              if (stackIn_27_0 != null) {
                return var4;
              }
              var4++;
              continue;
            }
          }
          if (decompiledFrameRemainder0) {
            if (!ib.a((byte) -72)) {
              break L3;
            }
            if (gn.field_k[1] == 10 &&
              null != this.field_w[1][10]) {
              stackIn_19_0 = 11;
            } else {
              stackIn_19_0 = 10;
            }
            var2 = stackIn_19_0;
            var3 = 0;
            while (true) {
              if (var2 <= var3) {
                break L3;
              }
              if (this.field_w[1][var3].field_nb != null) {
                break;
              }
              var3++;
              if (var5 == 0) {
                continue;
              }
              break L3;
            }
          }
          return 32 | var3;

        }
        return -1;
    }

    private final void e(int param0) {
        boolean stackIn_17_0 = false;
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        boolean stackIn_33_0 = false;
        int stackIn_37_0 = 0;
        boolean stackIn_40_0 = false;
        int stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        boolean stackOut_16_0;
        boolean stackOut_32_0;
        boolean stackOut_39_0;
        le var3 = null;
        le var4 = null;
        le var5 = null;
        le var6 = null;
        le var7 = null;
        le var8 = null;
        le var9 = null;
        le var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15_ref_int__ = null;
        int var15 = 0;
        int[] var16_ref_int__ = null;
        int var16 = 0;
        int[] var17_ref_int__ = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int[] var24 = null;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        le var29 = null;
        int var30 = 0;
        int[] var31 = null;
        int[] var32 = null;
        pb var33 = null;
        int[] var34 = null;
        int[] var35 = null;
        int[] var36 = null;
        int[] var38 = null;
        int[] var40 = null;
        int[] var41 = null;
        int[] var42 = null;
        int[] var44 = null;
        int[] var48 = null;
        int[] var49 = null;
        int stackIn_37_0Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var12Lifetime2;
        int var13Lifetime1;
        int var18Lifetime1;
        int var18Lifetime2;
        int var18Lifetime3;
        int var19Lifetime1;
        int var19Lifetime2;
        int var20Lifetime1;
        var30 = HostileSpawn.field_I ? 1 : 0;
        var5 = new le(0L, (le) null);
        var6 = new le(0L, (le) null);
        var7 = new le(0L, (le) null);
        var8 = new le(0L, (le) null);
        var33 = new pb(0L, var5, var6, var7, var8, false);
        var3 = new le(0L, (le) null);
        var4 = new le(0L, (le) null);
        this.field_F = new th(0L, var3, var4, var33);
        this.field_F.field_zb = 299;
        this.field_F.field_sb = 115;
        this.field_F.field_qb = 568;
        this.field_F.field_tb = 36;
        var9 = this.field_F.field_Kb;
        var9.field_qb = 576;
        var9.field_sb = 128;
        var10 = this.field_F.field_Ib;
        var11 = 32;
        var12 = 32;
        var13 = 0;
        var14 = ib.a((byte) -72) ? 1 : 0;
        if (hb.a(31, uk.field_c, false)) {
          var40 = e.field_y;
          var34 = var40;
          var15_ref_int__ = var34;
          var15_ref_int__[0] = ua.a(var40[0], -1073741825);
        }
        boolean decompiledFrameCompleted1 = true;
        var15 = 48;
        mc.field_E = nf.a(false);
        kf.a(e.field_y, 0, mc.field_E, 0, mc.field_E.length);
        if (var14 == 0) {
          var41 = mc.field_E;
          var35 = var41;
          var31 = var35;
          var16_ref_int__ = var31;
          var42 = e.field_w;
          var36 = var42;
          var32 = var36;
          var17_ref_int__ = var32;
          var18 = 0;
          while (8 > var18) {
            var31[var18] = ll.a(var41[var18], var42[var18]);
            var18++;
            if (var30 != 0) {
              decompiledFrameCompleted1 = false;
              break;
            }
          }
        }
        if (decompiledFrameCompleted1) {
          var16_ref_int__ = mc.field_E;
          var17_ref_int__ = uk.field_c;
        }
        var18Lifetime1 = 0;
        while (8 > var18Lifetime1) {
          var16_ref_int__[var18Lifetime1] = ua.a(var16_ref_int__[var18Lifetime1], ~var17_ref_int__[var18Lifetime1]);
          var18Lifetime1++;
          if (var30 == 0) {
            continue;
          }
          break;
        }
        boolean decompiledFrameCompleted0 = true;
        var16 = var14;
        if (var16 == 0) {
          var48 = lh.field_b[1];
          var18Lifetime2 = 0;
          while (var18Lifetime2 < var48.length) {
            var19 = var48[var18Lifetime2];
            stackOut_16_0 = qa.a(mc.field_E, var19, true);
            stackIn_23_0 = stackOut_16_0 ? 1 : 0;
            stackIn_17_0 = stackOut_16_0;
            if (var30 != 0) {
              decompiledFrameCompleted0 = false;
              break;
            }
            if (stackIn_17_0) {
              var16 = 1;
              break;
            }
            var18Lifetime2++;
          }
        }
        if (decompiledFrameCompleted0) {
          stackIn_23_0 = 114 % ((param0 - 71) / 49);
        }
        var17 = stackIn_23_0;
        var18Lifetime3 = 42 - ec.a(mc.field_E, (byte) 19);
        var19Lifetime1 = (1 + var18Lifetime3) / 2;
        var10.field_sb = 92;
        var10.field_qb = var15 * var19Lifetime1 + 64;
        var10.field_I = null;
        var11Lifetime1 = 76;
        var20 = 0;
        var12Lifetime1 = var11Lifetime1;
        var21 = 0;
        var22 = lh.field_b.length;
        var23 = 0;
        while (true) {
          stackIn_25_0 = ~var23;
          boolean decompiledFrameRemainder0 = true;
          if (stackIn_25_0 > ~var22) {
            stackIn_52_0 = -2;
            stackIn_52_1 = ~var23;
            decompiledFrameRemainder0 = (var30 == 0);
            if (decompiledFrameRemainder0) {
              if (stackIn_52_0 == stackIn_52_1) {
                var15 = 40;
              }
              var44 = lh.field_b[var23];
              var38 = var44;
              var24 = var38;
              var25 = 0;
              var26 = 0;
              while (var44.length > var26) {
                stackOut_32_0 = qa.a(mc.field_E, var44[var26], true);
                stackIn_37_0 = stackOut_32_0 ? 1 : 0;
                stackIn_33_0 = stackOut_32_0;
                if (stackIn_33_0) {
                  var25++;
                }
                var26++;
              }
              var13Lifetime1 = 0;
              var12Lifetime2 = var11Lifetime1;
              var19Lifetime2 = (1 + var25) / 2;
              stackIn_37_0Lifetime1 = 0;
              var20Lifetime1 = stackIn_37_0Lifetime1;
              var49 = var24;
              var27 = 0;
              while (var49.length > var27) {
                var28 = var49[var27];
                this.field_b[var28] = null;
                stackOut_39_0 = hb.a(var28, mc.field_E, false);
                stackIn_25_0 = stackOut_39_0 ? 1 : 0;
                stackIn_40_0 = stackOut_39_0;
                if (!stackIn_40_0 ||
                  var30 != 0) {
                  var29 = new le(0L, (le) null);
                  this.field_b[var28] = var29;
                  var29.field_Y = new bd(38, 38);
                  var29.field_sb = var29.field_Y.field_z;
                  var29.field_qb = var29.field_Y.field_z;
                  var29.field_zb = var13Lifetime1;
                  var29.field_tb = var12Lifetime2;
                  if (var21 < var12Lifetime2) {
                    var21 = var12Lifetime2;
                  }
                  var10.a(false, var29);
                  var20Lifetime1++;
                  var12Lifetime2 = var12Lifetime2 + var15;
                  if (var19Lifetime2 == var20Lifetime1) {
                    var13Lifetime1 += 40;
                    var12Lifetime2 = var11Lifetime1 + var15 * (var25 & 1) / 2;
                  }
                }
                var27++;
              }
              var11Lifetime1 += 468;
              var23++;
              continue;
            }
          }
          if (decompiledFrameRemainder0) {
            var10.field_qb = var21 + 64;
            stackIn_52_0 = 500;
            stackIn_52_1 = var21;
          }
          if (stackIn_52_0 < stackIn_52_1) {
            dd.field_o[6] = ak.field_c;
            if (this.field_d == 6) {
              this.field_C.field_b = dd.field_o[this.field_d].length;
            }
          }
          o.field_n.b((byte) 123);
          this.field_F.a(16, 0, (byte) -105);
          this.field_F.a(true, true);
          return;
        }
    }

    private final void j(byte param0) {
        StringBuilder discarded$1 = null;
        Object var2;
        String var2_ref;
        int var3;
        StringBuilder var4;
        String var5;
        this.a((byte) 121, jf.field_a);
        var2 = null;
        if (om.field_b &&
          ~fg.field_c[bm.field_c] == ~rl.field_c) {
          var2_ref = f.field_a[bm.field_c][10];
        } else {
          var2_ref = f.field_a[bm.field_c][rl.field_c];
        }
        var3 = 10;
        this.a(275, (byte) -55, 86, 57, 2 * var3 + 270);
        var4 = new StringBuilder(32);
        StringBuilder discarded$0 = var4.append(mc.field_J);
        if (rl.field_c < 9) {
          discarded$1 = var4.append('0');
        }
        StringBuilder discarded$2 = var4.append(rl.field_c + 1);
        StringBuilder discarded$3 = var4.append(" <col=ffffff>");
        StringBuilder discarded$4 = var4.append(kh.field_fb[bm.field_c][rl.field_c].toUpperCase());
        StringBuilder discarded$5 = var4.append("</col>");
        if (param0 != 84) {
          this.j((byte) 35);
        }
        wh.field_d.c(var4.toString(), 67, 110, 16776960, -1);
        if (var2_ref != null) {
          var5 = var2_ref.toUpperCase();
          al.field_Z.a(var5, 67, 120, 270, 210, 16776960, -1, 0, 0, 14);
        }
        this.a(138, (byte) -55, 86, 353, 235);
        nj.field_d[bm.field_c][rl.field_c].b(356, 89);
        this.a(131, (byte) -55, 230, 353, 235);
        this.a(235, 230, (byte) 56, 353, 131);
    }

    private final void c(boolean param0) {
        int stackIn_16_0 = 0;
        Object stackIn_26_0;
        int stackIn_26_1;
        int stackIn_26_2;
        int stackIn_26_3;
        String stackIn_26_4;
        Object stackIn_27_0;
        boolean stackIn_27_5;
        String stackIn_38_0 = null;
        Object var2;
        String var3;
        String var4;
        Object var4_ref;
        String[] var5;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        vh var13;
        ic var14;
        ic var15;
        int[] var19;
        String var4Lifetime1;
        String var4Lifetime2;
        var12 = HostileSpawn.field_I ? 1 : 0;
        var2 = null;
        if (param0) {
          var13 = (vh) null;
          re.a(-52, (vh) null, -73, -122, 75, (vh) null);
        }
        var3 = q.field_m[bm.field_c];
        var4 = var3;
        var4Lifetime1 = var3;
        this.a((byte) -36, var3.toUpperCase());
        if (ta.p(3)) {
          wh.field_d.a(kh.field_X.toUpperCase(), 64, 200, 512, 100, 16776960, -1, 1, 0, wh.field_d.field_y + wh.field_d.field_F);
          al.field_Z.a(u.field_a.toUpperCase(), 64, 345, 512, 1000, 16776960, -1, 1, 0, wh.field_d.field_F + wh.field_d.field_y);
          hm.a(576, ul.field_J, false, 30, 353, 32);
          return;
        }
        var4_ref = null;
        if (null == p.field_m[bm.field_c]) {
          p.field_m[bm.field_c] = pi.a(10, 6413, 3, ka.field_p[bm.field_c], 1);
        }
        L3: {
          L4: {
            var14 = p.field_m[bm.field_c];
            var15 = var14;
            if (var15.field_m) {
              if (null != var15.field_l) {
                var4Lifetime2 = kh.field_X;
                var5 = var14.field_p[ue.field_e];
                var19 = var14.field_l[ue.field_e];
                var7 = fg.a(var15, ue.field_e, false, ch.field_h);
                var8 = 18;
                if (null != ch.field_h &&
                  var15.field_j == ch.field_h.field_t &&
                  var7 < 0) {
                  stackIn_16_0 = 1;
                } else {
                  stackIn_16_0 = 0;
                }
                var9 = stackIn_16_0;
                if (var9 == 0) {
                  var8 += 2;
                }
                var10 = 90;
                this.a(244, (byte) -55, 90, 56, 528);
                var10 += 16;
                al.field_Z.c(ii.field_f[0].toUpperCase(), ce.field_b[0], var10, 16776960, -1);
                al.field_Z.c(ii.field_f[1].toUpperCase(), ce.field_b[1], var10, 16776960, -1);
                al.field_Z.c(ii.field_f[2].toUpperCase(), ce.field_b[2], var10, 16776960, -1);
                al.field_Z.a(ii.field_f[3].toUpperCase(), ce.field_b[3], var10, 16776960, -1);
                var10 += 6;
                var10 += 18;
                var11 = 0;
                while (10 > var11) {
                  stackIn_38_0 = var5[var11];
                  if (var12 != 0) {
                    break L3;
                  }
                  if (stackIn_38_0 != null) {
                    stackIn_26_0 = this;
                    stackIn_26_1 = var19[var11];
                    stackIn_26_2 = var10;
                    stackIn_26_3 = -128;
                    stackIn_26_4 = var5[var11].toUpperCase();
                    if (var7 != var11) {
                      stackIn_27_0 = this;
                      stackIn_27_5 = false;
                    } else {
                      stackIn_27_0 = this;
                      stackIn_27_5 = true;
                    }
                    this.a(stackIn_26_1, stackIn_26_2, stackIn_26_3, stackIn_26_4, stackIn_27_5, var11 + 1);
                    var4Lifetime2 = "";
                  }
                  var10 = var10 + var8;
                  var11++;
                }
                if ((var9 != 0)) {
                  this.a(tf.field_a, 8 + var10, -126, qg.field_r.toUpperCase(), true, -1);
                }
                break L4;
              }
              var4Lifetime2 = ci.field_c;
            } else {
              var4Lifetime2 = jf.field_h;
            }
          }
          if (var4Lifetime2 != null &&
            var4Lifetime2.length() > 0) {
            this.a(26, (byte) -55, 174, 56, 528);
            al.field_Z.b(var4Lifetime2.toUpperCase(), 320, 193, 16776960, -1);
          }
          this.a(30, (byte) -55, 360, 56, 528);
          wh.field_d.b(pl.field_a.toUpperCase(), 320, 383, 16776960, -1);
          if (ta.p(3)) {
            return;
          }
          stackIn_38_0 = var4Lifetime2;
        }
        if (stackIn_38_0 != kh.field_X &&
          var15 != null &&
          p.field_m[bm.field_c].field_m &&
          var15.field_l != null &&
          var14.field_l[ue.field_e] != null &&
          var14.field_l[ue.field_e].length == 0) {
          return;
        }
        return;
    }

    private final boolean c(int param0) {
        if (param0 != 24834) {
          this.field_g = -26;
        }
        return -jj.field_g > 0 ? true : false;
    }

    private final void a(byte param0, boolean param1) {
        int stackIn_115_0 = 0;
        int[][] stackIn_151_0 = null;
        int stackIn_151_1 = 0;
        int[] stackIn_152_2 = null;
        boolean stackIn_156_0 = false;
        boolean stackIn_159_1 = false;
        int stackIn_188_0 = 0;
        int var3 = 0;
        ic[] var3_ref_ic__ = null;
        int var4_int = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        var7 = HostileSpawn.field_I ? 1 : 0;
        if (this.field_j > 0) {
          return;
        }
        boolean decompiledFrameRemainder23 = true;
        L1: {
          boolean decompiledFrameCompleted1 = true;
          boolean decompiledFrameRemainder22 = true;
          boolean decompiledFrameRemainder21 = true;
          var4_int = this.field_f;
          if ((var4_int != 29) &&
            (decompiledFrameRemainder22 = (var4_int != 0)) &&
            (decompiledFrameRemainder22 = (27 != var4_int))) {
            boolean decompiledFrameRemainder20 = true;
            boolean decompiledFrameRemainder19 = true;
            boolean decompiledFrameRemainder18 = true;
            if (var4_int == 3) {
              this.field_v = 0;
              this.field_j = 1;
              this.field_s = 1;
              si.d(0, 0, 0, 0);
              this.field_g = this.b((byte) 82, 0);
              si.c();
              this.g(12169);
              if (param1) {
                break L1;
              }
              this.field_t = 0;
              if (var7 == 0) {
                break L1;
              }
            } else {
              if ((var4_int != 22 ||
                var7 != 0) &&
                (decompiledFrameRemainder18 = (6 != var4_int)) &&
                (decompiledFrameRemainder19 = (2 != var4_int)) &&
                (decompiledFrameRemainder20 = (var4_int != 32)) &&
                (decompiledFrameRemainder20 = (var4_int != 24 ||
                var7 != 0))) {
                boolean decompiledFrameRemainder17 = true;
                boolean decompiledFrameRemainder16 = true;
                boolean decompiledFrameRemainder15 = true;
                boolean decompiledFrameRemainder14 = true;
                boolean decompiledFrameRemainder13 = true;
                boolean decompiledFrameRemainder12 = true;
                boolean decompiledFrameRemainder11 = true;
                boolean decompiledFrameRemainder10 = true;
                boolean decompiledFrameRemainder9 = true;
                boolean decompiledFrameRemainder8 = true;
                boolean decompiledFrameRemainder7 = true;
                boolean decompiledFrameRemainder6 = true;
                boolean decompiledFrameRemainder5 = true;
                boolean decompiledFrameRemainder4 = true;
                boolean decompiledFrameRemainder3 = true;
                boolean decompiledFrameRemainder2 = true;
                if (var4_int == 25 &&
                  var7 == 0) {
                  this.field_s = 8;
                  this.field_j = 1;
                  if (!(param1)) {
                    this.field_t = 0;
                  }
                  break L1;
                } else if (5 != var4_int ||
                  var7 != 0) {
                  decompiledFrameRemainder2 = (var4_int != 1 ||
                    var7 != 0);
                  if ((decompiledFrameRemainder2) &&
                    (decompiledFrameRemainder3 = (7 != var4_int ||
                    var7 != 0)) &&
                    (decompiledFrameRemainder4 = (var4_int != 28 ||
                    var7 != 0)) &&
                    (decompiledFrameRemainder5 = (30 != var4_int)) &&
                    (decompiledFrameRemainder6 = (31 != var4_int)) &&
                    (decompiledFrameRemainder7 = (var4_int != 26 ||
                    var7 != 0)) &&
                    (decompiledFrameRemainder8 = (var4_int != 12 ||
                    var7 != 0)) &&
                    (decompiledFrameRemainder9 = (var4_int != 13 ||
                    var7 != 0)) &&
                    (decompiledFrameRemainder10 = (var4_int != 4)) &&
                    (decompiledFrameRemainder11 = (var4_int != 14 ||
                    var7 != 0)) &&
                    (decompiledFrameRemainder12 = (var4_int != 11)) &&
                    (decompiledFrameRemainder13 = (var4_int != 8 ||
                    var7 != 0)) &&
                    (decompiledFrameRemainder14 = (var4_int != 10 ||
                    var7 != 0)) &&
                    (decompiledFrameRemainder15 = (var4_int != 9)) &&
                    (decompiledFrameRemainder16 = (var4_int != 15 ||
                    var7 != 0)) &&
                    (decompiledFrameRemainder17 = (var4_int != 16))) {
                    boolean decompiledFrameRemainder1 = true;
                    if (var4_int != 33) {
                      if (var4_int != 18 ||
                        var7 != 0) {
                        if (var4_int != 17) {
                          break L1;
                        }
                        decompiledFrameRemainder1 = (var7 != 0);
                        decompiledFrameRemainder21 = !(decompiledFrameRemainder1);
                      }
                    } else {
                      this.field_j = 1;
                      this.field_s = 17;
                      if (var7 == 0) {
                        break L1;
                      }
                    }
                    if ((decompiledFrameRemainder21) &&
                      (decompiledFrameRemainder1)) {
                      if (this.field_d != 6) {
                        break L1;
                      }
                      if (!this.g((byte) 30)) {
                        break L1;
                      }
                      jj.field_g = jj.field_g - 500;
                      if (var7 == 0) {
                        break L1;
                      }
                    }
                    if (decompiledFrameRemainder21) {
                      if (((this.field_d == 6)) &&
                        (!(!this.c(24834)))) {
                        jj.field_g = jj.field_g + 500;
                      }
                      break L1;
                    }
                  }
                }
                if ((decompiledFrameRemainder21) &&
                  (decompiledFrameRemainder17) &&
                  (decompiledFrameRemainder16) &&
                  (decompiledFrameRemainder15) &&
                  (decompiledFrameRemainder14) &&
                  (decompiledFrameRemainder13) &&
                  (decompiledFrameRemainder12) &&
                  (decompiledFrameRemainder11) &&
                  (decompiledFrameRemainder10) &&
                  (decompiledFrameRemainder9) &&
                  (decompiledFrameRemainder8) &&
                  (decompiledFrameRemainder7) &&
                  (decompiledFrameRemainder6) &&
                  (decompiledFrameRemainder5) &&
                  (decompiledFrameRemainder4) &&
                  (decompiledFrameRemainder3) &&
                  (decompiledFrameRemainder2)) {
                  if (!param1) {
                    this.field_t = 0;
                    if (this.field_d == 1) {
                      this.field_t = 1;
                    }
                    if (this.field_d == 4) {
                      this.field_t = 5;
                    }
                    if (this.field_d == 6) {
                      this.field_t = 6;
                    }
                  }
                  this.field_j = 1;
                  this.field_s = 0;
                  if (((1 == jh.field_ab)) &&
                    ((this.field_d == 2))) {
                    db.a(true, 256, vg.field_h);
                  }
                  break L1;
                }
                if ((decompiledFrameRemainder21) &&
                  (decompiledFrameRemainder17) &&
                  (decompiledFrameRemainder16) &&
                  (decompiledFrameRemainder15) &&
                  (decompiledFrameRemainder14) &&
                  (decompiledFrameRemainder13) &&
                  (decompiledFrameRemainder12) &&
                  (decompiledFrameRemainder11) &&
                  (decompiledFrameRemainder10) &&
                  (decompiledFrameRemainder9) &&
                  (decompiledFrameRemainder8) &&
                  (decompiledFrameRemainder7) &&
                  (decompiledFrameRemainder6) &&
                  (decompiledFrameRemainder5) &&
                  (decompiledFrameRemainder4) &&
                  (decompiledFrameRemainder3)) {
                  mc.field_I = 1;
                  of.field_h = null;
                  hg.field_e = 1;
                  jf.field_c = 128;
                  if (var7 == 0) {
                    break L1;
                  }
                }
                if ((decompiledFrameRemainder21) &&
                  (decompiledFrameRemainder17) &&
                  (decompiledFrameRemainder16) &&
                  (decompiledFrameRemainder15) &&
                  (decompiledFrameRemainder14) &&
                  (decompiledFrameRemainder13) &&
                  (decompiledFrameRemainder12) &&
                  (decompiledFrameRemainder11) &&
                  (decompiledFrameRemainder10) &&
                  (decompiledFrameRemainder9) &&
                  (decompiledFrameRemainder8) &&
                  (decompiledFrameRemainder7) &&
                  (decompiledFrameRemainder6) &&
                  (decompiledFrameRemainder5) &&
                  (decompiledFrameRemainder4)) {
                  this.field_s = 10;
                  u.field_f[26] = jh.field_bb;
                  this.field_j = 1;
                  stackIn_151_0 = dd.field_o;
                  stackIn_151_1 = 10;
                  if (om.field_b) {
                    stackIn_152_2 = nm.field_c;
                  } else {
                    stackIn_152_2 = ja.field_h;
                  }
                  stackIn_151_0[stackIn_151_1] = stackIn_152_2;
                  if (ta.p(3)) {
                    stackIn_156_0 = (w.field_r != 0);
                    stackIn_159_1 = !(ei.field_q.e(-20049));
                    if (wb.a(stackIn_156_0, stackIn_159_1, false, rg.a((byte) -51)) != null) {
                      this.field_s = 9;
                    }
                  }
                  if (!param1) {
                    this.field_t = 0;
                  }
                  if (rl.field_c == hh.field_d &&
                    this.field_d == 8) {
                    this.field_s = 2;
                  }
                  if (jh.field_ab != 1) {
                    break L1;
                  }
                  if (this.field_s != 10) {
                    break L1;
                  }
                  db.a(false, 256, pe.field_ab);
                  if (var7 == 0) {
                    break L1;
                  }
                }
                if ((decompiledFrameRemainder21) &&
                  (decompiledFrameRemainder17) &&
                  (decompiledFrameRemainder16) &&
                  (decompiledFrameRemainder15) &&
                  (decompiledFrameRemainder14) &&
                  (decompiledFrameRemainder13) &&
                  (decompiledFrameRemainder12) &&
                  (decompiledFrameRemainder11) &&
                  (decompiledFrameRemainder10) &&
                  (decompiledFrameRemainder9) &&
                  (decompiledFrameRemainder8) &&
                  (decompiledFrameRemainder7) &&
                  (decompiledFrameRemainder6) &&
                  (decompiledFrameRemainder5)) {
                  bm.field_c = 1 - bm.field_c;
                  this.h((byte) 33);
                  if (var7 == 0) {
                    break L1;
                  }
                }
                if ((decompiledFrameRemainder21) &&
                  (decompiledFrameRemainder17) &&
                  (decompiledFrameRemainder16) &&
                  (decompiledFrameRemainder15) &&
                  (decompiledFrameRemainder14) &&
                  (decompiledFrameRemainder13) &&
                  (decompiledFrameRemainder12) &&
                  (decompiledFrameRemainder11) &&
                  (decompiledFrameRemainder10) &&
                  (decompiledFrameRemainder9) &&
                  (decompiledFrameRemainder8) &&
                  (decompiledFrameRemainder7) &&
                  (decompiledFrameRemainder6)) {
                  if (this.field_d != 4) {
                    bm.field_c = 0;
                    this.h((byte) 33);
                    this.field_s = 2;
                    this.field_j = 1;
                    if (var7 == 0) {
                      break L1;
                    }
                  }
                  bm.field_c = 0;
                  this.h((byte) 33);
                  this.field_s = 4;
                  this.field_j = 1;
                  if (var7 == 0) {
                    break L1;
                  }
                }
                if ((decompiledFrameRemainder21) &&
                  (decompiledFrameRemainder17) &&
                  (decompiledFrameRemainder16) &&
                  (decompiledFrameRemainder15) &&
                  (decompiledFrameRemainder14) &&
                  (decompiledFrameRemainder13) &&
                  (decompiledFrameRemainder12) &&
                  (decompiledFrameRemainder11) &&
                  (decompiledFrameRemainder10) &&
                  (decompiledFrameRemainder9) &&
                  (decompiledFrameRemainder8) &&
                  (decompiledFrameRemainder7)) {
                  bm.field_c = 1;
                  this.h((byte) 33);
                  this.field_j = 1;
                  if (this.field_d != 4) {
                    this.field_s = 2;
                    if (var7 == 0) {
                      break L1;
                    }
                  }
                  this.field_s = 4;
                  if (var7 == 0) {
                    break L1;
                  }
                }
                if ((decompiledFrameRemainder21) &&
                  (decompiledFrameRemainder17) &&
                  (decompiledFrameRemainder16) &&
                  (decompiledFrameRemainder15) &&
                  (decompiledFrameRemainder14) &&
                  (decompiledFrameRemainder13) &&
                  (decompiledFrameRemainder12) &&
                  (decompiledFrameRemainder11) &&
                  (decompiledFrameRemainder10) &&
                  (decompiledFrameRemainder9) &&
                  (decompiledFrameRemainder8)) {
                  kh.field_ab.a(0);
                  this.field_j = 1;
                  this.field_s = 0;
                  if (w.field_r > 0) {
                    if (13 != this.field_d) {
                      stackIn_188_0 = rl.field_c;
                    } else {
                      stackIn_188_0 = 10;
                    }
                    var4_int = stackIn_188_0;
                    ib.a(bm.field_c, w.field_r, var4_int, 102);
                    this.field_s = 4;
                  }
                  if (this.field_s != 0) {
                  }
                  if (1 != jh.field_ab) {
                    break L1;
                  }
                  ja.a((byte) 103, vg.field_h, true);
                  if (var7 == 0) {
                    break L1;
                  }
                }
                if ((decompiledFrameRemainder21) &&
                  (decompiledFrameRemainder17) &&
                  (decompiledFrameRemainder16) &&
                  (decompiledFrameRemainder15) &&
                  (decompiledFrameRemainder14) &&
                  (decompiledFrameRemainder13) &&
                  (decompiledFrameRemainder12) &&
                  (decompiledFrameRemainder11) &&
                  (decompiledFrameRemainder10) &&
                  (decompiledFrameRemainder9)) {
                  if (!param1) {
                    break L1;
                  }
                  var4_int = 64 * this.field_m / 160;
                  if (var4_int < 0) {
                    var4_int = 0;
                  }
                  if (var4_int > 64) {
                    var4_int = 64;
                  }
                  uh.field_i = var4_int;
                  ed.a(var4_int, (byte) -49);
                  if (var7 == 0) {
                    break L1;
                  }
                }
                if ((decompiledFrameRemainder21) &&
                  (decompiledFrameRemainder17) &&
                  (decompiledFrameRemainder16) &&
                  (decompiledFrameRemainder15) &&
                  (decompiledFrameRemainder14) &&
                  (decompiledFrameRemainder13) &&
                  (decompiledFrameRemainder12) &&
                  (decompiledFrameRemainder11) &&
                  (decompiledFrameRemainder10)) {
                  if (!param1) {
                    break L1;
                  }
                  var4_int = this.field_m * 256 / 160;
                  if (var4_int < 0) {
                    var4_int = 0;
                  }
                  if (256 < var4_int) {
                    var4_int = 256;
                  }
                  qg.field_p = var4_int;
                  qi.b(var4_int, (byte) -90);
                  if (var7 == 0) {
                    break L1;
                  }
                }
                if ((decompiledFrameRemainder21) &&
                  (decompiledFrameRemainder17) &&
                  (decompiledFrameRemainder16) &&
                  (decompiledFrameRemainder15) &&
                  (decompiledFrameRemainder14) &&
                  (decompiledFrameRemainder13) &&
                  (decompiledFrameRemainder12) &&
                  (decompiledFrameRemainder11)) {
                  ri.field_o = true;
                  if (var7 == 0) {
                    break L1;
                  }
                }
                if ((decompiledFrameRemainder21) &&
                  (decompiledFrameRemainder17) &&
                  (decompiledFrameRemainder16) &&
                  (decompiledFrameRemainder15) &&
                  (decompiledFrameRemainder14) &&
                  (decompiledFrameRemainder13) &&
                  (decompiledFrameRemainder12)) {
                  this.field_j = 1;
                  this.field_x = -1;
                  this.field_s = 6;
                  if (param1) {
                    var3 = -3 % ((45 - param0) / 55);
                    decompiledFrameRemainder23 = false;
                  }
                  else {
                    if (ta.p(3)) {
                      this.field_t = 1;
                      if (var7 == 0) {
                        break L1;
                      }
                    }
                    this.field_t = 0;
                    if (var7 == 0) {
                      break L1;
                    }
                  }
                }
                if ((decompiledFrameRemainder23) &&
                  (decompiledFrameRemainder21) &&
                  (decompiledFrameRemainder17) &&
                  (decompiledFrameRemainder16) &&
                  (decompiledFrameRemainder15) &&
                  (decompiledFrameRemainder14) &&
                  (decompiledFrameRemainder13)) {
                  if (wa.field_q != null) {
                    tb.f((byte) -119);
                  }
                  dc.a(76, bn.c(-1));
                  if (var7 == 0) {
                    break L1;
                  }
                }
                if ((decompiledFrameRemainder23) &&
                  (decompiledFrameRemainder21) &&
                  (decompiledFrameRemainder17) &&
                  (decompiledFrameRemainder16) &&
                  (decompiledFrameRemainder15) &&
                  (decompiledFrameRemainder14)) {
                  ue.field_e = 0;
                  if (var7 == 0) {
                    break L1;
                  }
                }
                if ((decompiledFrameRemainder23) &&
                  (decompiledFrameRemainder21) &&
                  (decompiledFrameRemainder17) &&
                  (decompiledFrameRemainder16) &&
                  (decompiledFrameRemainder15)) {
                  ue.field_e = 2;
                  if (var7 == 0) {
                    break L1;
                  }
                }
                if ((decompiledFrameRemainder23) &&
                  (decompiledFrameRemainder21) &&
                  (decompiledFrameRemainder17) &&
                  (decompiledFrameRemainder16)) {
                  ue.field_e = 1;
                  if (var7 == 0) {
                    break L1;
                  }
                }
                if ((decompiledFrameRemainder23) &&
                  (decompiledFrameRemainder21) &&
                  (decompiledFrameRemainder17)) {
                  mn.c((byte) 67);
                  this.field_F = null;
                  wl.field_b = true;
                  if (var7 == 0) {
                    break L1;
                  }
                }
                if ((decompiledFrameRemainder23) &&
                  (decompiledFrameRemainder21)) {
                  if (jh.field_ab == 1) {
                    db.a(true, 256, vg.field_h);
                  }
                  qb.field_k = qb.field_k + w.field_r;
                  w.field_r = 0;
                  var16 = bm.field_b;
                  var13 = var16;
                  var10 = var13;
                  var4 = var10;
                  var5 = 0;
                  do {
                    if (var5 >= 8) {
                      var4 = uk.field_c;
                      break;
                    }
                    var16[var5] = 0;
                    var5++;
                  } while (var7 == 0);
                  var5 = 0;
                  while (var5 < 8) {
                    var4[var5] = 0;
                    var5++;
                    if (var7 != 0) {
                      decompiledFrameCompleted1 = false;
                      break;
                    }
                  }
                  if (decompiledFrameCompleted1) {
                    this.field_j = 1;
                    gn.field_k[0] = 0;
                    this.field_s = 0;
                    break L1;
                  }
                }
              }
            }
            if ((decompiledFrameRemainder23) &&
              (decompiledFrameRemainder21) &&
              (decompiledFrameRemainder20) &&
              (decompiledFrameRemainder19) &&
              (decompiledFrameRemainder18) &&
              (decompiledFrameCompleted1)) {
              this.field_v = 0;
              this.field_s = 7;
              this.field_j = 1;
              si.d(0, 0, 0, 0);
              this.field_g = this.b((byte) 82, 0);
              si.c();
              this.g(12169);
              if (param1) {
                break L1;
              }
              this.field_t = 0;
              if (var7 == 0) {
                break L1;
              }
            }
            if ((decompiledFrameRemainder23) &&
              (decompiledFrameRemainder21) &&
              (decompiledFrameRemainder20) &&
              (decompiledFrameRemainder19) &&
              (decompiledFrameCompleted1)) {
              if (!param1) {
                this.field_t = 0;
                if (this.field_d == 7) {
                  this.field_t = 1;
                }
              }
              this.field_j = 1;
              this.field_s = 5;
              if (var7 == 0) {
                break L1;
              }
            }
            if ((decompiledFrameRemainder23) &&
              (decompiledFrameRemainder21) &&
              (decompiledFrameRemainder20) &&
              (decompiledFrameCompleted1)) {
              this.field_j = 1;
              this.field_s = 4;
              if (ta.p(3)) {
                this.field_t = 1;
                if (var7 == 0) {
                  break L1;
                }
              }
              this.field_t = 3;
              if (var7 == 0) {
                break L1;
              }
            }
            if ((decompiledFrameRemainder23) &&
              (decompiledFrameRemainder21) &&
              (decompiledFrameCompleted1)) {
              boolean decompiledFrameRemainder0 = true;
              boolean decompiledFrameCompleted0 = true;
              if (this.field_f == 32) {
                var15 = bm.field_b;
                var12 = var15;
                var9 = var12;
                var4 = var9;
                var5 = 0;
                while (var5 < 8) {
                  var15[var5] = 0;
                  var5++;
                  if (var7 != 0) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                }
              }
              if ((decompiledFrameCompleted0) &&
                (this.field_d == 10)) {
                if (0 < w.field_r) {
                  ib.a(bm.field_c, w.field_r, rl.field_c, 109);
                  cf.field_s = 0;
                }
                rg.a((byte) -21);
                ta.a((byte) -117, rl.field_c);
                decompiledFrameRemainder0 = (var7 != 0);
              }
              if ((decompiledFrameRemainder0) &&
                (this.field_d == 2)) {
                var4_int = 0;
                var5 = 0;
                var6 = this.a((byte) -110);
                if (!param1) {
                  this.field_t = 0;
                }
                if (var6 >= 0) {
                  stackIn_115_0 = ((31 & var6) != 10) ? 0 : 1;
                  var5 = stackIn_115_0;
                  var4_int = 1;
                }
                if (var4_int == 0) {
                  return;
                }
                le.field_D = 0;
                om.field_b = (var5 != 0);
                u.field_f[7] = nl.field_f;
                this.field_s = 8;
                this.field_j = 1;
                ta.a((byte) -126, rl.field_c);
              }
              var3_ref_ic__ = p.field_m;
              p.field_m[1] = null;
              u.field_f[7] = jh.field_bb;
              mc.field_I = 1;
              hg.field_e = 1;
              if (jh.field_ab == 1) {
              }
              jf.field_c = 128;
              if (!param1) {
                this.field_t = 0;
              }
              var3_ref_ic__[0] = null;
              of.field_h = null;
              if (1 == bm.field_c &&
                rl.field_c == 0) {
                ei.field_o = new eg();
                ei.field_o.a(tf.field_e, (byte) 118);
              }
              if (((0 == bm.field_c)) &&
                ((0 == rl.field_c))) {
                ei.field_o = new eg();
                ei.field_o.a(il.field_a, (byte) -13);
                ei.field_o.field_g = false;
              }
              break L1;
            }
          }
          if ((decompiledFrameRemainder23) &&
            (decompiledFrameRemainder22) &&
            (decompiledFrameCompleted1)) {
            this.field_j = 1;
            dh.field_a.a((byte) -48, true);
            this.field_s = 3;
            if (var7 == 0) {
              break L1;
            }
          }
          if ((decompiledFrameRemainder23) &&
            (decompiledFrameCompleted1)) {
            this.field_s = 2;
            hh.field_d = 0;
            this.field_j = 1;
            vj.field_s = 0;
            n.field_s = 0;
            kh.field_ab.a(0);
            u.field_e = u.field_e - ei.field_l;
            ja.field_d = ja.field_d + 1;
            cf.field_s = 0;
            qb.field_k = qb.field_k + w.field_r;
            w.field_r = 0;
            rl.field_c = -1;
            le.field_D = 0;
            var14 = bm.field_b;
            var11 = var14;
            var8 = var11;
            var4 = var8;
            var5 = 0;
            while (true) {
              if (var5 < 8) {
                var14[var5] = 0;
                var5++;
                if (var7 == 0) {
                  continue;
                }
              } else {
                kh.field_ib[2] = 0;
                kh.field_ib[0] = 600;
                kh.field_ib[3] = 0;
                eh.field_g = 64;
                kh.field_ib[1] = 0;
                kh.field_U[0] = 1;
                kh.field_U[1] = 0;
                jf.field_g = 0;
                qh.field_k = 0;
              }
              if (1 == bm.field_c &&
                hh.field_d == 0) {
                kh.field_U[0] = 0;
                kh.field_ib[0] = 0;
              }
              rf.field_f = 0;
              gb.field_h = 0;
              uf.field_h = false;
              bh.field_d = 0;
              gf.field_j = 0;
              wb.field_R = 0;
              pl.field_l = false;
              if (jh.field_ab != 1) {
                break;
              }
              db.a(true, 256, rb.field_s);
              break;
            }
          }
        }
        if (decompiledFrameRemainder23) {
          var3 = -3 % ((45 - param0) / 55);
        }

    }

    private final int a(bd param0, String param1, int param2, String param3, byte param4, bd param5) {
        int stackIn_5_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (param0 == null &&
            param3 == null) {
            var7_int = 100;
            if (param1 != null) {
              param1 = param1.toUpperCase();
            }
            var8 = 8;
            if (param3 != null) {
              param3 = param3.toUpperCase();
            }
            if (param4 != 80) {
              stackIn_13_0 = 15;
              return stackIn_13_0;
            }
            if ((var7_int + param2) >= si.field_j &&
              si.field_a >= param2) {
              var9 = 13;
              if (param0 != null) {
                param5.e(-param5.field_w + 112 - param5.field_z / 2, -param5.field_y + param2 - (-64 + param5.field_A / 2));
                al.field_Z.a(param1, 161 + var8, param2, 143 - var8 * 2, 128, 16776960, -1, 1, 1, var9);
                param0.e(-param0.field_w - param0.field_z / 2 + 367, -param0.field_y + (param2 + (64 - param0.field_A / 2)));
                al.field_Z.a(param3, var8 + 431, param2, 114 - var8 * 2, 128, 16776960, -1, 1, 1, var9);
                if (var10 != 0) {
                  if (param5 != null) {
                    param5.e(112 - param5.field_z / 2 - param5.field_w, -param5.field_y + (param2 + 64 - param5.field_A / 2));
                    al.field_Z.a(param1, var8 + 161, param2, -(var8 * 2) + 384, 128, 16776960, -1, 0, 1, var9);
                    al.field_Z.a(param1, var8 + 64, param2, -(2 * var8) + 481, 128, 16776960, -1, 1, 1, var9);
                  } else {
                    al.field_Z.a(param1, var8 + 64, param2, -(2 * var8) + 481, 128, 16776960, -1, 1, 1, var9);
                  }
                }
              } else {
                boolean decompiledSharedTail0 = (param5 == null);
                if (!decompiledSharedTail0) {
                  param5.e(112 - param5.field_z / 2 - param5.field_w, -param5.field_y + (param2 + 64 - param5.field_A / 2));
                  al.field_Z.a(param1, var8 + 161, param2, -(var8 * 2) + 384, 128, 16776960, -1, 0, 1, var9);
                  decompiledSharedTail0 = (var10 != 0);
                }
                if (decompiledSharedTail0) {
                  al.field_Z.a(param1, var8 + 64, param2, -(2 * var8) + 481, 128, 16776960, -1, 1, 1, var9);
                }
              }
            }
            param2 = param2 + var7_int;
            stackIn_24_0 = param2;
            return stackIn_24_0;
          }
          param2 = this.a((bd) null, param1, param2, (String) null, (byte) 80, param5);
          param2 = this.a((bd) null, param3, param2, (String) null, (byte) 80, param0);
          stackIn_5_0 = param2;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_27_0 = var7;
          stackIn_27_1 = new StringBuilder().append("re.O(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param1 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(')').toString());
        }
    }

    private final void b(byte param0) {
        if (param0 > -119) {
          this.c((byte) -6);
        }
    }

    final static boolean c(byte param0, int param1) {
        try {
          int var2_int = 0;
          IOException var2 = null;
          Throwable decompiledCaughtException = null;
          if (param1 <= sc.field_g.field_i) {
            return true;
          }
          if (null == ag.field_t) {
            return false;
          }
          try {
            var2_int = ag.field_t.b((byte) 120);
            if (var2_int > 0) {
              if (var2_int > (param1 - sc.field_g.field_i)) {
                var2_int = -sc.field_g.field_i + param1;
              }
              ag.field_t.a(-1, sc.field_g.field_n, sc.field_g.field_i, var2_int);
              bb.field_c = hn.a((byte) 80);
              sc.field_g.field_i = sc.field_g.field_i + var2_int;
              if (sc.field_g.field_i < param1) {
                return false;
              }
              sc.field_g.field_i = 0;
              return true;
            }
            if (0 > var2_int ||
              !(m.a(true) <= 30000L)) {
              le.c((byte) 56);
            }
            if (param0 != 33) {
              field_r = (ub) null;
              return false;
            }
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = (IOException) (Object) decompiledCaughtException;
            le.c((byte) 86);
          }
          return false;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void c(int param0, int param1) {
        le dupTemp$0 = null;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        boolean stackIn_18_0 = false;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_42_0 = 0;
        boolean stackIn_45_0 = false;
        int stackIn_64_0 = 0;
        int stackIn_64_1 = 0;
        boolean stackOut_17_0;
        boolean stackOut_44_0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        L0: {
          boolean decompiledFrameCompleted0 = true;
          var9 = HostileSpawn.field_I ? 1 : 0;
          this.field_E.a(true, true);
          this.field_E.a((byte) -121, ll.field_c * 50, 30, true);
          if (pf.field_o != 1 ||
            !this.field_E.field_S ||
            !(j.field_c < -30 + this.field_E.field_qb + this.field_E.field_K)) {
            var3 = li.field_s;
            li.field_s = -1;
            stackIn_7_0 = (!ib.a((byte) -72)) ? 1 : 2;
            var4 = stackIn_7_0;
            var5 = 0;
            while (true) {
              stackIn_9_0 = var5;
              if (stackIn_9_0 < var4) {
                stackIn_25_0 = -11;
                stackIn_25_1 = ~gn.field_k[var5];
                if (var9 == 0) {
                  if (stackIn_25_0 == stackIn_25_1 &&
                    this.field_w[var5][10] != null) {
                    stackIn_15_0 = 11;
                  } else {
                    stackIn_15_0 = 10;
                  }
                  var6 = stackIn_15_0;
                  var7 = 0;
                  while (var6 > var7) {
                    stackOut_17_0 = this.field_w[var5][var7].field_S;
                    stackIn_9_0 = stackOut_17_0 ? 1 : 0;
                    stackIn_18_0 = stackOut_17_0;
                    if (stackIn_18_0 &&
                      this.field_w[var5][var7].field_v != -1) {
                      li.field_s = var7;
                    }
                    var7++;
                  }
                  var5++;
                  continue;
                }
              } else {
                stackIn_25_0 = -1;
                stackIn_25_1 = ~li.field_s;
              }
              if (stackIn_25_0 >= stackIn_25_1 &&
                var3 != li.field_s) {
                eh.field_c.a(lm.field_A[3], 100, uh.field_i);
              }
              if (var9 == 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              break;
            }
          }
          if (decompiledFrameCompleted0) {
            var3Lifetime1 = rl.field_c;
            var4Lifetime1 = bm.field_c;
            stackIn_33_0 = (!ib.a((byte) -72)) ? 1 : 2;
            var5Lifetime1 = stackIn_33_0;
            rl.field_c = -1;
            var6Lifetime1 = 0;
            while (true) {
              stackIn_35_0 = var5Lifetime1;
              if (stackIn_35_0 > var6Lifetime1) {
                stackIn_64_0 = -11;
                stackIn_64_1 = ~gn.field_k[var6Lifetime1];
                if (var9 == 0) {
                  if (stackIn_64_0 == stackIn_64_1 &&
                    this.field_w[var6Lifetime1][10] != null) {
                    stackIn_42_0 = 11;
                  } else {
                    stackIn_42_0 = 10;
                  }
                  var7Lifetime1 = stackIn_42_0;
                  var8 = 0;
                  while (var8 < var7Lifetime1) {
                    stackOut_44_0 = this.field_w[var6Lifetime1][var8].field_S;
                    stackIn_35_0 = stackOut_44_0 ? 1 : 0;
                    stackIn_45_0 = stackOut_44_0;
                    if (!stackIn_45_0) {
                      this.field_w[var6Lifetime1][var8].field_nb = null;
                      if (var8 <= gn.field_k[var6Lifetime1]) {
                        this.field_w[var6Lifetime1][var8].field_Y = en.field_y;
                      }
                      this.field_w[var6Lifetime1][var8].field_T = 8421376;
                      if (var8 == 10) {
                        dupTemp$0 = this.field_w[var6Lifetime1][var8];
                        dupTemp$0.field_T = dupTemp$0.field_T & 16742263;
                      }
                      if (ta.p(param1 + 10102) &&
                        pf.field_o == 1 &&
                        this.field_w[var6Lifetime1][var8].field_Eb) {
                        ul.field_O = true;
                      }
                    } else {
                      bm.field_c = var6Lifetime1;
                      this.field_w[var6Lifetime1][var8].field_nb = fm.field_a;
                      this.field_w[var6Lifetime1][var8].field_Y = en.field_t;
                      this.field_w[var6Lifetime1][var8].field_T = 65793;
                      if (var8 == 10) {
                        rl.field_c = fg.field_c[var6Lifetime1];
                        om.field_b = true;
                      } else {
                        om.field_b = false;
                        rl.field_c = var8;
                      }
                      hh.field_d = rl.field_c;
                      kh.field_ab.a(0);
                    }
                    var8++;
                  }
                  var6Lifetime1++;
                  continue;
                }
              } else {
                stackIn_64_0 = ~var3Lifetime1;
                stackIn_64_1 = ~rl.field_c;
              }
              if (((stackIn_64_0 != stackIn_64_1 ||
                bm.field_c != var4Lifetime1)) && (!(rl.field_c < 0))) {
                this.i(104);
                eh.field_c.a(lm.field_A[4], 100, uh.field_i);
              }
              break;
            }
          }
        }
        if (0 <= rl.field_c) {
          this.field_G.a(true, true);
          this.field_G.a((byte) -115, ll.field_c * 50, 30, true);
        }
        if (param1 != -10099) {
          field_B = (String) null;
        }
    }

    private final void a(int param0, int param1, byte param2, int param3, int param4) {
        boolean stackIn_6_2 = false;
        boolean stackIn_12_0 = false;
        String stackIn_35_0 = null;
        int stackIn_43_0 = 0;
        boolean[] stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        boolean[] stackIn_86_0 = null;
        int stackIn_86_1 = 0;
        boolean stackOut_11_0;
        int var6 = 0;
        int var7 = 0;
        boolean[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        String var10_ref_String = null;
        String var11 = null;
        int var11_int = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        String var15 = null;
        String var16 = null;
        boolean[] var17 = null;
        boolean[] var18 = null;
        var14 = HostileSpawn.field_I ? 1 : 0;
        wh.field_d.c(mb.field_k.toUpperCase(), 10 + param3, 22 + param1, 16776960, -1);
        var6 = 8 + param3;
        var7 = param1 + 30;
        var18 = new boolean[kh.field_ib.length];
        var17 = var18;
        var8 = var17;
        var9 = 0;
        while (var9 < kh.field_ib.length) {
          stackIn_86_0 = var8;
          stackIn_86_1 = var9;
          if (var14 != 0) {
            while (true) {
              if (stackIn_86_0[stackIn_86_1]) {
                s.a(var9, 65792, var7, var6);
                var10 = kh.field_ib[var9];
                if (0 > var10) {
                  var10 = 0;
                }
                if (1 == var9) {
                  var10 = var10 / 50;
                }
                al.field_Z.b(Integer.toString(var10), var6 + 16, 38 + var7, 16776960, -1);
                if (ka.a(var7, 0, 40, 40, var6)) {
                  var11 = lg.field_n[var9].toUpperCase();
                  var12 = al.field_Z.a(var11);
                  var13 = 16 + var6;
                  if (var12 / 2 + var13 >= 640) {
                    var13 = 639 - var12;
                  }
                  var13 = var13 - var12 / 2;
                  al.field_Z.c(var11.toUpperCase(), var13, var7 + 6, 16777215, -1);
                }
                var6 += 58;
                if (550 <= var6) {
                  var6 = param3 + 8;
                  var7 += 58;
                }
              }
              var9++;
              return;
            }
          }
          stackIn_6_2 = !(kh.field_ib[var9] <= 0);
          stackIn_86_0[stackIn_86_1] = stackIn_6_2;
          var9++;
          if (var14 == 0) {
            continue;
          }
          break;
        }
        if (param2 != 56) {
          return;
        }
        var9 = 0;
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (var9 >= 8))) {
          stackOut_11_0 = kh.field_Q[var9];
          stackIn_43_0 = stackOut_11_0 ? 1 : 0;
          stackIn_12_0 = stackOut_11_0;
          if (var14 == 0) {
            if (stackIn_12_0) {
              dn.a(-4 + var6, param2 - 169, var9, var7 - 10, 16772608);
              if (var9 != 0) {
                L18: {
                  var10 = kh.field_ib[an.field_r[var9]];
                  var8[an.field_r[var9]] = false;
                  var11_int = var9;
                  switch (var11_int) {
                    case 3:
                      var10 = var10 / 50;
                      break L18;
                    case 2:
                      break;
                    default:
                      break L18;
                    case 4:
                      var10 = var10 / 5;
                      break L18;
                  }
                  var10 = var10 / 10;
                }
                if (var10 < 0) {
                  var10 = 0;
                }
                al.field_Z.b(Integer.toString(var10), var6 + 16, var7 + 38, 16776960, -1);
              } else {
                of.field_e.a(pc.field_b.charAt(0), var6 + 10, var7 + 27, 16776960);
              }
              if (ka.a(var7, 0, 40, 40, var6)) {
                if (0 == var9) {
                  stackIn_35_0 = gi.field_m;
                } else {
                  stackIn_35_0 = rf.field_s[var9 - 1];
                }
                var15 = stackIn_35_0;
                var10_ref_String = var15;
                var16 = var15.toUpperCase();
                var11_int = al.field_Z.a(var16);
                var12 = var6 + 16;
                if (var12 + var11_int / 2 < 640) {
                  var12 = var12 - var11_int / 2;
                } else {
                  var12 = -var11_int + 639;
                }
                al.field_Z.c(var16.toUpperCase(), var12, 6 + var7, 16777215, -1);
              }
              var6 += 58;
              if (var6 >= 550) {
                var7 += 58;
                var6 = param3 + 8;
              }
            }
            var18 = var17;
            var9++;
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          var18 = var17;
          stackIn_43_0 = 0;
        }
        var18 = var17;
        var9 = stackIn_43_0;
        while (true) {
          if (var9 >= var18.length) {
            return;
          }
          if (var14 != 0) {
            return;
          }
          stackIn_47_0 = var8;
          stackIn_47_1 = var9;
          if (stackIn_47_0[stackIn_47_1]) {
            s.a(var9, 65792, var7, var6);
            var10 = kh.field_ib[var9];
            if (0 > var10) {
              var10 = 0;
            } else {
              if (1 == var9) {
                var10 = var10 / 50;
              }
            }
            al.field_Z.b(Integer.toString(var10), var6 + 16, 38 + var7, 16776960, -1);
            if (ka.a(var7, 0, 40, 40, var6)) {
              var11 = lg.field_n[var9].toUpperCase();
              var12 = al.field_Z.a(var11);
              var13 = 16 + var6;
              if (var12 / 2 + var13 >= 640) {
                var13 = 639 - var12;
              } else {
                var13 = var13 - var12 / 2;
              }
              al.field_Z.c(var11.toUpperCase(), var13, var7 + 6, 16777215, -1);
            }
            var6 += 58;
            if (550 <= var6) {
              var6 = param3 + 8;
              var7 += 58;
            }
          }
          var9++;
        }
    }

    private final void a(int param0, int param1, int param2) {
        if (param0 != 89) {
          field_q = (bd) null;
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6;
        if (param3 != -18) {
          return;
        }
        var6 = this.field_e;
        if (this.field_s == 17 ||
          this.field_d == 17) {
          var6 = 256;
        }
        gn.a(param1, param4, param2, var6, param0, (byte) 74);
    }

    private final void a(int param0, byte param1) {
        int var3;
        int var4;
        String var5;
        String var6_ref_String;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        String var11;
        String var12;
        String var13;
        String var14;
        int var3Lifetime1;
        int var3Lifetime2;
        String var5Lifetime1;
        String var5Lifetime2;
        String var5Lifetime3;
        String var12Lifetime1;
        String var12Lifetime2;
        u.field_f[26] = jf.field_e;
        mk.field_L.b(tc.field_d, 320, 95, 16777215, -1);
        var3 = 0;
        var4 = wl.b(25685);
        var11 = vg.a(new String[]{Integer.toString(var4)}, 88, bi.field_f);
        var12 = var11;
        var5 = var12;
        var5Lifetime1 = var11;
        var5Lifetime2 = var11;
        var12Lifetime1 = var5Lifetime2;
        var5Lifetime3 = var12Lifetime1;
        if (param1 < 98) {
          this.a(-98, false);
        }
        var3Lifetime1 = rl.field_c - hh.field_d;
        if (0 < w.field_r) {
          if (rl.field_c > hh.field_d) {
            var12Lifetime2 = var11 + "<br>" + vg.a(new String[]{Integer.toString(-hh.field_d + rl.field_c)}, 77, vc.field_f);
            var14 = var12Lifetime2;
            var5Lifetime3 = var14;
            var5Lifetime3 = var12Lifetime2;
            var3Lifetime2 = ad.field_a / 50;
            var13 = var12Lifetime2 + "<br>" + c.field_d + jh.a((byte) -80, var3Lifetime2);
            var14 = var13;
            var5Lifetime3 = var14;
            var5Lifetime3 = var13;
            var3Lifetime2 = ub.field_a[bm.field_c][rl.field_c - 1];
            var5Lifetime3 = var13 + "<br>" + ki.field_d + jh.a((byte) -67, var3Lifetime2);
            var14 = var5Lifetime3;
            var5Lifetime3 = var14;
            if (HostileSpawn.field_I) {
              var3Lifetime2 = ad.field_a / 50;
              var14 = var5Lifetime3 + "<br>" + c.field_d + jh.a((byte) -61, var3Lifetime2);
              var5Lifetime3 = var14;
              var5Lifetime3 = var14;
              var3Lifetime2 = ub.field_a[bm.field_c][rl.field_c - 1];
              var5Lifetime3 = var14 + "<br>" + ki.field_d + jh.a((byte) -73, var3Lifetime2);
            }
          } else {
            var3Lifetime2 = ad.field_a / 50;
            var14 = var5Lifetime3 + "<br>" + c.field_d + jh.a((byte) -61, var3Lifetime2);
            var5Lifetime3 = var14;
            var5Lifetime3 = var14;
            var3Lifetime2 = ub.field_a[bm.field_c][rl.field_c - 1];
            var5Lifetime3 = var14 + "<br>" + ki.field_d + jh.a((byte) -73, var3Lifetime2);
          }
        }
        if (w.field_r > 0) {
          var5Lifetime3 = var5Lifetime3 + "<br>" + vg.a(new String[]{Integer.toString(w.field_r)}, 99, hj.field_s);
        }
        if (50 <= sg.field_i) {
          var6_ref_String = sg.d(24);
          var5Lifetime3 = var6_ref_String;
          var5Lifetime3 = var6_ref_String;
          if (var6_ref_String != null) {
            var5Lifetime3 = var5Lifetime3 + "<br>" + vg.a(new String[]{var6_ref_String}, 120, ag.field_j);
          }
        }
        var6 = 25;
        var7 = 250;
        var8 = (640 - var7) / 2;
        var9 = 130;
        var10 = 180;
        this.a(var10 + 16, (byte) -55, -8 + var9, -8 + var8, 16 + var7);
        wh.field_d.a(var5Lifetime3.toUpperCase(), var8, var9, var7, var10, 16776960, -1, 1, 1, var6);
        this.e(16777215, 340);
    }

    private final void j(int param0) {
        int var2 = -113 % ((71 - param0) / 52);
        hm.a(8, ul.field_J, false, 330, 76, 316);
        hm.a(576, ul.field_J, false, 47, 32, 32);
        this.a((byte) -29, il.field_e);
        hm.a(576, ul.field_J, false, 46, 362, 32);
        this.a((byte) 50, 39, hn.field_e, 80);
        this.a((byte) 50, 325, ec.field_c, 80);
    }

    private final void h(byte param0) {
        le stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_17_2 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_24_0 = 0;
        le stackIn_26_0 = null;
        String stackIn_27_1 = null;
        le stackIn_33_0 = null;
        boolean stackIn_34_1 = false;
        le var3 = null;
        int var4_int = 0;
        le var4 = null;
        le var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        le var12_ref_le = null;
        int var12 = 0;
        le var13 = null;
        int var14 = 0;
        le var15 = null;
        var14 = HostileSpawn.field_I ? 1 : 0;
        this.a(false);
        rl.field_c = -1;
        var4_int = 0;
        while (2 > var4_int) {
          if (gn.field_k[var4_int] == 10) {
            ln.field_b[var4_int] = true;
          }
          var4_int++;
          if (var14 == 0) {
            continue;
          }
          break;
        }
        var15 = new le(0L, (le) null);
        var3 = new le(0L, (le) null);
        this.field_E = new th(0L, var15, var3, this.field_z);
        var4 = this.field_E.field_Kb;
        var4.field_qb = 234;
        var4.field_sb = 270;
        var5 = this.field_E.field_Ib;
        var5.field_qb = var4.field_qb;
        var5.field_I = null;
        var6 = 0;
        var7 = 3;
        var8 = 10;
        if (gn.field_k[0] == 10) {
          var8++;
        }
        var9 = 1;
        if (ib.a((byte) -72)) {
          var9 = 2;
          var8 += 10;
          if (gn.field_k[1] == 10) {
            var8++;
          }
        }
        stackIn_16_0 = var5;
        stackIn_16_1 = var8 * 25;
        stackIn_17_2 = (ib.a((byte) -72)) ? 10 : 0;
        stackIn_16_0.field_sb = stackIn_16_1 + stackIn_17_2;
        rl.field_c = -1;
        var10 = 0;
        L6: while (true) {
          stackIn_19_0 = ~var10;
          stackIn_19_1 = ~var9;
          if (stackIn_19_0 > stackIn_19_1) {
            if (var14 != 0) {
              return;
            }
            stackIn_24_0 = (gn.field_k[var10] == 10) ? 11 : 10;
            var11 = stackIn_24_0;
            var12_ref_le = new le(-1L, (le) null);
            var12_ref_le.field_L = 22;
            var12_ref_le.field_R = 20;
            var12_ref_le.field_G = 2;
            var12_ref_le.field_ab = (vm) ((Object) wh.field_d);
            stackIn_26_0 = var12_ref_le;
            if (var10 == 0) {
              stackIn_27_1 = c.field_b;
            } else {
              stackIn_27_1 = og.field_e;
            }
            stackIn_26_0.field_fb = ((String) (Object) stackIn_27_1).toUpperCase();
            var12_ref_le.field_jb = false;
            var12_ref_le.field_zb = var7 + var10 * 4;
            var12_ref_le.field_sb = 20;
            var12_ref_le.field_nb = qc.field_x;
            var12_ref_le.field_tb = var6;
            var12_ref_le.field_qb = var4.field_qb - 20;
            var12_ref_le.field_T = 0;
            var5.a(false, var12_ref_le);
            var7 = var7 + (2 + (var12_ref_le.field_sb + 4 * var10));
            var12 = 0;
            while (var12 < var11) {
              var13 = new le((long)var12, (le) null);
              var13.field_G = 2;
              var13.field_J = 4;
              var13.field_R = 20;
              var13.field_L = 18;
              var13.field_ab = (vm) ((Object) wh.field_d);
              stackIn_19_0 = ~var12;
              stackIn_19_1 = -11;
              if (stackIn_19_0 > stackIn_19_1) {
                var13.field_fb = kh.field_fb[var10][var12].toUpperCase();
                stackIn_33_0 = var13;
                stackIn_34_1 = !(gn.field_k[var10] < var12);
                stackIn_33_0.field_jb = stackIn_34_1;
                var13.field_T = 8421376;
              } else {
                var13.field_fb = nj.field_e.toUpperCase();
                var13.field_T = 8388608;
                var13.field_jb = true;
              }
              var13.field_zb = var7;
              if (var13.field_jb) {
                var13.field_v = 16776960;
                var13.field_pb = en.field_q;
                var13.field_Y = en.field_y;
                if (var12 == 10) {
                  var13.field_v = 16742144;
                }
              }
              var13.field_tb = var6;
              var13.field_sb = 20;
              var13.field_qb = -20 + var4.field_qb;
              var5.a(false, var13);
              var7 = var7 + (var13.field_sb + 2);
              var5.field_sb = var7;
              this.field_w[var10][var12] = var13;
              var12++;
            }
            var10++;
            continue L6;
          }
          break;
        }
        o.field_n.b((byte) 107);
        this.field_E.field_tb = 64;
        this.field_E.field_qb = var4.field_qb + 10;
        this.field_E.field_zb = 80;
        this.field_E.field_sb = 290;
        this.field_E.a(16, 0, param0);
        this.field_E.a((byte) -124, 0, 30, true);
        this.field_E.a(true, true);
        return;
    }

    final void i(byte param0) {
        int var3;
        boolean decompiledFrameRemainder0 = true;
        var3 = HostileSpawn.field_I ? 1 : 0;
        if (this.field_d != 16) {
          if ((this.field_d == 6) &&
            (decompiledFrameRemainder0 = (this.field_C.field_b == 3)) &&
            (decompiledFrameRemainder0 = !(this.field_t > 0))) {
            if (this.g((byte) 30)) {
              this.field_t = 2;
              decompiledFrameRemainder0 = (var3 != 0);
            }
            if (decompiledFrameRemainder0) {
              this.field_t = 1;
              decompiledFrameRemainder0 = (var3 != 0);
            }
          }
          if (decompiledFrameRemainder0) {
            if ((this.field_d == 4) &&
              (decompiledFrameRemainder0 = (this.field_C.field_b == 5))) {
              this.field_t = 4;
              decompiledFrameRemainder0 = (var3 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (2 == this.field_d &&
                this.a((byte) -119) < 0) {
                this.field_t = 1;
                if (var3 != 0) {
                  this.field_t = this.field_t - 1;
                  if (this.field_t < 0) {
                    this.field_t = -1 + this.field_C.field_b;
                    if (var3 != 0 &&
                      this.field_t == 2) {
                      this.field_t = 0;
                    }
                  }
                }
              } else {
                this.field_t = this.field_t - 1;
                if (this.field_t < 0) {
                  this.field_t = -1 + this.field_C.field_b;
                  if (var3 != 0 &&
                    this.field_t == 2) {
                    this.field_t = 0;
                  }
                }
              }
            }
          }
        } else {
          if (this.field_t == 2) {
            this.field_t = 0;
          }
        }
        if (param0 > -96) {
          this.field_o = -96;
        }
    }

    private final int b(byte param0, int param1) {
        int var3;
        int var4;
        var3 = param1;
        var4 = si.field_a;
        this.a(320, (byte) -55, 78, 60, 481);
        if (null != this.field_h) {
          this.a(10 + this.field_h.field_sb, (byte) -55, -5 + this.field_h.field_mb, this.field_h.field_K - 5, 10 + this.field_h.field_qb);
          si.f(32, 83, 605, 393);
        }
        var3 += 81;
        var3 = this.a(bj.field_g, 82, var3);
        if (!hk.field_q) {
          var3 = this.a(il.field_c[1], df.field_b, var3, df.field_e, (byte) 80, il.field_c[0]);
          if (HostileSpawn.field_I) {
            var3 = this.a(il.field_c[0], df.field_b, var3, df.field_e, (byte) 80, il.field_c[1]);
          }
        } else {
          var3 = this.a(il.field_c[0], df.field_b, var3, df.field_e, (byte) 80, il.field_c[1]);
        }
        var3 = this.a(pl.field_f, wl.field_a, var3, rl.field_a, (byte) 80, qi.field_H);
        if (param0 != 82) {
          this.field_o = 34;
        }
        var3 = this.a(il.field_c[4], field_I, var3, tk.field_f, (byte) 80, il.field_c[3]);
        var3 = this.a(il.field_c[6], u.field_c, var3, of.field_b, (byte) 80, il.field_c[5]);
        var3 = this.a(jf.field_f, param0 + 8, var3);
        var3 = this.a((bd) null, al.field_S, var3, (String) null, (byte) 80, il.field_c[7]);
        var3 = this.a(il.field_c[10], g.field_K, var3, ln.field_p, (byte) 80, il.field_c[8]);
        var3 = this.a((bd) null, kb.field_a, var3, (String) null, (byte) 80, il.field_c[9]);
        var3 = this.a((bd) null, eh.field_h, var3, (String) null, (byte) 80, km.field_A[0]);
        var3 = this.a((bd) null, ga.field_c, var3, (String) null, (byte) 80, pi.field_b);
        var3 = this.a(mb.field_k, param0 ^ 58, var3);
        var3 = this.a((bd) null, w.field_A, var3, (String) null, (byte) 80, this.e((byte) -44, 0));
        var3 = this.a((bd) null, uj.field_q, var3, (String) null, (byte) 80, this.e((byte) -44, 1));
        var3 = this.a((bd) null, h.field_f, var3, (String) null, (byte) 80, this.e((byte) -44, 2));
        var3 = this.a((bd) null, tk.field_b, var3, (String) null, (byte) 80, this.e((byte) -44, 3));
        var3 = this.a((bd) null, vb.field_Hb, var3, (String) null, (byte) 80, this.e((byte) -44, 4));
        var3 = this.a((bd) null, di.field_c, var3, (String) null, (byte) 80, this.e((byte) -44, 5));
        var3 = this.a((bd) null, m.field_r, var3, (String) null, (byte) 80, this.e((byte) -44, 6));
        var3 = this.a((bd) null, od.field_C, var3, (String) null, (byte) 80, this.e((byte) -44, 7));
        var3 = this.a(al.field_O, 87, var3);
        var3 = this.a((bd) null, od.field_B, var3, (String) null, (byte) 80, wk.field_b[1]);
        var3 = this.a((bd) null, mf.field_a, var3, (String) null, (byte) 80, wk.field_b[3]);
        var3 = this.a((bd) null, ha.field_x, var3, (String) null, (byte) 80, wk.field_b[11]);
        si.d(0, 0, 640, var4);
        if (null != this.field_h) {
          this.field_h.a(param0 - 177, false);
        }
        si.c();
        return var3 - param1 - 94;
    }

    public static void a(int param0) {
        field_i = null;
        field_B = null;
        field_I = null;
        field_q = null;
        field_D = (bd[][]) null;
        field_n = null;
        field_A = null;
        field_r = null;
        int var1 = -29 / ((param0 + 75) / 39);
    }

    private final void d(int param0, int param1, int param2) {
        int stackIn_80_0 = 0;
        int stackIn_82_0 = 0;
        int stackIn_83_1 = 0;
        int stackIn_118_0 = 0;
        int stackIn_160_0 = 0;
        int stackIn_181_0 = 0;
        int stackIn_217_0 = 0;
        int stackIn_294_0 = 0;
        int stackIn_310_0 = 0;
        int stackIn_310_1 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var12_int = 0;
        nc var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        String var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        var19 = HostileSpawn.field_I ? 1 : 0;
        if (0 == li.field_p) {
          li.field_p = Math.max(wh.field_d.a(na.field_q.toUpperCase()), mk.field_L.a(wc.field_s.toUpperCase()));
        }
        boolean decompiledFrameRemainder12 = true;
        if (param0 == this.field_d) {
          boolean decompiledFrameRemainder11 = true;
          boolean decompiledFrameRemainder10 = true;
          boolean decompiledFrameRemainder9 = true;
          boolean decompiledFrameRemainder8 = true;
          boolean decompiledFrameRemainder7 = true;
          boolean decompiledFrameRemainder6 = true;
          boolean decompiledFrameRemainder5 = true;
          boolean decompiledFrameRemainder4 = true;
          boolean decompiledFrameRemainder3 = true;
          boolean decompiledFrameRemainder2 = true;
          boolean decompiledFrameRemainder1 = true;
          boolean decompiledFrameRemainder0 = true;
          var4 = param0;
          if ((var4 != 10 ||
            var19 != 0) && (var4 != 9 ||
            var19 != 0)) {
            decompiledFrameRemainder0 = (12 != var4 ||
              var19 != 0);
            if (((decompiledFrameRemainder0) &&
              (decompiledFrameRemainder0 = (var4 != 14)) &&
              (decompiledFrameRemainder0 = (var4 != 15 ||
              var19 != 0))) &&
              (decompiledFrameRemainder1 = (var4 != 11 ||
              var19 != 0)) &&
              (decompiledFrameRemainder2 = (var4 != 13)) &&
              (decompiledFrameRemainder3 = (var4 != 3 ||
              var19 != 0))) {
              decompiledFrameRemainder4 = (var4 != 0);
              if (((decompiledFrameRemainder4) &&
                (decompiledFrameRemainder4 = (17 != var4))) &&
                (decompiledFrameRemainder5 = (var4 != 5 ||
                var19 != 0)) &&
                (decompiledFrameRemainder6 = (var4 != 4 ||
                var19 != 0)) &&
                (decompiledFrameRemainder7 = (var4 != 2)) &&
                (decompiledFrameRemainder8 = (var4 != 8 ||
                var19 != 0)) &&
                (decompiledFrameRemainder9 = (6 != var4 ||
                var19 != 0))) {
                decompiledFrameRemainder10 = (var4 != 1);
                if (((decompiledFrameRemainder10) &&
                  (decompiledFrameRemainder10 = (var4 != 7 ||
                  var19 != 0))) &&
                  (decompiledFrameRemainder12 = (var4 == 16))) {
                  decompiledFrameRemainder11 = (var19 != 0);
                }
              }
            }
          }
          if ((decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9) &&
            (decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3) &&
            (decompiledFrameRemainder2) &&
            (decompiledFrameRemainder1) &&
            (decompiledFrameRemainder0)) {
            this.c(-50, param0, param1);
            decompiledFrameRemainder12 = (var19 != 0);
          }
          if ((decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9) &&
            (decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3) &&
            (decompiledFrameRemainder2) &&
            (decompiledFrameRemainder1)) {
            this.f(117, param1);
            decompiledFrameRemainder12 = (var19 != 0);
          }
          if ((decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9) &&
            (decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3) &&
            (decompiledFrameRemainder2)) {
            this.a(param1, (byte) 126);
            decompiledFrameRemainder12 = (var19 != 0);
          }
          if ((decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9) &&
            (decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3)) {
            this.f(114, param1);
            decompiledFrameRemainder12 = (var19 != 0);
          }
          if (((decompiledFrameRemainder12) && (decompiledFrameRemainder11) && (decompiledFrameRemainder10) && (decompiledFrameRemainder9) && (decompiledFrameRemainder8) && (decompiledFrameRemainder7) && (decompiledFrameRemainder6) && (decompiledFrameRemainder5) && (decompiledFrameRemainder4)) &&
            (decompiledFrameRemainder12 = (dh.field_a != null))) {
            dh.field_a.a((byte) -67);
            decompiledFrameRemainder12 = (var19 != 0);
          }
          if ((decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9) &&
            (decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5)) {
            this.d(-112, param1);
            decompiledFrameRemainder12 = (var19 != 0);
          }
          if ((decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9) &&
            (decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6)) {
            this.g(152, 7 + param1);
            decompiledFrameRemainder12 = (var19 != 0);
          }
          if ((decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9) &&
            (decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7)) {
            this.c(false);
            decompiledFrameRemainder12 = (var19 != 0);
          }
          if ((decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9) &&
            (decompiledFrameRemainder8)) {
            this.d((byte) 28, param1);
            decompiledFrameRemainder12 = (var19 != 0);
          }
          if ((decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9)) {
            this.j((byte) 84);
            decompiledFrameRemainder12 = (var19 != 0);
          }
          if ((decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10)) {
            this.a(param1, true);
            decompiledFrameRemainder12 = (var19 != 0);
          }
          if ((decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11)) {
            this.a((byte) -109, il.field_d.toUpperCase());
            this.field_g = this.b((byte) 82, -this.field_v);
            decompiledFrameRemainder12 = (var19 != 0);
          }
          if (decompiledFrameRemainder12) {
            this.j(18);
          }
        }
        if (this.field_C == null) {
          wh.field_d.b("ERROR! 0", 320, 240, 2158368, -1);
          return;
        }
        if (this.field_d == 0 &&
          dd.field_o[this.field_d].length == 9) {
          stackIn_80_0 = 1;
        } else {
          stackIn_80_0 = 0;
        }
        var4 = stackIn_80_0;
        var5 = param1 - 1;
        stackIn_82_0 = var5;
        stackIn_83_1 = (var4 == 0) ? 42 : 37;
        var5 = stackIn_82_0 + stackIn_83_1;
        var6 = 555;
        var7 = this.field_t;
        if (!this.field_K) {
          this.field_t = -1;
          this.field_f = -1;
        }
        boolean decompiledFrameCompleted1 = true;
        boolean decompiledFrameCompleted0 = true;
        if (param0 == 16) {
          var8 = 0;
          while (dd.field_o[param0].length > var8) {
            var9 = dd.field_o[param0][var8];
            var10 = 16776960;
            var11_ref_String = u.field_f[var9];
            stackIn_310_0 = ~param0;
            stackIn_310_1 = ~this.field_d;
            if (var19 != 0) {
              decompiledFrameCompleted1 = false;
              break;
            }
            if (stackIn_310_0 == stackIn_310_1 &&
              !jk.a(-23322)) {
              if (!this.field_K &&
                e.field_c[var8] < j.field_c &&
                e.field_c[var8] + pk.field_e[var8] > j.field_c &&
                rb.field_m > sj.field_h[var8] &&
                rb.field_m < (sj.field_h[var8] + 30)) {
                this.field_u = true;
                this.field_t = var8;
              }
              if (~this.field_t == ~var8 &&
                0 == this.field_j) {
                var10 = 65793;
              }
            }
            if (var11_ref_String == null) {
              var11_ref_String = "ERROR! TEXT NOT FOUND (" + var9 + ")";
            }
            if (var10 == 65793 &&
              this.field_e < 256) {
              var10 = 16776960;
            }
            if (var10 == 65793 &&
              this.field_j == 0) {
              si.c(e.field_c[var8], sj.field_h[var8], pk.field_e[var8], 30, 16776960);
            }
            wh.field_d.a(var11_ref_String.toUpperCase(), e.field_c[var8], sj.field_h[var8], pk.field_e[var8], 30, var10, -1, this.field_e, 1, 1, wh.field_d.field_u);
            var8++;
          }
        }
        if (decompiledFrameCompleted1) {
          if (param0 != 16 ||
            var19 != 0) {
            stackIn_118_0 = (var4 == 0) ? 30 : 26;
            var8 = stackIn_118_0;
            var9 = 64;
            var10 = 1;
            var11 = 0;
            var12_int = param0;
            switch ((var19 == 0
              || var12_int == 0
              || var12_int == 2
              || var12_int == 6
              || var12_int == 8
              || var12_int == 10
              || var12_int == 14
              || var12_int == 17
              ) ? var12_int : -1) {
              case 0:
              case 17:
                var8 = 30;
                var9 = 312;
                var5 = 140 - (-var8 - 10);
                if (param0 == 0 &&
                  !ib.a((byte) -72)) {
                  var8 = 26;
                  var5 -= 4;
                }
                if (param0 == 17) {
                  var5 += 30;
                }
                stackIn_160_0 = (!ka.a(140, 0, 200, 300, 280)) ? 0 : 1;
                var10 = stackIn_160_0;
                if (var19 == 0) {
                  break;
                }
              case 4:
                var8 = (!ta.p(3)) && (var19 == 0) ? (140) : (240);
                var11 = 1;
                if (var19 == 0) {
                  break;
                }
              case 6:
                var11 = 1;
                var8 = 240;
                if (var19 == 0) {
                  break;
                }
              case 10:
                var11 = 1;
                var8 = 340;
                if (var19 == 0) {
                  break;
                }
              case 1:
              case 7:
                var8 = 200;
                var11 = 1;
                if (var19 == 0) {
                  break;
                }
              case 13:
              case 14:
              case 12:
              case 15:
                var5 = 460;
                var8 = 200;
                var9 = 460;
                if (ta.p(3)) {
                  var9 = 400;
                }
                if (ig.field_L != 2 &&
                  270 <= uk.field_e) {
                  break;
                }
                var5 = 1000;
                if (var19 == 0) {
                  break;
                }
              case 11:
                var8 = 200;
                var11 = 1;
                if (var19 == 0) {
                  break;
                }
              case 5:
                if (this.field_C.field_b > 0) {
                  var8 = 166 / this.field_C.field_b;
                }
                var5 = 5 + var8 + 228;
                stackIn_181_0 = (!ka.a(228, 0, 176, 288, 60)) ? 0 : 1;
                var10 = stackIn_181_0;
                var9 = 84;
                if (var19 == 0) {
                  break;
                }
              case 2:
                var11 = 0;
                var5 = 394;
                if (var19 == 0) {
                  break;
                }
              case 8:
                var5 = 394;
                var9 = 500;
                var11 = 0;
                if (var5 <= rb.field_m &&
                  j.field_c < -20 + var9) {
                  var10 = 0;
                }
              default:
                break;
            }
            if (var11 != 0) {
              var5 = 430;
            }
            var12 = wh.field_d;
            if (param0 == 0 ||
              17 == param0) {
              var12 = mk.field_L;
            }
            var13 = 0;
            while (!(var13 >= dd.field_o[param0].length)) {
              var14 = dd.field_o[param0][var13];
              stackIn_310_0 = ~var14;
              stackIn_310_1 = -19;
              if (var19 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (stackIn_310_0 == stackIn_310_1 ||
                17 == var14) {
                this.b(var14, 89, var13);
              } else {
                var15 = 8421376;
                var16 = u.field_f[var14];
                if (var14 == 28 &&
                  param0 == 4) {
                  var9 = 400;
                  var8 = 180;
                  var5 = 70;
                }
                if (var16 == null) {
                  var16 = "UNKNOWN OPTION (" + var14 + ")";
                }
                if (var13 == 2 &&
                  param0 == 2) {
                  var5 = var5 - var8;
                  var9 += 420;
                }
                if (this.field_d == 12 ||
                  this.field_d == 14 ||
                  15 == this.field_d ||
                  13 == this.field_d) {
                  stackIn_217_0 = (j.field_c <= 380) ? 0 : 1;
                  var10 = stackIn_217_0;
                }
                if (~param0 == ~this.field_d &&
                  !jk.a(-23322)) {
                  L83: {
                    if (2 != param0) {
                      if (var11 == 0) {
                        if ((!(this.field_K)) &&
                          ((var10 != 0)) &&
                          (!((320 - var6 / 2) >= j.field_c)) &&
                          (!(var6 / 2 + 320 <= j.field_c)) &&
                          (!(rb.field_m <= (7 + (-mk.field_L.field_y + var5)))) &&
                          (!(rb.field_m >= (-6 + mk.field_L.field_F + var5)))) {
                          this.field_t = var13;
                          this.field_u = true;
                        }
                      } else {
                        if (!this.field_K &&
                          var10 != 0 &&
                          dd.field_o[param0] == ja.field_h) {
                          if ((!(7 + (-mk.field_L.field_y + var5) > rb.field_m)) &&
                            (!(rb.field_m >= (30 + (var5 - mk.field_L.field_y) + 7)))) {
                            if (var13 == 0) {
                              if (var9 - 32 > j.field_c) {
                                break L83;
                              }
                              if (j.field_c >= 320) {
                                break L83;
                              }
                            } else {
                              if (j.field_c < 320) {
                                break L83;
                              }
                              if (j.field_c >= 600) {
                                break L83;
                              }
                            }
                            this.field_t = var13;
                            this.field_u = true;
                          }
                        } else {
                          if ((!(this.field_K)) &&
                            ((var10 != 0)) &&
                            (!(!ka.a(-mk.field_L.field_y + (var5 + 7), 0, 30, var8, -32 + var9)))) {
                            this.field_t = var13;
                            this.field_u = true;
                          }
                        }
                      }
                      break L83;
                    }
                    if ((var14 != 24 ||
                      !(this.a((byte) 123) < 0)) && (!this.field_K &&
                      var10 != 0 &&
                      j.field_c > -(var6 / 2) + 320 &&
                      j.field_c < 320 + var6 / 2 &&
                      rb.field_m > 7 + (var5 - mk.field_L.field_y) &&
                      rb.field_m < (-6 + (var5 + mk.field_L.field_F)))) {
                      if (0 != var13 && (!(j.field_c < 320) ||
                        var13 != 1)) {
                        if ((!(j.field_c <= 320)) &&
                          (var13 == 2)) {
                          this.field_t = var13;
                          this.field_u = true;
                        }
                      } else {
                        this.field_t = var13;
                        this.field_u = true;
                      }
                    }
                  }
                  if (~this.field_t == ~var13 &&
                    0 == this.field_j) {
                    var15 = 16776960;
                  }
                  if (this.field_d == 12 ||
                    14 == this.field_d ||
                    this.field_d == 15 ||
                    this.field_d == 13) {
                    if (this.field_t == var13 &&
                      this.field_j == 0) {
                      var15 = 16777215;
                    } else {
                      var15 = 16776960;
                    }
                  }
                }
                if (65793 == var15 &&
                  this.field_e < 256) {
                  var15 = 16776960;
                }
                if (var15 == 65793 &&
                  this.field_t == var13 &&
                  this.field_j == 0) {
                  si.c(42, -5 + (-wh.field_d.field_y + var5), 555, 24, 16776960);
                }
                if (var14 != 24) {
                  ((vm) ((Object) var12)).b(var16.toUpperCase(), var9, var5 - 5, var15, -1, this.field_e);
                  si.a(-16 + var9, var5 - 17, 8, 8, var15, this.field_e);
                } else {
                  if (param0 != 8 &&
                    this.a((byte) -108) < 0) {
                    stackIn_294_0 = 0;
                  } else {
                    stackIn_294_0 = 1;
                  }
                  var17 = stackIn_294_0;
                  this.a(26, (byte) -55, 365, 57, 530);
                  if (var17 != 0) {
                    if ((ca.field_c & 128) == 0) {
                      var15 = 16777215;
                    }
                    var18 = -8 + (320 - mk.field_L.a(var16.toUpperCase()) / 2);
                    mk.field_L.a(var16.toUpperCase(), 328, var5 - 5, var15, -1, this.field_e);
                    si.c(var18, var5 - 17, 8, 8, var15);
                  }
                }
                if (var14 == 12) {
                  var17 = -17 + var5;
                  var18 = wj.field_O << 1;
                  this.b(-18902, var18, var9 + li.field_p, var17);
                }
                if (var14 == 13) {
                  var17 = var5 - 17;
                  var18 = ga.field_b >> 1;
                  this.b(-18902, var18, li.field_p + var9, var17);
                }
                if (var11 == 0) {
                  var5 = var5 + var8;
                } else {
                  var9 = var9 + var8;
                }
              }
              var13++;
            }
          }
          if (decompiledFrameCompleted0) {
            stackIn_310_0 = ~var7;
            stackIn_310_1 = ~this.field_t;
          }
        }
        if (stackIn_310_0 != stackIn_310_1 &&
          0 <= this.field_t) {
          eh.field_c.a(lm.field_A[3], 100, uh.field_i);
        }
        var8 = 35 % ((param2 - 3) / 48);
        si.c();
        return;
    }

    final void h(int param0) {
        int var2;
        if (3 == this.field_d) {
        }
        if (wl.field_b) {
          this.f(-112);
        }
        this.l(param0 - 33);
        this.e((byte) -29);
        si.d();
        te.a(true);
        this.field_e = 256;
        this.a(430, 32, 32, -18, 608);
        if (param0 != 26) {
          return;
        }
        if (this.field_j > 0) {
          var2 = this.field_j;
          if (var2 > 256) {
            var2 = 512 - var2;
          }
          this.field_e = 256 - var2;
        }
        this.d(this.field_d, ij.field_F, 67);
        if (this.field_d == 3) {
          return;
        }
        if (13 != this.field_d &&
          12 != this.field_d &&
          this.field_d != 14 &&
          this.field_d != 15) {
          fb.a(32, 398, 11992, 32, 576);
          jn.a(100, Math.min(lk.field_H, 30), 0, 0);
        }
    }

    private final void c(int param0, int param1, int param2) {
        boolean stackIn_15_0 = false;
        boolean stackIn_18_1 = false;
        String[] stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        StringBuilder stackIn_21_2 = null;
        boolean stackIn_22_3 = false;
        boolean stackIn_25_4 = false;
        StringBuilder stackIn_27_2 = null;
        boolean stackIn_28_3 = false;
        boolean stackIn_31_4;
        int var4;
        String var5;
        String var6_ref_String;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        String var11;
        String var12;
        String var13;
        String var14;
        String var5Lifetime1;
        String var5Lifetime2;
        u.field_f[26] = jh.field_bb;
        mk.field_L.b(i.field_e.toUpperCase(), 320, 95, 16724736, -1);
        var4 = wl.b(25685);
        var12 = vg.a(new String[]{Integer.toString(var4)}, 74, bi.field_f);
        var5 = var12;
        var5Lifetime1 = var12;
        var5Lifetime2 = var12;
        if (0 < w.field_r) {
          if (hh.field_d >= rl.field_c) {
            var4 = sg.field_i / 50;
            var5Lifetime2 = var12 + "<br>" + oa.field_j + jh.a((byte) -80, var4);
            if (HostileSpawn.field_I) {
              var13 = var5Lifetime2 + "<br>" + vg.a(new String[]{Integer.toString(rl.field_c - hh.field_d)}, 50, vc.field_f);
              var4 = sg.field_i / 50;
              var5Lifetime2 = var13 + "<br>" + oa.field_j + jh.a((byte) -128, var4);
            }
          } else {
            var13 = var5Lifetime2 + "<br>" + vg.a(new String[]{Integer.toString(rl.field_c - hh.field_d)}, 50, vc.field_f);
            var4 = sg.field_i / 50;
            var5Lifetime2 = var13 + "<br>" + oa.field_j + jh.a((byte) -128, var4);
          }
        }
        if (w.field_r > 0) {
          var5Lifetime2 = var5Lifetime2 + "<br>" + vg.a(new String[]{"<col=ffffff>" + w.field_r + "</col>"}, 84, o.field_j);
        }
        if (sg.field_i >= 50) {
          var11 = sg.d(24);
          var6_ref_String = var11;
          if (var6_ref_String != null) {
            var5Lifetime2 = var5Lifetime2 + "<br>" + vg.a(new String[]{var11}, 95, ag.field_j);
          }
        }
        if (param1 == 9) {
          stackIn_15_0 = (w.field_r != 0);
          stackIn_18_1 = (ei.field_q.e(-20049)) ? false : true;
          if (wb.a(stackIn_15_0, stackIn_18_1, false, rg.a((byte) -117)) != null) {
            stackIn_21_0 = new String[]{ch.field_d.toLowerCase()};
            stackIn_21_1 = 74;
            stackIn_21_2 = new StringBuilder();
            stackIn_22_3 = (w.field_r == 0) ? false : true;
            stackIn_25_4 = (ei.field_q.e(-20049)) ? false : true;
            stackIn_27_2 = ((StringBuilder) (Object) stackIn_21_2).append(cj.a(wb.a(stackIn_22_3, stackIn_25_4, false, rg.a((byte) 121)), -51, '#')[0]).append(" ");
            stackIn_28_3 = (0 == w.field_r) ? false : true;
            stackIn_31_4 = (ei.field_q.e(-20049)) ? false : true;
            var14 = vg.a(stackIn_21_0, stackIn_21_1, ((StringBuilder) (Object) stackIn_27_2).append(cj.a(wb.a(stackIn_28_3, stackIn_31_4, false, rg.a((byte) 122)), -119, '#')[1]).toString());
            al.field_Z.a(var14.toUpperCase(), 70, 165, 500, -8 + (-164 + param2), 16711680, -1, 1, 2, 12);
          }
        }
        if (param0 > -29) {
          return;
        }
        var6 = 25;
        var7 = 260;
        var8 = 120;
        var9 = (-var7 + 640) / 2;
        var10 = 180;
        this.a(var8 + 16, (byte) -55, -8 + var10, var9 - 8, 16 + var7);
        wh.field_d.a(var5Lifetime2.toUpperCase(), var9, var10, var7, var8, 16776960, -1, 1, 1, var6);
        if (!ta.p(3)) {
          this.e(16777215, 340);
        }
        return;
    }

    final void b(int param0) {
        int var2;
        int var3;
        var3 = HostileSpawn.field_I ? 1 : 0;
        if (12 != this.field_f) {
          if (this.field_f == 13) {
            if (jh.field_ab == 0) {
              this.f((byte) 121);
            }
            qg.field_p = qg.field_p + 32;
            if (256 < qg.field_p) {
              qg.field_p = 256;
            }
            qi.b(qg.field_p, (byte) -99);
            if (var3 != 0) {
              if (uj.field_l == 0) {
                this.f((byte) 110);
              }
              uh.field_i = uh.field_i + 8;
              if (64 < uh.field_i) {
                uh.field_i = 64;
              }
              ed.a(uh.field_i, (byte) -108);
            }
          }
        } else {
          if (uj.field_l == 0) {
            this.f((byte) 110);
          }
          uh.field_i = uh.field_i + 8;
          if (64 < uh.field_i) {
            uh.field_i = 64;
          }
          ed.a(uh.field_i, (byte) -108);
        }
        if (this.field_d == 16) {
          this.field_t = 1;
        }
        if (this.field_d == 2) {
          if (this.a((byte) -106) >= 0) {
            this.field_t = 0;
            if (var3 != 0) {
              this.field_t = 1;
            }
          } else {
            this.field_t = 1;
          }
          if (this.field_C.field_b == 3) {
            this.field_t = 2;
          }
        }
        var2 = -73 / ((param0 - 9) / 63);
        if (this.field_d == 4) {
          if (5 != this.field_C.field_b) {
            this.field_t = this.field_t + 1;
            if (!(this.field_C.field_b > this.field_t)) {
              this.field_t = this.field_t - this.field_C.field_b;
              if (var3 != 0 &&
                4 > this.field_t) {
                this.field_t = this.field_t + 1;
                if (this.field_t >= 4) {
                  this.field_t = this.field_t - 4;
                }
              }
            }
          } else {
            if (4 > this.field_t) {
              this.field_t = this.field_t + 1;
              if (this.field_t >= 4) {
                this.field_t = this.field_t - 4;
              }
            }
          }
        }
        if (this.field_d == 6) {
          if (this.field_C.field_b != 3) {
            if (!(1 >= this.field_C.field_b)) {
              this.field_t = this.field_t + 1;
              if (!(this.field_t < this.field_C.field_b)) {
                this.field_t = 0;
                if (var3 != 0) {
                  this.field_t = 2;
                }
              }
            }
          } else {
            this.field_t = 2;
          }
        }
        if (this.field_d == 1 ||
          this.field_d == 7) {
          this.field_t = 0;
        }
        if (this.field_d == 12 ||
          this.field_d == 14 ||
          this.field_d == 15 ||
          13 == this.field_d ||
          11 == this.field_d ||
          this.field_d == 10) {
          this.field_t = this.field_t + 1;
          if (this.field_C.field_b <= this.field_t) {
            this.field_t = 0;
          }
        }
        if (this.field_d == 8) {
          this.field_t = 1;
        }
    }

    private final void a(int param0, byte param1, int param2, int param3, int param4) {
        int var6;
        if (param1 != -55) {
          this.field_o = 40;
        }
        var6 = this.field_e;
        if (this.field_s == 17 ||
          this.field_d == 17) {
          var6 = 256;
        }
        si.a(param3, param2, param4, param0, 0, 160 * var6 / 256);
        this.a(-1 + (param0 + param2), param2, param3, -18, -1 + param3 + param4);
    }

    private final void i(int param0, int param1) {
        if (30000 > uk.field_e) {
          uk.field_e = uk.field_e + 1;
        }
        if (param1 != 17691) {
          String var4 = (String) null;
          this.a(2, 78, 7, (String) null, false, -14);
        }
    }

    private final void h(int param0, int param1) {
        if (param1 != -4) {
          this.h(115);
        }
    }

    private final void g(int param0, int param1) {
        String stackIn_50_0 = null;
        int var3;
        String var4;
        String var5;
        String var6;
        int var7;
        int var8;
        int var9;
        String var10;
        String var11;
        String var12;
        String var13;
        String var14;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        String var5Lifetime1;
        String var5Lifetime2;
        String var5Lifetime3;
        String var5Lifetime4;
        this.a((byte) -103, ad.field_d);
        var3 = 2;
        if (null == this.field_H) {
          this.field_H = new bd(ln.field_a.field_d * var3, var3 * ln.field_a.field_a);
          this.field_H.a();
          am.field_d.a(4, var3);
          o.field_n.b((byte) 113);
        }
        this.a(150, (byte) -55, 70, 52, 304);
        this.a(150, (byte) -55, 70, 364, 220);
        this.a(176, (byte) -55, 228, 52, 304);
        this.a(176, (byte) -55, 228, 364, 220);
        si.d(367, 73, 581, 217);
        this.field_H.e(364 + -mm.field_m[0].field_j.field_e * var3 + 110, -mm.field_m[0].field_j.field_g * var3 + 150);
        if ((ca.field_c & 128) <= 0) {
          si.f(var3 / 2 + 152, 128 - (-(var3 / 2) - 1), 4, 65535, 128);
          si.f(var3 / 2 + 152, 128 + (var3 / 2 + 1), 3, 65535, 128);
          si.f(1 + var3 / 2 + 151, 128 + (var3 / 2 + 1), 2, 16777215, 64);
          si.b(152 + var3 / 2, var3 / 2 + 128 + 1, 4, 0);
          if (HostileSpawn.field_I) {
            si.f(var3 / 2 + 152, 1 + (var3 / 2 + 128), 4, 16777215, 128);
            si.f(var3 / 2 + 151 + 1, var3 / 2 + 129, 3, 16777215, 128);
            si.f(151 + var3 / 2 + 1, 128 + (var3 / 2 + 1), 2, 16777215, 64);
            si.b(152 + var3 / 2, 1 + (var3 / 2 + 128), 4, 0);
          }
        } else {
          si.f(var3 / 2 + 152, 1 + (var3 / 2 + 128), 4, 16777215, 128);
          si.f(var3 / 2 + 151 + 1, var3 / 2 + 129, 3, 16777215, 128);
          si.f(151 + var3 / 2 + 1, 128 + (var3 / 2 + 1), 2, 16777215, 64);
          si.b(152 + var3 / 2, 1 + (var3 / 2 + 128), 4, 0);
        }
        si.c();
        var4 = "Missing text";
        if (bm.field_c == 0) {
          if (0 == rl.field_c) {
            var4 = pk.field_j;
          }
          if (1 == rl.field_c) {
            var4 = vg.field_b;
          }
          if (rl.field_c == 2) {
            var4 = wi.field_a;
            if (r.field_a != 1) {
              var4 = ie.field_a;
            }
          }
          if (rl.field_c == 3) {
            var4 = cb.field_h;
          }
          if (4 == rl.field_c) {
            var4 = jg.field_k;
            if (r.field_a != 1) {
              var4 = ph.field_B;
            }
          }
          if (rl.field_c == 5) {
            var4 = id.field_b;
            if (kh.field_U[0] == 5 ||
              5 == kh.field_U[1]) {
              var4 = od.field_E;
              if (0 >= kh.field_ib[2]) {
                var4 = g.field_O;
              }
            }
          }
          if (rl.field_c == 6) {
            var4 = ld.field_q;
          }
          if (rl.field_c == 7) {
            var4 = rg.field_c;
          }
          if (rl.field_c == 8) {
            var4 = cn.field_c;
            if (0 == r.field_a) {
              var4 = kc.field_b;
            }
          }
          if (9 == rl.field_c) {
            var4 = dn.field_g;
            var5 = var4;
            var4 = var5;
            var5Lifetime4 = var4;
            var4 = var5Lifetime4;
          }
        }
        if (null != q.field_g) {
          var5Lifetime1 = q.field_g.a(false);
          if (var5Lifetime1 != null) {
            var4 = var5Lifetime1;
          }
        }
        if (rl.field_c >= 9) {
          stackIn_50_0 = fh.field_d + (rl.field_c + 1);
        } else {
          stackIn_50_0 = fh.field_d + '0' + (1 + rl.field_c);
        }
        var11 = stackIn_50_0;
        var5Lifetime2 = var11;
        String dupTemp$0 = var11.toUpperCase();
        var10 = dupTemp$0;
        var5Lifetime3 = dupTemp$0;
        var6 = var10 + "  <col=ffffff>" + kh.field_fb[bm.field_c][rl.field_c].toUpperCase() + "</col>";
        var7 = 62;
        var7 = var7 + 16 * wh.field_d.a(var6, 60, var7, 288, 146, 16776960, -1, 0, 0, 16);
        var7 += 8;
        var12 = var4.toUpperCase();
        al.field_Z.a(var12, 60, var7, 288, 150, 16776960, -1, 0, 0, 12);
        var8 = ng.field_u / 50;
        var9 = 60;
        var7Lifetime1 = 212;
        if (param0 != 152) {
          return;
        }
        var13 = c.field_e.toUpperCase() + jh.a((byte) -66, var8);
        wh.field_d.c(var13, var9, var7Lifetime1, 16776960, -1);
        if (rl.field_c >= 0 &&
          rl.field_c < ub.field_a[bm.field_c].length) {
          var8Lifetime1 = ub.field_a[bm.field_c][rl.field_c];
          var14 = ki.field_d.toUpperCase() + jh.a((byte) -105, var8Lifetime1);
          var9Lifetime1 = 348;
          wh.field_d.a(var14, var9Lifetime1, var7Lifetime1, 16776960, -1);
        }
        this.a(220, 228, (byte) 56, 364, 176);
        return;
    }

    private final int a(String param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        String var5 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = 20;
          if (si.field_j <= (var4_int + param2) &&
            param2 <= si.field_a) {
            wh.field_d.c(param0.toUpperCase(), 96, 35 + param2, 16776960, -1);
          }
          param2 = param2 + var4_int;
          if (param1 <= 56) {
            var5 = (String) null;
            re.a((String) null, (String) null, (String) null, 41);
          }
          stackIn_6_0 = param2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("re.W(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void f(int param0, int param1) {
        int stackIn_5_0 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        nc var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        String var20 = null;
        String var21 = null;
        String var22 = null;
        String var23 = null;
        String var24 = null;
        String var25 = null;
        var16 = HostileSpawn.field_I ? 1 : 0;
        u.field_f[26] = jf.field_e;
        if (bm.field_c != 0) {
          stackIn_5_0 = (ng.field_k) ? 2 : 1;
        } else {
          stackIn_5_0 = 0;
        }
        var3 = stackIn_5_0;
        uf.field_g[var3].b(0, 0);
        if (param0 <= 112) {
          return;
        }
        if (uk.field_e > 150 &&
          2 != ig.field_L) {
          var4 = Math.min(480, 4 * (uk.field_e - 150));
          var5 = 355;
          var6 = 274;
          var7 = 10;
          var8 = 460;
          var9 = var5 + var6 / 2;
          var10 = 38 + var7;
          si.a(var5, var7, var6, var8, 0, 160 * var4 / 480);
          si.d(0, 0, 640, var4);
          this.a(1 + var7 + var8, var7 - 2, var5 - 2, -18, 1 + var5 + var6);
          mk.field_L.b(dl.field_p, var9, var10, 16777215, -1);
          var10 += 38;
          var12 = wh.field_d;
          var13 = 16776960;
          var17 = vg.a(new String[]{Integer.toString(wl.b(25685))}, 30, bi.field_f).toUpperCase();
          ((vm) ((Object) var12)).b(var17, var9, var10, var13, -1);
          var18 = vg.a(new String[]{Integer.toString(10 - hh.field_d)}, 28, vc.field_f).toUpperCase();
          var10 += 26;
          ((vm) ((Object) var12)).b(var18, var9, var10, var13, -1);
          var19 = md.field_m + jh.a((byte) -67, sg.field_i / 50);
          var10 += 26;
          var20 = var19.toUpperCase();
          var11 = var20;
          ((vm) ((Object) var12)).b(var20, var9, var10, var13, -1);
          var10 += 26;
          var14 = 0;
          var15 = hh.field_d;
          while (true) {
            if (var15 < 10) {
              var14 = var14 + ub.field_a[bm.field_c][var15];
              var15++;
              if (var16 == 0) {
                continue;
              }
            } else {
              var21 = ki.field_d + jh.a((byte) -78, var14);
              var22 = var21.toUpperCase();
              ((vm) ((Object) var12)).b(var22, var9, var10, var13, -1);
              var23 = vg.a(new String[]{"<col=ffffff>" + w.field_r + "</col>"}, 67, o.field_j.toUpperCase());
              var10 += 36;
              mk.field_L.b(var23, var9, var10, var13, -1);
              var11 = sg.d(24);
              var10 += 36;
            }
            if (var11 != null) {
              var24 = vg.a(new String[]{var11}, 65, ag.field_j).toUpperCase();
              if ((-4 + var6) < mk.field_L.a(var24)) {
                wh.field_d.a(var24, var5 + 4, var10 - 35, var6 - 8, 100, var13, -1, 1, 0, 18);
                if (var16 != 0) {
                  mk.field_L.b(var24, var9, var10 + 8, var13, -1);
                }
              } else {
                mk.field_L.b(var24, var9, var10 + 8, var13, -1);
              }
              var10 += 36;
            }
            ne.a(24, 280, var9);
            if (!om.field_b) {
              if (ln.field_b[bm.field_c]) {
                break;
              }
              var25 = am.field_a.toUpperCase();
              ((vm) ((Object) var12)).a(var25, -130 + var9, 340, 260, 80, var13, -1, 1, 0, 24);
            }
            break;
          }
        }
    }

    private final void a(int param0, int param1) {
        if (param1 != -25345) {
          this.field_b = (le[]) null;
        }
    }

    private final void a(byte param0, int param1) {
        boolean stackIn_15_0 = false;
        int stackIn_24_0 = 0;
        boolean stackOut_14_0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = HostileSpawn.field_I ? 1 : 0;
        this.field_F.a(true, true);
        var3 = this.field_J;
        this.field_J = -1;
        if (param0 != -125) {
          this.h((byte) -70);
        }
        if (jj.field_g > this.field_F.field_Ib.field_tb) {
          this.field_F.field_Ib.field_tb = this.field_F.field_Ib.field_tb + 8;
          if (!(jj.field_g >= this.field_F.field_Ib.field_tb)) {
            this.field_F.field_Ib.field_tb = jj.field_g;
            if ((var5 != 0) &&
              (jj.field_g < this.field_F.field_Ib.field_tb)) {
              this.field_F.field_Ib.field_tb = this.field_F.field_Ib.field_tb - 8;
              if (jj.field_g > this.field_F.field_Ib.field_tb) {
                this.field_F.field_Ib.field_tb = jj.field_g;
              }
            }
          }
        } else {
          if (jj.field_g < this.field_F.field_Ib.field_tb) {
            this.field_F.field_Ib.field_tb = this.field_F.field_Ib.field_tb - 8;
            if (jj.field_g > this.field_F.field_Ib.field_tb) {
              this.field_F.field_Ib.field_tb = jj.field_g;
            }
          }
        }
        boolean decompiledFrameCompleted0 = true;
        if (ka.a(286, 0, 100, 496, 72)) {
          var4 = 0;
          while (42 > var4) {
            stackOut_14_0 = hb.a(var4, mc.field_E, false);
            stackIn_24_0 = stackOut_14_0 ? 1 : 0;
            stackIn_15_0 = stackOut_14_0;
            if (var5 != 0) {
              decompiledFrameCompleted0 = false;
              break;
            }
            if ((!stackIn_15_0 ||
              var5 != 0) &&
              this.field_b[var4].field_S) {
              this.field_J = var4;
              break;
            }
            var4++;
          }
        }
        if (decompiledFrameCompleted0) {
          stackIn_24_0 = 1;
        }
        boolean decompiledFrameRemainder1 = true;
        boolean decompiledFrameRemainder0 = true;
        if (stackIn_24_0 == pf.field_o) {
          if (this.field_x >= 0 ||
            0 <= this.field_J) {
            eh.field_c.a(lm.field_A[4], 100, uh.field_i);
          }
          if (~this.field_J != ~this.field_x) {
            this.field_x = this.field_J;
            decompiledFrameRemainder1 = (var5 != 0);
          }
          if (decompiledFrameRemainder1) {
            this.field_x = -1;
            decompiledFrameRemainder0 = (var5 != 0);
          }
        }
        if (((decompiledFrameRemainder1) && (decompiledFrameRemainder0) && (this.field_J >= 0)) &&
          (decompiledFrameRemainder1 = (var3 != this.field_J))) {
          eh.field_c.a(lm.field_A[3], 100, uh.field_i);
        }

    }

    private final void a(int param0, byte param1, int param2) {
        int stackIn_57_0 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        var9 = HostileSpawn.field_I ? 1 : 0;
        if (this.field_C == null) {
          return;
        }
        var4 = 0;
        var4 = var4 * 2;
        if (256 < var4) {
          var4 = 256;
        }
        if (param1 > -6) {
          this.h(46, 16);
        }
        var5 = this.field_t;
        if (this.field_t != var5 &&
          this.field_t >= 0) {
          eh.field_c.a(lm.field_A[3], 100, uh.field_i);
        }
        if (this.field_d == param0) {
          boolean decompiledFrameRemainder10 = true;
          boolean decompiledFrameRemainder9 = true;
          boolean decompiledFrameRemainder8 = true;
          boolean decompiledFrameRemainder7 = true;
          boolean decompiledFrameRemainder6 = true;
          boolean decompiledFrameRemainder5 = true;
          var8 = param0;
          if (var8 != 10 &&
            var8 != 9) {
            decompiledFrameRemainder6 = (var8 != 12 ||
              var9 != 0);
            if (((decompiledFrameRemainder6) &&
              (decompiledFrameRemainder6 = (var8 != 14)) &&
              (decompiledFrameRemainder6 = (15 != var8))) &&
              (decompiledFrameRemainder7 = (var8 != 11 ||
              var9 != 0)) &&
              (decompiledFrameRemainder8 = (var8 != 13 ||
              var9 != 0)) &&
              (decompiledFrameRemainder9 = (var8 != 3))) {
              boolean decompiledFrameRemainder4 = true;
              boolean decompiledFrameRemainder3 = true;
              boolean decompiledFrameRemainder2 = true;
              boolean decompiledFrameRemainder1 = true;
              boolean decompiledFrameRemainder0 = true;
              if (var8 == 0 &&
                var9 == 0) {
                this.h(param2, -4);
                decompiledFrameRemainder10 = false;
              } else {
                if ((5 != var8) &&
                  (decompiledFrameRemainder0 = (4 != var8 ||
                  var9 != 0)) &&
                  (decompiledFrameRemainder1 = (var8 != 2 ||
                  var9 != 0)) &&
                  (decompiledFrameRemainder2 = (8 != var8)) &&
                  (decompiledFrameRemainder3 = (var8 != 6 ||
                  var9 != 0)) &&
                  (decompiledFrameRemainder10 = (var8 != 1)) &&
                  (decompiledFrameRemainder10 = (var8 != 7 ||
                  var9 != 0)) &&
                  (decompiledFrameRemainder10 = (var8 == 16))) {
                  decompiledFrameRemainder4 = (var9 != 0);
                  decompiledFrameRemainder5 = !(decompiledFrameRemainder4);
                }
              }
              if ((decompiledFrameRemainder10) &&
                (decompiledFrameRemainder5) &&
                (decompiledFrameRemainder4) &&
                (decompiledFrameRemainder3) &&
                (decompiledFrameRemainder2) &&
                (decompiledFrameRemainder1) &&
                (decompiledFrameRemainder0)) {
                this.b(param2, -27961);
                decompiledFrameRemainder10 = (var9 != 0);
              }
              if ((decompiledFrameRemainder10) &&
                (decompiledFrameRemainder5) &&
                (decompiledFrameRemainder4) &&
                (decompiledFrameRemainder3) &&
                (decompiledFrameRemainder2) &&
                (decompiledFrameRemainder1)) {
                this.d(3);
                decompiledFrameRemainder10 = (var9 != 0);
              }
              if ((decompiledFrameRemainder10) &&
                (decompiledFrameRemainder5) &&
                (decompiledFrameRemainder4) &&
                (decompiledFrameRemainder3) &&
                (decompiledFrameRemainder2)) {
                this.c(param2, -10099);
                decompiledFrameRemainder10 = (var9 != 0);
              }
              if ((decompiledFrameRemainder10) &&
                (decompiledFrameRemainder5) &&
                (decompiledFrameRemainder4) &&
                (decompiledFrameRemainder3)) {
                this.b((byte) -123);
                decompiledFrameRemainder10 = (var9 != 0);
              }
              if ((decompiledFrameRemainder10) &&
                (decompiledFrameRemainder5) &&
                (decompiledFrameRemainder4)) {
                this.a((byte) -125, param2);
                decompiledFrameRemainder10 = (var9 != 0);
              }
              if ((decompiledFrameRemainder10) &&
                (decompiledFrameRemainder5)) {
                this.b(false);
                return;
              }
            }
          }
          if ((decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9) &&
            (decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6)) {
            this.a(89, param0, param2);
            decompiledFrameRemainder10 = (var9 != 0);
          }
          if ((decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9) &&
            (decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7)) {
            this.i(param2, 17691);
            decompiledFrameRemainder10 = (var9 != 0);
          }
          if ((decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9) &&
            (decompiledFrameRemainder8)) {
            this.a(param2, -25345);
            decompiledFrameRemainder10 = (var9 != 0);
          }
          if ((decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9)) {
            this.i(param2, 17691);
            decompiledFrameRemainder10 = (var9 != 0);
          }
          if (decompiledFrameRemainder10) {
            stackIn_57_0 = (pf.a(-124)) ? 0 : 1;
            var6 = stackIn_57_0;
            var7 = dh.field_a.a(-1, var6 != 0);
            if (3 == var7) {
              this.field_s = 0;
              this.field_j = 1;
            }
            if (var7 == 1) {
              this.field_s = 0;
              this.field_j = 1;
            }
            if (var7 == 2) {
              this.field_j = 1;
              this.field_s = 0;
            }
            return;
          }
        }
        return;
    }

    private final void a(byte param0, int param1, bd param2, int param3) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = HostileSpawn.field_I ? 1 : 0;
        try {
          var5_int = (int)((double)ch.field_q / 2.0);
          var6 = this.field_e;
          if (this.field_d == 17 ||
            this.field_s == 17) {
            var6 = 256;
          }
          if (param0 != 50) {
            return;
          }
          if (var5_int > 10) {
            param2.b(param1, param3, var6);
            if (var11 == 0) {
              return;
            }
          }
          var7 = var5_int - 5;
          if (0 > var7) {
            var7 = 5 + var7;
            if (var11 != 0) {
              var7 = -var7 + 5;
            }
          } else {
            var7 = -var7 + 5;
          }
          var7 = (int)((double)var7 * 1.5);
          var8 = param2.field_A;
          var9 = 0;
          while (var8 > var9) {
            si.d(0, var9 + param3, 640, var9 + (param3 + 1));
            var10 = (int)(Math.random() * (double)var7);
            if (var11 != 0) {
              return;
            }
            if (Math.random() < 0.5) {
              var10 = -var10;
            }
            param2.b(var10 + param1, param3, var6);
            param2.c(var10 + param1, param3, (int)(8.0 * (Math.random() * (double)var7) * (double)var6 / 256.0));
            var9++;
          }
          si.c();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_23_0 = var5;
          stackIn_23_1 = new StringBuilder().append("re.JB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param3).append(')').toString());
        }
    }

    private final void i(int param0) {
        le var2_ref = null;
        if (0 > rl.field_c) {
          return;
        }
        Object var2 = null;
        if (null == this.field_G) {
          var2_ref = new le(-1L, (le) null);
        } else {
          var2_ref = this.field_G.field_Ib;
        }
        var2_ref.field_fb = f.field_a[bm.field_c][rl.field_c];
        if (om.field_b) {
          var2_ref.field_fb = f.field_a[bm.field_c][10];
        }
        var2_ref.field_fb = var2_ref.field_fb.toUpperCase();
        var2_ref.field_T = 16776960;
        var2_ref.field_R = 15;
        var2_ref.field_qb = 220;
        var2_ref.field_ab = (vm) ((Object) al.field_Z);
        var2_ref.field_L = 4;
        var2_ref.field_sb = Math.max(141, var2_ref.field_ab.b(var2_ref.field_fb, var2_ref.field_qb - 2 * var2_ref.field_L, var2_ref.field_R));
        this.a(false);
        le var3 = new le(-1L, (le) null);
        var3.field_qb = 41 + var2_ref.field_qb;
        var3.field_sb = 140;
        this.field_G = new th(-1L, var2_ref, var3, this.field_z);
        this.field_G.field_qb = var3.field_qb;
        if (param0 <= 100) {
          field_D = (bd[][]) null;
        }
        this.field_G.field_sb = 140;
        this.field_G.field_zb = 216;
        this.field_G.field_tb = 324;
        this.field_G.a(16, 16, (byte) -123);
        this.field_G.a(true, true);
    }

    private final void b(boolean param0) {
        if (param0) {
          this.j(118);
        }
    }

    private final void l(int param0) {
        if (~this.field_d == param0) {
          if (null == this.field_F) {
            this.e(-18);
            if (HostileSpawn.field_I) {
              this.field_F = null;
            }
          }
        } else {
          this.field_F = null;
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
        si.a(-3 + param2, param3 - 3, 174, 13, 0, this.field_e);
        si.d(0, 0, param2 + 160 * param1 / 128, 480);
        si.a(param2, param3, 160, 8, 4210688, this.field_e);
        this.field_m = -param2 + (-2 + j.field_c);
        si.c();
        if (param0 != -18902) {
          this.field_g = -42;
        }
        si.a(param1 * 160 / 128 + param2, param3, 8, 8, 14408449, this.field_e);
    }

    final void a(int param0, int param1, int param2, int param3) {
        int fieldTemp$0 = 0;
        int stackIn_50_0 = 0;
        float var5;
        int var6;
        int var7;
        int var8;
        int var9;
        float var5Lifetime1;
        float var5Lifetime2;
        float var5Lifetime3;
        float var5Lifetime4;
        float var5Lifetime5;
        var9 = HostileSpawn.field_I ? 1 : 0;
        if ((7 & em.field_c) == 0) {
          f.a((byte) 119);
          if (0 >= this.field_j) {
            kc.field_c = 16;
            if (var9 != 0) {
              kc.field_c = 0;
            }
          } else {
            kc.field_c = 0;
          }
          if (kc.field_c <= lk.field_H) {
            if (!(lk.field_H <= kc.field_c)) {
              lk.field_H = lk.field_H - 1;
              if (var9 != 0) {
                lk.field_H = lk.field_H + 1;
              }
            }
          } else {
            lk.field_H = lk.field_H + 1;
          }
          f.a((byte) 119);
          if (null != ec.field_b) {
            eh.field_c.a(ec.field_b);
            ec.field_b = null;
          }
          if (null != q.field_i) {
            eh.field_c.a(q.field_i);
            q.field_i = null;
          }
          if (null != e.field_l) {
            eh.field_c.a(e.field_l);
            e.field_l = null;
          }
        }
        ag.field_w = 30.0f;
        vb.field_Jb = 0.8999999761581421f;
        qm.field_O = 0.5f;
        ea.field_d = 0.5f;
        vc.field_a = 0.30000001192092896f;
        an.field_n = 0.20000000298023224f;
        var5 = kd.field_v.j();
        if (vc.field_a != var5) {
          kd.field_v.d(ua.a((byte) -67, vc.field_a, var5, 0.07000000029802322f));
        }
        var5Lifetime1 = kd.field_v.h();
        if (var5Lifetime1 != qm.field_O) {
          kd.field_v.f(ua.a((byte) -68, qm.field_O, var5Lifetime1, 0.07000000029802322f));
        }
        var5Lifetime2 = kd.field_v.f();
        if (param3 != -99) {
          return;
        }
        if (var5Lifetime2 != ea.field_d) {
          kd.field_v.b(ua.a((byte) -54, ea.field_d, var5Lifetime2, 0.009999999776482582f));
        }
        var5Lifetime3 = kd.field_v.g();
        if (var5Lifetime3 != ag.field_w) {
          kd.field_v.e(ua.a((byte) -40, ag.field_w, var5Lifetime3, 1.0f));
        }
        var5Lifetime4 = kd.field_v.k();
        if (an.field_n != var5Lifetime4) {
          kd.field_v.c(ua.a((byte) -108, an.field_n, var5Lifetime4, 0.009999999776482582f));
        }
        var5Lifetime5 = kd.field_v.e();
        if (vb.field_Jb != var5Lifetime5) {
          kd.field_v.a(ua.a((byte) -114, vb.field_Jb, var5Lifetime5, 0.009999999776482582f));
        }
        fieldTemp$0 = ch.field_q + 1;
        ch.field_q = ch.field_q + 1;
        if (fieldTemp$0 > 50 &&
          Math.random() < 0.005) {
          ch.field_q = 0;
        }
        if (wl.field_b) {
          this.f(param3 ^ 31);
        }
        this.l(-7);
        this.e((byte) -29);
        if (~this.field_a != ~param2 ||
          param1 != this.field_o ||
          this.field_y != param0 ||
          ll.field_c != 0) {
          this.field_K = false;
          this.field_o = param1;
          this.field_a = param2;
          this.field_y = param0;
        }
        this.a(this.field_d, (byte) -86, ij.field_F);
        if (this.field_d == 0 &&
          dd.field_o[this.field_d].length == 9) {
          stackIn_50_0 = 26;
        } else {
          stackIn_50_0 = 30;
        }
        var6 = stackIn_50_0;
        var7 = 432 - var6 * this.field_C.field_b;
        if (this.field_d == 3) {
          var7 = 448;
        }
        ij.field_F = var7;
        if (!this.field_c) {
          if (0 < this.field_p) {
            this.field_p = this.field_p - 16;
          }
        } else {
          this.field_p = this.field_p + 16;
          if (256 < this.field_p) {
            of.field_h = null;
            mc.field_I = 1;
            hg.field_e = 1;
            jf.field_c = 128;
            le.field_D = 0;
            return;
          }
        }
        if (this.field_d == 1 ||
          this.field_d == 7) {
          this.field_h.a(true, true);
          if (this.field_h.f(2) ||
            gf.field_i == 98) {
            this.field_v = this.field_v - 20;
          }
          if (this.field_h.j(0) ||
            gf.field_i == 99) {
            this.field_v = this.field_v + 20;
          }
          if (ll.field_c != 0) {
            this.field_v = this.field_v + ll.field_c * 20;
          }
          if (this.field_h.g(-1) ||
            gf.field_i == 102 ||
            104 == gf.field_i) {
            this.field_v = this.field_v - 128;
          }
          if (this.field_h.c(false) ||
            103 == gf.field_i ||
            gf.field_i == 105) {
            this.field_v = this.field_v + 128;
          }
          if (gf.field_i == 102) {
            this.field_v = 0;
          }
          if (gf.field_i == 103) {
            this.field_v = this.field_g;
          }
          if (this.field_g - 304 < this.field_v) {
            this.field_v = -304 + this.field_g;
          }
          if (this.field_v < 0) {
            this.field_v = 0;
          }
          if (this.field_h.h(-24467)) {
            this.field_v = this.field_h.a(this.field_g, (byte) 126, 304);
          }
          gf.field_i = -1;
          this.field_h.a(this.field_g, 0, 304, this.field_v);
        }
        if (0 < this.field_j) {
          this.field_j = this.field_j + 16;
          if (this.field_j == 257) {
            var8 = this.field_s;
            if (this.field_s == 0 &&
              !ta.p(3) &&
              0 >= wb.field_S) {
            }
            this.field_s = this.field_d;
            this.field_d = var8;
            if (this.field_d == 0) {
            }
            this.field_C.field_b = dd.field_o[this.field_d].length;
            if (8 == this.field_d && (this.field_s == 2 ||
              this.field_s == 0)) {
              if (rl.field_c < 0) {
                rl.field_c = 0;
              }
              ta.a((byte) 2, rl.field_c);
            }
            if (this.field_d == 4) {
              hg.field_e = 0;
            }
            if (this.field_d == 6) {
              hg.field_e = 0;
            }
            if (this.field_t >= this.field_C.field_b) {
              this.field_t = -1 + this.field_C.field_b;
            }
          }
          if (512 <= this.field_j) {
            this.field_j = 0;
          }
        }
        if (this.field_t >= 0 &&
          dd.field_o[this.field_d].length > this.field_t) {
          this.field_f = dd.field_o[this.field_d][this.field_t];
        }
        if (param0 == 1 &&
          this.field_f > -1 &&
          this.field_u) {
          if (uj.field_l == 1) {
            eh.field_c.a(lm.field_A[4], 100, uh.field_i);
          }
          this.a((byte) 111, true);
          if (var9 == 0) {
            return;
          }
        }
        if (ig.field_L == 1 &&
          this.field_f > -1 &&
          this.field_u && (this.field_f == 12 ||
          this.field_f == 13)) {
          this.a((byte) 121, true);
          return;
        }
        return;
    }

    final static void a(int param0, vh param1, int param2, int param3, int param4, vh param5) {
        try {
          al.field_N = param1;
          ab.field_b = param2;
          jd.field_l = param4;
          if (param0 != 4) {
            field_D = (bd[][]) null;
          }
          tk.field_c = param5;
          cl.field_l = param3;
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "re.IB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    private final void b(int param0, int param1) {
        if (param1 != -27961) {
          this.j((byte) 93);
        }
    }

    final static String a(String param0, String param1, String param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        String stackIn_7_0 = null;
        var5 = HostileSpawn.field_I ? 1 : 0;
        if (param3 >= -106) {
          field_q = (bd) null;
        }
        var4 = param0.indexOf(param1);
        while (-1 != var4) {
          param0 = param0.substring(0, var4) + param2 + param0.substring(var4 + param1.length());
          stackIn_7_0 = (String) (param0);
          if (var5 != 0) {
            return stackIn_7_0;
          }
          var4 = ((String) (Object) stackIn_7_0).indexOf(param1, param2.length() + var4);
        }
        return param0;
    }

    private final void g(int param0) {
        le var3 = null;
        le var4 = null;
        le var5 = null;
        bd var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        le var11 = null;
        var10 = HostileSpawn.field_I ? 1 : 0;
        var11 = new le(0L, (le) null);
        if (param0 != 12169) {
          this.b((byte) -30);
        }
        var3 = new le(0L, (le) null);
        var4 = new le(0L, (le) null);
        var5 = new le(0L, (le) null);
        var6 = new bd(16, 16);
        var6.a();
        var7 = 2;
        var8 = 6;
        var9 = 12;
        do {
          if (var9 <= 0) {
            var11.field_pb = var6;
            o.field_n.b((byte) -47);
            var3.field_pb = var6.h();
            var3.field_pb.f();
            var5.field_Bb = oa.field_m;
            var5.field_nb = oa.field_m;
            o.field_n.b((byte) -31);
            this.field_h = new fj(0L, var11, var3, var4, var5);
            break;
          }
          si.a(var7, var8, var9, 16776960);
          var7++;
          var8--;
          var9 -= 2;
        } while (var10 == 0);
        if (this.field_s != 1 &&
          this.field_s != 7) {
          return;
        }
        this.field_h.a(559, 16, this.field_v, 20, 83, 310, 307, this.field_g);
        return;
    }

    final void f(int param0) {
        int[][] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int[] stackIn_9_2 = null;
        int[][] stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int[] stackIn_15_2 = null;
        int[][] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int[] stackIn_19_2 = null;
        int var2;
        if (ta.p(3)) {
          return;
        }
        if (ib.a((byte) -72) &&
          null != gi.field_h) {
          oc.field_h[1][0] = gi.field_h.a("level_01.dat", "", 0);
          oc.field_h[1][1] = gi.field_h.a("level_02.dat", "", 0);
          oc.field_h[1][2] = gi.field_h.a("level_03.dat", "", 0);
          oc.field_h[1][3] = gi.field_h.a("level_04.dat", "", 0);
          oc.field_h[1][4] = gi.field_h.a("level_05.dat", "", 0);
          oc.field_h[1][5] = gi.field_h.a("level_06.dat", "", 0);
          oc.field_h[1][6] = gi.field_h.a("level_07.dat", "", 0);
          oc.field_h[1][7] = gi.field_h.a("level_08.dat", "", 0);
          oc.field_h[1][8] = gi.field_h.a("level_09.dat", "", 0);
          oc.field_h[1][9] = gi.field_h.a("level_10.dat", "", 0);
          gi.field_h = null;
        }
        dd.field_o[4] = bh.field_j;
        dd.field_o[15] = nm.field_c;
        dd.field_o[13] = nm.field_c;
        dd.field_o[10] = nm.field_c;
        stackIn_8_0 = dd.field_o;
        stackIn_8_1 = 10;
        if (!om.field_b) {
          stackIn_9_2 = ja.field_h;
        } else {
          stackIn_9_2 = nm.field_c;
        }
        stackIn_8_0[stackIn_8_1] = stackIn_9_2;
        var2 = 0;
        if (ib.a((byte) -72)) {
          if (this.field_d == 2) {
            this.h((byte) 33);
          }
          stackIn_14_0 = dd.field_o;
          stackIn_14_1 = 2;
          if (var2 != 0) {
            stackIn_15_2 = ob.field_e;
          } else {
            stackIn_15_2 = r.field_d;
          }
          stackIn_14_0[stackIn_14_1] = stackIn_15_2;
          dd.field_o[0] = wl.field_d;
          dd.field_o[5] = eh.field_f;
          if (HostileSpawn.field_I) {
            stackIn_18_0 = dd.field_o;
            stackIn_18_1 = 2;
            if (var2 != 0) {
              stackIn_19_2 = j.field_b;
            } else {
              stackIn_19_2 = HostileSpawn.field_K;
            }
            stackIn_18_0[stackIn_18_1] = stackIn_19_2;
          }
        } else {
          stackIn_18_0 = dd.field_o;
          stackIn_18_1 = 2;
          if (var2 != 0) {
            stackIn_19_2 = j.field_b;
          } else {
            stackIn_19_2 = HostileSpawn.field_K;
          }
          stackIn_18_0[stackIn_18_1] = stackIn_19_2;
        }
        dd.field_o[6] = td.field_d;
        if (ib.a((byte) -72)) {
          dd.field_o[6] = ak.field_c;
          dd.field_o[4] = oj.field_y;
        }
        this.field_C.field_b = dd.field_o[this.field_d].length;
        sg.field_j = wk.a(4, -2178);
        vf.k(-8255);
        sa.a(5);
        if (9 == this.field_d) {
          if (rg.a((byte) -95)) {
          }
          if (this.field_d == 9) {
            this.field_d = 10;
          }
        }
        if (this.field_d == 14) {
          this.field_d = 12;
          if (wb.field_S <= 0) {
            this.field_d = 15;
          }
        }
        this.field_C.field_b = dd.field_o[this.field_d].length;
        if (param0 >= -100) {
          return;
        }
        wl.field_b = false;
    }

    final void f(byte param0) {
        if (param0 <= 57) {
          this.b(true);
        }
        if (this.field_f == -1) {
          this.d((byte) 101);
          if (HostileSpawn.field_I) {
            this.a((byte) 116, false);
            this.field_t = 0;
          }
        } else {
          this.a((byte) 116, false);
          this.field_t = 0;
        }
    }

    private final void d(int param0) {
        ic var2 = null;
        if (!ta.p(param0)) {
          if (null == p.field_m[bm.field_c]) {
            p.field_m[bm.field_c] = pi.a(10, 6413, 3, ka.field_p[bm.field_c], 1);
          }
          var2 = p.field_m[bm.field_c];
          if (var2.field_m &&
            null != var2.field_p) {
            fg.a(var2, ue.field_e, false, ch.field_h);
          }
        }
    }

    private final void d(int param0, int param1) {
        int var3;
        this.a(200, (byte) -55, 140, 54, 200);
        this.a((byte) 50, 54 + (200 - hk.field_h.field_z) / 2, hk.field_h, 140 + (200 - hk.field_h.field_A) / 2);
        if (param0 >= -103) {
          return;
        }
        this.a(200, (byte) -55, 140, 280, 300);
        if (this.field_d != 17) {
          this.a((byte) -126, sa.field_d.toUpperCase());
          if (HostileSpawn.field_I) {
            this.a((byte) 112, ln.field_h.toUpperCase());
          }
        } else {
          this.a((byte) 112, ln.field_h.toUpperCase());
        }
        if (ib.a((byte) -72)) {
          var3 = this.field_e;
          if (this.field_s == 17 ||
            this.field_d == 17) {
            var3 = 256;
          }
          id.field_A.c(eg.field_j.toUpperCase(), 600, 55, 8421376, -1, var3);
        }
    }

    private final void a(byte param0, String param1) {
        int stackIn_5_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
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
        var10 = HostileSpawn.field_I ? 1 : 0;
        try {
          var4 = -72 % ((48 - param0) / 59);
          var3_int = (int)((double)ch.field_q / 2.0);
          if (this.field_j > 200 &&
            this.field_j < 300) {
            stackIn_5_0 = 1;
          } else {
            stackIn_5_0 = 0;
          }
          var5 = stackIn_5_0;
          if (var5 != 0 &&
            var3_int > 10) {
            var3_int = 16 + var3_int % 16;
          }
          if (var3_int <= 10 ||
            var5 != 0) {
            var6 = -5 + var3_int;
            if (0 > var6) {
              var6 = 5 + var6;
              if (var10 != 0) {
                var6 = 5 - var6;
              }
            } else {
              var6 = 5 - var6;
            }
            var6 = (int)((double)var6 * 0.8);
            var7 = mk.field_L.field_u;
            var8 = 0;
            while (true) {
              if (var8 < var7) {
                si.d(0, 60 - var8, 640, 1 - var8 + 60);
                var9 = (int)(Math.random() * (double)var6);
                if (var10 == 0) {
                  if (0.5 > Math.random()) {
                    var9 = -var9;
                  }
                  mk.field_L.c(param1, 54 + var9, 60, 16776960, -1);
                  var8++;
                  continue;
                }
              } else {
                si.c();
              }
              break;
            }
            if (var10 == 0) {
              return;
            }
          }
          mk.field_L.c(param1, 54, 60, 16776960, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_27_0 = var3;
          stackIn_27_1 = new StringBuilder().append("re.JA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    re(boolean param0) {
        this.field_J = -1;
        this.field_b = new le[42];
        this.field_w = new le[2][11];
        this.field_v = 0;
        this.field_x = -1;
        this.field_e = 0;
        this.field_g = 0;
        this.field_C = new be();
        this.field_f = -1;
        if (!param0) {
          this.field_p = 256;
          this.field_d = 4;
          if (rg.a((byte) -85)) {
            this.field_d = 6;
            if (HostileSpawn.field_I) {
              if (1 == hg.field_e) {
                this.field_p = 256;
              }
              this.field_d = 0;
              if (hg.field_e == 1) {
                this.field_d = 5;
                this.field_H = null;
              }
            }
          }
        } else {
          if (1 == hg.field_e) {
            this.field_p = 256;
          }
          this.field_d = 0;
          if (hg.field_e == 1) {
            this.field_d = 5;
            this.field_H = null;
          }
        }
        this.field_C.field_b = dd.field_o[this.field_d].length;
        ij.field_F = 448;
    }

    re(int param0) {
        this.field_J = -1;
        this.field_b = new le[42];
        this.field_w = new le[2][11];
        this.field_v = 0;
        this.field_x = -1;
        this.field_e = 0;
        this.field_g = 0;
        this.field_C = new be();
        this.field_d = param0;
        this.field_f = -1;
        this.field_p = 256;
        if (5 == this.field_d) {
          this.field_H = null;
        }
        this.field_C.field_b = dd.field_o[this.field_d].length;
        ij.field_F = 448;
    }

    static {
        field_r = new ub();
        field_B = "Finally, this pass should unlock all the doors.";
        field_k = false;
        field_A = new java.awt.Color(10040319);
        field_I = "Use the mouse to direct the marine's fire.";
        field_i = new bl(0);
    }
}
