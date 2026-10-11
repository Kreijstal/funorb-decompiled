/*
 * Decompiled by CFR-JS 0.4.0.
 */
class tc extends lu {
    private String field_e;
    private long field_g;
    static af field_d;
    static String field_f;

    final static ka[] a(oc[] param0, int param1, ha param2) {
        int var4 = 0;
        ka[] var3 = null;
        RuntimeException var3_ref = null;
        int var5 = 0;
        ka[] var6 = null;
        ka[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          if (param0 == null) {
            return null;
          }
          var6 = new ka[param0.length];
          var3 = var6;
          if (param1 != -8829) {
            field_f = (String) null;
          }
          for (var4 = 0; var6.length > var4; var4++) {
            var6[var4] = gb.a(param0[var4], param1 + 8957, param2);
          }
          stackIn_10_0 = var3;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("tc.G(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public static void b(int param0) {
        if (param0 != 17129) {
          tc.a(false, 119);
          field_d = null;
          field_f = null;
          return;
        }
        field_d = null;
        field_f = null;
    }

    final void a(uia param0, boolean param1) {
        if (param1) {
          return;
        }
        try {
          param0.a(1736565456, this.field_g);
          param0.a(this.field_e, -124);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "tc.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(boolean param0, int param1) {
        if (null != qda.field_b) {
          hia.a(-107, qda.field_b);
        }
        if (hka.field_b != null) {
          hka.field_b.a(true, param0);
        }
        if (param1 != 0) {
          field_d = (af) null;
        }
        jl.a((byte) -128, param0);
        if (null != fj.field_c) {
          fj.field_c.b(param1 + 74, param0);
        }
        hs.a(param0, (byte) -91);
    }

    final static void a(int param0, int param1) {
        if (param1 != -2886) {
          return;
        }
        rl.r(-93);
    }

    tc(long param0, String param1) {
        try {
          this.field_e = param1;
          this.field_g = param0;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "tc.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    pl a(byte param0) {
        if (param0 != 113) {
          return (pl) null;
        }
        return vm.field_f;
    }

    static {
        field_f = "Create a free account to store achievements, submit your best times and play online against friends! Without signing in, no progress will be saved!";
    }
}
