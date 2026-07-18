/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ri {
    static String[] field_a;
    static wb[] field_d;
    static String field_c;
    static String field_b;

    final static boolean b(byte param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 >= 5) {
          L0: {
            L1: {
              if (cd.field_e < 10) {
                break L1;
              } else {
                if (13 > g.field_A) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return false;
        }
    }

    final static void a(byte param0) {
        kc var1 = null;
        kc var2 = null;
        int var3 = 0;
        int var4 = Main.field_T;
        try {
            var1 = new kc(540, 140);
            dl.a(-78, var1);
            jb.b();
            vj.d();
            h.field_F = 0;
            de.b(30);
            var2 = var1.b();
            for (var3 = 0; var3 < 15; var3++) {
                var2.d(-2, -2, 16777215);
                vj.c(4, 4, 0, 0, 540, 140);
            }
            rc.field_i.c();
            var3 = 14;
            var1.c(0, 0);
            gg.a(14756);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "ri.B(" + -124 + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_d = null;
        field_c = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
    }
}
