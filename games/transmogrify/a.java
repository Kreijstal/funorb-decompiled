/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class a extends bi {
    private int field_X;
    private wk field_W;
    private qg field_V;
    static al field_S;
    private int field_ab;
    static int[] field_T;
    private int field_P;
    static int field_Q;
    private int field_U;
    private gl field_Z;
    static boolean field_bb;
    static ti field_R;
    private int field_Y;

    boolean m(int param0) {
        int var3 = 0;
        var3 = Transmogrify.field_A ? 1 : 0;
        if (null != ((a) this).field_W) {
          if (((a) this).field_W == uh.field_r) {
            ((a) this).field_ab = ((a) this).field_ab + 1;
            if (((a) this).field_ab + 1 == ((a) this).field_P) {
              ((a) this).field_W = ij.field_d;
              ((a) this).a(0, 12 - -((a) this).field_V.field_l, ((a) this).field_V.field_h + 12 + ((a) this).field_U, ((a) this).field_Y);
              ((a) this).field_ab = 0;
              ((a) this).field_Z.field_A = 0;
              if (param0 != 0) {
                ((a) this).p(-97);
                return super.m(0);
              } else {
                return super.m(0);
              }
            } else {
              ((a) this).field_Z.field_A = -((((a) this).field_ab << 607758824) / ((a) this).field_P) + 256;
              if (param0 != 0) {
                ((a) this).p(-97);
                return super.m(0);
              } else {
                return super.m(0);
              }
            }
          } else {
            if (((a) this).field_W != hg.field_b) {
              if (param0 != 0) {
                ((a) this).p(-97);
                return super.m(0);
              } else {
                return super.m(0);
              }
            } else {
              ((a) this).field_ab = ((a) this).field_ab + 1;
              if (((a) this).field_X != ((a) this).field_ab + 1) {
                ((a) this).field_Z.field_A = (((a) this).field_ab << -1241675192) / ((a) this).field_X;
                if (param0 != 0) {
                  ((a) this).p(-97);
                  return super.m(0);
                } else {
                  return super.m(0);
                }
              } else {
                ((a) this).field_Z.field_A = 256;
                ((a) this).field_W = null;
                if (param0 == 0) {
                  return super.m(0);
                } else {
                  ((a) this).p(-97);
                  return super.m(0);
                }
              }
            }
          }
        } else {
          if (param0 == 0) {
            return super.m(0);
          } else {
            ((a) this).p(-97);
            return super.m(0);
          }
        }
    }

    a(da param0, qg param1, int param2, int param3, int param4) {
        super(param0, 12 + param1.field_l, param1.field_h + 12 - -param2);
        ((a) this).field_U = param2;
        ((a) this).field_X = param3;
        ((a) this).field_P = param3;
        ((a) this).field_Y = param4;
        this.a((byte) 97, param1);
    }

    private final void a(byte param0, qg param1) {
        L0: {
          if (null != ((a) this).field_Z) {
            ((a) this).field_Z.c(5);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 >= 68) {
          if (param1 != null) {
            param1.a(28, 6 + ((a) this).field_U, 6, param1.field_l, param1.field_h);
            ((a) this).field_Z = new gl(param1);
            ((a) this).a((qg) (Object) ((a) this).field_Z, (byte) -88);
            ((a) this).field_V = null;
            return;
          } else {
            ((a) this).field_Z = new gl();
            ((a) this).a((qg) (Object) ((a) this).field_Z, (byte) -88);
            ((a) this).field_V = null;
            return;
          }
        } else {
          return;
        }
    }

    final void d(byte param0) {
        if (!(((a) this).field_W != uh.field_r)) {
            return;
        }
        ((a) this).field_ab = 0;
        ((a) this).field_W = hg.field_b;
        this.a((byte) 101, ((a) this).field_V);
        ((a) this).field_Z.field_A = 0;
        ((a) this).field_V = null;
        if (param0 != -2) {
            Object var3 = null;
            ((a) this).b(-120, (qg) null);
        }
    }

    final void p(int param0) {
        L0: {
          if (((a) this).field_W == null) {
            break L0;
          } else {
            L1: {
              if (hg.field_b != ((a) this).field_W) {
                ((a) this).a(12 - -((a) this).field_V.field_l, 12 - -((a) this).field_U - -((a) this).field_V.field_h, false);
                this.a((byte) 93, ((a) this).field_V);
                break L1;
              } else {
                break L1;
              }
            }
            ((a) this).field_W = null;
            ((a) this).field_Z.field_A = 256;
            break L0;
          }
        }
        if (param0 != 27830) {
          ((a) this).d((byte) 73);
          super.p(param0 + 0);
          return;
        } else {
          super.p(param0 + 0);
          return;
        }
    }

    final boolean a(byte param0) {
        ((a) this).p(param0 + 27927);
        if (param0 != -97) {
            return true;
        }
        return super.a((byte) -97);
    }

    void b(int param0, qg param1) {
        int var3 = 0;
        ((a) this).field_V = param1;
        var3 = 115 % ((param0 - 34) / 54);
        if (ij.field_d != ((a) this).field_W) {
          if (uh.field_r != ((a) this).field_W) {
            ((a) this).field_ab = 0;
            ((a) this).field_W = uh.field_r;
            return;
          } else {
            return;
          }
        } else {
          ((a) this).a(0, 12 - -((a) this).field_V.field_l, ((a) this).field_U + (12 + ((a) this).field_V.field_h), ((a) this).field_Y);
          ((a) this).field_ab = 0;
          return;
        }
    }

    final static void a(int param0, java.awt.Component param1) {
        param1.removeKeyListener((java.awt.event.KeyListener) (Object) el.field_n);
        param1.removeFocusListener((java.awt.event.FocusListener) (Object) el.field_n);
        j.field_b = -1;
        if (param0 < 36) {
            field_S = null;
        }
    }

    public static void e(byte param0) {
        field_T = null;
        field_S = null;
        field_R = null;
        if (param0 != -13) {
            field_T = null;
        }
    }

    boolean a(int param0, qg param1, byte param2, char param3) {
        int var5 = 0;
        if (!super.a(param0, param1, (byte) 122, param3)) {
          if (null != ((a) this).field_Z) {
            if (98 != param0) {
              if (param0 != 99) {
                var5 = -38 % ((param2 - 65) / 55);
                return false;
              } else {
                boolean discarded$19 = ((a) this).field_Z.a(param1, -24);
                var5 = -38 % ((param2 - 65) / 55);
                return false;
              }
            } else {
              L0: {
                boolean discarded$20 = ((a) this).field_Z.a(param1, -90);
                if (param0 == 99) {
                  boolean discarded$21 = ((a) this).field_Z.a(param1, -24);
                  break L0;
                } else {
                  break L0;
                }
              }
              var5 = -38 % ((param2 - 65) / 55);
              return false;
            }
          } else {
            var5 = -38 % ((param2 - 65) / 55);
            return false;
          }
        } else {
          return true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Q = 20;
        field_S = new al(2);
    }
}
