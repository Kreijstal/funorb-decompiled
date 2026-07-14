/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uc {
    static boolean field_d;
    static String field_b;
    static String field_c;
    static String field_e;
    static int field_a;

    public static void a(int param0) {
        field_c = null;
        field_e = null;
        field_b = null;
        if (param0 != 0) {
            field_a = 69;
        }
    }

    final static void a(byte param0) {
        CharSequence var2 = null;
        CharSequence var3 = null;
        if (param0 < 76) {
          uc.a(96, (byte) 96);
          w.field_a = nf.field_l.g(12248);
          var2 = (CharSequence) (Object) w.field_a;
          kf.field_e = hj.a((byte) -125, var2);
          return;
        } else {
          w.field_a = nf.field_l.g(12248);
          var3 = (CharSequence) (Object) w.field_a;
          kf.field_e = hj.a((byte) -125, var3);
          return;
        }
    }

    final static int a(String param0, boolean param1, boolean param2) {
        if (param1) {
            return -6;
        }
        if (!param2) {
            return ce.field_b.a(param0);
        }
        return tb.field_c.a(param0);
    }

    final static void a(int param0, byte param1) {
        lb.field_a = param0;
        if (param1 < -116) {
          if (null == jk.field_D) {
            if (null != jj.field_a) {
              jj.field_a.a(param0, false);
              return;
            } else {
              return;
            }
          } else {
            jk.field_D.a((byte) 101, param0);
            if (null == jj.field_a) {
              return;
            } else {
              jj.field_a.a(param0, false);
              return;
            }
          }
        } else {
          return;
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            if (param0 != 0) {
                return;
            }
            try {
                var2 = new java.net.URL(param1.getCodeBase(), "toserverlist.ws");
                param1.getAppletContext().showDocument(dh.a(param1, (byte) -112, var2), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Best each";
        field_d = true;
        field_c = "Please check if address is correct";
        field_e = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
        field_a = 0;
    }
}
