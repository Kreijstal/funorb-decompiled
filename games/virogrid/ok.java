/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ok extends fd implements im, ta {
    private b field_H;
    static String field_K;
    static int field_L;
    static boolean field_J;
    private nk field_D;
    static int field_G;
    private tg field_I;
    static String field_E;

    public static void f(int param0) {
        field_K = null;
        field_E = null;
        if (param0 != -100) {
            field_J = true;
        }
    }

    final boolean a(fi param0, char param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_10_0 = false;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, 94)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-99 == (param2 ^ -1)) {
                stackIn_7_0 = this.b(2, param0);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var5_int = -34 % ((param3 - -75) / 36);
                if (-100 != (param2 ^ -1)) {
                  stackIn_12_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_10_0 = this.a(-16234, param0);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var5);

            stackIn_15_1 = new StringBuilder().append("ok.AA(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L1;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L1;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              return stackIn_12_0 != 0;
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, e param9, int param10, mg[] param11, int param12, int param13, int param14, int param15, mg[] param16, e param17, mg[] param18, int param19, int param20) {
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var21 = null;
        try {
          L0: {
            L1: {
              oj.a(param13, new wg(param11), param14, param20, param2, param19, param12, param6, param7, param8, param1, new wg(param16), (byte) -29, param15, param17, param4, param10, param9, param0, new wg(param18), param5);
              if (param3 == -100) {
                break L1;
              } else {
                ok.f(-30);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var21 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var21);

            stackIn_5_1 = new StringBuilder().append("ok.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');

            if (param9 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param10).append(',');

            if (param11 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',');

            if (param16 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param17 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param18 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L6;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L6;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_6_0), stackIn_18_2 + ',' + param19 + ',' + param20 + ')');
        }
    }

    public final void a(int param0, tg param1, int param2, int param3, int param4) {
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
              if (param0 == 12085) {
                break L1;
              } else {
                this.field_D = (nk) null;
                break L1;
              }
            }
            if (this.field_I == param1) {
              ul.a(15429);
              this.field_H.h(true);
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

            stackIn_8_1 = new StringBuilder().append("ok.L(").append(param0).append(',');

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
          throw kg.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final String a(byte param0) {
        if (param0 < 116) {
            nk var3 = (nk) null;
            this.a(62, -11, false, (nk) null);
            return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    ok(b param0) {
        super(0, 0, 288, 0, (ol) null);
        String var7 = null;
        int var3 = 0;
        aj var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
            this.field_H = param0;
            this.field_I = new tg(md.field_c, (cd) null);
            this.field_I.field_w = (ol) ((Object) new hf());
            var7 = oi.a(new String[]{this.a((byte) 125), this.a(-18042)}, gh.field_Kb, 2);
            var3 = 20;
            var4 = new aj(dj.field_h, 0, 0, 0, 0, 16777215, -1, 3, 0, dj.field_h.field_H, -1, 2147483647, true);
            this.field_D = new nk(var7, var4);
            this.field_D.field_h = "";
            this.field_D.a(al.field_g, (byte) -100, 0);
            this.field_D.a(al.field_g, (byte) -126, 1);
            this.field_D.field_g = this.field_g - 40;
            this.field_D.field_o = (cd) (this);
            this.field_D.a(-40 + this.field_g, var3, 26, (byte) -125);
            var3 = var3 + (this.field_D.field_m + 15);
            this.a((fi) (this.field_D), (byte) -78);
            var5 = 4;
            var6 = 200;
            this.field_I.a(40, true, var3, -var6 + 300 >> 306608929, var6);
            this.field_I.field_o = (cd) (this);
            this.a((fi) (this.field_I), (byte) -78);
            this.a(var5 + (55 + var3), true, 0, 0, 300);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "ok.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(int param0, int param1, boolean param2, nk param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2) {
                break L1;
              } else {
                field_J = true;
                break L1;
              }
            }
            if (0 == param0) {
              wf.a("terms.ws", 12);
              return;
            } else {
              if (-2 == (param0 ^ -1)) {
                wf.a("privacy.ws", 12);
                return;
              } else {
                if (-3 != (param0 ^ -1)) {
                  break L0;
                } else {
                  wf.a("conduct.ws", 12);
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("ok.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

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
          throw kg.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    final static void b(boolean param0, int param1) {
        if (param1 != 3410) {
          field_E = (String) null;
          oi.a(param0, 6);
          cg.a(param0, param1 + 3441);
          return;
        } else {
          oi.a(param0, 6);
          cg.a(param0, param1 + 3441);
          return;
        }
    }

    private final String a(int param0) {
        if (param0 != -18042) {
            return (String) null;
        }
        return "</col></u>";
    }

    static {
        field_K = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find suitable opponents in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
        field_E = "<%0> has withdrawn the request to join.";
    }
}
