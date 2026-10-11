/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob {
    static String[] field_e;
    static String field_d;
    static int field_a;
    static nh[] field_f;
    static vb field_b;
    static int field_c;
    static int field_g;

    public static void a(byte param0) {
        if (param0 < 49) {
          field_f = (nh[]) null;
        }
        field_e = null;
        field_d = null;
        field_b = null;
        field_f = null;
    }

    final static nh[] a(int param0, int param1, vj param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_4_0 = null;
        nh[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -13339) {
            field_b = (vb) null;
          }
          if (fl.a(param0, param2, param3, (byte) -98)) {
            stackIn_6_0 = vd.b((byte) -22);
            return stackIn_6_0;
          }
          stackIn_4_0 = null;
          return (nh[]) (stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("ob.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    final static String a(byte param0, java.applet.Applet param1) {
        try {
          int var6 = 0;
          String var3 = null;
          String var4 = null;
          String[] var5 = null;
          int var7 = 0;
          int var8 = 0;
          java.applet.Applet var9 = null;
          String var10 = null;
          String stackIn_9_0 = null;
          String stackIn_15_0 = null;
          String stackIn_17_0 = null;
          RuntimeException stackIn_20_0 = null;
          StringBuilder stackIn_20_1 = null;
          String stackIn_21_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          RuntimeException var2_ref = null;
          var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          try {
            try {
              if (param0 <= 73) {
                var9 = (java.applet.Applet) null;
                ob.a((byte) -24, (java.applet.Applet) null);
              }
              var10 = param1.getParameter("cookieprefix");
              var3 = var10 + "settings";
              var4 = (String) (pb.a("getcookies", param1, true));
              var5 = ki.a((byte) -115, ';', var4);
              for (var6 = 0; var6 < var5.length; var6++) {
                var7 = var5[var6].indexOf('=');
                if (0 <= var7 &&
                  var5[var6].substring(0, var7).trim().equals(var3)) {
                  stackIn_9_0 = var5[var6].substring(var7 + 1).trim();
                  return stackIn_9_0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
            }
            if (null == ih.field_J) {
              stackIn_17_0 = param1.getParameter("settings");
              return stackIn_17_0;
            }
            stackIn_15_0 = ih.field_J;
            return stackIn_15_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_20_0 = var2_ref;
            stackIn_20_1 = new StringBuilder().append("ob.B(").append(param0).append(',');
            if (param1 == null) {
              stackIn_21_2 = "null";
            } else {
              stackIn_21_2 = "{...}";
            }
            throw ie.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_e = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
        field_g = 0;
        field_b = null;
        field_d = "Passwords must be between 5 and 20 letters and numbers";
    }
}
