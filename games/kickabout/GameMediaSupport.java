/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GameMediaSupport {
    static String field_c;
    static int field_b;
    static String field_a;
    static boolean field_e;
    static int field_d;

    public static void releaseStatics(byte param0) {
        field_a = null;
        if (param0 > -88) {
          return;
        }
        field_c = null;
    }

    final static void releaseSharedAudioStream(byte param0) {
        if (ServerMessageScreen.field_D != null) {
          PlayerMeshFactory.field_b.removeSubstream(ServerMessageScreen.field_D);
        }
        if (param0 == -25) {
          IndexedSpriteState.field_c = null;
          TextFieldNode.field_Bb = null;
          ServerMessageScreen.field_D = null;
          return;
        }
        field_e = false;
        IndexedSpriteState.field_c = null;
        TextFieldNode.field_Bb = null;
        ServerMessageScreen.field_D = null;
    }

    final static void drawViewportScaledSprite(int param0, int param1, int param2) {
        if (param0 != 653278209) {
          return;
        }
        int var3 = InstrumentNoteMask.field_i * PacketBuffer.field_g.field_o >> 8;
        int var4 = PacketBuffer.field_g.field_o * InstrumentNoteMask.field_i >> 8;
        int var5 = InstrumentNoteMask.field_i * DelegatingCanvas.field_e >> 8;
        int var6 = FormationView.field_m * InstrumentNoteMask.field_i >> 8;
        if (!MouseWheelInput.field_f) {
          SoftwareDrawingSupport.drawScaledMultiplySprite(PacketBuffer.field_g, -(var3 >> 1) + (-var5 + param1), -var6 + param2 - (var4 >> 1), var3, var4);
          return;
        }
        PacketBuffer.field_g.drawScaledAdditive(param1 - var5 - (var3 >> 1), -var6 + (param2 - (var4 >> 1)), var3, var4, 256);
    }

    final static void installHuffmanCodec(HuffmanCodec param0, boolean param1) {
        try {
          Bzip2State.field_I = param0;
          if (param1) {
            GameMediaSupport.releaseSharedAudioStream((byte) 1);
          }
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "ee.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_c = "Send private Quick Chat to <%0>";
        field_d = 2;
    }
}
