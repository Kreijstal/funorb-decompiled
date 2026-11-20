/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class RoadStripRenderer {
    static int field_g;
    float field_k;
    int field_i;
    static float[] field_b;
    static IsaacPacketBuffer field_e;
    static java.applet.Applet field_d;
    static int field_f;
    static int field_l;
    static String field_a;
    int field_h;
    int field_c;
    static String field_j;

    public static void clearSharedReferences(int param0) {
        field_a = null;
        field_b = null;
        field_j = null;
        field_d = null;
        if (param0 == 0) {
          field_e = null;
          return;
        }
        field_e = (IsaacPacketBuffer) null;
        field_e = null;
    }

    final static void playPositionalSound(int param0, Point2i param1, int param2, PcmSample param3) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        float var10_float = 0.0f;
        PcmSampleStream var10 = null;
        float var11 = 0.0f;
        float var12 = 0.0f;
        float var13 = 0.0f;
        float var14 = 0.0f;
        try {
          var4_int = 0;
          var5 = 0;
          var6 = 0;
          if (MusicPatch.field_i != null) {
            var4_int = param1.x - MusicPatch.field_i.position.x;
            var5 = -MusicPatch.field_i.position.y + param1.y;
            var6 = var5 * var5 + var4_int * var4_int;
          }
          var9 = -68 % ((param2 - 47) / 59);
          if (var6 <= 0) {
            var7 = 256;
            var8 = 8192;
          } else {
            var10_float = (float)Math.sqrt((double)var6);
            var11 = -MusicPatch.field_i.velocityX;
            var12 = -MusicPatch.field_i.velocityY;
            var13 = (var12 * (float)var5 + var11 * (float)var4_int) / var10_float;
            var13 = 160.0f / (var13 + 160.0f);
            if (var13 < 0.75f) {
              var13 = 0.75f;
            }
            if (1.25f < var13) {
              var13 = 1.25f;
            }
            var7 = (int)(var13 * 256.0f);
            var14 = (float)var4_int / var10_float;
            var8 = (int)(8192.0f * (1.0f + var14));
          }
          var10 = PcmSampleStream.createWithStep(param3, var7, param0 * MenuList.field_h >> 5, var8);
          CachedTextLayout.playSoundStream(var10, (byte) -68);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("rd.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4, String param5) {
        try {
          if (param2 != -83) {
            RoadStripRenderer.bitCount(54, -109);
          }
          QuickChatPhraseDefinition.field_t.draw(param0 - 381, param4);
          LayeredWidgetStyle.field_i.draw(param0, param4);
          nm.field_c.draw(param5, param3, (nm.field_c.ascent + 30) / 2 + (param4 - 2), param1, -1);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "rd.H(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0, PlatformTaskDispatcher param1, java.awt.Frame param2) {
        PlatformTask var3 = null;
        int var4 = 0;
        String var5 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var4 = HoldTheLine.field_D;
        try {
          if (param0 <= 101) {
            var5 = (String) null;
            RoadStripRenderer.a(113, -110, (byte) 115, 12, -60, (String) null);
          }
          while (true) {
            var3 = param1.a(param2, (byte) -95);
            while (var3.field_d == 0) {
              SocketConnector.sleepMillis(10L, (byte) 45);
            }
            if (1 != var3.field_d) {
              SocketConnector.sleepMillis(100L, (byte) 45);
              continue;
            }
            break;
          }
          param2.setVisible(false);
          param2.dispose();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("rd.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    abstract void drawStrip(int[] param0, int param1, byte param2, int[] param3);

    final static int bitCount(int param0, int param1) {
        param1 = (1431655765 & param1) + (-715827883 & param1 >>> 1);
        param1 = (param1 & 858993459) + (-1288490189 & param1 >>> 2);
        param1 = 252645135 & param1 + (param1 >>> 4);
        if (param0 == -699864667) {
          param1 = param1 + (param1 >>> 8);
          param1 = param1 + (param1 >>> 16);
          return param1 & 255;
        }
        RoadStripRenderer.b(27);
        param1 = param1 + (param1 >>> 8);
        param1 = param1 + (param1 >>> 16);
        return param1 & 255;
    }

    final static boolean b(int param0) {
        if (param0 >= -46) {
          field_e = (IsaacPacketBuffer) null;
          return ArchiveCatalog.field_o;
        }
        return ArchiveCatalog.field_o;
    }

    final static RasterBuffer a(int param0, int param1, java.awt.Component param2, int param3) {
        try {
          Class var4 = null;
          Throwable var4_ref = null;
          RuntimeException var4_ref2 = null;
          RasterBuffer var5 = null;
          ImageProducerRasterBuffer var5_ref = null;
          int var6 = 0;
          RasterBuffer stackIn_1_0 = null;
          ImageProducerRasterBuffer stackIn_3_0 = null;
          RuntimeException stackIn_6_0 = null;
          StringBuilder stackIn_6_1 = null;
          String stackIn_7_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              var4 = Class.forName("BufferedImageRasterBuffer");
              var5 = (RasterBuffer) (var4.newInstance());
              var6 = -115 / ((param1 - 2) / 39);
              var5.a(param3, param0, param2, 0);
              stackIn_1_0 = var5;
              return stackIn_1_0;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              var5_ref = new ImageProducerRasterBuffer();
              ((RasterBuffer) ((Object) var5_ref)).a(param3, param0, param2, 0);
              stackIn_3_0 = var5_ref;
              return (RasterBuffer) ((Object) stackIn_3_0);
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_6_0 = var4_ref2;
            stackIn_6_1 = new StringBuilder().append("rd.M(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_7_2 = "null";
            } else {
              stackIn_7_2 = "{...}";
            }
            throw EntitySound.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param3).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_b = new float[]{50.0f, 300.0f, 500.0f};
        field_a = "Loading levels";
        field_f = 0;
        field_l = -1;
    }
}
