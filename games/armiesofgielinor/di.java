/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class di extends mk {
    private fn field_k;
    static String field_j;
    static je field_l;

    final static void c(byte param0) {
        if (param0 > -120) {
          di.c((byte) 114);
          qf.a(56);
          gl.a(124, 4);
          return;
        }
        qf.a(56);
        gl.a(124, 4);
    }

    public static void g(int param0) {
        field_l = null;
        field_j = null;
        int var1 = -96 / ((param0 + 9) / 42);
    }

    final gu a(int param0, String param1) {
        n var3 = null;
        RuntimeException var3_ref = null;
        gu stackIn_5_0 = null;
        gu stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_k instanceof eg) {
            var3 = ((eg) ((Object) this.field_k)).a(-918933630);
            if (var3 != null &&
              var3.a(false) != oo.field_g) {
              stackIn_5_0 = rn.field_e;
              return stackIn_5_0;
            }
          }
          if (param0 != -3137) {
            field_l = (je) null;
          }
          if (!param1.equals(this.field_k.field_v)) {
            stackIn_11_0 = rn.field_e;
          } else {
            stackIn_11_0 = oo.field_g;
          }
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("di.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    di(fn param0, fn param1) {
        super(param0);
        try {
          this.field_k = param1;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "di.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String a(byte param0, String param1) {
        n var3 = null;
        RuntimeException var3_ref = null;
        String stackIn_7_0 = null;
        String stackIn_9_0 = null;
        String stackIn_15_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_k instanceof eg) {
            var3 = ((eg) ((Object) this.field_k)).a(-918933630);
            if (var3 != null) {
              if (var3.a(false) == oo.field_g &&
                !param1.equals(this.field_k.field_v)) {
                stackIn_7_0 = ak.field_j;
                return stackIn_7_0;
              }
              stackIn_9_0 = var3.a((byte) 55);
              return stackIn_9_0;
            }
          }
          if (param0 <= 89) {
            di.c((byte) 94);
          }
          if (param1.equals(this.field_k.field_v)) {
            return null;
          }
          stackIn_15_0 = ak.field_j;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("di.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    static {
        field_j = "<%0> cannot join; the game is full.";
    }
}
