/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class mg extends id {
    static int field_F;
    private int field_G;
    static int field_H;
    static double field_J;
    private int field_I;

    final static int a(boolean param0, hf param1, int param2, hf param3, String param4, int param5, byte param6) {
        String var8 = null;
        int var9 = 0;
        String var9_ref = null;
        int var10 = 0;
        String var11_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        k stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        k stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        k stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        String stackIn_14_2 = null;
        k stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        k stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        k stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        String stackIn_17_2 = null;
        k stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        k stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        String stackOut_13_2 = null;
        k stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        String stackOut_12_2 = null;
        k stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        k stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        String stackOut_16_2 = null;
        k stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        String stackOut_15_2 = null;
        L0: {
          var13 = ZombieDawnMulti.field_E ? 1 : 0;
          var14 = param1.c((byte) 99);
          var11_ref = var14;
          var11_ref = var14;
          var8 = param3.c((byte) 99);
          var11_ref = var8;
          var11_ref = var8;
          if (ki.field_h != null) {
            break L0;
          } else {
            if (!ee.a(false, false)) {
              return -1;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (vo.field_l != ud.field_cb) {
            break L1;
          } else {
            L2: {
              ma.field_a.field_j = 0;
              dd.field_d = null;
              if (param4 == null) {
                L3: {
                  pm.field_R.field_j = 0;
                  pm.field_R.b(125, c.field_c.nextInt());
                  pm.field_R.b(-114, c.field_c.nextInt());
                  stackOut_11_0 = pm.field_R;
                  stackOut_11_1 = -16171;
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  if (param1.a((byte) 105)) {
                    stackOut_13_0 = (k) (Object) stackIn_13_0;
                    stackOut_13_1 = stackIn_13_1;
                    stackOut_13_2 = (String) var14;
                    stackIn_14_0 = stackOut_13_0;
                    stackIn_14_1 = stackOut_13_1;
                    stackIn_14_2 = stackOut_13_2;
                    break L3;
                  } else {
                    stackOut_12_0 = (k) (Object) stackIn_12_0;
                    stackOut_12_1 = stackIn_12_1;
                    stackOut_12_2 = "";
                    stackIn_14_0 = stackOut_12_0;
                    stackIn_14_1 = stackOut_12_1;
                    stackIn_14_2 = stackOut_12_2;
                    break L3;
                  }
                }
                L4: {
                  ((k) (Object) stackIn_14_0).b(stackIn_14_1, stackIn_14_2);
                  stackOut_14_0 = pm.field_R;
                  stackOut_14_1 = -16171;
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_16_1 = stackOut_14_1;
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  if (param3.a((byte) 57)) {
                    stackOut_16_0 = (k) (Object) stackIn_16_0;
                    stackOut_16_1 = stackIn_16_1;
                    stackOut_16_2 = (String) var8;
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    stackIn_17_2 = stackOut_16_2;
                    break L4;
                  } else {
                    stackOut_15_0 = (k) (Object) stackIn_15_0;
                    stackOut_15_1 = stackIn_15_1;
                    stackOut_15_2 = "";
                    stackIn_17_0 = stackOut_15_0;
                    stackIn_17_1 = stackOut_15_1;
                    stackIn_17_2 = stackOut_15_2;
                    break L4;
                  }
                }
                ((k) (Object) stackIn_17_0).b(stackIn_17_1, stackIn_17_2);
                ma.field_a.a(-99, 16);
                ma.field_a.field_j = ma.field_a.field_j + 1;
                var9 = ma.field_a.field_j;
                hd.a(gn.field_L, (byte) 110, tp.field_v, pm.field_R, (k) (Object) ma.field_a);
                ma.field_a.e(param6 + 173, -var9 + ma.field_a.field_j);
                break L2;
              } else {
                L5: {
                  var9 = 0;
                  pm.field_R.field_j = 0;
                  if (!param0) {
                    break L5;
                  } else {
                    var9 = var9 | 1;
                    break L5;
                  }
                }
                L6: {
                  pm.field_R.b(-11, c.field_c.nextInt());
                  pm.field_R.b(90, c.field_c.nextInt());
                  pm.field_R.b(-16171, var14);
                  pm.field_R.b(-16171, var8);
                  var15 = (CharSequence) (Object) param4;
                  pm.field_R.b(-16171, nq.a(-50, var15));
                  pm.field_R.a(param5, (byte) -91);
                  pm.field_R.a(param6 ^ 37, param2);
                  pm.field_R.a(param6 ^ 19, var9);
                  ma.field_a.a(120, 18);
                  ma.field_a.field_j = ma.field_a.field_j + 2;
                  var10 = ma.field_a.field_j;
                  var11_ref = wg.a(0, jl.b(param6 + 92));
                  if (var11_ref != null) {
                    break L6;
                  } else {
                    var11_ref = "";
                    break L6;
                  }
                }
                ma.field_a.a(var11_ref, (byte) 105);
                hd.a(gn.field_L, (byte) -123, tp.field_v, pm.field_R, (k) (Object) ma.field_a);
                ma.field_a.b(false, ma.field_a.field_j - var10);
                break L2;
              }
            }
            cb.a(-1, false);
            vo.field_l = mf.field_c;
            break L1;
          }
        }
        L7: {
          if (mf.field_c != vo.field_l) {
            break L7;
          } else {
            if (!fa.b(10, 1)) {
              break L7;
            } else {
              L8: {
                var9 = s.field_e.g(31365);
                s.field_e.field_j = 0;
                if (-101 < var9) {
                  break L8;
                } else {
                  if (-106 < var9) {
                    break L8;
                  } else {
                    hb.field_b = new String[var9 - 100];
                    vo.field_l = sa.field_n;
                    break L7;
                  }
                }
              }
              if (248 == var9) {
                og.a(param6 ^ -92, jl.b(0));
                ol.field_q = pa.field_Y;
                ak.a((byte) -115);
                sk.field_j = false;
                return var9;
              } else {
                if ((var9 ^ -1) == -100) {
                  boolean discarded$1 = fa.b(10, wm.f(1));
                  dd.field_d = new Boolean(fq.a((k) (Object) s.field_e, (byte) -114));
                  s.field_e.field_j = 0;
                  break L7;
                } else {
                  vo.field_l = pq.field_p;
                  op.field_i = var9;
                  hd.field_q = -1;
                  break L7;
                }
              }
            }
          }
        }
        L9: {
          if (sa.field_n == vo.field_l) {
            var9 = 2;
            if (!fa.b(param6 ^ -82, var9)) {
              break L9;
            } else {
              var10 = s.field_e.d((byte) 69);
              s.field_e.field_j = 0;
              if (fa.b(10, var10)) {
                var11 = hb.field_b.length;
                var12 = 0;
                L10: while (true) {
                  if (var12 >= var11) {
                    ak.a((byte) -123);
                    sk.field_j = false;
                    return var11 + 100;
                  } else {
                    hb.field_b[var12] = s.field_e.c(0);
                    var12++;
                    continue L10;
                  }
                }
              } else {
                break L9;
              }
            }
          } else {
            break L9;
          }
        }
        L11: {
          if (pq.field_p != vo.field_l) {
            break L11;
          } else {
            if (!dd.a(param6 ^ -92)) {
              break L11;
            } else {
              L12: {
                if (op.field_i == 255) {
                  var9_ref = s.field_e.g((byte) -89);
                  if (var9_ref != null) {
                    jh.a(jl.b(0), -1, var9_ref);
                    break L12;
                  } else {
                    break L12;
                  }
                } else {
                  ol.field_q = s.field_e.f((byte) -71);
                  break L12;
                }
              }
              ak.a((byte) -118);
              sk.field_j = false;
              return op.field_i;
            }
          }
        }
        L13: {
          if (param6 == -92) {
            break L13;
          } else {
            field_F = 21;
            break L13;
          }
        }
        L14: {
          if (ki.field_h != null) {
            break L14;
          } else {
            if (sk.field_j) {
              L15: {
                if ((he.b((byte) -22) ^ -1L) < -30001L) {
                  ol.field_q = aj.field_l;
                  break L15;
                } else {
                  ol.field_q = ga.field_w;
                  break L15;
                }
              }
              sk.field_j = false;
              return 249;
            } else {
              var9 = jo.field_b;
              jo.field_b = ff.field_s;
              sk.field_j = true;
              ff.field_s = var9;
              break L14;
            }
          }
        }
        return -1;
    }

    mg(int param0, int param1, int param2) {
        super(param0, param1, param2);
        ((mg) this).field_G = 0;
        ((mg) this).field_I = hp.a((byte) 44, g.field_a, 5);
    }

    final void f(byte param0) {
        br var2_ref = null;
        double var2 = 0.0;
        wb var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = ZombieDawnMulti.field_E ? 1 : 0;
          ((mg) this).field_G = ((mg) this).field_G + 1;
          if (120 <= ((mg) this).field_G) {
            ((mg) this).field_G = 0;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          ((mg) this).field_I = ((mg) this).field_I + 1;
          if (-6 <= (((mg) this).field_I ^ -1)) {
            break L1;
          } else {
            ((mg) this).field_I = 0;
            var2_ref = fb.field_e.field_H.c(109);
            L2: while (true) {
              if (!(var2_ref instanceof id)) {
                break L1;
              } else {
                L3: {
                  if (var2_ref instanceof wb) {
                    var3 = (wb) (Object) var2_ref;
                    var4 = var3.g(-116) + -((mg) this).g(-34) + -12;
                    var5 = var3.h(122) + -((mg) this).h(-70);
                    if ((var4 * var4 - -(var5 * var5) ^ -1) <= -577) {
                      break L3;
                    } else {
                      if (!fb.field_e.field_I.a(69, ((mg) this).field_C, 255)) {
                        break L3;
                      } else {
                        uj discarded$1 = nm.b(-127, 9);
                        iq.a(((mg) this).field_C, (byte) 99);
                        ((mg) this).a(true);
                        return;
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                var2_ref = var2_ref.field_d;
                continue L2;
              }
            }
          }
        }
        hp.field_l = new int[120];
        hp.field_g = new int[120];
        hp.field_j = new int[8][16];
        if (param0 < -79) {
          var2 = 0.05235987755982988;
          var4 = 0;
          L4: while (true) {
            if (120 <= var4) {
              var4 = 0;
              L5: while (true) {
                if (hp.field_j[0].length <= var4) {
                  return;
                } else {
                  var5 = 16 * var4;
                  hp.field_j[0][var4] = cr.b(tq.b(65410, var5 << 1766044424), tq.b(var5, 255));
                  hp.field_j[1][var4] = cr.b(var5 << 265694344, var5 << 1441833296);
                  hp.field_j[2][var4] = cr.b(tq.b(65493, var5 << -1221542904), tq.b(255, var5 / 2));
                  hp.field_j[3][var4] = var5 * 65793;
                  hp.field_j[4][var4] = cr.b(tq.b(var5, 771752446) << -19463737, var5 << -386917904);
                  hp.field_j[5][var4] = var5 << 1672389648;
                  hp.field_j[6][var4] = var5 << -1547643920;
                  hp.field_j[7][var4] = cr.b(var5, cr.b(tq.b(var5 << -274200794, 65326), tq.b(var5, 1477444604) << 179983246));
                  var4++;
                  continue L5;
                }
              }
            } else {
              hp.field_l[var4] = (int)(24.0 * Math.cos((double)var4 * var2));
              hp.field_g[var4] = (int)(24.0 * Math.sin(var2 * (double)var4));
              var4++;
              continue L4;
            }
          }
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, byte param2, int param3, rp param4, int param5, int param6) {
        int var7 = 73 % ((param2 - -45) / 36);
        ef var8 = qp.field_w;
        nm.field_w.c(param6, param3, param5);
        wa.field_b[param0].c(param6 + 17, param3 + 21, param5);
        jq.a(cr.a(param0, -83), 33 + param3, (byte) 2, param4.field_t[param0], param5, -16 + param6);
        if (param1 != 255) {
            jq.a(cr.a(param1, -100), param3 + 21, (byte) 2, param4.field_t[param1], param5, param6 - 39);
            ((fm) (Object) var8).a(gh.field_f[param1], param6 - -29, 48 + param3, 16777215, 1, param5);
        }
        ((fm) (Object) var8).a(gh.field_f[param0], param6 + 29, 58 + param3, 16777215, 1, param5);
    }

    final static void b(boolean param0) {
        if (param0) {
            Object var2 = null;
            mg.a(-13, 21, (byte) 127, 95, (rp) null, 24, -18);
        }
        sq.field_N = true;
        va.field_a = 0;
    }

    final void a(int param0, nm param1) {
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
        L0: {
          var12 = ZombieDawnMulti.field_E ? 1 : 0;
          var3 = ((mg) this).field_G % 30;
          if (-16 <= (var3 ^ -1)) {
            break L0;
          } else {
            var3 = -var3 + 30;
            break L0;
          }
        }
        L1: {
          if (var3 > 8) {
            var3 = 4;
            break L1;
          } else {
            if (var3 <= 3) {
              if ((var3 ^ -1) >= -2) {
                var3 = 1;
                break L1;
              } else {
                var3 = 2;
                break L1;
              }
            } else {
              var3 = 3;
              break L1;
            }
          }
        }
        if (param0 == -10136) {
          L2: {
            var4 = param1.c(((mg) this).g(74), -20126);
            var5 = param1.d(-var3 + ((mg) this).h(93), 117) - 24;
            if (47 < var4) {
              break L2;
            } else {
              if (47 > var5) {
                break L2;
              } else {
                if ((var4 ^ -1) < -641) {
                  break L2;
                } else {
                  if ((var5 ^ -1) >= -481) {
                    var6 = 12 + var4 + -1;
                    var7 = 12 + var5 + -1;
                    var9 = 10;
                    var10 = 2;
                    var11 = 0;
                    L3: while (true) {
                      if (-7 >= (var11 ^ -1)) {
                        wa.field_b[((mg) this).field_C].g(var4, var5);
                        return;
                      } else {
                        var8 = (6 * var11 + ((mg) this).field_G) % 120;
                        oo.d(hp.field_l[var8] + var6, var7 - -hp.field_g[var8], 6, 0, var11 * var9);
                        oo.a(hp.field_l[var8] + var6 << 1984529732, var7 - -hp.field_g[var8] << -1129783740, 96, var11 * var10, hp.field_j[((mg) this).field_C]);
                        var8 = (60 + var8) % 120;
                        oo.d(hp.field_l[var8] + var6, hp.field_g[var8] + var7, 6, 0, var11 * var9);
                        oo.a(hp.field_l[var8] + var6 << 1405019172, var7 - -hp.field_g[var8] << -395194012, 96, var10 * var11, hp.field_j[((mg) this).field_C]);
                        var11++;
                        continue L3;
                      }
                    }
                  } else {
                    break L2;
                  }
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = 68;
        field_J = Math.atan2(1.0, 0.0);
    }
}
