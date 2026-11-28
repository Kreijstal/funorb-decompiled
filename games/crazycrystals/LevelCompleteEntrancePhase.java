/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LevelCompleteEntrancePhase extends ResultScenePhase {
    static mk field_h;
    static PacketBuffer field_g;
    static int[] field_f;
    static PacketBuffer field_e;

    final ResultScenePhase updatePhase(int param0) {
        jj.field_b = jj.field_b + 16;
        if (param0 != -2) {
          this.updatePhase(-85);
          if (jj.field_b >= 0) {
            jj.field_b = 0;
            return (ResultScenePhase) ((Object) new o(60, !vh.field_a ? new gj() : new sm()));
          }
          return (ResultScenePhase) (this);
        }
        if (jj.field_b >= 0) {
          jj.field_b = 0;
          return (ResultScenePhase) ((Object) new o(60, !vh.field_a ? new gj() : new sm()));
        }
        return (ResultScenePhase) (this);
    }

    LevelCompleteEntrancePhase() {
    }

    final ResultScenePhase fastForwardPhase(byte param0) {
        if (param0 != -90) {
          this.fastForwardPhase((byte) 103);
          return (ResultScenePhase) ((Object) new gj());
        }
        return (ResultScenePhase) ((Object) new gj());
    }

    public static void clearStaticReferences(int param0) {
        field_f = null;
        field_g = null;
        field_e = null;
        field_h = null;
        if (param0 != 16) {
          LevelCompleteEntrancePhase.clearStaticReferences(19);
        }
    }

    static {
        field_f = new int[]{65344, 16744640, 4227327};
        field_h = new mk();
    }
}
