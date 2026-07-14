/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class nm extends cj {
    boolean field_I;
    private sd field_H;
    static int field_E;
    static boolean field_J;
    private int field_G;
    static int field_F;

    final static void k(int param0) {
        if (null == ri.field_r) {
          L0: {
            if (null != mh.field_d) {
              mh.field_d.d();
              break L0;
            } else {
              break L0;
            }
          }
          if (param0 != 8) {
            nm.b(false, 116);
            return;
          } else {
            return;
          }
        } else {
          L1: {
            ri.field_r.d();
            if (null != mh.field_d) {
              mh.field_d.d();
              break L1;
            } else {
              break L1;
            }
          }
          if (param0 == 8) {
            return;
          } else {
            nm.b(false, 116);
            return;
          }
        }
    }

    abstract void a(byte param0, int param1, int param2);

    final void a(boolean param0, int param1, int param2, int param3) {
        if (((nm) this).field_G != 0) {
          if (((nm) this).field_G <= -257) {
            if (-1 != param1) {
              return;
            } else {
              ((nm) this).a((byte) -128, ((nm) this).field_o + param2, ((nm) this).field_t + param3);
              super.a(param0, param1, param2, param3);
              return;
            }
          } else {
            if (se.field_C != null) {
              if (((nm) this).field_n <= se.field_C.field_y) {
                if (((nm) this).field_s <= se.field_C.field_t) {
                  lq.a(se.field_C, (byte) -94);
                  bi.c();
                  ((nm) this).a((byte) -128, 0, 0);
                  super.a(param0, param1, -((nm) this).field_o + -param2, -((nm) this).field_t + -param3);
                  ln.d(-28558);
                  se.field_C.c(((nm) this).field_o + param2, ((nm) this).field_t + param3, ((nm) this).field_G);
                  return;
                } else {
                  se.field_C = new er(((nm) this).field_n, ((nm) this).field_s);
                  lq.a(se.field_C, (byte) -94);
                  bi.c();
                  ((nm) this).a((byte) -128, 0, 0);
                  super.a(param0, param1, -((nm) this).field_o + -param2, -((nm) this).field_t + -param3);
                  ln.d(-28558);
                  se.field_C.c(((nm) this).field_o + param2, ((nm) this).field_t + param3, ((nm) this).field_G);
                  return;
                }
              } else {
                se.field_C = new er(((nm) this).field_n, ((nm) this).field_s);
                lq.a(se.field_C, (byte) -94);
                bi.c();
                ((nm) this).a((byte) -128, 0, 0);
                super.a(param0, param1, -((nm) this).field_o + -param2, -((nm) this).field_t + -param3);
                ln.d(-28558);
                se.field_C.c(((nm) this).field_o + param2, ((nm) this).field_t + param3, ((nm) this).field_G);
                return;
              }
            } else {
              se.field_C = new er(((nm) this).field_n, ((nm) this).field_s);
              lq.a(se.field_C, (byte) -94);
              bi.c();
              ((nm) this).a((byte) -128, 0, 0);
              super.a(param0, param1, -((nm) this).field_o + -param2, -((nm) this).field_t + -param3);
              ln.d(-28558);
              se.field_C.c(((nm) this).field_o + param2, ((nm) this).field_t + param3, ((nm) this).field_G);
              return;
            }
          }
        } else {
          return;
        }
    }

    private final int i(int param0) {
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 >= -117) {
          L0: {
            ((nm) this).field_I = false;
            if (!((nm) this).field_I) {
              stackOut_11_0 = 0;
              stackIn_12_0 = stackOut_11_0;
              break L0;
            } else {
              if (this == (Object) (Object) ((nm) this).field_H.k(0)) {
                stackOut_10_0 = 256;
                stackIn_12_0 = stackOut_10_0;
                break L0;
              } else {
                stackOut_9_0 = 0;
                stackIn_12_0 = stackOut_9_0;
                break L0;
              }
            }
          }
          return stackIn_12_0;
        } else {
          L1: {
            if (!((nm) this).field_I) {
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              break L1;
            } else {
              if (this == (Object) (Object) ((nm) this).field_H.k(0)) {
                stackOut_4_0 = 256;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = 0;
                stackIn_6_0 = stackOut_3_0;
                break L1;
              }
            }
          }
          return stackIn_6_0;
        }
    }

    final static void b(boolean param0, int param1) {
        try {
            Throwable var2 = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (!param0) {
                break L0;
              } else {
                nm.k(-53);
                break L0;
              }
            }
            try {
              Object discarded$1 = je.a((byte) 49, "resizing", ob.e((byte) 71), new Object[1]);
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            var2 = decompiledCaughtException;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
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
          var2 = this.i(-125);
          var3 = -((nm) this).field_G + var2;
          if (-1 > (var3 ^ -1)) {
            ((nm) this).field_G = ((nm) this).field_G + (8 + (var3 + -1)) / 8;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 == 17) {
          L1: {
            if ((var3 ^ -1) > -1) {
              ((nm) this).field_G = ((nm) this).field_G + (-16 + var3 - -1) / 16;
              break L1;
            } else {
              break L1;
            }
          }
          if (((nm) this).field_G == 0) {
            if (0 != var2) {
              return false;
            } else {
              L2: {
                if (((nm) this).field_I) {
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
            ((nm) this).a((byte) 65, 57, 65);
            if ((var3 ^ -1) > -1) {
              ((nm) this).field_G = ((nm) this).field_G + (-16 + var3 - -1) / 16;
              break L3;
            } else {
              break L3;
            }
          }
          if (((nm) this).field_G == 0) {
            if (0 != var2) {
              return false;
            } else {
              L4: {
                if (((nm) this).field_I) {
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

    boolean a(int param0) {
        if (param0 == -1) {
          ((nm) this).field_G = this.i(-126);
          if (((nm) this).field_G == 0) {
            if (((nm) this).field_I) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final void b(int param0, int param1, int param2) {
        if (param0 != -1535749535) {
          nm.k(-40);
          ((nm) this).a(false, gi.field_m + -param1 >> -1535749535, im.field_h + -param2 >> 987216801, param2, param1);
          return;
        } else {
          ((nm) this).a(false, gi.field_m + -param1 >> -1535749535, im.field_h + -param2 >> 987216801, param2, param1);
          return;
        }
    }

    nm(sd param0, int param1, int param2) {
        super(-param1 + gi.field_m >> 439023425, -param2 + im.field_h >> 2101548673, param1, param2, (ur) null);
        ((nm) this).field_I = false;
        ((nm) this).field_H = param0;
        ((nm) this).field_G = 0;
    }

    final iq b(boolean param0) {
        iq var2 = super.b(param0);
        if (var2 != null) {
            return var2;
        }
        return (iq) this;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = false;
        field_F = -1;
    }
}
