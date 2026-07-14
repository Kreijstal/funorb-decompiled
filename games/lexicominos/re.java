/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class re extends ql {
    private w field_W;
    private int field_Y;
    private int field_bb;
    static java.math.BigInteger field_T;
    private int field_S;
    private ia field_U;
    private rb field_R;
    static String field_cb;
    private int field_V;
    private int field_ab;
    static ge field_X;
    static int field_Z;

    boolean f(byte param0) {
        int var3 = 0;
        var3 = Lexicominos.field_L ? 1 : 0;
        if (((re) this).field_R != null) {
          if (((re) this).field_R == ok.field_k) {
            ((re) this).field_V = ((re) this).field_V + 1;
            if (((re) this).field_V + 1 != ((re) this).field_S) {
              ((re) this).field_U.field_E = -((((re) this).field_V << -265658136) / ((re) this).field_S) + 256;
              if (param0 >= -21) {
                return false;
              } else {
                return super.f((byte) -102);
              }
            } else {
              ((re) this).field_R = fb.field_f;
              ((re) this).a(12 + ((re) this).field_W.field_j, (byte) -91, ((re) this).field_Y, ((re) this).field_ab + 12 + ((re) this).field_W.field_v);
              ((re) this).field_U.field_E = 0;
              ((re) this).field_V = 0;
              if (param0 >= -21) {
                return false;
              } else {
                return super.f((byte) -102);
              }
            }
          } else {
            if (((re) this).field_R == rl.field_H) {
              ((re) this).field_V = ((re) this).field_V + 1;
              if (((re) this).field_V + 1 == ((re) this).field_bb) {
                ((re) this).field_U.field_E = 256;
                ((re) this).field_R = null;
                if (param0 >= -21) {
                  return false;
                } else {
                  return super.f((byte) -102);
                }
              } else {
                ((re) this).field_U.field_E = (((re) this).field_V << 303147688) / ((re) this).field_bb;
                if (param0 >= -21) {
                  return false;
                } else {
                  return super.f((byte) -102);
                }
              }
            } else {
              if (param0 >= -21) {
                return false;
              } else {
                return super.f((byte) -102);
              }
            }
          }
        } else {
          if (param0 >= -21) {
            return false;
          } else {
            return super.f((byte) -102);
          }
        }
    }

    public static void i(byte param0) {
        field_X = null;
        field_T = null;
        field_cb = null;
        if (param0 != -27) {
            field_cb = null;
        }
    }

    re(eg param0, w param1, int param2, int param3, int param4) {
        super(param0, param1.field_j + 12, param1.field_v + (param2 + 12));
        ((re) this).field_ab = param2;
        ((re) this).field_bb = param3;
        ((re) this).field_S = param3;
        ((re) this).field_Y = param4;
        this.a(param1, (byte) 125);
    }

    boolean a(char param0, int param1, w param2, byte param3) {
        int var5 = 0;
        if (!super.a(param0, param1, param2, (byte) 99)) {
          if (null != ((re) this).field_U) {
            if (param1 != 98) {
              if ((param1 ^ -1) == -100) {
                boolean discarded$3 = ((re) this).field_U.a((byte) 44, param2);
                var5 = -75 / ((-13 - param3) / 55);
                return false;
              } else {
                var5 = -75 / ((-13 - param3) / 55);
                return false;
              }
            } else {
              boolean discarded$4 = ((re) this).field_U.a((byte) 44, param2);
              if ((param1 ^ -1) != -100) {
                var5 = -75 / ((-13 - param3) / 55);
                return false;
              } else {
                boolean discarded$5 = ((re) this).field_U.a((byte) 44, param2);
                var5 = -75 / ((-13 - param3) / 55);
                return false;
              }
            }
          } else {
            var5 = -75 / ((-13 - param3) / 55);
            return false;
          }
        } else {
          return true;
        }
    }

    private final void a(w param0, byte param1) {
        Object var4 = null;
        if (param1 == 125) {
          L0: {
            if (null != ((re) this).field_U) {
              ((re) this).field_U.b((byte) -118);
              break L0;
            } else {
              break L0;
            }
          }
          if (param0 != null) {
            param0.a(param0.field_v, param0.field_j, true, ((re) this).field_ab + 6, 6);
            ((re) this).field_U = new ia(param0);
            ((re) this).b((byte) 57, (w) (Object) ((re) this).field_U);
            ((re) this).field_W = null;
            return;
          } else {
            ((re) this).field_U = new ia();
            ((re) this).b((byte) 57, (w) (Object) ((re) this).field_U);
            ((re) this).field_W = null;
            return;
          }
        } else {
          L1: {
            var4 = null;
            this.a((w) null, (byte) -90);
            if (null != ((re) this).field_U) {
              ((re) this).field_U.b((byte) -118);
              break L1;
            } else {
              break L1;
            }
          }
          if (param0 != null) {
            param0.a(param0.field_v, param0.field_j, true, ((re) this).field_ab + 6, 6);
            ((re) this).field_U = new ia(param0);
            ((re) this).b((byte) 57, (w) (Object) ((re) this).field_U);
            ((re) this).field_W = null;
            return;
          } else {
            ((re) this).field_U = new ia();
            ((re) this).b((byte) 57, (w) (Object) ((re) this).field_U);
            ((re) this).field_W = null;
            return;
          }
        }
    }

    final void h(byte param0) {
        if (ok.field_k == ((re) this).field_R) {
          return;
        } else {
          if (param0 != 38) {
            ((re) this).field_Y = 51;
            ((re) this).field_R = rl.field_H;
            ((re) this).field_V = 0;
            this.a(((re) this).field_W, (byte) 125);
            ((re) this).field_U.field_E = 0;
            ((re) this).field_W = null;
            return;
          } else {
            ((re) this).field_R = rl.field_H;
            ((re) this).field_V = 0;
            this.a(((re) this).field_W, (byte) 125);
            ((re) this).field_U.field_E = 0;
            ((re) this).field_W = null;
            return;
          }
        }
    }

    final boolean a(byte param0) {
        if (param0 != 26) {
            return false;
        }
        ((re) this).f(true);
        return super.a((byte) 26);
    }

    final void f(boolean param0) {
        if (!param0) {
          L0: {
            ((re) this).field_R = null;
            if (((re) this).field_R == null) {
              break L0;
            } else {
              L1: {
                if (rl.field_H != ((re) this).field_R) {
                  ((re) this).b(((re) this).field_W.field_j + 12, -119, ((re) this).field_W.field_v + (12 + ((re) this).field_ab));
                  this.a(((re) this).field_W, (byte) 125);
                  break L1;
                } else {
                  break L1;
                }
              }
              ((re) this).field_U.field_E = 256;
              ((re) this).field_R = null;
              break L0;
            }
          }
          super.f(param0);
          return;
        } else {
          L2: {
            if (((re) this).field_R == null) {
              break L2;
            } else {
              L3: {
                if (rl.field_H != ((re) this).field_R) {
                  ((re) this).b(((re) this).field_W.field_j + 12, -119, ((re) this).field_W.field_v + (12 + ((re) this).field_ab));
                  this.a(((re) this).field_W, (byte) 125);
                  break L3;
                } else {
                  break L3;
                }
              }
              ((re) this).field_U.field_E = 256;
              ((re) this).field_R = null;
              break L2;
            }
          }
          super.f(param0);
          return;
        }
    }

    void b(int param0, w param1) {
        if (param0 >= 115) {
          ((re) this).field_W = param1;
          if (fb.field_f != ((re) this).field_R) {
            if (((re) this).field_R == ok.field_k) {
              return;
            } else {
              ((re) this).field_R = ok.field_k;
              ((re) this).field_V = 0;
              return;
            }
          } else {
            ((re) this).a(((re) this).field_W.field_j + 12, (byte) -125, ((re) this).field_Y, ((re) this).field_W.field_v + (12 - -((re) this).field_ab));
            ((re) this).field_V = 0;
            return;
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_T = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
        field_cb = "This entry doesn't match";
        field_Z = 0;
    }
}
