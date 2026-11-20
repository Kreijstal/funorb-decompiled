/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PerlinNoiseTextureOperation extends TextureOperation {
    private short[] amplitudes;
    boolean biasUnsigned;
    int horizontalFrequency;
    int verticalFrequency;
    int persistence;
    static float field_n;
    private short[] frequencies;
    private int seed;
    static int field_q;
    int octaveCount;
    private byte[] permutation;
    static ResourceArchive field_l;

    private final void initializeOctaves(int param0) {
        int var2;
        int var3;
        int var4;
        var4 = VoidHunters.field_G;
        var2 = 51 / ((62 - param0) / 50);
        if (this.persistence > 0) {
          this.frequencies = new short[this.octaveCount];
          this.amplitudes = new short[this.octaveCount];
          for (var3 = 0; this.octaveCount > var3; var3++) {
            this.amplitudes[var3] = (short)(int)(4096.0 * Math.pow((double)((float)this.persistence / 4096.0f), (double)var3));
            this.frequencies[var3] = (short)(int)Math.pow(2.0, (double)var3);
          }
        } else {
          if (this.amplitudes != null &&
            this.amplitudes.length == this.octaveCount) {
            this.frequencies = new short[this.octaveCount];
            for (var3 = 0; this.octaveCount > var3; var3++) {
              this.frequencies[var3] = (short)(int)Math.pow(2.0, (double)var3);
            }
          }
        }
    }

    final void generateNoiseRow(int param0, int param1, int[] param2) {
        int var7 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
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
        int var4_intLifetime1;
        int var4_intLifetime2;
        int var6Lifetime1;
        int var6Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var11Lifetime2;
        int var12Lifetime1;
        int var12Lifetime2;
        int var13Lifetime1;
        int var13Lifetime2;
        int var14Lifetime1;
        int var14Lifetime2;
        int var15Lifetime1;
        int var15Lifetime2;
        int var16Lifetime1;
        int var16Lifetime2;
        int var17Lifetime1;
        int var17Lifetime2;
        int var18Lifetime1;
        int var18Lifetime2;
        int var4_intLifetime3;
        int var6Lifetime3;
        int var10Lifetime3;
        var19 = VoidHunters.field_G;
        try {
          var5 = this.verticalFrequency * SetSalvoUsesAllEnergy.textureYCoordinates[param1];
          if (param0 == this.octaveCount) {
            var8 = this.frequencies[0] << 12;
            var9 = this.amplitudes[0];
            var12 = var8 * this.horizontalFrequency >> 12;
            var13 = var8 * this.verticalFrequency >> 12;
            var11 = var5 * var8 >> 12;
            var15 = var11 >> 12;
            var16 = var15 + 1;
            if (var13 <= var16) {
              var16 = 0;
            }
            var11 = var11 & 4095;
            var14 = ocb.field_h[var11];
            var17 = this.permutation[255 & var15] & 255;
            var18 = 255 & this.permutation[255 & var16];
            if (!this.biasUnsigned) {
              for (var10 = 0; hob.textureWidth > var10; var10++) {
                var4_int = this.horizontalFrequency * BoxBlurTextureOperation.textureXCoordinates[var10];
                var6 = this.interpolateNoiseCell(var18, var17, var12, var4_int * var8 >> 12, var14, var11, (byte) -34);
                param2[var10] = var9 * var6 >> 12;
              }
              return;
            }
            for (var10Lifetime3 = 0; hob.textureWidth > var10Lifetime3; var10Lifetime3++) {
              var4_intLifetime3 = BoxBlurTextureOperation.textureXCoordinates[var10Lifetime3] * this.horizontalFrequency;
              var6Lifetime3 = this.interpolateNoiseCell(var18, var17, var12, var4_intLifetime3 * var8 >> 12, var14, var11, (byte) -34);
              var6Lifetime3 = var9 * var6Lifetime3 >> 12;
              param2[var10Lifetime3] = 2048 + (var6Lifetime3 >> 1);
            }
            return;
          }
          var9Lifetime1 = this.amplitudes[0];
          if (var9Lifetime1 > 8 ||
            var9Lifetime1 < -8) {
            var8Lifetime1 = this.frequencies[0] << 12;
            var13Lifetime1 = this.verticalFrequency * var8Lifetime1 >> 12;
            var11Lifetime1 = var8Lifetime1 * var5 >> 12;
            var12Lifetime1 = this.horizontalFrequency * var8Lifetime1 >> 12;
            var15Lifetime1 = var11Lifetime1 >> 12;
            var16Lifetime1 = 1 + var15Lifetime1;
            if (var16Lifetime1 >= var13Lifetime1) {
              var16Lifetime1 = 0;
            }
            var11Lifetime1 = var11Lifetime1 & 4095;
            var14Lifetime1 = ocb.field_h[var11Lifetime1];
            var17Lifetime1 = 255 & this.permutation[255 & var15Lifetime1];
            var18Lifetime1 = this.permutation[255 & var16Lifetime1] & 255;
            for (var10Lifetime1 = 0; var10Lifetime1 < hob.textureWidth; var10Lifetime1++) {
              var4_intLifetime1 = BoxBlurTextureOperation.textureXCoordinates[var10Lifetime1] * this.horizontalFrequency;
              var6Lifetime1 = this.interpolateNoiseCell(var18Lifetime1, var17Lifetime1, var12Lifetime1, var4_intLifetime1 * var8Lifetime1 >> 12, var14Lifetime1, var11Lifetime1, (byte) -34);
              param2[var10Lifetime1] = var9Lifetime1 * var6Lifetime1 >> 12;
            }
          }
          for (var7 = 1; var7 < this.octaveCount; var7++) {
            var9Lifetime2 = this.amplitudes[var7];
            if (8 < var9Lifetime2 ||
              var9Lifetime2 < -8) {
              var8Lifetime2 = this.frequencies[var7] << 12;
              var12Lifetime2 = this.horizontalFrequency * var8Lifetime2 >> 12;
              var11Lifetime2 = var5 * var8Lifetime2 >> 12;
              var13Lifetime2 = var8Lifetime2 * this.verticalFrequency >> 12;
              var15Lifetime2 = var11Lifetime2 >> 12;
              var16Lifetime2 = 1 + var15Lifetime2;
              var11Lifetime2 = var11Lifetime2 & 4095;
              if (var13Lifetime2 <= var16Lifetime2) {
                var16Lifetime2 = 0;
              }
              var14Lifetime2 = ocb.field_h[var11Lifetime2];
              var17Lifetime2 = this.permutation[var15Lifetime2 & 255] & 255;
              var18Lifetime2 = this.permutation[255 & var16Lifetime2] & 255;
              if (this.biasUnsigned &&
                this.octaveCount - 1 == var7) {
                for (var10Lifetime2 = 0; hob.textureWidth > var10Lifetime2; var10Lifetime2++) {
                  var4_intLifetime2 = this.horizontalFrequency * BoxBlurTextureOperation.textureXCoordinates[var10Lifetime2];
                  var6Lifetime2 = this.interpolateNoiseCell(var18Lifetime2, var17Lifetime2, var12Lifetime2, var8Lifetime2 * var4_intLifetime2 >> 12, var14Lifetime2, var11Lifetime2, (byte) -34);
                  var6Lifetime2 = (var9Lifetime2 * var6Lifetime2 >> 12) + param2[var10Lifetime2];
                  param2[var10Lifetime2] = 2048 + (var6Lifetime2 >> 1);
                }
              } else {
                for (var10Lifetime2 = 0; var10Lifetime2 < hob.textureWidth; var10Lifetime2++) {
                  var4_intLifetime2 = BoxBlurTextureOperation.textureXCoordinates[var10Lifetime2] * this.horizontalFrequency;
                  var6Lifetime2 = this.interpolateNoiseCell(var18Lifetime2, var17Lifetime2, var12Lifetime2, var8Lifetime2 * var4_intLifetime2 >> 12, var14Lifetime2, var11Lifetime2, (byte) -34);
                  param2[var10Lifetime2] = param2[var10Lifetime2] + (var6Lifetime2 * var9Lifetime2 >> 12);
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_39_0 = var4;
          stackIn_39_1 = new StringBuilder().append("rw.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(')').toString());
        }
    }

    final void postDecode(byte param0) {
        int var2;
        int var3;
        int var4;
        var4 = VoidHunters.field_G;
        this.permutation = SpecialOrderStatus.a((byte) 95, this.seed);
        this.initializeOctaves(-80);
        var2 = this.octaveCount - 1;
        if (param0 >= -35) {
          return;
        }
        while (var2 >= 1) {
          var3 = this.amplitudes[var2];
          if (var3 <= 8 &&
            var3 >= -8) {
            this.octaveCount = this.octaveCount - 1;
            var2--;
            continue;
          }
          break;
        }
    }

    public PerlinNoiseTextureOperation() {
        super(0, true);
        this.verticalFrequency = 4;
        this.horizontalFrequency = 4;
        this.biasUnsigned = true;
        this.seed = 0;
        this.octaveCount = 4;
        this.persistence = 1638;
        this.permutation = new byte[512];
    }

    final void decodeParameter(int param0, int param1, PacketBuffer param2) {
        int dupTemp$0 = 0;
        boolean stackIn_15_1 = false;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        var5 = VoidHunters.field_G;
        try {
          var4_int = param0;
          if (0 != var4_int) {
            if (1 == var4_int) {
              this.octaveCount = param2.readUnsignedByte((byte) -96);
            } else {
              if (2 != var4_int) {
                if (var4_int != 3) {
                  if (4 == var4_int) {
                    this.seed = param2.readUnsignedByte((byte) -92);
                  } else {
                    if (var4_int == 5) {
                      this.horizontalFrequency = param2.readUnsignedByte((byte) -111);
                    } else {
                      if (var4_int == 6) {
                        this.verticalFrequency = param2.readUnsignedByte((byte) -95);
                      }
                    }
                  }
                } else {
                  dupTemp$0 = param2.readUnsignedByte((byte) -106);
                  this.verticalFrequency = dupTemp$0;
                  this.horizontalFrequency = dupTemp$0;
                }
              } else {
                this.persistence = param2.readShort(true);
                if (this.persistence < 0) {
                  this.amplitudes = new short[this.octaveCount];
                  for (var4_int = 0; this.octaveCount > var4_int; var4_int++) {
                    this.amplitudes[var4_int] = (short)param2.readShort(true);
                  }
                }
              }
            }
          } else {
            stackIn_15_1 = (param2.readUnsignedByte((byte) -127) == 1);
            this.biasUnsigned = stackIn_15_1;
          }
          if (param1 > -60) {
            this.persistence = -4;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_31_0 = var4;
          stackIn_31_1 = new StringBuilder().append("rw.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    private final int interpolateNoiseCell(int param0, int param1, int param2, int param3, int param4, int param5, byte param6) {
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_39_0 = 0;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        PacketBuffer var19;
        int var8Lifetime1;
        int var9Lifetime1;
        int var14Lifetime1;
        int var14Lifetime2;
        int var14Lifetime3;
        var18 = VoidHunters.field_G;
        var13 = param3 >> 12;
        var12 = 1 + var13;
        var13 = var13 & 255;
        if (var12 >= param2) {
          var12 = 0;
        }
        param3 = param3 & 4095;
        if (param6 != -34) {
          var19 = (PacketBuffer) null;
          this.decodeParameter(77, -92, (PacketBuffer) null);
        }
        var12 = var12 & 255;
        var11 = param3 - 4096;
        var10 = -4096 + param5;
        var14 = this.permutation[var13 + param1] & 3;
        var15 = ocb.field_h[param3];
        if (var14 > 1) {
          if (var14 != 2) {
            stackIn_12_0 = -param5 - param3;
          } else {
            stackIn_12_0 = -param5 + param3;
          }
          var8 = stackIn_12_0;
        } else {
          if (var14 == 0) {
            stackIn_8_0 = param3 + param5;
          } else {
            stackIn_8_0 = -param3 + param5;
          }
          var8 = stackIn_8_0;
        }
        var14Lifetime1 = 3 & this.permutation[var12 + param1];
        if (var14Lifetime1 <= 1) {
          if (0 == var14Lifetime1) {
            stackIn_21_0 = var11 + param5;
          } else {
            stackIn_21_0 = -var11 + param5;
          }
          var9 = stackIn_21_0;
        } else {
          if (var14Lifetime1 != 2) {
            stackIn_17_0 = -param5 - var11;
          } else {
            stackIn_17_0 = -param5 + var11;
          }
          var9 = stackIn_17_0;
        }
        var14Lifetime2 = this.permutation[param0 + var13] & 3;
        var16 = var8 + ((-var8 + var9) * var15 >> 12);
        if (var14Lifetime2 <= 1) {
          if (var14Lifetime2 == 0) {
            stackIn_30_0 = param3 + var10;
          } else {
            stackIn_30_0 = var10 - param3;
          }
          var8Lifetime1 = stackIn_30_0;
        } else {
          if (var14Lifetime2 != 2) {
            stackIn_26_0 = -var10 - param3;
          } else {
            stackIn_26_0 = param3 - var10;
          }
          var8Lifetime1 = stackIn_26_0;
        }
        var14Lifetime3 = 3 & this.permutation[param0 + var12];
        if (var14Lifetime3 > 1) {
          if (2 != var14Lifetime3) {
            stackIn_39_0 = -var10 - var11;
          } else {
            stackIn_39_0 = var11 - var10;
          }
          var9Lifetime1 = stackIn_39_0;
        } else {
          if (0 == var14Lifetime3) {
            stackIn_35_0 = var11 + var10;
          } else {
            stackIn_35_0 = var10 - var11;
          }
          var9Lifetime1 = stackIn_35_0;
        }
        var17 = var8Lifetime1 + (var15 * (var9Lifetime1 - var8Lifetime1) >> 12);
        return (param4 * (-var16 + var17) >> 12) + var16;
    }

    public static void clearSharedReferences(byte param0) {
        field_l = null;
        int var1 = 4 / ((-39 - param0) / 39);
    }

    final int[] getMonochromeRow(int param0, boolean param1) {
        int[] var5 = this.field_f.getRow((byte) 127, param0);
        int[] var3 = var5;
        if (this.field_f.field_e) {
          this.generateNoiseRow(1, param0, var5);
        }
        if (!param1) {
          PacketBuffer var4 = (PacketBuffer) null;
          this.decodeParameter(-38, 6, (PacketBuffer) null);
        }
        return var5;
    }

    final static void a(boolean param0, byte param1) {
        if (param1 != 71) {
          return;
        }
        QuickChatPhraseDefinition.a((byte) -121, true, param0);
    }

    static {
        field_n = 1.0f;
        field_q = 0;
    }
}
