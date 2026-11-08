/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class RankingsRequest extends IntrusiveNode {
    String[][] field_n;
    static boolean field_l;
    boolean field_v;
    static Random field_r;
    int field_o;
    int field_t;
    int field_s;
    int field_x;
    int[][] field_q;
    static int field_p;
    static boolean field_z;
    int field_w;
    static UiComponent field_u;
    int field_y;
    static String tutorialEightBallAfterbreak;

    final static void readAccountDisplayName(byte obfuscationGuard) {
        int var1 = 27 / ((obfuscationGuard - 59) / 62);
        ResourceArchive.field_j = PlayerContextMenu.field_e.j(-100);
        CharSequence var2 = (CharSequence) ((Object) ResourceArchive.field_j);
        HighScoreSubmission.field_y = TutorialController.normalizeDisplayName(110, var2);
    }

    public static void releaseStatics(byte param0) {
        field_u = null;
        if (param0 <= 115) {
          return;
        }
        tutorialEightBallAfterbreak = null;
        field_r = null;
    }

    RankingsRequest() {
    }

    static {
        field_l = false;
        field_p = 0;
        field_z = true;
        tutorialEightBallAfterbreak = "In a proper game, we would now take turns to try to \"pot\" balls, but for the purposes of this tutorial you're on your own. Try to \"pot\" any ball (make it go into a pocket) on the table, but don't hit the black ball first or pot it.";
        field_r = new Random();
    }
}
