/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class le extends ksa {
    int field_h;
    rt field_d;
    boolean field_g;
    le[] field_e;
    gab field_f;

    final int[][] a(byte param0, int param1, int param2) {
        int[] var4 = null;
        int[][] var5 = null;
        int[] var6 = null;
        if (param0 >= 30) {
          if (((le) this).field_e[param1].field_g) {
            var6 = ((le) this).field_e[param1].a(param2, true);
            var4 = var6;
            var5 = new int[3][];
            var5[1] = var6;
            var5[2] = var6;
            var5[0] = var6;
            return var5;
          } else {
            return ((le) this).field_e[param1].a(255, param2);
          }
        } else {
          return null;
        }
    }

    void c(int param0) {
        if (((le) this).field_g) {
          ((le) this).field_f.a(false);
          ((le) this).field_f = null;
          if (param0 <= -23) {
            return;
          } else {
            ((le) this).field_g = true;
            return;
          }
        } else {
          ((le) this).field_d.a(1);
          ((le) this).field_d = null;
          if (param0 <= -23) {
            return;
          } else {
            ((le) this).field_g = true;
            return;
          }
        }
    }

    void b(int param0, int param1, int param2) {
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 == -9163) {
          L0: {
            if (255 == ((le) this).field_h) {
              stackOut_10_0 = param2;
              stackIn_11_0 = stackOut_10_0;
              break L0;
            } else {
              stackOut_9_0 = ((le) this).field_h;
              stackIn_11_0 = stackOut_9_0;
              break L0;
            }
          }
          var4 = stackIn_11_0;
          if (!((le) this).field_g) {
            ((le) this).field_d = new rt(var4, param2, param1);
            return;
          } else {
            ((le) this).field_f = new gab(var4, param2, param1);
            return;
          }
        } else {
          L1: {
            int[][] discarded$14 = ((le) this).a(-12, 12);
            if (255 == ((le) this).field_h) {
              stackOut_3_0 = param2;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = ((le) this).field_h;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          var4 = stackIn_4_0;
          if (!((le) this).field_g) {
            ((le) this).field_d = new rt(var4, param2, param1);
            return;
          } else {
            ((le) this).field_f = new gab(var4, param2, param1);
            return;
          }
        }
    }

    final int[] a(int param0, int param1, int param2) {
        if (param2 == 255) {
          if (!((le) this).field_e[param0].field_g) {
            return ((le) this).field_e[param0].a(255, param1)[0];
          } else {
            return ((le) this).field_e[param0].a(param1, true);
          }
        } else {
          int discarded$7 = ((le) this).d((byte) -6);
          if (!((le) this).field_e[param0].field_g) {
            return ((le) this).field_e[param0].a(255, param1)[0];
          } else {
            return ((le) this).field_e[param0].a(param1, true);
          }
        }
    }

    int d(byte param0) {
        if (param0 <= 62) {
            ((le) this).field_d = null;
            return -1;
        }
        return -1;
    }

    int a(int param0) {
        if (param0 != -1) {
            Object var3 = null;
            ((le) this).a(97, 76, (ds) null);
            return -1;
        }
        return -1;
    }

    int[] a(int param0, boolean param1) {
        if (!param1) {
            int discarded$0 = ((le) this).a(-12);
            throw new IllegalStateException("This operation does not have a monochrome output");
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    void c(byte param0) {
        if (param0 >= -35) {
            ((le) this).c((byte) -62);
        }
    }

    int[][] a(int param0, int param1) {
        Object var4 = null;
        if (param0 != 255) {
          var4 = null;
          ((le) this).a(-96, -51, (ds) null);
          throw new IllegalStateException("This operation does not have a colour output");
        } else {
          throw new IllegalStateException("This operation does not have a colour output");
        }
    }

    final static arb a(asb param0, byte param1, asb param2, int param3, int param4) {
        RuntimeException var5 = null;
        Object var6 = null;
        Object stackIn_4_0 = null;
        arb stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        arb stackOut_5_0 = null;
        Object stackOut_3_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param1 <= -21) {
                break L1;
              } else {
                var6 = null;
                arb discarded$2 = le.a((asb) null, (byte) 32, (asb) null, -82, 9);
                break L1;
              }
            }
            if (pa.a(param4, 2, param0, param3)) {
              stackOut_5_0 = coa.a(param2.a(param4, param3, (byte) 13), 11);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (arb) (Object) stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("le.Q(");
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
          L3: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44).append(param1).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param3 + 44 + param4 + 41);
        }
        return stackIn_6_0;
    }

    le(int param0, boolean param1) {
        ((le) this).field_e = new le[param0];
        ((le) this).field_g = param1 ? true : false;
    }

    void a(int param0, int param1, ds param2) {
        RuntimeException runtimeException = null;
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
            L1: {
              if (param1 <= -60) {
                break L1;
              } else {
                ((le) this).field_g = false;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("le.F(").append(param0).append(44).append(param1).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    static {
    }
}
