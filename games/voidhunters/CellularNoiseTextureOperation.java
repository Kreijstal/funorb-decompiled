/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class CellularNoiseTextureOperation extends TextureOperation {
    static String field_q;
    private int outputMode;
    private short[] cellOffsets;
    private int jitterRange;
    private byte[] permutation;
    private int distanceMetric;
    private int seed;
    private int verticalFrequency;
    private int horizontalFrequency;

    final void postDecode(byte param0) {
        this.permutation = SpecialOrderStatus.getNoisePermutation((byte) 36, this.seed);
        this.initializeCellOffsets(30866);
        if (param0 > -35) {
          PacketBuffer var3 = (PacketBuffer) null;
          this.decodeParameter(-21, 74, (PacketBuffer) null);
        }
    }

    public CellularNoiseTextureOperation() {
        super(0, true);
        this.permutation = new byte[512];
        this.outputMode = 2;
        this.seed = 0;
        this.cellOffsets = new short[512];
        this.jitterRange = 2048;
        this.distanceMetric = 1;
        this.horizontalFrequency = 5;
        this.verticalFrequency = 5;
    }

    private final void initializeCellOffsets(int param0) {
        int var3 = 0;
        int var4 = VoidHunters.field_G;
        Random var5 = new Random((long)this.seed);
        Random var2 = var5;
        if (param0 != 30866) {
          this.postDecode((byte) 124);
        }
        this.cellOffsets = new short[512];
        if (this.jitterRange > 0) {
          for (var3 = 0; 512 > var3; var3++) {
            this.cellOffsets[var3] = (short)TextHotspotRegion.randomBoundedInt(var5, this.jitterRange, 120);
          }
        }
    }

    final void decodeParameter(int param0, int param1, PacketBuffer param2) {
        int dupTemp$0 = 0;
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = VoidHunters.field_G;
        try {
          var4_int = param0;
          if (var4_int != 0) {
            if (var4_int == 1) {
              this.seed = param2.readUnsignedByte((byte) -127);
            } else {
              if (var4_int == 2) {
                this.jitterRange = param2.readUnsignedShort(1869);
              } else {
                if (var4_int != 3) {
                  if (var4_int == 4) {
                    this.distanceMetric = param2.readUnsignedByte((byte) -97);
                  } else {
                    if (var4_int == 5) {
                      this.horizontalFrequency = param2.readUnsignedByte((byte) -97);
                    } else {
                      if (var4_int == 6) {
                        this.verticalFrequency = param2.readUnsignedByte((byte) -87);
                      }
                    }
                  }
                } else {
                  this.outputMode = param2.readUnsignedByte((byte) -108);
                }
              }
            }
          } else {
            dupTemp$0 = param2.readUnsignedByte((byte) -123);
            this.verticalFrequency = dupTemp$0;
            this.horizontalFrequency = dupTemp$0;
          }
          if (param1 >= -60) {
            this.seed = -121;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_23_0 = var4;
          stackIn_23_1 = new StringBuilder().append("vm.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final int[] getMonochromeRow(int param0, boolean param1) {
        int var14 = 0;
        int var8 = 0;
        int var7 = 0;
        int incrementValue$0 = 0;
        byte[] stackIn_9_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_14_0;
        int stackIn_14_1;
        byte[] stackIn_14_2;
        int stackIn_14_3;
        int stackIn_15_4 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_37_0 = 0;
        double stackIn_39_0 = 0.0;
        int stackIn_40_1 = 0;
        int stackIn_45_0 = 0;
        int stackIn_48_1 = 0;
        int[] var3;
        int var4;
        int var5;
        int var6;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var18Lifetime1;
        var19 = VoidHunters.field_G;
        if (!param1) {
          this.postDecode((byte) 33);
        }
        var3 = this.field_f.getRow((byte) 118, param0);
        if (this.field_f.field_e) {
          var4 = 2048 + SetSalvoUsesAllEnergy.textureYCoordinates[param0] * this.verticalFrequency;
          var5 = var4 >> 12;
          var6 = var5 + 1;
          for (var14 = 0; TextHotspotRegion.textureWidth > var14; var14++) {
            SoftwareDepthBuffer.field_b = 2147483647;
            TutorialProgressState.field_b = 2147483647;
            SetSalvoRepairTimeMultiplier.field_q = 2147483647;
            MissionListFactory.field_b = 2147483647;
            var15 = 2048 + BoxBlurTextureOperation.textureXCoordinates[var14] * this.horizontalFrequency;
            var16 = var15 >> 12;
            var17 = var16 + 1;
            for (var8 = var5 - 1; var6 >= var8; var8++) {
              stackIn_9_0 = this.permutation;
              if (var8 < this.verticalFrequency) {
                stackIn_10_1 = var8;
              } else {
                stackIn_10_1 = var8 - this.verticalFrequency;
              }
              var12 = stackIn_9_0[stackIn_10_1 & 255] & 255;
              for (var7 = var16 - 1; var7 <= var17; var7++) {
                stackIn_14_0 = 2;
                stackIn_14_1 = 255;
                stackIn_14_2 = this.permutation;
                stackIn_14_3 = 255;
                if (this.horizontalFrequency <= var7) {
                  stackIn_15_4 = -this.horizontalFrequency + var7;
                } else {
                  stackIn_15_4 = var7;
                }
                var13 = stackIn_14_0 * (stackIn_14_1 & stackIn_14_2[stackIn_14_3 & stackIn_15_4 + var12]);
                incrementValue$0 = var13;
                var13++;
                var9 = -this.cellOffsets[incrementValue$0] - ((var7 << 12) - var15);
                var10 = var4 - ((var8 << 12) + this.cellOffsets[var13]);
                var18 = this.distanceMetric;
                if (var18 != 1) {
                  if (var18 != 3) {
                    if (var18 == 4) {
                      if (0 > var9) {
                        stackIn_37_0 = -var9;
                      } else {
                        stackIn_37_0 = var9;
                      }
                      var9 = (int)(Math.sqrt((double)((float)stackIn_37_0 / 4096.0f)) * 4096.0);
                      stackIn_39_0 = 4096.0;
                      if (var10 < 0) {
                        stackIn_40_1 = -var10;
                      } else {
                        stackIn_40_1 = var10;
                      }
                      var10 = (int)(stackIn_39_0 * Math.sqrt((double)((float)stackIn_40_1 / 4096.0f)));
                      var11 = var9 + var10;
                      var11 = var11 * var11 >> 12;
                    } else {
                      if (5 == var18) {
                        var10 = var10 * var10;
                        var9 = var9 * var9;
                        var11 = (int)(4096.0 * Math.sqrt(Math.sqrt((double)((float)(var9 + var10) / 16777216.0f))));
                      } else {
                        if (var18 != 2) {
                          var11 = (int)(Math.sqrt((double)((float)(var9 * var9 + var10 * var10) / 16777216.0f)) * 4096.0);
                        } else {
                          if (var10 >= 0) {
                            stackIn_45_0 = var10;
                          } else {
                            stackIn_45_0 = -var10;
                          }
                          if (var9 < 0) {
                            stackIn_48_1 = -var9;
                          } else {
                            stackIn_48_1 = var9;
                          }
                          var11 = stackIn_45_0 + stackIn_48_1;
                        }
                      }
                    }
                  } else {
                    if (var9 >= 0) {
                      stackIn_27_0 = var9;
                    } else {
                      stackIn_27_0 = -var9;
                    }
                    var9 = stackIn_27_0;
                    if (0 > var10) {
                      stackIn_30_0 = -var10;
                    } else {
                      stackIn_30_0 = var10;
                    }
                    var10 = stackIn_30_0;
                    stackIn_33_0 = (var10 >= var9) ? var10 : var9;
                    var11 = stackIn_33_0;
                  }
                } else {
                  var11 = var9 * var9 + var10 * var10 >> 12;
                }
                if (SetSalvoRepairTimeMultiplier.field_q > var11) {
                  SoftwareDepthBuffer.field_b = TutorialProgressState.field_b;
                  TutorialProgressState.field_b = MissionListFactory.field_b;
                  MissionListFactory.field_b = SetSalvoRepairTimeMultiplier.field_q;
                  SetSalvoRepairTimeMultiplier.field_q = var11;
                } else {
                  if (var11 >= MissionListFactory.field_b) {
                    if (TutorialProgressState.field_b <= var11) {
                      if (var11 < SoftwareDepthBuffer.field_b) {
                        SoftwareDepthBuffer.field_b = var11;
                      }
                    } else {
                      SoftwareDepthBuffer.field_b = TutorialProgressState.field_b;
                      TutorialProgressState.field_b = var11;
                    }
                  } else {
                    SoftwareDepthBuffer.field_b = TutorialProgressState.field_b;
                    TutorialProgressState.field_b = MissionListFactory.field_b;
                    MissionListFactory.field_b = var11;
                  }
                }
              }
            }
            var18Lifetime1 = this.outputMode;
            if (0 == var18Lifetime1) {
              var3[var14] = SetSalvoRepairTimeMultiplier.field_q;
            } else {
              if (var18Lifetime1 == 1) {
                var3[var14] = MissionListFactory.field_b;
              } else {
                if (var18Lifetime1 != 3) {
                  if (4 != var18Lifetime1) {
                    if (2 == var18Lifetime1) {
                      var3[var14] = -SetSalvoRepairTimeMultiplier.field_q + MissionListFactory.field_b;
                    }
                  } else {
                    var3[var14] = SoftwareDepthBuffer.field_b;
                  }
                } else {
                  var3[var14] = TutorialProgressState.field_b;
                }
              }
            }
          }
        }
        return var3;
    }

    public static void clearSharedReferences(byte param0) {
        if (param0 != 110) {
          CellularNoiseTextureOperation.clearSharedReferences((byte) -75);
        }
        field_q = null;
    }

    static {
        field_q = "Defend your base with blueprint ships. No respawns.";
    }
}
