/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lb extends ua implements ql {
    private t field_B;
    static le[] field_E;
    private t field_F;
    static int field_z;
    private t field_G;
    static le field_H;
    static te field_I;
    static String field_A;
    static pd field_C;
    static int[] field_D;

    final boolean a(we param0, char param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, 103)) {
            return true;
          }
          if (param2 == 98) {
            stackIn_6_0 = this.a((byte) 114, param0);
            return stackIn_6_0;
          }
          var5_int = -36 / ((37 - param3) / 50);
          if (99 != param2) {
            return false;
          }
          stackIn_9_0 = this.b(param0, false);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("lb.V(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static String d(byte param0) {
        if (ch.field_d == cf.field_b) {
          return mh.field_F;
        }
        if (param0 != -56) {
          return (String) null;
        }
        if (ed.field_c == cf.field_b) {
          return pi.field_p;
        }
        if (bb.field_a.a(param0 + 56)) {
          return bh.field_b;
        }
        return pi.field_p;
    }

    public final void a(int param0, int param1, int param2, int param3, t param4) {
        int var7 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        we var8 = null;
        var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (this.field_F == param4) {
            je.a(-117);
          } else {
            if (this.field_G != param4) {
              if (param4 == this.field_B) {
                il.a(true);
              }
            } else {
              dc.a(0);
            }
          }
          if (param3 != 7) {
            var8 = (we) null;
            this.a((we) null, '￙', -4, -125);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("lb.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var6 = 0;
        int var5 = param3 + this.field_r;
        if (param0 == 30) {
          var6 = this.field_e + param2;
          t.field_z.a(p.field_b, var5 + 20, 20 + var6, -40 + this.field_l, this.field_p - 50, 16777215, -1, 1, 0, t.field_z.field_C);
          super.a(param0 + 0, param1, param2, param3);
          return;
        }
    }

    public lb() {
        super(0, 0, 476, 225, (ml) null);
        this.field_G = new t(oi.field_g, (of) null);
        this.field_F = new t(aj.field_d, (of) null);
        this.field_B = new t(oi.field_d, (of) null);
        hd var1 = new hd();
        this.field_G.field_h = (ml) ((Object) var1);
        this.field_F.field_h = (ml) ((Object) var1);
        this.field_B.field_h = (ml) ((Object) var1);
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 - var2 >> 1;
        this.field_F.a(30, 13361, -var3 + this.field_l >> 1, var4, -var2 + (this.field_p - 48));
        this.field_B.a(30, 13361, (-var3 + this.field_l >> 1) + var4 + var2, var4, -var2 + this.field_p - 48);
        this.field_G.a(30, 13361, this.field_l - var3 >> 1, var3, this.field_p - (78 + 2 * var2));
        this.field_F.field_o = (of) (this);
        this.field_G.field_o = (of) (this);
        this.field_G.field_m = wd.field_s;
        this.field_B.field_o = (of) (this);
        this.field_B.field_m = ca.field_n;
        this.b((byte) -20, this.field_F);
        this.b((byte) -119, this.field_G);
        this.b((byte) -42, this.field_B);
    }

    public static void e(byte param0) {
        field_H = null;
        field_A = null;
        field_C = null;
        field_E = null;
        int var1 = 1 % ((param0 + 47) / 59);
        field_D = null;
        field_I = null;
    }

    final static void b(boolean param0) {
        RuntimeException runtimeException = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          var1_int = param0 ? 1 : 0;
          for (var2 = 0; n.field_a > var2; var2++) {
            if (n.field_b[var2] != null &&
              !n.field_b[var2].h()) {
              continue;
            }
            var1_int = 1;
            break;
          }
          if (var1_int == 0) {
            return;
          }
          var3 = pf.a((byte) -103, 4);
          n.field_b[var2] = li.a(ke.field_h[var3 + 8], 100, 96);
          na.a((byte) 42, n.field_b[var2]);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw la.a((Throwable) ((Object) runtimeException), "lb.G(" + param0 + ')');
        }
    }

    final static le[] a(boolean param0, String param1, ad param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        le[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param2.c(param1, (byte) -105);
          var5 = param2.a(param3, var4_int, -28459);
          if (param0) {
            lb.e((byte) -92);
          }
          stackIn_3_0 = wj.a((byte) 83, var5, param2, var4_int);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("lb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, byte param2, le[] param3, int param4, int param5) {
        int var22 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var23 = 0;
        int var21Lifetime1;
        int var21Lifetime2;
        int var21Lifetime3;
        int var21Lifetime4;
        var23 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (param3 == null) {
            return;
          }
          if (param1 > 0 &&
            param5 > 0) {
            if (null == param3[3]) {
              stackIn_11_0 = 0;
            } else {
              stackIn_11_0 = param3[3].field_m;
            }
            var6_int = stackIn_11_0;
            if (param3[5] == null) {
              stackIn_14_0 = 0;
            } else {
              stackIn_14_0 = param3[5].field_m;
            }
            var7 = stackIn_14_0;
            if (null == param3[1]) {
              stackIn_17_0 = 0;
            } else {
              stackIn_17_0 = param3[1].field_n;
            }
            var8 = stackIn_17_0;
            if (null != param3[7]) {
              stackIn_20_0 = param3[7].field_n;
            } else {
              stackIn_20_0 = 0;
            }
            var9 = stackIn_20_0;
            var10 = param1 + param0;
            var11 = param5 + param4;
            var12 = param0 + var6_int;
            var13 = -var7 + var10;
            var14 = var8 + param4;
            var15 = var11 - var9;
            var16 = var12;
            var17 = var13;
            if (var17 < var16) {
              var17 = param0 + param1 * var6_int / (var6_int + var7);
              var16 = param0 + param1 * var6_int / (var6_int + var7);
            }
            var18 = var14;
            var19 = 76 % ((param2 + 86) / 33);
            var20 = var15;
            if (var20 < var18) {
              var20 = var8 * param5 / (var8 + var9) + param4;
              var18 = var8 * param5 / (var8 + var9) + param4;
            }
            ge.b(cg.field_d);
            if (null != param3[0]) {
              ge.c(param0, param4, var16, var18);
              param3[0].c(param0, param4);
              ge.a(cg.field_d);
            }
            if (null != param3[2]) {
              ge.c(var17, param4, var10, var18);
              param3[2].c(var13, param4);
              ge.a(cg.field_d);
            }
            if (param3[6] != null) {
              ge.c(param0, var20, var16, var11);
              param3[6].c(param0, var15);
              ge.a(cg.field_d);
            }
            if (param3[8] != null) {
              ge.c(var17, var20, var10, var11);
              param3[8].c(var13, var15);
              ge.a(cg.field_d);
            }
            if (null != param3[1] &&
              param3[1].field_m != 0) {
              ge.c(var16, param4, var17, var18);
              for (var21 = var12; var21 < var13; var21 = var21 + param3[1].field_m) {
                param3[1].c(var21, param4);
              }
              ge.a(cg.field_d);
            }
            if (param3[7] != null &&
              0 != param3[7].field_m) {
              ge.c(var16, var20, var17, var11);
              for (var21Lifetime1 = var12; var13 > var21Lifetime1; var21Lifetime1 = var21Lifetime1 + param3[7].field_m) {
                param3[7].c(var21Lifetime1, var15);
              }
              ge.a(cg.field_d);
            }
            if (null != param3[3] &&
              param3[3].field_n != 0) {
              ge.c(param0, var18, var16, var20);
              for (var21Lifetime2 = var14; var15 > var21Lifetime2; var21Lifetime2 = var21Lifetime2 + param3[3].field_n) {
                param3[3].c(param0, var21Lifetime2);
              }
              ge.a(cg.field_d);
            }
            if (null != param3[5] &&
              param3[5].field_n != 0) {
              ge.c(var17, var18, var10, var20);
              for (var21Lifetime3 = var14; var15 > var21Lifetime3; var21Lifetime3 = var21Lifetime3 + param3[5].field_n) {
                param3[5].c(var13, var21Lifetime3);
              }
              ge.a(cg.field_d);
            }
            if (null != param3[4] &&
              param3[4].field_m != 0) {
              if (param3[4].field_n == 0) {
                return;
              }
              ge.c(var16, var18, var17, var20);
              for (var21Lifetime4 = var14; var21Lifetime4 < var15; var21Lifetime4 = var21Lifetime4 + param3[4].field_n) {
                for (var22 = var12; var13 > var22; var22 = var22 + param3[4].field_m) {
                  param3[4].c(var22, var21Lifetime4);
                }
              }
              ge.a(cg.field_d);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_76_0 = var6;
          stackIn_76_1 = new StringBuilder().append("lb.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_76_0), ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    static {
        field_H = new le(640, 480);
        field_A = "Press 'ENTER'";
        field_I = new te(6, 0, 4, 2);
        field_D = new int[10];
    }
}
