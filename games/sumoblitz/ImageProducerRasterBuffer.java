/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ImageProducerRasterBuffer extends RasterBuffer implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    static String connectionRestoredText;
    static int field_k;
    static PcmSampleStream[] field_n;
    private java.awt.image.ImageConsumer field_l;
    private java.awt.image.ColorModel field_m;

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (this.field_l == param0) {
            this.field_l = null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("fh.removeConsumer(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static boolean hasLegacyStatusFlag(int guard) {
        if (guard > -83) {
          field_n = (PcmSampleStream[]) null;
        }
        return IndexBufferReference.hasLegacyStatusFlag(59, LegacyOpenGlUnlitEffect.activeApplet(2));
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        try {
          this.addConsumer(param0);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "fh.startProduction(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        try {
          this.field_l = param0;
          param0.setDimensions(this.width, this.height);
          param0.setProperties((Hashtable) null);
          param0.setColorModel(this.field_m);
          param0.setHints(14);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "fh.addConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return param0 == this.field_l;
    }

    private final synchronized void publishPixels(byte guard) {
        if (this.field_l == null) {
          return;
        }
        this.field_l.setPixels(0, 0, this.width, this.height, this.field_m, this.pixels, 0, this.width);
        this.field_l.imageComplete(2);
        if (guard < 31) {
          java.awt.image.ImageConsumer var3 = (java.awt.image.ImageConsumer) null;
          this.requestTopDownLeftRightResend((java.awt.image.ImageConsumer) null);
        }
    }

    final static EmailValidationError validateDomainLabel(String label, int guard) {
        int var3 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        EmailValidationError stackIn_4_0 = null;
        EmailValidationError stackIn_8_0 = null;
        EmailValidationError stackIn_18_0 = null;
        EmailValidationError stackIn_22_0 = null;
        Object stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        try {
          var2_int = label.length();
          if (var2_int == 0) {
            stackIn_4_0 = ClientExceptionSupport.MISSING_EMAIL_COMPONENT;
            return stackIn_4_0;
          }
          if (var2_int > 63) {
            stackIn_8_0 = SocialContact.EMAIL_COMPONENT_TOO_LONG;
            return stackIn_8_0;
          }
          for (var3 = 0; var3 < var2_int; var3++) {
            var4 = label.charAt(var3);
            if (var4 == 45) {
              if (var3 == 0 ||
                var2_int - 1 == var3) {
                stackIn_18_0 = MouseInputRegistration.INVALID_EMAIL_SYNTAX;
                return stackIn_18_0;
              }
            } else {
              if (TextureFilter.abcdefghijklmnopqrstuvwxyzabcdefghijText.indexOf(var4) == -1) {
                stackIn_22_0 = MouseInputRegistration.INVALID_EMAIL_SYNTAX;
                return stackIn_22_0;
              }
            }
          }
          if (guard == -1) {
            return null;
          }
          ImageProducerRasterBuffer.hasLegacyStatusFlag(40);
          stackIn_27_0 = null;
          return (EmailValidationError) (stackIn_27_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_30_0 = var2;
          stackIn_30_1 = new StringBuilder().append("fh.C(");
          if (label == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(guard).append(')').toString());
        }
    }

    final static CompactMeshGeometry decodeCompactMesh(IsaacPacketBuffer packet, int guard) {
        int var7 = 0;
        CompactMeshGeometry stackIn_3_0 = null;
        CompactMeshGeometry stackIn_25_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        CompactMeshGeometry var5 = null;
        int var6 = 0;
        int var8 = 0;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          var2_int = packet.readBits(8, (byte) -92);
          if (guard != -16736) {
            stackIn_3_0 = (CompactMeshGeometry) null;
            return stackIn_3_0;
          }
          if (var2_int > 0) {
            throw new IllegalStateException("" + var2_int);
          }
          var3 = LoginIdentifierSupport.readBitFlag(packet, false) ? 1 : 0;
          var4 = LoginIdentifierSupport.readBitFlag(packet, false) ? 1 : 0;
          var5 = new CompactMeshGeometry();
          var5.field_D = (short)packet.readBits(16, (byte) -119);
          var5.field_Q = WidgetStateStyle.decodePackedShortArray(var5.field_Q, packet, -119, 16);
          var5.field_B = WidgetStateStyle.decodePackedShortArray(var5.field_B, packet, -120, 16);
          var5.field_r = WidgetStateStyle.decodePackedShortArray(var5.field_r, packet, -127, 16);
          var5.field_n = (short)packet.readBits(16, (byte) -117);
          var5.field_A = WidgetStateStyle.decodePackedShortArray(var5.field_A, packet, -128, 16);
          var5.field_b = WidgetStateStyle.decodePackedShortArray(var5.field_b, packet, -116, 16);
          var5.field_l = WidgetStateStyle.decodePackedShortArray(var5.field_l, packet, -126, 16);
          if (var3 != 0) {
            var5.field_c = (short)packet.readBits(16, (byte) -94);
            var5.field_x = WidgetStateStyle.decodePackedShortArray(var5.field_x, packet, guard + 16608, 16);
            var5.field_g = WidgetStateStyle.decodePackedShortArray(var5.field_g, packet, -124, 16);
            var5.field_L = WidgetStateStyle.decodePackedShortArray(var5.field_L, packet, -113, 16);
            var5.field_e = WidgetStateStyle.decodePackedShortArray(var5.field_e, packet, -127, 16);
            var5.field_k = WidgetStateStyle.decodePackedShortArray(var5.field_k, packet, -118, 16);
            var5.field_h = WidgetStateStyle.decodePackedShortArray(var5.field_h, packet, guard + 16615, 16);
          }
          if (var4 != 0) {
            packet.readBits(16, (byte) -127);
            var5.field_z = WidgetStateStyle.decodePackedShortArray(var5.field_z, packet, -121, 16);
            var5.field_C = WidgetStateStyle.decodePackedShortArray(var5.field_C, packet, guard + 16619, 16);
            var5.field_G = WidgetStateStyle.decodePackedShortArray(var5.field_G, packet, -114, 16);
            var5.field_y = WidgetStateStyle.decodePackedShortArray(var5.field_y, packet, guard + 16619, 16);
            var5.field_R = WidgetStateStyle.decodePackedShortArray(var5.field_R, packet, guard + 16623, 16);
          }
          if (LoginIdentifierSupport.readBitFlag(packet, false)) {
            var5.field_K = WidgetStateStyle.decodePackedShortArray(var5.field_K, packet, -112, 16);
          }
          if (LoginIdentifierSupport.readBitFlag(packet, false)) {
            var5.field_a = OpenGlBuffer.decodePackedByteArray(16, 0, var5.field_a, packet);
            var6 = 0;
            for (var7 = 0; var7 < var5.field_a.length; var7++) {
              if (var6 < (255 & var5.field_a[var7])) {
                var6 = 255 & var5.field_a[var7];
              }
            }
            if (var6 == 0) {
              var5.field_a = null;
            } else {
              var5.field_E = (byte)(var6 + 1);
            }
          }
          stackIn_25_0 = var5;
          return stackIn_25_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_28_0 = var2;
          stackIn_28_1 = new StringBuilder().append("fh.G(");
          if (packet == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(guard).append(')').toString());
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
          stackIn_4_1 = new StringBuilder().append("fh.imageUpdate(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final void drawImage(int guard, int x, java.awt.Graphics graphics, int y) {
        if (guard >= -47) {
          return;
        }
        try {
          this.publishPixels((byte) 55);
          graphics.drawImage(this.image, x, y, (java.awt.image.ImageObserver) (this));
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "fh.B(" + guard + ',' + x + ',' + (graphics != null ? "{...}" : "null") + ',' + y + ')');
        }
    }

    final void initializeRaster(java.awt.Component component, int height, int width, int guard) {
        try {
          this.pixels = new int[height * width + 1];
          this.height = height;
          this.width = width;
          if (guard > -97) {
            this.field_m = (java.awt.image.ColorModel) null;
          }
          this.field_m = (java.awt.image.ColorModel) ((Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255));
          this.image = component.createImage((java.awt.image.ImageProducer) (this));
          this.publishPixels((byte) 117);
          component.prepareImage(this.image, (java.awt.image.ImageObserver) (this));
          this.publishPixels((byte) 75);
          component.prepareImage(this.image, (java.awt.image.ImageObserver) (this));
          this.publishPixels((byte) 45);
          component.prepareImage(this.image, (java.awt.image.ImageObserver) (this));
          this.bindRaster(-1);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "fh.E(" + (component != null ? "{...}" : "null") + ',' + height + ',' + width + ',' + guard + ')');
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 > -27) {
          return;
        }
        connectionRestoredText = null;
        field_n = null;
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    ImageProducerRasterBuffer() {
    }

    static {
        field_k = 0;
        connectionRestoredText = "Connection restored.";
        field_n = new PcmSampleStream[3];
    }
}
