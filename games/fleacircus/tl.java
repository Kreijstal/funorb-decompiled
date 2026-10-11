/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tl extends r {
    private c field_n;
    static int field_o;
    static fa field_p;

    public static void c(byte param0) {
        if (param0 <= 50) {
          return;
        }
        field_p = null;
    }

    final String a(byte param0, String param1) {
        jb var3 = null;
        int var3_int = 0;
        RuntimeException var3_ref = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        String stackIn_11_0 = null;
        Object stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_n instanceof nh) {
            var3 = ((nh) ((Object) this.field_n)).a((byte) 112);
            if (var3 != null) {
              if (var3.a(false) == hm.field_b &&
                !param1.equals(this.field_n.field_i)) {
                stackIn_5_0 = al.field_c;
                return stackIn_5_0;
              }
              stackIn_7_0 = var3.b(126);
              return stackIn_7_0;
            }
          }
          if (!param1.equals(this.field_n.field_i)) {
            stackIn_11_0 = al.field_c;
            return stackIn_11_0;
          }
          var3_int = -127 / ((24 - param0) / 46);
          stackIn_13_0 = null;
          return (String) (stackIn_13_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("tl.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final wd a(int param0, String param1) {
        jb var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        wd stackIn_8_0 = null;
        wd stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 160) {
            var4 = (String) null;
            this.a((byte) -48, (String) null);
          }
          if (this.field_n instanceof nh) {
            var3 = ((nh) ((Object) this.field_n)).a((byte) 85);
            if (var3 != null &&
              var3.a(false) != hm.field_b) {
              stackIn_8_0 = ml.field_K;
              return stackIn_8_0;
            }
          }
          if (param1.equals(this.field_n.field_i)) {
            stackIn_12_0 = hm.field_b;
          } else {
            stackIn_12_0 = ml.field_K;
          }
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("tl.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    tl(c param0, c param1) {
        super(param0);
        try {
          this.field_n = param1;
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "tl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_o = 0;
    }
}
