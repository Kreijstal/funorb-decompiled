/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ShipBodyFactoryHolder {
    static GameStateFactory factory;
    static boolean field_b;

    final static void closeNameEntryDialog(byte param0) {
        GpuFractalNoiseVolume.activeNameEntryDialog = null;
        if (param0 != -74) {
          factory = (GameStateFactory) null;
        }
    }

    public static void clearSharedReferences(int param0) {
        if (param0 != 23357) {
          ShipBodyFactoryHolder.clearSharedReferences(27);
          factory = null;
          return;
        }
        factory = null;
    }

    static {
        factory = (GameStateFactory) ((Object) new ShipBodyFactory());
        field_b = true;
    }
}
