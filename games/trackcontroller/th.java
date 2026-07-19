/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th extends fc {
    int field_m;
    static String field_i;
    static String field_n;
    int[] field_k;
    static int field_l;
    boolean field_j;

    final static void d(int param0) {
        if (param0 != -31574) {
            field_i = (String) null;
            pf.field_U = 0;
            return;
        }
        pf.field_U = 0;
    }

    final static kh f(int param0) {
        String var1 = null;
        L0: {
          var1 = l.h(0);
          if (var1 == null) {
            break L0;
          } else {
            if (0 > var1.indexOf('@')) {
              break L0;
            } else {
              var1 = "";
              break L0;
            }
          }
        }
        if (param0 < 36) {
          return (kh) null;
        } else {
          return new kh(l.h(0), cf.a((byte) 41));
        }
    }

    th() {
        this.field_j = false;
    }

    public static void e(int param0) {
        field_n = null;
        field_i = null;
        if (param0 != 0) {
            field_l = -45;
        }
    }

    static {
        field_i = "(Backspace)";
    }
}
