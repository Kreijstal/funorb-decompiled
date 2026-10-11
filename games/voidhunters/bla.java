/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bla extends eca {
    private String field_g;
    private boolean field_h;
    private vqa field_f;

    final static boolean a(int param0, boolean param1, int param2) {
        if (!param1) {
          return ((0 != (24 & param0) ? 1 : 0) | ((544 & param0) == 544 ? 1 : 0)) != 0;
        }
        bla.a(126, true, -36);
        return ((0 != (24 & param0) ? 1 : 0) | ((544 & param0) == 544 ? 1 : 0)) != 0;
    }

    final qrb a(String param0, int param1) {
        ge var3 = null;
        RuntimeException var3_ref = null;
        qrb stackIn_2_0 = null;
        qrb stackIn_8_0 = null;
        qrb stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_f.a(param0, param1) == cca.field_o) {
            stackIn_2_0 = cca.field_o;
            return stackIn_2_0;
          }
          if (!param0.equals(this.field_g)) {
            var3 = psb.a(param0, param1 ^ 16384);
            if (!var3.a(4)) {
              stackIn_8_0 = dsa.field_q;
              return stackIn_8_0;
            }
            this.field_g = param0;
            this.field_h = var3.b((byte) -20);
          }
          if (!this.field_h) {
            stackIn_13_0 = cca.field_o;
          } else {
            stackIn_13_0 = lea.field_o;
          }
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("bla.B(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    final String b(String param0, int param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        String stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_f.a(param0, 16384) == cca.field_o) {
            stackIn_3_0 = this.field_f.b(param0, -1);
            return stackIn_3_0;
          }
          if (this.a(param0, 16384) == cca.field_o) {
            stackIn_7_0 = qh.field_N;
            return stackIn_7_0;
          }
          if (param1 != -1) {
            this.field_g = (String) null;
          }
          stackIn_11_0 = bqa.field_f;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("bla.C(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    bla(uf param0, uf param1) {
        super(param0);
        this.field_g = "";
        this.field_h = false;
        try {
          this.field_f = new vqa(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "bla.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
