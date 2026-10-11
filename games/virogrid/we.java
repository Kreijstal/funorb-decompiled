/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class we {
    static String field_i;
    static String field_b;
    static String field_f;
    static int field_l;
    static int field_a;
    static km field_c;
    static mg field_e;
    static float field_k;
    static int field_d;
    static int field_h;
    static String field_j;
    static volatile int field_g;

    final static void a(int param0) {
        try {
          Throwable decompiledCaughtException = null;
          java.lang.reflect.Method var1 = null;
          Exception var1_ref = null;
          Runtime var2 = null;
          Throwable var2_ref = null;
          Long var3 = null;
          Object[] var4 = null;
          if (param0 != 1) {
            we.a(false, true);
          }
          try {
            var1 = Runtime.class.getMethod("maxMemory", new Class[]{});
            if (var1 != null) {
              try {
                var2 = Runtime.getRuntime();
                var4 = (Object[]) null;
                var3 = (Long) (var1.invoke((Object) (var2), (Object[]) null));
                qk.field_b = 1 + (int)(var3.longValue() / 1048576L);
                return;
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = decompiledCaughtException;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var1_ref = (Exception) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 == -104) {
          field_c = null;
          field_e = null;
          field_j = null;
          field_f = null;
          field_i = null;
          return;
        }
        field_b = (String) null;
        field_c = null;
        field_e = null;
        field_j = null;
        field_f = null;
        field_i = null;
    }

    final static void a(boolean param0, boolean param1) {
        if (ag.c(-116)) {
          param1 = false;
        }
        vm.a((byte) 32, param1);
        if (!param0) {
          rn.a(-26808);
          return;
        }
        field_k = -1.6507269144058228f;
        rn.a(-26808);
    }

    final static boolean a(byte param0, String param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 1) {
            we.a(64);
          }
          if (param1 != null &&
            param1.length() >= jc.field_m &&
            param1.length() <= hh.field_c) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("we.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void a(int param0, byte param1, String param2, int param3, String param4) {
        try {
          di.field_n.field_K = di.field_n.field_K + wa.field_I.field_K;
          di.field_n.field_eb = param4;
          if (param1 != 21) {
            we.a(-38);
          }
          di.field_n.field_V = param2;
          di.field_n.field_E = param0;
          wa.field_I.field_tb = wa.field_I.field_tb + wa.field_I.field_K;
          wa.field_I.field_K = param3;
          di.field_n.field_K = di.field_n.field_K - wa.field_I.field_K;
          wa.field_I.field_tb = wa.field_I.field_tb - wa.field_I.field_K;
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "we.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_i = "Report abuse";
        field_b = "Graphics: ";
        field_k = 0.0f;
        field_f = "Create unrated game";
        field_j = "Loading fonts";
        field_h = 2048;
        field_d = 20;
        field_g = 0;
    }
}
