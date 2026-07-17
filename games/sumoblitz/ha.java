/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ha {
    d field_h;
    static ki field_e;
    static int field_b;
    int field_a;
    static int field_f;
    static String field_d;
    static ki field_g;
    static pm field_c;

    abstract void f(int param0, int param1);

    final synchronized static ha a(int param0, java.awt.Canvas param1, int param2, int param3, d param4, int param5, int param6, ki param7) {
        RuntimeException var8 = null;
        ha stackIn_3_0 = null;
        ha stackIn_6_0 = null;
        ha stackIn_9_0 = null;
        ha stackIn_12_0 = null;
        ha stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        ha stackOut_2_0 = null;
        ha stackOut_15_0 = null;
        ha stackOut_11_0 = null;
        ha stackOut_8_0 = null;
        ha stackOut_5_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        try {
          if (param2 == ~param0) {
            int discarded$4 = -1;
            stackOut_2_0 = kl.a(param5, param1, param4, param6);
            stackIn_3_0 = stackOut_2_0;
            return stackIn_3_0;
          } else {
            if (2 != param0) {
              if (param0 != 1) {
                if (5 != param0) {
                  if (param0 == 3) {
                    stackOut_15_0 = nu.a(7023, param7, param4, param1, param3);
                    stackIn_16_0 = stackOut_15_0;
                    return stackIn_16_0;
                  } else {
                    throw new IllegalArgumentException("UM");
                  }
                } else {
                  stackOut_11_0 = sb.a(param7, param2 ^ 6707, param4, param1, param3);
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0;
                }
              } else {
                int discarded$5 = 27541;
                stackOut_8_0 = aw.a(param4, param1, param3);
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0;
              }
            } else {
              stackOut_5_0 = qc.a(param5, param6, param2, param1, param4);
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var8 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var8;
            stackOut_18_1 = new StringBuilder().append("ha.HG(").append(param0).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L0;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L0;
            }
          }
          L1: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param4 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L1;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L1;
            }
          }
          L2: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(44).append(param5).append(44).append(param6).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param7 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L2;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L2;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 41);
        }
    }

    abstract void KA(int param0, int param1, int param2, int param3);

    final static void a(int param0) {
        int var1 = 0;
    }

    final hr a(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        RuntimeException var7 = null;
        hr stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        hr stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -2) {
                break L1;
              } else {
                field_g = null;
                break L1;
              }
            }
            stackOut_2_0 = ((ha) this).a(param5, param0, param3, param4, param2, true);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var7;
            stackOut_4_1 = new StringBuilder().append("ha.IG(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param5 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
    }

    public static void e(int param0) {
        field_e = null;
        field_c = null;
        field_g = null;
        field_d = null;
    }

    abstract boolean a();

    final static void a(int param0, ms param1, ms param2) {
        if (!(null == param2.field_g)) {
            param2.b(false);
        }
        if (param0 != -2) {
            return;
        }
        try {
            param2.field_g = param1.field_g;
            param2.field_b = param1;
            param2.field_g.field_b = param2;
            param2.field_b.field_g = param2;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "ha.AG(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    abstract boolean c();

    final void a(boolean param0) throws rf {
        if (!param0) {
            field_c = null;
            ((ha) this).b(0, 0);
            return;
        }
        ((ha) this).b(0, 0);
    }

    abstract da a(ta param0, ri[] param1, boolean param2);

    abstract void aa(int param0, int param1, int param2, int param3, int param4, int param5);

    final void a(byte param0, int param1, int param2, int param3, int param4, int param5) {
        ((ha) this).aa(param4, param2, param1, param5, param3, 1);
        if (param0 >= -38) {
            ((ha) this).field_a = 121;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param1 <= 80) {
          boolean discarded$2 = ((ha) this).a();
          ((ha) this).U(param4, param2, param3, param0, 1);
          return;
        } else {
          ((ha) this).U(param4, param2, param3, param0, 1);
          return;
        }
    }

    abstract vc a(bu param0, nr param1);

    final static void b(int param0) {
        sr.field_d = false;
        uw.field_b = null;
        uw.field_c = null;
        hf.field_F = null;
        no.field_b = null;
    }

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5);

    abstract void s(int param0, int param1, int param2, int param3, int param4);

    abstract int XA();

    abstract nr a(int param0, int param1);

    abstract void d();

    abstract void DA(int param0, int param1, int param2, int param3);

    abstract void b();

    abstract void U(int param0, int param1, int param2, int param3, int param4);

    final void a(byte param0) {
        fs.field_o[((ha) this).field_a] = false;
        ((ha) this).d();
        if (param0 >= -11) {
            Object var3 = null;
            ha.a(-61, (ms) null, (ms) null);
        }
    }

    abstract void K(int[] param0);

    void a(hr param0, boolean param1) {
        try {
            ((ha) this).a(((ha) this).a((bu) (Object) param0, param1 ? ((ha) this).a(param0.c(), param0.a()) : null));
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "ha.MF(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    abstract void a(za param0);

    abstract void f(int param0);

    abstract int i();

    abstract za c(int param0);

    protected void finalize() {
        ((ha) this).a((byte) -21);
    }

    abstract void a(vc param0);

    final static void a(byte param0, String param1) {
        RuntimeException runtimeException = null;
        Object var3 = null;
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
              if (param0 >= 106) {
                break L1;
              } else {
                var3 = null;
                ha discarded$2 = ha.a(-117, (java.awt.Canvas) null, -59, 3, (d) null, -128, -20, (ki) null);
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
            stackOut_3_1 = new StringBuilder().append("ha.EG(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
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
          throw qo.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    abstract hr a(ri param0, boolean param1);

    abstract void GA(int param0);

    abstract hr a(int[] param0, int param1, int param2, int param3, int param4, boolean param5);

    ha(d param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
            ((ha) this).field_h = param0;
            var2_int = -1;
            for (var3 = 0; 8 > var3; var3++) {
                if (!fs.field_o[var3]) {
                    fs.field_o[var3] = true;
                    var2_int = var3;
                    break;
                }
            }
            if (var2_int == -1) {
                throw new IllegalStateException("NFTI");
            }
            ((ha) this).field_a = var2_int;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "ha.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    abstract void SA(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6);

    abstract int[] Y();

    abstract void b(int param0, int param1) throws rf;

    abstract void e();

    abstract void T(int param0, int param1, int param2, int param3);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = null;
    }
}
