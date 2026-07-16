/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hc {
    final static int a(int param0, int param1) {
        if (param0 != 2047) {
            return -81;
        }
        return fb.field_j[2047 & param1];
    }

    final static so a(eg param0, int[] param1, byte param2) {
        int[] var4 = null;
        eg[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        so var9 = null;
        so var10 = null;
        eg[] var11 = null;
        eg[] var12 = null;
        eg[] var13 = null;
        var8 = Pool.field_O;
        var9 = new so();
        var10 = var9;
        var9.field_d = param1;
        if (param2 == 101) {
          var4 = new int[]{1, 1, 1};
          ie.a(-2656, var4, param0);
          if (var4[0] == 1) {
            if (var4[1] == 1) {
              if (1 == var4[2]) {
                var9.field_i = param0;
                return var10;
              } else {
                L0: {
                  d.a(param0, param2 + -23210);
                  var13 = cm.a(param0, var4, true);
                  var5 = var13;
                  var6 = var13.length;
                  var7 = 0;
                  if (var13.length <= var7) {
                    break L0;
                  } else {
                    L1: {
                      if (var13[var7].field_K == 0) {
                        var6--;
                        break L1;
                      } else {
                        var7++;
                        break L1;
                      }
                    }
                    var7++;
                    var7++;
                    break L0;
                  }
                }
                var10.field_b = new so[var6];
                var6 = 0;
                var7 = 0;
                L2: while (true) {
                  if (var13.length <= var7) {
                    return var10;
                  } else {
                    nd.a(var13[var7], (byte) -37);
                    if ((var13[var7].field_K ^ -1) >= -1) {
                      var7++;
                      var7++;
                      continue L2;
                    } else {
                      int incrementValue$3 = var6;
                      var6++;
                      var10.field_b[incrementValue$3] = nd.a(109, var13[var7], hp.a(var10.field_d, (byte) 32));
                      var7++;
                      continue L2;
                    }
                  }
                }
              }
            } else {
              L3: {
                d.a(param0, param2 + -23210);
                var12 = cm.a(param0, var4, true);
                var6 = var12.length;
                var7 = 0;
                if (var12.length <= var7) {
                  break L3;
                } else {
                  L4: {
                    if (var12[var7].field_K == 0) {
                      var6--;
                      break L4;
                    } else {
                      var7++;
                      break L4;
                    }
                  }
                  var7++;
                  var7++;
                  break L3;
                }
              }
              L5: {
                var10.field_b = new so[var6];
                var6 = 0;
                var7 = 0;
                if (var12.length <= var7) {
                  break L5;
                } else {
                  L6: {
                    nd.a(var12[var7], (byte) -37);
                    if ((var12[var7].field_K ^ -1) >= -1) {
                      var7++;
                      break L6;
                    } else {
                      int incrementValue$4 = var6;
                      var6++;
                      var10.field_b[incrementValue$4] = nd.a(109, var12[var7], hp.a(var10.field_d, (byte) 32));
                      var7++;
                      break L6;
                    }
                  }
                  var7++;
                  var7++;
                  break L5;
                }
              }
              return var10;
            }
          } else {
            d.a(param0, param2 + -23210);
            var11 = cm.a(param0, var4, true);
            var6 = var11.length;
            var7 = 0;
            L7: while (true) {
              if (var11.length <= var7) {
                L8: {
                  var10.field_b = new so[var6];
                  var6 = 0;
                  var7 = 0;
                  if (var11.length <= var7) {
                    break L8;
                  } else {
                    L9: {
                      nd.a(var11[var7], (byte) -37);
                      if ((var11[var7].field_K ^ -1) >= -1) {
                        var7++;
                        break L9;
                      } else {
                        int incrementValue$5 = var6;
                        var6++;
                        var10.field_b[incrementValue$5] = nd.a(109, var11[var7], hp.a(var10.field_d, (byte) 32));
                        var7++;
                        break L9;
                      }
                    }
                    var7++;
                    var7++;
                    break L8;
                  }
                }
                return var10;
              } else {
                if (var11[var7].field_K == 0) {
                  var6--;
                  var7++;
                  var7++;
                  continue L7;
                } else {
                  var7++;
                  var7++;
                  continue L7;
                }
              }
            }
          }
        } else {
          return null;
        }
    }

    static {
    }
}
