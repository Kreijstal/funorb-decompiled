/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class re extends pe implements ng, qd {
    private pl field_H;
    private kk field_F;
    private ff field_J;
    static wk field_I;
    static va field_G;
    static String field_E;

    private final String a(int param0) {
        if (param0 != 0) {
            return (String) null;
        }
        return "<u=2164A2><col=2164A2>";
    }

    public final void a(int param0, pl param1, int param2, int param3, int param4) {
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
              if (this.field_H == param1) {
                hc.f(92682);
                this.field_F.l(param0 + -8792);
                break L1;
              } else {
                break L1;
              }
            }
            if (param0 == -18905) {
              break L0;
            } else {
              field_G = (va) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var6);

            stackIn_8_1 = new StringBuilder().append("re.DA(").append(param0).append(',');

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
          throw bd.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final String h(byte param0) {
        if (param0 > -5) {
            return (String) null;
        }
        return "</col></u>";
    }

    final boolean a(char param0, int param1, byte param2, ub param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        boolean stackIn_10_0 = false;
        boolean stackIn_14_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 < -96) {
              if (super.a(param0, param1, (byte) -104, param3)) {
                stackIn_6_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (98 == param1) {
                  stackIn_10_0 = this.a((byte) -117, param3);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (param1 == 99) {
                    stackIn_14_0 = this.b(param3, 1);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    return false;
                  }
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
            stackIn_17_0 = (RuntimeException) (var5);

            stackIn_17_1 = new StringBuilder().append("re.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L1;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L1;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              return stackIn_14_0;
            }
          }
        }
    }

    re(kk param0) {
        super(0, 0, 288, 0, (bf) null);
        String var7 = null;
        int var3 = 0;
        ll var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
            this.field_F = param0;
            this.field_H = new pl(e.field_e, (ce) null);
            this.field_H.field_w = (bf) ((Object) new jl());
            var7 = di.a(new String[]{this.a(0), this.h((byte) -85)}, (byte) 79, t.field_b);
            var3 = 20;
            var4 = new ll(gh.field_b, 0, 0, 0, 0, 16777215, -1, 3, 0, gh.field_b.field_M, -1, 2147483647, true);
            this.field_J = new ff(var7, var4);
            this.field_J.field_p = "";
            this.field_J.a(1, nk.field_R, 0);
            this.field_J.a(1, nk.field_R, 1);
            this.field_J.field_s = (ce) (this);
            this.field_J.field_r = -40 + this.field_r;
            this.field_J.a(var3, (byte) 61, this.field_r + -40, 26);
            var3 = var3 + (this.field_J.field_n + 15);
            this.a((ub) (this.field_J), (byte) 83);
            var5 = 4;
            var6 = 200;
            this.field_H.a(127, var3, 40, var6, 300 + -var6 >> 1135754337);
            this.field_H.field_s = (ce) (this);
            this.a((ub) (this.field_H), (byte) 126);
            this.a(127, 0, var5 + var3 - -55, 300, 0);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "re.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void g(byte param0) {
        field_E = null;
        field_G = null;
        field_I = null;
        if (param0 != -55) {
            String var2 = (String) null;
            re.a((kl) null, (String) null, (String) null, -82);
        }
    }

    final static db[] a(kl param0, String param1, String param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        db[] stackIn_1_0 = null;
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
            var6 = -86 / ((18 - param3) / 59);
            var4_int = param0.b(-1, param1);
            var5 = param0.a(var4_int, param2, -11986);
            stackIn_1_0 = ml.a(param0, var5, -26955, var4_int);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var4);

            stackIn_4_1 = new StringBuilder().append("re.GA(");

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


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param1 == null) {
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

            if (param2 == null) {
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
          throw bd.a((Throwable) ((Object) stackIn_5_0), stackIn_11_2 + ',' + param3 + ')');
        }
        return stackIn_1_0;
    }

    public final void a(int param0, ff param1, int param2, int param3) {
        int var6 = wizardrun.field_H;
        try {
            if (-1 == (param0 ^ -1)) {
                fa.a("terms.ws", 12);
            } else {
                if (1 == param0) {
                    fa.a("privacy.ws", 12);
                } else {
                    if (!(param0 != 2)) {
                        fa.a("conduct.ws", 12);
                    }
                }
            }
            int var5_int = -13 / ((36 - param3) / 53);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "re.CA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_I = new wk();
        field_G = new va(256);
        field_E = "Player Name: ";
    }
}
