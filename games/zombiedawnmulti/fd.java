/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fd extends id {
    static int field_F;
    boolean field_K;
    static cj field_O;
    static ef field_G;
    boolean field_H;
    static th field_M;
    private boolean field_J;
    private int field_P;
    static java.applet.Applet field_L;
    static String field_N;
    static String field_I;

    fd(int param0, int param1, int param2) {
        super(param0, param1, param2);
        int var5 = 0;
        int[] var4;
        int var6;
        int[] var8;
        int[] var9;
        int[] var10;
        boolean stackIn_3_1 = false;
        boolean stackIn_6_1 = false;
        this.field_J = false;
        stackIn_3_1 = ((this.field_C & 1073741824) != 0);
        this.field_H = stackIn_3_1;
        stackIn_6_1 = ((this.field_C & 536870912) != 0);
        this.field_K = stackIn_6_1;
        this.field_P = this.field_C;
        this.field_P = this.field_P & -1610612737;
        this.field_P = this.field_P - 1;
        var10 = rb.field_c;
        var9 = var10;
        var8 = var9;
        var4 = var8;
        for (var5 = 0; var5 < var10.length; var5++) {
          var6 = var10[var5];
          if (this.field_P == var6) {
            this.field_J = true;
          }
        }
    }

    public static void g(byte param0) {
        field_G = null;
        field_M = null;
        field_L = null;
        if (param0 != 97) {
          return;
        }
        field_I = null;
        field_N = null;
        field_O = null;
    }

    final void a(int param0, nm param1) {
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param0 != -10136) {
            field_M = (th) null;
          }
          var3_int = param1.c(this.g(param0 ^ 10195), -20126);
          var4 = -24 + param1.d(this.h(param0 ^ -10230), 127);
          if (!io.a(var3_int, var4, (byte) -110, param1)) {
            return;
          }
          if (this.field_J &&
            !io.a(var3_int, -24 + var4, (byte) -114, param1)) {
            return;
          }
          var5 = this.g(-128) / 24;
          var6 = this.h(-51) / 24;
          if (!he.field_a &&
            var5 >= 0 &&
            var5 < fb.field_e.field_u.field_k[0].length &&
            var6 >= 0 &&
            var6 < fb.field_e.field_u.field_k.length &&
            fb.field_e.field_u.field_k[var6][var5]) {
            return;
          }
          if (this.field_H &&
            this.field_K) {
            od.field_Ab[this.field_P].d(var3_int, var4);
          } else {
            if (this.field_H) {
              od.field_Ab[this.field_P].b(var3_int, var4);
            } else {
              if (!this.field_K) {
                od.field_Ab[this.field_P].g(var3_int, var4);
              } else {
                od.field_Ab[this.field_P].a(var3_int, var4);
              }
            }
          }
          if (this.field_J) {
            if (!this.field_H) {
              if (!this.field_K) {
                od.field_Ab[-8 + this.field_P].g(var3_int, -24 + var4);
              } else {
                od.field_Ab[-8 + this.field_P].a(var3_int, -24 + var4);
              }
            } else {
              od.field_Ab[-8 + this.field_P].b(var3_int, var4 - 24);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_34_0 = var3;
          stackIn_34_1 = new StringBuilder().append("fd.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(')').toString());
        }
    }

    final void f(byte param0) {
        if (param0 > -79) {
          this.f((byte) 89);
        }
    }

    final static void h(byte param0) {
        oq.field_w = null;
        qp.field_t = (byte[][]) null;
        qj.field_o = null;
        vj.field_p = null;
        k.field_i = null;
        if (param0 <= 124) {
          field_G = (ef) null;
        }
        tp.field_t = null;
    }

    final static int a(int param0, boolean param1, boolean param2, String param3, String param4, int param5) {
        try {
          int stackIn_6_0 = 0;
          int stackIn_14_0 = 0;
          int stackIn_32_0 = 0;
          boolean stackIn_45_0 = false;
          boolean stackIn_52_0 = false;
          boolean stackIn_55_0 = false;
          boolean stackIn_58_0 = false;
          boolean stackIn_63_0 = false;
          int stackIn_90_0 = 0;
          int stackIn_102_0 = 0;
          int stackIn_104_0 = 0;
          int stackIn_113_0 = 0;
          int stackIn_115_0 = 0;
          RuntimeException stackIn_118_0 = null;
          StringBuilder stackIn_118_1 = null;
          String stackIn_119_2 = null;
          StringBuilder stackIn_121_1 = null;
          String stackIn_122_2 = null;
          Throwable decompiledCaughtException = null;
          int var6_int = 0;
          RuntimeException var6 = null;
          int var7 = 0;
          int var8 = 0;
          Throwable var8_ref_Throwable = null;
          int var9 = 0;
          String var10 = null;
          String var11 = null;
          CharSequence var12 = null;
          int var6_intLifetime1;
          int var6_intLifetime2;
          int var8Lifetime1;
          var9 = ZombieDawnMulti.field_E ? 1 : 0;
          try {
            if (ki.field_h == null &&
              !ee.a(param1, false)) {
              stackIn_6_0 = -1;
              return stackIn_6_0;
            }
            if (ud.field_cb == vo.field_l) {
              if (!param1) {
                ki.field_a = cn.a((byte) 125, param4, param3, false);
              } else {
                var10 = (String) null;
                ki.field_a = eg.a(64, ii.field_d, (String) null, false, param3);
              }
              ma.field_a.field_j = 0;
              ma.field_a.a(-94, 14);
              ma.field_a.a(126, ki.field_a.b(param0 - 7).field_d);
              cb.a(-1, false);
              vo.field_l = de.field_h;
            }
            if (param0 != 14) {
              stackIn_14_0 = -97;
              return stackIn_14_0;
            }
            if (de.field_h == vo.field_l &&
              fa.b(10, 1)) {
              var6_int = s.field_e.g(param0 ^ 31371);
              s.field_e.field_j = 0;
              if (var6_int == 0) {
                vo.field_l = ul.field_n;
              } else {
                hd.field_q = -1;
                vo.field_l = gn.field_K;
                op.field_i = var6_int;
              }
            }
            if (ul.field_n == vo.field_l &&
              fa.b(10, 8)) {
              nm.field_c = s.field_e.a((byte) -30);
              s.field_e.field_j = 0;
              pi.a((byte) -59, param2, param1, ki.field_a, param5);
              vo.field_l = lc.field_l;
            }
            boolean decompiledFrameRemainder0 = true;
            if (vo.field_l == lc.field_l &&
              fa.b(10, 1)) {
              var6_intLifetime1 = s.field_e.g(31365);
              s.field_e.field_j = 0;
              oe.field_f = null;
              op.field_i = var6_intLifetime1;
              if (var6_intLifetime1 != 0 &&
                var6_intLifetime1 != 1) {
                if (var6_intLifetime1 != 8) {
                  hd.field_q = -1;
                  vo.field_l = gn.field_K;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  ak.a((byte) -111);
                  sk.field_j = false;
                  stackIn_32_0 = var6_intLifetime1;
                  return stackIn_32_0;
                }
              }
              if (decompiledFrameRemainder0) {
                hd.field_q = -1;
                vo.field_l = qb.field_e;
              }
            }
            if (vo.field_l == qb.field_e &&
              dd.a(0)) {
              ii.field_d = s.field_e.a((byte) -30);
              ci.field_f = param3;
              kj.field_q = s.field_e.g(31365);
              am.field_b = s.field_e.g(31365);
              vl.field_h = s.field_e.d((byte) 69);
              var11 = s.field_e.g((byte) -89);
              var7 = s.field_e.g(31365);
              if ((var7 & 1) != 0) {
                fj.a((byte) 85);
              }
              if (!param1) {
                stackIn_52_0 = (0 != (4 & var7));
                fj.field_M = stackIn_52_0;
                stackIn_55_0 = ((2 & var7) != 0);
                sh.field_L = stackIn_55_0;
                stackIn_58_0 = ((var7 & 8) != 0);
                nh.field_m = stackIn_58_0;
                if (nh.field_m) {
                  sh.field_L = true;
                }
                stackIn_63_0 = ((var7 & 16) != 0);
                tm.field_b = stackIn_63_0;
                if (gj.field_e) {
                  s.field_e.g(31365);
                  s.field_e.g(param0 + 31351);
                  s.field_e.i(-1478490344);
                  vn.field_f = s.field_e.d((byte) 69);
                  kq.field_b = new byte[vn.field_f];
                  for (var8 = 0; var8 < vn.field_f; var8++) {
                    kq.field_b[var8] = s.field_e.d(vg.a(param0, -249699574));
                  }
                }
              } else {
                stackIn_45_0 = ((var7 & 16) != 0);
                tm.field_b = stackIn_45_0;
                if (gj.field_e) {
                  s.field_e.g(31365);
                  s.field_e.g(param0 + 31351);
                  s.field_e.i(-1478490344);
                  vn.field_f = s.field_e.d((byte) 69);
                  kq.field_b = new byte[vn.field_f];
                  for (var8 = 0; var8 < vn.field_f; var8++) {
                    kq.field_b[var8] = s.field_e.d(vg.a(param0, -249699574));
                  }
                }
              }
              ta.field_lb = s.field_e.f((byte) -48);
              var12 = (CharSequence) ((Object) ta.field_lb);
              kf.field_k = tg.a(var12, false);
              qq.field_a = s.field_e.g(31365);
              vo.field_l = pi.field_a;
              if (ki.field_a.b(7) != uq.field_b) {
                if (ki.field_a.b(7) == pl.field_G) {
                  l.field_c.a(-100, jl.b(0));
                }
              } else {
                wp.field_b.a(-108, jl.b(0));
              }
              sk.field_j = false;
              if (var11 != null) {
                jh.a(jl.b(0), param0 ^ -15, var11);
              }
              if (vl.field_h <= 0 &&
                !fj.field_M) {
                try {
                  fo.b(jl.b(0), 13093, "unzap");
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              } else {
                try {
                  fo.a(jl.b(0), "zap", (byte) 23, new Object[]{mc.a(ii.field_d, (byte) 26)});
                } catch (java.lang.Throwable decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              }
              if (vl.field_h > 0) {
                cm.field_e = true;
              }
              ma.field_a.a((byte) -77, mj.field_Fb);
              for (var8Lifetime1 = 0; 4 > var8Lifetime1; var8Lifetime1++) {
                mj.field_Fb[var8Lifetime1] = mj.field_Fb[var8Lifetime1] + 50;
              }
              s.field_e.a((byte) -116, mj.field_Fb);
              stackIn_90_0 = op.field_i;
              return stackIn_90_0;
            }
            if (vo.field_l == gn.field_K &&
              dd.a(0)) {
              ak.a((byte) -124);
              if (op.field_i == 7 &&
                !sk.field_j) {
                sk.field_j = true;
                stackIn_104_0 = -1;
                return stackIn_104_0;
              }
              if (op.field_i == 7) {
                op.field_i = 3;
              }
              ol.field_q = s.field_e.f((byte) -31);
              sk.field_j = false;
              stackIn_102_0 = op.field_i;
              return stackIn_102_0;
            }
            if (ki.field_h == null) {
              if (sk.field_j) {
                if (he.b((byte) -22) > 30000L) {
                  ol.field_q = aj.field_l;
                } else {
                  ol.field_q = ga.field_w;
                }
                sk.field_j = false;
                stackIn_113_0 = 3;
                return stackIn_113_0;
              }
              var6_intLifetime2 = jo.field_b;
              jo.field_b = ff.field_s;
              sk.field_j = true;
              ff.field_s = var6_intLifetime2;
            }
            stackIn_115_0 = -1;
            return stackIn_115_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var6 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_118_0 = var6;
            stackIn_118_1 = new StringBuilder().append("fd.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_119_2 = "null";
            } else {
              stackIn_119_2 = "{...}";
            }
            stackIn_121_1 = ((StringBuilder) (Object) stackIn_118_1).append(stackIn_119_2).append(',');
            if (param4 == null) {
              stackIn_122_2 = "null";
            } else {
              stackIn_122_2 = "{...}";
            }
            throw fa.a((Throwable) ((Object) stackIn_118_0), ((StringBuilder) (Object) stackIn_121_1).append(stackIn_122_2).append(',').append(param5).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_F = -1;
        field_M = new th();
        field_I = "You have declined the invitation.";
        field_N = "Elapsed time";
    }
}
