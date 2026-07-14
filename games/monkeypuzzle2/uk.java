/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk extends wj {
    static le field_n;
    static String field_p;
    static int field_q;
    static int field_r;
    static String[] field_o;

    final String a(int param0, String param1) {
        if (param0 != 1) {
            field_q = -107;
        }
        if (!(((uk) this).a(param1, 3917) != ol.field_h)) {
            return ba.field_d;
        }
        return ue.field_E;
    }

    final na a(String param0, int param1) {
        if (param1 != 3917) {
            return null;
        }
        int var3 = sb.a(28079, param0) == null ? 1 : 0;
        if (!(var3 != 0)) {
            return ol.field_h;
        }
        return wj.field_i;
    }

    final static boolean f(int param0) {
        if (param0 != 20) {
            field_p = null;
        }
        return cf.field_b == ed.field_c ? true : false;
    }

    uk(rj param0) {
        super(param0);
    }

    public static void e(int param0) {
        field_o = null;
        int var1 = 93 % ((param0 - -19) / 59);
        field_n = null;
        field_p = null;
    }

    final static void a(int param0, byte param1, le param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param1 >= 118) {
          var3 = param0 * 16 / 50;
          var4 = 0;
          L0: while (true) {
            if ((var4 ^ -1) <= -301) {
              ge.b();
              return;
            } else {
              if (var3 > sc.field_h[var4]) {
                var5 = var4 / 20;
                var6 = 32 * (var4 - var5 * 20);
                var5 = var5 * 32;
                ge.h(var6, var5, var6 + 32, 32 + var5);
                param2.a(0, 0);
                var4++;
                continue L0;
              } else {
                var4++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_o = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
        field_r = -2147483648;
    }
}
