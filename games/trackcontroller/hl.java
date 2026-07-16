/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hl extends td {
    static aa field_C;
    static int field_F;
    boolean field_E;
    private vl field_D;
    private int field_G;

    boolean k(int param0) {
        Object var3 = null;
        if (param0 == 0) {
          ((hl) this).field_G = this.n(127);
          if (0 == ((hl) this).field_G) {
            if (((hl) this).field_E) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          var3 = null;
          hl.a(47, (be) null, -39, 90, -67);
          ((hl) this).field_G = this.n(127);
          if (0 == ((hl) this).field_G) {
            if (((hl) this).field_E) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static void a(int param0, be param1, int param2, int param3, int param4) {
        param1.a(12, (byte) -69);
        param1.b(param2, (byte) -123);
        param1.b(param3, (byte) -120);
        param1.b(param0, (byte) -119);
        param1.a(param4, (byte) -59);
    }

    final static void m(int param0) {
        if (param0 != -1217366687) {
          hl.l(-40);
          re.field_g.b((al) (Object) new sf(), param0 ^ 1217366722);
          return;
        } else {
          re.field_g.b((al) (Object) new sf(), param0 ^ 1217366722);
          return;
        }
    }

    private final int n(int param0) {
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 <= 126) {
          L0: {
            field_C = null;
            if (((hl) this).field_E) {
              if (this == (Object) (Object) ((hl) this).field_D.j(-6121)) {
                stackOut_11_0 = 256;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                stackOut_10_0 = 0;
                stackIn_12_0 = stackOut_10_0;
                break L0;
              }
            } else {
              stackOut_8_0 = 0;
              stackIn_12_0 = stackOut_8_0;
              break L0;
            }
          }
          return stackIn_12_0;
        } else {
          L1: {
            if (((hl) this).field_E) {
              if (this == (Object) (Object) ((hl) this).field_D.j(-6121)) {
                stackOut_5_0 = 256;
                stackIn_6_0 = stackOut_5_0;
                break L1;
              } else {
                stackOut_4_0 = 0;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_6_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_6_0;
        }
    }

    abstract void b(int param0, int param1, int param2);

    final al d(byte param0) {
        if (param0 > -124) {
            return null;
        }
        al var2 = super.d((byte) -125);
        if (var2 != null) {
            return var2;
        }
        return (al) this;
    }

    hl(vl param0, int param1, int param2) {
        super(-param1 + jf.field_j >> 1907930177, -param2 + kg.field_c >> 2108436801, param1, param2, (t) null);
        ((hl) this).field_E = false;
        ((hl) this).field_D = param0;
        ((hl) this).field_G = 0;
    }

    final static void a(int param0, int param1) {
        if (param1 == 0) {
          if (null != uh.field_b[param0]) {
            if (!uh.field_b[param0].b(param1 ^ 10000536)) {
              return;
            } else {
              fe.a(uh.field_b[param0], 2);
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void a(int param0, byte param1, int param2) {
        if (param1 >= -51) {
          hl.l(54);
          ((hl) this).a(param2, -3050, kg.field_c + -param2 >> -1811072703, param0, -param0 + jf.field_j >> -1217366687);
          return;
        } else {
          ((hl) this).a(param2, -3050, kg.field_c + -param2 >> -1811072703, param0, -param0 + jf.field_j >> -1217366687);
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if ((((hl) this).field_G ^ -1) != -1) {
          if (-257 >= (((hl) this).field_G ^ -1)) {
            if ((param0 ^ -1) == -1) {
              ((hl) this).b(((hl) this).field_p + param1, param3 ^ 29233, param2 - -((hl) this).field_m);
              super.a(param0, param1, param2, 29221);
              return;
            } else {
              return;
            }
          } else {
            if (gd.field_p == null) {
              gd.field_p = new qj(((hl) this).field_x, ((hl) this).field_u);
              mb.a((byte) -116, gd.field_p);
              ll.a();
              ((hl) this).b(0, 20, 0);
              super.a(param0, -param1 - ((hl) this).field_p, -param2 - ((hl) this).field_m, param3);
              ch.m(119);
              gd.field_p.d(param1 - -((hl) this).field_p, param2 - -((hl) this).field_m, ((hl) this).field_G);
              return;
            } else {
              if ((((hl) this).field_x ^ -1) < (gd.field_p.field_t ^ -1)) {
                gd.field_p = new qj(((hl) this).field_x, ((hl) this).field_u);
                mb.a((byte) -116, gd.field_p);
                ll.a();
                ((hl) this).b(0, 20, 0);
                super.a(param0, -param1 - ((hl) this).field_p, -param2 - ((hl) this).field_m, param3);
                ch.m(119);
                gd.field_p.d(param1 - -((hl) this).field_p, param2 - -((hl) this).field_m, ((hl) this).field_G);
                return;
              } else {
                if (((hl) this).field_u > gd.field_p.field_q) {
                  gd.field_p = new qj(((hl) this).field_x, ((hl) this).field_u);
                  mb.a((byte) -116, gd.field_p);
                  ll.a();
                  ((hl) this).b(0, 20, 0);
                  super.a(param0, -param1 - ((hl) this).field_p, -param2 - ((hl) this).field_m, param3);
                  ch.m(119);
                  gd.field_p.d(param1 - -((hl) this).field_p, param2 - -((hl) this).field_m, ((hl) this).field_G);
                  return;
                } else {
                  mb.a((byte) -116, gd.field_p);
                  ll.a();
                  ((hl) this).b(0, 20, 0);
                  super.a(param0, -param1 - ((hl) this).field_p, -param2 - ((hl) this).field_m, param3);
                  ch.m(119);
                  gd.field_p.d(param1 - -((hl) this).field_p, param2 - -((hl) this).field_m, ((hl) this).field_G);
                  return;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    public static void l(int param0) {
        field_C = null;
        int var1 = -64 / ((param0 - 19) / 59);
    }

    boolean j(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_13_0 = 0;
        int stackIn_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          var2 = this.n(127);
          var3 = var2 - ((hl) this).field_G;
          if (0 < var3) {
            ((hl) this).field_G = ((hl) this).field_G + (var3 + 7) / 8;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 < -18) {
          L1: {
            if (var3 < 0) {
              ((hl) this).field_G = ((hl) this).field_G + (-16 + var3 - -1) / 16;
              break L1;
            } else {
              break L1;
            }
          }
          if (((hl) this).field_G == 0) {
            if (var2 != 0) {
              return false;
            } else {
              L2: {
                if (((hl) this).field_E) {
                  stackOut_24_0 = 0;
                  stackIn_25_0 = stackOut_24_0;
                  break L2;
                } else {
                  stackOut_23_0 = 1;
                  stackIn_25_0 = stackOut_23_0;
                  break L2;
                }
              }
              return stackIn_25_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          L3: {
            ((hl) this).field_E = false;
            if (var3 < 0) {
              ((hl) this).field_G = ((hl) this).field_G + (-16 + var3 - -1) / 16;
              break L3;
            } else {
              break L3;
            }
          }
          if (((hl) this).field_G == 0) {
            if (var2 != 0) {
              return false;
            } else {
              L4: {
                if (((hl) this).field_E) {
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  break L4;
                } else {
                  stackOut_11_0 = 1;
                  stackIn_13_0 = stackOut_11_0;
                  break L4;
                }
              }
              return stackIn_13_0 != 0;
            }
          } else {
            return false;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = new aa(0, 2, 2, 1);
    }
}
