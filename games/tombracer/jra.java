/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jra extends loa {
    static String field_b;
    static String[] field_c;

    jra(qea param0) {
        super(param0);
    }

    final void a(int param0, int param1, hj param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = TombRacer.field_G ? 1 : 0;
        var5 = 1;
        L0: while (true) {
          if (-1 + param2.field_f <= var5) {
            var5 = 2;
            if (param1 < 73) {
              jra.a(78);
              L1: while (true) {
                if (var5 < -2 + param2.field_a) {
                  var6 = 1 + ((jra) this).field_a.a(param2.field_f + -2, 0);
                  param2.a(var5, 0, 0, var6);
                  var5 += 2;
                  continue L1;
                } else {
                  return;
                }
              }
            } else {
              L2: while (true) {
                if (var5 < -2 + param2.field_a) {
                  var6 = 1 + ((jra) this).field_a.a(param2.field_f + -2, 0);
                  param2.a(var5, 0, 0, var6);
                  var5 += 2;
                  continue L2;
                } else {
                  return;
                }
              }
            }
          } else {
            var6 = 1;
            L3: while (true) {
              if (-1 + param2.field_a <= var6) {
                var5++;
                var5++;
                continue L0;
              } else {
                param2.a(var6, 0, 0, var5);
                var6 += 2;
                continue L3;
              }
            }
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 19290) {
            jra.a(30);
            field_c = null;
            return;
        }
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Names can only contain letters, numbers, spaces and underscores";
        field_c = new String[3];
    }
}
