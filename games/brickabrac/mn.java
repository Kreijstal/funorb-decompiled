/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class mn extends tk {
    int field_C;
    int field_D;
    int field_F;
    static int field_v;
    int field_x;
    static String field_u;
    int field_E;
    static String field_B;
    static int field_A;
    int field_z;
    static String field_w;
    static int field_y;

    public static void f(int param0) {
        field_B = null;
        field_u = null;
        if (param0 != 2) {
            Object var2 = null;
            mn.a(9, (mh) null, (mm) null, (int[]) null, (String) null, 53, (byte) -45, 67L, (String) null);
        }
        field_w = null;
    }

    final static void a(int param0, int param1, id param2, mm param3, byte param4, int param5, int param6) {
        mn.a(-1, (mh) (Object) param2, param3, (int[]) null, param2.field_hc, -1, (byte) -58, param2.field_gc, param2.field_Yb);
        bm.field_d.a(true, true);
        bm.field_d.a((int[]) null, (byte) -120, 0);
        bm.field_d.a((byte) -93);
        nn var12 = bm.field_d;
        if (param4 < 48) {
            return;
        }
        int var8 = param5;
        int var9 = param1;
        int var10 = param6;
        int var11 = param0;
        var12.field_d.a(var9, -79, var11, var10, var8);
    }

    final static void a(jp param0, int param1, int param2, int param3, int param4, int param5, jp param6, int param7, jp param8, int param9, int param10) {
        if (param9 != 1) {
            return;
        }
        param0.d((param1 - param0.field_x) / 2 + (param3 - -(param5 * 5 >> -2026785648)), param2);
        param8.c(param3 + (-param8.field_x + param1) / 2 - -(10 * param5 >> 717354224), -param8.field_z + 480 + param10 + (param2 - 35 / param7));
        param6.c((param5 * 20 >> 832137072) + (-param6.field_x + param1) / 2 + param3, -param6.field_z + (480 + param2) - -param10);
    }

    final static void a(int param0, mh param1, mm param2, int[] param3, String param4, int param5, byte param6, long param7, String param8) {
        o.field_b = param2;
        if (param6 != -58) {
            field_u = null;
        }
        bm.field_d = new nn(param1, param7, param4, param8, param5, param0, param3);
    }

    final static jp[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        jp[] var10 = null;
        jp[] var11_ref_jp__ = null;
        int var11 = 0;
        int var12 = 0;
        jp var13 = null;
        int var14 = 0;
        int var15 = 0;
        var15 = BrickABrac.field_J ? 1 : 0;
        var9 = param5 + (param2 - -param1);
        var10 = new jp[]{new jp(var9, var9), new jp(param6, var9), new jp(var9, var9), new jp(var9, param6), new jp(64, 64), new jp(var9, param6), new jp(var9, var9), new jp(param6, var9), new jp(var9, var9)};
        var11_ref_jp__ = var10;
        var12 = 0;
        L0: while (true) {
          if (var11_ref_jp__.length <= var12) {
            L1: {
              if (param3 == 9361) {
                break L1;
              } else {
                field_w = null;
                break L1;
              }
            }
            var11 = 0;
            L2: while (true) {
              if (var11 >= param2) {
                var11 = 0;
                L3: while (true) {
                  if (param2 <= var11) {
                    var11 = 0;
                    L4: while (true) {
                      if (param6 <= var11) {
                        var11 = 0;
                        L5: while (true) {
                          if (param6 >> 1045704737 <= var11) {
                            return var10;
                          } else {
                            var12 = 0;
                            L6: while (true) {
                              if (var12 >= param1) {
                                var11++;
                                continue L5;
                              } else {
                                var10[1].field_G[param6 * (-var12 + (var9 - 1)) - -var11] = param4;
                                var10[3].field_G[var11 * var9 + (var9 - (1 - -var12))] = param4;
                                var10[7].field_G[var12 * param6 + var11] = param4;
                                var10[5].field_G[var12 + var9 * var11] = param4;
                                var12++;
                                continue L6;
                              }
                            }
                          }
                        }
                      } else {
                        var12 = 0;
                        L7: while (true) {
                          if (param2 <= var12) {
                            var11++;
                            continue L4;
                          } else {
                            var10[7].field_G[var11 + (-1 + (var9 + -var12)) * param6] = param8;
                            var10[5].field_G[var9 * var11 - -var9 - (1 + var12)] = param8;
                            var10[1].field_G[var12 * param6 + var11] = param7;
                            var10[3].field_G[var12 + var11 * var9] = param7;
                            var12++;
                            continue L7;
                          }
                        }
                      }
                    }
                  } else {
                    var12 = 0;
                    L8: while (true) {
                      if (var12 >= var9) {
                        var11++;
                        continue L3;
                      } else {
                        var10[0].field_G[var11 * var9 + var12] = param7;
                        var10[0].field_G[var11 + var12 * var9] = param7;
                        if (var12 < var9 + -var11) {
                          var10[2].field_G[var12 + var9 * var11] = param7;
                          var10[6].field_G[var9 * var12 + var11] = param7;
                          var12++;
                          continue L8;
                        } else {
                          var12++;
                          continue L8;
                        }
                      }
                    }
                  }
                }
              } else {
                var12 = 0;
                L9: while (true) {
                  if (var9 > var12) {
                    var10[6].field_G[var12 + (-1 + var9 - var11) * var9] = param8;
                    var10[8].field_G[var12 + (-var11 + (var9 + -1)) * var9] = param8;
                    var10[2].field_G[-var11 - -var9 + -1 + var9 * var12] = param8;
                    var10[8].field_G[var9 - (1 + var11) + var9 * var12] = param8;
                    var12++;
                    continue L9;
                  } else {
                    var11++;
                    continue L2;
                  }
                }
              }
            }
          } else {
            var13 = var11_ref_jp__[var12];
            var14 = 0;
            L10: while (true) {
              if (var13.field_G.length <= var14) {
                var12++;
                continue L0;
              } else {
                var13.field_G[var14] = param0;
                var14++;
                continue L10;
              }
            }
          }
        }
    }

    mn() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = "From Level";
        field_B = "<%0> cannot join; the game is full.";
        field_w = "Game options changed (<%0>)";
        field_y = 640;
    }
}
