/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PrimitiveType {
    static boolean[] field_d;
    static int field_c;
    static String field_b;
    static AccountRequestResult field_a;

    final static void a(int param0, boolean param1, int param2) {
        int var3;
        String var4;
        Object var5;
        String var6;
        CharSequence var11;
        Object var5Lifetime1;
        Object var5Lifetime2;
        if (GpuFractalNoiseVolume.field_p != null) {
          var3 = GpuFractalNoiseVolume.field_p.a(0, param1);
          if (0 != var3) {
            if (var3 == 2 &&
              GpuFractalNoiseVolume.field_p.text != null &&
              !GpuFractalNoiseVolume.field_p.text.equals("")) {
              if (91 == GpuFractalNoiseVolume.field_p.text.charAt(0)) {
                var4 = GpuFractalNoiseVolume.field_p.text;
                var5 = var4;
                var5Lifetime2 = var4;
              } else {
                var11 = (CharSequence) ((Object) GpuFractalNoiseVolume.field_p.text);
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
                var5Lifetime1 = SetExplosionPushMultiplier.a(2, var4, param0);
              }
              if (MissionGenerationDataFactory.field_b == 3) {
                var5Lifetime1 = GameCanvasResizeListener.a(param0, var4, var4, (byte) -76);
              }
              if (var5Lifetime1 != null) {
                var6 = (String) null;
                lh.a((byte) -86, 0, (String) null, var4, (String) (var5Lifetime1), 2);
              }
            }
            MissionGenerationDataFactory.field_b = -1;
            GpuFractalNoiseVolume.field_p = null;
          }
        }
        if (param2 == 19717) {
          return;
        }
        PrimitiveType.a(-70, false, 63);
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
