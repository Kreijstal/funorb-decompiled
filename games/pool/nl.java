/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nl {
    static String field_d;
    static String[] field_a;
    static ir field_c;
    static en field_b;

    final boolean b(int param0) {
        if (param0 == 719) {
          if (this != (Object) (Object) wo.field_g) {
            if (this != (Object) (Object) ff.field_b) {
              if ((Object) (Object) ta.field_a == this) {
                return true;
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            if (param0 < 71) {
                return;
            }
            try {
                var2 = new java.net.URL(param1.getCodeBase(), "toserverlist.ws");
                param1.getAppletContext().showDocument(p.a((byte) -33, var2, param1), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        if (param0 > -11) {
          field_d = null;
          field_c = null;
          field_d = null;
          field_a = null;
          field_b = null;
          return;
        } else {
          field_c = null;
          field_d = null;
          field_a = null;
          field_b = null;
          return;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
    }
}
