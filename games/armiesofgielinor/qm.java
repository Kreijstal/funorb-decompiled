/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qm extends nl {
    static String field_I;
    static String field_H;
    static int field_L;
    static tp field_J;
    static int[] field_K;

    final void b(boolean param0) {
        ((qm) this).field_E.e(0);
        if (!param0) {
            field_I = null;
        }
    }

    qm(int param0, int param1, int param2, int param3, kh param4, kb param5) {
        super(param0, param1, param2, param3, param4, (qo) null);
        ((qm) this).field_E = param5;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (param2 <= -82) {
          if (0 == param3) {
            if (((qm) this).field_k != null) {
              ((qm) this).field_k.a((kb) this, param0, -102, true, param1);
              if (-1 != (((qm) this).field_l ^ -1)) {
                if (((qm) this).field_w == 0) {
                  return;
                } else {
                  t.field_c.a(((qm) this).field_p + param1 - -((qm) this).field_w, ((qm) this).field_B + param0 - -((qm) this).field_l, ((qm) this).field_p + param1, -101, ((qm) this).field_B + param0);
                  ((qm) this).field_E.a(((qm) this).field_B + param0, ((qm) this).field_p + param1, (byte) -110, param3);
                  t.field_c.a(58);
                  return;
                }
              } else {
                return;
              }
            } else {
              if (-1 != (((qm) this).field_l ^ -1)) {
                if (((qm) this).field_w == 0) {
                  return;
                } else {
                  t.field_c.a(((qm) this).field_p + param1 - -((qm) this).field_w, ((qm) this).field_B + param0 - -((qm) this).field_l, ((qm) this).field_p + param1, -101, ((qm) this).field_B + param0);
                  ((qm) this).field_E.a(((qm) this).field_B + param0, ((qm) this).field_p + param1, (byte) -110, param3);
                  t.field_c.a(58);
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            if (-1 != (((qm) this).field_l ^ -1)) {
              if (((qm) this).field_w == 0) {
                return;
              } else {
                t.field_c.a(((qm) this).field_p + param1 - -((qm) this).field_w, ((qm) this).field_B + param0 - -((qm) this).field_l, ((qm) this).field_p + param1, -101, ((qm) this).field_B + param0);
                ((qm) this).field_E.a(((qm) this).field_B + param0, ((qm) this).field_p + param1, (byte) -110, param3);
                t.field_c.a(58);
                return;
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, kb param4, int param5, int param6) {
        if (param3 > 103) {
          if (((qm) this).b(1, param1, param5, param0, param2)) {
            if (!this.a(param0, param1, param2, 127, param4, param5, param6)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_J = null;
          if (((qm) this).b(1, param1, param5, param0, param2)) {
            if (!this.a(param0, param1, param2, 127, param4, param5, param6)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    public static void j(int param0) {
        field_H = null;
        if (param0 < 38) {
          field_K = null;
          field_J = null;
          field_I = null;
          field_K = null;
          return;
        } else {
          field_J = null;
          field_I = null;
          field_K = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = "Map size: ";
        field_L = 0;
        field_H = "This game has started.";
    }
}
