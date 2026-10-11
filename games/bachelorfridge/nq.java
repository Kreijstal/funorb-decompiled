/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nq extends bw {
    int field_f;
    static String field_h;
    int field_g;

    final ad a(int param0, gj param1) {
        RuntimeException var3 = null;
        ad stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -27449) {
            this.field_f = -111;
          }
          stackIn_3_0 = param1.field_o[this.field_g][this.field_f];
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("nq.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final aga a(int param0, op param1) {
        aga var3 = null;
        RuntimeException var3_ref = null;
        aga stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 7) {
            nq.c((byte) -65);
          }
          var3 = param1.field_S[this.field_g].field_b[this.field_f];
          stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("nq.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void c(byte param0) {
        if (param0 != -115) {
          return;
        }
        field_h = null;
    }

    nq(aga param0) {
        this(param0.field_D, param0.field_u);
    }

    nq(int param0, int param1) {
        this.field_f = param1;
        this.field_g = param0;
    }

    static {
        field_h = "You do not have a suitable number of players for the current options.";
    }
}
