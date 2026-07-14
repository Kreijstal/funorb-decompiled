/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mi extends cj {
    static String field_Jb;
    private cj field_Lb;
    static ja field_Mb;
    private cj field_Fb;
    static th field_Kb;
    static int field_Gb;
    static String field_Nb;
    static cj[] field_Ib;
    static int field_Hb;

    mi(long param0, ja param1, ja param2, int param3, cj param4, String param5) {
        this(param0, (cj) null, param4, param5);
        ((mi) this).field_Lb.field_lb = param3;
        ((mi) this).field_Lb.field_rb = param2;
        ((mi) this).field_Lb.field_O = param1;
    }

    mi(long param0, mi param1, String param2) {
        this(param0, param1.field_Lb, param1.field_Fb, param2);
    }

    final void a(int param0, byte param1, int param2, int param3, int param4, int param5) {
        ((mi) this).a(param5, param0, param3, param4, -3344);
        int var7 = 121 / ((param1 - -34) / 45);
        this.e(true, param2);
    }

    final int a(byte param0, int param1) {
        if (param0 <= 92) {
            this.e(false, -106);
            return param1 + (((mi) this).field_Lb.e(0) + ((mi) this).field_Fb.e(0));
        }
        return param1 + (((mi) this).field_Lb.e(0) + ((mi) this).field_Fb.e(0));
    }

    private final void e(boolean param0, int param1) {
        int var3 = 0;
        if (!param0) {
            mi.b(-119, -84);
            ((mi) this).field_Lb.a(((mi) this).field_z, 0, ((mi) this).field_Lb.e(0), 0, -3344);
            var3 = param1 + ((mi) this).field_Lb.field_zb;
            ((mi) this).field_Fb.a(((mi) this).field_z, 0, ((mi) this).field_zb - var3, var3, -3344);
            return;
        }
        ((mi) this).field_Lb.a(((mi) this).field_z, 0, ((mi) this).field_Lb.e(0), 0, -3344);
        var3 = param1 + ((mi) this).field_Lb.field_zb;
        ((mi) this).field_Fb.a(((mi) this).field_z, 0, ((mi) this).field_zb - var3, var3, -3344);
    }

    public static void d(boolean param0) {
        field_Kb = null;
        field_Ib = null;
        if (param0) {
          mi.d(false);
          field_Nb = null;
          field_Mb = null;
          field_Jb = null;
          return;
        } else {
          field_Nb = null;
          field_Mb = null;
          field_Jb = null;
          return;
        }
    }

    final static void a(jh param0, int param1) {
        jh var2 = null;
        int var3 = 0;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param1 < -52) {
          param0.a(true);
          var2 = (jh) (Object) tn.field_C.c(79);
          L0: while (true) {
            if (var2 != null) {
              if (var2.a(param0, (byte) -53)) {
                var2 = (jh) (Object) tn.field_C.b(6);
                continue L0;
              } else {
                if (var2 != null) {
                  vc.a((br) (Object) var2, (br) (Object) param0, true);
                  return;
                } else {
                  tn.field_C.a((br) (Object) param0, false);
                  return;
                }
              }
            } else {
              if (var2 != null) {
                vc.a((br) (Object) var2, (br) (Object) param0, true);
                return;
              } else {
                tn.field_C.a((br) (Object) param0, false);
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    private mi(long param0, cj param1, cj param2, String param3) {
        super(param0, (cj) null);
        ((mi) this).field_Lb = new cj(0L, param1);
        ((mi) this).field_Fb = new cj(0L, param2);
        ((mi) this).field_Fb.field_wb = param3;
        ((mi) this).a((byte) 50, ((mi) this).field_Lb);
        ((mi) this).a((byte) 50, ((mi) this).field_Fb);
        ((mi) this).f(-128);
    }

    final static void b(int param0, int param1) {
        ga var2 = ma.field_a;
        var2.b((byte) -35, param1);
        var2.a(109, param0);
        var2.a(-116, 0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Jb = "Report <%0> for abuse";
        field_Kb = new th();
        field_Nb = "Visit the Account Management section on the main site to view.";
    }
}
