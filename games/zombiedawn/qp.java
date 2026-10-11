/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qp {
    static vn[] field_c;
    static String field_a;
    static int[] field_b;

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
        if (param0 < 24) {
          qp.a((byte) 47);
          field_b = null;
          return;
        }
        field_b = null;
    }

    final static String a(int param0, int param1) {
        int var2;
        int var3;
        var3 = ZombieDawn.field_J;
        if (param1 <= 32) {
          return (String) null;
        }
        var2 = param0;
        if (0 == var2) {
          return tk.field_b;
        }
        if (var2 == 1) {
          return mm.field_l;
        }
        if (var2 == 2) {
          return ah.field_bb;
        }
        if (var2 == 3) {
          return cl.field_a;
        }
        if (var2 == 4) {
          return rg.field_K;
        }
        if (var2 == 5) {
          return ti.field_d;
        }
        if (var2 == 6) {
          return ij.field_J;
        }
        if (var2 == 7) {
          return bh.field_h;
        }
        if (var2 == 9) {
          return fe.field_J;
        }
        if (var2 == 10) {
          return ub.field_h;
        }
        if (var2 == 13) {
          return dm.field_s;
        }
        if (var2 == 12) {
          return pa.field_C;
        }
        if (var2 == 14) {
          return ig.field_Bb;
        }
        if (var2 != 15) {
          return null;
        }
        return tl.field_k;
    }

    static {
        field_a = "More memory is required to run in different resolutions. Try updating your version of Java or changing your Java settings.";
    }
}
