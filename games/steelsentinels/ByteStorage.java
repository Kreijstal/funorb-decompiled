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

    final static fm[] b(boolean param0) {
        if (!param0) {
          return new fm[]{StripedProgressBar.field_M, IntrusiveNode.field_g, WhirlpoolHasher.field_n, gf.field_b, Explosion.field_D, MouseInputHandler.field_c, PlayingSound.field_p, ArticulatedPart.field_O, ParticleEffect.field_H, PasswordFieldPainter.field_x, wn.field_b, ml.field_b, sh.field_b, TriangleMesh.field_A};
        }
        return (fm[]) null;
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
