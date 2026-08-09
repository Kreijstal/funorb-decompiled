/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mb extends wj implements ur, vh {
    fr field_G;
    private wi field_E;
    static hd field_F;
    private wi field_B;
    private mr field_C;

    public final void a(String param0, int param1) {
        mr var3 = null;
        String var4 = null;
        try {
            if (param1 != 15) {
                this.a(-18);
            }
            var3 = this.field_C;
            var4 = param0;
            ((ga) ((Object) var3)).a(var4, (byte) -17, false);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "mb.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(int param0) {
        if (param0 != -1) {
            return;
        }
        ((bv) ((Object) this.field_C.a((byte) -116))).c((byte) 101);
    }

    private final int a(String param0, int param1, int param2, fd param3, int param4, int param5, String param6) {
        RuntimeException var8 = null;
        ju var9 = null;
        int var10 = 0;
        cg var11 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var11 = new cg(20, param5, param1 + 120, 25, param3, false, 120, 3, gf.field_a, 16777215, param0);
            this.a(-55, var11);
            var9 = new ju(((cw) ((Object) param3)).a((byte) -120), param6, 126, var11.field_i + param5, param1 - -25, param2);
            var9.field_k = (jv) (this);
            var10 = -123 % ((param4 - 24) / 41);
            this.a(-58, var9);
            stackIn_1_0 = var9.field_i + var11.field_i;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var8);

            stackIn_4_1 = new StringBuilder().append("mb.I(");

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


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_5_0), stackIn_11_2 + ')');
        }
        return stackIn_1_0;
    }

    public final void a(int param0, wi param1, int param2, byte param3, int param4) {
        RuntimeException var6 = null;
        String var7 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 > 64) {
                break L1;
              } else {
                var7 = (String) null;
                this.a((String) null, -65);
                break L1;
              }
            }
            if (this.field_E != param1) {
              if (param1 == this.field_B) {
                this.k(-81);
                break L0;
              } else {
                return;
              }
            } else {
              nn.a(-25085);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var6);

            stackIn_10_1 = new StringBuilder().append("mb.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean a(char param0, byte param1, fd param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_9_0 = false;
        boolean stackIn_13_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(param0, (byte) -108, param2, param3)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1 <= -60) {
                  break L1;
                } else {
                  this.field_B = (wi) null;
                  break L1;
                }
              }
              if (98 == param3) {
                stackIn_9_0 = this.a(param2, (byte) -100);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (-100 == (param3 ^ -1)) {
                  stackIn_13_0 = this.b(param2, (byte) 123);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var5);

            stackIn_16_1 = new StringBuilder().append("mb.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            return stackIn_13_0;
          }
        }
    }

    public mb() {
        super(0, 0, 496, 0, (gj) null);
        this.field_C = new mr("", (jv) null, 12);
        qv var1 = new qv(qo.field_k, 0, 0, 0, 0, 16777215, -1, 3, 0, gf.field_a.field_G, -1, 2147483647, true);
        fd var2 = new fd(vt.field_b, var1, (jv) null);
        this.field_B = new wi(ap.field_x, (jv) null);
        this.field_E = new wi(vt.field_a, (jv) null);
        this.field_C.field_u = sr.field_b;
        this.field_C.a(6, new bv(this.field_C));
        this.field_B.field_y = false;
        this.field_B.field_r = (gj) ((Object) new op());
        this.field_E.field_r = (gj) ((Object) new cr());
        this.field_C.field_r = (gj) ((Object) new ri(10000536));
        int var3 = 20;
        int var4 = 4;
        int var5 = 200;
        var2.a(50, 1, 20, 270, var3);
        this.a(-86, var2);
        var3 += 50;
        var3 = var3 + (5 + this.a(var3, jk.field_i, ua.field_f, this.field_C, (byte) 29, 170));
        this.field_B.a(40, 1, -var5 + 496 >> -1832413855, var5, var3);
        this.field_E.a(40, 1, var4 + 3, 60, 15 + var3);
        this.field_E.field_k = (jv) (this);
        this.field_B.field_k = (jv) (this);
        this.a(-50, this.field_B);
        this.a(-84, this.field_E);
        this.field_G = new fr((ur) (this));
        this.field_G.a(150, 1, this.field_C.field_t + (this.field_C.field_n + 60), -this.field_C.field_n + this.field_n - this.field_C.field_t + -60, 20);
        this.a(-16, this.field_G);
        this.a(var4 + (var3 - -55), 1, 0, 496, 0);
    }

    private final boolean l(int param0) {
        fd var3;
        if (!this.a(param0 ^ 484, (cw) (this.field_C))) {
          return false;
        } else {
          if (param0 != 20) {
            var3 = (fd) null;
            this.a('L', (byte) 88, (fd) null, -112);
            return true;
          } else {
            return true;
          }
        }
    }

    private final int a(int param0, String param1, String param2, fd param3, byte param4, int param5) {
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
              if (param4 == 29) {
                break L1;
              } else {
                this.field_G = (fr) null;
                break L1;
              }
            }
            stackIn_3_0 = this.a(param2, param5, 35, param3, -93, param0, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var7);

            stackIn_6_1 = new StringBuilder().append("mb.H(").append(param0).append(',');

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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param2 == null) {
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


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param3 == null) {
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
          throw nb.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_3_0;
    }

    public static void a(byte param0) {
        if (param0 >= -35) {
            mb.a((byte) 102);
            field_F = null;
            return;
        }
        field_F = null;
    }

    private final boolean a(int param0, cw param1) {
        l var3 = null;
        RuntimeException var3_ref = null;
        rv var4 = null;
        int stackIn_2_0 = 0;
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
            var3 = param1.a((byte) -116);
            if (var3 != null) {
              var4 = var3.c(-24407);
              if (param0 == 496) {
                L1: {
                  if (var4 != he.field_yb) {
                    stackIn_9_0 = 0;
                    break L1;
                  } else {
                    stackIn_9_0 = 1;
                    break L1;
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3_ref);

            stackIn_12_1 = new StringBuilder().append("mb.J(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0 != 0;
          } else {
            return stackIn_9_0 != 0;
          }
        }
    }

    final void a(byte param0, fd param1, int param2, int param3) {
        try {
            super.a(param0, param1, param2, param3);
            this.field_B.field_y = this.l(20);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "mb.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void k(int param0) {
        String var3;
        if (this.l(20)) {
          if (param0 >= -58) {
            var3 = (String) null;
            this.a((String) null, -109);
            fn.a((byte) 19, this.field_C.field_q);
            return;
          } else {
            fn.a((byte) 19, this.field_C.field_q);
            return;
          }
        } else {
          return;
        }
    }

    static {
    }
}
