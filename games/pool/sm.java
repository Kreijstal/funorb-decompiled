/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sm extends om {
    static aj field_C;
    static dd field_z;
    static int field_D;
    static String field_B;
    static String field_E;
    static String field_A;

    public static void c(int param0) {
        field_z = null;
        field_B = null;
        field_A = null;
        field_E = null;
        if (param0 != 2) {
            field_A = null;
        }
        field_C = null;
    }

    private sm(lr param0, int param1) {
        super(param0, param1);
    }

    sm(int param0) {
        this(lc.field_O, param0);
    }

    final static boolean d(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = Pool.field_O;
          if (param0 == -18791) {
            break L0;
          } else {
            boolean discarded$2 = sm.d(72);
            break L0;
          }
        }
        if (vj.field_c[86]) {
          L1: {
            var1 = -1;
            var2 = qi.field_a;
            if (var2 == 16) {
              var1 = 0;
              break L1;
            } else {
              if (-18 != var2) {
                if (var2 == 18) {
                  var1 = 2;
                  break L1;
                } else {
                  if (19 == var2) {
                    var1 = 3;
                    break L1;
                  } else {
                    if (var2 == 20) {
                      var1 = 4;
                      break L1;
                    } else {
                      if (-22 != var2) {
                        if (22 != var2) {
                          if (var2 != 23) {
                            if ((var2 ^ -1) == -25) {
                              var1 = 8;
                              break L1;
                            } else {
                              if (25 == var2) {
                                var1 = 9;
                                break L1;
                              } else {
                                return false;
                              }
                            }
                          } else {
                            var1 = 7;
                            break L1;
                          }
                        } else {
                          var1 = 6;
                          break L1;
                        }
                      } else {
                        var1 = 5;
                        break L1;
                      }
                    }
                  }
                }
              } else {
                var1 = 1;
                break L1;
              }
            }
          }
          L2: {
            if (vj.field_c[81]) {
              var1 += 10;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (!vj.field_c[82]) {
              break L3;
            } else {
              var1 += 20;
              break L3;
            }
          }
          pd.field_i = pd.field_i ^ 1L << var1;
          rq.a(0, var1);
          return true;
        } else {
          return false;
        }
    }

    final String c(int param0, ei param1) {
        if (param0 != -1) {
            return null;
        }
        return v.a(param1.field_m.length(), 0, '*');
    }

    final static void a(int param0, bf param1, int param2, pq param3) {
        long var9 = 0L;
        if (param2 <= 111) {
            return;
        }
        param3.a(param0 + -1, 118);
        int var4 = -param1.field_j + param1.field_l >> -1314126488;
        int var5 = param1.field_a - param1.field_f >> 1883941224;
        int var6 = rf.a(aj.a(var4, false, var4) - -aj.a(var5, false, var5), -123);
        var4 = lh.a(var6, (byte) -101, (long)var4);
        var5 = lh.a(var6, (byte) -61, (long)var5);
        long var7 = param3.e(-14770);
        if (param1.field_f == param1.field_a) {
            param3.field_n = param3.field_n * kp.field_m >> -703839960;
            param3.field_I = -(param3.field_I * dj.field_g) >> 1714461096;
            param3.field_b = -(kp.field_m * param3.field_b) >> 1467207784;
            // if_icmpge L603
            nn.field_e[td.field_b][0] = (param3.field_g <= param1.field_a ? -524288 : 524288) + param3.field_g;
            nn.field_e[td.field_b][1] = param3.field_k;
            nn.field_e[td.field_b][2] = -524288;
        } else {
            if (param1.field_l == param1.field_j) {
                param3.field_n = -(param3.field_n * kp.field_m) >> 12666440;
                param3.field_b = param3.field_b * kp.field_m >> -664827800;
                param3.field_t = -(dj.field_g * param3.field_t) >> 1069340968;
                // if_icmpge L603
                nn.field_e[td.field_b][0] = param3.field_g;
                nn.field_e[td.field_b][1] = param3.field_k + (param3.field_k <= param1.field_j ? -524288 : 524288);
                nn.field_e[td.field_b][2] = -524288;
            } else {
                var9 = (long)(aj.a(param3.field_I, false, var4) + aj.a(param3.field_t, false, var5));
                param3.field_I = (int)((long)param3.field_I - (od.a((long)var4, var9, false) * (long)(256 + dj.field_g) >> 704883784));
                param3.field_t = (int)((long)param3.field_t - (od.a((long)var5, var9, false) * (long)(256 + dj.field_g) >> 1836957384));
                param3.field_b = 0;
                param3.field_n = 0;
                if (td.field_b < nn.field_e.length) {
                    nn.field_e[td.field_b][0] = -(524288 * var4) + param3.field_g;
                    nn.field_e[td.field_b][1] = param3.field_k + -(var5 * 524288);
                    nn.field_e[td.field_b][2] = -524288;
                }
            }
        }
        param3.field_K = kp.field_m * param3.field_K >> -1743497528;
        param3.field_v = 1;
        var9 = param3.e(-14770);
        if (!(td.field_b >= cf.field_g.length)) {
            td.field_b = td.field_b + 1;
            cf.field_g[td.field_b] = (int)(var7 + -var9);
        }
    }

    final static wc a(String param0, int param1) {
        int var2 = -40 / ((param1 - 36) / 53);
        if (ra.field_e == pa.field_I) {
            return null;
        }
        if (td.field_f == pa.field_I) {
            if (param0.equals((Object) (Object) l.field_c)) {
                pa.field_I = aa.field_c;
                return uf.field_gb;
            }
        }
        l.field_c = param0;
        uf.field_gb = null;
        pa.field_I = ra.field_e;
        return null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = "Use the mouse wheel <img=1> or drag <img=11><img=0> to zoom in and out.";
        field_E = "This option is restricted. Your rating is currently <%0>.<br>Can you achieve the qualifying rating of <%1>?";
        field_A = "<%0> must play <%1> more rated games before playing with the current options.";
    }
}
