/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ShrinkingRingEffect extends TimedSceneEffect {
    private boolean expanding;
    static il field_t;
    static long field_s;

    ShrinkingRingEffect(int xQ8, int yQ8, int color) {
        super(30, xQ8, yQ8, color);
        this.expanding = false;
    }

    public static void releaseStatics(int param0) {
        if (param0 != 0) {
          return;
        }
        field_t = null;
    }

    final void render(GraphicsToolkit toolkit, int guard) {
        int var3_int = (int)(255.0 * ((double)this.remainingTicks / 30.0));
        int var4 = 0;
        if (guard > -121) {
          return;
        }
        try {
          if (this.expanding) {
            var4 = (int)((double)(30 - this.remainingTicks) / 30.0 * 8192.0);
          } else {
            var4 = (int)(8192.0 * ((double)this.remainingTicks / 30.0));
          }
          var4 = var4 * 2;
          am.field_j[4].a((float)(this.x >> 8), (float)(this.y >> 8), var4, 0, 1, var3_int << 24, 1);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "gb.C(" + (toolkit != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    static {
        field_t = new il();
    }
}
