/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qm extends km {
    static String field_Ob;
    static mg[] field_Kb;
    static p field_Mb;
    private km field_Fb;
    private km field_Jb;
    static String field_Hb;
    private km field_Nb;
    private km field_Eb;
    private int field_Ib;
    private km field_Lb;
    static String field_Gb;
    private km field_Pb;

    final boolean g(int param0) {
        if (-1 != (this.field_Nb.field_nb ^ -1)) {
            this.field_Ib = 20;
            return true;
        }
        if ((this.field_Nb.field_w ^ -1) != param0) {
            if (-1 > (this.field_Ib ^ -1)) {
                this.field_Ib = this.field_Ib - 1;
            }
            if (-1 == (this.field_Ib ^ -1)) {
                this.field_Ib = 3;
                return true;
            }
        }
        return false;
    }

    final boolean f(byte param0) {
        if (0 != this.field_Fb.field_nb) {
            this.field_Ib = 20;
            return true;
        }
        if (!(this.field_Fb.field_w == 0)) {
            if (!(this.field_Ib <= 0)) {
                this.field_Ib = this.field_Ib - 1;
            }
            if (this.field_Ib == 0) {
                this.field_Ib = 3;
                return true;
            }
        }
        if (param0 > -45) {
            this.a((byte) 125, 17, true, -125);
            return false;
        }
        return false;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this.field_F = param4;
        this.field_ub = param1;
        this.field_K = param6;
        this.field_tb = param5;
        this.a(param2, param3, param7, -1);
        if (param0 != 0) {
            this.a((byte) -78, -45, true, -23);
        }
    }

    final static boolean i(int param0) {
        if (param0 != 20) {
            return true;
        }
        return oi.field_d;
    }

    qm(long param0, km param1, km param2, km param3, km param4) {
        super(param0, (km) null);
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        km var9 = null;
        km var10 = null;
        try {
          L0: {
            this.field_Fb = new km(0L, param1);
            this.field_Nb = new km(0L, param2);
            this.a(0, this.field_Fb);
            this.a(0, this.field_Nb);
            this.field_Eb = new km(0L, (km) null);
            this.a(0, this.field_Eb);
            this.field_Lb = new km(0L, param3);
            this.field_Jb = new km(0L, param3);
            var9 = this.field_Lb;
            var10 = var9;
            this.field_Jb.field_ib = true;
            var10.field_ib = true;
            this.field_Eb.a(0, this.field_Lb);
            this.field_Eb.a(0, this.field_Jb);
            this.field_Pb = new km(0L, param4);
            this.field_Pb.field_X = true;
            this.field_Eb.a(0, this.field_Pb);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var7);

            stackIn_5_1 = new StringBuilder().append("qm.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param3 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param4 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_6_0), stackIn_15_2 + ')');
        }
    }

    final boolean g(byte param0) {
        if (this.field_Jb.field_nb != 0) {
            this.field_Ib = 20;
            return true;
        }
        if (this.field_Jb.field_w != 0) {
            if (-1 > (this.field_Ib ^ -1)) {
                this.field_Ib = this.field_Ib - 1;
            }
            if (0 == this.field_Ib) {
                if (!(hk.field_Jb < this.field_Pb.field_kb + this.field_Pb.field_ub + this.field_Pb.field_J + this.field_Pb.field_Cb)) {
                    this.field_Ib = 3;
                    return true;
                }
            }
        }
        int var2 = -106 % ((82 - param0) / 37);
        return false;
    }

    public static void j(int param0) {
        field_Gb = null;
        field_Hb = null;
        if (param0 < 103) {
            field_Gb = (String) null;
        }
        field_Ob = null;
        field_Kb = null;
        field_Mb = null;
    }

    final static void a(int param0, String param1, long param2) {
        CharSequence var5 = null;
        try {
            if (param0 >= -6) {
                qm.a(-58, (String) null, -100L);
            }
            va.field_d = param1;
            sd.field_e = 2;
            var5 = (CharSequence) ((Object) param1);
            d.field_Gb = c.a(var5, true);
            oc.field_n = param2;
            sg.c(0);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "qm.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(int param0, boolean param1, byte param2) {
        um stackIn_5_0;
        int stackIn_5_1;
        boolean stackIn_5_2;
        int stackIn_5_3;
        int stackIn_5_4;
        int stackIn_5_5;
        um stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        boolean stackIn_6_2 = false;
        int stackIn_6_3 = 0;
        int stackIn_6_4 = 0;
        int stackIn_6_5 = 0;
        int stackIn_6_6 = 0;
        km stackIn_21_0 = null;
        km stackIn_22_0 = null;
        String stackIn_22_1 = null;
        int stackIn_25_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        p var4 = null;
        Object var5 = null;
        gh var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var13_ref_String = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        dj var16 = null;
        dj var17 = null;
        var15 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 >= 111) {
                break L1;
              } else {
                field_Ob = (String) null;
                break L1;
              }
            }
            L2: {
              stackIn_5_0 = lg.field_a.field_Ib;

              stackIn_5_1 = 2 + pg.field_e;

              stackIn_5_2 = param1;

              stackIn_5_3 = 0;

              stackIn_5_4 = 2;

              stackIn_5_5 = param0 * (6 + 3 * pg.field_e);

              if (wf.field_d != lg.field_a.field_Ib) {
                stackIn_6_0 = (um) ((Object) stackIn_5_0);
                stackIn_6_1 = stackIn_5_1;
                stackIn_6_2 = stackIn_5_2;
                stackIn_6_3 = stackIn_5_3;
                stackIn_6_4 = stackIn_5_4;
                stackIn_6_5 = stackIn_5_5;
                stackIn_6_6 = 0;
                break L2;
              } else {
                stackIn_6_0 = (um) ((Object) stackIn_5_0);
                stackIn_6_1 = stackIn_5_1;
                stackIn_6_2 = stackIn_5_2;
                stackIn_6_3 = stackIn_5_3;
                stackIn_6_4 = stackIn_5_4;
                stackIn_6_5 = stackIn_5_5;
                stackIn_6_6 = 1;
                break L2;
              }
            }
            L3: {
              L4: {
                var3_int = ((um) (Object) stackIn_6_0).a(stackIn_6_1, stackIn_6_2, stackIn_6_3 != 0, stackIn_6_4, stackIn_6_5, stackIn_6_6 != 0) ? 1 : 0;
                var4 = lg.field_a.field_Lb.field_W;
                if (-3 == (oa.field_q ^ -1)) {
                  break L4;
                } else {
                  if (1 != oa.field_q) {
                    lg.field_a.field_Y = false;
                    lg.field_a.field_Ib.field_Eb.field_V = ul.field_e;
                    ak.a(16377, lg.field_a.field_Lb);
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              lg.field_a.field_Y = true;
              lg.field_a.field_Ib.field_Eb.field_V = null;
              var5 = null;
              var6 = (gh) ((Object) var4.a((byte) -108));
              L5: while (true) {
                if (var6 == null) {
                  L6: {
                    if (lg.field_a.field_Fb.field_nb != 0) {
                      he.field_Xb = new fe(lg.field_a.field_Fb.field_Bb, lg.field_a.field_Fb.field_J, lg.field_a.field_Fb.field_K, lg.field_a.field_Fb.field_ub, nf.field_c, s.field_f, ti.field_h, ti.field_h);
                      ge.field_d = 2;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  if (0 == lg.field_a.field_Mb.field_nb) {
                    break L3;
                  } else {
                    he.field_Xb = new fe(lg.field_a.field_Mb.field_Bb, lg.field_a.field_Mb.field_J, lg.field_a.field_Mb.field_K, lg.field_a.field_Mb.field_ub, lc.field_f, s.field_f, ti.field_h, ti.field_h);
                    ge.field_d = 3;
                    break L3;
                  }
                } else {
                  L7: {
                    var7 = 0;
                    if (null != var6.field_W) {
                      break L7;
                    } else {
                      var6.field_Eb = new km(0L, gg.field_F);
                      var6.a(0, var6.field_Eb);
                      var6.field_Mb = new km(0L, gg.field_F);
                      var6.a(0, var6.field_Mb);
                      var6.b((byte) 42);
                      var7 = 1;
                      break L7;
                    }
                  }
                  L8: {
                    var6.field_K = lg.field_a.field_Lb.field_K;
                    var6.field_Eb.a(0, pg.field_e, var6.field_K, (byte) -56, 0);
                    var8 = 0;
                    if (var6.field_Jb == null) {
                      break L8;
                    } else {
                      if (!var6.field_Jb.equals("")) {
                        var6.field_Mb.field_qb = qg.field_u;
                        var6.field_Mb.field_ab = 16737894;
                        var8 = 1;
                        var6.field_Mb.a(0, pg.field_e, qg.field_u.field_u - -3, (byte) -60, 0);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                  }
                  L9: {
                    var9 = 0;
                    var10 = var6.field_K;
                    if (var8 == 0) {
                      break L9;
                    } else {
                      var9 = qg.field_u.field_u + 3;
                      var10 = var10 - var9;
                      break L9;
                    }
                  }
                  L10: {
                    stackIn_21_0 = var6.field_Eb;

                    if (-1 <= (var10 ^ -1)) {
                      stackIn_22_0 = (km) ((Object) stackIn_21_0);
                      stackIn_22_1 = var6.field_Hb;
                      break L10;
                    } else {
                      stackIn_22_0 = (km) ((Object) stackIn_21_0);
                      stackIn_22_1 = e.a(var6.field_Eb.field_C, var6.field_Hb, var10);
                      break L10;
                    }
                  }
                  L11: {
                    stackIn_22_0.field_V = stackIn_22_1;
                    if (var6.field_Eb.field_V.equals(var6.field_Hb)) {
                      stackIn_25_0 = 0;
                      break L11;
                    } else {
                      stackIn_25_0 = 1;
                      break L11;
                    }
                  }
                  L12: {
                    var11 = stackIn_25_0;
                    var6.field_Eb.a(var9, pg.field_e, var10, (byte) -111, 0);
                    if (var3_int != 0) {
                      break L12;
                    } else {
                      var6.field_kb = pg.field_e + -var6.field_ub;
                      break L12;
                    }
                  }
                  L13: {
                    if (var7 == 0) {
                      break L13;
                    } else {
                      lg.field_a.field_Lb.a(2, var6, (km) (var5), (byte) 109);
                      break L13;
                    }
                  }
                  L14: {
                    L15: {
                      if (null == var6.field_Mb) {
                        break L15;
                      } else {
                        if (var6.field_Mb.field_S) {
                          wc.field_g = var6.field_Jb;
                          break L14;
                        } else {
                          break L15;
                        }
                      }
                    }
                    if (!var6.field_Eb.field_S) {
                      break L14;
                    } else {
                      if (var11 != 0) {
                        wc.field_g = var6.field_Hb;
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                  }
                  L16: {
                    if (0 == var6.field_nb) {
                      break L16;
                    } else {
                      ai.a(-1, lg.field_a.field_Ib, (int[]) null, var6.field_Hb, 0L, var6.field_Ob, -1, var6, 104);
                      var16 = md.field_e;
                      var13_ref_String = a.field_A;
                      var16.field_a.a(1, var13_ref_String, 7);
                      var17 = md.field_e;
                      var13 = ii.field_b;
                      var14 = a.field_y;
                      var17.field_a.a(0, 0, 0, var13, var14);
                      break L16;
                    }
                  }
                  var5 = var6;
                  var6 = (gh) ((Object) var4.a(16213));
                  continue L5;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var3), "qm.K(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean e(byte param0) {
        if (param0 < 52) {
            this.g(51);
        }
        return this.field_Pb.field_w != 0 ? true : false;
    }

    final boolean h(int param0) {
        if (this.field_Lb.field_nb != 0) {
            this.field_Ib = 20;
            return true;
        }
        if (!(-1 == (this.field_Lb.field_w ^ -1))) {
            if (!(-1 <= (this.field_Ib ^ -1))) {
                this.field_Ib = this.field_Ib - 1;
            }
            if (this.field_Ib == 0 && this.field_Pb.field_J - -this.field_Pb.field_Cb > hk.field_Jb) {
                this.field_Ib = 3;
                return true;
            }
        }
        if (param0 > -40) {
            this.h(-44);
            return false;
        }
        return false;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var6 = 0;
        int var5 = 0;
        if (this.field_ub < this.field_K * 2) {
            var6 = this.field_ub / 2;
            var5 = this.field_ub / 2;
        } else {
            var6 = -this.field_K + this.field_ub;
            var5 = this.field_K;
        }
        int var7 = -var5 + var6;
        int var8 = var7;
        if (0 < param0) {
            var8 = var8 * param2 / param0;
            if (var8 < this.field_K) {
                var8 = this.field_K;
            }
            if (var7 < var8) {
                var8 = var7;
            }
        }
        int var9 = -param2 + param0;
        int var10 = var7 - var8;
        int var11 = 0;
        if (0 < var9) {
            var11 = (var9 / 2 + param1 * var10) / var9;
        }
        int var12 = var8 / 2 + var11;
        km var14 = this.field_Fb;
        var14.field_tb = 0;
        var14.field_F = 0;
        var14.field_ub = var5;
        var14.field_K = this.field_K;
        km var15 = this.field_Nb;
        var15.field_K = this.field_K;
        var15.field_ub = -var6 + this.field_ub;
        var15.field_F = var6;
        var15.field_tb = 0;
        km var16 = this.field_Eb;
        var16.field_tb = 0;
        var16.field_F = var5;
        var16.field_K = this.field_K;
        if (param3 != -1) {
            return;
        }
        var16.field_ub = var7;
        km var17 = this.field_Lb;
        var17.field_K = this.field_K;
        var17.field_F = 0;
        var17.field_tb = 0;
        var17.field_ub = var12;
        km var18 = this.field_Jb;
        var18.field_tb = 0;
        var18.field_K = this.field_K;
        var18.field_ub = -var12 + var7;
        var18.field_F = var12;
        km var19 = this.field_Pb;
        this.field_Eb.field_Y = param2 < param0 ? true : false;
        this.field_Nb.field_Y = param2 < param0 ? true : false;
        this.field_Fb.field_Y = param2 < param0 ? true : false;
        var19.field_F = var11;
        var19.field_ub = var8;
        var19.field_K = this.field_K;
        var19.field_tb = 0;
    }

    final int a(byte param0, int param1, boolean param2, int param3) {
        int var5;
        int var6;
        int var7;
        int var8;
        L0: {
          var5 = 0;
          if (param0 == 61) {
            break L0;
          } else {
            this.g(-35);
            break L0;
          }
        }
        L1: {
          var6 = this.field_Eb.field_ub + -this.field_Pb.field_ub;
          if (-1 > (var6 ^ -1)) {
            var7 = this.field_Pb.field_F;
            var8 = param3 + -param1;
            var5 = (var8 * var7 - -(var6 / 2)) / var6;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (param2) {
            L3: {
              if (var5 < 0) {
                var5 = 0;
                break L3;
              } else {
                break L3;
              }
            }
            if (-param1 + param3 >= var5) {
              break L2;
            } else {
              var5 = -param1 + param3;
              break L2;
            }
          } else {
            L4: {
              if (var5 > -param1 + param3) {
                var5 = -param1 + param3;
                break L4;
              } else {
                break L4;
              }
            }
            if (-1 < (var5 ^ -1)) {
              var5 = 0;
              break L2;
            } else {
              break L2;
            }
          }
        }
        return var5;
    }

    qm(long param0, qm param1) {
        this(param0, param1.field_Fb, param1.field_Nb, param1.field_Lb, param1.field_Pb);
    }

    static {
        field_Ob = "Error";
        field_Gb = "Show players in <%0>'s game";
        field_Hb = "Invite <%0> to this game";
    }
}
