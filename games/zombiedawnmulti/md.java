/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class md {
    byte[] field_z;
    int[] field_i;
    short[] field_K;
    private boolean field_d;
    short[] field_E;
    int[] field_I;
    short[] field_M;
    short[] field_c;
    int[] field_q;
    short[] field_p;
    short[] field_x;
    int[] field_f;
    short[] field_J;
    short[] field_H;
    int[] field_O;
    byte field_m;
    int field_C;
    int[] field_t;
    int field_l;
    int field_G;
    short[] field_a;
    int field_D;
    short[] field_g;
    short field_n;
    int field_j;
    short[] field_L;
    short field_o;
    short[] field_A;
    short[] field_y;
    static th field_u;
    static ja[] field_N;
    int field_r;
    short[] field_b;
    short[] field_F;
    int[] field_e;
    int[] field_h;
    short[] field_v;
    short[] field_k;
    short[] field_s;
    short field_B;
    int[] field_w;

    final static void a(int param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            sj.a(up.field_d, -891231071, param0, true, lj.field_n, 0, ab.field_j);
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= lj.field_n) {
                L2: {
                  if (param1 <= -27) {
                    break L2;
                  } else {
                    field_u = (th) null;
                    break L2;
                  }
                }
                L3: {
                  sj.a(ba.field_m, -891231071, param0 - -param0, false, param0 + lj.field_n, param0, mj.field_Ub);
                  if (param0 < lj.field_n) {
                    lj.field_n = param0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                break L0;
              } else {
                la.field_c[var2_int + param0] = var2_int;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "md.A(" + param0 + ',' + param1 + ')');
        }
    }

    public static void b(byte param0) {
        field_N = null;
        if (param0 != 119) {
            return;
        }
        field_u = null;
    }

    final void a(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        if (!this.field_d) {
          L0: {
            this.field_d = true;
            var2 = 32767;
            var3 = 32767;
            var4 = 32767;
            var5 = -32768;
            var6 = -32768;
            if (param0 < -20) {
              break L0;
            } else {
              md.a(-5, 114);
              break L0;
            }
          }
          var7 = -32768;
          var8 = 0;
          L1: while (true) {
            if (this.field_n <= var8) {
              this.field_G = var3;
              this.field_D = var5;
              this.field_C = var2;
              this.field_j = var7;
              this.field_l = var6;
              this.field_r = var4;
              return;
            } else {
              L2: {
                var9 = this.field_k[var8];
                var10 = this.field_E[var8];
                if (var5 >= var9) {
                  break L2;
                } else {
                  var5 = var9;
                  break L2;
                }
              }
              L3: {
                if (var9 >= var2) {
                  break L3;
                } else {
                  var2 = var9;
                  break L3;
                }
              }
              L4: {
                if (var10 <= var6) {
                  break L4;
                } else {
                  var6 = var10;
                  break L4;
                }
              }
              L5: {
                var11 = this.field_v[var8];
                if (var3 <= var10) {
                  break L5;
                } else {
                  var3 = var10;
                  break L5;
                }
              }
              L6: {
                if (var11 > var7) {
                  var7 = var11;
                  break L6;
                } else {
                  break L6;
                }
              }
              if (var4 > var11) {
                var4 = var11;
                var8++;
                continue L1;
              } else {
                var8++;
                continue L1;
              }
            }
          }
        } else {
          return;
        }
    }

    final static ml a(byte param0, String param1) {
        String var2 = null;
        int var3 = 0;
        ml var4 = null;
        String var5 = null;
        int var6 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
        Object stackIn_3_0 = null;
        ml stackIn_15_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (bh.field_f != null) {
              L1: {
                var7 = (CharSequence) ((Object) param1);
                var2 = tg.a(var7, false);
                var3 = 24 / ((47 - param0) / 43);
                if (var2 == null) {
                  var2 = param1;
                  break L1;
                } else {
                  break L1;
                }
              }
              var4 = (ml) ((Object) bh.field_f.a((long)var2.hashCode(), -22877));
              L2: while (true) {
                if (var4 != null) {
                  L3: {
                    var8 = (CharSequence) ((Object) var4.field_Hb);
                    var5 = tg.a(var8, false);
                    if (var5 != null) {
                      break L3;
                    } else {
                      var5 = var4.field_Hb;
                      break L3;
                    }
                  }
                  if (var5.equals(var2)) {
                    stackIn_15_0 = (ml) (var4);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var4 = (ml) ((Object) bh.field_f.b((byte) 68));
                    continue L2;
                  }
                } else {
                  return null;
                }
              }
            } else {
              stackIn_3_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2_ref = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var2_ref);

            stackIn_20_1 = new StringBuilder().append("md.K(").append(param0).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L4;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ml) ((Object) stackIn_3_0);
        } else {
          return stackIn_15_0;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = ZombieDawnMulti.field_E ? 1 : 0;
        for (var6 = 0; var6 < this.field_n; var6++) {
            this.field_k[var6] = (short)(param0 * this.field_k[var6] / param1);
            this.field_E[var6] = (short)(this.field_E[var6] * param2 / param1);
            this.field_v[var6] = (short)(param3 * this.field_v[var6] / param1);
        }
        if (param4 != 2122) {
            this.field_v = (short[]) null;
        }
        this.a(255);
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = ZombieDawnMulti.field_E ? 1 : 0;
        for (var5 = 0; var5 < this.field_n; var5++) {
            this.field_k[var5] = (short)(this.field_k[var5] + param2);
            this.field_E[var5] = (short)(this.field_E[var5] + param3);
            this.field_v[var5] = (short)(this.field_v[var5] + param0);
        }
        this.a(255);
        if (param1 != 3) {
            this.field_t = (int[]) null;
        }
    }

    final static int a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -9159) {
                break L1;
              } else {
                field_N = (ja[]) null;
                break L1;
              }
            }
            stackIn_3_0 = md.a(param0, 10, -31, true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("md.D(");

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
          throw fa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static boolean a(ml param0, byte param1, ml param2) {
        int var3_int = 0;
        int var4 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == -49) {
                break L1;
              } else {
                field_N = (ja[]) null;
                break L1;
              }
            }
            L2: {
              var3_int = param0.field_Mb + -param2.field_Mb;
              if (param0.field_Nb != ta.field_ob) {
                if (param0.field_Nb != null) {
                  break L2;
                } else {
                  var3_int += 200;
                  break L2;
                }
              } else {
                var3_int -= 200;
                break L2;
              }
            }
            L3: {
              if (param2.field_Nb == ta.field_ob) {
                var3_int += 200;
                break L3;
              } else {
                if (null == param2.field_Nb) {
                  var3_int -= 200;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (var3_int <= 0) {
                stackIn_15_0 = 0;
                break L4;
              } else {
                stackIn_15_0 = 1;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3);

            stackIn_18_1 = new StringBuilder().append("md.I(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L6;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L6;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_19_0), stackIn_22_2 + ')');
        }
        return stackIn_15_0 != 0;
    }

    final static void a(String[] args, int param1, int[] param2, ul param3, String[] param4, ja[][] param5, ja[][] param6, String[][] param7, byte[] param8, int param9, boolean param10, byte[] param11, String[] param12, int param13, String[][] param14) {
        mo[] array$0 = null;
        mo[] array$1 = null;
        mo[] array$2 = null;
        cj stackIn_5_0;
        cj stackIn_5_1;
        long stackIn_5_2;
        cj stackIn_5_3;
        cj stackIn_6_0 = null;
        cj stackIn_6_1 = null;
        long stackIn_6_2 = 0L;
        cj stackIn_6_3 = null;
        String stackIn_6_4 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
        StringBuilder stackIn_80_1 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        StringBuilder stackIn_83_1 = null;
        StringBuilder stackIn_84_1 = null;
        String stackIn_84_2 = null;
        StringBuilder stackIn_86_1 = null;
        StringBuilder stackIn_87_1 = null;
        String stackIn_87_2 = null;
        StringBuilder stackIn_89_1 = null;
        StringBuilder stackIn_90_1 = null;
        String stackIn_90_2 = null;
        StringBuilder stackIn_92_1 = null;
        StringBuilder stackIn_93_1 = null;
        String stackIn_93_2 = null;
        StringBuilder stackIn_95_1 = null;
        StringBuilder stackIn_96_1 = null;
        String stackIn_96_2 = null;
        StringBuilder stackIn_98_1 = null;
        StringBuilder stackIn_99_1 = null;
        String stackIn_99_2 = null;
        StringBuilder stackIn_101_1 = null;
        StringBuilder stackIn_102_1 = null;
        String stackIn_102_2 = null;
        StringBuilder stackIn_104_1 = null;
        StringBuilder stackIn_105_1 = null;
        String stackIn_105_2 = null;
        StringBuilder stackIn_107_1 = null;
        StringBuilder stackIn_108_1 = null;
        String stackIn_108_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var15 = null;
        cj var16 = null;
        int var17_int = 0;
        cj var17 = null;
        int var18 = 0;
        int var19 = 0;
        Object var19_ref = null;
        Object var20 = null;
        int var21 = 0;
        CharSequence var22 = null;
        cj var24 = null;
        cj var25 = null;
        var21 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              cf.field_f = args;
              qp.field_s = param4;
              ZombieDawnMulti.field_L = param5;
              qo.field_r = param2;
              um.field_b = param12;
              i.field_e = param1;
              ul.field_m = param14;
              ch.field_c = param11;
              ng.field_b = param8;
              um.field_g = param6;
              kp.field_n = param7;
              r.field_f = param13;
              qp.field_u = pb.a("lobby", param3, -256, "gameprivacy");
              ke.field_i = pb.a("lobby", param3, -256, "ratedgame");
              na.field_G = pb.a("lobby", param3, -256, "opentome");
              we.field_j = pb.a("lobby", param3, -256, "allowspectators");
              t.field_c = new String[5];
              t.field_c[2] = al.field_W;
              t.field_c[3] = dm.field_Xb;
              t.field_c[4] = vo.field_s;
              t.field_c[0] = vb.field_g;
              t.field_c[1] = ka.field_m;
              pd.field_b = new cj(0L, (cj) null);
              dm.field_ac = new cj(0L, vd.field_a, qd.field_r);
              mo.field_Hb = new cj(0L, pn.field_g, cg.field_j);
              hf.field_e = new tq(0L, new cj(0L, (cj) null), nc.field_e, td.field_f);
              pd.field_b.a((byte) 50, dm.field_ac);
              if (!tb.field_u) {
                break L1;
              } else {
                pd.field_b.a((byte) 50, mo.field_Hb);
                break L1;
              }
            }
            L2: {
              pd.field_b.a((byte) 50, hf.field_e);
              hf.field_e.field_Jb.b((byte) -32, vo.field_m);
              hf.field_e.field_Jb.field_lb = 1;
              var24 = hf.field_e.field_Jb;
              var25 = var24;
              var25.field_R = 1;
              ql.field_b = new cj(0L, vo.field_m);
              ql.field_b.field_R = 1;
              kj.field_u = new cj(0L, ai.field_c, e.field_b.toUpperCase());
              ro.field_O = new cj(0L, ed.field_d, uo.field_j.toUpperCase());
              ml.field_Lb = new cj(0L, cg.field_f);
              k.field_g = new cj(0L, vd.field_a, vh.field_Nb);
              ud.field_M = new cj(0L, al.field_fb, kb.field_p);
              tk.field_l = new cj(0L, al.field_fb, ck.field_b);
              sc.field_d = new cj(0L, al.field_fb, jl.field_t);
              da.field_h = new cj(0L, al.field_fb, op.field_k);
              bp.field_w = new cj(0L, pn.field_g, fd.field_N);
              ek.field_H = new tq(0L, new cj(0L, (cj) null), nc.field_e, td.field_f);
              ia.field_t = new cj(0L, he.field_i, sn.field_Gb.toUpperCase());
              ia.field_t.field_Z = tb.field_u;
              stackIn_5_0 = null;

              stackIn_5_1 = null;

              stackIn_5_2 = 0L;

              stackIn_5_3 = he.field_i;

              if (!tb.field_u) {
                stackIn_6_0 = null;
                stackIn_6_1 = null;
                stackIn_6_2 = stackIn_5_2;
                stackIn_6_3 = (cj) ((Object) stackIn_5_3);
                stackIn_6_4 = cn.field_C;
                break L2;
              } else {
                stackIn_6_0 = null;
                stackIn_6_1 = null;
                stackIn_6_2 = stackIn_5_2;
                stackIn_6_3 = (cj) ((Object) stackIn_5_3);
                stackIn_6_4 = ff.field_t;
                break L2;
              }
            }
            L3: {
              pl.field_L = new cj(stackIn_6_2, stackIn_6_3, ((String) (Object) stackIn_6_4).toUpperCase());
              cm.field_a = new cj(0L, (cj) null);
              cm.field_a.a((byte) 50, ro.field_O);
              if (param10) {
                break L3;
              } else {
                var22 = (CharSequence) null;
                md.a((CharSequence) null, -24);
                break L3;
              }
            }
            L4: {
              cm.field_a.a((byte) 50, ml.field_Lb);
              ml.field_Lb.a((byte) 50, k.field_g);
              ml.field_Lb.a((byte) 50, ud.field_M);
              ml.field_Lb.a((byte) 50, tk.field_l);
              if (tb.field_u) {
                ml.field_Lb.a((byte) 50, sc.field_d);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              ml.field_Lb.a((byte) 50, da.field_h);
              ml.field_Lb.a((byte) 50, bp.field_w);
              ml.field_Lb.a((byte) 50, ek.field_H);
              if (tb.field_u) {
                cm.field_a.a((byte) 50, ia.field_t);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              cm.field_a.a((byte) 50, pl.field_L);
              sc.field_j = new cj(0L, vo.field_m);
              sc.field_j.field_lb = 0;
              sc.field_j.field_R = 1;
              kn.field_a = new cj(0L, kb.field_n, ji.field_e.toUpperCase());
              lm.field_gb = new cj(0L, wa.field_a);
              lm.field_gb.a((byte) 50, sc.field_j);
              lm.field_gb.a((byte) 50, kn.field_a);
              sk.field_i = new cj(0L, nc.field_e);
              sk.field_i.b((byte) -32, vo.field_m);
              var16 = sk.field_i;
              sk.field_i.field_lb = 1;
              var16.field_R = 1;
              ga.field_r = new cj(0L, (cj) null);
              fn.field_h = new cj(0L, vo.field_m);
              fn.field_h.field_R = 1;
              ie.field_jb = new cj(0L, vd.field_a, qd.field_r);
              bf.field_h = new cj(0L, pn.field_g, cg.field_j);
              bf.field_n = new tq(0L, new cj(0L, (cj) null), nc.field_e, td.field_f);
              ga.field_r.a((byte) 50, fn.field_h);
              ga.field_r.a((byte) 50, ie.field_jb);
              if (!tb.field_u) {
                break L6;
              } else {
                ga.field_r.a((byte) 50, bf.field_h);
                break L6;
              }
            }
            ga.field_r.a((byte) 50, bf.field_n);
            jp.field_b = new cj(0L, ai.field_c, pi.field_b.toUpperCase());
            gg.field_m = new cj(0L, ed.field_d);
            dl.field_a = new cj(0L, cg.field_f);
            ik.field_d = new cj(0L, hd.field_x, vb.field_d.toUpperCase());
            mi.field_Ib = new cj[4 + param9];
            ma.field_b = new mo[param9 - -4][];
            mi.field_Ib[0] = new cj(0L, m.field_B, kg.field_f);
            ma.field_b[0] = new mo[6];
            var17_int = 0;
            L7: while (true) {
              if (5 <= var17_int) {
                L8: {
                  if (-3 >= (qo.field_r.length ^ -1)) {
                    mi.field_Ib[1] = new cj(0L, m.field_B, gi.field_n);
                    array$0 = new mo[1 + qo.field_r.length];
                    ma.field_b[1] = array$0;
                    ma.field_b[1][0] = new mo(0L, uq.field_d, (cj) null, cm.field_b, (ja) null, hi.field_Mb);
                    var17_int = 0;
                    L9: while (true) {
                      if (var17_int >= qo.field_r.length) {
                        break L8;
                      } else {
                        ma.field_b[1][1 + var17_int] = new mo(0L, uq.field_d, (cj) null, cm.field_b, (ja) null, Integer.toString(qo.field_r[var17_int]));
                        var17_int++;
                        continue L9;
                      }
                    }
                  } else {
                    break L8;
                  }
                }
                L10: {
                  mi.field_Ib[2] = new cj(0L, m.field_B, qj.field_j);
                  ma.field_b[2] = new mo[]{new mo(0L, uq.field_d, (cj) null, cm.field_b, (ja) null, hi.field_Mb), new mo(0L, uq.field_d, (cj) null, cm.field_b, we.field_j[0], be.field_f), new mo(0L, uq.field_d, (cj) null, cm.field_b, we.field_j[1], wf.field_k)};
                  if (-2 <= (r.field_f ^ -1)) {
                    break L10;
                  } else {
                    mi.field_Ib[3] = new cj(0L, m.field_B, gj.field_d);
                    array$1 = new mo[r.field_f - -1];
                    ma.field_b[3] = array$1;
                    ma.field_b[3][0] = new mo(0L, uq.field_d, (cj) null, cm.field_b, (ja) null, hi.field_Mb);
                    var17_int = 0;
                    L11: while (true) {
                      if (var17_int >= r.field_f) {
                        break L10;
                      } else {
                        ma.field_b[3][1 + var17_int] = new mo(0L, uq.field_d, (cj) null, cm.field_b, (ja) null, um.field_b[var17_int]);
                        var17_int++;
                        continue L11;
                      }
                    }
                  }
                }
                var17_int = 0;
                L12: while (true) {
                  if (param9 <= var17_int) {
                    var17_int = 0;
                    L13: while (true) {
                      if (param9 + 4 <= var17_int) {
                        en.field_b = new cj(0L, he.field_i);
                        gb.field_a = new cj(0L, he.field_i);
                        eb.field_B = new cj(0L, qc.field_u);
                        eb.field_B.b((byte) -32, vo.field_m);
                        eb.field_B.field_lb = 1;
                        var17 = eb.field_B;
                        var17.field_R = 1;
                        fc.field_a = new cj(0L, (cj) null);
                        fc.field_a.a((byte) 50, gg.field_m);
                        fc.field_a.a((byte) 50, dl.field_a);
                        dl.field_a.a((byte) 50, ik.field_d);
                        var18 = 0;
                        L14: while (true) {
                          if (4 + param9 <= var18) {
                            fc.field_a.a((byte) 50, en.field_b);
                            fc.field_a.a((byte) 50, gb.field_a);
                            fc.field_a.a((byte) 50, eb.field_B);
                            mq.field_l = new cj(0L, kc.field_c, p.field_c.toUpperCase());
                            pg.field_a = new cj(0L, kb.field_n, qq.field_d.toUpperCase());
                            break L0;
                          } else {
                            L15: {
                              L16: {
                                if (var18 != 1) {
                                  break L16;
                                } else {
                                  if (qo.field_r.length < 2) {
                                    break L15;
                                  } else {
                                    break L16;
                                  }
                                }
                              }
                              L17: {
                                if (var18 != 3) {
                                  break L17;
                                } else {
                                  if ((r.field_f ^ -1) >= -2) {
                                    break L15;
                                  } else {
                                    break L17;
                                  }
                                }
                              }
                              dl.field_a.a((byte) 50, mi.field_Ib[var18]);
                              var19 = 0;
                              L18: while (true) {
                                if (ma.field_b[var18].length <= var19) {
                                  break L15;
                                } else {
                                  L19: {
                                    if (null != ma.field_b[var18][var19]) {
                                      dl.field_a.a((byte) 50, ma.field_b[var18][var19]);
                                      break L19;
                                    } else {
                                      break L19;
                                    }
                                  }
                                  var19++;
                                  continue L18;
                                }
                              }
                            }
                            var18++;
                            continue L14;
                          }
                        }
                      } else {
                        L20: {
                          if (mi.field_Ib[var17_int] != null) {
                            mi.field_Ib[var17_int].field_J = 11;
                            break L20;
                          } else {
                            break L20;
                          }
                        }
                        L21: {
                          if (null != ma.field_b[var17_int]) {
                            var18 = 0;
                            L22: while (true) {
                              if (ma.field_b[var17_int].length <= var18) {
                                break L21;
                              } else {
                                L23: {
                                  if (null == ma.field_b[var17_int][var18]) {
                                    break L23;
                                  } else {
                                    if (ma.field_b[var17_int][var18].field_Mb == null) {
                                      break L23;
                                    } else {
                                      ma.field_b[var17_int][var18].field_Mb.field_J = 11;
                                      break L23;
                                    }
                                  }
                                }
                                var18++;
                                continue L22;
                              }
                            }
                          } else {
                            break L21;
                          }
                        }
                        var17_int++;
                        continue L13;
                      }
                    }
                  } else {
                    mi.field_Ib[4 + var17_int] = new cj(0L, m.field_B, cf.field_f[var17_int]);
                    array$2 = new mo[1 + tq.b(255, (int) ng.field_b[var17_int])];
                    ma.field_b[var17_int + 4] = array$2;
                    ma.field_b[var17_int + 4][0] = new mo(0L, uq.field_d, (cj) null, cm.field_b, (ja) null, hi.field_Mb);
                    var18 = 0;
                    L24: while (true) {
                      if (var18 >= (255 & ng.field_b[var17_int])) {
                        var17_int++;
                        continue L12;
                      } else {
                        L25: {
                          if (ZombieDawnMulti.field_L != null) {
                            if (null == ZombieDawnMulti.field_L[var17_int]) {
                              var19_ref = null;
                              break L25;
                            } else {
                              var19_ref = ZombieDawnMulti.field_L[var17_int][var18];
                              break L25;
                            }
                          } else {
                            var19_ref = null;
                            break L25;
                          }
                        }
                        L26: {
                          if (null == ul.field_m) {
                            var20 = null;
                            break L26;
                          } else {
                            if (ul.field_m[var17_int] == null) {
                              var20 = null;
                              break L26;
                            } else {
                              var20 = ul.field_m[var17_int][var18];
                              break L26;
                            }
                          }
                        }
                        ma.field_b[var17_int + 4][var18 - -1] = new mo(0L, uq.field_d, (cj) null, cm.field_b, (ja) (var19_ref), (String) (var20));
                        var18++;
                        continue L24;
                      }
                    }
                  }
                }
              } else {
                ma.field_b[0][1 + var17_int] = new mo(0L, uq.field_d, (cj) null, cm.field_b, qp.field_u[var17_int], t.field_c[var17_int]);
                var17_int++;
                continue L7;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L27: {
            var15 = decompiledCaughtException;
            stackIn_77_0 = (RuntimeException) (var15);

            stackIn_77_1 = new StringBuilder().append("md.F(");

            if (args == null) {
              stackIn_78_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackIn_78_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackIn_78_2 = "null";
              break L27;
            } else {
              stackIn_78_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackIn_78_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackIn_78_2 = "{...}";
              break L27;
            }
          }
          L28: {


            stackIn_80_1 = ((StringBuilder) (Object) stackIn_78_1).append(stackIn_78_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_78_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackIn_81_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackIn_81_2 = "null";
              break L28;
            } else {
              stackIn_78_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackIn_81_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackIn_81_2 = "{...}";
              break L28;
            }
          }
          L29: {


            stackIn_83_1 = ((StringBuilder) (Object) stackIn_81_1).append(stackIn_81_2).append(',');

            if (param3 == null) {
              stackIn_78_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackIn_84_1 = (StringBuilder) ((Object) stackIn_83_1);
              stackIn_84_2 = "null";
              break L29;
            } else {
              stackIn_78_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackIn_84_1 = (StringBuilder) ((Object) stackIn_83_1);
              stackIn_84_2 = "{...}";
              break L29;
            }
          }
          L30: {


            stackIn_86_1 = ((StringBuilder) (Object) stackIn_84_1).append(stackIn_84_2).append(',');

            if (param4 == null) {
              stackIn_78_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackIn_87_1 = (StringBuilder) ((Object) stackIn_86_1);
              stackIn_87_2 = "null";
              break L30;
            } else {
              stackIn_78_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackIn_87_1 = (StringBuilder) ((Object) stackIn_86_1);
              stackIn_87_2 = "{...}";
              break L30;
            }
          }
          L31: {


            stackIn_89_1 = ((StringBuilder) (Object) stackIn_87_1).append(stackIn_87_2).append(',');

            if (param5 == null) {
              stackIn_78_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackIn_90_1 = (StringBuilder) ((Object) stackIn_89_1);
              stackIn_90_2 = "null";
              break L31;
            } else {
              stackIn_78_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackIn_90_1 = (StringBuilder) ((Object) stackIn_89_1);
              stackIn_90_2 = "{...}";
              break L31;
            }
          }
          L32: {


            stackIn_92_1 = ((StringBuilder) (Object) stackIn_90_1).append(stackIn_90_2).append(',');

            if (param6 == null) {
              stackIn_78_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackIn_93_1 = (StringBuilder) ((Object) stackIn_92_1);
              stackIn_93_2 = "null";
              break L32;
            } else {
              stackIn_78_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackIn_93_1 = (StringBuilder) ((Object) stackIn_92_1);
              stackIn_93_2 = "{...}";
              break L32;
            }
          }
          L33: {


            stackIn_95_1 = ((StringBuilder) (Object) stackIn_93_1).append(stackIn_93_2).append(',');

            if (param7 == null) {
              stackIn_78_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackIn_96_1 = (StringBuilder) ((Object) stackIn_95_1);
              stackIn_96_2 = "null";
              break L33;
            } else {
              stackIn_78_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackIn_96_1 = (StringBuilder) ((Object) stackIn_95_1);
              stackIn_96_2 = "{...}";
              break L33;
            }
          }
          L34: {


            stackIn_98_1 = ((StringBuilder) (Object) stackIn_96_1).append(stackIn_96_2).append(',');

            if (param8 == null) {
              stackIn_78_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackIn_99_1 = (StringBuilder) ((Object) stackIn_98_1);
              stackIn_99_2 = "null";
              break L34;
            } else {
              stackIn_78_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackIn_99_1 = (StringBuilder) ((Object) stackIn_98_1);
              stackIn_99_2 = "{...}";
              break L34;
            }
          }
          L35: {


            stackIn_101_1 = ((StringBuilder) (Object) stackIn_99_1).append(stackIn_99_2).append(',').append(param9).append(',').append(param10).append(',');

            if (param11 == null) {
              stackIn_78_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackIn_102_1 = (StringBuilder) ((Object) stackIn_101_1);
              stackIn_102_2 = "null";
              break L35;
            } else {
              stackIn_78_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackIn_102_1 = (StringBuilder) ((Object) stackIn_101_1);
              stackIn_102_2 = "{...}";
              break L35;
            }
          }
          L36: {


            stackIn_104_1 = ((StringBuilder) (Object) stackIn_102_1).append(stackIn_102_2).append(',');

            if (param12 == null) {
              stackIn_78_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackIn_105_1 = (StringBuilder) ((Object) stackIn_104_1);
              stackIn_105_2 = "null";
              break L36;
            } else {
              stackIn_78_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackIn_105_1 = (StringBuilder) ((Object) stackIn_104_1);
              stackIn_105_2 = "{...}";
              break L36;
            }
          }
          L37: {


            stackIn_107_1 = ((StringBuilder) (Object) stackIn_105_1).append(stackIn_105_2).append(',').append(param13).append(',');

            if (param14 == null) {
              stackIn_78_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackIn_108_1 = (StringBuilder) ((Object) stackIn_107_1);
              stackIn_108_2 = "null";
              break L37;
            } else {
              stackIn_78_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackIn_108_1 = (StringBuilder) ((Object) stackIn_107_1);
              stackIn_108_2 = "{...}";
              break L37;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_78_0), stackIn_108_2 + ')');
        }
    }

    private final void a(int param0) {
        this.field_d = false;
        if (param0 != 255) {
            md.b((byte) 18);
        }
    }

    final static int a(CharSequence param0, int param1, int param2, boolean param3) {
        int stackIn_42_0 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 < 2) {
                break L1;
              } else {
                if (-37 > (param1 ^ -1)) {
                  break L1;
                } else {
                  L2: {
                    var4_int = 0;
                    if (param2 < -12) {
                      break L2;
                    } else {
                      md.a((String[]) null, -25, (int[]) null, (ul) null, (String[]) null, (ja[][]) null, (ja[][]) null, (String[][]) null, (byte[]) null, -121, true, (byte[]) null, (String[]) null, 73, (String[][]) null);
                      break L2;
                    }
                  }
                  var5 = 0;
                  var6 = 0;
                  var7 = param0.length();
                  var8 = 0;
                  L3: while (true) {
                    if (var7 <= var8) {
                      if (var5 == 0) {
                        throw new NumberFormatException();
                      } else {
                        stackIn_42_0 = var6;
                        break L0;
                      }
                    } else {
                      L4: {
                        L5: {
                          var9 = param0.charAt(var8);
                          if (-1 == (var8 ^ -1)) {
                            if (var9 == 45) {
                              var4_int = 1;
                              break L4;
                            } else {
                              if (var9 != 43) {
                                break L5;
                              } else {
                                if (!param3) {
                                  break L5;
                                } else {
                                  var8++;
                                  continue L3;
                                }
                              }
                            }
                          } else {
                            break L5;
                          }
                        }
                        L6: {
                          L7: {
                            if (var9 < 48) {
                              break L7;
                            } else {
                              if (var9 > 57) {
                                break L7;
                              } else {
                                var9 -= 48;
                                break L6;
                              }
                            }
                          }
                          L8: {
                            if (var9 < 65) {
                              break L8;
                            } else {
                              if (var9 > 90) {
                                break L8;
                              } else {
                                var9 -= 55;
                                break L6;
                              }
                            }
                          }
                          L9: {
                            if (var9 < 97) {
                              break L9;
                            } else {
                              if (122 < var9) {
                                break L9;
                              } else {
                                var9 -= 87;
                                break L6;
                              }
                            }
                          }
                          throw new NumberFormatException();
                        }
                        if (param1 > var9) {
                          L10: {
                            if (var4_int != 0) {
                              var9 = -var9;
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          var10 = var9 + param1 * var6;
                          if (var6 != var10 / param1) {
                            throw new NumberFormatException();
                          } else {
                            var5 = 1;
                            var6 = var10;
                            break L4;
                          }
                        } else {
                          throw new NumberFormatException();
                        }
                      }
                      var8++;
                      continue L3;
                    }
                  }
                }
              }
            }
            throw new IllegalArgumentException("" + param1);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackIn_45_0 = (RuntimeException) (var4);

            stackIn_45_1 = new StringBuilder().append("md.J(");

            if (param0 == null) {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "null";
              break L11;
            } else {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "{...}";
              break L11;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_46_0), stackIn_46_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_42_0;
    }

    md() {
        this.field_d = false;
        this.field_m = (byte) 0;
    }

    static {
        field_u = new th();
    }
}
