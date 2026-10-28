/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class TerrainMap {
    int secondaryTheme;
    int terrainTheme;
    static String field_e;
    int tilesWide;
    int pixelHeight;
    static String field_i;
    int[][] tileMasks;
    int pixelWidth;
    int tilesHigh;

    public static void releaseStatics(int guard) {
        try {
          field_e = null;
          int var1_int = 112 / ((-60 - guard) / 60);
          field_i = null;
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "vc.A(" + guard + ')');
        }
    }

    final static void a(int param0, TrackerMusicDefinition param1, boolean param2, byte param3) {
        try {
          String stackIn_16_2 = null;
          try {
            Object var4 = LevelSelectScreen.field_l;
            synchronized (var4) {
              if (param3 > -61) {
                field_e = (String) null;
              }
              if (DraggableWidget.field_N != null) {
                MembershipAssetSupport.field_c.removeListener((PcmMixerListener) ((Object) DraggableWidget.field_N));
              }
              GrowableIntList.field_b = param0;
              DraggableWidget.field_N = new TrackerMusicPlayer(param1);
              DraggableWidget.field_N.setMasterVolume(GrowableIntList.field_b * MembershipPromotionSupport.field_b / 64);
              DraggableWidget.field_N.setLooping(param2);
              LevelSelectScreen.field_l.flush();
              MembershipAssetSupport.field_c.scheduleListener((PcmMixerListener) ((Object) DraggableWidget.field_N));
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            Throwable decompiledCaughtException = decompiledCaughtParameter0;
            RuntimeException var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            RuntimeException stackIn_15_0 = var4_ref;
            StringBuilder stackIn_15_1 = new StringBuilder().append("vc.B(").append(param0).append(',');
            if (param1 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    TerrainMap(DataInputStream input, int formatVersion) throws IOException {
        String stackIn_30_2 = null;
        int var7 = EscapeVector.obfuscationControl;
        try {
          this.tilesWide = input.readUnsignedByte();
          this.pixelWidth = this.tilesWide << 5;
          this.tilesHigh = input.readUnsignedByte();
          this.pixelHeight = this.tilesHigh << 5;
          this.terrainTheme = input.readUnsignedByte();
          this.secondaryTheme = this.terrainTheme;
          if (formatVersion >= 10) {
            this.secondaryTheme = input.readUnsignedByte();
          }
          this.tileMasks = new int[this.tilesWide * this.tilesHigh][];
          int var3_int = 0;
          scanLoop1: while (true) {
            int stackIn_5_0 = this.tilesWide * this.tilesHigh;
            int stackIn_5_1 = var3_int;
            if (stackIn_5_0 > stackIn_5_1) {
              int var4 = input.readByte();
              if (var7 != 0) {
                return;
              }
              int var5 = 0;
              while (var5 < 4) {
                stackIn_5_0 = ~(var3_int + var5);
                stackIn_5_1 = ~(this.tilesWide * this.tilesHigh);
                if (stackIn_5_0 > stackIn_5_1) {
                  if ((var4 & 3) == 0) {
                    this.tileMasks[var3_int + var5] = null;
                  } else if ((var4 & 3) == 1) {
                    this.tileMasks[var5 + var3_int] = QuickChatPhraseDefinition.fullTileMask;
                  } else {
                    int[] array$0 = new int[32];
                    this.tileMasks[var3_int + var5] = array$0;
                    int[] var6 = array$0;
                    AccountRegistrationPanel.decodeTerrainQuadrants(0, 32, input, 0, 32, var6, 2147483647);
                  }
                  var4 = var4 >>> 2;
                  var5++;
                  continue;
                }
                break;
              }
              var3_int += 4;
              continue scanLoop1;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException var3 = decompiledCaughtParameter0;
          RuntimeException stackIn_29_0 = var3;
          StringBuilder stackIn_29_1 = new StringBuilder().append("vc.<init>(");
          if (input == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(formatVersion).append(')').toString());
        }
    }

    static {
        field_i = "Reload game";
        field_e = "Passwords must be between 5 and 20 characters long";
    }
}
