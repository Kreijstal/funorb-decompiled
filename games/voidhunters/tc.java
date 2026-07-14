/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tc {
    static gj field_c;
    static boolean field_a;
    static boolean[][] field_b;

    final static int a(int param0, aba param1) {
        if (param0 == 8448) {
          if (param1 != et.field_c) {
            if (param1 != asa.field_a) {
              if (param1 != df.field_o) {
                if (param1 != je.field_c) {
                  if (feb.field_a == param1) {
                    return 34023;
                  } else {
                    throw new IllegalArgumentException();
                  }
                } else {
                  return 260;
                }
              } else {
                return 34165;
              }
            } else {
              return 8448;
            }
          } else {
            return 7681;
          }
        } else {
          field_b = null;
          if (param1 != et.field_c) {
            if (param1 != asa.field_a) {
              if (param1 != df.field_o) {
                if (param1 != je.field_c) {
                  if (feb.field_a == param1) {
                    return 34023;
                  } else {
                    throw new IllegalArgumentException();
                  }
                } else {
                  return 260;
                }
              } else {
                return 34165;
              }
            } else {
              return 8448;
            }
          } else {
            return 7681;
          }
        }
    }

    final static void a(int param0, int param1, int param2) {
        be var3 = new be();
        var3.field_a = param1;
        var3.field_b = 31 + param2;
        rkb.a(0, (tv) (Object) var3, dpa.field_p, param0);
    }

    public static void a(byte param0) {
        field_c = null;
        field_b = null;
        if (param0 != 40) {
            field_c = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new boolean[][]{new boolean[3]};
    }
}
