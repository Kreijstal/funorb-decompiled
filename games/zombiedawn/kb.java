/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kb extends pm {
    static String field_h;
    static sm field_f;
    static String[] field_g;
    static String[] field_j;
    static vn[] field_i;

    final String a(String param0, byte param1) {
        RuntimeException var3 = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 <= -94) {
                break L1;
              } else {
                field_i = (vn[]) null;
                break L1;
              }
            }
            if (this.a(param0, 2) == uc.field_b) {
              stackIn_5_0 = sa.field_Z;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("kb.B(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        return stackIn_5_0;
    }

    kb(tb param0) {
        super(param0);
    }

    final rh a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        CharSequence var5 = null;
        CharSequence var6 = null;
        rh stackIn_4_0 = null;
        rh stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 2) {
                break L1;
              } else {
                var4 = (String) null;
                this.a((String) null, (byte) 5);
                break L1;
              }
            }
            var5 = (CharSequence) ((Object) param0);
            if (sj.a((byte) -101, var5)) {
              L2: {
                var6 = (CharSequence) ((Object) param0);
                var3_int = ra.a(var6, 121);
                if ((var3_int ^ -1) >= -1) {
                  break L2;
                } else {
                  if (130 < var3_int) {
                    break L2;
                  } else {
                    return mc.field_g;
                  }
                }
              }
              stackIn_9_0 = uc.field_b;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = uc.field_b;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("kb.I(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_9_0;
        }
    }

    public static void d(int param0) {
        field_f = null;
        field_g = null;
        field_i = null;
        if (param0 <= 60) {
            return;
        }
        field_j = null;
        field_h = null;
    }

    static {
        field_h = "This password contains your Player Name, and would be easy to guess";
        field_g = new String[]{"Catch as many as you can before the time runs out!", "Get across the road!", "Swarm the entrance to the White House!", "", "Catch as many as you can before the time runs out!", "Herd the humans into the barn!", "Get across the laser maze as fast as you can!", ""};
        field_f = new sm();
    }
}
