/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class k {
    static String field_c;
    static String[] field_a;
    static String field_b;

    final static String a(CharSequence param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 != null) {
          var2 = 0;
          var3 = param0.length();
          L0: while (true) {
            L1: {
              if (var2 >= var3) {
                break L1;
              } else {
                if (!rs.a(param0.charAt(var2), (byte) -52)) {
                  break L1;
                } else {
                  var2++;
                  continue L0;
                }
              }
            }
            L2: while (true) {
              L3: {
                if (var2 >= var3) {
                  break L3;
                } else {
                  if (!rs.a(param0.charAt(var3 - 1), (byte) -52)) {
                    break L3;
                  } else {
                    var3--;
                    continue L2;
                  }
                }
              }
              var4 = var3 - var2;
              if (var4 >= 1) {
                if ((var4 ^ -1) >= -13) {
                  L4: {
                    var5 = new StringBuilder(var4);
                    var6 = var2;
                    if (!param1) {
                      break L4;
                    } else {
                      field_a = null;
                      break L4;
                    }
                  }
                  L5: while (true) {
                    if (var3 <= var6) {
                      if (var5.length() != 0) {
                        return var5.toString();
                      } else {
                        return null;
                      }
                    } else {
                      var7 = param0.charAt(var6);
                      if (ph.a(-14, (char) var7)) {
                        var8 = pv.a(124, (char) var7);
                        if (var8 != 0) {
                          StringBuilder discarded$1 = var5.append(var8);
                          var6++;
                          continue L5;
                        } else {
                          var6++;
                          continue L5;
                        }
                      } else {
                        var6++;
                        continue L5;
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

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != -13) {
            return;
        }
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{"N", "E", "S", "W"};
        field_b = "Difficulty: ";
    }
}
