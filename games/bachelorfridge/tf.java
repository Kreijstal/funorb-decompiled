/*
 * Decompiled by CFR-JS 0.4.0.
 */
class tf extends eo {
    static volatile int field_n;

    final static kv a(byte param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        kv var13 = null;
        var12 = BachelorFridge.field_y;
        var13 = new kv(param3, param4);
        var6 = 0;
        var7 = 0;
        L0: while (true) {
          if (param4 >> -2138270239 <= var7) {
            L1: {
              if (param0 == 119) {
                break L1;
              } else {
                kv discarded$1 = tf.a((byte) -3, -17, -90, -4, -52);
                break L1;
              }
            }
            var7 = 0;
            L2: while (true) {
              if (param4 >> 377729473 <= var7) {
                return var13;
              } else {
                var8 = (-(var7 * 32 / param4) + 128) * 65793;
                var9 = var8 >>> 1416038945 & 8355711;
                var10 = var7 * 2;
                if (-1 > (-((param2 + var10) * 2) + param3 + -1 ^ -1)) {
                  var11 = 0;
                  L3: while (true) {
                    if (param2 <= var11) {
                      var6 = var6 + (param2 + var10);
                      var11 = 0;
                      L4: while (true) {
                        if (-1 + param3 + -(2 * (var10 + param2)) <= var11) {
                          var6 = var6 + (1 + var10 + param2);
                          var7++;
                          continue L2;
                        } else {
                          var13.field_v[var6] = var8;
                          var11++;
                          var6++;
                          continue L4;
                        }
                      }
                    } else {
                      var13.field_v[var10 + var6 + var11] = var9;
                      var13.field_v[param3 + var6 - (2 - (-var10 - var11))] = var9;
                      var11++;
                      continue L3;
                    }
                  }
                } else {
                  var6 = var6 + var10;
                  var11 = 0;
                  L5: while (true) {
                    if (var11 >= -(2 * var10) + (-1 + param3)) {
                      var6 = var6 + (var10 + 1);
                      var7++;
                      continue L2;
                    } else {
                      var13.field_v[var6] = var9;
                      var11++;
                      var6++;
                      continue L5;
                    }
                  }
                }
              }
            }
          } else {
            var8 = -(65793 * (32 * var7 / param4)) + 9474192;
            var9 = ((16711422 & var8) >>> -2126415967) + 5263440;
            var10 = 2 * ((param4 >> 918035553) - 1 - var7);
            if (0 >= -1 + param3 - 2 * (var10 + param1)) {
              var6 = var6 + var10;
              var11 = 0;
              L6: while (true) {
                if (-(var10 * 2) + (param3 + -1) <= var11) {
                  var6 = var6 + (1 + var10);
                  var7++;
                  continue L0;
                } else {
                  var13.field_v[var6] = var9;
                  var6++;
                  var11++;
                  continue L6;
                }
              }
            } else {
              var11 = 0;
              L7: while (true) {
                if (param1 <= var11) {
                  var6 = var6 + (param1 + var10);
                  var11 = 0;
                  L8: while (true) {
                    if (var11 >= param3 + -1 - 2 * (var10 + param1)) {
                      var6 = var6 + (param1 + (var10 + 1));
                      var7++;
                      continue L0;
                    } else {
                      var13.field_v[var6] = var8;
                      var6++;
                      var11++;
                      continue L8;
                    }
                  }
                } else {
                  var13.field_v[var11 + var10 + var6] = var9;
                  var13.field_v[-var11 + (-var10 + var6) - -param3 - 2] = var9;
                  var11++;
                  continue L7;
                }
              }
            }
          }
        }
    }

    final static int a(int param0, int param1) {
        int var2 = -13 % ((-60 - param0) / 39);
        return param1 >> 1505873032 & 255;
    }

    tf() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = 0;
    }
}
