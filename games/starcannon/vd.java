/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vd extends hh {
    static String[] field_h;
    private String field_k;
    private String field_i;
    static String[] field_f;
    static String field_e;
    static long[] field_g;
    static int field_j;

    public static void a(int param0) {
        field_h = null;
        field_e = null;
        field_g = null;
        field_f = null;
    }

    final s b(byte param0) {
        if (param0 != 1) {
            field_g = null;
            return j.field_d;
        }
        return j.field_d;
    }

    vd(String param0, String param1) {
        try {
            ((vd) this).field_k = param0;
            ((vd) this).field_i = param1;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "vd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, rb param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              param1.a(false, ((vd) this).field_k);
              param1.a((byte) -86, ((vd) this).field_i);
              if (param0 == 69) {
                break L1;
              } else {
                field_g = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("vd.B(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new String[]{"Defend the solar system on Easy mode", "Defeat the alien fleet on Medium mode", "Destroy the alien homeworld on Medium mode", "Defeat the alien fleet on Hard mode", "Destroy the alien homeworld on Hard mode", "Defeat the alien revenge fleet", "Max out side and back guns", "Destroy 10 cruisers", "Destroy 30 cruisers", "Destroy 50 interceptors", "Destroy 150 interceptors", "Navigate through the solar system without firing a shot", "Score 50,000 Points", "Score 100,000 Points", "Score 200,000 Points"};
        field_g = new long[32];
    }
}
