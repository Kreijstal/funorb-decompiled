/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class EllipseRasterizer {
    private static String field_z;

    final static void fillEllipse(int param0, int param1, int param2, int param3, int param4, int param5) {
        if (param1 == param3) {
          ConsoleValue.a((byte) -90, param5, param4, param0, param3);
          return;
        }
        if (param2 != 17000) {
          EllipseRasterizer.fillEllipse(-92, -40, -47, 44, 16, -23);
          if (OpenGlTexture3D.field_j > -param3 + param0) {
            SetGrapplingHookFireForce.a((byte) -126, param5, param4, param3, param1, param0);
            return;
          }
          if (param3 + param0 > GetCountermeasureLauncherProjectiles.field_o) {
            SetGrapplingHookFireForce.a((byte) -126, param5, param4, param3, param1, param0);
            return;
          }
          if (NebulaField.field_c > param5 - param1) {
            SetGrapplingHookFireForce.a((byte) -126, param5, param4, param3, param1, param0);
            return;
          }
          if (param1 + param5 <= EnvironmentReflectionGpuMaterialEffect.field_i) {
            ToolkitFontMetrics.fillEllipse((byte) -117, param5, param1, param0, param4, param3);
            return;
          }
          SetGrapplingHookFireForce.a((byte) -126, param5, param4, param3, param1, param0);
          return;
        }
        if (OpenGlTexture3D.field_j > -param3 + param0) {
          SetGrapplingHookFireForce.a((byte) -126, param5, param4, param3, param1, param0);
          return;
        }
        if (param3 + param0 > GetCountermeasureLauncherProjectiles.field_o) {
          SetGrapplingHookFireForce.a((byte) -126, param5, param4, param3, param1, param0);
          return;
        }
        if (NebulaField.field_c > param5 - param1) {
          SetGrapplingHookFireForce.a((byte) -126, param5, param4, param3, param1, param0);
          return;
        }
        if (param1 + param5 <= EnvironmentReflectionGpuMaterialEffect.field_i) {
          ToolkitFontMetrics.fillEllipse((byte) -117, param5, param1, param0, param4, param3);
          return;
        }
        SetGrapplingHookFireForce.a((byte) -126, param5, param4, param3, param1, param0);
    }

    static {
        field_z = "mf.A(";
    }
}
