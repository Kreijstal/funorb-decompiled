/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ByteStorage {
    static RgbSprite field_d;
    static String field_b;
    static SceneWidget[] field_f;
    static int field_a;
    static MusicTrack field_e;
    static Js5ArchiveManager field_c;

    abstract void setBytes(byte param0, byte[] param1);

    abstract byte[] toByteArray(int param0);

    final static QuickChatParameterType[] listTypeDescriptors(boolean param0) {
        if (!param0) {
          return new QuickChatParameterType[]{StripedProgressBar.field_M, IntrusiveNode.field_g, WhirlpoolHasher.field_n, GeneratedSpriteHelpers.field_b, Explosion.field_D, MouseInputHandler.field_c, PlayingSound.field_p, ArticulatedPart.field_O, ParticleEffect.field_H, PasswordFieldPainter.field_x, ChatPanelSetupHelpers.field_b, ListRequestHelpers.field_b, MenuLayoutHelpers.field_b, TriangleMesh.field_A};
        }
        return (QuickChatParameterType[]) null;
    }

    public static void releaseStatics(boolean param0) {
        field_c = null;
        if (!param0) {
          field_d = null;
          field_e = null;
          field_f = null;
          field_b = null;
          return;
        }
        field_f = (SceneWidget[]) null;
        field_d = null;
        field_e = null;
        field_f = null;
        field_b = null;
    }

    static {
        field_d = new RgbSprite(270, 70);
        field_b = "Show chat (1 unread message)";
        field_a = 0;
    }
}
