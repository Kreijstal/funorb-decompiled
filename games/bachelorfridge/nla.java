/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nla {
    static boolean field_f;
    static sna field_b;
    static String field_e;
    static double field_d;
    static int[] field_a;
    gfa[] field_g;
    static String field_c;

    final void a(cda param0, boolean param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = BachelorFridge.field_y;
        try {
          if (!param1) {
            return;
          }
          for (var3_int = 0; var3_int < 11; var3_int++) {
            this.field_g[var3_int].field_h = param0.field_b[var3_int].field_h;
            this.field_g[var3_int].field_l = param0.field_b[var3_int].field_l;
            this.field_g[var3_int].field_d = param0.field_b[var3_int].field_d;
            this.field_g[var3_int].field_e = param0.field_b[var3_int].field_e;
            this.field_g[var3_int].field_j = param0.field_b[var3_int].field_j;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("nla.A(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_c = null;
        if (param0) {
          return;
        }
        field_e = null;
        field_b = null;
        field_a = null;
    }

    nla() {
        int var1 = 0;
        this.field_g = new gfa[11];
        for (var1 = 0; this.field_g.length > var1; var1++) {
          this.field_g[var1] = new gfa(0, 0);
        }
    }

    static {
        field_f = false;
        field_d = 0.0;
        field_e = "You have withdrawn your request to join.";
        field_c = "Discard";
        field_a = new int[]{16777215, 15515761, 16101691, 15175695, 12219915, 9982214, 6040836, 2954769};
    }
}
