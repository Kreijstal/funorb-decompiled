/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class d extends ug {
    int field_n;
    int field_m;
    int field_i;
    int field_p;
    static int field_e;
    static long field_k;
    int field_l;
    int[] field_f;
    long field_g;
    int field_o;
    static String[] field_h;
    int field_j;

    final static void a(int param0, int param1) {
        ug var2 = null;
        int var3 = 0;
        vl var4 = null;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        var4 = (vl) (Object) ob.field_s.a((byte) -117);
        L0: while (true) {
          if (var4 == null) {
            if (param1 == 5) {
              var2 = cj.field_a.a((byte) -117);
              L1: while (true) {
                if (var2 == null) {
                  return;
                } else {
                  f.a(param0, 22492);
                  var2 = cj.field_a.d((byte) 63);
                  continue L1;
                }
              }
            } else {
              field_e = 54;
              var2 = cj.field_a.a((byte) -117);
              L2: while (true) {
                if (var2 == null) {
                  return;
                } else {
                  f.a(param0, 22492);
                  var2 = cj.field_a.d((byte) 63);
                  continue L2;
                }
              }
            }
          } else {
            pf.a((byte) -104, var4, param0);
            var4 = (vl) (Object) ob.field_s.d((byte) 63);
            continue L0;
          }
        }
    }

    public static void a(boolean param0) {
        field_h = null;
        if (!param0) {
            field_e = -39;
        }
    }

    d(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        ((d) this).field_j = param4;
        ((d) this).field_p = param1;
        ((d) this).field_l = param5;
        ((d) this).field_o = param2;
        ((d) this).field_m = param0;
        ((d) this).field_i = param3;
        ((d) this).field_f = param6;
        qa.field_a = qa.field_a + 1;
        ((d) this).field_n = qa.field_a & 65535;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 5;
        field_h = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
    }
}
