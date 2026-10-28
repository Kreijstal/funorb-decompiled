/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ImageProducerRasterBuffer extends RasterBuffer implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    private java.awt.image.ImageConsumer consumer;
    static java.awt.Font field_l;
    private java.awt.image.ColorModel colorModel;

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return param0 == this.consumer;
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        try {
          if (param0 == this.consumer) {
            this.consumer = null;
          }
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "cg.removeConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    private final synchronized void pushPixels(int completionStatus) {
        if (this.consumer == null) {
          return;
        }
        this.consumer.setPixels(0, 0, this.width, this.height, this.colorModel, this.pixels, 0, this.width);
        this.consumer.imageComplete(completionStatus);
    }

    public final boolean imageUpdate(java.awt.Image param0, int param1, int param2, int param3, int param4, int param5) {
        String stackIn_5_2 = null;
        try {
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var7 = decompiledCaughtException;
          RuntimeException stackIn_4_0 = var7;
          StringBuilder stackIn_4_1 = new StringBuilder().append("cg.imageUpdate(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public static void releaseStatics(int guard) {
        field_l = null;
        if (guard != -1) {
          field_l = (java.awt.Font) null;
        }
    }

    final void initialize(int guard, int width, java.awt.Component component, int height) {
        try {
          this.pixels = new int[1 + height * width];
          this.height = height;
          this.width = width;
          this.colorModel = (java.awt.image.ColorModel) ((Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255));
          this.image = component.createImage((java.awt.image.ImageProducer) (this));
          this.pushPixels(2);
          component.prepareImage(this.image, (java.awt.image.ImageObserver) (this));
          this.pushPixels(2);
          component.prepareImage(this.image, (java.awt.image.ImageObserver) (this));
          if (guard != 1018) {
            java.awt.Image var6 = (java.awt.Image) null;
            this.imageUpdate((java.awt.Image) null, 84, -46, -64, -30, -50);
          }
          this.pushPixels(2);
          component.prepareImage(this.image, (java.awt.image.ImageObserver) (this));
          this.bindRaster(guard - 895);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "cg.A(" + guard + ',' + width + ',' + (component != null ? "{...}" : "null") + ',' + height + ')');
        }
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        try {
          this.consumer = param0;
          param0.setDimensions(this.width, this.height);
          param0.setProperties((Hashtable) null);
          param0.setColorModel(this.colorModel);
          param0.setHints(14);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "cg.addConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        try {
          this.addConsumer(param0);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "cg.startProduction(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void configurePunctuationKeyCodes(int guard) {
        KeyCodeSupport.awtToGameKeyCodes[46] = 72;
        KeyCodeSupport.awtToGameKeyCodes[47] = 73;
        KeyCodeSupport.awtToGameKeyCodes[92] = 74;
        KeyCodeSupport.awtToGameKeyCodes[45] = 26;
        KeyCodeSupport.awtToGameKeyCodes[93] = 43;
        int var1 = -51 / ((46 - guard) / 32);
        KeyCodeSupport.awtToGameKeyCodes[59] = 57;
        KeyCodeSupport.awtToGameKeyCodes[61] = 27;
        KeyCodeSupport.awtToGameKeyCodes[44] = 71;
        KeyCodeSupport.awtToGameKeyCodes[91] = 42;
        KeyCodeSupport.awtToGameKeyCodes[192] = 28;
        KeyCodeSupport.awtToGameKeyCodes[520] = 59;
        KeyCodeSupport.awtToGameKeyCodes[222] = 58;
    }

    final void drawImage(int x, int guard, int y, java.awt.Graphics graphics) {
        this.pushPixels(2);
        if (guard != 0) {
          return;
        }
        try {
          graphics.drawImage(this.image, x, y, (java.awt.image.ImageObserver) (this));
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "cg.B(" + x + ',' + guard + ',' + y + ',' + (graphics != null ? "{...}" : "null") + ')');
        }
    }

    final static void showLoadingProgressDialog(int guard) {
        Checkbox.field_F.closeAllPanels(17415);
        if (ProxySocketConnector.field_r == null) {
          ProxySocketConnector.field_r = new LoadingProgressDialog(Checkbox.field_F, AccountPanelInputSupport.field_b);
          if (guard != 32) {
            field_l = (java.awt.Font) null;
            Checkbox.field_F.pushPanel(ProxySocketConnector.field_r, 61);
            return;
          }
          Checkbox.field_F.pushPanel(ProxySocketConnector.field_r, 61);
          return;
        }
        if (guard == 32) {
          Checkbox.field_F.pushPanel(ProxySocketConnector.field_r, 61);
          return;
        }
        field_l = (java.awt.Font) null;
        Checkbox.field_F.pushPanel(ProxySocketConnector.field_r, 61);
    }

    final static void readAchievementResponse(int guard) {
        int var8 = EscapeVector.obfuscationControl;
        try {
          if (guard <= 68) {
            return;
          }
          CipherPacketBuffer var14 = QuickChatDynamicCommand.incomingPackets;
          int var2 = var14.readUnsignedByte(0);
          if (var2 == 0) {
            int[] var11 = ServerListNavigationSupport.createScratchWords(-84);
            int[] var3 = var11;
            int[] var10 = var11;
            int[] var4 = var10;
            CipherPacketBuffer var5 = var14;
            int var6 = ((PacketBuffer) ((Object) var5)).readUnsignedByte(0);
            for (int var7 = 0; var6 > var7; var7++) {
              var10[var7] = ((PacketBuffer) ((Object) var5)).readInt(-5053);
            }
            AchievementQuery var13 = (AchievementQuery) (SavedDataQuerySupport.field_b.first(false));
            if (var13 == null) {
              ConnectionSupport.closeTransport(16);
              return;
            }
            var13.achievementWords = var3;
            var13.unavailable = false;
            var13.complete = true;
            var13.unlink((byte) -86);
            return;
          }
          if (var2 == 1) {
            AchievementRecord var12 = (AchievementRecord) (RasterSnapshot.field_l.first(false));
            if (var12 == null) {
              ConnectionSupport.closeTransport(16);
              return;
            }
            var12.unlink((byte) -64);
            return;
          }
          if (var2 != 2) {
            GameModeSelectScreen.reportClientError(false, "A1: " + LoginStage.formatPacketDiagnostic((byte) 58), (Throwable) null);
            ConnectionSupport.closeTransport(16);
            return;
          }
          AchievementQuery var15 = (AchievementQuery) (SavedDataQuerySupport.field_b.first(false));
          if (var15 == null) {
            ConnectionSupport.closeTransport(16);
            return;
          }
          var15.achievementWords = ServerListNavigationSupport.createScratchWords(-92);
          var15.unavailable = true;
          var15.complete = true;
          var15.unlink((byte) -77);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var1 = decompiledCaughtException;
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) var1), "cg.J(" + guard + ')');
        }
    }

    ImageProducerRasterBuffer() {
    }

    static {
    }
}
