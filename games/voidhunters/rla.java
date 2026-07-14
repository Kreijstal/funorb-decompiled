/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rla extends dqa implements oo {
    private htb field_w;
    private htb field_z;
    private htb field_y;
    static dja field_v;
    static int field_x;

    final static boolean c(boolean param0) {
        if (!param0) {
          if (upa.field_a) {
            if (0 == pk.field_o) {
              if (-1 != noa.field_q) {
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
        } else {
          rla.i((byte) -52);
          if (upa.field_a) {
            if (0 == pk.field_o) {
              if (-1 == noa.field_q) {
                return false;
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
    }

    final void b(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        var5 = param0 + ((rla) this).field_g;
        if (param2 <= 47) {
          ((rla) this).field_z = null;
          var6 = param3 + ((rla) this).field_r;
          int discarded$2 = loa.field_o.a(dkb.field_a, 20 + var5, var6 - -20, ((rla) this).field_h - 40, ((rla) this).field_f - 50, 16777215, -1, 1, 0, loa.field_o.field_k);
          super.b(param0, param1, 94, param3);
          return;
        } else {
          var6 = param3 + ((rla) this).field_r;
          int discarded$3 = loa.field_o.a(dkb.field_a, 20 + var5, var6 - -20, ((rla) this).field_h - 40, ((rla) this).field_f - 50, 16777215, -1, 1, 0, loa.field_o.field_k);
          super.b(param0, param1, 94, param3);
          return;
        }
    }

    public static void i(byte param0) {
        if (param0 < 45) {
            return;
        }
        field_v = null;
    }

    public rla() {
        super(0, 0, 476, 225, (wwa) null);
        ((rla) this).field_w = new htb(gqb.field_b, (sba) null);
        ((rla) this).field_y = new htb(gsa.field_p, (sba) null);
        ((rla) this).field_z = new htb(cjb.field_a, (sba) null);
        vva var1 = new vva();
        ((rla) this).field_w.field_q = (wwa) (Object) var1;
        ((rla) this).field_y.field_q = (wwa) (Object) var1;
        ((rla) this).field_z.field_q = (wwa) (Object) var1;
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 + -var2 >> -1902442207;
        ((rla) this).field_y.a(((rla) this).field_h + -var3 >> 1515051169, var4, 30, 1, -48 + ((rla) this).field_f + -var2);
        ((rla) this).field_z.a(var4 + ((((rla) this).field_h + -var3 >> 1695873185) + var2), var4, 30, 1, -var2 + -48 + ((rla) this).field_f);
        ((rla) this).field_w.a(((rla) this).field_h + -var3 >> -334053983, var3, 30, 1, -78 + (((rla) this).field_f + -(var2 * 2)));
        ((rla) this).field_y.field_l = (sba) this;
        ((rla) this).field_w.field_l = (sba) this;
        ((rla) this).field_z.field_l = (sba) this;
        ((rla) this).field_w.field_p = tt.field_a;
        ((rla) this).field_z.field_p = dqa.field_u;
        ((rla) this).b(-18756, (shb) (Object) ((rla) this).field_y);
        ((rla) this).b(-18756, (shb) (Object) ((rla) this).field_w);
        ((rla) this).b(-18756, (shb) (Object) ((rla) this).field_z);
    }

    final boolean a(int param0, int param1, shb param2, char param3) {
        if (super.a(param0 + 0, param1, param2, param3)) {
          return true;
        } else {
          if (param1 == 98) {
            return ((rla) this).a(param2, param0 ^ -15834);
          } else {
            if ((param1 ^ -1) != -100) {
              if (param0 != -15834) {
                field_x = -28;
                return false;
              } else {
                return false;
              }
            } else {
              return ((rla) this).a(true, param2);
            }
          }
        }
    }

    public final void a(int param0, int param1, int param2, htb param3, int param4) {
        int var7 = 0;
        var7 = VoidHunters.field_G;
        if (((rla) this).field_y == param3) {
          ot.a(-96);
          if (param0 != 11) {
            ((rla) this).field_y = null;
            return;
          } else {
            return;
          }
        } else {
          if (((rla) this).field_w == param3) {
            kga.a(70);
            if (param0 != 11) {
              ((rla) this).field_y = null;
              return;
            } else {
              return;
            }
          } else {
            if (param3 == ((rla) this).field_z) {
              pr.a(17496);
              if (param0 == 11) {
                return;
              } else {
                ((rla) this).field_y = null;
                return;
              }
            } else {
              if (param0 == 11) {
                return;
              } else {
                ((rla) this).field_y = null;
                return;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = (dja) (Object) new eoa();
        field_x = 1;
    }
}
