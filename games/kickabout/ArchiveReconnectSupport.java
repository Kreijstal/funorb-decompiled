/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArchiveReconnectSupport {
    static String field_a;
    static boolean field_b;

    final static int retryArchiveConnection(int param0, int param1) {
        int var2;
        int var3;
        var3 = Kickabout.field_G;
        iv.field_o = null;
        AnimationSkeleton.field_e = null;
        IterableDualLinkDeque.field_a = 0;
        var2 = GameSoundEffect.field_b;
        GameSoundEffect.field_b = PlayerModelPreview.field_e;
        if (param1 == 51) {
          ParticipantStatus.field_t.field_l = 2;
        } else {
          if (50 == param1) {
            ParticipantStatus.field_t.field_l = 5;
          } else {
            ParticipantStatus.field_t.field_l = 1;
          }
        }
        PlayerModelPreview.field_e = var2;
        ParticipantStatus.field_t.field_o = ParticipantStatus.field_t.field_o + 1;
        if (param0 >= -115) {
          return 120;
        }
        if (ParticipantStatus.field_t.field_o >= 2 &&
          param1 == 51) {
          return 2;
        }
        if (ParticipantStatus.field_t.field_o >= 2 &&
          param1 == 50) {
          return 5;
        }
        if (4 <= ParticipantStatus.field_t.field_o) {
          return 1;
        }
        return -1;
    }

    public static void releaseStatics(int param0) {
        field_a = null;
        if (param0 != 50) {
          ArchiveReconnectSupport.releaseStatics(-97);
        }
    }

    static {
        field_a = "Your team earns 10% of normal experience.";
        field_b = false;
    }
}
