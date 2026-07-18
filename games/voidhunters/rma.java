/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rma extends mfb {
    static dja field_d;
    static int field_b;
    static dja field_c;

    final static void a(int param0, byte param1) {
        if (di.field_l == null) {
          if (param1 != 47) {
            rma.a(112, (byte) -50);
            return;
          } else {
            return;
          }
        } else {
          di.field_l.a((byte) 76, Integer.toString(param0), dpa.field_p);
          if (param1 == 47) {
            return;
          } else {
            rma.a(112, (byte) -50);
            return;
          }
        }
    }

    final int g(int param0) {
        if (param0 != 2769) {
            return 45;
        }
        return coa.field_f;
    }

    rma() {
    }

    final int a(boolean param0) {
        if (param0) {
            return -62;
        }
        return 31;
    }

    final int a(int param0) {
        if (param0 != 0) {
            field_c = null;
            return mmb.field_g;
        }
        return mmb.field_g;
    }

    final static void b(int param0, byte param1) {
        kib.field_d = 3 & param0 >> 4;
        if (kib.field_d > 2) {
            kib.field_d = 2;
            idb.field_p = (13 & param0) >> 2;
            lla.field_h = param0 & 3;
            if (idb.field_p <= 2) {
                if (2 < lla.field_h) {
                    lla.field_h = 2;
                    return;
                }
                return;
            }
            idb.field_p = 2;
            if (2 >= lla.field_h) {
                return;
            }
            lla.field_h = 2;
            return;
        }
        idb.field_p = (13 & param0) >> 2;
        lla.field_h = param0 & 3;
        if (idb.field_p > 2) {
            idb.field_p = 2;
            if (2 < lla.field_h) {
                lla.field_h = 2;
                return;
            }
            return;
        }
        if (2 < lla.field_h) {
            lla.field_h = 2;
            return;
        }
    }

    public static void l(int param0) {
        field_c = null;
        field_d = null;
    }

    final int g(byte param0) {
        if (param0 >= -12) {
            return -116;
        }
        return qca.field_yb;
    }

    final int d(byte param0) {
        if (param0 > -52) {
            return -3;
        }
        return eca.field_e;
    }

    final boolean i(int param0) {
        if (param0 != 1024) {
            field_b = 100;
            return true;
        }
        return true;
    }

    final int b(boolean param0) {
        if (param0) {
            field_b = 40;
            return uab.field_b;
        }
        return uab.field_b;
    }

    final int a(byte param0) {
        int var2 = -79 % ((-48 - param0) / 43);
        return 1;
    }

    final int b(int param0) {
        int var2 = -115 / ((param0 - 7) / 47);
        return gtb.field_c;
    }

    final boolean h(byte param0) {
        if (param0 < 18) {
            return true;
        }
        return false;
    }

    final int k(int param0) {
        if (param0 != 0) {
            boolean discarded$0 = ((rma) this).h((byte) 56);
            return 3;
        }
        return 3;
    }

    final int c(byte param0) {
        int var2 = -97 % ((param0 - 75) / 46);
        return uaa.field_o;
    }

    final int f(byte param0) {
        if (param0 < 0) {
            int discarded$0 = ((rma) this).b(true);
            return brb.field_o;
        }
        return brb.field_o;
    }

    final int c(int param0) {
        if (param0 != 0) {
            field_c = null;
            return dr.field_a;
        }
        return dr.field_a;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = (dja) (Object) new bh();
        field_b = 0;
        field_c = (dja) (Object) new dkb();
    }
}
