/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qb extends lk {
    static int field_k;
    static String field_l;

    qb(ae param0) {
        super(param0);
    }

    final static ci f(int param0) {
        if (param0 != -17887) {
          field_l = (String) null;
          return (ci) ((Object) new rc());
        }
        return (ci) ((Object) new rc());
    }

    final cg a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        cg stackIn_2_0 = null;
        int stackIn_6_0 = 0;
        cg stackIn_8_0 = null;
        cg stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 10) {
            stackIn_2_0 = (cg) null;
            return stackIn_2_0;
          }
          stackIn_6_0 = (null != i.a(108, param1)) ? 0 : 1;
          var3_int = stackIn_6_0;
          if (var3_int != 0) {
            stackIn_10_0 = lg.field_c;
            return stackIn_10_0;
          }
          stackIn_8_0 = qj.field_c;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("qb.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final String b(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a((byte) 115, param1) == qj.field_c) {
            stackIn_2_0 = s.field_g;
            return stackIn_2_0;
          }
          var3_int = -30 % ((20 - param0) / 40);
          stackIn_4_0 = oe.field_b;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("qb.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public static void g(int param0) {
        field_l = null;
        if (param0 != 21403) {
          qb.e((byte) -110);
        }
    }

    final static boolean e(byte param0) {
        if (param0 != 58) {
          qb.f(-36);
          if (null == ob.field_b) {
            return false;
          }
          if (sl.field_d.b(48)) {
            return true;
          }
          return false;
        }
        if (null == ob.field_b) {
          return false;
        }
        if (sl.field_d.b(48)) {
          return true;
        }
        return false;
    }

    static {
        field_k = 0;
        field_l = "Retry";
    }
}
