/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rgb extends dmb implements ntb {
    private int field_g;
    private int field_d;
    private int field_e;
    static soa field_f;

    public final boolean a(byte param0, tv param1) {
        rgb var3 = null;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        var4 = 106 / ((param0 - 22) / 59);
        var3 = (rgb) (Object) param1;
        if (!super.a((byte) -50, param1)) {
          if (var3.field_g == var3.field_g) {
            if (var3.field_d == var3.field_d) {
              if (var3.field_e != var3.field_e) {
                return true;
              } else {
                return false;
              }
            } else {
              stackOut_5_0 = 1;
              stackIn_7_0 = stackOut_5_0;
              return stackIn_7_0 != 0;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    public final void b(byte param0, tv param1) {
        rgb var5 = null;
        rgb var5_ref = null;
        rgb var6 = null;
        rgb var8 = null;
        rgb var11 = null;
        var5 = null;
        if (param0 < 54) {
          field_f = null;
          super.b((byte) 98, param1);
          var5_ref = (rgb) (Object) param1;
          var6 = var5_ref;
          var5 = var6;
          var6.field_d = var5.field_d;
          var6.field_e = var5.field_e;
          var6.field_g = var5.field_g;
          return;
        } else {
          super.b((byte) 98, param1);
          var11 = (rgb) (Object) param1;
          var5 = var11;
          var8 = var11;
          var8.field_d = var11.field_d;
          var8.field_e = var11.field_e;
          var8.field_g = var11.field_g;
          return;
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            field_f = null;
            field_f = null;
            return;
        }
        field_f = null;
    }

    public final void a(faa param0, boolean param1) {
        super.a(param0, param1);
        ((rgb) this).field_g = param0.i(0, 32);
        ((rgb) this).field_d = param0.i(0, 32);
        ((rgb) this).field_e = param0.i(0, 32);
    }

    final void a(pe param0, boolean param1) {
        Object var4 = null;
        if (!param1) {
          var4 = null;
          ((rgb) this).a((pe) null, true);
          boolean discarded$4 = param0.a((byte) -99, false, ((rgb) this).field_d, ((rgb) this).field_g, ((rgb) this).field_e);
          return;
        } else {
          boolean discarded$5 = param0.a((byte) -99, false, ((rgb) this).field_d, ((rgb) this).field_g, ((rgb) this).field_e);
          return;
        }
    }

    public final void a(tv param0, int param1) {
        int var4 = 0;
        Object var6 = null;
        rgb var6_ref = null;
        rgb var7 = null;
        var6 = null;
        if (param1 <= -19) {
          L0: {
            var7 = (rgb) (Object) param0;
            super.a(param0, -59);
            var4 = 0;
            if (var6_ref.field_g == var7.field_g) {
              break L0;
            } else {
              var4 = 1;
              System.out.println("int x has changed. before=" + var7.field_g + ", now=" + var6_ref.field_g);
              break L0;
            }
          }
          L1: {
            if (var7.field_d == var6_ref.field_d) {
              break L1;
            } else {
              System.out.println("int y has changed. before=" + var7.field_d + ", now=" + var6_ref.field_d);
              var4 = 1;
              break L1;
            }
          }
          L2: {
            if (var6_ref.field_e == var7.field_e) {
              break L2;
            } else {
              var4 = 1;
              System.out.println("int radius has changed. before=" + var7.field_e + ", now=" + var6_ref.field_e);
              break L2;
            }
          }
          if (var4 != 0) {
            System.out.println("This instance of MapClearanceCircle has changed");
            return;
          } else {
            return;
          }
        } else {
          L3: {
            ((rgb) this).field_g = 46;
            var6_ref = (rgb) (Object) param0;
            super.a(param0, -59);
            var4 = 0;
            if (var6_ref.field_g == var6_ref.field_g) {
              break L3;
            } else {
              var4 = 1;
              System.out.println("int x has changed. before=" + var6_ref.field_g + ", now=" + var6_ref.field_g);
              break L3;
            }
          }
          L4: {
            if (var6_ref.field_d == var6_ref.field_d) {
              break L4;
            } else {
              System.out.println("int y has changed. before=" + var6_ref.field_d + ", now=" + var6_ref.field_d);
              var4 = 1;
              break L4;
            }
          }
          L5: {
            if (var6_ref.field_e == var6_ref.field_e) {
              break L5;
            } else {
              var4 = 1;
              System.out.println("int radius has changed. before=" + var6_ref.field_e + ", now=" + var6_ref.field_e);
              break L5;
            }
          }
          if (var4 == 0) {
            return;
          } else {
            System.out.println("This instance of MapClearanceCircle has changed");
            return;
          }
        }
    }

    public final void b(faa param0, int param1) {
        Object var4 = null;
        super.b(param0, -123);
        param0.a(-632, ((rgb) this).field_g, 32);
        param0.a(-632, ((rgb) this).field_d, 32);
        if (param1 > -109) {
          var4 = null;
          ((rgb) this).b((faa) null, -92);
          param0.a(-632, ((rgb) this).field_e, 32);
          return;
        } else {
          param0.a(-632, ((rgb) this).field_e, 32);
          return;
        }
    }

    rgb() {
    }

    rgb(int param0, int param1, int param2) {
        ((rgb) this).field_e = param2;
        ((rgb) this).field_d = param1;
        ((rgb) this).field_g = param0;
    }

    static {
    }
}
