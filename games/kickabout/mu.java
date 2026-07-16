/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class mu extends cm {
    private int field_W;
    private ic field_X;
    private fd field_V;
    static String field_S;
    private int field_T;
    private pj field_ab;
    private int field_U;
    static hd field_Y;
    static int[] field_Q;
    private int field_Z;
    private int field_R;

    private final void b(fd param0, int param1) {
        L0: {
          if (null != ((mu) this).field_ab) {
            ((mu) this).field_ab.c((byte) -109);
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 > 50) {
          if (param0 == null) {
            ((mu) this).field_ab = new pj();
            ((mu) this).a(-83, (fd) (Object) ((mu) this).field_ab);
            ((mu) this).field_V = null;
            return;
          } else {
            param0.a(param0.field_i, 1, 6, param0.field_n, ((mu) this).field_R + 6);
            ((mu) this).field_ab = new pj(param0);
            ((mu) this).a(-83, (fd) (Object) ((mu) this).field_ab);
            ((mu) this).field_V = null;
            return;
          }
        } else {
          ((mu) this).field_X = null;
          if (param0 == null) {
            ((mu) this).field_ab = new pj();
            ((mu) this).a(-83, (fd) (Object) ((mu) this).field_ab);
            ((mu) this).field_V = null;
            return;
          } else {
            param0.a(param0.field_i, 1, 6, param0.field_n, ((mu) this).field_R + 6);
            ((mu) this).field_ab = new pj(param0);
            ((mu) this).a(-83, (fd) (Object) ((mu) this).field_ab);
            ((mu) this).field_V = null;
            return;
          }
        }
    }

    final void m(int param0) {
        if (null == ((mu) this).field_X) {
            super.m(param0);
            return;
        }
        if (wn.field_b != ((mu) this).field_X) {
            ((mu) this).a((byte) 127, ((mu) this).field_V.field_i + (((mu) this).field_R + 12), 12 + ((mu) this).field_V.field_n);
            this.b(((mu) this).field_V, 54);
        } else {
            ((mu) this).field_ab.field_F = 256;
            ((mu) this).field_X = null;
            super.m(param0);
            return;
        }
        ((mu) this).field_ab.field_F = 256;
        ((mu) this).field_X = null;
        super.m(param0);
    }

    boolean a(char param0, byte param1, fd param2, int param3) {
        if (super.a(param0, (byte) -78, param2, param3)) {
          return true;
        } else {
          if (null != ((mu) this).field_ab) {
            L0: {
              if (-99 == (param3 ^ -1)) {
                boolean discarded$10 = ((mu) this).field_ab.a(param2, 0);
                break L0;
              } else {
                break L0;
              }
            }
            if (param3 != 99) {
              if (param1 >= -60) {
                return true;
              } else {
                return false;
              }
            } else {
              boolean discarded$11 = ((mu) this).field_ab.a(param2, 0);
              if (param1 >= -60) {
                return true;
              } else {
                return false;
              }
            }
          } else {
            if (param1 >= -60) {
              return true;
            } else {
              return false;
            }
          }
        }
    }

    final static void a(int param0, boolean param1, int param2, qm param3, int param4, boolean param5) {
        Object var7 = null;
        if (param5) {
          if ((param2 ^ -1) <= -1) {
            if (param2 >= sk.field_d.field_o) {
              return;
            } else {
              sk.field_d.a(param1, 1000000, param3, -9017, param2, param4, param0);
              return;
            }
          } else {
            return;
          }
        } else {
          var7 = null;
          mu.a(-65, false, -66, (qm) null, -42, true);
          if ((param2 ^ -1) <= -1) {
            if (param2 >= sk.field_d.field_o) {
              return;
            } else {
              sk.field_d.a(param1, 1000000, param3, -9017, param2, param4, param0);
              return;
            }
          } else {
            return;
          }
        }
    }

    public static void p(int param0) {
        field_Q = null;
        if (param0 != 12) {
            field_S = null;
            field_S = null;
            field_Y = null;
            return;
        }
        field_S = null;
        field_Y = null;
    }

    void a(byte param0, fd param1) {
        ((mu) this).field_V = param1;
        if (param0 <= -117) {
          if (bf.field_m != ((mu) this).field_X) {
            if (rv.field_e != ((mu) this).field_X) {
              ((mu) this).field_X = rv.field_e;
              ((mu) this).field_T = 0;
              return;
            } else {
              return;
            }
          } else {
            ((mu) this).a((byte) -23, ((mu) this).field_U, ((mu) this).field_V.field_i + (12 - -((mu) this).field_R), ((mu) this).field_V.field_n + 12);
            ((mu) this).field_T = 0;
            return;
          }
        } else {
          ((mu) this).field_R = 54;
          if (bf.field_m != ((mu) this).field_X) {
            if (rv.field_e == ((mu) this).field_X) {
              return;
            } else {
              ((mu) this).field_X = rv.field_e;
              ((mu) this).field_T = 0;
              return;
            }
          } else {
            ((mu) this).a((byte) -23, ((mu) this).field_U, ((mu) this).field_V.field_i + (12 - -((mu) this).field_R), ((mu) this).field_V.field_n + 12);
            ((mu) this).field_T = 0;
            return;
          }
        }
    }

    mu(se param0, fd param1, int param2, int param3, int param4) {
        super(param0, 12 - -param1.field_n, param1.field_i + (12 - -param2));
        ((mu) this).field_U = param4;
        ((mu) this).field_Z = param3;
        ((mu) this).field_W = param3;
        ((mu) this).field_R = param2;
        this.b(param1, 94);
    }

    final boolean a(int param0) {
        if (param0 > -11) {
          ((mu) this).n(55);
          ((mu) this).m(4000);
          return super.a(-13);
        } else {
          ((mu) this).m(4000);
          return super.a(-13);
        }
    }

    final void n(int param0) {
        if (rv.field_e != ((mu) this).field_X) {
          ((mu) this).field_T = 0;
          ((mu) this).field_X = wn.field_b;
          this.b(((mu) this).field_V, 99);
          if (param0 != 4096) {
            return;
          } else {
            ((mu) this).field_ab.field_F = 0;
            ((mu) this).field_V = null;
            return;
          }
        } else {
          return;
        }
    }

    boolean k(int param0) {
        int var3 = 0;
        var3 = Kickabout.field_G;
        if (param0 == -1) {
          if (((mu) this).field_X != null) {
            if (rv.field_e == ((mu) this).field_X) {
              int fieldTemp$4 = ((mu) this).field_T + 1;
              ((mu) this).field_T = ((mu) this).field_T + 1;
              if (((mu) this).field_W == fieldTemp$4) {
                ((mu) this).field_X = bf.field_m;
                ((mu) this).a((byte) -104, ((mu) this).field_U, ((mu) this).field_R + (12 + ((mu) this).field_V.field_i), 12 + ((mu) this).field_V.field_n);
                ((mu) this).field_ab.field_F = 0;
                ((mu) this).field_T = 0;
                return super.k(param0 + 0);
              } else {
                ((mu) this).field_ab.field_F = -((((mu) this).field_T << 108522408) / ((mu) this).field_W) + 256;
                return super.k(param0 + 0);
              }
            } else {
              if (((mu) this).field_X == wn.field_b) {
                int fieldTemp$5 = ((mu) this).field_T + 1;
                ((mu) this).field_T = ((mu) this).field_T + 1;
                if (fieldTemp$5 == ((mu) this).field_Z) {
                  ((mu) this).field_X = null;
                  ((mu) this).field_ab.field_F = 256;
                  return super.k(param0 + 0);
                } else {
                  ((mu) this).field_ab.field_F = (((mu) this).field_T << 1334952392) / ((mu) this).field_Z;
                  return super.k(param0 + 0);
                }
              } else {
                return super.k(param0 + 0);
              }
            }
          } else {
            return super.k(param0 + 0);
          }
        } else {
          ((mu) this).field_W = -80;
          if (((mu) this).field_X != null) {
            if (rv.field_e == ((mu) this).field_X) {
              int fieldTemp$6 = ((mu) this).field_T + 1;
              ((mu) this).field_T = ((mu) this).field_T + 1;
              if (((mu) this).field_W == fieldTemp$6) {
                ((mu) this).field_X = bf.field_m;
                ((mu) this).a((byte) -104, ((mu) this).field_U, ((mu) this).field_R + (12 + ((mu) this).field_V.field_i), 12 + ((mu) this).field_V.field_n);
                ((mu) this).field_ab.field_F = 0;
                ((mu) this).field_T = 0;
                return super.k(param0 + 0);
              } else {
                ((mu) this).field_ab.field_F = -((((mu) this).field_T << 108522408) / ((mu) this).field_W) + 256;
                return super.k(param0 + 0);
              }
            } else {
              if (((mu) this).field_X == wn.field_b) {
                int fieldTemp$7 = ((mu) this).field_T + 1;
                ((mu) this).field_T = ((mu) this).field_T + 1;
                if (fieldTemp$7 == ((mu) this).field_Z) {
                  ((mu) this).field_X = null;
                  ((mu) this).field_ab.field_F = 256;
                  return super.k(param0 + 0);
                } else {
                  ((mu) this).field_ab.field_F = (((mu) this).field_T << 1334952392) / ((mu) this).field_Z;
                  return super.k(param0 + 0);
                }
              } else {
                return super.k(param0 + 0);
              }
            }
          } else {
            return super.k(param0 + 0);
          }
        }
    }

    final static boolean a(ml param0, byte param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param1 != -39) {
          L0: {
            field_Q = null;
            if (param0.l(1, param1 + 98) != 1) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (param0.l(1, param1 + 98) != 1) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static int a(int param0, int param1, String param2, String param3, String param4, boolean param5, int param6) {
        ec var7 = null;
        ec var8 = null;
        var7 = new ec(param2);
        if (param0 != 12) {
          return -64;
        } else {
          var8 = new ec(param4);
          return m.a(param6, var8, var7, param1, param5, param3, false);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Q = new int[2];
        field_S = "HOME  <%0> - <%1>  AWAY";
    }
}
