/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qf extends oe {
    private int field_db;
    private int field_ab;
    private el field_eb;
    private int field_fb;
    private int field_X;
    private hh field_Z;
    static int[] field_Y;
    static rf field_bb;
    private wj field_W;
    private int field_cb;

    final boolean h(int param0) {
        if (param0 != 229) {
            return false;
        }
        ((qf) this).b(true);
        return super.h(229);
    }

    qf(ng param0, el param1, int param2, int param3, int param4) {
        super(param0, param1.field_r + 12, 12 + param2 + param1.field_h);
        ((qf) this).field_db = param4;
        ((qf) this).field_ab = param2;
        ((qf) this).field_cb = param3;
        ((qf) this).field_fb = param3;
        this.b(-21102, param1);
    }

    boolean f(int param0) {
        int var3 = 0;
        var3 = Geoblox.field_C;
        if (param0 == -1) {
          if (((qf) this).field_Z != null) {
            if (la.field_I != ((qf) this).field_Z) {
              if (qb.field_N == ((qf) this).field_Z) {
                ((qf) this).field_X = ((qf) this).field_X + 1;
                if (((qf) this).field_cb != ((qf) this).field_X + 1) {
                  ((qf) this).field_W.field_D = (((qf) this).field_X << -681491416) / ((qf) this).field_cb;
                  return super.f(-1);
                } else {
                  ((qf) this).field_Z = null;
                  ((qf) this).field_W.field_D = 256;
                  return super.f(-1);
                }
              } else {
                return super.f(-1);
              }
            } else {
              ((qf) this).field_X = ((qf) this).field_X + 1;
              if (((qf) this).field_X + 1 != ((qf) this).field_fb) {
                ((qf) this).field_W.field_D = 256 + -((((qf) this).field_X << 59778408) / ((qf) this).field_fb);
                return super.f(-1);
              } else {
                ((qf) this).field_Z = la.field_E;
                ((qf) this).a(12 + ((qf) this).field_ab + ((qf) this).field_eb.field_h, ((qf) this).field_eb.field_r + 12, param0 ^ 5268, ((qf) this).field_db);
                ((qf) this).field_X = 0;
                ((qf) this).field_W.field_D = 0;
                return super.f(-1);
              }
            }
          } else {
            return super.f(-1);
          }
        } else {
          return true;
        }
    }

    public static void m(int param0) {
        if (param0 != 256) {
            return;
        }
        field_bb = null;
        field_Y = null;
    }

    final void k(int param0) {
        if (la.field_I != ((qf) this).field_Z) {
          if (param0 >= -20) {
            field_Y = null;
            ((qf) this).field_X = 0;
            ((qf) this).field_Z = qb.field_N;
            this.b(-21102, ((qf) this).field_eb);
            ((qf) this).field_eb = null;
            ((qf) this).field_W.field_D = 0;
            return;
          } else {
            ((qf) this).field_X = 0;
            ((qf) this).field_Z = qb.field_N;
            this.b(-21102, ((qf) this).field_eb);
            ((qf) this).field_eb = null;
            ((qf) this).field_W.field_D = 0;
            return;
          }
        } else {
          return;
        }
    }

    boolean a(int param0, int param1, char param2, el param3) {
        if (super.a(param0, param1, param2, param3)) {
          return true;
        } else {
          if (((qf) this).field_W != null) {
            if (param0 != -99) {
              if (-100 == (param0 ^ -1)) {
                boolean discarded$12 = ((qf) this).field_W.a((byte) -99, param3);
                return false;
              } else {
                return false;
              }
            } else {
              boolean discarded$13 = ((qf) this).field_W.a((byte) -92, param3);
              if (-100 != param0) {
                return false;
              } else {
                boolean discarded$14 = ((qf) this).field_W.a((byte) -99, param3);
                return false;
              }
            }
          } else {
            return false;
          }
        }
    }

    private final void b(int param0, el param1) {
        Object var4 = null;
        L0: {
          if (((qf) this).field_W != null) {
            ((qf) this).field_W.a(false);
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 == null) {
          ((qf) this).field_W = new wj();
          ((qf) this).b((byte) -123, (el) (Object) ((qf) this).field_W);
          ((qf) this).field_eb = null;
          if (param0 == -21102) {
            return;
          } else {
            var4 = null;
            boolean discarded$2 = ((qf) this).a(-67, -54, 'ﾽ', (el) null);
            return;
          }
        } else {
          param1.a(param1.field_h, param1.field_r, (byte) -77, ((qf) this).field_ab + 6, 6);
          ((qf) this).field_W = new wj(param1);
          ((qf) this).b((byte) -123, (el) (Object) ((qf) this).field_W);
          ((qf) this).field_eb = null;
          if (param0 == -21102) {
            return;
          } else {
            var4 = null;
            boolean discarded$3 = ((qf) this).a(-67, -54, 'ﾽ', (el) null);
            return;
          }
        }
    }

    final static ai a(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6, int param7, int param8) {
        ai var9 = null;
        var9 = new ai(param1, param6, param0, param5, param2, param8, param4);
        nf.field_j.a(param3 ^ -25202, (hf) (Object) var9);
        bm.a(var9, param7, param3 ^ -25169);
        if (param3 != 25134) {
          return null;
        } else {
          return var9;
        }
    }

    void b(el param0, int param1) {
        ((qf) this).field_eb = param0;
        if (la.field_E != ((qf) this).field_Z) {
          if (la.field_I == ((qf) this).field_Z) {
            if (param1 >= -10) {
              ((qf) this).field_W = null;
              return;
            } else {
              return;
            }
          } else {
            ((qf) this).field_Z = la.field_I;
            ((qf) this).field_X = 0;
            if (param1 < -10) {
              return;
            } else {
              ((qf) this).field_W = null;
              return;
            }
          }
        } else {
          ((qf) this).a(((qf) this).field_ab + (12 - -((qf) this).field_eb.field_h), ((qf) this).field_eb.field_r + 12, -5269, ((qf) this).field_db);
          ((qf) this).field_X = 0;
          if (param1 < -10) {
            return;
          } else {
            ((qf) this).field_W = null;
            return;
          }
        }
    }

    final void b(boolean param0) {
        if (null != ((qf) this).field_Z) {
          if (((qf) this).field_Z == qb.field_N) {
            ((qf) this).field_Z = null;
            ((qf) this).field_W.field_D = 256;
            super.b(param0);
            return;
          } else {
            ((qf) this).c(((qf) this).field_eb.field_h + (((qf) this).field_ab + 12), 106, ((qf) this).field_eb.field_r + 12);
            this.b(-21102, ((qf) this).field_eb);
            ((qf) this).field_Z = null;
            ((qf) this).field_W.field_D = 256;
            super.b(param0);
            return;
          }
        } else {
          super.b(param0);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Y = new int[8192];
    }
}
