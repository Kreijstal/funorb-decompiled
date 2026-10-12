/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MusicPatch extends IntrusiveNode {
    static int field_n;
    static String field_u;
    static int field_t;
    int globalGain;
    static boolean field_w;
    static String field_p;
    static RgbSprite field_z;
    byte[] notePans;
    short[] pitchAndLoopFlags;
    private int[] sampleIds;
    MusicPatchEnvelope[] envelopes;
    static String field_o;
    byte[] noteGains;
    byte[] exclusiveGroups;
    static RgbSprite[] field_m;
    PcmSample[] samples;

    final static void a(AnimationFrameSet param0, byte param1) {
        try {
          IntPair.field_q = param0;
          if (param1 != -34) {
            field_m = (RgbSprite[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "io.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(byte param0) {
        field_p = null;
        field_z = null;
        field_o = null;
        field_m = null;
        if (param0 != 52) {
          return;
        }
        field_u = null;
    }

    final void releaseSampleIds(int obfuscationGuard) {
        if (obfuscationGuard <= 117) {
          this.sampleIds = (int[]) null;
        }
        this.sampleIds = null;
    }

    final static boolean a(int[] param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int[] var4 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param1 <= 106) {
            var4 = (int[]) null;
            MusicPatch.a((int[]) null, (byte) -31);
          }
          var2_int = 0;
          while (true) {
            if (var2_int >= 8) {
              return false;
            }
            if (param0[var2_int] == 0) {
              var2_int++;
              continue;
            }
            break;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("io.E(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean prepareSamples(int obfuscationGuard, byte[] noteMask, int[] budget, SoundCache soundCache) {
        int key = 0;
        int resultSuccess = 0;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String maskDescription = null;
        StringBuilder budgetContext = null;
        String budgetDescription = null;
        StringBuilder cacheContext = null;
        String cacheDescription = null;
        RuntimeException caughtFailure = null;
        int prepared = 0;
        RuntimeException failure = null;
        int previousSampleId = 0;
        Object sample = null;
        int sampleId = 0;
        int obfuscationControl = 0;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          prepared = 1;
          previousSampleId = 0;
          sample = null;
          if (obfuscationGuard != 11008) {
            field_o = (String) null;
          }
          for (key = 0; key < 128; key++) {
            if (noteMask == null ||
              noteMask[key] != 0) {
              sampleId = this.sampleIds[key];
              if (sampleId != 0) {
                if (previousSampleId != sampleId) {
                  previousSampleId = sampleId;
                  sampleId--;
                  if ((1 & sampleId) != 0) {
                    sample = soundCache.loadMusicSampleById(budget, 36, sampleId >> 2);
                  } else {
                    sample = soundCache.loadSoundEffectById(true, budget, sampleId >> 2);
                  }
                  if (sample == null) {
                    prepared = 0;
                  }
                }
                if (sample != null) {
                  this.samples[key] = (PcmSample) (sample);
                  this.sampleIds[key] = 0;
                }
              }
            }
          }
          resultSuccess = prepared;
          return resultSuccess != 0;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("io.C(").append(obfuscationGuard).append(',');
          if (noteMask == null) {
            maskDescription = "null";
          } else {
            maskDescription = "{...}";
          }
          budgetContext = ((StringBuilder) (Object) errorContext).append(maskDescription).append(',');
          if (budget == null) {
            budgetDescription = "null";
          } else {
            budgetDescription = "{...}";
          }
          cacheContext = ((StringBuilder) (Object) budgetContext).append(budgetDescription).append(',');
          if (soundCache == null) {
            cacheDescription = "null";
          } else {
            cacheDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) cacheContext).append(cacheDescription).append(')').toString());
        }
    }

    MusicPatch(byte[] packedPatch) {
        int var11_int = 0;
        int incrementValue$0 = 0;
        MusicPatchEnvelope dupTemp$8 = null;
        int incrementValue$5 = 0;
        int var25_int = 0;
        int incrementValue$3 = 0;
        byte[] stackIn_39_0 = null;
        byte[] stackIn_42_0 = null;
        RuntimeException stackIn_204_0 = null;
        StringBuilder stackIn_204_1 = null;
        String stackIn_205_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        byte[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        byte[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        byte[] var10 = null;
        byte[] var11 = null;
        int var12 = 0;
        int var13_int = 0;
        MusicPatchEnvelope[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        byte[] var15 = null;
        MusicPatchEnvelope var15_ref = null;
        byte[] var16 = null;
        int var16_int = 0;
        int var17 = 0;
        byte[] var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        Object var25 = null;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var37 = 0;
        PacketBuffer var38 = null;
        byte[] var39 = null;
        MusicPatchEnvelope var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        MusicPatchEnvelope var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        MusicPatchEnvelope var48 = null;
        MusicPatchEnvelope var49 = null;
        MusicPatchEnvelope var50 = null;
        MusicPatchEnvelope var51 = null;
        MusicPatchEnvelope var52 = null;
        byte[] var53 = null;
        byte[] var54 = null;
        byte[] var55 = null;
        byte[] var56 = null;
        byte[] var57 = null;
        byte[] var58 = null;
        int var5Lifetime1;
        int var8Lifetime1;
        int var19Lifetime1;
        int var19Lifetime2;
        int var19Lifetime3;
        int var19Lifetime4;
        int var19Lifetime5;
        int var19Lifetime6;
        int var20Lifetime1;
        int var20Lifetime2;
        int var20Lifetime3;
        int var20Lifetime4;
        int var20Lifetime5;
        int var20Lifetime6;
        int var21Lifetime1;
        int var21Lifetime2;
        int var21Lifetime3;
        int var21Lifetime4;
        int var23Lifetime1;
        int var24Lifetime1;
        int var26Lifetime1;
        int var27Lifetime1;
        int var27Lifetime2;
        int var27Lifetime3;
        int var27Lifetime4;
        int var27Lifetime5;
        int var27Lifetime6;
        int var27Lifetime7;
        int var27Lifetime8;
        int var27Lifetime9;
        int var27Lifetime10;
        int var27Lifetime11;
        int var27Lifetime12;
        int var28Lifetime1;
        int var29Lifetime1;
        int var29Lifetime2;
        int var29Lifetime3;
        int var29Lifetime4;
        int var30Lifetime1;
        int var31Lifetime1;
        int var32Lifetime1;
        int var33Lifetime1;
        int var34Lifetime1;
        int var14Lifetime1;
        int var14Lifetime2;
        int var14Lifetime3;
        int var16_intLifetime1;
        int var29Lifetime5;
        int var30Lifetime2;
        int var27Lifetime6Lifetime1;
        int var27Lifetime7Lifetime1;
        int var29Lifetime3Lifetime1;
        int var29Lifetime4Lifetime1;
        int var30Lifetime1Lifetime1;
        int var30Lifetime1Lifetime2;
        int var31Lifetime1Lifetime1;
        try {
          this.notePans = new byte[128];
          this.samples = new PcmSample[128];
          this.exclusiveGroups = new byte[128];
          this.pitchAndLoopFlags = new short[128];
          this.sampleIds = new int[128];
          this.envelopes = new MusicPatchEnvelope[128];
          this.noteGains = new byte[128];
          var38 = new PacketBuffer(packedPatch);
          for (var3 = 0; var38.payload[var3 + var38.position] != 0; var3++) {
          }
          var55 = new byte[var3];
          var42 = var55;
          var4 = var42;
          for (var5 = 0; var5 < var3; var5++) {
            var4[var5] = var38.readByte((byte) 8);
          }
          var3++;
          var38.position = var38.position + 1;
          var5Lifetime1 = var38.position;
          var38.position = var38.position + var3;
          for (var6 = 0; var38.payload[var6 + var38.position] != 0; var6++) {
          }
          var56 = new byte[var6];
          var43 = var56;
          var7 = var43;
          for (var8 = 0; var8 < var6; var8++) {
            var7[var8] = var38.readByte((byte) -120);
          }
          var6++;
          var38.position = var38.position + 1;
          var8Lifetime1 = var38.position;
          var38.position = var38.position + var6;
          for (var9 = 0; var38.payload[var9 + var38.position] != 0; var9++) {
          }
          var57 = new byte[var9];
          var44 = var57;
          var10 = var44;
          for (var11_int = 0; var9 > var11_int; var11_int++) {
            var10[var11_int] = var38.readByte((byte) -113);
          }
          var9++;
          var38.position = var38.position + 1;
          var53 = new byte[var9];
          var39 = var53;
          var11 = var39;
          if (var9 > 1) {
            var53[1] = (byte) 1;
            var13_int = 1;
            var12 = 2;
            for (var14 = 2; var14 < var9; var14++) {
              var15_int = var38.readUnsignedByte(0);
              if (var15_int != 0) {
                if (var15_int <= var13_int) {
                  var15_int--;
                }
                var13_int = var15_int;
              } else {
                incrementValue$0 = var12;
                var12++;
                var13_int = incrementValue$0;
              }
              var11[var14] = (byte)var13_int;
            }
          } else {
            var12 = var9;
          }
          var13 = new MusicPatchEnvelope[var12];
          for (var14Lifetime1 = 0; var14Lifetime1 < var13.length; var14Lifetime1++) {
            dupTemp$8 = new MusicPatchEnvelope();
            var13[var14Lifetime1] = dupTemp$8;
            var40 = dupTemp$8;
            var15_ref = var40;
            var16_int = var38.readUnsignedByte(0);
            if (var16_int > 0) {
              var15_ref.volumeEnvelope = new byte[2 * var16_int];
            }
            var16_intLifetime1 = var38.readUnsignedByte(0);
            if (0 < var16_intLifetime1) {
              var15_ref.releaseEnvelope = new byte[2 + var16_intLifetime1 * 2];
              var40.releaseEnvelope[1] = (byte)64;
            }
          }
          var14Lifetime2 = var38.readUnsignedByte(0);
          if (var14Lifetime2 <= 0) {
            stackIn_39_0 = null;
          } else {
            stackIn_39_0 = new byte[2 * var14Lifetime2];
          }
          var46 = stackIn_39_0;
          var15 = var46;
          var14Lifetime3 = var38.readUnsignedByte(0);
          if (0 < var14Lifetime3) {
            stackIn_42_0 = new byte[var14Lifetime3 * 2];
          } else {
            stackIn_42_0 = null;
          }
          var58 = stackIn_42_0;
          var47 = var58;
          var16 = var47;
          for (var17 = 0; 0 != var38.payload[var38.position + var17]; var17++) {
          }
          var54 = new byte[var17];
          var41 = var54;
          var18 = var41;
          for (var19 = 0; var19 < var17; var19++) {
            var18[var19] = var38.readByte((byte) -53);
          }
          var17++;
          var38.position = var38.position + 1;
          var19Lifetime1 = 0;
          for (var20 = 0; 128 > var20; var20++) {
            var19Lifetime1 = var19Lifetime1 + var38.readUnsignedByte(0);
            this.pitchAndLoopFlags[var20] = (short)var19Lifetime1;
          }
          var19Lifetime2 = 0;
          for (var20Lifetime1 = 0; 128 > var20Lifetime1; var20Lifetime1++) {
            var19Lifetime2 = var19Lifetime2 + var38.readUnsignedByte(0);
            this.pitchAndLoopFlags[var20Lifetime1] = (short)(this.pitchAndLoopFlags[var20Lifetime1] + (var19Lifetime2 << 8));
          }
          var20Lifetime2 = 0;
          var21 = 0;
          var22 = 0;
          for (var23 = 0; var23 < 128; var23++) {
            if (0 == var20Lifetime2) {
              if (var54.length <= var21) {
                var20Lifetime2 = -1;
              } else {
                var20Lifetime2 = var18[var21++];
              }
              var22 = var38.readVarInt(110);
            }
            this.pitchAndLoopFlags[var23] = (short)(this.pitchAndLoopFlags[var23] + (rn.bitwiseAnd(-1 + var22, 2) << 14));
            this.sampleIds[var23] = var22;
            var20Lifetime2--;
          }
          var20Lifetime3 = 0;
          var21Lifetime1 = 0;
          var23Lifetime1 = 0;
          for (var24 = 0; var24 < 128; var24++) {
            if (this.sampleIds[var24] != 0) {
              if (var20Lifetime3 == 0) {
                incrementValue$5 = var5Lifetime1;
                var5Lifetime1++;
                var23Lifetime1 = -1 + var38.payload[incrementValue$5];
                if (var21Lifetime1 >= var55.length) {
                  var20Lifetime3 = -1;
                } else {
                  var20Lifetime3 = var4[var21Lifetime1++];
                }
              }
              var20Lifetime3--;
              this.exclusiveGroups[var24] = (byte)var23Lifetime1;
            }
          }
          var21Lifetime2 = 0;
          var20Lifetime4 = 0;
          var24Lifetime1 = 0;
          for (var25_int = 0; var25_int < 128; var25_int++) {
            if (this.sampleIds[var25_int] != 0) {
              if (var20Lifetime4 == 0) {
                incrementValue$3 = var8Lifetime1;
                var8Lifetime1++;
                var24Lifetime1 = 16 + var38.payload[incrementValue$3] << 2;
                if (var56.length > var21Lifetime2) {
                  var20Lifetime4 = var7[var21Lifetime2++];
                } else {
                  var20Lifetime4 = -1;
                }
              }
              var20Lifetime4--;
              this.notePans[var25_int] = (byte)var24Lifetime1;
            }
          }
          var21Lifetime3 = 0;
          var20Lifetime5 = 0;
          var25 = null;
          for (var26 = 0; var26 < 128; var26++) {
            if (0 != this.sampleIds[var26]) {
              if (var20Lifetime5 == 0) {
                var25 = var13[var53[var21Lifetime3]];
                if (var21Lifetime3 < var57.length) {
                  var20Lifetime5 = var10[var21Lifetime3++];
                } else {
                  var20Lifetime5 = -1;
                }
              }
              this.envelopes[var26] = (MusicPatchEnvelope) (var25);
              var20Lifetime5--;
            }
          }
          var21Lifetime4 = 0;
          var20Lifetime6 = 0;
          var26Lifetime1 = 0;
          for (var27 = 0; var27 < 128; var27++) {
            if (var20Lifetime6 == 0) {
              if (var21Lifetime4 >= var54.length) {
                var20Lifetime6 = -1;
              } else {
                var20Lifetime6 = var18[var21Lifetime4++];
              }
              if (this.sampleIds[var27] > 0) {
                var26Lifetime1 = var38.readUnsignedByte(0) + 1;
              }
            }
            this.noteGains[var27] = (byte)var26Lifetime1;
            var20Lifetime6--;
          }
          this.globalGain = var38.readUnsignedByte(0) + 1;
          for (var27Lifetime1 = 0; var27Lifetime1 < var12; var27Lifetime1++) {
            var45 = var13[var27Lifetime1];
            if (null != var45.volumeEnvelope) {
              for (var29 = 1; var29 < var45.volumeEnvelope.length; var29 += 2) {
                var45.volumeEnvelope[var29] = var38.readByte((byte) -89);
              }
            }
            if (null != var45.releaseEnvelope) {
              for (var29Lifetime5 = 3; var29Lifetime5 < var45.releaseEnvelope.length - 2; var29Lifetime5 += 2) {
                var45.releaseEnvelope[var29Lifetime5] = var38.readByte((byte) 103);
              }
            }
          }
          if (null != var15) {
            for (var27Lifetime2 = 1; var27Lifetime2 < var46.length; var27Lifetime2 += 2) {
              var15[var27Lifetime2] = var38.readByte((byte) 111);
            }
          }
          if (var16 != null) {
            for (var27Lifetime3 = 1; var58.length > var27Lifetime3; var27Lifetime3 += 2) {
              var16[var27Lifetime3] = var38.readByte((byte) 116);
            }
          }
          for (var27Lifetime4 = 0; var12 > var27Lifetime4; var27Lifetime4++) {
            var48 = var13[var27Lifetime4];
            if (null != var48.releaseEnvelope) {
              var19Lifetime3 = 0;
              for (var29Lifetime1 = 2; var29Lifetime1 < var48.releaseEnvelope.length; var29Lifetime1 += 2) {
                var19Lifetime3 = 1 + var19Lifetime3 + var38.readUnsignedByte(0);
                var48.releaseEnvelope[var29Lifetime1] = (byte)var19Lifetime3;
              }
            }
          }
          for (var27Lifetime5 = 0; var27Lifetime5 < var12; var27Lifetime5++) {
            var49 = var13[var27Lifetime5];
            if (null != var49.volumeEnvelope) {
              var19Lifetime4 = 0;
              for (var29Lifetime2 = 2; var29Lifetime2 < var49.volumeEnvelope.length; var29Lifetime2 += 2) {
                var19Lifetime4 = var38.readUnsignedByte(0) + (1 + var19Lifetime4);
                var49.volumeEnvelope[var29Lifetime2] = (byte)var19Lifetime4;
              }
            }
          }
          if (var15 != null) {
            var19Lifetime5 = var38.readUnsignedByte(0);
            var15[0] = (byte)var19Lifetime5;
            for (var27Lifetime6 = 2; var27Lifetime6 < var46.length; var27Lifetime6 += 2) {
              var19Lifetime5 = var19Lifetime5 + 1 + var38.readUnsignedByte(0);
              var15[var27Lifetime6] = (byte)var19Lifetime5;
            }
            var27Lifetime6Lifetime1 = var46[0];
            var28 = var46[1];
            for (var29Lifetime3 = 0; var27Lifetime6Lifetime1 > var29Lifetime3; var29Lifetime3++) {
              this.noteGains[var29Lifetime3] = (byte)(32 + var28 * this.noteGains[var29Lifetime3] >> 6);
            }
            for (var29Lifetime3Lifetime1 = 2; var29Lifetime3Lifetime1 < var46.length; var29Lifetime3Lifetime1 += 2) {
              var30 = var46[var29Lifetime3Lifetime1];
              var31 = var15[1 + var29Lifetime3Lifetime1];
              var32 = (-var27Lifetime6Lifetime1 + var30) * var28 + (-var27Lifetime6Lifetime1 + var30) / 2;
              for (var33 = var27Lifetime6Lifetime1; var30 > var33; var33++) {
                var34 = MusicPatchPcmStream.floorDivide(-var27Lifetime6Lifetime1 + var30, var32, 1589591487);
                var32 = var32 + (var31 - var28);
                this.noteGains[var33] = (byte)(32 + var34 * this.noteGains[var33] >> 6);
              }
              var28 = var31;
              var27Lifetime6Lifetime1 = var30;
            }
            for (var30Lifetime2 = var27Lifetime6Lifetime1; var30Lifetime2 < 128; var30Lifetime2++) {
              this.noteGains[var30Lifetime2] = (byte)(32 + this.noteGains[var30Lifetime2] * var28 >> 6);
            }
            var15 = null;
          }
          if (null != var16) {
            var19Lifetime6 = var38.readUnsignedByte(0);
            var16[0] = (byte)var19Lifetime6;
            for (var27Lifetime7 = 2; var58.length > var27Lifetime7; var27Lifetime7 += 2) {
              var19Lifetime6 = var19Lifetime6 + 1 + var38.readUnsignedByte(0);
              var16[var27Lifetime7] = (byte)var19Lifetime6;
            }
            var27Lifetime7Lifetime1 = var58[0];
            var28Lifetime1 = var58[1] << 1;
            for (var29Lifetime4 = 0; var29Lifetime4 < var27Lifetime7Lifetime1; var29Lifetime4++) {
              var30Lifetime1 = var28Lifetime1 + (255 & this.notePans[var29Lifetime4]);
              if (var30Lifetime1 < 0) {
                var30Lifetime1 = 0;
              }
              if (var30Lifetime1 > 128) {
                var30Lifetime1 = 128;
              }
              this.notePans[var29Lifetime4] = (byte)var30Lifetime1;
            }
            var29Lifetime4Lifetime1 = 2;
            while (var29Lifetime4Lifetime1 < var58.length) {
              var30Lifetime1Lifetime1 = var58[var29Lifetime4Lifetime1];
              var31Lifetime1 = var16[var29Lifetime4Lifetime1 + 1] << 1;
              var32Lifetime1 = (-var27Lifetime7Lifetime1 + var30Lifetime1Lifetime1) / 2 + var28Lifetime1 * (-var27Lifetime7Lifetime1 + var30Lifetime1Lifetime1);
              var37 = var27Lifetime7Lifetime1;
              var33Lifetime1 = var37;
              while (var37 < var30Lifetime1Lifetime1) {
                var34Lifetime1 = MusicPatchPcmStream.floorDivide(-var27Lifetime7Lifetime1 + var30Lifetime1Lifetime1, var32Lifetime1, 1589591487);
                var35 = var34Lifetime1 + (255 & this.notePans[var37]);
                if (var35 < 0) {
                  var35 = 0;
                }
                if (128 < var35) {
                  var35 = 128;
                }
                this.notePans[var37] = (byte)var35;
                var32Lifetime1 = var32Lifetime1 + (var31Lifetime1 - var28Lifetime1);
                var37++;
              }
              var29Lifetime4Lifetime1 += 2;
              var28Lifetime1 = var31Lifetime1;
              var27Lifetime7Lifetime1 = var30Lifetime1Lifetime1;
            }
            var16 = null;
            for (var30Lifetime1Lifetime2 = var27Lifetime7Lifetime1; var30Lifetime1Lifetime2 < 128; var30Lifetime1Lifetime2++) {
              var31Lifetime1Lifetime1 = var28Lifetime1 + (this.notePans[var30Lifetime1Lifetime2] & 255);
              if (var31Lifetime1Lifetime1 < 0) {
                var31Lifetime1Lifetime1 = 0;
              }
              if (var31Lifetime1Lifetime1 > 128) {
                var31Lifetime1Lifetime1 = 128;
              }
              this.notePans[var30Lifetime1Lifetime2] = (byte)var31Lifetime1Lifetime1;
            }
          }
          for (var27Lifetime8 = 0; var12 > var27Lifetime8; var27Lifetime8++) {
            var13[var27Lifetime8].decayRate = var38.readUnsignedByte(0);
          }
          for (var27Lifetime9 = 0; var27Lifetime9 < var12; var27Lifetime9++) {
            var50 = var13[var27Lifetime9];
            if (var50.volumeEnvelope != null) {
              var50.volumeKeyScaling = var38.readUnsignedByte(0);
            }
            if (null != var50.releaseEnvelope) {
              var50.releaseKeyScaling = var38.readUnsignedByte(0);
            }
            if (0 < var50.decayRate) {
              var50.decayKeyScaling = var38.readUnsignedByte(0);
            }
          }
          for (var27Lifetime10 = 0; var12 > var27Lifetime10; var27Lifetime10++) {
            var13[var27Lifetime10].vibratoRate = var38.readUnsignedByte(0);
          }
          for (var27Lifetime11 = 0; var27Lifetime11 < var12; var27Lifetime11++) {
            var51 = var13[var27Lifetime11];
            if (var51.vibratoRate > 0) {
              var51.vibratoDepth = var38.readUnsignedByte(0);
            }
          }
          for (var27Lifetime12 = 0; var27Lifetime12 < var12; var27Lifetime12++) {
            var52 = var13[var27Lifetime12];
            if (var52.vibratoDepth > 0) {
              var52.vibratoDelay = var38.readUnsignedByte(0);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_204_0 = var2;
          stackIn_204_1 = new StringBuilder().append("io.<init>(");
          if (packedPatch == null) {
            stackIn_205_2 = "null";
          } else {
            stackIn_205_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_204_0), ((StringBuilder) (Object) stackIn_204_1).append(stackIn_205_2).append(')').toString());
        }
    }

    static {
        field_u = "This <%0> is currently carrying the <%2>. Are you sure you wish to replace it with the <%1>? The <%2> will be lost forever if you do this.";
        field_p = "Open";
        field_o = "Play Campaign";
    }
}
