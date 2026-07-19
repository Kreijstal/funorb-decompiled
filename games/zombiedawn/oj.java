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

    public static void a(int param0) {
        field_d = null;
        field_g = null;
        if (param0 != -14311) {
            return;
        }
        field_f = null;
    }

    final static of b(int param0) {
        if (hc.field_b != null) {
          if (param0 != 0) {
            return (of) null;
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
            return (of) null;
          } else {
            return hc.field_b;
          }
        }
    }

    final void a(vn param0, int param1, int param2, int param3, int param4, int param5) {
        of discarded$0 = null;
        try {
            param0.b((int)this.field_a + param5 + -16, -16 + ((int)this.field_b + param2), param1);
            if (param4 > -92) {
                discarded$0 = oj.b(-16);
            }
            param0.e(-16 + param5 + (int)this.field_a, (int)this.field_b + (param2 - 16), param3);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "oj.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param1 == 18463) {
          this.field_a = this.field_a + this.field_c;
          this.field_b = this.field_b + this.field_e;
          if (this.field_c == 0.0f) {
            if (0.0f != this.field_e) {
              if (!dj.field_e.field_H.a((int)(this.field_a + (float)param2), (int)(this.field_b + (float)param0), 82)) {
                this.field_e = 0.0f;
                this.field_c = 0.0f;
                return;
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            if (!dj.field_e.field_H.a((int)(this.field_a + (float)param2), (int)(this.field_b + (float)param0), 82)) {
              this.field_e = 0.0f;
              this.field_c = 0.0f;
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
        this.field_c = param0;
        this.field_e = param1;
        this.field_b = 0.0f;
        this.field_a = 0.0f;
    }

    final static lp a(int param0, dj param1, int param2, dj param3, int param4) {
        RuntimeException var5 = null;
        lp stackIn_5_0 = null;
        lp stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        lp stackOut_6_0 = null;
        lp stackOut_4_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (ph.a(param2, 31043, param0, param3)) {
              if (param4 == 0) {
                stackOut_6_0 = oh.a(param4 + 29506, param1.a((byte) 51, param2, param0));
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackOut_4_0 = (lp) null;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var5);
            stackOut_8_1 = new StringBuilder().append("oj.D(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          L2: {
            stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_7_0;
        }
    }

    static {
        field_g = "Service unavailable";
    }
}
