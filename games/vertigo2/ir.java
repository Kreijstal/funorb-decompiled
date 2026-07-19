/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ir {
    static ba field_a;
    static tj field_c;
    static int field_d;
    static int[] field_e;
    static String field_b;
    static int field_f;

    public static void a(boolean param0) {
        field_e = null;
        field_b = null;
        field_a = null;
        if (param0) {
            field_e = (int[]) null;
            field_c = null;
            return;
        }
        field_c = null;
    }

    final static boolean a(int param0, r param1, r param2, r param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          L0: {
            if (!param2.b(0)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param2.c("commonui", 0)) {
                L1: {
                  if (!param1.b(0)) {
                    break L1;
                  } else {
                    if (param1.c("commonui", 0)) {
                      L2: {
                        var4_int = -20 % ((param0 - 12) / 63);
                        if (!param3.b(0)) {
                          break L2;
                        } else {
                          if (param3.c("button.gif", 0)) {
                            stackOut_15_0 = 1;
                            stackIn_16_0 = stackOut_15_0;
                            decompiledRegionSelector0 = 3;
                            break L0;
                          } else {
                            break L2;
                          }
                        }
                      }
                      stackOut_13_0 = 0;
                      stackIn_14_0 = stackOut_13_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var4);
            stackOut_17_1 = new StringBuilder().append("ir.E(").append(param0).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L3;
            }
          }
          L4: {
            stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L4;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L4;
            }
          }
          L5: {
            stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param3 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L5;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L5;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0 != 0;
            } else {
              return stackIn_16_0 != 0;
            }
          }
        }
    }

    final static void a(int param0, byte param1) {
        boolean discarded$8 = false;
        boolean discarded$9 = false;
        r var3 = null;
        L0: {
          rm.field_B = (param0 & 63) >> 1960863524;
          oa.field_p = param0 >> 2089011394 & 3;
          if ((rm.field_B ^ -1) < -3) {
            rm.field_B = 2;
            break L0;
          } else {
            break L0;
          }
        }
        mf.field_b = param0 & 3;
        if (2 >= oa.field_p) {
          if (param1 == -65) {
            if ((mf.field_b ^ -1) < -3) {
              mf.field_b = 2;
              return;
            } else {
              return;
            }
          } else {
            var3 = (r) null;
            discarded$8 = ir.a(50, (r) null, (r) null, (r) null);
            if ((mf.field_b ^ -1) < -3) {
              mf.field_b = 2;
              return;
            } else {
              return;
            }
          }
        } else {
          oa.field_p = 2;
          if (param1 != -65) {
            var3 = (r) null;
            discarded$9 = ir.a(50, (r) null, (r) null, (r) null);
            if ((mf.field_b ^ -1) >= -3) {
              return;
            } else {
              mf.field_b = 2;
              return;
            }
          } else {
            if ((mf.field_b ^ -1) < -3) {
              mf.field_b = 2;
              return;
            } else {
              return;
            }
          }
        }
    }

    final static void a(int param0, String param1) {
        if (param0 != -8957) {
          field_c = (tj) null;
          System.out.println("Error: " + mr.a("%0a", (byte) -48, "\n", param1));
          return;
        } else {
          System.out.println("Error: " + mr.a("%0a", (byte) -48, "\n", param1));
          return;
        }
    }

    final static void a(String param0, int param1, String param2, int param3, int param4) {
        try {
            dj.field_d.field_Fb = dj.field_d.field_Fb + ui.field_b.field_Fb;
            dj.field_d.field_S = param2;
            dj.field_d.field_J = param0;
            dj.field_d.field_A = param1;
            ui.field_b.field_wb = ui.field_b.field_wb + ui.field_b.field_Fb;
            ui.field_b.field_Fb = param3;
            dj.field_d.field_Fb = dj.field_d.field_Fb - ui.field_b.field_Fb;
            if (param4 != 0) {
                ir.a(true);
            }
            ui.field_b.field_wb = ui.field_b.field_wb - ui.field_b.field_Fb;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "ir.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_a = new ba();
        field_c = new tj();
        field_e = new int[]{7};
        field_f = 16777215;
        field_d = 0;
        field_b = "This option cannot be combined with the current '<%0>' setting.";
    }
}
