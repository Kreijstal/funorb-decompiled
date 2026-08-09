/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bj extends v implements qa, pi {
    private vm field_K;
    static String field_I;
    private cj field_F;
    static ah field_O;
    private rm field_M;
    static int[] field_L;
    static String field_J;
    static String field_N;
    static int field_G;

    public static void h(int param0) {
        field_N = null;
        field_L = null;
        field_J = null;
        field_O = null;
        field_I = null;
        if (param0 != -9251) {
            field_L = (int[]) null;
        }
    }

    public final void a(cj param0, int param1, byte param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (param2 == -106) {
                break L1;
              } else {
                this.field_F = (cj) null;
                break L1;
              }
            }
            if (param1 == 0) {
              oc.a(param2 + 16711786, "terms.ws");
              return;
            } else {
              if (-2 != (param1 ^ -1)) {
                if (2 != param1) {
                  break L0;
                } else {
                  oc.a(16711680, "conduct.ws");
                  return;
                }
              } else {
                oc.a(16711680, "privacy.ws");
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("bj.B(");

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
          throw kk.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final String a(byte param0) {
        int var2 = 35 / ((-66 - param0) / 52);
        return "</col></u>";
    }

    public final void a(int param0, rm param1, int param2, int param3, int param4) {
        String discarded$1 = null;
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == -4) {
                break L1;
              } else {
                discarded$1 = this.g((byte) 9);
                break L1;
              }
            }
            if (this.field_M == param1) {
              hk.a(true);
              this.field_K.h((byte) -103);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var6);

            stackIn_8_1 = new StringBuilder().append("bj.M(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final String g(byte param0) {
        if (param0 >= -84) {
            this.field_M = (rm) null;
            return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    bj(vm param0) {
        super(0, 0, 288, 0, (dh) null);
        String var7 = null;
        int var3 = 0;
        dk var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
            this.field_K = param0;
            this.field_M = new rm(sf.field_j, (tb) null);
            this.field_M.field_l = (dh) ((Object) new mo());
            var7 = sd.a(ta.field_b, new String[]{this.g((byte) -120), this.a((byte) -119)}, true);
            var3 = 20;
            var4 = new dk(hl.field_g, 0, 0, 0, 0, 16777215, -1, 3, 0, hl.field_g.field_G, -1, 2147483647, true);
            this.field_F = new cj(var7, var4);
            this.field_F.field_z = "";
            this.field_F.a(0, m.field_d, true);
            this.field_F.a(1, m.field_d, true);
            this.field_F.field_t = (tb) (this);
            this.field_F.field_x = -40 + this.field_x;
            this.field_F.a(-40 + this.field_x, (byte) -64, var3, 26);
            var3 = var3 + (this.field_F.field_u - -15);
            this.a(true, this.field_F);
            var5 = 4;
            var6 = 200;
            this.field_M.a(300 + -var6 >> 172202081, (byte) 122, var3, 40, var6);
            this.field_M.field_t = (tb) (this);
            this.a(true, this.field_M);
            this.a(0, (byte) 122, 0, 55 + (var3 + var5), 300);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "bj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(n param0, int param1, byte param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3)) {
              if (98 != param1) {
                if ((param1 ^ -1) == -100) {
                  stackIn_9_0 = this.b(param0, 121);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              } else {
                stackIn_5_0 = this.c(param0, -1);
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
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("bj.T(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L1;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L1;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_9_0;
          }
        }
    }

    static {
        field_I = "Best: ";
        field_O = new ah();
        field_J = "Mine";
        field_L = new int[4];
        field_N = "Use this alternative as your account name";
    }
}
