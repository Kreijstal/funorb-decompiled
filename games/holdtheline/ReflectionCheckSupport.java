/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ReflectionCheckSupport {
    static AccountProtocolState field_b;
    static int field_c;
    static boolean field_a;
    static int[] field_d;

    public static void clearSharedReferences(byte param0) {
        int var1 = -20 / ((81 - param0) / 40);
        field_d = null;
        field_b = null;
    }

    final static SoundPlayback playSample(int param0, int param1, PcmSample param2) {
        RuntimeException var3 = null;
        SoundPlayback stackIn_2_0 = null;
        SoundPlayback stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 255) {
            stackIn_4_0 = CachedTextLayout.playSoundStream(PcmSampleStream.createAtRate(param2, 100, param1), (byte) -68);
            return stackIn_4_0;
          }
          stackIn_2_0 = (SoundPlayback) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ad.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static boolean isReflectionCheckReady(int param0) {
        int var2 = 0;
        ReflectionCheck var1 = null;
        RuntimeException var1_ref = null;
        int var3 = 0;
        Sprite var4 = null;
        ReflectionCheck var5 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = HoldTheLine.field_D;
        try {
          var5 = (ReflectionCheck) (ReflectionCheckQueue.pendingChecks.first((byte) 94));
          var1 = var5;
          if (var1 == null) {
            return false;
          }
          if (param0 <= 80) {
            var4 = (Sprite) null;
            ReflectionCheckSupport.fillBlendedShadedTexturePolygon((int[]) null, 0.6495102643966675f, (byte) -45, 0.5647060871124268f, (Sprite) null);
          }
          for (var2 = 0; var2 < var1.operationCount; var2++) {
            if (null != var5.fieldTasks[var2] &&
              0 == var5.fieldTasks[var2].field_d) {
              return false;
            }
            if (null != var5.methodTasks[var2] &&
              0 == var5.methodTasks[var2].field_d) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var1_ref), "ad.D(" + param0 + ')');
        }
    }

    final static void finalizeHoverTarget(byte param0) {
        int var1 = 10 / ((-30 - param0) / 44);
        if (LoadProgressDialog.field_ab != -1) {
          SessionCookieWriter.field_b = SoundCache.field_b << 16 | LoadProgressDialog.field_ab;
        } else {
          if (PointLight.field_k) {
            SessionCookieWriter.field_b = -1;
            DialogLayer.field_I = -1;
          }
        }
        HoverTargetTracker.updateHoverTarget((byte) 66, SessionCookieWriter.field_b);
        LoadProgressDialog.field_ab = -1;
    }

    final static void fillBlendedShadedTexturePolygon(int[] param0, float param1, byte param2, float param3, Sprite param4) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var21Lifetime1;
        int var22Lifetime1;
        var24 = HoldTheLine.field_D;
        try {
          PolygonScanConverter.clearEdges();
          PolygonScanConverter.addPolygonEdges(param0, 0, param0.length);
          PolygonScanConverter.beginScan();
          var5_int = 51 % ((param2 - 26) / 33);
          while (true) {
            if (!PolygonScanConverter.nextSpan()) {
              return;
            }
            var6 = PolygonScanConverter.spanStartX;
            if (var6 < 0) {
              var6 = 0;
            }
            var7 = PolygonScanConverter.spanEndX;
            if (var7 >= SoftwareRasterizer.width) {
              var7 = -1 + SoftwareRasterizer.width;
            }
            var8 = PolygonScanConverter.spanY;
            if (var8 < 0) {
              var8 = 0;
            }
            if (SoftwareRasterizer.height <= var8) {
              var8 = -1 + SoftwareRasterizer.height;
            }
            var9 = var6 % param4.width;
            var10 = var8 % param4.height;
            var11 = var8 * SoftwareRasterizer.width + var6;
            var12 = var10 * param4.width + var9;
            var13 = param4.width - var9;
            var14 = -var6 + var7;
            while (true) {
              var14--;
              if (0 > var14) {
                break;
              }
              var15 = SoftwareRasterizer.pixels[var11] & 16711680;
              var16 = SoftwareRasterizer.pixels[var11] & 65280;
              var17 = SoftwareRasterizer.pixels[var11] & 255;
              var18 = 16711680 & param4.pixels[var12];
              var19 = 65280 & param4.pixels[var12];
              var20 = 255 & param4.pixels[var12];
              if (!(param3 < 0.0f)) {
                var21 = (int)(param3 * 256.0f);
                var22 = 256 - var21;
                var18 = var21 * 16711680 + var22 * var18 >>> 8;
                var19 = var21 * 65280 + var19 * var22 >>> 8;
                var20 = var20 * var22 + 255 * var21 >>> 8;
              } else {
                var21 = (int)((1.0f + param3) * 256.0f);
                var19 = var21 * var19 >>> 8;
                var18 = var18 * var21 >>> 8;
                var20 = var20 * var21 >>> 8;
              }
              var21Lifetime1 = (int)(param1 * (float)(-var15 + var18)) + var15;
              var22Lifetime1 = (int)(param1 * (float)(-var16 + var19)) + var16;
              var23 = (int)((float)(-var17 + var20) * param1) + var17;
              SoftwareRasterizer.pixels[var11] = BitwiseIntegerOperations.orInts(LoginChoicePanel.andInts(255, var23), BitwiseIntegerOperations.orInts(LoginChoicePanel.andInts(var22Lifetime1, 65280), LoginChoicePanel.andInts(var21Lifetime1, 16711680)));
              var11++;
              var12++;
              var13--;
              if (var13 != 0) {
                continue;
              }
              var12 = var10 * param4.width;
              var13 = param4.width;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_26_0 = var5;
          stackIn_26_1 = new StringBuilder().append("ad.E(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    static {
        field_b = new AccountProtocolState();
    }
}
