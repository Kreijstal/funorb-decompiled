/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class c extends n {
    static ed field_n;
    private int field_r;
    static String[] field_q;
    static String field_p;
    static long[] field_t;
    static String field_o;
    static boolean field_u;
    private df field_s;

    final void a(byte[] param0, int param1, int param2, int param3) {
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var6 = EscapeVector.field_A;
        try {
          L0: {
            if (param1 == 19583) {
              var5_int = 0;
              L1: while (true) {
                if (param2 <= var5_int) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  fieldTemp$5 = this.field_m;
                  this.field_m = this.field_m + 1;
                  param0[param3 + var5_int] = (byte)(this.field_g[fieldTemp$5] + -this.field_s.a(1736563940));
                  var5_int++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var5);
            stackOut_7_1 = new StringBuilder().append("c.QA(");
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
          throw t.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void m(int param0) {
        if (!(null == bk.field_r)) {
            bk.field_r.a((byte) 33);
        }
        int var1 = -128 / ((param0 - 16) / 38);
    }

    final void l(int param0) {
        this.field_r = 8 * this.field_m;
        if (param0 != -17928) {
            c.n(-97);
        }
    }

    final void o(int param0) {
        int discarded$2 = 0;
        if (param0 != -3879) {
          discarded$2 = this.j(-61, -116);
          this.field_m = (this.field_r + 7) / 8;
          return;
        } else {
          this.field_m = (this.field_r + 7) / 8;
          return;
        }
    }

    public static void n(int param0) {
        field_t = null;
        field_o = null;
        field_p = null;
        field_q = null;
        if (param0 < 105) {
          c.m(19);
          field_n = null;
          return;
        } else {
          field_n = null;
          return;
        }
    }

    final void a(int param0, boolean param1) {
        int fieldTemp$2 = 0;
        if (!param1) {
          return;
        } else {
          fieldTemp$2 = this.field_m;
          this.field_m = this.field_m + 1;
          this.field_g[fieldTemp$2] = (byte)(this.field_s.a(1736563940) + param0);
          return;
        }
    }

    final static void p(int param0) {
        int fieldTemp$2 = 0;
        c var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = EscapeVector.field_A;
        try {
          L0: {
            var1 = om.field_c;
            L1: while (true) {
              if (!ea.c((byte) -115)) {
                if (param0 == 11197) {
                  break L0;
                } else {
                  c.p(-41);
                  return;
                }
              } else {
                var1.a(8, true);
                fieldTemp$2 = var1.field_m + 1;
                var1.field_m = var1.field_m + 1;
                var2 = fieldTemp$2;
                mf.a(param0 ^ -25858, var1);
                om.field_c.e(82, var1.field_m + -var2);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1_ref), "c.DB(" + param0 + ')');
        }
    }

    final void a(int[] param0, byte param1) {
        if (param1 < 80) {
            return;
        }
        try {
            this.field_s = new df(param0);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "c.RA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    c(int param0) {
        super(param0);
    }

    final int k(int param0) {
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        if (param0 != 8) {
          field_u = false;
          fieldTemp$4 = this.field_m;
          this.field_m = this.field_m + 1;
          return 255 & this.field_g[fieldTemp$4] + -this.field_s.a(1736563940);
        } else {
          fieldTemp$5 = this.field_m;
          this.field_m = this.field_m + 1;
          return 255 & this.field_g[fieldTemp$5] + -this.field_s.a(1736563940);
        }
    }

    final int j(int param0, int param1) {
        int incrementValue$0 = 0;
        int var6 = EscapeVector.field_A;
        int var3 = this.field_r >> -1442743357;
        int var4 = -(7 & this.field_r) + param1;
        this.field_r = this.field_r + param0;
        int var5 = 0;
        while (var4 < param0) {
            incrementValue$0 = var3;
            var3++;
            var5 = var5 + ((this.field_g[incrementValue$0] & ol.field_ab[var4]) << -var4 + param0);
            param0 = param0 - var4;
            var4 = 8;
        }
        if (var4 != param0) {
            var5 = var5 + (this.field_g[var3] >> var4 + -param0 & ol.field_ab[param0]);
        } else {
            var5 = var5 + (ol.field_ab[var4] & this.field_g[var3]);
        }
        return var5;
    }

    c(byte[] param0) {
        super(param0);
    }

    static {
        field_q = new String[]{"virtual", "virtual", "virtual", "virtual"};
        field_t = new long[32];
        field_o = "Waiting for fonts";
        field_p = "Go Back";
    }
}
