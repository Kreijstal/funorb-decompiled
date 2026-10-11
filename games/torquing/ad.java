/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad extends gf {
    private String field_m;
    static String field_l;
    private boolean field_o;
    static int field_n;
    private um field_p;

    final String a(byte param0, String param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_p.a(127, param1) == so.field_u) {
            stackIn_2_0 = this.field_p.a((byte) -121, param1);
            return stackIn_2_0;
          }
          if (param0 != -121) {
            ad.c((byte) 37);
          }
          if (this.a(114, param1) != so.field_u) {
            return cp.field_h;
          }
          stackIn_8_0 = ul.field_c;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("ad.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final cd a(int param0, String param1) {
        up var3 = null;
        RuntimeException var3_ref = null;
        cd stackIn_4_0 = null;
        cd stackIn_9_0 = null;
        cd stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 62) {
            this.field_o = true;
          }
          if (this.field_p.a(110, param1) == so.field_u) {
            stackIn_4_0 = so.field_u;
            return stackIn_4_0;
          }
          if (!param1.equals(this.field_m)) {
            var3 = vf.a(param1, 0);
            if (!var3.c(484)) {
              stackIn_9_0 = gn.field_h;
              return stackIn_9_0;
            }
            this.field_m = param1;
            this.field_o = var3.a(484);
          }
          if (!this.field_o) {
            stackIn_14_0 = so.field_u;
          } else {
            stackIn_14_0 = so.field_s;
          }
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("ad.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    public static void c(byte param0) {
        if (param0 != 17) {
          ad.c((byte) 10);
          field_l = null;
          return;
        }
        field_l = null;
    }

    ad(tk param0, tk param1) {
        super(param0);
        this.field_o = false;
        this.field_m = "";
        try {
          this.field_p = new um(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "ad.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = "Player Name: ";
        field_n = -1;
    }
}
