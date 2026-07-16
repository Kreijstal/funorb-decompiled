/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class mh extends wk {
    private qc field_V;
    static int field_U;
    static lj field_R;
    private lk field_X;
    private int field_Q;
    private int field_T;
    static int field_Y;
    private int field_ab;
    static String field_W;
    private int field_O;
    static int field_Z;
    private int field_N;
    private jg field_S;

    boolean a(lk param0, char param1, int param2, int param3) {
        if (param3 == -14565) {
          if (super.a(param0, param1, param2, param3 ^ 0)) {
            return true;
          } else {
            if (null != ((mh) this).field_S) {
              L0: {
                if (param2 == 98) {
                  boolean discarded$4 = ((mh) this).field_S.a(param0, false);
                  break L0;
                } else {
                  break L0;
                }
              }
              if (-100 != (param2 ^ -1)) {
                return false;
              } else {
                boolean discarded$5 = ((mh) this).field_S.a(param0, false);
                return false;
              }
            } else {
              return false;
            }
          }
        } else {
          return false;
        }
    }

    void a(int param0, lk param1) {
        ((mh) this).field_X = param1;
        if (param0 == 10768) {
          if (mb.field_n != ((mh) this).field_V) {
            if (ub.field_b != ((mh) this).field_V) {
              ((mh) this).field_V = ub.field_b;
              ((mh) this).field_T = 0;
              return;
            } else {
              return;
            }
          } else {
            ((mh) this).a((byte) 126, ((mh) this).field_ab, 12 + ((mh) this).field_Q - -((mh) this).field_X.field_m, 12 + ((mh) this).field_X.field_k);
            ((mh) this).field_T = 0;
            return;
          }
        } else {
          boolean discarded$6 = ((mh) this).e((byte) -12);
          if (mb.field_n != ((mh) this).field_V) {
            if (ub.field_b == ((mh) this).field_V) {
              return;
            } else {
              ((mh) this).field_V = ub.field_b;
              ((mh) this).field_T = 0;
              return;
            }
          } else {
            ((mh) this).a((byte) 126, ((mh) this).field_ab, 12 + ((mh) this).field_Q - -((mh) this).field_X.field_m, 12 + ((mh) this).field_X.field_k);
            ((mh) this).field_T = 0;
            return;
          }
        }
    }

    public static void m(int param0) {
        field_R = null;
        field_W = null;
        if (param0 != -16167) {
            field_U = 91;
        }
    }

    final void i(byte param0) {
        int var2 = -66 / ((31 - param0) / 35);
        if (null != ((mh) this).field_V) {
            if (!(((mh) this).field_V == vb.field_g)) {
                ((mh) this).c(-463076575, ((mh) this).field_X.field_k + 12, ((mh) this).field_X.field_m + 12 - -((mh) this).field_Q);
                this.b(((mh) this).field_X, 6);
            }
            ((mh) this).field_V = null;
            ((mh) this).field_S.field_E = 256;
        }
        super.i((byte) -58);
    }

    mh(pf param0, lk param1, int param2, int param3, int param4) {
        super(param0, 12 + param1.field_k, param2 + (12 - -param1.field_m));
        ((mh) this).field_Q = param2;
        ((mh) this).field_ab = param4;
        ((mh) this).field_O = param3;
        ((mh) this).field_N = param3;
        this.b(param1, 6);
    }

    final static void a(int param0, int param1, int param2, oh param3, int param4, int param5, int param6, tj param7, int param8, int param9, int param10, byte param11, int param12, int param13, int param14, tj param15, int param16, int param17, int param18, oh param19, oh param20) {
        lb.a(param7, param12, -101, param15);
        hh.b(param10, param6, param1, param13, 0);
        l.a(param0, (byte) 127, param4);
        uk.a(param3, param18, param9, param19, param17, (byte) 82);
        int var21 = 16 % ((0 - param11) / 41);
        di.a(param16, 0, param14, param20);
        ti.a(param2, param8, param5, (byte) 102);
    }

    boolean e(byte param0) {
        int var3 = 0;
        var3 = Bounce.field_N;
        if (param0 != 21) {
          ((mh) this).i((byte) 37);
          if (null != ((mh) this).field_V) {
            if (ub.field_b == ((mh) this).field_V) {
              int fieldTemp$4 = ((mh) this).field_T + 1;
              ((mh) this).field_T = ((mh) this).field_T + 1;
              if (fieldTemp$4 != ((mh) this).field_N) {
                ((mh) this).field_S.field_E = -((((mh) this).field_T << 1255572680) / ((mh) this).field_N) + 256;
                return super.e((byte) 21);
              } else {
                ((mh) this).field_V = mb.field_n;
                ((mh) this).a((byte) 126, ((mh) this).field_ab, ((mh) this).field_Q + 12 - -((mh) this).field_X.field_m, ((mh) this).field_X.field_k + 12);
                ((mh) this).field_T = 0;
                ((mh) this).field_S.field_E = 0;
                return super.e((byte) 21);
              }
            } else {
              if (vb.field_g == ((mh) this).field_V) {
                int fieldTemp$5 = ((mh) this).field_T + 1;
                ((mh) this).field_T = ((mh) this).field_T + 1;
                if (fieldTemp$5 != ((mh) this).field_O) {
                  ((mh) this).field_S.field_E = (((mh) this).field_T << -1488907000) / ((mh) this).field_O;
                  return super.e((byte) 21);
                } else {
                  ((mh) this).field_V = null;
                  ((mh) this).field_S.field_E = 256;
                  return super.e((byte) 21);
                }
              } else {
                return super.e((byte) 21);
              }
            }
          } else {
            return super.e((byte) 21);
          }
        } else {
          if (null != ((mh) this).field_V) {
            if (ub.field_b == ((mh) this).field_V) {
              int fieldTemp$6 = ((mh) this).field_T + 1;
              ((mh) this).field_T = ((mh) this).field_T + 1;
              if (fieldTemp$6 != ((mh) this).field_N) {
                ((mh) this).field_S.field_E = -((((mh) this).field_T << 1255572680) / ((mh) this).field_N) + 256;
                return super.e((byte) 21);
              } else {
                ((mh) this).field_V = mb.field_n;
                ((mh) this).a((byte) 126, ((mh) this).field_ab, ((mh) this).field_Q + 12 - -((mh) this).field_X.field_m, ((mh) this).field_X.field_k + 12);
                ((mh) this).field_T = 0;
                ((mh) this).field_S.field_E = 0;
                return super.e((byte) 21);
              }
            } else {
              if (vb.field_g == ((mh) this).field_V) {
                int fieldTemp$7 = ((mh) this).field_T + 1;
                ((mh) this).field_T = ((mh) this).field_T + 1;
                if (fieldTemp$7 != ((mh) this).field_O) {
                  ((mh) this).field_S.field_E = (((mh) this).field_T << -1488907000) / ((mh) this).field_O;
                  return super.e((byte) 21);
                } else {
                  ((mh) this).field_V = null;
                  ((mh) this).field_S.field_E = 256;
                  return super.e((byte) 21);
                }
              } else {
                return super.e((byte) 21);
              }
            }
          } else {
            return super.e((byte) 21);
          }
        }
    }

    final static void a(java.awt.Canvas param0, byte param1) {
        if (param1 < 77) {
            return;
        }
        le.a(-1, (java.awt.Component) (Object) param0);
        ka.a((java.awt.Component) (Object) param0, (byte) -80);
        if (null != hg.field_k) {
            hg.field_k.a(55, (java.awt.Component) (Object) param0);
        }
    }

    private final void b(lk param0, int param1) {
        Object var4 = null;
        L0: {
          if (null != ((mh) this).field_S) {
            ((mh) this).field_S.c(2);
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 == 6) {
          if (param0 == null) {
            ((mh) this).field_S = new jg();
            ((mh) this).b((lk) (Object) ((mh) this).field_S, true);
            ((mh) this).field_X = null;
            return;
          } else {
            param0.b(param0.field_m, param1 + 74, param0.field_k, 6, ((mh) this).field_Q + 6);
            ((mh) this).field_S = new jg(param0);
            ((mh) this).b((lk) (Object) ((mh) this).field_S, true);
            ((mh) this).field_X = null;
            return;
          }
        } else {
          var4 = null;
          ((mh) this).a(112, (lk) null);
          if (param0 == null) {
            ((mh) this).field_S = new jg();
            ((mh) this).b((lk) (Object) ((mh) this).field_S, true);
            ((mh) this).field_X = null;
            return;
          } else {
            param0.b(param0.field_m, param1 + 74, param0.field_k, 6, ((mh) this).field_Q + 6);
            ((mh) this).field_S = new jg(param0);
            ((mh) this).b((lk) (Object) ((mh) this).field_S, true);
            ((mh) this).field_X = null;
            return;
          }
        }
    }

    final boolean f(byte param0) {
        ((mh) this).i((byte) -119);
        if (param0 != -33) {
            ((mh) this).field_T = -104;
            return super.f((byte) -33);
        }
        return super.f((byte) -33);
    }

    final void l(int param0) {
        if (ub.field_b == ((mh) this).field_V) {
          return;
        } else {
          ((mh) this).field_T = 0;
          if (param0 != -4993) {
            mh.m(-111);
            ((mh) this).field_V = vb.field_g;
            this.b(((mh) this).field_X, param0 + 4999);
            ((mh) this).field_S.field_E = 0;
            ((mh) this).field_X = null;
            return;
          } else {
            ((mh) this).field_V = vb.field_g;
            this.b(((mh) this).field_X, param0 + 4999);
            ((mh) this).field_S.field_E = 0;
            ((mh) this).field_X = null;
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_W = "Retry";
        field_Z = -1;
        field_R = new lj();
    }
}
