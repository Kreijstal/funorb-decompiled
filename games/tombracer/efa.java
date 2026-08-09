/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class efa extends b implements mia, tsa {
    private so field_z;
    static iu[][] field_w;
    static int field_y;
    laa field_x;
    private rj field_B;
    private rj field_A;

    private final boolean a(int param0, mk param1) {
        nua var3 = null;
        RuntimeException var3_ref = null;
        it var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 <= -25) {
              var3 = param1.a((byte) 127);
              if (var3 == null) {
                stackIn_6_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  var4 = var3.b(-4666);
                  if (var4 != uh.field_k) {
                    stackIn_10_0 = 0;
                    break L1;
                  } else {
                    stackIn_10_0 = 1;
                    break L1;
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("efa.V(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            return stackIn_10_0 != 0;
          }
        }
    }

    public final void a(int param0) {
        ((tf) ((Object) this.field_z.a((byte) 93))).b((byte) -69);
        if (param0 != 10000536) {
            field_y = -98;
        }
    }

    final void a(int param0, int param1, ae param2, int param3) {
        try {
            super.a(param0, param1 + 0, param2, param3);
            if (param1 != 2097152) {
                this.field_x = (laa) null;
            }
            this.field_A.field_y = this.b(false);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "efa.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public final void a(int param0, int param1, rj param2, int param3, byte param4) {
        boolean discarded$0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        mk var7 = null;
        try {
          L0: {
            L1: {
              if (this.field_B == param2) {
                pn.f(-804227775);
                break L1;
              } else {
                if (param2 == this.field_A) {
                  this.a((byte) 89);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            if (param4 > 44) {
              break L0;
            } else {
              var7 = (mk) null;
              discarded$0 = this.a(-113, (mk) null);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var6);

            stackIn_10_1 = new StringBuilder().append("efa.M(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void c(boolean param0) {
        field_w = (iu[][]) null;
        if (!param0) {
            field_w = (iu[][]) null;
        }
    }

    public efa() {
        super(0, 0, 496, 0, (isa) null);
        this.field_z = new so("", (qc) null, 12);
        vpa var1 = new vpa(eka.field_o, 0, 0, 0, 0, 16777215, -1, 3, 0, mj.field_J.field_w, -1, 2147483647, true);
        ae var2 = new ae(cj.field_e, var1, (qc) null);
        this.field_A = new rj(nf.field_j, (qc) null);
        this.field_B = new rj(mq.field_d, (qc) null);
        this.field_z.field_q = rma.field_a;
        this.field_z.a(-13861, new tf(this.field_z));
        this.field_A.field_y = false;
        this.field_A.field_r = (isa) ((Object) new td());
        this.field_B.field_r = (isa) ((Object) new kaa());
        this.field_z.field_r = (isa) ((Object) new hga(10000536));
        int var3 = 20;
        int var4 = 4;
        int var5 = 200;
        var2.a((byte) -31, 270, 50, 20, var3);
        this.a(var2, -1);
        var3 += 50;
        var3 = var3 + (5 + this.a(var3, rea.field_r, za.field_f, this.field_z, -2239, 170));
        this.field_A.a((byte) -31, var5, 40, -var5 + 496 >> -2132918303, var3);
        this.field_B.a((byte) -31, 60, 40, var4 + 3, var3 - -15);
        this.field_B.field_h = (qc) (this);
        this.field_A.field_h = (qc) (this);
        this.a(this.field_A, -1);
        this.a(this.field_B, -1);
        this.field_x = new laa((mia) (this));
        this.field_x.a((byte) -31, this.field_m + -this.field_z.field_i - (this.field_z.field_m - -60), 150, this.field_z.field_i - (-this.field_z.field_m - 60), 20);
        this.a(this.field_x, -1);
        this.a((byte) -31, 496, var4 + 55 + var3, 0, 0);
    }

    public final void a(String param0, int param1) {
        so var3 = null;
        String var4 = null;
        try {
            var3 = this.field_z;
            var4 = param0;
            if (param1 < 18) {
                efa.c(false);
            }
            ((tra) ((Object) var3)).a(false, -16719, var4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "efa.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final int a(int param0, String param1, String param2, ae param3, int param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param4 == -2239) {
              stackIn_4_0 = this.a(param0, param3, param5, param1, param2, 35, 3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 76;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var7);

            stackIn_7_1 = new StringBuilder().append("efa.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_14_2 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    private final void a(byte param0) {
        if (param0 >= 10) {
          if (!this.b(false)) {
            return;
          } else {
            rka.a(this.field_z.field_o, false);
            return;
          }
        } else {
          this.a(74);
          if (!this.b(false)) {
            return;
          } else {
            rka.a(this.field_z.field_o, false);
            return;
          }
        }
    }

    final boolean a(char param0, ae param1, int param2, boolean param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        boolean stackIn_8_0 = false;
        boolean stackIn_11_0 = false;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param3) {
              if (!super.a(param0, param1, param2, param3)) {
                if ((param2 ^ -1) != -99) {
                  if ((param2 ^ -1) != -100) {
                    stackIn_13_0 = 0;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    stackIn_11_0 = this.a(param1, (byte) -9);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackIn_8_0 = this.b(param1, (byte) -118);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
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
          L1: {
            var5 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var5);

            stackIn_16_1 = new StringBuilder().append("efa.P(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L1;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_11_0;
              } else {
                return stackIn_13_0 != 0;
              }
            }
          }
        }
    }

    private final int a(int param0, ae param1, int param2, String param3, String param4, int param5, int param6) {
        RuntimeException var8 = null;
        sd var9 = null;
        jsa var10 = null;
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
            var10 = new jsa(20, param0, 120 - -param2, 25, param1, false, 120, param6, mj.field_J, 16777215, param3);
            this.a(var10, -1);
            var9 = new sd(((mk) ((Object) param1)).a((byte) 124), param4, 126, param0 + var10.field_p, param2 + 25, param5);
            var9.field_h = (qc) (this);
            this.a(var9, -1);
            stackIn_1_0 = var10.field_p + var9.field_p;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var8);

            stackIn_4_1 = new StringBuilder().append("efa.N(").append(param0).append(',');

            if (param1 == null) {
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


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param2).append(',');

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


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param4 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_5_0), stackIn_11_2 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_1_0;
    }

    private final boolean b(boolean param0) {
        ae var3;
        if (!this.a(-66, this.field_z)) {
          return false;
        } else {
          if (param0) {
            var3 = (ae) null;
            this.a('ﾛ', (ae) null, 39, false);
            return true;
          } else {
            return true;
          }
        }
    }

    static {
    }
}
