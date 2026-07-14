/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class n extends v {
    static int[][][] field_db;
    private int field_hb;
    private int field_nb;
    private int field_gb;
    static String field_fb;
    private int field_bb;
    private hi field_eb;
    static int[][][] field_kb;
    private p field_mb;
    private ee field_ib;
    static mi field_cb;
    static int field_jb;
    private int field_lb;

    final static void g(byte param0) {
        String var1 = null;
        int var2 = 0;
        if (eb.field_m) {
          if (da.field_c != null) {
            da.field_c.o(77);
            var1 = pd.f((byte) 48);
            kb.field_O = new fg(var1, (String) null, true, false, false);
            t.field_b.a((byte) 69, (ee) (Object) bg.field_K);
            bg.field_K.c(0, (ee) (Object) kb.field_O);
            bg.field_K.d(true);
            var2 = 9 / ((param0 - -2) / 62);
            return;
          } else {
            var1 = pd.f((byte) 48);
            kb.field_O = new fg(var1, (String) null, true, false, false);
            t.field_b.a((byte) 69, (ee) (Object) bg.field_K);
            bg.field_K.c(0, (ee) (Object) kb.field_O);
            bg.field_K.d(true);
            var2 = 9 / ((param0 - -2) / 62);
            return;
          }
        } else {
          throw new IllegalStateException();
        }
    }

    public static void l(int param0) {
        field_cb = null;
        if (param0 != 5) {
          n.l(-121);
          field_db = null;
          field_fb = null;
          field_kb = null;
          return;
        } else {
          field_db = null;
          field_fb = null;
          field_kb = null;
          return;
        }
    }

    n(si param0, ee param1, int param2, int param3, int param4) {
        super(param0, 12 - -param1.field_p, 12 + param2 + param1.field_l);
        ((n) this).field_bb = param3;
        ((n) this).field_nb = param3;
        ((n) this).field_hb = param4;
        ((n) this).field_gb = param2;
        this.b(param1, 18744);
    }

    boolean j(int param0) {
        int var3 = 0;
        var3 = TorChallenge.field_F ? 1 : 0;
        if (null != ((n) this).field_mb) {
          if (v.field_Y == ((n) this).field_mb) {
            ((n) this).field_lb = ((n) this).field_lb + 1;
            if (((n) this).field_lb + 1 == ((n) this).field_nb) {
              ((n) this).field_mb = ng.field_C;
              ((n) this).a(((n) this).field_gb + (12 - -((n) this).field_ib.field_l), ((n) this).field_hb, ((n) this).field_ib.field_p + 12, false);
              ((n) this).field_eb.field_H = 0;
              ((n) this).field_lb = 0;
              if (param0 != 1) {
                return false;
              } else {
                return super.j(1);
              }
            } else {
              ((n) this).field_eb.field_H = -((((n) this).field_lb << 1716485288) / ((n) this).field_nb) + 256;
              if (param0 != 1) {
                return false;
              } else {
                return super.j(1);
              }
            }
          } else {
            if (((n) this).field_mb != ac.field_c) {
              if (param0 != 1) {
                return false;
              } else {
                return super.j(1);
              }
            } else {
              ((n) this).field_lb = ((n) this).field_lb + 1;
              if (((n) this).field_lb + 1 == ((n) this).field_bb) {
                ((n) this).field_mb = null;
                ((n) this).field_eb.field_H = 256;
                if (param0 != 1) {
                  return false;
                } else {
                  return super.j(1);
                }
              } else {
                ((n) this).field_eb.field_H = (((n) this).field_lb << 851528232) / ((n) this).field_bb;
                if (param0 != 1) {
                  return false;
                } else {
                  return super.j(1);
                }
              }
            }
          }
        } else {
          if (param0 != 1) {
            return false;
          } else {
            return super.j(1);
          }
        }
    }

    boolean a(int param0, char param1, byte param2, ee param3) {
        if (param2 > 9) {
          if (!super.a(param0, param1, (byte) 33, param3)) {
            if (((n) this).field_eb != null) {
              L0: {
                if (98 == param0) {
                  boolean discarded$8 = ((n) this).field_eb.a(param3, 0);
                  break L0;
                } else {
                  break L0;
                }
              }
              if (99 != param0) {
                return false;
              } else {
                boolean discarded$9 = ((n) this).field_eb.a(param3, 0);
                return false;
              }
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          ((n) this).k(41);
          if (!super.a(param0, param1, (byte) 33, param3)) {
            if (((n) this).field_eb != null) {
              L1: {
                if (98 == param0) {
                  boolean discarded$10 = ((n) this).field_eb.a(param3, 0);
                  break L1;
                } else {
                  break L1;
                }
              }
              if (99 != param0) {
                return false;
              } else {
                boolean discarded$11 = ((n) this).field_eb.a(param3, 0);
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

    final void k(int param0) {
        if (!(v.field_Y != ((n) this).field_mb)) {
            return;
        }
        ((n) this).field_lb = 0;
        ((n) this).field_mb = ac.field_c;
        this.b(((n) this).field_ib, param0 ^ 18744);
        ((n) this).field_ib = null;
        ((n) this).field_eb.field_H = param0;
    }

    final void d(boolean param0) {
        if (null == ((n) this).field_mb) {
            super.d(param0);
            return;
        }
        if (((n) this).field_mb != ac.field_c) {
            ((n) this).b(0, ((n) this).field_ib.field_l + 12 + ((n) this).field_gb, 12 + ((n) this).field_ib.field_p);
            this.b(((n) this).field_ib, 18744);
        } else {
            ((n) this).field_eb.field_H = 256;
            ((n) this).field_mb = null;
            super.d(param0);
            return;
        }
        ((n) this).field_eb.field_H = 256;
        ((n) this).field_mb = null;
        super.d(param0);
    }

    private final void b(ee param0, int param1) {
        if (null == ((n) this).field_eb) {
          if (param0 == null) {
            ((n) this).field_eb = new hi();
            ((n) this).a(param1 + -18744, (ee) (Object) ((n) this).field_eb);
            ((n) this).field_ib = null;
            if (param1 != 18744) {
              field_cb = null;
              return;
            } else {
              return;
            }
          } else {
            param0.a((byte) 105, 6, param0.field_l, param0.field_p, 6 - -((n) this).field_gb);
            ((n) this).field_eb = new hi(param0);
            ((n) this).a(param1 + -18744, (ee) (Object) ((n) this).field_eb);
            ((n) this).field_ib = null;
            if (param1 == 18744) {
              return;
            } else {
              field_cb = null;
              return;
            }
          }
        } else {
          ((n) this).field_eb.a(true);
          if (param0 == null) {
            ((n) this).field_eb = new hi();
            ((n) this).a(param1 + -18744, (ee) (Object) ((n) this).field_eb);
            ((n) this).field_ib = null;
            if (param1 == 18744) {
              return;
            } else {
              field_cb = null;
              return;
            }
          } else {
            param0.a((byte) 105, 6, param0.field_l, param0.field_p, 6 - -((n) this).field_gb);
            ((n) this).field_eb = new hi(param0);
            ((n) this).a(param1 + -18744, (ee) (Object) ((n) this).field_eb);
            ((n) this).field_ib = null;
            if (param1 == 18744) {
              return;
            } else {
              field_cb = null;
              return;
            }
          }
        }
    }

    void c(int param0, ee param1) {
        Object var4 = null;
        ((n) this).field_ib = param1;
        if (ng.field_C != ((n) this).field_mb) {
          if (v.field_Y != ((n) this).field_mb) {
            ((n) this).field_lb = 0;
            ((n) this).field_mb = v.field_Y;
            if (param0 != 0) {
              var4 = null;
              ((n) this).c(-2, (ee) null);
              return;
            } else {
              return;
            }
          } else {
            if (param0 == 0) {
              return;
            } else {
              var4 = null;
              ((n) this).c(-2, (ee) null);
              return;
            }
          }
        } else {
          ((n) this).a(12 - (-((n) this).field_gb - ((n) this).field_ib.field_l), ((n) this).field_hb, 12 - -((n) this).field_ib.field_p, false);
          ((n) this).field_lb = 0;
          if (param0 == 0) {
            return;
          } else {
            var4 = null;
            ((n) this).c(-2, (ee) null);
            return;
          }
        }
    }

    final boolean h(int param0) {
        ((n) this).d(true);
        if (param0 < 83) {
            return true;
        }
        return super.h(113);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_fb = "Invalid password.";
        field_db = new int[][][]{new int[7][], new int[7][], new int[7][]};
    }
}
