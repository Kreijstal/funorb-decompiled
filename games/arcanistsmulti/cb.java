/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cb {
    static boolean field_a;
    static int field_f;
    static long field_e;
    static String field_d;
    static boolean field_b;
    static String field_c;

    public static void a(byte param0) {
        field_d = null;
        if (param0 <= 19) {
            cb.a((byte) 112);
            field_c = null;
            return;
        }
        field_c = null;
    }

    final static void a(na param0, int param1) {
        na var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        param0.a(true);
        var3 = 19 % ((-78 - param1) / 48);
        var2 = (na) (Object) vh.field_a.b(12623);
        L0: while (true) {
          if (var2 != null) {
            if (var2.a(param0, 2)) {
              var2 = (na) (Object) vh.field_a.a(0);
              continue L0;
            } else {
              L1: {
                if (var2 != null) {
                  da.a((pg) (Object) var2, 20, (pg) (Object) param0);
                  break L1;
                } else {
                  vh.field_a.b((pg) (Object) param0, -1);
                  break L1;
                }
              }
              return;
            }
          } else {
            L2: {
              if (var2 != null) {
                da.a((pg) (Object) var2, 20, (pg) (Object) param0);
                break L2;
              } else {
                vh.field_a.b((pg) (Object) param0, -1);
                break L2;
              }
            }
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Kit up your character on the '<%0>' screen and look at the tutorial to learn how to play the game.  After learning the basics, enter the lobby and join a Rated game to earn wands. <col=FF0000>(Members only)</col> Any wands you earn can be spent on the '<%1>' screen to gain new spells with which to fight your opponents.";
        field_c = null;
    }
}
