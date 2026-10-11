/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pg {
    static boolean field_c;
    static String field_d;
    static sb field_b;
    static boolean[] field_a;

    public static void a(boolean param0) {
        if (!param0) {
          field_b = null;
          field_d = null;
          field_a = null;
          return;
        }
        field_d = (String) null;
        field_b = null;
        field_d = null;
        field_a = null;
    }

    final static void a(int param0) {
        int var2 = 0;
        int var1 = hj.a(24777);
        if (param0 == 0) {
          var2 = nd.a(-21065);
          cf.field_g.a(jl.field_a - td.field_a, -gh.field_H + bb.field_b, var1 + (gh.field_H << 1), -21907, var2 + (td.field_a << 1));
          ti.l(6);
          return;
        }
    }

    final static boolean a(int param0, gh param1, String param2, int param3, String param4, String param5, boolean param6) {
        RuntimeException var7 = null;
        sd var8 = null;
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
          if (wj.field_a != fh.field_B) {
            return false;
          }
          var8 = new sd(q.field_N, param1);
          q.field_N.b(var8, false);
          if (param0 != 2) {
            pg.a(103);
          }
          if (wi.e((byte) 104)) {
            var8.j((byte) -52);
            return true;
          }
          je.field_a = param2;
          cg.field_a = param3;
          ci.field_L = null;
          fh.field_B = qg.field_g;
          ej.field_b = param5;
          ij.field_a = param6;
          eb.field_z = param4;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_16_0 = var7;
          stackIn_16_1 = new StringBuilder().append("pg.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param5 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param6).append(')').toString());
        }
    }

    final static void a(byte param0, Object param1, si param2) {
        int var3_int = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        var4 = Bounce.field_N;
        try {
          if (null == param2.field_e) {
            return;
          }
          for (var3_int = 0; var3_int < 50; var3_int++) {
            if (null != param2.field_e.peekEvent()) {
              wh.a(1L, 19406);
              continue;
            }
            break;
          }
          if (param0 >= -85) {
            field_b = (sb) null;
          }
          try {
            if (param1 == null) {
              return;
            }
            param2.field_e.postEvent((java.awt.AWTEvent) ((Object) new java.awt.event.ActionEvent(param1, 1001, "dummy")));
            return;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("pg.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    static {
        field_c = true;
        field_d = "You have 1 unread message!";
        field_b = new sb(2);
    }
}
