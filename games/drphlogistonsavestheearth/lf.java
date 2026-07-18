/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lf {
    static he[][] field_e;
    static String field_f;
    static String field_d;
    static int field_b;
    static int field_a;
    static int field_c;

    public static void a() {
        field_e = null;
        field_d = null;
        field_f = null;
        int var1 = 1;
    }

    final static String a(long param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        long var5 = 0L;
        StringBuilder var7 = null;
        long var8 = 0L;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param0 > 0L) {
          if (6582952005840035281L > param0) {
            if (param0 % 37L == 0L) {
              return null;
            } else {
              var3 = -106 / ((param1 - 32) / 62);
              var4 = 0;
              var5 = param0;
              L0: while (true) {
                if (var5 == 0L) {
                  var7 = new StringBuilder(var4);
                  L1: while (true) {
                    if (param0 == 0L) {
                      StringBuilder discarded$2 = var7.reverse();
                      var7.setCharAt(0, Character.toUpperCase(var7.charAt(0)));
                      return var7.toString();
                    } else {
                      L2: {
                        var8 = param0;
                        param0 = param0 / 37L;
                        var10 = bd.field_K[(int)(-(param0 * 37L) + var8)];
                        if (var10 != 95) {
                          break L2;
                        } else {
                          var11 = var7.length() + -1;
                          var10 = 160;
                          var7.setCharAt(var11, Character.toUpperCase(var7.charAt(var11)));
                          break L2;
                        }
                      }
                      StringBuilder discarded$3 = var7.append((char) var10);
                      continue L1;
                    }
                  }
                } else {
                  var5 = var5 / 37L;
                  var4++;
                  continue L0;
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new he[2][];
        field_c = 67;
        field_f = "Error connecting to server. Please try using a different server.";
        field_d = "Please check if address is correct";
        field_b = 0;
    }
}
