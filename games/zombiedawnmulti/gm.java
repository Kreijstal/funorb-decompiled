/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class gm extends ti {
    private int field_mb;
    private int field_nb;
    private int field_ib;
    int field_fb;
    private boolean field_gb;
    int[] field_cb;
    static String field_ob;
    static String[] field_pb;
    private boolean field_db;
    private int field_qb;
    private int field_eb;
    int[] field_hb;
    boolean field_jb;
    private int field_lb;
    int field_kb;

    final static void f(int param0, int param1) {
        lo.field_f = aq.field_l[param1];
        ud.field_Y = bp.field_v[param1];
        if (param0 != -7733) {
          field_ob = (String) null;
        }
        nh.field_n = kd.field_c[param1];
    }

    final void b(int param0, int param1) {
        if (this.field_K == 0 &&
          param0 == 1 &&
          hp.a((byte) 29, g.field_a, 4) == 0) {
          this.field_U = pb.$cfr$intArgs$a$90ed9136db05(62, this.field_mb);
        }
        super.b(param0, param1);
    }

    abstract void a(nm param0, byte param1);

    final int q(int param0) {
        if (param0 != -5183) {
          return 32;
        }
        int var2 = this.field_C;
        if (var2 != 2 && var2 != 4 &&
          6 != var2) {
          return eb.field_A;
        }
        return n.field_i;
    }

    public static void o(int param0) {
        if (param0 != 24461) {
          field_ob = (String) null;
        }
        field_pb = null;
        field_ob = null;
    }

    private final void p(int param0) {
        int var5 = ZombieDawnMulti.field_E ? 1 : 0;
        int var2 = this.g(-96);
        int var3 = this.h(70);
        int var4 = 0;
        if (param0 < 113) {
          return;
        }
        while (var4 < -1 + this.field_fb) {
          this.field_cb[var4] = var2 + jk.field_l[var4];
          this.field_hb[var4] = jk.field_b[var4] + var3;
          var4++;
        }
        this.field_cb[this.field_fb - 1] = var2;
        this.field_hb[this.field_fb - 1] = var3;
    }

    gm(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3);
        this.field_fb = 61;
        this.field_gb = false;
        this.field_ib = 0;
        this.field_nb = 0;
        this.field_db = false;
        this.field_eb = 0;
        this.field_jb = false;
        this.field_qb = -1;
        this.field_ib = hp.a((byte) 89, g.field_a, 200);
        this.field_cb = new int[61];
        this.field_hb = new int[61];
        this.p(118);
        this.field_lb = hp.a((byte) -122, g.field_a, 5);
        if (this.m(15684)) {
          this.field_mb = hp.a((byte) -119, g.field_a, 4) + 49;
        } else {
          this.field_mb = 26 + hp.a((byte) 124, g.field_a, 3);
        }
    }

    final void b(boolean param0) {
        if (this.field_K == 18) {
          return;
        }
        this.b(18, -27655);
        fb.field_e.f(127);
        if (param0) {
          this.field_kb = -115;
        }
        op.field_m.a(-112, (ff) (this));
    }

    final void a(int param0, nm param1) {
        ja stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        int stackIn_28_2 = 0;
        int stackIn_60_0 = 0;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_79_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ja[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var5Lifetime1;
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (this.field_K == 20) {
            return;
          }
          var3_int = -24 + param1.c(this.g(109), -20126);
          var4 = param1.d(this.h(param0 ^ -10222), 127) - 48;
          if (null != this.field_U) {
            if (this.field_U.k()) {
              this.field_U = null;
            } else {
              this.field_U.h(sd.b(124, var4, var3_int));
              this.field_U.f(pb.a(var4, var3_int, false));
            }
          }
          if (i.field_b) {
            this.a(param1, (byte) 80);
          }
          if (!io.a(var3_int, var4, (byte) -112, param1)) {
            return;
          }
          if (this.field_K == 32) {
            if (this.field_qb == -1) {
              this.field_qb = wf.field_m;
            }
            var5 = -this.field_qb + wf.field_m;
            if (var5 > 150) {
              return;
            }
            var5 = (int)(128.0 * Math.sin((double)var5 / 10.0 * (1.0 + (double)var5 / 33.3)));
            if (var5 < 0) {
              return;
            }
          }
          if (this.field_K != 17) {
            stackIn_27_0 = ig.field_d[1];
            stackIn_27_1 = 12;
            if (this.field_F != 3) {
              stackIn_28_2 = -3 + var3_int;
            } else {
              stackIn_28_2 = var3_int - 2;
            }
            g.a(stackIn_27_0, stackIn_27_1 + stackIn_28_2, 43 + var4);
          }
          var5Lifetime1 = this.field_ab;
          if (gg.field_i[this.field_K] != null) {
            var5Lifetime1 = gg.field_i[this.field_K][this.field_ab];
          }
          var6 = var5Lifetime1 + gg.field_l[this.field_K];
          if (param0 != -10136) {
            return;
          }
          var7 = wq.field_c[this.field_C];
          if (this.field_K != 10 &&
            this.field_K != 11) {
            if (this.field_K == 21) {
              var7[var6].c(var3_int, var4, this.field_N);
            } else {
              var8 = 3 + var4;
              var9 = wf.field_m / 4 % aa.field_h.length;
              var10 = null;
              if (this.field_K != 25) {
                if (30 == this.field_K) {
                  var10 = sh.field_N[var9];
                }
              } else {
                var10 = aa.field_h[var9];
              }
              if (var10 != null) {
                ((ri) (var10)).a(var3_int, var8);
              }
              if (var6 >= 0 &&
                var6 < var7.length) {
                stackIn_60_0 = (this.field_F != 1) ? 0 : 1;
                var11 = stackIn_60_0;
                if (0 < this.field_G) {
                  if (var11 != 0) {
                    g.a(var7[var6]);
                  }
                  var7[var6].d(var3_int, var4, 142);
                  if (var11 != 0) {
                    g.a(var7[var6]);
                  }
                } else {
                  if (var11 != 0) {
                    var7[var6].b(var3_int, var4);
                  } else {
                    var7[var6].g(var3_int, var4);
                  }
                }
              }
              if (var10 != null) {
                g.c();
                oo.h(var3_int, ((ri) (var10)).field_b / 2 + var8, 640, ((ri) (var10)).field_b + var8);
                ((ri) (var10)).a(var3_int, var8);
                g.b();
              }
            }
          } else {
            if (this.field_F == 2) {
              var7[var6 + 2].g(var3_int, var4);
            } else {
              if (this.field_F == 0) {
                var7[4 + var6].g(var3_int, var4);
              } else {
                if (this.field_F != 3) {
                  if (1 == this.field_F) {
                    var7[var6].b(var3_int, var4);
                  }
                } else {
                  var7[var6].g(var3_int, var4);
                }
              }
            }
          }
          if (this.field_jb) {
            ig.field_d[0].e(var3_int, var4, 128, 16711680);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_78_0 = var3;
          stackIn_78_1 = new StringBuilder().append("gm.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_79_2 = "null";
          } else {
            stackIn_79_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_78_0), ((StringBuilder) (Object) stackIn_78_1).append(stackIn_79_2).append(')').toString());
        }
    }

    final static String a(int param0, boolean param1, int param2, int param3) {
        int var7 = 0;
        int var4;
        int var5;
        char[] var6;
        int var8;
        int var9;
        int var10;
        char[] var11;
        char[] var12;
        var10 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param2 >= 2 &&
          param2 <= 36) {
          if (param1 &&
            0 <= param0) {
            var4 = 2;
            var5 = param0 / param2;
            while (var5 != 0) {
              var4++;
              var5 = var5 / param2;
            }
            var12 = new char[var4];
            var11 = var12;
            var6 = var11;
            var6[0] = (char)43;
            for (var7 = var4 + param3; var7 > 0; var7--) {
              var8 = param0;
              param0 = param0 / param2;
              var9 = var8 - param0 * param2;
              if (var9 < 10) {
                var6[var7] = (char)(48 + var9);
              } else {
                var6[var7] = (char)(var9 + 87);
              }
            }
            return new String(var12);
          }
          return Integer.toString(param0, param2);
        }
        throw new IllegalArgumentException("" + param2);
    }

    final void f(byte param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        boolean stackIn_27_1 = false;
        boolean stackIn_50_1 = false;
        int stackIn_54_1 = 0;
        int var2;
        br var3;
        int var4;
        int var2Lifetime1;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        super.f((byte) -95);
        this.c(30818, this.field_K);
        if (param0 > -79) {
          return;
        }
        if (this.field_K == 32) {
          if (this.field_qb == -1) {
            this.field_qb = wf.field_m;
          }
          var2 = wf.field_m - this.field_qb;
          if (150 < var2) {
            this.b(false);
          }
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_K == 0) {
          fieldTemp$0 = this.field_eb + 1;
          this.field_eb = this.field_eb + 1;
          if (this.field_ib < fieldTemp$0) {
            stackIn_50_1 = !(this.field_gb);
            this.field_gb = stackIn_50_1;
            this.field_eb = 0;
            if (this.field_gb) {
              this.field_ib = 53;
            } else {
              if (!this.field_gb) {
                stackIn_54_1 = 20 + hp.a((byte) -67, g.field_a, 200);
              } else {
                stackIn_54_1 = 65;
              }
              this.field_ib = stackIn_54_1;
            }
          }
          if (!this.field_gb) {
            this.field_ab = 0;
          }
        } else {
          if (this.field_K == 2) {
            this.i(5197);
            if (4 > this.field_ab) {
              this.field_Q = this.field_Q + 1;
              return;
            }
            if (this.field_ab != 4) {
              if (this.field_ab != 6) {
              }
            } else {
              this.field_Q = 0;
              fieldTemp$1 = this.field_nb;
              this.field_nb = this.field_nb + 1;
              if (400 <= fieldTemp$1) {
                this.field_ab = this.field_ab + 1;
              }
              this.field_S = 0;
              this.field_X = 0;
            }
            return;
          }
          if (this.field_K == 1) {
            fieldTemp$2 = this.field_lb;
            this.field_lb = this.field_lb + 1;
            if (fieldTemp$2 >= 5) {
              this.field_lb = 0;
              var2Lifetime1 = 0;
              var3 = op.field_m.field_A.c(103);
              while (var3 instanceof cg) {
                var2Lifetime1 = var2Lifetime1 != 0 | ((cg) (var3)).a(this, false) ? 1 : 0;
                var3 = var3.field_d;
              }
              if (!this.field_db &&
                var2Lifetime1 != 0) {
                this.d(6, this.field_bb >> 2);
              } else {
                if (this.field_db &&
                  var2Lifetime1 == 0) {
                  this.d(6, this.field_bb);
                }
              }
              stackIn_27_1 = (var2Lifetime1 != 0);
              this.field_db = stackIn_27_1;
            }
            this.i(5197);
            if (!(!this.k(-125))) {
              this.b(0, -27655);
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_K != 3 &&
              this.field_K != 16 &&
              20 == this.field_K) {
            }
          }
        }

    }

    final void n(int param0) {
        this.b(param0, -27655);
    }

    final boolean m(int param0) {
        boolean stackIn_37_0 = false;
        int var2;
        int var3;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        var2 = this.field_C;
        switch (var2) {
          case 1:
            return false;
          case 6:
          case 7:
          case 8:
          case 9:
          case 10:
          case 11:
          case 15:
          case 16:
          case 18:
          case 19:
          case 20:
          case 21:
          case 22:
          default:
            if (var2 != 3 &&
              var2 != 4 &&
              var2 != 5) {
              if (var2 == 6) {
                return true;
              }
              if (var2 == 7) {
                return true;
              }
              if (var2 == 8) {
                return true;
              }
              if (9 == var2) {
                return false;
              }
              if (var2 == 10) {
                return true;
              }
              if (var2 == 11) {
                return false;
              }
              if (var2 != 12 &&
                var2 != 13 &&
                14 != var2) {
                if (var2 == 15) {
                  return true;
                }
                if (var2 == 16) {
                  return true;
                }
                if (var2 == 18) {
                  return true;
                }
                if (var2 == 19) {
                  return true;
                }
                if (var2 == 20) {
                  return true;
                }
                if (var2 == 21) {
                  return false;
                }
                if (var2 == 22) {
                  stackIn_37_0 = true;
                  break;
                }
                if (param0 != 15684) {
                  this.l(127);
                }
                return true;
              }
              return true;
            }
            return true;
          case 0:
          case 2:
            stackIn_37_0 = false;
            break;
        }
        return stackIn_37_0;
    }

    final void l(int param0) {
        int var2 = -57 % ((0 - param0) / 33);
        this.b(0, -27655);
    }

    final static void a(long param0, String param1, int param2) {
        CharSequence var5 = null;
        try {
          va.field_a = 2;
          if (param2 != -1) {
            field_ob = (String) null;
          }
          qf.field_g = param1;
          var5 = (CharSequence) ((Object) param1);
          ql.field_a = tg.a(var5, false);
          sq.field_N = true;
          jj.field_M = param0;
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "gm.W(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_pb = new String[]{"Prepare your forces!", "Get ready to grumble!", "Get ready to mumble!", "Get ready!", "He who scares, wins!", "Ready, set, groan!", "Let's get shuffling!", "To arms!", "Break a leg!", "Dinner is served...", "Rattle 'em bones!", "Get ready to fright!", "Not by force, by bile!", "Unsteady, set, shuffle!", "Time to greet and eat!", "Go eat 'em!", "Moan-bilise your troops!", "Get ready to outbreak!", "It's goo time.", "Got the fright stuff?", "Here come the hordes.", "First rule of Overlord club...", "Grah rarr growwwl!", "It's time to take over!", "It's a good day to undie.", "Undead and loving it...", "Stop! Zombie time."};
        field_ob = "This game is full.";
    }
}
