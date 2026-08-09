/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cr {
    private int[] field_d;
    static je field_c;
    static long field_a;
    static boolean field_b;

    final int a(byte param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        L0: {
          var6 = BachelorFridge.field_y;
          if (param0 < -74) {
            break L0;
          } else {
            this.field_d = (int[]) null;
            break L0;
          }
        }
        var3 = -1 + (this.field_d.length >> 45318817);
        var4 = var3 & param1;
        L1: while (true) {
          var5 = this.field_d[var4 + (var4 - -1)];
          if (-1 != var5) {
            if (param1 == this.field_d[var4 + var4]) {
              return var5;
            } else {
              var4 = 1 + var4 & var3;
              continue L1;
            }
          } else {
            return -1;
          }
        }
    }

    cr(int[] param0) {
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
              if (var2_int > param0.length - -(param0.length >> -2099014975)) {
                this.field_d = new int[var2_int + var2_int];
                var3 = 0;
                L2: while (true) {
                  if (var3 >= var2_int + var2_int) {
                    var3 = 0;
                    L3: while (true) {
                      if (var3 >= param0.length) {
                        break L0;
                      } else {
                        var4 = param0[var3] & -1 + var2_int;
                        L4: while (true) {
                          if (-1 == this.field_d[1 + var4 + var4]) {
                            this.field_d[var4 + var4] = param0[var3];
                            this.field_d[var4 + (var4 - -1)] = var3;
                            var3++;
                            continue L3;
                          } else {
                            var4 = 1 + var4 & var2_int - 1;
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

            stackIn_16_1 = new StringBuilder().append("cr.<init>(");

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
          throw pe.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != 21592) {
            field_b = true;
        }
    }

    final static int a(int param0, int param1, int param2, int param3) {
        if (param3 != 0) {
            field_b = true;
        }
        return param0 > param1 ? param0 : param2 >= param1 ? param1 : param2;
    }

    static {
    }
}
