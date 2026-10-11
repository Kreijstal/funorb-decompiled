/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nn {
    static um field_c;
    static String field_b;
    static w field_a;

    final static void a(int param0, ui param1, boolean param2) {
        Object var3 = null;
        Throwable var4 = null;
        Object stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          if (!param2) {
            field_c = (um) null;
          }
          var3 = km.field_z;
          synchronized (var3) {
            if (null != wj.field_Ob) {
              sh.field_a.c(wj.field_Ob);
              wj.field_Ob = null;
            }
            if (param1 != null) {
              wj.field_Ob = new ia(param1);
              wj.field_Ob.a(a.field_g * 50 / 128);
              wj.field_Ob.c(param0);
              sh.field_a.a(wj.field_Ob);
            }
            km.field_z.a();
            rc.field_d = param1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("nn.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw dh.a((Throwable) (stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        field_a = null;
        if (param0 != 14925) {
          nn.a(-43);
        }
    }

    final static boolean a(boolean param0, String param1, String param2) {
        String var3 = null;
        boolean stackIn_14_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = oa.a(param1, -1);
          if (param0) {
            field_c = (um) null;
          }
          if (param2.indexOf(param1) == -1 &&
            -1 == param2.indexOf(var3)) {
            stackIn_14_0 = (param2.startsWith(param1)) || (param2.startsWith(var3)) || (param2.endsWith(param1)) || (param2.endsWith(var3));
            return stackIn_14_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("nn.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    static {
        field_c = new um();
        field_b = "Please remove <%0> from your friend list first.";
    }
}
