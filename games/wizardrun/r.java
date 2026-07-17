/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class r implements dk {
    static qc field_b;
    private long field_f;
    static int field_e;
    static oi field_d;
    static String field_c;
    static int field_a;

    final static o[] a(int param0, kl param1, int param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        o[] stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        o[] stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param2 == 13469) {
              if (h.a(param3, param0, param1, -120)) {
                stackOut_6_0 = dc.a(19999);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                return (o[]) (Object) stackIn_5_0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (o[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("r.L(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_7_0;
    }

    public final ok a(boolean param0) {
        if (((r) this).b(7245)) {
            return va.field_o;
        }
        if (!(d.a((byte) 25) >= ((r) this).field_f - -350L)) {
            return nf.field_c;
        }
        if (!param0) {
            field_b = null;
        }
        return ((r) this).b(true);
    }

    abstract String b(byte param0);

    abstract ok b(boolean param0);

    final static void c(int param0) {
        o var1 = null;
        o var2 = null;
        int var3 = 0;
        int var4 = wizardrun.field_H;
        try {
            var1 = new o(540, 140);
            ud.a(var1, false);
            cj.c();
            ed.d();
            jd.field_f = 0;
            gf.k(-115);
            var2 = var1.e();
            for (var3 = 0; var3 < 15; var3++) {
                var2.b(-2, -2, 16777215);
                ed.c(4, 4, 0, 0, 540, 140);
            }
            ag.field_t.b();
            var1.a(0, 0);
            bb.b(4);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "r.N(" + 350 + 41);
        }
    }

    public final String a(int param0) {
        if (param0 != -2864) {
            ok discarded$0 = ((r) this).a(false);
        }
        if (((r) this).b(7245)) {
            return null;
        }
        if (~(((r) this).field_f - -350L) < ~d.a((byte) 29)) {
            return null;
        }
        return ((r) this).b((byte) -82);
    }

    public static void d(int param0) {
        field_d = null;
        field_c = null;
        field_b = null;
        if (param0 < 105) {
            r.d(-68);
        }
    }

    public final void a(byte param0) {
        if (param0 >= -59) {
            return;
        }
        ((r) this).field_f = d.a((byte) 31);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new oi();
        field_c = "Use the arrow keys to move.";
    }
}
