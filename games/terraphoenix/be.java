/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class be extends wc {
    static String field_y;
    static int field_v;
    static ci field_u;
    static pk field_x;
    static String field_w;
    private Object field_t;

    final static boolean a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= 19) {
            stackIn_4_0 = sa.a(false, 0, param0);
            return stackIn_4_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("be.H(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean d(int param0) {
        if (param0 < 12) {
          return false;
        }
        return false;
    }

    final Object d(byte param0) {
        if (param0 >= -118) {
          field_v = 77;
          return this.field_t;
        }
        return this.field_t;
    }

    final static void a(java.applet.Applet param0, int param1) {
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
              var2 = new java.net.URL(param0.getCodeBase(), "toserverlist.ws");
              param0.getAppletContext().showDocument(bb.a((byte) 116, var2, param0), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref2 = (Exception) (Object) decompiledCaughtException;
              var2_ref2.printStackTrace();
            }
            if (param1 <= -13) {
              return;
            }
            var3 = (java.applet.Applet) null;
            be.a((java.applet.Applet) null, 36);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref;
            stackIn_8_1 = new StringBuilder().append("be.I(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw qk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static ci[] a(int param0, int param1, int param2, int param3, int param4) {
        ci[] var6 = new ci[9];
        ci[] var5 = var6;
        ci dupTemp$0 = nb.a(param3, param1, 126);
        var6[6] = dupTemp$0;
        var5[3] = dupTemp$0;
        var5[2] = dupTemp$0;
        var5[1] = dupTemp$0;
        var5[0] = dupTemp$0;
        ci dupTemp$1 = nb.a(param3, param4, 123);
        var6[8] = dupTemp$1;
        var5[7] = dupTemp$1;
        var5[5] = dupTemp$1;
        if (param2 != 0) {
          var6[4] = nb.a(64, param2, 118);
          if (param0 < 61) {
            be.a(-105, 79, -25, -58, -88);
            return var5;
          }
          return var5;
        }
        if (param0 >= 61) {
          return var5;
        }
        be.a(-105, 79, -25, -58, -88);
        return var5;
    }

    public static void e(byte param0) {
        field_w = null;
        int var1 = -77 / ((55 - param0) / 36);
        field_u = null;
        field_x = null;
        field_y = null;
    }

    be(Object param0, int param1) {
        super(param1);
        try {
          this.field_t = param0;
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "be.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_y = "Type your password again to make sure it's correct";
        field_v = 480;
        field_w = "Waiting for graphics";
    }
}
