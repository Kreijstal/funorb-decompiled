/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mm extends kj {
    static int field_C;
    static String field_B;
    static String field_E;
    static vg field_A;

    public static void k(int param0) {
        field_B = null;
        field_E = null;
        if (param0 != 21006) {
            return;
        }
        field_A = null;
    }

    private mm(int param0, int param1, int param2, int param3, td param4, ag param5, pj param6) {
        super(param0, param1, param2, param3, param4, param5);
        ((mm) this).field_y = param6;
    }

    final static boolean a(String param0, byte param1) {
        if (param1 > 23) {
          if (param0 != null) {
            if (param0.length() >= wg.field_q) {
              if (param0.length() <= na.field_b) {
                return false;
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final void a(int param0, int param1, byte param2, pj param3, int param4, int param5) {
        dd var7 = null;
        super.a(param0, param1, (byte) -120, param3, param4, param5);
        var7 = al.field_c;
        if (param2 <= -91) {
          if (var7 != null) {
            if (((mm) this).a((byte) 3, param1, param5, param0, param4)) {
              if (!(((mm) this).field_h instanceof wk)) {
                if (!(var7.field_h instanceof wk)) {
                  return;
                } else {
                  ((wk) (Object) var7.field_h).a(47, var7, (mm) this);
                  al.field_c = null;
                  return;
                }
              } else {
                ((wk) (Object) ((mm) this).field_h).a(22, var7, (mm) this);
                al.field_c = null;
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          field_E = null;
          if (var7 != null) {
            if (((mm) this).a((byte) 3, param1, param5, param0, param4)) {
              if (!(((mm) this).field_h instanceof wk)) {
                if (!(var7.field_h instanceof wk)) {
                  return;
                } else {
                  ((wk) (Object) var7.field_h).a(47, var7, (mm) this);
                  al.field_c = null;
                  return;
                }
              } else {
                ((wk) (Object) ((mm) this).field_h).a(22, var7, (mm) this);
                al.field_c = null;
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = "More suggestions";
        field_E = "members-only content";
        field_A = null;
    }
}
