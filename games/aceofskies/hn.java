/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hn {
    static int field_a;
    static String[] field_b;

    final static void a(gk param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        wu var5 = null;
        int[] var6 = null;
        int var7 = 0;
        dl var8 = null;
        int var9 = 0;
        dl var10 = null;
        var7 = AceOfSkies.field_G ? 1 : 0;
        var8 = new dl(param0.a("logo.fo3d", (byte) -71, ""));
        var10 = var8;
        var3 = var10.g(-63);
        var10.j(91);
        gj.field_a = st.a(param1, var10);
        ia.field_a = new int[var3][];
        gp.field_y = new wu[var3];
        var4 = 0;
        L0: while (true) {
          if (var3 <= var4) {
            var10.m((byte) 112);
            var9 = 0;
            var4 = var9;
            L1: while (true) {
              if (var3 <= var9) {
                return;
              } else {
                var5 = gp.field_y[var9];
                var5.a(6, 1, 6, 6, false);
                var5.b(32767);
                var6 = new int[]{((wu) var5).field_b + ((wu) var5).field_N >> -2029023903, ((wu) var5).field_h + ((wu) var5).field_J >> 1433628513, ((wu) var5).field_A + ((wu) var5).field_s >> -279739423};
                ia.field_a[var9] = var6;
                var5.a(-var6[0], 95, -var6[1], -var6[2]);
                var9++;
                continue L1;
              }
            }
          } else {
            gp.field_y[var4] = sh.a(var8, (byte) -14);
            var4++;
            continue L0;
          }
        }
    }

    final static void a(int param0, int param1) {
        dl var2 = q.field_p;
        var2.g(111, param1);
        var2.b(-1336879960, 1);
        var2.b(-1336879960, param0);
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 0) {
            field_b = (String[]) null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new String[]{"Score 5,000 points", "Score 30,000 points", "Score 80,000 points", "Have six wingmen simultaneously", "Top out all Allied speed, turning, fire rate and armour", "Finish the game without dying", "Protect fair Britannia from the scum of the universe", "Finish the game with 100% accuracy", "\"Land\" your plane"};
    }
}
