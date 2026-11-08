/*
 * Decompiled by CFR-JS 0.4.0.
 */
class IntrusiveNode {
    static String field_m;
    static int field_e;
    static String field_d;
    long key;
    static fm field_g;
    static String[] field_b;
    static boolean field_a;
    static String field_n;
    static int[] field_c;
    IntrusiveNode next;
    IntrusiveNode previous;
    static int field_l;
    static int field_h;
    static SceneWidget[] field_f;

    final static UiTheme a(int param0) {
        int var1 = -105 / ((param0 - 83) / 42);
        if (ThreeSliceButtonPainter.field_w != null) {
          return ThreeSliceButtonPainter.field_w;
        }
        ThreeSliceButtonPainter.field_w = new UiTheme();
        ThreeSliceButtonPainter.field_w.initializePainters(111, tj.field_e);
        ThreeSliceButtonPainter.field_w.field_t = 7697781;
        ThreeSliceButtonPainter.field_w.field_d = 5;
        ThreeSliceButtonPainter.field_w.field_b = 14;
        ThreeSliceButtonPainter.field_w.field_a = 0;
        ThreeSliceButtonPainter.field_w.field_g = 6;
        ThreeSliceButtonPainter.field_w.field_v = SectorCacheStore.field_m;
        ThreeSliceButtonPainter.field_w.field_n = 2763306;
        ThreeSliceButtonPainter.field_w.field_w = 4;
        return ThreeSliceButtonPainter.field_w;
    }

    final void unlink(int obfuscationGuard) {
        if (obfuscationGuard != 4) {
          field_e = -59;
          if (this.previous != null) {
            this.previous.next = this.next;
            this.next.previous = this.previous;
            this.previous = null;
            this.next = null;
            return;
          }
          return;
        }
        if (this.previous != null) {
          this.previous.next = this.next;
          this.next.previous = this.previous;
          this.previous = null;
          this.next = null;
          return;
        }
    }

    public static void releaseStatics(int param0) {
        field_b = null;
        field_m = null;
        if (param0 == 4433) {
          field_c = null;
          field_g = null;
          field_d = null;
          field_f = null;
          field_n = null;
          return;
        }
        IntrusiveNode.releaseStatics(127);
        field_c = null;
        field_g = null;
        field_d = null;
        field_f = null;
        field_n = null;
    }

    final boolean isLinked(byte param0) {
        if (param0 != -12) {
          return true;
        }
        if (this.previous != null) {
          return true;
        }
        return false;
    }

    static {
        field_d = " second";
        field_c = new int[1024];
        field_m = "End Game";
        field_n = "F2";
        field_l = 640;
        field_g = new fm(1, 2, 2, 0);
        field_h = 0;
        field_f = new SceneWidget[32];
    }
}
