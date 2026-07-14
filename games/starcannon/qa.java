/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qa {
    static String[] field_d;
    static qb field_a;
    static gg field_b;
    static boolean field_e;
    static int field_c;

    final static void a(int param0, String[] param1, String param2, byte param3) {
        int stackIn_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        uh.field_k = s.field_f;
        if (param0 == -256) {
          L0: {
            if (-14 >= (qb.field_a ^ -1)) {
              stackOut_17_0 = 0;
              stackIn_18_0 = stackOut_17_0;
              break L0;
            } else {
              stackOut_16_0 = 1;
              stackIn_18_0 = stackOut_16_0;
              break L0;
            }
          }
          gj.field_a = cf.a(stackIn_18_0 != 0, false);
          if (param3 < 24) {
            field_a = null;
            return;
          } else {
            return;
          }
        } else {
          if (-101 > param0) {
            gj.field_a = fb.a(param2, param0, 0);
            if (param3 >= 24) {
              return;
            } else {
              field_a = null;
              return;
            }
          } else {
            if (105 < param0) {
              gj.field_a = fb.a(param2, param0, 0);
              if (param3 < 24) {
                field_a = null;
                return;
              } else {
                return;
              }
            } else {
              gj.field_a = hc.a(param1, 0);
              if (param3 >= 24) {
                return;
              } else {
                field_a = null;
                return;
              }
            }
          }
        }
    }

    public static void a(int param0) {
        if (param0 != -5504) {
          qa.a(100);
          field_b = null;
          field_a = null;
          field_d = null;
          return;
        } else {
          field_b = null;
          field_a = null;
          field_d = null;
          return;
        }
    }

    final static void a(byte param0, String param1) {
        Object var3 = null;
        if (param0 >= -101) {
          var3 = null;
          qa.a((byte) 93, (String) null);
          jk.field_b = param1;
          fd.a(12, 0);
          return;
        } else {
          jk.field_b = param1;
          fd.a(12, 0);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
    }
}
