/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fi extends di {
    static int field_q;
    static String field_n;
    static rh field_p;
    static ue field_m;
    static String field_o;

    fi(ej param0) {
        super(param0);
    }

    final im b(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        im stackIn_5_0 = null;
        im stackIn_8_0 = null;
        im stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_3_0 = (null != bi.a(-29456, param0)) ? 0 : 1;
          var3_int = stackIn_3_0;
          if (param1 != 0) {
            stackIn_5_0 = (im) null;
            return stackIn_5_0;
          }
          if (var3_int != 0) {
            stackIn_10_0 = dg.field_c;
            return stackIn_10_0;
          }
          stackIn_8_0 = qf.field_d;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("fi.C(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_p = null;
        if (!param0) {
          return;
        }
        field_m = null;
        field_n = null;
        field_o = null;
    }

    final String a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.b(param0, 0) == qf.field_d) {
            stackIn_3_0 = pb.field_c;
            return stackIn_3_0;
          }
          var3_int = -41 % ((26 - param1) / 56);
          stackIn_5_0 = vd.field_p;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("fi.B(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_n = "Equip ";
        field_p = new rh(11, 0, 1, 2);
    }
}
