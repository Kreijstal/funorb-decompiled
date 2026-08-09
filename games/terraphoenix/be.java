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
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 >= 19) {
              stackIn_4_0 = sa.a(false, 0, param0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("be.H(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
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
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            Exception var2_ref2 = null;
            try {
              L0: {
                try {
                  L1: {
                    var2 = new java.net.URL(param0.getCodeBase(), "toserverlist.ws");
                    param0.getAppletContext().showDocument(bb.a((byte) 116, var2, param0), "_top");
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var2_ref2 = (Exception) (Object) decompiledCaughtException;
                    var2_ref2.printStackTrace();
                    break L2;
                  }
                }
                if (param1 <= -13) {
                  break L0;
                } else {
                  var3 = (java.applet.Applet) null;
                  be.a((java.applet.Applet) null, 36);
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var2_ref);

                stackIn_8_1 = new StringBuilder().append("be.I(");

                if (param0 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "null";
                  break L3;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "{...}";
                  break L3;
                }
              }
              throw qk.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static ci[] a(int param0, int param1, int param2, int param3, int param4) {
        ci[] var5;
        ci[] var6;
        var6 = new ci[9];
        var5 = var6;
        ci dupTemp$2 = nb.a(param3, param1, 126);
        var6[6] = dupTemp$2;
        var5[3] = dupTemp$2;
        var5[2] = dupTemp$2;
        var5[1] = dupTemp$2;
        var5[0] = dupTemp$2;
        ci dupTemp$3 = nb.a(param3, param4, 123);
        var6[8] = dupTemp$3;
        var5[7] = dupTemp$3;
        var5[5] = dupTemp$3;
        if (param2 == 0) {
          if (param0 < 61) {
            be.a(-105, 79, -25, -58, -88);
            return var5;
          } else {
            return var5;
          }
        } else {
          var6[4] = nb.a(64, param2, 118);
          if (param0 >= 61) {
            return var5;
          } else {
            be.a(-105, 79, -25, -58, -88);
            return var5;
          }
        }
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
