/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class FloatNoiseSliceGenerator {
    static boolean field_a;
    static ReverbPcmStream field_b;
    static String field_c;

    final static void closeTransientMenusAndDialogs(byte param0) {
        if (param0 > 75) {
          TileTextureOperation.closePlayerContextMenu(0);
          ShipBodyFactoryHolder.closeNameEntryDialog((byte) -74);
          Asteroid.activeReportDialog = null;
          GetUseExtraBackground.closeQuickChatMenu(-1);
          return;
        }
        FloatNoiseSliceGenerator.closeTransientMenusAndDialogs((byte) 48);
        TileTextureOperation.closePlayerContextMenu(0);
        ShipBodyFactoryHolder.closeNameEntryDialog((byte) -74);
        Asteroid.activeReportDialog = null;
        GetUseExtraBackground.closeQuickChatMenu(-1);
    }

    public static void clearSharedReferences(byte param0) {
        field_b = null;
        field_c = null;
        if (param0 != 53) {
          FloatNoiseSliceGenerator.clearSharedReferences((byte) -48);
        }
    }

    abstract void fillSlice(float param0, float param1, float[] param2, float param3, int param4, float param5, byte param6, int param7, int param8, int param9, int param10);

    static {
        field_a = false;
        field_c = "<%0> is already on your ignore list.";
    }
}
