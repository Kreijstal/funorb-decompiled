/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ni {
    static vc field_a;
    private int[] field_b;

    final int a(byte param0, int param1) {
        int var3;
        int var4;
        int var5;
        L0: {
          var3 = (this.field_b.length >> -722797439) - 1;
          if (param0 == 76) {
            break L0;
          } else {
            field_a = (vc) null;
            break L0;
          }
        }
        var4 = var3 & param1;
        L1: while (true) {
          var5 = this.field_b[var4 + (var4 - -1)];
          if ((var5 ^ -1) == 0) {
            return -1;
          } else {
            if (param1 == this.field_b[var4 + var4]) {
              return var5;
            } else {
              var4 = 1 + var4 & var3;
              continue L1;
            }
          }
        }
    }

    public static void a(boolean param0) {
        field_a = null;
        if (param0) {
            ni.a(false);
        }
    }

    ni(int[] param0) {
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
              if ((param0.length >> -405690943) + param0.length < var2_int) {
                this.field_b = new int[var2_int + var2_int];
                var3 = 0;
                L2: while (true) {
                  if (var3 >= var2_int + var2_int) {
                    var3 = 0;
                    L3: while (true) {
                      if (var3 >= param0.length) {
                        break L0;
                      } else {
                        var4 = var2_int + -1 & param0[var3];
                        L4: while (true) {
                          if (-1 == this.field_b[1 + var4 - -var4]) {
                            this.field_b[var4 + var4] = param0[var3];
                            this.field_b[var4 + var4 + 1] = var3;
                            var3++;
                            continue L3;
                          } else {
                            var4 = var2_int - 1 & 1 + var4;
                            continue L4;
                          }
                        }
                      }
                    }
                  } else {
                    this.field_b[var3] = -1;
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

            stackIn_16_1 = new StringBuilder().append("ni.<init>(");

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
          throw sd.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
    }

    static {
    }
}
