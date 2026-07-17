/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class kb extends pm {
    static String field_h;
    static sm field_f;
    static String[] field_g;
    static String[] field_j;
    static vn[] field_i;

    final String a(String param0, byte param1) {
        RuntimeException var3 = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_4_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param1 <= -94) {
                break L1;
              } else {
                field_i = null;
                break L1;
              }
            }
            if (((kb) this).a(param0, 2) == uc.field_b) {
              stackOut_4_0 = sa.field_Z;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("kb.B(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 41);
        }
        return stackIn_5_0;
    }

    kb(tb param0) {
        super(param0);
    }

    final rh a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        Object var4 = null;
        CharSequence var5 = null;
        CharSequence var6 = null;
        rh stackIn_4_0 = null;
        rh stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        rh stackOut_8_0 = null;
        rh stackOut_3_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 2) {
                break L1;
              } else {
                var4 = null;
                String discarded$2 = ((kb) this).a((String) null, (byte) 5);
                break L1;
              }
            }
            var5 = (CharSequence) (Object) param0;
            if (sj.a((byte) -101, var5)) {
              L2: {
                var6 = (CharSequence) (Object) param0;
                var3_int = ra.a(var6, 121);
                if (var3_int <= 0) {
                  break L2;
                } else {
                  if (130 < var3_int) {
                    break L2;
                  } else {
                    return mc.field_g;
                  }
                }
              }
              stackOut_8_0 = uc.field_b;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            } else {
              stackOut_3_0 = uc.field_b;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("kb.I(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param1 + 41);
        }
        return stackIn_9_0;
    }

    public static void d() {
        field_f = null;
        field_g = null;
        field_i = null;
        field_j = null;
        field_h = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "This password contains your Player Name, and would be easy to guess";
        field_g = new String[]{"Catch as many as you can before the time runs out!", "Get across the road!", "Swarm the entrance to the White House!", "", "Catch as many as you can before the time runs out!", "Herd the humans into the barn!", "Get across the laser maze as fast as you can!", ""};
        field_f = new sm();
    }
}
