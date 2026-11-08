/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class GzipDecoder {
    private java.util.zip.Inflater inflater;
    static ViewportController field_c;
    static String field_b;

    final static void centreMessageMenu(int param0) {
        int var3 = 0;
        String stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        boolean stackIn_13_2 = false;
        NineSliceFrame stackIn_18_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        NineSliceFrame var9 = null;
        int var10 = 0;
        var10 = Pixelate.field_H ? 1 : 0;
        try {
          var1_int = LinkButtonPainter.field_e - PatchNoteUsage.field_o;
          PatchNoteUsage.field_o = -(var1_int >> 1) + LegacyMenuBuilder.field_d;
          LinkButtonPainter.field_e = var1_int + PatchNoteUsage.field_o;
          if (param0 < 16) {
            field_b = (String) null;
          }
          ChatChannelGlobals.field_c = -(LoginFormGlobals.field_c >> 1) + MusicPlaybackHelpers.field_b;
          var2 = ChatChannelGlobals.field_c;
          for (var3 = 0; var3 < AccountRegistrationPanel.field_J.length; var3++) {
            var4 = ProxyAuthenticationException.field_e[var3];
            if (var4 < 0) {
              var5 = PlayerBoard.field_n;
            } else {
              if (var4 == VerticalScrollbar.field_Gb.selectedIndex) {
                var5 = ScoreMarkerDemo.field_k;
              } else {
                var5 = QuickChatOpenHelpers.field_a;
              }
            }
            var6 = AccountRegistrationPanel.field_J[var3];
            stackIn_12_0 = var6;
            stackIn_12_1 = 8192;
            stackIn_13_2 = !(var4 < 0);
            var7 = ArchiveProvider.measureMessageText(stackIn_12_0, stackIn_12_1, stackIn_13_2);
            var8 = LegacyMenuBuilder.field_d - (var7 >> 1);
            if (var4 >= 0) {
              if (VerticalScrollbar.field_Gb.selectedIndex != var4) {
                stackIn_18_0 = BufferedRandomAccessFile.field_m;
              } else {
                stackIn_18_0 = Matrix3.field_d;
              }
              var9 = stackIn_18_0;
              var2 = var2 + KiteTailSegment.field_e;
              if (var9 != null) {
                var9.draw(var2, NineSliceFrameHelpers.field_d + (WidgetStyleLayer.field_b << 1), -1, (ProxyAuthenticationException.field_a << 1) + var7, var8 - ProxyAuthenticationException.field_a);
              }
              var2 = var2 + WidgetStyleLayer.field_b;
            }
            if (var4 >= 0) {
              SingleChildContainer.field_G.drawText(var6, var8, var2 + StatefulTextPainter.field_q, var5, -1);
              var2 = var2 + (NineSliceFrameHelpers.field_d + WidgetStyleLayer.field_b + KiteTailSegment.field_e);
            } else {
              DualLinkNode.field_o.drawText(var6, var8, ResultCaptionGlobals.field_b + var2, var5, -1);
              var2 = var2 + BouncedownBackground.field_m;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ChatMessage.addExceptionContext((Throwable) ((Object) var1), "vh.B(" + param0 + ')');
        }
    }

    final void decompress(int param0, byte[] param1, PacketBuffer param2) {
        try {
          try {
            if (31 != param2.payload[param2.position] ||
              param2.payload[param2.position + 1] != -117) {
              throw new RuntimeException("");
            }
            if (null == this.inflater) {
              this.inflater = new java.util.zip.Inflater(true);
            }
            try {
              this.inflater.setInput(param2.payload, param2.position + 10, param0 - param2.position - (10 - param2.payload.length));
              this.inflater.inflate(param1);
            } catch (Exception exception) {
              this.inflater.reset();
              throw new RuntimeException("");
            }
            this.inflater.reset();
          } catch (RuntimeException runtimeException) {
            throw ChatMessage.addExceptionContext((Throwable) ((Object) runtimeException), "vh.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 != -8) {
          GzipDecoder.centreMessageMenu(-33);
        }
        field_b = null;
        field_c = null;
    }

    private GzipDecoder(int param0, int param1, int param2) {
    }

    public GzipDecoder() {
        this(-1, 1000000, 1000000);
    }

    static {
        field_c = null;
        field_b = "Acid Sunset";
    }
}
