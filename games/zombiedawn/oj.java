/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oj {
    static vn field_f;
    static tl field_d;
    private float field_a;
    private float field_c;
    private float field_e;
    private float field_b;
    static String field_g;

    public static void a() {
        field_d = null;
        field_g = null;
        field_f = null;
    }

    final static of b(int param0) {
        if (hc.field_b != null) {
          if (param0 != 0) {
            return null;
          } else {
            return hc.field_b;
          }
        } else {
          hc.field_b = new of();
          hc.field_b.a(param0 ^ 4, ia.field_e);
          hc.field_b.field_t = 14;
          hc.field_b.field_q = 0;
          hc.field_b.field_e = 5;
          hc.field_b.field_i = 7697781;
          hc.field_b.field_k = 2763306;
          hc.field_b.field_h = 4;
          hc.field_b.field_c = ii.field_a;
          hc.field_b.field_r = 6;
          if (param0 != 0) {
            return null;
          } else {
            return hc.field_b;
          }
        }
    }

    final void a(vn param0, int param1, int param2, int param3, int param4, int param5) {
        try {
            param0.b((int)((oj) this).field_a + param5 + -16, -16 + ((int)((oj) this).field_b + param2), param1);
            if (param4 > -92) {
                of discarded$0 = oj.b(-16);
            }
            param0.e(-16 + param5 + (int)((oj) this).field_a, (int)((oj) this).field_b + (param2 - 16), param3);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "oj.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param1 == 18463) {
          ((oj) this).field_a = ((oj) this).field_a + ((oj) this).field_c;
          ((oj) this).field_b = ((oj) this).field_b + ((oj) this).field_e;
          if (((oj) this).field_c == 0.0f) {
            if (0.0f != ((oj) this).field_e) {
              if (!dj.field_e.field_H.a((int)(((oj) this).field_a + (float)param2), (int)(((oj) this).field_b + (float)param0), 82)) {
                ((oj) this).field_e = 0.0f;
                ((oj) this).field_c = 0.0f;
                return;
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            if (!dj.field_e.field_H.a((int)(((oj) this).field_a + (float)param2), (int)(((oj) this).field_b + (float)param0), 82)) {
              ((oj) this).field_e = 0.0f;
              ((oj) this).field_c = 0.0f;
              return;
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    oj(float param0, float param1) {
        ((oj) this).field_c = param0;
        ((oj) this).field_e = param1;
        ((oj) this).field_b = 0.0f;
        ((oj) this).field_a = 0.0f;
    }

    final static lp a(int param0, dj param1, int param2, dj param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          if (ph.a(param2, 31043, param0, param3)) {
            return null;
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5;
            stackOut_4_1 = new StringBuilder().append("oj.D(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L0;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L0;
            }
          }
          L1: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L1;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L1;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + 0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Service unavailable";
    }
}
