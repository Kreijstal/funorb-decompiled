/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dd extends ee {
    private ng field_K;
    boolean field_I;
    static nc field_G;
    static int field_D;
    static rh field_J;
    private int field_H;
    static int field_C;
    static String field_F;
    static String[] field_E;

    final static boolean a(byte param0) {
        if (param0 != 47) {
            field_J = null;
            return cg.b(true);
        }
        return cg.b(true);
    }

    final void c(int param0, int param1, int param2) {
        if (param1 <= 95) {
          field_G = null;
          ((dd) this).a(param0, param2, (byte) -87, -param0 + fa.field_i >> 1769189185, kb.field_b - param2 >> 1470837729);
          return;
        } else {
          ((dd) this).a(param0, param2, (byte) -87, -param0 + fa.field_i >> 1769189185, kb.field_b - param2 >> 1470837729);
          return;
        }
    }

    private final int g(int param0) {
        int var2 = 80 % ((-11 - param0) / 46);
        return !((dd) this).field_I ? 0 : (Object) (Object) ((dd) this).field_K.j(81) != this ? 0 : 256;
    }

    abstract void b(int param0, int param1, int param2);

    boolean f(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_10_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          var2 = this.g(-75);
          var3 = -((dd) this).field_H + var2;
          if (var3 < param0) {
            ((dd) this).field_H = ((dd) this).field_H + (var3 + 8 + -1) / 8;
            break L0;
          } else {
            break L0;
          }
        }
        if (-1 <= var3) {
          if (((dd) this).field_H == 0) {
            if (0 != var2) {
              return false;
            } else {
              L1: {
                if (((dd) this).field_I) {
                  stackOut_18_0 = 0;
                  stackIn_19_0 = stackOut_18_0;
                  break L1;
                } else {
                  stackOut_17_0 = 1;
                  stackIn_19_0 = stackOut_17_0;
                  break L1;
                }
              }
              return stackIn_19_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          ((dd) this).field_H = ((dd) this).field_H + (-16 + (var3 + 1)) / 16;
          if (((dd) this).field_H == 0) {
            if (0 != var2) {
              return false;
            } else {
              L2: {
                if (((dd) this).field_I) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L2;
                } else {
                  stackOut_8_0 = 1;
                  stackIn_10_0 = stackOut_8_0;
                  break L2;
                }
              }
              return stackIn_10_0 != 0;
            }
          } else {
            return false;
          }
        }
    }

    dd(ng param0, int param1, int param2) {
        super(kb.field_b - param1 >> -1982522751, -param2 + fa.field_i >> 1166494081, param1, param2, (dh) null);
        ((dd) this).field_K = param0;
        ((dd) this).field_H = 0;
        ((dd) this).field_I = false;
    }

    final static boolean a(String param0, String param1, int param2) {
        if (!(!ak.a(param0, (byte) -67))) {
            return false;
        }
        if (!(!ra.a(18725, param0))) {
            return false;
        }
        if (em.a(param0, param2 + 25409)) {
            return false;
        }
        if (param1.length() == 0) {
            return true;
        }
        if (ak.a(param0, param1, -75)) {
            return false;
        }
        if (param2 != -25321) {
            dd.i(31);
            if (!(!uk.a(8, param1, param0))) {
                return false;
            }
            if (wc.a(param0, param1, (byte) -107)) {
                return false;
            }
            return true;
        }
        if (!(!uk.a(8, param1, param0))) {
            return false;
        }
        return !wc.a(param0, param1, (byte) -107) ? true : false;
    }

    boolean h(int param0) {
        ((dd) this).field_H = this.g(param0 + -297);
        if (param0 == 229) {
          if (0 == ((dd) this).field_H) {
            if (((dd) this).field_I) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    public static void i(int param0) {
        if (param0 != 256) {
          boolean discarded$2 = dd.a((byte) -87);
          field_J = null;
          field_F = null;
          field_G = null;
          field_E = null;
          return;
        } else {
          field_J = null;
          field_F = null;
          field_G = null;
          field_E = null;
          return;
        }
    }

    final el f(byte param0) {
        el var2 = super.f((byte) -62);
        if (param0 > -60) {
            ((dd) this).field_I = false;
            if (!(var2 == null)) {
                return var2;
            }
            return (el) this;
        }
        if (!(var2 == null)) {
            return var2;
        }
        return (el) this;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = 0;
        if (((dd) this).field_H != 0) {
          if (256 > ((dd) this).field_H) {
            if (oi.field_b != null) {
              if (oi.field_b.field_r >= ((dd) this).field_r) {
                if (oi.field_b.field_m >= ((dd) this).field_h) {
                  var5 = 111 / ((1 - param2) / 43);
                  Geoblox.a(1, oi.field_b);
                  vb.c();
                  ((dd) this).b(0, 20, 0);
                  super.a(-param0 - ((dd) this).field_v, -param1 - ((dd) this).field_m, (byte) 104, param3);
                  id.a(true);
                  oi.field_b.d(param0 + ((dd) this).field_v, ((dd) this).field_m + param1, ((dd) this).field_H);
                  return;
                } else {
                  oi.field_b = new dm(((dd) this).field_r, ((dd) this).field_h);
                  var5 = 111 / ((1 - param2) / 43);
                  Geoblox.a(1, oi.field_b);
                  vb.c();
                  ((dd) this).b(0, 20, 0);
                  super.a(-param0 - ((dd) this).field_v, -param1 - ((dd) this).field_m, (byte) 104, param3);
                  id.a(true);
                  oi.field_b.d(param0 + ((dd) this).field_v, ((dd) this).field_m + param1, ((dd) this).field_H);
                  return;
                }
              } else {
                oi.field_b = new dm(((dd) this).field_r, ((dd) this).field_h);
                var5 = 111 / ((1 - param2) / 43);
                Geoblox.a(1, oi.field_b);
                vb.c();
                ((dd) this).b(0, 20, 0);
                super.a(-param0 - ((dd) this).field_v, -param1 - ((dd) this).field_m, (byte) 104, param3);
                id.a(true);
                oi.field_b.d(param0 + ((dd) this).field_v, ((dd) this).field_m + param1, ((dd) this).field_H);
                return;
              }
            } else {
              oi.field_b = new dm(((dd) this).field_r, ((dd) this).field_h);
              var5 = 111 / ((1 - param2) / 43);
              Geoblox.a(1, oi.field_b);
              vb.c();
              ((dd) this).b(0, 20, 0);
              super.a(-param0 - ((dd) this).field_v, -param1 - ((dd) this).field_m, (byte) 104, param3);
              id.a(true);
              oi.field_b.d(param0 + ((dd) this).field_v, ((dd) this).field_m + param1, ((dd) this).field_H);
              return;
            }
          } else {
            if (param3 != 0) {
              return;
            } else {
              ((dd) this).b(((dd) this).field_v + param0, 20, param1 + ((dd) this).field_m);
              super.a(param0, param1, (byte) -52, param3);
              return;
            }
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = 0;
        field_F = "Loading music";
    }
}
