/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gf {
    static fm field_b;
    static mi field_d;
    static dm field_a;
    static wk[] field_c;
    static String field_e;

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = SteelSentinels.field_G;
          ha.field_T = null;
          nf.field_c = null;
          wh.field_d = 0;
          var2 = ih.field_n;
          ih.field_n = lh.field_B;
          ne.field_N.field_f = ne.field_N.field_f + 1;
          if (param0 == 51) {
            ne.field_N.field_t = 2;
            break L0;
          } else {
            if (param0 != 50) {
              ne.field_N.field_t = 1;
              break L0;
            } else {
              ne.field_N.field_t = 5;
              break L0;
            }
          }
        }
        L1: {
          lh.field_B = var2;
          if (2 > ne.field_N.field_f) {
            break L1;
          } else {
            if (param0 == 51) {
              return 2;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (2 > ne.field_N.field_f) {
            break L2;
          } else {
            if (50 != param0) {
              break L2;
            } else {
              return 5;
            }
          }
        }
        if (4 <= ne.field_N.field_f) {
          return 1;
        } else {
          return -1;
        }
    }

    final static void a() {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var3_int = 0;
        wk var3 = null;
        int var4 = 0;
        int var5 = 0;
        int[] var9 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = SteelSentinels.field_G;
        try {
          L0: {
            int discarded$8 = 6;
            jk.a();
            le.field_K = 77;
            int discarded$9 = 255;
            int discarded$10 = 16711680;
            bc.a(49, 9, 56, 0, fa.field_b);
            int discarded$11 = 255;
            int discarded$12 = 16711680;
            bc.a(83, 1, 63, 56, fa.field_b);
            ta.field_e = pf.field_b;
            rf.a(ea.field_m, 320, 8, 8, 8, 8, hk.field_Tb, 16777215, 0, (mi) (Object) pl.field_U, 1146810, 240, 2, -94, wc.field_d);
            int discarded$13 = 8;
            int discarded$14 = 320;
            im.a(hk.field_Tb, 0, 8, -13782, ea.field_m, 16777215, 8, 8, 2, 240, (mi) (Object) pl.field_U, 1146810, wc.field_d);
            eb.field_s = new wk[9];
            var1_int = 0;
            L1: while (true) {
              if (var1_int >= 9) {
                var1_int = aj.field_r[0].field_B;
                aj.field_r[1] = new wk(var1_int, var1_int);
                aj.field_r[2] = new wk(var1_int, var1_int);
                var9 = aj.field_r[0].field_E;
                var3_int = 0;
                L2: while (true) {
                  if (var9.length <= var3_int) {
                    rh.field_v[21] = aj.field_r[0].g();
                    rh.field_v[22] = aj.field_r[1].g();
                    rh.field_v[23] = aj.field_r[2].g();
                    rh.field_v[24] = aj.field_r[2].g();
                    var3 = b.field_q[0];
                    b.field_q[0] = aj.field_r[0].g();
                    b.field_q[0].d();
                    var3.a(0, 0);
                    var4 = 0;
                    L3: while (true) {
                      if (var4 >= var3.field_E.length) {
                        b.field_q[1] = aj.field_r[1].g();
                        b.field_q[1].d();
                        var3.a(0, 0);
                        var4 = 0;
                        L4: while (true) {
                          if (var4 >= var3.field_E.length) {
                            b.field_q[2] = aj.field_r[2].g();
                            b.field_q[2].d();
                            var3.a(0, 0);
                            var4 = 0;
                            L5: while (true) {
                              if (var4 >= 3) {
                                rh.field_v[24].d();
                                si.field_E[1].c(0, 0, 4 * var1_int, var1_int * 4);
                                sb.field_bb.b((byte) 122);
                                ff.field_rb = new wk[20];
                                var4 = 0;
                                L6: while (true) {
                                  if (20 <= var4) {
                                    sb.field_bb.b((byte) 125);
                                    int discarded$15 = 122;
                                    ve.a();
                                    break L0;
                                  } else {
                                    ff.field_rb[var4] = new wk(20, 20);
                                    ff.field_rb[var4].d();
                                    hb.field_j[var4].b(0, 0);
                                    var4++;
                                    continue L6;
                                  }
                                }
                              } else {
                                rh.field_v[21 + var4].d();
                                b.field_q[var4].a(0, 0);
                                var4++;
                                continue L5;
                              }
                            }
                          } else {
                            L7: {
                              if (var3.field_E[var4] == 8454016) {
                                var3.field_E[var4] = 16711680;
                                break L7;
                              } else {
                                if (var3.field_E[var4] != 32768) {
                                  break L7;
                                } else {
                                  var3.field_E[var4] = 8388608;
                                  break L7;
                                }
                              }
                            }
                            var4++;
                            continue L4;
                          }
                        }
                      } else {
                        L8: {
                          if ((65280 & var3.field_E[var4]) != 0) {
                            var3.field_E[var4] = 8454016;
                            break L8;
                          } else {
                            if ((255 & var3.field_E[var4]) == 0) {
                              break L8;
                            } else {
                              var3.field_E[var4] = 32768;
                              break L8;
                            }
                          }
                        }
                        var4++;
                        continue L3;
                      }
                    }
                  } else {
                    L9: {
                      if (var9[var3_int] != 16711680) {
                        break L9;
                      } else {
                        aj.field_r[1].field_E[var3_int] = 45056;
                        aj.field_r[2].field_E[var3_int] = 8388608;
                        var9[var3_int] = 33023;
                        break L9;
                      }
                    }
                    var3_int++;
                    continue L2;
                  }
                }
              } else {
                L10: {
                  eb.field_s[var1_int] = pl.field_T[var1_int].g();
                  if (var1_int < 3) {
                    sf.a(10, 43, 50, eb.field_s[var1_int], 0, 122);
                    break L10;
                  } else {
                    if (var1_int >= 6) {
                      sf.a(10, 27, 34, eb.field_s[var1_int], 0, -68);
                      break L10;
                    } else {
                      sf.a(10, 35, 42, eb.field_s[var1_int], 0, 81);
                      break L10;
                    }
                  }
                }
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var1, "gf.A(" + 0 + ')');
        }
    }

    final static void c(int param0) {
        if (param0 > -86) {
            return;
        }
        nc.field_q = false;
    }

    public static void b() {
        field_a = null;
        field_b = null;
        field_d = null;
        field_c = null;
        field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new fm(4, 1, 1, 1);
        field_e = "Q";
    }
}
