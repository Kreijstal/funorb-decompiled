/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ef {
    static boolean field_c;
    static int[] field_i;
    static String field_d;
    int field_b;
    int field_h;
    static volatile boolean field_f;
    static int field_a;
    java.awt.Image field_e;
    int[] field_g;

    final static void a(byte param0) {
        qa var1 = null;
        ii var2 = null;
        var1 = (qa) (Object) md.field_t.a((byte) -71);
        if (var1 == null) {
          kc.a((byte) 18);
          return;
        } else {
          var2 = jc.field_g;
          int discarded$8 = var2.j(-3);
          int discarded$9 = var2.j(-3);
          int discarded$10 = var2.j(-3);
          int discarded$11 = var2.j(-3);
          var1.c(2);
          return;
        }
    }

    final static ve a(int param0) {
        String var1 = null;
        var1 = uf.a((byte) -115);
        if (var1 != null) {
          if (var1.indexOf('@') < 0) {
            return new ve(uf.a((byte) -115), lh.a(255));
          } else {
            var1 = "";
            return new ve(uf.a((byte) -115), lh.a(255));
          }
        } else {
          return new ve(uf.a((byte) -115), lh.a(255));
        }
    }

    abstract void a(int param0, int param1, java.awt.Graphics param2, int param3);

    final void c(int param0) {
        na.a(((ef) this).field_g, ((ef) this).field_h, ((ef) this).field_b);
        if (param0 != 64) {
            ef.b(-45);
        }
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param5 >= param1) {
          if (param5 < param1 + param4) {
            if (param6 >= param0) {
              if (param0 + param3 <= param6) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    abstract void a(int param0, byte param1, java.awt.Component param2, int param3);

    public static void b(int param0) {
        int var1 = -119 % ((param0 - -58) / 47);
        field_d = null;
        field_i = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Passwords can only contain letters and numbers";
        field_f = false;
    }
}
