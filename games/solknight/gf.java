/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class gf extends ld {
    private int field_ab;
    private wh field_U;
    private int field_db;
    private int field_W;
    private rc field_S;
    private te field_V;
    static int field_T;
    private int field_eb;
    static ef field_Z;
    static String[] field_X;
    private int field_bb;
    static long field_Y;
    static o[] field_fb;
    static s field_cb;

    final boolean e(byte param0) {
        ((gf) this).e(true);
        if (param0 != 124) {
            return true;
        }
        return super.e((byte) 124);
    }

    boolean a(char param0, byte param1, int param2, rc param3) {
        int var5 = 0;
        if (!super.a(param0, (byte) -117, param2, param3)) {
          if (null != ((gf) this).field_V) {
            if (param2 != 98) {
              if (99 == param2) {
                boolean discarded$3 = ((gf) this).field_V.a(-1463, param3);
                var5 = 120 / ((param1 - 31) / 56);
                return false;
              } else {
                var5 = 120 / ((param1 - 31) / 56);
                return false;
              }
            } else {
              boolean discarded$4 = ((gf) this).field_V.a(-1463, param3);
              if (99 != param2) {
                var5 = 120 / ((param1 - 31) / 56);
                return false;
              } else {
                boolean discarded$5 = ((gf) this).field_V.a(-1463, param3);
                var5 = 120 / ((param1 - 31) / 56);
                return false;
              }
            }
          } else {
            var5 = 120 / ((param1 - 31) / 56);
            return false;
          }
        } else {
          return true;
        }
    }

    gf(i param0, rc param1, int param2, int param3, int param4) {
        super(param0, param1.field_t + 12, 12 - -param2 - -param1.field_x);
        ((gf) this).field_eb = param2;
        ((gf) this).field_W = param4;
        ((gf) this).field_db = param3;
        ((gf) this).field_ab = param3;
        this.b(param1, -16777);
    }

    public static void f(byte param0) {
        int var1 = -116 / ((-50 - param0) / 43);
        field_cb = null;
        field_X = null;
        field_Z = null;
        field_fb = null;
    }

    private final void b(rc param0, int param1) {
        L0: {
          if (((gf) this).field_V != null) {
            ((gf) this).field_V.c(10);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != null) {
          param0.b(param0.field_x, param0.field_t, 6, 0, ((gf) this).field_eb + 6);
          ((gf) this).field_V = new te(param0);
          ((gf) this).a((rc) (Object) ((gf) this).field_V, param1 + 22188);
          if (param1 != -16777) {
            return;
          } else {
            ((gf) this).field_S = null;
            return;
          }
        } else {
          ((gf) this).field_V = new te();
          ((gf) this).a((rc) (Object) ((gf) this).field_V, param1 + 22188);
          if (param1 != -16777) {
            return;
          } else {
            ((gf) this).field_S = null;
            return;
          }
        }
    }

    final void e(boolean param0) {
        if (((gf) this).field_U != null) {
          if (((gf) this).field_U == oa.field_j) {
            ((gf) this).field_V.field_H = 256;
            ((gf) this).field_U = null;
            super.e(param0);
            return;
          } else {
            ((gf) this).b(((gf) this).field_S.field_t + 12, -2038584927, ((gf) this).field_eb + 12 - -((gf) this).field_S.field_x);
            this.b(((gf) this).field_S, -16777);
            ((gf) this).field_V.field_H = 256;
            ((gf) this).field_U = null;
            super.e(param0);
            return;
          }
        } else {
          super.e(param0);
          return;
        }
    }

    void c(int param0, rc param1) {
        if (param0 == -3399) {
          ((gf) this).field_S = param1;
          if (kc.field_I != ((gf) this).field_U) {
            if (((gf) this).field_U != ah.field_j) {
              ((gf) this).field_U = ah.field_j;
              ((gf) this).field_bb = 0;
              return;
            } else {
              return;
            }
          } else {
            ((gf) this).b(((gf) this).field_S.field_x + 12 - -((gf) this).field_eb, 0, ((gf) this).field_W, ((gf) this).field_S.field_t + 12);
            ((gf) this).field_bb = 0;
            return;
          }
        } else {
          field_T = -28;
          ((gf) this).field_S = param1;
          if (kc.field_I != ((gf) this).field_U) {
            if (((gf) this).field_U == ah.field_j) {
              return;
            } else {
              ((gf) this).field_U = ah.field_j;
              ((gf) this).field_bb = 0;
              return;
            }
          } else {
            ((gf) this).b(((gf) this).field_S.field_x + 12 - -((gf) this).field_eb, 0, ((gf) this).field_W, ((gf) this).field_S.field_t + 12);
            ((gf) this).field_bb = 0;
            return;
          }
        }
    }

    final void l(int param0) {
        if (ah.field_j == ((gf) this).field_U) {
          return;
        } else {
          if (param0 != 7107) {
            return;
          } else {
            ((gf) this).field_U = oa.field_j;
            ((gf) this).field_bb = 0;
            this.b(((gf) this).field_S, param0 ^ -23116);
            ((gf) this).field_V.field_H = 0;
            ((gf) this).field_S = null;
            return;
          }
        }
    }

    boolean h(int param0) {
        int var3 = 0;
        Object var4 = null;
        var3 = SolKnight.field_L ? 1 : 0;
        if (param0 == 1784) {
          if (((gf) this).field_U != null) {
            if (((gf) this).field_U == ah.field_j) {
              int fieldTemp$5 = ((gf) this).field_bb + 1;
              ((gf) this).field_bb = ((gf) this).field_bb + 1;
              if (((gf) this).field_ab == fieldTemp$5) {
                ((gf) this).field_U = kc.field_I;
                ((gf) this).b(((gf) this).field_S.field_x + 12 - -((gf) this).field_eb, 0, ((gf) this).field_W, ((gf) this).field_S.field_t + 12);
                ((gf) this).field_bb = 0;
                ((gf) this).field_V.field_H = 0;
                return super.h(param0 + 0);
              } else {
                ((gf) this).field_V.field_H = -((((gf) this).field_bb << 2029313000) / ((gf) this).field_ab) + 256;
                return super.h(param0 + 0);
              }
            } else {
              if (((gf) this).field_U == oa.field_j) {
                int fieldTemp$6 = ((gf) this).field_bb + 1;
                ((gf) this).field_bb = ((gf) this).field_bb + 1;
                if (fieldTemp$6 != ((gf) this).field_db) {
                  ((gf) this).field_V.field_H = (((gf) this).field_bb << 88565416) / ((gf) this).field_db;
                  return super.h(param0 + 0);
                } else {
                  ((gf) this).field_U = null;
                  ((gf) this).field_V.field_H = 256;
                  return super.h(param0 + 0);
                }
              } else {
                return super.h(param0 + 0);
              }
            }
          } else {
            return super.h(param0 + 0);
          }
        } else {
          var4 = null;
          boolean discarded$7 = ((gf) this).a('ﾴ', (byte) -22, -26, (rc) null);
          if (((gf) this).field_U != null) {
            if (((gf) this).field_U == ah.field_j) {
              int fieldTemp$8 = ((gf) this).field_bb + 1;
              ((gf) this).field_bb = ((gf) this).field_bb + 1;
              if (((gf) this).field_ab == fieldTemp$8) {
                ((gf) this).field_U = kc.field_I;
                ((gf) this).b(((gf) this).field_S.field_x + 12 - -((gf) this).field_eb, 0, ((gf) this).field_W, ((gf) this).field_S.field_t + 12);
                ((gf) this).field_bb = 0;
                ((gf) this).field_V.field_H = 0;
                return super.h(param0 + 0);
              } else {
                ((gf) this).field_V.field_H = -((((gf) this).field_bb << 2029313000) / ((gf) this).field_ab) + 256;
                return super.h(param0 + 0);
              }
            } else {
              if (((gf) this).field_U == oa.field_j) {
                int fieldTemp$9 = ((gf) this).field_bb + 1;
                ((gf) this).field_bb = ((gf) this).field_bb + 1;
                if (fieldTemp$9 != ((gf) this).field_db) {
                  ((gf) this).field_V.field_H = (((gf) this).field_bb << 88565416) / ((gf) this).field_db;
                  return super.h(param0 + 0);
                } else {
                  ((gf) this).field_U = null;
                  ((gf) this).field_V.field_H = 256;
                  return super.h(param0 + 0);
                }
              } else {
                return super.h(param0 + 0);
              }
            }
          } else {
            return super.h(param0 + 0);
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Z = new ef();
        field_X = new String[]{"All scores", "My scores", "Best each"};
    }
}
