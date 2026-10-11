/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class nb extends wb {
    static int field_y;
    boolean field_v;
    boolean field_w;
    static int field_s;
    static og field_p;
    static km field_r;
    static il field_x;
    static int[][] field_q;
    volatile boolean field_t;
    static int[] field_u;
    static String field_o;

    abstract int e(int param0);

    public static void d(int param0) {
        field_u = null;
        field_q = (int[][]) null;
        field_p = null;
        field_r = null;
        if (param0 != -30419) {
          return;
        }
        field_o = null;
        field_x = null;
    }

    final static void a(boolean param0, int param1, int param2, int param3) {
        int var4;
        int var5;
        int var5Lifetime1;
        if (!ac.field_e) {
          return;
        }
        cm.field_h.a(param0, (byte) 97);
        if (param3 != 5) {
          return;
        }
        var4 = dk.field_v.i(-9184) ? 1 : 0;
        if (0 != oi.field_g &&
          var4 == 0) {
          param0 = false;
          nf.a((byte) -119);
        }
        if (!param0) {
          if (var4 == 0) {
            var5 = dk.field_v.g(-10) + dk.field_v.field_Bb;
            if (var5 > 640) {
              bf.field_o = bf.field_o + 5;
              return;
            }
            if (var5 >= 635) {
              return;
            }
            if (bf.field_o <= 0) {
              return;
            }
            bf.field_o = bf.field_o - 5;
            return;
          }
          cm.field_h.a(param0, (byte) 126);
        } else {
          dk.field_v.b(param1, -80, param2);
          if (var4 != 0) {
            cm.field_h.a(param0, (byte) 126);
          }
        }
        var5Lifetime1 = dk.field_v.g(-10) + dk.field_v.field_Bb;
        if (var5Lifetime1 > 640) {
          bf.field_o = bf.field_o + 5;
          return;
        }
        if (var5Lifetime1 >= 635) {
          return;
        }
        if (bf.field_o <= 0) {
          return;
        }
        bf.field_o = bf.field_o - 5;
        return;
    }

    final static void a(boolean param0, oj param1) {
        try {
          if (param0) {
            oj var3 = (oj) null;
            nb.a(false, (oj) null);
          }
          cm.field_h.a(0, param1);
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "nb.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    abstract byte[] b(byte param0);

    nb() {
        this.field_t = true;
    }

    static {
        field_y = 250;
        field_u = new int[]{2, 14, 15, 6, 5, 16, 17, 18, 12};
        field_o = "Remove <%0> from friend list";
    }
}
