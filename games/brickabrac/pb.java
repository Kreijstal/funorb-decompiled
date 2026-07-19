/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pb extends nm {
    private int field_k;
    int field_q;
    static jp field_j;
    int field_i;
    static String field_o;
    static String field_l;
    private int field_m;
    jp field_p;
    static int[] field_n;

    final boolean a(byte param0, int param1, int param2) {
        if (param0 == -84) {
          if (param2 == this.field_m) {
            if (this.field_k != param1) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_j = (jp) null;
          if (param2 == this.field_m) {
            if (this.field_k != param1) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    public static void a(byte param0) {
        field_o = null;
        field_n = null;
        field_l = null;
        if (param0 < 22) {
            field_l = (String) null;
            field_j = null;
            return;
        }
        field_j = null;
    }

    final void a(int param0, int param1, byte param2) {
        String discarded$2 = null;
        if (param2 != 78) {
          discarded$2 = pb.a(13, -48);
          this.field_k = param1;
          this.field_m = param0;
          return;
        } else {
          this.field_k = param1;
          this.field_m = param0;
          return;
        }
    }

    final static String a(int param0, int param1) {
        if (param1 != 4) {
          return (String) null;
        } else {
          return 1 + param0 + "/" + gh.field_b.length;
        }
    }

    pb(int param0, int param1) {
        this.field_i = param0;
        this.field_q = param1;
        this.field_p = new jp(this.field_i, this.field_q);
        this.a(-2, -2, (byte) 78);
    }

    static {
        field_o = "Reject <%0> from this game";
        field_n = new int[4];
        field_l = "Solicitation";
    }
}
