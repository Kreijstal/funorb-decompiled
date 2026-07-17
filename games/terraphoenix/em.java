/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class em {
    static ci field_c;
    int field_a;
    int field_e;
    static String field_b;
    int[] field_d;

    final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = Terraphoenix.field_V;
        if (((em) this).field_d != null) {
          if (((em) this).field_d.length != 0) {
            if (param1 <= -115) {
              var3 = 1;
              L0: while (true) {
                if (((em) this).field_d.length > var3) {
                  if (param0 >= ((em) this).field_d[var3] + ((em) this).field_d[var3 + -1] >> 1) {
                    var3++;
                    continue L0;
                  } else {
                    return var3 + -1;
                  }
                } else {
                  return ((em) this).field_d.length + -1;
                }
              }
            } else {
              int discarded$5 = ((em) this).a(-82, 56);
              var3 = 1;
              L1: while (true) {
                if (((em) this).field_d.length > var3) {
                  if (param0 >= ((em) this).field_d[var3] + ((em) this).field_d[var3 + -1] >> 1) {
                    var3++;
                    continue L1;
                  } else {
                    return var3 + -1;
                  }
                } else {
                  return ((em) this).field_d.length + -1;
                }
              }
            }
          } else {
            return 0;
          }
        } else {
          return 0;
        }
    }

    final int b(int param0) {
        if (param0 == -1) {
          if (null != ((em) this).field_d) {
            if (((em) this).field_d.length == 0) {
              return 0;
            } else {
              return ((em) this).field_d[((em) this).field_d.length + -1];
            }
          } else {
            return 0;
          }
        } else {
          field_c = null;
          if (null != ((em) this).field_d) {
            if (((em) this).field_d.length == 0) {
              return 0;
            } else {
              return ((em) this).field_d[((em) this).field_d.length + -1];
            }
          } else {
            return 0;
          }
        }
    }

    public static void a() {
        field_c = null;
        field_b = null;
    }

    em(int param0, int param1, int param2) {
        ((em) this).field_a = param1;
        ((em) this).field_e = param0;
        ((em) this).field_d = new int[param2 - -1];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Invalid password.";
    }
}
