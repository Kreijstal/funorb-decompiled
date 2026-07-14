/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class of extends ms {
    static java.awt.Frame field_n;
    int field_p;
    static int[] field_t;
    String[][] field_o;
    long[][] field_r;
    int[][] field_m;
    static String field_k;
    boolean field_q;
    int field_l;
    int field_s;

    final static of a(int param0, int param1, int param2, int param3, int param4) {
        of var5 = null;
        of var5_ref = null;
        int var6 = 0;
        var6 = Sumoblitz.field_L ? 1 : 0;
        var5 = (of) (Object) oi.field_b.b(param1 + -107);
        L0: while (true) {
          if (var5 == null) {
            var5_ref = new of();
            var5_ref.field_s = param0;
            var5_ref.field_l = param4;
            var5_ref.field_p = param2;
            oi.field_b.a((ms) (Object) var5_ref, (byte) 39);
            if (param1 != 1) {
              boolean discarded$2 = of.c((byte) 50);
              pd.a((byte) -65, param3, var5_ref);
              return var5_ref;
            } else {
              pd.a((byte) -65, param3, var5_ref);
              return var5_ref;
            }
          } else {
            if (param2 == var5.field_p) {
              return var5;
            } else {
              var5 = (of) (Object) oi.field_b.d((byte) 18);
              continue L0;
            }
          }
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            java.net.URL var5 = null;
            String var2 = param1.getDocumentBase().getFile();
            int var3 = var2.indexOf('?');
            String var4 = "reload.ws";
            if (param0 != 8192) {
                return;
            }
            try {
                if (!(var3 < 0)) {
                    var4 = var4 + var2.substring(var3);
                }
                var5 = new java.net.URL(param1.getCodeBase(), var4);
                param1.getAppletContext().showDocument(td.a((byte) 122, param1, var5), "_self");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0) {
        po.field_a = true;
        if (param0 > -102) {
            field_t = null;
        }
    }

    final static boolean a(fs param0, int param1) {
        int var2 = param0.e(-31302);
        int var3 = var2 == 1 ? 1 : 0;
        int var4 = 88 / ((70 - param1) / 33);
        return var3 != 0;
    }

    final static String c(int param0) {
        int var1 = -4 / ((param0 - 48) / 36);
        if (nw.field_e == ad.field_p) {
            return in.field_C;
        }
        if (!ut.field_o.a(true)) {
            return ut.field_o.b(32);
        }
        if (!(ad.field_p != vm.field_c)) {
            return ut.field_o.b(107);
        }
        return ac.field_F;
    }

    final static boolean c(byte param0) {
        int var1 = -123 % ((67 - param0) / 50);
        if (!mc.b((byte) -89, "jaclib")) {
            return false;
        }
        return mc.b((byte) 93, "hw3d");
    }

    public static void a(int param0) {
        if (param0 != -26437) {
          String discarded$2 = of.c(-86);
          field_n = null;
          field_k = null;
          field_t = null;
          return;
        } else {
          field_n = null;
          field_k = null;
          field_t = null;
          return;
        }
    }

    of() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = new int[8192];
        field_k = "Quit to website";
    }
}
