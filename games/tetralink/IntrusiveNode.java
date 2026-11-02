/*
 * Decompiled by CFR-JS 0.4.0.
 */
class IntrusiveNode {
    static int field_l;
    static boolean field_k;
    static String field_d;
    long key;
    static int field_b;
    static int field_f;
    IntrusiveNode next;
    static int[] field_m;
    static Sprite[] field_i;
    IntrusiveNode previous;
    static String field_a;
    static String field_g;
    static String field_h;

    static int a(int param0, int param1) {
        return param0 | param1;
    }

    final void b(boolean param0) {
        if (this.previous == null) {
          return;
        }
        this.previous.next = this.next;
        this.next.previous = this.previous;
        this.next = null;
        if (!param0) {
          this.previous = null;
          return;
        }
        this.b(false);
        this.previous = null;
    }

    final boolean a(byte param0) {
        if (param0 != 95) {
          return true;
        }
        if (null == this.previous) {
          return false;
        }
        return true;
    }

    public static void b(int param0) {
        field_i = null;
        field_g = null;
        field_d = null;
        if (param0 == 20043) {
          field_h = null;
          field_a = null;
          field_m = null;
          return;
        }
        IntrusiveNode.b(-4);
        field_h = null;
        field_a = null;
        field_m = null;
    }

    static {
        field_f = 2;
        field_d = "Invite more players, or alternatively try changing the '<%0>' setting.";
        field_g = "You have won!";
        field_h = "From <%0>: ";
        field_a = "Hide private chat and appear offline to friends";
    }
}
