/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kg extends ca {
    static String field_g;
    static ge field_h;
    static pc field_j;
    static int field_m;
    static int[] field_i;
    int field_k;
    static int field_f;
    static String field_l;

    public static void c(int param0) {
        field_j = null;
        field_l = null;
        field_h = null;
        field_g = null;
        field_i = null;
        if (param0 <= 87) {
          field_m = 122;
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, int[] param4, int param5, int param6) {
        try {
          if (param3 >= -73) {
            field_h = (ge) null;
          }
          vh.field_q[param5] = param4;
          im.field_a[param5] = param0;
          vb.field_g[param5] = param1;
          wd.field_o[param5] = param6;
          ek.field_e[param5] = param2;
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "kg.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static void a(int param0, byte param1, int param2, java.awt.Canvas param3) {
        java.awt.Graphics var4 = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          try {
            var4 = param3.getGraphics();
            if (param1 != -83) {
              return;
            }
            cb.field_a.a(param2, param0, var4, true);
            var4.dispose();
            return;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var4_ref = (Exception) (Object) decompiledCaughtException;
            param3.repaint();
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_8_0 = var4_ref2;
          stackIn_8_1 = new StringBuilder().append("kg.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static int a(String param0, String param1, int param2, int param3, String param4, int param5, boolean param6) {
        ee var7 = null;
        RuntimeException var7_ref = null;
        ee var8 = null;
        java.awt.Canvas var9 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7 = new ee(param0);
          var8 = new ee(param4);
          if (param5 != 200) {
            var9 = (java.awt.Canvas) null;
            kg.a(-118, (byte) 38, -74, (java.awt.Canvas) null);
          }
          stackIn_3_0 = jk.a(param3, param2, var8, param1, var7, param6, -23739);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_6_0 = var7_ref;
          stackIn_6_1 = new StringBuilder().append("kg.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    kg(int param0) {
        this.field_k = param0;
    }

    static {
        field_f = 200;
        field_g = "Connection lost. <%0>";
        field_l = "ELECTROSHOCK";
    }
}
