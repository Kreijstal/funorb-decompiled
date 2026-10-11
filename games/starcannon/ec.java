/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ec {
    static String field_c;
    static String field_d;
    static int field_a;
    static int field_b;

    public static void a(int param0) {
        field_d = null;
        field_c = null;
        if (param0 != 82) {
          ec.a(39);
        }
    }

    final static int b(byte param0) {
        int var1;
        var1 = -49 % ((param0 + 82) / 43);
        if (2 > rk.field_d) {
          return 0;
        }
        if (vg.field_b == 0) {
          if (!bf.field_y.b((byte) 99)) {
            return 20;
          }
          if (!bf.field_y.a("commonui", -9883)) {
            return 40;
          }
          if (!fk.field_k.b((byte) 89)) {
            return 50;
          }
          if (!fk.field_k.a("commonui", -9883)) {
            return 60;
          }
          if (!li.field_b.b((byte) 101)) {
            return 70;
          }
          if (!li.field_b.a(29741)) {
            return 80;
          }
          return 100;
        }
        if (kl.field_b != null) {
          if (!kl.field_b.b((byte) 100)) {
            return 14;
          }
          if (!kl.field_b.a(-20955, "")) {
            return 29;
          }
          if (!kl.field_b.a("", -9883)) {
            return 29;
          }
        }
        if (!bf.field_y.b((byte) 125)) {
          return 43;
        }
        if (!bf.field_y.a("commonui", -9883)) {
          return 57;
        }
        if (!fk.field_k.b((byte) 89)) {
          return 71;
        }
        if (!fk.field_k.a("commonui", -9883)) {
          return 80;
        }
        if (!li.field_b.b((byte) 115)) {
          return 82;
        }
        if (!li.field_b.a(29741)) {
          return 86;
        }
        return 100;
    }

    final static void a(byte param0) {
        if (null != m.field_b) {
          m.field_b.b((byte) -52);
          m.field_b = null;
          if (param0 != 27) {
            ec.a(72);
            return;
          }
          return;
        }
        if (param0 == 27) {
          return;
        }
        ec.a(72);
    }

    static {
        field_c = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
        field_d = "GFX - LOW";
        field_a = 0;
    }
}
