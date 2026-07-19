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
            field_c = (dja) null;
            return mmb.field_g;
        }
        return mmb.field_g;
    }

    final static void b(int param0, byte param1) {
        if (param1 == 71) {
          kib.field_d = 3 & param0 >> 2061097700;
          if ((kib.field_d ^ -1) >= -3) {
            idb.field_p = (13 & param0) >> -1884757342;
            lla.field_h = param0 & 3;
            if (-3 <= (idb.field_p ^ -1)) {
              if (2 < lla.field_h) {
                lla.field_h = 2;
                return;
              } else {
                return;
              }
            } else {
              idb.field_p = 2;
              if (2 < lla.field_h) {
                lla.field_h = 2;
                return;
              } else {
                return;
              }
            }
          } else {
            kib.field_d = 2;
            idb.field_p = (13 & param0) >> -1884757342;
            lla.field_h = param0 & 3;
            if (-3 > (idb.field_p ^ -1)) {
              idb.field_p = 2;
              if (2 >= lla.field_h) {
                return;
              } else {
                lla.field_h = 2;
                return;
              }
            } else {
              if (2 < lla.field_h) {
                lla.field_h = 2;
                return;
              } else {
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    public static void l(int param0) {
        field_c = null;
        if (param0 != 3) {
            rma.b(-77, (byte) 54);
            field_d = null;
            return;
        }
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
        boolean discarded$0 = false;
        if (param0 != 0) {
            discarded$0 = this.h((byte) 56);
            return 3;
        }
        return 3;
    }

    final int c(byte param0) {
        int var2 = -97 % ((param0 - 75) / 46);
        return uaa.field_o;
    }

    final int f(byte param0) {
        int discarded$0 = 0;
        if (param0 < 0) {
            discarded$0 = this.b(true);
            return brb.field_o;
        }
        return brb.field_o;
    }

    final int c(int param0) {
        if (param0 != 0) {
            field_c = (dja) null;
            return dr.field_a;
        }
        return dr.field_a;
    }

    static {
        field_d = (dja) ((Object) new bh());
        field_b = 0;
        field_c = (dja) ((Object) new dkb());
    }
}
