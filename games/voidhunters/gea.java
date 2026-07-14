/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class gea extends iw {
    private int field_J;
    private shb field_K;
    private int field_M;
    private int field_P;
    private int field_O;
    private qpb field_L;
    private int field_Q;
    private oe field_N;

    void b(shb param0, int param1) {
        int var3 = 0;
        ((gea) this).field_K = param0;
        if (iab.field_a != ((gea) this).field_N) {
          if (((gea) this).field_N == gs.field_e) {
            var3 = 99 / ((6 - param1) / 46);
            return;
          } else {
            ((gea) this).field_N = gs.field_e;
            ((gea) this).field_Q = 0;
            var3 = 99 / ((6 - param1) / 46);
            return;
          }
        } else {
          ((gea) this).c(116, ((gea) this).field_K.field_h + 12, ((gea) this).field_K.field_f + ((gea) this).field_O + 12, ((gea) this).field_M);
          ((gea) this).field_Q = 0;
          var3 = 99 / ((6 - param1) / 46);
          return;
        }
    }

    boolean a(int param0, int param1, shb param2, char param3) {
        if (!super.a(param0, param1, param2, param3)) {
          if (null != ((gea) this).field_L) {
            if (param1 != 98) {
              if ((param1 ^ -1) == -100) {
                boolean discarded$12 = ((gea) this).field_L.a(0, param2);
                return false;
              } else {
                return false;
              }
            } else {
              boolean discarded$13 = ((gea) this).field_L.a(0, param2);
              if ((param1 ^ -1) != -100) {
                return false;
              } else {
                boolean discarded$14 = ((gea) this).field_L.a(0, param2);
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

    final boolean j(byte param0) {
        if (param0 != 55) {
          boolean discarded$2 = ((gea) this).a(87);
          ((gea) this).e(-10331);
          return super.j((byte) 55);
        } else {
          ((gea) this).e(-10331);
          return super.j((byte) 55);
        }
    }

    final void e(int param0) {
        if (((gea) this).field_N != null) {
          if (((gea) this).field_N == kk.field_o) {
            ((gea) this).field_L.field_v = 256;
            ((gea) this).field_N = null;
            super.e(param0);
            return;
          } else {
            ((gea) this).c(((gea) this).field_K.field_h + 12, -1860440319, ((gea) this).field_K.field_f + (((gea) this).field_O + 12));
            this.a(((gea) this).field_K, (byte) 71);
            ((gea) this).field_L.field_v = 256;
            ((gea) this).field_N = null;
            super.e(param0);
            return;
          }
        } else {
          super.e(param0);
          return;
        }
    }

    boolean a(int param0) {
        int var3 = 0;
        Object var4 = null;
        var3 = VoidHunters.field_G;
        if (param0 != 248) {
          var4 = null;
          ((gea) this).b((shb) null, 57);
          if (((gea) this).field_N != null) {
            if (((gea) this).field_N != gs.field_e) {
              if (((gea) this).field_N == kk.field_o) {
                ((gea) this).field_Q = ((gea) this).field_Q + 1;
                if (((gea) this).field_Q + 1 != ((gea) this).field_J) {
                  ((gea) this).field_L.field_v = (((gea) this).field_Q << 898318376) / ((gea) this).field_J;
                  return super.a(248);
                } else {
                  ((gea) this).field_N = null;
                  ((gea) this).field_L.field_v = 256;
                  return super.a(248);
                }
              } else {
                return super.a(248);
              }
            } else {
              ((gea) this).field_Q = ((gea) this).field_Q + 1;
              if (((gea) this).field_P != ((gea) this).field_Q + 1) {
                ((gea) this).field_L.field_v = -((((gea) this).field_Q << 255597512) / ((gea) this).field_P) + 256;
                return super.a(248);
              } else {
                ((gea) this).field_N = iab.field_a;
                ((gea) this).c(96, ((gea) this).field_K.field_h + 12, ((gea) this).field_K.field_f + (((gea) this).field_O + 12), ((gea) this).field_M);
                ((gea) this).field_L.field_v = 0;
                ((gea) this).field_Q = 0;
                return super.a(248);
              }
            }
          } else {
            return super.a(248);
          }
        } else {
          if (((gea) this).field_N != null) {
            if (((gea) this).field_N != gs.field_e) {
              if (((gea) this).field_N == kk.field_o) {
                ((gea) this).field_Q = ((gea) this).field_Q + 1;
                if (((gea) this).field_Q + 1 != ((gea) this).field_J) {
                  ((gea) this).field_L.field_v = (((gea) this).field_Q << 898318376) / ((gea) this).field_J;
                  return super.a(248);
                } else {
                  ((gea) this).field_N = null;
                  ((gea) this).field_L.field_v = 256;
                  return super.a(248);
                }
              } else {
                return super.a(248);
              }
            } else {
              ((gea) this).field_Q = ((gea) this).field_Q + 1;
              if (((gea) this).field_P != ((gea) this).field_Q + 1) {
                ((gea) this).field_L.field_v = -((((gea) this).field_Q << 255597512) / ((gea) this).field_P) + 256;
                return super.a(248);
              } else {
                ((gea) this).field_N = iab.field_a;
                ((gea) this).c(96, ((gea) this).field_K.field_h + 12, ((gea) this).field_K.field_f + (((gea) this).field_O + 12), ((gea) this).field_M);
                ((gea) this).field_L.field_v = 0;
                ((gea) this).field_Q = 0;
                return super.a(248);
              }
            }
          } else {
            return super.a(248);
          }
        }
    }

    final void d(int param0) {
        if (gs.field_e == ((gea) this).field_N) {
          return;
        } else {
          ((gea) this).field_Q = 0;
          ((gea) this).field_N = kk.field_o;
          this.a(((gea) this).field_K, (byte) 71);
          ((gea) this).field_K = null;
          if (param0 != 15435) {
            ((gea) this).field_M = 66;
            ((gea) this).field_L.field_v = 0;
            return;
          } else {
            ((gea) this).field_L.field_v = 0;
            return;
          }
        }
    }

    private final void a(shb param0, byte param1) {
        if (!(null == ((gea) this).field_L)) {
            ((gea) this).field_L.b(param1 + -3917);
        }
        if (param0 == null) {
            ((gea) this).field_L = new qpb();
            ((gea) this).b(-18756, (shb) (Object) ((gea) this).field_L);
            if (param1 != 71) {
                ((gea) this).e(85);
            } else {
                ((gea) this).field_K = null;
                return;
            }
            ((gea) this).field_K = null;
            return;
        }
        param0.a(6, param0.field_h, param0.field_f, 1, ((gea) this).field_O + 6);
        ((gea) this).field_L = new qpb(param0);
        ((gea) this).b(-18756, (shb) (Object) ((gea) this).field_L);
        if (param1 != 71) {
            ((gea) this).e(85);
        } else {
            ((gea) this).field_K = null;
            return;
        }
        ((gea) this).field_K = null;
    }

    gea(ida param0, shb param1, int param2, int param3, int param4) {
        super(param0, 12 + param1.field_h, param1.field_f + (12 - -param2));
        ((gea) this).field_M = param4;
        ((gea) this).field_J = param3;
        ((gea) this).field_P = param3;
        ((gea) this).field_O = param2;
        this.a(param1, (byte) 71);
    }

    static {
    }
}
