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
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var6 = new qp(20, param4, param3 + 120, 25, param2, false, 120, 3, he.field_d, 16777215, param0);
            this.b(var6, 80);
            if (param1 <= -6) {
              stackIn_4_0 = var6.field_C;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -103;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var6_ref);

            stackIn_7_1 = new StringBuilder().append("pl.J(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ',' + param3 + ',' + param4 + ')');
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
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var9 = new qp(20, param3, 120 - -param1, 25, param2, false, 120, 3, he.field_d, 16777215, param4);
            this.b(var9, 80);
            var7 = new vc(((bp) ((Object) param2)).a(1));
            this.b(var7, 80);
            var7.a(15, (byte) 73, (var9.field_C - 15 >> 243741281) + var9.field_p, var9.field_E + (var9.field_z + 3), 15);
            var8 = -32 / ((param0 - -2) / 54);
            stackIn_1_0 = var9.field_C;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var6);

            stackIn_4_1 = new StringBuilder().append("pl.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_5_0), stackIn_8_2 + ')');
        }
        return stackIn_1_0;
    }

    final static void c(boolean param0) {
        int stackIn_46_0 = 0;
        uj stackIn_51_0 = null;
        String stackIn_51_1 = null;
        String stackIn_51_2 = null;
        uj stackIn_52_0;
        String stackIn_52_1;
        String stackIn_52_2;
        int stackIn_52_3;
        uj stackIn_55_0 = null;
        uj stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        pc stackIn_100_0 = null;
        pc stackIn_101_0 = null;
        int stackIn_101_1 = 0;
        vg stackIn_105_0 = null;
        vg stackIn_106_0 = null;
        int stackIn_106_1 = 0;
        uj stackIn_109_0 = null;
        uj stackIn_110_0 = null;
        int stackIn_110_1 = 0;
        pc stackIn_113_0 = null;
        pc stackIn_114_0 = null;
        int stackIn_114_1 = 0;
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
        var16 = null;
        var17 = null;
        var19 = null;
        var18 = null;
        var29 = null;
        var11 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              var1 = vi.field_o;
              if (param0) {
                break L1;
              } else {
                pl.m(96);
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  var2 = ((we) ((Object) var1)).f(255);
                  if (-1 == (var2 ^ -1)) {
                    break L4;
                  } else {
                    if (var2 == 1) {
                      break L4;
                    } else {
                      if (2 == var2) {
                        break L4;
                      } else {
                        if (3 == var2) {
                          break L4;
                        } else {
                          if (var2 != 4) {
                            if (var2 != 5) {
                              if (6 == var2) {
                                var3 = ((we) ((Object) var1)).a(false);
                                var5 = ((we) ((Object) var1)).f(255);
                                var30 = gp.a(2, var3);
                                if (var30 == null) {
                                  break L3;
                                } else {
                                  L5: {
                                    if (var30.field_Jb) {
                                      ka.field_X = ka.field_X - 1;
                                      var30.field_Jb = false;
                                      break L5;
                                    } else {
                                      break L5;
                                    }
                                  }
                                  L6: {
                                    if (var5 != 0) {
                                      var30.field_Tb = mh.field_b;
                                      var30.field_Eb = var5;
                                      break L6;
                                    } else {
                                      var30.c(2779);
                                      break L6;
                                    }
                                  }
                                  var30.e(17);
                                  break L3;
                                }
                              } else {
                                if (-8 != (var2 ^ -1)) {
                                  if (8 == var2) {
                                    L7: {
                                      var3_int = ((we) ((Object) var1)).a((byte) -124);
                                      var4 = (eq) ((Object) dg.field_f.a(-11434, (long)var3_int));
                                      if (var4 == null) {
                                        var4 = new eq(fj.field_b);
                                        dg.field_f.a(false, var4, (long)var3_int);
                                        break L7;
                                      } else {
                                        break L7;
                                      }
                                    }
                                    kd.a(true, var4, (byte) 120, var1);
                                    w.a((byte) -48, var4);
                                    break L2;
                                  } else {
                                    if ((var2 ^ -1) == -10) {
                                      var3_int = ((we) ((Object) var1)).a((byte) 124);
                                      var4_int = ((we) ((Object) var1)).f(255);
                                      var33 = (eq) ((Object) dg.field_f.a(-11434, (long)var3_int));
                                      if (var33 != null) {
                                        L8: {
                                          if (0 != var4_int) {
                                            var33.field_Rb = mh.field_b;
                                            var33.field_Qb = var4_int;
                                            break L8;
                                          } else {
                                            var33.c(2779);
                                            break L8;
                                          }
                                        }
                                        var33.e(17);
                                        break L2;
                                      } else {
                                        break L2;
                                      }
                                    } else {
                                      if (10 == var2) {
                                        var32 = (eq) ((Object) nk.field_a.c(1504642273));
                                        L9: while (true) {
                                          if (var32 == null) {
                                            break L3;
                                          } else {
                                            var32.c(2779);
                                            var32.e(17);
                                            var32 = (eq) ((Object) nk.field_a.f(1504642273));
                                            continue L9;
                                          }
                                        }
                                      } else {
                                        L10: {
                                          if (11 == var2) {
                                            break L10;
                                          } else {
                                            if (12 == var2) {
                                              break L10;
                                            } else {
                                              if (-14 != (var2 ^ -1)) {
                                                L11: {
                                                  if (var2 == 14) {
                                                    break L11;
                                                  } else {
                                                    if ((var2 ^ -1) == -17) {
                                                      break L11;
                                                    } else {
                                                      L12: {
                                                        if ((var2 ^ -1) == -16) {
                                                          break L12;
                                                        } else {
                                                          if (var2 == 17) {
                                                            break L12;
                                                          } else {
                                                            if ((var2 ^ -1) == -19) {
                                                              L13: {
                                                                stackIn_100_0 = (pc) (var1);

                                                                if (param0) {
                                                                  stackIn_101_0 = (pc) ((Object) stackIn_100_0);
                                                                  stackIn_101_1 = 0;
                                                                  break L13;
                                                                } else {
                                                                  stackIn_101_0 = (pc) ((Object) stackIn_100_0);
                                                                  stackIn_101_1 = 1;
                                                                  break L13;
                                                                }
                                                              }
                                                              L14: {
                                                                var3 = ((we) (Object) stackIn_101_0).a(stackIn_101_1 != 0);
                                                                var24 = ((we) ((Object) var1)).h(5);
                                                                var25 = ((we) ((Object) var1)).h(5);
                                                                var7 = ll.a(var3, 14428);
                                                                if (var7 == null) {
                                                                  L15: {
                                                                    var7 = new uj(var24, var25, var3);
                                                                    stackIn_105_0 = eh.field_f;

                                                                    if (param0) {
                                                                      stackIn_106_0 = (vg) ((Object) stackIn_105_0);
                                                                      stackIn_106_1 = 0;
                                                                      break L15;
                                                                    } else {
                                                                      stackIn_106_0 = (vg) ((Object) stackIn_105_0);
                                                                      stackIn_106_1 = 1;
                                                                      break L15;
                                                                    }
                                                                  }
                                                                  ((vg) (Object) stackIn_106_0).a(stackIn_106_1 != 0, var7, var3);
                                                                  io.field_c.field_mc = io.field_c.field_mc + 1;
                                                                  break L14;
                                                                } else {
                                                                  break L14;
                                                                }
                                                              }
                                                              L16: {
                                                                var7.field_Rb = ((we) ((Object) var1)).a((byte) 25);
                                                                var8 = ((we) ((Object) var1)).j(127);
                                                                stackIn_109_0 = (uj) (var7);

                                                                if (0 == (1 & var8)) {
                                                                  stackIn_110_0 = (uj) ((Object) stackIn_109_0);
                                                                  stackIn_110_1 = 0;
                                                                  break L16;
                                                                } else {
                                                                  stackIn_110_0 = (uj) ((Object) stackIn_109_0);
                                                                  stackIn_110_1 = 1;
                                                                  break L16;
                                                                }
                                                              }
                                                              stackIn_110_0.field_Xb = stackIn_110_1 != 0;
                                                              var7.field_Yb = var8 >> -1923419807;
                                                              var7.field_Qb = ((we) ((Object) var1)).f(255);
                                                              var7.field_Ib = ((we) ((Object) var1)).f(255);
                                                              wi.field_a.a(22125, var7);
                                                              break L2;
                                                            } else {
                                                              if (19 == var2) {
                                                                var3 = ((we) ((Object) var1)).a(false);
                                                                var5 = ((we) ((Object) var1)).f(255);
                                                                var23 = ll.a(var3, 14428);
                                                                if (var23 != null) {
                                                                  L17: {
                                                                    if (var5 != 0) {
                                                                      var23.field_Eb = var5;
                                                                      var23.field_Tb = mh.field_b;
                                                                      break L17;
                                                                    } else {
                                                                      var23.c(2779);
                                                                      break L17;
                                                                    }
                                                                  }
                                                                  var23.e(17);
                                                                  io.field_c.field_mc = io.field_c.field_mc - 1;
                                                                  break L2;
                                                                } else {
                                                                  break L2;
                                                                }
                                                              } else {
                                                                if (20 == var2) {
                                                                  kd.a(false, io.field_c, (byte) 120, var1);
                                                                  break L2;
                                                                } else {
                                                                  if (-22 == (var2 ^ -1)) {
                                                                    var3_int = ((we) ((Object) var1)).a((byte) -120);
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
                                                                        hn.field_f = ((we) ((Object) var1)).a(false);
                                                                        break L2;
                                                                      }
                                                                    } else {
                                                                      gi.field_a = ((we) ((Object) var1)).a((byte) 63);
                                                                      ui.field_e = ((we) ((Object) var1)).j(127);
                                                                      break L2;
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                      L18: {
                                                        stackIn_113_0 = (pc) (var1);

                                                        if (param0) {
                                                          stackIn_114_0 = (pc) ((Object) stackIn_113_0);
                                                          stackIn_114_1 = 0;
                                                          break L18;
                                                        } else {
                                                          stackIn_114_0 = (pc) ((Object) stackIn_113_0);
                                                          stackIn_114_1 = 1;
                                                          break L18;
                                                        }
                                                      }
                                                      L19: {
                                                        var3 = ((we) (Object) stackIn_114_0).a(stackIn_114_1 != 0);
                                                        var5 = ((we) ((Object) var1)).f(255);
                                                        var14 = gp.a(2, var3);
                                                        var26 = var14;
                                                        if (var14 == null) {
                                                          break L19;
                                                        } else {
                                                          L20: {
                                                            if (15 != var2) {
                                                              if (!var26.field_Jb) {
                                                                break L20;
                                                              } else {
                                                                ka.field_X = ka.field_X - 1;
                                                                var26.field_Jb = false;
                                                                break L20;
                                                              }
                                                            } else {
                                                              var14.field_Vb = false;
                                                              break L20;
                                                            }
                                                          }
                                                          L21: {
                                                            if (var5 == 0) {
                                                              break L21;
                                                            } else {
                                                              var26.field_Tb = mh.field_b;
                                                              var26.field_Eb = var5;
                                                              break L21;
                                                            }
                                                          }
                                                          il.a(-124, var26);
                                                          break L19;
                                                        }
                                                      }
                                                      break L2;
                                                    }
                                                  }
                                                }
                                                L22: {
                                                  var3 = ((we) ((Object) var1)).a(false);
                                                  var27 = gp.a(2, var3);
                                                  if (var27 == null) {
                                                    break L22;
                                                  } else {
                                                    L23: {
                                                      if (var2 == 14) {
                                                        var27.field_Vb = true;
                                                        break L23;
                                                      } else {
                                                        if (var27.field_Jb) {
                                                          break L23;
                                                        } else {
                                                          ka.field_X = ka.field_X + 1;
                                                          var27.field_Jb = true;
                                                          break L23;
                                                        }
                                                      }
                                                    }
                                                    il.a(-97, var27);
                                                    break L22;
                                                  }
                                                }
                                                break L2;
                                              } else {
                                                var3_int = ((we) ((Object) var1)).a((byte) 107);
                                                var4_int = ((we) ((Object) var1)).f(255);
                                                var17_ref = (eq) ((Object) dg.field_f.a(-11434, (long)var3_int));
                                                if (var17_ref != null) {
                                                  L24: {
                                                    var17_ref.field_Ob = false;
                                                    var13 = var17_ref;
                                                    var6 = var13;
                                                    if (var4_int != 0) {
                                                      var17_ref.field_Rb = mh.field_b;
                                                      var17_ref.field_Qb = var4_int;
                                                      break L24;
                                                    } else {
                                                      break L24;
                                                    }
                                                  }
                                                  var13.field_cc = false;
                                                  w.a((byte) -48, var17_ref);
                                                  break L2;
                                                } else {
                                                  break L2;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        var3_int = ((we) ((Object) var1)).a((byte) -124);
                                        var19_ref = (eq) ((Object) dg.field_f.a(-11434, (long)var3_int));
                                        var28 = var19_ref;
                                        if (var28 != null) {
                                          L25: {
                                            if (var2 != 11) {
                                              var28.field_Ob = true;
                                              break L25;
                                            } else {
                                              var28.field_cc = true;
                                              break L25;
                                            }
                                          }
                                          w.a((byte) -48, var28);
                                          break L2;
                                        } else {
                                          break L2;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  var31 = (uj) ((Object) i.field_n.c(1504642273));
                                  L26: while (true) {
                                    if (var31 == null) {
                                      ka.field_X = 0;
                                      break L2;
                                    } else {
                                      var31.c(2779);
                                      var31.e(17);
                                      var31 = (uj) ((Object) i.field_n.f(1504642273));
                                      continue L26;
                                    }
                                  }
                                }
                              }
                            } else {
                              L27: {
                                var3 = ((we) ((Object) var1)).a(false);
                                var21 = ((we) ((Object) var1)).h(5);
                                var20 = ((we) ((Object) var1)).h(5);
                                var22 = ((we) ((Object) var1)).h(5);
                                var8_ref_uj = gp.a(2, var3);
                                if (var20.equals("")) {
                                  stackIn_46_0 = 0;
                                  break L27;
                                } else {
                                  stackIn_46_0 = 1;
                                  break L27;
                                }
                              }
                              L28: {
                                var9 = stackIn_46_0;
                                if (var8_ref_uj != null) {
                                  if (var9 == 0) {
                                    break L28;
                                  } else {
                                    L29: {
                                      stackIn_51_0 = (uj) (var8_ref_uj);

                                      stackIn_51_1 = (String) (var22);

                                      stackIn_51_2 = (String) (var21);

                                      if (param0) {
                                        stackIn_52_0 = (uj) ((Object) stackIn_51_0);
                                        stackIn_52_1 = (String) ((Object) stackIn_51_1);
                                        stackIn_52_2 = (String) ((Object) stackIn_51_2);
                                        stackIn_52_3 = 0;
                                        break L29;
                                      } else {
                                        stackIn_52_0 = (uj) ((Object) stackIn_51_0);
                                        stackIn_52_1 = (String) ((Object) stackIn_51_1);
                                        stackIn_52_2 = (String) ((Object) stackIn_51_2);
                                        stackIn_52_3 = 1;
                                        break L29;
                                      }
                                    }
                                    ((uj) (Object) stackIn_52_0).a(stackIn_52_1, stackIn_52_2, stackIn_52_3 != 0);
                                    break L28;
                                  }
                                } else {
                                  var8_ref_uj = new uj(var21, var22, var3);
                                  il.field_d.a(false, var8_ref_uj, var3);
                                  break L28;
                                }
                              }
                              L30: {
                                var8_ref_uj.field_Pb = hm.a(64) - (long)((we) ((Object) var1)).k(0);
                                var8_ref_uj.field_Rb = ((we) ((Object) var1)).a((byte) 105);
                                var10 = ((we) ((Object) var1)).j(127);
                                var8_ref_uj.field_Yb = var10 >> 532671137;
                                stackIn_55_0 = (uj) (var8_ref_uj);

                                if (-1 == (var10 & 1 ^ -1)) {
                                  stackIn_56_0 = (uj) ((Object) stackIn_55_0);
                                  stackIn_56_1 = 0;
                                  break L30;
                                } else {
                                  stackIn_56_0 = (uj) ((Object) stackIn_55_0);
                                  stackIn_56_1 = 1;
                                  break L30;
                                }
                              }
                              stackIn_56_0.field_Xb = stackIn_56_1 != 0;
                              var8_ref_uj.field_Qb = ((we) ((Object) var1)).f(255);
                              var8_ref_uj.field_Ib = ((we) ((Object) var1)).f(255);
                              il.a(-28, var8_ref_uj);
                              break L2;
                            }
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                }
                var3_ref_uj = (uj) ((Object) wi.field_a.c(1504642273));
                L31: while (true) {
                  if (var3_ref_uj == null) {
                    var3_ref_uj = (uj) ((Object) il.field_d.a(-110));
                    L32: while (true) {
                      if (var3_ref_uj == null) {
                        L33: {
                          if (-2 != (var2 ^ -1)) {
                            break L33;
                          } else {
                            if (null != io.field_c) {
                              wo.field_b = io.field_c.field_pc;
                              break L33;
                            } else {
                              break L33;
                            }
                          }
                        }
                        L34: {
                          if (-5 == (var2 ^ -1)) {
                            var3_int = ((we) ((Object) var1)).a((byte) 49);
                            io.field_c = new eq(fj.field_b);
                            io.field_c.a((long)var3_int, 29574);
                            kd.a(false, io.field_c, (byte) 120, var1);
                            bo.field_e = 0L;
                            break L34;
                          } else {
                            io.field_c = null;
                            break L34;
                          }
                        }
                        L35: {
                          L36: {
                            if (var2 == 2) {
                              break L36;
                            } else {
                              if (var2 != 3) {
                                bn.field_S = null;
                                break L35;
                              } else {
                                break L36;
                              }
                            }
                          }
                          if (bn.field_S != null) {
                            break L35;
                          } else {
                            bn.field_S = new eq(fj.field_b);
                            break L35;
                          }
                        }
                        if (var2 != 3) {
                          rl.field_r = false;
                          break L2;
                        } else {
                          rl.field_r = true;
                          var3_int = 0;
                          L37: while (true) {
                            if (var3_int >= qm.field_J.length) {
                              ib.field_a = ((we) ((Object) var1)).f(255);
                              mg.field_i = ((we) ((Object) var1)).f(255);
                              var3_int = 0;
                              L38: while (true) {
                                if (k.field_k.length <= var3_int) {
                                  break L3;
                                } else {
                                  k.field_k[var3_int] = ((we) ((Object) var1)).a(0);
                                  var3_int++;
                                  continue L38;
                                }
                              }
                            } else {
                              qm.field_J[var3_int] = ((we) ((Object) var1)).a(0);
                              var3_int++;
                              continue L37;
                            }
                          }
                        }
                      } else {
                        L39: {
                          L40: {
                            if (var3_ref_uj.field_Vb) {
                              break L40;
                            } else {
                              if (!var3_ref_uj.field_Jb) {
                                break L39;
                              } else {
                                break L40;
                              }
                            }
                          }
                          L41: {
                            if (!var3_ref_uj.field_Jb) {
                              break L41;
                            } else {
                              ka.field_X = ka.field_X - 1;
                              var3_ref_uj.field_Jb = false;
                              break L41;
                            }
                          }
                          var3_ref_uj.field_Vb = false;
                          il.a(-117, var3_ref_uj);
                          break L39;
                        }
                        var3_ref_uj = (uj) ((Object) il.field_d.a((byte) 50));
                        continue L32;
                      }
                    }
                  } else {
                    var3_ref_uj.c(2779);
                    var3_ref_uj.e(17);
                    var3_ref_uj = (uj) ((Object) wi.field_a.f(1504642273));
                    continue L31;
                  }
                }
              }
              break L2;
            }
            break L0;
          }
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
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
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
                discarded$1 = this.a((String) null, 66, (ng) null, -19, -43);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("pl.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    public final void a(qm param0, int param1, int param2, int param3, int param4) {
        boolean discarded$1 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
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
                  discarded$1 = this.a(10152);
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
            stackIn_10_0 = (RuntimeException) (var6);

            stackIn_10_1 = new StringBuilder().append("pl.Q(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final boolean a(bp param0, boolean param1) {
        ml var3 = null;
        RuntimeException var3_ref = null;
        dj var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = param0.a(1);
            if (var3 == null) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var4 = var3.a((byte) 112);
              if (sk.field_a != var4) {
                if (var4 != uo.field_b) {
                  if (var4 == wh.field_o) {
                    stackIn_13_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (!param1) {
                      stackIn_17_0 = 1;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      pl.m(-52);
                      return true;
                    }
                  }
                } else {
                  stackIn_9_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_6_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var3_ref);

            stackIn_20_1 = new StringBuilder().append("pl.I(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L1;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
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
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var10 = new qp(20, param4, 120 - -param3, 25, param1, false, 120, 3, he.field_d, 16777215, param0);
            this.b(var10, 80);
            var9 = new md(((bp) ((Object) param1)).a(param5 + -125), param6, param5, var10.field_C + param4, 50 + param3, param2);
            var9.field_n = (fn) (this);
            this.b(var9, 80);
            stackIn_1_0 = var10.field_C + var9.field_C;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var8);

            stackIn_4_1 = new StringBuilder().append("pl.S(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_5_0), stackIn_11_2 + ')');
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
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3)) {
              if (param0 != 98) {
                if (99 != param0) {
                  stackIn_10_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_8_0 = this.b(10, param2);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_5_0 = this.a(param1 + -3, param2);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("pl.G(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L1;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
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
        boolean discarded$1 = false;
        bp var3;
        Object stackIn_4_0 = null;
        gk stackIn_4_1 = null;
        Object stackIn_5_0 = null;
        gk stackIn_5_1 = null;
        int stackIn_5_2 = 0;
        Object stackIn_9_0 = null;
        gk stackIn_9_1 = null;
        Object stackIn_10_0 = null;
        gk stackIn_10_1 = null;
        int stackIn_10_2 = 0;
        Object stackIn_13_0 = null;
        gk stackIn_13_1 = null;
        Object stackIn_14_0 = null;
        gk stackIn_14_1 = null;
        int stackIn_14_2 = 0;
        Object stackIn_17_0 = null;
        gk stackIn_17_1 = null;
        Object stackIn_18_0 = null;
        gk stackIn_18_1 = null;
        int stackIn_18_2 = 0;
        Object stackIn_21_0 = null;
        gk stackIn_21_1 = null;
        Object stackIn_22_0 = null;
        gk stackIn_22_1 = null;
        int stackIn_22_2 = 0;
        L0: {
          if (param0) {
            break L0;
          } else {
            var3 = (bp) null;
            discarded$1 = this.a((bp) null, false);
            break L0;
          }
        }
        L1: {
          stackIn_4_0 = this;

          stackIn_4_1 = this.field_U;

          if (param0) {
            stackIn_5_0 = this;
            stackIn_5_1 = (gk) ((Object) stackIn_4_1);
            stackIn_5_2 = 0;
            break L1;
          } else {
            stackIn_5_0 = this;
            stackIn_5_1 = (gk) ((Object) stackIn_4_1);
            stackIn_5_2 = 1;
            break L1;
          }
        }
        L2: {
          if (!this.a(stackIn_5_1, stackIn_5_2 != 0)) {
            break L2;
          } else {
            if (!this.a(this.field_P, false)) {
              break L2;
            } else {
              L3: {
                stackIn_9_0 = this;

                stackIn_9_1 = this.field_L;

                if (param0) {
                  stackIn_10_0 = this;
                  stackIn_10_1 = (gk) ((Object) stackIn_9_1);
                  stackIn_10_2 = 0;
                  break L3;
                } else {
                  stackIn_10_0 = this;
                  stackIn_10_1 = (gk) ((Object) stackIn_9_1);
                  stackIn_10_2 = 1;
                  break L3;
                }
              }
              if (!this.a(stackIn_10_1, stackIn_10_2 != 0)) {
                break L2;
              } else {
                L4: {
                  stackIn_13_0 = this;

                  stackIn_13_1 = this.field_V;

                  if (param0) {
                    stackIn_14_0 = this;
                    stackIn_14_1 = (gk) ((Object) stackIn_13_1);
                    stackIn_14_2 = 0;
                    break L4;
                  } else {
                    stackIn_14_0 = this;
                    stackIn_14_1 = (gk) ((Object) stackIn_13_1);
                    stackIn_14_2 = 1;
                    break L4;
                  }
                }
                if (!this.a(stackIn_14_1, stackIn_14_2 != 0)) {
                  break L2;
                } else {
                  L5: {
                    stackIn_17_0 = this;

                    stackIn_17_1 = this.field_X;

                    if (param0) {
                      stackIn_18_0 = this;
                      stackIn_18_1 = (gk) ((Object) stackIn_17_1);
                      stackIn_18_2 = 0;
                      break L5;
                    } else {
                      stackIn_18_0 = this;
                      stackIn_18_1 = (gk) ((Object) stackIn_17_1);
                      stackIn_18_2 = 1;
                      break L5;
                    }
                  }
                  if (!this.a(stackIn_18_1, stackIn_18_2 != 0)) {
                    break L2;
                  } else {
                    L6: {
                      stackIn_21_0 = this;

                      stackIn_21_1 = this.field_Q;

                      if (param0) {
                        stackIn_22_0 = this;
                        stackIn_22_1 = (gk) ((Object) stackIn_21_1);
                        stackIn_22_2 = 0;
                        break L6;
                      } else {
                        stackIn_22_0 = this;
                        stackIn_22_1 = (gk) ((Object) stackIn_21_1);
                        stackIn_22_2 = 1;
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
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_3_0 = this.a(param5, param2, 35, param4, param1, 126, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var7);

            stackIn_6_1 = new StringBuilder().append("pl.R(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_Y = new bb();
    }
}
