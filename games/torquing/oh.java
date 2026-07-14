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
        int stackIn_17_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_46_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        var15 = Torquing.field_u;
        var6 = param2 - param1;
        var7 = -param0 + param4;
        if (var7 != -1) {
          if (-1 == (var6 ^ -1)) {
            rh.a((byte) -115, param4, param1, param0, param5);
            return;
          } else {
            L0: {
              if (var7 < 0) {
                var7 = -var7;
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (0 > var6) {
                var6 = -var6;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (var7 >= var6) {
                stackOut_16_0 = 0;
                stackIn_17_0 = stackOut_16_0;
                break L2;
              } else {
                stackOut_15_0 = 1;
                stackIn_17_0 = stackOut_15_0;
                break L2;
              }
            }
            L3: {
              var8 = stackIn_17_0;
              if (var8 == 0) {
                break L3;
              } else {
                var9 = param0;
                param0 = param1;
                var10 = param4;
                param1 = var9;
                param4 = param2;
                param2 = var10;
                break L3;
              }
            }
            L4: {
              if (param0 > param4) {
                var9 = param0;
                param0 = param4;
                var10 = param1;
                param4 = var9;
                param1 = param2;
                param2 = var10;
                break L4;
              } else {
                break L4;
              }
            }
            var9 = param1;
            if (param3 != -128) {
              L5: {
                field_c = 118;
                var10 = -param0 + param4;
                var11 = param2 + -param1;
                var12 = -(var10 >> -235750591);
                if ((var11 ^ -1) <= -1) {
                  break L5;
                } else {
                  var11 = -var11;
                  break L5;
                }
              }
              L6: {
                if (param2 > param1) {
                  stackOut_45_0 = 1;
                  stackIn_46_0 = stackOut_45_0;
                  break L6;
                } else {
                  stackOut_44_0 = -1;
                  stackIn_46_0 = stackOut_44_0;
                  break L6;
                }
              }
              L7: {
                var13 = stackIn_46_0;
                if (var8 != 0) {
                  var16 = param0;
                  var14 = var16;
                  L8: while (true) {
                    if (param4 < var16) {
                      break L7;
                    } else {
                      L9: {
                        var12 = var12 + var11;
                        qd.field_a[var16][var9] = param5;
                        if (0 >= var12) {
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      var16++;
                      continue L8;
                    }
                  }
                } else {
                  var14 = param0;
                  L10: while (true) {
                    if (param4 < var14) {
                      break L7;
                    } else {
                      qd.field_a[var9][var14] = param5;
                      var12 = var12 + var11;
                      if (0 < var12) {
                        var12 = var12 - var10;
                        var9 = var9 + var13;
                        var14++;
                        continue L10;
                      } else {
                        var14++;
                        continue L10;
                      }
                    }
                  }
                }
              }
              return;
            } else {
              L11: {
                var10 = -param0 + param4;
                var11 = param2 + -param1;
                var12 = -(var10 >> -235750591);
                if ((var11 ^ -1) <= -1) {
                  break L11;
                } else {
                  var11 = -var11;
                  break L11;
                }
              }
              L12: {
                if (param2 > param1) {
                  stackOut_27_0 = 1;
                  stackIn_28_0 = stackOut_27_0;
                  break L12;
                } else {
                  stackOut_26_0 = -1;
                  stackIn_28_0 = stackOut_26_0;
                  break L12;
                }
              }
              L13: {
                var13 = stackIn_28_0;
                if (var8 != 0) {
                  var16 = param0;
                  var14 = var16;
                  L14: while (true) {
                    if (param4 < var16) {
                      break L13;
                    } else {
                      L15: {
                        var12 = var12 + var11;
                        qd.field_a[var16][var9] = param5;
                        if (0 >= var12) {
                          break L15;
                        } else {
                          break L15;
                        }
                      }
                      var16++;
                      continue L14;
                    }
                  }
                } else {
                  var14 = param0;
                  L16: while (true) {
                    if (param4 < var14) {
                      break L13;
                    } else {
                      qd.field_a[var9][var14] = param5;
                      var12 = var12 + var11;
                      if (0 < var12) {
                        var12 = var12 - var10;
                        var9 = var9 + var13;
                        var14++;
                        continue L16;
                      } else {
                        var14++;
                        continue L16;
                      }
                    }
                  }
                }
              }
              return;
            }
          }
        } else {
          if (-1 != var6) {
            wa.a(param5, param0, true, param2, param1);
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
        field_a = "Please wait";
    }
}
