/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class t {
    static String field_c;
    private pl field_b;
    private int field_f;
    private int field_e;
    private int field_g;
    static int field_d;
    static int field_a;
    private int field_i;
    static dd[] field_h;

    private final boolean a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          if (3 == this.field_i) {
            L1: {
              if (0 != param1) {
                break L1;
              } else {
                if (g.field_s == 0) {
                  return false;
                } else {
                  break L1;
                }
              }
            }
            if ((param1 ^ -1) != -3) {
              break L0;
            } else {
              if (g.field_s != -1 + kb.field_k.length) {
                break L0;
              } else {
                return false;
              }
            }
          } else {
            break L0;
          }
        }
        var3 = 32 % ((param0 - 19) / 41);
        var4 = ia.field_p[this.field_i][param1];
        if (var4 != 20) {
          return true;
        } else {
          L2: {
            L3: {
              if (fleas.field_E != 0) {
                break L3;
              } else {
                if ((rh.field_c.field_x ^ -1) > -16) {
                  break L3;
                } else {
                  if (qh.c((byte) 62)) {
                    break L2;
                  } else {
                    if (0 >= wc.field_q) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
            }
            if (!rh.field_c.a(rh.field_c.field_x, 98)) {
              break L2;
            } else {
              return true;
            }
          }
          return false;
        }
    }

    private final void h(int param0) {
        int var2 = 160;
        int var3 = 0;
        int var4 = 0;
        tl.field_p.a(fi.field_l, 320, var2, var3, var4);
        var2 += 40;
        int var5 = tj.field_a;
        if (!(tj.field_a < nl.field_c[fleas.field_E].length)) {
            var5 = -1 + nl.field_c[fleas.field_E].length;
        }
        int discarded$0 = tl.field_p.a(db.a(pk.field_G, new String[]{wj.field_c[fleas.field_E][var5]}, true), 170, var2 + -27, 300, 320, var3, var4, 1, 0, tl.field_p.field_H);
        var2 += 90;
        tl.field_p.a(db.a(va.field_s, new String[]{Integer.toString(pl.field_f), Integer.toString((int) ia.field_m[fleas.field_E][var5].field_f)}, true), 320, var2, var3, var4);
        var2 += 40;
        tl.field_p.a(db.a(hm.field_h, new String[]{Integer.toString(wi.field_b)}, true), 320, var2, var3, var4);
        int var7 = -113 % ((param0 - 12) / 34);
        String var6 = db.a(fleas.field_I, new String[]{wa.a(false)}, true);
        tl.field_p.a(db.a(var6, new String[]{"0"}, true), 320, var2 - -tl.field_p.field_N, var3, var4);
    }

    final void a(boolean param0, boolean param1) {
        if (!param1) {
            return;
        }
        int var3 = 0;
        if (!(this.field_i != 7)) {
            var3 = -1;
        }
        if (0 == this.field_i) {
            if ((this.field_b.field_k ^ -1) != 0) {
                var3 = this.field_b.field_k;
            }
        }
        if (1 == this.field_i) {
            if (0 != (this.field_b.field_k ^ -1)) {
                if (-1 != ab.field_b) {
                    var3 = this.field_b.field_k;
                }
            }
        }
        if (!(-4 != (this.field_i ^ -1))) {
            var3 = 2;
        }
        this.field_b.a(this.a(ag.field_f, kc.field_b, (byte) -57), var3, param0, -60);
        this.field_f = -1;
        if (this.field_i == 7) {
            qh.a(param0, false);
        }
    }

    private final void d(int param0) {
        int discarded$2 = 0;
        int discarded$3 = 0;
        String var2 = null;
        fa var3 = null;
        ll var4_ref_ll = null;
        int var4 = 0;
        String[] var5 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        int var13 = 0;
        int var14 = 0;
        int[] var18 = null;
        L0: {
          var14 = fleas.field_A ? 1 : 0;
          var3 = lk.field_Q;
          this.b(2, nb.field_g);
          if (!qh.c((byte) 122)) {
            L1: {
              if (m.field_b != null) {
                break L1;
              } else {
                m.field_b = bm.a(false, 3, 1, 10, 40);
                break L1;
              }
            }
            var4_ref_ll = m.field_b;
            if (!var4_ref_ll.field_l) {
              var2 = ja.field_L;
              break L0;
            } else {
              if (null != var4_ref_ll.field_i) {
                var2 = bh.field_n;
                var5 = var4_ref_ll.field_i[nb.field_g];
                var18 = var4_ref_ll.field_p[nb.field_g];
                var7 = cd.a(var4_ref_ll, cm.field_b, 0, nb.field_g);
                var8 = 115 - -var3.field_H;
                var9 = 0;
                L2: while (true) {
                  if ((var9 ^ -1) <= -11) {
                    if (wi.field_p == null) {
                      break L0;
                    } else {
                      if ((var7 ^ -1) != 0) {
                        break L0;
                      } else {
                        var3.c(b.field_e, 180, var8, 16711680, -1);
                        var3.b(Integer.toString(wi.field_b), 500, var8, 16711680, -1);
                        break L0;
                      }
                    }
                  } else {
                    if (var5[var9] != null) {
                      L3: {
                        var10 = 0;
                        var11 = var18[var9];
                        if (var9 == var7) {
                          var10 = 16711680;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      var12 = var5[var9];
                      var3.b(var9 - -1 + ". ", 180, var8, var10, -1);
                      var3.c(var12, 180, var8, var10, -1);
                      var3.b(Integer.toString(var11), 500, var8, var10, -1);
                      var13 = 180;
                      L4: while (true) {
                        if (var13 >= 500) {
                          var2 = "";
                          var8 += 21;
                          var9++;
                          continue L2;
                        } else {
                          gb.b(var13, 1 + var8, 1, 1);
                          var13 += 2;
                          continue L4;
                        }
                      }
                    } else {
                      var8 += 21;
                      var9++;
                      continue L2;
                    }
                  }
                }
              } else {
                var2 = qi.field_e;
                break L0;
              }
            }
          } else {
            var2 = bh.field_n;
            break L0;
          }
        }
        L5: {
          var4 = 115 - (-var3.field_H - 105);
          var3.a(var2, 320, var4, 0, -1);
          if (param0 == -1) {
            break L5;
          } else {
            this.d(73);
            break L5;
          }
        }
        L6: {
          if (!qh.c((byte) 32)) {
            discarded$2 = ve.field_d.a(qi.field_a, 195, -31 + ia.field_j[2], 250, 100, 0, -1, 1, 0, ve.field_d.field_N);
            break L6;
          } else {
            discarded$3 = var3.a(sc.field_b, 190, ia.field_j[2] + -120, 260, 100, 0, -1, 1, 0, var3.field_N);
            break L6;
          }
        }
    }

    private final void b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          L1: {
            var3 = (-je.field_O[3].field_w + 640) / param0;
            var4 = (480 - je.field_O[3].field_t) / 2;
            var4 += 50;
            var5 = param1 % je.field_O.length;
            if (var5 == 0) {
              break L1;
            } else {
              if ((var5 ^ -1) == -2) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          var4 += 180;
          break L0;
        }
        je.field_O[var5].b(var3, var4, 16, 13089168);
    }

    final void e(int param0) {
        int discarded$1 = 0;
        int var2 = 0;
        int var3 = 0;
        var3 = fleas.field_A ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          if (b.field_d.length <= var2) {
            L1: {
              if (param0 == -400) {
                break L1;
              } else {
                discarded$1 = this.b((byte) -118, -47);
                break L1;
              }
            }
            return;
          } else {
            L2: {
              b.field_d[var2] = b.field_d[var2] + (2 + var2);
              if (-641 <= (b.field_d[var2] + (2 + var2) ^ -1)) {
                break L2;
              } else {
                b.field_d[var2] = -400;
                h.field_g[var2] = je.field_O[this.b(param0 + 399)];
                break L2;
              }
            }
            hd.field_h[var2] = hd.field_h[var2] - (2 + var2);
            if (399 < (hd.field_h[var2] - (2 + var2) ^ -1)) {
              hd.field_h[var2] = 1040;
              ua.field_tb[var2] = je.field_O[this.b(df.a(param0, 399))];
              var2++;
              continue L0;
            } else {
              var2++;
              continue L0;
            }
          }
        }
    }

    private final int b(byte param0, int param1) {
        if (2 == this.field_i) {
            if (!qh.c((byte) 73)) {
                if ((param1 ^ -1) > -4) {
                    return ia.field_t[this.field_i] - -(180 * param1);
                }
                return 180 + ia.field_t[this.field_i];
            }
        }
        if ((this.field_i ^ -1) == -4) {
            return ia.field_t[this.field_i] + param1 * 160;
        }
        if (param0 != -13) {
            this.field_b = (pl) null;
        }
        return ia.field_t[this.field_i];
    }

    private final void a(boolean param0) {
        int discarded$1 = 0;
        int var2 = 0;
        fa stackIn_1_0 = null;
        fa stackIn_2_0 = null;
        fa stackIn_3_0 = null;
        String stackIn_3_1 = null;
        fa stackOut_0_0 = null;
        fa stackOut_2_0 = null;
        String stackOut_2_1 = null;
        fa stackOut_1_0 = null;
        String stackOut_1_1 = null;
        L0: {
          var2 = 150;
          tl.field_p.b(bh.field_u[0], 320, var2 - -(2 * tl.field_p.field_N), 0, -1, ni.field_j / 3);
          stackOut_0_0 = tl.field_p;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!qh.c((byte) 111)) {
            stackOut_2_0 = (fa) ((Object) stackIn_2_0);
            stackOut_2_1 = bh.field_u[1];
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = (fa) ((Object) stackIn_1_0);
            stackOut_1_1 = nc.field_b;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          ((fa) (Object) stackIn_3_0).b(stackIn_3_1, 320, var2 + (int)((double)tl.field_p.field_N * 3.5), 0, -1, ni.field_j / 3);
          jj.field_P.d((640 + -jj.field_P.field_w) / 2, var2 - -(tl.field_p.field_N * 4));
          tl.field_p.a(hm.field_h + wi.field_b, 320, 200 + var2, 0, -1);
          ca.field_L.a(50, 100, 0, -4575, 380);
          fb.field_a.a(50, 100, 0, -4575, 380);
          mg.field_b.a(50, 100, 0, -4575, 380);
          cm.field_i.a(50, 100, 540, -4575, 380);
          th.field_z.a(50, 100, 540, -4575, 380);
          mf.field_e.a(50, 100, 540, -4575, 380);
          ca.field_L.a(1);
          fb.field_a.a(1);
          mg.field_b.a(1);
          cm.field_i.a(1);
          th.field_z.a(1);
          mf.field_e.a(1);
          if (!param0) {
            break L1;
          } else {
            discarded$1 = this.a(24, -60, (byte) 102);
            break L1;
          }
        }
    }

    private final void c(int param0) {
        int discarded$2 = 0;
        int discarded$3 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        String var9 = null;
        fa var10 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          var10 = tl.field_p;
          if (param0 == 2758) {
            break L0;
          } else {
            this.field_e = -80;
            break L0;
          }
        }
        L1: {
          if (qh.c((byte) 94)) {
            L2: {
              var3 = 150 + var10.field_N;
              var4 = var10.field_K + (var10.field_y - -4);
              if (fleas.field_L == 0) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = 1;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            L3: {
              var5 = stackIn_7_0;
              if (wi.field_b == 0) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = 1;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            L4: {
              var6 = stackIn_10_0;
              if (hj.field_a[1] == 0) {
                if (-1 != (hj.field_a[0] ^ -1)) {
                  stackOut_14_0 = 1;
                  stackIn_16_0 = stackOut_14_0;
                  break L4;
                } else {
                  stackOut_13_0 = 0;
                  stackIn_16_0 = stackOut_13_0;
                  break L4;
                }
              } else {
                stackOut_11_0 = 1;
                stackIn_16_0 = stackOut_11_0;
                break L4;
              }
            }
            L5: {
              var7 = stackIn_16_0;
              var8 = vi.a(param0 ^ -2780, var6 != 0, var5 != 0, var7 != 0);
              if (var8 != null) {
                break L5;
              } else {
                var8 = "";
                break L5;
              }
            }
            var9 = jj.field_X + " " + var8;
            discarded$2 = var10.a(var9, 165, -100 + var3, 310, 215, 0, -1, 1, 2, var10.field_N);
            var10.a(kf.a(var6 != 0, -121, var7 != 0, var5 != 0), 320, 90 + (var3 - -(3 * var4) - -10), 0, -1);
            discarded$3 = var10.a(ic.a(param0 + -2634, var6 != 0, var7 != 0, var5 != 0), 160, 90 + var4 * 4 + (var3 - -10), 320, 100, 0, -1, 1, 0, var10.field_N);
            break L1;
          } else {
            var10.a(nc.field_b, 320, 240, 0, -1);
            ca.field_L.a(50, 100, 0, param0 + -7333, 380);
            fb.field_a.a(50, 100, 0, param0 ^ -6937, 380);
            mg.field_b.a(50, 100, 0, -4575, 380);
            cm.field_i.a(50, 100, 540, param0 + -7333, 380);
            th.field_z.a(50, 100, 540, -4575, 380);
            mf.field_e.a(50, 100, 540, -4575, 380);
            ca.field_L.a(1);
            fb.field_a.a(1);
            mg.field_b.a(1);
            cm.field_i.a(1);
            th.field_z.a(1);
            mf.field_e.a(1);
            break L1;
          }
        }
    }

    private final void a(boolean param0, byte param1) {
        int discarded$5 = 0;
        int discarded$6 = 0;
        int discarded$7 = 0;
        int discarded$8 = 0;
        int incrementValue$9 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        int var13 = 0;
        int var14 = 0;
        fa var15 = null;
        int stackIn_5_0 = 0;
        dd stackIn_15_0 = null;
        int stackIn_51_0 = 0;
        fa stackIn_52_0 = null;
        fa stackIn_53_0 = null;
        fa stackIn_54_0 = null;
        String stackIn_54_1 = null;
        fa stackIn_55_0 = null;
        String stackIn_55_1 = null;
        int stackIn_55_2 = 0;
        int stackIn_55_3 = 0;
        fa stackIn_56_0 = null;
        String stackIn_56_1 = null;
        int stackIn_56_2 = 0;
        int stackIn_56_3 = 0;
        fa stackIn_57_0 = null;
        String stackIn_57_1 = null;
        int stackIn_57_2 = 0;
        int stackIn_57_3 = 0;
        int stackIn_57_4 = 0;
        dd stackIn_67_0 = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_49_0 = 0;
        fa stackOut_51_0 = null;
        fa stackOut_53_0 = null;
        String stackOut_53_1 = null;
        fa stackOut_52_0 = null;
        String stackOut_52_1 = null;
        fa stackOut_54_0 = null;
        String stackOut_54_1 = null;
        int stackOut_54_2 = 0;
        int stackOut_54_3 = 0;
        fa stackOut_56_0 = null;
        String stackOut_56_1 = null;
        int stackOut_56_2 = 0;
        int stackOut_56_3 = 0;
        int stackOut_56_4 = 0;
        fa stackOut_55_0 = null;
        String stackOut_55_1 = null;
        int stackOut_55_2 = 0;
        int stackOut_55_3 = 0;
        int stackOut_55_4 = 0;
        dd stackOut_66_0 = null;
        dd stackOut_65_0 = null;
        dd stackOut_14_0 = null;
        dd stackOut_13_0 = null;
        L0: {
          var14 = fleas.field_A ? 1 : 0;
          if (param1 > 2) {
            break L0;
          } else {
            discarded$5 = this.a(-16, 3, (byte) 34);
            break L0;
          }
        }
        L1: {
          var15 = tl.field_p;
          var4 = 164;
          var5 = 110;
          this.b(2, ae.field_e);
          og.a(var5 + -pd.field_k[0].field_r, pd.field_k, 91, var4 + -pd.field_k[0].field_x, pd.field_k[6].field_r + (pd.field_k[0].field_r + 80) - 8, 312 - (-pd.field_k[0].field_x + -pd.field_k[2].field_x));
          if (!param0) {
            stackOut_4_0 = kh.field_b;
            stackIn_5_0 = stackOut_4_0;
            break L1;
          } else {
            stackOut_3_0 = fleas.field_L;
            stackIn_5_0 = stackOut_3_0;
            break L1;
          }
        }
        var6 = stackIn_5_0;
        var7 = 0;
        var8 = -1;
        var9 = 0;
        L2: while (true) {
          if (var9 >= wa.field_f.length) {
            var9 = 0;
            L3: while (true) {
              if (-3 >= (var9 ^ -1)) {
                L4: {
                  if ((this.field_f ^ -1) <= -1) {
                    var8 = this.field_f;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (0 != (var8 ^ -1)) {
                    L6: {
                      var9 = var15.field_N;
                      var15.a(wa.field_f[var8], 320, 230, 0, -1);
                      if (0 == (var6 & 1 << var8)) {
                        stackOut_50_0 = 0;
                        stackIn_51_0 = stackOut_50_0;
                        break L6;
                      } else {
                        stackOut_49_0 = 1;
                        stackIn_51_0 = stackOut_49_0;
                        break L6;
                      }
                    }
                    L7: {
                      var10 = stackIn_51_0;
                      stackOut_51_0 = lk.field_Q;
                      stackIn_53_0 = stackOut_51_0;
                      stackIn_52_0 = stackOut_51_0;
                      if (var10 != 0) {
                        stackOut_53_0 = (fa) ((Object) stackIn_53_0);
                        stackOut_53_1 = vk.field_M;
                        stackIn_54_0 = stackOut_53_0;
                        stackIn_54_1 = stackOut_53_1;
                        break L7;
                      } else {
                        stackOut_52_0 = (fa) ((Object) stackIn_52_0);
                        stackOut_52_1 = jk.field_i;
                        stackIn_54_0 = stackOut_52_0;
                        stackIn_54_1 = stackOut_52_1;
                        break L7;
                      }
                    }
                    L8: {
                      stackOut_54_0 = (fa) ((Object) stackIn_54_0);
                      stackOut_54_1 = (String) ((Object) stackIn_54_1);
                      stackOut_54_2 = 320;
                      stackOut_54_3 = lk.field_Q.field_N + 225;
                      stackIn_56_0 = stackOut_54_0;
                      stackIn_56_1 = stackOut_54_1;
                      stackIn_56_2 = stackOut_54_2;
                      stackIn_56_3 = stackOut_54_3;
                      stackIn_55_0 = stackOut_54_0;
                      stackIn_55_1 = stackOut_54_1;
                      stackIn_55_2 = stackOut_54_2;
                      stackIn_55_3 = stackOut_54_3;
                      if (var10 == 0) {
                        stackOut_56_0 = (fa) ((Object) stackIn_56_0);
                        stackOut_56_1 = (String) ((Object) stackIn_56_1);
                        stackOut_56_2 = stackIn_56_2;
                        stackOut_56_3 = stackIn_56_3;
                        stackOut_56_4 = 8388608;
                        stackIn_57_0 = stackOut_56_0;
                        stackIn_57_1 = stackOut_56_1;
                        stackIn_57_2 = stackOut_56_2;
                        stackIn_57_3 = stackOut_56_3;
                        stackIn_57_4 = stackOut_56_4;
                        break L8;
                      } else {
                        stackOut_55_0 = (fa) ((Object) stackIn_55_0);
                        stackOut_55_1 = (String) ((Object) stackIn_55_1);
                        stackOut_55_2 = stackIn_55_2;
                        stackOut_55_3 = stackIn_55_3;
                        stackOut_55_4 = 24576;
                        stackIn_57_0 = stackOut_55_0;
                        stackIn_57_1 = stackOut_55_1;
                        stackIn_57_2 = stackOut_55_2;
                        stackIn_57_3 = stackOut_55_3;
                        stackIn_57_4 = stackOut_55_4;
                        break L8;
                      }
                    }
                    ((fa) (Object) stackIn_57_0).a(stackIn_57_1, stackIn_57_2, stackIn_57_3, stackIn_57_4, -1);
                    var11 = 200;
                    var11 += 60;
                    discarded$6 = lk.field_Q.a(ij.field_J[var8], 100, var11, 320, 100, 0, -1, 0, 0, lk.field_Q.field_N + -7);
                    var12 = ii.field_a + 100 * rf.field_c[var8];
                    var4 = 100;
                    var15.c(var12, 100, ia.field_j[4] - (int)((double)var15.field_N * 1.5), 0, -1);
                    var11 = var11 + var9;
                    var15.c(me.field_e, 100, -(int)(0.5 * (double)var15.field_N) + ia.field_j[4], 0, -1);
                    var4 = var4 + var15.b(me.field_e);
                    var13 = 0;
                    L9: while (true) {
                      if (rf.field_c[var8] <= var13) {
                        if (var10 == 0) {
                          if (0 >= wc.field_q) {
                            L10: {
                              if (!rh.field_j[var8]) {
                                stackOut_66_0 = cb.field_u;
                                stackIn_67_0 = stackOut_66_0;
                                break L10;
                              } else {
                                stackOut_65_0 = mf.field_g;
                                stackIn_67_0 = stackOut_65_0;
                                break L10;
                              }
                            }
                            ((dd) (Object) stackIn_67_0).d(420, 252);
                            break L5;
                          } else {
                            cb.field_u.d(420, 252);
                            break L5;
                          }
                        } else {
                          il.field_d[var8].d(420, 252);
                          break L5;
                        }
                      } else {
                        vb.field_a.d(var4, ia.field_j[4] - (-var15.field_K + var15.field_N) - (var15.field_H - (int)((double)var15.field_N * 0.5)));
                        var4 = var4 + vb.field_a.field_w / 3;
                        var13++;
                        continue L9;
                      }
                    }
                  } else {
                    discarded$7 = var15.a(al.field_d, 165, 200, 310, 100, 0, -1, 1, 0, var15.field_N);
                    if (!qh.c((byte) 90)) {
                      break L5;
                    } else {
                      discarded$8 = var15.a(sc.field_b, 165, 280, 310, 100, 0, -1, 1, 0, var15.field_N);
                      break L5;
                    }
                  }
                }
                return;
              } else {
                gb.b(100, var9 * 2 + 200, 440, 1);
                var9++;
                continue L3;
              }
            }
          } else {
            L11: {
              if ((var6 & 1 << var9) != 0) {
                il.field_d[var9].c(var4, var5);
                break L11;
              } else {
                if (!param0) {
                  L12: {
                    L13: {
                      if (wc.field_q > 0) {
                        break L13;
                      } else {
                        if (rh.field_j[var9]) {
                          stackOut_14_0 = mf.field_g;
                          stackIn_15_0 = stackOut_14_0;
                          break L12;
                        } else {
                          break L13;
                        }
                      }
                    }
                    stackOut_13_0 = cb.field_u;
                    stackIn_15_0 = stackOut_13_0;
                    break L12;
                  }
                  ((dd) (Object) stackIn_15_0).c(var4, var5);
                  break L11;
                } else {
                  var9++;
                  continue L2;
                }
              }
            }
            L14: {
              if (ag.field_f < var4) {
                break L14;
              } else {
                if (32 + var4 < ag.field_f) {
                  break L14;
                } else {
                  if (kc.field_b < var5) {
                    break L14;
                  } else {
                    if (32 + var5 >= kc.field_b) {
                      gb.d(-3 + var4, var5 + -3, 37, 37, 6, 8421504);
                      var8 = var9;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                }
              }
            }
            L15: {
              if (this.field_g < var4) {
                break L15;
              } else {
                if (32 + var4 < this.field_g) {
                  break L15;
                } else {
                  if (this.field_e < var5) {
                    break L15;
                  } else {
                    if (var5 - -32 >= this.field_e) {
                      L16: {
                        if (var9 == this.field_f) {
                          this.field_f = -1;
                          break L16;
                        } else {
                          this.field_f = var9;
                          break L16;
                        }
                      }
                      this.field_g = -1;
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                }
              }
            }
            L17: {
              if (this.field_f == var9) {
                gb.d(var4 - 3, -3 + var5, 37, 37, 6, 16777215);
                break L17;
              } else {
                break L17;
              }
            }
            incrementValue$9 = var7;
            var7++;
            if ((incrementValue$9 ^ -1) != -8) {
              var4 += 40;
              var9++;
              continue L2;
            } else {
              var7 = 0;
              var4 = 164;
              var5 += 40;
              var9++;
              continue L2;
            }
          }
        }
    }

    final void f(int param0) {
        int var2_int = 0;
        Object var2 = null;
        dd var2_ref = null;
        Object var3 = null;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        int stackIn_71_2 = 0;
        Object stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        int stackIn_72_2 = 0;
        Object stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        int stackIn_73_2 = 0;
        int stackIn_73_3 = 0;
        Object stackOut_70_0 = null;
        int stackOut_70_1 = 0;
        int stackOut_70_2 = 0;
        Object stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        int stackOut_72_2 = 0;
        int stackOut_72_3 = 0;
        Object stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        int stackOut_71_2 = 0;
        int stackOut_71_3 = 0;
        L0: {
          var5 = fleas.field_A ? 1 : 0;
          rh.field_c.field_a = 100;
          if (this.field_i == 1) {
            fc.c(param0 ^ 124);
            gb.d(0, 0, 640, 480);
            break L0;
          } else {
            qi.field_c.f(0, 0);
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= h.field_g.length) {
                break L0;
              } else {
                h.field_g[var2_int].d(b.field_d[var2_int], 200 + var2_int * 5);
                ua.field_tb[var2_int].g(hd.field_h[var2_int], 200 + 5 * var2_int);
                var2_int++;
                continue L1;
              }
            }
          }
        }
        L2: {
          L3: {
            var2 = null;
            var3 = null;
            var4 = this.field_i;
            if (-1 != (var4 ^ -1)) {
              if (-2 != var4) {
                if (1 != var4) {
                  if (var4 != 10) {
                    if (8 == var4) {
                      var2_ref = a.field_f;
                      break L2;
                    } else {
                      if (-4 != (var4 ^ -1)) {
                        if (2 == var4) {
                          var2_ref = va.field_g;
                          var3 = uh.field_k;
                          break L2;
                        } else {
                          L4: {
                            if (4 != var4) {
                              if ((var4 ^ -1) == -6) {
                                break L4;
                              } else {
                                if (-7 != (var4 ^ -1)) {
                                  if (9 != var4) {
                                    var3 = null;
                                    var2_ref = null;
                                    break L2;
                                  } else {
                                    var2_ref = lc.field_t;
                                    var3 = uh.field_k;
                                    break L2;
                                  }
                                } else {
                                  var3 = uh.field_k;
                                  var2_ref = de.field_a;
                                  break L2;
                                }
                              }
                            } else {
                              break L4;
                            }
                          }
                          var2_ref = fg.field_j;
                          var3 = ek.field_c;
                          break L2;
                        }
                      } else {
                        var2_ref = aj.field_v;
                        var3 = ek.field_c;
                        break L2;
                      }
                    }
                  } else {
                    L5: {
                      if (pl.field_l[fleas.field_E] / 3 > tj.field_a) {
                        var3 = f.field_E;
                        break L5;
                      } else {
                        if (tj.field_a < pl.field_l[fleas.field_E] * 2 / 3) {
                          var3 = me.field_g;
                          break L5;
                        } else {
                          var3 = tk.field_s;
                          break L5;
                        }
                      }
                    }
                    var2_ref = db.field_I;
                    break L2;
                  }
                } else {
                  break L3;
                }
              } else {
                break L3;
              }
            } else {
              break L3;
            }
          }
          var2_ref = de.field_a;
          break L2;
        }
        L6: {
          if (var3 == null) {
            break L6;
          } else {
            ((dd) (var3)).d((-((dd) (var3)).field_x + 640) / 2, 45);
            break L6;
          }
        }
        L7: {
          if ((this.field_i ^ -1) == -2) {
            break L7;
          } else {
            if ((this.field_i ^ -1) != -8) {
              si.field_C.d(0, 0);
              break L7;
            } else {
              break L7;
            }
          }
        }
        L8: {
          if (param0 == 2) {
            break L8;
          } else {
            field_a = 76;
            break L8;
          }
        }
        L9: {
          if (var2_ref == null) {
            break L9;
          } else {
            var2_ref.d((-var2_ref.field_x + 640) / 2, 10);
            break L9;
          }
        }
        L10: {
          if (-3 == (this.field_i ^ -1)) {
            this.d(-1);
            break L10;
          } else {
            if (this.field_i != 3) {
              if ((this.field_i ^ -1) == -5) {
                this.a(false, (byte) 60);
                break L10;
              } else {
                if (-6 == (this.field_i ^ -1)) {
                  this.a(true, (byte) 116);
                  break L10;
                } else {
                  if ((this.field_i ^ -1) == -7) {
                    this.c(2758);
                    break L10;
                  } else {
                    if ((this.field_i ^ -1) != -8) {
                      if (8 != this.field_i) {
                        if (this.field_i != 10) {
                          if (this.field_i != 9) {
                            break L10;
                          } else {
                            this.a(false);
                            break L10;
                          }
                        } else {
                          this.h(param0 ^ 98);
                          break L10;
                        }
                      } else {
                        this.a(-25155);
                        break L10;
                      }
                    } else {
                      ed.c(param0 ^ -110);
                      return;
                    }
                  }
                }
              }
            } else {
              this.c((byte) -123);
              break L10;
            }
          }
        }
        var4 = 0;
        L11: while (true) {
          if (this.field_b.field_m <= var4) {
            return;
          } else {
            if (this.a((byte) 120, var4)) {
              L12: {
                stackOut_70_0 = this;
                stackOut_70_1 = -1;
                stackOut_70_2 = var4;
                stackIn_72_0 = stackOut_70_0;
                stackIn_72_1 = stackOut_70_1;
                stackIn_72_2 = stackOut_70_2;
                stackIn_71_0 = stackOut_70_0;
                stackIn_71_1 = stackOut_70_1;
                stackIn_71_2 = stackOut_70_2;
                if (var4 != this.field_b.field_k) {
                  stackOut_72_0 = this;
                  stackOut_72_1 = stackIn_72_1;
                  stackOut_72_2 = stackIn_72_2;
                  stackOut_72_3 = 0;
                  stackIn_73_0 = stackOut_72_0;
                  stackIn_73_1 = stackOut_72_1;
                  stackIn_73_2 = stackOut_72_2;
                  stackIn_73_3 = stackOut_72_3;
                  break L12;
                } else {
                  stackOut_71_0 = this;
                  stackOut_71_1 = stackIn_71_1;
                  stackOut_71_2 = stackIn_71_2;
                  stackOut_71_3 = 1;
                  stackIn_73_0 = stackOut_71_0;
                  stackIn_73_1 = stackOut_71_1;
                  stackIn_73_2 = stackOut_71_2;
                  stackIn_73_3 = stackOut_71_3;
                  break L12;
                }
              }
              this.a(stackIn_73_1, stackIn_73_2, stackIn_73_3 != 0);
              var4++;
              continue L11;
            } else {
              var4++;
              continue L11;
            }
          }
        }
    }

    private final int a(int param0, int param1) {
        if (-3 == (this.field_i ^ -1)) {
            if (!(qh.c((byte) 32))) {
                return 165 + this.b((byte) -13, param0);
            }
        }
        if (param1 != -19631) {
            this.a(52);
        }
        if (!(3 != this.field_i)) {
            return 150 + this.b((byte) -13, param0);
        }
        return ia.field_l[this.field_i];
    }

    private final int c(int param0, int param1) {
        if (param1 != 1205) {
            this.field_e = -69;
        }
        return 30;
    }

    private final void a(int param0) {
        int discarded$2 = 0;
        int discarded$3 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        kh var8 = null;
        int var9_int = 0;
        fa var9 = null;
        String var10 = null;
        int var11 = 0;
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          var11 = fleas.field_A ? 1 : 0;
          og.a(rh.field_c.field_a + 22, ad.field_b, 93, -4 + rh.field_c.field_l, rh.field_c.field_d - 17, rh.field_c.field_n + 9);
          rh.field_c.c(-1);
          if (rh.field_c.field_i) {
            gb.e(rh.field_c.field_l, rh.field_c.field_D.field_N + rh.field_c.field_a, rh.field_c.field_n + 1, rh.field_c.field_d + -rh.field_c.field_D.field_N - -1, 32928, 256);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (rh.field_c.field_x > hj.field_a[fleas.field_E]) {
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = 1;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var2 = stackIn_6_0;
          var3 = 0;
          if (-1 != (fleas.field_E ^ -1)) {
            break L2;
          } else {
            if (-16 < (rh.field_c.field_x ^ -1)) {
              break L2;
            } else {
              L3: {
                if (qh.c((byte) 36)) {
                  break L3;
                } else {
                  if (-1 <= (wc.field_q ^ -1)) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              var2 = 0;
              var3 = 1;
              break L2;
            }
          }
        }
        L4: {
          var4 = rh.field_c.field_l + rh.field_c.field_n - -20;
          var5 = rh.field_c.field_D.field_N + rh.field_c.field_a;
          var6 = fl.field_b.field_w / 4;
          var7 = fl.field_b.field_t / 4;
          og.a(var5 - 6, ad.field_b, param0 + 25267, -6 + var4, rh.field_c.field_d + -17, pf.field_a.field_w - -12);
          if (null == fl.field_b) {
            break L4;
          } else {
            L5: {
              var8_int = -(mf.field_g.field_x / 4) + var6 / 2 + (var4 + 13);
              var9_int = -(mf.field_g.field_t / 4) + var5 + 14 + var7 / 2;
              if (var2 == 0) {
                gb.e(var4 - -13, var5 - -14, var6, var7, 1);
                tl.field_p.a(fc.field_b, 25 + var4 - -13, 30 + var5 - -14, 0, -1);
                tl.field_p.a(fc.field_b, var6 + var4 - 12, -15 + (var5 - (-var7 - 14)), 0, -1);
                cb.field_u.e(var8_int, var9_int);
                break L5;
              } else {
                fl.field_b.c(var4 - -13, var5 - -14);
                break L5;
              }
            }
            L6: {
              if (var3 == 0) {
                break L6;
              } else {
                mf.field_g.e(var8_int, var9_int);
                break L6;
              }
            }
            pf.field_a.d(var4, var5);
            var5 = var5 + (20 + var7);
            break L4;
          }
        }
        if (param0 == -25155) {
          L7: {
            var6 = pf.field_a.field_w;
            var5 += 15;
            var8 = ia.field_m[fleas.field_E][rh.field_c.field_x];
            rd.field_e.d(-(rd.field_e.field_x / 2) + (var6 / 2 + var4), var5);
            if (-398 >= (rh.field_c.field_d + rh.field_c.field_a ^ -1)) {
              rd.field_e.b(var6 / 2 + (var4 - rd.field_e.field_x / 2), -20 + (rh.field_c.field_d + rh.field_c.field_a));
              break L7;
            } else {
              break L7;
            }
          }
          L8: {
            var9 = lk.field_Q;
            var5 = var5 + (20 + var9.field_N);
            var9.a(rh.field_c.field_z[rh.field_c.field_x], var4 + var6 / 2, var5, 1, -1);
            if (var2 != 0) {
              var5 = var5 + (var9.field_N + 15);
              var9.a(db.a(kl.field_b, new String[]{Integer.toString((int) var8.field_f)}, true), var4 + var6 / 2, var5, 1, -1);
              var5 = var5 + var9.field_N;
              var9.a(db.a(fleas.field_H, new String[]{Integer.toString((int) var8.field_e)}, true), var4 + var6 / 2, var5, 1, -1);
              break L8;
            } else {
              L9: {
                var10 = ej.field_b;
                var5 += 10;
                if (var3 != 0) {
                  var10 = ri.field_u;
                  break L9;
                } else {
                  break L9;
                }
              }
              discarded$2 = ve.field_d.a(var10, var4 + 5, var5, -10 + var6, var7, 1, -1, 0, 0, ve.field_d.field_N);
              if (!qh.c((byte) 125)) {
                break L8;
              } else {
                var5 = var5 + ve.field_d.field_N * 3;
                discarded$3 = ve.field_d.a(pc.field_m, var4 + 5, var5, -10 + var6, var7, 1, -1, 0, 0, ve.field_d.field_N);
                break L8;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    private final int b(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = fleas.field_A ? 1 : 0;
        var2 = param0;
        L0: while (true) {
          L1: {
            if ((var2 ^ -1) >= -1) {
              break L1;
            } else {
              if (h.field_g[0] == je.field_O[var2]) {
                break L1;
              } else {
                if (h.field_g[1] == je.field_O[var2]) {
                  break L1;
                } else {
                  if (ua.field_tb[0] == je.field_O[var2]) {
                    break L1;
                  } else {
                    if (ua.field_tb[1] != je.field_O[var2]) {
                      return var2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
          }
          var2 = db.a((byte) -115, fleas.field_F, je.field_O.length);
          continue L0;
        }
    }

    private final void a(int param0, int param1, boolean param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        dd[] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        fa var17 = null;
        fa var18 = null;
        int stackIn_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        L0: {
          var16 = fleas.field_A ? 1 : 0;
          var17 = tl.field_p;
          var18 = var17;
          var5 = this.a(param1, (byte) 118);
          var6 = this.b((byte) -13, param1);
          var7 = ia.field_p[this.field_i][param1];
          var8 = pa.field_i[var7];
          if (var8 == null) {
            var8 = "ERROR: missing text";
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var9 = this.a(param1, -19631) + -var6;
          var10 = this.c(param1, 1205) - -2;
          var11 = ta.field_z;
          if (param2) {
            var11 = a.field_b;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (8 > var7) {
            break L2;
          } else {
            if (var7 > 10) {
              break L2;
            } else {
              if (param1 == nb.field_g) {
                var11 = gj.field_E;
                break L2;
              } else {
                break L2;
              }
            }
          }
        }
        L3: {
          if (6 == this.field_i) {
            var6 = var6 + var9 / 2;
            var9 = 20 + var18.b(var8);
            var6 = var6 - var9 / 2;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          og.a(var5, var11, 86, var6, var10, var9);
          if (!param2) {
            stackOut_16_0 = 0;
            stackIn_17_0 = stackOut_16_0;
            break L4;
          } else {
            stackOut_15_0 = 1;
            stackIn_17_0 = stackOut_15_0;
            break L4;
          }
        }
        L5: {
          var12 = stackIn_17_0;
          if (-20 != (var7 ^ -1)) {
            break L5;
          } else {
            if (!lk.field_D.field_k) {
              break L5;
            } else {
              var12 = 2;
              break L5;
            }
          }
        }
        if (param0 == -1) {
          L6: {
            var13 = 0;
            if (ta.field_z == null) {
              break L6;
            } else {
              var13 = -var17.field_K + (var10 + -ta.field_z[0].field_r - ta.field_z[6].field_r) - var18.field_H;
              break L6;
            }
          }
          L7: {
            var14 = 0;
            if (ta.field_z == null) {
              break L7;
            } else {
              if (ta.field_z[0] != null) {
                var14 = ta.field_z[0].field_r;
                break L7;
              } else {
                break L7;
              }
            }
          }
          L8: {
            var15 = var18.field_H + var5 + (var14 - -(var13 >> 294124705));
            var15 -= 3;
            if (var7 == 12) {
              f.field_G.field_l = (-ia.field_t[this.field_i] + ia.field_l[this.field_i]) / 2 + (-20 + ia.field_t[this.field_i]);
              f.field_G.field_a = var15 - 13;
              f.field_G.c((byte) 72);
              f.field_G.field_w.field_v = 6;
              var18.b(var8, f.field_G.field_l, var15, var12, -1);
              break L8;
            } else {
              if (13 == var7) {
                cb.field_w.field_l = (-ia.field_t[this.field_i] + ia.field_l[this.field_i]) / 2 + ia.field_t[this.field_i] + -20;
                cb.field_w.field_a = var15 + -13;
                cb.field_w.c((byte) 72);
                var18.b(var8, cb.field_w.field_l, var15, var12, -1);
                break L8;
              } else {
                var18.a(var8, var6 + (var9 >> 275615969), var15, var12, -1);
                break L8;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    private final void a(boolean param0, byte param1, int param2) {
        pd discarded$3 = null;
        pd discarded$4 = null;
        pd discarded$5 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var11 = null;
        int stackIn_48_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_124_0 = 0;
        int stackIn_131_0 = 0;
        int stackIn_150_0 = 0;
        int stackIn_175_0 = 0;
        int stackIn_187_0 = 0;
        int stackIn_190_0 = 0;
        int stackOut_149_0 = 0;
        int stackOut_148_0 = 0;
        int stackOut_174_0 = 0;
        int stackOut_173_0 = 0;
        int stackOut_186_0 = 0;
        int stackOut_185_0 = 0;
        int stackOut_189_0 = 0;
        int stackOut_188_0 = 0;
        int stackOut_123_0 = 0;
        int stackOut_122_0 = 0;
        int stackOut_129_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        L0: {
          var7 = fleas.field_A ? 1 : 0;
          if (param1 < -24) {
            break L0;
          } else {
            this.a(-100, 39, false);
            break L0;
          }
        }
        L1: {
          var5 = ia.field_p[this.field_i][param2];
          if (!this.field_b.b(120)) {
            break L1;
          } else {
            if ((var5 ^ -1) == -13) {
              break L1;
            } else {
              if (-14 != (var5 ^ -1)) {
                discarded$3 = ik.a(wj.field_b[0], (byte) -84);
                break L1;
              } else {
                break L1;
              }
            }
          }
        }
        L2: {
          L3: {
            var6 = var5;
            if (var6 != 0) {
              if (21 == var6) {
                break L3;
              } else {
                if (1 != var6) {
                  if (-6 == (var6 ^ -1)) {
                    if (this.field_b.b(111)) {
                      oa.a(0, param0, -79);
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    if (16 != var6) {
                      if ((var6 ^ -1) != -15) {
                        if (-4 != (var6 ^ -1)) {
                          if (-7 == (var6 ^ -1)) {
                            if (!this.field_b.b(-64)) {
                              break L2;
                            } else {
                              oa.a(bj.field_m, param0, 14);
                              break L2;
                            }
                          } else {
                            if (var6 == 2) {
                              if (this.field_b.b(125)) {
                                oa.a(2, param0, -127);
                                break L2;
                              } else {
                                break L2;
                              }
                            } else {
                              if (-13 != (var6 ^ -1)) {
                                if (-14 == (var6 ^ -1)) {
                                  L4: {
                                    var4 = th.field_D;
                                    if (!this.field_b.g(-115)) {
                                      break L4;
                                    } else {
                                      lg.a(-104, 0);
                                      break L4;
                                    }
                                  }
                                  L5: {
                                    if (this.field_b.a((byte) -29)) {
                                      lg.a(-99, 256);
                                      break L5;
                                    } else {
                                      break L5;
                                    }
                                  }
                                  L6: {
                                    if (!this.field_b.e(96)) {
                                      break L6;
                                    } else {
                                      nc.a((byte) -102);
                                      break L6;
                                    }
                                  }
                                  L7: {
                                    if (!this.field_b.a(-23670)) {
                                      break L7;
                                    } else {
                                      pa.a((byte) 93);
                                      break L7;
                                    }
                                  }
                                  L8: {
                                    if (this.field_b.a(false)) {
                                      cb.field_w.c(94);
                                      if (cb.field_w.field_g) {
                                        lg.a(-119, cb.field_w.field_A);
                                        break L8;
                                      } else {
                                        if (cb.field_w.field_l <= ag.field_f) {
                                          lg.a(-107, 256);
                                          break L8;
                                        } else {
                                          lg.a(-118, 0);
                                          break L8;
                                        }
                                      }
                                    } else {
                                      break L8;
                                    }
                                  }
                                  if (var4 == th.field_D) {
                                    break L2;
                                  } else {
                                    cb.field_w.field_A = th.field_D;
                                    discarded$4 = ik.a(wj.field_b[1], (byte) -84);
                                    break L2;
                                  }
                                } else {
                                  if (4 == var6) {
                                    if (!this.field_b.b(119)) {
                                      break L2;
                                    } else {
                                      if (rh.field_p != null) {
                                        lh.a(false);
                                        break L2;
                                      } else {
                                        var6 = param0 ? 1 : 0;
                                        c.a(320, (byte) 78, tl.field_p.field_K + tl.field_p.field_y, a.field_b, 8, 2, tl.field_p, ta.field_z, 240, tl.field_p.field_y, var6 != 0, 8);
                                        break L2;
                                      }
                                    }
                                  } else {
                                    if (-8 != (var6 ^ -1)) {
                                      if (var6 != 8) {
                                        if (9 == var6) {
                                          if (!this.field_b.b(-28)) {
                                            break L2;
                                          } else {
                                            nb.field_g = 1;
                                            break L2;
                                          }
                                        } else {
                                          if ((var6 ^ -1) != -11) {
                                            if (15 == var6) {
                                              if (this.field_b.b(118)) {
                                                L9: {
                                                  if (-5 == (this.field_i ^ -1)) {
                                                    break L9;
                                                  } else {
                                                    if (this.field_i != 2) {
                                                      L10: {
                                                        if (this.field_i == 6) {
                                                          break L10;
                                                        } else {
                                                          if (this.field_i != 9) {
                                                            if (8 != this.field_i) {
                                                              if (-8 != (this.field_i ^ -1)) {
                                                                break L2;
                                                              } else {
                                                                il.a((byte) 77, rl.a((byte) -66));
                                                                break L2;
                                                              }
                                                            } else {
                                                              me.a(this.field_i, this.field_i, false);
                                                              break L2;
                                                            }
                                                          } else {
                                                            break L10;
                                                          }
                                                        }
                                                      }
                                                      L11: {
                                                        if (-1 == (fleas.field_L ^ -1)) {
                                                          stackOut_149_0 = 2;
                                                          stackIn_150_0 = stackOut_149_0;
                                                          break L11;
                                                        } else {
                                                          stackOut_148_0 = 5;
                                                          stackIn_150_0 = stackOut_148_0;
                                                          break L11;
                                                        }
                                                      }
                                                      me.a(stackIn_150_0, 6, false);
                                                      break L2;
                                                    } else {
                                                      break L9;
                                                    }
                                                  }
                                                }
                                                me.a(this.field_i, this.field_i, false);
                                                break L2;
                                              } else {
                                                break L2;
                                              }
                                            } else {
                                              if ((var6 ^ -1) != -18) {
                                                if (-19 != (var6 ^ -1)) {
                                                  if (11 != var6) {
                                                    if ((var6 ^ -1) == -20) {
                                                      if (!this.field_b.b(106)) {
                                                        break L2;
                                                      } else {
                                                        if (!lk.field_D.field_k) {
                                                          L12: {
                                                            cf.a(-25319);
                                                            oa.a(-1, param0, -126);
                                                            if (-1 > (wc.field_q ^ -1)) {
                                                              stackOut_174_0 = 0;
                                                              stackIn_175_0 = stackOut_174_0;
                                                              break L12;
                                                            } else {
                                                              stackOut_173_0 = 7;
                                                              stackIn_175_0 = stackOut_173_0;
                                                              break L12;
                                                            }
                                                          }
                                                          bj.field_m = stackIn_175_0;
                                                          break L2;
                                                        } else {
                                                          break L2;
                                                        }
                                                      }
                                                    } else {
                                                      if (-21 == (var6 ^ -1)) {
                                                        if (this.field_b.b(111)) {
                                                          L13: {
                                                            cm.field_b = null;
                                                            m.field_b = null;
                                                            wi.field_p = new vj();
                                                            tj.field_a = rh.field_c.field_x;
                                                            if (rh.field_c.field_x > hj.field_a[fleas.field_E]) {
                                                              break L13;
                                                            } else {
                                                              if (rh.field_c.a(rh.field_c.field_x, 110)) {
                                                                L14: {
                                                                  ej.a((byte) -39);
                                                                  if (tj.field_a != 0) {
                                                                    stackOut_186_0 = 0;
                                                                    stackIn_187_0 = stackOut_186_0;
                                                                    break L14;
                                                                  } else {
                                                                    stackOut_185_0 = 1;
                                                                    stackIn_187_0 = stackOut_185_0;
                                                                    break L14;
                                                                  }
                                                                }
                                                                L15: {
                                                                  tg.field_g = stackIn_187_0 != 0;
                                                                  oa.a(-1, param0, 45);
                                                                  if ((wc.field_q ^ -1) < -1) {
                                                                    stackOut_189_0 = 0;
                                                                    stackIn_190_0 = stackOut_189_0;
                                                                    break L15;
                                                                  } else {
                                                                    stackOut_188_0 = 7;
                                                                    stackIn_190_0 = stackOut_188_0;
                                                                    break L15;
                                                                  }
                                                                }
                                                                bj.field_m = stackIn_190_0;
                                                                break L2;
                                                              } else {
                                                                break L13;
                                                              }
                                                            }
                                                          }
                                                          if (nb.field_e == rh.field_c.field_z[rh.field_c.field_x]) {
                                                            bj.field_m = this.field_i;
                                                            oa.a(7, param0, 43);
                                                            break L2;
                                                          } else {
                                                            break L2;
                                                          }
                                                        } else {
                                                          break L2;
                                                        }
                                                      } else {
                                                        if (-23 == (var6 ^ -1)) {
                                                          if (!this.field_b.b(-76)) {
                                                            break L2;
                                                          } else {
                                                            L16: {
                                                              if (this.field_i == 9) {
                                                                break L16;
                                                              } else {
                                                                if (6 != this.field_i) {
                                                                  L17: {
                                                                    if (tj.field_a - -1 >= ia.field_m[fleas.field_E].length) {
                                                                      break L17;
                                                                    } else {
                                                                      L18: {
                                                                        if (fleas.field_E != 0) {
                                                                          break L18;
                                                                        } else {
                                                                          if (wc.field_q > 0) {
                                                                            break L18;
                                                                          } else {
                                                                            if (-16 >= (tj.field_a - -1 ^ -1)) {
                                                                              break L17;
                                                                            } else {
                                                                              break L18;
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                      oa.a(-1, param0, 101);
                                                                      break L2;
                                                                    }
                                                                  }
                                                                  L19: {
                                                                    if (qh.c((byte) 109)) {
                                                                      break L19;
                                                                    } else {
                                                                      wi.field_p.a(-1);
                                                                      break L19;
                                                                    }
                                                                  }
                                                                  m.field_b = null;
                                                                  oa.a(9, param0, -93);
                                                                  break L2;
                                                                } else {
                                                                  break L16;
                                                                }
                                                              }
                                                            }
                                                            if (!qh.c((byte) 64)) {
                                                              if (fleas.field_L == 0) {
                                                                oa.a(2, param0, -66);
                                                                break L2;
                                                              } else {
                                                                oa.a(5, param0, 29);
                                                                break L2;
                                                              }
                                                            } else {
                                                              oa.a(6, param0, 81);
                                                              break L2;
                                                            }
                                                          }
                                                        } else {
                                                          break L2;
                                                        }
                                                      }
                                                    }
                                                  } else {
                                                    if (this.field_b.b(108)) {
                                                      L20: {
                                                        if (rh.field_p != null) {
                                                          lh.a(false);
                                                          break L20;
                                                        } else {
                                                          break L20;
                                                        }
                                                      }
                                                      hf.a(rl.a((byte) -51), -80);
                                                      break L2;
                                                    } else {
                                                      break L2;
                                                    }
                                                  }
                                                } else {
                                                  if (!this.field_b.b(125)) {
                                                    break L2;
                                                  } else {
                                                    if (this.a((byte) -94, param2)) {
                                                      g.field_s = g.field_s + 1;
                                                      break L2;
                                                    } else {
                                                      break L2;
                                                    }
                                                  }
                                                }
                                              } else {
                                                if (!this.field_b.b(-23)) {
                                                  break L2;
                                                } else {
                                                  if (this.a((byte) -97, param2)) {
                                                    g.field_s = g.field_s - 1;
                                                    break L2;
                                                  } else {
                                                    break L2;
                                                  }
                                                }
                                              }
                                            }
                                          } else {
                                            if (!this.field_b.b(107)) {
                                              break L2;
                                            } else {
                                              nb.field_g = 2;
                                              break L2;
                                            }
                                          }
                                        }
                                      } else {
                                        if (!this.field_b.b(116)) {
                                          break L2;
                                        } else {
                                          nb.field_g = 0;
                                          break L2;
                                        }
                                      }
                                    } else {
                                      if (!this.field_b.b(-80)) {
                                        break L2;
                                      } else {
                                        L21: {
                                          if (qh.c((byte) 68)) {
                                            L22: {
                                              L23: {
                                                L24: {
                                                  if (qh.c((byte) 72)) {
                                                    break L24;
                                                  } else {
                                                    if (-1 > (wc.field_q ^ -1)) {
                                                      break L23;
                                                    } else {
                                                      break L24;
                                                    }
                                                  }
                                                }
                                                if (pc.a(true)) {
                                                  stackOut_123_0 = 6;
                                                  stackIn_124_0 = stackOut_123_0;
                                                  break L22;
                                                } else {
                                                  break L23;
                                                }
                                              }
                                              stackOut_122_0 = 0;
                                              stackIn_124_0 = stackOut_122_0;
                                              break L22;
                                            }
                                            oa.a(stackIn_124_0, param0, -84);
                                            break L21;
                                          } else {
                                            wi.field_p.a(-1);
                                            m.field_b = null;
                                            if (fleas.field_L == 0) {
                                              oa.a(2, param0, -70);
                                              break L21;
                                            } else {
                                              oa.a(5, param0, 57);
                                              break L21;
                                            }
                                          }
                                        }
                                        if (-1 <= (wc.field_q ^ -1)) {
                                          if (pc.a(true)) {
                                            stackOut_129_0 = 7;
                                            stackIn_131_0 = stackOut_129_0;
                                            bj.field_m = stackIn_131_0;
                                            break L2;
                                          } else {
                                            bj.field_m = 0;
                                            break L2;
                                          }
                                        } else {
                                          bj.field_m = 0;
                                          break L2;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                L25: {
                                  var4 = gf.field_d;
                                  if (!this.field_b.g(-63)) {
                                    break L25;
                                  } else {
                                    ia.a(true, 0);
                                    break L25;
                                  }
                                }
                                L26: {
                                  if (!this.field_b.a((byte) -29)) {
                                    break L26;
                                  } else {
                                    ia.a(true, 256);
                                    break L26;
                                  }
                                }
                                L27: {
                                  if (!this.field_b.e(96)) {
                                    break L27;
                                  } else {
                                    nj.a(-9340);
                                    break L27;
                                  }
                                }
                                L28: {
                                  if (this.field_b.a(-23670)) {
                                    h.a(-32);
                                    break L28;
                                  } else {
                                    break L28;
                                  }
                                }
                                L29: {
                                  if (this.field_b.a(false)) {
                                    f.field_G.c(103);
                                    if (f.field_G.field_g) {
                                      ia.a(true, f.field_G.field_A);
                                      break L29;
                                    } else {
                                      if (f.field_G.field_l <= ag.field_f) {
                                        ia.a(true, 256);
                                        break L29;
                                      } else {
                                        ia.a(true, 0);
                                        break L29;
                                      }
                                    }
                                  } else {
                                    break L29;
                                  }
                                }
                                if (gf.field_d == var4) {
                                  break L2;
                                } else {
                                  f.field_G.field_A = gf.field_d;
                                  discarded$5 = ik.a(wj.field_b[1], (byte) -84);
                                  break L2;
                                }
                              }
                            }
                          }
                        } else {
                          if (this.field_b.b(103)) {
                            g.field_s = 0;
                            oa.a(3, param0, 75);
                            bj.field_m = this.field_i;
                            break L2;
                          } else {
                            break L2;
                          }
                        }
                      } else {
                        if (this.field_b.b(109)) {
                          oa.a(4, param0, 99);
                          bj.field_m = this.field_i;
                          ae.field_e = db.a((byte) -115, fleas.field_F, je.field_O.length);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                    } else {
                      if (this.field_b.b(-38)) {
                        oa.a(7, param0, 69);
                        var11 = hj.field_a;
                        hj.field_a[1] = 0;
                        fleas.field_L = 0;
                        kh.field_b = 0;
                        var11[0] = 0;
                        a.field_e.f(1);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                } else {
                  if (this.field_b.b(-17)) {
                    L30: {
                      oa.a(-1, param0, -86);
                      if (0 < wc.field_q) {
                        stackOut_53_0 = 0;
                        stackIn_54_0 = stackOut_53_0;
                        break L30;
                      } else {
                        stackOut_52_0 = 7;
                        stackIn_54_0 = stackOut_52_0;
                        break L30;
                      }
                    }
                    bj.field_m = stackIn_54_0;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
            } else {
              break L3;
            }
          }
          if (this.field_b.b(111)) {
            L31: {
              if (var5 == 0) {
                stackOut_47_0 = 0;
                stackIn_48_0 = stackOut_47_0;
                break L31;
              } else {
                stackOut_46_0 = 1;
                stackIn_48_0 = stackOut_46_0;
                break L31;
              }
            }
            fleas.field_E = stackIn_48_0;
            vf.e(-6359);
            oa.a(8, param0, -67);
            break L2;
          } else {
            break L2;
          }
        }
    }

    private final int a(int param0, int param1, byte param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = fleas.field_A ? 1 : 0;
        int var4 = -12 % ((param2 - -6) / 33);
        for (var5 = 0; var5 < ia.field_p[this.field_i].length; var5++) {
            var6 = this.a(var5, (byte) 127);
            if (!(!this.a((byte) 87, var5))) {
                if (!(this.b((byte) -13, var5) > param0)) {
                    if (!(this.a(var5, -19631) <= param0)) {
                        if (!(param1 < var6)) {
                            if (!(var6 + this.c(var5, 1205) <= param1)) {
                                return var5;
                            }
                        }
                    }
                }
            }
        }
        return -1;
    }

    final void a(byte param0) {
        StringBuilder discarded$1 = null;
        int var2 = 0;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_42_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_41_0 = 0;
        int stackOut_40_0 = 0;
        var3 = fleas.field_A ? 1 : 0;
        this.e(-400);
        if (this.field_i == 7) {
          L0: {
            stackOut_2_0 = 26;
            stackIn_4_0 = stackOut_2_0;
            stackIn_3_0 = stackOut_2_0;
            if (il.a((byte) 78)) {
              stackOut_4_0 = stackIn_4_0;
              stackOut_4_1 = 0;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              break L0;
            } else {
              stackOut_3_0 = stackIn_3_0;
              stackOut_3_1 = 1;
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              break L0;
            }
          }
          L1: {
            var2 = si.a(stackIn_5_0, stackIn_5_1 != 0);
            if (-4 != (var2 ^ -1)) {
              break L1;
            } else {
              L2: {
                if (null != rh.field_p) {
                  lh.a(false);
                  break L2;
                } else {
                  break L2;
                }
              }
              il.a((byte) 77, rl.a((byte) -99));
              break L1;
            }
          }
          L3: {
            if ((var2 ^ -1) == -2) {
              oa.a(0, false, 40);
              break L3;
            } else {
              break L3;
            }
          }
          if (var2 != 2) {
            return;
          } else {
            oa.a(0, true, param0 + -134);
            return;
          }
        } else {
          L4: {
            if (-1 == (this.field_i ^ -1)) {
              fleas.field_L = 0;
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            if (this.field_i != 8) {
              break L5;
            } else {
              L6: {
                rh.field_c.e(param0 ^ 121);
                if (!rh.field_c.field_J) {
                  break L6;
                } else {
                  ll.d(param0 ^ 330);
                  break L6;
                }
              }
              L7: {
                if (0 > rh.field_c.field_x) {
                  break L7;
                } else {
                  if (rh.field_c.field_x < rh.field_c.field_z.length) {
                    discarded$1 = new StringBuilder(rh.field_c.field_z[rh.field_c.field_x]);
                    break L5;
                  } else {
                    break L7;
                  }
                }
              }
              pa.field_i[20] = hg.field_o;
              break L5;
            }
          }
          L8: {
            if (-4 != (this.field_i ^ -1)) {
              break L8;
            } else {
              gj.field_A.field_t = fl.field_f;
              gj.field_A.c(106);
              fl.field_f = gj.field_A.field_t;
              break L8;
            }
          }
          L9: {
            if ((this.field_i ^ -1) != -11) {
              break L9;
            } else {
              if ((em.field_b ^ -1) >= -31) {
                L10: {
                  if (0 >= em.field_b) {
                    break L10;
                  } else {
                    wi.field_p.a(param0 + -150, em.field_b);
                    em.field_b = 0;
                    break L10;
                  }
                }
                wi.field_p.a(false);
                qh.field_y = qh.field_y + 1;
                break L9;
              } else {
                em.field_b = em.field_b - 30;
                wi.field_p.a(-116, 30);
                wi.field_p.a(false);
                qh.field_y = qh.field_y + 1;
                break L9;
              }
            }
          }
          L11: while (true) {
            if (!wf.b(-97)) {
              L12: {
                this.field_b.b(112, this.a(pb.field_d, ob.field_e, (byte) 41), this.a(ag.field_f, kc.field_b, (byte) 103));
                if (param0 == 26) {
                  break L12;
                } else {
                  this.b(-77, 70);
                  break L12;
                }
              }
              L13: {
                if (0 != (this.field_b.field_k ^ -1)) {
                  this.a(true, (byte) -99, this.field_b.field_k);
                  break L13;
                } else {
                  break L13;
                }
              }
              L14: {
                if (jk.field_r != 0) {
                  this.field_g = pb.field_d;
                  this.field_e = ob.field_e;
                  break L14;
                } else {
                  break L14;
                }
              }
              return;
            } else {
              if (ji.field_a != 13) {
                this.b((byte) 72);
                if (-1 != this.field_b.field_k) {
                  this.a(false, (byte) -44, this.field_b.field_k);
                  continue L11;
                } else {
                  continue L11;
                }
              } else {
                if (1 != this.field_i) {
                  if (6 != this.field_i) {
                    oa.a(bj.field_m, false, 126);
                    continue L11;
                  } else {
                    continue L11;
                  }
                } else {
                  L15: {
                    oa.a(-1, false, -96);
                    if ((wc.field_q ^ -1) >= -1) {
                      stackOut_41_0 = 7;
                      stackIn_42_0 = stackOut_41_0;
                      break L15;
                    } else {
                      stackOut_40_0 = 0;
                      stackIn_42_0 = stackOut_40_0;
                      break L15;
                    }
                  }
                  bj.field_m = stackIn_42_0;
                  continue L11;
                }
              }
            }
          }
        }
    }

    public static void g(int param0) {
        if (param0 != 9973) {
            return;
        }
        field_c = null;
        field_h = null;
    }

    private final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        ik stackIn_55_0 = null;
        ik stackIn_56_0 = null;
        ik stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        ik stackOut_54_0 = null;
        ik stackOut_56_0 = null;
        int stackOut_56_1 = 0;
        ik stackOut_55_0 = null;
        int stackOut_55_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        L0: {
          var4 = fleas.field_A ? 1 : 0;
          if (2 != this.field_i) {
            break L0;
          } else {
            if (!qh.c((byte) 34)) {
              L1: {
                if (96 != ji.field_a) {
                  break L1;
                } else {
                  if (this.field_b.field_k > 0) {
                    if (this.field_b.field_k != 3) {
                      this.field_b.a(-1 + this.field_b.field_k, (byte) -120);
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    this.field_b.a(2, (byte) -102);
                    break L1;
                  }
                }
              }
              L2: {
                if (-98 != (ji.field_a ^ -1)) {
                  break L2;
                } else {
                  if ((this.field_b.field_k ^ -1) > -3) {
                    this.field_b.a(1 + this.field_b.field_k, (byte) -123);
                    break L2;
                  } else {
                    if (2 == this.field_b.field_k) {
                      this.field_b.a(0, (byte) -111);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L3: {
                if ((ji.field_a ^ -1) == -100) {
                  L4: {
                    if (this.field_b.field_k < 0) {
                      break L4;
                    } else {
                      if (2 < this.field_b.field_k) {
                        break L4;
                      } else {
                        this.field_b.a(3, (byte) -97);
                        break L3;
                      }
                    }
                  }
                  this.field_b.a(nb.field_g, (byte) -117);
                  break L3;
                } else {
                  break L3;
                }
              }
              L5: {
                if (-99 != (ji.field_a ^ -1)) {
                  break L5;
                } else {
                  if (-4 != (this.field_b.field_k ^ -1)) {
                    this.field_b.a(3, (byte) -106);
                    break L5;
                  } else {
                    this.field_b.a(nb.field_g, (byte) -79);
                    break L5;
                  }
                }
              }
              this.field_b.i(-13093);
              return;
            } else {
              break L0;
            }
          }
        }
        if (this.field_i != 3) {
          L6: {
            if (8 != this.field_i) {
              break L6;
            } else {
              L7: {
                if (ji.field_a == 96) {
                  break L7;
                } else {
                  if (ji.field_a == 97) {
                    break L7;
                  } else {
                    if (rh.field_c.field_i) {
                      return;
                    } else {
                      break L6;
                    }
                  }
                }
              }
              L8: {
                stackOut_54_0 = rh.field_c;
                stackIn_56_0 = stackOut_54_0;
                stackIn_55_0 = stackOut_54_0;
                if (rh.field_c.field_i) {
                  stackOut_56_0 = (ik) ((Object) stackIn_56_0);
                  stackOut_56_1 = 0;
                  stackIn_57_0 = stackOut_56_0;
                  stackIn_57_1 = stackOut_56_1;
                  break L8;
                } else {
                  stackOut_55_0 = (ik) ((Object) stackIn_55_0);
                  stackOut_55_1 = 1;
                  stackIn_57_0 = stackOut_55_0;
                  stackIn_57_1 = stackOut_55_1;
                  break L8;
                }
              }
              stackIn_57_0.field_i = stackIn_57_1 != 0;
              break L6;
            }
          }
          L9: {
            this.field_b.h(0);
            if (param0 >= 21) {
              break L9;
            } else {
              field_a = 42;
              break L9;
            }
          }
          return;
        } else {
          L10: {
            if (g.field_s != 0) {
              stackOut_29_0 = 0;
              stackIn_30_0 = stackOut_29_0;
              break L10;
            } else {
              stackOut_28_0 = 1;
              stackIn_30_0 = stackOut_28_0;
              break L10;
            }
          }
          L11: {
            var2 = stackIn_30_0;
            if (kb.field_k.length + -1 != g.field_s) {
              stackOut_32_0 = 0;
              stackIn_33_0 = stackOut_32_0;
              break L11;
            } else {
              stackOut_31_0 = 1;
              stackIn_33_0 = stackOut_31_0;
              break L11;
            }
          }
          L12: {
            L13: {
              var3 = stackIn_33_0;
              if (var2 != 0) {
                break L13;
              } else {
                if (var3 == 0) {
                  break L12;
                } else {
                  break L13;
                }
              }
            }
            L14: {
              if (96 == ji.field_a) {
                break L14;
              } else {
                if (97 == ji.field_a) {
                  break L14;
                } else {
                  break L12;
                }
              }
            }
            L15: {
              this.field_b.c(-42);
              if (var2 == 0) {
                break L15;
              } else {
                if (this.field_b.field_k != 0) {
                  break L15;
                } else {
                  this.field_b.c(-125);
                  return;
                }
              }
            }
            L16: {
              if (var3 == 0) {
                break L16;
              } else {
                if (2 == this.field_b.field_k) {
                  this.field_b.c(-78);
                  break L16;
                } else {
                  break L16;
                }
              }
            }
            return;
          }
          this.field_b.c(-46);
          return;
        }
    }

    private final void c(byte param0) {
        int discarded$2 = 0;
        int discarded$3 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        fa var9 = null;
        fa var10 = null;
        int stackIn_6_0 = 0;
        dd[] stackIn_13_0 = null;
        dd[] stackIn_14_0 = null;
        dd[] stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        dd[] stackIn_16_0 = null;
        dd[] stackIn_17_0 = null;
        dd[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        dd[] stackIn_22_0 = null;
        dd[] stackIn_23_0 = null;
        dd[] stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        dd[] stackIn_25_0 = null;
        dd[] stackIn_26_0 = null;
        dd[] stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        dd[] stackIn_30_0 = null;
        dd[] stackIn_31_0 = null;
        dd[] stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        dd[] stackIn_40_0 = null;
        dd[] stackIn_41_0 = null;
        dd[] stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        dd[] stackOut_39_0 = null;
        dd[] stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        dd[] stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        dd[] stackOut_29_0 = null;
        dd[] stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        dd[] stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        dd[] stackOut_12_0 = null;
        dd[] stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        dd[] stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        dd[] stackOut_15_0 = null;
        dd[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        dd[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        dd[] stackOut_21_0 = null;
        dd[] stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        dd[] stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        dd[] stackOut_24_0 = null;
        dd[] stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        dd[] stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        var8 = fleas.field_A ? 1 : 0;
        var9 = ve.field_d;
        var10 = var9;
        this.b(2, g.field_s);
        var10.b(o.a((byte) 85, 1 + g.field_s, kb.field_k.length), 530, 110, 1, 16777215);
        ga.field_s[6][3] = 310;
        tl.field_p.c(v.field_R[g.field_s], 95, 145, 0, -1);
        var3 = 0;
        L0: while (true) {
          if (var3 >= kb.field_k[g.field_s].length) {
            L1: {
              if (-1 != ((19 & ni.field_j) >>> -1615066716 ^ -1)) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L1;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
            L2: {
              var3 = stackIn_6_0;
              var4 = (ni.field_j >>> -29326363) % se.field_a.length;
              if (param0 <= -82) {
                break L2;
              } else {
                discarded$2 = this.a(-42, 28);
                break L2;
              }
            }
            L3: {
              if (g.field_s == 0) {
                gj.field_A.field_l = 265;
                gj.field_A.field_a = 320;
                gj.field_A.b((byte) -107);
                break L3;
              } else {
                if ((g.field_s ^ -1) == -2) {
                  aj.field_t[2].d(105, ga.field_s[g.field_s][1] + -2);
                  oj.a(ga.field_s[g.field_s][1] + 2, 0, 109, var4);
                  aj.field_t[3].d(95, ga.field_s[g.field_s][2] + 1);
                  aj.field_t[4].d(116, 1 + ga.field_s[g.field_s][2]);
                  var5 = 4;
                  L4: while (true) {
                    if ((var5 ^ -1) < -7) {
                      break L3;
                    } else {
                      var6 = 88 + ib.field_a[g.field_s][var5];
                      var7 = ga.field_s[g.field_s][var5] + 7;
                      gb.f(var6, var7, 3, 1);
                      var5++;
                      continue L4;
                    }
                  }
                } else {
                  if (2 == g.field_s) {
                    L5: {
                      aj.field_t[1].d(95, ga.field_s[g.field_s][1] + 3);
                      aj.field_t[2].d(95, ga.field_s[g.field_s][2] + 3);
                      oj.a(ga.field_s[g.field_s][2] + 7, 0, 99, var4);
                      aj.field_t[3].d(95, ga.field_s[g.field_s][3] + 3);
                      aj.field_t[11].d(95, ga.field_s[g.field_s][4] + 12);
                      aj.field_t[5].d(95, 3 + ga.field_s[g.field_s][4]);
                      aj.field_t[6].d(95, ga.field_s[g.field_s][5] + 6);
                      stackOut_39_0 = aj.field_t;
                      stackIn_41_0 = stackOut_39_0;
                      stackIn_40_0 = stackOut_39_0;
                      if (var3 != 0) {
                        stackOut_41_0 = (dd[]) ((Object) stackIn_41_0);
                        stackOut_41_1 = 8;
                        stackIn_42_0 = stackOut_41_0;
                        stackIn_42_1 = stackOut_41_1;
                        break L5;
                      } else {
                        stackOut_40_0 = (dd[]) ((Object) stackIn_40_0);
                        stackOut_40_1 = 9;
                        stackIn_42_0 = stackOut_40_0;
                        stackIn_42_1 = stackOut_40_1;
                        break L5;
                      }
                    }
                    ((dd) (Object) stackIn_42_0[stackIn_42_1]).d(95, 6 + ga.field_s[g.field_s][6]);
                    break L3;
                  } else {
                    if (g.field_s != 3) {
                      if (-5 != (g.field_s ^ -1)) {
                        L6: {
                          if (-6 == (g.field_s ^ -1)) {
                            break L6;
                          } else {
                            if ((g.field_s ^ -1) != -7) {
                              break L3;
                            } else {
                              break L6;
                            }
                          }
                        }
                        var5 = 0;
                        L7: while (true) {
                          if (var5 >= ga.field_s[g.field_s].length) {
                            break L3;
                          } else {
                            var6 = ib.field_a[g.field_s][var5] + 88;
                            var7 = 7 + ga.field_s[g.field_s][var5];
                            gb.f(var6, var7, 3, 1);
                            var5++;
                            continue L7;
                          }
                        }
                      } else {
                        L8: {
                          aj.field_t[19].d(95, 3 - -ga.field_s[g.field_s][1]);
                          aj.field_t[20].d(111, 3 + ga.field_s[g.field_s][2]);
                          aj.field_t[23].d(95, 3 + ga.field_s[g.field_s][2]);
                          aj.field_t[21].d(95, ga.field_s[g.field_s][3] + 3);
                          stackOut_29_0 = aj.field_t;
                          stackIn_31_0 = stackOut_29_0;
                          stackIn_30_0 = stackOut_29_0;
                          if (var3 == 0) {
                            stackOut_31_0 = (dd[]) ((Object) stackIn_31_0);
                            stackOut_31_1 = 26;
                            stackIn_32_0 = stackOut_31_0;
                            stackIn_32_1 = stackOut_31_1;
                            break L8;
                          } else {
                            stackOut_30_0 = (dd[]) ((Object) stackIn_30_0);
                            stackOut_30_1 = 22;
                            stackIn_32_0 = stackOut_30_0;
                            stackIn_32_1 = stackOut_30_1;
                            break L8;
                          }
                        }
                        ((dd) (Object) stackIn_32_0[stackIn_32_1]).d(95, 6 + ga.field_s[g.field_s][4]);
                        aj.field_t[24].d(95, ga.field_s[g.field_s][5] + 3);
                        aj.field_t[25].d(95, 3 - -ga.field_s[g.field_s][6]);
                        break L3;
                      }
                    } else {
                      L9: {
                        aj.field_t[10].d(95, ga.field_s[g.field_s][1] + 3);
                        stackOut_12_0 = aj.field_t;
                        stackIn_14_0 = stackOut_12_0;
                        stackIn_13_0 = stackOut_12_0;
                        if (var3 != 0) {
                          stackOut_14_0 = (dd[]) ((Object) stackIn_14_0);
                          stackOut_14_1 = 13;
                          stackIn_15_0 = stackOut_14_0;
                          stackIn_15_1 = stackOut_14_1;
                          break L9;
                        } else {
                          stackOut_13_0 = (dd[]) ((Object) stackIn_13_0);
                          stackOut_13_1 = 27;
                          stackIn_15_0 = stackOut_13_0;
                          stackIn_15_1 = stackOut_13_1;
                          break L9;
                        }
                      }
                      L10: {
                        ((dd) (Object) stackIn_15_0[stackIn_15_1]).d(95, -5 - -ga.field_s[g.field_s][2]);
                        stackOut_15_0 = aj.field_t;
                        stackIn_17_0 = stackOut_15_0;
                        stackIn_16_0 = stackOut_15_0;
                        if (var3 != 0) {
                          stackOut_17_0 = (dd[]) ((Object) stackIn_17_0);
                          stackOut_17_1 = 14;
                          stackIn_18_0 = stackOut_17_0;
                          stackIn_18_1 = stackOut_17_1;
                          break L10;
                        } else {
                          stackOut_16_0 = (dd[]) ((Object) stackIn_16_0);
                          stackOut_16_1 = 28;
                          stackIn_18_0 = stackOut_16_0;
                          stackIn_18_1 = stackOut_16_1;
                          break L10;
                        }
                      }
                      L11: {
                        ((dd) (Object) stackIn_18_0[stackIn_18_1]).d(95, ga.field_s[g.field_s][3] + 3);
                        aj.field_t[30].d(95, ga.field_s[g.field_s][4] + 3);
                        var5 = (int)((double)ni.field_j / 2.0 % 16.0 * 2.0);
                        if (var5 > 16) {
                          var5 = -var5 + 32;
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      L12: {
                        aj.field_t[15].d(95, ga.field_s[g.field_s][4] + (3 + var5));
                        stackOut_21_0 = aj.field_t;
                        stackIn_23_0 = stackOut_21_0;
                        stackIn_22_0 = stackOut_21_0;
                        if (var3 != 0) {
                          stackOut_23_0 = (dd[]) ((Object) stackIn_23_0);
                          stackOut_23_1 = 16;
                          stackIn_24_0 = stackOut_23_0;
                          stackIn_24_1 = stackOut_23_1;
                          break L12;
                        } else {
                          stackOut_22_0 = (dd[]) ((Object) stackIn_22_0);
                          stackOut_22_1 = 29;
                          stackIn_24_0 = stackOut_22_0;
                          stackIn_24_1 = stackOut_22_1;
                          break L12;
                        }
                      }
                      L13: {
                        ((dd) (Object) stackIn_24_0[stackIn_24_1]).d(95, 3 - -ga.field_s[g.field_s][5]);
                        stackOut_24_0 = aj.field_t;
                        stackIn_26_0 = stackOut_24_0;
                        stackIn_25_0 = stackOut_24_0;
                        if (var3 != 0) {
                          stackOut_26_0 = (dd[]) ((Object) stackIn_26_0);
                          stackOut_26_1 = 17;
                          stackIn_27_0 = stackOut_26_0;
                          stackIn_27_1 = stackOut_26_1;
                          break L13;
                        } else {
                          stackOut_25_0 = (dd[]) ((Object) stackIn_25_0);
                          stackOut_25_1 = 31;
                          stackIn_27_0 = stackOut_25_0;
                          stackIn_27_1 = stackOut_25_1;
                          break L13;
                        }
                      }
                      ((dd) (Object) stackIn_27_0[stackIn_27_1]).d(95, 3 + ga.field_s[g.field_s][6]);
                      ql.a(var4, -121, ga.field_s[g.field_s][7] + 3, 95);
                      break L3;
                    }
                  }
                }
              }
            }
            return;
          } else {
            discarded$3 = var9.a(kb.field_k[g.field_s][var3], 95 - -ib.field_a[g.field_s][var3], ga.field_s[g.field_s][var3], -ib.field_a[g.field_s][var3] + 450, 50, 2105392, -1, 0, 0, var10.field_N);
            var3++;
            continue L0;
          }
        }
    }

    private final int a(int param0, byte param1) {
        if ((this.field_i ^ -1) == -3) {
            if (!qh.c((byte) 97)) {
                if (!(param0 >= 3)) {
                    return ia.field_j[this.field_i];
                }
                return ia.field_j[this.field_i] + ia.field_r[this.field_i];
            }
        }
        if (!(this.field_i != 3)) {
            return ia.field_j[this.field_i];
        }
        if (param1 <= 117) {
            field_a = -121;
        }
        return ia.field_r[this.field_i] * param0 + ia.field_j[this.field_i];
    }

    t(int param0) {
        this.field_g = -1;
        this.field_f = -1;
        this.field_i = param0;
        this.field_b = new pl(ia.field_p[param0].length);
    }

    static {
        field_c = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
    }
}
