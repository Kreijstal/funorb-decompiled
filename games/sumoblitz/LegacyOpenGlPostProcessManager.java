/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LegacyOpenGlPostProcessManager {
    private LegacyOpenGlFramebuffer framebuffer;
    static ResourceArchive field_f;
    static SoundCache field_b;
    private IntrusiveDeque effects;
    private LegacyOpenGlGraphicsToolkit toolkit;
    static int[] field_a;

    final boolean isAvailable(int guard) {
        if (guard == 550267135) {
          return null != this.framebuffer ? true : false;
        }
        field_b = (SoundCache) null;
        return null != this.framebuffer ? true : false;
    }

    final static int floorModByPositive(int divisor, int guard, int value) {
        int var3 = divisor - 1 & value >> 31;
        if (guard > 87) {
          return ((value >>> 31) + value) % divisor + var3;
        }
        return -115;
    }

    static int bitwiseAnd(int left, int right) {
        return left & right;
    }

    public static void releaseStatics(byte param0) {
        field_b = null;
        int var1 = -15 / ((param0 + 74) / 44);
        field_a = null;
        field_f = null;
    }

    final void close(byte guard) {
        int var2;
        IntrusiveNode var3;
        int var4;
        var4 = Sumoblitz.field_L ? 1 : 0;
        var2 = -61 / ((guard - 13) / 45);
        this.framebuffer = null;
        if (this.effects.isEmpty((byte) -78)) {
          return;
        }
        var3 = this.effects.first(86);
        while (this.effects.sentinel != var3) {
          ((LegacyOpenGlPostProcessEffect) (var3)).close(50);
          var3 = var3.next;
        }
    }

    LegacyOpenGlPostProcessManager(LegacyOpenGlGraphicsToolkit owner) {
        this.effects = new IntrusiveDeque();
        try {
          this.toolkit = owner;
          if (this.toolkit.supportsFramebufferObjects) {
            if (!this.toolkit.field_C) {
              return;
            }
            this.framebuffer = new LegacyOpenGlFramebuffer(this.toolkit);
            if (this.toolkit.field_Bc > 1 &&
              this.toolkit.field_B &&
              this.toolkit.field_vb) {
              this.framebuffer = new LegacyOpenGlFramebuffer(this.toolkit);
              return;
            }
          }
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "eb.<init>(" + (owner != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
