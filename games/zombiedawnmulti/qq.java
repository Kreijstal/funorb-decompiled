/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qq {
    static cj field_b;
    static cj field_c;
    static boolean field_h;
    private int[] field_e;
    static String field_g;
    static String field_d;
    static int field_a;
    static cj field_f;

    qq(int[] param0) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            var2_int = 1;
            L1: while (true) {
              if (var2_int > param0.length - -(param0.length >> -723639551)) {
                this.field_e = new int[var2_int + var2_int];
                var3 = 0;
                L2: while (true) {
                  if (var3 >= var2_int + var2_int) {
                    var3 = 0;
                    L3: while (true) {
                      if (param0.length <= var3) {
                        break L0;
                      } else {
                        var4 = param0[var3] & -1 + var2_int;
                        L4: while (true) {
                          if (0 == (this.field_e[var4 + var4 + 1] ^ -1)) {
                            this.field_e[var4 + var4] = param0[var3];
                            this.field_e[var4 + (var4 - -1)] = var3;
                            var3++;
                            continue L3;
                          } else {
                            var4 = var4 - -1 & var2_int - 1;
                            continue L4;
                          }
                        }
                      }
                    }
                  } else {
                    this.field_e[var3] = -1;
                    var3++;
                    continue L2;
                  }
                }
              } else {
                var2_int = var2_int << 1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var2);

            stackIn_16_1 = new StringBuilder().append("qq.<init>(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
    }

    public static void a(byte param0) {
        field_d = null;
        if (param0 != 21) {
            return;
        }
        field_c = null;
        field_g = null;
        field_f = null;
        field_b = null;
    }

    final int a(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        L0: {
          var6 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param0 == 1481485697) {
            break L0;
          } else {
            qq.b(81, 106);
            break L0;
          }
        }
        var3 = (this.field_e.length >> 1481485697) + -1;
        var4 = var3 & param1;
        L1: while (true) {
          var5 = this.field_e[1 + (var4 + var4)];
          if (-1 != var5) {
            if (param1 != this.field_e[var4 - -var4]) {
              var4 = 1 + var4 & var3;
              continue L1;
            } else {
              return var5;
            }
          } else {
            return -1;
          }
        }
    }

    final static uj b(int param0, int param1) {
        if (!df.field_H) {
            return null;
        }
        if (4 <= jp.field_c.a(param0 ^ param0)) {
            return null;
        }
        wj var2 = new wj(param1);
        jp.field_c.a(var2, false);
        return var2.field_m;
    }

    static {
        field_g = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_h = false;
        field_d = "Close";
    }
}
