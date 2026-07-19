/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pl extends fs {
    static int field_u;
    static String field_s;
    private int field_w;
    static String[] field_r;
    static jn field_v;
    private ok field_t;
    static int field_y;
    static String field_x;
    static String field_q;

    final void g(int param0, int param1) {
        int fieldTemp$0 = this.field_p;
        this.field_p = this.field_p + 1;
        this.field_n[fieldTemp$0] = (byte)(param0 + this.field_t.a(jg.a(param1, 264)));
        if (param1 != 8) {
            this.i((byte) 39);
        }
    }

    pl(byte[] param0) {
        super(param0);
    }

    final int b(int param0, byte param1) {
        int incrementValue$1 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Sumoblitz.field_L ? 1 : 0;
        var3 = this.field_w >> 1570203171;
        var4 = 8 - (7 & this.field_w);
        if (param1 < -85) {
          var5 = 0;
          this.field_w = this.field_w + param0;
          L0: while (true) {
            if (var4 < param0) {
              incrementValue$1 = var3;
              var3++;
              var5 = var5 + ((this.field_n[incrementValue$1] & am.field_z[var4]) << param0 + -var4);
              param0 = param0 - var4;
              var4 = 8;
              if (var6 == 0) {
                continue L0;
              } else {
                var5 = var5 + (this.field_n[var3] >> var4 - param0 & am.field_z[param0]);
                return var5;
              }
            } else {
              L1: {
                L2: {
                  if (var4 != param0) {
                    break L2;
                  } else {
                    var5 = var5 + (am.field_z[var4] & this.field_n[var3]);
                    if (var6 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var5 = var5 + (this.field_n[var3] >> var4 - param0 & am.field_z[param0]);
                break L1;
              }
              return var5;
            }
          }
        } else {
          return 116;
        }
    }

    final void a(byte[] param0, int param1, int param2, int param3) {
        int fieldTemp$5 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var5_int = param1;
            L1: while (true) {
              if (param3 <= var5_int) {
                break L0;
              } else {
                fieldTemp$5 = this.field_p;
                this.field_p = this.field_p + 1;
                param0[var5_int - -param2] = (byte)(this.field_n[fieldTemp$5] + -this.field_t.a(256));
                var5_int++;
                if (var6 == 0) {
                  continue L1;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var5);
            stackOut_8_1 = new StringBuilder().append("pl.I(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void i(byte param0) {
        int var2 = -18 / ((-28 - param0) / 59);
        this.field_w = 8 * this.field_p;
    }

    final void h(byte param0) {
        if (param0 != -63) {
            return;
        }
        this.field_p = (this.field_w + 7) / 8;
    }

    final static void a(java.awt.Component param0, int param1) {
        try {
            if (param1 != 7) {
                java.awt.Component var3 = (java.awt.Component) null;
                pl.a((java.awt.Component) null, 93);
            }
            param0.removeMouseListener(wk.field_h);
            param0.removeMouseMotionListener(wk.field_h);
            param0.removeFocusListener(wk.field_h);
            b.field_a = 0;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "pl.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(byte param0, int[] param1) {
        try {
            this.field_t = new ok(param1);
            int var3_int = 41 % ((param0 - 21) / 39);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "pl.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void j(int param0) {
        field_s = null;
        if (param0 != 24599) {
          field_y = 91;
          field_q = null;
          field_x = null;
          field_v = null;
          field_r = null;
          return;
        } else {
          field_q = null;
          field_x = null;
          field_v = null;
          field_r = null;
          return;
        }
    }

    pl(int param0) {
        super(param0);
    }

    final int i(int param0) {
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        if (param0 != 255) {
          this.field_w = 51;
          fieldTemp$4 = this.field_p;
          this.field_p = this.field_p + 1;
          return this.field_n[fieldTemp$4] - this.field_t.a(256) & 255;
        } else {
          fieldTemp$5 = this.field_p;
          this.field_p = this.field_p + 1;
          return this.field_n[fieldTemp$5] - this.field_t.a(256) & 255;
        }
    }

    static {
        field_r = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_s = "Change display name";
        field_v = new jn();
        field_x = "level: ";
        field_q = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
    }
}
