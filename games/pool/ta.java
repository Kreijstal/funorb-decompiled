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

    final static void a(byte param0, int param1, int param2, int param3) {
        tm.field_f = param3;
        vn.field_c = param2;
        ch.field_H = param1;
        int var4 = 5 / ((param0 - -30) / 63);
    }

    final static void a(int param0) {
        L0: {
          if (d.field_d != null) {
            d.field_d.k(17);
            break L0;
          } else {
            break L0;
          }
        }
        tg.field_a = new jp();
        if (param0 != -984040272) {
          field_c = 99;
          tn.field_n.d(tg.field_a, param0 + 984040302);
          return;
        } else {
          tn.field_n.d(tg.field_a, param0 + 984040302);
          return;
        }
    }

    public static void b(int param0) {
        wc discarded$2 = null;
        field_h = null;
        field_a = null;
        field_g = null;
        if (param0 != 24470) {
          discarded$2 = ta.a(false, -31);
          field_e = null;
          field_d = (dd[][]) null;
          field_b = null;
          field_i = null;
          return;
        } else {
          field_e = null;
          field_d = (dd[][]) null;
          field_b = null;
          field_i = null;
          return;
        }
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
                  stackOut_9_0 = (int[]) (var3);
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  var8 = param0[var7];
                  var9 = param0[var7 - -1];
                  var10 = var8 - var4;
                  var11 = var6 >> -984040272 & 255;
                  var12 = var6 >> -1559529848 & 255;
                  var13 = var6 & 255;
                  var14 = (var9 & 16711680) >> -760347472;
                  var15 = (var9 & 65280) >> -992699352;
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
                      var3[var5] = md.a((var13 * var17 + var18 * var16) / var10, md.a((var15 * var18 + var12 * var17) / var10 << 24828808, (var18 * var14 + var11 * var17) / var10 << -1559246704));
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
            stackOut_11_0 = (RuntimeException) (var2);
            stackOut_11_1 = new StringBuilder().append("ta.E(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        return stackIn_10_0;
    }

    final static wc a(boolean param0, int param1) {
        wc var2 = null;
        wc stackIn_1_0 = null;
        wc stackIn_2_0 = null;
        wc stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        wc stackOut_0_0 = null;
        wc stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        wc stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          var2 = new wc(true);
          stackOut_0_0 = (wc) (var2);
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param0) {
            stackOut_2_0 = (wc) ((Object) stackIn_2_0);
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = (wc) ((Object) stackIn_1_0);
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        stackIn_3_0.field_e = stackIn_3_1 != 0;
        if (param1 != -30914) {
          field_g = (tq) null;
          return var2;
        } else {
          return var2;
        }
    }

    final static kl a(int param0, byte[] param1) {
        kl var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        kl stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        kl stackOut_5_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (param1 != null) {
              L1: {
                var2 = new kl(param1, el.field_I, ih.field_d, pd.field_a, rc.field_f, ma.field_h, v.field_b);
                if (param0 == 16908) {
                  break L1;
                } else {
                  field_f = -3;
                  break L1;
                }
              }
              sh.h(-1);
              stackOut_5_0 = (kl) (var2);
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var2_ref);
            stackOut_7_1 = new StringBuilder().append("ta.G(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
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
          throw wm.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (kl) ((Object) stackIn_2_0);
        } else {
          return stackIn_6_0;
        }
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        if (param6 < param13) {
          if (param13 < param1) {
            tl.a(param10, param13, param6, param15, param3, param11, param14, param2, param7, param5, (byte) -49, param4, param12, param9, param1, param8, qh.field_d);
            if (param0 > -124) {
              field_i = (ko) null;
              return;
            } else {
              return;
            }
          } else {
            if (param6 >= param1) {
              tl.a(param3, param6, param1, param10, param15, param2, param11, param14, param12, param9, (byte) -49, param7, param4, param8, param13, param5, qh.field_d);
              if (param0 > -124) {
                field_i = (ko) null;
                return;
              } else {
                return;
              }
            } else {
              tl.a(param15, param1, param6, param10, param3, param14, param11, param2, param4, param8, (byte) -49, param7, param12, param9, param13, param5, qh.field_d);
              if (param0 > -124) {
                field_i = (ko) null;
                return;
              } else {
                return;
              }
            }
          }
        } else {
          if (param6 < param1) {
            tl.a(param3, param6, param13, param15, param10, param2, param14, param11, param12, param9, (byte) -49, param4, param7, param5, param1, param8, qh.field_d);
            if (param0 > -124) {
              field_i = (ko) null;
              return;
            } else {
              return;
            }
          } else {
            if (param13 >= param1) {
              tl.a(param10, param13, param1, param3, param15, param11, param2, param14, param7, param5, (byte) -49, param12, param4, param8, param6, param9, qh.field_d);
              if (param0 <= -124) {
                return;
              } else {
                field_i = (ko) null;
                return;
              }
            } else {
              tl.a(param15, param1, param13, param3, param10, param14, param2, param11, param4, param8, (byte) -49, param12, param7, param5, param6, param9, qh.field_d);
              if (param0 <= -124) {
                return;
              } else {
                field_i = (ko) null;
                return;
              }
            }
          }
        }
    }

    static {
        field_a = new nl();
        field_i = new ko();
    }
}
