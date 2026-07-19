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
        int discarded$5 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = Terraphoenix.field_V;
        if (this.field_d != null) {
          if (-1 != (this.field_d.length ^ -1)) {
            if (param1 <= -115) {
              var3 = 1;
              L0: while (true) {
                if (this.field_d.length > var3) {
                  if (param0 >= this.field_d[var3] + this.field_d[var3 + -1] >> -1679860287) {
                    var3++;
                    continue L0;
                  } else {
                    return var3 + -1;
                  }
                } else {
                  return this.field_d.length + -1;
                }
              }
            } else {
              discarded$5 = this.a(-82, 56);
              var3 = 1;
              L1: while (true) {
                if (this.field_d.length > var3) {
                  if (param0 >= this.field_d[var3] + this.field_d[var3 + -1] >> -1679860287) {
                    var3++;
                    continue L1;
                  } else {
                    return var3 + -1;
                  }
                } else {
                  return this.field_d.length + -1;
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
          if (null != this.field_d) {
            if (-1 == (this.field_d.length ^ -1)) {
              return 0;
            } else {
              return this.field_d[this.field_d.length + -1];
            }
          } else {
            return 0;
          }
        } else {
          field_c = (ci) null;
          if (null != this.field_d) {
            if (-1 == (this.field_d.length ^ -1)) {
              return 0;
            } else {
              return this.field_d[this.field_d.length + -1];
            }
          } else {
            return 0;
          }
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        if (param0 >= -118) {
            field_c = (ci) null;
        }
    }

    em(int param0, int param1, int param2) {
        this.field_a = param1;
        this.field_e = param0;
        this.field_d = new int[param2 - -1];
    }

    static {
        field_b = "Invalid password.";
    }
}
