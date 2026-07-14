/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gl {
    int field_e;
    byte[] field_m;
    int field_h;
    int field_g;
    byte[] field_b;
    static iw field_a;
    int field_k;
    int field_j;
    int field_l;
    static hd field_c;
    static int[] field_d;
    static String field_f;
    static String field_i;
    int field_n;

    final static int a(int param0, byte param1, int param2, int param3, ml param4, int param5, int param6, int param7, int param8, int param9) {
        if (param1 <= 32) {
            field_a = null;
        }
        int var10 = param4.l(2, 59);
        if (0 != var10) {
            if (1 == var10) {
                return (0 != param5 ? param4.l(param5, 59) : 0) + param8;
            }
            if ((var10 ^ -1) == -3) {
                return param8 + (param9 == 0 ? 0 : param4.l(param9, 59)) - -param0;
            }
            if ((var10 ^ -1) != -4) {
                throw new IllegalStateException();
            }
            return param8 + (param3 == 0 ? 0 : param4.l(param3, 59)) + param7 + param0;
        }
        return 0 != param2 ? param4.l(param2, 59) : 0;
    }

    final static void a(int param0, nu param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        L0: {
          var11 = Kickabout.field_G;
          if (param0 == 6711) {
            break L0;
          } else {
            var12 = null;
            gl.a(-102, (nu) null);
            break L0;
          }
        }
        L1: {
          if (in.field_c == null) {
            in.field_c = new int[2][4][4][10][2];
            break L1;
          } else {
            break L1;
          }
        }
        if (nd.field_d == param1) {
          return;
        } else {
          nd.field_d = param1;
          var2 = 0;
          L2: while (true) {
            if (-3 >= (var2 ^ -1)) {
              return;
            } else {
              var3 = 0;
              L3: while (true) {
                if (var3 >= 4) {
                  var2++;
                  continue L2;
                } else {
                  var4 = 0;
                  L4: while (true) {
                    if (4 <= var4) {
                      var3++;
                      continue L3;
                    } else {
                      var5 = in.field_c[var2][var3][var4].length;
                      var6 = 0;
                      L5: while (true) {
                        if (var5 <= var6) {
                          var4++;
                          continue L4;
                        } else {
                          L6: {
                            if (var4 != -1) {
                              if (-3 != var4) {
                                var7 = var6 * 896 / (-1 + var5);
                                break L6;
                              } else {
                                var7 = 896;
                                break L6;
                              }
                            } else {
                              var7 = 0;
                              break L6;
                            }
                          }
                          L7: {
                            if (var4 == 1) {
                              var8 = 0;
                              break L7;
                            } else {
                              if ((var4 ^ -1) != -4) {
                                var8 = 1344 * var6 / (-1 + var5);
                                break L7;
                              } else {
                                var8 = 1344;
                                break L7;
                              }
                            }
                          }
                          var9 = param1.field_V.field_t;
                          var10 = param1.field_V.field_p;
                          param1.field_V.field_t = var7 << 453691152;
                          param1.field_V.field_p = var8 << -2116445584;
                          vl.a(param1, (byte) -75);
                          param1.field_V.field_t = var9;
                          param1.field_V.field_p = var10;
                          gt.a(var3 + 1, var2, (byte) 112, param1.field_r[var2]);
                          in.field_c[var2][var3][var4][var6][0] = ge.field_m[0];
                          in.field_c[var2][var3][var4][var6][1] = ge.field_m[1];
                          var6++;
                          continue L5;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static ut[] a(int param0, byte param1, int param2, int param3, int param4) {
        int var5 = 34 % ((param1 - 38) / 37);
        return q.a(1, 1, param2, 1, 3, -1481, param4, param0, param3);
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        field_d = null;
        field_f = null;
        if (param0 <= 25) {
            return;
        }
        field_i = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new iw(256);
        field_i = "help";
        field_f = "Starting price";
    }
}
