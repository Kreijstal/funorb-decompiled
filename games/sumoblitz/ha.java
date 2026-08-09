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
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 == (param0 ^ -1)) {
              stackIn_3_0 = kl.a(param5, param1, param4, param6, -1);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (2 != param0) {
                if ((param0 ^ -1) != -2) {
                  if (5 != param0) {
                    if ((param0 ^ -1) == -4) {
                      stackIn_16_0 = nu.a(7023, param7, param4, param1, param3);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      throw new IllegalArgumentException("UM");
                    }
                  } else {
                    stackIn_12_0 = sb.a(param7, param2 ^ 6707, param4, param1, param3);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackIn_9_0 = aw.a(param4, param1, param3, 27541);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_6_0 = qc.a(param5, param6, param2 ^ 0, param1, param4);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var8);

            stackIn_20_1 = new StringBuilder().append("ha.HG(").append(param0).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L1;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L2;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',').append(param5).append(',').append(param6).append(',');

            if (param7 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L3;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L3;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_21_0), stackIn_27_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
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
                return stackIn_16_0;
              }
            }
          }
        }
    }

    abstract void KA(int param0, int param1, int param2, int param3);

    final static void a(int param0) {
        int var1 = -102 % ((param0 - 39) / 38);
    }

    final hr a(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        RuntimeException var7 = null;
        hr stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -2) {
                break L1;
              } else {
                field_g = (ki) null;
                break L1;
              }
            }
            stackIn_3_0 = this.a(param5, param0, param3, param4, param2, true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var7);

            stackIn_6_1 = new StringBuilder().append("ha.IG(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
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
          throw qo.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public static void e(int param0) {
        field_e = null;
        if (param0 != 0) {
            return;
        }
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
            throw qo.a((Throwable) ((Object) runtimeException), "ha.AG(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    abstract boolean c();

    final void a(boolean param0) throws rf {
        if (!param0) {
            field_c = (pm) null;
            this.b(0, 0);
            return;
        }
        this.b(0, 0);
    }

    abstract da a(ta param0, ri[] param1, boolean param2);

    abstract void aa(int param0, int param1, int param2, int param3, int param4, int param5);

    final void a(byte param0, int param1, int param2, int param3, int param4, int param5) {
        this.aa(param4, param2, param1, param5, param3, 1);
        if (param0 >= -38) {
            this.field_a = 121;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param1 <= 80) {
          this.a();
          this.U(param4, param2, param3, param0, 1);
          return;
        } else {
          this.U(param4, param2, param3, param0, 1);
          return;
        }
    }

    abstract vc a(bu param0, nr param1);

    final static void b(int param0) {
        sr.field_d = false;
        uw.field_b = null;
        uw.field_c = null;
        if (param0 != 23639) {
            return;
        }
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
        fs.field_o[this.field_a] = false;
        this.d();
        if (param0 >= -11) {
            ms var3 = (ms) null;
            ha.a(-61, (ms) null, (ms) null);
        }
    }

    abstract void K(int[] param0);

    void a(hr param0, boolean param1) {
        try {
            this.a(this.a(param0, param1 ? this.a(param0.c(), param0.a()) : null));
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "ha.MF(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    abstract void a(za param0);

    abstract void f(int param0);

    abstract int i();

    abstract za c(int param0);

    protected void finalize() {
        this.a((byte) -21);
    }

    abstract void a(vc param0);

    final static void a(byte param0, String param1) {
        try {
            if (param0 < 106) {
                ki var3 = (ki) null;
                ha.a(-117, (java.awt.Canvas) null, -59, 3, (d) null, -128, -20, (ki) null);
            }
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "ha.EG(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    abstract hr a(ri param0, boolean param1);

    abstract void GA(int param0);

    abstract hr a(int[] param0, int param1, int param2, int param3, int param4, boolean param5);

    ha(d param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
            this.field_h = param0;
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
            this.field_a = var2_int;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "ha.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    abstract void SA(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6);

    abstract int[] Y();

    abstract void b(int param0, int param1) throws rf;

    abstract void e();

    abstract void T(int param0, int param1, int param2, int param3);

    static {
        field_c = null;
    }
}
