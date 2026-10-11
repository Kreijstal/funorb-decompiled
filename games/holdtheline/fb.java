/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fb extends hl {
    int[] field_r;
    int field_t;
    int field_u;
    static String field_l;
    int field_j;
    long field_m;
    static ah field_n;
    int field_p;
    int field_o;
    static ll field_s;
    int field_q;
    static gn field_i;
    int field_k;

    public static void a(boolean param0) {
        field_i = null;
        field_l = null;
        field_n = null;
        field_s = null;
        if (!param0) {
          field_n = (ah) null;
        }
    }

    final static float a(ei param0, byte param1) {
        int var3 = 0;
        float var2_float = 0.0f;
        RuntimeException var2 = null;
        int var4 = 0;
        float stackIn_7_0 = 0.0f;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = HoldTheLine.field_D;
        try {
          var2_float = 0.0f;
          if (param1 <= 14) {
            fb.a(false);
          }
          for (var3 = 0; var3 < param0.field_e; var3++) {
            var2_float = var2_float + ((wc) (param0.field_b[var3])).f(50);
          }
          stackIn_7_0 = var2_float;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("fb.B(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    fb(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        int fieldTemp$0 = 0;
        try {
          this.field_p = param3;
          this.field_k = param5;
          fieldTemp$0 = mi.field_b;
          mi.field_b = mi.field_b + 1;
          this.field_u = 65535 & fieldTemp$0;
          this.field_t = param1;
          this.field_o = param4;
          this.field_j = param0;
          this.field_q = param2;
          this.field_r = param6;
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "fb.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = "to over <%0> great games";
        field_s = new ll();
    }
}
