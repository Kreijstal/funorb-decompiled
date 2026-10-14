/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArchiveNetworkRequest extends ResourceRequest {
    static byte[][] field_L;
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
          vg.requestLeaveOrDeclineGame(o.currentLobbyGame.getGameId((byte) 31), false, 11);
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

    final static void a(String param0, int param1, java.applet.Applet param2) {
        try {
          String var3 = null;
          String var4 = null;
          String var5 = null;
          RuntimeException stackIn_13_0 = null;
          StringBuilder stackIn_13_1 = null;
          String stackIn_14_2 = null;
          StringBuilder stackIn_16_1 = null;
          String stackIn_17_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3_ref = null;
          RuntimeException var3_ref2 = null;
          try {
            OpacityWidget.field_G = param0;
            try {
              var3 = param2.getParameter("cookieprefix");
              var4 = param2.getParameter("cookiehost");
              if (param1 <= 44) {
                return;
              }
              var5 = var3 + "session=" + param0 + "; version=1; path=/; domain=" + var4;
              if (param0.length() == 0) {
                var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
              }
              ne.a(param2, "document.cookie=\"" + var5 + "\"", 5797);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = decompiledCaughtException;
            }
            VolcanicBackground.a(false, param2);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_13_0 = var3_ref2;
            stackIn_13_1 = new StringBuilder().append("da.A(");
            if (param0 == null) {
              stackIn_14_2 = "null";
            } else {
              stackIn_14_2 = "{...}";
            }
            stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void e(byte param0) {
        projectedVertexX = null;
        field_J = null;
        field_C = null;
        int var1 = -85 / ((4 - param0) / 55);
        field_H = null;
        packSelectorIcons = null;
        field_L = (byte[][]) null;
    }

    final static String d(byte param0) {
        if (!(2 <= GameConnectionShell.clientStage)) {
          return kd.field_c;
        }
        if (null != wl.field_K) {
          if (!wl.field_K.ensureIndex((byte) -127)) {
            return wn.field_a;
          }
          return FocusableWidget.field_C;
        }
        if (param0 != 103) {
          return (String) null;
        }
        if (!LabeledWidget.field_P.ensureIndex((byte) -127)) {
          return tm.field_e;
        }
        if (!LabeledWidget.field_P.ensureGroupAvailableByName("commonui", -28138)) {
          return WidgetGroup.field_F + " - " + LabeledWidget.field_P.getGroupProgressByName(0, "commonui") + "%";
        }
        if (!RadialSelectorWidget.field_S.ensureIndex((byte) -127)) {
          return RadialSelectorWidget.field_P;
        }
        if (!RadialSelectorWidget.field_S.ensureGroupAvailableByName("commonui", -28138)) {
          return m.field_k + " - " + RadialSelectorWidget.field_S.getGroupProgressByName(0, "commonui") + "%";
        }
        if (!ja.field_c.ensureIndex((byte) -127)) {
          return IntHistoryBuffer.field_k;
        }
        if (!ja.field_c.ensureAllGroupsAvailable(param0 ^ 12)) {
          return qm.field_e + " - " + ja.field_c.getProgress(-4126) + "%";
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
        field_L = new byte[250][];
        projectedVertexX = new int[8192];
        field_H = "Enter multiplayer lobby";
        field_J = "No highscores";
    }
}
