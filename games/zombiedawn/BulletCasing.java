/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BulletCasing {
    private int field_d;
    private boolean field_a;
    private int field_j;
    private int field_o;
    private int field_n;
    static int[] field_f;
    private int field_e;
    private int field_k;
    static String field_l;
    private int field_b;
    static boolean field_c;
    static Js5Archive field_h;
    private int field_i;
    static int field_m;
    static int[] field_g;

    public static void releaseStatics(byte param0) {
        if (param0 <= 78) {
          return;
        }
        field_h = null;
        field_g = null;
        field_f = null;
        field_l = null;
    }

    final void draw(Camera param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        if (!this.field_a) {
          return;
        }
        try {
          var3_int = param0.worldToScreenX(this.field_i >> 16, (byte) -60);
          if (param1 != 8192) {
            BulletCasing.clearAnimatedTiles((byte) 123);
          }
          var4 = param0.worldToScreenY(this.field_o >> 16, 0) - (this.field_k >> 16);
          SpatialBucket.field_b[this.field_b].drawTransparent(-3 + var3_int, -3 + var4);
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "a.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void eject(int param0, int param1, int param2, int param3) {
        this.field_i = param2;
        this.field_o = param0 + (-(SpriteEffectHelpers.randomInt(8) << 16) + 262144);
        this.field_k = param1 << 16;
        if (param3 > 57) {
          this.field_j = (SpriteEffectHelpers.randomInt(1) << 16) + 65536;
          this.field_e = SpriteEffectHelpers.randomInt(32768) - 114688;
          this.field_a = true;
          this.field_d = 12 + SpriteEffectHelpers.randomInt(3);
          this.field_n = 0;
          this.field_b = 0;
          SpriteEffectHelpers.randomElement(ProgressMessageDialog.field_fb);
          return;
        }
        BulletCasing.releaseStatics((byte) -23);
        this.field_j = (SpriteEffectHelpers.randomInt(1) << 16) + 65536;
        this.field_e = SpriteEffectHelpers.randomInt(32768) - 114688;
        this.field_a = true;
        this.field_d = 12 + SpriteEffectHelpers.randomInt(3);
        this.field_n = 0;
        this.field_b = 0;
        SpriteEffectHelpers.randomElement(ProgressMessageDialog.field_fb);
    }

    final static void clearAnimatedTiles(byte param0) {
        if (param0 != 40) {
          field_h = (Js5Archive) null;
          SingleChildWidget.field_x = new FrameSequence[]{};
          return;
        }
        SingleChildWidget.field_x = new FrameSequence[]{};
    }

    final void tick(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int var2;
        int var2Lifetime1;
        if (!this.field_a) {
          return;
        }
        if (this.field_k <= 0) {
          return;
        }
        this.field_k = this.field_k + this.field_j;
        this.field_i = this.field_i + this.field_e;
        if (this.field_j <= -131072) {
          var2 = 63 / ((41 - param0) / 53);
          if (this.field_b >= 2) {
            return;
          }
          fieldTemp$0 = this.field_n + 1;
          this.field_n = this.field_n + 1;
          if (this.field_d >= fieldTemp$0) {
            return;
          }
          this.field_n = 0;
          this.field_b = this.field_b + 1;
          if (this.field_b != 2) {
            return;
          }
          EmptyWidgetPainter.queueSoundEffect(SpriteEffectHelpers.randomInt(1) + 153, false);
          return;
        }
        this.field_j = this.field_j - 8192;
        var2Lifetime1 = 63 / ((41 - param0) / 53);
        if (this.field_b >= 2) {
          return;
        }
        fieldTemp$1 = this.field_n + 1;
        this.field_n = this.field_n + 1;
        if (this.field_d >= fieldTemp$1) {
          return;
        }
        this.field_n = 0;
        this.field_b = this.field_b + 1;
        if (this.field_b != 2) {
          return;
        }
        EmptyWidgetPainter.queueSoundEffect(SpriteEffectHelpers.randomInt(1) + 153, false);
        return;
    }

    BulletCasing() {
        this.field_d = 20;
        this.field_a = false;
    }

    static {
        int var0 = 0;
        field_f = new int[4096];
        for (var0 = 0; 4096 > var0; var0++) {
          field_f[var0] = PasswordFieldPainter.smootherStep(var0, 89);
        }
        field_l = "Player names can be up to 12 letters, numbers and underscores";
        field_g = new int[]{280, 180, 180, 180, 180, 180, 180};
        field_m = 8;
        field_c = false;
    }
}
