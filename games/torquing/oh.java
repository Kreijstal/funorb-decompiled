/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oh {
    static int field_c;
    static int field_d;
    static String field_a;
    static int field_b;

    final static void a(byte param0) {
        L0: {
          if (null != dc.field_a) {
            dc.field_a.b(false);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 == 84) {
          if (null != d.field_r) {
            d.field_r.h((byte) 86);
            gm.c(-68);
            return;
          } else {
            gm.c(-68);
            return;
          }
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
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
        int stackIn_18_0 = 0;
        int stackIn_30_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        var15 = Torquing.field_u;
        try {
          L0: {
            var6_int = param2 - param1;
            var7 = -param0 + param4;
            if (var7 != 0) {
              if (-1 == (var6_int ^ -1)) {
                rh.a((byte) -115, param4, param1, param0, param5);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  if (var7 < 0) {
                    var7 = -var7;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (0 > var6_int) {
                    var6_int = -var6_int;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (var7 >= var6_int) {
                    stackOut_17_0 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    break L3;
                  } else {
                    stackOut_16_0 = 1;
                    stackIn_18_0 = stackOut_16_0;
                    break L3;
                  }
                }
                L4: {
                  var8 = stackIn_18_0;
                  if (var8 == 0) {
                    break L4;
                  } else {
                    var9 = param0;
                    param0 = param1;
                    var10 = param4;
                    param1 = var9;
                    param4 = param2;
                    param2 = var10;
                    break L4;
                  }
                }
                L5: {
                  if (param0 > param4) {
                    var9 = param0;
                    param0 = param4;
                    var10 = param1;
                    param4 = var9;
                    param1 = param2;
                    param2 = var10;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  var9 = param1;
                  if (param3 == -128) {
                    break L6;
                  } else {
                    field_c = 118;
                    break L6;
                  }
                }
                L7: {
                  var10 = -param0 + param4;
                  var11 = param2 + -param1;
                  var12 = -(var10 >> -235750591);
                  if ((var11 ^ -1) <= -1) {
                    break L7;
                  } else {
                    var11 = -var11;
                    break L7;
                  }
                }
                L8: {
                  if (param2 > param1) {
                    stackOut_29_0 = 1;
                    stackIn_30_0 = stackOut_29_0;
                    break L8;
                  } else {
                    stackOut_28_0 = -1;
                    stackIn_30_0 = stackOut_28_0;
                    break L8;
                  }
                }
                L9: {
                  var13 = stackIn_30_0;
                  if (var8 != 0) {
                    var16 = param0;
                    var14 = var16;
                    L10: while (true) {
                      if (param4 < var16) {
                        break L9;
                      } else {
                        L11: {
                          var12 = var12 + var11;
                          qd.field_a[var16][var9] = param5;
                          if (0 >= var12) {
                            break L11;
                          } else {
                            var9 = var9 + var13;
                            var12 = var12 - var10;
                            break L11;
                          }
                        }
                        var16++;
                        continue L10;
                      }
                    }
                  } else {
                    var14 = param0;
                    L12: while (true) {
                      if (param4 < var14) {
                        break L9;
                      } else {
                        L13: {
                          qd.field_a[var9][var14] = param5;
                          var12 = var12 + var11;
                          if (0 < var12) {
                            var12 = var12 - var10;
                            var9 = var9 + var13;
                            break L13;
                          } else {
                            break L13;
                          }
                        }
                        var14++;
                        continue L12;
                      }
                    }
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              L14: {
                if (-1 == (var6_int ^ -1)) {
                  break L14;
                } else {
                  wa.a(param5, param0, true, param2, param1);
                  break L14;
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var6), "oh.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 20269) {
            oh.a(-112);
        }
    }

    static {
        field_c = 0;
        field_a = "Please wait";
    }
}
