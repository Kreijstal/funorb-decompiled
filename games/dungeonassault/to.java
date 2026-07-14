/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class to {
    static String[] field_b;
    static String field_a;
    static ab field_e;
    static String field_f;
    static byte[][] field_d;
    static String field_g;
    static int[] field_c;

    final static double a(int param0, int param1, double param2, int param3) {
        double var5 = 1.0 - param2;
        int var7 = -109 % ((param3 - 22) / 51);
        return (double)param0 * var5 + param2 * (double)param1;
    }

    public static void a(int param0) {
        if (param0 != 0) {
          to.b(98);
          field_e = null;
          field_f = null;
          field_b = null;
          field_a = null;
          field_g = null;
          field_c = null;
          field_d = null;
          return;
        } else {
          field_e = null;
          field_f = null;
          field_b = null;
          field_a = null;
          field_g = null;
          field_c = null;
          field_d = null;
          return;
        }
    }

    final static int a(int param0, CharSequence param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = DungeonAssault.field_K;
        var2 = param1.length();
        var3 = 0;
        var4 = 0;
        if (param0 >= 114) {
          L0: while (true) {
            if (var2 <= var4) {
              return var3;
            } else {
              var3 = hb.a((byte) -38, param1.charAt(var4)) + (-var3 + (var3 << 2023052677));
              var4++;
              continue L0;
            }
          }
        } else {
          to.b(47);
          L1: while (true) {
            if (var2 <= var4) {
              return var3;
            } else {
              var3 = hb.a((byte) -38, param1.charAt(var4)) + (-var3 + (var3 << 2023052677));
              var4++;
              continue L1;
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, String param4, int param5) {
        Object var7 = null;
        kn.a(param2, param4 + "_defeat", param5, param3, 124, param0, param4 + "_special", param4 + "_reveal");
        if (param1 < -72) {
          return;
        } else {
          var7 = null;
          to.a(116, 65, -88, 52, (String) null, -97);
          return;
        }
    }

    final static rj a(int param0, int param1, md param2, int param3) {
        rj var5 = null;
        int var6 = 0;
        rj var7 = null;
        var6 = DungeonAssault.field_K;
        if (param2 != null) {
          var7 = (rj) (Object) param2.e(-24172);
          if (param3 == 0) {
            L0: while (true) {
              if (var7 != null) {
                var5 = var7.a(param3 + -115, param1, param0);
                if (null == var7.a(param3 + -115, param1, param0)) {
                  var7 = (rj) (Object) param2.a(4);
                  continue L0;
                } else {
                  return var5;
                }
              } else {
                return null;
              }
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final static void b(int param0) {
        if (param0 > 57) {
            return;
        }
        to.b(-76);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new String[]{"Fragility", "Dies when incapacitated."};
        field_a = "<col=FF0000><%0> charging</col>";
        field_f = "A ring of mystic runes glow faintly around the perimeter of this room. The first unwise raider to cross this room might be teleported out of the dungeon.<br><br>This trap will only trigger once per raid.";
        field_e = new ab();
        field_d = new byte[1000][];
    }
}
