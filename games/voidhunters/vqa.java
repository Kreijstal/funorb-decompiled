/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vqa extends eca {
    static int field_k;
    static goa field_i;
    static String field_f;
    static uca field_g;
    static String field_j;
    private uf field_h;

    final qrb a(String param0, int param1) {
        eeb var3 = null;
        RuntimeException var3_ref = null;
        qrb stackIn_6_0 = null;
        qrb stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_h instanceof lca) {
            var3 = ((lca) ((Object) this.field_h)).a(-782444220);
            if (var3 != null &&
              var3.a((byte) 35) != lea.field_o) {
              stackIn_6_0 = cca.field_o;
              return stackIn_6_0;
            }
          }
          if (param1 != 16384) {
            field_k = -96;
          }
          if (param0.equals(this.field_h.field_j)) {
            stackIn_12_0 = lea.field_o;
          } else {
            stackIn_12_0 = cca.field_o;
          }
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("vqa.B(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    final String b(String param0, int param1) {
        eeb var3 = null;
        RuntimeException var3_ref = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        String stackIn_11_0 = null;
        Object stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_h instanceof lca) {
            var3 = ((lca) ((Object) this.field_h)).a(-782444220);
            if (var3 != null) {
              if (var3.a((byte) 35) == lea.field_o &&
                !param0.equals(this.field_h.field_j)) {
                stackIn_6_0 = lmb.field_a;
                return stackIn_6_0;
              }
              stackIn_8_0 = var3.c((byte) -79);
              return stackIn_8_0;
            }
          }
          if (!param0.equals(this.field_h.field_j)) {
            stackIn_11_0 = lmb.field_a;
            return stackIn_11_0;
          }
          if (param1 == -1) {
            return null;
          }
          vqa.f(108);
          stackIn_15_0 = null;
          return (String) (stackIn_15_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("vqa.C(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void f(int param0) {
        if (param0 != 1) {
          return;
        }
        field_i = null;
        field_j = null;
        field_f = null;
        field_g = null;
    }

    vqa(uf param0, uf param1) {
        super(param0);
        try {
          this.field_h = param1;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "vqa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_k = 1;
        field_f = "Add action (Set custom variable label)";
        field_j = "Encouraging rule breaking";
        nf discarded$0 = new nf();
    }
}
