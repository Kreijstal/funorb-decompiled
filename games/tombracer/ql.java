/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ql extends od {
    static kh field_k;
    static String[] field_m;
    static float field_l;

    final static vb a(int param0, u param1, byte param2, int param3, int param4) {
        int var5 = 28 % ((param2 - -76) / 32);
        return pea.a(qia.b(param1, param0, param3, param4), 1);
    }

    final static void a(int param0, int param1) {
        int var3 = 0;
        aca var4 = null;
        var3 = TombRacer.field_G ? 1 : 0;
        if (param1 != -28521) {
          return;
        } else {
          var4 = (aca) (Object) io.field_d.f(-80);
          L0: while (true) {
            if (var4 == null) {
              return;
            } else {
              jea.a(param0, 1325, var4);
              var4 = (aca) (Object) io.field_d.e(113);
              continue L0;
            }
          }
        }
    }

    protected ql() {
    }

    public static void a(boolean param0) {
        if (!param0) {
            return;
        }
        field_k = null;
        field_m = null;
    }

    final static void a(int param0, pha param1) {
        pha var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        var3 = -66 / ((param0 - 45) / 59);
        param1.p(118);
        var2 = (pha) (Object) uma.field_b.f(-80);
        L0: while (true) {
          if (var2 != null) {
            if (var2.a((byte) 123, param1)) {
              var2 = (pha) (Object) uma.field_b.e(121);
              continue L0;
            } else {
              if (var2 != null) {
                ln.a((vg) (Object) var2, (vg) (Object) param1, (byte) 24);
                return;
              } else {
                uma.field_b.b((byte) -108, (vg) (Object) param1);
                return;
              }
            }
          } else {
            if (var2 != null) {
              ln.a((vg) (Object) var2, (vg) (Object) param1, (byte) 24);
              return;
            } else {
              uma.field_b.b((byte) -108, (vg) (Object) param1);
              return;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = 1.0f;
    }
}
