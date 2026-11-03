/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MusicPatchNode extends IntrusiveNode {
    static SceneWidget field_p;
    int field_l;
    int field_H;
    int field_y;
    int field_n;
    int field_z;
    PcmSampleStream field_G;
    int field_m;
    int field_w;
    int field_D;
    PcmSample field_F;
    static Sprite field_B;
    MusicPatch field_x;
    int field_C;
    int field_k;
    un field_q;
    int field_v;
    int field_A;
    int field_E;
    int field_o;
    static int field_t;
    int field_u;
    int field_r;
    static IntrusiveDeque field_J;
    int field_I;
    static Sprite field_s;

    final static void a(java.awt.Component param0, int param1) {
        try {
          param0.setFocusTraversalKeysEnabled(false);
          if (param1 <= 34) {
            field_p = (SceneWidget) null;
          }
          param0.addKeyListener(mc.field_r);
          param0.addFocusListener(mc.field_r);
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "in.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean e(int param0) {
        if (-1 == BackgroundScene.field_b) {
          if (!QueuedInput.a(1, false)) {
            return false;
          }
          BackgroundScene.field_b = MusicCrossfadeStream.field_o.readUnsignedByte(255);
          MusicCrossfadeStream.field_o.position = 0;
        }
        if (-2 == BackgroundScene.field_b) {
          if (!QueuedInput.a(2, false)) {
            return false;
          }
          BackgroundScene.field_b = MusicCrossfadeStream.field_o.a((byte) -113);
          MusicCrossfadeStream.field_o.position = 0;
        }
        if (param0 == -18481) {
          return QueuedInput.a(BackgroundScene.field_b, false);
        }
        field_p = (SceneWidget) null;
        return QueuedInput.a(BackgroundScene.field_b, false);
    }

    final void a(boolean param0) {
        this.field_G = null;
        this.field_q = null;
        this.field_F = null;
        if (!param0) {
          this.field_x = null;
          return;
        }
        field_p = (SceneWidget) null;
        this.field_x = null;
    }

    public static void a(int param0) {
        field_J = null;
        field_B = null;
        field_s = null;
        if (param0 >= -1) {
          field_p = (SceneWidget) null;
          field_p = null;
          return;
        }
        field_p = null;
    }

    MusicPatchNode() {
    }

    static {
        field_J = new IntrusiveDeque();
    }
}
