/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uh {
    private int field_j;
    static String field_d;
    static String field_e;
    private uf[] field_b;
    static boolean field_i;
    private int field_a;
    float field_h;
    private int field_f;
    String field_c;
    static String[] field_g;

    public static void a(int param0) {
        field_g = null;
        field_d = null;
        field_e = null;
        int var1 = -94 % ((param0 - 19) / 58);
    }

    final boolean b(int param0) {
        int var3;
        uf var4;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 != -1) {
          this.field_a = 107;
        }
        while (this.field_j < this.field_f) {
          var4 = this.field_b[this.field_j];
          if (!var4.field_a.b((byte) -42)) {
            this.a(true, 0, var4);
            return false;
          }
          if (var4.field_e >= 0 &&
            !var4.field_a.b(109, var4.field_e)) {
            this.a(true, var4.field_a.c((byte) 36, var4.field_e), var4);
            return false;
          }
          if (var4.field_d != null &&
            !var4.field_a.a(var4.field_d, -118)) {
            this.a(true, var4.field_a.a(var4.field_d, (byte) 91), var4);
            return false;
          }
          if (var4.field_e < 0 &&
            null == var4.field_d &&
            var4.field_c != null &&
            !var4.field_a.a(-1)) {
            this.a(true, var4.field_a.d(100), var4);
            return false;
          }
          this.field_j = this.field_j + 1;
        }
        return true;
    }

    private uh() throws Throwable {
        throw new Error();
    }

    final static int a(int param0, int param1, int param2, int param3) {
        if (param0 >= -8) {
          field_e = (String) null;
          if (!(gf.field_b < param2 + param1)) {
            return param1;
          }
          if (param3 + param1 - param2 < 0) {
            return -param2 + gf.field_b;
          }
          return -param2 + param3 + param1;
        }
        if (!(gf.field_b < param2 + param1)) {
          return param1;
        }
        if (param3 + param1 - param2 < 0) {
          return -param2 + gf.field_b;
        }
        return -param2 + param3 + param1;
    }

    private final void a(boolean param0, int param1, uf param2) {
        float var4_float = 0.0f;
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            return;
          }
          var4_float = (float)param1 / 100.0f + (float)(this.field_j + 1);
          this.field_h = var4_float * (float)this.field_a / (float)(1 + this.field_f);
          if (param1 == 0) {
            this.field_c = param2.field_f;
            return;
          }
          this.field_c = param2.field_c + " - " + param1 + "%";
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("uh.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    static {
        field_d = "Chat is currently disabled.";
        field_e = "You have resigned.";
        field_g = new String[]{"Showing by rating", "Showing by win percentage"};
    }
}
