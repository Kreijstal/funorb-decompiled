/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ServerConnectionHelpers {
    static UiComponent field_a;
    static UiComponent field_b;

    final static int pollServerConnection(int param0) {
        try {
          int stackIn_13_0 = 0;
          int stackIn_27_0 = 0;
          int stackIn_30_0 = 0;
          int stackIn_35_0 = 0;
          Throwable decompiledCaughtException = null;
          int var1_int = 0;
          IOException var1 = null;
          PacketBuffer var2 = null;
          if (4 <= Renderable.field_e.field_h) {
            if (-1 == Renderable.field_e.field_d) {
              return 3;
            }
            if (-2 == Renderable.field_e.field_d) {
              return 4;
            }
            return 1;
          }
          try {
            if (LobbyOverlayHelpers.field_b == 0) {
              EmailAvailabilityValidator.field_x = LoadingProgressDialog.field_ab.requestSocket(SocialListEntry.field_Nb, TwoColumnListPanel.field_Lb, (byte) 107);
              LobbyOverlayHelpers.field_b = LobbyOverlayHelpers.field_b + 1;
            }
            if (LobbyOverlayHelpers.field_b == 1) {
              if (EmailAvailabilityValidator.field_x.field_d == 2) {
                stackIn_13_0 = ScreenDrawHelpers.handleConnectionFailure(-1, true);
                return stackIn_13_0;
              }
              if (EmailAvailabilityValidator.field_x.field_d == 1) {
                LobbyOverlayHelpers.field_b = LobbyOverlayHelpers.field_b + 1;
              }
            }
            if (LobbyOverlayHelpers.field_b == 2) {
              WhirlpoolHasher.field_g = new BufferedSocket((java.net.Socket) (EmailAvailabilityValidator.field_x.field_f), LoadingProgressDialog.field_ab);
              var2 = new PacketBuffer(13);
              IntrusiveDeque.writeSessionHeader(-94, LruTextureCache.field_l, var2, IntrusiveDeque.field_f, ModelMergeHelpers.field_g);
              var2.writeByte(15, false);
              var2.writeInt(GraphicsSettings.field_f, (byte) -124);
              WhirlpoolHasher.field_g.write(true, 13, var2.payload, 0);
              LobbyOverlayHelpers.field_b = LobbyOverlayHelpers.field_b + 1;
              NumericDateInputWidget.field_T = ClockAndTextHelpers.monotonicMillis(0) + 30000L;
            }
            if (param0 >= -76) {
              ServerConnectionHelpers.pollServerConnection(-79);
            }
            if (LobbyOverlayHelpers.field_b == 3) {
              if (WhirlpoolHasher.field_g.available(0) > 0) {
                var1_int = WhirlpoolHasher.field_g.readByte(3);
                if (var1_int != 0) {
                  stackIn_30_0 = ScreenDrawHelpers.handleConnectionFailure(var1_int, true);
                  return stackIn_30_0;
                }
                LobbyOverlayHelpers.field_b = LobbyOverlayHelpers.field_b + 1;
              } else {
                if (ClockAndTextHelpers.monotonicMillis(0) > NumericDateInputWidget.field_T) {
                  stackIn_27_0 = ScreenDrawHelpers.handleConnectionFailure(-2, true);
                  return stackIn_27_0;
                }
              }
            }
            if (4 != LobbyOverlayHelpers.field_b) {
              return -1;
            }
            Renderable.field_e.setConnection(WhirlpoolHasher.field_g, TextFieldValidator.field_o, (byte) -122);
            WhirlpoolHasher.field_g = null;
            LobbyOverlayHelpers.field_b = 0;
            EmailAvailabilityValidator.field_x = null;
            stackIn_35_0 = 0;
            return stackIn_35_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (IOException) (Object) decompiledCaughtException;
            return ScreenDrawHelpers.handleConnectionFailure(-3, true);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void releaseStatics(int param0) {
        field_a = null;
        if (param0 != -2) {
          ServerConnectionHelpers.releaseStatics(34);
          field_b = null;
          return;
        }
        field_b = null;
    }

    final static int measureText(boolean param0, int param1, String param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 1) {
            stackIn_2_0 = -59;
            return stackIn_2_0;
          }
          if (param0) {
            stackIn_7_0 = IndexedSpriteState.field_a.textWidth(param2);
            return stackIn_7_0;
          }
          stackIn_5_0 = PointerTrailBubble.field_u.textWidth(param2);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("tn.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    static {
    }
}
