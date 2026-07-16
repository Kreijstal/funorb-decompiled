/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj {
    int field_h;
    int field_b;
    static ee field_g;
    static String field_d;
    static int field_c;
    static java.awt.Frame field_f;
    static n field_a;
    static java.awt.Frame field_i;
    static String field_e;

    final static void a(int param0, int param1, int param2, int param3, ed param4, int param5, int param6, int param7) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        double var15_double = 0.0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        L0: {
          var19 = EscapeVector.field_A;
          if ((param6 ^ -1) < -1) {
            if (20 >= param6) {
              L1: {
                var8 = 0;
                var9 = param6;
                if (var9 <= 20) {
                  break L1;
                } else {
                  var9 = 20;
                  break L1;
                }
              }
              L2: {
                if ((var9 ^ -1) >= -11) {
                  var8 = 0;
                  break L2;
                } else {
                  var8 = -10 + var9;
                  var8 = 224 * (var8 * var8) / 100;
                  var9 = 20 * var9 / (var8 + 20);
                  break L2;
                }
              }
              var10 = var9 * var9;
              var11 = param5 - var9;
              L3: while (true) {
                if (param5 + var9 <= var11) {
                  break L0;
                } else {
                  var12 = param3 + (-var8 + var11 * 640);
                  var13 = (-param5 + var11) * (1 + (var11 + -param5));
                  var14 = -var9;
                  L4: while (true) {
                    if (-1 >= (var14 ^ -1)) {
                      var14 = -(255 * var13 / var10) + 255;
                      var15 = -var8;
                      L5: while (true) {
                        if (var15 >= var8) {
                          var14 = 0;
                          L6: while (true) {
                            if (var14 >= var9) {
                              var11++;
                              continue L3;
                            } else {
                              var15 = var13 + var14 * (var14 - -1);
                              if (var15 < var10) {
                                var16 = -(255 * var15 / var10) + 255;
                                em.field_i[var14 + var12] = var16 * 65793;
                                var14++;
                                continue L6;
                              } else {
                                var14++;
                                continue L6;
                              }
                            }
                          }
                        } else {
                          int incrementValue$3 = var12;
                          var12++;
                          em.field_i[incrementValue$3] = var14 * 65793;
                          var15++;
                          continue L5;
                        }
                      }
                    } else {
                      var15 = var13 + var14 * (1 + var14);
                      if (var15 < var10) {
                        var16 = -(var15 * 255 / var10) + 255;
                        em.field_i[var14 + var12] = var16 * 65793;
                        var14++;
                        continue L4;
                      } else {
                        var14++;
                        continue L4;
                      }
                    }
                  }
                }
              }
            } else {
              if (param6 < 30) {
                var8 = param6 - 20;
                var8 = param4.field_z / 2 * (var8 * var8) / 100;
                if (0 >= var8) {
                  break L0;
                } else {
                  var9 = param4.field_z / 2 * 65536 / var8;
                  var10 = var9 >> -385911967;
                  var11 = 0;
                  L7: while (true) {
                    if (var11 >= var8 + var8) {
                      break L0;
                    } else {
                      var12 = var10 >> 367878128;
                      var10 = var10 + var9;
                      if (var12 >= param4.field_v) {
                        if (var12 < param4.field_v - -param4.field_x) {
                          var13 = param4.field_s * var12;
                          var14 = (var11 + -var8 + param5) * 640 + param7 + param4.field_q;
                          var15_double = 8.0 * Math.sin((double)param1 + (double)((param1 & 7) + 8) * ((double)var12 * 0.001));
                          var15_double = var15_double + Math.sin((double)(param1 + var12) * 0.002 * (double)((5 * param1 & 31) + 16)) * 4.0;
                          var14 = var14 + (int)Math.floor(var15_double + 0.5);
                          var17 = 0;
                          L8: while (true) {
                            if (param4.field_s > var17) {
                              int incrementValue$4 = var13;
                              var13++;
                              var18 = param4.field_B[incrementValue$4];
                              int incrementValue$5 = var14;
                              var14++;
                              em.field_i[incrementValue$5] = var18 - ae.a(4144959, var18 >> -1276284702);
                              var17++;
                              continue L8;
                            } else {
                              var11++;
                              continue L7;
                            }
                          }
                        } else {
                          var11++;
                          continue L7;
                        }
                      } else {
                        var11++;
                        continue L7;
                      }
                    }
                  }
                }
              } else {
                param4.e(param7, param2);
                break L0;
              }
            }
          } else {
            break L0;
          }
        }
        L9: {
          if (param0 == -1276284702) {
            break L9;
          } else {
            field_a = null;
            break L9;
          }
        }
    }

    final static void a(int param0) {
        int var1 = 0;
        int var2 = 0;
        Object var3 = null;
        L0: {
          L1: {
            L2: {
              var2 = EscapeVector.field_A;
              var1 = hm.field_o.field_b.field_j ? 1 : 0;
              if (!bj.e((byte) -32)) {
                break L2;
              } else {
                if ((hm.field_o.field_f ^ -1) != -3) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            if (!aj.b(-119)) {
              if (!bj.e((byte) -122)) {
                if (aj.b(-126)) {
                  break L0;
                } else {
                  if (1 == hm.field_o.field_f) {
                    break L0;
                  } else {
                    hm.field_o = new pf(var1 != 0);
                    break L0;
                  }
                }
              } else {
                if (bj.e((byte) -122)) {
                  break L0;
                } else {
                  if (aj.b(-126)) {
                    break L0;
                  } else {
                    if (1 == hm.field_o.field_f) {
                      break L0;
                    } else {
                      hm.field_o = new pf(var1 != 0);
                      break L0;
                    }
                  }
                }
              }
            } else {
              if (bj.e((byte) -122)) {
                break L0;
              } else {
                if (aj.b(-126)) {
                  break L0;
                } else {
                  if (1 == hm.field_o.field_f) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          hm.field_o = new pf(var1 != 0);
          break L0;
        }
        L3: {
          if (param0 == -883) {
            break L3;
          } else {
            var3 = null;
            qj.a(-40, 111, 116, 104, (ed) null, -68, -42, 107);
            break L3;
          }
        }
    }

    final static int a(byte param0, int param1, int param2) {
        if (param0 != -38) {
            qj.b(69);
        }
        return ni.a(param2, param1, false, ka.field_d);
    }

    qj(int param0, int param1) {
        ((qj) this).field_b = param1;
        ((qj) this).field_h = param0;
    }

    public static void b(int param0) {
        field_i = null;
        field_g = null;
        field_e = null;
        if (param0 != -10497) {
            field_c = -87;
        }
        field_f = null;
        field_d = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new ee("");
        field_d = "Ship";
        field_c = 0;
        field_a = new n(256);
        field_e = " - shoot";
    }
}
