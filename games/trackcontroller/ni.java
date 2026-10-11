/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ni extends di {
    private lb field_o;
    static k field_n;
    static boolean[] field_m;

    final ud a(int param0, String param1) {
        eh var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        ud stackIn_6_0 = null;
        ud stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_o instanceof wk) {
            var3 = ((wk) ((Object) this.field_o)).a((byte) -109);
            if (var3 != null &&
              var3.a((byte) -120) != TrackController.field_G) {
              stackIn_6_0 = ef.field_b;
              return stackIn_6_0;
            }
          }
          if (param0 >= -106) {
            var4 = (String) null;
            this.a(124, (String) null);
          }
          if (!param1.equals(this.field_o.field_s)) {
            stackIn_12_0 = ef.field_b;
          } else {
            stackIn_12_0 = TrackController.field_G;
          }
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("ni.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final String a(String param0, int param1) {
        eh var3 = null;
        RuntimeException var3_ref = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        String stackIn_16_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_o instanceof wk) {
            var3 = ((wk) ((Object) this.field_o)).a((byte) -100);
            if (var3 != null) {
              if (var3.a((byte) 107) == TrackController.field_G &&
                !param0.equals(this.field_o.field_s)) {
                stackIn_8_0 = rb.field_c;
                return stackIn_8_0;
              }
              stackIn_10_0 = var3.c(15914);
              return stackIn_10_0;
            }
          }
          if (param1 != 426) {
            this.field_o = (lb) null;
          }
          if (param0.equals(this.field_o.field_s)) {
            return null;
          }
          stackIn_16_0 = rb.field_c;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("ni.B(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    ni(lb param0, lb param1) {
        super(param0);
        try {
          this.field_o = param1;
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "ni.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void g(int param0) {
        field_m = null;
        if (param0 != 112) {
          field_m = (boolean[]) null;
          field_n = null;
          return;
        }
        field_n = null;
    }

    final static void a(int param0, int param1) {
        try {
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          try {
            if (param0 > -115) {
              field_m = (boolean[]) null;
            }
            sj.a(gd.b((byte) 77), new Object[]{new Integer(param1)}, 7648, "resizing");
          } catch (java.lang.Throwable decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_m = new boolean[112];
    }
}
