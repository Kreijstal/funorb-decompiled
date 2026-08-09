/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pg extends b implements tma, tsa {
    private lga field_z;
    static String field_A;
    static int field_y;
    static String field_x;
    private rj field_B;
    private rua field_w;
    static int[] field_C;

    final static void b(boolean param0) {
        if (qga.field_m) {
          sra.field_t = true;
          jda.a(true, 262144);
          gda.field_c = 0;
          if (param0) {
            field_A = (String) null;
            return;
          } else {
            return;
          }
        } else {
          throw new IllegalStateException();
        }
    }

    private final String c(int param0) {
        int var2 = 93 % ((21 - param0) / 40);
        return "<u=2164A2><col=2164A2>";
    }

    public final void a(lga param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == 30846) {
                break L1;
              } else {
                field_y = -37;
                break L1;
              }
            }
            if (0 != param1) {
              if (1 != param1) {
                if ((param1 ^ -1) != -3) {
                  break L0;
                } else {
                  gva.a("conduct.ws", (byte) -118);
                  return;
                }
              } else {
                gva.a("privacy.ws", (byte) -50);
                return;
              }
            } else {
              gva.a("terms.ws", (byte) -88);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("pg.D(");

            if (param0 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void a(int param0) {
        field_C = null;
        field_A = null;
        if (param0 != 0) {
            field_y = 58;
            field_x = null;
            return;
        }
        field_x = null;
    }

    public final void a(int param0, int param1, rj param2, int param3, byte param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param4 > 44) {
                break L1;
              } else {
                this.field_z = (lga) null;
                break L1;
              }
            }
            if (this.field_B != param2) {
              break L0;
            } else {
              qr.d(-7694);
              this.field_w.i((byte) 111);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var6);

            stackIn_7_1 = new StringBuilder().append("pg.M(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    pg(rua param0) {
        super(0, 0, 288, 0, (isa) null);
        String var7 = null;
        int var3 = 0;
        vpa var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
            this.field_w = param0;
            this.field_B = new rj(aua.field_d, (qc) null);
            this.field_B.field_r = (isa) ((Object) new td());
            var7 = gl.a((byte) 108, sg.field_q, new String[]{this.c(-58), this.d(-35)});
            var3 = 20;
            var4 = new vpa(mj.field_J, 0, 0, 0, 0, 16777215, -1, 3, 0, mj.field_J.field_w, -1, 2147483647, true);
            this.field_z = new lga(var7, var4);
            this.field_z.field_q = "";
            this.field_z.a(sw.field_Fb, 0, 0);
            this.field_z.a(sw.field_Fb, 1, 0);
            this.field_z.field_m = this.field_m - 40;
            this.field_z.field_h = (qc) (this);
            this.field_z.a(var3, (byte) -120, this.field_m + -40, 26);
            var3 = var3 + (this.field_z.field_p + 15);
            this.a(this.field_z, -1);
            var5 = 4;
            var6 = 200;
            this.field_B.a((byte) -31, var6, 40, 300 + -var6 >> -1796665279, var3);
            this.field_B.field_h = (qc) (this);
            this.a(this.field_B, -1);
            this.a((byte) -31, 300, var5 + (55 + var3), 0, 0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "pg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    private final String d(int param0) {
        String discarded$0 = null;
        if (param0 >= -12) {
            discarded$0 = this.d(-20);
            return "</col></u>";
        }
        return "</col></u>";
    }

    final boolean a(char param0, ae param1, int param2, boolean param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
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
            if (super.a(param0, param1, param2, param3)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (98 != param2) {
                if (99 != param2) {
                  stackIn_11_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_9_0 = this.a(param1, (byte) -9);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_6_0 = this.b(param1, (byte) -125);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var5);

            stackIn_14_1 = new StringBuilder().append("pg.P(").append(param0).append(',');

            if (param1 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
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

    static {
        field_A = "Hold Shift";
        field_x = "Not yet achieved";
    }
}
