/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dg extends rg {
    private hi field_M;
    private int field_K;
    static int[] field_Q;
    private int field_S;
    static String field_L;
    private int field_O;
    private int field_N;
    private of field_R;
    private int field_J;
    private ea field_P;

    final void f(byte param0) {
        if (vu.field_g != ((dg) this).field_R) {
          ((dg) this).field_R = ha.field_b;
          ((dg) this).field_K = 0;
          if (param0 >= -28) {
            boolean discarded$2 = ((dg) this).h(-95);
            this.c(((dg) this).field_P, -15291);
            ((dg) this).field_P = null;
            ((dg) this).field_M.field_u = 0;
            return;
          } else {
            this.c(((dg) this).field_P, -15291);
            ((dg) this).field_P = null;
            ((dg) this).field_M.field_u = 0;
            return;
          }
        } else {
          return;
        }
    }

    final boolean i(int param0) {
        ((dg) this).e((byte) 82);
        int var2 = -118 / ((20 - param0) / 62);
        return this.i(126);
    }

    final void e(byte param0) {
        if (param0 <= 26) {
            boolean discarded$4 = ((dg) this).h(127);
            if (null == ((dg) this).field_R) {
                this.e((byte) 101);
                return;
            }
            if (ha.field_b != ((dg) this).field_R) {
                ((dg) this).a(12 + ((dg) this).field_P.field_q, (byte) 29, ((dg) this).field_P.field_n + ((dg) this).field_N + 12);
                this.c(((dg) this).field_P, -15291);
            } else {
                ((dg) this).field_R = null;
                ((dg) this).field_M.field_u = 256;
                this.e((byte) 101);
                return;
            }
            ((dg) this).field_R = null;
            ((dg) this).field_M.field_u = 256;
            this.e((byte) 101);
            return;
        }
        if (null == ((dg) this).field_R) {
            this.e((byte) 101);
            return;
        }
        if (ha.field_b != ((dg) this).field_R) {
            ((dg) this).a(12 + ((dg) this).field_P.field_q, (byte) 29, ((dg) this).field_P.field_n + ((dg) this).field_N + 12);
            this.c(((dg) this).field_P, -15291);
        } else {
            ((dg) this).field_R = null;
            ((dg) this).field_M.field_u = 256;
            this.e((byte) 101);
            return;
        }
        ((dg) this).field_R = null;
        ((dg) this).field_M.field_u = 256;
        this.e((byte) 101);
    }

    void d(ea param0, int param1) {
        if (param1 == -30244) {
          ((dg) this).field_P = param0;
          if (((dg) this).field_R != we.field_a) {
            if (((dg) this).field_R == vu.field_g) {
              return;
            } else {
              ((dg) this).field_K = 0;
              ((dg) this).field_R = vu.field_g;
              return;
            }
          } else {
            ((dg) this).a(param1 + 30131, ((dg) this).field_P.field_n + 12 + ((dg) this).field_N, ((dg) this).field_P.field_q + 12, ((dg) this).field_S);
            ((dg) this).field_K = 0;
            return;
          }
        } else {
          ((dg) this).field_N = -48;
          ((dg) this).field_P = param0;
          if (((dg) this).field_R != we.field_a) {
            if (((dg) this).field_R == vu.field_g) {
              return;
            } else {
              ((dg) this).field_K = 0;
              ((dg) this).field_R = vu.field_g;
              return;
            }
          } else {
            ((dg) this).a(param1 + 30131, ((dg) this).field_P.field_n + 12 + ((dg) this).field_N, ((dg) this).field_P.field_q + 12, ((dg) this).field_S);
            ((dg) this).field_K = 0;
            return;
          }
        }
    }

    boolean h(int param0) {
        int var3 = 0;
        var3 = AceOfSkies.field_G ? 1 : 0;
        if (((dg) this).field_R == null) {
          if (param0 != 11) {
            ((dg) this).f((byte) 126);
            return this.h(11);
          } else {
            return this.h(11);
          }
        } else {
          if (((dg) this).field_R != vu.field_g) {
            if (ha.field_b == ((dg) this).field_R) {
              ((dg) this).field_K = ((dg) this).field_K + 1;
              if (((dg) this).field_K + 1 != ((dg) this).field_J) {
                ((dg) this).field_M.field_u = (((dg) this).field_K << 224045032) / ((dg) this).field_J;
                if (param0 != 11) {
                  ((dg) this).f((byte) 126);
                  return this.h(11);
                } else {
                  return this.h(11);
                }
              } else {
                ((dg) this).field_R = null;
                ((dg) this).field_M.field_u = 256;
                if (param0 != 11) {
                  ((dg) this).f((byte) 126);
                  return this.h(11);
                } else {
                  return this.h(11);
                }
              }
            } else {
              if (param0 != 11) {
                ((dg) this).f((byte) 126);
                return this.h(11);
              } else {
                return this.h(11);
              }
            }
          } else {
            ((dg) this).field_K = ((dg) this).field_K + 1;
            if (((dg) this).field_K + 1 == ((dg) this).field_O) {
              ((dg) this).field_R = we.field_a;
              ((dg) this).a(-34, ((dg) this).field_N + (12 + ((dg) this).field_P.field_n), ((dg) this).field_P.field_q + 12, ((dg) this).field_S);
              ((dg) this).field_K = 0;
              ((dg) this).field_M.field_u = 0;
              if (param0 == 11) {
                return this.h(11);
              } else {
                ((dg) this).f((byte) 126);
                return this.h(11);
              }
            } else {
              ((dg) this).field_M.field_u = 256 - (((dg) this).field_K << 749379592) / ((dg) this).field_O;
              if (param0 == 11) {
                return this.h(11);
              } else {
                ((dg) this).f((byte) 126);
                return this.h(11);
              }
            }
          }
        }
    }

    boolean a(int param0, int param1, char param2, ea param3) {
        int var5 = 0;
        var5 = 71 % ((-53 - param0) / 33);
        if (!this.a(82, param1, param2, param3)) {
          if (((dg) this).field_M != null) {
            if (param1 != 98) {
              if (-100 != param1) {
                return false;
              } else {
                boolean discarded$12 = ((dg) this).field_M.a(param3, (byte) -42);
                return false;
              }
            } else {
              boolean discarded$13 = ((dg) this).field_M.a(param3, (byte) -42);
              if (-100 != param1) {
                return false;
              } else {
                boolean discarded$14 = ((dg) this).field_M.a(param3, (byte) -42);
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

    private final void c(ea param0, int param1) {
        if (((dg) this).field_M == null) {
          L0: {
            if (param0 == null) {
              ((dg) this).field_M = new hi();
              break L0;
            } else {
              param0.a(((ea) param0).field_n, 6, ((dg) this).field_N + 6, ((ea) param0).field_q, (byte) 124);
              ((dg) this).field_M = new hi(param0);
              break L0;
            }
          }
          ((dg) this).a((ea) (Object) ((dg) this).field_M, 1);
          ((dg) this).field_P = null;
          if (param1 != -15291) {
            ((dg) this).field_O = -42;
            return;
          } else {
            return;
          }
        } else {
          L1: {
            ((dg) this).field_M.c(-127);
            if (param0 == null) {
              ((dg) this).field_M = new hi();
              break L1;
            } else {
              param0.a(((ea) param0).field_n, 6, ((dg) this).field_N + 6, ((ea) param0).field_q, (byte) 124);
              ((dg) this).field_M = new hi(param0);
              break L1;
            }
          }
          ((dg) this).a((ea) (Object) ((dg) this).field_M, 1);
          ((dg) this).field_P = null;
          if (param1 == -15291) {
            return;
          } else {
            ((dg) this).field_O = -42;
            return;
          }
        }
    }

    public static void k(int param0) {
        field_L = null;
        if (param0 != 12) {
            boolean discarded$0 = dg.j(-73);
            field_Q = null;
            return;
        }
        field_Q = null;
    }

    dg(lt param0, ea param1, int param2, int param3, int param4) {
        super(param0, ((ea) param1).field_q + 12, param2 + 12 - -((ea) param1).field_n);
        ((dg) this).field_S = param4;
        ((dg) this).field_J = param3;
        ((dg) this).field_O = param3;
        ((dg) this).field_N = param2;
        this.c(param1, -15291);
    }

    final static boolean j(int param0) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 == 27711) {
          if (10 <= ob.field_d) {
            if (ks.field_b) {
              return false;
            } else {
              L0: {
                if (tg.a(-90)) {
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
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Q = new int[2];
        field_L = "Please enter your age in years";
    }
}
