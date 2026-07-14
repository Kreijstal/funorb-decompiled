/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class em extends vf {
    ec field_D;
    static volatile int field_C;
    byte field_E;
    static String field_F;
    int field_G;

    public static void c(boolean param0) {
        field_F = null;
        if (!param0) {
            field_C = 45;
        }
    }

    final static String e(int param0) {
        if (ol.field_i == ql.field_f) {
            return td.field_d;
        }
        if (param0 != 7142) {
            String discarded$0 = em.e(-19);
            return ek.field_i;
        }
        return ek.field_i;
    }

    final int d(byte param0) {
        if (param0 >= 98) {
          if (((em) this).field_D == null) {
            return 0;
          } else {
            return 100 * ((em) this).field_D.field_o / (-((em) this).field_E + ((em) this).field_D.field_m.length);
          }
        } else {
          ((em) this).field_G = -32;
          if (((em) this).field_D == null) {
            return 0;
          } else {
            return 100 * ((em) this).field_D.field_o / (-((em) this).field_E + ((em) this).field_D.field_m.length);
          }
        }
    }

    final static vk a(String[] args, int param1) {
        vk var2 = null;
        var2 = new vk(false);
        var2.field_c = args;
        if (param1 != 8082) {
          String discarded$2 = em.e(7);
          return var2;
        } else {
          return var2;
        }
    }

    final byte[] b(boolean param0) {
        if (param0) {
          if (!((em) this).field_v) {
            if (((em) this).field_D.field_o < ((em) this).field_D.field_m.length + -((em) this).field_E) {
              throw new RuntimeException();
            } else {
              return ((em) this).field_D.field_m;
            }
          } else {
            throw new RuntimeException();
          }
        } else {
          em.c(false);
          if (!((em) this).field_v) {
            if (((em) this).field_D.field_o < ((em) this).field_D.field_m.length + -((em) this).field_E) {
              throw new RuntimeException();
            } else {
              return ((em) this).field_D.field_m;
            }
          } else {
            throw new RuntimeException();
          }
        }
    }

    em() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = 0;
        field_F = "Select a goblin to sacrifice";
    }
}
