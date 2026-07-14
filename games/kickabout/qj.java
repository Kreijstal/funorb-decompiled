/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj {
    int field_d;
    static ut field_f;
    int field_g;
    static int field_e;
    int[] field_b;
    static ut field_a;
    static String field_c;

    final int a(byte param0) {
        int var2 = 0;
        var2 = -121 / ((-14 - param0) / 44);
        if (((qj) this).field_b != null) {
          if (((qj) this).field_b.length == 0) {
            return 0;
          } else {
            return ((qj) this).field_b[-1 + ((qj) this).field_b.length];
          }
        } else {
          return 0;
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        L0: {
          var2 = ig.a(param1, param0 ^ -2167);
          if (ia.field_c) {
            var2 = -var2 + 1344;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != -6779) {
          qj.b((byte) -5);
          return var2;
        } else {
          return var2;
        }
    }

    final int a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = Kickabout.field_G;
        if (param0 == 101) {
          if (((qj) this).field_b != null) {
            if (-1 != (((qj) this).field_b.length ^ -1)) {
              var3 = 1;
              L0: while (true) {
                if (((qj) this).field_b.length > var3) {
                  if (((qj) this).field_b[-1 + var3] - -((qj) this).field_b[var3] >> -1613831583 > param1) {
                    return var3 - 1;
                  } else {
                    var3++;
                    continue L0;
                  }
                } else {
                  return ((qj) this).field_b.length + -1;
                }
              }
            } else {
              return 0;
            }
          } else {
            return 0;
          }
        } else {
          field_e = -68;
          if (((qj) this).field_b != null) {
            if (-1 != (((qj) this).field_b.length ^ -1)) {
              var3 = 1;
              L1: while (true) {
                if (((qj) this).field_b.length > var3) {
                  if (((qj) this).field_b[-1 + var3] - -((qj) this).field_b[var3] >> -1613831583 > param1) {
                    return var3 - 1;
                  } else {
                    var3++;
                    continue L1;
                  }
                } else {
                  return ((qj) this).field_b.length + -1;
                }
              }
            } else {
              return 0;
            }
          } else {
            return 0;
          }
        }
    }

    static int b(int param0, int param1) {
        return param0 & param1;
    }

    public static void b(byte param0) {
        field_a = null;
        field_c = null;
        if (param0 >= -25) {
            int discarded$0 = qj.a(75, 93);
            field_f = null;
            return;
        }
        field_f = null;
    }

    qj(int param0, int param1, int param2) {
        ((qj) this).field_d = param1;
        ((qj) this).field_g = param0;
        ((qj) this).field_b = new int[1 + param2];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 470;
        field_c = "Waiting for sound effects";
    }
}
