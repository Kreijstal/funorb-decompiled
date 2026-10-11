/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ef extends sj {
    static int field_tb;
    static int field_sb;
    static String field_ub;
    static int field_vb;
    static String field_wb;

    final void a(fj param0, byte param1) {
        try {
          super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "ef.HA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    ef(sh param0, fj param1) {
        super(param0, param1, 33, 20, 30);
    }

    final static boolean a(int param0, String param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != null &&
            param1.length() >= gb.field_d) {
            if (param1.length() > oj.field_x) {
              return true;
            }
            if (param0 < 58) {
              field_vb = 90;
            }
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("ef.JA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public static void n(int param0) {
        field_wb = null;
        if (param0 <= 94) {
          ef.n(-3);
          field_ub = null;
          return;
        }
        field_ub = null;
    }

    static {
        field_tb = 0;
        field_wb = "Names should contain a maximum of 12 characters";
        field_ub = "Difficulty: ";
    }
}
