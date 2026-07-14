/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qb {
    static bg field_c;
    static jj field_a;
    static ci[] field_f;
    static String field_d;
    static fd field_b;
    static rj field_h;
    static String field_e;
    static int field_g;

    final static bg a(String param0, byte param1, String param2, fa param3) {
        if (param1 != -36) {
            boolean discarded$0 = qb.a('ﾓ', (byte) -10);
        }
        int var4 = param3.c(-1, param2);
        int var5 = param3.a(param1 + -90, var4, param0);
        return jj.a(param3, var5, (byte) 18, var4);
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 > -31) {
            return;
        }
        field_b = null;
        field_e = null;
        field_f = null;
        field_a = null;
        field_h = null;
        field_c = null;
    }

    final static boolean a(char param0, byte param1) {
        if (!(!Character.isISOControl(param0))) {
            return false;
        }
        if (!(!pd.a(75, param0))) {
            return true;
        }
        int var2 = -119 % ((param1 - 0) / 56);
        if (param0 != 45) {
            if (160 != param0) {
                if (param0 != 32) {
                    if (param0 != 95) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    final static void b(int param0) {
        int var2 = 0;
        ja var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        uc var13 = null;
        int var14 = 0;
        int var15 = 0;
        uc var16 = null;
        int[][] var20 = null;
        var12 = Terraphoenix.field_V;
        if (param0 == 0) {
          var13 = mk.field_j;
          var16 = var13;
          var2 = var16.a(param0 ^ -16384);
          var3 = (ja) (Object) vd.field_l.d(9272);
          L0: while (true) {
            L1: {
              if (var3 == null) {
                break L1;
              } else {
                if (var3.field_o == var2) {
                  break L1;
                } else {
                  var3 = (ja) (Object) vd.field_l.e((byte) -119);
                  continue L0;
                }
              }
            }
            if (var3 != null) {
              L2: {
                var4 = var16.a(-16384);
                if (var4 == 0) {
                  break L2;
                } else {
                  eh.field_k[0] = kj.field_f;
                  var5 = var3.field_k;
                  var6_int = 1;
                  L3: while (true) {
                    if (var6_int >= var4) {
                      le.a(var4, var5, false);
                      var6_int = 0;
                      L4: while (true) {
                        if (var6_int >= var4) {
                          df.b(param0 + 0, var5);
                          var6 = new String[2][var5];
                          var20 = new int[2][4 * var5];
                          var8 = pb.field_b;
                          var9 = 0;
                          var10 = 0;
                          L5: while (true) {
                            if (var8 <= var9) {
                              var14 = 0;
                              var9 = var14;
                              var15 = 0;
                              var10 = var15;
                              L6: while (true) {
                                if (var8 <= var14) {
                                  break L2;
                                } else {
                                  var11 = pf.field_b[var14 + var5];
                                  var6[1][var15] = eh.field_k[var11];
                                  var20[1][4 * var15] = a.field_c[var11];
                                  var20[1][1 + var15 * 4] = oa.field_a[var11];
                                  var20[1][2 + var15 * 4] = oa.field_c[var11];
                                  var20[1][3 + var15 * 4] = dd.field_L[var11];
                                  if (me.a(-88, eh.field_k[var11])) {
                                    if (0 == oa.field_c[var11] + (oa.field_a[var11] + dd.field_L[var11])) {
                                      var6[1][var15] = null;
                                      var15--;
                                      var15++;
                                      var14++;
                                      continue L6;
                                    } else {
                                      var15++;
                                      var14++;
                                      continue L6;
                                    }
                                  } else {
                                    var15++;
                                    var14++;
                                    continue L6;
                                  }
                                }
                              }
                            } else {
                              var11 = pf.field_b[var9];
                              var6[0][var10] = eh.field_k[var11];
                              var20[0][4 * var10] = a.field_c[var11];
                              var20[0][var10 * 4 + 1] = oa.field_a[var11];
                              var20[0][2 + var10 * 4] = oa.field_c[var11];
                              var20[0][3 + 4 * var10] = dd.field_L[var11];
                              if (me.a(122, eh.field_k[var11])) {
                                if (-1 == (dd.field_L[var11] + oa.field_a[var11] - -oa.field_c[var11] ^ -1)) {
                                  var6[0][var10] = null;
                                  var10--;
                                  var9++;
                                  var10++;
                                  continue L5;
                                } else {
                                  var9++;
                                  var10++;
                                  continue L5;
                                }
                              } else {
                                var9++;
                                var10++;
                                continue L5;
                              }
                            }
                          }
                        } else {
                          fb.a(-20936, (dh) (Object) var16);
                          if (0 != var6_int) {
                            th.a(var6_int, -1, jc.field_D, hb.field_j, dc.field_a, lb.field_d);
                            var6_int++;
                            continue L4;
                          } else {
                            th.a(var6_int, -1, jc.field_D, hb.field_j, dc.field_a, lb.field_d);
                            var6_int++;
                            continue L4;
                          }
                        }
                      }
                    } else {
                      eh.field_k[var6_int] = var13.e(param0 + -1);
                      var6_int++;
                      continue L3;
                    }
                  }
                }
              }
              var3.b((byte) 12);
              return;
            } else {
              gb.g(-17464);
              return;
            }
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Music: ";
        field_a = new jj();
        field_h = new rj();
        field_g = 64;
    }
}
