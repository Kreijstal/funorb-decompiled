/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kk extends bm implements mc {
    static int field_K;
    private int field_M;
    static AircraftDefinition field_N;
    private sp field_L;
    static String field_J;

    public final sp a(int param0) {
        if (param0 != 0) {
          this.g((byte) -126);
          return this.field_L;
        }
        return this.field_L;
    }

    final void a(sp param0, int param1) {
        try {
          this.field_L = param0;
          if (param1 != 1472) {
            field_N = (AircraftDefinition) null;
          }
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "kk.DA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void g(byte param0) {
        super.g(param0);
        if (null != this.field_L) {
          this.field_L.a((byte) 115);
        }
    }

    final void a(byte param0, ea param1, int param2, int param3) {
        try {
          super.a((byte) 46, param1, param2, param3);
          if (param0 <= 13) {
            this.a(113);
          }
          this.field_M = -this.field_p + (ic.field_b - param3);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "kk.S(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static int a(la param0, byte param1) {
        RuntimeException var2 = null;
        la var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == la.field_a) {
            stackIn_2_0 = 5120;
            return stackIn_2_0;
          }
          if (param0 == la.field_j) {
            stackIn_24_0 = 5122;
            return stackIn_24_0;
          }
          if (param0 == la.field_e) {
            stackIn_6_0 = 5124;
            return stackIn_6_0;
          }
          if (la.field_h == param0) {
            stackIn_9_0 = 5121;
            return stackIn_9_0;
          }
          if (param0 == la.field_b) {
            stackIn_12_0 = 5123;
            return stackIn_12_0;
          }
          if (la.field_f == param0) {
            stackIn_15_0 = 5125;
            return stackIn_15_0;
          }
          if (param0 == la.field_d) {
            stackIn_22_0 = 5131;
            return stackIn_22_0;
          }
          if (param0 == la.field_i) {
            stackIn_20_0 = 5126;
            return stackIn_20_0;
          }
          if (param1 >= -91) {
            var3 = (la) null;
            kk.a((la) null, (byte) -56);
          }
          throw new IllegalArgumentException("");
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_30_0 = var2;
          stackIn_30_1 = new StringBuilder().append("kk.EA(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param1).append(')').toString());
        }
    }

    kk(String param0, no param1, int param2) {
        super(param0, param1, param2);
    }

    final String c(byte param0) {
        if (param0 >= -41) {
          return (String) null;
        }
        if (!this.field_g) {
          return null;
        }
        if (this.field_k != null) {
          gq.a(true, this.field_q + (-this.field_M + ic.field_b), cf.field_g);
          return this.field_k;
        }
        return null;
    }

    public static void c(boolean param0) {
        if (!param0) {
          field_N = (AircraftDefinition) null;
          field_J = null;
          field_N = null;
          return;
        }
        field_J = null;
        field_N = null;
    }

    static {
        field_K = 0;
        field_N = new AircraftDefinition(0.5, 20, 0, 100, 1, 7.0, 9.0, 16, 0);
        field_J = "Login: ";
    }
}
