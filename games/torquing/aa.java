/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class aa extends im {
    private int field_P;
    private int field_O;
    private int field_W;
    static ce field_U;
    private int field_R;
    private int field_N;
    private qd field_S;
    static byte[] field_X;
    private gm field_V;
    static volatile long field_Q;
    private fq field_T;

    private final void b(byte param0, gm param1) {
        int var3 = 0;
        L0: {
          if (null != ((aa) this).field_T) {
            ((aa) this).field_T.f(0);
            break L0;
          } else {
            break L0;
          }
        }
        var3 = 54 % ((-33 - param0) / 56);
        if (param1 != null) {
          param1.a((byte) 125, 6, ((aa) this).field_N + 6, param1.field_o, param1.field_p);
          ((aa) this).field_T = new fq(param1);
          ((aa) this).a((gm) (Object) ((aa) this).field_T, -6938);
          ((aa) this).field_V = null;
          return;
        } else {
          ((aa) this).field_T = new fq();
          ((aa) this).a((gm) (Object) ((aa) this).field_T, -6938);
          ((aa) this).field_V = null;
          return;
        }
    }

    void c(gm param0, int param1) {
        ((aa) this).field_V = param0;
        if (param1 == 33) {
          if (((aa) this).field_S != gn.field_b) {
            if (((aa) this).field_S != gf.field_j) {
              ((aa) this).field_S = gf.field_j;
              ((aa) this).field_P = 0;
              return;
            } else {
              return;
            }
          } else {
            ((aa) this).b(((aa) this).field_N + 12 + ((aa) this).field_V.field_o, (byte) -15, ((aa) this).field_O, ((aa) this).field_V.field_p + 12);
            ((aa) this).field_P = 0;
            return;
          }
        } else {
          return;
        }
    }

    aa(ln param0, gm param1, int param2, int param3, int param4) {
        super(param0, param1.field_p + 12, param1.field_o + 12 + param2);
        ((aa) this).field_R = param3;
        ((aa) this).field_W = param3;
        ((aa) this).field_O = param4;
        ((aa) this).field_N = param2;
        this.b((byte) -124, param1);
    }

    public static void m(int param0) {
        field_X = null;
        if (param0 != 0) {
            return;
        }
        field_U = null;
    }

    boolean h(int param0) {
        int var3 = 0;
        var3 = Torquing.field_u;
        if (((aa) this).field_S != null) {
          if (((aa) this).field_S != gf.field_j) {
            if (ql.field_s == ((aa) this).field_S) {
              ((aa) this).field_P = ((aa) this).field_P + 1;
              if (((aa) this).field_R == ((aa) this).field_P + 1) {
                ((aa) this).field_T.field_D = 256;
                ((aa) this).field_S = null;
                if (param0 != -7) {
                  ((aa) this).g((byte) 13);
                  return super.h(param0 + 0);
                } else {
                  return super.h(param0 + 0);
                }
              } else {
                ((aa) this).field_T.field_D = (((aa) this).field_P << -1195325816) / ((aa) this).field_R;
                if (param0 != -7) {
                  ((aa) this).g((byte) 13);
                  return super.h(param0 + 0);
                } else {
                  return super.h(param0 + 0);
                }
              }
            } else {
              if (param0 != -7) {
                ((aa) this).g((byte) 13);
                return super.h(param0 + 0);
              } else {
                return super.h(param0 + 0);
              }
            }
          } else {
            ((aa) this).field_P = ((aa) this).field_P + 1;
            if (((aa) this).field_W == ((aa) this).field_P + 1) {
              ((aa) this).field_S = gn.field_b;
              ((aa) this).b(((aa) this).field_V.field_o + (12 + ((aa) this).field_N), (byte) -15, ((aa) this).field_O, 12 - -((aa) this).field_V.field_p);
              ((aa) this).field_T.field_D = 0;
              ((aa) this).field_P = 0;
              if (param0 == -7) {
                return super.h(param0 + 0);
              } else {
                ((aa) this).g((byte) 13);
                return super.h(param0 + 0);
              }
            } else {
              ((aa) this).field_T.field_D = 256 - (((aa) this).field_P << -1936665496) / ((aa) this).field_W;
              if (param0 == -7) {
                return super.h(param0 + 0);
              } else {
                ((aa) this).g((byte) 13);
                return super.h(param0 + 0);
              }
            }
          }
        } else {
          if (param0 != -7) {
            ((aa) this).g((byte) 13);
            return super.h(param0 + 0);
          } else {
            return super.h(param0 + 0);
          }
        }
    }

    boolean a(int param0, gm param1, char param2, int param3) {
        int var5 = 0;
        var5 = 55 % ((-33 - param3) / 57);
        if (!super.a(param0, param1, param2, 36)) {
          if (((aa) this).field_T != null) {
            if (param0 != 98) {
              if (-100 == param0) {
                boolean discarded$12 = ((aa) this).field_T.a(param1, false);
                return false;
              } else {
                return false;
              }
            } else {
              boolean discarded$13 = ((aa) this).field_T.a(param1, false);
              if (-100 != param0) {
                return false;
              } else {
                boolean discarded$14 = ((aa) this).field_T.a(param1, false);
                return false;
              }
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    final void j(int param0) {
        if (null == ((aa) this).field_S) {
            super.j(param0);
            return;
        }
        if (ql.field_s != ((aa) this).field_S) {
            ((aa) this).a(((aa) this).field_V.field_p + 12, (byte) -25, ((aa) this).field_N + 12 + ((aa) this).field_V.field_o);
            this.b((byte) -101, ((aa) this).field_V);
        } else {
            ((aa) this).field_S = null;
            ((aa) this).field_T.field_D = 256;
            super.j(param0);
            return;
        }
        ((aa) this).field_S = null;
        ((aa) this).field_T.field_D = 256;
        super.j(param0);
    }

    final void g(byte param0) {
        if (gf.field_j != ((aa) this).field_S) {
          ((aa) this).field_S = ql.field_s;
          ((aa) this).field_P = 0;
          if (param0 <= 122) {
            aa.m(2);
            this.b((byte) 83, ((aa) this).field_V);
            ((aa) this).field_V = null;
            ((aa) this).field_T.field_D = 0;
            return;
          } else {
            this.b((byte) 83, ((aa) this).field_V);
            ((aa) this).field_V = null;
            ((aa) this).field_T.field_D = 0;
            return;
          }
        } else {
          return;
        }
    }

    final boolean a(byte param0) {
        ((aa) this).j(0);
        if (param0 < 114) {
            return false;
        }
        return super.a((byte) 122);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_U = new ce();
        field_Q = 0L;
        field_X = new byte[520];
    }
}
