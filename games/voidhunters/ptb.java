/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ptb extends dmb implements ntb {
    private int field_h;
    static String field_f;
    private int field_d;
    private int field_e;
    private int field_g;

    public final boolean a(byte param0, tv param1) {
        int var3 = 0;
        ptb var4 = null;
        var3 = 122 / ((param0 - 22) / 59);
        var4 = (ptb) (Object) param1;
        if (!super.a((byte) 113, param1)) {
          if (var4.field_h == var4.field_h) {
            if (var4.field_g == var4.field_g) {
              if (var4.field_e == var4.field_e) {
                if (var4.field_d != var4.field_d) {
                  return true;
                } else {
                  return false;
                }
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
          return true;
        }
    }

    final void a(pe param0, boolean param1) {
        Object var4 = null;
        if (!param1) {
          var4 = null;
          boolean discarded$3 = ((ptb) this).a((byte) -16, (tv) null);
          boolean discarded$4 = param0.a(((ptb) this).field_h - -(((ptb) this).field_e / 2), ((ptb) this).field_g - -(((ptb) this).field_d / 2), ((ptb) this).field_g, false, -124, ((ptb) this).field_h);
          return;
        } else {
          boolean discarded$5 = param0.a(((ptb) this).field_h - -(((ptb) this).field_e / 2), ((ptb) this).field_g - -(((ptb) this).field_d / 2), ((ptb) this).field_g, false, -124, ((ptb) this).field_h);
          return;
        }
    }

    final static int a(byte param0, boolean param1, String param2) {
        if (param0 != -107) {
            return 63;
        }
        if (param1) {
            return ssa.field_a.b(param2);
        }
        return boa.field_a.b(param2);
    }

    public final void b(faa param0, int param1) {
        super.b(param0, -124);
        param0.a(-632, ((ptb) this).field_h, 32);
        param0.a(-632, ((ptb) this).field_g, 32);
        if (param1 > -109) {
          return;
        } else {
          param0.a(-632, ((ptb) this).field_e, 32);
          param0.a(-632, ((ptb) this).field_d, 32);
          return;
        }
    }

    public static void b(byte param0) {
        field_f = null;
        if (param0 < 120) {
            field_f = null;
        }
    }

    public final void a(faa param0, boolean param1) {
        super.a(param0, param1);
        ((ptb) this).field_h = param0.i(0, 32);
        ((ptb) this).field_g = param0.i(0, 32);
        ((ptb) this).field_e = param0.i(0, 32);
        ((ptb) this).field_d = param0.i(0, 32);
    }

    public final void b(byte param0, tv param1) {
        ptb var5 = null;
        ptb var6 = null;
        super.b((byte) 58, param1);
        var5 = (ptb) (Object) param1;
        var6 = var5;
        if (param0 <= 54) {
          field_f = null;
          var6.field_d = var5.field_d;
          var6.field_h = var5.field_h;
          var6.field_e = var5.field_e;
          var6.field_g = var5.field_g;
          return;
        } else {
          var6.field_d = var5.field_d;
          var6.field_h = var5.field_h;
          var6.field_e = var5.field_e;
          var6.field_g = var5.field_g;
          return;
        }
    }

    ptb() {
    }

    public final void a(tv param0, int param1) {
        int var4 = 0;
        ptb var5 = null;
        L0: {
          super.a(param0, -57);
          var5 = (ptb) (Object) param0;
          var4 = 0;
          if (var5.field_h == var5.field_h) {
            break L0;
          } else {
            var4 = 1;
            System.out.println("int x has changed. before=" + var5.field_h + ", now=" + var5.field_h);
            break L0;
          }
        }
        L1: {
          if (var5.field_g == var5.field_g) {
            break L1;
          } else {
            var4 = 1;
            System.out.println("int y has changed. before=" + var5.field_g + ", now=" + var5.field_g);
            break L1;
          }
        }
        L2: {
          if (var5.field_e == var5.field_e) {
            break L2;
          } else {
            System.out.println("int width has changed. before=" + var5.field_e + ", now=" + var5.field_e);
            var4 = 1;
            break L2;
          }
        }
        L3: {
          if (var5.field_d != var5.field_d) {
            System.out.println("int height has changed. before=" + var5.field_d + ", now=" + var5.field_d);
            var4 = 1;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (var4 != 0) {
            System.out.println("This instance of MapClearanceRectangle has changed");
            break L4;
          } else {
            break L4;
          }
        }
        if (param1 >= -19) {
          ((ptb) this).field_e = 3;
          return;
        } else {
          return;
        }
    }

    ptb(int param0, int param1, int param2, int param3) {
        ((ptb) this).field_h = param0;
        ((ptb) this).field_e = param2;
        ((ptb) this).field_d = param3;
        ((ptb) this).field_g = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "New";
    }
}
