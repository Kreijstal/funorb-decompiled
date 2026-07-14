/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class be extends oh {
    static int field_h;
    static bi field_k;
    static long field_l;
    static String field_i;
    byte[] field_j;

    final static void a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        int stackIn_20_3 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        int stackIn_21_3 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        int stackIn_22_3 = 0;
        int stackIn_22_4 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_24_2 = 0;
        int stackIn_24_3 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_25_2 = 0;
        int stackIn_25_3 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_26_2 = 0;
        int stackIn_26_3 = 0;
        int stackIn_26_4 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        int stackOut_23_3 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        int stackOut_25_3 = 0;
        int stackOut_25_4 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        int stackOut_24_3 = 0;
        int stackOut_24_4 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        int stackOut_19_3 = 0;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        int stackOut_21_2 = 0;
        int stackOut_21_3 = 0;
        int stackOut_21_4 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
        int stackOut_20_3 = 0;
        int stackOut_20_4 = 0;
        L0: {
          var15 = ShatteredPlansClient.field_F ? 1 : 0;
          if (param2 >= param6) {
            break L0;
          } else {
            var10 = param6;
            param6 = param2;
            param2 = var10;
            var10 = param4;
            param4 = param7;
            param7 = var10;
            param1 = param8 + -param1;
            break L0;
          }
        }
        L1: {
          var9 = 0;
          if (gf.field_i > param2) {
            break L1;
          } else {
            if (param6 <= gf.field_l) {
              L2: {
                if (param4 > param7) {
                  var10 = param6;
                  param6 = param2;
                  param2 = var10;
                  var10 = param4;
                  param4 = param7;
                  param7 = var10;
                  param1 = param8 + -param1;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (param7 < gf.field_a) {
                  break L3;
                } else {
                  if (param4 > gf.field_f) {
                    break L3;
                  } else {
                    L4: {
                      var9 = var9 + param1 / param8;
                      param1 = param1 % param8;
                      if ((param1 ^ -1) <= -1) {
                        break L4;
                      } else {
                        param1 = param1 + param8;
                        var9--;
                        break L4;
                      }
                    }
                    var10 = (int)Math.sqrt((double)((-param6 + param2) * (param2 - param6) + (param7 - param4) * (param7 + -param4))) - -1;
                    if (param0 > 27) {
                      var11 = param6;
                      var12 = param4;
                      L5: while (true) {
                        if (param1 >= var10) {
                          L6: {
                            stackOut_23_0 = var11;
                            stackOut_23_1 = var12;
                            stackOut_23_2 = param2;
                            stackOut_23_3 = param7;
                            stackIn_25_0 = stackOut_23_0;
                            stackIn_25_1 = stackOut_23_1;
                            stackIn_25_2 = stackOut_23_2;
                            stackIn_25_3 = stackOut_23_3;
                            stackIn_24_0 = stackOut_23_0;
                            stackIn_24_1 = stackOut_23_1;
                            stackIn_24_2 = stackOut_23_2;
                            stackIn_24_3 = stackOut_23_3;
                            if ((var9 & 1) == 0) {
                              stackOut_25_0 = stackIn_25_0;
                              stackOut_25_1 = stackIn_25_1;
                              stackOut_25_2 = stackIn_25_2;
                              stackOut_25_3 = stackIn_25_3;
                              stackOut_25_4 = param3;
                              stackIn_26_0 = stackOut_25_0;
                              stackIn_26_1 = stackOut_25_1;
                              stackIn_26_2 = stackOut_25_2;
                              stackIn_26_3 = stackOut_25_3;
                              stackIn_26_4 = stackOut_25_4;
                              break L6;
                            } else {
                              stackOut_24_0 = stackIn_24_0;
                              stackOut_24_1 = stackIn_24_1;
                              stackOut_24_2 = stackIn_24_2;
                              stackOut_24_3 = stackIn_24_3;
                              stackOut_24_4 = param5;
                              stackIn_26_0 = stackOut_24_0;
                              stackIn_26_1 = stackOut_24_1;
                              stackIn_26_2 = stackOut_24_2;
                              stackIn_26_3 = stackOut_24_3;
                              stackIn_26_4 = stackOut_24_4;
                              break L6;
                            }
                          }
                          gf.g(stackIn_26_0, stackIn_26_1, stackIn_26_2, stackIn_26_3, stackIn_26_4);
                          return;
                        } else {
                          L7: {
                            var13 = (param2 + -param6) * param1 / var10 + param6;
                            var14 = param4 - -((-param4 + param7) * param1 / var10);
                            stackOut_19_0 = var11;
                            stackOut_19_1 = var12;
                            stackOut_19_2 = var13;
                            stackOut_19_3 = var14;
                            stackIn_21_0 = stackOut_19_0;
                            stackIn_21_1 = stackOut_19_1;
                            stackIn_21_2 = stackOut_19_2;
                            stackIn_21_3 = stackOut_19_3;
                            stackIn_20_0 = stackOut_19_0;
                            stackIn_20_1 = stackOut_19_1;
                            stackIn_20_2 = stackOut_19_2;
                            stackIn_20_3 = stackOut_19_3;
                            if ((var9 & 1) != 0) {
                              stackOut_21_0 = stackIn_21_0;
                              stackOut_21_1 = stackIn_21_1;
                              stackOut_21_2 = stackIn_21_2;
                              stackOut_21_3 = stackIn_21_3;
                              stackOut_21_4 = param5;
                              stackIn_22_0 = stackOut_21_0;
                              stackIn_22_1 = stackOut_21_1;
                              stackIn_22_2 = stackOut_21_2;
                              stackIn_22_3 = stackOut_21_3;
                              stackIn_22_4 = stackOut_21_4;
                              break L7;
                            } else {
                              stackOut_20_0 = stackIn_20_0;
                              stackOut_20_1 = stackIn_20_1;
                              stackOut_20_2 = stackIn_20_2;
                              stackOut_20_3 = stackIn_20_3;
                              stackOut_20_4 = param3;
                              stackIn_22_0 = stackOut_20_0;
                              stackIn_22_1 = stackOut_20_1;
                              stackIn_22_2 = stackOut_20_2;
                              stackIn_22_3 = stackOut_20_3;
                              stackIn_22_4 = stackOut_20_4;
                              break L7;
                            }
                          }
                          gf.g(stackIn_22_0, stackIn_22_1, stackIn_22_2, stackIn_22_3, stackIn_22_4);
                          var12 = var14;
                          var11 = var13;
                          var9++;
                          param1 = param1 + param8;
                          continue L5;
                        }
                      }
                    } else {
                      return;
                    }
                  }
                }
              }
              return;
            } else {
              break L1;
            }
          }
        }
    }

    final static void a(qr param0, int param1, qr param2, int param3, int param4, byte param5, int param6, qr param7, byte[] param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param5 == -122) {
          sb.field_h = param6;
          ks.field_e = param8;
          ec.field_p = -1L;
          em.field_k = param8.length;
          he.field_p = null;
          np.field_a = null;
          id.field_c = new byte[(sb.field_h - -7) / 8];
          k.field_i = false;
          var10 = 0;
          var11 = 0;
          L0: while (true) {
            if (var11 >= ks.field_e.length) {
              L1: {
                var10 = (7 + var10) / 8;
                qj.field_f = new byte[var10];
                if (null == param7.field_M) {
                  param7.field_M = new pf();
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                gr.field_p = param7.field_M;
                gr.field_p.a(0);
                ShatteredPlansClient.field_H = new in(param1);
                a.field_j = -1;
                bh.field_h = -1;
                ah.field_X = 0;
                kf.field_g = 0;
                if (param0.field_M == null) {
                  param0.field_M = new pf();
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                kj.field_a = param0.field_M;
                kj.field_a.a(0);
                ea.field_b = new in(param3);
                if (param2.field_M == null) {
                  param2.field_M = new pf();
                  break L3;
                } else {
                  break L3;
                }
              }
              uo.field_a = param2.field_M;
              uo.field_a.a(0);
              qp.field_w = new in(param4);
              sf.field_e = 0L;
              ks.field_i = param9;
              return;
            } else {
              var10 = var10 + (ks.field_e[var11] & 255);
              var11++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        field_k = null;
        if (param0 < 67) {
            be.a((byte) -90, 116, 111, -79, -48, 35, -128, -23, -56);
        }
        field_i = null;
    }

    be(byte[] param0) {
        ((be) this).field_j = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Total number of players in game will not exceed 6.";
    }
}
