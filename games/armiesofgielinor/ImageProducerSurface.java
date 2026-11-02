/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ImageProducerSurface extends RasterImageSurface implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    private java.awt.image.ImageConsumer consumer;
    static byte[][] field_j;
    static int[] field_l;
    static RgbSprite[] field_n;
    static String field_i;
    static RgbSprite field_k;
    private java.awt.image.ColorModel colorModel;

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    final void allocate(int width, int obfuscationGuard, java.awt.Component component, int height) {
        this.pixels = new int[width * height + 1];
        if (obfuscationGuard != -46) {
          return;
        }
        try {
          this.height = height;
          this.width = width;
          this.colorModel = (java.awt.image.ColorModel) ((Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255));
          this.image = component.createImage((java.awt.image.ImageProducer) (this));
          this.pushPixels(false);
          component.prepareImage(this.image, (java.awt.image.ImageObserver) (this));
          this.pushPixels(false);
          component.prepareImage(this.image, (java.awt.image.ImageObserver) (this));
          this.pushPixels(false);
          component.prepareImage(this.image, (java.awt.image.ImageObserver) (this));
          this.bindRasterTarget(5605);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "dh.E(" + width + ',' + obfuscationGuard + ',' + (component != null ? "{...}" : "null") + ',' + height + ')');
        }
    }

    final static void d(int param0) {
        EffectPresentation.field_e = null;
        if (param0 != -1) {
          field_i = (String) null;
        }
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.consumer != param0) {
            return;
          }
          this.consumer = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("dh.removeConsumer(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        try {
          this.consumer = param0;
          param0.setDimensions(this.width, this.height);
          param0.setProperties((Hashtable) null);
          param0.setColorModel(this.colorModel);
          param0.setHints(14);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "dh.addConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2) {
        int var3;
        int var4;
        int var3Lifetime1;
        int var4Lifetime1;
        if (param2 == 32) {
          var3 = AccountRegistrationForm.field_Z[param0][param1];
          if (var3 <= -1) {
            return;
          }
          var4 = AttackEvent.nextBoundedInt(false, LinkButtonPainter.field_d[var3].length, li.field_n);
          if (null == LinkButtonPainter.field_d[var3][var4]) {
            return;
          }
          if (0 == LinkButtonPainter.field_d[var3][var4].samples.length) {
            return;
          }
          RadialSummonMenu.playDefaultSoundWithIntGuard(52, LinkButtonPainter.field_d[var3][var4]);
          return;
        }
        field_l = (int[]) null;
        var3Lifetime1 = AccountRegistrationForm.field_Z[param0][param1];
        if (var3Lifetime1 <= -1) {
          return;
        }
        var4Lifetime1 = AttackEvent.nextBoundedInt(false, LinkButtonPainter.field_d[var3Lifetime1].length, li.field_n);
        if (null == LinkButtonPainter.field_d[var3Lifetime1][var4Lifetime1]) {
          return;
        }
        if (0 == LinkButtonPainter.field_d[var3Lifetime1][var4Lifetime1].samples.length) {
          return;
        }
        RadialSummonMenu.playDefaultSoundWithIntGuard(52, LinkButtonPainter.field_d[var3Lifetime1][var4Lifetime1]);
    }

    public static void releaseStatics(int obfuscationGuard) {
        field_i = null;
        field_n = null;
        field_k = null;
        field_j = (byte[][]) null;
        field_l = null;
        if (obfuscationGuard >= -98) {
          field_i = (String) null;
        }
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return param0 == this.consumer;
    }

    final static EmailCheckResult getEmailCheckResult(String email, byte obfuscationGuard) {
        RuntimeException failure = null;
        EmailCheckResult sharedResult = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (IgnoreRequestSupport.emailCheckResult.isComplete((byte) 124) &&
            !email.equals(IgnoreRequestSupport.emailCheckResult.getEmail(true))) {
            IgnoreRequestSupport.emailCheckResult = ProgressDialog.createEmailCheckResult(email, obfuscationGuard ^ 4210691);
          }
          if (obfuscationGuard != 67) {
            field_i = (String) null;
          }
          sharedResult = IgnoreRequestSupport.emailCheckResult;
          return sharedResult;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          failure = decompiledCaughtException;
          stackIn_9_0 = failure;
          stackIn_9_1 = new StringBuilder().append("dh.F(");
          if (email == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        try {
          this.addConsumer(param0);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "dh.startProduction(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void paint(int obfuscationGuard, java.awt.Graphics graphics, int y, int x) {
        try {
          this.pushPixels(false);
          graphics.drawImage(this.image, x, y, (java.awt.image.ImageObserver) (this));
          if (obfuscationGuard != 255) {
            java.awt.image.ImageConsumer var6 = (java.awt.image.ImageConsumer) null;
            this.removeConsumer((java.awt.image.ImageConsumer) null);
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "dh.C(" + obfuscationGuard + ',' + (graphics != null ? "{...}" : "null") + ',' + y + ',' + x + ')');
        }
    }

    public final boolean imageUpdate(java.awt.Image param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_4_0 = var7;
          stackIn_4_1 = new StringBuilder().append("dh.imageUpdate(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final synchronized void pushPixels(boolean suppressFrameComplete) {
        if (this.consumer == null) {
          return;
        }
        this.consumer.setPixels(0, 0, this.width, this.height, this.colorModel, this.pixels, 0, this.width);
        if (!suppressFrameComplete) {
          this.consumer.imageComplete(2);
          return;
        }
    }

    ImageProducerSurface() {
    }

    static {
        field_j = new byte[50][];
        field_i = "Players: ";
    }
}
