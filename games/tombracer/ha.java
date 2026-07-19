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
          this.finalize();
          ns.field_d[this.field_a] = false;
          this.k();
          return;
        } else {
          ns.field_d[this.field_a] = false;
          this.k();
          return;
        }
    }

    abstract void d(int param0, int param1, int param2, int param3, int param4, int param5);

    abstract gda b();

    abstract void la();

    final void a(int param0, int param1, int param2, int param3, int param4) {
        this.U(param3, param2, param1, param4, param0);
    }

    void a(nh param0, boolean param1) {
        try {
            this.a(this.a(param0, !param1 ? null : this.b(param0.a(), param0.c())));
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ha.AE(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    protected void finalize() {
        this.a(true);
    }

    abstract void a(int param0, int param1) throws qva;

    abstract void a(float param0, float param1, float param2);

    abstract nh a(jpa param0, boolean param1);

    final void a(int param0, int param1, int param2, int param3, int param4, byte param5) {
        this.d(param1, param0, param3, param2, param4, 1);
        if (param5 > -57) {
            this.field_c = (d) null;
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
          this.a(-0.8806686997413635f, -0.4391394555568695f, 0.2737298011779785f);
          this.aa(param1, param3, param2, param5, param0, 1);
          return;
        } else {
          this.aa(param1, param3, param2, param5, param0, 1);
          return;
        }
    }

    abstract da a(qla param0, jpa[] param1, boolean param2);

    abstract void HA(int param0, int param1, int param2, int param3, int[] param4);

    final synchronized static ha a(d param0, int param1, cn param2, int param3, int param4, int param5, java.awt.Canvas param6, int param7) {
        RuntimeException var8 = null;
        ha stackIn_2_0 = null;
        ha stackIn_6_0 = null;
        ha stackIn_10_0 = null;
        ha stackIn_13_0 = null;
        ha stackIn_16_0 = null;
        ha stackIn_19_0 = null;
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
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ha stackOut_5_0 = null;
        ha stackOut_9_0 = null;
        ha stackOut_18_0 = null;
        ha stackOut_15_0 = null;
        ha stackOut_12_0 = null;
        ha stackOut_1_0 = null;
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
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        try {
          L0: {
            if (0 != param3) {
              if (-3 == (param3 ^ -1)) {
                stackOut_5_0 = pw.a(param1, param6, param4, (byte) -62, param0);
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (-2 == (param3 ^ -1)) {
                  stackOut_9_0 = on.a(param6, param0, param5, (byte) -109);
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (5 != param3) {
                    if (param3 != 3) {
                      if (param7 == -17441) {
                        throw new IllegalArgumentException("UM");
                      } else {
                        stackOut_18_0 = (ha) null;
                        stackIn_19_0 = stackOut_18_0;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    } else {
                      stackOut_15_0 = oua.a(param0, param5, (byte) -50, param2, param6);
                      stackIn_16_0 = stackOut_15_0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    stackOut_12_0 = rua.a(true, param0, param2, param6, param5);
                    stackIn_13_0 = stackOut_12_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              }
            } else {
              stackOut_1_0 = l.a(param1, 127, param6, param0, param4);
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var8);
            stackOut_21_1 = new StringBuilder().append("ha.UE(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L1;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L1;
            }
          }
          L2: {
            stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',').append(param1).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L2;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L2;
            }
          }
          L3: {
            stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param6 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L3;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_13_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_16_0;
                } else {
                  return stackIn_19_0;
                }
              }
            }
          }
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
        this.a(param0, 0);
    }

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5);

    abstract void U(int param0, int param1, int param2, int param3, int param4);

    abstract void c(int param0);

    final void b(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.a(param2, param0, param5, param3, param1, param4);
    }

    abstract void a(za param0);

    abstract void da(int param0, int param1, int param2, int[] param3);

    abstract void KA(int param0, int param1, int param2, int param3);

    abstract za a(int param0);

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        int var6 = 30 / ((88 - param1) / 33);
        this.za(param4, param0, param2, param3, 1);
    }

    ha(d param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        boolean stackIn_4_0 = false;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            this.field_c = param0;
            var2_int = -1;
            var3 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var3 >= 8) {
                    break L3;
                  } else {
                    stackOut_3_0 = ns.field_d[var3];
                    stackIn_8_0 = stackOut_3_0 ? 1 : 0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_4_0) {
                          break L4;
                        } else {
                          var2_int = var3;
                          ns.field_d[var3] = true;
                          if (var4 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var3++;
                      continue L1;
                    }
                  }
                }
                stackOut_7_0 = var2_int;
                stackIn_8_0 = stackOut_7_0;
                break L2;
              }
              if (stackIn_8_0 != -1) {
                this.field_a = var2_int;
                break L0;
              } else {
                throw new IllegalStateException("NFTI");
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (runtimeException);
            stackOut_12_1 = new StringBuilder().append("ha.<init>(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
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
                this.a(1.7194017171859741f, 0.590789794921875f, 1.4003089666366577f);
                break L1;
              }
            }
            stackOut_2_0 = this.a(param0, param5, param3, param4, param1, true);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var7);
            stackOut_4_1 = new StringBuilder().append("ha.PE(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_3_0;
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        this.s(param0, param4, param2, param3, 1);
        if (param1 != -11185) {
            this.L(-114, 43, -49);
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
