/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wh {
    static int field_k;
    static String field_j;
    static hl field_l;
    private in[] field_d;
    static int field_i;
    float field_f;
    String field_e;
    static double field_c;
    private int field_h;
    static String field_a;
    private int field_b;
    private int field_g;

    public static void a(boolean param0) {
        field_j = null;
        field_l = null;
        field_a = null;
        if (param0) {
          wh.a(true);
        }
    }

    final boolean a(int param0) {
        int var3;
        in var4;
        var3 = TetraLink.field_J;
        while (this.field_b > this.field_h) {
          var4 = this.field_d[this.field_h];
          if (!var4.field_b.c(124)) {
            this.a(-1, 0, var4);
            return false;
          }
          if (var4.field_f >= 0 &&
            !var4.field_b.d(var4.field_f, 0)) {
            this.a(-1, var4.field_b.e(-11337, var4.field_f), var4);
            return false;
          }
          if (null != var4.field_a &&
            !var4.field_b.a(var4.field_a, (byte) -98)) {
            this.a(param0 ^ 1209, var4.field_b.a(var4.field_a, true), var4);
            return false;
          }
          if (var4.field_f < 0 &&
            null == var4.field_a &&
            var4.field_e != null &&
            !var4.field_b.a(false)) {
            this.a(-1, var4.field_b.b(param0 ^ -21414), var4);
            return false;
          }
          this.field_h = this.field_h + 1;
        }
        if (param0 == -1210) {
          return true;
        }
        field_i = 124;
        return true;
    }

    private final void a(int param0, int param1, in param2) {
        float var4_float = 0.0f;
        RuntimeException var4 = null;
        in var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -1) {
            var5 = (in) null;
            this.a(-72, 55, (in) null);
          }
          var4_float = (float)param1 / 100.0f + (float)(this.field_h + 1);
          this.field_f = var4_float * (float)this.field_g / (float)(this.field_b + 1);
          if (param1 != 0) {
            this.field_e = param2.field_e + " - " + param1 + "%";
            return;
          }
          this.field_e = param2.field_h;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("wh.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    private wh() throws Throwable {
        throw new Error();
    }

    static {
        field_j = "Please check if address is correct";
        field_a = "2D";
        field_i = -1;
    }
}
