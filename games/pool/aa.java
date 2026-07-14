/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aa {
    static ph field_c;
    static int field_d;
    static int field_h;
    private ko field_a;
    static int field_e;
    private ma field_g;
    static String field_f;
    static vh field_b;

    final ma b(int param0) {
        ma var2 = null;
        if (param0 <= -79) {
          var2 = ((aa) this).field_g;
          if (var2 == ((aa) this).field_a.field_e) {
            ((aa) this).field_g = null;
            return null;
          } else {
            ((aa) this).field_g = var2.field_d;
            return var2;
          }
        } else {
          ma discarded$2 = ((aa) this).c((byte) 37);
          var2 = ((aa) this).field_g;
          if (var2 == ((aa) this).field_a.field_e) {
            ((aa) this).field_g = null;
            return null;
          } else {
            ((aa) this).field_g = var2.field_d;
            return var2;
          }
        }
    }

    public static void a(byte param0) {
        Object var2 = null;
        field_f = null;
        if (param0 != -5) {
          var2 = null;
          aa.a(true, (i) null, 8);
          field_b = null;
          field_c = null;
          return;
        } else {
          field_b = null;
          field_c = null;
          return;
        }
    }

    final ma b(byte param0) {
        ma var2 = ((aa) this).field_a.field_e.field_d;
        if (param0 != -92) {
            return null;
        }
        if (!(var2 != ((aa) this).field_a.field_e)) {
            ((aa) this).field_g = null;
            return null;
        }
        ((aa) this).field_g = var2.field_d;
        return var2;
    }

    final ma c(byte param0) {
        ma var2 = null;
        var2 = ((aa) this).field_g;
        if (((aa) this).field_a.field_e != var2) {
          if (param0 != -71) {
            ((aa) this).field_g = null;
            ((aa) this).field_g = var2.field_k;
            return var2;
          } else {
            ((aa) this).field_g = var2.field_k;
            return var2;
          }
        } else {
          ((aa) this).field_g = null;
          return null;
        }
    }

    final ma a(ma param0, int param1) {
        ma var3 = null;
        L0: {
          if (param0 == null) {
            var3 = ((aa) this).field_a.field_e.field_k;
            break L0;
          } else {
            var3 = param0;
            break L0;
          }
        }
        if (param1 <= -96) {
          if (((aa) this).field_a.field_e == var3) {
            ((aa) this).field_g = null;
            return null;
          } else {
            ((aa) this).field_g = var3.field_k;
            return var3;
          }
        } else {
          return null;
        }
    }

    final ma a(int param0) {
        ma var2 = null;
        var2 = ((aa) this).field_a.field_e.field_k;
        if (((aa) this).field_a.field_e != var2) {
          if (param0 != 0) {
            field_c = null;
            ((aa) this).field_g = var2.field_k;
            return var2;
          } else {
            ((aa) this).field_g = var2.field_k;
            return var2;
          }
        } else {
          ((aa) this).field_g = null;
          return null;
        }
    }

    final ma a(ma param0, boolean param1) {
        ma var3 = null;
        if (!param1) {
          L0: {
            if (param0 != null) {
              var3 = param0;
              break L0;
            } else {
              var3 = ((aa) this).field_a.field_e.field_d;
              break L0;
            }
          }
          if (var3 == ((aa) this).field_a.field_e) {
            ((aa) this).field_g = null;
            return null;
          } else {
            ((aa) this).field_g = var3.field_d;
            return var3;
          }
        } else {
          return null;
        }
    }

    final static void a(boolean param0, i param1, int param2) {
        ue.field_b.b((byte) 85, (ma) (Object) param1);
        if (param0) {
            field_h = -20;
            gp.a(param2, param1, -6725);
            return;
        }
        gp.a(param2, param1, -6725);
    }

    final void a(ko param0, boolean param1) {
        if (param1) {
            Object var4 = null;
            ma discarded$0 = ((aa) this).a((ma) null, -99);
            ((aa) this).field_a = param0;
            return;
        }
        ((aa) this).field_a = param0;
    }

    public aa() {
    }

    aa(ko param0) {
        ((aa) this).field_a = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = 0;
        field_d = 3;
        field_f = "<%0> is not on your friend list.";
        field_c = new ph();
    }
}
