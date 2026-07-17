/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ga extends nm {
    static jp[] field_k;
    static int field_i;
    static int field_j;
    static boolean[] field_l;

    public ga() {
    }

    final static void a(boolean param0, int param1) {
        if (ml.field_b > 0) {
          if (sc.field_c) {
            lb.b(0, 0, lb.field_c, gp.field_d.field_db);
            qp.field_f.a(true, param0);
            if (pe.field_j <= 0) {
              if (0 < eg.field_m) {
                if (!hc.field_c) {
                  return;
                } else {
                  lb.b(0, 0, lb.field_c, gp.field_d.field_db);
                  wi.field_j.a(true, param0);
                  return;
                }
              } else {
                return;
              }
            } else {
              if (hc.field_c) {
                lb.b(0, 0, lb.field_c, gp.field_d.field_db);
                wi.field_j.a(true, param0);
                return;
              } else {
                return;
              }
            }
          } else {
            if (pe.field_j <= 0) {
              if (0 < eg.field_m) {
                if (hc.field_c) {
                  lb.b(0, 0, lb.field_c, gp.field_d.field_db);
                  wi.field_j.a(true, param0);
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              if (hc.field_c) {
                lb.b(0, 0, lb.field_c, gp.field_d.field_db);
                wi.field_j.a(true, param0);
                return;
              } else {
                return;
              }
            }
          }
        } else {
          if (pe.field_j <= 0) {
            if (0 < eg.field_m) {
              if (hc.field_c) {
                lb.b(0, 0, lb.field_c, gp.field_d.field_db);
                wi.field_j.a(true, param0);
                return;
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            if (hc.field_c) {
              lb.b(0, 0, lb.field_c, gp.field_d.field_db);
              wi.field_j.a(true, param0);
              return;
            } else {
              return;
            }
          }
        }
    }

    final static void d() {
        int var1 = 0;
        if (ki.field_d > 32) {
          L0: {
            var1 = ki.field_d % 32;
            if (0 != var1) {
              break L0;
            } else {
              var1 = 32;
              break L0;
            }
          }
          h.a(13894, ki.field_d + -var1);
          var1 = 0;
          return;
        } else {
          h.a(13894, 0);
          var1 = 0;
          return;
        }
    }

    final static boolean c() {
        return !ma.field_I.b(96);
    }

    public static void a(int param0) {
        if (param0 != 0) {
            ga.a(51);
            field_l = null;
            field_k = null;
            return;
        }
        field_l = null;
        field_k = null;
    }

    static {
    }
}
