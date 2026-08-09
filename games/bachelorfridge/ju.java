/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ju extends bca {
    static ht field_r;
    static int[] field_q;

    ju(int param0, nq param1) {
        super(param0, param1);
    }

    public static void e(byte param0) {
        field_q = null;
        if (param0 != -67) {
            return;
        }
        field_r = null;
    }

    final void a(op param0, int param1) {
        try {
            int var3_int = 4 / ((param1 - 12) / 35);
            this.a(param0, (byte) -2);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "ju.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    ju(lu param0) {
        super(param0);
        int var2_int = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            this.field_k = param0.e((byte) 53);
            this.field_o = new eaa();
            var2_int = param0.b(16711935);
            L1: while (true) {
              var2_int--;
              if (var2_int < 0) {
                break L0;
              } else {
                this.field_o.a(dca.a((byte) 102, param0), true);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("ju.<init>(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    final int[][] d(byte param0) {
        int[][] var2;
        gj var3;
        int[][] var4;
        if (param0 != 27) {
          var3 = (gj) null;
          this.a(-99, (gj) null);
          var4 = new int[17][17];
          var2 = var4;
          var4[7][9] = 1;
          var4[7][8] = 1;
          var4[7][7] = 1;
          var4[8][7] = 1;
          var4[8][9] = 1;
          var4[9][7] = 1;
          var4[9][9] = 1;
          var4[9][8] = 1;
          return var2;
        } else {
          var4 = new int[17][17];
          var2 = var4;
          var4[7][9] = 1;
          var4[7][8] = 1;
          var4[7][7] = 1;
          var4[8][7] = 1;
          var4[8][9] = 1;
          var4[9][7] = 1;
          var4[9][9] = 1;
          var4[9][8] = 1;
          return var2;
        }
    }

    final static boolean c(int param0, int param1) {
        if ((param1 ^ -1) != -23) {
          if (-22 == (param1 ^ -1)) {
            return false;
          } else {
            if (param1 != 28) {
              if (39 != param1) {
                if (-37 != (param1 ^ -1)) {
                  if (param0 != 23745) {
                    ju.e((byte) -97);
                    return true;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          }
        } else {
          return false;
        }
    }

    final at a(int param0, gj param1) {
        RuntimeException var3 = null;
        kla stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 5) {
                break L1;
              } else {
                ju.c(17, -17);
                break L1;
              }
            }
            stackIn_3_0 = new kla(param1, (ju) (this));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("ju.A(").append(param0).append(',');

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
          throw pe.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return (at) ((Object) stackIn_3_0);
    }

    static {
        field_q = new int[]{6500, 5000, 3500, 2750, 2000};
    }
}
