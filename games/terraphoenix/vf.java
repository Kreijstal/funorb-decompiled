/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vf {
    static String field_b;
    static o field_c;
    static int field_a;

    final static boolean a(pl param0, String param1, boolean param2, int param3, boolean param4, String param5, String param6) {
        tj var7 = null;
        RuntimeException var7_ref = null;
        tj var8 = null;
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
          if (og.field_a != qe.field_f) {
            return false;
          }
          var8 = new tj(jl.field_I, param0);
          var7 = var8;
          jl.field_I.a((gl) (var8), (byte) -1);
          if (param4) {
            return true;
          }
          if (va.b(41108)) {
            var8.q(127);
            return true;
          }
          wl.field_Q = null;
          oe.field_a = param1;
          ra.field_m = param5;
          cg.field_H = param6;
          nf.field_c = param2;
          qe.field_f = ua.field_d;
          wf.field_q = param3;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_16_0 = var7_ref;
          stackIn_16_1 = new StringBuilder().append("vf.B(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param6 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 == 29227) {
          field_b = null;
          return;
        }
        String var2 = (String) null;
        vf.a((String) null, (String) null, (fa) null, (String) null, 121);
        field_b = null;
    }

    final static void a(String param0, int param1) {
        try {
          uc.b(121, param0);
          ta.a(fh.field_x, false, 10);
          if (param1 < 7) {
            field_a = 60;
          }
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "vf.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static String a(String param0, String param1, fa param2, String param3, int param4) {
        RuntimeException var5 = null;
        String stackIn_3_0 = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param2.a(param4 ^ param4)) {
            stackIn_3_0 = (String) (param3);
            return stackIn_3_0;
          }
          stackIn_5_0 = param1 + " - " + param2.b(param4 - 4708, param0) + "%";
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("vf.D(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_b = "Discard";
        field_c = new o();
    }
}
