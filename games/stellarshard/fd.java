/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fd extends si {
    static int[] field_qb;
    static int field_nb;
    static boolean field_mb;
    int field_ob;
    String field_rb;
    String field_pb;

    final static int a(byte param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = stellarshard.field_B;
        if (param0 >= 75) {
          var3 = 1;
          L0: while (true) {
            if (param1 >= -2) {
              if (1 == param1) {
                return var3 * param2;
              } else {
                return var3;
              }
            } else {
              L1: {
                if (-1 != (1 & param1)) {
                  var3 = var3 * param2;
                  break L1;
                } else {
                  break L1;
                }
              }
              param1 = param1 >> 1;
              param2 = param2 * param2;
              continue L0;
            }
          }
        } else {
          field_mb = false;
          var3 = 1;
          L2: while (true) {
            if (param1 >= -2) {
              if (1 == param1) {
                return var3 * param2;
              } else {
                return var3;
              }
            } else {
              L3: {
                if (-1 != (1 & param1)) {
                  var3 = var3 * param2;
                  break L3;
                } else {
                  break L3;
                }
              }
              param1 = param1 >> 1;
              param2 = param2 * param2;
              continue L2;
            }
          }
        }
    }

    fd() {
        super(0L, (si) null);
    }

    public static void g(int param0) {
        field_qb = null;
        if (param0 != -30900) {
            field_qb = null;
        }
    }

    final static boolean d(byte param0) {
        if (param0 != -21) {
            field_mb = false;
            return qh.field_g;
        }
        return qh.field_g;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_qb = new int[25];
    }
}
