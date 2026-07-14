/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qj extends kc {
    private ie field_Y;
    static gj field_eb;
    private int field_ab;
    private int field_W;
    private int field_db;
    private og field_Z;
    private uj field_X;
    private int field_bb;
    static String field_V;
    private int field_cb;

    void c(int param0, uj param1) {
        ((qj) this).field_X = param1;
        if (param0 == 20317) {
          if (((qj) this).field_Z != sk.field_c) {
            if (((qj) this).field_Z == na.field_e) {
              return;
            } else {
              ((qj) this).field_ab = 0;
              ((qj) this).field_Z = na.field_e;
              return;
            }
          } else {
            ((qj) this).b(12 - -((qj) this).field_X.field_i, ((qj) this).field_db + 12 - -((qj) this).field_X.field_f, (byte) 120, ((qj) this).field_cb);
            ((qj) this).field_ab = 0;
            return;
          }
        } else {
          return;
        }
    }

    final boolean i(int param0) {
        if (param0 >= -121) {
          boolean discarded$2 = ((qj) this).i(-95);
          ((qj) this).j(-128);
          return super.i(-125);
        } else {
          ((qj) this).j(-128);
          return super.i(-125);
        }
    }

    boolean a(uj param0, char param1, byte param2, int param3) {
        if (!super.a(param0, param1, param2, param3)) {
          if (null != ((qj) this).field_Y) {
            if (-99 != (param3 ^ -1)) {
              if ((param3 ^ -1) != -100) {
                return false;
              } else {
                boolean discarded$12 = ((qj) this).field_Y.a(0, param0);
                return false;
              }
            } else {
              boolean discarded$13 = ((qj) this).field_Y.a(0, param0);
              if ((param3 ^ -1) != -100) {
                return false;
              } else {
                boolean discarded$14 = ((qj) this).field_Y.a(0, param0);
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

    qj(tc param0, uj param1, int param2, int param3, int param4) {
        super(param0, 12 + param1.field_i, param2 + (12 + param1.field_f));
        ((qj) this).field_db = param2;
        ((qj) this).field_bb = param3;
        ((qj) this).field_W = param3;
        ((qj) this).field_cb = param4;
        this.d(6, param1);
    }

    final void k(int param0) {
        if (na.field_e == ((qj) this).field_Z) {
          return;
        } else {
          ((qj) this).field_ab = 0;
          ((qj) this).field_Z = w.field_w;
          if (param0 > -74) {
            ((qj) this).field_X = null;
            this.d(6, ((qj) this).field_X);
            ((qj) this).field_X = null;
            ((qj) this).field_Y.field_w = 0;
            return;
          } else {
            this.d(6, ((qj) this).field_X);
            ((qj) this).field_X = null;
            ((qj) this).field_Y.field_w = 0;
            return;
          }
        }
    }

    private final void d(int param0, uj param1) {
        L0: {
          if (((qj) this).field_Y != null) {
            ((qj) this).field_Y.b(4);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param1 != null) {
            param1.a(6, param1.field_i, (byte) 125, param1.field_f, ((qj) this).field_db + 6);
            ((qj) this).field_Y = new ie(param1);
            break L1;
          } else {
            ((qj) this).field_Y = new ie();
            break L1;
          }
        }
        if (param0 != 6) {
          ((qj) this).j(-25);
          ((qj) this).a(true, (uj) (Object) ((qj) this).field_Y);
          ((qj) this).field_X = null;
          return;
        } else {
          ((qj) this).a(true, (uj) (Object) ((qj) this).field_Y);
          ((qj) this).field_X = null;
          return;
        }
    }

    boolean g(byte param0) {
        int var3 = 0;
        var3 = StarCannon.field_A;
        if (null != ((qj) this).field_Z) {
          if (na.field_e != ((qj) this).field_Z) {
            if (((qj) this).field_Z != w.field_w) {
              if (param0 != -124) {
                qj.l(-17);
                return super.g((byte) -124);
              } else {
                return super.g((byte) -124);
              }
            } else {
              ((qj) this).field_ab = ((qj) this).field_ab + 1;
              if (((qj) this).field_ab + 1 == ((qj) this).field_bb) {
                ((qj) this).field_Z = null;
                ((qj) this).field_Y.field_w = 256;
                if (param0 != -124) {
                  qj.l(-17);
                  return super.g((byte) -124);
                } else {
                  return super.g((byte) -124);
                }
              } else {
                ((qj) this).field_Y.field_w = (((qj) this).field_ab << -2068842904) / ((qj) this).field_bb;
                if (param0 != -124) {
                  qj.l(-17);
                  return super.g((byte) -124);
                } else {
                  return super.g((byte) -124);
                }
              }
            }
          } else {
            ((qj) this).field_ab = ((qj) this).field_ab + 1;
            if (((qj) this).field_ab + 1 == ((qj) this).field_W) {
              ((qj) this).field_Z = sk.field_c;
              ((qj) this).b(((qj) this).field_X.field_i + 12, ((qj) this).field_X.field_f + ((qj) this).field_db + 12, (byte) 120, ((qj) this).field_cb);
              ((qj) this).field_Y.field_w = 0;
              ((qj) this).field_ab = 0;
              if (param0 != -124) {
                qj.l(-17);
                return super.g((byte) -124);
              } else {
                return super.g((byte) -124);
              }
            } else {
              ((qj) this).field_Y.field_w = -((((qj) this).field_ab << -1700360088) / ((qj) this).field_W) + 256;
              if (param0 == -124) {
                return super.g((byte) -124);
              } else {
                qj.l(-17);
                return super.g((byte) -124);
              }
            }
          }
        } else {
          if (param0 != -124) {
            qj.l(-17);
            return super.g((byte) -124);
          } else {
            return super.g((byte) -124);
          }
        }
    }

    final void j(int param0) {
        if (null != ((qj) this).field_Z) {
          if (w.field_w == ((qj) this).field_Z) {
            ((qj) this).field_Y.field_w = 256;
            ((qj) this).field_Z = null;
            super.j(-119);
            if (param0 <= -104) {
              return;
            } else {
              boolean discarded$6 = ((qj) this).i(123);
              return;
            }
          } else {
            ((qj) this).b(12 + ((qj) this).field_X.field_i, (byte) 57, ((qj) this).field_X.field_f + (((qj) this).field_db + 12));
            this.d(6, ((qj) this).field_X);
            ((qj) this).field_Y.field_w = 256;
            ((qj) this).field_Z = null;
            super.j(-119);
            if (param0 > -104) {
              boolean discarded$7 = ((qj) this).i(123);
              return;
            } else {
              return;
            }
          }
        } else {
          super.j(-119);
          if (param0 <= -104) {
            return;
          } else {
            boolean discarded$8 = ((qj) this).i(123);
            return;
          }
        }
    }

    public static void l(int param0) {
        field_V = null;
        if (param0 > -77) {
            field_V = null;
            field_eb = null;
            return;
        }
        field_eb = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_V = "Create a free Account";
    }
}
