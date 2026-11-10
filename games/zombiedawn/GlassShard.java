/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GlassShard extends WorldObject {
    private int field_G;
    private int field_F;
    static String field_D;
    private int field_E;
    int field_H;

    final void tick(int param0) {
        if (param0 <= 95) {
          return;
        }
        if (this.field_H <= 0) {
          return;
        }
        this.field_H = this.field_H - 3;
        int fieldTemp$0 = this.field_F + 1;
        this.field_F = this.field_F + 1;
        if (fieldTemp$0 <= this.field_G) {
          return;
        }
        this.field_F = 0;
        int fieldTemp$1 = this.field_E + 1;
        this.field_E = this.field_E + 1;
        if (fieldTemp$1 < MenuSpriteGlobals.field_c.length) {
          return;
        }
        this.field_E = 0;
    }

    public static void releaseStatics(int param0) {
        if (param0 != 3) {
          GlassShard.hasPendingResize((byte) -9);
          field_D = null;
          return;
        }
        field_D = null;
    }

    final static boolean hasPendingResize(byte param0) {
        if (param0 <= 124) {
          GlassShard.hasPendingResize((byte) 23);
          if (SpriteSheetDecoder.field_b == null) {
            return false;
          }
          if (SpriteSheetDecoder.field_b.canResize(119)) {
            return true;
          }
          return false;
        }
        if (SpriteSheetDecoder.field_b == null) {
          return false;
        }
        if (SpriteSheetDecoder.field_b.canResize(119)) {
          return true;
        }
        return false;
    }

    final void draw(byte param0, Camera param1) {
        int var3_int = 0;
        int var4 = 0;
        try {
          var3_int = param1.worldToScreenX(this.field_y >> 16, (byte) -96);
          if (param0 >= -76) {
            GlassShard.hasPendingResize((byte) -99);
          }
          var4 = param1.worldToScreenY(this.field_x >> 16, 0) - this.field_H;
          MenuSpriteGlobals.field_c[this.field_E].drawTransparent(var3_int, var4);
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "lm.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    GlassShard(int param0, int param1, int param2) {
        super(param0, param1, 0);
        this.field_G = 20;
        this.field_H = param2 + 150;
        this.field_G = SpriteEffectHelpers.randomInt(3) + 3;
        this.field_F = SpriteEffectHelpers.randomInt(this.field_G);
        this.field_E = SpriteEffectHelpers.randomInt(5);
        SpriteEffectHelpers.randomElement(ImageProducerRasterBuffer.field_k);
    }

    static {
        field_D = "Type your age in years";
    }
}
