/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class de extends hg {
    static ik field_i;
    static String[] field_h;
    int field_g;
    static boolean field_j;

    final static void a(String param0, String param1, int param2) {
        try {
            if (be.field_b != null) {
                be.field_b.o(-18861);
            }
            dd.field_d = new h(param0, param1, false, true, true);
            if (param2 != 63) {
                field_h = (String[]) null;
            }
            rd.field_c.a(dd.field_d, 30);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "de.D(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(boolean param0, java.applet.Applet param1) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            int var3 = 0;
            String var4 = null;
            java.net.URL var5 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                try {
                  L1: {
                    var2 = param1.getDocumentBase().getFile();
                    if (!param0) {
                      L2: {
                        var3 = var2.indexOf('?');
                        var4 = "reload.ws";
                        if ((var3 ^ -1) <= -1) {
                          var4 = var4 + var2.substring(var3);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      var5 = new java.net.URL(param1.getCodeBase(), var4);
                      param1.getAppletContext().showDocument(sh.a((byte) 12, param1, var5), "_self");
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
                stackIn_11_0 = (RuntimeException) (var2_ref2);

                stackIn_11_1 = new StringBuilder().append("de.C(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "null";
                  break L3;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "{...}";
                  break L3;
                }
              }
              throw t.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(boolean param0) {
        field_h = null;
        if (!param0) {
            return;
        }
        field_i = null;
    }

    de(int param0) {
        this.field_g = param0;
    }

    final static void a(int param0, int param1, int param2) {
        int var3;
        ce.field_f.a(true);
        param0 = l.a(-8462, param0);
        param1 = jg.a(param0, 13565, param1);
        var3 = nk.a(1, param0);
        ma.field_a = new oe(ld.field_h[param0], var3, param0, param1);
        ma.field_a.y((byte) -40);
        if (param2 < 77) {
          field_h = (String[]) null;
          return;
        } else {
          return;
        }
    }

    static {
        field_h = new String[]{"Congratulations, commander. Your mission has been an overwhelming success.", "You have exceeded all expectations and single-handedly brought about the destruction of the alien war machine.", "Their military infrastructure lies in ruins ... ", " ... in the wake of your successful undercover strikes", "Earth is safe once again, thanks to you."};
    }
}
