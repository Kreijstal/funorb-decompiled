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
        af discarded$12 = null;
        af discarded$13 = null;
        af discarded$14 = null;
        af discarded$15 = null;
        af discarded$16 = null;
        af discarded$17 = null;
        af discarded$18 = null;
        af discarded$19 = null;
        af discarded$20 = null;
        af discarded$21 = null;
        int var2_int = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        kn discarded$11 = new kn();
        try {
          L0: {
            this.field_a = param0;
            this.field_c = new bg(param0, (rp) (this));
            discarded$12 = new af(this.field_a);
            discarded$13 = new af(this.field_a);
            discarded$14 = new af(this.field_a);
            discarded$15 = new af(this.field_a);
            discarded$16 = new af(this.field_a);
            discarded$17 = new af(this.field_a);
            discarded$18 = new af(this.field_a);
            discarded$19 = new af(this.field_a);
            discarded$20 = new af(this.field_a);
            discarded$21 = new af(this.field_a);
            this.field_f = new int[af.field_c];
            var2_int = 0;
            L1: while (true) {
              if (af.field_c <= var2_int) {
                break L0;
              } else {
                this.field_f[var2_int] = -1;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("rp.<init>(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    static {
        field_d = 48;
    }
}
