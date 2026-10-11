/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lk {
    static String field_b;
    static String field_c;
    static String field_e;
    static int[] field_a;
    static jb field_d;

    public static void a(int param0) {
        field_c = null;
        field_e = null;
        if (param0 == 5540) {
          field_b = null;
          field_a = null;
          field_d = null;
          return;
        }
        lk.b(23);
        field_b = null;
        field_a = null;
        field_d = null;
    }

    final static void b(int param0) {
        if (param0 != 9407) {
          field_c = (String) null;
          ia.e((byte) 113);
          return;
        }
        ia.e((byte) 113);
    }

    final static String c(int param0) {
        String var1 = null;
        String var1Lifetime1;
        if (param0 <= -30) {
          var1 = "";
          if (mb.field_s != null) {
            var1 = mb.field_s.d(false);
          }
          if (var1.length() == 0) {
            var1 = ej.g((byte) 123);
          }
          if (var1.length() == 0) {
            var1 = hd.field_k;
          }
          return var1;
        }
        lk.b(-99);
        var1Lifetime1 = "";
        if (mb.field_s != null) {
          var1Lifetime1 = mb.field_s.d(false);
        }
        if (var1Lifetime1.length() == 0) {
          var1Lifetime1 = ej.g((byte) 123);
        }
        if (var1Lifetime1.length() == 0) {
          var1Lifetime1 = hd.field_k;
        }
        return var1Lifetime1;
    }

    final static void d(int param0) {
        if (param0 < 79) {
          lk.c(-88);
        }
    }

    static {
        field_e = "Name is available";
        field_c = "Begin Mission";
        field_b = "ACT III, Retaliation";
    }
}
