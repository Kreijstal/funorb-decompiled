/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ta {
    static String field_b;
    static String field_a;

    final static void a(String param0, boolean param1, int param2) {
        try {
          fd.field_k = true;
          ok.field_h = param1 ? true : false;
          nb.field_b = new si(jl.field_I, be.field_x, param0, qi.field_b, ok.field_h);
          if (param2 != 10) {
            CharSequence var4 = (CharSequence) null;
            ta.a((CharSequence) null, 126);
          }
          jl.field_I.a((gl) (nb.field_b), (byte) -1);
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "ta.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(boolean param0) {
        if (param0) {
          return;
        }
        field_a = null;
        field_b = null;
    }

    final static pd a(boolean param0, String param1) {
        RuntimeException var2 = null;
        pd stackIn_5_0 = null;
        pd stackIn_9_0 = null;
        Object stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (pe.field_a == ua.field_d) {
            return null;
          }
          if (!param0) {
            stackIn_5_0 = (pd) null;
            return stackIn_5_0;
          }
          if (pe.field_a == k.field_b &&
            param1.equals(vh.field_l)) {
            pe.field_a = og.field_a;
            stackIn_9_0 = h.field_c;
            return stackIn_9_0;
          }
          h.field_c = null;
          vh.field_l = param1;
          pe.field_a = ua.field_d;
          stackIn_11_0 = null;
          return (pd) (stackIn_11_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("ta.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static int a(CharSequence param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 23 % ((param1 - 65) / 45);
          stackIn_1_0 = wl.a(true, param0, false, 10);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("ta.D(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0) {
        int var1 = -81 / ((-80 - param0) / 38);
    }

    static {
        field_a = "Out of ammo";
        field_b = "Difficulty: Normal";
    }
}
