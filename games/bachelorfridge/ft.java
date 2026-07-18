/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ft extends bw {
    static vr field_h;
    boolean field_f;
    int field_g;

    final static void a(int param0) {
        L0: {
          kt.field_m = new sna(0L, (sna) null);
          if (eaa.field_c) {
            kt.field_m.a(-1, dea.field_m);
            break L0;
          } else {
            break L0;
          }
        }
        kt.field_m.a(-1, tv.field_o);
        if (param0 != 2048) {
          ft.a(93);
          lia.field_j = new lm(cja.field_r, kt.field_m);
          ng.field_e = new sna(0L, (sna) null);
          ng.field_e.a(-1, (sna) (Object) lia.field_j.field_a);
          ng.field_e.a(-1, mc.field_g);
          int discarded$2 = -6;
          kf.a();
          return;
        } else {
          lia.field_j = new lm(cja.field_r, kt.field_m);
          ng.field_e = new sna(0L, (sna) null);
          ng.field_e.a(-1, (sna) (Object) lia.field_j.field_a);
          ng.field_e.a(-1, mc.field_g);
          int discarded$3 = -6;
          kf.a();
          return;
        }
    }

    final static void c() {
        if (!qo.field_c) {
            throw new IllegalStateException();
        }
        lia.field_i = true;
        int var1 = 0;
        gq.a(false, 19626);
        jv.field_j = 0;
    }

    private final void a(lu param0) {
        RuntimeException var3 = null;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            ((ft) this).field_g = param0.f(-95);
            stackOut_0_0 = this;
            stackIn_2_0 = stackOut_0_0;
            stackIn_1_0 = stackOut_0_0;
            if (param0.b(16711935) == 0) {
              stackOut_2_0 = this;
              stackOut_2_1 = 0;
              stackIn_3_0 = stackOut_2_0;
              stackIn_3_1 = stackOut_2_1;
              break L0;
            } else {
              stackOut_1_0 = this;
              stackOut_1_1 = 1;
              stackIn_3_0 = stackOut_1_0;
              stackIn_3_1 = stackOut_1_1;
              break L0;
            }
          }
          ((ft) this).field_f = stackIn_3_1 != 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("ft.D(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + -26011 + ')');
        }
    }

    public static void d() {
        field_h = null;
        int var1 = 81;
    }

    final static int a(int param0, byte param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        param0 = param0 & 8191;
        if (4096 > param0) {
          L0: {
            if (2048 <= param0) {
              stackOut_7_0 = -ed.field_b[-2048 + param0];
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = ed.field_b[2048 - param0];
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (param0 < 6144) {
              stackOut_3_0 = -ed.field_b[6144 + -param0];
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = ed.field_b[param0 - 6144];
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    ft(lu param0) {
        try {
            int discarded$0 = -26011;
            this.a(param0);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "ft.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
