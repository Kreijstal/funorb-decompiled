/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ih extends pj implements ra, ke {
    static String field_N;
    private qd field_M;
    static int[] field_O;
    static String field_P;
    static String field_J;
    private qa field_Q;
    static int field_K;
    static int field_R;
    private hf field_L;

    final static he[] k(int param0) {
        int var2 = 0;
        int var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param0 != 24782) {
            return (he[]) null;
        }
        he[] var1 = new he[bd.field_M];
        for (var2 = 0; var2 < bd.field_M; var2++) {
            var1[var2] = new he(oe.field_b, field_K, kh.field_i[var2], vi.field_b[var2], gf.field_o[var2], qa.field_J[var2], a.field_e[var2], aj.field_a);
        }
        oc.a((byte) -21);
        return var1;
    }

    final boolean a(int param0, char param1, vg param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
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
            if (param3 >= 63) {
              if (!super.a(param0, param1, param2, 88)) {
                if (-99 == (param0 ^ -1)) {
                  stackIn_9_0 = this.a(param2, 65535);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (param0 == 99) {
                    stackIn_13_0 = this.a(param2, (byte) 105);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    return false;
                  }
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

            stackIn_16_1 = new StringBuilder().append("ih.BA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw ie.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              return stackIn_13_0;
            }
          }
        }
    }

    ih(qd param0) {
        super(0, 0, 288, 0, (cg) null);
        String var7 = null;
        int var3 = 0;
        l var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
            this.field_M = param0;
            this.field_L = new hf(cd.field_a, (fd) null);
            this.field_L.field_l = (cg) ((Object) new ie());
            var7 = a.a(5044, wk.field_l, new String[]{this.i(88), this.j(-84)});
            var3 = 20;
            var4 = new l(uh.field_i, 0, 0, 0, 0, 16777215, -1, 3, 0, uh.field_i.field_x, -1, 2147483647, true);
            this.field_Q = new qa(var7, var4);
            this.field_Q.field_v = "";
            this.field_Q.a(we.field_d, 0, 124);
            this.field_Q.a(we.field_d, 1, 115);
            this.field_Q.field_u = (fd) (this);
            this.field_Q.field_w = -40 + this.field_w;
            this.field_Q.b(0, -40 + this.field_w, 26, var3);
            var3 = var3 + (15 + this.field_Q.field_k);
            this.b(this.field_Q, (byte) 50);
            var5 = 4;
            var6 = 200;
            this.field_L.a(var3, 40, 300 + -var6 >> 1119285729, 16535, var6);
            this.field_L.field_u = (fd) (this);
            this.b(this.field_L, (byte) 125);
            this.a(0, 55 + (var3 - -var5), 0, 16535, 300);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "ih.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(int param0, int param1, boolean param2, hf param3, int param4) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          L0: {
            L1: {
              if (this.field_L != param3) {
                break L1;
              } else {
                lk.b(1);
                this.field_M.d(true);
                break L1;
              }
            }
            L2: {
              if (param2) {
                break L2;
              } else {
                this.field_M = (qd) null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var6);

            stackIn_7_1 = new StringBuilder().append("ih.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L3;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param4 + ')');
        }
    }

    public static void l(int param0) {
        field_O = null;
        if (param0 != 288) {
            return;
        }
        field_J = null;
        field_P = null;
        field_N = null;
    }

    public final void a(int param0, int param1, qa param2, int param3) {
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            if (param1 <= -90) {
              L1: {
                if (0 != param0) {
                  if (-2 == (param0 ^ -1)) {
                    nd.a(-1, "privacy.ws");
                    break L1;
                  } else {
                    if (2 != param0) {
                      break L1;
                    } else {
                      nd.a(-1, "conduct.ws");
                      break L1;
                    }
                  }
                } else {
                  nd.a(-1, "terms.ws");
                  break L1;
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
          L2: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("ih.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw ie.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final String j(int param0) {
        if (param0 >= -57) {
            this.field_M = (qd) null;
        }
        return "</col></u>";
    }

    private final String i(int param0) {
        int var2 = 56 % ((param0 - 28) / 57);
        return "<u=2164A2><col=2164A2>";
    }

    static {
        field_N = "This entry doesn't match";
        field_O = new int[13];
        field_O[11] = 140;
        field_O[0] = 140;
        field_O[4] = 140;
        field_O[1] = 140;
        field_O[3] = 56;
        field_O[2] = 120;
        field_O[7] = 140;
        field_O[10] = 140;
        field_O[6] = 140;
        field_O[8] = 140;
        field_O[9] = 76;
        field_O[5] = 140;
        field_R = 0;
        field_P = "Discard";
    }
}
