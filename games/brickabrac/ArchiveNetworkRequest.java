/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArchiveNetworkRequest extends ResourceRequest {
    static byte[][] bytePool5000;
    PacketBuffer packet;
    static int field_G;
    static RgbSprite[] packSelectorIcons;
    static int[] field_C;
    static int[] projectedVertexX;
    int blockPosition;
    byte trailerBytes;
    static String field_H;
    static String field_J;

    final byte[] getData(byte obfuscationGuard) {
        int var2 = -99 % ((4 - obfuscationGuard) / 52);
        if (this.pending) {
          throw new RuntimeException();
        }
        if (this.packet.position >= this.packet.data.length - this.trailerBytes) {
          return this.packet.data;
        }
        throw new RuntimeException();
    }

    final static void f(byte param0) {
        if (!IntArrayRequest.gameplayScreen.isSpectator(95)) {
          GameTransportActions.requestLeaveOrDeclineGame(ClientResourceHelpers.currentLobbyGame.getGameId((byte) 31), false, 11);
          ed.field_d = true;
          if (param0 != 122) {
            packSelectorIcons = (RgbSprite[]) null;
            return;
          }
          return;
        }
        DraggableWidget.requestSpectateGame(0, -108, 11);
        if (param0 != 122) {
          packSelectorIcons = (RgbSprite[]) null;
          return;
        }
    }

    final static void setSessionCookie(String sessionValue, int obfuscationGuard, java.applet.Applet applet) {
        try {
          String cookiePrefix = null;
          String cookieHost = null;
          String cookieAttributes = null;
          RuntimeException failureContext = null;
          StringBuilder contextBuilder = null;
          String sessionSummary = null;
          StringBuilder appletContextBuilder = null;
          String appletSummary = null;
          Throwable caughtFailure = null;
          Throwable ignoredBrowserFailure = null;
          RuntimeException sessionFailure = null;
          try {
            OpacityWidget.clientSession = sessionValue;
            try {
              cookiePrefix = applet.getParameter("cookieprefix");
              cookieHost = applet.getParameter("cookiehost");
              if (obfuscationGuard <= 44) {
                return;
              }
              cookieAttributes = cookiePrefix + "session=" + sessionValue + "; version=1; path=/; domain=" + cookieHost;
              if (sessionValue.length() == 0) {
                cookieAttributes = cookieAttributes + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
              }
              AppletJavaScriptBridge.evaluateScript(applet, "document.cookie=\"" + cookieAttributes + "\"", 5797);
            } catch (java.lang.Throwable caughtBrowserFailure) {
              caughtFailure = caughtBrowserFailure;
              ignoredBrowserFailure = caughtFailure;
            }
            VolcanicBackground.refreshAppletLinks(false, applet);
            return;
          } catch (java.lang.RuntimeException caughtSessionFailure) {
            caughtFailure = caughtSessionFailure;
            sessionFailure = (RuntimeException) (Object) caughtFailure;
            failureContext = sessionFailure;
            contextBuilder = new StringBuilder().append("da.A(");
            if (sessionValue == null) {
              sessionSummary = "null";
            } else {
              sessionSummary = "{...}";
            }
            appletContextBuilder = ((StringBuilder) (Object) contextBuilder).append(sessionSummary).append(',').append(obfuscationGuard).append(',');
            if (applet == null) {
              appletSummary = "null";
            } else {
              appletSummary = "{...}";
            }
            throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) appletContextBuilder).append(appletSummary).append(')').toString());
          }
        } catch (RuntimeException | Error uncheckedFailure) {
          throw uncheckedFailure;
        } catch (Throwable checkedFailure) {
          throw new RuntimeException(checkedFailure);
        }
    }

    public static void e(byte param0) {
        projectedVertexX = null;
        field_J = null;
        field_C = null;
        int var1 = -85 / ((4 - param0) / 55);
        field_H = null;
        packSelectorIcons = null;
        bytePool5000 = (byte[][]) null;
    }

    final static String d(byte param0) {
        if (!(2 <= GameConnectionShell.clientStage)) {
          return kd.field_c;
        }
        if (null != ValidationIconWidget.field_K) {
          if (!ValidationIconWidget.field_K.ensureIndex((byte) -127)) {
            return FriendListUi.field_a;
          }
          return FocusableWidget.field_C;
        }
        if (param0 != 103) {
          return (String) null;
        }
        if (!LabeledWidget.field_P.ensureIndex((byte) -127)) {
          return OutgoingPacketHelpers.field_e;
        }
        if (!LabeledWidget.field_P.ensureGroupAvailableByName("commonui", -28138)) {
          return WidgetGroup.field_F + " - " + LabeledWidget.field_P.getGroupProgressByName(0, "commonui") + "%";
        }
        if (!RadialSelectorWidget.field_S.ensureIndex((byte) -127)) {
          return RadialSelectorWidget.field_P;
        }
        if (!RadialSelectorWidget.field_S.ensureGroupAvailableByName("commonui", -28138)) {
          return ConditionalTextValue.field_k + " - " + RadialSelectorWidget.field_S.getGroupProgressByName(0, "commonui") + "%";
        }
        if (!BoardPresentationHelpers.field_c.ensureIndex((byte) -127)) {
          return IntHistoryBuffer.field_k;
        }
        if (!BoardPresentationHelpers.field_c.ensureAllGroupsAvailable(param0 ^ 12)) {
          return BrowserResizeNotificationHelpers.field_e + " - " + BoardPresentationHelpers.field_c.getProgress(-4126) + "%";
        }
        return kd.field_a;
    }

    ArchiveNetworkRequest() {
    }

    final int getProgress(int obfuscationGuard) {
        if (obfuscationGuard != -21546) {
          this.getData((byte) 12);
          if (null == this.packet) {
            return 0;
          }
          return this.packet.position * 100 / (-this.trailerBytes + this.packet.data.length);
        }
        if (null == this.packet) {
          return 0;
        }
        return this.packet.position * 100 / (-this.trailerBytes + this.packet.data.length);
    }

    static {
        bytePool5000 = new byte[250][];
        projectedVertexX = new int[8192];
        field_H = "Enter multiplayer lobby";
        field_J = "No highscores";
    }
}
