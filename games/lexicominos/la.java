/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la {
    private String field_d;
    static String field_a;
    private boolean field_c;
    private boolean field_b;

    final static void a(byte param0, int param1, wf param2, int param3, int param4) {
        try {
            param2.c(12, param0 + 47);
            param2.e(106, 17);
            param2.e(62, param3);
            param2.e(104, param1);
            param2.c(param4, -1);
            if (param0 != -48) {
                field_a = (String) null;
            }
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "la.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final String a(boolean param0) {
        if (param0) {
            this.field_d = (String) null;
            return this.field_d;
        }
        return this.field_d;
    }

    final void a(byte param0, boolean param1) {
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        L0: {
          stackIn_2_0 = this;

          if (!param1) {
            stackIn_3_0 = this;
            stackIn_3_1 = 0;
            break L0;
          } else {
            stackIn_3_0 = this;
            stackIn_3_1 = 1;
            break L0;
          }
        }
        ((la) (this)).field_c = stackIn_3_1 != 0;
        if (param0 != 121) {
          this.b(10);
          this.field_b = true;
          return;
        } else {
          this.field_b = true;
          return;
        }
    }

    public static void a(byte param0) {
        if (param0 < 118) {
            field_a = (String) null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final boolean b(int param0) {
        if (param0 != 12) {
            this.b(13);
            return this.field_b;
        }
        return this.field_b;
    }

    final boolean a(int param0) {
        if (param0 != 12) {
            return true;
        }
        return this.field_c;
    }

    final static void a(java.applet.Applet param0, boolean param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                try {
                  L1: {
                    if (param1) {
                      var2 = new java.net.URL(param0.getCodeBase(), "tosupport.ws");
                      param0.getAppletContext().showDocument(gf.a(3, var2, param0), "_top");
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2_ref = (Exception) (Object) decompiledCaughtException;
                  var2_ref.printStackTrace();
                  return;
                }
                if (decompiledRegionSelector0 == 0) {
                  break L0;
                } else {
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var2_ref2);

                stackIn_8_1 = new StringBuilder().append("la.G(");

                if (param0 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "null";
                  break L2;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "{...}";
                  break L2;
                }
              }
              throw ld.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    la(String param0) {
        this.field_c = false;
        this.field_b = false;
        try {
            this.field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "la.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "Connection restored.";
    }
}
