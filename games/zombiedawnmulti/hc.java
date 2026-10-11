/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hc {
    static String field_a;
    static int field_c;
    static of field_b;

    final static ca a(boolean param0, byte[] param1) {
        ca var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        ca stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            stackIn_2_0 = null;
            return (ca) (stackIn_2_0);
          }
          if (!param0) {
            field_c = -66;
          }
          var2 = new ca(param1, k.field_i, qj.field_o, oq.field_w, vj.field_p, tp.field_t, qp.field_t);
          fd.h((byte) 125);
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("hc.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
          hc.a(44);
          field_a = null;
          field_b = null;
          return;
        }
        field_a = null;
        field_b = null;
    }

    final static ja[] a(ja[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        ja var3 = null;
        int var4 = 0;
        ja[] stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          for (var2_int = param1; param0.length > var2_int; var2_int++) {
            var3 = param0[var2_int];
            param0[var2_int].field_y = 0;
            var3.field_r = 0;
            param0[var2_int].field_z = param0[var2_int].field_x;
            param0[var2_int].field_u = param0[var2_int].field_w;
          }
          stackIn_5_0 = (ja[]) (param0);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("hc.D(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final static ae a(int param0, ga param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        ae stackIn_2_0 = null;
        aj stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            stackIn_2_0 = (ae) null;
            return stackIn_2_0;
          }
          var2_int = param1.d((byte) 69);
          var3 = param1.d((byte) 69);
          stackIn_4_0 = new aj(var2_int, var3);
          return (ae) ((Object) stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("hc.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    static {
        field_a = "Tough";
    }
}
