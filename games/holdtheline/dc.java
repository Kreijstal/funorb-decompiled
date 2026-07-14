/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dc extends u {
    private int field_gb;
    private int field_Z;
    private ge field_db;
    private int field_fb;
    private n field_X;
    private int field_cb;
    static e field_ib;
    static hj field_ab;
    static int field_bb;
    private int field_Y;
    private he field_eb;
    static String field_hb;

    final void b(boolean param0) {
        if (null == ((dc) this).field_db) {
            super.b(param0);
            return;
        }
        if (((dc) this).field_db != hn.field_G) {
            ((dc) this).b(537342017, ((dc) this).field_X.field_x + 12, 12 - (-((dc) this).field_Z + -((dc) this).field_X.field_u));
            this.d(((dc) this).field_X, -100);
        } else {
            ((dc) this).field_db = null;
            ((dc) this).field_eb.field_F = 256;
            super.b(param0);
            return;
        }
        ((dc) this).field_db = null;
        ((dc) this).field_eb.field_F = 256;
        super.b(param0);
    }

    boolean g(byte param0) {
        int var3 = 0;
        var3 = HoldTheLine.field_D;
        if (param0 != 39) {
          field_hb = null;
          if (null != ((dc) this).field_db) {
            if (((dc) this).field_db != dg.field_a) {
              if (hn.field_G == ((dc) this).field_db) {
                ((dc) this).field_gb = ((dc) this).field_gb + 1;
                if (((dc) this).field_cb == ((dc) this).field_gb + 1) {
                  ((dc) this).field_db = null;
                  ((dc) this).field_eb.field_F = 256;
                  return super.g((byte) 39);
                } else {
                  ((dc) this).field_eb.field_F = (((dc) this).field_gb << -1085850744) / ((dc) this).field_cb;
                  return super.g((byte) 39);
                }
              } else {
                return super.g((byte) 39);
              }
            } else {
              ((dc) this).field_gb = ((dc) this).field_gb + 1;
              if (((dc) this).field_fb != ((dc) this).field_gb + 1) {
                ((dc) this).field_eb.field_F = -((((dc) this).field_gb << 1921210792) / ((dc) this).field_fb) + 256;
                return super.g((byte) 39);
              } else {
                ((dc) this).field_db = qj.field_M;
                ((dc) this).b(117, 12 - -((dc) this).field_X.field_x, ((dc) this).field_Y, 12 + (((dc) this).field_Z - -((dc) this).field_X.field_u));
                ((dc) this).field_gb = 0;
                ((dc) this).field_eb.field_F = 0;
                return super.g((byte) 39);
              }
            }
          } else {
            return super.g((byte) 39);
          }
        } else {
          if (null != ((dc) this).field_db) {
            if (((dc) this).field_db != dg.field_a) {
              if (hn.field_G == ((dc) this).field_db) {
                ((dc) this).field_gb = ((dc) this).field_gb + 1;
                if (((dc) this).field_cb == ((dc) this).field_gb + 1) {
                  ((dc) this).field_db = null;
                  ((dc) this).field_eb.field_F = 256;
                  return super.g((byte) 39);
                } else {
                  ((dc) this).field_eb.field_F = (((dc) this).field_gb << -1085850744) / ((dc) this).field_cb;
                  return super.g((byte) 39);
                }
              } else {
                return super.g((byte) 39);
              }
            } else {
              ((dc) this).field_gb = ((dc) this).field_gb + 1;
              if (((dc) this).field_fb != ((dc) this).field_gb + 1) {
                ((dc) this).field_eb.field_F = -((((dc) this).field_gb << 1921210792) / ((dc) this).field_fb) + 256;
                return super.g((byte) 39);
              } else {
                ((dc) this).field_db = qj.field_M;
                ((dc) this).b(117, 12 - -((dc) this).field_X.field_x, ((dc) this).field_Y, 12 + (((dc) this).field_Z - -((dc) this).field_X.field_u));
                ((dc) this).field_gb = 0;
                ((dc) this).field_eb.field_F = 0;
                return super.g((byte) 39);
              }
            }
          } else {
            return super.g((byte) 39);
          }
        }
    }

    void a(n param0, byte param1) {
        int var3 = 0;
        var3 = -27 % ((param1 - -38) / 50);
        ((dc) this).field_X = param0;
        if (((dc) this).field_db != qj.field_M) {
          if (((dc) this).field_db == dg.field_a) {
            return;
          } else {
            ((dc) this).field_gb = 0;
            ((dc) this).field_db = dg.field_a;
            return;
          }
        } else {
          ((dc) this).b(67, 12 - -((dc) this).field_X.field_x, ((dc) this).field_Y, ((dc) this).field_X.field_u + 12 + ((dc) this).field_Z);
          ((dc) this).field_gb = 0;
          return;
        }
    }

    private final void d(n param0, int param1) {
        if (null == ((dc) this).field_eb) {
          if (param0 != null) {
            param0.a(6, (byte) 122, ((dc) this).field_Z + 6, param0.field_u, param0.field_x);
            ((dc) this).field_eb = new he(param0);
            ((dc) this).a(true, (n) (Object) ((dc) this).field_eb);
            if (param1 != -100) {
              ((dc) this).field_gb = -75;
              ((dc) this).field_X = null;
              return;
            } else {
              ((dc) this).field_X = null;
              return;
            }
          } else {
            ((dc) this).field_eb = new he();
            ((dc) this).a(true, (n) (Object) ((dc) this).field_eb);
            if (param1 == -100) {
              ((dc) this).field_X = null;
              return;
            } else {
              ((dc) this).field_gb = -75;
              ((dc) this).field_X = null;
              return;
            }
          }
        } else {
          ((dc) this).field_eb.d(0);
          if (param0 != null) {
            param0.a(6, (byte) 122, ((dc) this).field_Z + 6, param0.field_u, param0.field_x);
            ((dc) this).field_eb = new he(param0);
            ((dc) this).a(true, (n) (Object) ((dc) this).field_eb);
            if (param1 == -100) {
              ((dc) this).field_X = null;
              return;
            } else {
              ((dc) this).field_gb = -75;
              ((dc) this).field_X = null;
              return;
            }
          } else {
            ((dc) this).field_eb = new he();
            ((dc) this).a(true, (n) (Object) ((dc) this).field_eb);
            if (param1 == -100) {
              ((dc) this).field_X = null;
              return;
            } else {
              ((dc) this).field_gb = -75;
              ((dc) this).field_X = null;
              return;
            }
          }
        }
    }

    boolean a(n param0, int param1, byte param2, char param3) {
        if (!super.a(param0, param1, param2, param3)) {
          if (null != ((dc) this).field_eb) {
            if (-99 != (param1 ^ -1)) {
              if ((param1 ^ -1) == -100) {
                boolean discarded$12 = ((dc) this).field_eb.a(param0, -25823);
                return false;
              } else {
                return false;
              }
            } else {
              boolean discarded$13 = ((dc) this).field_eb.a(param0, -25823);
              if ((param1 ^ -1) != -100) {
                return false;
              } else {
                boolean discarded$14 = ((dc) this).field_eb.a(param0, -25823);
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

    public static void c(boolean param0) {
        field_hb = null;
        field_ib = null;
        field_ab = null;
        if (param0) {
            field_ab = null;
        }
    }

    final static int m(int param0) {
        if (param0 != 29675) {
            dc.c(false);
            return ua.field_a;
        }
        return ua.field_a;
    }

    final boolean a(boolean param0) {
        ((dc) this).b(false);
        if (!param0) {
            ((dc) this).field_fb = 23;
            return super.a(param0);
        }
        return super.a(param0);
    }

    final void k(int param0) {
        Object var3 = null;
        if (dg.field_a != ((dc) this).field_db) {
          ((dc) this).field_gb = 0;
          ((dc) this).field_db = hn.field_G;
          if (param0 >= -100) {
            var3 = null;
            ((dc) this).a((n) null, (byte) -61);
            this.d(((dc) this).field_X, -100);
            ((dc) this).field_X = null;
            ((dc) this).field_eb.field_F = 0;
            return;
          } else {
            this.d(((dc) this).field_X, -100);
            ((dc) this).field_X = null;
            ((dc) this).field_eb.field_F = 0;
            return;
          }
        } else {
          return;
        }
    }

    dc(qj param0, n param1, int param2, int param3, int param4) {
        super(param0, param1.field_x + 12, param1.field_u + (param2 + 12));
        ((dc) this).field_Y = param4;
        ((dc) this).field_cb = param3;
        ((dc) this).field_fb = param3;
        ((dc) this).field_Z = param2;
        this.d(param1, -100);
    }

    final static hn a(float param0, int param1, float param2, hn param3) {
        float var4 = 0.0f;
        float var5 = 0.0f;
        hn var6 = null;
        var4 = param3.field_E + (param3.field_I - param3.field_E) * param0;
        var5 = param3.field_E + (-param3.field_E + param3.field_I) * param2;
        var6 = new hn(param3.field_U, param3.field_z, var4, var5, param3.field_k, param3.field_N, param3.field_B, param3.field_P, param3.field_L, param3.field_F, param3.field_Q, param3.field_H, param3.field_w, param3.field_s, param3.field_m, param3.field_x, param3.field_t, param3.field_q);
        var6.field_A = (param3.field_K - param3.field_A) * param0 + param3.field_A;
        var6.field_o = param3.field_o;
        var6.field_K = (-param3.field_A + param3.field_K) * param2 + param3.field_A;
        if (param1 != -18895) {
          return null;
        } else {
          return var6;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_ib = new e(12, 0, 1, 0);
        field_hb = "Error connecting to server. Please try using a different server.";
    }
}
