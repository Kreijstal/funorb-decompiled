/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ml extends nb {
    static String field_kb;
    private int field_Y;
    static int[] field_ib;
    static long field_jb;
    static String field_fb;
    private int field_X;
    private na field_eb;
    static String field_cb;
    private int field_gb;
    static int[] field_mb;
    static String field_hb;
    private ok field_lb;
    static int field_ab;
    private int field_db;
    private int field_Z;
    private il field_bb;

    final void m(int param0) {
        if (((ml) this).field_lb != i.field_a) {
          ((ml) this).field_lb = ui.field_f;
          ((ml) this).field_X = 0;
          this.a((byte) -94, ((ml) this).field_eb);
          ((ml) this).field_bb.field_N = 0;
          if (param0 != -7718) {
            return;
          } else {
            ((ml) this).field_eb = null;
            return;
          }
        } else {
          return;
        }
    }

    boolean a(int param0, char param1, int param2, na param3) {
        if (super.a(param0, param1, param2, param3)) {
          return true;
        } else {
          if (((ml) this).field_bb != null) {
            L0: {
              if (98 == param0) {
                boolean discarded$4 = ((ml) this).field_bb.a(param3, -384169950);
                break L0;
              } else {
                break L0;
              }
            }
            if (-100 != (param0 ^ -1)) {
              return false;
            } else {
              boolean discarded$5 = ((ml) this).field_bb.a(param3, -384169950);
              return false;
            }
          } else {
            return false;
          }
        }
    }

    boolean l(int param0) {
        int var3 = 0;
        var3 = TetraLink.field_J;
        if (param0 == -1) {
          if (((ml) this).field_lb != null) {
            if (((ml) this).field_lb != i.field_a) {
              if (((ml) this).field_lb == ui.field_f) {
                int fieldTemp$2 = ((ml) this).field_X + 1;
                ((ml) this).field_X = ((ml) this).field_X + 1;
                if (((ml) this).field_db == fieldTemp$2) {
                  ((ml) this).field_bb.field_N = 256;
                  ((ml) this).field_lb = null;
                  return super.l(-1);
                } else {
                  ((ml) this).field_bb.field_N = (((ml) this).field_X << -1614369944) / ((ml) this).field_db;
                  return super.l(-1);
                }
              } else {
                return super.l(-1);
              }
            } else {
              int fieldTemp$3 = ((ml) this).field_X + 1;
              ((ml) this).field_X = ((ml) this).field_X + 1;
              if (((ml) this).field_Y == fieldTemp$3) {
                ((ml) this).field_lb = qk.field_d;
                ((ml) this).a(true, ((ml) this).field_gb, 12 + ((ml) this).field_eb.field_F, ((ml) this).field_Z + (12 - -((ml) this).field_eb.field_u));
                ((ml) this).field_X = 0;
                ((ml) this).field_bb.field_N = 0;
                return super.l(-1);
              } else {
                ((ml) this).field_bb.field_N = 256 - (((ml) this).field_X << 559336520) / ((ml) this).field_Y;
                return super.l(-1);
              }
            }
          } else {
            return super.l(-1);
          }
        } else {
          return false;
        }
    }

    ml(pk param0, na param1, int param2, int param3, int param4) {
        super(param0, param1.field_F + 12, param1.field_u + (param2 + 12));
        ((ml) this).field_Z = param2;
        ((ml) this).field_db = param3;
        ((ml) this).field_Y = param3;
        ((ml) this).field_gb = param4;
        this.a((byte) 90, param1);
    }

    final static void o(int param0) {
        vh.field_e.field_h = param0;
        vh.field_e.field_d = 0;
    }

    private final void a(byte param0, na param1) {
        int var3 = 0;
        L0: {
          if (((ml) this).field_bb != null) {
            ((ml) this).field_bb.b(false);
            break L0;
          } else {
            break L0;
          }
        }
        var3 = -11 % ((-4 - param0) / 48);
        if (param1 == null) {
          ((ml) this).field_bb = new il();
          ((ml) this).c((na) (Object) ((ml) this).field_bb, 10);
          ((ml) this).field_eb = null;
          return;
        } else {
          param1.a(param1.field_u, ((ml) this).field_Z + 6, 65, 6, param1.field_F);
          ((ml) this).field_bb = new il(param1);
          ((ml) this).c((na) (Object) ((ml) this).field_bb, 10);
          ((ml) this).field_eb = null;
          return;
        }
    }

    final boolean h(int param0) {
        if (param0 != 652390224) {
          ml.o(-30);
          ((ml) this).a(true);
          return super.h(652390224);
        } else {
          ((ml) this).a(true);
          return super.h(652390224);
        }
    }

    public static void e(byte param0) {
        field_ib = null;
        field_hb = null;
        if (param0 != -38) {
          field_ab = -32;
          field_fb = null;
          field_mb = null;
          field_kb = null;
          field_cb = null;
          return;
        } else {
          field_fb = null;
          field_mb = null;
          field_kb = null;
          field_cb = null;
          return;
        }
    }

    void e(na param0, int param1) {
        ((ml) this).field_eb = param0;
        if (qk.field_d != ((ml) this).field_lb) {
          if (((ml) this).field_lb == i.field_a) {
            if (param1 != -27667) {
              ml.e((byte) -4);
              return;
            } else {
              return;
            }
          } else {
            ((ml) this).field_lb = i.field_a;
            ((ml) this).field_X = 0;
            if (param1 == -27667) {
              return;
            } else {
              ml.e((byte) -4);
              return;
            }
          }
        } else {
          ((ml) this).a(true, ((ml) this).field_gb, ((ml) this).field_eb.field_F + 12, 12 - -((ml) this).field_Z + ((ml) this).field_eb.field_u);
          ((ml) this).field_X = 0;
          if (param1 == -27667) {
            return;
          } else {
            ml.e((byte) -4);
            return;
          }
        }
    }

    final void a(boolean param0) {
        if (!(((ml) this).field_lb == null)) {
            if (!(((ml) this).field_lb == ui.field_f)) {
                ((ml) this).a(12 - -((ml) this).field_eb.field_F, (byte) 96, 12 - (-((ml) this).field_Z - ((ml) this).field_eb.field_u));
                this.a((byte) -127, ((ml) this).field_eb);
            }
            ((ml) this).field_bb.field_N = 256;
            ((ml) this).field_lb = null;
        }
        super.a(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_cb = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find suitable opponents in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
        field_kb = "Loading animations";
        field_ib = new int[4];
        field_hb = "Reload game";
    }
}
