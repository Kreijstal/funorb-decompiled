/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rf extends da {
    static int field_l;
    static ch field_p;
    static si field_o;
    private kp field_r;
    static tq field_n;
    static int field_q;
    static int field_s;
    static String[][] field_m;

    public static void g(int param0) {
        field_m = (String[][]) null;
        field_n = null;
        if (param0 != 29492) {
          return;
        }
        field_o = null;
        field_p = null;
    }

    final String b(int param0, String param1) {
        of var3 = null;
        RuntimeException var3_ref = null;
        String stackIn_7_0 = null;
        String stackIn_9_0 = null;
        String stackIn_13_0 = null;
        Object stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_r instanceof ik) {
            var3 = ((ik) ((Object) this.field_r)).a((byte) -5);
            if (var3 != null) {
              if (var3.a(-23996) == qm.field_G &&
                !param1.equals(this.field_r.field_w)) {
                stackIn_7_0 = gl.field_a;
                return stackIn_7_0;
              }
              stackIn_9_0 = var3.d(param0 - 30797);
              return stackIn_9_0;
            }
          }
          if (!param1.equals(this.field_r.field_w)) {
            stackIn_13_0 = gl.field_a;
            return stackIn_13_0;
          }
          if (param0 == 3614) {
            return null;
          }
          field_q = 90;
          stackIn_17_0 = null;
          return (String) (stackIn_17_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("rf.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final ba a(int param0, String param1) {
        of var3 = null;
        RuntimeException var3_ref = null;
        ba stackIn_6_0 = null;
        ba stackIn_9_0 = null;
        ba stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_r instanceof ik) {
            var3 = ((ik) ((Object) this.field_r)).a((byte) -5);
            if (var3 != null &&
              var3.a(-23996) != qm.field_G) {
              stackIn_6_0 = ir.field_a;
              return stackIn_6_0;
            }
          }
          if (param0 != -1) {
            stackIn_9_0 = (ba) null;
            return stackIn_9_0;
          }
          if (param1.equals(this.field_r.field_w)) {
            stackIn_13_0 = qm.field_G;
          } else {
            stackIn_13_0 = ir.field_a;
          }
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("rf.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    rf(kp param0, kp param1) {
        super(param0);
        try {
          this.field_r = param1;
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "rf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_n = new tq(2);
    }
}
