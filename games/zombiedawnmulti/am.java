/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class am {
    static int field_c;
    static int field_b;
    static String field_a;

    public static void b(int param0) {
        field_a = null;
        if (param0 != -7) {
            ja discarded$0 = am.a(102, 53, -113, 106, 29);
        }
    }

    final static boolean a(char param0, byte param1) {
        char[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        L0: {
          var5 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param0 <= 0) {
            break L0;
          } else {
            if (128 > param0) {
              return true;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (160 > param0) {
            break L1;
          } else {
            if (255 < param0) {
              break L1;
            } else {
              return true;
            }
          }
        }
        L2: {
          if (0 == param0) {
            break L2;
          } else {
            var6 = vg.field_s;
            var2 = var6;
            var3 = 0;
            L3: while (true) {
              if (var3 >= var6.length) {
                break L2;
              } else {
                var4 = var6[var3];
                if (var4 != param0) {
                  var3++;
                  continue L3;
                } else {
                  return true;
                }
              }
            }
          }
        }
        L4: {
          if (param1 >= 42) {
            break L4;
          } else {
            field_b = 89;
            break L4;
          }
        }
        return false;
    }

    final static boolean a(int param0) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 < -97) {
          L0: {
            L1: {
              if (-11 == (pl.field_I ^ -1)) {
                break L1;
              } else {
                L2: {
                  if (-7 != pl.field_I) {
                    break L2;
                  } else {
                    if (df.field_I) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                break L0;
              }
            }
            stackOut_6_0 = 1;
            stackIn_8_0 = stackOut_6_0;
            break L0;
          }
          return stackIn_8_0 != 0;
        } else {
          return true;
        }
    }

    final static ja a(int param0, int param1, int param2, int param3, int param4) {
        if (param3 != 1) {
            boolean discarded$0 = am.a('ﾘ', (byte) -57);
        }
        return nk.a(no.field_Hb[param2][param0], param1, 255, param4);
    }

    static {
    }
}
