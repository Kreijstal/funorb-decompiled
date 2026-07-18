/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hh {
    static int field_j;
    static int field_i;
    static int field_f;
    static String field_e;
    static String field_h;
    static int field_b;
    static String field_d;
    static gh field_a;
    static String[] field_g;
    static int[] field_c;

    final static String a(long param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        long var5 = 0L;
        StringBuilder var7 = null;
        long var8 = 0L;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = SteelSentinels.field_G;
        if (param0 > 0L) {
          if (param0 < 6582952005840035281L) {
            if (0L == param0 % 37L) {
              return null;
            } else {
              var4 = 84 % ((-56 - param1) / 53);
              var3 = 0;
              var5 = param0;
              L0: while (true) {
                if (var5 == 0L) {
                  var7 = new StringBuilder(var3);
                  L1: while (true) {
                    if (param0 == 0L) {
                      StringBuilder discarded$2 = var7.reverse();
                      var7.setCharAt(0, Character.toUpperCase(var7.charAt(0)));
                      return var7.toString();
                    } else {
                      L2: {
                        var8 = param0;
                        param0 = param0 / 37L;
                        var10 = ec.field_a[(int)(-(37L * param0) + var8)];
                        if (95 != var10) {
                          break L2;
                        } else {
                          var11 = -1 + var7.length();
                          var7.setCharAt(var11, Character.toUpperCase(var7.charAt(var11)));
                          var10 = 160;
                          break L2;
                        }
                      }
                      StringBuilder discarded$3 = var7.append((char) var10);
                      continue L1;
                    }
                  }
                } else {
                  var3++;
                  var5 = var5 / 37L;
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

    final static int a(int param0, boolean param1, byte param2, int param3) {
        return gh.i(104);
    }

    public static void a() {
        field_a = null;
        field_e = null;
        field_d = null;
        field_h = null;
        field_g = null;
        field_c = null;
    }

    final static void a(String param0, String param1) {
        try {
            ma.a(false, (byte) -65, param0, param1);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "hh.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + 50 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        k.a((byte) 24, 50);
        field_b = 0;
        field_h = "This entry doesn't match";
        field_e = "Encouraging rule breaking";
        field_d = "To <%0>: ";
    }
}
