/*
 * Decompiled by CFR-JS 0.4.0.
 */
class IntrusiveNode {
    static qr field_c;
    static qr field_a;
    IntrusiveNode next;
    static String field_g;
    long key;
    static Sprite[] field_d;
    IntrusiveNode previous;

    final static int b(int param0, int param1) {
        int var2 = 94 % ((-61 - param1) / 58);
        param0 = param0 & 8191;
        if (param0 < 4096) {
          return param0 >= 2048 ? -MusicPatch.field_o[param0 - 2048] : MusicPatch.field_o[2048 - param0];
        }
        return 6144 <= param0 ? MusicPatch.field_o[-6144 + param0] : -MusicPatch.field_o[-param0 + 6144];
    }

    final static void b(int param0) {
        if (param0 == ~gm.field_i) {
          qk.g(-125);
          gm.field_i = 11;
          oi.field_f = true;
          return;
        }
        if (!dh.a(-12165)) {
          qk.g(-125);
          gm.field_i = 11;
          oi.field_f = true;
          return;
        }
        oi.field_f = true;
    }

    final static bg[] c(byte param0) {
        if (param0 == -90) {
          return new bg[]{og.field_b, dm.field_f, mj.field_Rb};
        }
        IntrusiveNode.a(false);
        return new bg[]{og.field_b, dm.field_f, mj.field_Rb};
    }

    final void b(byte param0) {
        if (this.previous == null) {
          return;
        }
        this.previous.next = this.next;
        if (param0 < -57) {
          this.next.previous = this.previous;
          this.previous = null;
          this.next = null;
          return;
        }
        this.c(32);
        this.next.previous = this.previous;
        this.previous = null;
        this.next = null;
    }

    public static void a(boolean param0) {
        if (param0) {
          field_g = null;
          field_d = null;
          field_c = null;
          field_a = null;
          return;
        }
        IntrusiveNode.b(true);
        field_g = null;
        field_d = null;
        field_c = null;
        field_a = null;
    }

    final static boolean b(boolean param0) {
        if (!param0) {
          field_d = (Sprite[]) null;
          if (wg.field_f == null) {
            return false;
          }
          if (cs.field_j.a(64)) {
            return true;
          }
          return false;
        }
        if (wg.field_f == null) {
          return false;
        }
        if (cs.field_j.a(64)) {
          return true;
        }
        return false;
    }

    final boolean c(int param0) {
        if (this.previous == null) {
          return false;
        }
        if (param0 != 2048) {
          IntrusiveNode.b(12);
          return true;
        }
        return true;
    }

    static {
        field_g = "All remaining colonies have agreed to a diplomatic settlement.";
    }
}
