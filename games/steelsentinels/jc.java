/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jc {
    static String field_j;
    static boolean field_k;
    private ul field_h;
    static int field_f;
    private ck field_a;
    static String field_i;
    static boolean field_d;
    static gk[] field_c;
    static wk field_b;
    static String field_e;
    static String field_g;

    final ck a(int param0, ck param1) {
        ck var3 = null;
        L0: {
          if (param1 == null) {
            var3 = ((jc) this).field_h.field_e.field_i;
            break L0;
          } else {
            var3 = param1;
            break L0;
          }
        }
        if (((jc) this).field_h.field_e != var3) {
          ((jc) this).field_a = var3.field_i;
          if (param0 != 24192) {
            return null;
          } else {
            return var3;
          }
        } else {
          ((jc) this).field_a = null;
          return null;
        }
    }

    final ck b(int param0) {
        ck var2 = null;
        if (param0 != 2) {
            Object var3 = null;
            ck discarded$0 = ((jc) this).a(-4, (ck) null);
            var2 = ((jc) this).field_h.field_e.field_k;
            if (!(var2 != ((jc) this).field_h.field_e)) {
                ((jc) this).field_a = null;
                return null;
            }
            ((jc) this).field_a = var2.field_k;
            return var2;
        }
        var2 = ((jc) this).field_h.field_e.field_k;
        if (!(var2 != ((jc) this).field_h.field_e)) {
            ((jc) this).field_a = null;
            return null;
        }
        ((jc) this).field_a = var2.field_k;
        return var2;
    }

    final static String b(byte param0) {
        if (!pg.field_A) {
          if (si.field_m >= ik.field_c) {
            if (ik.field_c + ni.field_c <= si.field_m) {
              if (param0 == -122) {
                return null;
              } else {
                field_j = null;
                return null;
              }
            } else {
              return rc.field_b;
            }
          } else {
            if (param0 == -122) {
              return null;
            } else {
              field_j = null;
              return null;
            }
          }
        } else {
          if (param0 == -122) {
            return null;
          } else {
            field_j = null;
            return null;
          }
        }
    }

    final static boolean a(int param0) {
        int stackIn_8_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 == 2) {
          if (an.field_i == null) {
            if (!fk.a(0)) {
              if (n.field_x == null) {
                if (a.a(false)) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackOut_18_0 = 1;
                stackIn_20_0 = stackOut_18_0;
                return stackIn_20_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          field_c = null;
          if (an.field_i == null) {
            if (!fk.a(0)) {
              if (n.field_x == null) {
                if (a.a(false)) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                return stackIn_8_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    jc(ul param0) {
        ((jc) this).field_h = param0;
    }

    final ck d(int param0) {
        ck var2 = null;
        if (param0 == 2) {
          var2 = ((jc) this).field_a;
          if (((jc) this).field_h.field_e == var2) {
            ((jc) this).field_a = null;
            return null;
          } else {
            ((jc) this).field_a = var2.field_k;
            return var2;
          }
        } else {
          return null;
        }
    }

    final static void a(byte param0) {
        nm.field_n = null;
        dj.field_j = null;
        vl.field_r = false;
        oc.field_d = null;
        a.field_g = null;
        if (param0 != -2) {
            String discarded$0 = jc.b((byte) 42);
        }
    }

    final ck c(int param0) {
        ck var2 = null;
        if (param0 != 2) {
            ((jc) this).field_h = null;
            var2 = ((jc) this).field_h.field_e.field_i;
            if (!(var2 != ((jc) this).field_h.field_e)) {
                ((jc) this).field_a = null;
                return null;
            }
            ((jc) this).field_a = var2.field_i;
            return var2;
        }
        var2 = ((jc) this).field_h.field_e.field_i;
        if (!(var2 != ((jc) this).field_h.field_e)) {
            ((jc) this).field_a = null;
            return null;
        }
        ((jc) this).field_a = var2.field_i;
        return var2;
    }

    final ck a(boolean param0) {
        ck var2 = null;
        if (!param0) {
            boolean discarded$0 = jc.a(-87);
            var2 = ((jc) this).field_a;
            if (!(((jc) this).field_h.field_e != var2)) {
                ((jc) this).field_a = null;
                return null;
            }
            ((jc) this).field_a = var2.field_i;
            return var2;
        }
        var2 = ((jc) this).field_a;
        if (!(((jc) this).field_h.field_e != var2)) {
            ((jc) this).field_a = null;
            return null;
        }
        ((jc) this).field_a = var2.field_i;
        return var2;
    }

    final ck a(boolean param0, ck param1) {
        ck var3 = null;
        L0: {
          if (param1 == null) {
            var3 = ((jc) this).field_h.field_e.field_k;
            break L0;
          } else {
            var3 = param1;
            break L0;
          }
        }
        if (((jc) this).field_h.field_e != var3) {
          ((jc) this).field_a = var3.field_k;
          if (param0) {
            return null;
          } else {
            return var3;
          }
        } else {
          ((jc) this).field_a = null;
          return null;
        }
    }

    public static void e(int param0) {
        field_i = null;
        if (param0 != 5370) {
          field_d = false;
          field_j = null;
          field_b = null;
          field_g = null;
          field_e = null;
          field_c = null;
          return;
        } else {
          field_j = null;
          field_b = null;
          field_g = null;
          field_e = null;
          field_c = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Movement and Navigation";
        field_f = 2;
        field_k = false;
        field_e = "RESIGNED";
        field_i = "Return to Main Menu";
        field_g = "Your ignore list is full. Max of 100 hit.";
    }
}
