/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jn {
    static int field_c;
    private int[] field_f;
    static int field_e;
    static int field_a;
    static int field_d;
    static int field_b;

    final int a(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        var3 = (this.field_f.length >> 725054529) - param1;
        var4 = var3 & param0;
        L0: while (true) {
          var5 = this.field_f[1 + (var4 + var4)];
          if (var5 == -1) {
            return -1;
          } else {
            if (this.field_f[var4 - -var4] != param0) {
              var4 = 1 + var4 & var3;
              continue L0;
            } else {
              return var5;
            }
          }
        }
    }

    final static byte[] a(int param0, String param1) {
        RuntimeException var2 = null;
        String var3 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 >= 13) {
                break L1;
              } else {
                var3 = (String) null;
                jn.a(-106, (String) null);
                break L1;
              }
            }
            stackIn_3_0 = fk.field_a.a(-4, param1, "");
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("jn.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    jn(int[] param0) {
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
              if ((param0.length >> 295360545) + param0.length < var2_int) {
                this.field_f = new int[var2_int - -var2_int];
                var3 = 0;
                L2: while (true) {
                  if (var2_int + var2_int <= var3) {
                    var3 = 0;
                    L3: while (true) {
                      if (param0.length <= var3) {
                        break L0;
                      } else {
                        var4 = param0[var3] & var2_int - 1;
                        L4: while (true) {
                          if (this.field_f[var4 + (var4 - -1)] == -1) {
                            this.field_f[var4 - -var4] = param0[var3];
                            this.field_f[var4 - (-var4 + -1)] = var3;
                            var3++;
                            continue L3;
                          } else {
                            var4 = var2_int + -1 & var4 + 1;
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

            stackIn_16_1 = new StringBuilder().append("jn.<init>(");

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
          throw t.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
    }

    static {
        id.a(400, 50);
    }
}
