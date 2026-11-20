/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ReferenceTrackingControl {
    static MenuInputState menuInputState;
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
        menuInputState = null;
        if (param0 != 26) {
          menuInputState = (MenuInputState) null;
        }
    }

    static {
        menuInputState = new MenuInputState(1);
        field_b = 0;
    }
}
