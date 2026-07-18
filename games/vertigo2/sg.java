/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sg {
    int field_f;
    static int field_e;
    int field_b;
    int field_g;
    static int field_d;
    static cc field_a;
    static String field_c;
    int field_h;

    final static void a(int param0) {
        Object var2 = null;
        aj.a((String) null, mk.field_S, (byte) 33);
    }

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6, int param7) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        int var47 = 0;
        int[] var57 = null;
        int[] var58 = null;
        int[] var59 = null;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        var47 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var8_int = 0;
            var9 = param0;
            var10 = 0;
            var11 = -param1 + param2;
            var12 = -param1 + param0;
            var13 = param2 * param2;
            var14 = param0 * param0;
            var15 = var11 * var11;
            var16 = var12 * var12;
            var17 = var14 << 1;
            var18 = var13 << 1;
            var19 = var16 << 1;
            var20 = var15 << 1;
            var21 = param0 << 1;
            var22 = var12 << 1;
            var23 = (1 + -var21) * var13 + var17;
            var24 = var14 + -(var18 * (var21 + -1));
            var25 = var15 * (-var22 + 1) - -var19;
            var26 = -(var20 * (var22 + -1)) + var16;
            var27 = var13 << 2;
            var28 = var14 << 2;
            var29 = var15 << 2;
            var30 = var16 << 2;
            var31 = var17 * 3;
            var32 = var18 * (var21 - 3);
            var33 = var19 * 3;
            var34 = (-3 + var22) * var20;
            var35 = var28;
            var36 = (-1 + param0) * var27;
            L1: {
              L2: {
                var37 = var30;
                var38 = var29 * (-1 + var12);
                if (~param6 > ~ua.field_e) {
                  break L2;
                } else {
                  if (~cj.field_D <= ~param6) {
                    var57 = vl.field_e[param6];
                    var40 = pk.a((byte) -14, ib.field_a, -param2 + param4, ap.field_e);
                    var41 = pk.a((byte) -14, ib.field_a, param2 + param4, ap.field_e);
                    var42 = pk.a((byte) -14, ib.field_a, param4 - var11, ap.field_e);
                    var43 = pk.a((byte) -14, ib.field_a, var11 + param4, ap.field_e);
                    ki.a(-97, var40, var57, var42, param5);
                    ki.a(-97, var42, var57, var43, param7);
                    ki.a(-75, var43, var57, var41, param5);
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              break L1;
            }
            L3: while (true) {
              if (var9 <= 0) {
                break L0;
              } else {
                L4: {
                  if (~var9 < ~var12) {
                    stackOut_11_0 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    break L4;
                  } else {
                    stackOut_10_0 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    break L4;
                  }
                }
                L5: {
                  var39 = stackIn_12_0;
                  if (0 <= var23) {
                    break L5;
                  } else {
                    L6: while (true) {
                      if (var23 >= 0) {
                        break L5;
                      } else {
                        var24 = var24 + var35;
                        var23 = var23 + var31;
                        var31 = var31 + var28;
                        var8_int++;
                        var35 = var35 + var28;
                        continue L6;
                      }
                    }
                  }
                }
                L7: {
                  if (var39 == 0) {
                    break L7;
                  } else {
                    L8: {
                      if (var25 >= 0) {
                        break L8;
                      } else {
                        L9: while (true) {
                          if (var25 >= 0) {
                            break L8;
                          } else {
                            var26 = var26 + var37;
                            var25 = var25 + var33;
                            var33 = var33 + var30;
                            var37 = var37 + var30;
                            var10++;
                            continue L9;
                          }
                        }
                      }
                    }
                    L10: {
                      if (0 <= var26) {
                        break L10;
                      } else {
                        var26 = var26 + var37;
                        var25 = var25 + var33;
                        var33 = var33 + var30;
                        var10++;
                        var37 = var37 + var30;
                        break L10;
                      }
                    }
                    var26 = var26 + -var34;
                    var25 = var25 + -var38;
                    var34 = var34 - var29;
                    var38 = var38 - var29;
                    break L7;
                  }
                }
                L11: {
                  if (var24 < 0) {
                    var24 = var24 + var35;
                    var23 = var23 + var31;
                    var35 = var35 + var28;
                    var31 = var31 + var28;
                    var8_int++;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  var24 = var24 + -var32;
                  var23 = var23 + -var36;
                  var36 = var36 - var27;
                  var9--;
                  var32 = var32 - var27;
                  var40 = param6 - var9;
                  var41 = var9 + param6;
                  if (var41 < ua.field_e) {
                    break L12;
                  } else {
                    if (~var40 < ~cj.field_D) {
                      break L12;
                    } else {
                      var42 = pk.a((byte) -14, ib.field_a, var8_int + param4, ap.field_e);
                      var43 = pk.a((byte) -14, ib.field_a, -var8_int + param4, ap.field_e);
                      if (var39 != 0) {
                        L13: {
                          var44 = pk.a((byte) -14, ib.field_a, param4 - -var10, ap.field_e);
                          var45 = pk.a((byte) -14, ib.field_a, param4 - var10, ap.field_e);
                          if (var40 >= ua.field_e) {
                            var58 = vl.field_e[var40];
                            ki.a(-123, var43, var58, var45, param5);
                            ki.a(-113, var45, var58, var44, param7);
                            ki.a(-90, var44, var58, var42, param5);
                            break L13;
                          } else {
                            break L13;
                          }
                        }
                        if (~var41 >= ~cj.field_D) {
                          var59 = vl.field_e[var41];
                          ki.a(-86, var43, var59, var45, param5);
                          ki.a(-115, var45, var59, var44, param7);
                          ki.a(-98, var44, var59, var42, param5);
                          break L12;
                        } else {
                          continue L3;
                        }
                      } else {
                        L14: {
                          if (~ua.field_e >= ~var40) {
                            ki.a(-95, var43, vl.field_e[var40], var42, param5);
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                        if (cj.field_D >= var41) {
                          ki.a(-98, var43, vl.field_e[var41], var42, param5);
                          continue L3;
                        } else {
                          continue L3;
                        }
                      }
                    }
                  }
                }
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var8, "sg.B(" + param0 + ',' + param1 + ',' + param2 + ',' + 47 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static void b(byte param0) {
        n.field_b.a(false, (iq) (Object) new qm());
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Tiles painted:";
    }
}
