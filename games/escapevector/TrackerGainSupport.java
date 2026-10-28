/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TrackerGainSupport {
    static QuickChatDynamicCommand field_d;
    static IntrusiveDeque field_c;
    static Sprite field_b;
    static Sprite field_e;
    static String field_a;

    public static void releaseStatics(boolean guard) {
        field_e = null;
        if (!guard) {
          field_a = null;
          field_d = null;
          field_c = null;
          field_b = null;
          return;
        }
        field_b = (Sprite) null;
        field_a = null;
        field_d = null;
        field_c = null;
        field_b = null;
    }

    final static void limitTrackerGain(int maximumGain, int guard) {
        if (null == DraggableWidget.field_N) {
          return;
        }
        if (!(GrowableIntList.field_b <= maximumGain)) {
          GrowableIntList.field_b = maximumGain;
          DraggableWidget.field_N.setMasterVolume(MembershipPromotionSupport.field_b * GrowableIntList.field_b / 64);
        }
        if (guard == 32471) {
          return;
        }
        TrackerGainSupport.releaseStatics(false);
    }

    static {
        field_d = new QuickChatDynamicCommand(15, 0, 1, 0);
        field_a = "Email address is unavailable";
    }
}
