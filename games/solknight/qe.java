/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qe extends ki implements re, ka {
    private pj field_H;
    static int[] field_G;
    static String field_F;
    private jk field_D;
    private kj field_E;

    public final void a(int param0, int param1, int param2, kj param3) {
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                ud.a(11692, "terms.ws");
                break L1;
              } else {
                if ((param1 ^ -1) == -2) {
                  ud.a(11692, "privacy.ws");
                  break L1;
                } else {
                  if (-3 != (param1 ^ -1)) {
                    break L1;
                  } else {
                    ud.a(11692, "conduct.ws");
                    break L1;
                  }
                }
              }
            }
            if (param2 == 50) {
              break L0;
            } else {
              this.field_E = (kj) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("qe.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw fc.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    public final void a(int param0, int param1, int param2, pj param3, boolean param4) {
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
              if (param3 == this.field_H) {
                ua.a((byte) -118);
                this.field_D.f(param4);
                break L1;
              } else {
                break L1;
              }
            }
            if (param4) {
              break L0;
            } else {
              qe.i(3);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var6);

            stackIn_8_1 = new StringBuilder().append("qe.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw fc.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param4 + ')');
        }
    }

    qe(jk param0) {
        super(0, 0, 288, 0, (j) null);
        String var7 = null;
        int var3 = 0;
        af var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
            this.field_D = param0;
            this.field_H = new pj(dd.field_a, (dg) null);
            this.field_H.field_w = (j) ((Object) new gh());
            var7 = bb.a(rf.field_F, new String[]{this.e(true), this.h(-18655)}, -63);
            var3 = 20;
            var4 = new af(ua.field_G, 0, 0, 0, 0, 16777215, -1, 3, 0, ua.field_G.field_F, -1, 2147483647, true);
            this.field_E = new kj(var7, var4);
            this.field_E.field_z = "";
            this.field_E.a(0, mj.field_a, 1);
            this.field_E.a(1, mj.field_a, 1);
            this.field_E.field_n = (dg) (this);
            this.field_E.field_t = -40 + this.field_t;
            this.field_E.b(26, var3, 1, this.field_t - 40);
            var3 = var3 + (this.field_E.field_x - -15);
            this.a(this.field_E, 5411);
            var5 = 4;
            var6 = 200;
            this.field_H.b(40, var6, -var6 + 300 >> 1130827681, 0, var3);
            this.field_H.field_n = (dg) (this);
            this.a(this.field_H, 5411);
            this.b(var5 + (55 + var3), 300, 0, 0, 0);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "qe.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(char param0, byte param1, int param2, rc param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
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
            if (super.a(param0, (byte) -127, param2, param3)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-99 == (param2 ^ -1)) {
                stackIn_7_0 = this.a((byte) -125, param3);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param2 == 99) {
                  stackIn_11_0 = this.b(120, param3);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var5_int = 68 / ((param1 - 31) / 56);
                  stackIn_13_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var5);

            stackIn_16_1 = new StringBuilder().append("qe.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw fc.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              return stackIn_13_0 != 0;
            }
          }
        }
    }

    public static void i(int param0) {
        if (param0 != -28528) {
            qe.a((byte) 127);
            field_G = null;
            field_F = null;
            return;
        }
        field_G = null;
        field_F = null;
    }

    final static String a(byte param0) {
        if (ne.field_g == null) {
            return "";
        }
        int var1 = -98 % ((54 - param0) / 59);
        return ne.field_g;
    }

    private final String h(int param0) {
        if (param0 != -18655) {
            this.field_E = (kj) null;
            return "</col></u>";
        }
        return "</col></u>";
    }

    private final String e(boolean param0) {
        if (!param0) {
            rc var3 = (rc) null;
            this.a('￘', (byte) -57, -43, (rc) null);
            return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    static {
        field_F = "End Game";
    }
}
