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
        if (hc.field_b == null) {
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
          if (param0 == 0) {
            return hc.field_b;
          }
          return (of) null;
        }
        if (param0 == 0) {
          return hc.field_b;
        }
        return (of) null;
    }

    final void a(vn param0, int param1, int param2, int param3, int param4, int param5) {
        try {
          param0.b((int)this.field_a + param5 - 16, -16 + ((int)this.field_b + param2), param1);
          if (param4 > -92) {
            oj.b(-16);
          }
          param0.e(-16 + param5 + (int)this.field_a, (int)this.field_b + (param2 - 16), param3);
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "oj.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param1 != 18463) {
          return;
        }
        this.field_a = this.field_a + this.field_c;
        this.field_b = this.field_b + this.field_e;
        if (this.field_c != 0.0f) {
          if (dj.field_e.field_H.a((int)(this.field_a + (float)param2), (int)(this.field_b + (float)param0), 82)) {
            return;
          }
          this.field_e = 0.0f;
          this.field_c = 0.0f;
          return;
        }
        if (0.0f == this.field_e) {
          return;
        }
        if (dj.field_e.field_H.a((int)(this.field_a + (float)param2), (int)(this.field_b + (float)param0), 82)) {
          return;
        }
        this.field_e = 0.0f;
        this.field_c = 0.0f;
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
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!ph.a(param2, 31043, param0, param3)) {
            return null;
          }
          if (param4 == 0) {
            stackIn_7_0 = oh.a(param4 + 29506, param1.a((byte) 51, param2, param0));
            return stackIn_7_0;
          }
          stackIn_5_0 = (lp) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("oj.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_g = "Service unavailable";
    }
}
