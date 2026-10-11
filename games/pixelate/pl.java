/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pl extends ch implements om, vo, pn {
    private gk field_U;
    private gk field_Q;
    private db field_M;
    private gk field_X;
    private qm field_K;
    private gk field_V;
    private gk field_P;
    static bb field_Y;
    private h field_T;
    static int field_S;
    private qm field_R;
    static String[] field_J;
    a field_W;
    static int field_O;
    private gk field_L;

    public final void a(byte param0) {
        ((ec) (this.field_U.a(1))).f(-112);
        if (param0 <= 12) {
          this.field_X = (gk) null;
        }
    }

    private final String l(int param0) {
        if (param0 != 0) {
          field_S = -31;
        }
        return "</col></u>";
    }

    final void a(int param0, int param1, int param2, ng param3) {
        try {
          super.a(param0 ^ 0, param1, param2, param3);
          if (param0 != 40) {
            this.field_V = (gk) null;
          }
          this.field_R.field_H = this.d(true);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "pl.L(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public pl() {
        super(0, 0, 496, 0, (eb) null);
        this.field_U = new gk("", (fn) null, 12);
        this.field_P = new gk("", (fn) null, 100);
        this.field_L = new gk("", (fn) null, 100);
        this.field_V = new gk("", (fn) null, 20);
        this.field_X = new gk("", (fn) null, 20);
        this.field_Q = new gk("", (fn) null, 3);
        int var1 = 1;
        this.field_T = new h("", (fn) null, var1 != 0);
        this.field_R = new qm(hm.field_d, (fn) null);
        this.field_K = new qm(ii.field_v, (fn) null);
        this.field_U.field_l = bg.field_i;
        this.field_P.field_l = qp.field_N;
        this.field_L.field_l = jf.field_b;
        this.field_V.field_l = te.field_Eb;
        this.field_X.field_l = dd.field_f;
        this.field_Q.field_l = bb.field_d;
        this.field_T.field_l = mc.field_o;
        this.field_U.a((byte) 101, new ec(this.field_U));
        this.field_P.a((byte) 118, new bc(this.field_P));
        this.field_L.a((byte) 56, new kc(this.field_L, this.field_P));
        this.field_V.a((byte) 68, new g(this.field_V, this.field_U, this.field_P));
        this.field_X.a((byte) 29, new qo(this.field_X, this.field_V));
        this.field_Q.a((byte) 97, new ag(this.field_Q));
        this.field_R.field_H = false;
        this.field_R.field_y = (eb) ((Object) new ad());
        this.field_K.field_y = (eb) ((Object) new ia());
        this.field_U.field_y = (eb) ((Object) new gh(10000536));
        gh dupTemp$0 = new gh(10000536);
        this.field_L.field_y = (eb) ((Object) dupTemp$0);
        this.field_P.field_y = (eb) ((Object) dupTemp$0);
        this.field_Q.field_y = (eb) ((Object) new gh(10000536));
        this.field_T.field_y = (eb) ((Object) new jc());
        ip dupTemp$1 = new ip(10000536);
        this.field_X.field_y = (eb) ((Object) dupTemp$1);
        this.field_V.field_y = (eb) ((Object) dupTemp$1);
        String var2 = sd.a(hk.field_f, 27, new String[]{this.n(3), this.l(0)});
        int var3 = 20;
        var3 = var3 + this.a(si.field_S, -21, this.field_P, 170, var3);
        var3 = var3 + (5 + this.a(mp.field_d, this.field_L, 20, 170, var3, 126, ""));
        var3 = var3 + this.a(vk.field_qb, -86, this.field_V, 170, var3);
        var3 = var3 + (5 + this.a(pb.field_i, var3, this.field_X, 35, 170, r.field_b));
        var3 = var3 + (this.a(na.field_a, var3, this.field_U, 35, 170, mo.field_i) + 5);
        var3 = var3 + this.a((byte) 85, 170, this.field_Q, var3, rl.field_O);
        qp var4 = new qp(46, var3, this.field_E - 90, 25, this.field_T, true, this.field_E - 120, 5, ep.field_b, 11579568, ha.field_j);
        this.b(var4, 80);
        var3 = var3 + var4.field_C;
        uc var5 = new uc(he.field_d, 0, 0, 0, 0, 16777215, -1, 0, 0, he.field_d.field_w, -1, 2147483647, true);
        this.field_M = new db(var2, var5);
        this.field_M.field_l = "";
        this.field_M.a(fa.field_g, 0, 0);
        this.field_M.a(fa.field_g, 0, 1);
        this.field_M.field_n = (fn) (this);
        this.field_M.a(46, -90 + this.field_E, var3, -93);
        var3 = var3 + (15 + this.field_M.field_C);
        this.b(this.field_M, 80);
        int var6 = 4;
        int var7 = 200;
        this.field_R.a(var7, (byte) 68, var3, -var7 + 496 >> 1, 40);
        this.field_K.a(60, (byte) 23, var3 + 15, var6 + 3, 40);
        this.field_K.field_n = (fn) (this);
        this.field_R.field_n = (fn) (this);
        this.b(this.field_R, 80);
        this.b(this.field_K, 80);
        this.field_W = new a((pn) (this));
        this.field_W.a(-this.field_U.field_E - this.field_U.field_z + (this.field_E - 60), (byte) 100, 20 + this.field_U.field_p, 60 + this.field_U.field_z + this.field_U.field_E, 150);
        this.b(this.field_W, 80);
        this.a(496, (byte) 28, 0, 0, var3 + 55 + var6);
    }

    private final int a(String param0, int param1, ng param2, int param3, int param4) {
        qp var6 = null;
        RuntimeException var6_ref = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = new qp(20, param4, param3 + 120, 25, param2, false, 120, 3, he.field_d, 16777215, param0);
          this.b(var6, 80);
          if (param1 <= -6) {
            stackIn_4_0 = var6.field_C;
            return stackIn_4_0;
          }
          stackIn_2_0 = -103;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_7_0 = var6_ref;
          stackIn_7_1 = new StringBuilder().append("pl.J(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final int a(byte param0, int param1, ng param2, int param3, String param4) {
        RuntimeException var6 = null;
        vc var7 = null;
        int var8 = 0;
        qp var9 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var9 = new qp(20, param3, 120 + param1, 25, param2, false, 120, 3, he.field_d, 16777215, param4);
          this.b(var9, 80);
          var7 = new vc(((bp) ((Object) param2)).a(1));
          this.b(var7, 80);
          var7.a(15, (byte) 73, (var9.field_C - 15 >> 1) + var9.field_p, var9.field_E + (var9.field_z + 3), 15);
          var8 = -32 / ((param0 + 2) / 54);
          stackIn_1_0 = var9.field_C;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_4_0 = var6;
          stackIn_4_1 = new StringBuilder().append("pl.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static void c(boolean param0) {
        int stackIn_46_0 = 0;
        uj stackIn_51_0 = null;
        String stackIn_51_1 = null;
        String stackIn_51_2 = null;
        boolean stackIn_52_3;
        uj stackIn_55_0 = null;
        boolean stackIn_56_1 = false;
        pc stackIn_100_0 = null;
        boolean stackIn_101_1 = false;
        vg stackIn_105_0 = null;
        boolean stackIn_106_1 = false;
        uj stackIn_109_0 = null;
        boolean stackIn_110_1 = false;
        pc stackIn_113_0 = null;
        boolean stackIn_114_1 = false;
        RuntimeException decompiledCaughtException = null;
        pc var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        long var3 = 0L;
        int var3_int = 0;
        uj var3_ref_uj = null;
        eq var4 = null;
        int var4_int = 0;
        int var5 = 0;
        eq var6 = null;
        uj var7 = null;
        int var8 = 0;
        uj var8_ref_uj = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        eq var13 = null;
        uj var14 = null;
        Object var16 = null;
        Object var17 = null;
        eq var17_ref = null;
        Object var18 = null;
        Object var19 = null;
        eq var19_ref = null;
        String var20 = null;
        String var21 = null;
        String var22 = null;
        uj var23 = null;
        String var24 = null;
        String var25 = null;
        uj var26 = null;
        uj var27 = null;
        eq var28 = null;
        Object var29 = null;
        uj var30 = null;
        uj var31 = null;
        eq var32 = null;
        eq var33 = null;
        uj var3_ref_ujLifetime1;
        long var3Lifetime1;
        long var3Lifetime2;
        int var3_intLifetime1;
        int var3_intLifetime2;
        int var3_intLifetime3;
        int var4_intLifetime1;
        int var5Lifetime1;
        int var3_intLifetime4;
        int var3_intLifetime5;
        int var3_intLifetime6;
        long var3Lifetime2Lifetime1;
        int var5Lifetime1Lifetime1;
        var16 = null;
        var17 = null;
        var19 = null;
        var18 = null;
        var29 = null;
        var11 = Pixelate.field_H ? 1 : 0;
        try {
          var1 = vi.field_o;
          if (!param0) {
            pl.m(96);
          }
          var2 = ((we) ((Object) var1)).f(255);
          if (var2 != 0 &&
            var2 != 1 &&
            2 != var2 &&
            3 != var2 &&
            var2 != 4) {
            if (var2 == 5) {
              var3 = ((we) ((Object) var1)).a(false);
              var21 = ((we) ((Object) var1)).h(5);
              var20 = ((we) ((Object) var1)).h(5);
              var22 = ((we) ((Object) var1)).h(5);
              var8_ref_uj = gp.a(2, var3);
              stackIn_46_0 = (var20.equals("")) ? 0 : 1;
              var9 = stackIn_46_0;
              if (var8_ref_uj != null) {
                if (var9 != 0) {
                  stackIn_51_0 = var8_ref_uj;
                  stackIn_51_1 = var22;
                  stackIn_51_2 = var21;
                  stackIn_52_3 = !(param0);
                  ((uj) (Object) stackIn_51_0).a(stackIn_51_1, stackIn_51_2, stackIn_52_3);
                }
              } else {
                var8_ref_uj = new uj(var21, var22, var3);
                il.field_d.a(false, var8_ref_uj, var3);
              }
              var8_ref_uj.field_Pb = hm.a(64) - (long)((we) ((Object) var1)).k(0);
              var8_ref_uj.field_Rb = ((we) ((Object) var1)).a((byte) 105);
              var10 = ((we) ((Object) var1)).j(127);
              var8_ref_uj.field_Yb = var10 >> 1;
              stackIn_55_0 = var8_ref_uj;
              stackIn_56_1 = ((var10 & 1) != 0);
              stackIn_55_0.field_Xb = stackIn_56_1;
              var8_ref_uj.field_Qb = ((we) ((Object) var1)).f(255);
              var8_ref_uj.field_Ib = ((we) ((Object) var1)).f(255);
              il.a(-28, var8_ref_uj);
              return;
            }
            if (6 == var2) {
              var3Lifetime1 = ((we) ((Object) var1)).a(false);
              var5 = ((we) ((Object) var1)).f(255);
              var30 = gp.a(2, var3Lifetime1);
              if (var30 == null) {
                return;
              }
              if (var30.field_Jb) {
                ka.field_X = ka.field_X - 1;
                var30.field_Jb = false;
              }
              if (var5 != 0) {
                var30.field_Tb = mh.field_b;
                var30.field_Eb = var5;
              } else {
                var30.c(2779);
              }
              var30.e(17);
              return;
            }
            if (var2 == 7) {
              var31 = (uj) (i.field_n.c(1504642273));
              while (var31 != null) {
                var31.c(2779);
                var31.e(17);
                var31 = (uj) (i.field_n.f(1504642273));
              }
              ka.field_X = 0;
              return;
            }
            if (8 == var2) {
              var3_int = ((we) ((Object) var1)).a((byte) -124);
              var4 = (eq) (dg.field_f.a(-11434, (long)var3_int));
              if (var4 == null) {
                var4 = new eq(fj.field_b);
                dg.field_f.a(false, var4, (long)var3_int);
              }
              kd.a(true, var4, (byte) 120, var1);
              w.a((byte) -48, var4);
              return;
            }
            if (var2 == 9) {
              var3_intLifetime4 = ((we) ((Object) var1)).a((byte) 124);
              var4_int = ((we) ((Object) var1)).f(255);
              var33 = (eq) (dg.field_f.a(-11434, (long)var3_intLifetime4));
              if (var33 == null) {
                return;
              }
              if (0 != var4_int) {
                var33.field_Rb = mh.field_b;
                var33.field_Qb = var4_int;
              } else {
                var33.c(2779);
              }
              var33.e(17);
              return;
            }
            if (10 == var2) {
              var32 = (eq) (nk.field_a.c(1504642273));
              while (var32 != null) {
                var32.c(2779);
                var32.e(17);
                var32 = (eq) (nk.field_a.f(1504642273));
              }
              return;
            }
            if (11 != var2 &&
              12 != var2) {
              if (var2 == 13) {
                var3_intLifetime5 = ((we) ((Object) var1)).a((byte) 107);
                var4_intLifetime1 = ((we) ((Object) var1)).f(255);
                var17_ref = (eq) (dg.field_f.a(-11434, (long)var3_intLifetime5));
                if (var17_ref == null) {
                  return;
                }
                var17_ref.field_Ob = false;
                var13 = var17_ref;
                var6 = var13;
                if (var4_intLifetime1 != 0) {
                  var17_ref.field_Rb = mh.field_b;
                  var17_ref.field_Qb = var4_intLifetime1;
                }
                var13.field_cc = false;
                w.a((byte) -48, var17_ref);
                return;
              }
              if (var2 != 14 &&
                var2 != 16) {
                if (var2 != 15 &&
                  var2 != 17) {
                  if (var2 != 18) {
                    if (19 == var2) {
                      var3Lifetime2 = ((we) ((Object) var1)).a(false);
                      var5Lifetime1 = ((we) ((Object) var1)).f(255);
                      var23 = ll.a(var3Lifetime2, 14428);
                      if (var23 == null) {
                        return;
                      }
                      if (var5Lifetime1 != 0) {
                        var23.field_Eb = var5Lifetime1;
                        var23.field_Tb = mh.field_b;
                      } else {
                        var23.c(2779);
                      }
                      var23.e(17);
                      io.field_c.field_mc = io.field_c.field_mc - 1;
                      return;
                    }
                    if (20 == var2) {
                      kd.a(false, io.field_c, (byte) 120, var1);
                      return;
                    }
                    if (var2 == 21) {
                      var3_intLifetime5 = ((we) ((Object) var1)).a((byte) -120);
                      if (var3_intLifetime5 == 0) {
                        bo.field_e = 0L;
                        return;
                      }
                      bo.field_e = (long)var3_intLifetime5 + hm.a(64);
                      return;
                    }
                    if (var2 == 22) {
                      gi.field_a = ((we) ((Object) var1)).a((byte) 63);
                      ui.field_e = ((we) ((Object) var1)).j(127);
                      return;
                    }
                    if (var2 == 23) {
                      hn.field_f = ((we) ((Object) var1)).a(false);
                      return;
                    }
                    jo.a(1, "L1: " + jm.b(-74), (Throwable) null);
                    na.a(true);
                    return;
                  }
                  stackIn_100_0 = var1;
                  stackIn_101_1 = !(param0);
                  var3Lifetime2 = ((we) (Object) stackIn_100_0).a(stackIn_101_1);
                  var24 = ((we) ((Object) var1)).h(5);
                  var25 = ((we) ((Object) var1)).h(5);
                  var7 = ll.a(var3Lifetime2, 14428);
                  if (var7 == null) {
                    var7 = new uj(var24, var25, var3Lifetime2);
                    stackIn_105_0 = eh.field_f;
                    stackIn_106_1 = !(param0);
                    ((vg) (Object) stackIn_105_0).a(stackIn_106_1, var7, var3Lifetime2);
                    io.field_c.field_mc = io.field_c.field_mc + 1;
                  }
                  var7.field_Rb = ((we) ((Object) var1)).a((byte) 25);
                  var8 = ((we) ((Object) var1)).j(127);
                  stackIn_109_0 = var7;
                  stackIn_110_1 = (0 != (1 & var8));
                  stackIn_109_0.field_Xb = stackIn_110_1;
                  var7.field_Yb = var8 >> 1;
                  var7.field_Qb = ((we) ((Object) var1)).f(255);
                  var7.field_Ib = ((we) ((Object) var1)).f(255);
                  wi.field_a.a(22125, var7);
                  return;
                }
                stackIn_113_0 = var1;
                stackIn_114_1 = !(param0);
                var3Lifetime2 = ((we) (Object) stackIn_113_0).a(stackIn_114_1);
                var5Lifetime1Lifetime1 = ((we) ((Object) var1)).f(255);
                var14 = gp.a(2, var3Lifetime2);
                var26 = var14;
                if (var14 != null) {
                  if (15 != var2) {
                    if (var26.field_Jb) {
                      ka.field_X = ka.field_X - 1;
                      var26.field_Jb = false;
                    }
                  } else {
                    var14.field_Vb = false;
                  }
                  if (var5Lifetime1Lifetime1 != 0) {
                    var26.field_Tb = mh.field_b;
                    var26.field_Eb = var5Lifetime1Lifetime1;
                  }
                  il.a(-124, var26);
                }
                return;
              }
              var3Lifetime2Lifetime1 = ((we) ((Object) var1)).a(false);
              var27 = gp.a(2, var3Lifetime2Lifetime1);
              if (var27 != null) {
                if (var2 == 14) {
                  var27.field_Vb = true;
                } else {
                  if (!var27.field_Jb) {
                    ka.field_X = ka.field_X + 1;
                    var27.field_Jb = true;
                  }
                }
                il.a(-97, var27);
              }
              return;
            }
            var3_intLifetime6 = ((we) ((Object) var1)).a((byte) -124);
            var19_ref = (eq) (dg.field_f.a(-11434, (long)var3_intLifetime6));
            var28 = var19_ref;
            if (var28 == null) {
              return;
            }
            if (var2 != 11) {
              var28.field_Ob = true;
            } else {
              var28.field_cc = true;
            }
            w.a((byte) -48, var28);
            return;
          }
          var3_ref_uj = (uj) (wi.field_a.c(1504642273));
          while (var3_ref_uj != null) {
            var3_ref_uj.c(2779);
            var3_ref_uj.e(17);
            var3_ref_uj = (uj) (wi.field_a.f(1504642273));
          }
          var3_ref_ujLifetime1 = (uj) (il.field_d.a(-110));
          while (var3_ref_ujLifetime1 != null) {
            if (var3_ref_ujLifetime1.field_Vb ||
              var3_ref_ujLifetime1.field_Jb) {
              if (var3_ref_ujLifetime1.field_Jb) {
                ka.field_X = ka.field_X - 1;
                var3_ref_ujLifetime1.field_Jb = false;
              }
              var3_ref_ujLifetime1.field_Vb = false;
              il.a(-117, var3_ref_ujLifetime1);
            }
            var3_ref_ujLifetime1 = (uj) (il.field_d.a((byte) 50));
          }
          if (var2 == 1 &&
            null != io.field_c) {
            wo.field_b = io.field_c.field_pc;
          }
          if (var2 == 4) {
            var3_intLifetime1 = ((we) ((Object) var1)).a((byte) 49);
            io.field_c = new eq(fj.field_b);
            io.field_c.a((long)var3_intLifetime1, 29574);
            kd.a(false, io.field_c, (byte) 120, var1);
            bo.field_e = 0L;
          } else {
            io.field_c = null;
          }
          if (var2 != 2 &&
            var2 != 3) {
            bn.field_S = null;
          } else {
            if (bn.field_S == null) {
              bn.field_S = new eq(fj.field_b);
            }
          }
          if (var2 != 3) {
            rl.field_r = false;
            return;
          }
          rl.field_r = true;
          for (var3_intLifetime2 = 0; var3_intLifetime2 < qm.field_J.length; var3_intLifetime2++) {
            qm.field_J[var3_intLifetime2] = ((we) ((Object) var1)).a(0);
          }
          ib.field_a = ((we) ((Object) var1)).f(255);
          mg.field_i = ((we) ((Object) var1)).f(255);
          for (var3_intLifetime3 = 0; k.field_k.length > var3_intLifetime3; var3_intLifetime3++) {
            k.field_k[var3_intLifetime3] = ((we) ((Object) var1)).a(0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1_ref), "pl.O(" + param0 + ')');
        }
    }

    public final void a(int param0, int param1, int param2, db param3) {
        int discarded$1 = 0;
        int var6 = 0;
        ng var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = Pixelate.field_H ? 1 : 0;
        try {
          if (param0 != 0) {
            if (param0 != 1) {
              if (param0 == 2) {
                jc.a("conduct.ws", -120);
              }
            } else {
              jc.a("privacy.ws", -27);
            }
          } else {
            jc.a("terms.ws", -14);
          }
          if (param2 != -8894) {
            var7 = (ng) null;
            discarded$1 = this.a((String) null, 66, (ng) null, -19, -43);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("pl.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public final void a(qm param0, int param1, int param2, int param3, int param4) {
        boolean discarded$1 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (param2 != 11) {
            this.field_K = (qm) null;
          }
          if (this.field_K != param0) {
            if (param0 == this.field_R) {
              discarded$1 = this.a(10152);
            }
          } else {
            mj.c(24496);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("pl.Q(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final boolean a(bp param0, boolean param1) {
        ml var3 = null;
        RuntimeException var3_ref = null;
        dj var4 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = param0.a(1);
          if (var3 == null) {
            return true;
          }
          var4 = var3.a((byte) 112);
          if (sk.field_a == var4) {
            return false;
          }
          if (var4 == uo.field_b) {
            return false;
          }
          if (var4 == wh.field_o) {
            return false;
          }
          if (!param1) {
            return true;
          }
          pl.m(-52);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("pl.I(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void a(String param0, byte param1) {
        gk var3 = null;
        String var5 = null;
        try {
          int var4 = 117 % ((34 - param1) / 59);
          var3 = this.field_U;
          var5 = param0;
          ((c) ((Object) var3)).a(false, (byte) 87, var5);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "pl.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final int a(String param0, ng param1, int param2, int param3, int param4, int param5, String param6) {
        RuntimeException var8 = null;
        md var9 = null;
        qp var10 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var10 = new qp(20, param4, 120 + param3, 25, param1, false, 120, 3, he.field_d, 16777215, param0);
          this.b(var10, 80);
          var9 = new md(((bp) ((Object) param1)).a(param5 - 125), param6, param5, var10.field_C + param4, 50 + param3, param2);
          var9.field_n = (fn) (this);
          this.b(var9, 80);
          stackIn_1_0 = var10.field_C + var9.field_C;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_4_0 = var8;
          stackIn_4_1 = new StringBuilder().append("pl.S(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    private final String n(int param0) {
        String discarded$0 = null;
        if (param0 != 3) {
          discarded$0 = this.n(-59);
        }
        return "<u=2164A2><col=2164A2>";
    }

    final boolean a(int param0, int param1, ng param2, char param3) {
        RuntimeException var5 = null;
        boolean stackIn_5_0 = false;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3)) {
            return true;
          }
          if (param0 == 98) {
            stackIn_5_0 = this.a(param1 - 3, param2);
            return stackIn_5_0;
          }
          if (99 != param0) {
            return false;
          }
          stackIn_8_0 = this.b(10, param2);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("pl.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    private final boolean a(int param0) {
        if (!this.d(true)) {
          return false;
        }
        int var2 = -1;
        try {
          var2 = Integer.parseInt(this.field_Q.field_q);
        } catch (NumberFormatException numberFormatException) {
        }
        if (param0 != 10152) {
          ng var4 = (ng) null;
          this.a(-14, 96, -17, (ng) null);
        }
        return oi.a(this, var2, this.field_T.field_M, this.field_P.field_q, (byte) -98, this.field_V.field_q, this.field_U.field_q);
    }

    private final boolean d(boolean param0) {
        boolean discarded$1 = false;
        bp var3;
        gk stackIn_4_1 = null;
        boolean stackIn_5_2 = false;
        gk stackIn_9_1 = null;
        boolean stackIn_10_2 = false;
        gk stackIn_13_1 = null;
        boolean stackIn_14_2 = false;
        gk stackIn_17_1 = null;
        boolean stackIn_18_2 = false;
        gk stackIn_21_1 = null;
        boolean stackIn_22_2 = false;
        if (!param0) {
          var3 = (bp) null;
          discarded$1 = this.a((bp) null, false);
        }
        stackIn_4_1 = this.field_U;
        stackIn_5_2 = !(param0);
        if (this.a(stackIn_4_1, stackIn_5_2) &&
          this.a(this.field_P, false)) {
          stackIn_9_1 = this.field_L;
          stackIn_10_2 = !(param0);
          if (this.a(stackIn_9_1, stackIn_10_2)) {
            stackIn_13_1 = this.field_V;
            stackIn_14_2 = !(param0);
            if (this.a(stackIn_13_1, stackIn_14_2)) {
              stackIn_17_1 = this.field_X;
              stackIn_18_2 = !(param0);
              if (this.a(stackIn_17_1, stackIn_18_2)) {
                stackIn_21_1 = this.field_Q;
                stackIn_22_2 = !(param0);
                if (this.a(stackIn_21_1, stackIn_22_2)) {
                  return true;
                }
              }
            }
          }
        }
        return false;
    }

    public static void e(byte param0) {
        field_J = null;
        if (param0 <= 63) {
          pl.m(-75);
        }
        field_Y = null;
    }

    final static boolean m(int param0) {
        if (param0 != 99) {
          field_O = 123;
        }
        return hn.field_f == io.field_c.field_kc ? true : false;
    }

    private final int a(String param0, int param1, ng param2, int param3, int param4, String param5) {
        RuntimeException var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 35) {
            this.field_T = (h) null;
          }
          stackIn_3_0 = this.a(param5, param2, 35, param4, param1, 126, param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("pl.R(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    static {
        field_Y = new bb();
    }
}
