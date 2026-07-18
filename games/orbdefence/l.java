/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class l {
    private int field_i;
    static String field_a;
    private int field_b;
    static String field_f;
    String field_d;
    float field_h;
    static String field_j;
    private int field_g;
    private ad[] field_e;
    static int field_c;

    final static qj a(byte param0) {
        if (qc.field_g != tl.field_h) {
          if (param0 == -20) {
            if (kf.field_d != qc.field_g) {
              return null;
            } else {
              qc.field_g = tl.field_h;
              return tl.field_g;
            }
          } else {
            return null;
          }
        } else {
          throw new IllegalStateException();
        }
    }

    public static void b(int param0) {
        field_j = null;
        field_f = null;
        field_a = null;
    }

    final static char a(int param0, byte param1) {
        int var2 = 255 & param1;
        if (0 == var2) {
            throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        }
        if (var2 < 128) {
            return (char)var2;
        }
        if (var2 >= 160) {
            return (char)var2;
        }
        int var3 = fe.field_a[-128 + var2];
        if (!(var3 != 0)) {
            var3 = 63;
        }
        var2 = var3;
        return (char)var2;
    }

    final static void a(int param0, int param1, int param2, int param3) {
        if (param0 != 0) {
          qj discarded$2 = l.a((byte) 0);
          lf.field_e = param3;
          he.field_C = param1;
          mf.field_c = param2;
          return;
        } else {
          lf.field_e = param3;
          he.field_C = param1;
          mf.field_c = param2;
          return;
        }
    }

    final static void a(java.awt.Canvas param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            var2_int = 47 % ((param1 - -27) / 42);
            hf.a(false, (java.awt.Component) (Object) param0);
            gg.a((byte) -56, (java.awt.Component) (Object) param0);
            if (mj.field_i == null) {
              break L0;
            } else {
              mj.field_i.a((java.awt.Component) (Object) param0, 23678);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var2;
            stackOut_3_1 = new StringBuilder().append("l.A(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final boolean a(boolean param0) {
        ad var2 = null;
        int var3 = 0;
        ad var4 = null;
        var3 = OrbDefence.field_D ? 1 : 0;
        L0: while (true) {
          if (((l) this).field_i <= ((l) this).field_b) {
            if (param0) {
              return true;
            } else {
              return true;
            }
          } else {
            var4 = ((l) this).field_e[((l) this).field_b];
            var2 = var4;
            if (!var4.field_g.b(-1)) {
              this.a(var4, (byte) 0, 0);
              return false;
            } else {
              L1: {
                if (0 > var4.field_a) {
                  break L1;
                } else {
                  if (!var4.field_g.c((byte) 103, var4.field_a)) {
                    this.a(var2, (byte) 0, var4.field_g.b((byte) -69, var4.field_a));
                    return false;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (null == var4.field_f) {
                  break L2;
                } else {
                  if (!var4.field_g.b((byte) -128, var4.field_f)) {
                    this.a(var2, (byte) 0, var4.field_g.a((byte) -52, var4.field_f));
                    return false;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (var4.field_a >= 0) {
                  break L3;
                } else {
                  if (null != var4.field_f) {
                    break L3;
                  } else {
                    if (null == var4.field_c) {
                      break L3;
                    } else {
                      if (var4.field_g.c(7715)) {
                        break L3;
                      } else {
                        this.a(var2, (byte) 0, var4.field_g.a(20147));
                        return false;
                      }
                    }
                  }
                }
              }
              ((l) this).field_b = ((l) this).field_b + 1;
              continue L0;
            }
          }
        }
    }

    private final void a(ad param0, byte param1, int param2) {
        float var4_float = 0.0f;
        try {
            var4_float = (float)param2 / 100.0f + (float)(1 + ((l) this).field_b);
            if (param2 == 0) {
                ((l) this).field_d = param0.field_d;
            } else {
                ((l) this).field_d = param0.field_c + " - " + param2 + "%";
            }
            ((l) this).field_h = (float)((l) this).field_g * var4_float / (float)(((l) this).field_i - -1);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "l.C(" + (param0 != null ? "{...}" : "null") + ',' + 0 + ',' + param2 + ')');
        }
    }

    final static boolean a(int param0) {
        return mb.field_b != null || we.field_B;
    }

    final static boolean a(int param0, String param1, String param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
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
            L1: {
              param2 = th.a(param2, 119, '_', "");
              if (param0 > 113) {
                break L1;
              } else {
                l.a(-42, 28, 113, 9);
                break L1;
              }
            }
            L2: {
              L3: {
                var3 = qc.a(param2, 1);
                if (param1.indexOf(param2) != -1) {
                  break L3;
                } else {
                  if (param1.indexOf(var3) == -1) {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_5_0 = 1;
              stackIn_7_0 = stackOut_5_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3_ref;
            stackOut_8_1 = new StringBuilder().append("l.H(").append(param0).append(',');
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
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          L5: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
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
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    private l() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Play free version";
        field_j = "Sound: ";
    }
}
