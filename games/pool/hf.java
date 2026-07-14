/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hf {
    static int field_c;
    static long field_e;
    static String field_b;
    static int[] field_d;
    static int field_a;

    final static void a(String[][] param0, String[] param1, byte param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Pool.field_O;
        re.field_e = param1;
        lb.field_P = param0;
        var3 = 0;
        L0: while (true) {
          if (var3 >= lb.field_P.length) {
            L1: {
              if (param2 == -96) {
                break L1;
              } else {
                field_b = null;
                break L1;
              }
            }
            return;
          } else {
            var4 = 0;
            L2: while (true) {
              if (var4 >= lb.field_P[var3].length) {
                var3++;
                continue L0;
              } else {
                if (lb.field_P[var3][var4] != null) {
                  lb.field_P[var3][var4] = lb.field_P[var3][var4].toLowerCase();
                  var4++;
                  continue L2;
                } else {
                  var4++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    final static int[] a(int param0, byte param1) {
        int var2 = 0;
        var2 = param0;
        if ((var2 ^ -1) == 0) {
          return jc.field_i;
        } else {
          if (var2 != 0) {
            if (1 == var2) {
              return dq.field_i;
            } else {
              if (var2 == 2) {
                return bc.field_c;
              } else {
                var2 = -97 % ((14 - param1) / 35);
                return null;
              }
            }
          } else {
            return v.field_a;
          }
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
            field_d = null;
        }
        field_d = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Similar rating";
        field_a = 4800;
    }
}
