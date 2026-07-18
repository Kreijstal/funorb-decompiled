/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd {
    int field_a;
    int field_d;
    static int[] field_f;
    int[] field_e;
    static String field_g;
    static int[] field_c;
    static int field_b;

    final int a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = Confined.field_J ? 1 : 0;
        if (((sd) this).field_e != null) {
          if (0 != ((sd) this).field_e.length) {
            if (param0 == 85) {
              var3 = 1;
              L0: while (true) {
                if (((sd) this).field_e.length > var3) {
                  if (((sd) this).field_e[-1 + var3] - -((sd) this).field_e[var3] >> 1 <= param1) {
                    var3++;
                    continue L0;
                  } else {
                    return -1 + var3;
                  }
                } else {
                  return -1 + ((sd) this).field_e.length;
                }
              }
            } else {
              return 2;
            }
          } else {
            return 0;
          }
        } else {
          return 0;
        }
    }

    final static ec a(Throwable param0, String param1) {
        ec var2 = null;
        if (param0 instanceof ec) {
            var2 = (ec) (Object) param0;
            var2.field_c = var2.field_c + ' ' + param1;
        } else {
            var2 = new ec(param0, param1);
        }
        return var2;
    }

    final static void a(byte param0) {
        if (param0 != -4) {
            field_c = null;
        }
    }

    final int b(int param0) {
        if (param0 >= 42) {
          if (((sd) this).field_e != null) {
            if (((sd) this).field_e.length == 0) {
              return 0;
            } else {
              return ((sd) this).field_e[((sd) this).field_e.length + -1];
            }
          } else {
            return 0;
          }
        } else {
          sd.a((byte) 37);
          if (((sd) this).field_e != null) {
            if (((sd) this).field_e.length == 0) {
              return 0;
            } else {
              return ((sd) this).field_e[((sd) this).field_e.length + -1];
            }
          } else {
            return 0;
          }
        }
    }

    public static void a() {
        field_f = null;
        field_g = null;
        field_c = null;
    }

    sd(int param0, int param1, int param2) {
        ((sd) this).field_e = new int[1 + param2];
        ((sd) this).field_d = param0;
        ((sd) this).field_a = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Waiting for sound effects";
        field_c = new int[8192];
    }
}
