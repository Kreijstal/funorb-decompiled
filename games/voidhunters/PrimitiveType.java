/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PrimitiveType {
    static boolean[] field_d;
    static int field_c;
    static String field_b;
    static AccountRequestResult field_a;

    final static void updateSocialNameDialog(int param0, boolean param1, int param2) {
        int var3;
        String var4;
        Object var5;
        String var6;
        CharSequence var11;
        Object var5Lifetime1;
        Object var5Lifetime2;
        if (GpuFractalNoiseVolume.activeNameEntryDialog != null) {
          var3 = GpuFractalNoiseVolume.activeNameEntryDialog.updateAndGetResult(0, param1);
          if (0 != var3) {
            if (var3 == 2 &&
              GpuFractalNoiseVolume.activeNameEntryDialog.text != null &&
              !GpuFractalNoiseVolume.activeNameEntryDialog.text.equals("")) {
              if (91 == GpuFractalNoiseVolume.activeNameEntryDialog.text.charAt(0)) {
                var4 = GpuFractalNoiseVolume.activeNameEntryDialog.text;
                var5 = var4;
                var5Lifetime2 = var4;
              } else {
                var11 = (CharSequence) ((Object) GpuFractalNoiseVolume.activeNameEntryDialog.text);
                var4 = ConstantColorTextureOperation.normalizeName(false, var11);
              }
              var5Lifetime1 = null;
              if (0 == MissionGenerationDataFactory.field_b) {
                var5Lifetime1 = SetPhasedEnergyBeamPulsetime.a(var4, param0, param2 - 10115);
              }
              if (MissionGenerationDataFactory.field_b == 1) {
                var5Lifetime1 = ServerTickFactory.a((byte) 90, var4, param0);
              }
              if (2 == MissionGenerationDataFactory.field_b) {
                var5Lifetime1 = SetExplosionPushMultiplier.requestAddIgnore(2, var4, param0);
              }
              if (MissionGenerationDataFactory.field_b == 3) {
                var5Lifetime1 = GameCanvasResizeListener.a(param0, var4, var4, (byte) -76);
              }
              if (var5Lifetime1 != null) {
                var6 = (String) null;
                ChatMessages.appendMessage((byte) -86, 0, (String) null, var4, (String) (var5Lifetime1), 2);
              }
            }
            MissionGenerationDataFactory.field_b = -1;
            GpuFractalNoiseVolume.activeNameEntryDialog = null;
          }
        }
        if (param2 == 19717) {
          return;
        }
        PrimitiveType.updateSocialNameDialog(-70, false, 63);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void clearSharedReferences(byte param0) {
        field_b = null;
        field_d = null;
        field_a = null;
        int var1 = 89 / ((-64 - param0) / 54);
    }

    static {
        field_b = "Invite more players, or alternatively try changing the '<%0>' setting.";
        field_c = 100;
    }
}
