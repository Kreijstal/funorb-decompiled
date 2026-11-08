/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class CollisionContact {
    static int[] field_m;
    byte field_x;
    static BinaryBitmapFont field_h;
    static String login;
    int field_u;
    static boolean field_k;
    static boolean field_c;
    byte field_i;
    static String progressJungleBulk;
    static String field_o;
    static int[] field_q;
    static String ticketingXunread;
    static String field_v;
    byte field_a;
    static int field_p;
    static String tutorial;
    static String muChatLobbyFriends;
    static SceneNode field_s;
    static QuickChatHelpDialog field_f;
    static int field_t;
    static int[] field_r;
    static String[] field_e;
    byte field_n;
    static String tickerHintAim;
    static int[] field_w;

    final static String a(boolean param0) {
        if (IntegerRecordProtocolSupport.field_e == TabbedPane.field_Lb) {
          return ContextMenu.field_Xb;
        }
        if (param0) {
          CollisionContact.releaseStatics(38);
          if (TimeTrialSelectScreen.field_I == IntegerRecordProtocolSupport.field_e) {
            return ClientUiResourceState.field_c;
          }
          if (TextInputValidator.field_j.isComplete(88)) {
            return SpriteState.field_x;
          }
          return ClientUiResourceState.field_c;
        }
        if (TimeTrialSelectScreen.field_I == IntegerRecordProtocolSupport.field_e) {
          return ClientUiResourceState.field_c;
        }
        if (TextInputValidator.field_j.isComplete(88)) {
          return SpriteState.field_x;
        }
        return ClientUiResourceState.field_c;
    }

    final static boolean a(byte param0, boolean param1) {
        try {
          long dupTemp$1 = 0L;
          IOException var2 = null;
          CipherPacketBuffer var4 = null;
          CipherPacketBuffer var5 = null;
          int stackIn_8_0 = 0;
          Throwable decompiledCaughtException = null;
          if (PacketBuffer.field_u == null) {
            PacketBuffer.field_u = MarkerSliderPainter.field_a.openSocket(UsernameSuggestionsPanel.field_S, TextLineLayout.field_d, 0);
          }
          if (PacketBuffer.field_u.field_f == 0) {
            return false;
          }
          dupTemp$1 = MonotonicClock.monotonicTimeMillis((byte) -95);
          AccountCreationForm.field_Q = dupTemp$1;
          MenuScreen.field_v = dupTemp$1;
          if (PacketBuffer.field_u.field_f != 1) {
            RankingsScreen.field_J = MidiPcmStream.field_V;
          } else {
            try {
              Atan2Support.field_c = new BufferedSocket((java.net.Socket) (PacketBuffer.field_u.field_e), MarkerSliderPainter.field_a);
              var4 = PlayerContextMenu.field_e;
              var5 = var4;
              JaggrabDownloader.field_j.position = 0;
              var5.position = 0;
              stackIn_8_0 = (!param1) ? -1 : -2;
              NodeHashTableIterator.field_e = stackIn_8_0;
              DialRenderer.field_g = stackIn_8_0;
              MenuSelection.field_l = stackIn_8_0;
              RankingsScreen.field_J = Js5Transport.field_h;
              ArrayWidgetGroup.writeClientHandshake(JaggrabDownloader.field_j, true, CanvasInputAttachmentSupport.field_c, LobbyGame.field_uc, LoginEncryptionSupport.field_b);
              DebugTuningSupport.flushClientPackets(-1, 0);
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = (IOException) (Object) decompiledCaughtException;
              RankingsScreen.field_J = MidiPcmStream.field_V;
              if (param0 != 65) {
                return false;
              }
              PacketBuffer.field_u = null;
              return true;
            }
          }
          if (param0 != 65) {
            return false;
          }
          PacketBuffer.field_u = null;
          return true;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void releaseStatics(int param0) {
        field_s = null;
        field_m = null;
        field_v = null;
        ticketingXunread = null;
        field_h = null;
        muChatLobbyFriends = null;
        tickerHintAim = null;
        tutorial = null;
        login = null;
        field_e = null;
        if (param0 == -13265) {
          field_q = null;
          field_f = null;
          field_o = null;
          field_r = null;
          progressJungleBulk = null;
          field_w = null;
          return;
        }
        CollisionContact.a((byte) 89, true);
        field_q = null;
        field_f = null;
        field_o = null;
        field_r = null;
        progressJungleBulk = null;
        field_w = null;
    }

    static {
        field_m = new int[]{0, 0, 0, 65536, 0, 0, 0, 65536, 0, 0, 0, 65536};
        ticketingXunread = "You have <%0> unread messages!";
        progressJungleBulk = "Climbing out of the jungle into the mountains...";
        field_c = false;
        muChatLobbyFriends = "Show lobby chat from my friends";
        tutorial = "Tutorial";
        login = "Log in";
        field_t = 0;
        field_e = new String[255];
        tickerHintAim = "Use <img=5>/<img=6>, or <img=13>/<img=15> to aim the cue.";
    }
}
