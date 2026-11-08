/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ImageProducerRasterBuffer extends RasterBuffer implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    static String field_l;
    static String field_m;
    private java.awt.image.ImageConsumer field_f;
    static String field_k;
    static String[] field_j;
    static int[] field_i;
    static String field_g;
    private java.awt.image.ColorModel field_h;

    final void drawImage(int param0, int param1, int param2, java.awt.Graphics param3) {
        try {
          if (param1 != 10) {
            this.pushPixels((byte) 4);
          }
          this.pushPixels((byte) -104);
          param3.drawImage(this.field_d, param2, param0, (java.awt.image.ImageObserver) (this));
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "dh.A(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void initialize(int param0, int param1, int param2, java.awt.Component param3) {
        this.field_e = param2;
        this.field_a = param1;
        this.field_b = new int[param1 * param2 + 1];
        this.field_h = (java.awt.image.ColorModel) ((Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255));
        this.field_d = param3.createImage((java.awt.image.ImageProducer) (this));
        this.pushPixels((byte) 119);
        param3.prepareImage(this.field_d, (java.awt.image.ImageObserver) (this));
        this.pushPixels((byte) -127);
        param3.prepareImage(this.field_d, (java.awt.image.ImageObserver) (this));
        this.pushPixels((byte) 116);
        param3.prepareImage(this.field_d, (java.awt.image.ImageObserver) (this));
        if (param0 != 30) {
          return;
        }
        try {
          this.bindAsTarget(32);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "dh.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        try {
          this.field_f = param0;
          param0.setDimensions(this.field_a, this.field_e);
          param0.setProperties((Hashtable) null);
          param0.setColorModel(this.field_h);
          param0.setHints(14);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "dh.addConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static ResourceArchive createResourceArchive(byte param0, int param1) {
        if (param0 <= -124) {
          return SetLagCommand.createResourceArchive(param1, (byte) -58, 1, false, false, true);
        }
        PacketBuffer var3 = (PacketBuffer) null;
        ImageProducerRasterBuffer.a(81, 114, (PacketBuffer) null, 122, 17);
        return SetLagCommand.createResourceArchive(param1, (byte) -58, 1, false, false, true);
    }

    private final synchronized void pushPixels(byte param0) {
        int var2 = -79 % ((62 - param0) / 32);
        if (null != this.field_f) {
          this.field_f.setPixels(0, 0, this.field_a, this.field_e, this.field_h, this.field_b, 0, this.field_a);
          this.field_f.imageComplete(2);
          return;
        }
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return this.field_f == param0;
    }

    final static int calculatePlayerSaleValue(PlayerStats param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            field_g = (String) null;
          }
          var2_int = PasswordLoginCredentials.calculatePlayerValue(param0, -576054046) / 10;
          if (PasswordLoginCredentials.calculatePlayerValue(param0, -576054046) > 0 &&
            var2_int == 0) {
            var2_int = 1;
          }
          stackIn_6_0 = var2_int;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("dh.N(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
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
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        field_l = null;
        field_m = null;
        field_i = null;
        field_g = null;
        field_k = null;
        field_j = null;
        if (param0 != -29) {
          ImageProducerRasterBuffer.updateMenuCamera(true);
        }
    }

    final static void a(int param0, int param1, PacketBuffer param2, int param3, int param4) {
        try {
          param2.writeByte(param3 ^ -3315, 12);
          param2.writeShort(param3 ^ 1207447422, 17);
          param2.writeShort(-1207444472, param1);
          if (param3 != -3210) {
            PacketBuffer var6 = (PacketBuffer) null;
            ImageProducerRasterBuffer.a(106, -79, (PacketBuffer) null, 72, 113);
          }
          param2.writeShort(param3 - 1207441262, param4);
          param2.writeByte(param3 ^ -3298, param0);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "dh.K(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        try {
          this.addConsumer(param0);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "dh.startProduction(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    ImageProducerRasterBuffer() {
    }

    final static void c(byte param0) {
        if (param0 != -77) {
          PacketBuffer var2 = (PacketBuffer) null;
          ImageProducerRasterBuffer.a(105, -41, (PacketBuffer) null, 7, -41);
          IntrusiveDeque.field_f = false;
          return;
        }
        IntrusiveDeque.field_f = false;
    }

    final static void updateMenuCamera(boolean param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        int var1 = 0;
        int var2 = 0;
        int var1Lifetime1;
        int var1Lifetime2;
        int var1Lifetime3;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var1Lifetime4;
        int var1Lifetime5;
        int var1Lifetime6;
        int var2Lifetime4;
        int var2Lifetime5;
        int var2Lifetime6;
        int var1Lifetime2Lifetime1;
        int var2Lifetime2Lifetime1;
        if (!param0) {
          PlayerStats var3 = (PlayerStats) null;
          ImageProducerRasterBuffer.calculatePlayerSaleValue((PlayerStats) null, false);
          if (!CachedListingRow.field_h) {
            IterableNodeHashTable.a(true, (byte) 89);
            return;
          }
          if (null == MachineTokenStorageSupport.field_e) {
            FaceNormal.field_c = false;
            var1 = NotCommand.getCameraX(-2521) - MarkerSliderWidget.field_E[BufferedCacheFile.field_a];
            var2 = IsaacRandom.getCameraY(true) - ButtonMenuScreen.field_r[BufferedCacheFile.field_a];
            if (var2 * var2 + var1 * var1 < 10000) {
              fieldTemp$0 = BufferedCacheFile.field_a + 1;
              BufferedCacheFile.field_a = BufferedCacheFile.field_a + 1;
              BufferedCacheFile.field_a = fieldTemp$0 % MarkerSliderWidget.field_E.length;
            }
            PitchAppearanceSupport.setProjectionTarget(256.0, 60, (double)MarkerSliderWidget.field_E[BufferedCacheFile.field_a], (double)ButtonMenuScreen.field_r[BufferedCacheFile.field_a]);
            IterableNodeHashTable.a(false, (byte) 89);
            return;
          }
          if (GameModesHelpScreen.field_G == null) {
            if (AuctionLogEntry.field_h.screenId != 0) {
              IterableNodeHashTable.a(true, (byte) 89);
            } else {
              FaceNormal.field_c = false;
              var1Lifetime4 = NotCommand.getCameraX(-2521) - MarkerSliderWidget.field_E[BufferedCacheFile.field_a];
              var2Lifetime4 = IsaacRandom.getCameraY(true) - ButtonMenuScreen.field_r[BufferedCacheFile.field_a];
              if (var2Lifetime4 * var2Lifetime4 + var1Lifetime4 * var1Lifetime4 < 10000) {
                fieldTemp$1 = BufferedCacheFile.field_a + 1;
                BufferedCacheFile.field_a = BufferedCacheFile.field_a + 1;
                BufferedCacheFile.field_a = fieldTemp$1 % MarkerSliderWidget.field_E.length;
              }
              PitchAppearanceSupport.setProjectionTarget(256.0, 60, (double)MarkerSliderWidget.field_E[BufferedCacheFile.field_a], (double)ButtonMenuScreen.field_r[BufferedCacheFile.field_a]);
              IterableNodeHashTable.a(false, (byte) 89);
            }
            return;
          }
          if (GameModesHelpScreen.field_G.screenId == 0) {
            FaceNormal.field_c = false;
            var1Lifetime5 = NotCommand.getCameraX(-2521) - MarkerSliderWidget.field_E[BufferedCacheFile.field_a];
            var2Lifetime5 = IsaacRandom.getCameraY(true) - ButtonMenuScreen.field_r[BufferedCacheFile.field_a];
            if (var2Lifetime5 * var2Lifetime5 + var1Lifetime5 * var1Lifetime5 < 10000) {
              fieldTemp$2 = BufferedCacheFile.field_a + 1;
              BufferedCacheFile.field_a = BufferedCacheFile.field_a + 1;
              BufferedCacheFile.field_a = fieldTemp$2 % MarkerSliderWidget.field_E.length;
            }
            PitchAppearanceSupport.setProjectionTarget(256.0, 60, (double)MarkerSliderWidget.field_E[BufferedCacheFile.field_a], (double)ButtonMenuScreen.field_r[BufferedCacheFile.field_a]);
            IterableNodeHashTable.a(false, (byte) 89);
            return;
          }
          if (AuctionLogEntry.field_h.screenId != 0) {
            IterableNodeHashTable.a(true, (byte) 89);
            return;
          }
          FaceNormal.field_c = false;
          var1Lifetime6 = NotCommand.getCameraX(-2521) - MarkerSliderWidget.field_E[BufferedCacheFile.field_a];
          var2Lifetime6 = IsaacRandom.getCameraY(true) - ButtonMenuScreen.field_r[BufferedCacheFile.field_a];
          if (var2Lifetime6 * var2Lifetime6 + var1Lifetime6 * var1Lifetime6 < 10000) {
            fieldTemp$3 = BufferedCacheFile.field_a + 1;
            BufferedCacheFile.field_a = BufferedCacheFile.field_a + 1;
            BufferedCacheFile.field_a = fieldTemp$3 % MarkerSliderWidget.field_E.length;
          }
          PitchAppearanceSupport.setProjectionTarget(256.0, 60, (double)MarkerSliderWidget.field_E[BufferedCacheFile.field_a], (double)ButtonMenuScreen.field_r[BufferedCacheFile.field_a]);
          IterableNodeHashTable.a(false, (byte) 89);
          return;
        }
        if (!CachedListingRow.field_h) {
          IterableNodeHashTable.a(true, (byte) 89);
          return;
        }
        if (null == MachineTokenStorageSupport.field_e) {
          FaceNormal.field_c = false;
          var1Lifetime1 = NotCommand.getCameraX(-2521) - MarkerSliderWidget.field_E[BufferedCacheFile.field_a];
          var2Lifetime1 = IsaacRandom.getCameraY(true) - ButtonMenuScreen.field_r[BufferedCacheFile.field_a];
          if (var2Lifetime1 * var2Lifetime1 + var1Lifetime1 * var1Lifetime1 < 10000) {
            fieldTemp$4 = BufferedCacheFile.field_a + 1;
            BufferedCacheFile.field_a = BufferedCacheFile.field_a + 1;
            BufferedCacheFile.field_a = fieldTemp$4 % MarkerSliderWidget.field_E.length;
          }
          PitchAppearanceSupport.setProjectionTarget(256.0, 60, (double)MarkerSliderWidget.field_E[BufferedCacheFile.field_a], (double)ButtonMenuScreen.field_r[BufferedCacheFile.field_a]);
          IterableNodeHashTable.a(false, (byte) 89);
          return;
        }
        if (GameModesHelpScreen.field_G != null) {
          if (GameModesHelpScreen.field_G.screenId != 0) {
            if (AuctionLogEntry.field_h.screenId != 0) {
              IterableNodeHashTable.a(true, (byte) 89);
            } else {
              FaceNormal.field_c = false;
              var1Lifetime2 = NotCommand.getCameraX(-2521) - MarkerSliderWidget.field_E[BufferedCacheFile.field_a];
              var2Lifetime2 = IsaacRandom.getCameraY(true) - ButtonMenuScreen.field_r[BufferedCacheFile.field_a];
              if (var2Lifetime2 * var2Lifetime2 + var1Lifetime2 * var1Lifetime2 < 10000) {
                fieldTemp$5 = BufferedCacheFile.field_a + 1;
                BufferedCacheFile.field_a = BufferedCacheFile.field_a + 1;
                BufferedCacheFile.field_a = fieldTemp$5 % MarkerSliderWidget.field_E.length;
              }
              PitchAppearanceSupport.setProjectionTarget(256.0, 60, (double)MarkerSliderWidget.field_E[BufferedCacheFile.field_a], (double)ButtonMenuScreen.field_r[BufferedCacheFile.field_a]);
              IterableNodeHashTable.a(false, (byte) 89);
            }
            return;
          }
          FaceNormal.field_c = false;
          var1Lifetime2Lifetime1 = NotCommand.getCameraX(-2521) - MarkerSliderWidget.field_E[BufferedCacheFile.field_a];
          var2Lifetime2Lifetime1 = IsaacRandom.getCameraY(true) - ButtonMenuScreen.field_r[BufferedCacheFile.field_a];
          if (var2Lifetime2Lifetime1 * var2Lifetime2Lifetime1 + var1Lifetime2Lifetime1 * var1Lifetime2Lifetime1 < 10000) {
            fieldTemp$6 = BufferedCacheFile.field_a + 1;
            BufferedCacheFile.field_a = BufferedCacheFile.field_a + 1;
            BufferedCacheFile.field_a = fieldTemp$6 % MarkerSliderWidget.field_E.length;
          }
          PitchAppearanceSupport.setProjectionTarget(256.0, 60, (double)MarkerSliderWidget.field_E[BufferedCacheFile.field_a], (double)ButtonMenuScreen.field_r[BufferedCacheFile.field_a]);
          IterableNodeHashTable.a(false, (byte) 89);
          return;
        }
        if (AuctionLogEntry.field_h.screenId == 0) {
          FaceNormal.field_c = false;
          var1Lifetime3 = NotCommand.getCameraX(-2521) - MarkerSliderWidget.field_E[BufferedCacheFile.field_a];
          var2Lifetime3 = IsaacRandom.getCameraY(true) - ButtonMenuScreen.field_r[BufferedCacheFile.field_a];
          if (var2Lifetime3 * var2Lifetime3 + var1Lifetime3 * var1Lifetime3 < 10000) {
            fieldTemp$7 = BufferedCacheFile.field_a + 1;
            BufferedCacheFile.field_a = BufferedCacheFile.field_a + 1;
            BufferedCacheFile.field_a = fieldTemp$7 % MarkerSliderWidget.field_E.length;
          }
          PitchAppearanceSupport.setProjectionTarget(256.0, 60, (double)MarkerSliderWidget.field_E[BufferedCacheFile.field_a], (double)ButtonMenuScreen.field_r[BufferedCacheFile.field_a]);
          IterableNodeHashTable.a(false, (byte) 89);
          return;
        }
        IterableNodeHashTable.a(true, (byte) 89);
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != this.field_f) {
            return;
          }
          this.field_f = null;
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
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
        field_j = new String[]{"primary colour", "secondary colour"};
        field_i = new int[12];
        field_g = "Logging in...";
        field_l = "Orb points: ";
        field_k = "Solicitation";
        field_m = "Private";
    }
}
