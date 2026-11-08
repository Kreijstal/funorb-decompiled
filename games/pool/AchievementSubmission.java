/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AchievementSubmission extends IntrusiveNode {
    int field_t;
    int field_q;
    int field_p;
    private static int field_u;
    static UiComponent field_l;
    static Sprite field_o;
    int field_s;
    int field_r;
    static int field_m;
    int field_n;

    public static void releaseStatics(byte param0) {
        field_l = null;
        if (param0 <= 33) {
          field_u = -21;
          field_o = null;
          return;
        }
        field_o = null;
    }

    final static void a(int param0, boolean param1) {
        int stackIn_4_0;
        int stackIn_4_1;
        boolean stackIn_4_2;
        int stackIn_4_3;
        int stackIn_4_4;
        int stackIn_4_5;
        int stackIn_4_6;
        int stackIn_4_7;
        boolean stackIn_6_8 = false;
        int stackIn_8_9;
        boolean stackIn_9_10 = false;
        int stackIn_27_0;
        int stackIn_27_1;
        boolean stackIn_27_2;
        int stackIn_27_3;
        int stackIn_27_4;
        int stackIn_27_5;
        int stackIn_27_6;
        int stackIn_27_7;
        boolean stackIn_29_8 = false;
        int stackIn_31_9;
        boolean stackIn_32_10 = false;
        int stackIn_49_0;
        int stackIn_49_1;
        boolean stackIn_49_2;
        int stackIn_49_3;
        int stackIn_49_4;
        int stackIn_49_5;
        int stackIn_49_6;
        int stackIn_49_7;
        boolean stackIn_51_8 = false;
        int stackIn_53_9;
        boolean stackIn_54_10 = false;
        int var2;
        TikiBallSkin.j(-8);
        if (HighscoresScreen.field_L == null) {
          var2 = 0;
          stackIn_4_0 = var2;
          stackIn_4_1 = 14;
          stackIn_4_2 = param1;
          stackIn_4_3 = 11;
          stackIn_4_4 = 15;
          stackIn_4_5 = -12;
          stackIn_4_6 = CompressedContainerSupport.field_d;
          stackIn_4_7 = 0;
          stackIn_6_8 = (MidiNoteMixer.field_v) || (TransformSupport.field_e);
          stackIn_8_9 = 13;
          stackIn_9_10 = (MessageDialogContent.field_P <= 50) ? false : true;
          OpacityWidget.$cfr$intArgs$a$a4481b60e878(stackIn_4_0 != 0, stackIn_4_1, stackIn_4_2, stackIn_4_3, stackIn_4_4, stackIn_4_5, stackIn_4_6, stackIn_4_7, stackIn_6_8, stackIn_8_9, stackIn_9_10, true);
        } else {
          if (ProgressBarWidget.a(HighscoresScreen.field_L.settings, HighscoresScreen.field_L.field_mc, 2)) {
            var2 = 1;
            stackIn_49_0 = var2;
            stackIn_49_1 = 14;
            stackIn_49_2 = param1;
            stackIn_49_3 = 11;
            stackIn_49_4 = 15;
            stackIn_49_5 = -12;
            stackIn_49_6 = CompressedContainerSupport.field_d;
            stackIn_49_7 = 0;
            stackIn_51_8 = (MidiNoteMixer.field_v) || (TransformSupport.field_e);
            stackIn_53_9 = 13;
            stackIn_54_10 = (MessageDialogContent.field_P <= 50) ? false : true;
            OpacityWidget.$cfr$intArgs$a$a4481b60e878(stackIn_49_0 != 0, stackIn_49_1, stackIn_49_2, stackIn_49_3, stackIn_49_4, stackIn_49_5, stackIn_49_6, stackIn_49_7, stackIn_51_8, stackIn_53_9, stackIn_54_10, true);
          } else {
            var2 = 0;
            stackIn_27_0 = var2;
            stackIn_27_1 = 14;
            stackIn_27_2 = param1;
            stackIn_27_3 = 11;
            stackIn_27_4 = 15;
            stackIn_27_5 = -12;
            stackIn_27_6 = CompressedContainerSupport.field_d;
            stackIn_27_7 = 0;
            stackIn_29_8 = (MidiNoteMixer.field_v) || (TransformSupport.field_e);
            stackIn_31_9 = 13;
            stackIn_32_10 = (MessageDialogContent.field_P <= 50) ? false : true;
            OpacityWidget.$cfr$intArgs$a$a4481b60e878(stackIn_27_0 != 0, stackIn_27_1, stackIn_27_2, stackIn_27_3, stackIn_27_4, stackIn_27_5, stackIn_27_6, stackIn_27_7, stackIn_29_8, stackIn_31_9, stackIn_32_10, true);
          }
        }
        if (HighscoresScreen.field_N) {
          JaggrabDownloader.field_j.writeCipheredOpcode(false, 64);
          HighscoresScreen.field_N = false;
        }
        if (PauseMenuScreen.field_H) {
          JaggrabDownloader.field_j.writeCipheredOpcode(false, 10);
          PauseMenuScreen.field_H = false;
        }
        if (RankingsBufferSupport.field_f) {
          ChatMessage.a((byte) 75, AccountStateQuery.ratedMembersonly);
          RankingsBufferSupport.field_f = false;
        }
        if (param0 >= 7) {
          return;
        }
        field_m = 16;
    }

    AchievementSubmission(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.field_s = param3;
        this.field_r = param0;
        this.field_p = param2;
        this.field_n = param1;
        this.field_t = param4;
        this.field_q = param5;
    }

    static {
        field_u = 13;
        field_m = 1 << field_u;
    }
}
