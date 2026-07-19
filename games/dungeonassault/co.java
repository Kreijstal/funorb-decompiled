/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class co extends vf {
    byte[] field_D;
    ln field_K;
    static md field_I;
    int field_L;
    static int field_H;
    static vj field_G;
    static String field_E;
    static String field_C;
    static cn field_F;
    static String[] field_J;

    final static String e(byte param0) {
        if (param0 > 13) {
          if (ol.field_i == ql.field_f) {
            return he.field_m;
          } else {
            if (!im.field_b.b(36)) {
              return im.field_b.c(-2085);
            } else {
              if (wd.field_d == ql.field_f) {
                return im.field_b.c(-2085);
              } else {
                return field_C;
              }
            }
          }
        } else {
          return (String) null;
        }
    }

    final byte[] b(boolean param0) {
        if (param0) {
          if (this.field_v) {
            throw new RuntimeException();
          } else {
            return this.field_D;
          }
        } else {
          field_E = (String) null;
          if (this.field_v) {
            throw new RuntimeException();
          } else {
            return this.field_D;
          }
        }
    }

    public static void e(int param0) {
        int var1 = 99 / ((param0 - 6) / 54);
        field_I = null;
        field_J = null;
        field_G = null;
        field_C = null;
        field_F = null;
        field_E = null;
    }

    final int d(byte param0) {
        if (param0 <= 98) {
            return -12;
        }
        if (!(!this.field_v)) {
            return 0;
        }
        return 100;
    }

    co() {
    }

    static {
        field_I = new md();
        field_E = "Use postcombat abilities.";
        field_G = null;
        field_J = new String[]{"Raiders", "You control a party of between one and four <%raiders>, displayed at the bottom-left of the screen.<br><br><%command>Select one of these raiders now.</col>"};
    }
}
