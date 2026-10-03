/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PendingActionMarker extends IntrusiveNode {
    static IntrusiveDeque pendingRankedListQueries;
    int actionId;
    static int field_g;

    final static void a(byte param0) {
        if (!ProgressBarWidget.field_G) {
            throw new IllegalStateException();
        }
        kf.field_e = true;
        if (param0 > 115) {
            TextInputValidator.a((byte) 107, false);
            SpriteConstructionSupport.clientScreenStage = 0;
            return;
        }
        pendingRankedListQueries = (IntrusiveDeque) null;
        TextInputValidator.a((byte) 107, false);
        SpriteConstructionSupport.clientScreenStage = 0;
    }

    public static void c(byte param0) {
        int var1 = -118 / ((-11 - param0) / 40);
        pendingRankedListQueries = null;
    }

    PendingActionMarker(int param0) {
        this.actionId = param0;
    }

    static {
        field_g = -1;
        pendingRankedListQueries = new IntrusiveDeque();
    }
}
