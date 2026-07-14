/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qka extends qra {
    private int[] field_r;
    static jpa[] field_o;
    private int field_n;
    static long[] field_m;
    static String field_s;
    private boolean field_q;
    private fna[] field_p;

    public static void b(byte param0) {
        field_m = null;
        if (param0 <= 28) {
            field_m = null;
        }
        field_o = null;
        field_s = null;
    }

    qka(qh param0, v param1) {
        super(param0, param1);
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        ((qka) this).field_n = -1;
        ((qka) this).field_r = new int[((qka) this).field_c.field_k];
        var3 = 0;
        L0: while (true) {
          if (((qka) this).field_c.field_k <= var3) {
            L1: {
              if (((qka) this).field_h.d((byte) 116)) {
                er.b(1, 0);
                break L1;
              } else {
                L2: {
                  if (0 != ((qka) this).field_r[((qka) this).field_h.field_x]) {
                    break L2;
                  } else {
                    if (-1 >= (((qka) this).field_c.field_z ^ -1)) {
                      er.b(1, 2);
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                er.b(1, 3);
                break L1;
              }
            }
            L3: {
              L4: {
                if (!((qka) this).field_h.field_D) {
                  break L4;
                } else {
                  if (!((qka) this).field_h.d((byte) 82)) {
                    ((qka) this).field_p = new fna[2];
                    ((qka) this).field_p[0] = new fna(33, wba.field_q[33], 1, false);
                    ((qka) this).field_p[0].field_b = aaa.a(false) + -110;
                    ((qka) this).field_p[0].field_i = koa.b(0) - 25;
                    ((qka) this).field_p[0].a(false);
                    ((qka) this).field_p[1] = new fna(34, wba.field_q[34], 1, false);
                    ((qka) this).field_p[1].field_b = 100;
                    ((qka) this).field_p[1].field_i = koa.b(0) + -25;
                    ((qka) this).field_p[1].a(false);
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                ((qka) this).field_p = new fna[1];
                if (((qka) this).field_h.field_D) {
                  stackOut_26_0 = 33;
                  stackIn_27_0 = stackOut_26_0;
                  break L5;
                } else {
                  stackOut_25_0 = 16;
                  stackIn_27_0 = stackOut_25_0;
                  break L5;
                }
              }
              var3 = stackIn_27_0;
              ((qka) this).field_p[0] = new fna(var3, wba.field_q[var3], 0, false);
              ((qka) this).field_p[0].field_b = -100 + aaa.a(false);
              ((qka) this).field_p[0].field_i = koa.b(0) - 25;
              ((qka) this).field_p[0].a(false);
              if (((qka) this).field_h.field_D) {
                break L3;
              } else {
                if (vpa.a(43)) {
                  break L3;
                } else {
                  ((qka) this).field_p[0].field_e = aua.field_d.toUpperCase();
                  pt.field_p = uta.a(3, ((qka) this).field_h.m(-1), 0, 10, 1);
                  break L3;
                }
              }
            }
          } else {
            var4 = 0;
            var5 = 0;
            L6: while (true) {
              if (((qka) this).field_c.field_v.length <= var5) {
                L7: {
                  if (!((qka) this).field_c.f((byte) -117, var3)) {
                    break L7;
                  } else {
                    var4 = ((qka) this).field_c.field_k + -1;
                    break L7;
                  }
                }
                L8: {
                  if (1 != (((qka) this).field_c.field_z ^ -1)) {
                    break L8;
                  } else {
                    var4 = 0;
                    break L8;
                  }
                }
                ((qka) this).field_r[var3] = var4;
                var3++;
                continue L0;
              } else {
                if (var5 != var3) {
                  if (((qka) this).field_c.field_v[var5] > ((qka) this).field_c.field_v[var3]) {
                    if (!((qka) this).field_c.f((byte) -96, var5)) {
                      var4++;
                      var5++;
                      continue L6;
                    } else {
                      var5++;
                      continue L6;
                    }
                  } else {
                    var5++;
                    continue L6;
                  }
                } else {
                  var5++;
                  continue L6;
                }
              }
            }
          }
        }
    }

    final boolean e(int param0) {
        if (param0 != -9202) {
            return false;
        }
        return false;
    }

    final boolean a(char param0, int param1, int param2) {
        if (param2 == 13) {
            this.a(127, 0);
        } else {
            if ((param2 ^ -1) == -35) {
                this.a(127, 0);
            } else {
                if (param2 == 83) {
                    this.a(127, 0);
                }
            }
        }
        if (param1 != 25) {
            return false;
        }
        return true;
    }

    final void b(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var10_ref = null;
        int var11 = 0;
        int var12 = 0;
        nh var12_ref = null;
        Exception var13_ref_Exception = null;
        int var13 = 0;
        String var13_ref = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        String var18 = null;
        int var19 = 0;
        String var20 = null;
        int var21 = 0;
        int var22 = 0;
        String var23 = null;
        String var24 = null;
        int stackIn_4_0 = 0;
        fna stackIn_58_0 = null;
        int stackIn_58_1 = 0;
        int stackIn_58_2 = 0;
        int stackIn_58_3 = 0;
        fna stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        int stackIn_59_2 = 0;
        int stackIn_59_3 = 0;
        fna stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        int stackIn_60_2 = 0;
        int stackIn_60_3 = 0;
        int stackIn_60_4 = 0;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        fna stackOut_57_0 = null;
        int stackOut_57_1 = 0;
        int stackOut_57_2 = 0;
        int stackOut_57_3 = 0;
        fna stackOut_58_0 = null;
        int stackOut_58_1 = 0;
        int stackOut_58_2 = 0;
        int stackOut_58_3 = 0;
        int stackOut_58_4 = 0;
        fna stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        int stackOut_59_2 = 0;
        int stackOut_59_3 = 0;
        int stackOut_59_4 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var21 = TombRacer.field_G ? 1 : 0;
                    ura.a(-10985);
                    la.field_j.a(0, 0);
                    if (((qka) this).field_h.field_D) {
                        statePc = 37;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var3 = aaa.a(false) >> -1580473983;
                    var4 = koa.b(0) >> 1754536289;
                    gg.field_f.a(-(gg.field_f.a() >> 1028426561) + var3, -(gg.field_f.c() >> 944730817) + var4);
                    var5 = 260;
                    var6 = 40;
                    var7 = var3;
                    var8 = var4 + -80;
                    kq.field_a.a(var7 - (kq.field_a.a() >> 747481697), var8 - (kq.field_a.c() >> -1359371199));
                    var9 = ((qka) this).field_h.m(-1);
                    if (pl.a((byte) 64) != var9) {
                        statePc = 3;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    stackOut_2_0 = 1;
                    stackIn_4_0 = stackOut_2_0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 3: {
                    stackOut_3_0 = 0;
                    stackIn_4_0 = stackOut_3_0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    var11 = stackIn_4_0;
                    if (var11 != 0) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var10_ref = vj.field_d[var9].toUpperCase();
                    statePc = 7;
                    continue stateLoop;
                }
                case 6: {
                    var10_ref = id.field_k.toUpperCase();
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    int discarded$5 = be.a(var10_ref, 1, eda.field_f, 2431750, 8 + o.field_d.field_m, var6, 1, -(var6 >> -2112849183) + var8, var7 - (var5 >> 1833720769), -1, (byte) 60, var5);
                    oka.a(((qka) this).field_h.a(((qka) this).field_h.field_x, false).toUpperCase(), wga.field_a[((qka) this).field_h.field_x], eda.field_f, -1, -15 + var4, var3, -1);
                    if ((((qka) this).field_c.field_z ^ -1) > -1) {
                        statePc = 22;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    oka.a(iaa.field_a.toUpperCase(), 2431750, eda.field_f, -1, -40 + var4, var3, -1);
                    if (var9 == uca.field_a) {
                        statePc = 10;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var12_ref = null;
                    var13_ref = hb.field_v;
                    if (ea.field_j != 3) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var12_ref = za.field_g;
                    var13_ref = uaa.field_d;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (-3 == ea.field_j) {
                        statePc = 14;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var13_ref = qna.field_c;
                    var12_ref = bca.field_d;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    if (-2 == ea.field_j) {
                        statePc = 17;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var13_ref = ps.field_P;
                    var12_ref = rm.field_c;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    if (var12_ref != null) {
                        statePc = 20;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var12_ref.a(var3 - (120 - -(var12_ref.d() / 2)), var4 - 10);
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    oka.a(var13_ref, 65793, kn.field_p, -1, 35 + var4, var3 + -120, -1);
                    statePc = 23;
                    continue stateLoop;
                }
                case 22: {
                    oka.a(wpa.field_K.toUpperCase(), 2431750, eda.field_f, -1, var4 - 40, var3, -1);
                    oka.a(sg.field_n.toUpperCase(), 2431750, kn.field_p, -1, 45 + var4, var3, -1);
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    if (var11 != 0) {
                        statePc = 36;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    var23 = dea.a(((qka) this).field_c.c((byte) 115, ((qka) this).field_h.field_x), (byte) -8);
                    oka.a(cc.field_l.toUpperCase() + " " + var23.toUpperCase(), 2431750, kn.field_p, -1, 48 + var4, var3 + -120, -1);
                    za.field_g.a(-200 + var3, var4 + 60);
                    var13 = as.a(var9, 0);
                    ts.a(-1, -36, var4 - -79, dea.a(var13, (byte) -8), -200 + (var3 + za.field_g.d()) - -5, kn.field_p, 2431750);
                    bca.field_d.a(var3 - 110, 60 + var4);
                    ts.a(-1, -92, 79 + var4, dea.a(var13 + var13 / 2, (byte) -8), bca.field_d.d() + (var3 - 110) + 5, kn.field_p, 2431750);
                    oka.a(lc.field_L.toUpperCase(), 2431750, eda.field_f, -1, 5 + var4, 120 + var3, -1);
                    var14 = ((qka) this).field_h.field_k.field_G[((qka) this).field_h.field_x].field_g.v(110);
                    oka.a(Integer.toString(var14), 2431750, eda.field_f, -1, var4 + 22, var3 + 120, -1);
                    if (pt.field_p == null) {
                        statePc = 55;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if (pt.field_p.field_p == null) {
                        statePc = 55;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (!pt.field_p.field_h) {
                        statePc = 55;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    var15 = pt.field_p.field_p[1][0];
                    var16 = -var15 + var14;
                    if (var15 == 0) {
                        statePc = 29;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    oka.a(gl.a((byte) 103, lea.field_F, new String[1]), 2431750, kn.field_p, -1, 50 + var4, 120 + var3, -1);
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    var17 = 0;
                    var18 = null;
                    var19 = 0;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    if (pt.field_p.field_k[2].length <= var19) {
                        statePc = 34;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    var20 = pt.field_p.field_k[2][var19];
                    if (ue.a(var20, 0)) {
                        statePc = 33;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    var17 = pt.field_p.field_p[2][var19];
                    var18 = var20;
                    statePc = 34;
                    continue stateLoop;
                }
                case 33: {
                    var19++;
                    statePc = 30;
                    continue stateLoop;
                }
                case 34: {
                    if (var18 == null) {
                        statePc = 55;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    var16 = var14 - var17;
                    int discarded$6 = be.a(gl.a((byte) 121, qw.field_g, new String[2]), 0, kn.field_p, 2431750, 13, 50, 1, var4 + 60, var3, -1, (byte) 60, 240);
                    statePc = 55;
                    continue stateLoop;
                }
                case 36: {
                    var24 = dea.a(((qka) this).field_c.c((byte) 115, ((qka) this).field_h.field_x), (byte) -8);
                    oka.a(cc.field_l.toUpperCase() + " " + var24.toUpperCase(), 2431750, kn.field_p, -1, 20 + var4, -120 + var3, -1);
                    oka.a(lc.field_L.toUpperCase(), 2431750, eda.field_f, -1, var4, 120 + var3, -1);
                    var13 = ((qka) this).field_h.field_k.field_G[((qka) this).field_h.field_x].field_g.v(74);
                    oka.a(Integer.toString(var13), 2431750, eda.field_f, -1, 20 + var4, 120 + var3, -1);
                    statePc = 55;
                    continue stateLoop;
                }
                case 37: {
                    var3 = aaa.a(false) >> 719911137;
                    var4 = (aaa.a(false) >> -795711711) / 3 + 37;
                    var5 = 56;
                    var6 = ((qka) this).field_c.field_k;
                    var22 = 0;
                    var7 = var22;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    if (var22 >= var6) {
                        statePc = 55;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    var8 = ((qka) this).field_r[var22];
                    var9 = -var8 + var6;
                    var10 = -(var5 * var9) + koa.b(0);
                    var11 = var4 * var22 + (var3 - (var4 >> -1106508735) * (-1 + var6));
                    ((qka) this).field_c.field_H[var22].n((byte) -120).a(-1, var11, 800, 0, var10);
                    vna.field_c.a(var11 + -(vna.field_c.a() >> 1477401377) + 1, var10 + -8);
                    if (var8 == 0) {
                        statePc = 41;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 41: {
                    sta.field_y[-1 + sta.field_y.length].a(-(sta.field_y[sta.field_y.length - 1].a() >> 2061309825) + var11 + -1, var10 + -12);
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    var12 = 150;
                    cha.a(-60 + var11, 2, tga.field_a, 4, var10 + -250, 120, 65793 | var12 << -489188680, 1, 100);
                    oka.a(((qka) this).field_h.a(var22, false).toUpperCase(), wga.field_a[var22], kn.field_p, -1, var10 + -230, var11, 0);
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    try {
                        tga.field_a.a(var11, var10 - 140, 10 + var11, -151 + var10, var11, var10 - 151, 65793 | var12 << -1346753000, var12 << 1191458392 | 65793, var12 << 1898139576 | 65793, 1);
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 45: {
                    var13_ref_Exception = (Exception) (Object) caughtException;
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    if (!((qka) this).field_c.f((byte) -102, var22)) {
                        statePc = 48;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    oka.a(id.field_i.toUpperCase(), 11141120, kn.field_p, -1, var10 + -190, var11, 0);
                    var22++;
                    statePc = 38;
                    continue stateLoop;
                }
                case 48: {
                    var13 = 7829367;
                    if (-2 != ((qka) this).field_c.field_z) {
                        statePc = 50;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    int discarded$7 = be.a(paa.field_y.toUpperCase(), 1, kn.field_p, var13, 16, 70, 1, var10 + -243, -50 + var11, 0, (byte) 60, 100);
                    statePc = 51;
                    continue stateLoop;
                }
                case 50: {
                    int discarded$8 = be.a(gl.a((byte) 93, ga.field_K.toUpperCase(), new String[1]).toUpperCase(), 1, kn.field_p, var13, 16, 60, 1, var10 + -243, -50 + var11, 0, (byte) 60, 100);
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    if (((qka) this).field_c.g(69, var22)) {
                        statePc = 53;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    var22++;
                    statePc = 38;
                    continue stateLoop;
                }
                case 53: {
                    int discarded$9 = be.a(w.field_d.toUpperCase(), 1, kn.field_p, 3385907, 16, 40, 1, var10 - 203, -50 + var11, 0, (byte) 60, 100);
                    var22++;
                    statePc = 38;
                    continue stateLoop;
                }
                case 55: {
                    se.f((byte) -6);
                    var3 = 0;
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    if (var3 >= ((qka) this).field_p.length) {
                        statePc = 61;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    stackOut_57_0 = ((qka) this).field_p[var3];
                    stackOut_57_1 = 0;
                    stackOut_57_2 = 1;
                    stackOut_57_3 = 1;
                    stackIn_59_0 = stackOut_57_0;
                    stackIn_59_1 = stackOut_57_1;
                    stackIn_59_2 = stackOut_57_2;
                    stackIn_59_3 = stackOut_57_3;
                    stackIn_58_0 = stackOut_57_0;
                    stackIn_58_1 = stackOut_57_1;
                    stackIn_58_2 = stackOut_57_2;
                    stackIn_58_3 = stackOut_57_3;
                    if (((qka) this).field_n != var3) {
                        statePc = 59;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    stackOut_58_0 = (fna) (Object) stackIn_58_0;
                    stackOut_58_1 = stackIn_58_1;
                    stackOut_58_2 = stackIn_58_2;
                    stackOut_58_3 = stackIn_58_3;
                    stackOut_58_4 = 1;
                    stackIn_60_0 = stackOut_58_0;
                    stackIn_60_1 = stackOut_58_1;
                    stackIn_60_2 = stackOut_58_2;
                    stackIn_60_3 = stackOut_58_3;
                    stackIn_60_4 = stackOut_58_4;
                    statePc = 60;
                    continue stateLoop;
                }
                case 59: {
                    stackOut_59_0 = (fna) (Object) stackIn_59_0;
                    stackOut_59_1 = stackIn_59_1;
                    stackOut_59_2 = stackIn_59_2;
                    stackOut_59_3 = stackIn_59_3;
                    stackOut_59_4 = 0;
                    stackIn_60_0 = stackOut_59_0;
                    stackIn_60_1 = stackOut_59_1;
                    stackIn_60_2 = stackOut_59_2;
                    stackIn_60_3 = stackOut_59_3;
                    stackIn_60_4 = stackOut_59_4;
                    statePc = 60;
                    continue stateLoop;
                }
                case 60: {
                    ((fna) (Object) stackIn_60_0).a(stackIn_60_1 != 0, stackIn_60_2 != 0, stackIn_60_3, stackIn_60_4 != 0);
                    var3++;
                    statePc = 56;
                    continue stateLoop;
                }
                case 61: {
                    if (param0 < -50) {
                        statePc = 63;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    field_m = null;
                    statePc = 63;
                    continue stateLoop;
                }
                case 63: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, int param1) {
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        if (0 != (param1 ^ -1)) {
          L0: {
            if (param0 > 114) {
              break L0;
            } else {
              ((qka) this).b(-124, false);
              break L0;
            }
          }
          L1: {
            if (param1 == -1) {
              ((qka) this).field_h.b(false, true, 0);
              if (((qka) this).field_h.field_D) {
                r.a(0, ((qka) this).field_h.d((byte) 120));
                break L1;
              } else {
                ea.field_j = -1;
                break L1;
              }
            } else {
              if (-2 == param1) {
                ql.field_k.k(67, -2988);
                break L1;
              } else {
                break L1;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final void a(int param0, boolean param1) {
        int var3 = 0;
        hf var4_ref_hf = null;
        int var4 = 0;
        int var5 = 0;
        hf stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        hf stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        hf stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_24_0 = 0;
        fna stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        fna stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        fna stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        int stackIn_30_2 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        fna stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        fna stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        int stackOut_29_2 = 0;
        fna stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        int stackOut_28_2 = 0;
        hf stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        hf stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        hf stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        var3 = 0;
        L0: while (true) {
          if (var3 >= ((qka) this).field_c.field_H.length) {
            L1: {
              ((qka) this).field_n = -1;
              ((qka) this).field_q = true;
              if (param0 == 80) {
                break L1;
              } else {
                ((qka) this).b(12, true);
                break L1;
              }
            }
            var3 = 0;
            L2: while (true) {
              if (((qka) this).field_p.length <= var3) {
                L3: {
                  if (!((qka) this).field_h.field_D) {
                    break L3;
                  } else {
                    if (!((qka) this).field_h.d((byte) 69)) {
                      var3 = ((qka) this).field_h.field_k.field_t;
                      if (-2 == (var3 >> ((qka) this).field_h.field_x & 1)) {
                        ((qka) this).field_p[1].field_e = df.field_I.toUpperCase();
                        break L3;
                      } else {
                        if (-1 != var3) {
                          ((qka) this).field_p[1].field_e = ot.field_t.toUpperCase();
                          break L3;
                        } else {
                          if (((qka) this).field_h.field_k.a(((qka) this).field_h.field_x, true)) {
                            ((qka) this).field_p[1].field_e = sl.field_g.toUpperCase();
                            break L3;
                          } else {
                            ((qka) this).field_p[1].field_e = kna.field_E.toUpperCase();
                            break L3;
                          }
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                }
                return;
              } else {
                L4: {
                  if (param1) {
                    if (((qka) this).field_p[var3].field_b - 80 <= jba.field_j) {
                      if (jba.field_j < 80 + ((qka) this).field_p[var3].field_b) {
                        if (-25 + ((qka) this).field_p[var3].field_i <= sta.field_B) {
                          if (((qka) this).field_p[var3].field_i - -25 > sta.field_B) {
                            stackOut_22_0 = 1;
                            stackIn_24_0 = stackOut_22_0;
                            break L4;
                          } else {
                            stackOut_21_0 = 0;
                            stackIn_24_0 = stackOut_21_0;
                            break L4;
                          }
                        } else {
                          stackOut_19_0 = 0;
                          stackIn_24_0 = stackOut_19_0;
                          break L4;
                        }
                      } else {
                        stackOut_17_0 = 0;
                        stackIn_24_0 = stackOut_17_0;
                        break L4;
                      }
                    } else {
                      stackOut_15_0 = 0;
                      stackIn_24_0 = stackOut_15_0;
                      break L4;
                    }
                  } else {
                    stackOut_13_0 = 0;
                    stackIn_24_0 = stackOut_13_0;
                    break L4;
                  }
                }
                L5: {
                  var4 = stackIn_24_0;
                  if (var4 != 0) {
                    ((qka) this).field_n = var3;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  stackOut_27_0 = ((qka) this).field_p[var3];
                  stackOut_27_1 = 1;
                  stackIn_29_0 = stackOut_27_0;
                  stackIn_29_1 = stackOut_27_1;
                  stackIn_28_0 = stackOut_27_0;
                  stackIn_28_1 = stackOut_27_1;
                  if (((qka) this).field_n != var3) {
                    stackOut_29_0 = (fna) (Object) stackIn_29_0;
                    stackOut_29_1 = stackIn_29_1;
                    stackOut_29_2 = 0;
                    stackIn_30_0 = stackOut_29_0;
                    stackIn_30_1 = stackOut_29_1;
                    stackIn_30_2 = stackOut_29_2;
                    break L6;
                  } else {
                    stackOut_28_0 = (fna) (Object) stackIn_28_0;
                    stackOut_28_1 = stackIn_28_1;
                    stackOut_28_2 = 1;
                    stackIn_30_0 = stackOut_28_0;
                    stackIn_30_1 = stackOut_28_1;
                    stackIn_30_2 = stackOut_28_2;
                    break L6;
                  }
                }
                ((fna) (Object) stackIn_30_0).a(stackIn_30_1 != 0, stackIn_30_2 != 0, true, 6);
                if (param1) {
                  if (var4 != 0) {
                    if (0 != hf.field_b) {
                      this.a(120, var3);
                      var3++;
                      continue L2;
                    } else {
                      var3++;
                      continue L2;
                    }
                  } else {
                    var3++;
                    continue L2;
                  }
                } else {
                  var3++;
                  continue L2;
                }
              }
            }
          } else {
            L7: {
              var4_ref_hf = (hf) (Object) ((qka) this).field_c.field_H[var3].n((byte) -67);
              if (((qka) this).field_q) {
                break L7;
              } else {
                L8: {
                  stackOut_3_0 = (hf) var4_ref_hf;
                  stackOut_3_1 = 26;
                  stackIn_5_0 = stackOut_3_0;
                  stackIn_5_1 = stackOut_3_1;
                  stackIn_4_0 = stackOut_3_0;
                  stackIn_4_1 = stackOut_3_1;
                  if (var3 != ((qka) this).field_c.field_z) {
                    stackOut_5_0 = (hf) (Object) stackIn_5_0;
                    stackOut_5_1 = stackIn_5_1;
                    stackOut_5_2 = 0;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    stackIn_6_2 = stackOut_5_2;
                    break L8;
                  } else {
                    stackOut_4_0 = (hf) (Object) stackIn_4_0;
                    stackOut_4_1 = stackIn_4_1;
                    stackOut_4_2 = 23;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_6_1 = stackOut_4_1;
                    stackIn_6_2 = stackOut_4_2;
                    break L8;
                  }
                }
                ((hf) (Object) stackIn_6_0).a(stackIn_6_1, stackIn_6_2, false);
                break L7;
              }
            }
            var4_ref_hf.a(21463);
            var4_ref_hf.f(-4366);
            var3++;
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "Solo Adventure";
    }
}
