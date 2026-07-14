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
        if (param0 != 5540) {
          lk.b(23);
          field_b = null;
          field_a = null;
          field_d = null;
          return;
        } else {
          field_b = null;
          field_a = null;
          field_d = null;
          return;
        }
    }

    final static void b(int param0) {
        if (param0 != 9407) {
            field_c = null;
            ia.e((byte) 113);
            return;
        }
        ia.e((byte) 113);
    }

    final static String c(int param0) {
        String var1 = null;
        if (param0 > -30) {
          L0: {
            lk.b(-99);
            var1 = "";
            if (mb.field_s == null) {
              break L0;
            } else {
              var1 = mb.field_s.d(false);
              break L0;
            }
          }
          L1: {
            if (var1.length() != 0) {
              break L1;
            } else {
              var1 = ej.g((byte) 123);
              break L1;
            }
          }
          L2: {
            if (var1.length() == 0) {
              var1 = hd.field_k;
              break L2;
            } else {
              break L2;
            }
          }
          return var1;
        } else {
          L3: {
            var1 = "";
            if (mb.field_s == null) {
              break L3;
            } else {
              var1 = mb.field_s.d(false);
              break L3;
            }
          }
          L4: {
            if (var1.length() != 0) {
              break L4;
            } else {
              var1 = ej.g((byte) 123);
              break L4;
            }
          }
          L5: {
            if (var1.length() == 0) {
              var1 = hd.field_k;
              break L5;
            } else {
              break L5;
            }
          }
          return var1;
        }
    }

    final static void d(int param0) {
        if (param0 < 79) {
            String discarded$0 = lk.c(-88);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Name is available";
        field_c = "Begin Mission";
        field_b = "ACT III, Retaliation";
    }
}
