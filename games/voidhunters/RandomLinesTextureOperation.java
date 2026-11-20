/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class RandomLinesTextureOperation extends TextureOperation {
    private int angleRange;
    private int lineCount;
    static int field_m;
    private int lineLength;
    private int baseAngle;
    private int seed;

    final int[] getMonochromeRow(int param0, boolean param1) {
        int var7 = 0;
        int var23 = 0;
        int stackIn_7_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_27_0 = 0;
        int[] var3;
        int var4;
        Random var6;
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
        int var19;
        int var20;
        int var21;
        int var22;
        int var24;
        int var25;
        int var26;
        int var27;
        int[][] var31;
        int var16Lifetime1;
        int var16Lifetime2;
        int var17Lifetime1;
        int var17Lifetime2;
        var27 = VoidHunters.field_G;
        var3 = this.field_f.getRow((byte) 117, param0);
        if (this.field_f.field_e) {
          var4 = this.angleRange >> 1;
          var31 = this.field_f.getFullImage(73);
          var6 = new Random((long)this.seed);
          for (var7 = 0; this.lineCount > var7; var7++) {
            if (this.angleRange <= 0) {
              stackIn_7_0 = this.baseAngle;
            } else {
              stackIn_7_0 = this.baseAngle + (-var4 + TextHotspotRegion.randomBoundedInt(var6, this.angleRange, 124));
            }
            var8 = stackIn_7_0;
            var8 = var8 >> 4 & 255;
            var9 = TextHotspotRegion.randomBoundedInt(var6, TextHotspotRegion.textureWidth, 127);
            var10 = TextHotspotRegion.randomBoundedInt(var6, GetTorpedoReload.field_o, 117);
            var11 = var9 + (GetBombletSprayProjectiles.field_q[var8] * this.lineLength >> 12);
            var12 = var10 + (GetDebrisPartitioned.field_o[var8] * this.lineLength >> 12);
            var13 = -var10 + var12;
            var14 = -var9 + var11;
            if (var14 != 0 ||
              var13 != 0) {
              if (0 > var14) {
                var14 = -var14;
              }
              if (var13 < 0) {
                var13 = -var13;
              }
              stackIn_20_0 = (var14 >= var13) ? 0 : 1;
              var15 = stackIn_20_0;
              if (var15 != 0) {
                var16 = var9;
                var17 = var11;
                var9 = var10;
                var11 = var12;
                var10 = var16;
                var12 = var17;
              }
              if (var9 > var11) {
                var16Lifetime1 = var9;
                var9 = var11;
                var17Lifetime1 = var10;
                var10 = var12;
                var11 = var16Lifetime1;
                var12 = var17Lifetime1;
              }
              var16Lifetime2 = var10;
              var17Lifetime2 = var11 - var9;
              var18 = var12 - var10;
              var19 = -var17Lifetime2 / 2;
              var20 = 2048 / var17Lifetime2;
              var21 = 1024 - (TextHotspotRegion.randomBoundedInt(var6, 4096, 127) >> 2);
              stackIn_27_0 = (var12 > var10) ? 1 : -1;
              var22 = stackIn_27_0;
              if (var18 < 0) {
                var18 = -var18;
              }
              for (var23 = var9; var23 < var11; var23++) {
                var24 = var20 * (var23 - var9) + 1024 + var21;
                var25 = SetMassDriverEnergyUsed.field_q & var23;
                var26 = var16Lifetime2 & GameMenuScreen.textureHeightMask;
                var19 = var19 + var18;
                if (var15 == 0) {
                  var31[var25][var26] = var24;
                } else {
                  var31[var26][var25] = var24;
                }
                if (var19 > 0) {
                  var19 = -var17Lifetime2 + var19;
                  var16Lifetime2 = var16Lifetime2 + var22;
                }
              }
            }
          }
        }
        if (!param1) {
          RandomLinesTextureOperation.isEmailAvailabilityPending((byte) 3);
        }
        return var3;
    }

    public RandomLinesTextureOperation() {
        super(0, true);
        this.lineCount = 2000;
        this.angleRange = 4096;
        this.lineLength = 16;
        this.seed = 0;
        this.baseAngle = 0;
    }

    final void decodeParameter(int param0, int param1, PacketBuffer param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = VoidHunters.field_G;
        try {
          if (param1 >= -60) {
            this.getMonochromeRow(66, true);
          }
          var4_int = param0;
          if (var4_int == 0) {
            this.seed = param2.readUnsignedByte((byte) -101);
          } else {
            if (var4_int == 1) {
              this.lineCount = param2.readUnsignedShort(1869);
            } else {
              if (var4_int != 2) {
                if (var4_int == 3) {
                  this.baseAngle = param2.readUnsignedShort(1869);
                } else {
                  if (var4_int == 4) {
                    this.angleRange = param2.readUnsignedShort(1869);
                  }
                }
              } else {
                this.lineLength = param2.readUnsignedByte((byte) -117);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_18_0 = var4;
          stackIn_18_1 = new StringBuilder().append("sva.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final void postDecode(byte param0) {
        if (param0 >= -35) {
          RandomLinesTextureOperation.isEmailAvailabilityPending((byte) -123);
        }
        GetTrapMouse.e((byte) -120);
    }

    final static boolean isEmailAvailabilityPending(byte param0) {
        if (param0 != -34) {
          RandomLinesTextureOperation.isEmailAvailabilityPending((byte) 68);
        }
        return !GetBombletSprayPushMultiplier.emailAvailabilityCheck.isComplete(4) ? true : false;
    }

    static {
        field_m = 20;
    }
}
