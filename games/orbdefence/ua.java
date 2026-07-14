/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ua {
    static String field_b;
    static String field_d;
    static int field_c;
    static int field_a;

    final static String a(int param0, CharSequence param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = OrbDefence.field_D ? 1 : 0;
        if (param1 != null) {
          var2 = 0;
          var3 = param1.length();
          L0: while (true) {
            L1: {
              if (var2 >= var3) {
                break L1;
              } else {
                if (!sk.a(param1.charAt(var2), -46)) {
                  break L1;
                } else {
                  var2++;
                  continue L0;
                }
              }
            }
            L2: while (true) {
              L3: {
                if (var3 <= var2) {
                  break L3;
                } else {
                  if (!sk.a(param1.charAt(var3 + -1), -46)) {
                    break L3;
                  } else {
                    var3--;
                    continue L2;
                  }
                }
              }
              var4 = -var2 + var3;
              if ((var4 ^ -1) <= -2) {
                if (var4 <= 12) {
                  var5 = 64 % ((param0 - 32) / 47);
                  var6 = new StringBuilder(var4);
                  var7 = var2;
                  L4: while (true) {
                    if (var3 <= var7) {
                      if (0 != var6.length()) {
                        return var6.toString();
                      } else {
                        return null;
                      }
                    } else {
                      var8 = param1.charAt(var7);
                      if (tc.a((byte) -20, (char) var8)) {
                        var9 = p.a((char) var8, 33);
                        if (0 != var9) {
                          StringBuilder discarded$1 = var6.append(var9);
                          var7++;
                          continue L4;
                        } else {
                          var7++;
                          continue L4;
                        }
                      } else {
                        var7++;
                        continue L4;
                      }
                    }
                  }
                } else {
                  return null;
                }
              } else {
                return null;
              }
            }
          }
        } else {
          return null;
        }
    }

    final static int a(int param0, int param1) {
        param0--;
        if (param1 != 0) {
            Object var3 = null;
            String discarded$0 = ua.a(23, (CharSequence) null);
        }
        param0 = param0 | param0 >>> 751128769;
        param0 = param0 | param0 >>> 691885058;
        param0 = param0 | param0 >>> -415277564;
        param0 = param0 | param0 >>> -2065323032;
        param0 = param0 | param0 >>> 1256565360;
        return param0 - -1;
    }

    final static hj[] a(ki param0, int param1, int param2, int param3) {
        if (param2 <= 32) {
            return null;
        }
        if (!pk.a(-52, param1, param0, param3)) {
            return null;
        }
        return sl.d((byte) -85);
    }

    public static void a(int param0) {
        if (param0 != -415277564) {
            field_b = null;
        }
        field_d = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "BLIZZARD WAVE";
        field_d = "STORM BOLT";
        field_a = 0;
    }
}
