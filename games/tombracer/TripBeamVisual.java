/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TripBeamVisual {
    static PlayerViewportLayout stackedRightViewportLayout;
    static int field_a;
    static ValidationOutcome field_d;
    static ToolkitModel[] field_b;

    public static void releaseStatics(int param0) {
        field_b = null;
        stackedRightViewportLayout = null;
        if (param0 != -1901) {
          return;
        }
        field_d = null;
    }

    TripBeamVisual(int param0, int param1, BeamSegment param2, int param3) {
    }

    final void setColour(int param0, int param1) {
        if (param0 != -978) {
          field_b = (ToolkitModel[]) null;
        }
    }

    static {
        stackedRightViewportLayout = new PlayerViewportLayout();
        field_d = new ValidationOutcome();
    }
}
