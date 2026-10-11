/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ri {
    static byte[] field_c;
    private bj field_d;
    static String field_f;
    private bj field_a;
    static String field_b;
    private tg field_e;
    private tg field_g;

    final static void a(byte param0, java.applet.Applet param1) {
        RuntimeException runtimeException = null;
        String var2 = null;
        String var3 = null;
        long var4 = 0L;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -101) {
            return;
          }
          nn.field_q = true;
          var2 = "tuhstatbut";
          var3 = "rvnadlm";
          var4 = -1L;
          eg.a(var2, 87, var3, var4, param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_7_0 = runtimeException;
          stackIn_7_1 = new StringBuilder().append("ri.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static String a(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        String stackIn_3_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var1_int = di.a(true);
          var2 = var1_int / 50;
          var3 = -(var2 * 1000) + var1_int * 1000 / 50;
          var5 = 73 % ((param0 - 56) / 53);
          var4 = "0";
          if (1 <= var3 / 100) {
            var4 = "" + var3 / 100;
          }
          stackIn_3_0 = var2 + "." + var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var1), "ri.D(" + param0 + ')');
        }
    }

    final ji a(int param0, int[] param1, int param2) {
        RuntimeException var4 = null;
        ji stackIn_7_0 = null;
        ji stackIn_12_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -26575) {
            field_c = (byte[]) null;
          }
          if (1 == this.field_a.b((byte) -71)) {
            stackIn_7_0 = this.a(-31093, 0, param2, param1);
            return stackIn_7_0;
          }
          if (this.field_a.b(param2, -26727) != 1) {
            throw new RuntimeException();
          }
          stackIn_12_0 = this.a(param0 ^ 7866, param2, 0, param1);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("ri.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1, int param2, pb param3, int param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_10_0 = false;
        int stackIn_28_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_48_0 = 0;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_65_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_9_0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
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
        int stackIn_38_0Lifetime1;
        int stackIn_38_1Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = MinerDisturbance.field_ab;
        try {
          var5_int = d.a((param2 - param1) * 3, -31479);
          var6 = param1 * 3;
          ab.a(-20707);
          var7 = var5_int - 10;
          if (param3.field_E > 0 &&
            null != param3.field_x) {
            ef.a(-24322);
          }
          ik.field_T = param4;
          var8 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(var8 < param3.field_I)))) {
            var9 = param3.field_e[var8];
            var10 = param3.field_O[var8];
            var11 = param3.field_F[var8];
            stackOut_9_0 = param0;
            stackIn_48_0 = stackOut_9_0 ? 1 : 0;
            stackIn_10_0 = stackOut_9_0;
            if (var19 == 0) {
              if (stackIn_10_0) {
                var12 = wa.field_d[var9];
                var13 = ti.field_O[var9];
                var14 = wa.field_d[var10] - var12;
                var15 = wa.field_d[var11] - var12;
                var16 = ti.field_O[var10] - var13;
                var17 = ti.field_O[var11] - var13;
              }
              if (!stackIn_10_0 ||
                !(var17 * var14 - var16 * var15 >= 0)) {
                var12Lifetime1 = oc.field_l[var9];
                if (var12Lifetime1 != -2147483648) {
                  var13Lifetime1 = oc.field_l[var10];
                  if (var13Lifetime1 != -2147483648) {
                    var14 = oc.field_l[var11];
                    if (-2147483648 != var14) {
                      var15 = -var6 + (var14 + var13Lifetime1 + var12Lifetime1);
                      if (var7 < 0) {
                        stackIn_28_0 = var15 << -var7;
                      } else {
                        stackIn_28_0 = var15 >> var7;
                      }
                      var16 = -stackIn_28_0 + (mg.field_e.length - 1);
                      var17 = mg.field_e[var16];
                      while (true) {
                        if (var17 >> 4 != 0) {
                          var16--;
                          stackIn_38_0 = ~var16;
                          stackIn_38_1 = -1;
                          if (stackIn_38_0 > stackIn_38_1) {
                            System.err.println("Out of range!");
                            break;
                          }
                          var17 = mg.field_e[var16];
                          continue;
                        }
                        stackIn_38_0Lifetime1 = var17;
                        stackIn_38_1Lifetime1 = var16 << 4;
                        var18 = stackIn_38_0Lifetime1 + stackIn_38_1Lifetime1;
                        ta.field_d[var18] = var8;
                        mg.field_e[var16] = 1 + var17;
                        if (0 < param3.field_E &&
                          param3.field_x != null) {
                          dupTemp$0 = param3.field_x[var8];
                          di.field_V[dupTemp$0] = di.field_V[dupTemp$0] + 1;
                        }
                        ik.field_T = ik.field_T + 1;
                        break;
                      }
                    }
                  }
                }
              }
              var8++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_48_0 = 0;
          }
          if (stackIn_48_0 < param3.field_E &&
            null != param3.field_x) {
            var8Lifetime1 = 0;
            var9Lifetime1 = 0;
            while (!(di.field_V.length <= var9Lifetime1)) {
              var10Lifetime1 = di.field_V[var9Lifetime1];
              di.field_V[var9Lifetime1] = var8Lifetime1;
              var8Lifetime1 = var8Lifetime1 + var10Lifetime1;
              var9Lifetime1++;
              if (var19 != 0) {
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_64_0 = var5;
          stackIn_64_1 = new StringBuilder().append("ri.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_65_2 = "null";
          } else {
            stackIn_65_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_64_0), ((StringBuilder) (Object) stackIn_64_1).append(stackIn_65_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(boolean param0) {
        try {
          bd.field_b = false;
          kj.field_a.d((byte) -54);
          if (!param0) {
            ri.a(true, 81, 23, (pb) null, -39);
          }
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "ri.G(" + param0 + ')');
        }
    }

    private final ji a(int[] param0, byte param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        ji var8 = null;
        jd var9 = null;
        ji stackIn_2_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_15_0 = null;
        ji stackIn_18_0 = null;
        ji stackIn_23_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        ji var8Lifetime1;
        try {
          var5_int = param2 ^ (param3 >>> 12 | param3 << 4 & 65532);
          var5_int = var5_int | param3 << 16;
          var6 = (long)var5_int;
          var8 = (ji) (this.field_g.a(var6, -27109));
          if (var8 != null) {
            stackIn_2_0 = var8;
            return stackIn_2_0;
          }
          if (param0 != null &&
            0 >= param0[0]) {
            stackIn_10_0 = null;
            return (ji) (stackIn_10_0);
          }
          var9 = jd.a(this.field_d, param3, param2);
          if (var9 == null) {
            stackIn_15_0 = null;
            return (ji) (stackIn_15_0);
          }
          var8Lifetime1 = var9.a();
          this.field_g.a(param1 ^ -72, var6, var8Lifetime1);
          if (param1 != -72) {
            stackIn_18_0 = (ji) null;
            return stackIn_18_0;
          }
          if (null != param0) {
            param0[0] = param0[0] - var8Lifetime1.field_r.length;
          }
          stackIn_23_0 = var8Lifetime1;
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_27_0 = var5;
          stackIn_27_1 = new StringBuilder().append("ri.I(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final ji a(int param0, int[] param1, byte param2) {
        RuntimeException var4 = null;
        ji stackIn_2_0 = null;
        ji stackIn_5_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_d.b((byte) -71) == 1) {
            stackIn_2_0 = this.a(param1, (byte) -72, param0, 0);
            return stackIn_2_0;
          }
          if (this.field_d.b(param0, -26727) == 1) {
            stackIn_5_0 = this.a(param1, (byte) -72, 0, param0);
            return stackIn_5_0;
          }
          if (param2 < 57) {
            this.field_d = (bj) null;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("ri.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void b(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_c = null;
          if (param0 != -25) {
            ri.a((byte) -4, (java.applet.Applet) null);
          }
          field_f = null;
          field_b = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var1), "ri.F(" + param0 + ')');
        }
    }

    final static boolean a(int param0, boolean param1, int param2, int param3) {
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        try {
          if (param1) {
            if (pi.field_h[param2] < pi.field_h[param3]) {
              return true;
            }
            if (pi.field_h[param2] > pi.field_h[param3]) {
              return false;
            }
            if (cc.field_L[param3] > cc.field_L[param2]) {
              return true;
            }
            if (cc.field_L[param3] < cc.field_L[param2]) {
              return false;
            }
          } else {
            if (cc.field_L[param2] < cc.field_L[param3]) {
              return true;
            }
            if (cc.field_L[param3] < cc.field_L[param2]) {
              return false;
            }
            if (pi.field_h[param2] < pi.field_h[param3]) {
              return true;
            }
            if (pi.field_h[param2] > pi.field_h[param3]) {
              return false;
            }
          }
          var4_int = jk.field_db[param2] + qa.field_c[param2] + li.field_a[param2];
          var5 = qa.field_c[param3] + jk.field_db[param3] + li.field_a[param3];
          if (var4_int < var5) {
            return true;
          }
          if (param0 != 20021) {
            ri.a((byte) -80, (java.applet.Applet) null);
          }
          if (var5 < var4_int) {
            return false;
          }
          return !(param3 <= param2);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var4), "ri.J(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final ji a(int param0, int param1, int param2, int[] param3) {
        ji stackIn_2_0 = null;
        ji stackIn_5_0 = null;
        Object stackIn_13_0 = null;
        Object stackIn_19_0 = null;
        Object stackIn_23_0 = null;
        ji stackIn_25_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        ji var8 = null;
        b var9 = null;
        ji var8Lifetime1;
        try {
          var5_int = param2 ^ ((param1 & -1610608641) << 4 | param1 >>> 12);
          var5_int = var5_int | param1 << 16;
          var6 = 4294967296L ^ (long)var5_int;
          if (param0 != -31093) {
            stackIn_2_0 = (ji) null;
            return stackIn_2_0;
          }
          var8 = (ji) (this.field_g.a(var6, -27109));
          if (null != var8) {
            stackIn_5_0 = var8;
            return stackIn_5_0;
          }
          if (param3 != null &&
            param3[0] <= 0) {
            stackIn_13_0 = null;
            return (ji) (stackIn_13_0);
          }
          var9 = (b) (this.field_e.a(var6, param0 + 3984));
          if (var9 == null) {
            var9 = b.a(this.field_a, param1, param2);
            if (null == var9) {
              stackIn_19_0 = null;
              return (ji) (stackIn_19_0);
            }
            this.field_e.a(0, var6, var9);
          }
          var8Lifetime1 = var9.a(param3);
          if (var8Lifetime1 == null) {
            stackIn_23_0 = null;
            return (ji) (stackIn_23_0);
          }
          var9.b(34);
          this.field_g.a(0, var6, var8Lifetime1);
          stackIn_25_0 = var8Lifetime1;
          return stackIn_25_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_29_0 = var5;
          stackIn_29_1 = new StringBuilder().append("ri.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    ri(bj param0, bj param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_e = new tg(256);
        this.field_g = new tg(256);
        try {
          this.field_a = param1;
          this.field_d = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("ri.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    static {
        field_c = new byte[520];
        field_f = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_b = "Mine the Volcano";
    }
}
