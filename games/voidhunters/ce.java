/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ce extends rqa {
    static ij field_p;
    static byte[] field_o;

    public static void a() {
        field_p = null;
        field_o = null;
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
                nc discarded$2 = ((ce) this).a((nc[]) null, -2);
                break L1;
              }
            }
            stackOut_2_0 = new nc((Object) (Object) frb.a(226, 110));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("ce.A(");
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
          throw rta.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static void b() {
        ema.field_o = new mfb[12];
        ema.field_o[0] = (mfb) (Object) new fpb();
        ema.field_o[1] = (mfb) (Object) new deb();
        ema.field_o[2] = (mfb) (Object) new ifb();
        ema.field_o[3] = (mfb) (Object) new wqb();
        ema.field_o[4] = (mfb) (Object) new mna();
        ema.field_o[5] = (mfb) (Object) new teb();
        ema.field_o[6] = (mfb) (Object) new fma();
        ema.field_o[11] = (mfb) (Object) new rma();
        ema.field_o[7] = (mfb) (Object) new wca();
        ema.field_o[8] = (mfb) (Object) new dm();
        ema.field_o[9] = (mfb) (Object) new ira();
        ema.field_o[10] = (mfb) (Object) new jeb();
    }

    final static void a(asb param0) {
        fca var2 = null;
        try {
            fca.b(param0.a("", true, "headers.packvorbis"));
            var2 = fca.a(param0, "jagex logo2.packvorbis", "");
            gd discarded$0 = var2.b();
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "ce.D(" + (param0 != null ? "{...}" : "null") + ',' + false + ')');
        }
    }

    ce(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new ij();
    }
}
