/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nj extends kj {
    private int field_h;
    static String field_i;
    static lda field_j;
    static int field_f;
    private int field_g;

    final boolean b(int param0) {
        int fieldTemp$2 = ((nj) this).field_g + 1;
        ((nj) this).field_g = ((nj) this).field_g + 1;
        if (fieldTemp$2 >= 64) {
          return true;
        } else {
          if (param0 < 21) {
            nj.c(88);
            return false;
          } else {
            return false;
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        ve.field_m[-4 + ((nj) this).field_h][(((nj) this).field_g >> 1) % 25].a(-18 + param2 - -64, -((nj) this).field_g + param0 + -56, 256 + -(((nj) this).field_g << 2));
        if (param1 != 0) {
            ((nj) this).a(-102, 107, -32);
        }
    }

    nj(gj param0, int param1, int param2, int param3) {
        super(param0, param1, param2);
        try {
            ((nj) this).field_h = param3;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "nj.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    public static void c(int param0) {
        field_i = null;
        field_j = null;
        if (param0 != 256) {
            field_i = null;
        }
    }

    final void a(int param0, boolean param1, int param2) {
        if (!param1) {
            field_i = null;
        }
    }

    static {
    }
}
