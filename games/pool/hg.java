/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hg {
    static String field_b;
    static vh field_c;
    static int field_a;

    final static void a(String param0, boolean param1) {
        if (!param1) {
            java.awt.Container discarded$0 = hg.a(true);
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3) {
        int var4 = 0;
        if (param0 == 0) {
          o.field_C.c(param1, param3);
          if (param2) {
            L0: {
              var4 = uf.field_X % o.field_C.field_z * 2;
              if (var4 < o.field_C.field_z) {
                break L0;
              } else {
                var4 = o.field_C.field_z + (-var4 + o.field_C.field_z);
                break L0;
              }
            }
            if (10 > var4) {
              var4 = 10;
              wf.a(-68, 80, 0, o.field_C, var4, 0, param1, 30, param3);
              return;
            } else {
              if (-40 + o.field_C.field_z >= var4) {
                wf.a(-68, 80, 0, o.field_C, var4, 0, param1, 30, param3);
                return;
              } else {
                var4 = -40 + o.field_C.field_z;
                wf.a(-68, 80, 0, o.field_C, var4, 0, param1, 30, param3);
                return;
              }
            }
          } else {
            return;
          }
        } else {
          field_b = null;
          o.field_C.c(param1, param3);
          if (param2) {
            L1: {
              var4 = uf.field_X % o.field_C.field_z * 2;
              if (var4 < o.field_C.field_z) {
                break L1;
              } else {
                var4 = o.field_C.field_z + (-var4 + o.field_C.field_z);
                break L1;
              }
            }
            if (10 > var4) {
              var4 = 10;
              wf.a(-68, 80, 0, o.field_C, var4, 0, param1, 30, param3);
              return;
            } else {
              if (-40 + o.field_C.field_z >= var4) {
                wf.a(-68, 80, 0, o.field_C, var4, 0, param1, 30, param3);
                return;
              } else {
                var4 = -40 + o.field_C.field_z;
                wf.a(-68, 80, 0, o.field_C, var4, 0, param1, 30, param3);
                return;
              }
            }
          } else {
            return;
          }
        }
    }

    final static java.awt.Container a(boolean param0) {
        if (param0) {
            Object var2 = null;
            hg.a((String) null, true);
            if (!(null == op.field_e)) {
                return (java.awt.Container) (Object) op.field_e;
            }
            return (java.awt.Container) (Object) hk.d(95);
        }
        if (!(null == op.field_e)) {
            return (java.awt.Container) (Object) op.field_e;
        }
        return (java.awt.Container) (Object) hk.d(95);
    }

    public static void b(boolean param0) {
        field_c = null;
        field_b = null;
        if (param0) {
            field_c = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Try again";
    }
}
