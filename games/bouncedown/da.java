/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class da {
    static java.awt.Color field_d;
    static String field_c;
    private int[] field_a;
    static String field_b;

    public static void a(int param0) {
        if (param0 > -20) {
            da.a(121);
        }
        field_c = null;
        field_d = null;
        field_b = null;
    }

    final int a(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        L0: {
          var6 = Bounce.field_N;
          var3 = -1 + (this.field_a.length >> 382701601);
          var4 = param1 & var3;
          if (param0 <= -53) {
            break L0;
          } else {
            field_b = (String) null;
            break L0;
          }
        }
        L1: while (true) {
          var5 = this.field_a[var4 + (var4 + 1)];
          if (-1 != var5) {
            if (param1 != this.field_a[var4 - -var4]) {
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

    da(int[] param0) {
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
              if (var2_int > (param0.length >> 23824321) + param0.length) {
                this.field_a = new int[var2_int + var2_int];
                var3 = 0;
                L2: while (true) {
                  if (var3 >= var2_int - -var2_int) {
                    var3 = 0;
                    L3: while (true) {
                      if (var3 >= param0.length) {
                        break L0;
                      } else {
                        var4 = param0[var3] & -1 + var2_int;
                        L4: while (true) {
                          if (0 == (this.field_a[var4 + (var4 - -1)] ^ -1)) {
                            this.field_a[var4 - -var4] = param0[var3];
                            this.field_a[1 + (var4 + var4)] = var3;
                            var3++;
                            continue L3;
                          } else {
                            var4 = -1 + var2_int & 1 + var4;
                            continue L4;
                          }
                        }
                      }
                    }
                  } else {
                    this.field_a[var3] = -1;
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

            stackIn_16_1 = new StringBuilder().append("da.<init>(");

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
          throw ii.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
    }

    static int b(int param0, int param1) {
        return param0 & param1;
    }

    static {
        field_c = "To Customer Support";
        field_d = new java.awt.Color(10040319);
        field_b = "Loading extra data";
    }
}
