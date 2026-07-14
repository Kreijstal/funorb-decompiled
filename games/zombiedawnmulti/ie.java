/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ie extends al {
    private int field_mb;
    private cf field_kb;
    private int field_rb;
    private int field_lb;
    static int field_nb;
    static String field_ib;
    private int field_gb;
    static long field_sb;
    static int[] field_ob;
    private lf field_pb;
    private int field_qb;
    static cj field_jb;
    private na field_hb;

    public static void l(int param0) {
        if (param0 != 7181) {
            return;
        }
        field_jb = null;
        field_ob = null;
        field_ib = null;
    }

    boolean i(int param0) {
        int var3 = 0;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (((ie) this).field_pb != null) {
          if (ld.field_Rb != ((ie) this).field_pb) {
            if (((ie) this).field_pb == lf.field_a) {
              ((ie) this).field_lb = ((ie) this).field_lb + 1;
              if (((ie) this).field_lb + 1 != ((ie) this).field_gb) {
                ((ie) this).field_hb.field_E = (((ie) this).field_lb << -767149656) / ((ie) this).field_gb;
                if (param0 != -27388) {
                  boolean discarded$6 = ((ie) this).h(-5);
                  return super.i(-27388);
                } else {
                  return super.i(-27388);
                }
              } else {
                ((ie) this).field_hb.field_E = 256;
                ((ie) this).field_pb = null;
                if (param0 != -27388) {
                  boolean discarded$7 = ((ie) this).h(-5);
                  return super.i(-27388);
                } else {
                  return super.i(-27388);
                }
              }
            } else {
              if (param0 != -27388) {
                boolean discarded$8 = ((ie) this).h(-5);
                return super.i(-27388);
              } else {
                return super.i(-27388);
              }
            }
          } else {
            ((ie) this).field_lb = ((ie) this).field_lb + 1;
            if (((ie) this).field_lb + 1 == ((ie) this).field_qb) {
              ((ie) this).field_pb = ll.field_j;
              ((ie) this).a(((ie) this).field_mb, (byte) -112, ((ie) this).field_rb + (12 - -((ie) this).field_kb.field_w), 12 - -((ie) this).field_kb.field_n);
              ((ie) this).field_lb = 0;
              ((ie) this).field_hb.field_E = 0;
              if (param0 == -27388) {
                return super.i(-27388);
              } else {
                boolean discarded$9 = ((ie) this).h(-5);
                return super.i(-27388);
              }
            } else {
              ((ie) this).field_hb.field_E = 256 + -((((ie) this).field_lb << 1296181800) / ((ie) this).field_qb);
              if (param0 == -27388) {
                return super.i(-27388);
              } else {
                boolean discarded$10 = ((ie) this).h(-5);
                return super.i(-27388);
              }
            }
          }
        } else {
          if (param0 != -27388) {
            boolean discarded$11 = ((ie) this).h(-5);
            return super.i(-27388);
          } else {
            return super.i(-27388);
          }
        }
    }

    boolean a(int param0, char param1, cf param2, int param3) {
        if (super.a(param0, param1, param2, param3)) {
          return true;
        } else {
          if (((ie) this).field_hb != null) {
            if (98 != param0) {
              if (param0 != 99) {
                return false;
              } else {
                boolean discarded$14 = ((ie) this).field_hb.a(param2, 0);
                return false;
              }
            } else {
              boolean discarded$15 = ((ie) this).field_hb.a(param2, param3 + 6208);
              if (param0 != 99) {
                return false;
              } else {
                boolean discarded$16 = ((ie) this).field_hb.a(param2, 0);
                return false;
              }
            }
          } else {
            return false;
          }
        }
    }

    final static void a(boolean param0, boolean param1) {
        if (null == ki.field_e) {
          if (param1) {
            field_ob = null;
            return;
          } else {
            return;
          }
        } else {
          oo.f(oo.field_f, oo.field_e, -oo.field_f + oo.field_g, oo.field_d - oo.field_e);
          ki.field_e.c(param0, -1);
          if (!param1) {
            return;
          } else {
            field_ob = null;
            return;
          }
        }
    }

    final void j(byte param0) {
        if (param0 < -70) {
          if (ld.field_Rb == ((ie) this).field_pb) {
            return;
          } else {
            ((ie) this).field_pb = lf.field_a;
            ((ie) this).field_lb = 0;
            this.a(((ie) this).field_kb, false);
            ((ie) this).field_hb.field_E = 0;
            ((ie) this).field_kb = null;
            return;
          }
        } else {
          field_ob = null;
          if (ld.field_Rb == ((ie) this).field_pb) {
            return;
          } else {
            ((ie) this).field_pb = lf.field_a;
            ((ie) this).field_lb = 0;
            this.a(((ie) this).field_kb, false);
            ((ie) this).field_hb.field_E = 0;
            ((ie) this).field_kb = null;
            return;
          }
        }
    }

    final boolean h(int param0) {
        ((ie) this).h((byte) 30);
        if (param0 != -6134) {
            return false;
        }
        return super.h(-6134);
    }

    ie(vk param0, cf param1, int param2, int param3, int param4) {
        super(param0, 12 + param1.field_n, 12 + (param2 - -param1.field_w));
        ((ie) this).field_gb = param3;
        ((ie) this).field_qb = param3;
        ((ie) this).field_mb = param4;
        ((ie) this).field_rb = param2;
        this.a(param1, false);
    }

    final void h(byte param0) {
        if (((ie) this).field_pb != null) {
          if (((ie) this).field_pb == lf.field_a) {
            ((ie) this).field_pb = null;
            ((ie) this).field_hb.field_E = 256;
            super.h((byte) 63);
            if (param0 >= 29) {
              return;
            } else {
              boolean discarded$6 = ((ie) this).h(-78);
              return;
            }
          } else {
            ((ie) this).b(12 + ((ie) this).field_kb.field_n, ((ie) this).field_kb.field_w + (((ie) this).field_rb + 12), 78);
            this.a(((ie) this).field_kb, false);
            ((ie) this).field_pb = null;
            ((ie) this).field_hb.field_E = 256;
            super.h((byte) 63);
            if (param0 < 29) {
              boolean discarded$7 = ((ie) this).h(-78);
              return;
            } else {
              return;
            }
          }
        } else {
          super.h((byte) 63);
          if (param0 >= 29) {
            return;
          } else {
            boolean discarded$8 = ((ie) this).h(-78);
            return;
          }
        }
    }

    void a(cf param0, byte param1) {
        int var3 = 0;
        ((ie) this).field_kb = param0;
        var3 = -11 % ((param1 - 61) / 56);
        if (((ie) this).field_pb != ll.field_j) {
          if (ld.field_Rb != ((ie) this).field_pb) {
            ((ie) this).field_lb = 0;
            ((ie) this).field_pb = ld.field_Rb;
            return;
          } else {
            return;
          }
        } else {
          ((ie) this).a(((ie) this).field_mb, (byte) -112, 12 - -((ie) this).field_rb - -((ie) this).field_kb.field_w, ((ie) this).field_kb.field_n + 12);
          ((ie) this).field_lb = 0;
          return;
        }
    }

    private final void a(cf param0, boolean param1) {
        if (!param1) {
          if (null == ((ie) this).field_hb) {
            if (param0 != null) {
              param0.b(6, 6 + ((ie) this).field_rb, 28972, param0.field_n, param0.field_w);
              ((ie) this).field_hb = new na(param0);
              ((ie) this).b((byte) 95, (cf) (Object) ((ie) this).field_hb);
              ((ie) this).field_kb = null;
              return;
            } else {
              ((ie) this).field_hb = new na();
              ((ie) this).b((byte) 95, (cf) (Object) ((ie) this).field_hb);
              ((ie) this).field_kb = null;
              return;
            }
          } else {
            ((ie) this).field_hb.a(true);
            if (param0 != null) {
              param0.b(6, 6 + ((ie) this).field_rb, 28972, param0.field_n, param0.field_w);
              ((ie) this).field_hb = new na(param0);
              ((ie) this).b((byte) 95, (cf) (Object) ((ie) this).field_hb);
              ((ie) this).field_kb = null;
              return;
            } else {
              ((ie) this).field_hb = new na();
              ((ie) this).b((byte) 95, (cf) (Object) ((ie) this).field_hb);
              ((ie) this).field_kb = null;
              return;
            }
          }
        } else {
          ((ie) this).field_lb = -61;
          if (null != ((ie) this).field_hb) {
            ((ie) this).field_hb.a(true);
            if (param0 != null) {
              param0.b(6, 6 + ((ie) this).field_rb, 28972, param0.field_n, param0.field_w);
              ((ie) this).field_hb = new na(param0);
              ((ie) this).b((byte) 95, (cf) (Object) ((ie) this).field_hb);
              ((ie) this).field_kb = null;
              return;
            } else {
              ((ie) this).field_hb = new na();
              ((ie) this).b((byte) 95, (cf) (Object) ((ie) this).field_hb);
              ((ie) this).field_kb = null;
              return;
            }
          } else {
            if (param0 != null) {
              param0.b(6, 6 + ((ie) this).field_rb, 28972, param0.field_n, param0.field_w);
              ((ie) this).field_hb = new na(param0);
              ((ie) this).b((byte) 95, (cf) (Object) ((ie) this).field_hb);
              ((ie) this).field_kb = null;
              return;
            } else {
              ((ie) this).field_hb = new na();
              ((ie) this).b((byte) 95, (cf) (Object) ((ie) this).field_hb);
              ((ie) this).field_kb = null;
              return;
            }
          }
        }
    }

    static {
    }
}
