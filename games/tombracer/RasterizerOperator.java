/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class RasterizerOperator extends TextureOperator {
    static String[] field_m;
    static int[] field_n;
    private RasterShape[] field_p;
    static int field_o;

    final void decodeParameter(byte param0, PacketBuffer param1, int param2) {
        int var4_int = 0;
        boolean stackIn_20_1 = false;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          if (param0 != 107) {
            this.a(80, (int[][]) null);
          }
          if (param2 == 0) {
            this.field_p = new RasterShape[param1.readUnsignedByte(255)];
            for (var4_int = 0; this.field_p.length > var4_int; var4_int++) {
              var5 = param1.readUnsignedByte(255);
              var6 = var5;
              if (0 == var6) {
                this.field_p[var4_int] = (RasterShape) ((Object) DualLinkNode.a(0, param1));
              } else {
                if (var6 == 1) {
                  this.field_p[var4_int] = (RasterShape) ((Object) HotspotTextWidget.a(param1, (byte) -88));
                } else {
                  if (var6 == 2) {
                    this.field_p[var4_int] = (RasterShape) ((Object) SwitchableId.a(4, param1));
                  } else {
                    if (3 == var6) {
                      this.field_p[var4_int] = (RasterShape) ((Object) cba.a(64, param1));
                    }
                  }
                }
              }
            }
            return;
          }
          if (param2 == 1) {
            stackIn_20_1 = (param1.readUnsignedByte(255) == 1);
            this.monochrome = stackIn_20_1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_24_0 = var4;
          stackIn_24_1 = new StringBuilder().append("rda.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(int param0, int[][] param1) {
        int var5 = 0;
        int var3_int = 0;
        int var4 = 0;
        RasterShape var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          var3_int = LegacyOpenGlTurbulentTextureEffect.textureWidth;
          if (param0 != -8883) {
            RasterizerOperator.d(56);
          }
          var4 = ArchiveNetworkClient.textureHeight;
          TileOperator.a(param1, param0 ^ -8901);
          MazeGenerator.a(una.textureWidthMask, false, 0, 0, hba.textureHeightMask);
          if (null != this.field_p) {
            for (var5 = 0; var5 < this.field_p.length; var5++) {
              var6 = this.field_p[var5];
              var7 = var6.fillColour;
              var8 = var6.outlineColour;
              if (var7 < 0) {
                if (var8 >= 0) {
                  var6.drawOutline(var3_int, var4, true);
                }
              } else {
                if (0 > var8) {
                  var6.drawFilled(var4, 119, var3_int);
                } else {
                  var6.drawFilledWithOutline((byte) -122, var3_int, var4);
                }
              }
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("rda.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    public RasterizerOperator() {
        super(0, true);
    }

    final static void clearStatics(byte param0) {
        if (param0 != -128) {
          RasterizerOperator.d(63);
        }
        bl.field_a = null;
    }

    final static void closeNetworkAndCacheResources(int param0) {
        try {
          int var1_int = 0;
          int var3 = TombRacer.field_G ? 1 : 0;
          if (null != wg.field_l) {
            wg.field_l.a(param0 - 21);
          }
          if (param0 != 0) {
            return;
          }
          try {
            if (null != Projectile.field_k) {
              Projectile.field_k.shutdown((byte) 118);
            }
            if (null != wka.field_c) {
              try {
                wka.field_c.b((byte) -52);
              } catch (IOException iOException) {
              }
            }
            if (null != DivisionMazeGenerator.field_c) {
              for (var1_int = 0; var1_int < DivisionMazeGenerator.field_c.length; var1_int++) {
                if (DivisionMazeGenerator.field_c[var1_int] != null) {
                  try {
                    DivisionMazeGenerator.field_c[var1_int].b((byte) -37);
                  } catch (IOException var2_ref) {
                  }
                }
              }
            }
          } catch (RuntimeException runtimeException) {
            throw tba.wrapException((Throwable) ((Object) runtimeException), "rda.C(" + param0 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void releaseStatics(int param0) {
        field_m = null;
        field_n = null;
        if (param0 > -82) {
          field_o = -33;
        }
    }

    final int[] getMonochromeRow(int param0, int param1) {
        if (param0 != 1) {
          field_n = (int[]) null;
        }
        int[] var4 = this.monochromeCache.getRow((byte) 107, param1);
        int[] var3 = var4;
        if (this.monochromeCache.rowMissed) {
          this.a(-8883, this.monochromeCache.getAllRows(0));
        }
        return var4;
    }

    final int[][] getColourRow(int param0, int param1) {
        int var4 = 0;
        int var5 = 0;
        int[][] var29 = null;
        int[][][] var30 = null;
        int var8 = 0;
        int[] var32 = null;
        int[][] var31 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = TombRacer.field_G ? 1 : 0;
        int[][] var3 = this.colourCache.getRow(param0, (byte) 125);
        if (param1 != -1) {
          field_m = (String[]) null;
        }
        if (this.colourCache.field_f) {
          var4 = LegacyOpenGlTurbulentTextureEffect.textureWidth;
          var5 = ArchiveNetworkClient.textureHeight;
          var29 = new int[var5][var4];
          var30 = this.colourCache.getAllRows((byte) -98);
          this.a(-8883, var29);
          for (var8 = 0; var8 < ArchiveNetworkClient.textureHeight; var8++) {
            var32 = var29[var8];
            var31 = var30[var8];
            var11 = var31[0];
            var12 = var31[1];
            var13 = var31[2];
            for (var14 = 0; LegacyOpenGlTurbulentTextureEffect.textureWidth > var14; var14++) {
              var15 = var32[var14];
              var13[var14] = SnakePitBehaviour.bitwiseAnd(255, var15) << 4;
              var12[var14] = SnakePitBehaviour.bitwiseAnd(65280, var15) >> 4;
              var11[var14] = SnakePitBehaviour.bitwiseAnd(var15, 16711680) >> 12;
            }
          }
        }
        return var3;
    }

    final static boolean d(int param0) {
        if (param0 != 20125) {
          return true;
        }
        return ld.field_e >= 2 ? true : false;
    }

    static {
    }
}
