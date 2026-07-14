/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bc {
    static int field_a;

    final static void a(int param0, long param1) {
        if (!(-1L > (param1 ^ -1L))) {
            return;
        }
        if (param1 % 10L == (long)param0) {
            ji.a(-1L + param1, (byte) -33);
            ji.a(1L, (byte) -33);
        } else {
            ji.a(param1, (byte) -33);
        }
    }

    final static String a(int param0, byte[] param1, int param2, int param3) {
        char[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        char[] var9 = null;
        char[] var10 = null;
        char[] var11 = null;
        char[] var12 = null;
        char[] var13 = null;
        var13 = new char[param3];
        var12 = var13;
        var11 = var12;
        var10 = var11;
        var9 = var10;
        var4 = var9;
        if (param0 > 0) {
          L0: {
            field_a = 49;
            var5 = 0;
            var6 = 0;
            if (param3 <= var6) {
              break L0;
            } else {
              L1: {
                var7 = param1[param2 + var6] & 255;
                if (-1 == (var7 ^ -1)) {
                  var6++;
                  break L1;
                } else {
                  L2: {
                    if ((var7 ^ -1) > -129) {
                      break L2;
                    } else {
                      if ((var7 ^ -1) <= -161) {
                        break L2;
                      } else {
                        L3: {
                          var8 = lf.field_e[-128 + var7];
                          if (var8 != 0) {
                            break L3;
                          } else {
                            var8 = 63;
                            break L3;
                          }
                        }
                        var7 = var8;
                        break L2;
                      }
                    }
                  }
                  var5++;
                  var9[var5] = (char)var7;
                  var6++;
                  break L1;
                }
              }
              var6++;
              var6++;
              var6++;
              break L0;
            }
          }
          return new String(var13, 0, var5);
        } else {
          var5 = 0;
          var6 = 0;
          L4: while (true) {
            if (param3 <= var6) {
              return new String(var13, 0, var5);
            } else {
              var7 = param1[param2 + var6] & 255;
              if (-1 == (var7 ^ -1)) {
                var6++;
                var6++;
                var6++;
                continue L4;
              } else {
                L5: {
                  if ((var7 ^ -1) > -129) {
                    break L5;
                  } else {
                    if ((var7 ^ -1) <= -161) {
                      break L5;
                    } else {
                      L6: {
                        var8 = lf.field_e[-128 + var7];
                        if (var8 != 0) {
                          break L6;
                        } else {
                          var8 = 63;
                          break L6;
                        }
                      }
                      var7 = var8;
                      break L5;
                    }
                  }
                }
                var5++;
                var9[var5] = (char)var7;
                var6++;
                var6++;
                continue L4;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = -1;
    }
}
