/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ak {
    static String field_c;
    static int field_a;
    static String[] field_b;
    static int[] field_f;
    static km[] field_d;
    static mg field_e;

    final static void a(int param0, km param1) {
        km var6 = null;
        int var3 = Virogrid.field_F ? 1 : 0;
        km var5 = (km) (Object) param1.field_W.a((byte) -89);
        km var2 = var5;
        while (var5 != null) {
            var5.field_ub = 0;
            var5.field_Cb = 0;
            var5.field_kb = 0;
            var5.field_F = 0;
            var6 = (km) (Object) param1.field_W.a(param0 + -164);
            km var6_ref = var6;
        }
        if (param0 != 16377) {
            Object var4 = null;
            ak.a(97, (km) null);
        }
        param1.field_F = 0;
        param1.field_kb = 0;
        param1.field_ub = 0;
        param1.field_Cb = 0;
    }

    final static int a(int param0, byte param1, Random param2) {
        int var4 = 0;
        int var5 = Virogrid.field_F ? 1 : 0;
        if (0 >= param0) {
            throw new IllegalArgumentException();
        }
        if (am.a((byte) -56, param0)) {
            return (int)((4294967295L & (long)param2.nextInt()) * (long)param0 >> 1138579488);
        }
        int var3 = -(int)(4294967296L % (long)param0) + -2147483648;
        if (param1 >= -56) {
            field_f = null;
        }
        do {
            var4 = param2.nextInt();
        } while (var4 >= var3);
        return bj.b(param0, var4, 1);
    }

    final static boolean b(int param0) {
        if (param0 != -31609) {
            field_b = null;
        }
        oc.field_l = true;
        hc.field_a = 15000L + hc.a(-9986);
        return -12 == (j.field_l ^ -1) ? true : false;
    }

    final static mg[] a(int param0, int param1, int param2, byte param3) {
        int var5 = 0;
        int var6 = Virogrid.field_F ? 1 : 0;
        mg[] var8 = new mg[9];
        mg[] var4 = var8;
        var8[0] = eg.a(param2, (byte) 29, param0);
        for (var5 = 1; -10 < (var5 ^ -1); var5++) {
            var8[var5] = var8[0];
        }
        if (param3 <= 114) {
            Object var7 = null;
            int discarded$0 = ak.a(-24, (byte) 98, (Random) null);
        }
        var4[4] = eg.a(64, (byte) 63, param1);
        return var4;
    }

    final static void c(int param0) {
        se.field_f = new String[ad.field_c];
        se.field_f[19] = rk.field_d;
        se.field_f[13] = ej.field_H;
        se.field_f[16] = el.field_f;
        se.field_f[5] = eg.field_G;
        se.field_f[4] = s.field_h;
        if (param0 != -7597) {
            field_d = null;
        }
        se.field_f[11] = ql.field_e;
        se.field_f[18] = wm.field_Q;
        se.field_f[7] = kd.field_n;
        se.field_f[17] = cg.field_g;
        se.field_f[9] = ld.field_a;
        se.field_f[15] = mk.field_fb;
        se.field_f[20] = gf.field_D;
        se.field_f[6] = pm.field_s;
        se.field_f[21] = kn.field_F;
    }

    public static void a(int param0) {
        field_e = null;
        if (param0 != 4472) {
            return;
        }
        field_c = null;
        field_b = null;
        field_d = null;
        field_f = null;
    }

    final static byte[] a(int param0, CharSequence param1) {
        int var2 = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = Virogrid.field_F ? 1 : 0;
          var2 = param1.length();
          var3 = new byte[var2];
          if (param0 == 1514) {
            break L0;
          } else {
            field_a = 33;
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (var4 >= var2) {
            return var3;
          } else {
            L2: {
              L3: {
                L4: {
                  var5 = param1.charAt(var4);
                  if (var5 <= 0) {
                    break L4;
                  } else {
                    if (128 > var5) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (var5 < 160) {
                    break L5;
                  } else {
                    if (var5 <= 255) {
                      break L3;
                    } else {
                      break L5;
                    }
                  }
                }
                if (var5 != 8364) {
                  if (var5 == 8218) {
                    var3[var4] = (byte)-126;
                    break L2;
                  } else {
                    if (var5 == 402) {
                      var3[var4] = (byte)-125;
                      break L2;
                    } else {
                      if (var5 == 8222) {
                        var3[var4] = (byte)-124;
                        break L2;
                      } else {
                        if (var5 == 8230) {
                          var3[var4] = (byte)-123;
                          break L2;
                        } else {
                          if (var5 == 8224) {
                            var3[var4] = (byte)-122;
                            break L2;
                          } else {
                            if (var5 != 8225) {
                              if (710 == var5) {
                                var3[var4] = (byte)-120;
                                break L2;
                              } else {
                                if (8240 != var5) {
                                  if (var5 != 352) {
                                    if (8249 == var5) {
                                      var3[var4] = (byte)-117;
                                      break L2;
                                    } else {
                                      if (var5 != 338) {
                                        if (var5 != 381) {
                                          if (8216 == var5) {
                                            var3[var4] = (byte)-111;
                                            break L2;
                                          } else {
                                            if (8217 != var5) {
                                              if (var5 != 8220) {
                                                if (var5 != 8221) {
                                                  if (8226 != var5) {
                                                    if (var5 != 8211) {
                                                      if (8212 != var5) {
                                                        if (732 == var5) {
                                                          var3[var4] = (byte)-104;
                                                          break L2;
                                                        } else {
                                                          if (8482 == var5) {
                                                            var3[var4] = (byte)-103;
                                                            break L2;
                                                          } else {
                                                            if (var5 == 353) {
                                                              var3[var4] = (byte)-102;
                                                              break L2;
                                                            } else {
                                                              if (var5 != 8250) {
                                                                if (var5 == 339) {
                                                                  var3[var4] = (byte)-100;
                                                                  break L2;
                                                                } else {
                                                                  if (382 != var5) {
                                                                    if (var5 != 376) {
                                                                      var3[var4] = (byte)63;
                                                                      break L2;
                                                                    } else {
                                                                      var3[var4] = (byte)-97;
                                                                      break L2;
                                                                    }
                                                                  } else {
                                                                    var3[var4] = (byte)-98;
                                                                    break L2;
                                                                  }
                                                                }
                                                              } else {
                                                                var3[var4] = (byte)-101;
                                                                break L2;
                                                              }
                                                            }
                                                          }
                                                        }
                                                      } else {
                                                        var3[var4] = (byte)-105;
                                                        break L2;
                                                      }
                                                    } else {
                                                      var3[var4] = (byte)-106;
                                                      break L2;
                                                    }
                                                  } else {
                                                    var3[var4] = (byte)-107;
                                                    break L2;
                                                  }
                                                } else {
                                                  var3[var4] = (byte)-108;
                                                  break L2;
                                                }
                                              } else {
                                                var3[var4] = (byte)-109;
                                                break L2;
                                              }
                                            } else {
                                              var3[var4] = (byte)-110;
                                              break L2;
                                            }
                                          }
                                        } else {
                                          var3[var4] = (byte)-114;
                                          break L2;
                                        }
                                      } else {
                                        var3[var4] = (byte)-116;
                                        break L2;
                                      }
                                    }
                                  } else {
                                    var3[var4] = (byte)-118;
                                    break L2;
                                  }
                                } else {
                                  var3[var4] = (byte)-119;
                                  break L2;
                                }
                              }
                            } else {
                              var3[var4] = (byte)-121;
                              break L2;
                            }
                          }
                        }
                      }
                    }
                  }
                } else {
                  var3[var4] = (byte)-128;
                  break L2;
                }
              }
              var3[var4] = (byte)var5;
              break L2;
            }
            var4++;
            continue L1;
          }
        }
    }

    final static void a(int param0, oc param1, int param2) {
        hg var3 = gk.field_g;
        var3.g(param2, param0 + 26047);
        if (param0 != -26039) {
            field_c = null;
        }
        var3.a(5, 56);
        var3.a(0, -114);
        var3.a((byte) -126, param1.field_j);
        var3.a(param1.field_g, -90);
        var3.a(param1.field_m, -96);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 1;
        field_b = new String[]{"Play five Rated games", "Capture eight pieces in one move", "Win five Rated games", "Win by capturing all opposing pieces", "Win five Rated games in a row", "Lose five Rated games in a row", "Win by leaving the opponent unable to move", "Win a game using only jumps", "Play 55 Rated games", "Find the ghost during Hallowe'en"};
        field_c = "Open";
        field_f = new int[]{2, 14, 15, 6, 5, 16, 17, 12};
    }
}
