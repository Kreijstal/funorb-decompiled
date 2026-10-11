/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ej extends ta {
    static volatile long field_jb;
    static int field_kb;

    final void c(lk param0, byte param1) {
        try {
          super.c(param0, (byte) 54);
          if (param1 < 28) {
            field_jb = 54L;
          }
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "ej.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static int r(int param0) {
        if (g.field_A < 2) {
          return 0;
        }
        if (0 != hf.field_I) {
          if (null != lb.field_a) {
            if (!lb.field_a.b(4)) {
              return 14;
            }
            if (!lb.field_a.c(0, "")) {
              return 29;
            }
            if (!lb.field_a.b(4, "")) {
              return 29;
            }
          }
          if (!jk.field_c.b(4)) {
            return 43;
          }
          if (!jk.field_c.b(4, "commonui")) {
            return 57;
          }
          if (!aa.field_db.b(4)) {
            return 71;
          }
          if (!aa.field_db.b(4, "commonui")) {
            return 80;
          }
          if (!sg.field_a.b(4)) {
            return 82;
          }
          if (!sg.field_a.a((byte) 32)) {
            return 86;
          }
        } else {
          if (!jk.field_c.b(4)) {
            return 20;
          }
          if (!jk.field_c.b(4, "commonui")) {
            return 40;
          }
          if (!aa.field_db.b(param0 ^ -6549)) {
            return 50;
          }
          if (!aa.field_db.b(4, "commonui")) {
            return 60;
          }
          if (!sg.field_a.b(4)) {
            return 70;
          }
          if (!sg.field_a.a((byte) 109)) {
            return 80;
          }
        }
        if (param0 == -6545) {
          return 100;
        }
        return 97;
    }

    ej(j param0, lk param1) {
        super(param0, param1, 33, 20, 30);
    }

    final static java.awt.Frame a(int param0, int param1, le param2, int param3, int param4, int param5) {
        int var8 = 0;
        Object stackIn_29_0 = null;
        Object stackIn_39_0 = null;
        java.awt.Frame stackIn_43_0 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        md[] var6 = null;
        RuntimeException var6_ref = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var9 = 0;
        md[] var10 = null;
        vi var11 = null;
        var9 = Main.field_T;
        try {
          if (!param2.b((byte) -124)) {
            return null;
          }
          if (0 == param4) {
            var10 = gf.a(-2, param2);
            var6 = var10;
            if (var6 == null) {
              return null;
            }
            var7_int = 0;
            for (var8 = 0; var8 < var10.length; var8++) {
              if (var10[var8].field_b == param3 &&
                param5 == var10[var8].field_a && ((param0 == 0 ||
                param0 == var10[var8].field_c) &&
                (var7_int == 0 ||
                !(var10[var8].field_d <= param4)))) {
                var7_int = 1;
                param4 = var10[var8].field_d;
              }
            }
            if (var7_int == 0) {
              stackIn_29_0 = null;
              return (java.awt.Frame) (stackIn_29_0);
            }
          }
          var11 = param2.a(param4, param5, param0, (byte) -30, param3);
          while (var11.field_a == 0) {
            wk.a((byte) -121, 10L);
          }
          var7 = (java.awt.Frame) (var11.field_e);
          if (var7 == null) {
            return null;
          }
          if (var11.field_a == 2) {
            rl.a(false, param2, var7);
            stackIn_39_0 = null;
            return (java.awt.Frame) (stackIn_39_0);
          }
          if (param1 != -3428) {
            field_kb = -115;
          }
          stackIn_43_0 = var7;
          return stackIn_43_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_46_0 = var6_ref;
          stackIn_46_1 = new StringBuilder().append("ej.EB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_46_0), ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static void a(byte param0, String param1, String param2, boolean param3) {
        try {
          ng.field_y = param1;
          ja.field_a = param2;
          ca.a(kj.field_q, param3, 16777215);
          if (param0 > -112) {
            String var5 = (String) null;
            ej.a((byte) -128, (String) null, (String) null, false);
          }
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "ej.DB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static void a(boolean param0, byte param1, boolean param2) {
        if (param1 != 55) {
          return;
        }
        if (!param0) {
          vj.d();
        } else {
          vj.a(0, 0, vj.field_l, vj.field_g, 0, 192);
        }
        ga.a(param0, param1 + 62);
    }

    static {
        field_jb = 0L;
    }
}
