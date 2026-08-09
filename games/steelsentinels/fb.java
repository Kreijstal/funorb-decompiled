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
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param4 <= oh.field_f) {
                if (param3 + param4 > oh.field_f) {
                  if (param1 <= pi.field_c) {
                    if (pi.field_c <= param1 - -param0) {
                      stackIn_10_0 = 1;
                      break L1;
                    } else {
                      stackIn_10_0 = 0;
                      break L1;
                    }
                  } else {
                    stackIn_10_0 = 0;
                    break L1;
                  }
                } else {
                  stackIn_10_0 = 0;
                  break L1;
                }
              } else {
                stackIn_10_0 = 0;
                break L1;
              }
            }
            L2: {
              var6_int = stackIn_10_0;
              if (var6_int == 0) {
                stackIn_13_0 = 1021128;
                break L2;
              } else {
                stackIn_13_0 = 1044724;
                break L2;
              }
            }
            var7 = stackIn_13_0;
            if (param5 == 12490) {
              L3: {
                var8 = pl.field_T;
                jm.a(param1, param0, var8, 1, param4, param3);
                if (param2 != null) {
                  ui.field_U.a(ke.a(param5 + -12448, param2), param4 - -(param3 / 2), param1 + (ui.field_U.field_U + (param0 - -1)) / 2, var7, -1);
                  break L3;
                } else {
                  break L3;
                }
              }
              stackIn_20_0 = var6_int;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_15_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var6);

            stackIn_23_1 = new StringBuilder().append("fb.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L4;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L4;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_15_0 != 0;
        } else {
          return stackIn_20_0 != 0;
        }
    }

    final void a(gi param0, boolean param1) {
        try {
            param0.b(-28875, this.field_i);
            if (param1) {
                field_q = (String) null;
            }
            param0.a(this.field_m, (byte) -66);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "fb.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    dj a(byte param0) {
        if (param0 <= 47) {
            return (dj) null;
        }
        return ol.field_Sb;
    }

    fb(long param0, String param1) {
        try {
            this.field_m = param1;
            this.field_i = param0;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "fb.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
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

    final static void b(int param0) {
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = SteelSentinels.field_G;
        try {
          L0: {
            var5 = qe.field_a;
            var1 = var5;
            var2 = param0;
            var3 = var5.length;
            L1: while (true) {
              if (var2 >= var3) {
                break L0;
              } else {
                incrementValue$16 = var2;
                var2++;
                var5[incrementValue$16] = 0;
                incrementValue$17 = var2;
                var2++;
                var5[incrementValue$17] = 0;
                incrementValue$18 = var2;
                var2++;
                var5[incrementValue$18] = 0;
                incrementValue$19 = var2;
                var2++;
                var5[incrementValue$19] = 0;
                incrementValue$20 = var2;
                var2++;
                var5[incrementValue$20] = 0;
                incrementValue$21 = var2;
                var2++;
                var5[incrementValue$21] = 0;
                incrementValue$22 = var2;
                var2++;
                var5[incrementValue$22] = 0;
                incrementValue$23 = var2;
                var2++;
                var5[incrementValue$23] = 0;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var1_ref), "fb.B(" + param0 + ')');
        }
    }

    static {
        field_n = "Day";
        field_j = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_p = "You can ask to join this game";
        field_q = "Return to game";
        field_k = "Options Menu";
    }
}
