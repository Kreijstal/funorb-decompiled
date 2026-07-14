/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

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
        int var2 = 0;
        int var3 = ZombieDawnMulti.field_E ? 1 : 0;
        sj.a(up.field_d, -891231071, param0, true, lj.field_n, 0, ab.field_j);
        for (var2 = 0; var2 < lj.field_n; var2++) {
            la.field_c[var2 + param0] = var2;
        }
        if (param1 > -27) {
            field_u = null;
        }
        sj.a(ba.field_m, -891231071, param0 - -param0, false, param0 + lj.field_n, param0, mj.field_Ub);
        if (!(param0 >= lj.field_n)) {
            lj.field_n = param0;
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
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        if (!((md) this).field_d) {
          L0: {
            ((md) this).field_d = true;
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
            if (((md) this).field_n <= var8) {
              ((md) this).field_G = var3;
              ((md) this).field_D = var5;
              ((md) this).field_C = var2;
              ((md) this).field_j = var7;
              ((md) this).field_l = var6;
              ((md) this).field_r = var4;
              return;
            } else {
              L2: {
                var9 = ((md) this).field_k[var8];
                var10 = ((md) this).field_E[var8];
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
                var11 = ((md) this).field_v[var8];
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
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        if (bh.field_f != null) {
          L0: {
            var7 = (CharSequence) (Object) param1;
            var2 = tg.a(var7, false);
            var3 = 24 / ((47 - param0) / 43);
            if (var2 == null) {
              var2 = param1;
              break L0;
            } else {
              break L0;
            }
          }
          var4 = (ml) (Object) bh.field_f.a((long)var2.hashCode(), -22877);
          L1: while (true) {
            if (var4 != null) {
              L2: {
                var8 = (CharSequence) (Object) var4.field_Hb;
                var5 = tg.a(var8, false);
                if (var5 != null) {
                  break L2;
                } else {
                  var5 = var4.field_Hb;
                  break L2;
                }
              }
              if (var5.equals((Object) (Object) var2)) {
                return var4;
              } else {
                var4 = (ml) (Object) bh.field_f.b((byte) 68);
                continue L1;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = ZombieDawnMulti.field_E ? 1 : 0;
        for (var6 = 0; var6 < ((md) this).field_n; var6++) {
            ((md) this).field_k[var6] = (short)(param0 * ((md) this).field_k[var6] / param1);
            ((md) this).field_E[var6] = (short)(((md) this).field_E[var6] * param2 / param1);
            ((md) this).field_v[var6] = (short)(param3 * ((md) this).field_v[var6] / param1);
        }
        if (param4 != 2122) {
            ((md) this).field_v = null;
        }
        this.a(255);
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = ZombieDawnMulti.field_E ? 1 : 0;
        for (var5 = 0; var5 < ((md) this).field_n; var5++) {
            ((md) this).field_k[var5] = (short)(((md) this).field_k[var5] + param2);
            ((md) this).field_E[var5] = (short)(((md) this).field_E[var5] + param3);
            ((md) this).field_v[var5] = (short)(((md) this).field_v[var5] + param0);
        }
        this.a(255);
        if (param1 != 3) {
            ((md) this).field_t = null;
        }
    }

    final static int a(CharSequence param0, int param1) {
        if (param1 != -9159) {
            field_N = null;
        }
        return md.a(param0, 10, -31, true);
    }

    final static boolean a(ml param0, byte param1, ml param2) {
        int var3 = 0;
        int var4 = 0;
        int stackIn_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        L0: {
          var4 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param1 == -49) {
            break L0;
          } else {
            field_N = null;
            break L0;
          }
        }
        L1: {
          var3 = param0.field_Mb + -param2.field_Mb;
          if (param0.field_Nb != ta.field_ob) {
            if (param0.field_Nb != null) {
              break L1;
            } else {
              // wide iinc 3 200
              break L1;
            }
          } else {
            // wide iinc 3 -200
            break L1;
          }
        }
        L2: {
          if (param2.field_Nb == ta.field_ob) {
            // wide iinc 3 200
            break L2;
          } else {
            if (null == param2.field_Nb) {
              // wide iinc 3 -200
              break L2;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (var3 <= 0) {
            stackOut_13_0 = 0;
            stackIn_14_0 = stackOut_13_0;
            break L3;
          } else {
            stackOut_12_0 = 1;
            stackIn_14_0 = stackOut_12_0;
            break L3;
          }
        }
        return stackIn_14_0 != 0;
    }

    final static void a(String[] args, int param1, int[] param2, ul param3, String[] param4, ja[][] param5, ja[][] param6, String[][] param7, byte[] param8, int param9, boolean param10, byte[] param11, String[] param12, int param13, String[][] param14) {
        cj var16 = null;
        int var17_int = 0;
        cj var17 = null;
        int var18 = 0;
        Object var19_ref = null;
        ja var19_ref_ja = null;
        int var19 = 0;
        Object var20 = null;
        String var20_ref = null;
        int var21 = 0;
        Object var22 = null;
        cj var24 = null;
        cj var25 = null;
        cj stackIn_3_0 = null;
        cj stackIn_3_1 = null;
        long stackIn_3_2 = 0L;
        cj stackIn_3_3 = null;
        cj stackIn_4_0 = null;
        cj stackIn_4_1 = null;
        long stackIn_4_2 = 0L;
        cj stackIn_4_3 = null;
        cj stackIn_5_0 = null;
        cj stackIn_5_1 = null;
        long stackIn_5_2 = 0L;
        cj stackIn_5_3 = null;
        String stackIn_5_4 = null;
        cj stackOut_2_0 = null;
        cj stackOut_2_1 = null;
        long stackOut_2_2 = 0L;
        cj stackOut_2_3 = null;
        cj stackOut_4_0 = null;
        cj stackOut_4_1 = null;
        long stackOut_4_2 = 0L;
        cj stackOut_4_3 = null;
        String stackOut_4_4 = null;
        cj stackOut_3_0 = null;
        cj stackOut_3_1 = null;
        long stackOut_3_2 = 0L;
        cj stackOut_3_3 = null;
        String stackOut_3_4 = null;
        L0: {
          var21 = ZombieDawnMulti.field_E ? 1 : 0;
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
            break L0;
          } else {
            pd.field_b.a((byte) 50, mo.field_Hb);
            break L0;
          }
        }
        L1: {
          pd.field_b.a((byte) 50, (cj) (Object) hf.field_e);
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
          stackOut_2_0 = null;
          stackOut_2_1 = null;
          stackOut_2_2 = 0L;
          stackOut_2_3 = he.field_i;
          stackIn_4_0 = stackOut_2_0;
          stackIn_4_1 = stackOut_2_1;
          stackIn_4_2 = stackOut_2_2;
          stackIn_4_3 = stackOut_2_3;
          stackIn_3_0 = stackOut_2_0;
          stackIn_3_1 = stackOut_2_1;
          stackIn_3_2 = stackOut_2_2;
          stackIn_3_3 = stackOut_2_3;
          if (!tb.field_u) {
            stackOut_4_0 = null;
            stackOut_4_1 = null;
            stackOut_4_2 = stackIn_4_2;
            stackOut_4_3 = (cj) (Object) stackIn_4_3;
            stackOut_4_4 = cn.field_C;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            stackIn_5_2 = stackOut_4_2;
            stackIn_5_3 = stackOut_4_3;
            stackIn_5_4 = stackOut_4_4;
            break L1;
          } else {
            stackOut_3_0 = null;
            stackOut_3_1 = null;
            stackOut_3_2 = stackIn_3_2;
            stackOut_3_3 = (cj) (Object) stackIn_3_3;
            stackOut_3_4 = ff.field_t;
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_5_2 = stackOut_3_2;
            stackIn_5_3 = stackOut_3_3;
            stackIn_5_4 = stackOut_3_4;
            break L1;
          }
        }
        L2: {
          new cj(stackIn_5_2, stackIn_5_3, ((String) (Object) stackIn_5_4).toUpperCase());
          pl.field_L = stackIn_5_0;
          cm.field_a = new cj(0L, (cj) null);
          cm.field_a.a((byte) 50, ro.field_O);
          if (param10) {
            break L2;
          } else {
            var22 = null;
            int discarded$1 = md.a((CharSequence) null, -24);
            break L2;
          }
        }
        L3: {
          cm.field_a.a((byte) 50, ml.field_Lb);
          ml.field_Lb.a((byte) 50, k.field_g);
          ml.field_Lb.a((byte) 50, ud.field_M);
          ml.field_Lb.a((byte) 50, tk.field_l);
          if (tb.field_u) {
            ml.field_Lb.a((byte) 50, sc.field_d);
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          ml.field_Lb.a((byte) 50, da.field_h);
          ml.field_Lb.a((byte) 50, bp.field_w);
          ml.field_Lb.a((byte) 50, (cj) (Object) ek.field_H);
          if (tb.field_u) {
            cm.field_a.a((byte) 50, ia.field_t);
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
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
            break L5;
          } else {
            ga.field_r.a((byte) 50, bf.field_h);
            break L5;
          }
        }
        ga.field_r.a((byte) 50, (cj) (Object) bf.field_n);
        jp.field_b = new cj(0L, ai.field_c, pi.field_b.toUpperCase());
        gg.field_m = new cj(0L, ed.field_d);
        dl.field_a = new cj(0L, cg.field_f);
        ik.field_d = new cj(0L, hd.field_x, vb.field_d.toUpperCase());
        mi.field_Ib = new cj[4 + param9];
        ma.field_b = new mo[param9 - -4][];
        mi.field_Ib[0] = new cj(0L, m.field_B, kg.field_f);
        ma.field_b[0] = new mo[6];
        var17_int = 0;
        L6: while (true) {
          L7: {
            if (5 <= var17_int) {
              break L7;
            } else {
              ma.field_b[0][1 + var17_int] = new mo(0L, uq.field_d, (cj) null, cm.field_b, qp.field_u[var17_int], t.field_c[var17_int]);
              var17_int++;
              if (0 == 0) {
                continue L6;
              } else {
                break L7;
              }
            }
          }
          L8: {
            if (-3 >= (qo.field_r.length ^ -1)) {
              mi.field_Ib[1] = new cj(0L, m.field_B, gi.field_n);
              ma.field_b[1] = new mo[1 + qo.field_r.length];
              ma.field_b[1][0] = new mo(0L, uq.field_d, (cj) null, cm.field_b, (ja) null, hi.field_Mb);
              var17_int = 0;
              L9: while (true) {
                if (var17_int >= qo.field_r.length) {
                  break L8;
                } else {
                  ma.field_b[1][1 + var17_int] = new mo(0L, uq.field_d, (cj) null, cm.field_b, (ja) null, Integer.toString(qo.field_r[var17_int]));
                  var17_int++;
                  if (0 == 0) {
                    continue L9;
                  } else {
                    break L8;
                  }
                }
              }
            } else {
              break L8;
            }
          }
          L10: {
            mi.field_Ib[2] = new cj(0L, m.field_B, qj.field_j);
            ma.field_b[2] = new mo[3];
            if (r.field_f <= 1) {
              break L10;
            } else {
              mi.field_Ib[3] = new cj(0L, m.field_B, gj.field_d);
              ma.field_b[3] = new mo[r.field_f - -1];
              ma.field_b[3][0] = new mo(0L, uq.field_d, (cj) null, cm.field_b, (ja) null, hi.field_Mb);
              var17_int = 0;
              L11: while (true) {
                if (var17_int >= r.field_f) {
                  break L10;
                } else {
                  ma.field_b[3][1 + var17_int] = new mo(0L, uq.field_d, (cj) null, cm.field_b, (ja) null, um.field_b[var17_int]);
                  var17_int++;
                  if (0 == 0) {
                    continue L11;
                  } else {
                    break L10;
                  }
                }
              }
            }
          }
          var17_int = 0;
          L12: while (true) {
            L13: {
              if (param9 <= var17_int) {
                break L13;
              } else {
                mi.field_Ib[4 + var17_int] = new cj(0L, m.field_B, cf.field_f[var17_int]);
                ma.field_b[var17_int + 4] = new mo[1 + tq.b(255, (int) ng.field_b[var17_int])];
                ma.field_b[var17_int + 4][0] = new mo(0L, uq.field_d, (cj) null, cm.field_b, (ja) null, hi.field_Mb);
                var18 = 0;
                L14: while (true) {
                  L15: {
                    if (var18 >= (255 & ng.field_b[var17_int])) {
                      break L15;
                    } else {
                      L16: {
                        if (ZombieDawnMulti.field_L != null) {
                          if (null == ZombieDawnMulti.field_L[var17_int]) {
                            var19_ref = null;
                            break L16;
                          } else {
                            var19_ref_ja = ZombieDawnMulti.field_L[var17_int][var18];
                            break L16;
                          }
                        } else {
                          var19_ref_ja = null;
                          break L16;
                        }
                      }
                      L17: {
                        if (null == ul.field_m) {
                          var20 = null;
                          break L17;
                        } else {
                          if (ul.field_m[var17_int] == null) {
                            var20 = null;
                            break L17;
                          } else {
                            var20_ref = ul.field_m[var17_int][var18];
                            break L17;
                          }
                        }
                      }
                      ma.field_b[var17_int + 4][var18 - -1] = new mo(0L, uq.field_d, (cj) null, cm.field_b, (ja) var19_ref, (String) var20);
                      var18++;
                      if (0 == 0) {
                        continue L14;
                      } else {
                        break L15;
                      }
                    }
                  }
                  var17_int++;
                  if (0 == 0) {
                    continue L12;
                  } else {
                    break L13;
                  }
                }
              }
            }
            var17_int = 0;
            L18: while (true) {
              L19: {
                if (param9 + 4 <= var17_int) {
                  break L19;
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
                          if (0 == 0) {
                            continue L22;
                          } else {
                            break L21;
                          }
                        }
                      }
                    } else {
                      break L21;
                    }
                  }
                  var17_int++;
                  if (0 == 0) {
                    continue L18;
                  } else {
                    break L19;
                  }
                }
              }
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
              L24: while (true) {
                L25: {
                  if (4 + param9 <= var18) {
                    break L25;
                  } else {
                    L26: {
                      L27: {
                        if (var18 != 1) {
                          break L27;
                        } else {
                          if (qo.field_r.length < 2) {
                            break L26;
                          } else {
                            break L27;
                          }
                        }
                      }
                      L28: {
                        if (var18 != 3) {
                          break L28;
                        } else {
                          if (r.field_f <= 1) {
                            break L26;
                          } else {
                            break L28;
                          }
                        }
                      }
                      dl.field_a.a((byte) 50, mi.field_Ib[var18]);
                      var19 = 0;
                      L29: while (true) {
                        if (ma.field_b[var18].length <= var19) {
                          break L26;
                        } else {
                          L30: {
                            if (null != ma.field_b[var18][var19]) {
                              dl.field_a.a((byte) 50, (cj) (Object) ma.field_b[var18][var19]);
                              break L30;
                            } else {
                              break L30;
                            }
                          }
                          var19++;
                          if (0 == 0) {
                            continue L29;
                          } else {
                            break L26;
                          }
                        }
                      }
                    }
                    var18++;
                    if (0 == 0) {
                      continue L24;
                    } else {
                      break L25;
                    }
                  }
                }
                fc.field_a.a((byte) 50, en.field_b);
                fc.field_a.a((byte) 50, gb.field_a);
                fc.field_a.a((byte) 50, eb.field_B);
                mq.field_l = new cj(0L, kc.field_c, p.field_c.toUpperCase());
                pg.field_a = new cj(0L, kb.field_n, qq.field_d.toUpperCase());
                return;
              }
            }
          }
        }
    }

    private final void a(int param0) {
        ((md) this).field_d = false;
        if (param0 != 255) {
            md.b((byte) 18);
        }
    }

    final static int a(CharSequence param0, int param1, int param2, boolean param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param1 < 2) {
            break L0;
          } else {
            if (-37 > (param1 ^ -1)) {
              break L0;
            } else {
              L1: {
                var4 = 0;
                if (param2 < -12) {
                  break L1;
                } else {
                  md.a((String[]) null, -25, (int[]) null, (ul) null, (String[]) null, (ja[][]) null, (ja[][]) null, (String[][]) null, (byte[]) null, -121, true, (byte[]) null, (String[]) null, 73, (String[][]) null);
                  break L1;
                }
              }
              var5 = 0;
              var6 = 0;
              var7 = param0.length();
              var8 = 0;
              L2: while (true) {
                if (var7 <= var8) {
                  if (var5 == 0) {
                    throw new NumberFormatException();
                  } else {
                    return var6;
                  }
                } else {
                  L3: {
                    var9 = param0.charAt(var8);
                    if (-1 == (var8 ^ -1)) {
                      if (var9 == 45) {
                        var4 = 1;
                        var8++;
                        continue L2;
                      } else {
                        if (var9 != 43) {
                          break L3;
                        } else {
                          if (!param3) {
                            break L3;
                          } else {
                            var8++;
                            continue L2;
                          }
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    L5: {
                      if (var9 < 48) {
                        break L5;
                      } else {
                        if (var9 > 57) {
                          break L5;
                        } else {
                          var9 -= 48;
                          break L4;
                        }
                      }
                    }
                    L6: {
                      if (var9 < 65) {
                        break L6;
                      } else {
                        if (var9 > 90) {
                          break L6;
                        } else {
                          var9 -= 55;
                          break L4;
                        }
                      }
                    }
                    L7: {
                      if (var9 < 97) {
                        break L7;
                      } else {
                        if (122 < var9) {
                          break L7;
                        } else {
                          var9 -= 87;
                          break L4;
                        }
                      }
                    }
                    throw new NumberFormatException();
                  }
                  if (param1 > var9) {
                    L8: {
                      if (var4 != 0) {
                        var9 = -var9;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    var10 = var9 + param1 * var6;
                    if (var6 != var10 / param1) {
                      throw new NumberFormatException();
                    } else {
                      var5 = 1;
                      var6 = var10;
                      var8++;
                      continue L2;
                    }
                  } else {
                    throw new NumberFormatException();
                  }
                }
              }
            }
          }
        }
        throw new IllegalArgumentException("" + param1);
    }

    md() {
        ((md) this).field_d = false;
        ((md) this).field_m = (byte) 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = new th();
    }
}
