/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bf extends ga implements pg, el {
    ak field_H;
    static String field_S;
    static od[][] field_R;
    static int[][] field_L;
    private rg field_Q;
    private wh field_O;
    private rg field_P;

    final void a(fj param0, int param1, int param2, int param3) {
        try {
            super.a(param0, param1, param2, param3);
            this.field_Q.field_L = this.j(-106);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "bf.V(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final void a(int param0, String param1) {
        wh var3 = null;
        String var4 = null;
        try {
            var3 = this.field_O;
            var4 = param1;
            if (param0 != 11579568) {
                this.k(29);
            }
            ((ul) ((Object) var3)).a(false, false, var4);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "bf.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(boolean param0) {
        field_L = (int[][]) null;
        field_R = (od[][]) null;
        field_S = null;
        if (param0) {
            bf.b(false);
        }
    }

    private final int a(fj param0, int param1, int param2, int param3, String param4, String param5, int param6) {
        RuntimeException var8 = null;
        rh var9 = null;
        la var10 = null;
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
            var10 = new la(20, param2, 120 - -param3, 25, param0, false, 120, param1, gm.field_cb, 16777215, param5);
            this.b(var10, 10);
            var9 = new rh(((j) ((Object) param0)).a((byte) -9), param4, 126, param2 - -var10.field_z, param3 - -25, param6);
            var9.field_t = (uk) (this);
            this.b(var9, 10);
            stackIn_1_0 = var10.field_z - -var9.field_z;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var8);

            stackIn_4_1 = new StringBuilder().append("bf.A(");

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


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
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


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param5 == null) {
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
          throw sd.a((Throwable) ((Object) stackIn_5_0), stackIn_11_2 + ',' + param6 + ')');
        }
        return stackIn_1_0;
    }

    private final void k(int param0) {
        int var2;
        var2 = 105 % ((param0 - -68) / 53);
        if (!this.j(-112)) {
          return;
        } else {
          bf.b(-121, this.field_O.field_B);
          return;
        }
    }

    public final void a(int param0, int param1, int param2, rg param3, int param4) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          L0: {
            L1: {
              if (this.field_P == param3) {
                rk.b((byte) 32);
                break L1;
              } else {
                if (param3 == this.field_Q) {
                  this.k(95);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            if (param0 > 68) {
              break L0;
            } else {
              this.k(109);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var6);

            stackIn_10_1 = new StringBuilder().append("bf.FA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw sd.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param4 + ')');
        }
    }

    public bf() {
        super(0, 0, 496, 0, (fe) null);
        this.field_O = new wh("", (uk) null, 12);
        vf var1 = new vf(fa.field_Q, 0, 0, 0, 0, 16777215, -1, 3, 0, gm.field_cb.field_C, -1, 2147483647, true);
        fj var2 = new fj(Confined.field_G, var1, (uk) null);
        this.field_Q = new rg(ta.field_a, (uk) null);
        this.field_P = new rg(rb.field_d, (uk) null);
        this.field_O.field_C = ra.field_b;
        this.field_O.a(-18312, new qg(this.field_O));
        this.field_Q.field_L = false;
        this.field_Q.field_n = (fe) ((Object) new je());
        this.field_P.field_n = (fe) ((Object) new hk());
        this.field_O.field_n = (fe) ((Object) new db(10000536));
        int var3 = 20;
        int var4 = 4;
        int var5 = 200;
        var2.a(-125, 270, var3, 50, 20);
        this.b(var2, 10);
        var3 += 50;
        var3 = var3 + (5 + this.a(this.field_O, 170, rc.field_a, 3, va.field_d, var3));
        this.field_Q.a(-117, var5, var3, 40, 496 + -var5 >> 484395009);
        this.field_P.a(-128, 60, var3 - -15, 40, 3 + var4);
        this.field_P.field_t = (uk) (this);
        this.field_Q.field_t = (uk) (this);
        this.b(this.field_Q, 10);
        this.b(this.field_P, 10);
        this.field_H = new ak((pg) (this));
        this.field_H.a(-126, -this.field_O.field_F + (-this.field_O.field_q + this.field_F - 60), 20, 150, this.field_O.field_F + this.field_O.field_q + 60);
        this.b(this.field_H, 10);
        this.a(-125, 496, 0, var3 + (55 + var4), 0);
    }

    public final void a(byte param0) {
        ((qg) ((Object) this.field_O.a((byte) -9))).e(639775169);
        if (param0 >= -101) {
            bf.b(false);
        }
    }

    private final boolean j(int param0) {
        if (!this.a(this.field_O, false)) {
            return false;
        }
        if (param0 > -82) {
            return true;
        }
        return true;
    }

    private final static void b(int param0, String param1) {
        try {
            ae.a(param1, 0);
            if (param0 >= -14) {
                field_L = (int[][]) null;
            }
            r.a((byte) 93, false, sj.field_kb);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "bf.GA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(fj param0, byte param1, int param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!super.a(param0, (byte) -2, param2, param3)) {
              if ((param2 ^ -1) == -99) {
                stackIn_6_0 = this.c(param0, 32);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (-100 != (param2 ^ -1)) {
                  var5_int = -65 / ((47 - param1) / 43);
                  stackIn_11_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_9_0 = this.a(17731, param0);
                  decompiledRegionSelector0 = 2;
                  break L0;
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
            stackIn_14_0 = (RuntimeException) (var5);

            stackIn_14_1 = new StringBuilder().append("bf.Q(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L1;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L1;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              return stackIn_11_0 != 0;
            }
          }
        }
    }

    private final int a(fj param0, int param1, String param2, int param3, String param4, int param5) {
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
              if (param3 == 3) {
                break L1;
              } else {
                this.field_O = (wh) null;
                break L1;
              }
            }
            stackIn_3_0 = this.a(param0, param3 + 0, param5, param1, param4, param2, 35);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var7);

            stackIn_6_1 = new StringBuilder().append("bf.B(");

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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');

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


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param3).append(',');

            if (param4 == null) {
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
          throw sd.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ',' + param5 + ')');
        }
        return stackIn_3_0;
    }

    private final boolean a(j param0, boolean param1) {
        dm var3 = null;
        RuntimeException var3_ref = null;
        fi var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = param0.a((byte) -9);
            if (var3 != null) {
              L1: {
                if (!param1) {
                  break L1;
                } else {
                  this.a((fj) null, (byte) -77, -37, '￳');
                  break L1;
                }
              }
              L2: {
                var4 = var3.a(-3621);
                if (nn.field_q != var4) {
                  stackIn_8_0 = 0;
                  break L2;
                } else {
                  stackIn_8_0 = 1;
                  break L2;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3_ref);

            stackIn_11_1 = new StringBuilder().append("bf.F(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_8_0 != 0;
        }
    }

    static {
        field_L = new int[][]{new int[]{0, 1, 2, 3}, new int[]{4, 5, 6, 7}, new int[]{8}, new int[]{9, 10, 11, 12}};
        field_R = new od[3][4];
        field_S = "<col=FFFFFF>Cloak:</col> an advanced technology that renders your ship invisible for 30 seconds, so you can fly down the tunnel eluding the aliens. But beware: each time you fire your weapons or your shield shimmers from an impact, they will know where you are!";
    }
}
