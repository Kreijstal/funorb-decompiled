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
        int fieldTemp$0 = ((pl) this).field_p;
        ((pl) this).field_p = ((pl) this).field_p + 1;
        ((pl) this).field_n[fieldTemp$0] = (byte)(param0 + ((pl) this).field_t.a(jg.a(param1, 264)));
        if (param1 != 8) {
            ((pl) this).i((byte) 39);
        }
    }

    pl(byte[] param0) {
        super(param0);
    }

    final int b(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Sumoblitz.field_L ? 1 : 0;
        var3 = ((pl) this).field_w >> 3;
        var4 = 8 - (7 & ((pl) this).field_w);
        if (param1 >= -85) {
          return 116;
        } else {
          var5 = 0;
          ((pl) this).field_w = ((pl) this).field_w + param0;
          L0: while (true) {
            if (var4 >= param0) {
              L1: {
                if (var4 != param0) {
                  var5 = var5 + (((pl) this).field_n[var3] >> var4 - param0 & am.field_z[param0]);
                  break L1;
                } else {
                  var5 = var5 + (am.field_z[var4] & ((pl) this).field_n[var3]);
                  break L1;
                }
              }
              return var5;
            } else {
              int incrementValue$1 = var3;
              var3++;
              var5 = var5 + ((((pl) this).field_n[incrementValue$1] & am.field_z[var4]) << param0 + -var4);
              param0 = param0 - var4;
              var4 = 8;
              continue L0;
            }
          }
        }
    }

    final void a(byte[] param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var5_int = param1;
            L1: while (true) {
              if (param3 <= var5_int) {
                break L0;
              } else {
                int fieldTemp$5 = ((pl) this).field_p;
                ((pl) this).field_p = ((pl) this).field_p + 1;
                param0[var5_int - -param2] = (byte)(((pl) this).field_n[fieldTemp$5] + -((pl) this).field_t.a(256));
                var5_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("pl.I(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void i(byte param0) {
        int var2 = -18 / ((-28 - param0) / 59);
        ((pl) this).field_w = 8 * ((pl) this).field_p;
    }

    final void h(byte param0) {
        if (param0 != -63) {
            return;
        }
        ((pl) this).field_p = (((pl) this).field_w + 7) / 8;
    }

    final static void a(java.awt.Component param0, int param1) {
        try {
            if (param1 != 7) {
                Object var3 = null;
                pl.a((java.awt.Component) null, 93);
            }
            param0.removeMouseListener((java.awt.event.MouseListener) (Object) wk.field_h);
            param0.removeMouseMotionListener((java.awt.event.MouseMotionListener) (Object) wk.field_h);
            param0.removeFocusListener((java.awt.event.FocusListener) (Object) wk.field_h);
            b.field_a = 0;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "pl.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(byte param0, int[] param1) {
        try {
            ((pl) this).field_t = new ok(param1);
            int var3_int = 41 % ((param0 - 21) / 39);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "pl.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void j(int param0) {
        field_s = null;
        field_q = null;
        field_x = null;
        field_v = null;
        field_r = null;
    }

    pl(int param0) {
        super(param0);
    }

    final int i(int param0) {
        if (param0 != 255) {
          ((pl) this).field_w = 51;
          int fieldTemp$4 = ((pl) this).field_p;
          ((pl) this).field_p = ((pl) this).field_p + 1;
          return ((pl) this).field_n[fieldTemp$4] - ((pl) this).field_t.a(256) & 255;
        } else {
          int fieldTemp$5 = ((pl) this).field_p;
          ((pl) this).field_p = ((pl) this).field_p + 1;
          return ((pl) this).field_n[fieldTemp$5] - ((pl) this).field_t.a(256) & 255;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_s = "Change display name";
        field_v = new jn();
        field_x = "level: ";
        field_q = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
    }
}
