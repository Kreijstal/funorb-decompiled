/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cm {
    private int[] field_d;
    static bc field_a;
    static ro field_e;
    static int[] field_g;
    static boolean field_f;
    static String field_c;
    static bi field_b;

    cm(int[] param0) {
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
              if (var2_int > param0.length + (param0.length >> 926277889)) {
                this.field_d = new int[var2_int - -var2_int];
                var3 = 0;
                L2: while (true) {
                  if (var3 >= var2_int - -var2_int) {
                    var3 = 0;
                    L3: while (true) {
                      if (param0.length <= var3) {
                        break L0;
                      } else {
                        var4 = param0[var3] & -1 + var2_int;
                        L4: while (true) {
                          if (-1 == this.field_d[1 + var4 - -var4]) {
                            this.field_d[var4 + var4] = param0[var3];
                            this.field_d[1 + (var4 + var4)] = var3;
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
                    this.field_d[var3] = -1;
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

            stackIn_16_1 = new StringBuilder().append("cm.<init>(");

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
          throw r.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
    }

    final int a(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        L0: {
          var3 = (this.field_d.length >> 1160525185) - 1;
          if (param0 == 24396) {
            break L0;
          } else {
            cm.a((byte) -59);
            break L0;
          }
        }
        var4 = var3 & param1;
        L1: while (true) {
          var5 = this.field_d[1 + (var4 + var4)];
          if ((var5 ^ -1) == 0) {
            return -1;
          } else {
            if (this.field_d[var4 + var4] != param1) {
              var4 = var4 - -1 & var3;
              continue L1;
            } else {
              return var5;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_e = null;
        field_b = null;
        if (param0 != -26) {
            cm.a((byte) 94);
        }
        field_a = null;
        field_g = null;
    }

    static {
        field_e = new ro();
        field_c = "Searching for an opponent";
    }
}
