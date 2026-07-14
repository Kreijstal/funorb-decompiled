/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ne {
    static wf field_a;
    static char[] field_d;
    static db[] field_b;
    static boolean field_e;
    static boolean field_c;

    final static boolean a(byte param0, char param1) {
        if (param0 >= 31) {
          if (param1 >= 48) {
            if (57 < param1) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_d = null;
          if (param1 >= 48) {
            if (57 < param1) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 338) {
            return;
        }
        field_b = null;
        field_d = null;
    }

    final static String a(char param0, String param1, String param2, byte param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Lexicominos.field_L ? 1 : 0;
        var4 = param2.length();
        var5 = param1.length();
        var6 = var4;
        var7 = var5 + -1;
        if (0 != var7) {
          var8_int = 0;
          L0: while (true) {
            var8_int = param2.indexOf((int) param0, var8_int);
            if (-1 >= (var8_int ^ -1)) {
              var6 = var6 + var7;
              var8_int++;
              continue L0;
            } else {
              L1: {
                if (param3 <= -123) {
                  var8 = new StringBuilder(var6);
                  var9 = 0;
                  break L1;
                } else {
                  field_b = null;
                  var8 = new StringBuilder(var6);
                  var9 = 0;
                  break L1;
                }
              }
              L2: while (true) {
                var10 = param2.indexOf((int) param0, var9);
                if (var10 < 0) {
                  StringBuilder discarded$6 = var8.append(param2.substring(var9));
                  return var8.toString();
                } else {
                  StringBuilder discarded$7 = var8.append(param2.substring(var9, var10));
                  StringBuilder discarded$8 = var8.append(param1);
                  var9 = var10 + 1;
                  continue L2;
                }
              }
            }
          }
        } else {
          L3: {
            if (param3 <= -123) {
              var8 = new StringBuilder(var6);
              var9 = 0;
              break L3;
            } else {
              field_b = null;
              var8 = new StringBuilder(var6);
              var9 = 0;
              break L3;
            }
          }
          L4: while (true) {
            var10 = param2.indexOf((int) param0, var9);
            if (var10 < 0) {
              StringBuilder discarded$9 = var8.append(param2.substring(var9));
              return var8.toString();
            } else {
              StringBuilder discarded$10 = var8.append(param2.substring(var9, var10));
              StringBuilder discarded$11 = var8.append(param1);
              var9 = var10 + 1;
              continue L4;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
        field_c = true;
        field_a = new wf((byte[]) null);
    }
}
