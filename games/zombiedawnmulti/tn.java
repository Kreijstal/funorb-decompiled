/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tn extends qc {
    static int field_z;
    int field_D;
    byte field_B;
    static th field_C;
    static tq field_A;
    k field_y;

    final static void a(boolean param0, int param1, java.awt.Canvas param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        var3 = 62 % ((43 - param1) / 53);
        if (fn.field_i >= 10) {
          if (gb.a(250)) {
            if (a.field_b != 0) {
              ra.a(param2, -113);
              return;
            } else {
              ec.a(false, param0, -126);
              t.a(false, 0, param2, 0);
              return;
            }
          } else {
            oo.b();
            eh.a(320, 240, 122);
            t.a(false, 0, param2, 0);
            return;
          }
        } else {
          L0: {
            var4 = 0;
            if (cj.field_ub) {
              cj.field_ub = false;
              var4 = 1;
              break L0;
            } else {
              break L0;
            }
          }
          ip.a(tg.b(8218), af.field_b, var4 != 0, cj.g(18006), 34);
          return;
        }
    }

    final int f(int param0) {
        Object var3 = null;
        if (((tn) this).field_y != null) {
          if (param0 != 100) {
            var3 = null;
            tn.a(true, 113, (java.awt.Canvas) null);
            return 100 * ((tn) this).field_y.field_j / (((tn) this).field_y.field_m.length + -((tn) this).field_B);
          } else {
            return 100 * ((tn) this).field_y.field_j / (((tn) this).field_y.field_m.length + -((tn) this).field_B);
          }
        } else {
          return 0;
        }
    }

    public static void g(int param0) {
        field_A = null;
        if (param0 != 0) {
            field_C = null;
            field_C = null;
            return;
        }
        field_C = null;
    }

    final byte[] e(int param0) {
        if (!((tn) this).field_t) {
          if (((tn) this).field_y.field_m.length - ((tn) this).field_B <= ((tn) this).field_y.field_j) {
            if (param0 != 0) {
              field_C = null;
              return ((tn) this).field_y.field_m;
            } else {
              return ((tn) this).field_y.field_m;
            }
          } else {
            throw new RuntimeException();
          }
        } else {
          throw new RuntimeException();
        }
    }

    final static boolean a(String param0, long param1, byte param2, int param3, int[] param4) {
        int var6 = 0;
        var6 = -63 / ((param2 - -32) / 42);
        if (param4 != null) {
          if (2 == param3) {
            if (pd.a(param1, param0, 2)) {
              return true;
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    tn() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = -1;
    }
}
