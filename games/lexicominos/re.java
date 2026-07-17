/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class re extends ql {
    private w field_W;
    private int field_Y;
    private int field_bb;
    static java.math.BigInteger field_T;
    private int field_S;
    private ia field_U;
    private rb field_R;
    static String field_cb;
    private int field_V;
    private int field_ab;
    static ge field_X;
    static int field_Z;

    boolean f(byte param0) {
        int var3 = 0;
        var3 = Lexicominos.field_L ? 1 : 0;
        if (((re) this).field_R != null) {
          if (((re) this).field_R == ok.field_k) {
            int fieldTemp$2 = ((re) this).field_V + 1;
            ((re) this).field_V = ((re) this).field_V + 1;
            if (fieldTemp$2 != ((re) this).field_S) {
              ((re) this).field_U.field_E = -((((re) this).field_V << 8) / ((re) this).field_S) + 256;
              if (param0 >= -21) {
                return false;
              } else {
                return super.f((byte) -102);
              }
            } else {
              ((re) this).field_R = fb.field_f;
              ((re) this).a(12 + ((re) this).field_W.field_j, (byte) -91, ((re) this).field_Y, ((re) this).field_ab + 12 + ((re) this).field_W.field_v);
              ((re) this).field_U.field_E = 0;
              ((re) this).field_V = 0;
              if (param0 >= -21) {
                return false;
              } else {
                return super.f((byte) -102);
              }
            }
          } else {
            if (((re) this).field_R == rl.field_H) {
              int fieldTemp$3 = ((re) this).field_V + 1;
              ((re) this).field_V = ((re) this).field_V + 1;
              if (fieldTemp$3 == ((re) this).field_bb) {
                ((re) this).field_U.field_E = 256;
                ((re) this).field_R = null;
                if (param0 >= -21) {
                  return false;
                } else {
                  return super.f((byte) -102);
                }
              } else {
                ((re) this).field_U.field_E = (((re) this).field_V << 8) / ((re) this).field_bb;
                if (param0 >= -21) {
                  return false;
                } else {
                  return super.f((byte) -102);
                }
              }
            } else {
              if (param0 >= -21) {
                return false;
              } else {
                return super.f((byte) -102);
              }
            }
          }
        } else {
          if (param0 >= -21) {
            return false;
          } else {
            return super.f((byte) -102);
          }
        }
    }

    public static void i(byte param0) {
        field_X = null;
        field_T = null;
        field_cb = null;
    }

    re(eg param0, w param1, int param2, int param3, int param4) {
        super(param0, param1.field_j + 12, param1.field_v + (param2 + 12));
        try {
            ((re) this).field_ab = param2;
            ((re) this).field_bb = param3;
            ((re) this).field_S = param3;
            ((re) this).field_Y = param4;
            this.a(param1, (byte) 125);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "re.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    boolean a(char param0, int param1, w param2, byte param3) {
        int var5_int = 0;
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
            if (!super.a(param0, param1, param2, (byte) 99)) {
              L1: {
                if (null != ((re) this).field_U) {
                  L2: {
                    if (param1 != 98) {
                      break L2;
                    } else {
                      boolean discarded$4 = ((re) this).field_U.a((byte) 44, param2);
                      break L2;
                    }
                  }
                  if (param1 != 99) {
                    break L1;
                  } else {
                    boolean discarded$5 = ((re) this).field_U.a((byte) 44, param2);
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              var5_int = 37;
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L0;
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
            stackOut_11_1 = new StringBuilder().append("re.P(").append(param0).append(44).append(param1).append(44);
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
          throw ld.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + 114 + 41);
        }
        return stackIn_10_0 != 0;
    }

    private final void a(w param0, byte param1) {
        try {
            if (param1 != 125) {
                Object var4 = null;
                this.a((w) null, (byte) -90);
            }
            if (!(null == ((re) this).field_U)) {
                ((re) this).field_U.b((byte) -118);
            }
            if (param0 == null) {
                ((re) this).field_U = new ia();
            } else {
                param0.a(param0.field_v, param0.field_j, true, ((re) this).field_ab + 6, 6);
                ((re) this).field_U = new ia(param0);
            }
            ((re) this).b((byte) 57, (w) (Object) ((re) this).field_U);
            ((re) this).field_W = null;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "re.DA(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final void h(byte param0) {
        if (ok.field_k == ((re) this).field_R) {
          return;
        } else {
          if (param0 != 38) {
            ((re) this).field_Y = 51;
            ((re) this).field_R = rl.field_H;
            ((re) this).field_V = 0;
            this.a(((re) this).field_W, (byte) 125);
            ((re) this).field_U.field_E = 0;
            ((re) this).field_W = null;
            return;
          } else {
            ((re) this).field_R = rl.field_H;
            ((re) this).field_V = 0;
            this.a(((re) this).field_W, (byte) 125);
            ((re) this).field_U.field_E = 0;
            ((re) this).field_W = null;
            return;
          }
        }
    }

    final boolean a(byte param0) {
        if (param0 != 26) {
            return false;
        }
        ((re) this).f(true);
        return super.a((byte) 26);
    }

    final void f(boolean param0) {
        if (!param0) {
          L0: {
            ((re) this).field_R = null;
            if (((re) this).field_R == null) {
              break L0;
            } else {
              L1: {
                if (rl.field_H != ((re) this).field_R) {
                  ((re) this).b(((re) this).field_W.field_j + 12, -119, ((re) this).field_W.field_v + (12 + ((re) this).field_ab));
                  this.a(((re) this).field_W, (byte) 125);
                  break L1;
                } else {
                  break L1;
                }
              }
              ((re) this).field_U.field_E = 256;
              ((re) this).field_R = null;
              break L0;
            }
          }
          super.f(param0);
          return;
        } else {
          L2: {
            if (((re) this).field_R == null) {
              break L2;
            } else {
              L3: {
                if (rl.field_H != ((re) this).field_R) {
                  ((re) this).b(((re) this).field_W.field_j + 12, -119, ((re) this).field_W.field_v + (12 + ((re) this).field_ab));
                  this.a(((re) this).field_W, (byte) 125);
                  break L3;
                } else {
                  break L3;
                }
              }
              ((re) this).field_U.field_E = 256;
              ((re) this).field_R = null;
              break L2;
            }
          }
          super.f(param0);
          return;
        }
    }

    void b(int param0, w param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param0 >= 115) {
              ((re) this).field_W = param1;
              if (fb.field_f != ((re) this).field_R) {
                if (((re) this).field_R != ok.field_k) {
                  ((re) this).field_R = ok.field_k;
                  ((re) this).field_V = 0;
                  break L0;
                } else {
                  return;
                }
              } else {
                ((re) this).a(((re) this).field_W.field_j + 12, (byte) -125, ((re) this).field_Y, ((re) this).field_W.field_v + (12 - -((re) this).field_ab));
                ((re) this).field_V = 0;
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("re.AA(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_T = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
        field_cb = "This entry doesn't match";
        field_Z = 0;
    }
}
