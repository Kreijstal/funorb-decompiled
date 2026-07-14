/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rl extends sp {
    private sq field_cb;
    private int field_eb;
    private int field_Y;
    private wq field_bb;
    private iq field_Z;
    static int field_db;
    private int field_ab;
    private int field_W;
    private int field_X;

    final boolean a(int param0) {
        ((rl) this).f((byte) -23);
        if (param0 != -1) {
            ((rl) this).f((byte) -90);
            return super.a(-1);
        }
        return super.a(-1);
    }

    final void a(byte param0) {
        if (((rl) this).field_cb == nh.field_m) {
          return;
        } else {
          if (param0 >= -19) {
            ((rl) this).field_W = 26;
            ((rl) this).field_cb = id.field_g;
            ((rl) this).field_eb = 0;
            this.b(13693, ((rl) this).field_Z);
            ((rl) this).field_Z = null;
            ((rl) this).field_bb.field_J = 0;
            return;
          } else {
            ((rl) this).field_cb = id.field_g;
            ((rl) this).field_eb = 0;
            this.b(13693, ((rl) this).field_Z);
            ((rl) this).field_Z = null;
            ((rl) this).field_bb.field_J = 0;
            return;
          }
        }
    }

    final static ge a(r param0, int param1, r param2, String param3, String param4) {
        int var5 = 0;
        int var6 = 0;
        var5 = param0.a((byte) 120, param3);
        if (param1 != 12) {
          return null;
        } else {
          var6 = param0.a(var5, param4, 117);
          return vg.a(var5, var6, param1 ^ -13, param0, param2);
        }
    }

    boolean a(char param0, int param1, int param2, iq param3) {
        if (super.a(param0, param1, param2, param3)) {
          return true;
        } else {
          if (((rl) this).field_bb != null) {
            L0: {
              if ((param2 ^ -1) == -99) {
                boolean discarded$4 = ((rl) this).field_bb.a((byte) 116, param3);
                break L0;
              } else {
                break L0;
              }
            }
            if (99 != param2) {
              return false;
            } else {
              boolean discarded$5 = ((rl) this).field_bb.a((byte) 116, param3);
              return false;
            }
          } else {
            return false;
          }
        }
    }

    boolean j(int param0) {
        int var3 = 0;
        Object var4 = null;
        var3 = Vertigo2.field_L ? 1 : 0;
        if (((rl) this).field_cb != null) {
          if (nh.field_m != ((rl) this).field_cb) {
            if (((rl) this).field_cb == id.field_g) {
              ((rl) this).field_eb = ((rl) this).field_eb + 1;
              if (((rl) this).field_ab == ((rl) this).field_eb + 1) {
                ((rl) this).field_cb = null;
                ((rl) this).field_bb.field_J = 256;
                if (param0 != 17) {
                  var4 = null;
                  ((rl) this).a(true, (iq) null);
                  return super.j(17);
                } else {
                  return super.j(17);
                }
              } else {
                ((rl) this).field_bb.field_J = (((rl) this).field_eb << -1636877112) / ((rl) this).field_ab;
                if (param0 != 17) {
                  var4 = null;
                  ((rl) this).a(true, (iq) null);
                  return super.j(17);
                } else {
                  return super.j(17);
                }
              }
            } else {
              if (param0 != 17) {
                var4 = null;
                ((rl) this).a(true, (iq) null);
                return super.j(17);
              } else {
                return super.j(17);
              }
            }
          } else {
            ((rl) this).field_eb = ((rl) this).field_eb + 1;
            if (((rl) this).field_eb + 1 == ((rl) this).field_Y) {
              ((rl) this).field_cb = gf.field_f;
              ((rl) this).a(((rl) this).field_X, 12 - -((rl) this).field_Z.field_n, ((rl) this).field_W + 12 - -((rl) this).field_Z.field_s, (byte) 118);
              ((rl) this).field_eb = 0;
              ((rl) this).field_bb.field_J = 0;
              if (param0 == 17) {
                return super.j(17);
              } else {
                var4 = null;
                ((rl) this).a(true, (iq) null);
                return super.j(17);
              }
            } else {
              ((rl) this).field_bb.field_J = 256 + -((((rl) this).field_eb << 384528232) / ((rl) this).field_Y);
              if (param0 == 17) {
                return super.j(17);
              } else {
                var4 = null;
                ((rl) this).a(true, (iq) null);
                return super.j(17);
              }
            }
          }
        } else {
          if (param0 != 17) {
            var4 = null;
            ((rl) this).a(true, (iq) null);
            return super.j(17);
          } else {
            return super.j(17);
          }
        }
    }

    rl(sd param0, iq param1, int param2, int param3, int param4) {
        super(param0, 12 + param1.field_n, param1.field_s + (param2 + 12));
        ((rl) this).field_X = param4;
        ((rl) this).field_W = param2;
        ((rl) this).field_ab = param3;
        ((rl) this).field_Y = param3;
        this.b(13693, param1);
    }

    private final void b(int param0, iq param1) {
        if (((rl) this).field_bb == null) {
          if (param1 != null) {
            param1.a(false, 6, ((rl) this).field_W + 6, param1.field_s, param1.field_n);
            ((rl) this).field_bb = new wq(param1);
            ((rl) this).c((byte) -61, (iq) (Object) ((rl) this).field_bb);
            if (param0 != 13693) {
              return;
            } else {
              ((rl) this).field_Z = null;
              return;
            }
          } else {
            ((rl) this).field_bb = new wq();
            ((rl) this).c((byte) -61, (iq) (Object) ((rl) this).field_bb);
            if (param0 != 13693) {
              return;
            } else {
              ((rl) this).field_Z = null;
              return;
            }
          }
        } else {
          ((rl) this).field_bb.c(2);
          if (param1 != null) {
            param1.a(false, 6, ((rl) this).field_W + 6, param1.field_s, param1.field_n);
            ((rl) this).field_bb = new wq(param1);
            ((rl) this).c((byte) -61, (iq) (Object) ((rl) this).field_bb);
            if (param0 != 13693) {
              return;
            } else {
              ((rl) this).field_Z = null;
              return;
            }
          } else {
            ((rl) this).field_bb = new wq();
            ((rl) this).c((byte) -61, (iq) (Object) ((rl) this).field_bb);
            if (param0 != 13693) {
              return;
            } else {
              ((rl) this).field_Z = null;
              return;
            }
          }
        }
    }

    void a(boolean param0, iq param1) {
        if (!param0) {
          ((rl) this).field_Z = param1;
          if (gf.field_f != ((rl) this).field_cb) {
            if (nh.field_m != ((rl) this).field_cb) {
              ((rl) this).field_eb = 0;
              ((rl) this).field_cb = nh.field_m;
              return;
            } else {
              return;
            }
          } else {
            ((rl) this).a(((rl) this).field_X, 12 + ((rl) this).field_Z.field_n, ((rl) this).field_W + 12 - -((rl) this).field_Z.field_s, (byte) 61);
            ((rl) this).field_eb = 0;
            return;
          }
        } else {
          ((rl) this).f((byte) 75);
          ((rl) this).field_Z = param1;
          if (gf.field_f != ((rl) this).field_cb) {
            if (nh.field_m == ((rl) this).field_cb) {
              return;
            } else {
              ((rl) this).field_eb = 0;
              ((rl) this).field_cb = nh.field_m;
              return;
            }
          } else {
            ((rl) this).a(((rl) this).field_X, 12 + ((rl) this).field_Z.field_n, ((rl) this).field_W + 12 - -((rl) this).field_Z.field_s, (byte) 61);
            ((rl) this).field_eb = 0;
            return;
          }
        }
    }

    final void f(byte param0) {
        if (null == ((rl) this).field_cb) {
            super.f(param0);
            return;
        }
        if (id.field_g != ((rl) this).field_cb) {
            ((rl) this).b(-1535749535, ((rl) this).field_Z.field_n + 12, 12 - -((rl) this).field_W + ((rl) this).field_Z.field_s);
            this.b(param0 + 13716, ((rl) this).field_Z);
        } else {
            ((rl) this).field_bb.field_J = 256;
            ((rl) this).field_cb = null;
            super.f(param0);
            return;
        }
        ((rl) this).field_bb.field_J = 256;
        ((rl) this).field_cb = null;
        super.f(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_db = -1;
    }
}
