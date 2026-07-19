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
            this.field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "rp.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0) {
        this.field_c = new bg(this.field_a, (rp) (this));
        if (param0 < 124) {
            Runnable var3 = (Runnable) null;
            this.a((Runnable) null, true);
        }
    }

    rp(qa param0) {
        af discarded$23 = null;
        af discarded$24 = null;
        af discarded$25 = null;
        af discarded$26 = null;
        af discarded$27 = null;
        af discarded$28 = null;
        af discarded$29 = null;
        af discarded$30 = null;
        af discarded$31 = null;
        af discarded$32 = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var3 = Sumoblitz.field_L ? 1 : 0;
        kn discarded$22 = new kn();
        try {
          L0: {
            this.field_a = param0;
            this.field_c = new bg(param0, (rp) (this));
            discarded$23 = new af(this.field_a);
            discarded$24 = new af(this.field_a);
            discarded$25 = new af(this.field_a);
            discarded$26 = new af(this.field_a);
            discarded$27 = new af(this.field_a);
            discarded$28 = new af(this.field_a);
            discarded$29 = new af(this.field_a);
            discarded$30 = new af(this.field_a);
            discarded$31 = new af(this.field_a);
            discarded$32 = new af(this.field_a);
            this.field_f = new int[af.field_c];
            var2_int = 0;
            L1: while (true) {
              if (af.field_c <= var2_int) {
                break L0;
              } else {
                this.field_f[var2_int] = -1;
                var2_int++;
                if (var3 == 0) {
                  continue L1;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var2);
            stackOut_8_1 = new StringBuilder().append("rp.<init>(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    static {
        field_d = 48;
    }
}
