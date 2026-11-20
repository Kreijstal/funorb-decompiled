/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class TileTextureOperation extends TextureOperation {
    private int verticalRepeatCount;
    static QuickChatCategoryLoader field_i;
    private int horizontalRepeatCount;

    final int[] getMonochromeRow(int param0, boolean param1) {
        int[] var3;
        int[] var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int[] var10;
        int var11;
        int var7Lifetime1;
        var9 = VoidHunters.field_G;
        if (!param1) {
          this.getColorRow(105, -69);
        }
        var10 = this.field_f.getRow((byte) -112, param0);
        var3 = var10;
        if (this.field_f.field_e) {
          var5 = TextHotspotRegion.textureWidth / this.horizontalRepeatCount;
          var6 = GetTorpedoReload.field_o / this.verticalRepeatCount;
          if (var6 <= 0) {
            var4 = this.getInputMonochromeRow(0, 0, 255);
          } else {
            var7 = param0 % var6;
            var4 = this.getInputMonochromeRow(0, GetTorpedoReload.field_o * var7 / var6, 255);
          }
          var11 = 0;
          var7Lifetime1 = var11;
          while (TextHotspotRegion.textureWidth > var11) {
            if (var5 <= 0) {
              var10[var11] = var4[0];
            } else {
              var8 = var11 % var5;
              var10[var11] = var4[var8 * TextHotspotRegion.textureWidth / var5];
            }
            var11++;
          }
        }
        return var10;
    }

    final int[][] getColorRow(int param0, int param1) {
        int var13 = 0;
        int[][] var3;
        int[][] var4;
        int var5;
        int var6;
        int var7_int;
        int[] var7;
        int[] var8;
        int[] var9;
        int[] var10;
        int[] var11;
        int[] var12;
        int var14;
        int var15;
        int var16;
        int[][] var17;
        int[][] var18;
        int[][] var19;
        var16 = VoidHunters.field_G;
        if (param0 != 255) {
          return (int[][]) null;
        }
        var19 = this.field_d.getRow(param1, (byte) -127);
        var18 = var19;
        var17 = var18;
        var3 = var17;
        if (this.field_d.field_g) {
          var5 = TextHotspotRegion.textureWidth / this.horizontalRepeatCount;
          var6 = GetTorpedoReload.field_o / this.verticalRepeatCount;
          if (var6 <= 0) {
            var4 = this.getInputColorRow((byte) 69, 0, 0);
          } else {
            var7_int = param1 % var6;
            var4 = this.getInputColorRow((byte) 82, 0, var7_int * GetTorpedoReload.field_o / var6);
          }
          var7 = var4[0];
          var8 = var4[1];
          var9 = var4[2];
          var10 = var19[0];
          var11 = var19[1];
          var12 = var19[2];
          for (var13 = 0; var13 < TextHotspotRegion.textureWidth; var13++) {
            if (0 >= var5) {
              var14 = 0;
            } else {
              var15 = var13 % var5;
              var14 = TextHotspotRegion.textureWidth * var15 / var5;
            }
            var10[var13] = var7[var14];
            var11[var13] = var8[var14];
            var12[var13] = var9[var14];
          }
        }
        return var17;
    }

    final void decodeParameter(int param0, int param1, PacketBuffer param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = VoidHunters.field_G;
        try {
          var4_int = param0;
          if (var4_int != 0) {
            if (var4_int == 1) {
              this.verticalRepeatCount = param2.readUnsignedByte((byte) -126);
            }
          } else {
            this.horizontalRepeatCount = param2.readUnsignedByte((byte) -121);
          }
          if (param1 >= -60) {
            this.horizontalRepeatCount = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("lnb.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void flushSocketOutput(int param0, int param1) {
        try {
          IOException iOException = null;
          Throwable decompiledCaughtException = null;
          if (null != SetShipSpawnInvulnerabilityTime.field_o && (param0 < 0 ||
            GetOndamageParticleSpeed.field_o == TextureCombineMappings.field_c)) {
            if (param1 < 110) {
              return;
            }
            if (RequestNewestBlackboxRecording.field_p.position == 0 &&
              (10000L + GetTorpedoProjectileOndamageParticles.field_o) < MonotonicMillisClock.currentTimeMillis(false)) {
              RequestNewestBlackboxRecording.field_p.writeIsaacByte(24335, param0);
            }
            if (0 < RequestNewestBlackboxRecording.field_p.position) {
              try {
                SetShipSpawnInvulnerabilityTime.field_o.write(0, RequestNewestBlackboxRecording.field_p.payload, RequestNewestBlackboxRecording.field_p.position, 0);
                GetTorpedoProjectileOndamageParticles.field_o = MonotonicMillisClock.currentTimeMillis(false);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                iOException = (IOException) (Object) decompiledCaughtException;
                FighterBayWeaponDefinition.l(-122);
              }
              RequestNewestBlackboxRecording.field_p.position = 0;
            }
            return;
          }
          RequestNewestBlackboxRecording.field_p.position = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public TileTextureOperation() {
        super(1, false);
        this.verticalRepeatCount = 4;
        this.horizontalRepeatCount = 4;
    }

    final static boolean a(int param0, int param1, boolean param2) {
        if (param2) {
          field_i = (QuickChatCategoryLoader) null;
        }
        return (1024 & param0) != 0 ? true : false;
    }

    final static void closePlayerContextMenu(int param0) {
        if (null != GetLagStandardDeviationOut.field_o &&
          GetLagStandardDeviationOut.field_o.sourceWidget != null) {
          GetLagStandardDeviationOut.field_o.sourceWidget.field_J = false;
        }
        LegacyOpenGlMaterialEffect.field_a = null;
        GetLagStandardDeviationOut.field_o = null;
        if (param0 != 0) {
          TileTextureOperation.clearSharedReferences(75);
        }
    }

    public static void clearSharedReferences(int param0) {
        field_i = null;
        if (param0 != 1) {
          field_i = (QuickChatCategoryLoader) null;
        }
    }

    static {
    }
}
