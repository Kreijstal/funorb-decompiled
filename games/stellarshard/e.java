/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class e {
    static pc field_a;
    static wh[] field_d;
    static String field_b;
    static String[] field_f;
    static pb[] field_g;
    static boolean field_c;
    static int field_e;

    final static String b(int param0) {
        if (param0 == -1) {
          if (!wk.field_c) {
            if (pc.field_g <= ki.field_v) {
              if (pc.field_g + ul.field_D <= ki.field_v) {
                return null;
              } else {
                return hk.field_m;
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          String discarded$6 = e.b(31);
          if (!wk.field_c) {
            if (pc.field_g <= ki.field_v) {
              if (pc.field_g + ul.field_D <= ki.field_v) {
                return null;
              } else {
                return hk.field_m;
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_g = null;
        field_a = null;
        field_f = null;
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
        field_g = new pb[16];
        field_f = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
        field_e = -1;
    }
}
