/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oo extends bca {
    int field_r;
    static kv[] field_q;

    final int b(op param0, int param1) {
        aga var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = this.field_l.a(param1 ^ -94, param0);
            if (param1 == -1) {
              if ((this.field_r ^ -1) == -3) {
                stackIn_6_0 = var3.field_x;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (this.field_r == 4) {
                  stackIn_16_0 = -1 + (param0.field_z - var3.field_x);
                  decompiledRegionSelector0 = 4;
                  break L0;
                } else {
                  if (1 == this.field_r) {
                    stackIn_14_0 = var3.field_J;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (this.field_r == 3) {
                      stackIn_12_0 = -1 + (param0.field_B + -var3.field_J);
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      throw new IllegalStateException();
                    }
                  }
                }
              }
            } else {
              stackIn_2_0 = 58;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var3_ref);

            stackIn_20_1 = new StringBuilder().append("oo.D(");

            if (param0 == null) {
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
          throw pe.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_14_0;
              } else {
                return stackIn_16_0;
              }
            }
          }
        }
    }

    final static hs a(int param0, byte param1, byte[] param2, int param3) {
        hs stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        cda[] var6 = null;
        int var7 = 0;
        cda var8 = null;
        int var9 = 0;
        int var10 = 0;
        lu var11 = null;
        var10 = BachelorFridge.field_y;
        try {
          L0: {
            var11 = new lu(param2);
            var5 = var11.e((byte) 83);
            var6 = new cda[var11.e((byte) 66)];
            var7 = 0;
            L1: while (true) {
              if (var6.length <= var7) {
                L2: {
                  if (param1 == -77) {
                    break L2;
                  } else {
                    field_q = (kv[]) null;
                    break L2;
                  }
                }
                stackIn_10_0 = new hs(param3, param0, var6, var5);
                break L0;
              } else {
                var8 = new cda();
                var8.field_a = var11.e((byte) 66);
                var9 = 0;
                L3: while (true) {
                  if (var9 >= 11) {
                    var6[var7] = var8;
                    var7++;
                    continue L1;
                  } else {
                    var8.field_b[var9].field_h = var11.c((byte) -85);
                    var8.field_b[var9].field_l = var11.c((byte) -85);
                    var8.field_b[var9].field_d = var11.c((byte) -85);
                    var8.field_b[var9].field_e = var11.c((byte) -85);
                    var8.field_b[var9].field_j = var11.f(52);
                    var9++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("oo.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ')');
        }
        return stackIn_10_0;
    }

    final at a(int param0, gj param1) {
        RuntimeException var3 = null;
        nm stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 5) {
                break L1;
              } else {
                field_q = (kv[]) null;
                break L1;
              }
            }
            stackIn_3_0 = new nm(param1, (oo) (this));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("oo.A(").append(param0).append(',');

            if (param1 == null) {
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
          throw pe.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return (at) ((Object) stackIn_3_0);
    }

    oo(lu param0) {
        super(param0);
        int var2_int = 0;
        try {
            this.field_k = param0.e((byte) 79);
            this.field_o = new eaa();
            var2_int = param0.b(16711935);
            while (true) {
                var2_int--;
                if (0 > var2_int) {
                    break;
                }
                this.field_o.a(dca.a((byte) 102, param0), true);
            }
            this.field_r = param0.b(16711935);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "oo.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    oo(int param0, nq param1, int param2) {
        super(param0, param1);
        try {
            this.field_r = param2;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "oo.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(byte param0, lu param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              super.a((byte) -118, param1);
              param1.d(this.field_r, 0);
              if (param0 < -12) {
                break L1;
              } else {
                field_q = (kv[]) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("oo.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public static void d(byte param0) {
        field_q = null;
        int var1 = 102 / ((param0 - -22) / 53);
    }

    final void a(op param0, int param1) {
        try {
            this.a(param0, (byte) -2);
            this.field_l.a(79, param0).a(false, this.b(param0, -1), this.field_r);
            int var3_int = 118 / ((param1 - 12) / 35);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "oo.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
    }
}
