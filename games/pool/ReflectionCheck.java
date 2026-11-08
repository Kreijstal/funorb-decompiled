/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ReflectionCheck extends IntrusiveNode {
    int field_t;
    int[] field_m;
    int[] field_q;
    static String[] eightBallNumbers;
    int field_o;
    byte[][][] field_w;
    AsyncRequest[] field_n;
    AsyncRequest[] field_p;
    static int[] field_l;
    int[] field_r;
    static int[] field_s;
    static volatile int field_v;

    final static int hitTestMembershipButtons(byte obfuscationGuard, int x, int y) {
        if (UiComponentNode.field_C == null) {
          return -1;
        }
        if (obfuscationGuard > 0) {
          return -12;
        }
        if (BufferedFile.field_n > x) {
          if (x < RasterSnapshot.field_o) {
            return -1;
          }
          if (UiComponentNode.field_C.field_z + RasterSnapshot.field_o <= x) {
            return -1;
          }
          if (y < ModelOriginSupport.field_o) {
            return -1;
          }
          if (ModelOriginSupport.field_o + UiComponentNode.field_C.field_A <= y) {
            return -1;
          }
          return 1;
        }
        if (BufferedFile.field_n + UiComponentNode.field_C.field_z <= x) {
          if (x < RasterSnapshot.field_o) {
            return -1;
          }
          if (UiComponentNode.field_C.field_z + RasterSnapshot.field_o <= x) {
            return -1;
          }
          if (y < ModelOriginSupport.field_o) {
            return -1;
          }
          if (ModelOriginSupport.field_o + UiComponentNode.field_C.field_A <= y) {
            return -1;
          }
          return 1;
        }
        if (HighScoreSubmission.field_s <= y &&
          y < HighScoreSubmission.field_s + UiComponentNode.field_C.field_A) {
          return 0;
        }
        if (x < RasterSnapshot.field_o) {
          return -1;
        }
        if (UiComponentNode.field_C.field_z + RasterSnapshot.field_o <= x) {
          return -1;
        }
        if (y < ModelOriginSupport.field_o) {
          return -1;
        }
        if (ModelOriginSupport.field_o + UiComponentNode.field_C.field_A > y) {
          return 1;
        }
        return -1;
    }

    final static void layoutLobbyOptionPanel(byte obfuscationGuard) {
        ProgressDialog.l(23323);
        int var1 = 95 / ((obfuscationGuard - 47) / 60);
        EightBallRules.layoutLobbyOptionRows(ThemeSelectScreen.field_M[0].field_w, CueAim.field_j, ArchiveIndex.field_x, TranslatedUiText.field_n, (byte) 36, DualLinkNodeHashTable.field_i);
    }

    public static void releaseStatics(boolean param0) {
        field_s = null;
        eightBallNumbers = null;
        field_l = null;
        if (!param0) {
          field_s = (int[]) null;
        }
    }

    ReflectionCheck() {
    }

    static {
        eightBallNumbers = new String[]{"<col=ffffff>Cue ball</col>", "<col=ffff99>1: Spots</col>", "<col=9999ff>2: Spots</col>", "<col=ff9999>3: Spots</col>", "<col=cc99ff>4: Spots</col>", "<col=ffcc99>5: Spots</col>", "<col=99ff99>6: Spots</col>", "<col=cc9966>7: Spots</col>", "<col=999999>8: Black</col>", "<col=ffff99>9: Stripes</col>", "<col=9999ff>10: Stripes</col>", "<col=ff9999>11: Stripes</col>", "<col=cc99ff>12: Stripes</col>", "<col=ffcc99>13: Stripes</col>", "<col=99ff99>14: Stripes</col>", "<col=cc9966>15: Stripes</col>"};
        field_s = new int[4];
        field_v = 0;
    }
}
