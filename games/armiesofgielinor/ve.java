/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve {
    static int[][] field_a;
    static boolean field_b;

    final static String a(byte param0, String param1) {
        int var2 = 0;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        char[] var8 = null;
        char[] var9 = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 != 13) {
          return null;
        } else {
          var2 = param1.length();
          var9 = new char[var2];
          var8 = var9;
          var3 = var8;
          var4 = 2;
          var5 = 0;
          L0: while (true) {
            if (var2 <= var5) {
              return new String(var9);
            } else {
              L1: {
                var6 = param1.charAt(var5);
                if (var4 == 0) {
                  var6 = Character.toLowerCase((char) var6);
                  break L1;
                } else {
                  if (var4 == 2) {
                    var6 = hc.a(98, (char) var6);
                    break L1;
                  } else {
                    if (!Character.isUpperCase((char) var6)) {
                      break L1;
                    } else {
                      var6 = hc.a(98, (char) var6);
                      break L1;
                    }
                  }
                }
              }
              L2: {
                if (!Character.isLetter((char) var6)) {
                  L3: {
                    if (var6 == 46) {
                      break L3;
                    } else {
                      if (var6 == 63) {
                        break L3;
                      } else {
                        if (33 == var6) {
                          break L3;
                        } else {
                          if (Character.isSpaceChar((char) var6)) {
                            if ((var4 ^ -1) != -3) {
                              var4 = 1;
                              break L2;
                            } else {
                              break L2;
                            }
                          } else {
                            var4 = 1;
                            break L2;
                          }
                        }
                      }
                    }
                  }
                  var4 = 2;
                  break L2;
                } else {
                  var4 = 0;
                  break L2;
                }
              }
              var3[var5] = (char)var6;
              var5++;
              continue L0;
            }
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 1) {
            field_a = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[][]{new int[22], new int[38], new int[38], new int[18], new int[28], new int[50]};
    }
}
