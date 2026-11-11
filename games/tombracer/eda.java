/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eda {
    int field_a;
    int field_b;
    static GameFont field_f;
    static int field_e;
    int field_c;
    int field_d;

    final static void applyGraphicsMode(int param0, boolean param1) {
        GraphicsQuality var3 = null;
        RendererMode var2 = null;
        int var4 = TombRacer.field_G ? 1 : 0;
        GraphicsQuality var3Lifetime1;
        GraphicsQuality var3Lifetime2;
        GraphicsQuality var3Lifetime3;
        GraphicsQuality var3Lifetime4;
        GraphicsQuality var3Lifetime5;
        RendererMode var2Lifetime1;
        RendererMode var2Lifetime2;
        RendererMode var2Lifetime3;
        RendererMode var2Lifetime4;
        RendererMode var2Lifetime5;
        if (param0 == 0) {
          var3 = baa.field_e;
          var2 = WeaponShooterBehaviour.field_r;
          BitPacketBuffer.setGraphicsSettings(param1, var2, var3);
          return;
        }
        if (param0 == 1) {
          var3Lifetime1 = tia.field_d;
          var2Lifetime1 = WeaponShooterBehaviour.field_r;
          BitPacketBuffer.setGraphicsSettings(param1, var2Lifetime1, var3Lifetime1);
          return;
        }
        if (param0 == 4) {
          var3Lifetime2 = PitModel.field_s;
          var2Lifetime2 = WeaponShooterBehaviour.field_r;
          BitPacketBuffer.setGraphicsSettings(param1, var2Lifetime2, var3Lifetime2);
          return;
        }
        if (2 == param0) {
          var2Lifetime3 = CourseLayoutFactory.field_d;
          var3Lifetime3 = baa.field_e;
          BitPacketBuffer.setGraphicsSettings(param1, var2Lifetime3, var3Lifetime3);
          return;
        }
        if (param0 != 3) {
          var3Lifetime4 = PitModel.field_s;
          var2Lifetime4 = CourseLayoutFactory.field_d;
          BitPacketBuffer.setGraphicsSettings(param1, var2Lifetime4, var3Lifetime4);
          return;
        }
        var2Lifetime5 = CourseLayoutFactory.field_d;
        var3Lifetime5 = tia.field_d;
        BitPacketBuffer.setGraphicsSettings(param1, var2Lifetime5, var3Lifetime5);
    }

    public static void releaseStatics(int param0) {
        field_f = null;
        if (param0 < 24) {
          field_e = 15;
        }
    }

    static {
    }
}
