/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dm {
    static int field_j;
    float field_c;
    private int field_e;
    static int field_b;
    private hj[] field_h;
    static af field_f;
    static int[] field_d;
    private int field_i;
    String field_g;
    private int field_a;

    private final void a(hj param0, int param1, int param2) {
        float var4_float = 0.0f;
        RuntimeException var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_float = (float)param2 / (float)param1 + (float)(1 + this.field_e);
          this.field_c = (float)this.field_a * var4_float / (float)(1 + this.field_i);
          if (param2 != 0) {
            this.field_g = param0.field_l + " - " + param2 + "%";
            return;
          }
          this.field_g = param0.field_m;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("dm.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != 20583) {
          dm.a(-62);
          field_f = null;
          field_d = null;
          return;
        }
        field_f = null;
        field_d = null;
    }

    final boolean a(boolean param0) {
        hj var2;
        int var3;
        hj var4;
        var3 = MinerDisturbance.field_ab;
        if (!param0) {
          return true;
        }
        while (this.field_e < this.field_i) {
          var4 = this.field_h[this.field_e];
          var2 = var4;
          if (!var4.field_j.a((byte) 102)) {
            this.a(var4, 100, 0);
            return false;
          }
          if (0 <= var4.field_d &&
            !var4.field_j.d(var4.field_d, 0)) {
            this.a(var2, 100, var4.field_j.a(var4.field_d, true));
            return false;
          }
          if (null != var4.field_g &&
            !var4.field_j.a(false, var4.field_g)) {
            this.a(var2, 100, var4.field_j.a(var4.field_g, -128));
            return false;
          }
          if (var4.field_d < 0 &&
            var4.field_g == null &&
            var4.field_l != null &&
            !var4.field_j.b(-1)) {
            this.a(var2, 100, var4.field_j.c(-14858));
            return false;
          }
          this.field_e = this.field_e + 1;
        }
        return true;
    }

    private dm() throws Throwable {
        throw new Error();
    }

    static {
        field_j = -1;
        field_b = 0;
        field_d = new int[8192];
        field_f = null;
    }
}
