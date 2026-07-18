/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lm {
    static String field_d;
    static String field_a;
    static ta field_c;
    static jp[] field_e;
    static int field_b;
    private int[] field_f;

    final static boolean a(int param0, int param1) {
        if (param1 != 0) {
            field_e = null;
        }
        return param0 >= 2 ? true : false;
    }

    final static oh a(int param0, String[] param1) {
        oh var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        oh stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        oh stackOut_3_0 = null;
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
            var2 = new oh(false);
            var2.field_e = param1;
            if (param0 == -2079) {
              stackOut_3_0 = (oh) var2;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (oh) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2_ref;
            stackOut_5_1 = new StringBuilder().append("lm.A(").append(param0).append(',');
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
          throw qb.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_4_0;
    }

    public static void a() {
        field_d = null;
        field_e = null;
        field_c = null;
        field_a = null;
    }

    final static void a(int param0) {
        t.field_g = false;
        cg.field_l = false;
        int discarded$0 = 1;
        bd.a(param0);
        ka.field_l = ej.field_P;
        ik.field_g = ej.field_P;
    }

    final static boolean a(byte param0) {
        if (param0 != -10) {
            boolean discarded$0 = lm.a((byte) 35);
        }
        return null != pe.field_o ? true : false;
    }

    final int a(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          if (param1 < -68) {
            break L0;
          } else {
            lm.a(47);
            break L0;
          }
        }
        var3 = -1 + (((lm) this).field_f.length >> 1);
        var4 = var3 & param0;
        L1: while (true) {
          var5 = ((lm) this).field_f[var4 + var4 - -1];
          if (-1 == var5) {
            return -1;
          } else {
            if (param0 != ((lm) this).field_f[var4 + var4]) {
              var4 = var3 & var4 + 1;
              continue L1;
            } else {
              return var5;
            }
          }
        }
    }

    lm(int[] param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            var2_int = 1;
            L1: while (true) {
              if ((param0.length >> 1) + param0.length < var2_int) {
                ((lm) this).field_f = new int[var2_int + var2_int];
                var3 = 0;
                L2: while (true) {
                  if (var3 >= var2_int + var2_int) {
                    var3 = 0;
                    L3: while (true) {
                      if (param0.length <= var3) {
                        break L0;
                      } else {
                        var4 = param0[var3] & -1 + var2_int;
                        L4: while (true) {
                          if (((lm) this).field_f[var4 + (var4 - -1)] == -1) {
                            ((lm) this).field_f[var4 + var4] = param0[var3];
                            ((lm) this).field_f[var4 + (var4 - -1)] = var3;
                            var3++;
                            continue L3;
                          } else {
                            var4 = var4 - -1 & var2_int + -1;
                            continue L4;
                          }
                        }
                      }
                    }
                  } else {
                    ((lm) this).field_f[var3] = -1;
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
            stackOut_14_0 = (RuntimeException) var2;
            stackOut_14_1 = new StringBuilder().append("lm.<init>(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "<%0> has entered a game.";
        field_b = 4;
        field_a = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
    }
}
