/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GrayscaleTextureOperation extends TextureOperation {
    static String[] connectingMessages;

    public static void clearSharedReferences(byte param0) {
        int var1 = 59 % ((-48 - param0) / 43);
        connectingMessages = null;
    }

    final static void resetTutorialHints(boolean param0, byte param1) {
        int var2_int = 0;
        int var3 = VoidHunters.field_G;
        try {
          for (var2_int = 0; var2_int < 11; var2_int++) {
            HardpointMatch.hintTimers[var2_int] = 0;
            TutorialProgressState.completedHints[var2_int] = !param0 ? true : false;
          }
          if (param1 > -5) {
            GrayscaleTextureOperation.clearSharedReferences((byte) 81);
          }
          DequeReferenceTracker.field_c = !param0 ? true : false;
          WeaponDefinition.field_a = !param0 ? true : false;
          SetUseTrails.field_o = !param0 ? true : false;
          ComponentBehaviour.field_b = !param0 ? true : false;
          OpenGlVertexDeclaration.field_d = !param0 ? true : false;
          GetPointDefenceLaserReload.field_p = !param0 ? true : false;
          GetShieldsDirectionalRadius.saveCompletedHints(37);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "qqa.C(" + param0 + ',' + param1 + ')');
        }
    }

    public GrayscaleTextureOperation() {
        super(1, true);
    }

    final int[] getMonochromeRow(int param0, boolean param1) {
        int var8 = 0;
        int[] var3;
        int[][] var4;
        int[] var5;
        int[] var6;
        int[] var7;
        int var9;
        int[] var10;
        var9 = VoidHunters.field_G;
        var10 = this.field_f.getRow((byte) -62, param0);
        var3 = var10;
        if (this.field_f.field_e) {
          var4 = this.getInputColorRow((byte) 69, 0, param0);
          var5 = var4[0];
          var6 = var4[1];
          var7 = var4[2];
          for (var8 = 0; TextHotspotRegion.textureWidth > var8; var8++) {
            var10[var8] = (var6[var8] + var5[var8] + var7[var8]) / 3;
          }
        }
        if (param1) {
          return var3;
        }
        connectingMessages = (String[]) null;
        return var3;
    }

    static {
        connectingMessages = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
    }
}
