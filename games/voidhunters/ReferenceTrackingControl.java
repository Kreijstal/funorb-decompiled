/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ReferenceTrackingControl {
    static MenuInputState field_a;
    static int field_b;

    final static void endReferenceTracking(int param0) {
        if (param0 > -107) {
          field_b = 31;
          GetMissionTerrainNebulaProbability.referenceTrackingEnabled = false;
          return;
        }
        GetMissionTerrainNebulaProbability.referenceTrackingEnabled = false;
    }

    public static void clearSharedReferences(byte param0) {
        field_a = null;
        if (param0 != 26) {
          field_a = (MenuInputState) null;
        }
    }

    static {
        field_a = new MenuInputState(1);
        field_b = 0;
    }
}
