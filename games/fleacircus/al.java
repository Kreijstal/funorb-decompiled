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
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var2 = new java.net.URL(param1.getCodeBase(), "tosupport.ws");
                param1.getAppletContext().showDocument(ib.a(param1, var2, -5441), "_top");
                if (param0 < -66) {
                  break L0;
                } else {
                  field_d = null;
                  return;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L1: {
                var2_ref = (Exception) (Object) decompiledCaughtException;
                var2_ref.printStackTrace();
                break L1;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static fh[] b(boolean param0) {
        if (!param0) {
          field_f = -27;
          return new fh[]{ne.field_d, ec.field_b, ae.field_d, cg.field_h, lk.field_A, hf.field_h, qi.field_b, hc.field_b, dl.field_t, tg.field_f, kb.field_l, gg.field_b, kc.field_a, ek.field_a};
        } else {
          return new fh[]{ne.field_d, ec.field_b, ae.field_d, cg.field_h, lk.field_A, hf.field_h, qi.field_b, hc.field_b, dl.field_t, tg.field_f, kb.field_l, gg.field_b, kc.field_a, ek.field_a};
        }
    }

    final static boolean a(int param0) {
        int var1 = 0;
        var1 = -35 % ((-12 - param0) / 60);
        if (null != aa.field_r) {
          if (!aa.field_r.c((byte) 17)) {
            return false;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
          field_d = null;
          field_b = null;
          field_e = null;
          field_a = null;
          field_d = null;
          field_c = null;
          return;
        } else {
          field_b = null;
          field_e = null;
          field_a = null;
          field_d = null;
          field_c = null;
          return;
        }
    }

    final static String a(CharSequence param0, byte param1) {
        String var2 = rh.a((byte) -70, uj.a(param0, (byte) -103));
        if (var2 == null) {
            var2 = "";
        }
        if (param1 != 111) {
            return null;
        }
        return var2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "This entry doesn't match";
        field_e = new vc();
        field_d = "Mouse over an icon for details";
        field_b = new int[8192];
        field_a = "Unfortunately you are not eligible to create an account.";
    }
}
