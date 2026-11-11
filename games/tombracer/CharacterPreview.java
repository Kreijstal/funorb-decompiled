/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CharacterPreview extends IntrusiveNode {
    ModelAnimator field_j;
    static ft field_g;
    static int field_h;
    static int field_i;
    static SpriteData field_f;

    public static void a(boolean param0) {
        field_g = null;
        field_f = null;
        if (!param0) {
          CharacterPreview.a(-58);
        }
    }

    final static int clamp(int param0, int param1, int param2, int param3) {
        if (param1 == -16226) {
          return param2 <= param3 ? param3 <= param0 ? param3 : param0 : param2;
        }
        CharacterPreview.a(false);
        return param2 <= param3 ? param3 <= param0 ? param3 : param0 : param2;
    }

    final void draw(int param0, int param1, int param2, byte param3) {
        if (param3 != 73) {
          return;
        }
        hp.drawModelPreview(param1, 0, 0, this.field_j.getModel((byte) 74), -1918106173, param2, param0);
    }

    CharacterPreview(int param0) {
        this.field_j = new ModelAnimator(0, param0, 1);
        this.field_j.play(param0, false, 0, 0, true);
    }

    final static void a(int param0) {
        pra.b(-1);
        if (param0 != 8824) {
          return;
        }
        GasVentModel.i(0);
    }

    final void tick(int param0) {
        if (param0 > -30) {
          field_h = 127;
          this.field_j.tick(0);
          return;
        }
        this.field_j.tick(0);
    }

    static {
        field_g = new ft(1);
    }
}
