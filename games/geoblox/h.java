/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class h {
    static int field_b;
    private String field_c;
    private boolean field_e;
    static int field_a;
    private boolean field_f;
    static int field_d;

    final void a(byte param0, boolean param1) {
        if (param0 > -47) {
            return;
        }
        this.field_e = param1 ? true : false;
        this.field_f = true;
    }

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    final static void a(java.applet.Applet param0, boolean param1) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            int var3 = 0;
            String var4 = null;
            java.net.URL var5 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            String stackOut_11_2 = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            String stackOut_10_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    if (!param1) {
                      L2: {
                        var2 = param0.getDocumentBase().getFile();
                        var3 = var2.indexOf('?');
                        var4 = "reload.ws";
                        if ((var3 ^ -1) <= -1) {
                          var4 = var4 + var2.substring(var3);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      var5 = new java.net.URL(param0.getCodeBase(), var4);
                      param0.getAppletContext().showDocument(wf.a(var5, 58, param0), "_self");
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
              L3: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_9_0 = (RuntimeException) (var2_ref2);
                stackOut_9_1 = new StringBuilder().append("h.A(");
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                if (param0 == null) {
                  stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackOut_11_2 = "null";
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  stackIn_12_2 = stackOut_11_2;
                  break L3;
                } else {
                  stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
                  stackOut_10_2 = "{...}";
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_12_2 = stackOut_10_2;
                  break L3;
                }
              }
              throw t.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(int param0) {
        boolean discarded$0 = false;
        if (param0 > -74) {
            discarded$0 = this.a(19);
            return this.field_f;
        }
        return this.field_f;
    }

    final static void c(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        ja var3 = null;
        RuntimeException decompiledCaughtException = null;
        var2 = Geoblox.field_C;
        try {
          L0: {
            var3 = (ja) ((Object) ji.field_r.g(0));
            L1: while (true) {
              if (var3 == null) {
                if (param0 == -1) {
                  break L0;
                } else {
                  h.c(116);
                  return;
                }
              } else {
                var3.g(-16096);
                var3 = (ja) ((Object) ji.field_r.d(1));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "h.B(" + param0 + ')');
        }
    }

    final boolean a(byte param0) {
        if (param0 >= -45) {
            java.applet.Applet var3 = (java.applet.Applet) null;
            h.a((java.applet.Applet) null, true);
            return this.field_e;
        }
        return this.field_e;
    }

    final String b(int param0) {
        boolean discarded$0 = false;
        if (param0 != 19491) {
            discarded$0 = this.a((byte) -82);
            return this.field_c;
        }
        return this.field_c;
    }

    h(String param0) {
        this.field_f = false;
        this.field_e = false;
        try {
            this.field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "h.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = 0;
    }
}
