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
        int discarded$48 = 0;
        int discarded$49 = 0;
        int discarded$50 = 0;
        int discarded$51 = 0;
        qa var1 = null;
        ii var2 = null;
        var1 = (qa) ((Object) md.field_t.a((byte) -71));
        if (var1 != null) {
          var2 = jc.field_g;
          discarded$48 = var2.j(-3);
          discarded$49 = var2.j(-3);
          discarded$50 = var2.j(-3);
          discarded$51 = var2.j(-3);
          var1.c(2);
          if (param0 < 99) {
            ef.b(-125);
            return;
          } else {
            return;
          }
        } else {
          kc.a((byte) 18);
          return;
        }
    }

    final static ve a(int param0) {
        String var1 = null;
        if (param0 == 30923) {
          var1 = uf.a((byte) -115);
          if (var1 != null) {
            if (-1 < (var1.indexOf('@') ^ -1)) {
              return new ve(uf.a((byte) -115), lh.a(255));
            } else {
              var1 = "";
              return new ve(uf.a((byte) -115), lh.a(255));
            }
          } else {
            return new ve(uf.a((byte) -115), lh.a(255));
          }
        } else {
          return (ve) null;
        }
    }

    abstract void a(int param0, int param1, java.awt.Graphics param2, int param3);

    final void c(int param0) {
        na.a(this.field_g, this.field_h, this.field_b);
        if (param0 != 64) {
            ef.b(-45);
        }
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param2 <= -42) {
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
        } else {
          return true;
        }
    }

    abstract void a(int param0, byte param1, java.awt.Component param2, int param3);

    public static void b(int param0) {
        int var1 = -119 % ((param0 - -58) / 47);
        field_d = null;
        field_i = null;
    }

    static {
        field_d = "Passwords can only contain letters and numbers";
        field_f = false;
    }
}
