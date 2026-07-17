/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lt extends ev {
    static String field_f;
    static lw field_g;
    static wk[] field_h;
    static wk[] field_i;

    final static String a(int param0, long param1) {
        int var3 = 0;
        long var4 = 0L;
        StringBuilder var6 = null;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param1 > 0L) {
          if (param1 < 6582952005840035281L) {
            if (param1 % 37L == 0L) {
              return null;
            } else {
              var3 = 0;
              var4 = param1;
              L0: while (true) {
                if (var4 == 0L) {
                  var6 = new StringBuilder(var3);
                  L1: while (true) {
                    if (param1 == 0L) {
                      StringBuilder discarded$2 = var6.reverse();
                      var6.setCharAt(0, Character.toUpperCase(var6.charAt(param0)));
                      return var6.toString();
                    } else {
                      L2: {
                        var7 = param1;
                        param1 = param1 / 37L;
                        var9 = hq.field_b[(int)(var7 + -(37L * param1))];
                        if (var9 == 95) {
                          var10 = var6.length() + -1;
                          var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                          var9 = 160;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      StringBuilder discarded$3 = var6.append(var9);
                      continue L1;
                    }
                  }
                } else {
                  var4 = var4 / 37L;
                  var3++;
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

    public lt() {
    }

    public final void a(int param0, int param1, int param2) {
        super.a(param0, param1, param2);
        if (ir.field_d != null) {
            ir.field_d.j(-128);
        }
    }

    public static void b(int param0) {
        field_f = null;
        field_g = null;
        field_i = null;
        field_h = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "<br><br><col=FF0000>This trinket is worth <%0> runes. You have <%1> runes left to use this game.</col>";
    }
}
