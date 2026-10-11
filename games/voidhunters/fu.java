/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fu extends rqa {
    static jra field_o;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -119) {
            fu.e((byte) -53);
          }
          stackIn_3_0 = new nc(ew.field_o);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("fu.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean a(int param0) {
        if (param0 < 43) {
          field_o = (jra) null;
          if (ef.field_z < 20) {
            return true;
          }
          if (!eu.a(true)) {
            return true;
          }
          if (jl.field_p <= 0) {
            return false;
          }
          if (!nua.b(true)) {
            return true;
          }
          return false;
        }
        if (ef.field_z < 20) {
          return true;
        }
        if (!eu.a(true)) {
          return true;
        }
        if (jl.field_p <= 0) {
          return false;
        }
        if (!nua.b(true)) {
          return true;
        }
        return false;
    }

    fu(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void e(byte param0) {
        if (param0 >= -121) {
          return;
        }
        field_o = null;
    }

    static {
        field_o = new jra();
    }
}
