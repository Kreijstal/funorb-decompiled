/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class al {
    static vc field_e;
    static String field_c;
    static int field_f;
    static String field_d;
    static int[] field_b;
    static String field_a;

    final static void a(int param0, java.applet.Applet param1) {
        try {
          java.net.URL var2 = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          RuntimeException stackIn_7_0 = null;
          StringBuilder stackIn_7_1 = null;
          String stackIn_8_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              var2 = new java.net.URL(param1.getCodeBase(), "tosupport.ws");
              param1.getAppletContext().showDocument(ib.a(param1, var2, -5441), "_top");
              if (param0 < -66) {
                return;
              }
              field_d = (String) null;
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
            stackIn_7_0 = var2_ref2;
            stackIn_7_1 = new StringBuilder().append("al.B(").append(param0).append(',');
            if (param1 == null) {
              stackIn_8_2 = "null";
            } else {
              stackIn_8_2 = "{...}";
            }
            throw pf.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static fh[] b(boolean param0) {
        if (param0) {
          return new fh[]{ne.field_d, ec.field_b, ae.field_d, cg.field_h, lk.field_A, hf.field_h, qi.field_b, hc.field_b, dl.field_t, tg.field_f, kb.field_l, gg.field_b, kc.field_a, ek.field_a};
        }
        field_f = -27;
        return new fh[]{ne.field_d, ec.field_b, ae.field_d, cg.field_h, lk.field_A, hf.field_h, qi.field_b, hc.field_b, dl.field_t, tg.field_f, kb.field_l, gg.field_b, kc.field_a, ek.field_a};
    }

    final static boolean a(int param0) {
        int var1 = -35 % ((-12 - param0) / 60);
        if (null == aa.field_r) {
          return false;
        }
        if (aa.field_r.c((byte) 17)) {
          return true;
        }
        return false;
    }

    public static void a(boolean param0) {
        if (param0) {
          field_b = null;
          field_e = null;
          field_a = null;
          field_d = null;
          field_c = null;
          return;
        }
        field_d = (String) null;
        field_b = null;
        field_e = null;
        field_a = null;
        field_d = null;
        field_c = null;
    }

    final static String a(CharSequence param0, byte param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String stackIn_4_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = rh.a((byte) -70, uj.a(param0, (byte) -103));
          if (var2 == null) {
            var2 = "";
          }
          if (param1 == 111) {
            stackIn_6_0 = var2;
            return stackIn_6_0;
          }
          stackIn_4_0 = (String) null;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("al.A(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_c = "This entry doesn't match";
        field_e = new vc();
        field_d = "Mouse over an icon for details";
        field_b = new int[8192];
        field_a = "Unfortunately you are not eligible to create an account.";
    }
}
