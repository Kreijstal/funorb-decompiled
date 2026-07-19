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
        ((ec) ((Object) this.field_U.a(1))).f(-112);
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
        this.field_R.a(var7, (byte) 68, var3, -var7 + 496 >> -1246986815, 40);
        this.field_K.a(60, (byte) 23, var3 + 15, var6 + 3, 40);
        this.field_K.field_n = (fn) (this);
        this.field_R.field_n = (fn) (this);
        this.b(this.field_R, 80);
        this.b(this.field_K, 80);
        this.field_W = new a((pn) (this));
        this.field_W.a(-this.field_U.field_E + -this.field_U.field_z + (this.field_E + -60), (byte) 100, 20 + this.field_U.field_p, 60 + this.field_U.field_z - -this.field_U.field_E, 150);
        this.b(this.field_W, 80);
        this.a(496, (byte) 28, 0, 0, var3 - -55 - -var6);
    }

    private final int a(String param0, int param1, ng param2, int param3, int param4) {
        qp var6 = null;
        RuntimeException var6_ref = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var6 = new qp(20, param4, param3 + 120, 25, param2, false, 120, 3, he.field_d, 16777215, param0);
            this.b(var6, 80);
            if (param1 <= -6) {
              stackOut_3_0 = var6.field_C;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = -103;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var6_ref);
            stackOut_5_1 = new StringBuilder().append("pl.J(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    private final int a(byte param0, int param1, ng param2, int param3, String param4) {
        RuntimeException var6 = null;
        vc var7 = null;
        int var8 = 0;
        qp var9 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var9 = new qp(20, param3, 120 - -param1, 25, param2, false, 120, 3, he.field_d, 16777215, param4);
            this.b(var9, 80);
            var7 = new vc(((bp) ((Object) param2)).a(1));
            this.b(var7, 80);
            var7.a(15, (byte) 73, (var9.field_C - 15 >> 243741281) + var9.field_p, var9.field_E + (var9.field_z + 3), 15);
            var8 = -32 / ((param0 - -2) / 54);
            stackOut_0_0 = var9.field_C;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var6);
            stackOut_2_1 = new StringBuilder().append("pl.F(").append(param0).append(',').append(param1).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param3).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param4 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        return stackIn_1_0;
    }

    final static void c(boolean param0) {
        boolean discarded$1 = false;
        RuntimeException var1 = null;
        pc var1_ref = null;
        int var2 = 0;
        uj var3_ref_uj = null;
        long var3 = 0L;
        int var3_int = 0;
        eq var3_ref_eq = null;
        eq var4 = null;
        int var4_int = 0;
        int var5 = 0;
        eq var6 = null;
        uj var7 = null;
        uj var8_ref_uj = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var13 = null;
        String var14 = null;
        String var15 = null;
        Object var16 = null;
        eq var16_ref = null;
        uj var17 = null;
        String var18 = null;
        String var19 = null;
        uj var20 = null;
        uj var21 = null;
        Object var22 = null;
        eq var22_ref = null;
        Object var23 = null;
        eq var23_ref = null;
        uj var24 = null;
        int stackIn_46_0 = 0;
        uj stackIn_50_0 = null;
        String stackIn_50_1 = null;
        String stackIn_50_2 = null;
        uj stackIn_51_0 = null;
        String stackIn_51_1 = null;
        String stackIn_51_2 = null;
        uj stackIn_52_0 = null;
        String stackIn_52_1 = null;
        String stackIn_52_2 = null;
        int stackIn_52_3 = 0;
        uj stackIn_54_0 = null;
        uj stackIn_55_0 = null;
        uj stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        pc stackIn_99_0 = null;
        pc stackIn_100_0 = null;
        pc stackIn_101_0 = null;
        int stackIn_101_1 = 0;
        vg stackIn_104_0 = null;
        vg stackIn_105_0 = null;
        vg stackIn_106_0 = null;
        int stackIn_106_1 = 0;
        uj stackIn_108_0 = null;
        uj stackIn_109_0 = null;
        uj stackIn_110_0 = null;
        int stackIn_110_1 = 0;
        pc stackIn_112_0 = null;
        pc stackIn_113_0 = null;
        pc stackIn_114_0 = null;
        int stackIn_114_1 = 0;
        RuntimeException decompiledCaughtException = null;
        pc stackOut_98_0 = null;
        pc stackOut_100_0 = null;
        int stackOut_100_1 = 0;
        pc stackOut_99_0 = null;
        int stackOut_99_1 = 0;
        vg stackOut_103_0 = null;
        vg stackOut_105_0 = null;
        int stackOut_105_1 = 0;
        vg stackOut_104_0 = null;
        int stackOut_104_1 = 0;
        uj stackOut_107_0 = null;
        uj stackOut_109_0 = null;
        int stackOut_109_1 = 0;
        uj stackOut_108_0 = null;
        int stackOut_108_1 = 0;
        pc stackOut_111_0 = null;
        pc stackOut_113_0 = null;
        int stackOut_113_1 = 0;
        pc stackOut_112_0 = null;
        int stackOut_112_1 = 0;
        int stackOut_45_0 = 0;
        int stackOut_44_0 = 0;
        uj stackOut_49_0 = null;
        String stackOut_49_1 = null;
        String stackOut_49_2 = null;
        uj stackOut_51_0 = null;
        String stackOut_51_1 = null;
        String stackOut_51_2 = null;
        int stackOut_51_3 = 0;
        uj stackOut_50_0 = null;
        String stackOut_50_1 = null;
        String stackOut_50_2 = null;
        int stackOut_50_3 = 0;
        uj stackOut_53_0 = null;
        uj stackOut_55_0 = null;
        int stackOut_55_1 = 0;
        uj stackOut_54_0 = null;
        int stackOut_54_1 = 0;
        var16 = null;
        var22 = null;
        var23 = null;
        var11 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              var1_ref = vi.field_o;
              if (param0) {
                break L1;
              } else {
                discarded$1 = pl.m(96);
                break L1;
              }
            }
            L2: {
              L3: {
                var2 = ((we) ((Object) var1_ref)).f(255);
                if (-1 == (var2 ^ -1)) {
                  break L3;
                } else {
                  if (var2 == 1) {
                    break L3;
                  } else {
                    if (2 == var2) {
                      break L3;
                    } else {
                      if (3 == var2) {
                        break L3;
                      } else {
                        if (var2 != 4) {
                          if (var2 != 5) {
                            if (6 == var2) {
                              var3 = ((we) ((Object) var1_ref)).a(false);
                              var5 = ((we) ((Object) var1_ref)).f(255);
                              var24 = gp.a(2, var3);
                              if (var24 == null) {
                                break L2;
                              } else {
                                L4: {
                                  if (var24.field_Jb) {
                                    ka.field_X = ka.field_X - 1;
                                    var24.field_Jb = false;
                                    break L4;
                                  } else {
                                    break L4;
                                  }
                                }
                                L5: {
                                  if (var5 != 0) {
                                    var24.field_Tb = mh.field_b;
                                    var24.field_Eb = var5;
                                    break L5;
                                  } else {
                                    var24.c(2779);
                                    break L5;
                                  }
                                }
                                var24.e(17);
                                break L2;
                              }
                            } else {
                              if (-8 != (var2 ^ -1)) {
                                if (8 == var2) {
                                  L6: {
                                    var3_int = ((we) ((Object) var1_ref)).a((byte) -124);
                                    var4 = (eq) ((Object) dg.field_f.a(-11434, (long)var3_int));
                                    if (var4 == null) {
                                      var4 = new eq(fj.field_b);
                                      dg.field_f.a(false, var4, (long)var3_int);
                                      break L6;
                                    } else {
                                      break L6;
                                    }
                                  }
                                  kd.a(true, var4, (byte) 120, var1_ref);
                                  w.a((byte) -48, var4);
                                  break L2;
                                } else {
                                  if ((var2 ^ -1) == -10) {
                                    var3_int = ((we) ((Object) var1_ref)).a((byte) 124);
                                    var4_int = ((we) ((Object) var1_ref)).f(255);
                                    var23_ref = (eq) ((Object) dg.field_f.a(-11434, (long)var3_int));
                                    if (var23_ref != null) {
                                      L7: {
                                        if (0 != var4_int) {
                                          var23_ref.field_Rb = mh.field_b;
                                          var23_ref.field_Qb = var4_int;
                                          break L7;
                                        } else {
                                          var23_ref.c(2779);
                                          break L7;
                                        }
                                      }
                                      var23_ref.e(17);
                                      break L2;
                                    } else {
                                      break L2;
                                    }
                                  } else {
                                    if (10 == var2) {
                                      var3_ref_eq = (eq) ((Object) nk.field_a.c(1504642273));
                                      L8: while (true) {
                                        if (var3_ref_eq == null) {
                                          break L2;
                                        } else {
                                          var3_ref_eq.c(2779);
                                          var3_ref_eq.e(17);
                                          var3_ref_eq = (eq) ((Object) nk.field_a.f(1504642273));
                                          continue L8;
                                        }
                                      }
                                    } else {
                                      L9: {
                                        if (11 == var2) {
                                          break L9;
                                        } else {
                                          if (12 == var2) {
                                            break L9;
                                          } else {
                                            if (-14 != (var2 ^ -1)) {
                                              L10: {
                                                if (var2 == 14) {
                                                  break L10;
                                                } else {
                                                  if ((var2 ^ -1) == -17) {
                                                    break L10;
                                                  } else {
                                                    L11: {
                                                      if ((var2 ^ -1) == -16) {
                                                        break L11;
                                                      } else {
                                                        if (var2 == 17) {
                                                          break L11;
                                                        } else {
                                                          if ((var2 ^ -1) == -19) {
                                                            L12: {
                                                              stackOut_98_0 = (pc) (var1_ref);
                                                              stackIn_100_0 = stackOut_98_0;
                                                              stackIn_99_0 = stackOut_98_0;
                                                              if (param0) {
                                                                stackOut_100_0 = (pc) ((Object) stackIn_100_0);
                                                                stackOut_100_1 = 0;
                                                                stackIn_101_0 = stackOut_100_0;
                                                                stackIn_101_1 = stackOut_100_1;
                                                                break L12;
                                                              } else {
                                                                stackOut_99_0 = (pc) ((Object) stackIn_99_0);
                                                                stackOut_99_1 = 1;
                                                                stackIn_101_0 = stackOut_99_0;
                                                                stackIn_101_1 = stackOut_99_1;
                                                                break L12;
                                                              }
                                                            }
                                                            L13: {
                                                              var3 = ((we) (Object) stackIn_101_0).a(stackIn_101_1 != 0);
                                                              var18 = ((we) ((Object) var1_ref)).h(5);
                                                              var19 = ((we) ((Object) var1_ref)).h(5);
                                                              var7 = ll.a(var3, 14428);
                                                              if (var7 == null) {
                                                                L14: {
                                                                  var7 = new uj(var18, var19, var3);
                                                                  stackOut_103_0 = eh.field_f;
                                                                  stackIn_105_0 = stackOut_103_0;
                                                                  stackIn_104_0 = stackOut_103_0;
                                                                  if (param0) {
                                                                    stackOut_105_0 = (vg) ((Object) stackIn_105_0);
                                                                    stackOut_105_1 = 0;
                                                                    stackIn_106_0 = stackOut_105_0;
                                                                    stackIn_106_1 = stackOut_105_1;
                                                                    break L14;
                                                                  } else {
                                                                    stackOut_104_0 = (vg) ((Object) stackIn_104_0);
                                                                    stackOut_104_1 = 1;
                                                                    stackIn_106_0 = stackOut_104_0;
                                                                    stackIn_106_1 = stackOut_104_1;
                                                                    break L14;
                                                                  }
                                                                }
                                                                ((vg) (Object) stackIn_106_0).a(stackIn_106_1 != 0, var7, var3);
                                                                io.field_c.field_mc = io.field_c.field_mc + 1;
                                                                break L13;
                                                              } else {
                                                                break L13;
                                                              }
                                                            }
                                                            L15: {
                                                              var7.field_Rb = ((we) ((Object) var1_ref)).a((byte) 25);
                                                              var8 = ((we) ((Object) var1_ref)).j(127);
                                                              stackOut_107_0 = (uj) (var7);
                                                              stackIn_109_0 = stackOut_107_0;
                                                              stackIn_108_0 = stackOut_107_0;
                                                              if (0 == (1 & var8)) {
                                                                stackOut_109_0 = (uj) ((Object) stackIn_109_0);
                                                                stackOut_109_1 = 0;
                                                                stackIn_110_0 = stackOut_109_0;
                                                                stackIn_110_1 = stackOut_109_1;
                                                                break L15;
                                                              } else {
                                                                stackOut_108_0 = (uj) ((Object) stackIn_108_0);
                                                                stackOut_108_1 = 1;
                                                                stackIn_110_0 = stackOut_108_0;
                                                                stackIn_110_1 = stackOut_108_1;
                                                                break L15;
                                                              }
                                                            }
                                                            stackIn_110_0.field_Xb = stackIn_110_1 != 0;
                                                            var7.field_Yb = var8 >> -1923419807;
                                                            var7.field_Qb = ((we) ((Object) var1_ref)).f(255);
                                                            var7.field_Ib = ((we) ((Object) var1_ref)).f(255);
                                                            wi.field_a.a(22125, var7);
                                                            break L2;
                                                          } else {
                                                            if (19 == var2) {
                                                              var3 = ((we) ((Object) var1_ref)).a(false);
                                                              var5 = ((we) ((Object) var1_ref)).f(255);
                                                              var17 = ll.a(var3, 14428);
                                                              if (var17 != null) {
                                                                L16: {
                                                                  if (var5 != 0) {
                                                                    var17.field_Eb = var5;
                                                                    var17.field_Tb = mh.field_b;
                                                                    break L16;
                                                                  } else {
                                                                    var17.c(2779);
                                                                    break L16;
                                                                  }
                                                                }
                                                                var17.e(17);
                                                                io.field_c.field_mc = io.field_c.field_mc - 1;
                                                                break L2;
                                                              } else {
                                                                break L2;
                                                              }
                                                            } else {
                                                              if (20 == var2) {
                                                                kd.a(false, io.field_c, (byte) 120, var1_ref);
                                                                break L2;
                                                              } else {
                                                                if (-22 == (var2 ^ -1)) {
                                                                  var3_int = ((we) ((Object) var1_ref)).a((byte) -120);
                                                                  if (var3_int == 0) {
                                                                    bo.field_e = 0L;
                                                                    break L2;
                                                                  } else {
                                                                    bo.field_e = (long)var3_int + hm.a(64);
                                                                    break L2;
                                                                  }
                                                                } else {
                                                                  if (-23 != (var2 ^ -1)) {
                                                                    if (var2 != 23) {
                                                                      jo.a(1, "L1: " + jm.b(-74), (Throwable) null);
                                                                      na.a(true);
                                                                      break L2;
                                                                    } else {
                                                                      hn.field_f = ((we) ((Object) var1_ref)).a(false);
                                                                      break L2;
                                                                    }
                                                                  } else {
                                                                    gi.field_a = ((we) ((Object) var1_ref)).a((byte) 63);
                                                                    ui.field_e = ((we) ((Object) var1_ref)).j(127);
                                                                    break L2;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L17: {
                                                      stackOut_111_0 = (pc) (var1_ref);
                                                      stackIn_113_0 = stackOut_111_0;
                                                      stackIn_112_0 = stackOut_111_0;
                                                      if (param0) {
                                                        stackOut_113_0 = (pc) ((Object) stackIn_113_0);
                                                        stackOut_113_1 = 0;
                                                        stackIn_114_0 = stackOut_113_0;
                                                        stackIn_114_1 = stackOut_113_1;
                                                        break L17;
                                                      } else {
                                                        stackOut_112_0 = (pc) ((Object) stackIn_112_0);
                                                        stackOut_112_1 = 1;
                                                        stackIn_114_0 = stackOut_112_0;
                                                        stackIn_114_1 = stackOut_112_1;
                                                        break L17;
                                                      }
                                                    }
                                                    var3 = ((we) (Object) stackIn_114_0).a(stackIn_114_1 != 0);
                                                    var5 = ((we) ((Object) var1_ref)).f(255);
                                                    var20 = gp.a(2, var3);
                                                    if (var20 == null) {
                                                      break L2;
                                                    } else {
                                                      L18: {
                                                        if (15 != var2) {
                                                          if (!var20.field_Jb) {
                                                            break L18;
                                                          } else {
                                                            ka.field_X = ka.field_X - 1;
                                                            var20.field_Jb = false;
                                                            break L18;
                                                          }
                                                        } else {
                                                          var20.field_Vb = false;
                                                          break L18;
                                                        }
                                                      }
                                                      L19: {
                                                        if (var5 == 0) {
                                                          break L19;
                                                        } else {
                                                          var20.field_Tb = mh.field_b;
                                                          var20.field_Eb = var5;
                                                          break L19;
                                                        }
                                                      }
                                                      il.a(-124, var20);
                                                      break L2;
                                                    }
                                                  }
                                                }
                                              }
                                              var3 = ((we) ((Object) var1_ref)).a(false);
                                              var21 = gp.a(2, var3);
                                              if (var21 == null) {
                                                break L2;
                                              } else {
                                                L20: {
                                                  if (var2 == 14) {
                                                    var21.field_Vb = true;
                                                    break L20;
                                                  } else {
                                                    if (var21.field_Jb) {
                                                      break L20;
                                                    } else {
                                                      ka.field_X = ka.field_X + 1;
                                                      var21.field_Jb = true;
                                                      break L20;
                                                    }
                                                  }
                                                }
                                                il.a(-97, var21);
                                                break L2;
                                              }
                                            } else {
                                              var3_int = ((we) ((Object) var1_ref)).a((byte) 107);
                                              var4_int = ((we) ((Object) var1_ref)).f(255);
                                              var16_ref = (eq) ((Object) dg.field_f.a(-11434, (long)var3_int));
                                              if (var16_ref != null) {
                                                L21: {
                                                  var16_ref.field_Ob = false;
                                                  var6 = var16_ref;
                                                  if (var4_int != 0) {
                                                    var16_ref.field_Rb = mh.field_b;
                                                    var16_ref.field_Qb = var4_int;
                                                    break L21;
                                                  } else {
                                                    break L21;
                                                  }
                                                }
                                                var6.field_cc = false;
                                                w.a((byte) -48, var16_ref);
                                                break L2;
                                              } else {
                                                break L2;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      var3_int = ((we) ((Object) var1_ref)).a((byte) -124);
                                      var22_ref = (eq) ((Object) dg.field_f.a(-11434, (long)var3_int));
                                      if (var22_ref != null) {
                                        L22: {
                                          if (var2 != 11) {
                                            var22_ref.field_Ob = true;
                                            break L22;
                                          } else {
                                            var22_ref.field_cc = true;
                                            break L22;
                                          }
                                        }
                                        w.a((byte) -48, var22_ref);
                                        break L2;
                                      } else {
                                        break L2;
                                      }
                                    }
                                  }
                                }
                              } else {
                                var3_ref_uj = (uj) ((Object) i.field_n.c(1504642273));
                                L23: while (true) {
                                  if (var3_ref_uj == null) {
                                    ka.field_X = 0;
                                    break L2;
                                  } else {
                                    var3_ref_uj.c(2779);
                                    var3_ref_uj.e(17);
                                    var3_ref_uj = (uj) ((Object) i.field_n.f(1504642273));
                                    continue L23;
                                  }
                                }
                              }
                            }
                          } else {
                            L24: {
                              var3 = ((we) ((Object) var1_ref)).a(false);
                              var14 = ((we) ((Object) var1_ref)).h(5);
                              var13 = ((we) ((Object) var1_ref)).h(5);
                              var15 = ((we) ((Object) var1_ref)).h(5);
                              var8_ref_uj = gp.a(2, var3);
                              if (var13.equals("")) {
                                stackOut_45_0 = 0;
                                stackIn_46_0 = stackOut_45_0;
                                break L24;
                              } else {
                                stackOut_44_0 = 1;
                                stackIn_46_0 = stackOut_44_0;
                                break L24;
                              }
                            }
                            L25: {
                              var9 = stackIn_46_0;
                              if (var8_ref_uj != null) {
                                if (var9 == 0) {
                                  break L25;
                                } else {
                                  L26: {
                                    stackOut_49_0 = (uj) (var8_ref_uj);
                                    stackOut_49_1 = (String) (var15);
                                    stackOut_49_2 = (String) (var14);
                                    stackIn_51_0 = stackOut_49_0;
                                    stackIn_51_1 = stackOut_49_1;
                                    stackIn_51_2 = stackOut_49_2;
                                    stackIn_50_0 = stackOut_49_0;
                                    stackIn_50_1 = stackOut_49_1;
                                    stackIn_50_2 = stackOut_49_2;
                                    if (param0) {
                                      stackOut_51_0 = (uj) ((Object) stackIn_51_0);
                                      stackOut_51_1 = (String) ((Object) stackIn_51_1);
                                      stackOut_51_2 = (String) ((Object) stackIn_51_2);
                                      stackOut_51_3 = 0;
                                      stackIn_52_0 = stackOut_51_0;
                                      stackIn_52_1 = stackOut_51_1;
                                      stackIn_52_2 = stackOut_51_2;
                                      stackIn_52_3 = stackOut_51_3;
                                      break L26;
                                    } else {
                                      stackOut_50_0 = (uj) ((Object) stackIn_50_0);
                                      stackOut_50_1 = (String) ((Object) stackIn_50_1);
                                      stackOut_50_2 = (String) ((Object) stackIn_50_2);
                                      stackOut_50_3 = 1;
                                      stackIn_52_0 = stackOut_50_0;
                                      stackIn_52_1 = stackOut_50_1;
                                      stackIn_52_2 = stackOut_50_2;
                                      stackIn_52_3 = stackOut_50_3;
                                      break L26;
                                    }
                                  }
                                  ((uj) (Object) stackIn_52_0).a(stackIn_52_1, stackIn_52_2, stackIn_52_3 != 0);
                                  break L25;
                                }
                              } else {
                                var8_ref_uj = new uj(var14, var15, var3);
                                il.field_d.a(false, var8_ref_uj, var3);
                                break L25;
                              }
                            }
                            L27: {
                              var8_ref_uj.field_Pb = hm.a(64) - (long)((we) ((Object) var1_ref)).k(0);
                              var8_ref_uj.field_Rb = ((we) ((Object) var1_ref)).a((byte) 105);
                              var10 = ((we) ((Object) var1_ref)).j(127);
                              var8_ref_uj.field_Yb = var10 >> 532671137;
                              stackOut_53_0 = (uj) (var8_ref_uj);
                              stackIn_55_0 = stackOut_53_0;
                              stackIn_54_0 = stackOut_53_0;
                              if (-1 == (var10 & 1 ^ -1)) {
                                stackOut_55_0 = (uj) ((Object) stackIn_55_0);
                                stackOut_55_1 = 0;
                                stackIn_56_0 = stackOut_55_0;
                                stackIn_56_1 = stackOut_55_1;
                                break L27;
                              } else {
                                stackOut_54_0 = (uj) ((Object) stackIn_54_0);
                                stackOut_54_1 = 1;
                                stackIn_56_0 = stackOut_54_0;
                                stackIn_56_1 = stackOut_54_1;
                                break L27;
                              }
                            }
                            stackIn_56_0.field_Xb = stackIn_56_1 != 0;
                            var8_ref_uj.field_Qb = ((we) ((Object) var1_ref)).f(255);
                            var8_ref_uj.field_Ib = ((we) ((Object) var1_ref)).f(255);
                            il.a(-28, var8_ref_uj);
                            break L2;
                          }
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
              }
              var3_ref_uj = (uj) ((Object) wi.field_a.c(1504642273));
              L28: while (true) {
                if (var3_ref_uj == null) {
                  var3_ref_uj = (uj) ((Object) il.field_d.a(-110));
                  L29: while (true) {
                    if (var3_ref_uj == null) {
                      L30: {
                        if (-2 != (var2 ^ -1)) {
                          break L30;
                        } else {
                          if (null != io.field_c) {
                            wo.field_b = io.field_c.field_pc;
                            break L30;
                          } else {
                            break L30;
                          }
                        }
                      }
                      L31: {
                        if (-5 == (var2 ^ -1)) {
                          var3_int = ((we) ((Object) var1_ref)).a((byte) 49);
                          io.field_c = new eq(fj.field_b);
                          io.field_c.a((long)var3_int, 29574);
                          kd.a(false, io.field_c, (byte) 120, var1_ref);
                          bo.field_e = 0L;
                          break L31;
                        } else {
                          io.field_c = null;
                          break L31;
                        }
                      }
                      L32: {
                        L33: {
                          if (var2 == 2) {
                            break L33;
                          } else {
                            if (var2 != 3) {
                              bn.field_S = null;
                              break L32;
                            } else {
                              break L33;
                            }
                          }
                        }
                        if (bn.field_S != null) {
                          break L32;
                        } else {
                          bn.field_S = new eq(fj.field_b);
                          break L32;
                        }
                      }
                      if (var2 != 3) {
                        rl.field_r = false;
                        break L2;
                      } else {
                        rl.field_r = true;
                        var3_int = 0;
                        L34: while (true) {
                          if (var3_int >= qm.field_J.length) {
                            ib.field_a = ((we) ((Object) var1_ref)).f(255);
                            mg.field_i = ((we) ((Object) var1_ref)).f(255);
                            var3_int = 0;
                            L35: while (true) {
                              if (k.field_k.length <= var3_int) {
                                break L2;
                              } else {
                                k.field_k[var3_int] = ((we) ((Object) var1_ref)).a(0);
                                var3_int++;
                                continue L35;
                              }
                            }
                          } else {
                            qm.field_J[var3_int] = ((we) ((Object) var1_ref)).a(0);
                            var3_int++;
                            continue L34;
                          }
                        }
                      }
                    } else {
                      L36: {
                        L37: {
                          if (var3_ref_uj.field_Vb) {
                            break L37;
                          } else {
                            if (!var3_ref_uj.field_Jb) {
                              break L36;
                            } else {
                              break L37;
                            }
                          }
                        }
                        L38: {
                          if (!var3_ref_uj.field_Jb) {
                            break L38;
                          } else {
                            ka.field_X = ka.field_X - 1;
                            var3_ref_uj.field_Jb = false;
                            break L38;
                          }
                        }
                        var3_ref_uj.field_Vb = false;
                        il.a(-117, var3_ref_uj);
                        break L36;
                      }
                      var3_ref_uj = (uj) ((Object) il.field_d.a((byte) 50));
                      continue L29;
                    }
                  }
                } else {
                  var3_ref_uj.c(2779);
                  var3_ref_uj.e(17);
                  var3_ref_uj = (uj) ((Object) wi.field_a.f(1504642273));
                  continue L28;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "pl.O(" + param0 + ')');
        }
    }

    public final void a(int param0, int param1, int param2, db param3) {
        int discarded$2 = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        ng var7 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var6 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 != 0) {
                if (-2 != (param0 ^ -1)) {
                  if (-3 != (param0 ^ -1)) {
                    break L1;
                  } else {
                    jc.a("conduct.ws", -120);
                    break L1;
                  }
                } else {
                  jc.a("privacy.ws", -27);
                  break L1;
                }
              } else {
                jc.a("terms.ws", -14);
                break L1;
              }
            }
            L2: {
              if (param2 == -8894) {
                break L2;
              } else {
                var7 = (ng) null;
                discarded$2 = this.a((String) null, 66, (ng) null, -19, -43);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var5);
            stackOut_10_1 = new StringBuilder().append("pl.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    public final void a(qm param0, int param1, int param2, int param3, int param4) {
        boolean discarded$2 = false;
        RuntimeException var6 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == 11) {
                break L1;
              } else {
                this.field_K = (qm) null;
                break L1;
              }
            }
            L2: {
              if (this.field_K != param0) {
                if (param0 == this.field_R) {
                  discarded$2 = this.a(10152);
                  break L2;
                } else {
                  break L2;
                }
              } else {
                mj.c(24496);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var6);
            stackOut_8_1 = new StringBuilder().append("pl.Q(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final boolean a(bp param0, boolean param1) {
        boolean discarded$2 = false;
        ml var3 = null;
        RuntimeException var3_ref = null;
        dj var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            var3 = param0.a(1);
            if (var3 == null) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var4 = var3.a((byte) 112);
              if (sk.field_a != var4) {
                if (var4 != uo.field_b) {
                  if (var4 == wh.field_o) {
                    stackOut_12_0 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (!param1) {
                      stackOut_16_0 = 1;
                      stackIn_17_0 = stackOut_16_0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      discarded$2 = pl.m(-52);
                      return true;
                    }
                  }
                } else {
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var3_ref);
            stackOut_18_1 = new StringBuilder().append("pl.I(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L1;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L1;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_13_0 != 0;
              } else {
                return stackIn_17_0 != 0;
              }
            }
          }
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
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var10 = new qp(20, param4, 120 - -param3, 25, param1, false, 120, 3, he.field_d, 16777215, param0);
            this.b(var10, 80);
            var9 = new md(((bp) ((Object) param1)).a(param5 + -125), param6, param5, var10.field_C + param4, 50 + param3, param2);
            var9.field_n = (fn) (this);
            this.b(var9, 80);
            stackOut_0_0 = var10.field_C + var9.field_C;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var8);
            stackOut_2_1 = new StringBuilder().append("pl.S(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param6 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_1_0;
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
        int stackIn_2_0 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_8_0 = false;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        boolean stackOut_7_0 = false;
        boolean stackOut_4_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3)) {
              if (param0 != 98) {
                if (99 != param0) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackOut_7_0 = this.b(10, param2);
                  stackIn_8_0 = stackOut_7_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackOut_4_0 = this.a(param1 + -3, param2);
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var5);
            stackOut_11_1 = new StringBuilder().append("pl.G(").append(param0).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0;
            } else {
              return stackIn_10_0 != 0;
            }
          }
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
        return oi.a((pl) (this), var2, this.field_T.field_M, this.field_P.field_q, (byte) -98, this.field_V.field_q, this.field_U.field_q);
    }

    private final boolean d(boolean param0) {
        boolean discarded$2 = false;
        bp var3 = null;
        Object stackIn_3_0 = null;
        gk stackIn_3_1 = null;
        Object stackIn_4_0 = null;
        gk stackIn_4_1 = null;
        Object stackIn_5_0 = null;
        gk stackIn_5_1 = null;
        int stackIn_5_2 = 0;
        Object stackIn_8_0 = null;
        gk stackIn_8_1 = null;
        Object stackIn_9_0 = null;
        gk stackIn_9_1 = null;
        Object stackIn_10_0 = null;
        gk stackIn_10_1 = null;
        int stackIn_10_2 = 0;
        Object stackIn_12_0 = null;
        gk stackIn_12_1 = null;
        Object stackIn_13_0 = null;
        gk stackIn_13_1 = null;
        Object stackIn_14_0 = null;
        gk stackIn_14_1 = null;
        int stackIn_14_2 = 0;
        Object stackIn_16_0 = null;
        gk stackIn_16_1 = null;
        Object stackIn_17_0 = null;
        gk stackIn_17_1 = null;
        Object stackIn_18_0 = null;
        gk stackIn_18_1 = null;
        int stackIn_18_2 = 0;
        Object stackIn_20_0 = null;
        gk stackIn_20_1 = null;
        Object stackIn_21_0 = null;
        gk stackIn_21_1 = null;
        Object stackIn_22_0 = null;
        gk stackIn_22_1 = null;
        int stackIn_22_2 = 0;
        Object stackOut_2_0 = null;
        gk stackOut_2_1 = null;
        Object stackOut_4_0 = null;
        gk stackOut_4_1 = null;
        int stackOut_4_2 = 0;
        Object stackOut_3_0 = null;
        gk stackOut_3_1 = null;
        int stackOut_3_2 = 0;
        Object stackOut_7_0 = null;
        gk stackOut_7_1 = null;
        Object stackOut_9_0 = null;
        gk stackOut_9_1 = null;
        int stackOut_9_2 = 0;
        Object stackOut_8_0 = null;
        gk stackOut_8_1 = null;
        int stackOut_8_2 = 0;
        Object stackOut_11_0 = null;
        gk stackOut_11_1 = null;
        Object stackOut_13_0 = null;
        gk stackOut_13_1 = null;
        int stackOut_13_2 = 0;
        Object stackOut_12_0 = null;
        gk stackOut_12_1 = null;
        int stackOut_12_2 = 0;
        Object stackOut_15_0 = null;
        gk stackOut_15_1 = null;
        Object stackOut_17_0 = null;
        gk stackOut_17_1 = null;
        int stackOut_17_2 = 0;
        Object stackOut_16_0 = null;
        gk stackOut_16_1 = null;
        int stackOut_16_2 = 0;
        Object stackOut_19_0 = null;
        gk stackOut_19_1 = null;
        Object stackOut_21_0 = null;
        gk stackOut_21_1 = null;
        int stackOut_21_2 = 0;
        Object stackOut_20_0 = null;
        gk stackOut_20_1 = null;
        int stackOut_20_2 = 0;
        L0: {
          if (param0) {
            break L0;
          } else {
            var3 = (bp) null;
            discarded$2 = this.a((bp) null, false);
            break L0;
          }
        }
        L1: {
          stackOut_2_0 = this;
          stackOut_2_1 = this.field_U;
          stackIn_4_0 = stackOut_2_0;
          stackIn_4_1 = stackOut_2_1;
          stackIn_3_0 = stackOut_2_0;
          stackIn_3_1 = stackOut_2_1;
          if (param0) {
            stackOut_4_0 = this;
            stackOut_4_1 = (gk) ((Object) stackIn_4_1);
            stackOut_4_2 = 0;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            stackIn_5_2 = stackOut_4_2;
            break L1;
          } else {
            stackOut_3_0 = this;
            stackOut_3_1 = (gk) ((Object) stackIn_3_1);
            stackOut_3_2 = 1;
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_5_2 = stackOut_3_2;
            break L1;
          }
        }
        L2: {
          if (this.a(stackIn_5_1, stackIn_5_2 == 0)) {
            break L2;
          } else {
            if (!this.a(this.field_P, false)) {
              break L2;
            } else {
              L3: {
                stackOut_7_0 = this;
                stackOut_7_1 = this.field_L;
                stackIn_9_0 = stackOut_7_0;
                stackIn_9_1 = stackOut_7_1;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                if (param0) {
                  stackOut_9_0 = this;
                  stackOut_9_1 = (gk) ((Object) stackIn_9_1);
                  stackOut_9_2 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  stackIn_10_1 = stackOut_9_1;
                  stackIn_10_2 = stackOut_9_2;
                  break L3;
                } else {
                  stackOut_8_0 = this;
                  stackOut_8_1 = (gk) ((Object) stackIn_8_1);
                  stackOut_8_2 = 1;
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_10_1 = stackOut_8_1;
                  stackIn_10_2 = stackOut_8_2;
                  break L3;
                }
              }
              if (this.a(stackIn_10_1, stackIn_10_2 == 0)) {
                break L2;
              } else {
                L4: {
                  stackOut_11_0 = this;
                  stackOut_11_1 = this.field_V;
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  if (param0) {
                    stackOut_13_0 = this;
                    stackOut_13_1 = (gk) ((Object) stackIn_13_1);
                    stackOut_13_2 = 0;
                    stackIn_14_0 = stackOut_13_0;
                    stackIn_14_1 = stackOut_13_1;
                    stackIn_14_2 = stackOut_13_2;
                    break L4;
                  } else {
                    stackOut_12_0 = this;
                    stackOut_12_1 = (gk) ((Object) stackIn_12_1);
                    stackOut_12_2 = 1;
                    stackIn_14_0 = stackOut_12_0;
                    stackIn_14_1 = stackOut_12_1;
                    stackIn_14_2 = stackOut_12_2;
                    break L4;
                  }
                }
                if (this.a(stackIn_14_1, stackIn_14_2 == 0)) {
                  break L2;
                } else {
                  L5: {
                    stackOut_15_0 = this;
                    stackOut_15_1 = this.field_X;
                    stackIn_17_0 = stackOut_15_0;
                    stackIn_17_1 = stackOut_15_1;
                    stackIn_16_0 = stackOut_15_0;
                    stackIn_16_1 = stackOut_15_1;
                    if (param0) {
                      stackOut_17_0 = this;
                      stackOut_17_1 = (gk) ((Object) stackIn_17_1);
                      stackOut_17_2 = 0;
                      stackIn_18_0 = stackOut_17_0;
                      stackIn_18_1 = stackOut_17_1;
                      stackIn_18_2 = stackOut_17_2;
                      break L5;
                    } else {
                      stackOut_16_0 = this;
                      stackOut_16_1 = (gk) ((Object) stackIn_16_1);
                      stackOut_16_2 = 1;
                      stackIn_18_0 = stackOut_16_0;
                      stackIn_18_1 = stackOut_16_1;
                      stackIn_18_2 = stackOut_16_2;
                      break L5;
                    }
                  }
                  if (this.a(stackIn_18_1, stackIn_18_2 == 0)) {
                    break L2;
                  } else {
                    L6: {
                      stackOut_19_0 = this;
                      stackOut_19_1 = this.field_Q;
                      stackIn_21_0 = stackOut_19_0;
                      stackIn_21_1 = stackOut_19_1;
                      stackIn_20_0 = stackOut_19_0;
                      stackIn_20_1 = stackOut_19_1;
                      if (param0) {
                        stackOut_21_0 = this;
                        stackOut_21_1 = (gk) ((Object) stackIn_21_1);
                        stackOut_21_2 = 0;
                        stackIn_22_0 = stackOut_21_0;
                        stackIn_22_1 = stackOut_21_1;
                        stackIn_22_2 = stackOut_21_2;
                        break L6;
                      } else {
                        stackOut_20_0 = this;
                        stackOut_20_1 = (gk) ((Object) stackIn_20_1);
                        stackOut_20_2 = 1;
                        stackIn_22_0 = stackOut_20_0;
                        stackIn_22_1 = stackOut_20_1;
                        stackIn_22_2 = stackOut_20_2;
                        break L6;
                      }
                    }
                    if (this.a(stackIn_22_1, stackIn_22_2 != 0)) {
                      return true;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
          }
        }
        return false;
    }

    public static void e(byte param0) {
        boolean discarded$0 = false;
        field_J = null;
        if (param0 <= 63) {
            discarded$0 = pl.m(-75);
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
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param3 == 35) {
                break L1;
              } else {
                this.field_T = (h) null;
                break L1;
              }
            }
            stackOut_2_0 = this.a(param5, param2, 35, param4, param1, 126, param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var7);
            stackOut_4_1 = new StringBuilder().append("pl.R(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param5 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_Y = new bb();
    }
}
