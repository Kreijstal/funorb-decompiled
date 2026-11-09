/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ChatMessage {
    int messageIdHigh;
    int messageIdLow;
    private long senderId;
    private String senderName;
    static String instructionsText;
    private boolean highPriority;
    int type;
    int[] quickChatResponses;
    private int senderRank;
    String text;

    final static void sleepIgnoringInterrupt(long millis, byte guard) {
        try {
          Throwable decompiledCaughtException = null;
          InterruptedException var3 = null;
          try {
            Thread.sleep(millis);
            if (guard != -21) {
              ChatMessage.sleepIgnoringInterrupt(-109L, (byte) 47);
              return;
            }
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (InterruptedException) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int loginReplyHeaderLength(int guard) {
        if (guard > -3) {
          ChatMessage.releaseStatics(101);
          return 1;
        }
        return 1;
    }

    final int retentionPriority(int guard) {
        if (this.highPriority) {
          return 2;
        }
        if (2 == this.type) {
          if (this.senderRank > 0) {
            return 2;
          }
          if (guard >= -79) {
            return -19;
          }
          if (this.senderId == OpenGlShader.field_d) {
            return 1;
          }
          if (LegacyOpenGlPbuffer.field_s != 2) {
            return 0;
          }
          if (StatusMessagePanel.isFriend(false, this.senderName)) {
            return 1;
          }
          return 0;
        }
        if (guard >= -79) {
          return -19;
        }
        if (this.senderId == OpenGlShader.field_d) {
          return 1;
        }
        if (LegacyOpenGlPbuffer.field_s != 2) {
          return 0;
        }
        if (StatusMessagePanel.isFriend(false, this.senderName)) {
          return 1;
        }
        return 0;
    }

    public static void releaseStatics(int param0) {
        if (param0 != 23050) {
          return;
        }
        instructionsText = null;
    }

    ChatMessage(boolean includeQuickChatResponses) {
        this.messageIdLow = CacheReferenceNode.field_w;
        this.highPriority = QuickChatPhraseProvider.field_a;
        this.senderRank = DroneProximitySupport.field_a;
        this.senderId = ReassignUpgradesScreen.field_j;
        this.messageIdHigh = MenuFadeState.chatMessageIdHigh;
        this.type = UsernameCredentials.field_h;
        this.text = oi.field_c;
        this.senderName = MarkerTrackWidget.field_E;
        if (!includeQuickChatResponses) {
          this.quickChatResponses = null;
        } else {
          this.quickChatResponses = EmptyWidgetRenderer.field_c;
        }
    }

    static {
        instructionsText = "INSTRUCTIONS";
    }
}
