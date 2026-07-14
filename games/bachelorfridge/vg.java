/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vg extends cj {
    eaa field_m;
    static sna field_k;
    static v field_n;
    static Boolean field_l;

    final void a(op param0, boolean param1) {
        bf var3 = null;
        int var4 = 0;
        Object var5 = null;
        var4 = BachelorFridge.field_y;
        var3 = (bf) (Object) ((vg) this).field_m.b((byte) 90);
        if (param1) {
          var5 = null;
          at discarded$1 = ((vg) this).a(-71, (gj) null);
          L0: while (true) {
            if (var3 != null) {
              var3.a(param0, -26281);
              var3 = (bf) (Object) ((vg) this).field_m.c(0);
              continue L0;
            } else {
              return;
            }
          }
        } else {
          L1: while (true) {
            if (var3 != null) {
              var3.a(param0, -26281);
              var3 = (bf) (Object) ((vg) this).field_m.c(0);
              continue L1;
            } else {
              return;
            }
          }
        }
    }

    final void a(byte param0, bf param1) {
        if (param0 != -28) {
            field_l = null;
            ((vg) this).field_m.a((bw) (Object) param1, true);
            return;
        }
        ((vg) this).field_m.a((bw) (Object) param1, true);
    }

    vg(lu param0) {
        super(6);
        int var2 = 0;
        int var3 = 0;
        ((vg) this).field_m = new eaa();
        var2 = param0.b(16711935);
        L0: while (true) {
          var2--;
          if (-1 >= (var2 ^ -1)) {
            var3 = param0.b(16711935);
            if (var3 == 0) {
              ((vg) this).field_m.a((bw) (Object) new qja(param0), true);
              continue L0;
            } else {
              if ((var3 ^ -1) != -2) {
                throw new IllegalStateException();
              } else {
                ((vg) this).field_m.a((bw) (Object) new dla(param0), true);
                continue L0;
              }
            }
          } else {
          }
        }
    }

    public static void c(byte param0) {
        field_n = null;
        if (param0 <= 64) {
            field_l = null;
            field_l = null;
            field_k = null;
            return;
        }
        field_l = null;
        field_k = null;
    }

    final at a(int param0, gj param1) {
        Object var4 = null;
        if (param0 != 5) {
          var4 = null;
          ((vg) this).a((byte) -84, (bf) null);
          return (at) (Object) new wea(param1, (vg) this);
        } else {
          return (at) (Object) new wea(param1, (vg) this);
        }
    }

    final void a(lu param0, int param1) {
        bf var3 = null;
        int var4 = 0;
        var4 = BachelorFridge.field_y;
        param0.d(((vg) this).field_m.g(param1 ^ param1), param1 ^ -9);
        var3 = (bf) (Object) ((vg) this).field_m.b((byte) 90);
        L0: while (true) {
          if (var3 != null) {
            L1: {
              if (var3 instanceof qja) {
                param0.d(0, 0);
                break L1;
              } else {
                if (var3 instanceof dla) {
                  param0.d(1, 0);
                  break L1;
                } else {
                  throw new IllegalStateException();
                }
              }
            }
            var3.a(41, param0);
            var3 = (bf) (Object) ((vg) this).field_m.c(0);
            continue L0;
          } else {
            return;
          }
        }
    }

    final static void a(kv param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        if (param2 != 22997) {
          vg.c((byte) -13);
          qg.a(param0.field_v, param4, param0, param1, 0, 0, 0, 0, dg.field_e, 0, param3, param7, param6, 0, 0, param5, param8);
          return;
        } else {
          qg.a(param0.field_v, param4, param0, param1, 0, 0, 0, 0, dg.field_e, 0, param3, param7, param6, 0, 0, param5, param8);
          return;
        }
    }

    public vg() {
        super(7);
        ((vg) this).field_m = new eaa();
    }

    static {
    }
}
