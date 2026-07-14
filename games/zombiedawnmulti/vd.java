/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vd {
    static int field_d;
    static String field_b;
    static cj field_a;
    static int field_c;

    final static boolean a(boolean param0, CharSequence param1, byte param2) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param1 != null) {
          var3 = param1.length();
          if (1 <= var3) {
            if (12 >= var3) {
              var4 = tg.a(param1, false);
              if (var4 != null) {
                if (-2 >= (var4.length() ^ -1)) {
                  var5 = 76 % ((25 - param2) / 53);
                  if (!eb.a((byte) 56, var4.charAt(0))) {
                    if (!eb.a((byte) 84, var4.charAt(-1 + var4.length()))) {
                      var6 = 0;
                      var7 = 0;
                      L0: while (true) {
                        if (param1.length() <= var7) {
                          if (0 < var6) {
                            return false;
                          } else {
                            return true;
                          }
                        } else {
                          L1: {
                            var8 = param1.charAt(var7);
                            if (eb.a((byte) -75, (char) var8)) {
                              var6++;
                              break L1;
                            } else {
                              var6 = 0;
                              break L1;
                            }
                          }
                          if (-3 < (var6 ^ -1)) {
                            var7++;
                            var7++;
                            continue L0;
                          } else {
                            if (!param0) {
                              return false;
                            } else {
                              var7++;
                              continue L0;
                            }
                          }
                        }
                      }
                    } else {
                      return false;
                    }
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 1) {
            vd.a(false, 109L);
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static void a(boolean param0, long param1) {
        long stackIn_7_0 = 0L;
        long stackIn_8_0 = 0L;
        long stackIn_9_0 = 0L;
        int stackIn_9_1 = 0;
        long stackOut_6_0 = 0L;
        long stackOut_8_0 = 0L;
        int stackOut_8_1 = 0;
        long stackOut_7_0 = 0L;
        int stackOut_7_1 = 0;
        if ((param1 ^ -1L) < -1L) {
          if (!param0) {
            if (-1L == (param1 % 10L ^ -1L)) {
              L0: {
                be.a(-1L + param1, true);
                stackOut_6_0 = 1L;
                stackIn_8_0 = stackOut_6_0;
                stackIn_7_0 = stackOut_6_0;
                if (param0) {
                  stackOut_8_0 = stackIn_8_0;
                  stackOut_8_1 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  break L0;
                } else {
                  stackOut_7_0 = stackIn_7_0;
                  stackOut_7_1 = 1;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  break L0;
                }
              }
              be.a(stackIn_9_0, stackIn_9_1 != 0);
              return;
            } else {
              be.a(param1, true);
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 1;
        field_b = "Wise";
    }
}
