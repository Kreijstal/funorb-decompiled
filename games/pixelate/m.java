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
          RuntimeException stackIn_6_0 = null;
          StringBuilder stackIn_6_1 = null;
          String stackIn_7_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              var2 = new java.net.URL(param0.getCodeBase(), "subscribe.ws");
              var3 = 83 % ((param1 + 11) / 38);
              param0.getAppletContext().showDocument(lg.a(false, param0, var2), "_top");
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
            stackIn_6_0 = var2_ref2;
            stackIn_6_1 = new StringBuilder().append("m.C(");
            if (param0 == null) {
              stackIn_7_2 = "null";
            } else {
              stackIn_7_2 = "{...}";
            }
            throw aa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0) {
        if (!to.field_s) {
          throw new IllegalStateException();
        }
        if (to.field_r != null) {
          to.field_r.p(param0 ^ 15);
        }
        String var1 = dd.a(0);
        nf.field_b = new be(var1, (String) null, true, false, false);
        if (param0 == -102) {
          wa.field_c.b(param0 - 6081, ph.field_l);
          ph.field_l.c(nf.field_b, param0 ^ 27);
          ph.field_l.e(false);
          return;
        }
        java.applet.Applet var2 = (java.applet.Applet) null;
        m.a((java.applet.Applet) null, -43);
        wa.field_c.b(param0 - 6081, ph.field_l);
        ph.field_l.c(nf.field_b, param0 ^ 27);
        ph.field_l.e(false);
    }

    static {
        field_l = "Only show game chat from my friends";
    }
}
