/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rp {
    private qa field_a;
    static String field_b;
    static int field_d;
    Runnable field_e;
    private int[] field_f;
    bg field_c;

    final static void a(boolean param0) {
        kn.field_c[93] = 43;
        kn.field_c[44] = 71;
        kn.field_c[45] = 26;
        kn.field_c[92] = 74;
        kn.field_c[59] = 57;
        kn.field_c[47] = 73;
        if (param0) {
          rp.b(true);
          kn.field_c[61] = 27;
          kn.field_c[222] = 58;
          kn.field_c[520] = 59;
          kn.field_c[192] = 28;
          kn.field_c[46] = 72;
          kn.field_c[91] = 42;
          return;
        } else {
          kn.field_c[61] = 27;
          kn.field_c[222] = 58;
          kn.field_c[520] = 59;
          kn.field_c[192] = 28;
          kn.field_c[46] = 72;
          kn.field_c[91] = 42;
          return;
        }
    }

    public static void b(boolean param0) {
        field_b = null;
        if (!param0) {
            rp.a(false);
        }
    }

    final void a(Runnable param0, boolean param1) {
        try {
            if (!param1) {
                rp.a(true);
            }
            ((rp) this).field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "rp.C(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final void a(int param0) {
        ((rp) this).field_c = new bg(((rp) this).field_a, (rp) this);
        if (param0 < 124) {
            Object var3 = null;
            ((rp) this).a((Runnable) null, true);
        }
    }

    rp(qa param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        kn discarded$22 = new kn();
        try {
          L0: {
            ((rp) this).field_a = param0;
            ((rp) this).field_c = new bg(param0, (rp) this);
            af discarded$23 = new af(((rp) this).field_a);
            af discarded$24 = new af(((rp) this).field_a);
            af discarded$25 = new af(((rp) this).field_a);
            af discarded$26 = new af(((rp) this).field_a);
            af discarded$27 = new af(((rp) this).field_a);
            af discarded$28 = new af(((rp) this).field_a);
            af discarded$29 = new af(((rp) this).field_a);
            af discarded$30 = new af(((rp) this).field_a);
            af discarded$31 = new af(((rp) this).field_a);
            af discarded$32 = new af(((rp) this).field_a);
            ((rp) this).field_f = new int[af.field_c];
            var2_int = 0;
            L1: while (true) {
              if (af.field_c <= var2_int) {
                break L0;
              } else {
                ((rp) this).field_f[var2_int] = -1;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("rp.<init>(");
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
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 48;
    }
}
