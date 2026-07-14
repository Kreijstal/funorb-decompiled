/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sb extends pu {
    static ee[] field_l;
    static sna field_n;
    static String[] field_m;

    public static void b(int param0) {
        field_l = null;
        if (param0 != 2630) {
            field_n = null;
        }
        field_n = null;
        field_m = null;
    }

    final static void a(int param0, int param1, kv param2, int param3, int param4, int param5, int param6, int param7) {
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        kv var21 = null;
        int[] var22 = null;
        int[] var25 = null;
        int[] var28 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        L0: {
          var19 = BachelorFridge.field_y;
          if (param0 >= dg.field_f) {
            break L0;
          } else {
            param5 = param5 - (-param0 + dg.field_f);
            param0 = dg.field_f;
            break L0;
          }
        }
        L1: {
          if (dg.field_h >= param5 + param0) {
            break L1;
          } else {
            param5 = dg.field_h - param0;
            break L1;
          }
        }
        L2: {
          if (param4 < dg.field_j) {
            param3 = param3 - (dg.field_j + -param4);
            param4 = dg.field_j;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (dg.field_k >= param3 + param4) {
            break L3;
          } else {
            param3 = -param4 + dg.field_k;
            break L3;
          }
        }
        L4: {
          if (param5 <= 0) {
            break L4;
          } else {
            if ((param3 ^ -1) < -1) {
              var21 = param2.a();
              var32 = dg.field_e;
              var10 = dg.field_i;
              var11 = dg.field_c;
              var30 = new int[4];
              dg.a(var30);
              param2.b();
              if (param7 > 71) {
                dg.c(var30[0], var30[1], var30[2], var30[3]);
                var13 = param0 - -(param2.field_q * param4);
                var14 = param2.field_q - param5;
                var31 = var21.field_v;
                var28 = var31;
                var25 = var28;
                var22 = var25;
                var15 = var22;
                var16 = param4;
                L5: while (true) {
                  if (var16 >= param4 + param3) {
                    var21.e(-param2.field_t, -param2.field_u);
                    dg.a(var32, var10, var11);
                    dg.b(var30);
                    return;
                  } else {
                    var17 = param0;
                    L6: while (true) {
                      if (var17 >= param0 + param5) {
                        var13 = var13 + var14;
                        var16++;
                        continue L5;
                      } else {
                        var18 = var31[var13];
                        if (0 != var18) {
                          L7: {
                            L8: {
                              if ((var17 ^ -1) >= -1) {
                                break L8;
                              } else {
                                if (var15[-1 + var13] == 0) {
                                  break L7;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            L9: {
                              if (var16 >= -1) {
                                break L9;
                              } else {
                                if (-1 == var15[-param2.field_q + var13]) {
                                  break L7;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            L10: {
                              if (var17 >= param2.field_q + -1) {
                                break L10;
                              } else {
                                if (var15[1 + var13] == 0) {
                                  break L7;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            if (var16 < -1 + param2.field_p) {
                              if (var15[param2.field_q + var13] == 0) {
                                break L7;
                              } else {
                                var13++;
                                var17++;
                                continue L6;
                              }
                            } else {
                              var13++;
                              var17++;
                              continue L6;
                            }
                          }
                          dg.b(var17, var16, param1, param6);
                          var13++;
                          var17++;
                          continue L6;
                        } else {
                          var13++;
                          var17++;
                          continue L6;
                        }
                      }
                    }
                  }
                }
              } else {
                return;
              }
            } else {
              break L4;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
    }
}
