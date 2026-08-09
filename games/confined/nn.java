/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nn extends rk {
    int field_u;
    nn field_s;
    int field_m;
    int field_n;
    static fi field_q;
    int field_w;
    int field_r;
    static String field_v;
    static nf[] field_t;
    static bi field_o;
    static String[] field_p;

    final static al[] b(int param0) {
        if (param0 < 46) {
          return (al[]) null;
        } else {
          return new al[]{pi.field_T, tj.field_n, tk.field_f};
        }
    }

    public static void c(int param0) {
        if (param0 != -11650) {
          field_p = (String[]) null;
          field_p = null;
          field_t = null;
          field_q = null;
          field_o = null;
          field_v = null;
          return;
        } else {
          field_p = null;
          field_t = null;
          field_q = null;
          field_o = null;
          field_v = null;
          return;
        }
    }

    final static boolean a(mi param0, mi param1, mi param2, int param3) {
        RuntimeException var4 = null;
        mi var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
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
            if (!param0.b(0)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param0.a("commonui", 0)) {
                L1: {
                  if (param3 > 21) {
                    break L1;
                  } else {
                    var5 = (mi) null;
                    nn.a((mi) null, (mi) null, (mi) null, -51);
                    break L1;
                  }
                }
                L2: {
                  if (!param2.b(0)) {
                    break L2;
                  } else {
                    if (param2.a("commonui", 0)) {
                      L3: {
                        if (!param1.b(0)) {
                          break L3;
                        } else {
                          if (!param1.a("button.gif", 0)) {
                            break L3;
                          } else {
                            return true;
                          }
                        }
                      }
                      stackIn_16_0 = 0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      break L2;
                    }
                  }
                }
                stackIn_11_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var4);

            stackIn_19_1 = new StringBuilder().append("nn.B(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

            if (param2 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L6;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L6;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_20_0), stackIn_26_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            return stackIn_16_0 != 0;
          }
        }
    }

    nn(int param0, int param1, int param2, int param3, int param4) {
        this.field_n = param4;
        this.field_u = param0;
        this.field_r = param1;
        this.field_w = param3;
        this.field_m = param2;
    }

    static {
        field_q = new fi();
        field_v = "Fullscreen";
        field_p = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    }
}
