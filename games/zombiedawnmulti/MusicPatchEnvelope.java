/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MusicPatchEnvelope {
    byte[] field_e;
    int field_i;
    int field_m;
    static int field_h;
    int field_c;
    int field_b;
    int field_j;
    byte[] field_l;
    static boolean field_f;
    int field_g;
    static String[] field_a;
    int field_k;
    static IndexedSprite field_d;

    public static void releaseStatics(byte param0) {
        if (param0 != 78) {
          MusicPatchEnvelope.readChatMessage(false, (byte) -38);
          field_d = null;
          field_a = null;
          return;
        }
        field_d = null;
        field_a = null;
    }

    final static ChatMessage readChatMessage(boolean param0, byte param1) {
        boolean stackIn_5_0 = false;
        int stackIn_11_0 = 0;
        int[] stackIn_25_0 = null;
        Throwable decompiledCaughtException = null;
        CipherPacketBuffer var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        CipherPacketBuffer var8 = null;
        QuickChatPhraseDefinition var9 = null;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        var8 = StatusAndMeshHelpers.field_e;
        var2 = var8;
        var3 = var8.readUnsignedByte(31365);
        if (param1 <= 69) {
          field_a = (String[]) null;
        }
        ScorePopup.field_N = var3 & 127;
        stackIn_5_0 = ((var3 & 128) != 0);
        AccountCreationForm.field_R = stackIn_5_0;
        BufferedFile.field_g = var8.readUnsignedByte(31365);
        SimEntity.field_K = var8.readLong((byte) -30);
        if (2 == ScorePopup.field_N) {
          LaboratoryScreen.field_m = var8.readUnsignedShort((byte) 69);
          UnitView.field_W = var8.readUnsignedMedium(128);
        } else {
          LaboratoryScreen.field_m = 0;
          UnitView.field_W = 0;
        }
        stackIn_11_0 = (var8.readUnsignedByte(31365) != 1) ? 0 : 1;
        var4 = stackIn_11_0;
        CacheEntry.field_s = var8.readString((byte) -71);
        if (var4 != 0) {
          IntrusiveDequeCursor.field_h = var8.readString((byte) -121);
        } else {
          IntrusiveDequeCursor.field_h = CacheEntry.field_s;
        }
        if (ScorePopup.field_N == 1) {
          TerrainEffectZone.field_r = var8.readUnsignedShort((byte) 69);
          ContextMenu.field_Ib = var8.readString((byte) -62);
        } else {
          if (ScorePopup.field_N != 4) {
            TerrainEffectZone.field_r = 0;
            ContextMenu.field_Ib = null;
          } else {
            TerrainEffectZone.field_r = var8.readUnsignedShort((byte) 69);
            ContextMenu.field_Ib = var8.readString((byte) -62);
          }
        }
        if (!param0) {
          ViewFactoryHelpers.field_b = LevelUpgradeHelpers.readCompressedChatText(var8, 80, 3460);
          MeshMaterial.field_g = null;
          return new ChatMessage(param0);
        }
        var5 = var8.readUnsignedShort((byte) 69);
        try {
          var9 = MouseInputHandler.field_c.getDefinition(var5, -11452);
          ViewFactoryHelpers.field_b = var9.getPreview(-18572);
          if (!IntrusiveDequeCursor.field_h.equals(ProgressDialog.field_lb)) {
            stackIn_25_0 = var9.field_r;
          } else {
            stackIn_25_0 = null;
          }
          MeshMaterial.field_g = stackIn_25_0;
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (Exception) (Object) decompiledCaughtException;
          MouseInputHandler.reportClientError("CC1", (Throwable) ((Object) var6), false);
          ViewFactoryHelpers.field_b = null;
          MeshMaterial.field_g = null;
          return new ChatMessage(param0);
        }
        return new ChatMessage(param0);
    }

    static {
        field_f = false;
    }
}
