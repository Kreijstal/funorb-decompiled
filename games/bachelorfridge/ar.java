/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ar extends vd implements pc, lja {
    private tea field_F;
    private hf field_E;
    private aha field_D;

    public final void a(int param0, hf param1, int param2, byte param3, int param4) {
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
              if (param1 == this.field_E) {
                tr.a(12);
                this.field_F.p(-76);
                break L1;
              } else {
                break L1;
              }
            }
            if (param3 > 50) {
              break L0;
            } else {
              this.field_D = (aha) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var6);

            stackIn_8_1 = new StringBuilder().append("ar.AA(").append(param0).append(',');

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
          throw pe.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3, op param4, oo param5) {
        if (param2 < 0 || param4.field_z <= param2 || param0 < 0 || param0 >= param4.field_B) {
            return;
        }
        if (param1 != 31546) {
            return;
        }
        wia var8 = param4.field_a[param2][param0];
        aga var7 = var8.field_l;
        if (!(var7 != null)) {
            return;
        }
        try {
            param5.field_o.a(new iv(new nq(var7), false, 1, 100, 0), true);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "ar.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(int param0, aha param1, int param2, byte param3) {
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                ffa.a("terms.ws", 12);
                break L1;
              } else {
                if ((param0 ^ -1) == -2) {
                  ffa.a("privacy.ws", 12);
                  break L1;
                } else {
                  if (2 != param0) {
                    break L1;
                  } else {
                    ffa.a("conduct.ws", 12);
                    break L1;
                  }
                }
              }
            }
            if (param3 >= 12) {
              break L0;
            } else {
              this.field_F = (tea) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("ar.A(").append(param0).append(',');

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
          throw pe.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final String a(int param0) {
        String discarded$0 = null;
        if (param0 != -28759) {
            discarded$0 = this.a(-99);
            return "</col></u>";
        }
        return "</col></u>";
    }

    ar(tea param0) {
        super(0, 0, 288, 0, (qda) null);
        String var7 = null;
        int var3 = 0;
        gha var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
            this.field_F = param0;
            this.field_E = new hf(tj.field_a, (pl) null);
            this.field_E.field_f = (qda) ((Object) new ff());
            var7 = lga.a(true, new String[]{this.d((byte) -121), this.a(-28759)}, aja.field_m);
            var3 = 20;
            var4 = new gha(jca.field_a, 0, 0, 0, 0, 16777215, -1, 3, 0, jca.field_a.field_u, -1, 2147483647, true);
            this.field_D = new aha(var7, var4);
            this.field_D.field_h = "";
            this.field_D.a(1, 0, rt.field_b);
            this.field_D.a(1, 1, rt.field_b);
            this.field_D.field_p = this.field_p - 40;
            this.field_D.field_k = (pl) (this);
            this.field_D.a(var3, this.field_p + -40, 26, (byte) -50);
            var3 = var3 + (15 + this.field_D.field_q);
            this.c(this.field_D, -126);
            var5 = 4;
            var6 = 200;
            this.field_E.a(-var6 + 300 >> 1705577665, 40, (byte) 59, var6, var3);
            this.field_E.field_k = (pl) (this);
            this.c(this.field_E, -127);
            this.a(0, var5 + var3 + 55, (byte) 59, 300, 0);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "ar.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(int param0, int param1, char param2, wj param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
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
            if (super.a(param0, param1, param2, param3)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((param1 ^ -1) != -99) {
                if (-100 == (param1 ^ -1)) {
                  stackIn_10_0 = this.b(param3, 1);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              } else {
                stackIn_6_0 = this.a(-124, param3);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("ar.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

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
          throw pe.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    private final String d(byte param0) {
        if (param0 > -89) {
            this.field_D = (aha) null;
            return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    static {
    }
}
