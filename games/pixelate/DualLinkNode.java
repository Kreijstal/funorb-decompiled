/*
 * Decompiled by CFR-JS 0.4.0.
 */
class DualLinkNode extends IntrusiveNode {
    long field_q;
    static wm field_l;
    DualLinkNode secondaryPrevious;
    DualLinkNode secondaryNext;
    static String field_n;
    static BitmapFont field_o;
    static String field_m;
    static int[] field_s;
    static String[] field_k;

    public static void a(int param0) {
        field_s = null;
        field_l = null;
        field_o = null;
        if (param0 != -2575) {
          return;
        }
        field_n = null;
        field_k = null;
        field_m = null;
    }

    final long a(boolean param0) {
        if (!param0) {
          this.e(-120);
          return this.field_q;
        }
        return this.field_q;
    }

    final void e(int param0) {
        if (null == this.secondaryPrevious) {
          return;
        }
        this.secondaryPrevious.secondaryNext = this.secondaryNext;
        if (param0 == 17) {
          this.secondaryNext.secondaryPrevious = this.secondaryPrevious;
          this.secondaryPrevious = null;
          this.secondaryNext = null;
          return;
        }
    }

    final boolean f(int param0) {
        if (param0 != 0) {
          this.e(-41);
          if (this.secondaryPrevious != null) {
            return true;
          }
          return false;
        }
        if (this.secondaryPrevious != null) {
          return true;
        }
        return false;
    }

    final void a(long param0, int param1) {
        if (null != this.secondaryPrevious) {
          throw new RuntimeException();
        }
        if (param1 == 29574) {
          this.field_q = param0;
          return;
        }
        this.secondaryNext = (DualLinkNode) null;
        this.field_q = param0;
    }

    protected DualLinkNode() {
    }

    static {
        field_l = new wm(7, 0, 1, 1);
        field_m = "Play rated game";
        field_n = "If you do nothing the game will revert to normal view in <%0> second.";
        field_k = new String[]{"Showing by rating", "Showing by win percentage"};
        field_s = new int[]{17, 18, 7};
    }
}
