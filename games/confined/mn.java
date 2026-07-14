/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mn {
    static String field_g;
    static mi field_b;
    rk field_a;
    static e field_f;
    private rk field_d;
    static mi field_e;
    static String field_c;

    final rk b(byte param0) {
        rk var2 = null;
        if (param0 > 83) {
          var2 = ((mn) this).field_a.field_a;
          if (((mn) this).field_a == var2) {
            return null;
          } else {
            var2.a(true);
            return var2;
          }
        } else {
          return null;
        }
    }

    final rk d(int param0) {
        rk var2 = null;
        var2 = ((mn) this).field_d;
        if (((mn) this).field_a != var2) {
          ((mn) this).field_d = var2.field_h;
          if (param0 != 2123) {
            rk discarded$2 = ((mn) this).d(48);
            return var2;
          } else {
            return var2;
          }
        } else {
          ((mn) this).field_d = null;
          return null;
        }
    }

    final rk c(int param0) {
        rk var2 = null;
        if (param0 == 1) {
          var2 = ((mn) this).field_a.field_h;
          if (var2 == ((mn) this).field_a) {
            return null;
          } else {
            var2.a(true);
            return var2;
          }
        } else {
          rk discarded$2 = ((mn) this).b((byte) 116);
          var2 = ((mn) this).field_a.field_h;
          if (var2 == ((mn) this).field_a) {
            return null;
          } else {
            var2.a(true);
            return var2;
          }
        }
    }

    final void a(rk param0, byte param1) {
        int var3 = -8 / ((param1 - 0) / 61);
        if (!(param0.field_a == null)) {
            param0.a(true);
        }
        param0.field_a = ((mn) this).field_a.field_a;
        param0.field_h = ((mn) this).field_a;
        param0.field_a.field_h = param0;
        param0.field_h.field_a = param0;
    }

    final boolean f(int param0) {
        if (param0 != -1) {
            return false;
        }
        return ((mn) this).field_a.field_h == ((mn) this).field_a ? true : false;
    }

    final static void a(String param0, int param1, byte param2, int param3, int param4, int param5) {
        nn.field_t[param4].d(param1, param3);
        pn.field_a.c(param0, 2 + param1, 14 + param3, 16777215, -1);
        if (param2 != -30) {
          mn.b(-116);
          pn.field_a.a(Integer.toString(param5), 39 + param1, 38 + param3, 16777215, -1);
          return;
        } else {
          pn.field_a.a(Integer.toString(param5), 39 + param1, 38 + param3, 16777215, -1);
          return;
        }
    }

    final void a(rk param0, int param1) {
        if (param1 != -1) {
          return;
        } else {
          L0: {
            if (param0.field_a != null) {
              param0.a(true);
              break L0;
            } else {
              break L0;
            }
          }
          param0.field_h = ((mn) this).field_a.field_h;
          param0.field_a = ((mn) this).field_a;
          param0.field_a.field_h = param0;
          param0.field_h.field_a = param0;
          return;
        }
    }

    final rk a(byte param0) {
        rk var2 = ((mn) this).field_d;
        if (!(((mn) this).field_a != var2)) {
            ((mn) this).field_d = null;
            return null;
        }
        int var3 = -15 % ((param0 - 12) / 41);
        ((mn) this).field_d = var2.field_a;
        return var2;
    }

    final void e(int param0) {
        rk var2 = null;
        int var3 = 0;
        var3 = Confined.field_J ? 1 : 0;
        L0: while (true) {
          var2 = ((mn) this).field_a.field_h;
          if (var2 != ((mn) this).field_a) {
            var2.a(true);
            continue L0;
          } else {
            ((mn) this).field_d = null;
            if (param0 < 29) {
              field_b = null;
              return;
            } else {
              return;
            }
          }
        }
    }

    final rk a(rk param0, boolean param1) {
        rk var3 = null;
        if (param1) {
            rk discarded$8 = ((mn) this).a(true);
            if (param0 != null) {
                var3 = param0;
            } else {
                var3 = ((mn) this).field_a.field_a;
            }
            if (!(((mn) this).field_a != var3)) {
                ((mn) this).field_d = null;
                return null;
            }
            ((mn) this).field_d = var3.field_a;
            return var3;
        }
        if (param0 != null) {
            var3 = param0;
        } else {
            var3 = ((mn) this).field_a.field_a;
        }
        if (!(((mn) this).field_a != var3)) {
            ((mn) this).field_d = null;
            return null;
        }
        ((mn) this).field_d = var3.field_a;
        return var3;
    }

    final rk a(int param0) {
        rk var2 = null;
        int var3 = 0;
        var2 = ((mn) this).field_a.field_h;
        if (var2 == ((mn) this).field_a) {
          ((mn) this).field_d = null;
          return null;
        } else {
          var3 = -59 / ((-54 - param0) / 59);
          ((mn) this).field_d = var2.field_h;
          return var2;
        }
    }

    final rk a(boolean param0) {
        rk var2 = null;
        var2 = ((mn) this).field_a.field_a;
        if (((mn) this).field_a == var2) {
          ((mn) this).field_d = null;
          return null;
        } else {
          ((mn) this).field_d = var2.field_a;
          if (param0) {
            mn.b(-115);
            return var2;
          } else {
            return var2;
          }
        }
    }

    public mn() {
        ((mn) this).field_a = new rk();
        ((mn) this).field_a.field_a = ((mn) this).field_a;
        ((mn) this).field_a.field_h = ((mn) this).field_a;
    }

    public static void b(int param0) {
        field_f = null;
        field_g = null;
        field_c = null;
        field_e = null;
        field_b = null;
        int var1 = -97 / ((param0 - 17) / 52);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Waiting for textures";
        field_f = new e(4, 1, 1, 1);
        field_c = "Click to skip";
    }
}
