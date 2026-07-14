/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class sj extends ug {
    private int field_hb;
    static String field_kb;
    private rf field_ib;
    private int field_ob;
    private int field_mb;
    private me field_lb;
    static String field_pb;
    private int field_qb;
    static int[] field_rb;
    private fj field_nb;
    private int field_jb;

    boolean a(fj param0, byte param1, int param2, char param3) {
        int var5 = 0;
        var5 = 28 / ((47 - param1) / 43);
        if (!super.a(param0, (byte) 115, param2, param3)) {
          if (((sj) this).field_lb != null) {
            if (param2 != 98) {
              if (-100 == param2) {
                boolean discarded$12 = ((sj) this).field_lb.a(param0, 418);
                return false;
              } else {
                return false;
              }
            } else {
              boolean discarded$13 = ((sj) this).field_lb.a(param0, 418);
              if (-100 != param2) {
                return false;
              } else {
                boolean discarded$14 = ((sj) this).field_lb.a(param0, 418);
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

    private final void a(boolean param0, fj param1) {
        L0: {
          if (null != ((sj) this).field_lb) {
            ((sj) this).field_lb.a(true);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0) {
          if (param1 != null) {
            param1.a(-110, param1.field_F, 6 + ((sj) this).field_ob, param1.field_z, 6);
            ((sj) this).field_lb = new me(param1);
            ((sj) this).b((fj) (Object) ((sj) this).field_lb, 10);
            ((sj) this).field_nb = null;
            return;
          } else {
            ((sj) this).field_lb = new me();
            ((sj) this).b((fj) (Object) ((sj) this).field_lb, 10);
            ((sj) this).field_nb = null;
            return;
          }
        } else {
          ((sj) this).field_mb = 112;
          if (param1 != null) {
            param1.a(-110, param1.field_F, 6 + ((sj) this).field_ob, param1.field_z, 6);
            ((sj) this).field_lb = new me(param1);
            ((sj) this).b((fj) (Object) ((sj) this).field_lb, 10);
            ((sj) this).field_nb = null;
            return;
          } else {
            ((sj) this).field_lb = new me();
            ((sj) this).b((fj) (Object) ((sj) this).field_lb, 10);
            ((sj) this).field_nb = null;
            return;
          }
        }
    }

    final void m(int param0) {
        L0: {
          if (((sj) this).field_ib != null) {
            L1: {
              if (cl.field_S != ((sj) this).field_ib) {
                ((sj) this).a(-41, ((sj) this).field_nb.field_z + ((sj) this).field_ob + 12, ((sj) this).field_nb.field_F + 12);
                this.a(true, ((sj) this).field_nb);
                break L1;
              } else {
                break L1;
              }
            }
            ((sj) this).field_lb.field_K = 256;
            ((sj) this).field_ib = null;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 <= 53) {
          boolean discarded$2 = ((sj) this).j(-110);
          super.m(61);
          return;
        } else {
          super.m(61);
          return;
        }
    }

    sj(sh param0, fj param1, int param2, int param3, int param4) {
        super(param0, 12 + param1.field_F, param1.field_z + 12 - -param2);
        ((sj) this).field_hb = param4;
        ((sj) this).field_ob = param2;
        ((sj) this).field_qb = param3;
        ((sj) this).field_jb = param3;
        this.a(true, param1);
    }

    boolean l(int param0) {
        int var3 = 0;
        var3 = Confined.field_J ? 1 : 0;
        if (null != ((sj) this).field_ib) {
          if (((sj) this).field_ib != c.field_s) {
            if (((sj) this).field_ib == cl.field_S) {
              ((sj) this).field_mb = ((sj) this).field_mb + 1;
              if (((sj) this).field_qb != ((sj) this).field_mb + 1) {
                ((sj) this).field_lb.field_K = (((sj) this).field_mb << -1238664152) / ((sj) this).field_qb;
                if (param0 != -6) {
                  field_rb = null;
                  return super.l(param0 ^ 0);
                } else {
                  return super.l(param0 ^ 0);
                }
              } else {
                ((sj) this).field_lb.field_K = 256;
                ((sj) this).field_ib = null;
                if (param0 != -6) {
                  field_rb = null;
                  return super.l(param0 ^ 0);
                } else {
                  return super.l(param0 ^ 0);
                }
              }
            } else {
              if (param0 != -6) {
                field_rb = null;
                return super.l(param0 ^ 0);
              } else {
                return super.l(param0 ^ 0);
              }
            }
          } else {
            ((sj) this).field_mb = ((sj) this).field_mb + 1;
            if (((sj) this).field_jb == ((sj) this).field_mb + 1) {
              ((sj) this).field_ib = sc.field_a;
              ((sj) this).a(((sj) this).field_nb.field_z + (((sj) this).field_ob + 12), ((sj) this).field_hb, 6, ((sj) this).field_nb.field_F + 12);
              ((sj) this).field_lb.field_K = 0;
              ((sj) this).field_mb = 0;
              if (param0 == -6) {
                return super.l(param0 ^ 0);
              } else {
                field_rb = null;
                return super.l(param0 ^ 0);
              }
            } else {
              ((sj) this).field_lb.field_K = -((((sj) this).field_mb << 1788545160) / ((sj) this).field_jb) + 256;
              if (param0 == -6) {
                return super.l(param0 ^ 0);
              } else {
                field_rb = null;
                return super.l(param0 ^ 0);
              }
            }
          }
        } else {
          if (param0 != -6) {
            field_rb = null;
            return super.l(param0 ^ 0);
          } else {
            return super.l(param0 ^ 0);
          }
        }
    }

    public static void h(byte param0) {
        field_kb = null;
        field_pb = null;
        if (param0 <= 6) {
            sj.h((byte) -55);
            field_rb = null;
            return;
        }
        field_rb = null;
    }

    final void g(byte param0) {
        if (((sj) this).field_ib == c.field_s) {
          return;
        } else {
          ((sj) this).field_ib = cl.field_S;
          ((sj) this).field_mb = 0;
          this.a(true, ((sj) this).field_nb);
          if (param0 > -6) {
            ((sj) this).g((byte) -58);
            ((sj) this).field_nb = null;
            ((sj) this).field_lb.field_K = 0;
            return;
          } else {
            ((sj) this).field_nb = null;
            ((sj) this).field_lb.field_K = 0;
            return;
          }
        }
    }

    final boolean j(int param0) {
        if (param0 > -35) {
          field_rb = null;
          ((sj) this).m(107);
          return super.j(-97);
        } else {
          ((sj) this).m(107);
          return super.j(-97);
        }
    }

    void a(fj param0, byte param1) {
        ((sj) this).field_nb = param0;
        if (((sj) this).field_ib != sc.field_a) {
          if (((sj) this).field_ib == c.field_s) {
            if (param1 != -72) {
              ((sj) this).m(47);
              return;
            } else {
              return;
            }
          } else {
            ((sj) this).field_ib = c.field_s;
            ((sj) this).field_mb = 0;
            if (param1 == -72) {
              return;
            } else {
              ((sj) this).m(47);
              return;
            }
          }
        } else {
          ((sj) this).a(12 - (-((sj) this).field_ob - ((sj) this).field_nb.field_z), ((sj) this).field_hb, 6, 12 + ((sj) this).field_nb.field_F);
          ((sj) this).field_mb = 0;
          if (param1 == -72) {
            return;
          } else {
            ((sj) this).m(47);
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_kb = "Logging in...";
        field_pb = "HARD";
    }
}
