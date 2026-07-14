/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pi {
    static mh field_c;
    static String field_a;
    static dh field_d;
    static String field_b;

    final static void a(int param0) {
        int var2 = 0;
        pg var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        nk var13 = null;
        int var14 = 0;
        int var15 = 0;
        nk var16 = null;
        L0: {
          var12 = Chess.field_G;
          var13 = tk.field_h;
          var16 = var13;
          var2 = var16.i(-125);
          if (param0 >= 102) {
            break L0;
          } else {
            field_d = null;
            break L0;
          }
        }
        var3 = (pg) (Object) nd.field_h.g(-18110);
        L1: while (true) {
          L2: {
            if (var3 == null) {
              break L2;
            } else {
              if (var2 == var3.field_q) {
                break L2;
              } else {
                var3 = (pg) (Object) nd.field_h.a((byte) -102);
                continue L1;
              }
            }
          }
          if (var3 == null) {
            si.d(65280);
            return;
          } else {
            L3: {
              var4 = var16.i(-89);
              if (var4 != 0) {
                ag.field_d[0] = ci.field_J;
                var5 = var3.field_u;
                var6_int = 1;
                L4: while (true) {
                  if (var6_int >= var4) {
                    ek.a(var5, var4, (byte) 127);
                    var6_int = 0;
                    L5: while (true) {
                      if (var4 <= var6_int) {
                        pd.b(var5, -109);
                        var3.field_t = new String[2][var5];
                        var6 = new String[2][var5];
                        var3.field_j = new int[2][var5 * 4];
                        var7 = new int[2][var5 * 4];
                        var8 = ed.field_b;
                        var9 = 0;
                        var10 = 0;
                        L6: while (true) {
                          if (var8 <= var9) {
                            var14 = 0;
                            var9 = var14;
                            var15 = 0;
                            var10 = var15;
                            L7: while (true) {
                              if (var14 >= var8) {
                                break L3;
                              } else {
                                var11 = vn.field_Ab[var14 + var5];
                                var6[1][var15] = ag.field_d[var11];
                                var7[1][4 * var15] = hg.field_d[var11];
                                var7[1][1 + 4 * var15] = hn.field_e[var11];
                                var7[1][2 + var15 * 4] = in.field_j[var11];
                                var7[1][3 + var15 * 4] = oc.field_n[var11];
                                if (qd.a((byte) 13, ag.field_d[var11])) {
                                  if (0 == hn.field_e[var11] - (-in.field_j[var11] - oc.field_n[var11])) {
                                    var6[1][var15] = null;
                                    var15--;
                                    var15++;
                                    var14++;
                                    continue L7;
                                  } else {
                                    var15++;
                                    var14++;
                                    continue L7;
                                  }
                                } else {
                                  var15++;
                                  var14++;
                                  continue L7;
                                }
                              }
                            }
                          } else {
                            var11 = vn.field_Ab[var9];
                            var6[0][var10] = ag.field_d[var11];
                            var7[0][var10 * 4] = hg.field_d[var11];
                            var7[0][1 + 4 * var10] = hn.field_e[var11];
                            var7[0][2 + 4 * var10] = in.field_j[var11];
                            var7[0][3 + 4 * var10] = oc.field_n[var11];
                            if (qd.a((byte) 13, ag.field_d[var11])) {
                              if (in.field_j[var11] + (hn.field_e[var11] + oc.field_n[var11]) == 0) {
                                var6[0][var10] = null;
                                var10--;
                                var9++;
                                var10++;
                                continue L6;
                              } else {
                                var9++;
                                var10++;
                                continue L6;
                              }
                            } else {
                              var9++;
                              var10++;
                              continue L6;
                            }
                          }
                        }
                      } else {
                        nj.a((byte) 20, (p) (Object) var16);
                        if (-1 != (var6_int ^ -1)) {
                          lf.a(jb.field_b, (byte) 117, l.field_o, var6_int, gm.field_c, sl.field_e);
                          var6_int++;
                          continue L5;
                        } else {
                          var3.field_r = l.field_o;
                          var3.field_k = sl.field_e;
                          var3.field_p = gm.field_c;
                          var3.field_m = jb.field_b;
                          lf.a(jb.field_b, (byte) 117, l.field_o, var6_int, gm.field_c, sl.field_e);
                          var6_int++;
                          continue L5;
                        }
                      }
                    }
                  } else {
                    ag.field_d[var6_int] = var13.d(0);
                    var6_int++;
                    continue L4;
                  }
                }
              } else {
                break L3;
              }
            }
            var3.field_l = true;
            var3.c(-2193);
            return;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int[] var17 = null;
        int[] var10_ref_int__ = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = Chess.field_G;
        while (true) {
            param5--;
            if (0 > param5) {
                break;
            }
            var17 = param3;
            var10_ref_int__ = var17;
            var11 = param7;
            var12 = param8;
            var13 = param2;
            var14 = param6;
            var15 = var17[var11] >> 1170726593 & 8355711;
            var10_ref_int__[var11] = (ce.a(var14, 33503610) >> 2014530545) - -(ce.a(var13, 33423475) >> -1207284919) - (-(ce.a(33423361, var12) >> 1443047329) - var15);
            param8 = param8 + param4;
            param7++;
            param6 = param6 + param0;
            param2 = param2 + param1;
        }
        int var10 = 48 / ((-44 - param9) / 39);
    }

    public static void b(int param0) {
        field_c = null;
        field_d = null;
        field_a = null;
        int var1 = -39 / ((param0 - -20) / 50);
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Invite <%0> to this game";
    }
}
