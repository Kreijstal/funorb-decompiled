/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class db extends wd {
    private int field_U;
    static int field_X;
    private jb field_ab;
    private gl field_cb;
    private al field_V;
    private int field_T;
    static volatile int field_bb;
    private int field_S;
    private int field_Y;
    private int field_W;
    static int field_db;
    static int field_Z;

    final boolean k(int param0) {
        ((db) this).o(param0);
        return super.k(0);
    }

    final void o(int param0) {
        if (null == ((db) this).field_ab) {
            super.o(param0 + param0);
            return;
        }
        if (uj.field_b != ((db) this).field_ab) {
            ((db) this).a(((db) this).field_V.field_x + 12, (byte) -86, 12 - (-((db) this).field_W + -((db) this).field_V.field_u));
            this.b((byte) 19, ((db) this).field_V);
        } else {
            ((db) this).field_ab = null;
            ((db) this).field_cb.field_H = 256;
            super.o(param0 + param0);
            return;
        }
        ((db) this).field_ab = null;
        ((db) this).field_cb.field_H = 256;
        super.o(param0 + param0);
    }

    db(vl param0, al param1, int param2, int param3, int param4) {
        super(param0, param1.field_x + 12, param1.field_u + 12 - -param2);
        ((db) this).field_T = param3;
        ((db) this).field_Y = param3;
        ((db) this).field_W = param2;
        ((db) this).field_S = param4;
        this.b((byte) 19, param1);
    }

    void b(al param0, int param1) {
        ((db) this).field_V = param0;
        if (dc.field_w != ((db) this).field_ab) {
          if (wi.field_c != ((db) this).field_ab) {
            ((db) this).field_ab = wi.field_c;
            ((db) this).field_U = 0;
            if (param1 > -61) {
              ((db) this).field_T = 115;
              return;
            } else {
              return;
            }
          } else {
            if (param1 <= -61) {
              return;
            } else {
              ((db) this).field_T = 115;
              return;
            }
          }
        } else {
          ((db) this).a(((db) this).field_V.field_x + 12, ((db) this).field_S, false, ((db) this).field_W + 12 + ((db) this).field_V.field_u);
          ((db) this).field_U = 0;
          if (param1 <= -61) {
            return;
          } else {
            ((db) this).field_T = 115;
            return;
          }
        }
    }

    private final void b(byte param0, al param1) {
        Object var4 = null;
        if (param0 == 19) {
          L0: {
            if (null != ((db) this).field_cb) {
              ((db) this).field_cb.a(-84);
              break L0;
            } else {
              break L0;
            }
          }
          if (param1 != null) {
            param1.a(param1.field_u, -3050, 6 + ((db) this).field_W, param1.field_x, 6);
            ((db) this).field_cb = new gl(param1);
            ((db) this).a(false, (al) (Object) ((db) this).field_cb);
            ((db) this).field_V = null;
            return;
          } else {
            ((db) this).field_cb = new gl();
            ((db) this).a(false, (al) (Object) ((db) this).field_cb);
            ((db) this).field_V = null;
            return;
          }
        } else {
          L1: {
            var4 = null;
            this.b((byte) 30, (al) null);
            if (null != ((db) this).field_cb) {
              ((db) this).field_cb.a(-84);
              break L1;
            } else {
              break L1;
            }
          }
          if (param1 != null) {
            param1.a(param1.field_u, -3050, 6 + ((db) this).field_W, param1.field_x, 6);
            ((db) this).field_cb = new gl(param1);
            ((db) this).a(false, (al) (Object) ((db) this).field_cb);
            ((db) this).field_V = null;
            return;
          } else {
            ((db) this).field_cb = new gl();
            ((db) this).a(false, (al) (Object) ((db) this).field_cb);
            ((db) this).field_V = null;
            return;
          }
        }
    }

    boolean j(int param0) {
        int var3 = 0;
        Object var4 = null;
        var3 = TrackController.field_F ? 1 : 0;
        if (null != ((db) this).field_ab) {
          if (wi.field_c != ((db) this).field_ab) {
            if (uj.field_b != ((db) this).field_ab) {
              if (param0 > -18) {
                var4 = null;
                db.a(99, 48, (qj) null, -61, 106, (byte) 90);
                return super.j(-94);
              } else {
                return super.j(-94);
              }
            } else {
              ((db) this).field_U = ((db) this).field_U + 1;
              if (((db) this).field_U + 1 != ((db) this).field_T) {
                ((db) this).field_cb.field_H = (((db) this).field_U << -309737176) / ((db) this).field_T;
                if (param0 > -18) {
                  var4 = null;
                  db.a(99, 48, (qj) null, -61, 106, (byte) 90);
                  return super.j(-94);
                } else {
                  return super.j(-94);
                }
              } else {
                ((db) this).field_cb.field_H = 256;
                ((db) this).field_ab = null;
                if (param0 > -18) {
                  var4 = null;
                  db.a(99, 48, (qj) null, -61, 106, (byte) 90);
                  return super.j(-94);
                } else {
                  return super.j(-94);
                }
              }
            }
          } else {
            ((db) this).field_U = ((db) this).field_U + 1;
            if (((db) this).field_Y == ((db) this).field_U + 1) {
              ((db) this).field_ab = dc.field_w;
              ((db) this).a(((db) this).field_V.field_x + 12, ((db) this).field_S, false, ((db) this).field_V.field_u + 12 + ((db) this).field_W);
              ((db) this).field_cb.field_H = 0;
              ((db) this).field_U = 0;
              if (param0 > -18) {
                var4 = null;
                db.a(99, 48, (qj) null, -61, 106, (byte) 90);
                return super.j(-94);
              } else {
                return super.j(-94);
              }
            } else {
              ((db) this).field_cb.field_H = -((((db) this).field_U << -1345371480) / ((db) this).field_Y) + 256;
              if (param0 <= -18) {
                return super.j(-94);
              } else {
                var4 = null;
                db.a(99, 48, (qj) null, -61, 106, (byte) 90);
                return super.j(-94);
              }
            }
          }
        } else {
          if (param0 <= -18) {
            return super.j(-94);
          } else {
            var4 = null;
            db.a(99, 48, (qj) null, -61, 106, (byte) 90);
            return super.j(-94);
          }
        }
    }

    final void a(byte param0) {
        if (wi.field_c != ((db) this).field_ab) {
          ((db) this).field_U = 0;
          ((db) this).field_ab = uj.field_b;
          this.b((byte) 19, ((db) this).field_V);
          ((db) this).field_V = null;
          if (param0 != -48) {
            return;
          } else {
            ((db) this).field_cb.field_H = 0;
            return;
          }
        } else {
          return;
        }
    }

    final static void b(boolean param0) {
        if (!param0) {
            field_Z = -47;
            ob.a(209, gd.b((byte) 77));
            return;
        }
        ob.a(209, gd.b((byte) 77));
    }

    boolean a(byte param0, char param1, al param2, int param3) {
        int var5 = 0;
        if (!super.a((byte) -76, param1, param2, param3)) {
          var5 = -125 % ((param0 - 17) / 51);
          if (((db) this).field_cb != null) {
            L0: {
              if (98 == param3) {
                boolean discarded$4 = ((db) this).field_cb.a((byte) -126, param2);
                break L0;
              } else {
                break L0;
              }
            }
            if (param3 != 99) {
              return false;
            } else {
              boolean discarded$5 = ((db) this).field_cb.a((byte) -125, param2);
              return false;
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    final static void a(int param0, int param1, qj param2, int param3, int param4, byte param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var6 = 0;
          var7 = 0;
          if (param4 < ll.field_a) {
            var7 = ll.field_a - param4;
            param4 = ll.field_a;
            param3 = param3 - var7;
            var7 = var7 % param2.field_t;
            var6 = var6 + var7;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var8 = 0;
          if (param1 < ll.field_b) {
            var8 = -param1 + ll.field_b;
            param1 = ll.field_b;
            param0 = param0 - var8;
            var8 = var8 % param2.field_q;
            var6 = var6 + param2.field_t * var8;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (ll.field_e < param4 + param3) {
            param3 = -param4 + ll.field_e;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (param1 - -param0 <= ll.field_g) {
            break L3;
          } else {
            param0 = -param1 + ll.field_g;
            break L3;
          }
        }
        if (param3 < -1) {
          if (-1 >= param0) {
            return;
          } else {
            var9 = param1 * ll.field_d + param4;
            ra.a(var9, param2.field_t, param0, var8, (byte) -64, ll.field_i, param3, param2.field_z, -param3 + ll.field_d, var7, var6, param2.field_q);
            var10 = 77 / ((param5 - 56) / 53);
            return;
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_X = 0;
        field_bb = 0;
    }
}
