/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sm {
    static uf field_a;
    static String field_d;
    static ah field_b;
    static si field_c;

    final static String a(int param0, int param1, int param2, byte[] param3) {
        char[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        char[] var10 = null;
        char[] var11 = null;
        char[] var12 = null;
        char[] var13 = null;
        char[] var14 = null;
        var9 = HoldTheLine.field_D;
        var14 = new char[param0];
        var13 = var14;
        var12 = var13;
        var11 = var12;
        var10 = var11;
        var4 = var10;
        if (param2 != -129) {
          L0: {
            sm.a((byte) -10);
            var5 = 0;
            var6 = 0;
            if (param0 <= var6) {
              break L0;
            } else {
              L1: {
                var7 = 255 & param3[param1 + var6];
                if (var7 == -1) {
                  var6++;
                  break L1;
                } else {
                  L2: {
                    if (-129 > var7) {
                      break L2;
                    } else {
                      if (-161 >= (var7 ^ -1)) {
                        break L2;
                      } else {
                        L3: {
                          var8 = ja.field_Qb[var7 - 128];
                          if (0 != var8) {
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
                  var10[var5] = (char)var7;
                  break L1;
                }
              }
              var6++;
              var6++;
              var6++;
              break L0;
            }
          }
          return new String(var14, 0, var5);
        } else {
          var5 = 0;
          var6 = 0;
          L4: while (true) {
            if (param0 <= var6) {
              return new String(var14, 0, var5);
            } else {
              var7 = 255 & param3[param1 + var6];
              if (var7 != -1) {
                L5: {
                  if (-129 > var7) {
                    break L5;
                  } else {
                    if (-161 >= (var7 ^ -1)) {
                      break L5;
                    } else {
                      L6: {
                        var8 = ja.field_Qb[var7 - 128];
                        if (0 != var8) {
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
                var10[var5] = (char)var7;
                var6++;
                var6++;
                continue L4;
              } else {
                var6++;
                var6++;
                continue L4;
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        field_d = null;
        field_c = null;
        if (param0 != 72) {
            return;
        }
        field_a = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "<col=2>Not Attempted</col>";
        field_b = new ah();
    }
}
