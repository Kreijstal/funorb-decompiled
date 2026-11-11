/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LegacyOpenGlSpriteTexture extends LegacyOpenGlTexture2D {
    static SpriteData field_u;
    static double[] field_w;
    float field_v;
    int field_t;
    int field_s;
    float field_r;

    LegacyOpenGlSpriteTexture(OpenGlToolkit param0, int param1, int param2, int param3, boolean param4, int[] param5, int param6, int param7) {
        super(param0, param1, 6408, param2, param3, param4, param5, param6, param7, true);
        try {
          if (this.target != 34037) {
            this.field_v = 1.0f;
            this.field_r = 1.0f;
          } else {
            this.field_v = (float)param3;
            this.field_r = (float)param2;
          }
          this.field_t = param2;
          this.field_s = param3;
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "qk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ')');
        }
    }

    LegacyOpenGlSpriteTexture(OpenGlToolkit param0, int param1, int param2, int param3, int param4, boolean param5, byte[] param6, int param7) {
        super(param0, param1, param2, param3, param4, param5, param6, param7, true);
        try {
          this.field_s = param4;
          if (this.target != 34037) {
            this.field_r = 1.0f;
            this.field_v = 1.0f;
          } else {
            this.field_r = (float)param3;
            this.field_v = (float)param4;
          }
          this.field_t = param3;
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "qk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ')');
        }
    }

    LegacyOpenGlSpriteTexture(OpenGlToolkit param0, int param1, int param2, int param3, int param4, int param5, byte[] param6, int param7) {
        super(param0, 3553, param1, param4, param5);
        try {
          this.field_t = param2;
          this.field_s = param3;
          this.uploadBytes(0, 0, param3, 0, 0, param6, -24575, param2, param7, true);
          this.field_r = (float)param2 / (float)param4;
          this.field_v = (float)param3 / (float)param5;
          this.setWrap(false, false, -3554);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "qk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_u = null;
        field_w = null;
        if (param0 < 80) {
          LegacyOpenGlSpriteTexture.getTooltipStyle(-13);
        }
    }

    LegacyOpenGlSpriteTexture(OpenGlToolkit param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, 3553, 6408, param3, param4);
        try {
          this.field_s = param2;
          this.field_t = param1;
          this.uploadInts(0, 0, param2, param1, 0, param5, (byte) 68, true, 0);
          this.field_r = (float)param1 / (float)param3;
          this.field_v = (float)param2 / (float)param4;
          this.setWrap(false, false, -3554);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "qk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, GraphicsToolkit param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
          if (param3 < 34) {
            LegacyOpenGlSpriteTexture.getTooltipStyle(-73);
          }
          RasterBuffer.a(param7, 2, param1, param6, param2, param5, param0, 1, param4);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "qk.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static TooltipRenderer getTooltipStyle(int param0) {
        int var1 = 119 % ((63 - param0) / 41);
        if (GzipInflater.field_c == null) {
          GzipInflater.field_c = new TooltipRenderer();
          GzipInflater.field_c.initializeRenderers(KeySwitchComponent.field_J, true);
          GzipInflater.field_c.field_b = 4;
          GzipInflater.field_c.field_o = 14;
          GzipInflater.field_c.field_c = 2763306;
          GzipInflater.field_c.field_f = 5;
          GzipInflater.field_c.field_q = BlendModeOperator.field_o;
          GzipInflater.field_c.field_i = 6;
          GzipInflater.field_c.field_a = 7697781;
          GzipInflater.field_c.field_t = 0;
        }
        return GzipInflater.field_c;
    }

    final static boolean i(int param0) {
        if (param0 != 250) {
          return true;
        }
        return TimeSwitchBehaviour.field_r > 250 ? true : false;
    }

    static {
        field_w = new double[]{0.5, 3.0, 3.0, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 2.0, 0.5};
    }
}
