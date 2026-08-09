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
        }
        ns.field_d[this.field_a] = false;
        this.k();
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
        }
        this.aa(param1, param3, param2, param5, param0, 1);
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
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (0 != param3) {
              if (-3 == (param3 ^ -1)) {
                stackIn_6_0 = pw.a(param1, param6, param4, (byte) -62, param0);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (-2 == (param3 ^ -1)) {
                  stackIn_10_0 = on.a(param6, param0, param5, (byte) -109);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (5 != param3) {
                    if (param3 != 3) {
                      if (param7 == -17441) {
                        throw new IllegalArgumentException("UM");
                      } else {
                        stackIn_19_0 = (ha) null;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    } else {
                      stackIn_16_0 = oua.a(param0, param5, (byte) -50, param2, param6);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    stackIn_13_0 = rua.a(true, param0, param2, param6, param5);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              }
            } else {
              stackIn_2_0 = l.a(param1, 127, param6, param0, param4);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var8);

            stackIn_23_1 = new StringBuilder().append("ha.UE(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L1;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L2;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L3;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_24_0), stackIn_30_2 + ',' + param7 + ')');
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
        int var2_int = 0;
        int var3 = 0;
        try {
            this.field_c = param0;
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
            this.field_a = var2_int;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ha.<init>(" + (param0 != null ? "{...}" : "null") + ')');
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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_3_0 = this.a(param0, param5, param3, param4, param1, true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var7);

            stackIn_6_1 = new StringBuilder().append("ha.PE(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
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
