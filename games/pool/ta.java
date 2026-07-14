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
          tn.field_n.d((ei) (Object) tg.field_a, param0 + 984040302);
          return;
        } else {
          tn.field_n.d((ei) (Object) tg.field_a, param0 + 984040302);
          return;
        }
    }

    public static void b(int param0) {
        field_h = null;
        field_a = null;
        field_g = null;
        if (param0 != 24470) {
          wc discarded$2 = ta.a(false, -31);
          field_e = null;
          field_d = null;
          field_b = null;
          field_i = null;
          return;
        } else {
          field_e = null;
          field_d = null;
          field_b = null;
          field_i = null;
          return;
        }
    }

    final static int[] a(int[] param0, int param1) {
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
        if (!((param0.length & 1) == 0)) {
            throw new IllegalArgumentException("Must have an even number of arguments or array elements.");
        }
        int var2 = param0[param0.length + -2];
        int[] var3 = new int[var2];
        int var4 = param0[0];
        int var5 = var4;
        int var6 = param0[1];
        for (var7 = 2; var7 < param0.length; var7 += 2) {
            var8 = param0[var7];
            var9 = param0[var7 - -1];
            var10 = var8 - var4;
            var11 = var6 >> -984040272 & 255;
            var12 = var6 >> -1559529848 & 255;
            var13 = var6 & 255;
            var14 = (var9 & 16711680) >> -760347472;
            var15 = (var9 & 65280) >> -992699352;
            var16 = var9 & 255;
            while (var8 > var5) {
                var17 = -var5 + var8;
                var18 = var5 - var4;
                var3[var5] = md.a((var13 * var17 + var18 * var16) / var10, md.a((var15 * var18 + var12 * var17) / var10 << 24828808, (var18 * var14 + var11 * var17) / var10 << -1559246704));
                var5++;
            }
            var4 = var8;
            var6 = var9;
        }
        var8 = -108 % ((-60 - param1) / 59);
        return var3;
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
          stackOut_0_0 = (wc) var2;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param0) {
            stackOut_2_0 = (wc) (Object) stackIn_2_0;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = (wc) (Object) stackIn_1_0;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        stackIn_3_0.field_e = stackIn_3_1 != 0;
        if (param1 != -30914) {
          field_g = null;
          return var2;
        } else {
          return var2;
        }
    }

    final static kl a(int param0, byte[] param1) {
        kl var2 = null;
        if (param1 != null) {
          var2 = new kl(param1, el.field_I, ih.field_d, pd.field_a, rc.field_f, ma.field_h, v.field_b);
          if (param0 != 16908) {
            field_f = -3;
            sh.h(-1);
            return var2;
          } else {
            sh.h(-1);
            return var2;
          }
        } else {
          return null;
        }
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        if (param6 < param13) {
          if (param13 < param1) {
            tl.a(param10, param13, param6, param15, param3, param11, param14, param2, param7, param5, (byte) -49, param4, param12, param9, param1, param8, qh.field_d);
            if (param0 > -124) {
              field_i = null;
              return;
            } else {
              return;
            }
          } else {
            if (param6 >= param1) {
              tl.a(param3, param6, param1, param10, param15, param2, param11, param14, param12, param9, (byte) -49, param7, param4, param8, param13, param5, qh.field_d);
              if (param0 > -124) {
                field_i = null;
                return;
              } else {
                return;
              }
            } else {
              tl.a(param15, param1, param6, param10, param3, param14, param11, param2, param4, param8, (byte) -49, param7, param12, param9, param13, param5, qh.field_d);
              if (param0 > -124) {
                field_i = null;
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
              field_i = null;
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
                field_i = null;
                return;
              }
            } else {
              tl.a(param15, param1, param13, param3, param10, param14, param2, param11, param4, param8, (byte) -49, param12, param7, param5, param6, param9, qh.field_d);
              if (param0 <= -124) {
                return;
              } else {
                field_i = null;
                return;
              }
            }
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
