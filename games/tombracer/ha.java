/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ha {
    static boolean field_b;
    d field_c;
    int field_a;

    abstract boolean f();

    final void a(boolean param0) {
        if (!param0) {
            ((ha) this).finalize();
        }
        ns.field_d[((ha) this).field_a] = false;
        ((ha) this).k();
    }

    abstract void d(int param0, int param1, int param2, int param3, int param4, int param5);

    abstract gda b();

    abstract void la();

    final void a(int param0, int param1, int param2, int param3, int param4) {
        ((ha) this).U(param3, param2, param1, param4, param0);
    }

    void a(nh param0, boolean param1) {
        try {
            ((ha) this).a(((ha) this).a((nha) (Object) param0, !param1 ? null : ((ha) this).b(param0.a(), param0.c())));
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "ha.AE(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    protected void finalize() {
        ((ha) this).a(true);
    }

    abstract void a(int param0, int param1) throws qva;

    abstract void a(float param0, float param1, float param2);

    abstract nh a(jpa param0, boolean param1);

    final void a(int param0, int param1, int param2, int param3, int param4, byte param5) {
        ((ha) this).d(param1, param0, param3, param2, param4, 1);
        if (param5 > -57) {
            ((ha) this).field_c = null;
        }
    }

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9);

    abstract void ea(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8);

    abstract int[] Y();

    abstract void ZA(int param0, float param1, float param2, float param3, float param4, float param5);

    abstract void T(int param0, int param1, int param2, int param3);

    abstract boolean h();

    abstract ka a(oc param0, int param1, int param2, int param3, int param4);

    abstract gda e();

    final void c(int param0, int param1, int param2, int param3, int param4, int param5) {
        if (param4 != -22971) {
            ((ha) this).a(-0.8806686997413635f, -0.4391394555568695f, 0.2737298011779785f);
        }
        ((ha) this).aa(param1, param3, param2, param5, param0, 1);
    }

    abstract da a(qla param0, jpa[] param1, boolean param2);

    abstract void HA(int param0, int param1, int param2, int param3, int[] param4);

    final synchronized static ha a(d param0, int param1, cn param2, int param3, int param4, int param5, java.awt.Canvas param6) {
        RuntimeException var8 = null;
        ha stackIn_2_0 = null;
        ha stackIn_6_0 = null;
        ha stackIn_10_0 = null;
        ha stackIn_13_0 = null;
        ha stackIn_16_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        ha stackOut_5_0 = null;
        ha stackOut_9_0 = null;
        ha stackOut_15_0 = null;
        ha stackOut_12_0 = null;
        ha stackOut_1_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        try {
          if (0 != param3) {
            if (param3 == 2) {
              stackOut_5_0 = pw.a(param1, param6, param4, (byte) -62, param0);
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0;
            } else {
              if (param3 == 1) {
                int discarded$2 = -109;
                stackOut_9_0 = on.a(param6, param0, param5);
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0;
              } else {
                if (5 != param3) {
                  if (param3 != 3) {
                    throw new IllegalArgumentException("UM");
                  } else {
                    stackOut_15_0 = oua.a(param0, param5, (byte) -50, param2, param6);
                    stackIn_16_0 = stackOut_15_0;
                    return stackIn_16_0;
                  }
                } else {
                  stackOut_12_0 = rua.a(true, param0, param2, param6, param5);
                  stackIn_13_0 = stackOut_12_0;
                  return stackIn_13_0;
                }
              }
            }
          } else {
            stackOut_1_0 = l.a(param1, 127, param6, param0, param4);
            stackIn_2_0 = stackOut_1_0;
            return stackIn_2_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var8 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var8;
            stackOut_19_1 = new StringBuilder().append("ha.UE(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L0;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L0;
            }
          }
          L1: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(44).append(param1).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param2 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L1;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L1;
            }
          }
          L2: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param6 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L2;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + 44 + -17441 + 41);
        }
    }

    abstract void a(int param0, int param1, int param2, int param3);

    abstract void v(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7);

    abstract void a();

    abstract void c();

    abstract void za(int param0, int param1, int param2, int param3, int param4);

    abstract void f(int param0, int param1);

    abstract void L(int param0, int param1, int param2);

    abstract void SA(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6);

    abstract void ya();

    abstract int i();

    abstract void GA(int param0);

    abstract void xa(float param0);

    abstract void d();

    final void e(int param0) throws qva {
        ((ha) this).a(param0, 0);
    }

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5);

    abstract void U(int param0, int param1, int param2, int param3, int param4);

    abstract void c(int param0);

    final void b(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((ha) this).a(param2, param0, param5, param3, param1, param4);
    }

    abstract void a(za param0);

    abstract void da(int param0, int param1, int param2, int[] param3);

    abstract void KA(int param0, int param1, int param2, int param3);

    abstract za a(int param0);

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        int var6 = 30 / ((88 - param1) / 33);
        ((ha) this).za(param4, param0, param2, param3, 1);
    }

    ha(d param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
            ((ha) this).field_c = param0;
            var2_int = -1;
            for (var3 = 0; var3 < 8; var3++) {
                if (!ns.field_d[var3]) {
                    var2_int = var3;
                    ns.field_d[var3] = true;
                    break;
                }
            }
            if (var2_int == -1) {
                throw new IllegalStateException("NFTI");
            }
            ((ha) this).field_a = var2_int;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "ha.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    abstract void s(int param0, int param1, int param2, int param3, int param4);

    abstract mw b(int param0, int param1);

    abstract ob a(int param0, int param1, int param2, int param3, int param4, float param5);

    abstract nh a(int[] param0, int param1, int param2, int param3, int param4, boolean param5);

    abstract void b(int param0);

    abstract boolean j();

    abstract int l();

    abstract void a(gda param0);

    final nh a(int[] param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        nh stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        nh stackOut_2_0 = null;
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
              if (param2 >= 73) {
                break L1;
              } else {
                ((ha) this).a(1.7194017171859741f, 0.590789794921875f, 1.4003089666366577f);
                break L1;
              }
            }
            stackOut_2_0 = ((ha) this).a(param0, param5, param3, param4, param1, true);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var7;
            stackOut_4_1 = new StringBuilder().append("ha.PE(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
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
          throw tba.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
        return stackIn_3_0;
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        ((ha) this).s(param0, param4, param2, param3, 1);
        if (param1 != -11185) {
            ((ha) this).L(-114, 43, -49);
        }
    }

    abstract void a(int param0, ob[] param1);

    abstract void K(int[] param0);

    abstract void aa(int param0, int param1, int param2, int param3, int param4, int param5);

    abstract int XA();

    abstract void a(jca param0);

    abstract void DA(int param0, int param1, int param2, int param3);

    abstract jca a(nha param0, mw param1);

    abstract void k();

    static {
    }
}
