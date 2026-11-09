/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MusicPatchEnvelope {
    static Sprite field_a;
    int releaseKeyScale;
    int vibratoDelay;
    int vibratoRate;
    int gainKeyScale;
    byte[] gainCurve;
    byte[] releaseCurve;
    int vibratoDepth;
    int decayRate;
    int decayKeyScale;

    final static boolean areFirstLevelsComplete(int guard, int count) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        LegacyOpenGlGraphicsToolkit var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (guard != 8230) {
            var4 = (LegacyOpenGlGraphicsToolkit) null;
            MusicPatchEnvelope.ensureLegacyWaterNoise((LegacyOpenGlGraphicsToolkit) null, (byte) 109);
          }
          for (var2_int = 0; count > var2_int; var2_int++) {
            if (!TextureMetadata.completedLevels[var2_int]) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var2), "mq.C(" + guard + ',' + count + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        field_a = null;
        if (param0 <= 89) {
          field_a = (Sprite) null;
        }
    }

    final static void ensureLegacyWaterNoise(LegacyOpenGlGraphicsToolkit toolkit, byte guard) {
        int var2_int = 0;
        LegacyRidgedWaterNoise var8 = null;
        LegacyTurbulentWaterNoise var10 = null;
        LegacyOpenGlNormalMapGenerator var12 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          var2_int = 71 / ((guard - 40) / 59);
          if (null == LegacyOpenGlInterleavedStream.legacyRidgedWaterData) {
            var8 = new LegacyRidgedWaterNoise();
            var20 = var8.generate((byte) 10, 128, 128, 16);
            LegacyOpenGlInterleavedStream.legacyRidgedWaterData = DroneDebris.storeByteArray((byte) -123, var20, false);
          }
          if (GameplaySession.legacyTurbulentWaterData == null) {
            var10 = new LegacyTurbulentWaterNoise();
            var21 = var10.generate(16, (byte) -8, 128, 128);
            GameplaySession.legacyTurbulentWaterData = DroneDebris.storeByteArray((byte) -117, var21, false);
          }
          var12 = toolkit.normalMapGenerator;
          if (var12.ensureProgram((byte) -101)) {
            if (null != PlayingSound.legacyHeightNoise) {
              return;
            }
            var22 = HardwareTextureCache.generateNoiseVolume(0.6000000238418579f, 0.5f, 128, -30865, new PerlinNoiseSliceGenerator(419684), 4.0f, 4.0f, 16.0f, 16, 8, 128);
            PlayingSound.legacyHeightNoise = DroneDebris.storeByteArray((byte) -126, var22, false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("mq.B(");
          if (toolkit == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(guard).append(')').toString());
        }
    }

    final static int encodeCp1252Range(int start, byte[] destination, byte guard, CharSequence text, int end, int offset) {
        int stackIn_68_0 = 0;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          var6_int = -start + end;
          var7 = 0;
          if (guard >= -106) {
            field_a = (Sprite) null;
          }
          while (var6_int > var7) {
            {
              var8 = text.charAt(var7 + start);
              if ((var8 <= 0 ||
                var8 >= 128) && (var8 < 160 ||
                var8 > 255)) {
                switch (var8) {
                  case 8364:
                    destination[var7 + offset] = (byte)-128;
                    break;
                  case 8218:
                    destination[var7 + offset] = (byte)-126;
                    break;
                  case 402:
                    destination[offset + var7] = (byte)-125;
                    break;
                  case 8222:
                    destination[offset + var7] = (byte)-124;
                    break;
                  case 8230:
                    destination[offset + var7] = (byte)-123;
                    break;
                  case 8224:
                    destination[var7 + offset] = (byte)-122;
                    break;
                  case 8225:
                    destination[var7 + offset] = (byte)-121;
                    break;
                  case 710:
                    destination[offset + var7] = (byte)-120;
                    break;
                  case 8240:
                    destination[var7 + offset] = (byte)-119;
                    break;
                  case 352:
                    destination[var7 + offset] = (byte)-118;
                    break;
                  case 8249:
                    destination[var7 + offset] = (byte)-117;
                    break;
                  case 338:
                    destination[offset + var7] = (byte)-116;
                    break;
                  case 381:
                    destination[var7 + offset] = (byte)-114;
                    break;
                  case 8216:
                    destination[offset + var7] = (byte)-111;
                    break;
                  case 8217:
                    destination[var7 + offset] = (byte)-110;
                    break;
                  case 8220:
                    destination[var7 + offset] = (byte)-109;
                    break;
                  case 8221:
                    destination[offset + var7] = (byte)-108;
                    break;
                  case 8226:
                    destination[var7 + offset] = (byte)-107;
                    break;
                  case 8211:
                    destination[var7 + offset] = (byte)-106;
                    break;
                  case 8212:
                    destination[var7 + offset] = (byte)-105;
                    break;
                  case 732:
                    destination[offset + var7] = (byte)-104;
                    break;
                  case 8482:
                    destination[offset + var7] = (byte)-103;
                    break;
                  case 353:
                    destination[offset + var7] = (byte)-102;
                    break;
                  case 8250:
                    destination[var7 + offset] = (byte)-101;
                    break;
                  case 339:
                    destination[offset + var7] = (byte)-100;
                    break;
                  case 382:
                    destination[offset + var7] = (byte)-98;
                    break;
                  default:
                    destination[offset + var7] = (byte)63;
                    break;
                  case 376:
                    destination[offset + var7] = (byte)-97;
                    break;
                }
              } else {
                destination[offset + var7] = (byte)var8;
              }
            }
            var7++;
          }
          stackIn_68_0 = var6_int;
          return stackIn_68_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_71_0 = var6;
          stackIn_71_1 = new StringBuilder().append("mq.D(").append(start).append(',');
          if (destination == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          stackIn_74_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',').append(guard).append(',');
          if (text == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_71_0), ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(',').append(end).append(',').append(offset).append(')').toString());
        }
    }

    static {
    }
}
