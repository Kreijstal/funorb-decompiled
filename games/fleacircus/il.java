/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class il {
    static dd[] field_d;
    static rh field_a;
    String field_e;
    static int[] field_f;
    static int field_h;
    String field_b;
    static int[] field_c;
    static int field_g;
    boolean field_i;

    final static void b(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2_int = 0;
        Object var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        dd var6 = null;
        dd var7 = null;
        dd var8 = null;
        int var3Lifetime1;
        var4 = fleas.field_A ? 1 : 0;
        try {
          gb.b(243, 197, 369, 143, 16777215);
          gb.e(244, param0, 367, 141, 0);
          if (null == wa.field_k) {
            if (qj.field_H != null) {
              qj.field_H.a(jg.field_a, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
            }
            return;
          }
          var6 = wa.field_k[ql.field_o];
          if (var6 == null) {
            if (qj.field_H != null) {
              qj.field_H.a(jg.field_a, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
            }
          } else {
            var6.d(245, 199);
          }
          if (td.field_i < hd.field_c) {
            var7 = wa.field_k[t.field_a];
            if (var7 != null) {
              var2_int = td.field_i * (60 + var7.field_x) / hd.field_c;
              var3 = var2_int - 30;
              if (!rc.field_i) {
                d.a(var3 * -256 / 30, 199, var7, 245, 2147483647, 256 * (-var3 + var7.field_x) / 30);
              } else {
                d.a((-var3 + var7.field_x) * 256 / 30, 199, var7, 245, 2147483647, -256 * var3 / 30);
              }
            }
          }
          if (null != qj.field_H) {
            var2 = null;
            var5 = 0;
            var3Lifetime1 = var5;
            while (wa.field_k.length > var5) {
              var8 = wa.field_k[var5];
              if (var8 != null && (var8.field_x != 365 ||
                var8.field_r != 139)) {
                if (var2 != null) {
                  var2 = (String) (var2) + ", " + var5;
                } else {
                  var2 = Integer.toString(var5);
                }
              }
              var5++;
            }
            if (var2 == null) {
              return;
            }
            qj.field_H.a("Screenshot(s) " + (String) (var2) + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var1), "il.E(" + param0 + ')');
        }
    }

    final static boolean a(byte param0) {
        int var1 = -34 / ((-35 - param0) / 60);
        return uk.b(15000);
    }

    public static void a(int param0) {
        field_a = null;
        field_d = null;
        field_c = null;
        field_f = null;
        if (param0 > -68) {
          java.applet.Applet var2 = (java.applet.Applet) null;
          il.a((byte) 45, (java.applet.Applet) null);
        }
    }

    final static void a(boolean param0, java.awt.Component param1) {
        if (param0) {
          return;
        }
        try {
          param1.addMouseListener(sg.field_i);
          param1.addMouseMotionListener(sg.field_i);
          param1.addFocusListener(sg.field_i);
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "il.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
          java.net.URL var2 = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (param0 != 77) {
              return;
            }
            try {
              var2 = new java.net.URL(param1.getCodeBase(), "subscribe.ws");
              param1.getAppletContext().showDocument(ib.a(param1, var2, param0 ^ -5390), "_top");
              return;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref2;
            stackIn_8_1 = new StringBuilder().append("il.C(").append(param0).append(',');
            if (param1 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw pf.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_h = -1;
        field_f = new int[4];
        field_c = new int[8192];
    }
}
