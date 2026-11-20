/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LegacyOpenGlTextureCache {
    private OpenGlToolkit toolkit;
    static int[] field_d;
    static int field_e;
    static Widget field_a;
    private TextureProvider provider;
    private SoftLruCache cache;

    final void clearCache(int param0) {
        this.cache.clear((byte) 94);
        if (param0 >= 0) {
          field_a = (Widget) null;
        }
    }

    final void ageCache(boolean param0) {
        this.cache.age(param0, 5);
    }

    final OpenGlTexture2D getTexture(byte param0, int param1) {
        int[] var27 = null;
        OpenGlTexture2D var15 = null;
        int[] var29 = null;
        OpenGlTexture2D var19 = null;
        int[] var28 = null;
        OpenGlTexture2D var17 = null;
        float[] var12 = null;
        float[] var11 = null;
        float[] var10 = null;
        OpenGlTexture2D var5 = null;
        int[] var30 = null;
        OpenGlTexture2D var21 = null;
        int[] var32 = null;
        OpenGlTexture2D var25 = null;
        int var9 = VoidHunters.field_G;
        int var3 = -84 % ((param0 + 54) / 60);
        Object var4 = this.cache.get(0, (long)param1);
        if (var4 != null) {
          return (OpenGlTexture2D) (var4);
        }
        if (!this.provider.isTextureReady(param1, (byte) -42)) {
          return null;
        }
        TextureMetadata var6 = this.provider.getTextureMetadata(-20292, param1);
        int var7 = var6.field_h ? 64 : this.toolkit.field_X;
        if (!var6.field_i) {
          if (var6.field_q == 2) {
            var27 = this.provider.generateArgbPixels(88, var7, var7, false, param1, 0.699999988079071f);
            var15 = new OpenGlTexture2D(this.toolkit, 3553, 6408, var7, var7, var6.field_j != 0 ? true : false, var27, 0, 0, false);
            var15.setWrap(var6.field_s, var6.field_k, 10497);
            this.cache.put(var15, (long)param1, (byte) -117);
            return var15;
          }
          if (SoftwareGlyphMask.a(97, (int) var6.field_c)) {
            var29 = this.provider.generateRgbPixels(var7, 0.699999988079071f, true, param1, var7, true);
            var19 = new OpenGlTexture2D(this.toolkit, 3553, 6408, var7, var7, var6.field_j != 0 ? true : false, var29, 0, 0, false);
            var19.setWrap(var6.field_s, var6.field_k, 10497);
            this.cache.put(var19, (long)param1, (byte) -117);
            return var19;
          }
          var28 = this.provider.generateArgbPixels(88, var7, var7, false, param1, 0.699999988079071f);
          var17 = new OpenGlTexture2D(this.toolkit, 3553, 6408, var7, var7, var6.field_j != 0 ? true : false, var28, 0, 0, false);
          var17.setWrap(var6.field_s, var6.field_k, 10497);
          this.cache.put(var17, (long)param1, (byte) -117);
          return var17;
        }
        if (this.toolkit.isBloomEnabled()) {
          var12 = this.provider.generateFloatRgba(0.699999988079071f, var7, param1, var7, 76, false);
          var11 = var12;
          var10 = var11;
          float[] var8 = var10;
          var5 = new OpenGlTexture2D(this.toolkit, 3553, 34842, var7, var7, var6.field_j != 0 ? true : false, var12, 6408);
          var5.setWrap(var6.field_s, var6.field_k, 10497);
          this.cache.put(var5, (long)param1, (byte) -117);
          return var5;
        }
        if (var6.field_q == 2) {
          var30 = this.provider.generateArgbPixels(88, var7, var7, false, param1, 0.699999988079071f);
          var21 = new OpenGlTexture2D(this.toolkit, 3553, 6408, var7, var7, var6.field_j != 0 ? true : false, var30, 0, 0, false);
          var21.setWrap(var6.field_s, var6.field_k, 10497);
          this.cache.put(var21, (long)param1, (byte) -117);
          return var21;
        }
        if (SoftwareGlyphMask.a(97, (int) var6.field_c)) {
          var32 = this.provider.generateRgbPixels(var7, 0.699999988079071f, true, param1, var7, true);
          var25 = new OpenGlTexture2D(this.toolkit, 3553, 6408, var7, var7, var6.field_j != 0 ? true : false, var32, 0, 0, false);
          var25.setWrap(var6.field_s, var6.field_k, 10497);
          this.cache.put(var25, (long)param1, (byte) -117);
          return var25;
        }
        int[] var31 = this.provider.generateArgbPixels(88, var7, var7, false, param1, 0.699999988079071f);
        OpenGlTexture2D var23 = new OpenGlTexture2D(this.toolkit, 3553, 6408, var7, var7, var6.field_j != 0 ? true : false, var31, 0, 0, false);
        var23.setWrap(var6.field_s, var6.field_k, 10497);
        this.cache.put(var23, (long)param1, (byte) -117);
        return var23;
    }

    public static void clearSharedReferences(int param0) {
        field_d = null;
        field_a = null;
        int var1 = 115 / ((-54 - param0) / 51);
    }

    LegacyOpenGlTextureCache(OpenGlToolkit param0, TextureProvider param1) {
        this.cache = new SoftLruCache(256);
        try {
          this.provider = param1;
          this.toolkit = param0;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "rlb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = 0;
    }
}
