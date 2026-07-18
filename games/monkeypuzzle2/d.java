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
        RuntimeException var2_ref = null;
        int var3 = 0;
        vl var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var4 = (vl) (Object) ob.field_s.a((byte) -117);
            L1: while (true) {
              if (var4 == null) {
                L2: {
                  if (param1 == 5) {
                    break L2;
                  } else {
                    field_e = 54;
                    break L2;
                  }
                }
                var2 = cj.field_a.a((byte) -117);
                L3: while (true) {
                  if (var2 == null) {
                    break L0;
                  } else {
                    f.a(4, 22492);
                    var2 = cj.field_a.d((byte) 63);
                    continue L3;
                  }
                }
              } else {
                int discarded$2 = 4;
                pf.a((byte) -104, var4);
                var4 = (vl) (Object) ob.field_s.d((byte) 63);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw la.a((Throwable) (Object) var2_ref, "d.A(" + 4 + ',' + param1 + ')');
        }
    }

    public static void a() {
        field_h = null;
    }

    d(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        try {
            ((d) this).field_j = param4;
            ((d) this).field_p = param1;
            ((d) this).field_l = param5;
            ((d) this).field_o = param2;
            ((d) this).field_m = param0;
            ((d) this).field_i = param3;
            ((d) this).field_f = param6;
            int fieldTemp$0 = qa.field_a;
            qa.field_a = qa.field_a + 1;
            ((d) this).field_n = fieldTemp$0 & 65535;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "d.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 5;
        field_h = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
    }
}
