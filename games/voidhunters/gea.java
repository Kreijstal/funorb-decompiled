/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class gea extends iw {
    private int field_J;
    private shb field_K;
    private int field_M;
    private int field_P;
    private int field_O;
    private qpb field_L;
    private int field_Q;
    private oe field_N;

    void b(shb param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              ((gea) this).field_K = param0;
              if (iab.field_a == ((gea) this).field_N) {
                ((gea) this).c(116, ((gea) this).field_K.field_h + 12, ((gea) this).field_K.field_f + ((gea) this).field_O + 12, ((gea) this).field_M);
                ((gea) this).field_Q = 0;
                break L1;
              } else {
                if (((gea) this).field_N != gs.field_e) {
                  ((gea) this).field_N = gs.field_e;
                  ((gea) this).field_Q = 0;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            var3_int = 99 / ((6 - param1) / 46);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("gea.K(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 41);
        }
    }

    boolean a(int param0, int param1, shb param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3)) {
              if (null != ((gea) this).field_L) {
                L1: {
                  if (param1 != 98) {
                    break L1;
                  } else {
                    boolean discarded$4 = ((gea) this).field_L.a(0, param2);
                    break L1;
                  }
                }
                L2: {
                  if (param1 != 99) {
                    break L2;
                  } else {
                    boolean discarded$5 = ((gea) this).field_L.a(0, param2);
                    break L2;
                  }
                }
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                return false;
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("gea.N(").append(param0).append(44).append(param1).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param3 + 41);
        }
        return stackIn_10_0 != 0;
    }

    final boolean j(byte param0) {
        if (param0 != 55) {
          boolean discarded$2 = ((gea) this).a(87);
          ((gea) this).e(-10331);
          return super.j((byte) 55);
        } else {
          ((gea) this).e(-10331);
          return super.j((byte) 55);
        }
    }

    final void e(int param0) {
        if (((gea) this).field_N != null) {
          if (((gea) this).field_N == kk.field_o) {
            ((gea) this).field_L.field_v = 256;
            ((gea) this).field_N = null;
            super.e(param0);
            return;
          } else {
            ((gea) this).c(((gea) this).field_K.field_h + 12, -1860440319, ((gea) this).field_K.field_f + (((gea) this).field_O + 12));
            this.a(((gea) this).field_K, (byte) 71);
            ((gea) this).field_L.field_v = 256;
            ((gea) this).field_N = null;
            super.e(param0);
            return;
          }
        } else {
          super.e(param0);
          return;
        }
    }

    boolean a(int param0) {
        int var3 = 0;
        Object var4 = null;
        var3 = VoidHunters.field_G;
        if (param0 != 248) {
          var4 = null;
          ((gea) this).b((shb) null, 57);
          if (((gea) this).field_N != null) {
            if (((gea) this).field_N != gs.field_e) {
              if (((gea) this).field_N == kk.field_o) {
                int fieldTemp$4 = ((gea) this).field_Q + 1;
                ((gea) this).field_Q = ((gea) this).field_Q + 1;
                if (fieldTemp$4 != ((gea) this).field_J) {
                  ((gea) this).field_L.field_v = (((gea) this).field_Q << 8) / ((gea) this).field_J;
                  return super.a(248);
                } else {
                  ((gea) this).field_N = null;
                  ((gea) this).field_L.field_v = 256;
                  return super.a(248);
                }
              } else {
                return super.a(248);
              }
            } else {
              int fieldTemp$5 = ((gea) this).field_Q + 1;
              ((gea) this).field_Q = ((gea) this).field_Q + 1;
              if (((gea) this).field_P != fieldTemp$5) {
                ((gea) this).field_L.field_v = -((((gea) this).field_Q << 8) / ((gea) this).field_P) + 256;
                return super.a(248);
              } else {
                ((gea) this).field_N = iab.field_a;
                ((gea) this).c(96, ((gea) this).field_K.field_h + 12, ((gea) this).field_K.field_f + (((gea) this).field_O + 12), ((gea) this).field_M);
                ((gea) this).field_L.field_v = 0;
                ((gea) this).field_Q = 0;
                return super.a(248);
              }
            }
          } else {
            return super.a(248);
          }
        } else {
          if (((gea) this).field_N != null) {
            if (((gea) this).field_N != gs.field_e) {
              if (((gea) this).field_N == kk.field_o) {
                int fieldTemp$6 = ((gea) this).field_Q + 1;
                ((gea) this).field_Q = ((gea) this).field_Q + 1;
                if (fieldTemp$6 != ((gea) this).field_J) {
                  ((gea) this).field_L.field_v = (((gea) this).field_Q << 8) / ((gea) this).field_J;
                  return super.a(248);
                } else {
                  ((gea) this).field_N = null;
                  ((gea) this).field_L.field_v = 256;
                  return super.a(248);
                }
              } else {
                return super.a(248);
              }
            } else {
              int fieldTemp$7 = ((gea) this).field_Q + 1;
              ((gea) this).field_Q = ((gea) this).field_Q + 1;
              if (((gea) this).field_P != fieldTemp$7) {
                ((gea) this).field_L.field_v = -((((gea) this).field_Q << 8) / ((gea) this).field_P) + 256;
                return super.a(248);
              } else {
                ((gea) this).field_N = iab.field_a;
                ((gea) this).c(96, ((gea) this).field_K.field_h + 12, ((gea) this).field_K.field_f + (((gea) this).field_O + 12), ((gea) this).field_M);
                ((gea) this).field_L.field_v = 0;
                ((gea) this).field_Q = 0;
                return super.a(248);
              }
            }
          } else {
            return super.a(248);
          }
        }
    }

    final void d(int param0) {
        if (gs.field_e == ((gea) this).field_N) {
          return;
        } else {
          ((gea) this).field_Q = 0;
          ((gea) this).field_N = kk.field_o;
          this.a(((gea) this).field_K, (byte) 71);
          ((gea) this).field_K = null;
          if (param0 != 15435) {
            ((gea) this).field_M = 66;
            ((gea) this).field_L.field_v = 0;
            return;
          } else {
            ((gea) this).field_L.field_v = 0;
            return;
          }
        }
    }

    private final void a(shb param0, byte param1) {
        try {
            if (!(null == ((gea) this).field_L)) {
                ((gea) this).field_L.b(-3846);
            }
            if (param0 == null) {
                ((gea) this).field_L = new qpb();
            } else {
                param0.a(6, param0.field_h, param0.field_f, 1, ((gea) this).field_O + 6);
                ((gea) this).field_L = new qpb(param0);
            }
            ((gea) this).b(-18756, (shb) (Object) ((gea) this).field_L);
            ((gea) this).field_K = null;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "gea.H(" + (param0 != null ? "{...}" : "null") + 44 + 71 + 41);
        }
    }

    gea(ida param0, shb param1, int param2, int param3, int param4) {
        super(param0, 12 + param1.field_h, param1.field_f + (12 - -param2));
        try {
            ((gea) this).field_M = param4;
            ((gea) this).field_J = param3;
            ((gea) this).field_P = param3;
            ((gea) this).field_O = param2;
            this.a(param1, (byte) 71);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "gea.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    static {
    }
}
