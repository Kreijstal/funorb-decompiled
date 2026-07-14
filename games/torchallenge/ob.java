/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob {
    static String[] field_a;
    static int[][] field_c;
    static int[] field_b;

    final static void a(int param0, int param1, int param2) {
        int var3 = 0;
        L0: {
          var3 = param1;
          pa.field_x = pa.field_x + var3;
          if (!bh.field_p) {
            kj.field_B.a((da) (Object) new bk(param0, var3, ac.field_d, ae.field_z, pa.field_x, pd.field_c - -tf.field_o), -66);
            break L0;
          } else {
            break L0;
          }
        }
        pd.field_c = pd.field_c + var3;
        if (param2 != -7756) {
          field_b = null;
          return;
        } else {
          return;
        }
    }

    final static void a(String param0, java.applet.Applet param1, byte param2) {
        try {
            java.net.URL var3 = null;
            try {
                var3 = new java.net.URL(param1.getCodeBase(), param0);
                if (param2 != 43) {
                    field_a = null;
                }
                var3 = mc.a(var3, param2 ^ -44, param1);
                u.a(param1, true, -107, var3.toString());
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
        field_b = null;
        if (param0 != 887316838) {
            return;
        }
        field_a = null;
        field_c = null;
    }

    final static void b(int param0) {
        if (param0 > -85) {
            return;
        }
        if (!(qf.field_a == null)) {
            qf.field_a.a((byte) 94);
            qf.field_a = null;
        }
    }

    final static void a(int param0, uf param1) {
        int var2 = 0;
        ia.field_j = param1.c(false) << -1018871611;
        var2 = param1.j(-109);
        ti.field_e = 1835008 & var2 << 357802706;
        if (param0 >= -30) {
          ob.a(127, -50, -88);
          ia.field_j = ia.field_j + (var2 >> 875719427);
          ti.field_e = ti.field_e + (param1.c(false) << -460180766);
          var2 = param1.j(-86);
          ti.field_e = ti.field_e + (var2 >> 887316838);
          uc.field_U = var2 << 1330872399 & 2064384;
          uc.field_U = uc.field_U + (param1.j(-126) << 482469703);
          var2 = param1.j(-123);
          jf.field_sb = var2 << -271097840 & 65536;
          uc.field_U = uc.field_U + (var2 >> 82801281);
          jf.field_sb = jf.field_sb + param1.c(false);
          return;
        } else {
          ia.field_j = ia.field_j + (var2 >> 875719427);
          ti.field_e = ti.field_e + (param1.c(false) << -460180766);
          var2 = param1.j(-86);
          ti.field_e = ti.field_e + (var2 >> 887316838);
          uc.field_U = var2 << 1330872399 & 2064384;
          uc.field_U = uc.field_U + (param1.j(-126) << 482469703);
          var2 = param1.j(-123);
          jf.field_sb = var2 << -271097840 & 65536;
          uc.field_U = uc.field_U + (var2 >> 82801281);
          jf.field_sb = jf.field_sb + param1.c(false);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
        field_b = new int[]{6, 433, 180, 39};
        field_c = new int[10][2];
    }
}
