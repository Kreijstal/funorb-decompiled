/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class me extends am {
    int field_K;
    static double[] field_J;

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            java.net.URL var5 = null;
            String var2 = param1.getDocumentBase().getFile();
            int var3 = var2.indexOf('?');
            String var4 = "reload.ws";
            if (param0 < 31) {
                return;
            }
            try {
                if (!((var3 ^ -1) > -1)) {
                    var4 = var4 + var2.substring(var3);
                }
                var5 = new java.net.URL(param1.getCodeBase(), var4);
                param1.getAppletContext().showDocument(pn.a(var5, (byte) -33, param1), "_self");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void g(byte param0) {
        if (param0 >= -13) {
            return;
        }
        field_J = null;
    }

    me(fj param0) {
        super(param0.field_q, param0.field_m, param0.field_F, param0.field_z, (fe) null, (uk) null);
        param0.a(-117, ((me) this).field_F, 0, ((me) this).field_z, 0);
        ((me) this).field_H = param0;
        ((me) this).field_K = 256;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        nf var6 = null;
        if (param2 >= 36) {
          if (param1 != 0) {
            return;
          } else {
            if (((me) this).field_H != null) {
              if (0 != ((me) this).field_K) {
                if ((((me) this).field_K ^ -1) == -257) {
                  ((me) this).field_H.a(param0 - -((me) this).field_m, param1, (byte) 45, param3 + ((me) this).field_q);
                  return;
                } else {
                  var6 = new nf(((me) this).field_H.field_F, ((me) this).field_H.field_z);
                  vm.a(var6, -8409);
                  ((me) this).field_H.a(0, param1, (byte) 83, 0);
                  ib.b(false);
                  var6.a(param3 - -((me) this).field_q, ((me) this).field_m + param0, ((me) this).field_K);
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    public me() {
        super(0, 0, 0, 0, (fe) null, (uk) null);
        ((me) this).field_K = 256;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = new double[]{0.0, -20.0, 912.0};
    }
}
