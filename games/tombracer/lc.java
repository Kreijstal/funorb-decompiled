/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class lc extends ofa {
    private sla field_M;
    static int[] field_N;
    private int field_R;
    private int field_O;
    private int field_Q;
    static String field_L;
    private rg field_P;
    private int field_S;
    private ae field_T;
    private int field_U;

    private final void a(boolean param0, ae param1) {
        Object var4 = null;
        L0: {
          if (null != ((lc) this).field_P) {
            ((lc) this).field_P.p(83);
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 == null) {
          ((lc) this).field_P = new rg();
          ((lc) this).a((ae) (Object) ((lc) this).field_P, -1);
          ((lc) this).field_T = null;
          if (!param0) {
            return;
          } else {
            var4 = null;
            boolean discarded$2 = ((lc) this).a('￁', (ae) null, 57, true);
            return;
          }
        } else {
          param1.a((byte) -31, param1.field_m, param1.field_p, 6, ((lc) this).field_S + 6);
          ((lc) this).field_P = new rg(param1);
          ((lc) this).a((ae) (Object) ((lc) this).field_P, -1);
          ((lc) this).field_T = null;
          if (!param0) {
            return;
          } else {
            var4 = null;
            boolean discarded$3 = ((lc) this).a('￁', (ae) null, 57, true);
            return;
          }
        }
    }

    final void c(boolean param0) {
        if (((lc) this).field_M != null) {
          if (((lc) this).field_M == nr.field_a) {
            ((lc) this).field_P.field_y = 256;
            ((lc) this).field_M = null;
            super.c(param0);
            return;
          } else {
            ((lc) this).c(-11560, ((lc) this).field_T.field_p + (((lc) this).field_S + 12), 12 + ((lc) this).field_T.field_m);
            this.a(false, ((lc) this).field_T);
            ((lc) this).field_P.field_y = 256;
            ((lc) this).field_M = null;
            super.c(param0);
            return;
          }
        } else {
          super.c(param0);
          return;
        }
    }

    void a(int param0, ae param1) {
        ((lc) this).field_T = param1;
        if (((lc) this).field_M != us.field_e) {
          if (bj.field_p != ((lc) this).field_M) {
            ((lc) this).field_M = bj.field_p;
            ((lc) this).field_R = 0;
            if (param0 <= 67) {
              ((lc) this).field_R = -128;
              return;
            } else {
              return;
            }
          } else {
            if (param0 > 67) {
              return;
            } else {
              ((lc) this).field_R = -128;
              return;
            }
          }
        } else {
          ((lc) this).a(((lc) this).field_Q, ((lc) this).field_T.field_m + 12, ((lc) this).field_T.field_p + ((lc) this).field_S + 12, (byte) -105);
          ((lc) this).field_R = 0;
          if (param0 > 67) {
            return;
          } else {
            ((lc) this).field_R = -128;
            return;
          }
        }
    }

    boolean a(int param0) {
        int var3 = 0;
        var3 = TombRacer.field_G ? 1 : 0;
        if (null != ((lc) this).field_M) {
          if (((lc) this).field_M != bj.field_p) {
            if (nr.field_a == ((lc) this).field_M) {
              ((lc) this).field_R = ((lc) this).field_R + 1;
              if (((lc) this).field_U != ((lc) this).field_R + 1) {
                ((lc) this).field_P.field_y = (((lc) this).field_R << 446193096) / ((lc) this).field_U;
                if (param0 <= 126) {
                  ((lc) this).field_T = null;
                  return super.a(127);
                } else {
                  return super.a(127);
                }
              } else {
                ((lc) this).field_M = null;
                ((lc) this).field_P.field_y = 256;
                if (param0 <= 126) {
                  ((lc) this).field_T = null;
                  return super.a(127);
                } else {
                  return super.a(127);
                }
              }
            } else {
              if (param0 <= 126) {
                ((lc) this).field_T = null;
                return super.a(127);
              } else {
                return super.a(127);
              }
            }
          } else {
            ((lc) this).field_R = ((lc) this).field_R + 1;
            if (((lc) this).field_R + 1 == ((lc) this).field_O) {
              ((lc) this).field_M = us.field_e;
              ((lc) this).a(((lc) this).field_Q, ((lc) this).field_T.field_m + 12, ((lc) this).field_T.field_p + (((lc) this).field_S + 12), (byte) -103);
              ((lc) this).field_R = 0;
              ((lc) this).field_P.field_y = 0;
              if (param0 > 126) {
                return super.a(127);
              } else {
                ((lc) this).field_T = null;
                return super.a(127);
              }
            } else {
              ((lc) this).field_P.field_y = 256 + -((((lc) this).field_R << 1909569320) / ((lc) this).field_O);
              if (param0 > 126) {
                return super.a(127);
              } else {
                ((lc) this).field_T = null;
                return super.a(127);
              }
            }
          }
        } else {
          if (param0 <= 126) {
            ((lc) this).field_T = null;
            return super.a(127);
          } else {
            return super.a(127);
          }
        }
    }

    public static void e(boolean param0) {
        field_N = null;
        if (param0) {
            lc.e(false);
            field_L = null;
            return;
        }
        field_L = null;
    }

    final void d(int param0) {
        if (((lc) this).field_M != bj.field_p) {
          ((lc) this).field_M = nr.field_a;
          if (param0 > -20) {
            ((lc) this).field_R = 19;
            ((lc) this).field_R = 0;
            this.a(false, ((lc) this).field_T);
            ((lc) this).field_P.field_y = 0;
            ((lc) this).field_T = null;
            return;
          } else {
            ((lc) this).field_R = 0;
            this.a(false, ((lc) this).field_T);
            ((lc) this).field_P.field_y = 0;
            ((lc) this).field_T = null;
            return;
          }
        } else {
          return;
        }
    }

    boolean a(char param0, ae param1, int param2, boolean param3) {
        if (!super.a(param0, param1, param2, param3)) {
          if (null != ((lc) this).field_P) {
            if (param2 != 98) {
              if ((param2 ^ -1) != -100) {
                return false;
              } else {
                boolean discarded$12 = ((lc) this).field_P.a(param1, false);
                return false;
              }
            } else {
              boolean discarded$13 = ((lc) this).field_P.a(param1, false);
              if ((param2 ^ -1) != -100) {
                return false;
              } else {
                boolean discarded$14 = ((lc) this).field_P.a(param1, false);
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

    lc(jta param0, ae param1, int param2, int param3, int param4) {
        super(param0, param1.field_m + 12, param1.field_p + param2 + 12);
        ((lc) this).field_U = param3;
        ((lc) this).field_O = param3;
        ((lc) this).field_Q = param4;
        ((lc) this).field_S = param2;
        this.a(false, param1);
    }

    final boolean a(byte param0) {
        if (param0 > -53) {
            return false;
        }
        ((lc) this).c(true);
        return super.a((byte) -120);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = new int[1];
        field_L = "Score";
    }
}
