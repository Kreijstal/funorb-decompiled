/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class m extends fa {
    int field_k;
    static String field_l;
    int field_m;

    public static void b(byte param0) {
        field_l = null;
        if (param0 != -10) {
            field_l = (String) null;
        }
    }

    private m() throws Throwable {
        throw new Error();
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            int var3 = 0;
            RuntimeException stackIn_5_0 = null;
            StringBuilder stackIn_5_1 = null;
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            String stackIn_7_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_4_0 = null;
            StringBuilder stackOut_4_1 = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            String stackOut_6_2 = null;
            RuntimeException stackOut_5_0 = null;
            StringBuilder stackOut_5_1 = null;
            String stackOut_5_2 = null;
            try {
              try {
                L0: {
                  var2 = new java.net.URL(param0.getCodeBase(), "subscribe.ws");
                  var3 = 83 % ((param1 - -11) / 38);
                  param0.getAppletContext().showDocument(lg.a(false, param0, var2), "_top");
                  break L0;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = (Exception) (Object) decompiledCaughtException;
                var2_ref.printStackTrace();
                return;
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L1: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_4_0 = (RuntimeException) (var2_ref2);
                stackOut_4_1 = new StringBuilder().append("m.C(");
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                if (param0 == null) {
                  stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
                  stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
                  stackOut_6_2 = "null";
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  stackIn_7_2 = stackOut_6_2;
                  break L1;
                } else {
                  stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
                  stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
                  stackOut_5_2 = "{...}";
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  stackIn_7_2 = stackOut_5_2;
                  break L1;
                }
              }
              throw aa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0) {
        String var1 = null;
        java.applet.Applet var2 = null;
        if (to.field_s) {
          L0: {
            if (to.field_r != null) {
              to.field_r.p(param0 ^ 15);
              break L0;
            } else {
              break L0;
            }
          }
          var1 = dd.a(0);
          nf.field_b = new be(var1, (String) null, true, false, false);
          if (param0 != -102) {
            var2 = (java.applet.Applet) null;
            m.a((java.applet.Applet) null, -43);
            wa.field_c.b(param0 + -6081, ph.field_l);
            ph.field_l.c(nf.field_b, param0 ^ 27);
            ph.field_l.e(false);
            return;
          } else {
            wa.field_c.b(param0 + -6081, ph.field_l);
            ph.field_l.c(nf.field_b, param0 ^ 27);
            ph.field_l.e(false);
            return;
          }
        } else {
          throw new IllegalStateException();
        }
    }

    static {
        field_l = "Only show game chat from my friends";
    }
}
