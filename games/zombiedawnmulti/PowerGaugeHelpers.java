/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class PowerGaugeHelpers {
    static ValidationState field_b;
    static IndexedSprite field_c;
    static int field_a;
    static int field_f;
    static PcmSampleStream field_d;
    static IndexedSprite field_e;

    public static void releaseStatics(int param0) {
        if (param0 != 8) {
          return;
        }
        field_b = null;
        field_e = null;
        field_c = null;
        field_d = null;
    }

    final static void drawPowerGauge(int param0, int param1, byte param2, int param3, int param4, int param5) {
        LightningBolt var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var6 = 21 * param3 / param0;
        field_c.drawAlpha(param5 - 7, -14 + param1, param4);
        if (null == MoveOrderMarker.field_h) {
          MoveOrderMarker.field_h = new Sprite(8, 21);
          RasterEffectHelpers.pushSpriteTarget(MoveOrderMarker.field_h);
          SoftwareRasterizer.fillRectGradient(0, 0, 8, 10, 65280, 16776960);
          SoftwareRasterizer.fillRectGradient(0, 10, 8, 11, 16776960, 16711680);
          RasterEffectHelpers.popRaster();
        }
        MoveOrderMarker.field_h.drawBlended(param5, param1, param4);
        if (param2 != 2) {
          return;
        }
        SoftwareRasterizer.fillRectAlpha(param5, param1, 8, 21 - var6, 0, param4);
        Random var7 = new Random();
        if (param3 >= param0 &&
          RandomHelpers.nextBoundedInt((byte) 11, var7, 7) == 0) {
          var8 = new LightningBolt(3 + param5, param1 - 12, 5, 0.0, 8.0, 1.5, 1, 1.5, 0.99, 1);
          var8.field_k = param1 * 79 + 13 * param5 + PowerupEvent.field_m;
          var9 = 200;
          var10 = var9 * 128;
          var11 = var9 * 64;
          var11 = var11 >> 8;
          var12 = var9 * 255;
          var10 = var10 >> 8;
          var10 = var10 << 16;
          var12 = var12 >> 8;
          var11 = var11 << 8;
          var8.draw(var12 | (var10 | var11), 3 + param5, true, -12 + param1, 16777215, -1963);
        }
    }

    final static void writeMachineId(PacketBuffer param0, int param1) {
        try {
          int var4 = 0;
          byte[] var2 = null;
          int var3_int = 0;
          int var5 = 0;
          byte[] var6 = null;
          RuntimeException stackIn_22_0 = null;
          StringBuilder stackIn_22_1 = null;
          String stackIn_23_2 = null;
          int decompiledRegionSelector0 = 0;
          Throwable decompiledCaughtException = null;
          RuntimeException var2_ref = null;
          Exception var3 = null;
          var5 = ZombieDawnMulti.field_E ? 1 : 0;
          try {
            var6 = new byte[24];
            var2 = var6;
            if (param1 != 13746) {
              return;
            }
            if (null != DialWidgetPainter.field_e) {
              try {
                DialWidgetPainter.field_e.seek(0L, (byte) -70);
                DialWidgetPainter.field_e.readFully(var6, (byte) -50);
                for (var3_int = 0; var3_int < 24; var3_int++) {
                  if (0 == var6[var3_int]) {
                    continue;
                  }
                  break;
                }
                if (var3_int >= 24) {
                  throw new IOException();
                }
                param0.writeBytes(var2, 24, 0, 120);
                decompiledRegionSelector0 = 0;
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var3 = (Exception) (Object) decompiledCaughtException;
                for (var4 = 0; var4 < 24; var4++) {
                  var2[var4] = (byte)-1;
                }
                decompiledRegionSelector0 = 1;
              }
              if (decompiledRegionSelector0 == 0) {
                return;
              }
            }
            param0.writeBytes(var2, 24, 0, 120);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_22_0 = var2_ref;
            stackIn_22_1 = new StringBuilder().append("jq.D(");
            if (param0 == null) {
              stackIn_23_2 = "null";
            } else {
              stackIn_23_2 = "{...}";
            }
            throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void buildChatPanel(boolean param0, byte param1) {
        BirthDateInputWidget.field_U = !param0 ? new TabbedOverlayPanel(RasterBuffer.field_d, CipherPacketBuffer.field_r) : new TabbedOverlayPanel(WidgetStyleLayer.field_n, UiTheme.field_i);
        JaggrabDownloader.field_i = new UiComponent(0L, (UiComponent) null);
        JaggrabDownloader.field_i.addChild((byte) 50, BirthDateInputWidget.field_U.field_c);
        int var2 = 81 % ((65 - param1) / 60);
        JaggrabDownloader.field_i.addChild((byte) 50, ChatPromptHelpers.field_b);
        TextPopupHelpers.field_b = new UiComponent(0L, MarkerSliderPainter.field_a);
        LobbyUiSetupHelpers.field_c = new UiComponent(0L, (UiComponent) null);
        TextPopupHelpers.field_b.addChild((byte) 50, AchievementsScreen.field_l);
        TextPopupHelpers.field_b.addChild((byte) 50, LobbyUiSetupHelpers.field_c);
        LobbyUiSetupHelpers.field_c.addChild((byte) 50, FramePainter.field_b);
        LobbyUiSetupHelpers.field_c.addChild((byte) 50, ViewFactoryHelpers.field_a);
        LevelFileList.layoutLobbyComponents(param0, -72);
    }

    static {
        field_b = new ValidationState();
        field_f = 0;
        field_d = null;
    }
}
