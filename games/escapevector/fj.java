/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class fj extends vg {
    static String field_kb;
    private md field_cb;
    static int field_jb;
    static String field_bb;
    private int field_ib;
    private int field_gb;
    private ka field_Z;
    private int field_ab;
    static ce field_eb;
    private int field_fb;
    private int field_db;
    private hm field_hb;

    void a(hm param0, int param1) {
        ((fj) this).field_hb = param0;
        if (mc.field_c != ((fj) this).field_Z) {
          if (((fj) this).field_Z != t.field_a) {
            ((fj) this).field_ab = 0;
            ((fj) this).field_Z = t.field_a;
            if (param1 != 30) {
              boolean discarded$6 = ((fj) this).a((byte) -72);
              return;
            } else {
              return;
            }
          } else {
            if (param1 == 30) {
              return;
            } else {
              boolean discarded$7 = ((fj) this).a((byte) -72);
              return;
            }
          }
        } else {
          ((fj) this).a(false, ((fj) this).field_ib, 12 + ((fj) this).field_hb.field_g, ((fj) this).field_hb.field_x + ((fj) this).field_fb + 12);
          ((fj) this).field_ab = 0;
          if (param1 == 30) {
            return;
          } else {
            boolean discarded$8 = ((fj) this).a((byte) -72);
            return;
          }
        }
    }

    fj(tb param0, hm param1, int param2, int param3, int param4) {
        super(param0, param1.field_g + 12, param1.field_x + (param2 + 12));
        ((fj) this).field_ib = param4;
        ((fj) this).field_db = param3;
        ((fj) this).field_gb = param3;
        ((fj) this).field_fb = param2;
        this.b((byte) -123, param1);
    }

    final boolean a(byte param0) {
        int var2 = 50 / ((param0 - 7) / 55);
        ((fj) this).b(false);
        return super.a((byte) 112);
    }

    public static void n(int param0) {
        field_kb = null;
        if (param0 != -11555) {
            fj.n(-20);
            field_bb = null;
            field_eb = null;
            return;
        }
        field_bb = null;
        field_eb = null;
    }

    final void b(boolean param0) {
        if (null != ((fj) this).field_Z) {
          if (((fj) this).field_Z == ff.field_b) {
            ((fj) this).field_Z = null;
            ((fj) this).field_cb.field_F = 256;
            super.b(param0);
            return;
          } else {
            ((fj) this).b(255, ((fj) this).field_hb.field_x + 12 - -((fj) this).field_fb, 12 + ((fj) this).field_hb.field_g);
            this.b((byte) -121, ((fj) this).field_hb);
            ((fj) this).field_Z = null;
            ((fj) this).field_cb.field_F = 256;
            super.b(param0);
            return;
          }
        } else {
          super.b(param0);
          return;
        }
    }

    boolean j(int param0) {
        int var3 = 0;
        var3 = EscapeVector.field_A;
        if (param0 != -13907) {
          field_eb = null;
          if (null != ((fj) this).field_Z) {
            if (((fj) this).field_Z == t.field_a) {
              ((fj) this).field_ab = ((fj) this).field_ab + 1;
              if (((fj) this).field_gb != ((fj) this).field_ab + 1) {
                ((fj) this).field_cb.field_F = -((((fj) this).field_ab << -742266840) / ((fj) this).field_gb) + 256;
                return super.j(-13907);
              } else {
                ((fj) this).field_Z = mc.field_c;
                ((fj) this).a(false, ((fj) this).field_ib, 12 - -((fj) this).field_hb.field_g, 12 - (-((fj) this).field_fb - ((fj) this).field_hb.field_x));
                ((fj) this).field_ab = 0;
                ((fj) this).field_cb.field_F = 0;
                return super.j(-13907);
              }
            } else {
              if (ff.field_b == ((fj) this).field_Z) {
                ((fj) this).field_ab = ((fj) this).field_ab + 1;
                if (((fj) this).field_ab + 1 == ((fj) this).field_db) {
                  ((fj) this).field_Z = null;
                  ((fj) this).field_cb.field_F = 256;
                  return super.j(-13907);
                } else {
                  ((fj) this).field_cb.field_F = (((fj) this).field_ab << -1454105944) / ((fj) this).field_db;
                  return super.j(-13907);
                }
              } else {
                return super.j(-13907);
              }
            }
          } else {
            return super.j(-13907);
          }
        } else {
          if (null != ((fj) this).field_Z) {
            if (((fj) this).field_Z == t.field_a) {
              ((fj) this).field_ab = ((fj) this).field_ab + 1;
              if (((fj) this).field_gb != ((fj) this).field_ab + 1) {
                ((fj) this).field_cb.field_F = -((((fj) this).field_ab << -742266840) / ((fj) this).field_gb) + 256;
                return super.j(-13907);
              } else {
                ((fj) this).field_Z = mc.field_c;
                ((fj) this).a(false, ((fj) this).field_ib, 12 - -((fj) this).field_hb.field_g, 12 - (-((fj) this).field_fb - ((fj) this).field_hb.field_x));
                ((fj) this).field_ab = 0;
                ((fj) this).field_cb.field_F = 0;
                return super.j(-13907);
              }
            } else {
              if (ff.field_b == ((fj) this).field_Z) {
                ((fj) this).field_ab = ((fj) this).field_ab + 1;
                if (((fj) this).field_ab + 1 == ((fj) this).field_db) {
                  ((fj) this).field_Z = null;
                  ((fj) this).field_cb.field_F = 256;
                  return super.j(-13907);
                } else {
                  ((fj) this).field_cb.field_F = (((fj) this).field_ab << -1454105944) / ((fj) this).field_db;
                  return super.j(-13907);
                }
              } else {
                return super.j(-13907);
              }
            }
          } else {
            return super.j(-13907);
          }
        }
    }

    private final void b(byte param0, hm param1) {
        L0: {
          if (((fj) this).field_cb != null) {
            ((fj) this).field_cb.c((byte) -62);
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 != null) {
          param1.a(param1.field_g, 6 - -((fj) this).field_fb, 6, true, param1.field_x);
          ((fj) this).field_cb = new md(param1);
          ((fj) this).b((hm) (Object) ((fj) this).field_cb, false);
          ((fj) this).field_hb = null;
          if (param0 <= -72) {
            return;
          } else {
            ((fj) this).field_gb = 65;
            return;
          }
        } else {
          ((fj) this).field_cb = new md();
          ((fj) this).b((hm) (Object) ((fj) this).field_cb, false);
          ((fj) this).field_hb = null;
          if (param0 <= -72) {
            return;
          } else {
            ((fj) this).field_gb = 65;
            return;
          }
        }
    }

    boolean a(hm param0, char param1, int param2, int param3) {
        if (!super.a(param0, param1, param2, 43)) {
          if (param3 > 0) {
            if (((fj) this).field_cb != null) {
              L0: {
                if (98 == param2) {
                  boolean discarded$8 = ((fj) this).field_cb.a(-4659, param0);
                  break L0;
                } else {
                  break L0;
                }
              }
              if (99 != param2) {
                return false;
              } else {
                boolean discarded$9 = ((fj) this).field_cb.a(-4659, param0);
                return false;
              }
            } else {
              return false;
            }
          } else {
            ((fj) this).field_Z = null;
            if (((fj) this).field_cb != null) {
              L1: {
                if (98 == param2) {
                  boolean discarded$10 = ((fj) this).field_cb.a(-4659, param0);
                  break L1;
                } else {
                  break L1;
                }
              }
              if (99 != param2) {
                return false;
              } else {
                boolean discarded$11 = ((fj) this).field_cb.a(-4659, param0);
                return false;
              }
            } else {
              return false;
            }
          }
        } else {
          return true;
        }
    }

    final void m(int param0) {
        if (!(t.field_a != ((fj) this).field_Z)) {
            return;
        }
        ((fj) this).field_Z = ff.field_b;
        ((fj) this).field_ab = 0;
        this.b((byte) -115, ((fj) this).field_hb);
        int var2 = 41 / ((45 - param0) / 53);
        ((fj) this).field_hb = null;
        ((fj) this).field_cb.field_F = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_kb = "Next";
        field_bb = "Checking";
        field_jb = 10;
    }
}
