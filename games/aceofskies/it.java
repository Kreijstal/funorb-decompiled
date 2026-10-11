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
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        if (param1 == -1) {
          var2 = (param0 * param0 >> 12) * param0 >> 12;
          var3 = -61440 + param0 * 6;
          var4 = (param0 * var3 >> 12) + 40960;
          return var4 * var2 >> 12;
        }
        field_c = 2;
        var2Lifetime1 = (param0 * param0 >> 12) * param0 >> 12;
        var3Lifetime1 = -61440 + param0 * 6;
        var4Lifetime1 = (param0 * var3Lifetime1 >> 12) + 40960;
        return var4Lifetime1 * var2Lifetime1 >> 12;
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
        this.field_d = new le(this.field_b, this);
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
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        iu discarded$11 = new iu();
        try {
          this.field_b = param0;
          this.field_d = new le(param0, this);
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
          for (var2_int = 0; hm.field_b > var2_int; var2_int++) {
            this.field_e[var2_int] = -1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("it.<init>(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    static {
    }
}
