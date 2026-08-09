/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ga extends ki implements ge, ka {
    static boolean field_G;
    static String field_H;
    private pj field_J;
    private pj field_I;
    ua field_F;
    static nc field_E;
    private qb field_K;

    public static void h(int param0) {
        if (param0 != 60) {
            ga.b(-12, -36, false, 71);
            field_E = null;
            field_H = null;
            return;
        }
        field_E = null;
        field_H = null;
    }

    public final void a(byte param0) {
        if (param0 != 22) {
          field_H = (String) null;
          ((df) ((Object) this.field_K.a(87))).a(true);
          return;
        } else {
          ((df) ((Object) this.field_K.a(87))).a(true);
          return;
        }
    }

    private final void f(byte param0) {
        if (!(this.e((byte) -96))) {
            return;
        }
        tk.a((byte) -15, this.field_K.field_i);
        if (param0 <= 54) {
            field_G = true;
        }
    }

    final boolean a(char param0, byte param1, int param2, rc param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = -34 / ((31 - param1) / 56);
            if (!super.a(param0, (byte) -30, param2, param3)) {
              if (param2 == 98) {
                stackIn_6_0 = this.a((byte) -125, param3);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (99 == param2) {
                  stackIn_10_0 = this.b(123, param3);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              }
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("ga.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L1;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L1;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    public ga() {
        super(0, 0, 496, 0, (j) null);
        this.field_K = new qb("", (dg) null, 12);
        af var1 = new af(jh.field_g, 0, 0, 0, 0, 16777215, -1, 3, 0, ua.field_G.field_F, -1, 2147483647, true);
        rc var2 = new rc(cd.field_a, var1, (dg) null);
        this.field_J = new pj(mf.field_x, (dg) null);
        this.field_I = new pj(nf.field_X, (dg) null);
        this.field_K.field_z = ql.field_u;
        this.field_K.a(new df(this.field_K), false);
        this.field_J.field_B = false;
        this.field_J.field_w = (j) ((Object) new gh());
        this.field_I.field_w = (j) ((Object) new ri());
        this.field_K.field_w = (j) ((Object) new uf(10000536));
        int var3 = 20;
        int var4 = 4;
        int var5 = 200;
        var2.b(50, 270, 20, 0, var3);
        var3 += 50;
        this.a(var2, 5411);
        var3 = var3 + (5 + this.a(var3, 15016, eb.field_a, this.field_K, 170, uc.field_k));
        this.field_J.b(40, var5, 496 + -var5 >> 659061441, 0, var3);
        this.field_I.b(40, 60, 3 + var4, 0, 15 + var3);
        this.field_I.field_n = (dg) (this);
        this.field_J.field_n = (dg) (this);
        this.a(this.field_J, 5411);
        this.a(this.field_I, 5411);
        this.field_F = new ua((ge) (this));
        this.field_F.b(150, -this.field_K.field_t + (this.field_t + -this.field_K.field_m - 60), 60 + (this.field_K.field_m + this.field_K.field_t), 0, 20);
        this.a(this.field_F, 5411);
        this.b(55 + var3 + var4, 496, 0, 0, 0);
    }

    public final void a(boolean param0, String param1) {
        qb var3 = null;
        String var4 = null;
        if (!param0) {
            return;
        }
        try {
            var3 = this.field_K;
            var4 = param1;
            ((vg) ((Object) var3)).a(74, false, var4);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "ga.NA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final int a(int param0, int param1, String param2, rc param3, int param4, String param5) {
        RuntimeException var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 15016) {
                break L1;
              } else {
                this.field_I = (pj) null;
                break L1;
              }
            }
            stackIn_3_0 = this.a((byte) -121, 35, param5, param4, param3, param0, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var7);

            stackIn_6_1 = new StringBuilder().append("ga.J(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    private final boolean a(int param0, wj param1) {
        oe var3 = null;
        RuntimeException var3_ref = null;
        qf var4 = null;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 270) {
                break L1;
              } else {
                this.field_J = (pj) null;
                break L1;
              }
            }
            var3 = param1.a(96);
            if (var3 == null) {
              stackIn_5_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                var4 = var3.b(-9362);
                if (var4 != ph.field_g) {
                  stackIn_9_0 = 0;
                  break L2;
                } else {
                  stackIn_9_0 = 1;
                  break L2;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3_ref);

            stackIn_12_1 = new StringBuilder().append("ga.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    final void a(int param0, int param1, int param2, rc param3) {
        try {
            super.a(param0, param1, param2, param3);
            this.field_J.field_B = this.e((byte) -119);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "ga.JA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void b(int param0, int param1, boolean param2, int param3) {
        if (param2) {
          field_E = (nc) null;
          pb.field_b = param0;
          hc.field_d = param1;
          rj.field_c = param3;
          return;
        } else {
          pb.field_b = param0;
          hc.field_d = param1;
          rj.field_c = param3;
          return;
        }
    }

    private final boolean e(byte param0) {
        int stackIn_4_0 = 0;
        if (param0 >= -63) {
          field_H = (String) null;
          if (this.a(270, (wj) (this.field_K))) {
            return true;
          } else {
            return false;
          }
        } else {
          L0: {
            if (!this.a(270, (wj) (this.field_K))) {
              stackIn_4_0 = 0;
              break L0;
            } else {
              stackIn_4_0 = 1;
              break L0;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public final void a(int param0, int param1, int param2, pj param3, boolean param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param4) {
              L1: {
                L2: {
                  if (param3 != this.field_I) {
                    break L2;
                  } else {
                    ok.a((byte) 119);
                    if (!SolKnight.field_L) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (param3 != this.field_J) {
                  break L1;
                } else {
                  this.f((byte) 59);
                  return;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var6);

            stackIn_10_1 = new StringBuilder().append("ga.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final int a(byte param0, int param1, String param2, int param3, rc param4, int param5, String param6) {
        RuntimeException var8 = null;
        pk var9 = null;
        ke var10 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var10 = new ke(20, param5, 120 - -param3, 25, param4, false, 120, 3, ua.field_G, 16777215, param6);
              this.a(var10, 5411);
              if (param0 == -121) {
                break L1;
              } else {
                ga.b(-99, 56, false, 23);
                break L1;
              }
            }
            var9 = new pk(((wj) ((Object) param4)).a(99), param2, 126, param5 - -var10.field_x, param3 + 25, param1);
            var9.field_n = (dg) (this);
            this.a(var9, 5411);
            stackIn_3_0 = var9.field_x + var10.field_x;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var8);

            stackIn_6_1 = new StringBuilder().append("ga.G(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_H = "Log in";
        field_G = false;
        field_E = new nc();
    }
}
