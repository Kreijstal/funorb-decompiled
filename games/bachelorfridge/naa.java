/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class naa extends bca {
    int field_r;
    int field_q;
    int field_t;
    aj[] field_s;
    int field_u;

    final int[][] d(int param0) {
        int[][] var5 = new int[17][17];
        int[][] var4 = var5;
        int[][] var3 = var4;
        int[][] var2 = var3;
        var5[5][8] = 1;
        var5[6][7] = 1;
        var5[7][7] = 1;
        var5[6][8] = 1;
        var5[6][9] = 1;
        var5[7][6] = 1;
        var5[7][9] = 1;
        var5[8][6] = 1;
        var5[7][10] = 1;
        var5[8][5] = 1;
        var5[8][7] = 1;
        var5[7][8] = 1;
        var5[9][7] = 1;
        var5[9][6] = 1;
        var5[8][8] = 1;
        var5[8][10] = 1;
        var5[8][11] = 1;
        var5[8][9] = 1;
        var5[9][8] = 1;
        var5[9][10] = 1;
        var5[9][9] = 1;
        var5[10][7] = 1;
        var5[10][9] = 1;
        if (param0 != 9268) {
            return (int[][]) null;
        }
        var5[10][8] = 1;
        var5[11][8] = 1;
        return var2;
    }

    naa(int param0, nq param1) {
        super(param0, param1);
        try {
            this.field_u = 0;
            this.field_s = new aj[6];
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "naa.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final at a(int param0, gj param1) {
        RuntimeException var3 = null;
        lu var4 = null;
        jga stackIn_3_0 = null;
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
                var4 = (lu) null;
                this.a((byte) 60, (lu) null);
                break L1;
              }
            }
            stackIn_3_0 = new jga(param1, (naa) (this));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("naa.A(").append(param0).append(',');

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

    final void a(byte param0, lu param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              super.a((byte) -86, param1);
              if (param0 <= -12) {
                break L1;
              } else {
                this.d(-70);
                break L1;
              }
            }
            param1.d(this.field_q, 0);
            param1.d(this.field_t, 0);
            param1.d(this.field_u, 0);
            param1.d(this.field_r, 0);
            var3_int = 0;
            L2: while (true) {
              if (var3_int >= this.field_u) {
                break L0;
              } else {
                param1.d(this.field_s[var3_int].field_c, 0);
                param1.d(this.field_s[var3_int].field_a, 0);
                var3_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("naa.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    final void a(op param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        aj var5 = null;
        wia var6 = null;
        int var7 = 0;
        wia stackIn_8_0 = null;
        wia stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var7 = BachelorFridge.field_y;
        try {
          L0: {
            this.a(param0, (byte) -2);
            param0.a(this.field_u, this.field_s, 38, (byte) -36);
            var4 = 60 / ((12 - param1) / 35);
            var3_int = 0;
            L1: while (true) {
              if (this.field_u <= var3_int) {
                break L0;
              } else {
                var5 = this.field_s[var3_int];
                var6 = param0.field_a[var5.field_c][var5.field_a];
                if ((var6.field_n ^ -1) != -39) {
                  throw new RuntimeException();
                } else {
                  L2: {
                    stackIn_8_0 = (wia) (var6);

                    if (var3_int == this.field_r) {
                      stackIn_9_0 = (wia) ((Object) stackIn_8_0);
                      stackIn_9_1 = 1;
                      break L2;
                    } else {
                      stackIn_9_0 = (wia) ((Object) stackIn_8_0);
                      stackIn_9_1 = 0;
                      break L2;
                    }
                  }
                  stackIn_9_0.field_j = stackIn_9_1;
                  var3_int++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("naa.E(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
    }

    naa(lu param0) {
        super(param0);
        int var2_int = 0;
        int var3 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            this.field_k = param0.e((byte) 83);
            this.field_o = new eaa();
            var2_int = param0.b(16711935);
            L1: while (true) {
              var2_int--;
              if (0 > var2_int) {
                this.field_q = param0.b(16711935);
                this.field_t = param0.b(16711935);
                this.field_u = param0.b(16711935);
                this.field_r = param0.b(16711935);
                this.field_s = new aj[this.field_u];
                var3 = 0;
                L2: while (true) {
                  if (this.field_u <= var3) {
                    break L0;
                  } else {
                    this.field_s[var3] = new aj(param0.b(16711935), param0.b(16711935));
                    var3++;
                    continue L2;
                  }
                }
              } else {
                this.field_o.a(dca.a((byte) 102, param0), true);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2);

            stackIn_10_1 = new StringBuilder().append("naa.<init>(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    static {
    }
}
