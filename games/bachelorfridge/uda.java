/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class uda extends am {
    private int field_Z;
    static int[] field_X;
    static String[] field_cb;
    static String field_ab;
    private int field_W;
    private int field_V;
    private int field_db;
    static vr field_U;
    private hl field_S;
    private int field_bb;
    private kf field_Y;
    private wj field_T;
    static String field_eb;

    boolean a(int param0) {
        int var3 = 0;
        var3 = BachelorFridge.field_y;
        if (null == ((uda) this).field_Y) {
          if (param0 >= -32) {
            return false;
          } else {
            return this.a(-118);
          }
        } else {
          if (pj.field_n == ((uda) this).field_Y) {
            ((uda) this).field_Z = ((uda) this).field_Z + 1;
            if (((uda) this).field_Z + 1 == ((uda) this).field_W) {
              ((uda) this).field_Y = cp.field_b;
              ((uda) this).a(((uda) this).field_db, 26012, ((uda) this).field_T.field_q + 12 + ((uda) this).field_bb, 12 - -((uda) this).field_T.field_p);
              ((uda) this).field_S.field_F = 0;
              ((uda) this).field_Z = 0;
              if (param0 >= -32) {
                return false;
              } else {
                return this.a(-118);
              }
            } else {
              ((uda) this).field_S.field_F = -((((uda) this).field_Z << 1370402184) / ((uda) this).field_W) + 256;
              if (param0 >= -32) {
                return false;
              } else {
                return this.a(-118);
              }
            }
          } else {
            if (((uda) this).field_Y == dha.field_b) {
              ((uda) this).field_Z = ((uda) this).field_Z + 1;
              if (((uda) this).field_V != ((uda) this).field_Z + 1) {
                ((uda) this).field_S.field_F = (((uda) this).field_Z << -74968056) / ((uda) this).field_V;
                if (param0 >= -32) {
                  return false;
                } else {
                  return this.a(-118);
                }
              } else {
                ((uda) this).field_Y = null;
                ((uda) this).field_S.field_F = 256;
                if (param0 >= -32) {
                  return false;
                } else {
                  return this.a(-118);
                }
              }
            } else {
              if (param0 >= -32) {
                return false;
              } else {
                return this.a(-118);
              }
            }
          }
        }
    }

    final boolean k(int param0) {
        if (param0 >= -59) {
            return true;
        }
        ((uda) this).m(17310);
        return this.k(-79);
    }

    final static void b(boolean param0, int param1, int param2, int param3) {
        if (param3 < 13) {
            return;
        }
        qm.a(false, param0, param1, param2);
    }

    public static void n(int param0) {
        if (param0 <= 109) {
          uda.n(-52);
          field_U = null;
          field_X = null;
          field_cb = null;
          field_ab = null;
          field_eb = null;
          return;
        } else {
          field_U = null;
          field_X = null;
          field_cb = null;
          field_ab = null;
          field_eb = null;
          return;
        }
    }

    boolean a(int param0, int param1, char param2, wj param3) {
        if (this.a(param0, param1, param2, param3)) {
          return true;
        } else {
          if (((uda) this).field_S != null) {
            if (98 != param1) {
              if ((param1 ^ -1) == -100) {
                boolean discarded$12 = ((uda) this).field_S.a(param3, -94);
                return false;
              } else {
                return false;
              }
            } else {
              boolean discarded$13 = ((uda) this).field_S.a(param3, -101);
              if ((param1 ^ -1) != -100) {
                return false;
              } else {
                boolean discarded$14 = ((uda) this).field_S.a(param3, -94);
                return false;
              }
            }
          } else {
            return false;
          }
        }
    }

    final void b(boolean param0) {
        Object var3 = null;
        if (pj.field_n != ((uda) this).field_Y) {
          ((uda) this).field_Y = dha.field_b;
          ((uda) this).field_Z = 0;
          if (param0) {
            var3 = null;
            ((uda) this).e((wj) null, 10);
            this.d(((uda) this).field_T, -15084);
            ((uda) this).field_S.field_F = 0;
            ((uda) this).field_T = null;
            return;
          } else {
            this.d(((uda) this).field_T, -15084);
            ((uda) this).field_S.field_F = 0;
            ((uda) this).field_T = null;
            return;
          }
        } else {
          return;
        }
    }

    uda(rp param0, wj param1, int param2, int param3, int param4) {
        super(param0, 12 - -param1.field_p, param1.field_q + (12 - -param2));
        ((uda) this).field_db = param4;
        ((uda) this).field_bb = param2;
        ((uda) this).field_V = param3;
        ((uda) this).field_W = param3;
        this.d(param1, -15084);
    }

    private final void d(wj param0, int param1) {
        if (null == ((uda) this).field_S) {
          if (param0 != null) {
            param0.a(6, param0.field_q, (byte) 59, param0.field_p, 6 - -((uda) this).field_bb);
            ((uda) this).field_S = new hl(param0);
            ((uda) this).c((wj) (Object) ((uda) this).field_S, param1 + 15073);
            if (param1 == -15084) {
              ((uda) this).field_T = null;
              return;
            } else {
              ((uda) this).field_Z = -77;
              ((uda) this).field_T = null;
              return;
            }
          } else {
            ((uda) this).field_S = new hl();
            ((uda) this).c((wj) (Object) ((uda) this).field_S, param1 + 15073);
            if (param1 == -15084) {
              ((uda) this).field_T = null;
              return;
            } else {
              ((uda) this).field_Z = -77;
              ((uda) this).field_T = null;
              return;
            }
          }
        } else {
          ((uda) this).field_S.a(false);
          if (param0 != null) {
            param0.a(6, param0.field_q, (byte) 59, param0.field_p, 6 - -((uda) this).field_bb);
            ((uda) this).field_S = new hl(param0);
            ((uda) this).c((wj) (Object) ((uda) this).field_S, param1 + 15073);
            if (param1 == -15084) {
              ((uda) this).field_T = null;
              return;
            } else {
              ((uda) this).field_Z = -77;
              ((uda) this).field_T = null;
              return;
            }
          } else {
            ((uda) this).field_S = new hl();
            ((uda) this).c((wj) (Object) ((uda) this).field_S, param1 + 15073);
            if (param1 == -15084) {
              ((uda) this).field_T = null;
              return;
            } else {
              ((uda) this).field_Z = -77;
              ((uda) this).field_T = null;
              return;
            }
          }
        }
    }

    void e(wj param0, int param1) {
        ((uda) this).field_T = param0;
        if (param1 == 33) {
          if (((uda) this).field_Y != cp.field_b) {
            if (pj.field_n == ((uda) this).field_Y) {
              return;
            } else {
              ((uda) this).field_Z = 0;
              ((uda) this).field_Y = pj.field_n;
              return;
            }
          } else {
            ((uda) this).a(((uda) this).field_db, 26012, ((uda) this).field_T.field_q + ((uda) this).field_bb + 12, 12 + ((uda) this).field_T.field_p);
            ((uda) this).field_Z = 0;
            return;
          }
        } else {
          return;
        }
    }

    final void m(int param0) {
        L0: {
          if (null != ((uda) this).field_Y) {
            L1: {
              if (((uda) this).field_Y != dha.field_b) {
                ((uda) this).b(-41, 12 + ((uda) this).field_bb + ((uda) this).field_T.field_q, 12 + ((uda) this).field_T.field_p);
                this.d(((uda) this).field_T, -15084);
                break L1;
              } else {
                break L1;
              }
            }
            ((uda) this).field_S.field_F = 256;
            ((uda) this).field_Y = null;
            break L0;
          } else {
            break L0;
          }
        }
        this.m(param0 ^ 0);
        if (param0 != 17310) {
          ((uda) this).b(false);
          return;
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_cb = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        field_ab = "Quit to website";
        field_eb = "Press F10 to open Quick Chat.";
    }
}
