/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pf extends lu {
    private int field_l;
    private static long[] field_j;
    private ko field_m;
    static String field_i;
    static lm field_n;
    static String field_k;

    pf(int param0) {
        super(param0);
    }

    final void i(byte param0) {
        this.field_g = (7 + this.field_l) / 8;
        if (param0 != -86) {
            this.i((byte) 113);
        }
    }

    final void c(int param0, byte param1) {
        int fieldTemp$0 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_h[fieldTemp$0] = (byte)(param0 + this.field_m.b(28602));
        if (param1 <= 96) {
            this.m(-110);
        }
    }

    pf(byte[] param0) {
        super(param0);
    }

    final void b(int[] param0, int param1) {
        if (param1 != 8829) {
            return;
        }
        try {
            this.field_m = new ko(param0);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "pf.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int d(int param0, byte param1) {
        int incrementValue$0 = 0;
        int var7 = BachelorFridge.field_y;
        int var4 = 5 / ((-10 - param1) / 54);
        int var3 = this.field_l >> -1901421341;
        int var5 = -(7 & this.field_l) + 8;
        this.field_l = this.field_l + param0;
        int var6 = 0;
        while (var5 < param0) {
            incrementValue$0 = var3;
            var3++;
            var6 = var6 + ((this.field_h[incrementValue$0] & wj.field_n[var5]) << param0 + -var5);
            param0 = param0 - var5;
            var5 = 8;
        }
        if (var5 != param0) {
            var6 = var6 + (this.field_h[var3] >> var5 - param0 & wj.field_n[param0]);
        } else {
            var6 = var6 + (wj.field_n[var5] & this.field_h[var3]);
        }
        return var6;
    }

    final void m(int param0) {
        this.field_l = this.field_g * 8;
        if (param0 != 1) {
            field_n = (lm) null;
        }
    }

    final int k(int param0) {
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        if (param0 != 694) {
          this.i((byte) -2);
          fieldTemp$4 = this.field_g;
          this.field_g = this.field_g + 1;
          return this.field_h[fieldTemp$4] - this.field_m.b(28602) & 255;
        } else {
          fieldTemp$5 = this.field_g;
          this.field_g = this.field_g + 1;
          return this.field_h[fieldTemp$5] - this.field_m.b(28602) & 255;
        }
    }

    public static void l(int param0) {
        field_i = null;
        field_j = null;
        if (param0 != -6199) {
            return;
        }
        field_n = null;
        field_k = null;
    }

    final void b(byte[] param0, int param1, int param2, int param3) {
        int fieldTemp$2 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var6 = BachelorFridge.field_y;
        try {
          L0: {
            var5_int = 0;
            L1: while (true) {
              if (param1 <= var5_int) {
                if (param3 == -31908) {
                  break L0;
                } else {
                  this.field_l = -58;
                  return;
                }
              } else {
                fieldTemp$2 = this.field_g;
                this.field_g = this.field_g + 1;
                param0[param2 + var5_int] = (byte)(this.field_h[fieldTemp$2] + -this.field_m.b(28602));
                var5_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var5);
            stackOut_7_1 = new StringBuilder().append("pf.A(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        $cfr$clinit: {
            long var0 = 0L;
            int var2 = 0;
            int var3 = 0;
            field_j = new long[256];
            var2 = 0;
            L0: while (true) {
              if (256 <= var2) {
                field_i = "Options";
                field_k = "Who can join";
                break $cfr$clinit;
              } else {
                var0 = (long)var2;
                var3 = 0;
                L1: while (true) {
                  if (-9 >= (var3 ^ -1)) {
                    field_j[var2] = var0;
                    var2++;
                    continue L0;
                  } else {
                    if ((1L & var0) == 1L) {
                      var0 = -3932672073523589310L ^ var0 >>> -837539199;
                      var3++;
                      continue L1;
                    } else {
                      var0 = var0 >>> 1;
                      var3++;
                      continue L1;
                    }
                  }
                }
              }
            }
        }
    }
}
