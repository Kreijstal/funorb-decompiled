/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gm {
    static String field_b;
    static String[] field_c;
    static String field_a;

    final static String a(byte param0, CharSequence param1) {
        RuntimeException var2 = null;
        String var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 79) {
            var3 = (String) null;
            gm.a(112, (String) null, (String) null);
          }
          stackIn_3_0 = ce.a((byte) -119, false, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("gm.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static boolean a(int param0, String param1, String param2) {
        int var3_int = 0;
        String var4 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var3_int = 114 / ((param0 - 55) / 42);
          param1 = cn.a((byte) -103, "", '_', param1);
          var4 = mq.a(param1, false);
          stackIn_5_0 = (param2.indexOf(param1) != -1) || (param2.indexOf(var4) != -1);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("gm.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final static void a(int param0, byte param1) {
        ae[] var3 = null;
        ae[] var2 = null;
        ae[] var3Lifetime1;
        ae[] var2Lifetime1;
        if (param1 != -55) {
          gm.a(58, (byte) -65);
          var3 = on.field_b[param0];
          var2 = var3;
          if (1 == var3.length) {
            e.a(on.field_b[param0][0], false);
            return;
          }
          e.a(var3[be.a(var3.length, (byte) 83)], false);
          return;
        }
        var3Lifetime1 = on.field_b[param0];
        var2Lifetime1 = var3Lifetime1;
        if (1 == var3Lifetime1.length) {
          e.a(on.field_b[param0][0], false);
          return;
        }
        e.a(var3Lifetime1[be.a(var3Lifetime1.length, (byte) 83)], false);
    }

    final static ej[] a(int param0) {
        if (param0 == 7554) {
          return new ej[]{li.field_j, la.field_i, ne.field_N};
        }
        field_a = (String) null;
        return new ej[]{li.field_j, la.field_i, ne.field_N};
    }

    final static void a(java.applet.Applet param0, byte param1) {
        try {
          java.net.URL var2 = null;
          RuntimeException var2_ref = null;
          java.applet.Applet var3 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref2 = null;
          try {
            try {
              var2 = new java.net.URL(param0.getCodeBase(), "tosupport.ws");
              param0.getAppletContext().showDocument(ar.a(param0, var2, 0), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref2 = (Exception) (Object) decompiledCaughtException;
              var2_ref2.printStackTrace();
            }
            if (param1 <= -114) {
              return;
            }
            var3 = (java.applet.Applet) null;
            gm.a((java.applet.Applet) null, (byte) 34);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref;
            stackIn_8_1 = new StringBuilder().append("gm.B(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw wn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(int param0) {
        field_a = null;
        field_b = null;
        field_c = null;
        if (param0 != 0) {
          field_b = (String) null;
        }
    }

    static {
        field_a = "Start Game";
        field_b = "Only show private chat from my friends and opponents";
    }
}
