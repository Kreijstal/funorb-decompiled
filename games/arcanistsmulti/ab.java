/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ab extends wk {
    static boolean field_n;
    static String field_q;
    private int field_t;
    static kc field_p;
    static String field_r;
    private ug field_o;
    static String field_s;

    final static ho a(int param0, int param1, String param2) {
        ho var3 = null;
        RuntimeException var3_ref = null;
        ho stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        ho stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var3 = new ho(false);
              var3.field_e = param2;
              var3.field_a = param1;
              if (param0 == 0) {
                break L1;
              } else {
                ab.q(55);
                break L1;
              }
            }
            stackOut_2_0 = (ho) (var3);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3_ref);
            stackOut_4_1 = new StringBuilder().append("ab.I(").append(param0).append(',').append(param1).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final void a(byte[] param0, byte param1, int param2, int param3) {
        int fieldTemp$5 = 0;
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
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 108) {
                break L1;
              } else {
                this.r(-49);
                break L1;
              }
            }
            var5_int = 0;
            L2: while (true) {
              if (param3 <= var5_int) {
                break L0;
              } else {
                fieldTemp$5 = this.field_g;
                this.field_g = this.field_g + 1;
                param0[param2 + var5_int] = (byte)(this.field_j[fieldTemp$5] + -this.field_o.a(false));
                var5_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var5);
            stackOut_7_1 = new StringBuilder().append("ab.D(");
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
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void q(int param0) {
        field_r = null;
        field_p = null;
        field_s = null;
        if (param0 != 21657) {
            field_s = (String) null;
            field_q = null;
            return;
        }
        field_q = null;
    }

    final void b(int param0, int[] param1) {
        try {
            int var3_int = -46 / ((param0 - -16) / 57);
            this.field_o = new ug(param1);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "ab.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void r(int param0) {
        if (param0 != 0) {
            return;
        }
        this.field_g = (this.field_t - -7) / 8;
    }

    ab(int param0) {
        super(param0);
    }

    final void b(byte param0, int param1) {
        int fieldTemp$0 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_j[fieldTemp$0] = (byte)(param1 + this.field_o.a(false));
        if (param0 > -11) {
            this.field_t = -103;
        }
    }

    final int g(byte param0) {
        int var2 = 124 / ((param0 - -69) / 45);
        int fieldTemp$0 = this.field_g;
        this.field_g = this.field_g + 1;
        return 255 & this.field_j[fieldTemp$0] + -this.field_o.a(false);
    }

    final int d(int param0, int param1) {
        ho discarded$4 = null;
        int incrementValue$5 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        var3 = this.field_t >> 2083359267;
        var4 = -(7 & this.field_t) + 8;
        this.field_t = this.field_t + param1;
        var5 = 0;
        L0: while (true) {
          if (var4 >= param1) {
            L1: {
              if (var4 != param1) {
                var5 = var5 + (this.field_j[var3] >> -param1 + var4 & rg.field_d[param1]);
                break L1;
              } else {
                var5 = var5 + (rg.field_d[var4] & this.field_j[var3]);
                break L1;
              }
            }
            if (param0 != 28089) {
              var7 = (String) null;
              discarded$4 = ab.a(6, -10, (String) null);
              return var5;
            } else {
              return var5;
            }
          } else {
            incrementValue$5 = var3;
            var3++;
            var5 = var5 + ((this.field_j[incrementValue$5] & rg.field_d[var4]) << param1 - var4);
            param1 = param1 - var4;
            var4 = 8;
            continue L0;
          }
        }
    }

    final void p(int param0) {
        int discarded$0 = 0;
        this.field_t = 8 * this.field_g;
        if (param0 < 26) {
            discarded$0 = this.d(5, 58);
        }
    }

    ab(byte[] param0) {
        super(param0);
    }

    static {
        field_q = "Previous";
        field_r = "Tips";
        field_s = "Firstly, you must learn how to look around the battlefield. Practise using the 'Arrow keys' to scroll around.";
    }
}
