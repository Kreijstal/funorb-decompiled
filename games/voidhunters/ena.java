/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ena extends rqa {
    static dja field_p;
    static int field_q;
    static String[] field_o;
    static String field_r;

    public static void a() {
        field_o = null;
        field_r = null;
        field_p = null;
    }

    final static void a(int param0, float param1, int param2, int param3, int param4) {
        if (li.field_i) {
          if (lfa.field_j) {
            og.field_r.a(param4 | -16777216, Math.max(1, (int)param1), param3, param0, (byte) -123);
            if (param2 >= -16) {
              field_p = null;
              return;
            } else {
              return;
            }
          } else {
            if (param2 < -16) {
              return;
            } else {
              field_p = null;
              return;
            }
          }
        } else {
          dma.f(param3, param0, (int)param1, param4);
          if (param2 < -16) {
            return;
          } else {
            field_p = null;
            return;
          }
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 <= -119) {
                break L1;
              } else {
                var4 = null;
                nc discarded$2 = ((ena) this).a((nc[]) null, 79);
                break L1;
              }
            }
            stackOut_2_0 = new nc((Object) (Object) frb.a(112, 119));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("ena.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0;
    }

    ena(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = (dja) (Object) new ecb();
        field_q = 3;
        field_o = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_r = "Missile scrambler";
    }
}
