/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jc {
    static hm field_e;
    static int field_h;
    static String field_f;
    static String field_d;
    static String field_g;
    static boolean field_c;
    static ia field_j;
    static int[] field_i;
    static String field_b;
    static di field_a;

    public static void a(int param0) {
        field_a = null;
        field_f = null;
        field_e = null;
        if (param0 == 0) {
          field_g = null;
          field_j = null;
          field_d = null;
          field_b = null;
          field_i = null;
          return;
        }
    }

    final static void a(int param0, java.applet.Applet param1, String param2, boolean param3) {
        try {
          java.net.MalformedURLException var4 = null;
          RuntimeException var4_ref = null;
          String var5 = null;
          RuntimeException stackIn_10_0 = null;
          StringBuilder stackIn_10_1 = null;
          String stackIn_11_2 = null;
          StringBuilder stackIn_13_1 = null;
          String stackIn_14_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (sj.field_w.startsWith("win") &&
              ll.a(param2, param0 ^ -10570)) {
              return;
            }
            try {
              param1.getAppletContext().showDocument(new java.net.URL(param2), "_blank");
              if (param0 == -10553) {
                return;
              }
              var5 = (String) null;
              jc.a(113, (String) null, 'h');
              return;
            } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4 = (java.net.MalformedURLException) (Object) decompiledCaughtException;
              tc.a((Throwable) null, "MGR1: " + param2, -8555);
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_10_0 = var4_ref;
            stackIn_10_1 = new StringBuilder().append("jc.C(").append(param0).append(',');
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
            throw wm.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, java.awt.Component param1) {
        try {
          param1.setFocusTraversalKeysEnabled(false);
          param1.addKeyListener(wn.field_a);
          param1.addFocusListener(wn.field_a);
          if (param0 != 0) {
            String var3 = (String) null;
            jc.a(-84, (java.applet.Applet) null, (String) null, false);
          }
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "jc.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static String[] a(int param0, String param1, char param2) {
        int incrementValue$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        CharSequence var10 = null;
        String[] stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var10 = (CharSequence) ((Object) param1);
          var3_int = pl.a(var10, -115, param2);
          var4 = new String[var3_int + 1];
          var5 = 0;
          var6 = 0;
          var7 = 0;
          if (param0 != 30634) {
            var9 = (String) null;
            jc.a(111, (java.applet.Applet) null, (String) null, false);
          }
          while (var3_int > var7) {
            for (var8 = var6; param2 != param1.charAt(var8); var8++) {
            }
            incrementValue$1 = var5;
            var5++;
            var4[incrementValue$1] = param1.substring(var6, var8);
            var6 = 1 + var8;
            var7++;
          }
          var4[var3_int] = param1.substring(var6);
          stackIn_8_0 = var4;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("jc.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_g = "Accept";
        field_f = "ON";
        field_b = "You are invited to <%0>'s game.";
        field_d = "Please log in as a subscribing member to access this feature.";
    }
}
