/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mm extends kj {
    static int field_C;
    static String field_B;
    static String field_E;
    static vg field_A;

    public static void k(int param0) {
        field_B = null;
        field_E = null;
        if (param0 != 21006) {
            return;
        }
        field_A = null;
    }

    private mm(int param0, int param1, int param2, int param3, td param4, ag param5, pj param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
            this.field_y = param6;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "mm.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(String param0, byte param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 > 23) {
              L1: {
                if (param0 == null) {
                  break L1;
                } else {
                  if (param0.length() < wg.field_q) {
                    break L1;
                  } else {
                    if (param0.length() > na.field_b) {
                      break L1;
                    } else {
                      return false;
                    }
                  }
                }
              }
              stackIn_8_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var2);

            stackIn_11_1 = new StringBuilder().append("mm.G(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_8_0 != 0;
        }
    }

    final void a(int param0, int param1, byte param2, pj param3, int param4, int param5) {
        dd var7 = null;
        try {
            super.a(param0, param1, (byte) -120, param3, param4, param5);
            var7 = al.field_c;
            if (param2 > -91) {
                field_E = (String) null;
            }
            if (var7 != null && this.a((byte) 3, param1, param5, param0, param4)) {
                if (!(this.field_h instanceof wk)) {
                    if (!(var7.field_h instanceof wk)) {
                        return;
                    }
                    ((wk) ((Object) var7.field_h)).a(47, var7, (mm) (this));
                    al.field_c = null;
                    return;
                }
                ((wk) ((Object) this.field_h)).a(22, var7, (mm) (this));
                al.field_c = null;
                return;
            }
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "mm.J(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        field_B = "More suggestions";
        field_E = "members-only content";
        field_A = null;
    }
}
