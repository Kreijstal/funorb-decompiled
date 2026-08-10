/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class it {
    private kj field_b;
    static int field_c;
    Runnable field_a;
    le field_d;
    private int[] field_e;

    final static int a(int param0, int param1) {
        int var2;
        int var3;
        int var4;
        if (param1 != -1) {
          field_c = 2;
          var2 = (param0 * param0 >> 1556964972) * param0 >> -1107730164;
          var3 = -61440 + param0 * 6;
          var4 = (param0 * var3 >> 1579015116) + 40960;
          return var4 * var2 >> -871338228;
        } else {
          var2 = (param0 * param0 >> 1556964972) * param0 >> -1107730164;
          var3 = -61440 + param0 * 6;
          var4 = (param0 * var3 >> 1579015116) + 40960;
          return var4 * var2 >> -871338228;
        }
    }

    final void a(Runnable param0, int param1) {
        try {
            this.field_a = param0;
            if (param1 != 6) {
                it.a(-108, 56);
            }
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "it.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(boolean param0) {
        this.field_d = new le(this.field_b, (it) (this));
        if (param0) {
            it.a(11, -13);
        }
    }

    it(kj param0) {
        hm discarded$12 = null;
        hm discarded$13 = null;
        hm discarded$14 = null;
        hm discarded$15 = null;
        hm discarded$16 = null;
        hm discarded$17 = null;
        hm discarded$18 = null;
        hm discarded$19 = null;
        hm discarded$20 = null;
        hm discarded$21 = null;
        int var2_int = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        iu discarded$11 = new iu();
        try {
          L0: {
            this.field_b = param0;
            this.field_d = new le(param0, (it) (this));
            discarded$12 = new hm(this.field_b);
            discarded$13 = new hm(this.field_b);
            discarded$14 = new hm(this.field_b);
            discarded$15 = new hm(this.field_b);
            discarded$16 = new hm(this.field_b);
            discarded$17 = new hm(this.field_b);
            discarded$18 = new hm(this.field_b);
            discarded$19 = new hm(this.field_b);
            discarded$20 = new hm(this.field_b);
            discarded$21 = new hm(this.field_b);
            this.field_e = new int[hm.field_b];
            var2_int = 0;
            L1: while (true) {
              if (hm.field_b <= var2_int) {
                break L0;
              } else {
                this.field_e[var2_int] = -1;
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

            stackIn_7_1 = new StringBuilder().append("it.<init>(");

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
          throw pn.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    static {
    }
}
