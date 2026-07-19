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
        if (this.field_e != null) {
          if (0 != this.field_e.length) {
            if (param0 == 85) {
              var3 = 1;
              L0: while (true) {
                if (this.field_e.length > var3) {
                  if (this.field_e[-1 + var3] - -this.field_e[var3] >> -99442591 <= param1) {
                    var3++;
                    continue L0;
                  } else {
                    return -1 + var3;
                  }
                } else {
                  return -1 + this.field_e.length;
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
            var2 = (ec) ((Object) param0);
            var2.field_c = var2.field_c + ' ' + param1;
        } else {
            var2 = new ec(param0, param1);
        }
        return var2;
    }

    final static void a(byte param0) {
        if (param0 != -4) {
            field_c = (int[]) null;
        }
    }

    final int b(int param0) {
        if (param0 >= 42) {
          if (this.field_e != null) {
            if (-1 == (this.field_e.length ^ -1)) {
              return 0;
            } else {
              return this.field_e[this.field_e.length + -1];
            }
          } else {
            return 0;
          }
        } else {
          sd.a((byte) 37);
          if (this.field_e != null) {
            if (-1 == (this.field_e.length ^ -1)) {
              return 0;
            } else {
              return this.field_e[this.field_e.length + -1];
            }
          } else {
            return 0;
          }
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_g = null;
        field_c = null;
        if (param0 != -15138) {
            field_c = (int[]) null;
        }
    }

    sd(int param0, int param1, int param2) {
        this.field_e = new int[1 + param2];
        this.field_d = param0;
        this.field_a = param1;
    }

    static {
        field_g = "Waiting for sound effects";
        field_c = new int[8192];
    }
}
