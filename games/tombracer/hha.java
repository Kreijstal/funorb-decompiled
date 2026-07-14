/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hha extends od {
    volatile boolean field_m;
    boolean field_l;
    boolean field_k;

    final static String a(boolean param0) {
        if (!param0) {
          if (kl.field_a != gsa.field_y) {
            if (gva.field_b.b(88)) {
              if (gsa.field_y == wt.field_d) {
                return gva.field_b.a((byte) 100);
              } else {
                return jo.field_E;
              }
            } else {
              return gva.field_b.a((byte) 119);
            }
          } else {
            return faa.field_g;
          }
        } else {
          boolean discarded$7 = hha.a(-49, 62, -28);
          if (kl.field_a != gsa.field_y) {
            if (gva.field_b.b(88)) {
              if (gsa.field_y == wt.field_d) {
                return gva.field_b.a((byte) 100);
              } else {
                return jo.field_E;
              }
            } else {
              return gva.field_b.a((byte) 119);
            }
          } else {
            return faa.field_g;
          }
        }
    }

    final static void a(java.applet.Applet param0, byte param1) {
        try {
            java.net.URL var2 = null;
            if (param1 > -77) {
                return;
            }
            try {
                var2 = new java.net.URL(param0.getCodeBase(), "quit.ws");
                param0.getAppletContext().showDocument(sda.a(param0, -1, var2), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract byte[] b(byte param0);

    final static boolean a(int param0, int param1, int param2) {
        if (param1 != 0) {
            return true;
        }
        return (param2 & 2048) != 0 ? true : false;
    }

    abstract int a(byte param0);

    hha() {
        ((hha) this).field_m = true;
    }

    static {
    }
}
