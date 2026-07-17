/*
 * Decompiled by CFR-JS 0.4.0.
 */
class fb extends me {
    static String field_n;
    static cm field_h;
    static gh field_r;
    private long field_i;
    static java.applet.Applet field_o;
    static String[] field_j;
    private String field_m;
    static gh field_l;
    static String field_p;
    static String field_q;
    static String field_k;

    final static boolean a(int param0, int param1, String param2, int param3, int param4, int param5) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        wk[] var8 = null;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            L1: {
              if (520 <= oh.field_f) {
                if (620 > oh.field_f) {
                  if (param1 <= pi.field_c) {
                    if (pi.field_c <= param1 - -34) {
                      stackOut_8_0 = 1;
                      stackIn_10_0 = stackOut_8_0;
                      break L1;
                    } else {
                      stackOut_7_0 = 0;
                      stackIn_10_0 = stackOut_7_0;
                      break L1;
                    }
                  } else {
                    stackOut_5_0 = 0;
                    stackIn_10_0 = stackOut_5_0;
                    break L1;
                  }
                } else {
                  stackOut_3_0 = 0;
                  stackIn_10_0 = stackOut_3_0;
                  break L1;
                }
              } else {
                stackOut_1_0 = 0;
                stackIn_10_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var6_int = stackIn_10_0;
              if (var6_int == 0) {
                stackOut_12_0 = 1021128;
                stackIn_13_0 = stackOut_12_0;
                break L2;
              } else {
                stackOut_11_0 = 1044724;
                stackIn_13_0 = stackOut_11_0;
                break L2;
              }
            }
            var7 = stackIn_13_0;
            if (param5 == 12490) {
              L3: {
                var8 = pl.field_T;
                jm.a(param1, 34, var8, 1, 520, 100);
                if (param2 != null) {
                  ui.field_U.a(ke.a(param5 + -12448, param2), 570, param1 + (ui.field_U.field_U + 35) / 2, var7, -1);
                  break L3;
                } else {
                  break L3;
                }
              }
              stackOut_19_0 = var6_int;
              stackIn_20_0 = stackOut_19_0;
              break L0;
            } else {
              stackOut_14_0 = 0;
              stackIn_15_0 = stackOut_14_0;
              return stackIn_15_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var6;
            stackOut_21_1 = new StringBuilder().append("fb.E(").append(34).append(44).append(param1).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param2 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L4;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L4;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 44 + 100 + 44 + 520 + 44 + param5 + 41);
        }
        return stackIn_20_0 != 0;
    }

    final void a(gi param0, boolean param1) {
        try {
            param0.b(-28875, ((fb) this).field_i);
            if (param1) {
                field_q = null;
            }
            param0.a(((fb) this).field_m, (byte) -66);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "fb.D(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    dj a(byte param0) {
        if (param0 <= 47) {
            return null;
        }
        return ol.field_Sb;
    }

    fb(long param0, String param1) {
        try {
            ((fb) this).field_m = param1;
            ((fb) this).field_i = param0;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "fb.<init>(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public static void b(byte param0) {
        field_l = null;
        field_q = null;
        field_o = null;
        field_p = null;
        field_k = null;
        field_j = null;
        field_r = null;
        if (param0 > -111) {
          fb.b((byte) 119);
          field_n = null;
          field_h = null;
          return;
        } else {
          field_n = null;
          field_h = null;
          return;
        }
    }

    final static void b() {
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = SteelSentinels.field_G;
        try {
          L0: {
            var5 = qe.field_a;
            var1 = var5;
            var2 = 0;
            var3 = var5.length;
            L1: while (true) {
              if (var2 >= var3) {
                break L0;
              } else {
                int incrementValue$40 = var2;
                var2++;
                var5[incrementValue$40] = 0;
                int incrementValue$41 = var2;
                var2++;
                var5[incrementValue$41] = 0;
                int incrementValue$42 = var2;
                var2++;
                var5[incrementValue$42] = 0;
                int incrementValue$43 = var2;
                var2++;
                var5[incrementValue$43] = 0;
                int incrementValue$44 = var2;
                var2++;
                var5[incrementValue$44] = 0;
                int incrementValue$45 = var2;
                var2++;
                var5[incrementValue$45] = 0;
                int incrementValue$46 = var2;
                var2++;
                var5[incrementValue$46] = 0;
                int incrementValue$47 = var2;
                var2++;
                var5[incrementValue$47] = 0;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var1_ref, "fb.B(" + 0 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Day";
        field_j = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_p = "You can ask to join this game";
        field_q = "Return to game";
        field_k = "Options Menu";
    }
}
