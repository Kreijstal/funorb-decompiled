/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cn {
    static ci field_d;
    static vn field_i;
    static int field_h;
    static int field_j;
    static vn[] field_c;
    static dh field_f;
    static int field_g;
    static vn[] field_a;
    static String[] field_e;
    static la field_b;

    final static sn[] b(int param0) {
        return new sn[]{em.field_J, wn.field_a, u.field_e};
    }

    final static void a(boolean param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = ZombieDawn.field_J;
        if (be.field_j <= 0) {
          if (po.w(13296)) {
            var2 = 0;
            if (rn.field_b == null) {
              if (!em.field_H) {
                return;
              } else {
                ti.a(var2, 113, param0);
                return;
              }
            } else {
              return;
            }
          } else {
            var2 = 1;
            if (rn.field_b == null) {
              if (!em.field_H) {
                return;
              } else {
                ti.a(var2, 113, param0);
                return;
              }
            } else {
              return;
            }
          }
        } else {
          if (null == rn.field_b) {
            field_b = nf.a(480, 640, vh.field_a, 0, false, 0);
            if (null != field_b) {
              se.a(20922, (java.awt.Canvas) (Object) field_b);
              var2 = 2;
              if (rn.field_b != null) {
                return;
              } else {
                L0: {
                  if (em.field_H) {
                    ti.a(var2, 113, param0);
                    break L0;
                  } else {
                    break L0;
                  }
                }
                return;
              }
            } else {
              var2 = 3;
              if (rn.field_b != null) {
                return;
              } else {
                L1: {
                  if (em.field_H) {
                    ti.a(var2, 113, param0);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return;
              }
            }
          } else {
            field_b = rn.field_b.a(true);
            p.b(2, 27102);
            if (null != field_b) {
              se.a(20922, (java.awt.Canvas) (Object) field_b);
              var2 = 2;
              if (rn.field_b != null) {
                return;
              } else {
                L2: {
                  if (em.field_H) {
                    ti.a(var2, 113, param0);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                return;
              }
            } else {
              var2 = 3;
              if (rn.field_b != null) {
                return;
              } else {
                L3: {
                  if (em.field_H) {
                    ti.a(var2, 113, param0);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                return;
              }
            }
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        field_e = null;
        field_f = null;
        field_c = null;
        field_i = null;
        field_d = null;
    }

    final static void a(byte param0) {
        ic.field_U = false;
        if (param0 <= 40) {
            return;
        }
        pn.field_R = null;
        hl.field_b = null;
        bp.field_a = null;
        dl.field_h = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new ci();
        field_g = 1;
        field_e = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    }
}
