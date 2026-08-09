/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ha {
    static of field_b;
    int field_c;
    d field_a;

    final void e(int param0) throws lp {
        this.b(0, 0);
        if (param0 >= -3) {
            field_b = (of) null;
        }
    }

    abstract void e();

    private final static ha a(java.awt.Canvas param0, int param1, d param2, int param3, byte param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        oa stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = -65 % ((4 - param4) / 50);
            stackIn_1_0 = new oa(param0, param2, param3, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var5);

            stackIn_4_1 = new StringBuilder().append("ha.D(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_5_0), stackIn_8_2 + ',' + param3 + ',' + param4 + ')');
        }
        return (ha) ((Object) stackIn_1_0);
    }

    abstract int i();

    final void e(int param0, int param1, int param2, int param3, int param4, int param5) {
        if (param5 != 3105) {
            return;
        }
        this.a(param4, param2, param3, param1, param0, 1);
    }

    abstract void c(int param0, int param1, int param2, int param3, int param4, int param5);

    abstract void f(int param0, int param1);

    final synchronized static ha a(int param0, gk param1, int param2, java.awt.Canvas param3, int param4, int param5, int param6, d param7) {
        RuntimeException var8 = null;
        ha stackIn_2_0 = null;
        ha stackIn_6_0 = null;
        ha stackIn_9_0 = null;
        ha stackIn_12_0 = null;
        ha stackIn_15_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 != 0) {
              if (2 == param2) {
                stackIn_6_0 = ha.a(param3, param6, param7, param0, (byte) -64);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if ((param2 ^ -1) != -2) {
                  if (param2 != param5) {
                    if (-4 != (param2 ^ -1)) {
                      throw new IllegalArgumentException("UM");
                    } else {
                      stackIn_15_0 = mn.a((byte) 1, param4, param3, param1, param7);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    stackIn_12_0 = gt.a(-70, param7, param3, param1, param4);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackIn_9_0 = lh.a(param3, (byte) 66, param4, param7);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackIn_2_0 = to.a(16, param7, param3, param6, param0);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var8);

            stackIn_19_1 = new StringBuilder().append("ha.N(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L1;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L2;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');

            if (param7 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L3;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L3;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_20_0), stackIn_26_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_12_0;
              } else {
                return stackIn_15_0;
              }
            }
          }
        }
    }

    abstract void KA(int param0, int param1, int param2, int param3);

    abstract void a(sm param0);

    abstract int[] Y();

    abstract boolean b();

    abstract void aa(int param0, int param1, int param2, int param3, int param4, int param5);

    abstract void a(za param0);

    abstract void a();

    abstract gd a(int param0, int param1);

    final void b(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.c(param1, param0, param2, param4, param3, param5);
    }

    abstract da a(vs param0, vd[] param1, boolean param2);

    abstract void DA(int param0, int param1, int param2, int param3);

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5);

    abstract sm a(ra param0, gd param1);

    final void a(int param0) {
        vj.field_f[this.field_c] = false;
        if (param0 != -9) {
            this.d();
        }
        this.c();
    }

    final pa a(int param0, int param1, int[] param2, int param3, int param4, int param5) {
        int var7_int = 0;
        RuntimeException var7 = null;
        pa stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var7_int = -44 % ((param0 - 43) / 53);
            stackIn_1_0 = this.a(param2, param3, param5, param4, param1, true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var7);

            stackIn_4_1 = new StringBuilder().append("ha.M(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_1_0;
    }

    abstract pa a(int[] param0, int param1, int param2, int param3, int param4, boolean param5);

    abstract void K(int[] param0);

    final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param2 != 28321) {
            return;
        }
        this.U(param3, param0, param4, param1, 1);
    }

    abstract void SA(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6);

    abstract void T(int param0, int param1, int param2, int param3);

    final static void a(ap param0, byte param1, boolean param2, int param3) {
        int var4_int = 0;
        Object var5 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              var4_int = -3 / ((param1 - 13) / 46);
              if (null == wt.field_e) {
                break L1;
              } else {
                dh.a(1000000, param3, param2, 1048576, param0);
                break L1;
              }
            }
            L2: {
              if (mg.field_d != null) {
                var5 = um.field_m;
                synchronized (var5) {
                  L3: {
                    mg.field_d.a((byte) -116, param3, -1);
                    if (param0 == dt.field_c) {
                      return;
                    } else {
                      L4: {
                        mg.field_d.d(-126);
                        um.field_m.e();
                        dt.field_c = param0;
                        if (null == dt.field_c) {
                          break L4;
                        } else {
                          mg.field_d.a(param2, -2029711608, dt.field_c);
                          break L4;
                        }
                      }
                      break L3;
                    }
                  }
                }
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var4);

            stackIn_18_1 = new StringBuilder().append("ha.PA(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    abstract void c();

    public static void a(boolean param0) {
        if (!param0) {
            ha.a(false);
        }
        field_b = null;
    }

    abstract int XA();

    abstract za c(int param0);

    abstract void U(int param0, int param1, int param2, int param3, int param4);

    protected void finalize() {
        this.a(-9);
    }

    abstract void b(int param0);

    abstract void b(int param0, int param1) throws lp;

    void a(pa param0, boolean param1) {
        try {
            this.a(this.a(param0, param1 ? this.a(param0.a(), param0.b()) : null));
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "ha.R(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    abstract pa a(vd param0, boolean param1);

    abstract boolean d();

    final void d(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.aa(param5, param2, param1, param0, param4, 1);
        if (param3 != -5782) {
            this.XA();
        }
    }

    ha(d param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
            this.field_a = param0;
            var2_int = -1;
            for (var3 = 0; (var3 ^ -1) > -9; var3++) {
                if (!vj.field_f[var3]) {
                    var2_int = var3;
                    vj.field_f[var3] = true;
                    break;
                }
            }
            if ((var2_int ^ -1) == 0) {
                throw new IllegalStateException("NFTI");
            }
            this.field_c = var2_int;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "ha.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = new of();
    }
}
