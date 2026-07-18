/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qqa extends le {
    static String[] field_i;

    public static void e(byte param0) {
        int var1 = 59 % ((-48 - param0) / 43);
        field_i = null;
    }

    final static void a(boolean param0, byte param1) {
        int var2_int = 0;
        int var3 = VoidHunters.field_G;
        try {
            for (var2_int = 0; var2_int < 11; var2_int++) {
                lu.field_f[var2_int] = 0;
                qd.field_a[var2_int] = !param0 ? true : false;
            }
            if (param1 > -5) {
                qqa.e((byte) 81);
            }
            nqa.field_c = !param0 ? true : false;
            mfb.field_a = !param0 ? true : false;
            mja.field_o = !param0 ? true : false;
            eka.field_b = !param0 ? true : false;
            bva.field_d = !param0 ? true : false;
            gk.field_p = !param0 ? true : false;
            m.a(37);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "qqa.C(" + param0 + ',' + param1 + ')');
        }
    }

    public qqa() {
        super(1, true);
    }

    final int[] a(int param0, boolean param1) {
        int[] var3 = null;
        int[][] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        var9 = VoidHunters.field_G;
        var10 = ((qqa) this).field_f.a((byte) -62, param0);
        var3 = var10;
        if (((qqa) this).field_f.field_e) {
          var4 = ((qqa) this).a((byte) 69, 0, param0);
          var5 = var4[0];
          var6 = var4[1];
          var7 = var4[2];
          var8 = 0;
          L0: while (true) {
            if (hob.field_d > var8) {
              var10[var8] = (var6[var8] + var5[var8] + var7[var8]) / 3;
              var8++;
              continue L0;
            } else {
              if (!param1) {
                field_i = null;
                return var3;
              } else {
                return var3;
              }
            }
          }
        } else {
          if (!param1) {
            field_i = null;
            return var3;
          } else {
            return var3;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
    }
}
