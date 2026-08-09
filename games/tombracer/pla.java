/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pla {
    private int[] field_a;
    static String field_b;

    public static void b(int param0) {
        field_b = null;
        if (param0 != -1) {
            field_b = (String) null;
        }
    }

    pla(int[] param0) {
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
              if (param0.length - -(param0.length >> -804711007) < var2_int) {
                this.field_a = new int[var2_int - -var2_int];
                var3 = 0;
                L2: while (true) {
                  if (var3 >= var2_int + var2_int) {
                    var3 = 0;
                    L3: while (true) {
                      if (param0.length <= var3) {
                        break L0;
                      } else {
                        var4 = param0[var3] & var2_int - 1;
                        L4: while (true) {
                          if (-1 == this.field_a[var4 + var4 + 1]) {
                            this.field_a[var4 + var4] = param0[var3];
                            this.field_a[var4 + (var4 + 1)] = var3;
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

            stackIn_16_1 = new StringBuilder().append("pla.<init>(");

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
          throw tba.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
    }

    final static jua a(int param0, String[] param1) {
        jua var2 = null;
        RuntimeException var2_ref = null;
        jua stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2 = new jua(false);
              var2.field_c = param1;
              if (param0 > 80) {
                break L1;
              } else {
                pla.b(3);
                break L1;
              }
            }
            stackIn_3_0 = (jua) (var2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2_ref);

            stackIn_6_1 = new StringBuilder().append("pla.C(").append(param0).append(',');

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
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static int b(int param0, int param1) {
        if (param0 <= 18) {
            field_b = (String) null;
        }
        param1 = param1 & 8191;
        if (-4097 >= (param1 ^ -1)) {
            return 6144 <= param1 ? ida.field_b[param1 - 6144] : -ida.field_b[-param1 + 6144];
        }
        return (param1 ^ -1) <= -2049 ? -ida.field_b[-2048 + param1] : ida.field_b[2048 - param1];
    }

    final static goa a(int param0) {
        if (param0 != -1) {
            field_b = (String) null;
        }
        return new goa(hha.a(false), nd.b((byte) -107));
    }

    final int a(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        var3 = -1 + (this.field_a.length >> 1006001825);
        if (param1 == 1) {
          var4 = var3 & param0;
          L0: while (true) {
            var5 = this.field_a[var4 + (var4 - -1)];
            if ((var5 ^ -1) == 0) {
              return -1;
            } else {
              if (this.field_a[var4 + var4] == param0) {
                return var5;
              } else {
                var4 = var4 + 1 & var3;
                continue L0;
              }
            }
          }
        } else {
          return -46;
        }
    }

    static {
        field_b = "Please check if address is correct";
        pda discarded$0 = new pda(false);
    }
}
