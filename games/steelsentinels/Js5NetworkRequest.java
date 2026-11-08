/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Js5NetworkRequest extends ArchiveRequest {
    static SceneWidget field_L;
    static int field_O;
    int field_I;
    byte field_K;
    static int field_M;
    static long field_P;
    static int field_H;
    static RgbSprite[] field_J;
    static SceneWidget field_N;
    PacketBuffer field_G;

    final static void openLobbyGameContextMenu(String param0, boolean param1, LobbyGame param2, int param3) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        PlayerContextMenu var7 = null;
        String var8 = null;
        PlayerContextMenu var9 = null;
        String var10 = null;
        PlayerContextMenu var11 = null;
        String var12 = null;
        PlayerContextMenu var13 = null;
        try {
          TextAndMenuHelpers.openPlayerContextMenu(param2, param2.getGameId(-13), -1, (int[]) null, (String) null, (String) null, 1073741824, 0L, PendingAckRequest.field_y);
          if (param2.field_rc && (param2.field_sc == 2 ||
            !(NodeDeque.field_d < 2))) {
            var7 = AudioService.field_i;
            var8 = SocketConnector.formatTemplate(ArchiveLoadStep.field_o, -71, new String[]{param0});
            var7.field_j.addItem(2, 10, var8);
          }
          AudioService.field_i.addLobbyGameActions((byte) 64);
          if (param1) {
            if (MusicPatchEnvelope.field_j != AudioService.field_i.field_g) {
              var11 = AudioService.field_i;
              var12 = SocketConnector.formatTemplate(MusicPatchPcmStream.field_u, -39, new String[]{param0});
              var11.field_j.addItem(2, 15, var12);
            } else {
              var9 = AudioService.field_i;
              var10 = SocketConnector.formatTemplate(TextFieldValidator.field_m, -88, new String[]{param0});
              var9.field_j.addItem(2, 16, var10);
            }
          }
          var13 = AudioService.field_i;
          var5 = TextButton.field_S;
          if (param3 <= 78) {
            field_J = (RgbSprite[]) null;
          }
          var6 = BufferedRandomAccessFile.field_j;
          var13.field_j.layoutItems(0, 0, var6, (byte) -119, var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("qa.G(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 == 10) {
          field_J = null;
          field_N = null;
          field_L = null;
          return;
        }
        field_H = -1;
        field_J = null;
        field_N = null;
        field_L = null;
    }

    final byte[] getData(byte param0) {
        if (this.field_z) {
          throw new RuntimeException();
        }
        if (this.field_G.payload.length - this.field_K > this.field_G.position) {
          throw new RuntimeException();
        }
        if (param0 < -49) {
          return this.field_G.payload;
        }
        field_M = -48;
        return this.field_G.payload;
    }

    final static String formatMinutesSeconds(int param0, int param1) {
        int var2 = 0;
        if (param0 == -1) {
          var2 = param1 / 60;
          param1 = param1 % 60;
          return SocketConnector.formatTemplate(AlphaContainer.field_S, -36, new String[]{Integer.toString(var2), Integer.toString(param1 / 10), Integer.toString(param1 % 10)});
        }
        return (String) null;
    }

    Js5NetworkRequest() {
    }

    final int getProgress(int param0) {
        if (param0 != 16) {
          LobbyGame var3 = (LobbyGame) null;
          Js5NetworkRequest.openLobbyGameContextMenu((String) null, false, (LobbyGame) null, 114);
          if (this.field_G != null) {
            return this.field_G.position * 100 / (-this.field_K + this.field_G.payload.length);
          }
          return 0;
        }
        if (this.field_G != null) {
          return this.field_G.position * 100 / (-this.field_K + this.field_G.payload.length);
        }
        return 0;
    }

    final static void drawDimmedOverlay(byte param0, boolean param1) {
        if (param0 >= -54) {
          Js5NetworkRequest.drawDimmedOverlay(43, true);
          ArchiveProvider.clearOrDimScreen(true, (byte) 67, param1);
          return;
        }
        ArchiveProvider.clearOrDimScreen(true, (byte) 67, param1);
    }

    final static void setHeaderIconSprite(RgbSprite param0, byte param1) {
        try {
          LoginCredentialHelpers.field_i = param0;
          if (param1 != 69) {
            RgbSprite var3 = (RgbSprite) null;
            Js5NetworkRequest.setHeaderIconSprite((RgbSprite) null, (byte) -94);
          }
        } catch (RuntimeException runtimeException) {
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) runtimeException), "qa.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_P = 0L;
        field_M = 62;
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void drawDimmedOverlay(int param0, boolean param1) {
        if (param0 >= -54) {
          Js5NetworkRequest.drawDimmedOverlay(43, true);
          ArchiveProvider.clearOrDimScreen(true, (byte) 67, param1);
          return;
        }
        ArchiveProvider.clearOrDimScreen(true, (byte) 67, param1);
    }
}
