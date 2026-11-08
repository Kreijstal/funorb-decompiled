/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ThreeCommand extends ConsoleCommand {
    static int field_D;
    static String field_B;
    static String field_C;
    static int[] field_A;

    final ConsoleValue execute(byte param0, ConsoleValue[] param1) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 84) {
            field_B = (String) null;
          }
          stackIn_3_0 = new ConsoleValue(ConsoleArgumentSupport.constantThree(true));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ir.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1) {
        if (WeightedLruCache.a(false)) {
          param0 = false;
        }
        if (param1 != 16355) {
          ThreeCommand.a(false, 111);
          NamedValueContainer.a(63, param0);
          if (SelectionMarkerSupport.field_b) {
            SoftwareRasterizer.darkenRectangle(HighScoreQuery.field_l.tabs.field_s, HighScoreQuery.field_l.tabs.field_J, HighScoreQuery.field_l.tabs.field_q, HighScoreQuery.field_l.tabs.field_mb);
            HighScoreQuery.field_l.tabs.draw(122, param0);
            PasswordLoginCredentials.a(param0, (byte) -93);
            return;
          }
          PasswordLoginCredentials.a(param0, (byte) -93);
          return;
        }
        NamedValueContainer.a(63, param0);
        if (!SelectionMarkerSupport.field_b) {
          PasswordLoginCredentials.a(param0, (byte) -93);
          return;
        }
        SoftwareRasterizer.darkenRectangle(HighScoreQuery.field_l.tabs.field_s, HighScoreQuery.field_l.tabs.field_J, HighScoreQuery.field_l.tabs.field_q, HighScoreQuery.field_l.tabs.field_mb);
        HighScoreQuery.field_l.tabs.draw(122, param0);
        PasswordLoginCredentials.a(param0, (byte) -93);
    }

    public static void a(boolean param0) {
        field_A = null;
        field_C = null;
        field_B = null;
        if (param0) {
          ThreeCommand.a(false, -68);
        }
    }

    ThreeCommand(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(float param0, int param1, float param2, float param3, float param4, float param5, float param6) {
        if (ServerMessageScreen.field_D == null) {
          TextFieldNode.field_Bb = new PcmStreamMixer();
          ServerMessageScreen.field_D = new ReverbPcmStream(TextFieldNode.field_Bb);
          PlayerMeshFactory.field_b.addSubStream(ServerMessageScreen.field_D);
          IndexedSpriteState.field_c = new IntrusiveDeque();
        } else {
          if (null == TextFieldNode.field_Bb) {
            TextFieldNode.field_Bb = new PcmStreamMixer();
            ServerMessageScreen.field_D = new ReverbPcmStream(TextFieldNode.field_Bb);
            PlayerMeshFactory.field_b.addSubStream(ServerMessageScreen.field_D);
            IndexedSpriteState.field_c = new IntrusiveDeque();
          } else {
            if (null == IndexedSpriteState.field_c) {
              TextFieldNode.field_Bb = new PcmStreamMixer();
              ServerMessageScreen.field_D = new ReverbPcmStream(TextFieldNode.field_Bb);
              PlayerMeshFactory.field_b.addSubStream(ServerMessageScreen.field_D);
              IndexedSpriteState.field_c = new IntrusiveDeque();
            }
          }
        }
        ServerMessageScreen.field_D.setInputGain(param5);
        ServerMessageScreen.field_D.setFeedbackGain(param4);
        ServerMessageScreen.field_D.setDampingTimeMicros(param0);
        if (param1 > -10) {
          field_A = (int[]) null;
        }
        ServerMessageScreen.field_D.setWetGain(param6);
        ServerMessageScreen.field_D.setDryGain(param3);
        ServerMessageScreen.field_D.setStereoWidth(param2);
    }

    static {
        field_B = "create new auction";
        field_C = "Change display name";
        field_A = new int[8192];
    }
}
