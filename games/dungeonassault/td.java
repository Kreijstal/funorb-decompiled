/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class td {
    static String field_b;
    static boolean field_c;
    static String field_d;
    static java.awt.Font field_a;

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 < 7) {
          field_b = (String) null;
          field_d = null;
          return;
        }
        field_d = null;
    }

    final static void a(int param0, int param1) {
        wk.c(false);
        if (param1 <= 120) {
          String var3 = (String) null;
          td.a((String) null, true, false, (String) null, (rg) null, -5, (String) null);
        }
    }

    final static boolean a(String param0, boolean param1, boolean param2, String param3, rg param4, int param5, String param6) {
        RuntimeException var7 = null;
        jb var8 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ol.field_i != sp.field_e) {
            return false;
          }
          if (!param2) {
            td.a(91);
          }
          var8 = new jb(lg.field_w, param4);
          lg.field_w.a(var8, -1);
          if (rg.i((byte) -125)) {
            var8.r(102);
            return true;
          }
          field_d = param0;
          mh.field_b = null;
          in.field_E = param1;
          wk.field_g = param5;
          he.field_m = param6;
          ol.field_i = ql.field_f;
          ho.field_i = param3;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_16_0 = var7;
          stackIn_16_1 = new StringBuilder().append("td.B(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param4 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    static {
        field_b = "Passwords must be between 5 and 20 letters and numbers";
        field_c = false;
    }
}
