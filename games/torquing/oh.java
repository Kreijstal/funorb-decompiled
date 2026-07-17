/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oh {
    static int field_c;
    static int field_d;
    static String field_a;
    static int field_b;

    final static void a() {
        L0: {
          if (null != dc.field_a) {
            dc.field_a.b(false);
            break L0;
          } else {
            break L0;
          }
        }
        if (null != d.field_r) {
          d.field_r.h((byte) 86);
          int discarded$4 = -68;
          gm.c();
          return;
        } else {
          int discarded$5 = -68;
          gm.c();
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
              if (var6_int == 0) {
                rh.a((byte) -115, param4, param1, param0, param5);
                return;
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
                  if (~param0 < ~param4) {
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
                  var12 = -(var10 >> 1);
                  if (var11 >= 0) {
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
                    if (param4 < var16) {
                      break L9;
                    } else {
                      L10: {
                        var12 = var12 + var11;
                        qd.field_a[var16][var9] = param5;
                        if (0 >= var12) {
                          var16++;
                          break L10;
                        } else {
                          var9 = var9 + var13;
                          var12 = var12 - var10;
                          break L10;
                        }
                      }
                      var16++;
                      var16++;
                      break L9;
                    }
                  } else {
                    var14 = param0;
                    L11: while (true) {
                      if (~param4 > ~var14) {
                        break L9;
                      } else {
                        qd.field_a[var9][var14] = param5;
                        var12 = var12 + var11;
                        if (0 < var12) {
                          var12 = var12 - var10;
                          var9 = var9 + var13;
                          var14++;
                          var14++;
                          continue L11;
                        } else {
                          var14++;
                          var14++;
                          continue L11;
                        }
                      }
                    }
                  }
                }
                break L0;
              }
            } else {
              L12: {
                if (var6_int == 0) {
                  break L12;
                } else {
                  wa.a(param5, param0, true, param2, param1);
                  break L12;
                }
              }
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var6, "oh.A(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 20269) {
            oh.a(-112);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
        field_a = "Please wait";
    }
}
