/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class k extends eh {
    private int field_W;
    static String field_V;
    private int field_S;
    static String field_T;
    private int field_Y;
    private int field_Z;
    private int field_U;
    private int field_X;
    static String field_ab;

    final void b(int param0, int param1, int param2, int param3) {
        if (0 >= param0) {
            ((k) this).a(param3, (byte) 101, param1);
            return;
        }
        ((k) this).field_Z = param0;
        ((k) this).field_X = param3;
        ((k) this).field_U = param1;
        if (param2 != -18807) {
            k.a(true, 101);
        }
        ((k) this).field_W = ((k) this).field_y;
        ((k) this).field_S = 0;
        ((k) this).field_Y = ((k) this).field_C;
    }

    k(fm param0, int param1, int param2) {
        super(param0, param1, param2);
        ((k) this).field_S = 0;
        ((k) this).field_Z = 0;
    }

    public static void h(byte param0) {
        field_T = null;
        field_V = null;
        field_ab = null;
        int var1 = -88 / ((80 - param0) / 36);
    }

    final static void a(boolean param0, int param1) {
        if (param1 < 19) {
            field_T = null;
        }
        if (null != me.field_a) {
            me.field_a.a(false, param0);
        }
    }

    void j(int param0) {
        if (param0 != 194) {
            ((k) this).j(-9);
        }
    }

    void b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        var16 = Chess.field_G;
        wb.c(6 + param2, 35 + param1, -12 + ((k) this).field_y, ((k) this).field_C - 40, 2105376, 0);
        var5 = 211;
        var4 = 35;
        var6 = 194;
        var7 = 0;
        var8 = param1;
        L0: while (true) {
          if (var7 >= var4) {
            L1: {
              var4 = 22;
              var5 = 194;
              var6 = 169;
              if (param0 == -14239) {
                break L1;
              } else {
                field_V = null;
                break L1;
              }
            }
            var7 = 0;
            var8 = param1 - -35;
            L2: while (true) {
              if (var7 >= var4) {
                vk.field_a.b(-90 + ((k) this).field_y + param2, param1 - -10);
                ml.a(35 + param1, jc.field_d, 5 + param2, -128, ((k) this).field_y - 10);
                ml.a(-22 + (((k) this).field_C + param1), ej.field_e, param2, -127, ((k) this).field_y);
                var4 = ((k) this).field_C + -79;
                var6 = 127;
                var5 = 169;
                var7 = 0;
                var8 = param1 - -57;
                L3: while (true) {
                  if (var4 <= var7) {
                    return;
                  } else {
                    var9 = var5 + (var6 + -var5) * var7 / var4;
                    var9 = var9 | (var9 << 964523560 | var9 << 1138657104);
                    wb.a(param2, var8, 6, var9);
                    wb.a(((k) this).field_y + (param2 - 6), var8, 6, var9);
                    var7++;
                    var8++;
                    continue L3;
                  }
                }
              } else {
                var9 = var5 - -((-var5 + var6) * var7 / var4);
                var9 = var9 | (var9 << -2130049752 | var9 << -1199007632);
                wb.a(param2, var8, 6, var9);
                wb.a(-6 + (param2 - -((k) this).field_y), var8, 6, var9);
                var8++;
                var7++;
                continue L2;
              }
            }
          } else {
            if (wb.field_a <= var8) {
              if (var8 < wb.field_b) {
                L4: {
                  var9 = var5 - -(var7 * (var6 + -var5) / var4);
                  var10 = 0;
                  var11 = ((k) this).field_y;
                  if (var7 > 20) {
                    break L4;
                  } else {
                    L5: while (true) {
                      if ((var10 ^ -1) < -21) {
                        break L4;
                      } else {
                        var12 = (-var10 + 20) * (20 - var10) + (20 + -var7) * (20 - var7);
                        if (var12 <= 462) {
                          if ((var12 ^ -1) <= -421) {
                            var13 = var9 * (462 - var12) / 42;
                            var13 = var13 | (var13 << 2099047536 | var13 << -1988578552);
                            wb.field_d[param2 + (var8 * wb.field_h + var10)] = var13;
                            var10++;
                            continue L5;
                          } else {
                            break L4;
                          }
                        } else {
                          var10++;
                          continue L5;
                        }
                      }
                    }
                  }
                }
                L6: {
                  if ((var7 ^ -1) < -21) {
                    break L6;
                  } else {
                    var12 = var11;
                    var11 -= 21;
                    var13 = 0;
                    L7: while (true) {
                      L8: {
                        if (20 < var13) {
                          break L8;
                        } else {
                          var14 = (20 + -var7) * (-var7 + 20) - -(var13 * var13);
                          if (462 < var14) {
                            break L8;
                          } else {
                            if (var14 >= 420) {
                              var15 = (-var14 + 462) * var9 / 42;
                              var15 = var15 | (var15 << 1412984464 | var15 << -986899224);
                              wb.field_d[var11 + var8 * wb.field_h + param2] = var15;
                              var11++;
                              var13++;
                              continue L7;
                            } else {
                              var12 = 1 + var11;
                              var11++;
                              var13++;
                              continue L7;
                            }
                          }
                        }
                      }
                      var11 = var12;
                      break L6;
                    }
                  }
                }
                var9 = var9 | (var9 << -1395942808 | var9 << -2131303632);
                wb.a(var10 - -param2, var8, var11 - var10, var9);
                var7++;
                var8++;
                continue L0;
              } else {
                var7++;
                var8++;
                continue L0;
              }
            } else {
              var7++;
              var8++;
              continue L0;
            }
          }
        }
    }

    boolean a(int param0) {
        ((k) this).i((byte) -109);
        if (param0 <= 46) {
            field_ab = null;
        }
        return super.a(116);
    }

    void i(byte param0) {
        if ((((k) this).field_Z ^ -1) >= -1) {
            return;
        }
        if (param0 > -84) {
            return;
        }
        ((k) this).a(((k) this).field_X, (byte) 118, ((k) this).field_U);
        ((k) this).field_Z = 0;
        ((k) this).j(194);
    }

    boolean g(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (param0 > -4) {
            ((k) this).field_W = 63;
        }
        if ((((k) this).field_Z ^ -1) >= -1) {
        } else {
            var2 = ((k) this).field_X;
            var3 = ((k) this).field_U;
            ((k) this).field_S = ((k) this).field_S + 1;
            if (((k) this).field_S + 1 >= ((k) this).field_Z) {
                ((k) this).field_Z = 0;
                ((k) this).j(194);
            } else {
                var4 = (((k) this).field_Z * 2 - ((k) this).field_S) * ((k) this).field_S;
                var5 = ((k) this).field_Z * ((k) this).field_Z;
                var2 = ((k) this).field_W + var4 * (((k) this).field_X - ((k) this).field_W) / var5;
                var3 = (((k) this).field_U - ((k) this).field_Y) * var4 / var5 + ((k) this).field_Y;
            }
            ((k) this).a(var2, (byte) 108, var3);
        }
        return super.g((byte) -67);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_T = "You have 1 unread message!";
        field_V = "Loading graphics";
        field_ab = "Find opponents";
    }
}
