/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class OpenGlSceneLight extends SceneLight {
    static ViewportManager field_o;
    static String[] field_q;
    static UiComponent[] field_p;

    final void setColour(int param0, int param1) {
        this.colour = param1;
        if (param0 != 255) {
          this.setRadius((byte) 66, -128);
        }
    }

    final void setRadius(byte param0, int param1) {
        if (param0 != 62) {
          this.setIntensity((byte) 7, -0.12800447642803192f);
          this.radius = param1;
          return;
        }
        this.radius = param1;
    }

    OpenGlSceneLight(int param0, int param1, int param2, int param3, int param4, float param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    public static void releaseStatics(int param0) {
        field_o = null;
        if (param0 != -25657) {
          OpenGlSceneLight.releaseStatics(-89);
          field_q = null;
          field_p = null;
          return;
        }
        field_q = null;
        field_p = null;
    }

    final void setPosition(int param0, int param1, byte param2, int param3) {
        this.y = param0;
        this.z = param3;
        this.x = param1;
        int var5 = -86 % ((-55 - param2) / 58);
    }

    final void setIntensity(byte param0, float param1) {
        this.intensity = param1;
        if (param0 <= 77) {
          field_q = (String[]) null;
        }
    }

    static {
        field_o = null;
        field_q = new String[42];
    }
}
