/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gea {
    static String field_c;
    private int[][] field_b;
    private boolean field_a;

    final boolean a(int param0) {
        int stackIn_7_0 = 0;
        if (param0 == -4075) {
          L0: {
            L1: {
              if (this.field_b == null) {
                break L1;
              } else {
                if (this.field_b.length != 0) {
                  stackIn_7_0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackIn_7_0 = 1;
            break L0;
          }
          return stackIn_7_0 != 0;
        } else {
          return false;
        }
    }

    public static void b(int param0) {
        if (param0 != 0) {
            return;
        }
        field_c = null;
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = TombRacer.field_G ? 1 : 0;
        for (var2 = 0; var2 < this.field_b.length; var2++) {
            this.field_b[var2][0] = -this.field_b[var2][0];
        }
        if (!param0) {
            field_c = (String) null;
        }
    }

    final static void a(int param0, cn param1, il param2) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        br var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        Throwable var10 = null;
        Throwable var11 = null;
        il var12 = null;
        int[] var16 = null;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var3_int = bg.field_t;
            rua.field_gb = new jea(0L, (jea) null);
            if (param1 != null) {
              param1.field_j = 0;
              param1.field_g = false;
              taa.field_g = new nc(var3_int, param1, param1);
              qu.field_a = new tr(var3_int, param1, param1, new gha());
              var4 = eka.d((byte) 86);
              if (var4 == null) {
                var11 = (Throwable) null;
                ssa.a("QC2", (byte) 122, (Throwable) null);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                vp.a(-1, var4);
                var12 = (il) null;
                oka.field_w = ow.a(1127256, 1513239, 1513239, 0, (il) null, 2245737, 4020342, 65793, 65793, 5138823, 8947848, 65793, (byte) -78);
                uka.field_M = ow.a(0, 0, 0, 16764006, param2, 0, param0, 0, 0, 0, 0, 0, (byte) -81);
                tg.field_c = ow.a(0, 0, 0, 16777215, param2, 0, 0, 0, 0, 0, 0, 0, (byte) -123);
                var5 = bea.field_g;
                var6 = bea.field_a;
                var16 = bea.field_l;
                gfa.field_j = new iu(10, 14);
                gfa.field_j.c();
                var8 = 2;
                L1: while (true) {
                  if (-8 >= (var8 ^ -1)) {
                    bea.a(var16, var5, var6);
                    cia.field_g = qla.a(true, uka.field_M, oka.field_w, var4, tg.field_c);
                    rua.field_gb.field_J = new vna();
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    bea.f(var8, var8 - -1, -(var8 << -1418171807) + 14, 16777215);
                    var8++;
                    continue L1;
                  }
                }
              }
            } else {
              var10 = (Throwable) null;
              ssa.a("QC1", (byte) 123, (Throwable) null);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3);

            stackIn_15_1 = new StringBuilder().append("gea.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    public gea() {
        this(new int[][]{});
    }

    final int[][] c(int param0) {
        int var2 = 84 % ((param0 - 85) / 34);
        return this.field_b;
    }

    final boolean a(byte param0) {
        if (param0 != 21) {
            this.a(false, -22);
        }
        return this.field_a;
    }

    final void a(boolean param0, int param1) {
        this.field_a = param0 ? true : false;
        if (param1 != 1) {
            this.field_a = true;
        }
    }

    gea(int[][] param0) {
        ir discarded$0 = new ir();
        try {
            this.field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "gea.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    gea(int param0, kh param1) {
        int var3_int = 0;
        int var4 = 0;
        ir discarded$0 = new ir();
        try {
            var3_int = param1.b((byte) 44, 4);
            this.field_b = new int[var3_int][2];
            for (var4 = 0; var3_int > var4; var4++) {
                this.field_b[var4][0] = bla.a(true, 12, param1.b((byte) 44, 12)) << -346648048;
                this.field_b[var4][1] = bla.a(true, 12, param1.b((byte) 44, 12)) << -1187278480;
            }
            if (11 <= param0) {
                this.field_a = -2 == (param1.b((byte) 44, 1) ^ -1) ? true : false;
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "gea.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(kh param0, int param1) {
        int var3_int = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        try {
            param0.a((byte) 20, this.field_b.length, 4);
            for (var3_int = param1; var3_int < this.field_b.length; var3_int++) {
                param0.a((byte) -128, dqa.a(true, this.field_b[var3_int][0] >> -1857086288, 12), 12);
                param0.a((byte) -125, dqa.a(true, this.field_b[var3_int][1] >> 1748467888, 12), 12);
            }
            param0.a((byte) 74, !this.field_a ? 0 : 1, 1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "gea.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_c = "Confirm Password: ";
    }
}
