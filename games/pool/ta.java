/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ta {
    static gl field_h;
    static nl field_a;
    static vh[] field_b;
    static dd field_e;
    static int field_c;
    static ko field_i;
    static dd[][] field_d;
    static int field_f;
    static tq field_g;

    final static void a() {
        tm.field_f = 13421772;
        vn.field_c = 4;
        ch.field_H = 3;
        int var4 = -5;
    }

    final static void a(int param0) {
        if (!(d.field_d == null)) {
            d.field_d.k(17);
        }
        tg.field_a = new jp();
        tn.field_n.d((ei) (Object) tg.field_a, 30);
    }

    public static void b() {
        field_h = null;
        field_a = null;
        field_g = null;
        field_e = null;
        field_d = null;
        field_b = null;
        field_i = null;
    }

    final static int[] a(int[] param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int[] stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_9_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if ((param0.length & 1) != 0) {
              throw new IllegalArgumentException("Must have an even number of arguments or array elements.");
            } else {
              var2_int = param0[param0.length + -2];
              var3 = new int[var2_int];
              var4 = param0[0];
              var5 = var4;
              var6 = param0[1];
              var7 = 2;
              L1: while (true) {
                if (var7 >= param0.length) {
                  var8 = -108 % ((-60 - param1) / 59);
                  stackOut_9_0 = (int[]) var3;
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  var8 = param0[var7];
                  var9 = param0[var7 - -1];
                  var10 = var8 - var4;
                  var11 = var6 >> 16 & 255;
                  var12 = var6 >> 8 & 255;
                  var13 = var6 & 255;
                  var14 = (var9 & 16711680) >> 16;
                  var15 = (var9 & 65280) >> 8;
                  var16 = var9 & 255;
                  L2: while (true) {
                    if (var8 <= var5) {
                      var4 = var8;
                      var6 = var9;
                      var7 += 2;
                      continue L1;
                    } else {
                      var17 = -var5 + var8;
                      var18 = var5 - var4;
                      var3[var5] = md.a((var13 * var17 + var18 * var16) / var10, md.a((var15 * var18 + var12 * var17) / var10 << 8, (var18 * var14 + var11 * var17) / var10 << 16));
                      var5++;
                      continue L2;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var2;
            stackOut_11_1 = new StringBuilder().append("ta.E(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ')');
        }
        return stackIn_10_0;
    }

    final static wc a(boolean param0) {
        wc var2 = new wc(true);
        var2.field_e = param0 ? true : false;
        return var2;
    }

    final static kl a(int param0, byte[] param1) {
        kl var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        kl stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        kl stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1 != null) {
              var2 = new kl(param1, el.field_I, ih.field_d, pd.field_a, rc.field_f, ma.field_h, v.field_b);
              sh.h(-1);
              stackOut_3_0 = (kl) var2;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (kl) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2_ref;
            stackOut_5_1 = new StringBuilder().append("ta.G(").append(16908).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_4_0;
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        if (param6 < param13) {
          if (param13 >= param1) {
            if (param6 < param1) {
              tl.a(param15, param1, param6, param10, param3, param14, param11, param2, param4, param8, (byte) -49, param7, param12, param9, param13, param5, qh.field_d);
              return;
            } else {
              tl.a(param3, param6, param1, param10, param15, param2, param11, param14, param12, param9, (byte) -49, param7, param4, param8, param13, param5, qh.field_d);
              return;
            }
          } else {
            tl.a(param10, param13, param6, param15, param3, param11, param14, param2, param7, param5, (byte) -49, param4, param12, param9, param1, param8, qh.field_d);
            return;
          }
        } else {
          if (param6 >= param1) {
            if (param13 < param1) {
              tl.a(param15, param1, param13, param3, param10, param14, param2, param11, param4, param8, (byte) -49, param12, param7, param5, param6, param9, qh.field_d);
              return;
            } else {
              tl.a(param10, param13, param1, param3, param15, param11, param2, param14, param7, param5, (byte) -49, param12, param4, param8, param6, param9, qh.field_d);
              return;
            }
          } else {
            tl.a(param3, param6, param13, param15, param10, param2, param14, param11, param12, param9, (byte) -49, param4, param7, param5, param1, param8, qh.field_d);
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new nl();
        field_i = new ko();
    }
}
