/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lr {
    static iv field_a;
    private int[] field_b;

    lr(int[] param0) {
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
              if ((param0.length >> 821848545) + param0.length < var2_int) {
                this.field_b = new int[var2_int - -var2_int];
                var3 = 0;
                L2: while (true) {
                  if (var2_int + var2_int <= var3) {
                    var3 = 0;
                    L3: while (true) {
                      if (param0.length <= var3) {
                        break L0;
                      } else {
                        var4 = var2_int + -1 & param0[var3];
                        L4: while (true) {
                          if (0 == (this.field_b[var4 + (var4 + 1)] ^ -1)) {
                            this.field_b[var4 + var4] = param0[var3];
                            this.field_b[var4 + var4 + 1] = var3;
                            var3++;
                            continue L3;
                          } else {
                            var4 = var4 + 1 & var2_int - 1;
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

            stackIn_16_1 = new StringBuilder().append("lr.<init>(");

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
          throw ig.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
    }

    final static ru[] a(int param0) {
        int var2 = 0;
        int var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        ru[] var1 = new ru[iw.field_n];
        for (var2 = 0; var2 < iw.field_n; var2++) {
            var1[var2] = new ru(lg.field_d, wr.field_J, j.field_e[var2], iq.field_g[var2], qm.field_K[var2], c.field_e[var2], vj.field_j[var2], qv.field_j);
        }
        if (param0 < 102) {
            co[] var4 = (co[]) null;
            lr.a((co[]) null, (byte) -34);
        }
        rj.d((byte) 103);
        return var1;
    }

    final int a(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        var3 = -1 + (this.field_b.length >> -2140433471);
        if (param1 == 1) {
          var4 = var3 & param0;
          L0: while (true) {
            var5 = this.field_b[1 + (var4 + var4)];
            if ((var5 ^ -1) != 0) {
              if (this.field_b[var4 + var4] == param0) {
                return var5;
              } else {
                var4 = var3 & 1 + var4;
                continue L0;
              }
            } else {
              return -1;
            }
          }
        } else {
          return -110;
        }
    }

    final static void a(co[] param0, byte param1) {
        co[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        co[] var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var5 = param0;
              var2 = var5;
              if (param1 > 35) {
                break L1;
              } else {
                lr.a(-11);
                break L1;
              }
            }
            var3 = 0;
            L2: while (true) {
              if (var3 >= var5.length) {
                break L0;
              } else {
                var3++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2_ref);

            stackIn_9_1 = new StringBuilder().append("lr.B(");

            if (param0 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
    }

    static {
        field_a = null;
    }
}
