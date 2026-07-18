/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wh {
    private ad field_c;
    static ib field_b;
    private je field_a;
    private ad field_d;
    static int[] field_e;

    public static void a(int param0) {
        if (param0 != -18728) {
            field_b = null;
            field_b = null;
            field_e = null;
            return;
        }
        field_b = null;
        field_e = null;
    }

    final static void a(String[] args) {
        RuntimeException var2 = null;
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
        try {
          L0: {
            L1: {
              if (nf.field_F == null) {
                break L1;
              } else {
                nf.field_F.field_G.a(args, 560186724);
                break L1;
              }
            }
            if (sc.field_f == null) {
              break L0;
            } else {
              sc.field_f.field_H.a(args, 560186724);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("wh.D(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (args == null) {
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
          throw la.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + true + ')');
        }
    }

    final pi a(int param0, int param1) {
        pi var3 = null;
        byte[] var4 = null;
        var3 = (pi) ((wh) this).field_a.a((long)param0, (byte) 114);
        if (var3 != null) {
          return var3;
        } else {
          L0: {
            if (param1 < ~param0) {
              var4 = ((wh) this).field_d.b(255, param0, 1);
              break L0;
            } else {
              var4 = ((wh) this).field_c.b(255, 32767 & param0, 1);
              break L0;
            }
          }
          L1: {
            var3 = new pi();
            if (var4 != null) {
              var3.a(new gk(var4), true);
              break L1;
            } else {
              break L1;
            }
          }
          if (param0 >= 32768) {
            var3.e(0);
            ((wh) this).field_a.a((long)param0, (Object) (Object) var3, -92);
            return var3;
          } else {
            ((wh) this).field_a.a((long)param0, (Object) (Object) var3, -92);
            return var3;
          }
        }
    }

    final static void a(byte param0, le param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var9 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if ((3 & (param1.field_j | param1.field_k)) == 0) {
                break L1;
              } else {
                var2_int = 4 + -(3 & param1.field_k);
                var3 = -(3 & param1.field_j) + 4;
                var4 = var2_int + param1.field_k;
                var5 = new int[var4 * (param1.field_j - -var3)];
                var6 = var3 * var4 - -var2_int;
                var7 = 0;
                L2: while (true) {
                  if (param1.field_j <= var7) {
                    param1.field_k = param1.field_k + var2_int;
                    param1.field_j = param1.field_j + var3;
                    param1.field_q = param1.field_q - var3;
                    param1.field_r = param1.field_r - var2_int;
                    param1.field_s = var5;
                    break L1;
                  } else {
                    var8 = 0;
                    L3: while (true) {
                      if (param1.field_k <= var8) {
                        var6 = var6 + var2_int;
                        var7++;
                        continue L2;
                      } else {
                        int incrementValue$1 = var6;
                        var6++;
                        var5[incrementValue$1] = param1.field_s[var7 * param1.field_k - -var8];
                        var8++;
                        continue L3;
                      }
                    }
                  }
                }
              }
            }
            if (param0 < -66) {
              break L0;
            } else {
              wh.a(-77);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var2;
            stackOut_12_1 = new StringBuilder().append("wh.C(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw la.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
    }

    private wh() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new ib();
    }
}
