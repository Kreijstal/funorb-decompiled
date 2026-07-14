/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class an extends nk {
    String field_p;
    static Calendar field_t;
    static ef field_q;
    static String[] field_o;
    static boolean field_r;
    static ko field_s;
    static String field_u;

    public static void b(byte param0) {
        field_t = null;
        field_o = null;
        if (param0 <= 107) {
          an.b((byte) 58);
          field_u = null;
          field_s = null;
          field_q = null;
          return;
        } else {
          field_u = null;
          field_s = null;
          field_q = null;
          return;
        }
    }

    an(int param0, int param1, String param2, int param3, String param4) {
        super(param0, param1, param2, param3);
        ((an) this).field_p = param4;
    }

    final void a(boolean param0, int param1, int param2) {
        if (param2 != 1) {
          return;
        } else {
          L0: {
            wn.a(param2 ^ -2, param1, ((an) this).field_a, ((an) this).field_i, ((an) this).field_d, ((an) this).field_c);
            if (((an) this).field_p != null) {
              wn.a(-1, 16777215, 377, ((an) this).field_p, -20 + ((an) this).field_d, ((an) this).field_c);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        field_o = new String[]{"Complete Puzzle Level<nbsp>10", "Complete all 'Doable' Puzzle<nbsp>Levels", "Complete all 'Insane' Puzzle<nbsp>Levels", "Complete all 'Theoretically Possible' Puzzle<nbsp>Levels", "Complete all Bonus Puzzle<nbsp>Levels", "Complete Arcade Level<nbsp>5", "Complete Arcade Level<nbsp>15", "Complete the Arcade<nbsp>Set", "Get 1000<nbsp>points", "Get 5000<nbsp>points", "Get 20000<nbsp>points", "Get 50000<nbsp>points", "Kill 30 spiders in one session in the Arcade<nbsp>Levels", "Complete Arcade Level 'Sticky Hedges' destroying all balls", "Complete Arcade Level 'On The Run' in under 50<nbsp>seconds", "Complete Arcade Level 'Treasure Rider' catching all balls and spiders", "Complete 13 levels in one session, during the Halloween season"};
        field_u = "This is a members-only level.";
    }
}
