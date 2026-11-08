/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ArchiveRequest extends DualLinkNode {
    static Sprite[] field_u;
    boolean field_D;
    static UiComponent field_A;
    static LoginProgressHelpers field_C;
    volatile boolean field_v;
    boolean field_B;
    static String[] field_y;
    static String field_t;
    static String field_E;
    static String field_w;
    static String field_z;
    static Archive field_x;

    final static int selectPlayerBadgeKind(int param0, byte param1, int param2) {
        if (param1 != -122) {
          field_u = (Sprite[]) null;
          if (param0 >= 2) {
            return 2;
          }
          if (param2 < 5) {
            return 0;
          }
          return 1;
        }
        if (param0 >= 2) {
          return 2;
        }
        if (param2 < 5) {
          return 0;
        }
        return 1;
    }

    final static void insertLobbyGameInOrder(LobbyGame param0, int param1) {
        LobbyGame var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = TetraLink.field_J;
        try {
          param0.unlink(false);
          var2 = (LobbyGame) (InputDetachHelpers.field_a.first(false));
          while (var2 != null) {
            if (var2.sortsBefore(-24, param0)) {
              var2 = (LobbyGame) (InputDetachHelpers.field_a.next((byte) -70));
              continue;
            }
            break;
          }
          var3 = 107 % ((38 - param1) / 61);
          if (var2 == null) {
            InputDetachHelpers.field_a.addLast(param0, false);
            return;
          }
          MenuScreen.insertNodeBefore(var2, 99, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_11_0 = var2_ref;
          stackIn_11_1 = new StringBuilder().append("ll.H(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final static String readPacketString(int param0) {
        if (param0 != 0) {
          return (String) null;
        }
        return BackgroundSparkle.field_q.readString((byte) 81);
    }

    final static void openLoginProgressWithMessage(int param0, String param1) {
        if (param0 != -3) {
          return;
        }
        try {
          MusicPatch.installTextHuffman(param1, true);
          LoginProgressHelpers.openLoginProgress(WeightedLruCache.field_d, false, false);
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "ll.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    abstract byte[] getBytes(boolean param0);

    abstract int getProgress(boolean param0);

    public static void releaseStatics(byte param0) {
        field_y = null;
        field_u = null;
        field_E = null;
        field_w = null;
        int var1 = 100 / ((param0 - 44) / 57);
        field_C = null;
        field_t = null;
        field_z = null;
        field_x = null;
        field_A = null;
    }

    final static void initializeAudioOutputs(boolean param0, java.awt.Component param1, int param2, PlatformTaskDispatcher param3, MidiPcmStream param4, int param5, byte param6, int param7) {
        try {
          AudioOutput.configure(param7, param0, 10);
          PatchNoteUsage.field_q = AudioOutput.createOutput(param3, param1, 0, param2);
          PacketDiagnosticsHelpers.field_v = AudioOutput.createOutput(param3, param1, 1, param5);
          QuickChatPhraseCache.field_g = new PcmStreamMixer();
          TriangleMesh.field_x = param5 * 1000 / param7;
          PacketDiagnosticsHelpers.field_v.setStream(QuickChatPhraseCache.field_g);
          if (param6 < 126) {
            MidiPcmStream var9 = (MidiPcmStream) null;
            ArchiveRequest.initializeAudioOutputs(true, (java.awt.Component) null, -128, (PlatformTaskDispatcher) null, (MidiPcmStream) null, 27, (byte) -4, -4);
          }
          SharedPanelFactory.field_b = param4;
          SharedPanelFactory.field_b.setMasterVolume((byte) 96, FontAndFrameStyleHelpers.field_a);
          PatchNoteUsage.field_q.setStream(SharedPanelFactory.field_b);
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "ll.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static void configureUiTheme(int param0, Sprite[] param1, BitmapFont param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, Sprite[] param13, int param14, int param15, BitmapFont param16, int param17, int param18, Sprite[] param19, int param20) {
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var21 = null;
        MidiPcmStream var22 = null;
        try {
          DisplayNameForm.configureSharedUiTheme(param12, param18, new NineSliceFrame(param19), param16, param2, true, param20, param9, new NineSliceFrame(param13), new NineSliceFrame(param1), param10, param6, param4, param0, param15, param17, param8, param11, param7, param3, param14);
          if (param5 != -11319) {
            var22 = (MidiPcmStream) null;
            ArchiveRequest.initializeAudioOutputs(false, (java.awt.Component) null, -31, (PlatformTaskDispatcher) null, (MidiPcmStream) null, -116, (byte) 29, 80);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var21 = decompiledCaughtException;
          stackIn_5_0 = var21;
          stackIn_5_1 = new StringBuilder().append("ll.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',');
          if (param13 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param14).append(',').append(param15).append(',');
          if (param16 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param17).append(',').append(param18).append(',');
          if (param19 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param20).append(')').toString());
        }
    }

    ArchiveRequest() {
        this.field_v = true;
    }

    static {
        field_C = new LoginProgressHelpers();
        field_z = "You have <%0> unread messages!";
        field_E = "Average rating";
    }
}
