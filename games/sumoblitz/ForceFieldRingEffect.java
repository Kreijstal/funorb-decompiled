/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ForceFieldRingEffect extends TimedSceneEffect {
    static ResourceArchive field_s;
    private boolean expanding;
    private static long[] field_v;
    static ToolkitFont field_t;

    final void render(GraphicsToolkit toolkit, int guard) {
        int var3_int = 0;
        int var4 = 0;
        int var4Lifetime1;
        try {
          var3_int = (int)((double)this.remainingTicks / 100.0 * 255.0);
          if (guard > -121) {
            GraphicsToolkit var5 = (GraphicsToolkit) null;
            this.render((GraphicsToolkit) null, 95);
          }
          var3_int += 20;
          var4 = 0;
          if (this.expanding) {
            var4Lifetime1 = (int)((double)(100 - this.remainingTicks) / 100.0 * 4096.0);
          } else {
            var4Lifetime1 = (int)(4096.0 * ((double)this.remainingTicks / 100.0));
          }
          ArenaDefinition.field_c.drawRotated((float)this.x, (float)this.y, var4Lifetime1, 0, 0, (var3_int << 24) + this.color, 1);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "be.C(" + (toolkit != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    final static int glBaseFormat(boolean param0, int param1) {
        if (6407 != param1 &&
          param1 != 34843 &&
          param1 != 34837) {
          if (param0) {
            ForceFieldRingEffect.glBaseFormat(true, -56);
          }
          if (6408 != param1 &&
            param1 != 34842 &&
            34836 != param1) {
            if (6406 != param1 &&
              param1 != 34844) {
              if (param1 != 6409 &&
                param1 != 34846) {
                if (6410 != param1 &&
                  34847 != param1) {
                  if (param1 != 6402) {
                    throw new IllegalArgumentException("");
                  }
                  return 6402;
                }
                return 6410;
              }
              return 6409;
            }
            return 6406;
          }
          return 6408;
        }
        return 6407;
    }

    public static void releaseStatics(int param0) {
        field_t = null;
        field_v = null;
        if (param0 != 6408) {
          field_t = (ToolkitFont) null;
        }
        field_s = null;
    }

    ForceFieldRingEffect(int xPixels, int yPixels, int color, boolean expanding) {
        super(100, xPixels, yPixels, color);
        this.expanding = expanding ? true : false;
    }

    static {
        int var2 = 0;
        int var3 = 0;
        long var0;
        field_v = new long[256];
        for (var2 = 0; var2 < 256; var2++) {
          var0 = (long)var2;
          for (var3 = 0; var3 < 8; var3++) {
            if ((1L & var0) != 1L) {
              var0 = var0 >>> 1;
            } else {
              var0 = -3932672073523589310L ^ var0 >>> 1;
            }
          }
          field_v[var2] = var0;
        }
    }
}
