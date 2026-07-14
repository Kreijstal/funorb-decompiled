/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wf {
    static pf field_e;
    static String field_c;
    static int[] field_d;
    static String field_b;
    static char[] field_a;

    final static sk a(long param0, String param1, int param2, String param3, boolean param4) {
        if (param2 < -57) {
          if ((param0 ^ -1L) == -1L) {
            if (param1 == null) {
              if (param4) {
                return (sk) (Object) new ff(param0, param3);
              } else {
                return (sk) (Object) new nh(param0, param3);
              }
            } else {
              return (sk) (Object) new hf(param1, param3);
            }
          } else {
            if (param4) {
              return (sk) (Object) new ff(param0, param3);
            } else {
              return (sk) (Object) new nh(param0, param3);
            }
          }
        } else {
          return null;
        }
    }

    abstract byte[] a(byte param0, int param1);

    abstract int a(int param0, int param1);

    public static void b(int param0) {
        Object var2 = null;
        field_b = null;
        if (param0 < 72) {
          var2 = null;
          wf.a(-88, (java.applet.Applet) null);
          field_e = null;
          field_a = null;
          field_d = null;
          field_c = null;
          return;
        } else {
          field_e = null;
          field_a = null;
          field_d = null;
          field_c = null;
          return;
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            String var2 = null;
            int var3 = 0;
            String var4 = null;
            java.net.URL var5 = null;
            try {
                var2 = param1.getDocumentBase().getFile();
                var3 = var2.indexOf((int) (char)param0);
                var4 = "reload.ws";
                if (!((var3 ^ -1) > -1)) {
                    var4 = var4 + var2.substring(var3);
                }
                var5 = new java.net.URL(param1.getCodeBase(), var4);
                param1.getAppletContext().showDocument(lk.a(param1, var5, -102), "_self");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract lh a(int param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Cancel";
        field_a = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
        field_d = new int[]{200, 200, 200, 200, 200, 500, 300, 500, 200, 500, 1000, 200, 300, 100};
    }
}
