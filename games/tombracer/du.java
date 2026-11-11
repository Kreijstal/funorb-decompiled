/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class du {
    static SpriteData field_c;
    static String field_a;
    static int field_d;
    static boolean field_e;
    static String field_f;
    static String field_b;
    static boolean field_g;
    static long field_h;

    final static int recordArchiveConnectionFailure(int param0, byte param1) {
        int var2;
        int var3;
        int var4;
        var4 = TombRacer.field_G ? 1 : 0;
        S2CProfileUpdatePacket.field_c = null;
        var2 = -112 / ((param1 - 76) / 38);
        SneakHintPanel.field_a = null;
        ColourKeyOperator.field_m = 0;
        var3 = field_d;
        field_d = MenuInputState.field_d;
        if (param0 == 51) {
          StatReportingScoringObserver.field_l.field_n = 2;
        } else {
          if (param0 == 50) {
            StatReportingScoringObserver.field_l.field_n = 5;
          } else {
            StatReportingScoringObserver.field_l.field_n = 1;
          }
        }
        MenuInputState.field_d = var3;
        StatReportingScoringObserver.field_l.field_a = StatReportingScoringObserver.field_l.field_a + 1;
        if (StatReportingScoringObserver.field_l.field_a >= 2 &&
          51 == param0) {
          return 2;
        }
        if (StatReportingScoringObserver.field_l.field_a >= 2 &&
          param0 == 50) {
          return 5;
        }
        if (StatReportingScoringObserver.field_l.field_a >= 4) {
          return 1;
        }
        return -1;
    }

    public static void releaseStatics(int param0) {
        field_c = null;
        field_b = null;
        if (param0 != -6884) {
          return;
        }
        field_f = null;
        field_a = null;
    }

    static {
        field_a = "Players";
        field_b = "These walls enjoy going for walkies. Wallflowers they aren't.";
        field_f = "You can't slay these septic serpents, so steer clear. Hold <img=10><img=11> as you step over the snakes to sneak by.";
    }
}
