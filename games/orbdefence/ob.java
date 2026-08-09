/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob extends ta implements ff, ai {
    private ig field_B;
    static String field_E;
    static int field_K;
    static boolean field_F;
    static sc field_I;
    static String field_L;
    static String field_D;
    static int field_H;
    static String field_C;
    private te field_A;
    private s field_G;

    public final void a(byte param0, int param1, int param2, s param3, int param4) {
        try {
            if (!(param3 != this.field_G)) {
                mh.b((byte) -57);
                this.field_B.q(4210752);
            }
            int var6_int = -98 / ((param0 - -3) / 62);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "ob.M(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    public static void a(byte param0) {
        field_E = null;
        field_L = null;
        field_D = null;
        field_I = null;
        if (param0 != -19) {
          field_K = -18;
          field_C = null;
          return;
        } else {
          field_C = null;
          return;
        }
    }

    public final void a(int param0, int param1, byte param2, te param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == 101) {
                break L1;
              } else {
                this.field_A = (te) null;
                break L1;
              }
            }
            L2: {
              if (param1 == 0) {
                break L2;
              } else {
                L3: {
                  L4: {
                    if (param1 == 1) {
                      break L4;
                    } else {
                      if (param1 != 2) {
                        break L3;
                      } else {
                        ol.a("conduct.ws", param2 + -100);
                        if (var6 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  ol.a("privacy.ws", param2 + -100);
                  if (var6 == 0) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
                break L0;
              }
            }
            ol.a("terms.ws", 1);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var5);

            stackIn_14_1 = new StringBuilder().append("ob.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    ob(ig param0) {
        super(0, 0, 288, 0, (td) null);
        String var7 = null;
        int var3 = 0;
        jc var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
            this.field_B = param0;
            this.field_G = new s(sk.field_C, (ag) null);
            this.field_G.field_j = (td) ((Object) new vk());
            var7 = t.a(-415993727, new String[]{this.m(67), this.k(-804)}, lb.field_a);
            var3 = 20;
            var4 = new jc(lm.field_f, 0, 0, 0, 0, 16777215, -1, 3, 0, lm.field_f.field_H, -1, 2147483647, true);
            this.field_A = new te(var7, var4);
            this.field_A.field_i = "";
            this.field_A.a(0, b.field_p, 2);
            this.field_A.a(1, b.field_p, 2);
            this.field_A.field_h = (ag) (this);
            this.field_A.field_m = this.field_m + -40;
            this.field_A.a(var3, (byte) 53, -40 + this.field_m, 26);
            var3 = var3 + (this.field_A.field_r - -15);
            this.a(this.field_A, (byte) 74);
            var5 = 4;
            var6 = 200;
            this.field_G.a(300 + -var6 >> -1625521855, var3, 40, (byte) -90, var6);
            this.field_G.field_h = (ag) (this);
            this.a(this.field_G, (byte) 74);
            this.a(0, 0, var5 + var3 + 55, (byte) -90, 300);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "ob.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static java.awt.Container l(int param0) {
        if (h.field_J != null) {
            return (java.awt.Container) ((Object) h.field_J);
        }
        if (param0 != 4) {
            ob.a((byte) -91);
            return (java.awt.Container) ((Object) uj.b((byte) -120));
        }
        return (java.awt.Container) ((Object) uj.b((byte) -120));
    }

    private final String k(int param0) {
        if (param0 != -804) {
            field_H = -2;
            return "</col></u>";
        }
        return "</col></u>";
    }

    final boolean a(char param0, int param1, pj param2, int param3) {
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
            if (!super.a(param0, param1, param2, param3)) {
              if ((param1 ^ -1) == -99) {
                stackIn_6_0 = this.a(param2, false);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (-100 == (param1 ^ -1)) {
                  stackIn_10_0 = this.b(param2, false);
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

            stackIn_13_1 = new StringBuilder().append("ob.I(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw dd.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ')');
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

    private final String m(int param0) {
        if (param0 <= 55) {
            field_C = (String) null;
            return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    static {
        field_E = "NOVA BLAST";
        field_F = false;
        field_L = "NITRO BLAST";
        field_D = "Cancel";
        field_C = "Unfortunately we are unable to create an account for you at this time.";
    }
}
