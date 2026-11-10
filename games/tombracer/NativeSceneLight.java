/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NativeSceneLight extends SceneLight {
    static String field_p;
    static String field_o;
    static String field_r;
    static float field_q;

    public static void releaseStatics(byte param0) {
        field_r = null;
        field_o = null;
        if (param0 >= -68) {
          return;
        }
        field_p = null;
    }

    NativeSceneLight(int param0, int param1, int param2, int param3, int param4, float param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    final void setPosition(int param0, int param1, byte param2, int param3) {
        this.z = param3;
        int var5 = -61 / ((-55 - param2) / 58);
        this.y = param0;
        this.x = param1;
    }

    final void setRadius(byte param0, int param1) {
        if (param0 != 62) {
          this.setIntensity((byte) 4, 0.1830597221851349f);
          this.radius = param1;
          return;
        }
        this.radius = param1;
    }

    final void setIntensity(byte param0, float param1) {
        if (param0 < 77) {
          this.setIntensity((byte) 113, -0.27641594409942627f);
          this.intensity = param1;
          return;
        }
        this.intensity = param1;
    }

    final void setColour(int param0, int param1) {
        if (param0 != 255) {
          return;
        }
        this.colour = param1;
    }

    static {
        field_o = "Resizable";
        field_r = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_p = "to return to the normal view.";
    }
}
