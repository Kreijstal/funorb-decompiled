/*
 * Decompiled by CFR-JS 0.4.0.
 */
class Territory extends DualLinkNode {
    int field_x;
    private IntrusiveDeque field_s;
    static int field_p;
    Player field_o;
    int[] field_w;
    int field_r;
    Star field_q;
    int[] field_u;
    static boolean field_v;
    static String field_t;
    static String field_y;

    void addStar(int param0, Star param1) {
        if (param0 != -21771) {
          return;
        }
        try {
          this.field_s.addLast((byte) -113, param1);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "sd.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    Star nextStar(int param0) {
        if (param0 == -23410) {
          return (Star) (this.field_s.nextForward((byte) -71));
        }
        this.isEmpty(126);
        return (Star) (this.field_s.nextForward((byte) -71));
    }

    Star removeFirstStar(int param0) {
        if (param0 > -16) {
          return (Star) null;
        }
        return (Star) (this.field_s.pollFirst(43));
    }

    public static void f(int param0) {
        field_y = null;
        if (param0 != -28714) {
          return;
        }
        field_t = null;
    }

    boolean isEmpty(int param0) {
        if (param0 != 27650) {
          this.field_u = (int[]) null;
          return this.field_s.isEmpty(27);
        }
        return this.field_s.isEmpty(27);
    }

    void setStars(IntrusiveDeque param0, int param1) {
        try {
          this.field_s = param0;
          if (param1 != -9332) {
            this.removeFirstStar(-14);
          }
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "sd.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    int starCount(int param0) {
        int var2 = -77 / ((param0 - 5) / 51);
        return this.field_s.size(0);
    }

    Star firstStar(int param0) {
        if (param0 == 18229) {
          return (Star) (this.field_s.startForward(0));
        }
        this.starCount(-119);
        return (Star) (this.field_s.startForward(0));
    }

    Territory(Player param0, Star param1) {
        try {
          this.field_q = param1;
          this.field_o = param0;
          this.field_s = new IntrusiveDeque();
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "sd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_v = false;
        field_y = "The following settings need to be changed:  ";
    }
}
