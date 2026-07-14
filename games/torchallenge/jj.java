/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jj {
    static rk field_b;
    static ka field_e;
    static boolean field_d;
    static int field_c;
    static ka[] field_a;

    public static void a(byte param0) {
        field_b = null;
        field_e = null;
        field_a = null;
        int var1 = 100 / ((param0 - 57) / 41);
    }

    final static boolean a(byte param0, char param1) {
        char[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        L0: {
          var5 = TorChallenge.field_F ? 1 : 0;
          if (0 >= param1) {
            break L0;
          } else {
            if (param1 < 128) {
              return true;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (160 > param1) {
            break L1;
          } else {
            if (param1 > 255) {
              break L1;
            } else {
              return true;
            }
          }
        }
        L2: {
          if (param1 != 0) {
            var6 = ae.field_p;
            var2 = var6;
            var3 = 0;
            L3: while (true) {
              if (var3 >= var6.length) {
                break L2;
              } else {
                var4 = var6[var3];
                if (param1 != var4) {
                  var3++;
                  continue L3;
                } else {
                  return true;
                }
              }
            }
          } else {
            break L2;
          }
        }
        if (param0 > 82) {
          return false;
        } else {
          return true;
        }
    }

    final static ka a(byte param0, lj param1, int param2, int param3) {
        if (param0 <= 30) {
            field_a = null;
        }
        if (!lk.a(160, param1, param2, param3)) {
            return null;
        }
        return rl.b(true);
    }

    final static int[] b(byte param0) {
        if (param0 != -24) {
            return null;
        }
        return new int[8];
    }

    final static int a(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = TorChallenge.field_F ? 1 : 0;
          var1 = 5;
          var2 = 0;
          var3 = 0;
          if (param0 == 255) {
            break L0;
          } else {
            field_a = null;
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (-7 >= (var4 ^ -1)) {
            return var2;
          } else {
            L2: {
              var3 = pi.field_d[vj.field_c][var4];
              if (var4 == ea.field_e) {
                var3 = var3 | vi.field_a;
                break L2;
              } else {
                break L2;
              }
            }
            var5 = 0;
            L3: while (true) {
              if (var1 <= var5) {
                var4++;
                continue L1;
              } else {
                if ((var3 & 1 << var5 ^ -1) < -1) {
                  var2++;
                  var5++;
                  continue L3;
                } else {
                  var5++;
                  continue L3;
                }
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new ka(96, 96);
        field_d = false;
        field_a = null;
    }
}
