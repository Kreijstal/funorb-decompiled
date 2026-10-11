/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fg extends cg {
    private hf field_o;
    static String field_j;
    static int field_l;
    static String[] field_m;
    static boolean field_k;
    static java.awt.Frame field_n;

    final String a(String param0, boolean param1) {
        ba var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        String stackIn_7_0 = null;
        String stackIn_9_0 = null;
        String stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_o instanceof of) {
            var3 = ((of) ((Object) this.field_o)).a(-53);
            if (var3 != null) {
              if (var3.a(true) == ii.field_e &&
                !param0.equals(this.field_o.field_r)) {
                stackIn_7_0 = r.field_r;
                return stackIn_7_0;
              }
              stackIn_9_0 = var3.b(26766);
              return stackIn_9_0;
            }
          }
          if (param1) {
            var4 = (String) null;
            this.a((String) null, -89);
          }
          if (param0.equals(this.field_o.field_r)) {
            return null;
          }
          stackIn_15_0 = r.field_r;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("fg.I(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void c(boolean param0) {
        field_m = null;
        field_n = null;
        if (!param0) {
          fg.c(true);
          field_j = null;
          return;
        }
        field_j = null;
    }

    fg(hf param0, hf param1) {
        super(param0);
        try {
          this.field_o = param1;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "fg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final sg a(String param0, int param1) {
        ba var3 = null;
        RuntimeException var3_ref = null;
        sg stackIn_7_0 = null;
        sg stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -58) {
            field_k = false;
          }
          if (this.field_o instanceof of) {
            var3 = ((of) ((Object) this.field_o)).a(116);
            if (var3 != null &&
              var3.a(true) != ii.field_e) {
              stackIn_7_0 = pe.field_b;
              return stackIn_7_0;
            }
          }
          if (!param0.equals(this.field_o.field_r)) {
            stackIn_11_0 = pe.field_b;
          } else {
            stackIn_11_0 = ii.field_e;
          }
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("fg.M(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_m = new String[]{"By rating", "By win percentage"};
        field_k = false;
    }
}
