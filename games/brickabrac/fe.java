/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class fe extends bj {
    private sk field_mb;
    private int field_cb;
    static int field_ob;
    private int field_fb;
    static mh field_gb;
    static mf field_jb;
    static String field_ib;
    private oc field_eb;
    static og field_kb;
    private int field_db;
    private int field_bb;
    static int field_pb;
    static String field_hb;
    private mi field_nb;
    private int field_lb;

    void b(byte param0, oc param1) {
        ((fe) this).field_eb = param1;
        if (dm.field_e != ((fe) this).field_nb) {
          if (((fe) this).field_nb == bh.field_qb) {
            if (param0 <= 105) {
              field_hb = null;
              return;
            } else {
              return;
            }
          } else {
            ((fe) this).field_nb = bh.field_qb;
            ((fe) this).field_fb = 0;
            if (param0 > 105) {
              return;
            } else {
              field_hb = null;
              return;
            }
          }
        } else {
          ((fe) this).a((byte) -116, ((fe) this).field_lb, ((fe) this).field_db + (12 - -((fe) this).field_eb.field_s), ((fe) this).field_eb.field_t + 12);
          ((fe) this).field_fb = 0;
          if (param0 > 105) {
            return;
          } else {
            field_hb = null;
            return;
          }
        }
    }

    final void j(int param0) {
        if (((fe) this).field_nb == null) {
            super.j(param0);
            return;
        }
        if (((fe) this).field_nb != gq.field_Xb) {
            ((fe) this).a(true, ((fe) this).field_db + 12 + ((fe) this).field_eb.field_s, 12 + ((fe) this).field_eb.field_t);
            this.a((byte) 56, ((fe) this).field_eb);
        } else {
            ((fe) this).field_nb = null;
            ((fe) this).field_mb.field_K = 256;
            super.j(param0);
            return;
        }
        ((fe) this).field_nb = null;
        ((fe) this).field_mb.field_K = 256;
        super.j(param0);
    }

    boolean h(int param0) {
        int var3 = 0;
        Object var4 = null;
        var3 = BrickABrac.field_J ? 1 : 0;
        if (param0 == 0) {
          if (((fe) this).field_nb != null) {
            if (((fe) this).field_nb == bh.field_qb) {
              ((fe) this).field_fb = ((fe) this).field_fb + 1;
              if (((fe) this).field_fb + 1 == ((fe) this).field_cb) {
                ((fe) this).field_nb = dm.field_e;
                ((fe) this).a((byte) -116, ((fe) this).field_lb, ((fe) this).field_eb.field_s + (((fe) this).field_db + 12), 12 + ((fe) this).field_eb.field_t);
                ((fe) this).field_mb.field_K = 0;
                ((fe) this).field_fb = 0;
                return super.h(0);
              } else {
                ((fe) this).field_mb.field_K = 256 + -((((fe) this).field_fb << 1798345640) / ((fe) this).field_cb);
                return super.h(0);
              }
            } else {
              if (((fe) this).field_nb == gq.field_Xb) {
                ((fe) this).field_fb = ((fe) this).field_fb + 1;
                if (((fe) this).field_bb != ((fe) this).field_fb + 1) {
                  ((fe) this).field_mb.field_K = (((fe) this).field_fb << 127014824) / ((fe) this).field_bb;
                  return super.h(0);
                } else {
                  ((fe) this).field_nb = null;
                  ((fe) this).field_mb.field_K = 256;
                  return super.h(0);
                }
              } else {
                return super.h(0);
              }
            }
          } else {
            return super.h(0);
          }
        } else {
          var4 = null;
          boolean discarded$1 = ((fe) this).a(-125, (byte) 123, (oc) null, 'ﾈ');
          if (((fe) this).field_nb != null) {
            if (((fe) this).field_nb == bh.field_qb) {
              ((fe) this).field_fb = ((fe) this).field_fb + 1;
              if (((fe) this).field_fb + 1 == ((fe) this).field_cb) {
                ((fe) this).field_nb = dm.field_e;
                ((fe) this).a((byte) -116, ((fe) this).field_lb, ((fe) this).field_eb.field_s + (((fe) this).field_db + 12), 12 + ((fe) this).field_eb.field_t);
                ((fe) this).field_mb.field_K = 0;
                ((fe) this).field_fb = 0;
                return super.h(0);
              } else {
                ((fe) this).field_mb.field_K = 256 + -((((fe) this).field_fb << 1798345640) / ((fe) this).field_cb);
                return super.h(0);
              }
            } else {
              if (((fe) this).field_nb == gq.field_Xb) {
                ((fe) this).field_fb = ((fe) this).field_fb + 1;
                if (((fe) this).field_bb != ((fe) this).field_fb + 1) {
                  ((fe) this).field_mb.field_K = (((fe) this).field_fb << 127014824) / ((fe) this).field_bb;
                  return super.h(0);
                } else {
                  ((fe) this).field_nb = null;
                  ((fe) this).field_mb.field_K = 256;
                  return super.h(0);
                }
              } else {
                return super.h(0);
              }
            }
          } else {
            return super.h(0);
          }
        }
    }

    private final void a(byte param0, oc param1) {
        if (null == ((fe) this).field_mb) {
          if (param1 != null) {
            param1.a(param1.field_s, 6, ((fe) this).field_db + 6, (byte) -119, param1.field_t);
            ((fe) this).field_mb = new sk(param1);
            ((fe) this).a((oc) (Object) ((fe) this).field_mb, true);
            if (param0 != 56) {
              return;
            } else {
              ((fe) this).field_eb = null;
              return;
            }
          } else {
            ((fe) this).field_mb = new sk();
            ((fe) this).a((oc) (Object) ((fe) this).field_mb, true);
            if (param0 != 56) {
              return;
            } else {
              ((fe) this).field_eb = null;
              return;
            }
          }
        } else {
          ((fe) this).field_mb.b((byte) 111);
          if (param1 != null) {
            param1.a(param1.field_s, 6, ((fe) this).field_db + 6, (byte) -119, param1.field_t);
            ((fe) this).field_mb = new sk(param1);
            ((fe) this).a((oc) (Object) ((fe) this).field_mb, true);
            if (param0 != 56) {
              return;
            } else {
              ((fe) this).field_eb = null;
              return;
            }
          } else {
            ((fe) this).field_mb = new sk();
            ((fe) this).a((oc) (Object) ((fe) this).field_mb, true);
            if (param0 != 56) {
              return;
            } else {
              ((fe) this).field_eb = null;
              return;
            }
          }
        }
    }

    final void k(int param0) {
        if (!(((fe) this).field_nb != bh.field_qb)) {
            return;
        }
        ((fe) this).field_fb = 0;
        ((fe) this).field_nb = gq.field_Xb;
        this.a((byte) 56, ((fe) this).field_eb);
        ((fe) this).field_eb = null;
        ((fe) this).field_mb.field_K = 0;
        if (param0 != -13717) {
            ((fe) this).field_nb = null;
        }
    }

    boolean a(int param0, byte param1, oc param2, char param3) {
        if (!super.a(param0, param1, param2, param3)) {
          if (null != ((fe) this).field_mb) {
            L0: {
              if (98 == param0) {
                boolean discarded$4 = ((fe) this).field_mb.a(true, param2);
                break L0;
              } else {
                break L0;
              }
            }
            if ((param0 ^ -1) == -100) {
              boolean discarded$5 = ((fe) this).field_mb.a(true, param2);
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
    }

    public static void l(int param0) {
        field_ib = null;
        field_hb = null;
        field_jb = null;
        field_kb = null;
        if (param0 <= 78) {
            return;
        }
        field_gb = null;
    }

    fe(cp param0, oc param1, int param2, int param3, int param4) {
        super(param0, 12 + param1.field_t, 12 - -param2 - -param1.field_s);
        ((fe) this).field_lb = param4;
        ((fe) this).field_db = param2;
        ((fe) this).field_bb = param3;
        ((fe) this).field_cb = param3;
        this.a((byte) 56, param1);
    }

    final boolean a(int param0) {
        if (param0 >= -22) {
          ((fe) this).field_cb = -1;
          ((fe) this).j(20);
          return super.a(-119);
        } else {
          ((fe) this).j(20);
          return super.a(-119);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_ib = "This game option is not available in rated games.";
        field_hb = "Private";
    }
}
