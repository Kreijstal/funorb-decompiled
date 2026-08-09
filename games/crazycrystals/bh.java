/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bh {
    static int field_c;
    int field_f;
    int field_b;
    static String field_d;
    int[] field_e;
    static String field_a;

    final int a(int param0, int param1) {
        int var3;
        int var4;
        L0: {
          var4 = CrazyCrystals.field_B;
          if (param0 <= -32) {
            break L0;
          } else {
            this.b(-83);
            break L0;
          }
        }
        L1: {
          if (null == this.field_e) {
            break L1;
          } else {
            if (this.field_e.length == 0) {
              break L1;
            } else {
              var3 = 1;
              L2: while (true) {
                if (var3 >= this.field_e.length) {
                  return this.field_e.length - 1;
                } else {
                  if (this.field_e[-1 + var3] - -this.field_e[var3] >> -2051005375 > param1) {
                    return var3 - 1;
                  } else {
                    var3++;
                    continue L2;
                  }
                }
              }
            }
          }
        }
        return 0;
    }

    final static boolean a(byte param0) {
        if (param0 != 78) {
            return false;
        }
        return qh.field_f;
    }

    public static void a(int param0) {
        if (param0 != -1) {
            field_c = 3;
        }
        field_d = null;
        field_a = null;
    }

    final int b(int param0) {
        int stackIn_7_0 = 0;
        L0: {
          if (param0 == -2288) {
            break L0;
          } else {
            this.a(-44, -4);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == this.field_e) {
              break L2;
            } else {
              if (this.field_e.length != 0) {
                stackIn_7_0 = this.field_e[this.field_e.length + -1];
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackIn_7_0 = 0;
          break L1;
        }
        return stackIn_7_0;
    }

    bh(int param0, int param1, int param2) {
        this.field_b = param1;
        this.field_f = param0;
        this.field_e = new int[1 + param2];
    }

    static {
        field_d = "Please enter your age in years";
        field_a = "If you have an account, log in to start at any level you've reached.";
    }
}
