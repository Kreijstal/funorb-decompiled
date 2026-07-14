/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qk extends IOException {
    static String field_a;
    static int[] field_f;
    static boolean field_c;
    static String field_e;
    static ng field_g;
    static int[] field_b;
    static String field_d;

    qk(String param0) {
        super(param0);
    }

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    final static nh a(String param0, vj param1, String param2, boolean param3) {
        int var4 = 0;
        int var5 = 0;
        var4 = param1.a(param0, (byte) -122);
        if (!param3) {
          qk.a(false);
          var5 = param1.a((byte) -91, param2, var4);
          return fk.a(var4, param1, var5, 16711680);
        } else {
          var5 = param1.a((byte) -91, param2, var4);
          return fk.a(var4, param1, var5, 16711680);
        }
    }

    final static void a(boolean param0) {
        if (param0) {
          if (null != df.field_l) {
            hb.a(-5, (java.awt.Canvas) (Object) df.field_l);
            df.field_l.a(sb.field_d, true);
            df.field_l = null;
            n.field_g.requestFocus();
            return;
          } else {
            return;
          }
        } else {
          field_a = null;
          if (null == df.field_l) {
            return;
          } else {
            hb.a(-5, (java.awt.Canvas) (Object) df.field_l);
            df.field_l.a(sb.field_d, true);
            df.field_l = null;
            n.field_g.requestFocus();
            return;
          }
        }
    }

    public static void b(int param0) {
        field_a = null;
        field_b = null;
        field_d = null;
        if (param0 != 65280) {
          field_f = null;
          field_f = null;
          field_e = null;
          field_g = null;
          return;
        } else {
          field_f = null;
          field_e = null;
          field_g = null;
          return;
        }
    }

    final static m a(int param0) {
        if (param0 != 65280) {
            return null;
        }
        return (m) (Object) new bk();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new int[128];
        field_c = false;
        field_a = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
        field_b = new int[]{16777215, 16777215, 65280, 16711680, 16776960, 65535, 16776960, 16776960, 16711680, 16711680, 16711680, 65535, 65280, 16776960, 65280, 16746496, 16746496, 65535, 65535, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16777215, 65280, 16776960, 16777215, 65280, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 65280, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680};
        field_e = "Please wait";
        field_d = "Quit to website";
    }
}
