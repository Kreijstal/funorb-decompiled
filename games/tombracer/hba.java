/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hba {
    static int textureHeightMask;
    static ena field_c;
    static float[] field_a;

    public static void releaseStatics(int param0) {
        if (param0 != 1) {
          return;
        }
        field_a = null;
        field_c = null;
    }

    final static void sendRoomResult(int param0, long param1, byte param2, int param3) {
        if (null == ql.field_k) {
          return;
        }
        C2SRoomResultPacket var5 = new C2SRoomResultPacket();
        if (param2 >= 1) {
          var5.setRoomTicks(-7, param1);
          var5.setRoomId(param3, -71);
          var5.setCourseId(40, param0);
          var5.setIntCounters(PlayerViewport.field_b, PlayTrackCommand.field_o, MonsterRemains.field_h, OpenGlToolkit.field_Z, -113);
          var5.setLongCounters(MidiVoiceMixer.field_j, nb.field_c, false, ClientMemoryVertexArray.field_f, CommonChooseReward.field_b);
          hw.sendGamePacket((byte) -111, 1, 74, var5);
          return;
        }
        field_a = (float[]) null;
        var5.setRoomTicks(-7, param1);
        var5.setRoomId(param3, -71);
        var5.setCourseId(40, param0);
        var5.setIntCounters(PlayerViewport.field_b, PlayTrackCommand.field_o, MonsterRemains.field_h, OpenGlToolkit.field_Z, -113);
        var5.setLongCounters(MidiVoiceMixer.field_j, nb.field_c, false, ClientMemoryVertexArray.field_f, CommonChooseReward.field_b);
        hw.sendGamePacket((byte) -111, 1, 74, var5);
    }

    static {
        field_a = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
    }
}
