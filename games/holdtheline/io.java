/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class io {
    static ah field_c;
    static String field_f;
    private String field_e;
    private boolean field_d;
    static int field_b;
    static String field_a;

    final String a(byte param0) {
        if (param0 != -41) {
            ((io) this).field_d = true;
            return ((io) this).field_e;
        }
        return ((io) this).field_e;
    }

    final static String a(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        char[] var4 = null;
        char[] var5 = null;
        char[] var6 = null;
        char[] var7 = null;
        char[] var8 = null;
        if (0 > param0) {
          return "--:--";
        } else {
          if (param1 != -61) {
            String discarded$1 = io.a(34, (byte) -85);
            var2 = param0 / 50;
            var3 = var2 / 60;
            var2 = var2 % 60;
            var7 = new char[5];
            var5 = var7;
            var4 = var5;
            var4[3] = (char)(var2 / 10 + 48);
            var4[0] = (char)(48 + var3 / 10 % 10);
            var4[1] = (char)(var3 % 10 + 48);
            var4[2] = (char)58;
            var4[4] = (char)(var2 % 10 + 48);
            return new String(var7);
          } else {
            var2 = param0 / 50;
            var3 = var2 / 60;
            var2 = var2 % 60;
            var8 = new char[5];
            var6 = var8;
            var4 = var6;
            var4[3] = (char)(var2 / 10 + 48);
            var4[0] = (char)(48 + var3 / 10 % 10);
            var4[1] = (char)(var3 % 10 + 48);
            var4[2] = (char)58;
            var4[4] = (char)(var2 % 10 + 48);
            return new String(var8);
          }
        }
    }

    final boolean b(byte param0) {
        if (param0 >= -22) {
            field_c = null;
            return ((io) this).field_d;
        }
        return ((io) this).field_d;
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        field_f = null;
        if (param0 != 10) {
            field_f = null;
        }
    }

    io(String param0, boolean param1) {
        ((io) this).field_e = param0;
        if (((io) this).field_e == null) {
            ((io) this).field_e = "";
        }
        ((io) this).field_d = param1 ? true : false;
        if (0 == ((io) this).field_e.length()) {
            ((io) this).field_d = false;
        }
    }

    io(String param0) {
        this(param0, false);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "You can also choose to play either <col=1>Practice</col> or <col=1>Demolition</col> games. The course selection in these modes depends on your progress through the <col=1>Championship</col>.<br><br><col=1>Practice</col> mode allows you to try out a course for as many laps as you like, with or without computer-controlled competitors, to help you improve your lap times.<br><br>In <col=1>Demolition</col> mode, use your shields, weaponry and front bumper to damage opponents. Eliminate <col=1>5</col> opponents to win the round.<br><br>";
        field_c = new ah();
        field_b = 0;
        field_a = "Set";
    }
}
