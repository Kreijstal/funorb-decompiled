/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qf {
    static he[] field_e;
    static int field_d;
    static String field_a;
    static nh field_b;
    private int[] field_f;
    static String field_c;
    static he[] field_g;

    final int a(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var3 = (this.field_f.length >> -1500775551) + param1;
        var4 = param0 & var3;
        L0: while (true) {
          var5 = this.field_f[1 + (var4 - -var4)];
          if (-1 != var5) {
            if (this.field_f[var4 + var4] != param0) {
              var4 = 1 + var4 & var3;
              continue L0;
            } else {
              return var5;
            }
          } else {
            return -1;
          }
        }
    }

    qf(int[] param0) {
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
              if (param0.length - -(param0.length >> -468706367) < var2_int) {
                this.field_f = new int[var2_int - -var2_int];
                var3 = 0;
                L2: while (true) {
                  if (var2_int + var2_int <= var3) {
                    var3 = 0;
                    L3: while (true) {
                      if (var3 >= param0.length) {
                        break L0;
                      } else {
                        var4 = param0[var3] & -1 + var2_int;
                        L4: while (true) {
                          if (-1 == this.field_f[1 + var4 + var4]) {
                            this.field_f[var4 + var4] = param0[var3];
                            this.field_f[1 + var4 + var4] = var3;
                            var3++;
                            continue L3;
                          } else {
                            var4 = var4 - -1 & -1 + var2_int;
                            continue L4;
                          }
                        }
                      }
                    }
                  } else {
                    this.field_f[var3] = -1;
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

            stackIn_16_1 = new StringBuilder().append("qf.<init>(");

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
          throw ie.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_g = null;
        field_e = null;
        if (param0 != 64) {
            qf.a((byte) -43);
        }
        field_b = null;
        field_c = null;
    }

    static {
        field_a = "Password: ";
    }
}
