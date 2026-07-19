/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class Virogrid extends od {
    private p field_I;
    static co field_O;
    private int[] field_N;
    private int[] field_D;
    private int field_E;
    private int[] field_B;
    private int[] field_C;
    private int[] field_K;
    private int field_A;
    private int[] field_M;
    private int[] field_H;
    private int[] field_L;
    private int[] field_G;
    private int[] field_J;
    public static boolean field_F;

    private final void r(int param0) {
        jf dupTemp$2 = null;
        ck discarded$3 = null;
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = field_F ? 1 : 0;
          bc.field_c = 3;
          ln.field_g = 3;
          co.field_l = 3;
          dupTemp$2 = new jf();
          gb.field_H = dupTemp$2;
          ke.field_p = dupTemp$2;
          ad.field_g = new double[]{1.0, 0.0, 0.0};
          vm.field_d = new double[]{0.0, 0.0, -128.0};
          da.field_k = new double[3];
          gb.c((byte) -44);
          ke.field_p.field_d = true;
          ce.field_E = 0;
          bi.field_c = new int[]{0, 154, 0, 65536, 0, 0, 0, 65536, 0, 0, 0, 65536};
          gb.field_H.field_d = true;
          c.field_d = new mg(640, 400);
          we.field_e = new mg(640, 400);
          mk.field_bb = new mg(200, 400);
          var2 = 0;
          if (param0 > 59) {
            break L0;
          } else {
            discarded$3 = Virogrid.b((byte) -64, false);
            break L0;
          }
        }
        L1: while (true) {
          L2: {
            L3: {
              if (var2 >= 256) {
                break L3;
              } else {
                pj.field_d[var2] = rb.a(16711872, 143 * var2 << -1617433272);
                pj.field_d[var2] = oh.a(pj.field_d[var2], rb.a(65280, var2 * 191));
                pj.field_d[var2] = oh.a(pj.field_d[var2], var2);
                var2++;
                if (var3 != 0) {
                  break L2;
                } else {
                  if (var3 == 0) {
                    continue L1;
                  } else {
                    break L3;
                  }
                }
              }
            }
            jm.a(320, 240, -2);
            qa.field_e = -1;
            break L2;
          }
          return;
        }
    }

    private final void e(byte param0) {
        int var2 = (id.field_r % 20480 << -2083455892) % 83886080;
        si.a(nk.field_K, new double[]{-768.0, 20.0, 0.0}, new double[]{0.0, 0.0, 1.0}, 700.0, 200.0, sj.field_j, 23967451 + var2, var2 - -59918628, 0, 16711680, ke.field_p.field_k);
        si.a(nk.field_K, new double[]{-768.0 + rf.field_c * 1800.0, 20.0, 300.0 + rf.field_c * 400.0}, new double[]{rf.field_c, 0.0, -rf.field_c}, 500.0, 200.0, sj.field_j, var2 - -59918628, 83820544 + var2, 0, 16711680, ke.field_p.field_k);
        if (param0 != -62) {
            return;
        }
        this.s(-1933);
    }

    private final void a(eh param0, byte param1, eh param2, eh param3, eh param4, eh param5) {
        mg discarded$3 = null;
        mg discarded$4 = null;
        mg discarded$5 = null;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9_int = 0;
        mg[][] var9 = null;
        int var10 = 0;
        mg var11 = null;
        int var12 = 0;
        mg var13 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var12 = field_F ? 1 : 0;
        try {
          L0: {
            hd.field_b = a.a("", param5, -110, "font", param4);
            vg.field_H = a.a("", param5, -95, "smallfont", param4);
            mc.field_b = a.a("", param5, -120, "menufont", param4);
            re.field_o = a.a("", param5, -110, "tinyfont", param4);
            var13 = sn.a(param5, "starfield", "", false);
            sj.field_j = new mg(2560, 256);
            sj.field_j.b();
            var13.b(0, 0);
            var13.b(1280, 0);
            ca.field_M.a((byte) 29);
            eh.field_l = vc.a(param5, "logo", "", (byte) 114);
            discarded$3 = sn.a(param5, "splash", "", false);
            tk.field_d = ke.a("walk1", "", param5, 32370);
            ic.field_y = ke.a("walk2", "", param5, 32370);
            wh.field_b = ke.a("walk3", "", param5, 32370);
            vb.field_l = new mg(640, 480);
            ib.field_b = b.a("", param5, 7, "frame");
            wf.a(100, mc.field_b, 0, vg.field_H);
            en.field_Kb = 16777215;
            la.field_k = 16777215;
            sf.field_I = 16777215;
            na.field_Hb = 8437759;
            jl.field_E = 16777215;
            ti.field_b = 8437759;
            cb.field_d = ke.a(32, param5, "", "achievements_large");
            mj.field_F = sn.a(param2, "unachieved", "basic", false);
            ad.field_b = sn.a(param2, "orbcoin", "basic", false);
            var8 = cb.field_d.length;
            vd.field_Y = new mg[var8];
            qc.a(123);
            var9_int = -67 / ((param1 - -11) / 58);
            var10 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if ((var8 ^ -1) >= (var10 ^ -1)) {
                    break L3;
                  } else {
                    var11 = new mg(32, 32);
                    var11.b();
                    cb.field_d[var10].b(0, 0, 32, 32);
                    vd.field_Y[var10] = var11;
                    var10++;
                    if (var12 != 0) {
                      break L2;
                    } else {
                      if (var12 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                tn.field_b = new mg(32, 32);
                tn.field_b.b();
                mj.field_F.b(0, 0, 32, 32);
                ul.b((byte) 108);
                kd.field_p = ke.a(32, param5, "", "viewicons");
                discarded$4 = this.b(131586, -9105, 30136);
                discarded$5 = this.b(263172, -9105, 6316128);
                break L2;
              }
              var9 = new mg[2][];
              var9[0] = ke.a(32, param5, "", "turntime_icons");
              var9[1] = ke.a(32, param5, "", "gridwidth_icons");
              nn.a(var9, var9, 2, ra.field_e, m.field_a, param3, param2, true, -27871, wc.field_c, wc.field_c, wf.field_e, wn.field_j, 2, ng.field_T);
              ak.field_e = sn.a(param5, "lobbyicon", "", false);
              fk.a(new vl(param0, param5, 8, 128));
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var7);
            stackOut_9_1 = new StringBuilder().append("Virogrid.KB(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          L5: {
            stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          L6: {
            stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          L7: {
            stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param4 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L7;
            }
          }
          L8: {
            stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param5 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L8;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L8;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
    }

    final static ck b(byte param0, boolean param1) {
        if (param0 != -32) {
            field_O = (co) null;
        }
        ck var2 = new ck(true);
        var2.field_d = param1 ? true : false;
        return var2;
    }

    final void c(boolean param0) {
        this.a(77, 14, 4, 0, 2, 1, false, 121);
        i var3 = new i();
        var3.a(128, 9, !param0 ? true : false);
        pe.a((java.awt.Component) ((Object) fi.field_v), var3, ei.field_c, param0, (byte) -18, 22050);
        this.a(false, true, -118, true, false, false, false);
        jc.field_i[60] = 4;
        jc.field_i[67] = 1;
        jc.field_i[63] = 1;
        jc.field_i[64] = 1;
        jc.field_i[65] = 1;
        jc.field_i[62] = 2;
        jc.field_i[9] = -1;
        jc.field_i[61] = 5;
        jc.field_i[10] = -1;
        jc.field_i[57] = -2;
        jc.field_i[58] = -2;
        jc.field_i[66] = 1;
        db.a((byte) 81, 200);
        this.r(114);
    }

    private final boolean c(byte param0, boolean param1) {
        boolean discarded$3 = false;
        ml discarded$4 = null;
        ml discarded$5 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = field_F ? 1 : 0;
        a.b((byte) 69);
        if (null == pj.field_c) {
          L0: {
            if (param0 == -42) {
              break L0;
            } else {
              this.field_L = (int[]) null;
              break L0;
            }
          }
          if (wm.field_w == null) {
            if (null != g.field_a) {
              al.a(aj.field_l, 13, 90.0f);
              this.b(true);
              this.a(gn.field_G, (byte) -105, ge.field_c, s.field_a, g.field_a, oj.field_Fb);
              s.field_a = null;
              g.field_a = null;
              sb.a(-82);
              return false;
            } else {
              if (null != wn.field_i) {
                al.a(gl.field_i, 13, 95.0f);
                this.b(true);
                this.a(1053, wn.field_i);
                wn.field_i = null;
                sb.a(param0 + -63);
                return false;
              } else {
                if (null != md.field_h) {
                  cg.a(8799, new ii(md.field_h.a("", 100, "huffman")));
                  md.field_h = null;
                  sb.a(param0 + -86);
                  return false;
                } else {
                  pn.a(false);
                  var3 = 0;
                  L1: while (true) {
                    L2: {
                      L3: {
                        if (var3 >= 12) {
                          break L3;
                        } else {
                          al.field_j[var3] = new oi(var3);
                          var3++;
                          if (var4 != 0) {
                            break L2;
                          } else {
                            if (var4 == 0) {
                              continue L1;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      hm.field_c = 10;
                      i.field_y = 10;
                      fh.a((byte) -89);
                      qc.a(50, (byte) 111);
                      bm.c(-111, 50);
                      ei.a(0, oi.field_c[0]);
                      id.field_r = 0;
                      break L2;
                    }
                    return true;
                  }
                }
              }
            }
          } else {
            al.a(mi.field_e, param0 ^ -37, 80.0f);
            this.b(true);
            oi.field_c = new sc[4];
            oi.field_c[0] = sc.a(wm.field_w, "", "ataxx titlescreen");
            oi.field_c[1] = sc.a(wm.field_w, "", "tetralink ingame 1");
            oi.field_c[2] = sc.a(wm.field_w, "", "tetralink ingame 2");
            oi.field_c[3] = sc.a(wm.field_w, "", "tetralink ingame 3");
            var3 = 0;
            L4: while (true) {
              L5: {
                L6: {
                  if ((var3 ^ -1) <= -5) {
                    break L6;
                  } else {
                    discarded$3 = vg.field_B.a(el.field_d, 0, af.field_g, oi.field_c[var3], 0);
                    var3++;
                    if (var4 != 0) {
                      break L5;
                    } else {
                      if (var4 == 0) {
                        continue L4;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                vg.field_B.e(-1);
                af.field_g = null;
                el.field_d = null;
                wm.field_w = null;
                sb.a(-90);
                break L5;
              }
              return false;
            }
          }
        } else {
          L7: {
            if (!ge.field_c.c(0)) {
              break L7;
            } else {
              if (ge.field_c.a((byte) -102, "basic")) {
                L8: {
                  if (!ge.field_c.c(0)) {
                    break L8;
                  } else {
                    if (!ge.field_c.a((byte) -102, "kartika13")) {
                      break L8;
                    } else {
                      L9: {
                        if (!s.field_a.c(0)) {
                          break L9;
                        } else {
                          if (!s.field_a.a((byte) -102, "kartika13")) {
                            break L9;
                          } else {
                            L10: {
                              if (!ge.field_c.c(0)) {
                                break L10;
                              } else {
                                if (ge.field_c.a((byte) -102, "lobby")) {
                                  L11: {
                                    if (!s.field_a.c(0)) {
                                      break L11;
                                    } else {
                                      if (!s.field_a.a((byte) -102, "lobby")) {
                                        break L11;
                                      } else {
                                        L12: {
                                          if (!pj.field_c.c(param0 + 42)) {
                                            break L12;
                                          } else {
                                            if (pj.field_c.b(25867)) {
                                              L13: {
                                                if (!sf.field_O.c(0)) {
                                                  break L13;
                                                } else {
                                                  if (sf.field_O.b(param0 ^ -25891)) {
                                                    L14: {
                                                      if (!el.field_d.c(0)) {
                                                        break L14;
                                                      } else {
                                                        if (!el.field_d.b(25867)) {
                                                          break L14;
                                                        } else {
                                                          L15: {
                                                            if (!wm.field_w.c(param0 + 42)) {
                                                              break L15;
                                                            } else {
                                                              if (wm.field_w.b(param0 + 25909)) {
                                                                L16: {
                                                                  if (!oj.field_Fb.c(0)) {
                                                                    break L16;
                                                                  } else {
                                                                    if (!oj.field_Fb.b(25867)) {
                                                                      break L16;
                                                                    } else {
                                                                      L17: {
                                                                        if (!g.field_a.c(0)) {
                                                                          break L17;
                                                                        } else {
                                                                          if (g.field_a.b(25867)) {
                                                                            L18: {
                                                                              if (!md.field_h.c(param0 ^ -42)) {
                                                                                break L18;
                                                                              } else {
                                                                                if (md.field_h.b(25867)) {
                                                                                  L19: {
                                                                                    if (!wn.field_i.c(0)) {
                                                                                      break L19;
                                                                                    } else {
                                                                                      if (!wn.field_i.b(25867)) {
                                                                                        break L19;
                                                                                      } else {
                                                                                        L20: {
                                                                                          if (!gn.field_G.c(param0 ^ -42)) {
                                                                                            break L20;
                                                                                          } else {
                                                                                            if (gn.field_G.b(param0 + 25909)) {
                                                                                              L21: {
                                                                                                if (!ng.field_T.c(param0 + 42)) {
                                                                                                  break L21;
                                                                                                } else {
                                                                                                  if (!ng.field_T.b(param0 + 25909)) {
                                                                                                    break L21;
                                                                                                  } else {
                                                                                                    al.a(hn.field_u, 13, 78.0f);
                                                                                                    if (param1) {
                                                                                                      ge.b(18887);
                                                                                                      this.b(true);
                                                                                                      af.field_g = new jg(pj.field_c, sf.field_O);
                                                                                                      discarded$4 = af.field_g.a((byte) 86, "", "menu_select");
                                                                                                      of.field_b = af.field_g.a((byte) 112, "", "tetralink_invalid_move");
                                                                                                      tk.field_c = new ml[5];
                                                                                                      td.field_d = new ml[5];
                                                                                                      var3 = 0;
                                                                                                      L22: while (true) {
                                                                                                        L23: {
                                                                                                          L24: {
                                                                                                            if (var3 >= 5) {
                                                                                                              break L24;
                                                                                                            } else {
                                                                                                              tk.field_c[var3] = af.field_g.a((byte) 84, "", "tetralink_drop_piece_" + (var3 + 1));
                                                                                                              td.field_d[var3] = af.field_g.a((byte) 95, "", "tetralink_piece_inplace_" + (1 + var3));
                                                                                                              var3++;
                                                                                                              if (var4 != 0) {
                                                                                                                break L23;
                                                                                                              } else {
                                                                                                                if (var4 == 0) {
                                                                                                                  continue L22;
                                                                                                                } else {
                                                                                                                  break L24;
                                                                                                                }
                                                                                                              }
                                                                                                            }
                                                                                                          }
                                                                                                          qd.field_i = af.field_g.a((byte) 92, "", "tetralink_reset_board");
                                                                                                          bg.field_Lb = af.field_g.a((byte) 119, "", "tetralink_second_tick");
                                                                                                          wc.field_a = af.field_g.a((byte) 96, "", "tetralink_select_column");
                                                                                                          u.field_t = af.field_g.a((byte) 110, "", "tetralink_start_game");
                                                                                                          f.field_j = af.field_g.a((byte) 118, "", "tetralink_winning_line_sound_winner");
                                                                                                          cg.field_d = af.field_g.a((byte) 82, "", "tetralink_winning_line_sound_loser");
                                                                                                          discarded$5 = af.field_g.a((byte) 90, "", "tetralink_title_appear");
                                                                                                          ih.field_d = af.field_g.a((byte) 99, "", "tetralink_dissolve");
                                                                                                          af.field_k = af.field_g.a((byte) 103, "", "tetralink_dissolve_in");
                                                                                                          dj.field_f = new ml[3];
                                                                                                          dj.field_f[0] = af.field_g.a("", 595749988, "tetralink_NASA_chatter_1");
                                                                                                          dj.field_f[1] = af.field_g.a("", 595749988, "tetralink_NASA_chatter_2");
                                                                                                          dj.field_f[2] = af.field_g.a("", 595749988, "tetralink_NASA_chatter_3");
                                                                                                          pj.field_c = null;
                                                                                                          sf.field_O = null;
                                                                                                          sb.a(param0 + 15);
                                                                                                          break L23;
                                                                                                        }
                                                                                                        return false;
                                                                                                      }
                                                                                                    } else {
                                                                                                      return false;
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                              al.a(db.a(ng.field_T, sk.field_b, (byte) -118, gl.field_a), 13, 77.0f);
                                                                                              return false;
                                                                                            } else {
                                                                                              break L20;
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                        al.a(uh.a("", vl.field_m, gn.field_H, param0 + 41, gn.field_G), 13, 75.0f);
                                                                                        return false;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  al.a(uh.a("", pl.field_d, fa.field_m, -1, wn.field_i), 13, 75.0f);
                                                                                  return false;
                                                                                } else {
                                                                                  break L18;
                                                                                }
                                                                              }
                                                                            }
                                                                            al.a(uh.a("", sk.field_b, gl.field_a, -1, md.field_h), 13, 75.0f);
                                                                            return false;
                                                                          } else {
                                                                            break L17;
                                                                          }
                                                                        }
                                                                      }
                                                                      al.a(uh.a("", sb.field_a, aa.field_c, -1, g.field_a), 13, 75.0f);
                                                                      return false;
                                                                    }
                                                                  }
                                                                }
                                                                al.a(uh.a("", sb.field_a, aa.field_c, -1, oj.field_Fb), param0 + 55, 75.0f);
                                                                return false;
                                                              } else {
                                                                break L15;
                                                              }
                                                            }
                                                          }
                                                          al.a(uh.a("", nh.field_r, te.field_g, -1, wm.field_w), 13, 60.0f);
                                                          return false;
                                                        }
                                                      }
                                                    }
                                                    al.a(pe.a(te.field_g, nh.field_r, el.field_d, 0, 0), 13, 45.0f);
                                                    return false;
                                                  } else {
                                                    break L13;
                                                  }
                                                }
                                              }
                                              al.a(uh.a("", ee.field_d, bm.field_n, -1, sf.field_O), 13, 40.0f);
                                              return false;
                                            } else {
                                              break L12;
                                            }
                                          }
                                        }
                                        al.a(uh.a("", ee.field_d, bm.field_n, -1, pj.field_c), param0 + 55, 20.0f);
                                        return false;
                                      }
                                    }
                                  }
                                  al.a(uh.a("lobby", we.field_j, mm.field_d, -1, s.field_a), 13, 17.0f);
                                  return false;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            al.a(uh.a("lobby", sb.field_a, aa.field_c, -1, ge.field_c), 13, 13.0f);
                            return false;
                          }
                        }
                      }
                      al.a(uh.a("roman20", we.field_j, mm.field_d, -1, s.field_a), param0 ^ -37, 12.0f);
                      return false;
                    }
                  }
                }
                al.a(uh.a("kartika13", sb.field_a, aa.field_c, -1, ge.field_c), 13, 11.0f);
                return false;
              } else {
                break L7;
              }
            }
          }
          al.a(uh.a("basic", sb.field_a, aa.field_c, -1, ge.field_c), 13, 10.0f);
          return false;
        }
    }

    public static void u(int param0) {
        field_O = null;
        if (param0 != 240) {
            field_O = (co) null;
        }
    }

    private final void s(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (db.b((byte) 13, 0)) {
            if (!(0 >= hj.field_h)) {
                var2 = id.field_c - hj.field_h;
                var3 = -700;
                var4 = 4 * var2 + -1300;
                var5 = 200;
                if (100 > var2) {
                    var5 = var5 - (var2 + 200);
                    var3 = -20000 + var3 + var2 * 200;
                }
                var6 = -2048;
                var7 = id.a(var6, 32);
                var8 = nf.a(21855, var6);
                ae.field_e = new int[]{var3, var5, var4, var8, 0, -var7, 0, 65536, 0, var7, 0, var8};
                ri.field_a.a(pe.field_j, ae.field_e);
                ri.field_a.c();
            }
        }
        if (param0 != -1933) {
            this.field_D = (int[]) null;
        }
    }

    private final void f(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int[] var3_ref_int__ = null;
        fl var3_ref_fl = null;
        int var4 = 0;
        pm var4_ref_pm = null;
        int[] var5_ref_int__ = null;
        int var5 = 0;
        int var6 = 0;
        int[] var6_ref_int__ = null;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var25 = null;
        int[] var28 = null;
        int[] var29 = null;
        int stackIn_43_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_65_1 = 0;
        int stackIn_70_0 = 0;
        int stackIn_70_1 = 0;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_64_1 = 0;
        int stackOut_69_0 = 0;
        int stackOut_69_1 = 0;
        L0: {
          L1: {
            L2: {
              var8 = field_F ? 1 : 0;
              var2 = 1;
              if ((hm.field_c ^ -1) != (i.field_y ^ -1)) {
                break L2;
              } else {
                if (nf.field_g == pg.field_g) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (i.field_y != -2) {
                break L3;
              } else {
                L4: {
                  if (we.field_l < 16) {
                    break L4;
                  } else {
                    dj.a(pg.field_g, false, -1, 3, hm.field_c);
                    if (var8 == 0) {
                      break L0;
                    } else {
                      break L4;
                    }
                  }
                }
                var2 = 0;
                ej.a(false, 25680);
                if (var8 == 0) {
                  break L0;
                } else {
                  break L3;
                }
              }
            }
            L5: {
              if (1 == (hm.field_c ^ -1)) {
                break L5;
              } else {
                L6: {
                  if (we.field_l < 16) {
                    break L6;
                  } else {
                    dj.a(pg.field_g, false, 33 + -we.field_l, 3, hm.field_c);
                    if (var8 == 0) {
                      break L0;
                    } else {
                      break L6;
                    }
                  }
                }
                dj.a(nf.field_g, false, 1 + we.field_l, 3, i.field_y);
                if (var8 == 0) {
                  break L0;
                } else {
                  break L5;
                }
              }
            }
            L7: {
              if ((we.field_l ^ -1) > -17) {
                break L7;
              } else {
                var2 = 0;
                ej.a(false, 25680);
                if (var8 == 0) {
                  break L0;
                } else {
                  break L7;
                }
              }
            }
            dj.a(nf.field_g, false, -1, 3, i.field_y);
            if (var8 == 0) {
              break L0;
            } else {
              break L1;
            }
          }
          L8: {
            if (1 == (i.field_y ^ -1)) {
              break L8;
            } else {
              dj.a(nf.field_g, true, -1, 3, i.field_y);
              if (var8 == 0) {
                break L0;
              } else {
                break L8;
              }
            }
          }
          ej.a(false, 25680);
          var2 = 0;
          break L0;
        }
        L9: {
          L10: {
            if (var2 == 0) {
              break L10;
            } else {
              L11: {
                L12: {
                  if (null == ci.field_s) {
                    break L12;
                  } else {
                    if (sj.field_o != cc.field_x) {
                      break L12;
                    } else {
                      break L11;
                    }
                  }
                }
                cc.field_x = sj.field_o;
                lj.field_r = sg.field_i;
                cf.field_c = sj.field_o;
                vm.field_d[0] = (double)lj.field_r * Math.sin((double)cf.field_c);
                vm.field_d[2] = (double)lj.field_r * Math.cos((double)cf.field_c);
                gb.c((byte) -44);
                ci.field_s = new mg(640, 480);
                pj.a(ci.field_s, 256);
                df.b(0, 0, 640, 480, 3158064);
                var3 = j.field_b;
                var4 = tm.field_g;
                jm.a(320, 240, -2);
                var19 = new int[12];
                var12 = var19;
                var5_ref_int__ = var12;
                var6 = 0;
                L13: while (true) {
                  L14: {
                    L15: {
                      if ((var6 ^ -1) <= -4) {
                        break L15;
                      } else {
                        var5_ref_int__[var6] = pe.field_j[var6] << -412966013;
                        var6++;
                        if (var8 != 0) {
                          break L14;
                        } else {
                          if (var8 == 0) {
                            continue L13;
                          } else {
                            break L15;
                          }
                        }
                      }
                    }
                    var6 = 3;
                    break L14;
                  }
                  L16: while (true) {
                    L17: {
                      L18: {
                        if ((var19.length ^ -1) >= (var6 ^ -1)) {
                          break L18;
                        } else {
                          var5_ref_int__[var6] = pe.field_j[var6];
                          var6++;
                          if (var8 != 0) {
                            break L17;
                          } else {
                            if (var8 == 0) {
                              continue L16;
                            } else {
                              break L18;
                            }
                          }
                        }
                      }
                      this.e((byte) -62);
                      kg.field_c.a(pe.field_j, bi.field_c);
                      nb.field_x.a(pe.field_j, bi.field_c);
                      kf.field_c.a(pe.field_j, bi.field_c);
                      cm.field_k.a(pe.field_j, bi.field_c);
                      ba.field_c.a(pe.field_j, bi.field_c);
                      wf.field_j.a(pe.field_j, bi.field_c);
                      th.field_y.a(var19, bi.field_c);
                      pj.field_a.a(var19, bi.field_c);
                      qg.field_h.a(var19, bi.field_c);
                      jg.field_i.a(var19, bi.field_c);
                      ee.field_a.a(var19, bi.field_c);
                      og.field_l.a(var19, bi.field_c);
                      ab.field_L.a(var19, bi.field_c);
                      rc.field_o.a(var19, bi.field_c);
                      hn.field_x.a(var19, bi.field_c);
                      td.field_i.a(var19, bi.field_c);
                      ul.b((byte) 109);
                      break L17;
                    }
                    jm.a(var3, var4, -2);
                    break L11;
                  }
                }
              }
              L19: {
                ci.field_s.b(0, tm.field_g + -240);
                if (!ke.field_p.field_m) {
                  break L19;
                } else {
                  L20: {
                    var3 = id.field_r % 64;
                    if (-33 >= (var3 ^ -1)) {
                      stackOut_42_0 = 48 - var3;
                      stackIn_43_0 = stackOut_42_0;
                      break L20;
                    } else {
                      stackOut_41_0 = var3 + -16;
                      stackIn_43_0 = stackOut_41_0;
                      break L20;
                    }
                  }
                  var3 = stackIn_43_0;
                  var3 = var3 << 2;
                  var21 = new int[3];
                  var14 = var21;
                  var9 = var14;
                  var28 = var9;
                  var20 = new int[3];
                  var13 = var20;
                  var10 = var13;
                  var29 = var10;
                  var22 = new int[3];
                  var15 = var22;
                  var6_ref_int__ = var15;
                  var9[0] = (int)ao.field_Hb;
                  var20[0] = 50;
                  var9[1] = -(int)ao.field_Hb;
                  var6_ref_int__[0] = (var3 >> -498345404) + 128;
                  var20[1] = 50;
                  var21[2] = 0;
                  var6_ref_int__[1] = (var3 >> 903526148) + 128;
                  var20[2] = 80;
                  var22[2] = 128;
                  var7 = si.a(8437759);
                  qf.a(240, 0, 0, var28, var29, var22, var7, var7, var7);
                  var3 = var21[0];
                  var9[0] = var21[1];
                  var21[1] = var3;
                  var3 = var20[0];
                  var10[0] = var20[1];
                  var20[1] = var3;
                  var3 = var22[0];
                  var6_ref_int__[0] = var22[1];
                  var22[1] = var3;
                  qf.a(240, 0, 0, var28, var29, var22, var7, var7, var7);
                  break L19;
                }
              }
              L21: {
                if (ke.field_p.field_d) {
                  L22: {
                    L23: {
                      var25 = c.field_d.field_B;
                      var18 = var25;
                      var11 = var18;
                      var3_ref_int__ = var11;
                      if (-1 <= (co.field_h ^ -1)) {
                        break L23;
                      } else {
                        var6 = 256000;
                        L24: while (true) {
                          if (-1 <= (var6 ^ -1)) {
                            break L23;
                          } else {
                            var6--;
                            var4 = 16711935 & var25[var6];
                            var5 = 65280 & var25[var6];
                            var4 = var4 * (256 + -co.field_h);
                            var4 = var4 & -16711936;
                            var5 = var5 * (256 - co.field_h);
                            var5 = var5 & 16711680;
                            var4 = var4 + (co.field_h * 16711935 & -16711936);
                            var5 = var5 + (16711680 & co.field_h * 65280);
                            var11[var6] = oh.a(var5, var4) >>> -307183480;
                            if (var8 != 0) {
                              break L22;
                            } else {
                              if (var8 == 0) {
                                continue L24;
                              } else {
                                break L23;
                              }
                            }
                          }
                        }
                      }
                    }
                    pj.a(c.field_d, 256);
                    break L22;
                  }
                  var4_ref_pm = (pm) ((Object) gd.field_n.a((byte) -107));
                  L25: while (true) {
                    L26: {
                      L27: {
                        if (var4_ref_pm == null) {
                          break L27;
                        } else {
                          rk.a(var4_ref_pm.field_m, var4_ref_pm.field_h, var4_ref_pm.field_r << -949217277, 10000);
                          var4_ref_pm = (pm) ((Object) gd.field_n.a(16213));
                          if (var8 != 0) {
                            break L26;
                          } else {
                            if (var8 == 0) {
                              continue L25;
                            } else {
                              break L27;
                            }
                          }
                        }
                      }
                      ul.b((byte) 86);
                      c.field_d.d(j.field_b + -(c.field_d.field_w >> -520710623), -(c.field_d.field_p >> -80635967) + tm.field_g);
                      break L26;
                    }
                    if ((ke.field_p.field_f ^ -1) < -1) {
                      rk.a(j.field_b - (c.field_d.field_w >> 1175213633), tm.field_g - (c.field_d.field_p >> -1532224799), (c.field_d.field_w >> 754109761) + j.field_b, -(c.field_d.field_p >> -1055677983) + tm.field_g, 40, ke.field_p.field_f, pj.field_d);
                      rk.a((c.field_d.field_w >> 1488812609) + j.field_b, -(c.field_d.field_p >> -1740488575) + tm.field_g, (c.field_d.field_w >> 878374113) + j.field_b, tm.field_g + (c.field_d.field_p >> -709682687), 40, ke.field_p.field_f, pj.field_d);
                      rk.a((c.field_d.field_w >> -524379871) + j.field_b, tm.field_g + (c.field_d.field_p >> -1496783103), -(c.field_d.field_w >> -798391391) + j.field_b, tm.field_g - -(c.field_d.field_p >> 1947554369), 40, ke.field_p.field_f, pj.field_d);
                      rk.a(j.field_b + -(c.field_d.field_w >> -1295443103), tm.field_g - -(c.field_d.field_p >> -1354931231), j.field_b - (c.field_d.field_w >> -1365650591), tm.field_g - (c.field_d.field_p >> -1493913631), 40, ke.field_p.field_f, pj.field_d);
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                } else {
                  break L21;
                }
              }
              var3_ref_fl = (fl) ((Object) sh.field_tb.a((byte) -108));
              L28: while (true) {
                if (var3_ref_fl == null) {
                  break L10;
                } else {
                  var4 = var3_ref_fl.field_n >> 1113140140;
                  var6 = 512 + (var3_ref_fl.field_m >> -2081407860);
                  var5 = var3_ref_fl.field_p >> 926962540;
                  stackOut_64_0 = -1;
                  stackOut_64_1 = var6 ^ -1;
                  stackIn_70_0 = stackOut_64_0;
                  stackIn_70_1 = stackOut_64_1;
                  stackIn_65_0 = stackOut_64_0;
                  stackIn_65_1 = stackOut_64_1;
                  if (var8 != 0) {
                    break L9;
                  } else {
                    L29: {
                      if (stackIn_65_0 > stackIn_65_1) {
                        df.a((var4 << 872440237) / var6 + (j.field_b << 709710660), (tm.field_g << -1694155324) + (var5 << 2046275885) / var6, 65536 / var6, var3_ref_fl.field_o * 5 / 3, pj.field_d);
                        break L29;
                      } else {
                        break L29;
                      }
                    }
                    var3_ref_fl = (fl) ((Object) sh.field_tb.a(16213));
                    if (var8 == 0) {
                      continue L28;
                    } else {
                      break L10;
                    }
                  }
                }
              }
            }
          }
          stackOut_69_0 = 14;
          stackOut_69_1 = (param0 - -76) / 33;
          stackIn_70_0 = stackOut_69_0;
          stackIn_70_1 = stackOut_69_1;
          break L9;
        }
        var3 = stackIn_70_0 / stackIn_70_1;
    }

    final void b(boolean param0) {
        Object var2 = null;
        ic var3 = null;
        int var4 = 0;
        hj var4_ref_hj = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        Object stackIn_3_0 = null;
        ic stackIn_17_0 = null;
        int stackIn_52_0 = 0;
        int stackIn_56_0 = 0;
        java.awt.Canvas stackOut_2_0 = null;
        h stackOut_1_0 = null;
        ic stackOut_16_0 = null;
        ic stackOut_15_0 = null;
        int stackOut_51_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_54_0 = 0;
        L0: {
          var7 = field_F ? 1 : 0;
          if (null == ih.field_b) {
            stackOut_2_0 = fi.field_v;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = ih.field_b;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var8 = stackIn_3_0;
        var2 = var8;
        if (!j.a(-1)) {
          if (i.field_H) {
            if (!jm.a((byte) -85)) {
              al.a(sk.field_b, 13, 100.0f);
              uh.a((byte) 83, (java.awt.Canvas) (var8));
              return;
            } else {
              L1: {
                L2: {
                  if (!ke.field_p.field_g) {
                    break L2;
                  } else {
                    this.e(true);
                    if (var7 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                this.f((byte) 54);
                break L1;
              }
              L3: {
                if (null != vg.field_I) {
                  stackOut_16_0 = vg.field_I;
                  stackIn_17_0 = stackOut_16_0;
                  break L3;
                } else {
                  stackOut_15_0 = ei.field_b;
                  stackIn_17_0 = stackOut_15_0;
                  break L3;
                }
              }
              L4: {
                L5: {
                  var3 = stackIn_17_0;
                  if (var3 != null) {
                    break L5;
                  } else {
                    fa.a(-30265);
                    if (var7 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                var3.c(-16, true);
                fa.a(-30265);
                if (!ok.field_J) {
                  break L4;
                } else {
                  if (vm.field_e) {
                    ok.b(f.b(-844), 3410);
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
              L6: {
                L7: {
                  if ((hm.field_c ^ -1) != (i.field_y ^ -1)) {
                    break L7;
                  } else {
                    if (pg.field_g == nf.field_g) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                L8: {
                  if (-2 == i.field_y) {
                    break L8;
                  } else {
                    if (-2 != hm.field_c) {
                      break L6;
                    } else {
                      break L8;
                    }
                  }
                }
                if (we.field_l < 16) {
                  break L6;
                } else {
                  break L6;
                }
              }
              L9: {
                L10: {
                  if (!ok.field_J) {
                    break L10;
                  } else {
                    if (vm.field_e) {
                      break L9;
                    } else {
                      break L10;
                    }
                  }
                }
                ok.b(f.b(-844), 3410);
                break L9;
              }
              L11: {
                L12: {
                  if (ug.a(param0)) {
                    break L12;
                  } else {
                    L13: {
                      if (ak.b(-31609)) {
                        break L13;
                      } else {
                        L14: {
                          if (!eg.a((byte) 47)) {
                            break L14;
                          } else {
                            var4 = 24 + rh.a(-16118);
                            var5 = pg.a(true) - -26;
                            dg.b(var5, -125, var4);
                            fm.a(false);
                            if (var7 == 0) {
                              break L11;
                            } else {
                              break L14;
                            }
                          }
                        }
                        if (this.field_I.b((byte) 64)) {
                          break L11;
                        } else {
                          L15: {
                            L16: {
                              var4_ref_hj = (hj) ((Object) this.field_I.a((byte) -103));
                              var6 = this.field_A;
                              if (-81 < (var6 ^ -1)) {
                                break L16;
                              } else {
                                L17: {
                                  if (-231 >= (var6 ^ -1)) {
                                    break L17;
                                  } else {
                                    var5 = 8;
                                    if (var7 == 0) {
                                      break L15;
                                    } else {
                                      break L17;
                                    }
                                  }
                                }
                                var5 = 123 - var6 / 2;
                                if (var7 == 0) {
                                  break L15;
                                } else {
                                  break L16;
                                }
                              }
                            }
                            var5 = -32 + var6 / 2;
                            break L15;
                          }
                          vd.field_Y[var4_ref_hj.field_i].d(8, var5);
                          hd.field_b.b(qk.field_d[var4_ref_hj.field_i], 48, hd.field_b.field_H + var5, 8437759, -1);
                          if (var7 == 0) {
                            break L11;
                          } else {
                            break L13;
                          }
                        }
                      }
                    }
                    L18: {
                      L19: {
                        if (ih.field_b != null) {
                          break L19;
                        } else {
                          if (!fe.field_Gb) {
                            stackOut_51_0 = 0;
                            stackIn_52_0 = stackOut_51_0;
                            break L18;
                          } else {
                            break L19;
                          }
                        }
                      }
                      stackOut_50_0 = 1;
                      stackIn_52_0 = stackOut_50_0;
                      break L18;
                    }
                    fd.a(stackIn_52_0 != 0, -20248);
                    if (var7 == 0) {
                      break L11;
                    } else {
                      break L12;
                    }
                  }
                }
                L20: {
                  df.g(0, 0, df.field_e, df.field_f);
                  if (param0) {
                    stackOut_55_0 = 0;
                    stackIn_56_0 = stackOut_55_0;
                    break L20;
                  } else {
                    stackOut_54_0 = 1;
                    stackIn_56_0 = stackOut_54_0;
                    break L20;
                  }
                }
                var4 = ma.a(stackIn_56_0 != 0) - -24;
                var5 = Virogrid.q(-80) + 26;
                dg.b(var5, -124, var4);
                qi.b(-5205);
                break L11;
              }
              L21: {
                if (tg.field_x == 0) {
                  break L21;
                } else {
                  ij.a(-119, (16 - wa.field_K) * 256 / 16);
                  break L21;
                }
              }
              L22: {
                if (-3 >= (hd.field_d ^ -1)) {
                  hd.field_b.b(Integer.toString(mj.field_E), 4, 24, 16777215, -1);
                  break L22;
                } else {
                  break L22;
                }
              }
              td.a(-30179, (java.awt.Canvas) (var8), 0, 0);
              return;
            }
          } else {
            uh.a((byte) 46, (java.awt.Canvas) (var8));
            return;
          }
        } else {
          cm.a((java.awt.Canvas) (var8), (byte) -47, mi.a((byte) -121));
          return;
        }
    }

    private final static int q(int param0) {
        int var1 = -13 / ((param0 - -32) / 40);
        return sg.field_n;
    }

    private final void a(int param0, eh param1) {
        RuntimeException var3 = null;
        qb var4 = null;
        qb var5 = null;
        qb var6 = null;
        qb var7 = null;
        qb var8 = null;
        qb var9 = null;
        qb var10 = null;
        qb var11 = null;
        qb var12 = null;
        qb var13 = null;
        qb var14 = null;
        qb var15 = null;
        qb var16 = null;
        qb var17 = null;
        qb var18 = null;
        qb var19 = null;
        qb var20 = null;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        qb var26 = null;
        qb var27 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            fk.a(1.0f);
            fk.a();
            if (param0 == 1053) {
              L1: {
                var27 = qb.a(param1, "", "scenery_walls");
                var4 = qb.a(param1, "", "scenery_walls2");
                var5 = qb.a(param1, "", "scenery_game-table");
                var6 = qb.a(param1, "", "scenery_floor");
                var7 = qb.a(param1, "", "scenery_props1");
                var8 = qb.a(param1, "", "scenery_props2");
                var9 = qb.a(param1, "", "scenery_ceiling");
                var10 = qb.a(param1, "", "scenery_door");
                var11 = qb.a(param1, "", "scenery_game-screen_back");
                var12 = qb.a(param1, "", "scenery_game-screen_front");
                var13 = qb.a(param1, "", "scenery_game-screen_front-left");
                var14 = qb.a(param1, "", "scenery_game-screen_back-left");
                var15 = qb.a(param1, "", "scenery_game-screen_back-top");
                var16 = qb.a(param1, "", "scenery_game-screen_front-right");
                var17 = qb.a(param1, "", "scenery_game-screen_back-right");
                var18 = qb.a(param1, "", "scenery_game-screen_front-top");
                var19 = qb.a(param1, "", "scenery_game-screen_front-black");
                var20 = qb.a(param1, "", "scenery_game-screen_back-black");
                this.a(var11, (byte) 69);
                this.a(var12, (byte) 69);
                this.a(var13, (byte) 69);
                this.a(var14, (byte) 69);
                this.a(var16, (byte) 69);
                this.a(var17, (byte) 69);
                this.a(var15, (byte) 69);
                this.a(var18, (byte) 69);
                this.a(var19, (byte) 69);
                this.a(var20, (byte) 69);
                this.field_J = this.a((byte) 124, var11);
                this.field_K = this.a((byte) 118, var12);
                this.field_D = this.a((byte) 94, var13);
                this.field_B = this.a((byte) 116, var16);
                this.field_C = this.a((byte) 74, var18);
                this.field_L = this.a((byte) 116, var19);
                this.field_M = this.a((byte) 64, var14);
                this.field_G = this.a((byte) 69, var17);
                this.field_H = this.a((byte) 107, var15);
                this.field_N = this.a((byte) 69, var20);
                var21 = 96;
                var22 = 2260;
                var23 = 0;
                var24 = 256;
                var25 = 0;
                if (db.b((byte) 13, 0)) {
                  var26 = qb.a(param1, "", "ghost_untextured");
                  ri.field_a = (il) ((Object) var26.a(var21, var22, var23, var24, var25));
                  var23 = 64;
                  var21 = 42;
                  break L1;
                } else {
                  break L1;
                }
              }
              kf.field_c = (il) ((Object) var27.a(var21, var22, var23, var24, var25));
              cm.field_k = (il) ((Object) var4.a(var21, var22, var23, var24, var25));
              fl.field_s = (il) ((Object) var5.a(var21, var22, var23, var24, var25));
              nb.field_x = (il) ((Object) var6.a(var21, var22, var23, var24, var25));
              ba.field_c = (il) ((Object) var7.a(var21, var22, var23, var24, var25));
              wf.field_j = (il) ((Object) var8.a(var21, var22, var23, var24, var25));
              kg.field_c = (il) ((Object) var9.a(var21, var22, var23, var24, var25));
              lk.field_Qb = (il) ((Object) var10.a(var21, var22, var23, var24, var25));
              var13.d();
              var14.d();
              var14.a(var13, 0, 0, 0, false);
              var16.d();
              var17.d();
              var17.a(var16, 0, 0, 0, false);
              th.field_y = (il) ((Object) var11.a(var21, var22, var23, var24, var25));
              ee.field_a = (il) ((Object) var12.a(var21, var22, var23, var24, var25));
              qg.field_h = (il) ((Object) var14.a(var21, var22, var23, var24, var25));
              jg.field_i = (il) ((Object) var17.a(var21, var22, var23, var24, var25));
              pj.field_a = (il) ((Object) var15.a(var21, var22, var23, var24, var25));
              ab.field_L = (il) ((Object) var13.a(var21, var22, var23, var24, var25));
              rc.field_o = (il) ((Object) var16.a(var21, var22, var23, var24, var25));
              og.field_l = (il) ((Object) var18.a(var21, var22, var23, var24, var25));
              hn.field_x = (il) ((Object) var20.a(var21, var22, var23, var24, var25));
              td.field_i = (il) ((Object) var19.a(var21, var22, var23, var24, var25));
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3);
            stackOut_7_1 = new StringBuilder().append("Virogrid.GB(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void c(int param0) {
        int discarded$4 = 0;
        boolean discarded$5 = false;
        pe discarded$6 = null;
        int discarded$7 = 0;
        int var2 = 0;
        Object var2_ref = null;
        int var3 = 0;
        int var4_int = 0;
        Object var4 = null;
        String[] var5_ref_String__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        ic var7_ref_ic = null;
        String var8 = null;
        String var9 = null;
        int var9_int = 0;
        int var11 = 0;
        String var12 = null;
        String var13 = null;
        String var14 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_42_0 = null;
        Object stackIn_43_0 = null;
        Object stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        int stackIn_62_0 = 0;
        int stackIn_62_1 = 0;
        double stackIn_77_0 = 0.0;
        int stackIn_91_0 = 0;
        String[] stackIn_104_0 = null;
        String[] stackIn_104_1 = null;
        int stackIn_104_2 = 0;
        String[] stackIn_105_0 = null;
        String[] stackIn_105_1 = null;
        int stackIn_105_2 = 0;
        String[] stackIn_106_0 = null;
        String[] stackIn_106_1 = null;
        int stackIn_106_2 = 0;
        String stackIn_106_3 = null;
        int stackIn_152_0 = 0;
        int stackIn_152_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_41_0 = null;
        Object stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        Object stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        int stackOut_61_0 = 0;
        int stackOut_61_1 = 0;
        double stackOut_76_0 = 0.0;
        double stackOut_75_0 = 0.0;
        int stackOut_90_0 = 0;
        int stackOut_89_0 = 0;
        String[] stackOut_103_0 = null;
        String[] stackOut_103_1 = null;
        int stackOut_103_2 = 0;
        String[] stackOut_105_0 = null;
        String[] stackOut_105_1 = null;
        int stackOut_105_2 = 0;
        String stackOut_105_3 = null;
        String[] stackOut_104_0 = null;
        String[] stackOut_104_1 = null;
        int stackOut_104_2 = 0;
        String stackOut_104_3 = null;
        int stackOut_151_0 = 0;
        int stackOut_151_1 = 0;
        L0: {
          var11 = field_F ? 1 : 0;
          discarded$4 = lj.c(param0 ^ -28791807);
          tl.field_l = km.e(param0 ^ -125);
          kh.a(false);
          if (null == ih.field_b) {
            break L0;
          } else {
            if (!ih.field_b.field_a) {
              break L0;
            } else {
              am.a((byte) -16);
              qc.b((byte) -12);
              break L0;
            }
          }
        }
        L1: {
          stackOut_3_0 = this;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (ih.field_b == null) {
            stackOut_5_0 = this;
            stackOut_5_1 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L1;
          } else {
            stackOut_4_0 = this;
            stackOut_4_1 = 1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            break L1;
          }
        }
        L2: {
          this.a(stackIn_6_1 != 0, 121);
          if (!i.field_w) {
            break L2;
          } else {
            this.t(param0 ^ 13);
            i.field_w = false;
            break L2;
          }
        }
        L3: {
          id.field_r = id.field_r + 1;
          if (id.field_r != 500) {
            break L3;
          } else {
            if (10 != hm.field_c) {
              break L3;
            } else {
              el.a(12229, false);
              break L3;
            }
          }
        }
        L4: {
          if (!j.a(-1)) {
            break L4;
          } else {
            this.m(1);
            if (!j.a(-1)) {
              break L4;
            } else {
              if (!me.b(66)) {
                return;
              } else {
                discarded$5 = this.c((byte) -42, false);
                return;
              }
            }
          }
        }
        L5: {
          L6: {
            L7: {
              if (!i.field_H) {
                break L7;
              } else {
                L8: {
                  if (!jm.a((byte) 118)) {
                    break L8;
                  } else {
                    L9: {
                      if (!ug.a(true)) {
                        break L9;
                      } else {
                        L10: {
                          L11: {
                            if ((tg.field_x ^ -1) == -1) {
                              break L11;
                            } else {
                              this.a(false, false);
                              if (var11 == 0) {
                                break L10;
                              } else {
                                break L11;
                              }
                            }
                          }
                          L12: {
                            L13: {
                              var2 = ca.a(2);
                              if (-3 == (var2 ^ -1)) {
                                break L13;
                              } else {
                                L14: {
                                  if (var2 == 3) {
                                    break L14;
                                  } else {
                                    if (-5 == (var2 ^ -1)) {
                                      a.field_D = true;
                                      gn.a((byte) 53, jc.field_j, 0);
                                      if (var11 == 0) {
                                        break L12;
                                      } else {
                                        break L14;
                                      }
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                                a.field_D = false;
                                ic.a(ib.field_b, hd.field_b.field_A, 320, ib.field_b, 8, mc.field_b, 2, hd.field_b.field_A + hd.field_b.field_G, 8, -16824, true, 240);
                                if (var11 == 0) {
                                  break L12;
                                } else {
                                  break L13;
                                }
                              }
                            }
                            am.a((byte) -16);
                            break L12;
                          }
                          this.a(false, true);
                          if (var11 == 0) {
                            break L10;
                          } else {
                            break L9;
                          }
                        }
                        break L5;
                      }
                    }
                    L15: {
                      L16: {
                        if (ak.b(-31609)) {
                          break L16;
                        } else {
                          L17: {
                            L18: {
                              if (eg.a((byte) 47)) {
                                break L18;
                              } else {
                                this.a(false, false);
                                if (var11 == 0) {
                                  break L17;
                                } else {
                                  break L18;
                                }
                              }
                            }
                            L19: {
                              if ((tg.field_x ^ -1) == -1) {
                                break L19;
                              } else {
                                this.a(false, false);
                                if (var11 == 0) {
                                  break L17;
                                } else {
                                  break L19;
                                }
                              }
                            }
                            L20: {
                              var2 = d.f((byte) 57);
                              if (1 == var2) {
                                bj.field_n = true;
                                gn.a((byte) -56, qe.field_l, 0);
                                break L20;
                              } else {
                                break L20;
                              }
                            }
                            this.a(false, true);
                            if (var11 == 0) {
                              break L15;
                            } else {
                              break L16;
                            }
                          }
                          break L5;
                        }
                      }
                      L21: {
                        stackOut_41_0 = this;
                        stackIn_43_0 = stackOut_41_0;
                        stackIn_42_0 = stackOut_41_0;
                        if (ih.field_b == null) {
                          stackOut_43_0 = this;
                          stackOut_43_1 = 0;
                          stackIn_44_0 = stackOut_43_0;
                          stackIn_44_1 = stackOut_43_1;
                          break L21;
                        } else {
                          stackOut_42_0 = this;
                          stackOut_42_1 = 1;
                          stackIn_44_0 = stackOut_42_0;
                          stackIn_44_1 = stackOut_42_1;
                          break L21;
                        }
                      }
                      L22: {
                        L23: {
                          var2 = this.c(stackIn_44_1 != 0, -120);
                          if (1 == var2) {
                            break L23;
                          } else {
                            if ((var2 ^ -1) != -3) {
                              break L22;
                            } else {
                              break L23;
                            }
                          }
                        }
                        L24: {
                          if (null == ih.field_b) {
                            break L24;
                          } else {
                            am.a((byte) -16);
                            break L24;
                          }
                        }
                        if (var2 != 2) {
                          break L22;
                        } else {
                          ha.a((byte) 39, (java.applet.Applet) (this));
                          break L22;
                        }
                      }
                      this.a(false, true);
                      if (var11 == 0) {
                        break L15;
                      } else {
                        break L8;
                      }
                    }
                    break L5;
                  }
                }
                ee.b(false);
                if (var11 == 0) {
                  break L6;
                } else {
                  break L7;
                }
              }
            }
            jb.a(og.field_b, param0 + 45);
            if (!this.c((byte) -42, true)) {
              break L6;
            } else {
              i.field_H = true;
              break L5;
            }
          }
          break L5;
        }
        L25: while (true) {
          L26: {
            L27: {
              if (!kd.a(-122, jc.field_i)) {
                break L27;
              } else {
                stackOut_61_0 = 9;
                stackOut_61_1 = ci.field_q;
                stackIn_152_0 = stackOut_61_0;
                stackIn_152_1 = stackOut_61_1;
                stackIn_62_0 = stackOut_61_0;
                stackIn_62_1 = stackOut_61_1;
                if (var11 != 0) {
                  break L26;
                } else {
                  L28: {
                    if (stackIn_62_0 == stackIn_62_1) {
                      wm.c((byte) -86);
                      jk.field_c = 2;
                      ec.field_z = 3.1415927410125732f;
                      hm.field_c = 9;
                      qe.field_k = false;
                      em.field_c = 128.0f;
                      kn.field_J = sh.field_qb.h(-117);
                      if (var11 == 0) {
                        continue L25;
                      } else {
                        break L28;
                      }
                    } else {
                      break L28;
                    }
                  }
                  L29: {
                    if (-15 == (ci.field_q ^ -1)) {
                      discarded$6 = vm.a((byte) 30, ih.field_d);
                      wm.c((byte) -86);
                      jj.a(ra.a(8742, 2), ci.j(param0 + -126), ra.field_e, 8, eg.d(1048576), 1024, 150, ra.a(8742, 2000), wn.field_j.length, ri.b((byte) 51));
                      dl.a(bf.a((byte) -96), (byte) -127, fa.c(16777215));
                      hm.field_c = -2;
                      qe.field_k = false;
                      aj.field_a = true;
                      if (var11 == 0) {
                        continue L25;
                      } else {
                        break L29;
                      }
                    } else {
                      break L29;
                    }
                  }
                  L30: {
                    if (ci.field_q == 15) {
                      L31: {
                        if (aj.field_a) {
                          L32: {
                            L33: {
                              wm.c((byte) -86);
                              wm.b(param0 ^ 2);
                              fn.a((byte) -69);
                              hm.field_c = 0;
                              th.field_q = true;
                              mn.field_e = true;
                              vm.field_e = false;
                              dd.field_a = false;
                              aj.field_a = false;
                              on.field_d = false;
                              jm.a(320, 240, param0 ^ -2);
                              if (null == vg.field_I) {
                                break L33;
                              } else {
                                if (1 == vg.field_I.field_e) {
                                  stackOut_76_0 = 0.0;
                                  stackIn_77_0 = stackOut_76_0;
                                  break L32;
                                } else {
                                  break L33;
                                }
                              }
                            }
                            stackOut_75_0 = 3.141592653589793;
                            stackIn_77_0 = stackOut_75_0;
                            break L32;
                          }
                          sj.field_o = (float)stackIn_77_0;
                          el.a(false, (byte) -106);
                          vm.field_d[0] = (double)lj.field_r * Math.sin((double)cf.field_c);
                          vm.field_d[2] = (double)lj.field_r * Math.cos((double)cf.field_c);
                          ka.a(true, (byte) 87);
                          gb.c((byte) -44);
                          break L31;
                        } else {
                          break L31;
                        }
                      }
                      eh.field_e = false;
                      qe.field_k = false;
                      if (var11 == 0) {
                        continue L25;
                      } else {
                        break L30;
                      }
                    } else {
                      break L30;
                    }
                  }
                  L34: {
                    if ((ci.field_q ^ -1) != -11) {
                      break L34;
                    } else {
                      if (!aj.field_a) {
                        break L34;
                      } else {
                        bj.a(-51);
                        if (var11 == 0) {
                          continue L25;
                        } else {
                          break L34;
                        }
                      }
                    }
                  }
                  L35: {
                    if (67 != ci.field_q) {
                      break L35;
                    } else {
                      var2 = sh.field_qb.g(11132);
                      var3 = 1 << var2;
                      rn.field_c = rn.field_c | var3;
                      this.field_I.a(new hj(var2), (byte) -61);
                      if (var11 == 0) {
                        continue L25;
                      } else {
                        break L35;
                      }
                    }
                  }
                  L36: {
                    L37: {
                      if (ci.field_q == 57) {
                        break L37;
                      } else {
                        if (ci.field_q == 58) {
                          break L37;
                        } else {
                          break L36;
                        }
                      }
                    }
                    L38: {
                      wm.c((byte) -86);
                      var2 = sh.field_qb.g(11132);
                      var3 = sh.field_qb.g(11132);
                      if ((sh.field_qb.g(11132) ^ -1) == -1) {
                        stackOut_90_0 = 0;
                        stackIn_91_0 = stackOut_90_0;
                        break L38;
                      } else {
                        stackOut_89_0 = 1;
                        stackIn_91_0 = stackOut_89_0;
                        break L38;
                      }
                    }
                    var4_int = stackIn_91_0;
                    var5_ref_String__ = new String[2];
                    var7 = 0;
                    L39: while (true) {
                      L40: {
                        if ((var5_ref_String__.length ^ -1) >= (var7 ^ -1)) {
                          break L40;
                        } else {
                          var5_ref_String__[var7] = sh.field_qb.i(15070);
                          var7++;
                          if (var11 != 0) {
                            continue L25;
                          } else {
                            if (var11 == 0) {
                              continue L39;
                            } else {
                              break L40;
                            }
                          }
                        }
                      }
                      L41: {
                        L42: {
                          var6 = -2;
                          var6 = sh.field_qb.a((byte) 62);
                          var6 = var6 - (var6 >>> 677961951);
                          var7_ref_ic = new ic(true, var2, var5_ref_String__, var6, var4_int != 0, var3, 0);
                          var7_ref_ic.field_C.a(sh.field_qb, (byte) 57);
                          var7_ref_ic.field_A.a(false);
                          if (-58 != (ci.field_q ^ -1)) {
                            break L42;
                          } else {
                            L43: {
                              dd.field_a = true;
                              vg.field_I = var7_ref_ic;
                              if (!var7_ref_ic.field_t) {
                                break L43;
                              } else {
                                var8 = var7_ref_ic.field_C.field_c[0];
                                var9_int = 0;
                                L44: while (true) {
                                  L45: {
                                    if (!jc.a(var8, true)) {
                                      break L45;
                                    } else {
                                      var9_int++;
                                      var8 = var7_ref_ic.field_C.field_c[var9_int];
                                      if (var11 != 0) {
                                        break L43;
                                      } else {
                                        if (var11 == 0) {
                                          continue L44;
                                        } else {
                                          break L45;
                                        }
                                      }
                                    }
                                  }
                                  var12 = oi.a(new String[]{var8}, pc.field_e, 2);
                                  gf.a(mi.field_d, 0, false, var12, 1, var7_ref_ic.field_C.field_c[0]);
                                  break L43;
                                }
                              }
                            }
                            L46: {
                              stackOut_103_0 = new String[1];
                              stackOut_103_1 = new String[1];
                              stackOut_103_2 = 0;
                              stackIn_105_0 = stackOut_103_0;
                              stackIn_105_1 = stackOut_103_1;
                              stackIn_105_2 = stackOut_103_2;
                              stackIn_104_0 = stackOut_103_0;
                              stackIn_104_1 = stackOut_103_1;
                              stackIn_104_2 = stackOut_103_2;
                              if (-1 != (var6 ^ -1)) {
                                stackOut_105_0 = (String[]) ((Object) stackIn_105_0);
                                stackOut_105_1 = (String[]) ((Object) stackIn_105_1);
                                stackOut_105_2 = stackIn_105_2;
                                stackOut_105_3 = pb.field_k;
                                stackIn_106_0 = stackOut_105_0;
                                stackIn_106_1 = stackOut_105_1;
                                stackIn_106_2 = stackOut_105_2;
                                stackIn_106_3 = stackOut_105_3;
                                break L46;
                              } else {
                                stackOut_104_0 = (String[]) ((Object) stackIn_104_0);
                                stackOut_104_1 = (String[]) ((Object) stackIn_104_1);
                                stackOut_104_2 = stackIn_104_2;
                                stackOut_104_3 = uk.field_g;
                                stackIn_106_0 = stackOut_104_0;
                                stackIn_106_1 = stackOut_104_1;
                                stackIn_106_2 = stackOut_104_2;
                                stackIn_106_3 = stackOut_104_3;
                                break L46;
                              }
                            }
                            stackIn_106_1[stackIn_106_2] = stackIn_106_3;
                            var13 = oi.a(stackIn_106_0, rf.field_f, 2);
                            gf.a(mi.field_d, 0, false, var13, 1, var7_ref_ic.field_C.field_c[0]);
                            if (var11 == 0) {
                              break L41;
                            } else {
                              break L42;
                            }
                          }
                        }
                        ei.field_b = var7_ref_ic;
                        on.field_d = true;
                        var8 = var7_ref_ic.field_C.field_c[0];
                        var9 = var7_ref_ic.field_C.field_c[1];
                        var14 = oi.a(new String[]{var8, var9}, lm.field_k, 2);
                        gf.a(mi.field_d, 0, false, var14, 1, var7_ref_ic.field_C.field_c[0]);
                        break L41;
                      }
                      lj.b(122);
                      eh.field_e = false;
                      vm.field_e = true;
                      hm.field_c = -1;
                      if (var11 == 0) {
                        continue L25;
                      } else {
                        break L36;
                      }
                    }
                  }
                  L47: {
                    if (-60 != (ci.field_q ^ -1)) {
                      break L47;
                    } else {
                      L48: {
                        L49: {
                          if (dd.field_a) {
                            break L49;
                          } else {
                            if (on.field_d) {
                              break L49;
                            } else {
                              break L48;
                            }
                          }
                        }
                        L50: {
                          wm.c((byte) -86);
                          if (dd.field_a) {
                            vg.field_I.a((byte) -70, false);
                            break L50;
                          } else {
                            break L50;
                          }
                        }
                        ka.a(true, (byte) 87);
                        bl.field_B = true;
                        vm.field_e = false;
                        hm.field_c = -2;
                        th.field_q = true;
                        dd.field_a = false;
                        wc.field_j = 0;
                        on.field_d = false;
                        break L48;
                      }
                      eh.field_e = false;
                      if (var11 == 0) {
                        continue L25;
                      } else {
                        break L47;
                      }
                    }
                  }
                  L51: {
                    var2_ref = null;
                    if (dd.field_a) {
                      var2_ref = vg.field_I;
                      break L51;
                    } else {
                      if (!on.field_d) {
                        break L51;
                      } else {
                        var2_ref = ei.field_b;
                        break L51;
                      }
                    }
                  }
                  L52: {
                    if (var2_ref != null) {
                      L53: {
                        if (-61 == (ci.field_q ^ -1)) {
                          L54: {
                            var3 = sh.field_qb.g(11132);
                            var4_int = sh.field_qb.g(11132);
                            var5 = sh.field_qb.c((byte) -92);
                            ((ic) (var2_ref)).field_C.a(var3, var4_int, 21428);
                            if (((ic) (var2_ref)).field_C.field_v != -1) {
                              break L54;
                            } else {
                              ((ic) (var2_ref)).field_C.field_v = var3;
                              break L54;
                            }
                          }
                          ((ic) (var2_ref)).field_C.a(((ic) (var2_ref)).field_A.field_h, ((ic) (var2_ref)).field_C.field_A, (byte) 14);
                          ((ic) (var2_ref)).field_w = var5 + -50;
                          if (1 <= ((ic) (var2_ref)).field_w) {
                            continue L25;
                          } else {
                            ((ic) (var2_ref)).field_w = 1;
                            if (var11 == 0) {
                              continue L25;
                            } else {
                              break L53;
                            }
                          }
                        } else {
                          break L53;
                        }
                      }
                      L55: {
                        if (ci.field_q == 61) {
                          var3 = sh.field_qb.g(param0 ^ 11132);
                          var4_int = sh.field_qb.g(param0 + 11132);
                          var5 = sh.field_qb.g(param0 ^ 11132);
                          var6 = sh.field_qb.g(11132);
                          var7 = sh.field_qb.g(11132);
                          discarded$7 = ((ic) (var2_ref)).field_C.a(var6, var7, (byte) 119, var3, var4_int, var5);
                          ((ic) (var2_ref)).field_A.a(((ic) (var2_ref)).field_g, 31626);
                          ((ic) (var2_ref)).field_A.field_k = -1;
                          ((ic) (var2_ref)).field_D = false;
                          ((ic) (var2_ref)).field_A.field_c = -1;
                          if (var11 == 0) {
                            continue L25;
                          } else {
                            break L55;
                          }
                        } else {
                          break L55;
                        }
                      }
                      L56: {
                        if (-63 != (ci.field_q ^ -1)) {
                          break L56;
                        } else {
                          L57: {
                            var3 = sh.field_qb.a((byte) -72);
                            ((ic) (var2_ref)).field_C.d(-39, var3);
                            ((ic) (var2_ref)).field_C.c((int) sh.field_qb.a((byte) -103), 2);
                            var4 = var2_ref;
                            if (1 == (((ic) (var4)).field_e ^ -1)) {
                              break L57;
                            } else {
                              ((ic) (var4)).a(false, -1, 22273, false);
                              break L57;
                            }
                          }
                          ((ic) (var4)).field_n = 0;
                          if (var11 == 0) {
                            continue L25;
                          } else {
                            break L56;
                          }
                        }
                      }
                      L58: {
                        if (-64 != (ci.field_q ^ -1)) {
                          break L58;
                        } else {
                          ((ic) (var2_ref)).field_C.field_D = sh.field_qb.g(11132);
                          if (null == vg.field_I) {
                            continue L25;
                          } else {
                            mn.a(false);
                            if (var11 == 0) {
                              continue L25;
                            } else {
                              break L58;
                            }
                          }
                        }
                      }
                      L59: {
                        if (64 != ci.field_q) {
                          break L59;
                        } else {
                          ((ic) (var2_ref)).field_C.field_r = sh.field_qb.g(11132);
                          if (var11 == 0) {
                            continue L25;
                          } else {
                            break L59;
                          }
                        }
                      }
                      L60: {
                        if (ci.field_q == 65) {
                          ((ic) (var2_ref)).field_C.field_b = sh.field_qb.g(param0 ^ 11132);
                          if (null == vg.field_I) {
                            continue L25;
                          } else {
                            fe.g(1);
                            if (var11 == 0) {
                              continue L25;
                            } else {
                              break L60;
                            }
                          }
                        } else {
                          break L60;
                        }
                      }
                      if (66 != ci.field_q) {
                        break L52;
                      } else {
                        ((ic) (var2_ref)).field_v = sh.field_qb.g(11132);
                        if (null == vg.field_I) {
                          continue L25;
                        } else {
                          fe.g(1);
                          if (var11 == 0) {
                            continue L25;
                          } else {
                            break L52;
                          }
                        }
                      }
                    } else {
                      break L52;
                    }
                  }
                  this.n(-108);
                  if (var11 == 0) {
                    continue L25;
                  } else {
                    break L27;
                  }
                }
              }
            }
            al.b(-1, param0);
            stackOut_151_0 = i.field_y;
            stackOut_151_1 = -2;
            stackIn_152_0 = stackOut_151_0;
            stackIn_152_1 = stackOut_151_1;
            break L26;
          }
          L61: {
            if (stackIn_152_0 == stackIn_152_1) {
              bl.field_B = true;
              break L61;
            } else {
              break L61;
            }
          }
          L62: {
            if (!bl.field_B) {
              break L62;
            } else {
              wc.field_j = 0;
              break L62;
            }
          }
          L63: {
            if (eg.b((byte) -121)) {
              L64: {
                L65: {
                  var2 = this.g(0);
                  if (var2 == 0) {
                    break L65;
                  } else {
                    if (var2 != 1) {
                      break L64;
                    } else {
                      break L65;
                    }
                  }
                }
                L66: {
                  ti.c(114);
                  if ((var2 ^ -1) != -2) {
                    break L66;
                  } else {
                    qe.field_k = true;
                    eh.field_e = true;
                    if (var11 == 0) {
                      break L64;
                    } else {
                      break L66;
                    }
                  }
                }
                L67: {
                  if (aj.field_a) {
                    L68: {
                      L69: {
                        vm.field_e = false;
                        mn.field_e = true;
                        th.field_q = true;
                        if (!dd.field_a) {
                          break L69;
                        } else {
                          kn.field_J = mi.field_f;
                          gb.a(-2, 0, false, 9);
                          if (var11 == 0) {
                            break L68;
                          } else {
                            break L69;
                          }
                        }
                      }
                      gb.a(-2, 0, false, 0);
                      break L68;
                    }
                    wm.c((byte) -86);
                    ka.a(true, (byte) 87);
                    al.field_j[i.field_y].a((byte) 120, 0, false);
                    on.field_d = false;
                    dd.field_a = false;
                    aj.field_a = false;
                    break L67;
                  } else {
                    break L67;
                  }
                }
                eh.field_e = false;
                qe.field_k = false;
                break L64;
              }
              L70: {
                var3 = 0;
                if (2 != var2) {
                  break L70;
                } else {
                  var3 = 1;
                  break L70;
                }
              }
              L71: {
                L72: {
                  if (aj.field_a) {
                    break L72;
                  } else {
                    if (qe.field_k) {
                      break L72;
                    } else {
                      if (eh.field_e) {
                        break L72;
                      } else {
                        break L71;
                      }
                    }
                  }
                }
                var3 = 1;
                break L71;
              }
              if (var3 != 0) {
                ve.c((byte) -121);
                break L63;
              } else {
                break L63;
              }
            } else {
              break L63;
            }
          }
          return;
        }
    }

    public final void init() {
        this.a("virogrid", 15, (byte) 118);
    }

    private final int[] a(byte param0, qb param1) {
        ck discarded$2 = null;
        RuntimeException var3 = null;
        int[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 > 61) {
                break L1;
              } else {
                discarded$2 = Virogrid.b((byte) 94, false);
                break L1;
              }
            }
            stackOut_2_0 = bi.field_c;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("Virogrid.VA(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
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
          throw kg.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    private final void e(boolean param0) {
        int var2 = 0;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        double[] var11_ref_double__ = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        Object var16 = null;
        fl var16_ref = null;
        int var17 = 0;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        double[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        double[] var27 = null;
        int stackIn_37_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_82_0 = 0;
        int stackIn_100_0 = 0;
        int stackIn_100_1 = 0;
        il stackIn_105_0 = null;
        il stackIn_106_0 = null;
        il stackIn_107_0 = null;
        int stackIn_107_1 = 0;
        il stackIn_115_0 = null;
        il stackIn_116_0 = null;
        il stackIn_117_0 = null;
        int stackIn_117_1 = 0;
        il stackIn_120_0 = null;
        il stackIn_121_0 = null;
        il stackIn_122_0 = null;
        int stackIn_122_1 = 0;
        il stackIn_125_0 = null;
        il stackIn_126_0 = null;
        il stackIn_127_0 = null;
        int stackIn_127_1 = 0;
        il stackIn_130_0 = null;
        il stackIn_131_0 = null;
        il stackIn_132_0 = null;
        int stackIn_132_1 = 0;
        il stackIn_134_0 = null;
        il stackIn_135_0 = null;
        il stackIn_136_0 = null;
        int stackIn_136_1 = 0;
        int stackIn_138_0 = 0;
        int stackIn_138_1 = 0;
        int stackOut_35_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_81_0 = 0;
        int stackOut_80_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_99_1 = 0;
        il stackOut_104_0 = null;
        il stackOut_106_0 = null;
        int stackOut_106_1 = 0;
        il stackOut_105_0 = null;
        int stackOut_105_1 = 0;
        il stackOut_114_0 = null;
        il stackOut_116_0 = null;
        int stackOut_116_1 = 0;
        il stackOut_115_0 = null;
        int stackOut_115_1 = 0;
        il stackOut_119_0 = null;
        il stackOut_121_0 = null;
        int stackOut_121_1 = 0;
        il stackOut_120_0 = null;
        int stackOut_120_1 = 0;
        il stackOut_124_0 = null;
        il stackOut_126_0 = null;
        int stackOut_126_1 = 0;
        il stackOut_125_0 = null;
        int stackOut_125_1 = 0;
        il stackOut_129_0 = null;
        il stackOut_131_0 = null;
        int stackOut_131_1 = 0;
        il stackOut_130_0 = null;
        int stackOut_130_1 = 0;
        il stackOut_133_0 = null;
        il stackOut_135_0 = null;
        int stackOut_135_1 = 0;
        il stackOut_134_0 = null;
        int stackOut_134_1 = 0;
        int stackOut_137_0 = 0;
        int stackOut_137_1 = 0;
        L0: {
          L1: {
            L2: {
              var16 = null;
              var17 = field_F ? 1 : 0;
              var2 = param0 ? 1 : 0;
              if (i.field_y != hm.field_c) {
                break L2;
              } else {
                if (pg.field_g == nf.field_g) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (1 != (i.field_y ^ -1)) {
                break L3;
              } else {
                L4: {
                  if (-17 >= (we.field_l ^ -1)) {
                    break L4;
                  } else {
                    var2 = 0;
                    ej.a(false, 25680);
                    if (var17 == 0) {
                      break L0;
                    } else {
                      break L4;
                    }
                  }
                }
                lm.a(hm.field_c, -1, false, pg.field_g, 0);
                if (var17 == 0) {
                  break L0;
                } else {
                  break L3;
                }
              }
            }
            L5: {
              if (1 != (hm.field_c ^ -1)) {
                break L5;
              } else {
                L6: {
                  if (we.field_l >= 16) {
                    break L6;
                  } else {
                    lm.a(i.field_y, -1, false, nf.field_g, 0);
                    if (var17 == 0) {
                      break L0;
                    } else {
                      break L6;
                    }
                  }
                }
                var2 = 0;
                ej.a(false, 25680);
                if (var17 == 0) {
                  break L0;
                } else {
                  break L5;
                }
              }
            }
            L7: {
              if ((we.field_l ^ -1) <= -17) {
                break L7;
              } else {
                lm.a(i.field_y, we.field_l - -1, false, nf.field_g, 0);
                if (var17 == 0) {
                  break L0;
                } else {
                  break L7;
                }
              }
            }
            lm.a(hm.field_c, 1 + (-we.field_l + 32), false, pg.field_g, 0);
            if (var17 == 0) {
              break L0;
            } else {
              break L1;
            }
          }
          L8: {
            if ((i.field_y ^ -1) == 1) {
              break L8;
            } else {
              lm.a(i.field_y, -1, true, nf.field_g, 0);
              if (var17 == 0) {
                break L0;
              } else {
                break L8;
              }
            }
          }
          ej.a(false, 25680);
          var2 = 0;
          break L0;
        }
        L9: {
          L10: {
            if (var2 == 0) {
              break L10;
            } else {
              df.b(0, 0, 640, 480, 3158064);
              this.e((byte) -62);
              pc.a(mk.field_bb, (byte) -86);
              si.a(nk.field_K, new double[]{-110.0, 26.0, -410.0}, new double[]{-1.0, 0.0, 0.0}, 64.0, 114.0, mk.field_bb, 2621440, 10420224, 10485760, 26148864, ke.field_p.field_k);
              lk.field_Qb.a(pe.field_j, bi.field_c);
              var23 = new int[12];
              var18 = var23;
              var3 = var18;
              var4 = 0;
              L11: while (true) {
                L12: {
                  L13: {
                    if (var4 >= 3) {
                      break L13;
                    } else {
                      var3[var4] = pe.field_j[var4] << -188484317;
                      var4++;
                      if (var17 != 0) {
                        break L12;
                      } else {
                        if (var17 == 0) {
                          continue L11;
                        } else {
                          break L13;
                        }
                      }
                    }
                  }
                  var4 = 3;
                  break L12;
                }
                L14: while (true) {
                  L15: {
                    L16: {
                      L17: {
                        if ((var4 ^ -1) <= (var23.length ^ -1)) {
                          break L17;
                        } else {
                          var3[var4] = pe.field_j[var4];
                          var4++;
                          if (var17 != 0) {
                            break L16;
                          } else {
                            if (var17 == 0) {
                              continue L14;
                            } else {
                              break L17;
                            }
                          }
                        }
                      }
                      if (vm.field_d[2] <= 0.0) {
                        break L16;
                      } else {
                        stackOut_35_0 = 1;
                        stackIn_37_0 = stackOut_35_0;
                        break L15;
                      }
                    }
                    stackOut_36_0 = 0;
                    stackIn_37_0 = stackOut_36_0;
                    break L15;
                  }
                  L18: {
                    var4 = stackIn_37_0;
                    if (0.0 >= vm.field_d[0]) {
                      stackOut_39_0 = 0;
                      stackIn_40_0 = stackOut_39_0;
                      break L18;
                    } else {
                      stackOut_38_0 = 1;
                      stackIn_40_0 = stackOut_38_0;
                      break L18;
                    }
                  }
                  L19: {
                    L20: {
                      var5 = stackIn_40_0;
                      if (72.0 < vm.field_d[0]) {
                        break L20;
                      } else {
                        if (vm.field_d[0] >= -72.0) {
                          stackOut_44_0 = 0;
                          stackIn_45_0 = stackOut_44_0;
                          break L19;
                        } else {
                          break L20;
                        }
                      }
                    }
                    stackOut_43_0 = 1;
                    stackIn_45_0 = stackOut_43_0;
                    break L19;
                  }
                  L21: {
                    L22: {
                      var6 = stackIn_45_0;
                      if ((we.field_c.field_F ^ -1) != (this.field_E ^ -1)) {
                        break L22;
                      } else {
                        if (da.field_k[0] != vm.field_d[0]) {
                          break L22;
                        } else {
                          if (vm.field_d[1] != da.field_k[1]) {
                            break L22;
                          } else {
                            if (vm.field_d[2] != da.field_k[2]) {
                              break L22;
                            } else {
                              break L21;
                            }
                          }
                        }
                      }
                    }
                    L23: {
                      L24: {
                        this.field_E = we.field_c.field_F;
                        da.field_k[1] = vm.field_d[1];
                        da.field_k[2] = vm.field_d[2];
                        da.field_k[0] = vm.field_d[0];
                        qc.a(118);
                        vb.field_l.b();
                        df.b(0, 0, 640, 480, 0);
                        kg.field_c.a(pe.field_j, bi.field_c);
                        nb.field_x.a(pe.field_j, bi.field_c);
                        kf.field_c.a(pe.field_j, bi.field_c);
                        cm.field_k.a(pe.field_j, bi.field_c);
                        ba.field_c.a(pe.field_j, bi.field_c);
                        wf.field_j.a(pe.field_j, bi.field_c);
                        fl.field_s.a(pe.field_j, bi.field_c);
                        if (var4 == 0) {
                          break L24;
                        } else {
                          L25: {
                            ee.field_a.a(var23, this.field_K);
                            og.field_l.a(var23, this.field_J);
                            if (var5 == 0) {
                              break L25;
                            } else {
                              L26: {
                                if (var6 == 0) {
                                  rc.field_o.a(var23, this.field_B);
                                  break L26;
                                } else {
                                  break L26;
                                }
                              }
                              ab.field_L.a(var23, this.field_D);
                              if (var17 == 0) {
                                break L23;
                              } else {
                                break L25;
                              }
                            }
                          }
                          L27: {
                            if (var6 != 0) {
                              break L27;
                            } else {
                              ab.field_L.a(var23, this.field_D);
                              break L27;
                            }
                          }
                          rc.field_o.a(var23, this.field_B);
                          if (var17 == 0) {
                            break L23;
                          } else {
                            break L24;
                          }
                        }
                      }
                      L28: {
                        th.field_y.a(var23, this.field_J);
                        pj.field_a.a(var23, this.field_H);
                        if (var5 == 0) {
                          break L28;
                        } else {
                          L29: {
                            if (var6 == 0) {
                              jg.field_i.a(var23, this.field_G);
                              break L29;
                            } else {
                              break L29;
                            }
                          }
                          qg.field_h.a(var23, this.field_M);
                          if (var17 == 0) {
                            break L23;
                          } else {
                            break L28;
                          }
                        }
                      }
                      L30: {
                        if (var6 != 0) {
                          break L30;
                        } else {
                          qg.field_h.a(var23, this.field_M);
                          break L30;
                        }
                      }
                      jg.field_i.a(var23, this.field_G);
                      break L23;
                    }
                    L31: {
                      L32: {
                        if (var4 == 0) {
                          break L32;
                        } else {
                          hn.field_x.a(var23, this.field_N);
                          if (var17 == 0) {
                            break L31;
                          } else {
                            break L32;
                          }
                        }
                      }
                      td.field_i.a(var23, this.field_L);
                      break L31;
                    }
                    ul.b((byte) 116);
                    break L21;
                  }
                  L33: {
                    vb.field_l.d(0, 0);
                    var7 = id.field_r % 64;
                    if (32 > var7) {
                      stackOut_74_0 = -16 + var7;
                      stackIn_75_0 = stackOut_74_0;
                      break L33;
                    } else {
                      stackOut_73_0 = -var7 + 48;
                      stackIn_75_0 = stackOut_73_0;
                      break L33;
                    }
                  }
                  L34: {
                    var7 = stackIn_75_0;
                    var7 = var7 << 2;
                    if (!ke.field_p.field_d) {
                      break L34;
                    } else {
                      var7 = 0;
                      break L34;
                    }
                  }
                  L35: {
                    var26 = new int[3];
                    var21 = var26;
                    var8 = var21;
                    var24 = new int[3];
                    var19 = var24;
                    var9 = var19;
                    var25 = new int[3];
                    var20 = var25;
                    var10 = var20;
                    var8[0] = (int)ao.field_Hb << 2115963748;
                    var24[0] = 800;
                    var8[1] = -(int)ao.field_Hb << 62284740;
                    var25[0] = var7;
                    var24[1] = 800;
                    var26[2] = 0;
                    var25[1] = var7;
                    var24[2] = 1280;
                    var25[2] = 0;
                    si.a(pe.field_j, var26, var24, var25);
                    if (ke.field_p.field_m) {
                      L36: {
                        var11 = id.field_r % 128;
                        if (-65 < (var11 ^ -1)) {
                          stackOut_81_0 = var11;
                          stackIn_82_0 = stackOut_81_0;
                          break L36;
                        } else {
                          stackOut_80_0 = -var11 + 128;
                          stackIn_82_0 = stackOut_80_0;
                          break L36;
                        }
                      }
                      var11 = stackIn_82_0;
                      var12 = 38784 - -(var11 * 2);
                      qf.a(240, 0, 0, var26, var24, var25, var12, var12, var12);
                      var7 = var26[0];
                      var8[0] = var26[1];
                      var26[1] = var7;
                      var7 = var24[0];
                      var9[0] = var24[1];
                      var24[1] = var7;
                      var7 = var25[0];
                      var10[0] = var25[1];
                      var25[1] = var7;
                      qf.a(240, 0, 0, var26, var24, var25, var12, var12, var12);
                      break L35;
                    } else {
                      break L35;
                    }
                  }
                  L37: {
                    L38: {
                      if (!ke.field_p.field_d) {
                        break L38;
                      } else {
                        L39: {
                          L40: {
                            if (0.0 > nk.field_K[11]) {
                              break L40;
                            } else {
                              si.a(nk.field_K, new double[]{0.0, 0.0, 0.0}, ad.field_g, (double)ao.field_Hb, (double)we.field_k, c.field_d, 7208960, 34668544, 0, 26148864, ke.field_p.field_k);
                              if (var17 == 0) {
                                break L39;
                              } else {
                                break L40;
                              }
                            }
                          }
                          var27 = new double[ad.field_g.length];
                          var22 = var27;
                          var11_ref_double__ = var22;
                          var12 = 0;
                          L41: while (true) {
                            L42: {
                              if ((var12 ^ -1) <= (var27.length ^ -1)) {
                                break L42;
                              } else {
                                var11_ref_double__[var12] = -ad.field_g[var12];
                                var12++;
                                if (var17 != 0) {
                                  break L39;
                                } else {
                                  if (var17 == 0) {
                                    continue L41;
                                  } else {
                                    break L42;
                                  }
                                }
                              }
                            }
                            si.a(nk.field_K, new double[]{0.0, 0.0, 0.0}, var11_ref_double__, (double)ao.field_Hb, (double)we.field_k, c.field_d, 7208960, 34668544, 0, 26148864, ke.field_p.field_k);
                            break L39;
                          }
                        }
                        if (ke.field_p.field_f > 0) {
                          si.a(nk.field_K, new double[]{0.0, 0.0, 0.0}, ad.field_g, (double)ao.field_Hb, (double)we.field_k, pj.field_d, 40, ke.field_p.field_f);
                          if (var17 == 0) {
                            break L37;
                          } else {
                            break L38;
                          }
                        } else {
                          break L37;
                        }
                      }
                    }
                    System.out.println("Warning, drawing non-single plane");
                    break L37;
                  }
                  var16_ref = (fl) ((Object) sh.field_tb.a((byte) -61));
                  L43: while (true) {
                    L44: {
                      if (var16_ref == null) {
                        break L44;
                      } else {
                        var11 = -(pe.field_j[0] << -603747578) + (var16_ref.field_n >> 664161928);
                        var7 = -(pe.field_j[2] << -1367555290) + (var16_ref.field_m >> -435917880);
                        var12 = -(pe.field_j[1] << 533482790) + (var16_ref.field_p >> 1925002888);
                        var13 = pe.field_j[5] * var7 + var12 * pe.field_j[4] + var11 * pe.field_j[3];
                        var15 = var7 * pe.field_j[11] + (var12 * pe.field_j[10] + var11 * pe.field_j[9]);
                        var14 = var7 * pe.field_j[8] + var12 * pe.field_j[7] + pe.field_j[6] * var11;
                        var7 = var15 >> 144557622;
                        stackOut_99_0 = -1;
                        stackOut_99_1 = var15 ^ -1;
                        stackIn_138_0 = stackOut_99_0;
                        stackIn_138_1 = stackOut_99_1;
                        stackIn_100_0 = stackOut_99_0;
                        stackIn_100_1 = stackOut_99_1;
                        if (var17 != 0) {
                          break L9;
                        } else {
                          L45: {
                            if (stackIn_100_0 <= stackIn_100_1) {
                              break L45;
                            } else {
                              df.a((j.field_b << 903978180) - -((var13 >> 1501989897) / var7), (var14 >> -890619063) / var7 + (tm.field_g << -1979774556), 16384 / var7, var16_ref.field_o * 5 / 3, pj.field_d);
                              break L45;
                            }
                          }
                          var16_ref = (fl) ((Object) sh.field_tb.a(16213));
                          if (var17 == 0) {
                            continue L43;
                          } else {
                            break L44;
                          }
                        }
                      }
                    }
                    L46: {
                      if (var4 != 0) {
                        break L46;
                      } else {
                        L47: {
                          stackOut_104_0 = ee.field_a;
                          stackIn_106_0 = stackOut_104_0;
                          stackIn_105_0 = stackOut_104_0;
                          if (param0) {
                            stackOut_106_0 = (il) ((Object) stackIn_106_0);
                            stackOut_106_1 = 0;
                            stackIn_107_0 = stackOut_106_0;
                            stackIn_107_1 = stackOut_106_1;
                            break L47;
                          } else {
                            stackOut_105_0 = (il) ((Object) stackIn_105_0);
                            stackOut_105_1 = 1;
                            stackIn_107_0 = stackOut_105_0;
                            stackIn_107_1 = stackOut_105_1;
                            break L47;
                          }
                        }
                        L48: {
                          sj.a(stackIn_107_0, stackIn_107_1 != 0, var23, this.field_K);
                          sj.a(og.field_l, false, var23, this.field_C);
                          if (var5 == 0) {
                            break L48;
                          } else {
                            L49: {
                              sj.a(ab.field_L, false, var23, this.field_D);
                              if (var6 == 0) {
                                break L49;
                              } else {
                                sj.a(jg.field_i, false, var23, this.field_G);
                                break L49;
                              }
                            }
                            sj.a(rc.field_o, false, var23, this.field_B);
                            if (var17 == 0) {
                              break L10;
                            } else {
                              break L48;
                            }
                          }
                        }
                        L50: {
                          sj.a(rc.field_o, false, var23, this.field_B);
                          if (var6 == 0) {
                            break L50;
                          } else {
                            sj.a(qg.field_h, false, var23, this.field_M);
                            break L50;
                          }
                        }
                        sj.a(ab.field_L, false, var23, this.field_D);
                        if (var17 == 0) {
                          break L10;
                        } else {
                          break L46;
                        }
                      }
                    }
                    L51: {
                      stackOut_114_0 = th.field_y;
                      stackIn_116_0 = stackOut_114_0;
                      stackIn_115_0 = stackOut_114_0;
                      if (param0) {
                        stackOut_116_0 = (il) ((Object) stackIn_116_0);
                        stackOut_116_1 = 0;
                        stackIn_117_0 = stackOut_116_0;
                        stackIn_117_1 = stackOut_116_1;
                        break L51;
                      } else {
                        stackOut_115_0 = (il) ((Object) stackIn_115_0);
                        stackOut_115_1 = 1;
                        stackIn_117_0 = stackOut_115_0;
                        stackIn_117_1 = stackOut_115_1;
                        break L51;
                      }
                    }
                    L52: {
                      sj.a(stackIn_117_0, stackIn_117_1 != 0, var23, this.field_J);
                      sj.a(pj.field_a, false, var23, this.field_H);
                      if (var5 != 0) {
                        break L52;
                      } else {
                        L53: {
                          sj.a(jg.field_i, false, var23, this.field_G);
                          if (var6 == 0) {
                            break L53;
                          } else {
                            L54: {
                              stackOut_119_0 = ab.field_L;
                              stackIn_121_0 = stackOut_119_0;
                              stackIn_120_0 = stackOut_119_0;
                              if (param0) {
                                stackOut_121_0 = (il) ((Object) stackIn_121_0);
                                stackOut_121_1 = 0;
                                stackIn_122_0 = stackOut_121_0;
                                stackIn_122_1 = stackOut_121_1;
                                break L54;
                              } else {
                                stackOut_120_0 = (il) ((Object) stackIn_120_0);
                                stackOut_120_1 = 1;
                                stackIn_122_0 = stackOut_120_0;
                                stackIn_122_1 = stackOut_120_1;
                                break L54;
                              }
                            }
                            sj.a(stackIn_122_0, stackIn_122_1 != 0, var23, this.field_D);
                            break L53;
                          }
                        }
                        sj.a(qg.field_h, false, var23, this.field_M);
                        if (var17 == 0) {
                          break L10;
                        } else {
                          break L52;
                        }
                      }
                    }
                    L55: {
                      stackOut_124_0 = qg.field_h;
                      stackIn_126_0 = stackOut_124_0;
                      stackIn_125_0 = stackOut_124_0;
                      if (param0) {
                        stackOut_126_0 = (il) ((Object) stackIn_126_0);
                        stackOut_126_1 = 0;
                        stackIn_127_0 = stackOut_126_0;
                        stackIn_127_1 = stackOut_126_1;
                        break L55;
                      } else {
                        stackOut_125_0 = (il) ((Object) stackIn_125_0);
                        stackOut_125_1 = 1;
                        stackIn_127_0 = stackOut_125_0;
                        stackIn_127_1 = stackOut_125_1;
                        break L55;
                      }
                    }
                    L56: {
                      sj.a(stackIn_127_0, stackIn_127_1 != 0, var23, this.field_M);
                      if (var6 != 0) {
                        L57: {
                          stackOut_129_0 = rc.field_o;
                          stackIn_131_0 = stackOut_129_0;
                          stackIn_130_0 = stackOut_129_0;
                          if (param0) {
                            stackOut_131_0 = (il) ((Object) stackIn_131_0);
                            stackOut_131_1 = 0;
                            stackIn_132_0 = stackOut_131_0;
                            stackIn_132_1 = stackOut_131_1;
                            break L57;
                          } else {
                            stackOut_130_0 = (il) ((Object) stackIn_130_0);
                            stackOut_130_1 = 1;
                            stackIn_132_0 = stackOut_130_0;
                            stackIn_132_1 = stackOut_130_1;
                            break L57;
                          }
                        }
                        sj.a(stackIn_132_0, stackIn_132_1 != 0, var23, this.field_B);
                        break L56;
                      } else {
                        break L56;
                      }
                    }
                    L58: {
                      stackOut_133_0 = jg.field_i;
                      stackIn_135_0 = stackOut_133_0;
                      stackIn_134_0 = stackOut_133_0;
                      if (param0) {
                        stackOut_135_0 = (il) ((Object) stackIn_135_0);
                        stackOut_135_1 = 0;
                        stackIn_136_0 = stackOut_135_0;
                        stackIn_136_1 = stackOut_135_1;
                        break L58;
                      } else {
                        stackOut_134_0 = (il) ((Object) stackIn_134_0);
                        stackOut_134_1 = 1;
                        stackIn_136_0 = stackOut_134_0;
                        stackIn_136_1 = stackOut_134_1;
                        break L58;
                      }
                    }
                    sj.a(stackIn_136_0, stackIn_136_1 != 0, var23, this.field_G);
                    break L10;
                  }
                }
              }
            }
          }
          stackOut_137_0 = i.field_y;
          stackOut_137_1 = 10;
          stackIn_138_0 = stackOut_137_0;
          stackIn_138_1 = stackOut_137_1;
          break L9;
        }
        L59: {
          if (stackIn_138_0 != stackIn_138_1) {
            break L59;
          } else {
            if (-11 != (hm.field_c ^ -1)) {
              break L59;
            } else {
              ij.a((byte) 105);
              break L59;
            }
          }
        }
    }

    private final void a(boolean param0, boolean param1) {
        boolean discarded$6 = false;
        boolean discarded$7 = false;
        int fieldTemp$8 = 0;
        l discarded$9 = null;
        pe discarded$10 = null;
        pe discarded$11 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        int stackIn_105_0 = 0;
        int stackIn_118_0 = 0;
        int stackOut_104_0 = 0;
        int stackOut_103_0 = 0;
        int stackOut_117_0 = 0;
        int stackOut_116_0 = 0;
        var7 = field_F ? 1 : 0;
        if (!param0) {
          L0: {
            L1: {
              if (-1 == (tg.field_x ^ -1)) {
                break L1;
              } else {
                L2: {
                  if (-2 == (tg.field_x ^ -1)) {
                    break L2;
                  } else {
                    L3: {
                      if (2 != tg.field_x) {
                        break L3;
                      } else {
                        L4: {
                          if (!qm.i(20)) {
                            L5: {
                              hm.field_c = pm.field_k;
                              wn.c(param0);
                              if (a.field_D) {
                                a.field_D = false;
                                ic.a(ib.field_b, hd.field_b.field_A, 320, ib.field_b, 8, mc.field_b, 2, hd.field_b.field_G + hd.field_b.field_A, 8, -16824, false, 240);
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                            L6: {
                              if (!bj.field_n) {
                                break L6;
                              } else {
                                L7: {
                                  L8: {
                                    var3 = bd.field_e;
                                    if (0 == hm.field_c) {
                                      break L8;
                                    } else {
                                      if (-3 == (i.field_y ^ -1)) {
                                        break L8;
                                      } else {
                                        if (-4 == (i.field_y ^ -1)) {
                                          break L8;
                                        } else {
                                          if (4 == hm.field_c) {
                                            break L8;
                                          } else {
                                            if (hm.field_c == 5) {
                                              break L8;
                                            } else {
                                              break L7;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  var3 = hm.field_c;
                                  break L7;
                                }
                                gb.a(-2, var3, false, -4);
                                break L6;
                              }
                            }
                            if (mf.a(86, hm.field_c)) {
                              wm.c((byte) -86);
                              break L4;
                            } else {
                              break L4;
                            }
                          } else {
                            break L4;
                          }
                        }
                        tg.field_x = 3;
                        if (var7 == 0) {
                          break L0;
                        } else {
                          break L3;
                        }
                      }
                    }
                    wa.field_K = wa.field_K - 1;
                    if ((wa.field_K ^ -1) == -1) {
                      tg.field_x = 0;
                      if (var7 == 0) {
                        break L0;
                      } else {
                        break L2;
                      }
                    } else {
                      break L0;
                    }
                  }
                }
                wa.field_K = wa.field_K + 1;
                if ((wa.field_K ^ -1) == -17) {
                  L9: {
                    L10: {
                      if (!a.field_D) {
                        break L10;
                      } else {
                        ka.a(0);
                        if (var7 == 0) {
                          break L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                    dn.a(8192);
                    break L9;
                  }
                  tg.field_x = 2;
                  if (var7 == 0) {
                    break L0;
                  } else {
                    break L1;
                  }
                } else {
                  break L0;
                }
              }
            }
            L11: {
              L12: {
                L13: {
                  var3 = 0;
                  var4 = 0;
                  if (!param1) {
                    L14: {
                      L15: {
                        L16: {
                          if (i.field_y != hm.field_c) {
                            break L16;
                          } else {
                            if ((pg.field_g ^ -1) == (nf.field_g ^ -1)) {
                              break L15;
                            } else {
                              break L16;
                            }
                          }
                        }
                        we.field_l = we.field_l + 1;
                        if (-33 == (we.field_l ^ -1)) {
                          wm.c((byte) -86);
                          if (var7 == 0) {
                            break L14;
                          } else {
                            L17: {
                              if (i.field_y == -1) {
                                break L17;
                              } else {
                                L18: {
                                  if ((i.field_y ^ -1) != 1) {
                                    break L18;
                                  } else {
                                    var3 = 1;
                                    if (var7 == 0) {
                                      break L14;
                                    } else {
                                      break L18;
                                    }
                                  }
                                }
                                if (!mf.a(107, i.field_y)) {
                                  break L14;
                                } else {
                                  al.field_j[i.field_y].a((byte) -79);
                                  if (var7 == 0) {
                                    break L14;
                                  } else {
                                    break L17;
                                  }
                                }
                              }
                            }
                            if (!aj.field_a) {
                              break L15;
                            } else {
                              var3 = 1;
                              var4 = 1;
                              if (var7 == 0) {
                                break L14;
                              } else {
                                vg.field_I.a(-104, true);
                                L19: while (true) {
                                  if (!nd.b((byte) -107)) {
                                    break L14;
                                  } else {
                                    vg.field_I.d(117);
                                    if (var7 != 0) {
                                      break L13;
                                    } else {
                                      if (var7 == 0) {
                                        continue L19;
                                      } else {
                                        break L14;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          break L14;
                        }
                      }
                      vg.field_I.a(-104, true);
                      L20: while (true) {
                        if (!nd.b((byte) -107)) {
                          break L14;
                        } else {
                          vg.field_I.d(117);
                          if (var7 != 0) {
                            break L13;
                          } else {
                            if (var7 == 0) {
                              continue L20;
                            } else {
                              break L14;
                            }
                          }
                        }
                      }
                    }
                    if (!aj.field_a) {
                      break L13;
                    } else {
                      if (qe.field_k) {
                        break L13;
                      } else {
                        if (!eh.field_e) {
                          L21: {
                            bc.a(var3 != 0, (byte) -120);
                            if (!on.field_d) {
                              break L21;
                            } else {
                              ei.field_b.a(-103, var4 != 0);
                              break L21;
                            }
                          }
                          L22: {
                            if (!dd.field_a) {
                              break L22;
                            } else {
                              vg.field_I.a(-111, var4 != 0);
                              break L22;
                            }
                          }
                          L23: while (true) {
                            if (!nd.b((byte) -111)) {
                              break L13;
                            } else {
                              L24: {
                                if (!bl.field_B) {
                                  break L24;
                                } else {
                                  discarded$6 = ln.a(15, (byte) 104, 12, 13);
                                  break L24;
                                }
                              }
                              L25: {
                                if (on.field_d) {
                                  ei.field_b.d(-114);
                                  break L25;
                                } else {
                                  break L25;
                                }
                              }
                              if (!dd.field_a) {
                                continue L23;
                              } else {
                                vg.field_I.d(-20);
                                if (var7 != 0) {
                                  break L12;
                                } else {
                                  if (var7 == 0) {
                                    continue L23;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          break L13;
                        }
                      }
                    }
                  } else {
                    if (!aj.field_a) {
                      break L13;
                    } else {
                      if (qe.field_k) {
                        break L13;
                      } else {
                        if (!eh.field_e) {
                          L26: {
                            bc.a(var3 != 0, (byte) -120);
                            if (!on.field_d) {
                              break L26;
                            } else {
                              ei.field_b.a(-103, var4 != 0);
                              break L26;
                            }
                          }
                          L27: {
                            if (!dd.field_a) {
                              break L27;
                            } else {
                              vg.field_I.a(-111, var4 != 0);
                              break L27;
                            }
                          }
                          L28: while (true) {
                            if (!nd.b((byte) -111)) {
                              break L13;
                            } else {
                              L29: {
                                if (!bl.field_B) {
                                  break L29;
                                } else {
                                  discarded$7 = ln.a(15, (byte) 104, 12, 13);
                                  break L29;
                                }
                              }
                              L30: {
                                if (on.field_d) {
                                  ei.field_b.d(-114);
                                  break L30;
                                } else {
                                  break L30;
                                }
                              }
                              if (!dd.field_a) {
                                continue L28;
                              } else {
                                vg.field_I.d(-20);
                                if (var7 != 0) {
                                  break L12;
                                } else {
                                  if (var7 == 0) {
                                    continue L28;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          break L13;
                        }
                      }
                    }
                  }
                }
                if (!aj.field_a) {
                  break L12;
                } else {
                  break L11;
                }
              }
              mf.e(1);
              break L11;
            }
            L31: {
              L32: {
                var5 = we.field_c.field_F;
                if (!bl.field_B) {
                  break L32;
                } else {
                  if (aj.field_a) {
                    stackOut_104_0 = dh.field_r;
                    stackIn_105_0 = stackOut_104_0;
                    break L31;
                  } else {
                    break L32;
                  }
                }
              }
              stackOut_103_0 = 481;
              stackIn_105_0 = stackOut_103_0;
              break L31;
            }
            L33: {
              var6 = stackIn_105_0;
              tn.field_g = tn.field_g + (-tn.field_g + (float)var6) * 0.10000000149011612f;
              if ((int)((double)tn.field_g + 0.5) == var5) {
                break L33;
              } else {
                sl.a(-118, (int)tn.field_g);
                jm.a(320, ((int)(tn.field_g * 4.0f) + 240) / 9, -2);
                break L33;
              }
            }
            L34: {
              if (null == this.field_I.a((byte) -102)) {
                break L34;
              } else {
                fieldTemp$8 = this.field_A + 1;
                this.field_A = this.field_A + 1;
                if (fieldTemp$8 == 335) {
                  this.field_A = 0;
                  discarded$9 = this.field_I.d(-29889);
                  break L34;
                } else {
                  break L34;
                }
              }
            }
            if (!param1) {
              li.a(param0);
              break L0;
            } else {
              break L0;
            }
          }
          L35: {
            if (-3 != hm.field_c) {
              break L35;
            } else {
              L36: {
                var8 = new String[]{mb.field_eb, em.field_e};
                vg.field_I = new ic(false, eg.field_y, var8, 0, false, ll.field_b, ce.field_I);
                lj.b(101);
                if (!pn.field_x) {
                  stackOut_117_0 = 0;
                  stackIn_118_0 = stackOut_117_0;
                  break L36;
                } else {
                  stackOut_116_0 = 1;
                  stackIn_118_0 = stackOut_116_0;
                  break L36;
                }
              }
              var4 = stackIn_118_0;
              gb.a(-2, 0, var4 != 0, -1);
              vm.field_e = true;
              break L35;
            }
          }
          L37: {
            if ((hm.field_c ^ -1) != 3) {
              break L37;
            } else {
              gk.field_g.g(9, 8);
              qe.field_k = true;
              hm.field_c = i.field_y;
              break L37;
            }
          }
          L38: {
            if (-5 == hm.field_c) {
              nn.a(wl.field_d.e((byte) -124), 11, (byte) -120);
              eh.field_e = true;
              hm.field_c = i.field_y;
              break L38;
            } else {
              break L38;
            }
          }
          L39: {
            L40: {
              L41: {
                oj.e((byte) -75);
                if (db.b((byte) 13, 0)) {
                  break L41;
                } else {
                  if (-1 != (sh.a(4712, 1000) ^ -1)) {
                    break L39;
                  } else {
                    discarded$10 = gi.a(dj.field_f[sh.a(4712, 3)], 100, 24);
                    if (var7 == 0) {
                      break L40;
                    } else {
                      break L41;
                    }
                  }
                }
              }
              L42: {
                if (vg.field_I == null) {
                  break L42;
                } else {
                  if (!vg.field_I.field_g) {
                    break L42;
                  } else {
                    if (!vg.field_I.field_t) {
                      break L42;
                    } else {
                      if ((vg.field_I.field_C.field_u ^ -1) >= (sh.a(4712, 40000) ^ -1)) {
                        break L42;
                      } else {
                        if (!vg.field_I.field_l) {
                          vg.field_I.field_l = true;
                          hj.field_h = id.field_c;
                          ca.field_G = c.field_a;
                          break L42;
                        } else {
                          break L42;
                        }
                      }
                    }
                  }
                }
              }
              L43: {
                if (-1 <= (hj.field_h ^ -1)) {
                  break L43;
                } else {
                  L44: {
                    hj.field_h = hj.field_h - 1;
                    var3 = c.field_a + -4;
                    if (-1 >= (var3 ^ -1)) {
                      break L44;
                    } else {
                      var3 = 0;
                      break L44;
                    }
                  }
                  L45: {
                    bm.d(var3, 0);
                    if (0 != sh.a(4712, 20)) {
                      break L45;
                    } else {
                      discarded$11 = ed.a(sh.a(4712, 256), dj.field_f[sh.a(4712, 3)], -629134904, 96);
                      break L45;
                    }
                  }
                  if (var7 == 0) {
                    break L40;
                  } else {
                    break L43;
                  }
                }
              }
              L46: {
                var3 = 1 + c.field_a;
                if (ca.field_G < var3) {
                  break L46;
                } else {
                  bm.d(var3, 0);
                  if (var7 == 0) {
                    break L40;
                  } else {
                    break L46;
                  }
                }
              }
              ca.field_G = 0;
              break L39;
            }
            break L39;
          }
          return;
        } else {
          return;
        }
    }

    private final mg b(int param0, int param1, int param2) {
        mg var4 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = field_F ? 1 : 0;
        var4 = new mg(57, 57);
        pj.a(var4, 256);
        df.c(29, 29, 27, 263172);
        var5 = 23;
        L0: while (true) {
          L1: {
            L2: {
              if (-1 < (var5 ^ -1)) {
                break L2;
              } else {
                df.c(29, 29, var5, param2 - -(var5 * param0));
                var5--;
                if (var6 != 0) {
                  break L1;
                } else {
                  if (var6 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            ul.b((byte) 93);
            break L1;
          }
          L3: {
            if (param1 == -9105) {
              break L3;
            } else {
              this.e(true);
              break L3;
            }
          }
          return var4;
        }
    }

    final static void a(eh param0, byte param1) {
        mg var2 = null;
        int var3 = 0;
        int var4 = 0;
        try {
            var2 = new mg(param0.a("final_frame.jpg", 100, ""), (java.awt.Component) ((Object) fi.field_v));
            var3 = var2.field_w;
            var4 = var2.field_p;
            lm.a(0);
            int var5 = 120 / ((33 - param1) / 33);
            nd.field_d = new mg(var3, 3 * var4 / 4);
            nd.field_d.b();
            var2.b(0, 0);
            dn.field_c = new mg(var3, -nd.field_d.field_p + var4);
            dn.field_c.b();
            var2.b(0, -nd.field_d.field_p);
            dn.field_c.field_x = nd.field_d.field_p;
            ai.a(true);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "Virogrid.CB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void t(int param0) {
        if (null != uh.field_e) {
            a.a(20, uh.field_e);
            uh.field_e = null;
            sb.a(-52);
        }
        md.field_h = p.a(83, 3);
        oj.field_Fb = p.a(117, 5);
        g.field_a = p.a(98, 6);
        pj.field_c = p.a(89, 7);
        sf.field_O = p.a(param0 ^ 35, 8);
        el.field_d = p.a(64, 9);
        wm.field_w = p.a(97, 10);
        wn.field_i = p.a(33, 11);
        gn.field_G = p.a(param0 ^ 51, 12);
        ng.field_T = p.a(81, param0);
    }

    final void a(int param0) {
        if (param0 >= -80) {
            this.field_L = (int[]) null;
        }
        al.i(100);
        if (!(null == ih.field_b)) {
            am.a((byte) -16);
        }
        ce.f(13633);
    }

    final void d(int param0) {
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        var3 = field_F ? 1 : 0;
        Virogrid.u(240);
        hj.a(17);
        l.b(-6325);
        p.c(param0 + -32);
        ud.a((byte) -94);
        fj.a((byte) -99);
        rh.b(param0 ^ 57);
        bn.a((byte) -118);
        rk.a(-97);
        ld.a((byte) -110);
        cg.a(-65);
        nf.a(-28637);
        wd.a(param0 ^ -8518);
        em.a(-85);
        od.d(false);
        rg.a(param0 ^ 64);
        uk.b(param0 + -6490);
        og.b(param0 + 74);
        me.a(param0 + 0);
        cb.b(3981);
        df.a();
        eh.a((byte) -104);
        e.a();
        ak.a(4472);
        jc.b((byte) 110);
        hc.a(true);
        se.a((byte) 79);
        rb.a((byte) -13);
        vm.a((byte) -106);
        oh.a(true);
        td.a(6666);
        kb.a(122);
        pc.a(-30114);
        ih.a(81);
        cj.a(-99);
        nm.a(26523);
        hm.b(param0 ^ -126);
        wf.a(param0 ^ -28608);
        qc.a((byte) 9);
        h.a(true);
        li.b((byte) 112);
        jg.a(28275);
        dk.a(-124);
        sb.b(-851125662);
        ha.a(param0 + 79);
        nh.a(false);
        el.d(-127);
        oi.c(122);
        ic.b(23320);
        pi.a(param0 ^ -29216);
        il.a();
        qb.b();
        uf.a(98);
        ee.b((byte) 119);
        rl.d(0);
        wb.c(true);
        bd.a(95);
        tn.f(param0 + 31);
        ke.d(-51);
        wg.a(0);
        sd.a((byte) 113);
        ah.a((byte) -115);
        ib.a(-60);
        k.a(1000);
        we.a((byte) -104);
        gi.a((byte) -103);
        en.g(0);
        qm.j(124);
        km.f(param0 + 2147483647);
        ga.i(param0 ^ -91);
        ao.g(-119);
        dj.a(false);
        um.g(0);
        bg.g(param0);
        lk.e((byte) 10);
        an.a((byte) 26);
        pl.a((byte) -120);
        pj.a(false);
        oe.b(param0 + 0);
        hk.d(false);
        jm.a(param0 + 0);
        he.g(7);
        fk.c();
        vl.a(false);
        ll.a((byte) -64);
        pg.b(param0 + 8192);
        s.a(-1);
        i.a((byte) -78);
        ln.a(true);
        wn.d(79);
        qj.b();
        pa.c(true);
        ua.b();
        eg.c(param0 ^ -55);
        ef.a(-3);
        kf.a(-1);
        vj.b((byte) 17);
        ea.a(-74);
        sj.a((byte) 121);
        jd.a(true);
        ba.a(14);
        fh.a(10061);
        vf.a(false);
        je.h(-202);
        b.j((byte) -22);
        vc.g((byte) 108);
        de.g(false);
        sh.g(true);
        qh.f(8246);
        jl.f(15354);
        ca.f((byte) 15);
        uh.a(false);
        id.a((byte) 24);
        o.a((byte) 67);
        ig.a(-77);
        ii.a((byte) 6);
        ac.a(-95);
        qi.a(25651);
        of.a((byte) 110);
        lg.a(param0 ^ -122);
        ne.a(false);
        ul.a((byte) -96);
        bk.a((byte) 122);
        hg.f((byte) 103);
        mm.a(false);
        dd.b((byte) -58);
        m.b(-314);
        ia.a(44);
        ab.e(-16349);
        va.a(-91);
        na.e((byte) 56);
        sk.a((byte) -52);
        qf.c();
        ff.a();
        nn.a(53);
        bf.c(param0 ^ 20391);
        ji.a(-112);
        am.b((byte) 88);
        ei.a(-59);
        lb.b(7);
        lm.a((byte) -94);
        pn.c(true);
        qk.c(2);
        ub.f(-121);
        gl.a(param0 + 3);
        bl.d(false);
        oa.c((byte) -127);
        c.a(false);
        nb.d(-30419);
        rf.a(-24750);
        mk.k(-16);
        aj.a(false);
        gj.c();
        tf.a(0);
        wm.c(0);
        af.a(99);
        mn.a(0);
        lh.b(false);
        sm.a(param0 + -1);
        cf.a(112);
        ag.b(25);
        g.b((byte) -108);
        md.b(46);
        wh.a(param0 + -23862);
        bb.a();
        db.a(6);
        bc.a((byte) -101);
        aa.a(false);
        lj.a(67);
        nl.c(120);
        ql.a((byte) -87);
        rj.a(6);
        ie.b(0);
        fi.c(false);
        tg.a((byte) -78);
        ec.a(param0 + -3298);
        dc.h(-126);
        gg.g(-1);
        fd.e(1);
        ma.d(param0 ^ 0);
        jk.a((byte) 110);
        nj.b();
        tk.a(0);
        kh.a((byte) 81);
        qa.a(8342);
        mc.a(false);
        oj.f((byte) -111);
        wc.a(param0 + 200);
        ad.a(param0 + 90);
        u.b((byte) -11);
        th.e(-5);
        sl.a(param0 + 1);
        rn.a((byte) -38);
        te.a((byte) 126);
        mf.f(-93);
        gd.b((byte) 104);
        ug.a(-97);
        ch.a(0);
        hl.a();
        sg.d(-2);
        fm.a((byte) -54);
        hd.a(3881);
        d.e((byte) -73);
        fe.h(32498);
        ge.a(72);
        rc.a(param0 + -24021);
        qd.a(true);
        ej.f(2);
        vd.l(-1);
        wa.f((byte) 39);
        mb.h((byte) 126);
        dg.a((byte) 41);
        nk.a(35);
        w.a(-116);
        ng.g(false);
        gn.g(true);
        qe.b((byte) -36);
        fn.b((byte) 97);
        ok.f(-100);
        qn.c((byte) -124);
        gb.e(117);
        al.g(-1);
        jb.a((byte) -99);
        gf.a((byte) 124);
        dn.a((byte) 112);
        bm.c(2797);
        tl.b((byte) -71);
        nd.a((byte) 114);
        ce.a((byte) 107);
        vg.f(-114);
        gk.a((byte) -127);
        eb.a(true);
        dm.e(-48);
        lc.a(-26834);
        mj.g(-108);
        ph.d(param0 ^ 121);
        bh.a();
        ed.a((byte) 51);
        j.b(param0 ^ -116);
        f.b((byte) 103);
        jf.a((byte) -124);
        ij.a(-25621);
        pm.a(0);
        fl.a(-24488);
        dh.a(-128);
        pe.a((byte) -79);
        la.a((byte) 108);
        hf.b(param0 ^ -125);
        ti.b(-88);
        cc.b(false);
        a.c(false);
        ae.a((byte) -125);
        kn.h(param0 ^ 0);
        oc.c(false);
        hn.a((byte) -9);
        ai.b(false);
        gh.d(false);
        vb.b((byte) 112);
        ka.c(-85);
        sa.a((byte) -52);
        kg.b((byte) 123);
        dl.a(0);
        bj.a((byte) -62);
        qg.a(114);
        ob.a(param0 + 29137);
        sf.a(100);
        co.a((byte) 103);
        mh.b((byte) 51);
        re.b(-120);
        vi.b(param0 + 31856);
        bi.a(46);
        fb.a((byte) 21);
        ra.a(false);
        tm.a(-74);
        da.a(param0 ^ 8355711);
        cm.c(115);
        fa.d(0);
        jj.a((byte) 74);
        ri.b(2);
        di.h(46);
        sn.c((byte) -89);
        ve.c(true);
        kd.c((byte) -124);
        kk.c((byte) -8);
        ci.h(-104);
        on.a((byte) 120);
        pb.a((byte) 111);
        wl.a((byte) -75);
        mi.e(12);
        hh.a((byte) -124);
        this.field_N = null;
        this.field_C = null;
        this.field_I = null;
        this.field_G = null;
        this.field_D = null;
        this.field_L = null;
        this.field_H = null;
        this.field_B = null;
        this.field_v = null;
        this.field_K = null;
        this.field_J = null;
        this.field_M = null;
        if (uk.field_f == 0) {
          return;
        } else {
          L0: {
            if (var3 == 0) {
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 0;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          field_F = stackIn_4_0 != 0;
          return;
        }
    }

    private final void a(qb param0, byte param1) {
        int[] discarded$0 = null;
        try {
            param0.a(0, 154, 0);
            if (param1 != 69) {
                qb var4 = (qb) null;
                discarded$0 = this.a((byte) -76, (qb) null);
            }
            param0.a(256, 256, 256, 32);
            param0.a(0, -154, 0);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "Virogrid.TA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public Virogrid() {
        this.field_I = new p();
        this.field_A = 0;
    }

    static {
        field_O = new co("usename");
    }
}
