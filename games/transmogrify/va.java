/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class va extends me {
    private cg field_k;
    private boolean field_m;
    static int field_j;
    private String field_l;

    final String b(int param0, String param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        String stackIn_9_0 = null;
        String stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -1) {
            stackIn_2_0 = (String) null;
            return stackIn_2_0;
          }
          if (this.field_k.a(95, param1) == ec.field_d) {
            stackIn_6_0 = this.field_k.b(-1, param1);
            return stackIn_6_0;
          }
          if (this.a(95, param1) != ec.field_d) {
            stackIn_11_0 = wj.field_i;
            return stackIn_11_0;
          }
          stackIn_9_0 = hk.field_b;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("va.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    va(rg param0, rg param1) {
        super(param0);
        this.field_l = "";
        this.field_m = false;
        try {
          this.field_k = new cg(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "va.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(hg param0, hg param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 22 / ((8 - param2) / 37);
          var4 = (String) null;
          stackIn_1_0 = jd.a(0, param1, (byte) -9, (String) null, 0, false, param0);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("va.D(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    final rc a(int param0, String param1) {
        fc var3 = null;
        RuntimeException var3_ref = null;
        rc stackIn_3_0 = null;
        rc stackIn_8_0 = null;
        rc stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_k.a((int) (char)param0, param1) == ec.field_d) {
            stackIn_3_0 = ec.field_d;
            return stackIn_3_0;
          }
          if (!param1.equals(this.field_l)) {
            var3 = pi.a(17118, param1);
            if (!var3.b(-26753)) {
              stackIn_8_0 = fi.field_u;
              return stackIn_8_0;
            }
            this.field_l = param1;
            this.field_m = var3.a(-1);
          }
          if (!this.field_m) {
            stackIn_13_0 = ec.field_d;
          } else {
            stackIn_13_0 = hi.field_b;
          }
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("va.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static {
    }
}
