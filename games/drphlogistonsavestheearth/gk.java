/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gk {
    private nh[] field_c;
    static String field_b;
    static String field_a;

    public static void a(boolean param0) {
        field_a = null;
        if (param0) {
          fg var2 = (fg) null;
          gk.a((fg) null, 112);
          field_b = null;
          return;
        }
        field_b = null;
    }

    final static void a(fg param0, int param1) {
        int var2_int = 0;
        fg var3 = null;
        int var4 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          if (param0.field_i == null) {
            return;
          }
          if (param0.field_g != 0 ||
            param0.field_d != 0) {
            for (var2_int = 0; sf.field_e > var2_int; var2_int++) {
              var3 = mi.field_c[var2_int];
              if (2 == var3.field_a &&
                var3.field_g == param0.field_g &&
                param0.field_d == var3.field_d) {
                return;
              }
            }
          }
          if (param1 != -15980) {
            field_b = (String) null;
          }
          if (null == param0.field_e) {
          }
          ja.a(param0, (byte) -60);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("gk.C(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    gk(nh[] param0) {
        try {
          this.field_c = param0;
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "gk.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(int param0, String param1, String param2) {
        String var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          param1 = ph.a(param1, (byte) -21, '_', "");
          var3 = vj.a(param2, -121);
          if (param0 != -1) {
            field_a = (String) null;
          }
          stackIn_7_0 = (-1 != param1.indexOf(param2)) || (param1.indexOf(var3) != -1);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("gk.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param4 == 7453) {
          am.a(param3, param0, param2, this.field_c, 14673, param1);
          return;
        }
        fg var7 = (fg) null;
        gk.a((fg) null, -125);
        am.a(param3, param0, param2, this.field_c, 14673, param1);
    }

    final static String a(int param0) {
        String var1 = "";
        if (pi.field_O != null) {
          var1 = pi.field_O.b(false);
        }
        if (param0 == var1.length()) {
          var1 = am.h(0);
        }
        if (var1.length() == 0) {
          var1 = u.field_e;
        }
        return var1;
    }

    static {
        field_b = "Username: ";
        field_a = "OVER <%0>";
    }
}
