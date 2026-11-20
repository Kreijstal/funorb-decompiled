/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class BricksTextureOperation extends TextureOperation {
    private int rowOffset;
    private int brickWidth;
    private int[] rowBoundaries;
    private int verticalOffset;
    private int[][] brickValues;
    private int mortarWidth;
    private int[][] columnBoundaries;
    private int brightnessRandomness;
    private int heightRandomness;
    private int brickHeight;
    private int columnCount;
    private int widthRandomness;
    private int mortarInset;
    static String field_t;
    private int rowCount;

    final int[] getMonochromeRow(int param0, boolean param1) {
        int var4 = 0;
        int stackIn_14_0 = 0;
        int stackIn_21_0 = 0;
        int[] var3;
        int var5;
        int var6;
        int var7;
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
        int[] var18;
        int[] var19;
        int[] var19Lifetime1;
        var17 = VoidHunters.field_G;
        var19 = this.field_f.getRow((byte) 40, param0);
        var18 = var19;
        var3 = var18;
        if (!param1) {
          return (int[]) null;
        }
        if (this.field_f.field_e) {
          var7 = 0;
          for (var9 = this.verticalOffset + SetSalvoUsesAllEnergy.textureYCoordinates[param0]; 0 > var9; var9 += 4096) {
          }
          while (4096 < var9) {
            var9 -= 4096;
          }
          while (var7 < this.rowCount) {
            if (var9 >= this.rowBoundaries[var7]) {
              var7++;
              continue;
            }
            break;
          }
          var11 = -1 + var7;
          stackIn_14_0 = ((var7 & 1) != 0) ? 0 : 1;
          var12 = stackIn_14_0;
          var15 = this.rowBoundaries[var7];
          var16 = this.rowBoundaries[-1 + var7];
          if (this.mortarInset + var16 < var9 &&
            var15 - this.mortarInset > var9) {
            for (var4 = 0; var4 < TextHotspotRegion.textureWidth; var4++) {
              var6 = 0;
              if (var12 == 0) {
                stackIn_21_0 = -this.rowOffset;
              } else {
                stackIn_21_0 = this.rowOffset;
              }
              var5 = stackIn_21_0;
              for (var8 = (var5 * this.brickWidth >> 12) + BoxBlurTextureOperation.textureXCoordinates[var4]; var8 < 0; var8 += 4096) {
              }
              while (var8 > 4096) {
                var8 -= 4096;
              }
              while (var6 < this.columnCount) {
                if (this.columnBoundaries[var11][var6] <= var8) {
                  var6++;
                  continue;
                }
                break;
              }
              var10 = -1 + var6;
              var14 = this.columnBoundaries[var11][var6];
              var13 = this.columnBoundaries[var11][var10];
              if (var8 > this.mortarInset + var13 &&
                -this.mortarInset + var14 > var8) {
                var3[var4] = this.brickValues[var11][var10];
              } else {
                var19Lifetime1 = var18;
                var19Lifetime1[var4] = 0;
              }
            }
          } else {
            var19Lifetime1 = var18;
            ArrayOperations.fill(var19Lifetime1, 0, TextHotspotRegion.textureWidth, 0);
          }
        }
        return var3;
    }

    final static boolean handleChatAndDialogKeyEvent(int param0, int param1, int param2, int param3) {
        if (GetLagStandardDeviationOut.field_o != null &&
          GetLagStandardDeviationOut.field_o.pollSelectionPending(0)) {
          TileTextureOperation.closePlayerContextMenu(0);
          return true;
        }
        if (Asteroid.activeReportDialog != null &&
          Asteroid.activeReportDialog.pollPending(-15244)) {
          Asteroid.activeReportDialog = null;
          TileTextureOperation.closePlayerContextMenu(0);
          return true;
        }
        if (GetMissileLauncherEnergyUsed.handleNameEntryKeyEvent((byte) 114)) {
          return true;
        }
        if (param1 != -2048) {
          BricksTextureOperation.clearSharedReferences(false);
        }
        if (OpenGlCubeTexture.handleChatKeyEvent(param0, -94, param3, param2)) {
          return true;
        }
        return false;
    }

    final void postDecode(byte param0) {
        this.initializeBrickPattern((byte) -34);
        if (param0 >= -35) {
          this.verticalOffset = -6;
        }
    }

    public BricksTextureOperation() {
        super(0, true);
        this.verticalOffset = 0;
        this.brightnessRandomness = 1024;
        this.rowOffset = 1024;
        this.heightRandomness = 204;
        this.mortarWidth = 81;
        this.columnCount = 4;
        this.widthRandomness = 409;
        this.rowCount = 8;
    }

    private final void initializeBrickPattern(byte param0) {
        int var5 = 0;
        int var8 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = VoidHunters.field_G;
        Random var10 = new Random((long)this.rowCount);
        int var6Lifetime1;
        int var7Lifetime1;
        this.brickWidth = 4096 / this.columnCount;
        this.mortarInset = this.mortarWidth / 2;
        this.brickHeight = 4096 / this.rowCount;
        int var3 = this.brickWidth / 2;
        if (param0 != -34) {
          return;
        }
        this.columnBoundaries = new int[this.rowCount][1 + this.columnCount];
        this.brickValues = new int[this.rowCount][this.columnCount];
        int var4 = this.brickHeight / 2;
        this.rowBoundaries = new int[this.rowCount + 1];
        this.rowBoundaries[0] = 0;
        for (var5 = 0; var5 < this.rowCount; var5++) {
          if (var5 > 0) {
            var6 = this.brickHeight;
            var7 = (-2048 + TextHotspotRegion.randomBoundedInt(var10, 4096, 123)) * this.heightRandomness >> 12;
            var6 = var6 + (var7 * var4 >> 12);
            this.rowBoundaries[var5] = var6 + this.rowBoundaries[-1 + var5];
          }
          this.columnBoundaries[var5][0] = 0;
          for (var6Lifetime1 = 0; this.columnCount > var6Lifetime1; var6Lifetime1++) {
            if (var6Lifetime1 > 0) {
              var7Lifetime1 = this.brickWidth;
              var8 = (TextHotspotRegion.randomBoundedInt(var10, 4096, param0 ^ -91) - 2048) * this.widthRandomness >> 12;
              var7Lifetime1 = var7Lifetime1 + (var8 * var3 >> 12);
              this.columnBoundaries[var5][var6Lifetime1] = this.columnBoundaries[var5][var6Lifetime1 - 1] + var7Lifetime1;
            }
            this.brickValues[var5][var6Lifetime1] = this.brightnessRandomness > 0 ? -TextHotspotRegion.randomBoundedInt(var10, this.brightnessRandomness, 123) + 4096 : 4096;
          }
          this.columnBoundaries[var5][this.columnCount] = 4096;
        }
        this.rowBoundaries[this.rowCount] = 4096;
    }

    final void decodeParameter(int param0, int param1, PacketBuffer param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = VoidHunters.field_G;
        try {
          var4_int = param0;
          if (var4_int != 0) {
            if (var4_int == 1) {
              this.rowCount = param2.readUnsignedByte((byte) -118);
            } else {
              if (2 == var4_int) {
                this.widthRandomness = param2.readUnsignedShort(1869);
              } else {
                if (var4_int != 3) {
                  if (var4_int == 4) {
                    this.rowOffset = param2.readUnsignedShort(1869);
                  } else {
                    if (var4_int != 5) {
                      if (var4_int != 6) {
                        if (7 == var4_int) {
                          this.brightnessRandomness = param2.readUnsignedShort(1869);
                        }
                      } else {
                        this.mortarWidth = param2.readUnsignedShort(1869);
                      }
                    } else {
                      this.verticalOffset = param2.readUnsignedShort(1869);
                    }
                  }
                } else {
                  this.heightRandomness = param2.readUnsignedShort(1869);
                }
              }
            }
          } else {
            this.columnCount = param2.readUnsignedByte((byte) -101);
          }
          if (param1 >= -60) {
            BricksTextureOperation.handleChatAndDialogKeyEvent(-48, 83, 33, 63);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_27_0 = var4;
          stackIn_27_1 = new StringBuilder().append("jlb.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    public static void clearSharedReferences(boolean param0) {
        field_t = null;
        if (!param0) {
          field_t = (String) null;
        }
    }

    static {
        field_t = "Destroy the enemy VIP";
    }
}
