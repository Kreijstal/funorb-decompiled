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
        if (param0 != 5) {
            field_s = null;
        }
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
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        var14 = Chess.field_G;
        if (param1 <= param6) {
          return;
        } else {
          if (param6 + 1 < param5) {
            L0: {
              if (param5 <= param6 + 5) {
                break L0;
              } else {
                if (param4 == param0) {
                  break L0;
                } else {
                  L1: {
                    if (param3 <= -115) {
                      break L1;
                    } else {
                      field_m = true;
                      break L1;
                    }
                  }
                  var7 = (1 & (param0 & param4)) + (param4 >> 200658273) + (param0 >> -958115615);
                  var8 = param6;
                  var9 = param4;
                  var10 = param0;
                  var11 = param6;
                  L2: while (true) {
                    if (var11 >= param5) {
                      dc.a(var9, param1, param2, (byte) -124, param4, var8, param6);
                      dc.a(param0, param1, param2, (byte) -122, var10, param5, var8);
                      return;
                    } else {
                      L3: {
                        var12 = vn.field_Ab[var11];
                        if (!param2) {
                          stackOut_23_0 = gh.field_a[var12];
                          stackIn_24_0 = stackOut_23_0;
                          break L3;
                        } else {
                          stackOut_22_0 = hg.field_d[var12];
                          stackIn_24_0 = stackOut_22_0;
                          break L3;
                        }
                      }
                      var13 = stackIn_24_0;
                      if (var13 > var7) {
                        L4: {
                          vn.field_Ab[var11] = vn.field_Ab[var8];
                          if (var13 < var9) {
                            var9 = var13;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        var8++;
                        vn.field_Ab[var8] = var12;
                        var11++;
                        continue L2;
                      } else {
                        if (var13 > var10) {
                          var10 = var13;
                          var11++;
                          continue L2;
                        } else {
                          var11++;
                          continue L2;
                        }
                      }
                    }
                  }
                }
              }
            }
            var7 = param5 + -1;
            L5: while (true) {
              if (param6 >= var7) {
                return;
              } else {
                var8 = param6;
                L6: while (true) {
                  if (var7 <= var8) {
                    var7--;
                    continue L5;
                  } else {
                    var9 = vn.field_Ab[var8];
                    var10 = vn.field_Ab[1 + var8];
                    if (ec.a((byte) 126, var9, var10, param2)) {
                      vn.field_Ab[var8] = var10;
                      vn.field_Ab[1 + var8] = var9;
                      var8++;
                      continue L6;
                    } else {
                      var8++;
                      continue L6;
                    }
                  }
                }
              }
            }
          } else {
            return;
          }
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
