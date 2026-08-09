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
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param2.b(0)) {
              stackIn_4_0 = 0;
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
                            stackIn_16_0 = 1;
                            decompiledRegionSelector0 = 3;
                            break L0;
                          } else {
                            break L2;
                          }
                        }
                      }
                      stackIn_14_0 = 0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                stackIn_9_0 = 0;
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
            stackIn_19_0 = (RuntimeException) (var4);

            stackIn_19_1 = new StringBuilder().append("ir.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L3;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param2 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L4;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

            if (param3 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L5;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_20_0), stackIn_26_2 + ')');
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
        r var3;
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
            ir.a(50, (r) null, (r) null, (r) null);
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
            ir.a(50, (r) null, (r) null, (r) null);
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
