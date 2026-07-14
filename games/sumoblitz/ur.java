/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ur extends hf {
    private pk field_V;
    private int field_W;
    private int field_S;
    static String field_X;
    private in field_P;
    private int field_Z;
    static float field_R;
    static int field_Q;
    private jf field_Y;
    private int field_U;
    private int field_T;
    static int field_O;

    ur(dg param0, pk param1, int param2, int param3, int param4) {
        super(param0, param1.field_q + 12, param1.field_p + (12 + param2));
        ((ur) this).field_U = param2;
        ((ur) this).field_S = param3;
        ((ur) this).field_T = param3;
        ((ur) this).field_Z = param4;
        this.b(param1, -125);
    }

    boolean g(int param0) {
        int var3 = 0;
        var3 = Sumoblitz.field_L ? 1 : 0;
        if (null != ((ur) this).field_Y) {
          if (((ur) this).field_Y != sr.field_i) {
            if (((ur) this).field_Y == mm.field_a) {
              ((ur) this).field_W = ((ur) this).field_W + 1;
              if (((ur) this).field_S != ((ur) this).field_W + 1) {
                ((ur) this).field_P.field_A = (((ur) this).field_W << 1474033192) / ((ur) this).field_S;
                if (param0 != -28778) {
                  ((ur) this).field_T = 19;
                  return super.g(-28778);
                } else {
                  return super.g(-28778);
                }
              } else {
                ((ur) this).field_Y = null;
                ((ur) this).field_P.field_A = 256;
                if (param0 != -28778) {
                  ((ur) this).field_T = 19;
                  return super.g(-28778);
                } else {
                  return super.g(-28778);
                }
              }
            } else {
              if (param0 != -28778) {
                ((ur) this).field_T = 19;
                return super.g(-28778);
              } else {
                return super.g(-28778);
              }
            }
          } else {
            ((ur) this).field_W = ((ur) this).field_W + 1;
            if (((ur) this).field_W + 1 == ((ur) this).field_T) {
              ((ur) this).field_Y = lw.field_a;
              ((ur) this).a(false, ((ur) this).field_U + (12 + ((ur) this).field_V.field_p), ((ur) this).field_Z, ((ur) this).field_V.field_q + 12);
              ((ur) this).field_W = 0;
              ((ur) this).field_P.field_A = 0;
              if (param0 == -28778) {
                return super.g(-28778);
              } else {
                ((ur) this).field_T = 19;
                return super.g(-28778);
              }
            } else {
              ((ur) this).field_P.field_A = 256 + -((((ur) this).field_W << -1588147576) / ((ur) this).field_T);
              if (param0 == -28778) {
                return super.g(-28778);
              } else {
                ((ur) this).field_T = 19;
                return super.g(-28778);
              }
            }
          }
        } else {
          if (param0 != -28778) {
            ((ur) this).field_T = 19;
            return super.g(-28778);
          } else {
            return super.g(-28778);
          }
        }
    }

    final void f(byte param0) {
        if (!(null == ((ur) this).field_Y)) {
            if (!(mm.field_a == ((ur) this).field_Y)) {
                ((ur) this).c(12 + ((ur) this).field_V.field_q, ((ur) this).field_V.field_p + (((ur) this).field_U + 12), 79);
                this.b(((ur) this).field_V, -124);
            }
            ((ur) this).field_P.field_A = 256;
            ((ur) this).field_Y = null;
        }
        super.f(param0);
    }

    final boolean h(int param0) {
        if (param0 != 0) {
            return true;
        }
        ((ur) this).f((byte) -128);
        return super.h(param0 ^ 0);
    }

    boolean a(pk param0, char param1, byte param2, int param3) {
        if (param2 >= 9) {
          if (!super.a(param0, param1, (byte) 42, param3)) {
            if (((ur) this).field_P != null) {
              L0: {
                if (param3 == -99) {
                  boolean discarded$8 = ((ur) this).field_P.a(param0, (byte) 61);
                  break L0;
                } else {
                  break L0;
                }
              }
              if (-100 == param3) {
                boolean discarded$9 = ((ur) this).field_P.a(param0, (byte) 61);
                return false;
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          ((ur) this).i(96);
          if (!super.a(param0, param1, (byte) 42, param3)) {
            if (((ur) this).field_P != null) {
              L1: {
                if (param3 == -99) {
                  boolean discarded$10 = ((ur) this).field_P.a(param0, (byte) 61);
                  break L1;
                } else {
                  break L1;
                }
              }
              if (-100 != param3) {
                return false;
              } else {
                boolean discarded$11 = ((ur) this).field_P.a(param0, (byte) 61);
                return false;
              }
            } else {
              return false;
            }
          } else {
            return true;
          }
        }
    }

    private final void b(pk param0, int param1) {
        int var3 = 0;
        L0: {
          var3 = -16 / ((param1 - -72) / 51);
          if (((ur) this).field_P != null) {
            ((ur) this).field_P.b(false);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 == null) {
          ((ur) this).field_P = new in();
          ((ur) this).a((pk) (Object) ((ur) this).field_P, 124);
          ((ur) this).field_V = null;
          return;
        } else {
          param0.a(107, 6, ((ur) this).field_U + 6, param0.field_p, param0.field_q);
          ((ur) this).field_P = new in(param0);
          ((ur) this).a((pk) (Object) ((ur) this).field_P, 124);
          ((ur) this).field_V = null;
          return;
        }
    }

    void b(byte param0, pk param1) {
        Object var4 = null;
        if (param0 < -87) {
          ((ur) this).field_V = param1;
          if (lw.field_a != ((ur) this).field_Y) {
            if (((ur) this).field_Y != sr.field_i) {
              ((ur) this).field_Y = sr.field_i;
              ((ur) this).field_W = 0;
              return;
            } else {
              return;
            }
          } else {
            ((ur) this).a(false, ((ur) this).field_V.field_p + ((ur) this).field_U + 12, ((ur) this).field_Z, ((ur) this).field_V.field_q + 12);
            ((ur) this).field_W = 0;
            return;
          }
        } else {
          var4 = null;
          this.b((pk) null, 78);
          ((ur) this).field_V = param1;
          if (lw.field_a != ((ur) this).field_Y) {
            if (((ur) this).field_Y == sr.field_i) {
              return;
            } else {
              ((ur) this).field_Y = sr.field_i;
              ((ur) this).field_W = 0;
              return;
            }
          } else {
            ((ur) this).a(false, ((ur) this).field_V.field_p + ((ur) this).field_U + 12, ((ur) this).field_Z, ((ur) this).field_V.field_q + 12);
            ((ur) this).field_W = 0;
            return;
          }
        }
    }

    public static void k(int param0) {
        if (param0 != 0) {
            ur.k(65);
            field_X = null;
            return;
        }
        field_X = null;
    }

    final void i(int param0) {
        if (!(((ur) this).field_Y != sr.field_i)) {
            return;
        }
        ((ur) this).field_W = param0;
        ((ur) this).field_Y = mm.field_a;
        this.b(((ur) this).field_V, -124);
        ((ur) this).field_P.field_A = 0;
        ((ur) this).field_V = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Q = -1;
        field_X = "Passwords can only contain letters and numbers";
    }
}
