/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class al extends ei {
    static java.awt.Frame field_W;
    private int field_X;
    private jl field_Z;
    private int field_ab;
    private gl field_Y;
    private int field_eb;
    private int field_db;
    private rj field_fb;
    private int field_cb;
    static int[] field_bb;

    final boolean i(int param0) {
        ((al) this).j(-2065096856);
        int var2 = -40 / ((param0 - -2) / 63);
        return super.i(61);
    }

    final static ci[] a(int param0, int param1, int param2, int param3, byte param4) {
        if (param4 != -123) {
          field_bb = null;
          return oh.a(param2, 1, 1, 3, param1, 1, 1, param0, param3);
        } else {
          return oh.a(param2, 1, 1, 3, param1, 1, 1, param0, param3);
        }
    }

    private final void b(gl param0, byte param1) {
        if (param1 == -68) {
          if (((al) this).field_Z == null) {
            if (param0 == null) {
              ((al) this).field_Z = new jl();
              ((al) this).b((byte) 95, (gl) (Object) ((al) this).field_Z);
              ((al) this).field_Y = null;
              return;
            } else {
              param0.a(6 - -((al) this).field_cb, (byte) 53, param0.field_p, 6, param0.field_n);
              ((al) this).field_Z = new jl(param0);
              ((al) this).b((byte) 95, (gl) (Object) ((al) this).field_Z);
              ((al) this).field_Y = null;
              return;
            }
          } else {
            ((al) this).field_Z.b((byte) 12);
            if (param0 == null) {
              ((al) this).field_Z = new jl();
              ((al) this).b((byte) 95, (gl) (Object) ((al) this).field_Z);
              ((al) this).field_Y = null;
              return;
            } else {
              param0.a(6 - -((al) this).field_cb, (byte) 53, param0.field_p, 6, param0.field_n);
              ((al) this).field_Z = new jl(param0);
              ((al) this).b((byte) 95, (gl) (Object) ((al) this).field_Z);
              ((al) this).field_Y = null;
              return;
            }
          }
        } else {
          return;
        }
    }

    void a(gl param0, int param1) {
        ((al) this).field_Y = param0;
        if (param1 < -21) {
          if (qb.field_h != ((al) this).field_fb) {
            if (((al) this).field_fb != hl.field_b) {
              ((al) this).field_ab = 0;
              ((al) this).field_fb = hl.field_b;
              return;
            } else {
              return;
            }
          } else {
            ((al) this).a(((al) this).field_eb, ((al) this).field_Y.field_p + 12, 12 + ((al) this).field_cb + ((al) this).field_Y.field_n, (byte) -80);
            ((al) this).field_ab = 0;
            return;
          }
        } else {
          field_bb = null;
          if (qb.field_h != ((al) this).field_fb) {
            if (((al) this).field_fb == hl.field_b) {
              return;
            } else {
              ((al) this).field_ab = 0;
              ((al) this).field_fb = hl.field_b;
              return;
            }
          } else {
            ((al) this).a(((al) this).field_eb, ((al) this).field_Y.field_p + 12, 12 + ((al) this).field_cb + ((al) this).field_Y.field_n, (byte) -80);
            ((al) this).field_ab = 0;
            return;
          }
        }
    }

    final void g(byte param0) {
        if (hl.field_b == ((al) this).field_fb) {
          return;
        } else {
          ((al) this).field_fb = dc.field_n;
          if (param0 != 109) {
            ((al) this).field_ab = 3;
            ((al) this).field_ab = 0;
            this.b(((al) this).field_Y, (byte) -68);
            ((al) this).field_Y = null;
            ((al) this).field_Z.field_J = 0;
            return;
          } else {
            ((al) this).field_ab = 0;
            this.b(((al) this).field_Y, (byte) -68);
            ((al) this).field_Y = null;
            ((al) this).field_Z.field_J = 0;
            return;
          }
        }
    }

    al(d param0, gl param1, int param2, int param3, int param4) {
        super(param0, 12 + param1.field_p, param1.field_n + (param2 + 12));
        ((al) this).field_cb = param2;
        ((al) this).field_db = param3;
        ((al) this).field_X = param3;
        ((al) this).field_eb = param4;
        this.b(param1, (byte) -68);
    }

    final void j(int param0) {
        if (!(null == ((al) this).field_fb)) {
            if (!(((al) this).field_fb == dc.field_n)) {
                ((al) this).b(98, ((al) this).field_cb + 12 - -((al) this).field_Y.field_n, 12 - -((al) this).field_Y.field_p);
                this.b(((al) this).field_Y, (byte) -68);
            }
            ((al) this).field_fb = null;
            ((al) this).field_Z.field_J = 256;
        }
        super.j(param0);
    }

    public static void k(int param0) {
        if (param0 > -1) {
            field_bb = null;
            field_bb = null;
            field_W = null;
            return;
        }
        field_bb = null;
        field_W = null;
    }

    boolean f(byte param0) {
        int var3 = 0;
        var3 = Terraphoenix.field_V;
        if (null != ((al) this).field_fb) {
          if (hl.field_b != ((al) this).field_fb) {
            if (dc.field_n != ((al) this).field_fb) {
              if (param0 != -121) {
                ((al) this).field_db = -55;
                return super.f((byte) -121);
              } else {
                return super.f((byte) -121);
              }
            } else {
              ((al) this).field_ab = ((al) this).field_ab + 1;
              if (((al) this).field_ab + 1 == ((al) this).field_db) {
                ((al) this).field_fb = null;
                ((al) this).field_Z.field_J = 256;
                if (param0 != -121) {
                  ((al) this).field_db = -55;
                  return super.f((byte) -121);
                } else {
                  return super.f((byte) -121);
                }
              } else {
                ((al) this).field_Z.field_J = (((al) this).field_ab << 1882844776) / ((al) this).field_db;
                if (param0 != -121) {
                  ((al) this).field_db = -55;
                  return super.f((byte) -121);
                } else {
                  return super.f((byte) -121);
                }
              }
            }
          } else {
            ((al) this).field_ab = ((al) this).field_ab + 1;
            if (((al) this).field_ab + 1 == ((al) this).field_X) {
              ((al) this).field_fb = qb.field_h;
              ((al) this).a(((al) this).field_eb, 12 - -((al) this).field_Y.field_p, 12 - (-((al) this).field_cb - ((al) this).field_Y.field_n), (byte) -80);
              ((al) this).field_Z.field_J = 0;
              ((al) this).field_ab = 0;
              if (param0 != -121) {
                ((al) this).field_db = -55;
                return super.f((byte) -121);
              } else {
                return super.f((byte) -121);
              }
            } else {
              ((al) this).field_Z.field_J = -((((al) this).field_ab << -526742744) / ((al) this).field_X) + 256;
              if (param0 == -121) {
                return super.f((byte) -121);
              } else {
                ((al) this).field_db = -55;
                return super.f((byte) -121);
              }
            }
          }
        } else {
          if (param0 == -121) {
            return super.f((byte) -121);
          } else {
            ((al) this).field_db = -55;
            return super.f((byte) -121);
          }
        }
    }

    boolean a(char param0, gl param1, int param2, int param3) {
        if (!super.a(param0, param1, param2 + 0, param3)) {
          L0: {
            if (null == ((al) this).field_Z) {
              break L0;
            } else {
              if (98 != param3) {
                if (99 == param3) {
                  boolean discarded$19 = ((al) this).field_Z.a((byte) 73, param1);
                  break L0;
                } else {
                  if (param2 != 30) {
                    return false;
                  } else {
                    return false;
                  }
                }
              } else {
                L1: {
                  boolean discarded$20 = ((al) this).field_Z.a((byte) 80, param1);
                  if (99 == param3) {
                    boolean discarded$21 = ((al) this).field_Z.a((byte) 73, param1);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                if (param2 != 30) {
                  return false;
                } else {
                  return false;
                }
              }
            }
          }
          if (param2 != 30) {
            return false;
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    static {
    }
}
