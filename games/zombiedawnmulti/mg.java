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
        int stackIn_5_0 = 0;
        k stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        k stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        String stackIn_16_2 = null;
        k stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        k stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        String stackIn_19_2 = null;
        int stackIn_31_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_62_0 = 0;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_66_2 = null;
        StringBuilder stackIn_68_1 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        StringBuilder stackIn_71_1 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        var13 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var14 = param1.c((byte) 99);
              var11_ref_String = var14;
              var11_ref_String = var14;
              var8 = param3.c((byte) 99);
              var11_ref_String = var8;
              var11_ref_String = var8;
              if (ki.field_h != null) {
                break L1;
              } else {
                if (!ee.a(false, false)) {
                  stackIn_5_0 = -1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (vo.field_l != ud.field_cb) {
                break L2;
              } else {
                L3: {
                  ma.field_a.field_j = 0;
                  dd.field_d = null;
                  if (param4 == null) {
                    L4: {
                      pm.field_R.field_j = 0;
                      pm.field_R.b(125, c.field_c.nextInt());
                      pm.field_R.b(-114, c.field_c.nextInt());
                      stackIn_15_0 = pm.field_R;

                      stackIn_15_1 = -16171;

                      if (param1.a((byte) 105)) {
                        stackIn_16_0 = (k) ((Object) stackIn_15_0);
                        stackIn_16_1 = stackIn_15_1;
                        stackIn_16_2 = (String) (var14);
                        break L4;
                      } else {
                        stackIn_16_0 = (k) ((Object) stackIn_15_0);
                        stackIn_16_1 = stackIn_15_1;
                        stackIn_16_2 = "";
                        break L4;
                      }
                    }
                    L5: {
                      ((k) (Object) stackIn_16_0).b(stackIn_16_1, stackIn_16_2);
                      stackIn_18_0 = pm.field_R;

                      stackIn_18_1 = -16171;

                      if (param3.a((byte) 57)) {
                        stackIn_19_0 = (k) ((Object) stackIn_18_0);
                        stackIn_19_1 = stackIn_18_1;
                        stackIn_19_2 = (String) (var8);
                        break L5;
                      } else {
                        stackIn_19_0 = (k) ((Object) stackIn_18_0);
                        stackIn_19_1 = stackIn_18_1;
                        stackIn_19_2 = "";
                        break L5;
                      }
                    }
                    ((k) (Object) stackIn_19_0).b(stackIn_19_1, stackIn_19_2);
                    ma.field_a.a(-99, 16);
                    ma.field_a.field_j = ma.field_a.field_j + 1;
                    var9 = ma.field_a.field_j;
                    hd.a(gn.field_L, (byte) 110, tp.field_v, pm.field_R, ma.field_a);
                    ma.field_a.e(param6 + 173, -var9 + ma.field_a.field_j);
                    break L3;
                  } else {
                    L6: {
                      var9 = 0;
                      pm.field_R.field_j = 0;
                      if (!param0) {
                        break L6;
                      } else {
                        var9 = var9 | 1;
                        break L6;
                      }
                    }
                    L7: {
                      pm.field_R.b(-11, c.field_c.nextInt());
                      pm.field_R.b(90, c.field_c.nextInt());
                      pm.field_R.b(-16171, var14);
                      pm.field_R.b(-16171, var8);
                      var15 = (CharSequence) ((Object) param4);
                      pm.field_R.b(-16171, nq.a(-50, var15));
                      pm.field_R.a(param5, (byte) -91);
                      pm.field_R.a(param6 ^ 37, param2);
                      pm.field_R.a(param6 ^ 19, var9);
                      ma.field_a.a(120, 18);
                      ma.field_a.field_j = ma.field_a.field_j + 2;
                      var10 = ma.field_a.field_j;
                      var11_ref_String = wg.a(0, jl.b(param6 + 92));
                      if (var11_ref_String != null) {
                        break L7;
                      } else {
                        var11_ref_String = "";
                        break L7;
                      }
                    }
                    ma.field_a.a(var11_ref_String, (byte) 105);
                    hd.a(gn.field_L, (byte) -123, tp.field_v, pm.field_R, ma.field_a);
                    ma.field_a.b(false, ma.field_a.field_j - var10);
                    break L3;
                  }
                }
                cb.a(-1, false);
                vo.field_l = mf.field_c;
                break L2;
              }
            }
            L8: {
              if (mf.field_c != vo.field_l) {
                break L8;
              } else {
                if (!fa.b(10, 1)) {
                  break L8;
                } else {
                  L9: {
                    var9 = s.field_e.g(31365);
                    s.field_e.field_j = 0;
                    if (-101 < (var9 ^ -1)) {
                      break L9;
                    } else {
                      if (-106 > (var9 ^ -1)) {
                        break L9;
                      } else {
                        hb.field_b = new String[var9 - 100];
                        vo.field_l = sa.field_n;
                        break L8;
                      }
                    }
                  }
                  if (248 == var9) {
                    og.a(param6 ^ -92, jl.b(0));
                    ol.field_q = pa.field_Y;
                    ak.a((byte) -115);
                    sk.field_j = false;
                    stackIn_31_0 = var9;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    if ((var9 ^ -1) == -100) {
                      fa.b(10, wm.f(1));
                      dd.field_d = new Boolean(fq.a(s.field_e, (byte) -114));
                      s.field_e.field_j = 0;
                      break L8;
                    } else {
                      vo.field_l = pq.field_p;
                      op.field_i = var9;
                      hd.field_q = -1;
                      break L8;
                    }
                  }
                }
              }
            }
            L10: {
              if (sa.field_n == vo.field_l) {
                var9 = 2;
                if (!fa.b(param6 ^ -82, var9)) {
                  break L10;
                } else {
                  var10 = s.field_e.d((byte) 69);
                  s.field_e.field_j = 0;
                  if (fa.b(10, var10)) {
                    var11 = hb.field_b.length;
                    var12 = 0;
                    L11: while (true) {
                      if (var12 >= var11) {
                        ak.a((byte) -123);
                        sk.field_j = false;
                        stackIn_41_0 = var11 + 100;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        hb.field_b[var12] = s.field_e.c(0);
                        var12++;
                        continue L11;
                      }
                    }
                  } else {
                    break L10;
                  }
                }
              } else {
                break L10;
              }
            }
            L12: {
              if (pq.field_p != vo.field_l) {
                break L12;
              } else {
                if (!dd.a(param6 ^ -92)) {
                  break L12;
                } else {
                  L13: {
                    if (op.field_i == 255) {
                      var9_ref_String = s.field_e.g((byte) -89);
                      if (var9_ref_String != null) {
                        jh.a(jl.b(0), -1, var9_ref_String);
                        break L13;
                      } else {
                        break L13;
                      }
                    } else {
                      ol.field_q = s.field_e.f((byte) -71);
                      break L13;
                    }
                  }
                  ak.a((byte) -118);
                  sk.field_j = false;
                  stackIn_50_0 = op.field_i;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              }
            }
            L14: {
              if (param6 == -92) {
                break L14;
              } else {
                field_F = 21;
                break L14;
              }
            }
            L15: {
              if (ki.field_h != null) {
                break L15;
              } else {
                if (sk.field_j) {
                  L16: {
                    if ((he.b((byte) -22) ^ -1L) < -30001L) {
                      ol.field_q = aj.field_l;
                      break L16;
                    } else {
                      ol.field_q = ga.field_w;
                      break L16;
                    }
                  }
                  sk.field_j = false;
                  stackIn_60_0 = 249;
                  decompiledRegionSelector0 = 4;
                  break L0;
                } else {
                  var9 = jo.field_b;
                  jo.field_b = ff.field_s;
                  sk.field_j = true;
                  ff.field_s = var9;
                  break L15;
                }
              }
            }
            stackIn_62_0 = -1;
            decompiledRegionSelector0 = 5;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var7 = decompiledCaughtException;
            stackIn_65_0 = (RuntimeException) (var7);

            stackIn_65_1 = new StringBuilder().append("mg.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_66_0 = (RuntimeException) ((Object) stackIn_65_0);
              stackIn_66_1 = (StringBuilder) ((Object) stackIn_65_1);
              stackIn_66_2 = "null";
              break L17;
            } else {
              stackIn_66_0 = (RuntimeException) ((Object) stackIn_65_0);
              stackIn_66_1 = (StringBuilder) ((Object) stackIn_65_1);
              stackIn_66_2 = "{...}";
              break L17;
            }
          }
          L18: {


            stackIn_68_1 = ((StringBuilder) (Object) stackIn_66_1).append(stackIn_66_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_66_0 = (RuntimeException) ((Object) stackIn_66_0);
              stackIn_69_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackIn_69_2 = "null";
              break L18;
            } else {
              stackIn_66_0 = (RuntimeException) ((Object) stackIn_66_0);
              stackIn_69_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackIn_69_2 = "{...}";
              break L18;
            }
          }
          L19: {


            stackIn_71_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_69_2).append(',');

            if (param4 == null) {
              stackIn_66_0 = (RuntimeException) ((Object) stackIn_66_0);
              stackIn_72_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackIn_72_2 = "null";
              break L19;
            } else {
              stackIn_66_0 = (RuntimeException) ((Object) stackIn_66_0);
              stackIn_72_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackIn_72_2 = "{...}";
              break L19;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_66_0), stackIn_72_2 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_31_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_41_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_50_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_60_0;
                } else {
                  return stackIn_62_0;
                }
              }
            }
          }
        }
    }

    mg(int param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_G = 0;
        this.field_I = hp.a((byte) 44, g.field_a, 5);
    }

    final void f(byte param0) {
        int fieldTemp$0 = 0;
        br var2_ref_br;
        double var2;
        wb var3;
        int var4;
        int var5;
        int var6;
        L0: {
          var6 = ZombieDawnMulti.field_E ? 1 : 0;
          this.field_G = this.field_G + 1;
          if (120 <= this.field_G) {
            this.field_G = 0;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          fieldTemp$0 = this.field_I;
          this.field_I = this.field_I + 1;
          if (-6 <= (fieldTemp$0 ^ -1)) {
            break L1;
          } else {
            this.field_I = 0;
            var2_ref_br = fb.field_e.field_H.c(109);
            L2: while (true) {
              if (!(var2_ref_br instanceof id)) {
                break L1;
              } else {
                L3: {
                  if (var2_ref_br instanceof wb) {
                    var3 = (wb) ((Object) var2_ref_br);
                    var4 = var3.g(-116) + -this.g(-34) + -12;
                    var5 = var3.h(122) + -this.h(-70);
                    if ((var4 * var4 - -(var5 * var5) ^ -1) <= -577) {
                      break L3;
                    } else {
                      if (!fb.field_e.field_I.a(69, this.field_C, 255)) {
                        break L3;
                      } else {
                        nm.b(-127, 9);
                        iq.a(this.field_C, (byte) 99);
                        this.a(true);
                        return;
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                var2_ref_br = var2_ref_br.field_d;
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
        ef var8 = null;
        try {
            int var7_int = 73 % ((param2 - -45) / 36);
            var8 = qp.field_w;
            nm.field_w.c(param6, param3, param5);
            wa.field_b[param0].c(param6 + 17, param3 + 21, param5);
            jq.a(cr.a(param0, -83), 33 + param3, (byte) 2, param4.field_t[param0], param5, -16 + param6);
            if (param1 != 255) {
                jq.a(cr.a(param1, -100), param3 + 21, (byte) 2, param4.field_t[param1], param5, param6 - 39);
                ((fm) ((Object) var8)).a(gh.field_f[param1], param6 - -29, 48 + param3, 16777215, 1, param5);
            }
            ((fm) ((Object) var8)).a(gh.field_f[param0], param6 + 29, 58 + param3, 16777215, 1, param5);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "mg.K(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static void b(boolean param0) {
        if (param0) {
            rp var2 = (rp) null;
            mg.a(-13, 21, (byte) 127, 95, (rp) null, 24, -18);
        }
        sq.field_N = true;
        va.field_a = 0;
    }

    final void a(int param0, nm param1) {
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
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
        try {
          L0: {
            L1: {
              var3_int = this.field_G % 30;
              if (-16 <= (var3_int ^ -1)) {
                break L1;
              } else {
                var3_int = -var3_int + 30;
                break L1;
              }
            }
            L2: {
              if (var3_int > 8) {
                var3_int = 4;
                break L2;
              } else {
                if (var3_int <= 3) {
                  if ((var3_int ^ -1) >= -2) {
                    var3_int = 1;
                    break L2;
                  } else {
                    var3_int = 2;
                    break L2;
                  }
                } else {
                  var3_int = 3;
                  break L2;
                }
              }
            }
            if (param0 == -10136) {
              L3: {
                var4 = param1.c(this.g(74), -20126);
                var5 = param1.d(-var3_int + this.h(93), 117) - 24;
                if (47 < (var4 ^ -1)) {
                  break L3;
                } else {
                  if (47 < (var5 ^ -1)) {
                    break L3;
                  } else {
                    if ((var4 ^ -1) < -641) {
                      break L3;
                    } else {
                      if ((var5 ^ -1) >= -481) {
                        var6 = 12 + var4 + -1;
                        var7 = 12 + var5 + -1;
                        var9 = 10;
                        var10 = 2;
                        var11 = 0;
                        L4: while (true) {
                          if (-7 >= (var11 ^ -1)) {
                            wa.field_b[this.field_C].g(var4, var5);
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            var8 = (6 * var11 + this.field_G) % 120;
                            oo.d(hp.field_l[var8] + var6, var7 - -hp.field_g[var8], 6, 0, var11 * var9);
                            oo.a(hp.field_l[var8] + var6 << 1984529732, var7 - -hp.field_g[var8] << -1129783740, 96, var11 * var10, hp.field_j[this.field_C]);
                            var8 = (60 + var8) % 120;
                            oo.d(hp.field_l[var8] + var6, hp.field_g[var8] + var7, 6, 0, var11 * var9);
                            oo.a(hp.field_l[var8] + var6 << 1405019172, var7 - -hp.field_g[var8] << -395194012, 96, var10 * var11, hp.field_j[this.field_C]);
                            var11++;
                            continue L4;
                          }
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var3);

            stackIn_25_1 = new StringBuilder().append("mg.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L5;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L5;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    static {
        field_F = 68;
        field_J = Math.atan2(1.0, 0.0);
    }
}
