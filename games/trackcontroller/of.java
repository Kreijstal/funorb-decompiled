/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class of extends ec {
    static String field_g;
    static int field_f;

    final static java.net.URL a(java.applet.Applet param0, java.net.URL param1, boolean param2) {
        Object var3 = null;
        Object var4 = null;
        java.applet.Applet var5 = null;
        java.net.URL stackIn_10_0 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2) {
            var5 = (java.applet.Applet) null;
            of.a(-79, (java.applet.Applet) null);
          }
          var3 = null;
          var4 = null;
          if (null != field_g &&
            !field_g.equals(param0.getParameter("settings"))) {
            var3 = field_g;
            var4 = var3;
            var4 = var3;
          }
          if (null != sa.field_P &&
            !sa.field_P.equals(param0.getParameter("session"))) {
            var4 = sa.field_P;
          }
          stackIn_10_0 = ue.a(param1, 56, (String) (var3), -1, (String) (var4));
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("of.A(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw sl.a((Throwable) (stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void c(byte param0) {
        java.net.URL var3 = null;
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        var1 = hd.field_p;
        synchronized (var1) {
          rj.field_a = db.field_bb;
          pa.field_a = pa.field_a + 1;
          if (param0 != 66) {
            var3 = (java.net.URL) null;
            of.a((java.applet.Applet) null, (java.net.URL) null, false);
          }
          kf.field_b = la.field_s;
          fg.field_a = wi.field_a;
          mg.field_a = hd.field_q;
          hd.field_q = false;
          uk.field_a = wf.field_d;
          db.field_X = sa.field_M;
          wg.field_e = ch.field_x;
          wf.field_d = 0;
        }
    }

    public static void b(boolean param0) {
        if (param0) {
          return;
        }
        field_g = null;
    }

    of(long param0, String param1) {
        super(param0, param1);
    }

    final nh a(boolean param0) {
        if (param0) {
          of.c((byte) 60);
          return be.field_m;
        }
        return be.field_m;
    }

    final static void a(int param0, java.applet.Applet param1) {
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
              var2 = new java.net.URL(param1.getCodeBase(), "subscribe.ws");
              param1.getAppletContext().showDocument(of.a(param1, var2, false), "_top");
              var3 = 10 % ((27 - param0) / 32);
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
            stackIn_6_1 = new StringBuilder().append("of.B(").append(param0).append(',');
            if (param1 == null) {
              stackIn_7_2 = "null";
            } else {
              stackIn_7_2 = "{...}";
            }
            throw sl.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
    }
}
