/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dc extends o {
    int field_o;
    int field_j;
    static ci field_q;
    static ci field_s;
    static boolean field_m;
    int field_k;
    static rk[] field_n;
    int field_r;
    int field_l;
    int field_p;

    public static void d(int param0) {
        field_s = null;
        field_q = null;
        field_n = null;
    }

    final static void c(byte param0) {
        if (param0 < 124) {
            boolean discarded$0 = dc.a(-70);
        }
        kb.field_O = new ol();
        nj.field_w.c((mf) (Object) kb.field_O, 79);
    }

    final static void a(int param0, int param1, boolean param2, byte param3, int param4, int param5, int param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_26_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        var14 = Chess.field_G;
        try {
          L0: {
            if (param1 <= param6) {
              return;
            } else {
              if (param6 + 1 < param5) {
                L1: {
                  if (param5 <= param6 + 5) {
                    break L1;
                  } else {
                    if (param4 == param0) {
                      break L1;
                    } else {
                      L2: {
                        if (param3 <= -115) {
                          break L2;
                        } else {
                          field_m = true;
                          break L2;
                        }
                      }
                      var7_int = (1 & (param0 & param4)) + (param4 >> 1) + (param0 >> 1);
                      var8 = param6;
                      var9 = param4;
                      var10 = param0;
                      var11 = param6;
                      L3: while (true) {
                        if (var11 >= param5) {
                          dc.a(var9, param1, param2, (byte) -124, param4, var8, param6);
                          dc.a(param0, param1, param2, (byte) -122, var10, param5, var8);
                          break L0;
                        } else {
                          L4: {
                            var12 = vn.field_Ab[var11];
                            if (!param2) {
                              stackOut_25_0 = gh.field_a[var12];
                              stackIn_26_0 = stackOut_25_0;
                              break L4;
                            } else {
                              stackOut_24_0 = hg.field_d[var12];
                              stackIn_26_0 = stackOut_24_0;
                              break L4;
                            }
                          }
                          var13 = stackIn_26_0;
                          if (var13 > var7_int) {
                            L5: {
                              vn.field_Ab[var11] = vn.field_Ab[var8];
                              if (var13 < var9) {
                                var9 = var13;
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                            int incrementValue$1 = var8;
                            var8++;
                            vn.field_Ab[incrementValue$1] = var12;
                            var11++;
                            continue L3;
                          } else {
                            L6: {
                              if (var13 <= var10) {
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                            var11++;
                            continue L3;
                          }
                        }
                      }
                    }
                  }
                }
                var7_int = param5 + -1;
                L7: while (true) {
                  if (param6 >= var7_int) {
                    return;
                  } else {
                    var8 = param6;
                    L8: while (true) {
                      if (var7_int <= var8) {
                        var7_int--;
                        continue L7;
                      } else {
                        L9: {
                          var9 = vn.field_Ab[var8];
                          var10 = vn.field_Ab[1 + var8];
                          if (ec.a((byte) 126, var9, var10, param2)) {
                            vn.field_Ab[var8] = var10;
                            vn.field_Ab[1 + var8] = var9;
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        var8++;
                        continue L8;
                      }
                    }
                  }
                }
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var7, "dc.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static boolean a(int param0) {
        int var1 = -31 % ((71 - param0) / 53);
        return dk.field_g;
    }

    private dc() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = false;
    }
}
