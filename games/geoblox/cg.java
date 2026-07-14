/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cg extends ia {
    private ia field_l;
    private int field_j;
    static String field_k;

    final static int a(CharSequence param0, boolean param1, char param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var3 = 0;
          if (param1) {
            break L0;
          } else {
            boolean discarded$2 = cg.b(false);
            break L0;
          }
        }
        var4 = param0.length();
        var5 = 0;
        L1: while (true) {
          if (var5 >= var4) {
            return var3;
          } else {
            if (param0.charAt(var5) == param2) {
              var3++;
              var5++;
              continue L1;
            } else {
              var5++;
              continue L1;
            }
          }
        }
    }

    final int d() {
        return 0;
    }

    final static boolean b(boolean param0) {
        ff.field_k = param0 ? true : false;
        hi.field_G = 15000L + oa.a(-12520);
        return -12 == (hj.field_a ^ -1) ? true : false;
    }

    final void b(int param0) {
        if (param0 < ((cg) this).field_j) {
            ((cg) this).field_j = ((cg) this).field_j - param0;
            return;
        }
        param0 = param0 - ((cg) this).field_j;
        ((cg) this).field_j = 0;
        ((cg) this).field_l.field_c = ((cg) this).field_c;
        ((cg) this).field_l.field_b = ((cg) this).field_b;
        ((cg) this).field_c.field_b = (hf) (Object) ((cg) this).field_l;
        ((cg) this).field_b.field_c = (hf) (Object) ((cg) this).field_l;
        ((cg) this).field_c = null;
        ((cg) this).field_b = null;
        if (!(0 >= param0)) {
            ((cg) this).field_l.b(param0);
        }
    }

    final ia b() {
        return null;
    }

    final int a() {
        return ((cg) this).field_l.a();
    }

    public static void c(byte param0) {
        if (param0 > -107) {
            cg.c((byte) -13);
        }
        field_k = null;
    }

    final ia c() {
        return null;
    }

    final static boolean a(byte param0) {
        if (param0 <= 18) {
            return false;
        }
        return bj.field_s;
    }

    final void a(int[] param0, int param1, int param2) {
        if (!(((cg) this).field_j <= param2)) {
            ((cg) this).field_j = ((cg) this).field_j - param2;
            return;
        }
        param1 = param1 + ((cg) this).field_j;
        param2 = param2 - ((cg) this).field_j;
        ((cg) this).field_j = 0;
        ((cg) this).field_l.field_b = ((cg) this).field_b;
        ((cg) this).field_l.field_c = ((cg) this).field_c;
        ((cg) this).field_c.field_b = (hf) (Object) ((cg) this).field_l;
        ((cg) this).field_b.field_c = (hf) (Object) ((cg) this).field_l;
        ((cg) this).field_c = null;
        ((cg) this).field_b = null;
        if (-1 > (param2 ^ -1)) {
            ((cg) this).field_l.a(param0, param1, param2);
        }
    }

    cg(ia param0, int param1) {
        ((cg) this).field_l = param0;
        ((cg) this).field_g = ((cg) this).field_l.field_g;
        ((cg) this).field_j = param1;
    }

    static {
    }
}
