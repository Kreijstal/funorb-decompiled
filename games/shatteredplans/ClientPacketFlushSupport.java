/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class ClientPacketFlushSupport {
    static String field_c;
    static SocialListPanel field_a;
    static Sprite[] field_b;
    static Star field_d;

    final static boolean socialEntryRanksAfter(SocialListEntry param0, SocialListEntry param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        Random var5 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var3_int = param1.field_zb - param0.field_zb;
          if (param2 != -81) {
            var5 = (Random) null;
            ClientPacketFlushSupport.randomInclusive((byte) -70, 114, 120, (Random) null);
          }
          if (QuickChatCategoryRegistry.field_d == param1.field_xb) {
            var3_int -= 200;
          } else {
            if (null == param1.field_xb) {
              var3_int += 200;
            }
          }
          if (param0.field_xb == QuickChatCategoryRegistry.field_d) {
            var3_int += 200;
          } else {
            if (param0.field_xb == null) {
              var3_int -= 200;
            }
          }
          return !(var3_int <= 0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("d.C(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void clearStatics(int param0) {
        field_d = null;
        field_b = null;
        field_a = null;
        field_c = null;
        if (param0 != -28065) {
          SocialListEntry var2 = (SocialListEntry) null;
          ClientPacketFlushSupport.socialEntryRanksAfter((SocialListEntry) null, (SocialListEntry) null, (byte) -8);
        }
    }

    final static void flushOutboundPackets(int param0, byte param1) {
        try {
          IOException iOException = null;
          Throwable decompiledCaughtException = null;
          if (ClientLobbyResources.field_f != null && (param0 < 0 ||
            AccountNoticeKind.field_f == Wormhole.field_j)) {
            if (param1 != 82) {
              return;
            }
            if (LobbyOptionSupport.field_f.position == 0 &&
              (LobbyPlayerEntry.field_Pb + 10000L) < ClientClockSupport.currentTimeMillis(param1 + 14192)) {
              LobbyOptionSupport.field_f.writeOpcode(param0, param1 ^ 173);
            }
            if (LobbyOptionSupport.field_f.position > 0) {
              try {
                ClientLobbyResources.field_f.write(LobbyOptionSupport.field_f.position, 0, LobbyOptionSupport.field_f.payload, param1 ^ -14022);
                LobbyPlayerEntry.field_Pb = ClientClockSupport.currentTimeMillis(14274);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                iOException = (IOException) (Object) decompiledCaughtException;
                TabbedPanel.closeClientSocket(-119);
              }
              LobbyOptionSupport.field_f.position = 0;
            }
            return;
          }
          LobbyOptionSupport.field_f.position = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int randomInclusive(byte param0, int param1, int param2, Random param3) {
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -12) {
            ClientPacketFlushSupport.clearStatics(-116);
          }
          stackIn_3_0 = param1 + TaskAi.randomBelow(1 - param1 + param2, param3, -11);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("d.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
        field_c = "<%0> fleets remaining.";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void flushOutboundPacketsFullInts(int param0, int param1) {
        try {
          IOException iOException = null;
          Throwable decompiledCaughtException = null;
          if (ClientLobbyResources.field_f != null && (param0 < 0 ||
            AccountNoticeKind.field_f == Wormhole.field_j)) {
            if (param1 != 82) {
              return;
            }
            if (LobbyOptionSupport.field_f.position == 0 &&
              (LobbyPlayerEntry.field_Pb + 10000L) < ClientClockSupport.currentTimeMillis(param1 + 14192)) {
              LobbyOptionSupport.field_f.writeOpcode(param0, param1 ^ 173);
            }
            if (LobbyOptionSupport.field_f.position > 0) {
              try {
                ClientLobbyResources.field_f.write(LobbyOptionSupport.field_f.position, 0, LobbyOptionSupport.field_f.payload, param1 ^ -14022);
                LobbyPlayerEntry.field_Pb = ClientClockSupport.currentTimeMillis(14274);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                iOException = (IOException) (Object) decompiledCaughtException;
                TabbedPanel.closeClientSocket(-119);
              }
              LobbyOptionSupport.field_f.position = 0;
            }
            return;
          }
          LobbyOptionSupport.field_f.position = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }
}
