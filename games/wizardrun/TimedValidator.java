/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class TimedValidator implements Validator {
    static LoginForm field_b;
    private long field_f;
    static int field_e;
    static IntrusiveDeque field_d;
    static String field_c;
    static int field_a;

    final static Sprite[] a(int param0, ResourceArchive param1, int param2, int param3) {
        RuntimeException var4 = null;
        Sprite[] stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        Sprite[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 13469) {
            stackIn_2_0 = (Sprite[]) null;
            return stackIn_2_0;
          }
          if (MusicPatch.loadSpriteSheet(param3, param0, param1, -120)) {
            stackIn_7_0 = ProgressSubmission.buildDecodedSprites(19999);
            return stackIn_7_0;
          }
          stackIn_5_0 = null;
          return (Sprite[]) (stackIn_5_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("r.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final ValidationState getState(boolean param0) {
        if (this.isEmpty(7245)) {
          return PacketBuffer.field_o;
        }
        if (!(MonotonicClockHelpers.monotonicMillis((byte) 25) >= this.field_f + 350L)) {
          return AccountFormTextHelpers.field_c;
        }
        if (!param0) {
          field_b = (LoginForm) null;
        }
        return this.validateCurrentText(true);
    }

    abstract String getCurrentValidationMessage(byte param0);

    abstract ValidationState validateCurrentText(boolean param0);

    final static void c(int param0) {
        Sprite var1 = null;
        Sprite var2 = null;
        int var3 = 0;
        int var4 = wizardrun.field_H;
        try {
          var1 = new Sprite(540, 140);
          UrlPacketDownloader.a(var1, false);
          TriangleRasterState.useRasterClip();
          SoftwareRasterizer.clear();
          DualLinkNodeHashTable.field_f = 0;
          ContentTransitionDialog.drawLogoMeshes(param0 ^ -301);
          var2 = var1.copy();
          for (var3 = 0; var3 < 15; var3++) {
            var2.drawSilhouette(-2, -2, 16777215);
            SoftwareRasterizer.blurRectangle(4, 4, 0, 0, 540, 140);
          }
          StrongCacheEntry.field_t.bindAsRasterTarget();
          var1.drawHalfSize(0, 0);
          if (param0 != 350) {
            field_a = 72;
          }
          UsernameLoginCredentials.popRasterState(4);
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "r.N(" + param0 + ')');
        }
    }

    public final String getMessage(int param0) {
        if (param0 != -2864) {
          this.getState(false);
        }
        if (this.isEmpty(7245)) {
          return null;
        }
        if ((this.field_f + 350L) > MonotonicClockHelpers.monotonicMillis((byte) 29)) {
          return null;
        }
        return this.getCurrentValidationMessage((byte) -82);
    }

    public static void releaseStatics(int param0) {
        field_d = null;
        field_c = null;
        field_b = null;
        if (param0 < 105) {
          TimedValidator.releaseStatics(-68);
        }
    }

    public final void invalidate(byte param0) {
        if (param0 >= -59) {
          return;
        }
        this.field_f = MonotonicClockHelpers.monotonicMillis((byte) 31);
    }

    static {
        field_d = new IntrusiveDeque();
        field_c = "Use the arrow keys to move.";
    }
}
