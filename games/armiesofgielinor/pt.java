/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class pt extends sf {
    private int field_Z;
    static String[] field_W;
    static je field_X;
    private int field_ib;
    private int field_hb;
    private bh field_cb;
    private tv field_bb;
    static h field_db;
    private int field_ab;
    private kb field_jb;
    private int field_fb;
    static uv field_eb;
    static String field_Y;
    static String field_gb;

    final static void c(int param0, int param1, int param2) {
        if (param2 < 1) {
            field_db = null;
            rk.field_B = param0;
            ar.field_C = param1;
            return;
        }
        rk.field_B = param0;
        ar.field_C = param1;
    }

    final void m(int param0) {
        if (!(((pt) this).field_bb != ur.field_v)) {
            return;
        }
        ((pt) this).field_bb = ki.field_e;
        int var2 = 113 % ((param0 - 69) / 50);
        ((pt) this).field_hb = 0;
        this.b(72, ((pt) this).field_jb);
        ((pt) this).field_jb = null;
        ((pt) this).field_cb.field_K = 0;
    }

    boolean a(byte param0) {
        int var3 = 0;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (null != ((pt) this).field_bb) {
          if (ur.field_v == ((pt) this).field_bb) {
            ((pt) this).field_hb = ((pt) this).field_hb + 1;
            if (((pt) this).field_ib == ((pt) this).field_hb + 1) {
              ((pt) this).field_bb = g.field_c;
              ((pt) this).a(((pt) this).field_Z, false, ((pt) this).field_jb.field_w + 12 + ((pt) this).field_ab, ((pt) this).field_jb.field_l + 12);
              ((pt) this).field_hb = 0;
              ((pt) this).field_cb.field_K = 0;
              if (param0 != -1) {
                boolean discarded$6 = ((pt) this).k(117);
                return this.a((byte) -1);
              } else {
                return this.a((byte) -1);
              }
            } else {
              ((pt) this).field_cb.field_K = 256 + -((((pt) this).field_hb << -1638888056) / ((pt) this).field_ib);
              if (param0 != -1) {
                boolean discarded$7 = ((pt) this).k(117);
                return this.a((byte) -1);
              } else {
                return this.a((byte) -1);
              }
            }
          } else {
            if (ki.field_e != ((pt) this).field_bb) {
              if (param0 != -1) {
                boolean discarded$8 = ((pt) this).k(117);
                return this.a((byte) -1);
              } else {
                return this.a((byte) -1);
              }
            } else {
              ((pt) this).field_hb = ((pt) this).field_hb + 1;
              if (((pt) this).field_fb == ((pt) this).field_hb + 1) {
                ((pt) this).field_bb = null;
                ((pt) this).field_cb.field_K = 256;
                if (param0 != -1) {
                  boolean discarded$9 = ((pt) this).k(117);
                  return this.a((byte) -1);
                } else {
                  return this.a((byte) -1);
                }
              } else {
                ((pt) this).field_cb.field_K = (((pt) this).field_hb << 134380648) / ((pt) this).field_fb;
                if (param0 == -1) {
                  return this.a((byte) -1);
                } else {
                  boolean discarded$10 = ((pt) this).k(117);
                  return this.a((byte) -1);
                }
              }
            }
          }
        } else {
          if (param0 == -1) {
            return this.a((byte) -1);
          } else {
            boolean discarded$11 = ((pt) this).k(117);
            return this.a((byte) -1);
          }
        }
    }

    public static void i(byte param0) {
        field_db = null;
        field_gb = null;
        field_eb = null;
        field_W = null;
        field_Y = null;
        if (param0 != -72) {
            return;
        }
        field_X = null;
    }

    final void l(int param0) {
        int var2 = 0;
        if (((pt) this).field_bb != null) {
          if (ki.field_e == ((pt) this).field_bb) {
            ((pt) this).field_bb = null;
            ((pt) this).field_cb.field_K = 256;
            this.l(81);
            var2 = 71 % ((param0 - -25) / 57);
            return;
          } else {
            ((pt) this).a(((pt) this).field_jb.field_l + 12, (byte) 98, 12 + (((pt) this).field_ab - -((pt) this).field_jb.field_w));
            this.b(107, ((pt) this).field_jb);
            ((pt) this).field_bb = null;
            ((pt) this).field_cb.field_K = 256;
            this.l(81);
            var2 = 71 % ((param0 - -25) / 57);
            return;
          }
        } else {
          this.l(81);
          var2 = 71 % ((param0 - -25) / 57);
          return;
        }
    }

    void a(kb param0, byte param1) {
        int var3 = 0;
        var3 = 116 % ((-27 - param1) / 44);
        ((pt) this).field_jb = param0;
        if (((pt) this).field_bb != g.field_c) {
          if (((pt) this).field_bb != ur.field_v) {
            ((pt) this).field_bb = ur.field_v;
            ((pt) this).field_hb = 0;
            return;
          } else {
            return;
          }
        } else {
          ((pt) this).a(((pt) this).field_Z, false, ((pt) this).field_jb.field_w + (12 + ((pt) this).field_ab), 12 - -((pt) this).field_jb.field_l);
          ((pt) this).field_hb = 0;
          return;
        }
    }

    boolean a(kb param0, int param1, char param2, int param3) {
        if (this.a(param0, param1, param2, param3)) {
          return true;
        } else {
          if (null != ((pt) this).field_cb) {
            if (98 != param1) {
              if ((param1 ^ -1) != -100) {
                return false;
              } else {
                boolean discarded$14 = ((pt) this).field_cb.a(11, param0);
                return false;
              }
            } else {
              boolean discarded$15 = ((pt) this).field_cb.a(param3 ^ -12222, param0);
              if ((param1 ^ -1) != -100) {
                return false;
              } else {
                boolean discarded$16 = ((pt) this).field_cb.a(11, param0);
                return false;
              }
            }
          } else {
            return false;
          }
        }
    }

    final boolean k(int param0) {
        int var2 = 115 / ((param0 - -1) / 44);
        ((pt) this).l(121);
        return this.k(92);
    }

    final static void a(int param0, int param1, java.awt.Canvas param2, int param3) {
        java.awt.Graphics var4 = null;
        try {
            var4 = param2.getGraphics();
            if (param1 != 12) {
                field_Y = null;
            }
            so.field_b.a(255, var4, param0, param3);
            var4.dispose();
        } catch (Exception exception) {
            param2.repaint();
        }
    }

    private final void b(int param0, kb param1) {
        int var3 = 0;
        L0: {
          if (((pt) this).field_cb == null) {
            break L0;
          } else {
            ((pt) this).field_cb.d(92);
            break L0;
          }
        }
        if (param1 != null) {
          param1.a(6, param1.field_l, 6 - -((pt) this).field_ab, 8192, param1.field_w);
          ((pt) this).field_cb = new bh(param1);
          var3 = 29 % ((param0 - 24) / 42);
          ((pt) this).a((byte) 10, (kb) (Object) ((pt) this).field_cb);
          ((pt) this).field_jb = null;
          return;
        } else {
          ((pt) this).field_cb = new bh();
          var3 = 29 % ((param0 - 24) / 42);
          ((pt) this).a((byte) 10, (kb) (Object) ((pt) this).field_cb);
          ((pt) this).field_jb = null;
          return;
        }
    }

    pt(gk param0, kb param1, int param2, int param3, int param4) {
        super(param0, param1.field_l + 12, 12 + param2 - -param1.field_w);
        ((pt) this).field_Z = param4;
        ((pt) this).field_ab = param2;
        ((pt) this).field_fb = param3;
        ((pt) this).field_ib = param3;
        this.b(-36, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_W = new String[]{"ready", "walk", "run", "attack", "ranged", "jeer", "defend", "death"};
        field_db = new h(3);
        field_Y = "Go Back";
        field_gb = "You cannot chat to <%0> because <%0> is offline in your friend list.";
    }
}
