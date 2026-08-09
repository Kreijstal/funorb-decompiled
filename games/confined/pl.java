/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class pl extends jl {
    int field_t;
    int field_x;
    int field_w;
    int field_u;
    int field_v;
    int field_s;
    static bi field_y;

    final static void a(mi param0, boolean param1) {
        ph var2 = null;
        RuntimeException var2_ref = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            ph.b(param0.a(112, "headers.packvorbis", ""));
            var2 = ph.a(param0, "jagex logo2.packvorbis", "");
            var2.b();
            if (param1) {
              break L0;
            } else {
              field_y = (bi) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var2_ref);

            stackIn_5_1 = new StringBuilder().append("pl.A(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    public static void c(int param0) {
        field_y = null;
        if (param0 != -1444) {
            pl.c(-21);
        }
    }

    pl() {
    }

    static {
    }
}
