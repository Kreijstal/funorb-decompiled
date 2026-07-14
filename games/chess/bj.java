/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bj extends k {
    private int field_fb;
    static rl field_cb;
    private int field_hb;
    static ci field_jb;
    private int field_qb;
    private mf field_ib;
    private ag field_lb;
    static String[] field_pb;
    private int field_nb;
    static km[] field_db;
    static ci field_ob;
    static rk[] field_bb;
    private int field_mb;
    static int field_gb;
    private lf field_kb;
    static ci field_eb;

    final void i(byte param0) {
        if (param0 >= -84) {
            field_jb = null;
            if (((bj) this).field_lb == null) {
                super.i((byte) -123);
                return;
            }
            if (((bj) this).field_lb != cf.field_Tb) {
                ((bj) this).a(((bj) this).field_ib.field_y + 12, (byte) 71, ((bj) this).field_ib.field_C + (12 + ((bj) this).field_qb));
                this.b(((bj) this).field_ib, (byte) -94);
            } else {
                ((bj) this).field_lb = null;
                ((bj) this).field_kb.field_R = 256;
                super.i((byte) -123);
                return;
            }
            ((bj) this).field_lb = null;
            ((bj) this).field_kb.field_R = 256;
            super.i((byte) -123);
            return;
        }
        if (((bj) this).field_lb == null) {
            super.i((byte) -123);
            return;
        }
        if (((bj) this).field_lb != cf.field_Tb) {
            ((bj) this).a(((bj) this).field_ib.field_y + 12, (byte) 71, ((bj) this).field_ib.field_C + (12 + ((bj) this).field_qb));
            this.b(((bj) this).field_ib, (byte) -94);
        } else {
            ((bj) this).field_lb = null;
            ((bj) this).field_kb.field_R = 256;
            super.i((byte) -123);
            return;
        }
        ((bj) this).field_lb = null;
        ((bj) this).field_kb.field_R = 256;
        super.i((byte) -123);
    }

    boolean g(byte param0) {
        int var3 = 0;
        var3 = Chess.field_G;
        if (((bj) this).field_lb != null) {
          if (sg.field_f != ((bj) this).field_lb) {
            if (cf.field_Tb != ((bj) this).field_lb) {
              if (param0 >= -4) {
                field_bb = null;
                return super.g((byte) -52);
              } else {
                return super.g((byte) -52);
              }
            } else {
              ((bj) this).field_fb = ((bj) this).field_fb + 1;
              if (((bj) this).field_mb != ((bj) this).field_fb + 1) {
                ((bj) this).field_kb.field_R = (((bj) this).field_fb << -1271048984) / ((bj) this).field_mb;
                if (param0 >= -4) {
                  field_bb = null;
                  return super.g((byte) -52);
                } else {
                  return super.g((byte) -52);
                }
              } else {
                ((bj) this).field_kb.field_R = 256;
                ((bj) this).field_lb = null;
                if (param0 >= -4) {
                  field_bb = null;
                  return super.g((byte) -52);
                } else {
                  return super.g((byte) -52);
                }
              }
            }
          } else {
            ((bj) this).field_fb = ((bj) this).field_fb + 1;
            if (((bj) this).field_fb + 1 != ((bj) this).field_hb) {
              ((bj) this).field_kb.field_R = 256 - (((bj) this).field_fb << -85817176) / ((bj) this).field_hb;
              if (param0 >= -4) {
                field_bb = null;
                return super.g((byte) -52);
              } else {
                return super.g((byte) -52);
              }
            } else {
              ((bj) this).field_lb = ga.field_b;
              ((bj) this).b(((bj) this).field_nb, ((bj) this).field_qb + 12 - -((bj) this).field_ib.field_C, -18807, ((bj) this).field_ib.field_y + 12);
              ((bj) this).field_kb.field_R = 0;
              ((bj) this).field_fb = 0;
              if (param0 < -4) {
                return super.g((byte) -52);
              } else {
                field_bb = null;
                return super.g((byte) -52);
              }
            }
          }
        } else {
          if (param0 >= -4) {
            field_bb = null;
            return super.g((byte) -52);
          } else {
            return super.g((byte) -52);
          }
        }
    }

    bj(fm param0, mf param1, int param2, int param3, int param4) {
        super(param0, param1.field_y + 12, param1.field_C + (param2 + 12));
        ((bj) this).field_qb = param2;
        ((bj) this).field_mb = param3;
        ((bj) this).field_hb = param3;
        ((bj) this).field_nb = param4;
        this.b(param1, (byte) -119);
    }

    final boolean a(int param0) {
        ((bj) this).i((byte) -106);
        if (param0 < 46) {
            return true;
        }
        return super.a(119);
    }

    private final void b(mf param0, byte param1) {
        if (null == ((bj) this).field_kb) {
          if (param0 == null) {
            ((bj) this).field_kb = new lf();
            ((bj) this).b((mf) (Object) ((bj) this).field_kb, 95);
            if (param1 > -18) {
              ((bj) this).i((byte) -62);
              ((bj) this).field_ib = null;
              return;
            } else {
              ((bj) this).field_ib = null;
              return;
            }
          } else {
            param0.a(((bj) this).field_qb + 6, 34, param0.field_C, param0.field_y, 6);
            ((bj) this).field_kb = new lf(param0);
            ((bj) this).b((mf) (Object) ((bj) this).field_kb, 95);
            if (param1 <= -18) {
              ((bj) this).field_ib = null;
              return;
            } else {
              ((bj) this).i((byte) -62);
              ((bj) this).field_ib = null;
              return;
            }
          }
        } else {
          ((bj) this).field_kb.c(-2193);
          if (param0 == null) {
            ((bj) this).field_kb = new lf();
            ((bj) this).b((mf) (Object) ((bj) this).field_kb, 95);
            if (param1 <= -18) {
              ((bj) this).field_ib = null;
              return;
            } else {
              ((bj) this).i((byte) -62);
              ((bj) this).field_ib = null;
              return;
            }
          } else {
            param0.a(((bj) this).field_qb + 6, 34, param0.field_C, param0.field_y, 6);
            ((bj) this).field_kb = new lf(param0);
            ((bj) this).b((mf) (Object) ((bj) this).field_kb, 95);
            if (param1 <= -18) {
              ((bj) this).field_ib = null;
              return;
            } else {
              ((bj) this).i((byte) -62);
              ((bj) this).field_ib = null;
              return;
            }
          }
        }
    }

    final void j(int param0) {
        if (param0 != 194) {
            return;
        }
        if (!(((bj) this).field_lb != sg.field_f)) {
            return;
        }
        ((bj) this).field_fb = 0;
        ((bj) this).field_lb = cf.field_Tb;
        this.b(((bj) this).field_ib, (byte) -27);
        ((bj) this).field_kb.field_R = 0;
        ((bj) this).field_ib = null;
    }

    boolean a(char param0, int param1, int param2, mf param3) {
        if (!super.a(param0, param1, param2, param3)) {
          if (((bj) this).field_kb != null) {
            if (-99 != (param1 ^ -1)) {
              if ((param1 ^ -1) == -100) {
                boolean discarded$14 = ((bj) this).field_kb.a(0, param3);
                return false;
              } else {
                return false;
              }
            } else {
              boolean discarded$15 = ((bj) this).field_kb.a(param2 ^ -1, param3);
              if ((param1 ^ -1) != -100) {
                return false;
              } else {
                boolean discarded$16 = ((bj) this).field_kb.a(0, param3);
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

    final static int c(int param0, int param1, int param2) {
        int var4 = Chess.field_G;
        if (param1 != -12076) {
            return -33;
        }
        int var3 = 1;
        while (param0 > 1) {
            if ((1 & param0) != 0) {
                var3 = var3 * param2;
            }
            param0 = param0 >> 1;
            param2 = param2 * param2;
        }
        if (!(1 != param0)) {
            return var3 * param2;
        }
        return var3;
    }

    public static void k(int param0) {
        if (param0 <= 35) {
          return;
        } else {
          field_eb = null;
          field_cb = null;
          field_db = null;
          field_pb = null;
          field_ob = null;
          field_bb = null;
          field_jb = null;
          return;
        }
    }

    final static void a(na param0, boolean param1) {
        if (!param1) {
            return;
        }
        ef.field_n.a((o) (Object) new tn(param0, (o) (Object) param0), (byte) -57);
        h.field_s.a((nm) (Object) param0);
    }

    void c(mf param0, int param1) {
        ((bj) this).field_ib = param0;
        if (param1 > 45) {
          if (((bj) this).field_lb != ga.field_b) {
            if (((bj) this).field_lb != sg.field_f) {
              ((bj) this).field_lb = sg.field_f;
              ((bj) this).field_fb = 0;
              return;
            } else {
              return;
            }
          } else {
            ((bj) this).b(((bj) this).field_nb, ((bj) this).field_ib.field_C + ((bj) this).field_qb + 12, -18807, ((bj) this).field_ib.field_y + 12);
            ((bj) this).field_fb = 0;
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
        field_cb = new rl();
    }
}
