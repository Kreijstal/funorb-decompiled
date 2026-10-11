/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh extends hl {
    static boolean field_Sb;
    static String field_Lb;
    static int field_Nb;
    static int[] field_Mb;
    private hl field_Qb;
    static String[] field_Ob;
    static String field_Kb;
    hl field_Rb;
    static String field_Pb;

    final void b(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this.a((byte) -121, param1, param2, param6, param4);
        if (param0 != 0) {
          return;
        }
        try {
          this.a(param3, param5, -105);
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "nh.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    nh(long param0, hl param1, hl param2, hl param3, oh param4, String param5) {
        super(param0, param1);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != param4) {
            this.field_Qb = new hl(0L, param2);
            this.field_Qb.field_vb = param4;
            this.a((byte) -89, this.field_Qb);
          }
          if (null != param5) {
            this.field_Rb = new hl(0L, param3, param5);
            this.a((byte) 87, this.field_Rb);
          }
          this.c((byte) 121);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_13_0 = runtimeException;
          stackIn_13_1 = new StringBuilder().append("nh.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param4 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (param5 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    public static void c(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_Pb = null;
          field_Ob = null;
          if (param0) {
            nh.a(113, -89, (id) null, true, true);
          }
          field_Lb = null;
          field_Mb = null;
          field_Kb = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var1), "nh.E(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, id param2, boolean param3, boolean param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_13_0 = false;
        int stackIn_30_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_41_0 = 0;
        int stackIn_50_0 = 0;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_65_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_12_0;
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
        int stackIn_41_0Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = TetraLink.field_J;
        try {
          var5_int = ja.c(-7422, 3 * (-param1 + param0));
          var6 = param1 * 3;
          d.d(-107);
          var7 = -10 + var5_int;
          if (param2.field_Q > 0 &&
            param2.field_u != null) {
            wc.i(3);
          }
          if (!param3) {
            return;
          }
          og.field_f = 0;
          var8 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(param2.field_s > var8)))) {
            var9 = param2.field_K[var8];
            var10 = param2.field_I[var8];
            var11 = param2.field_e[var8];
            stackOut_12_0 = param4;
            stackIn_50_0 = stackOut_12_0 ? 1 : 0;
            stackIn_13_0 = stackOut_12_0;
            if (var19 == 0) {
              if (stackIn_13_0) {
                var12 = lj.field_b[var9];
                var13 = pl.field_f[var9];
                var14 = -var12 + lj.field_b[var10];
                var15 = lj.field_b[var11] - var12;
                var16 = pl.field_f[var10] - var13;
                var17 = pl.field_f[var11] - var13;
              }
              if (!stackIn_13_0 ||
                !(0 <= var17 * var14 - var15 * var16)) {
                var12Lifetime1 = nc.field_b[var9];
                if (var12Lifetime1 != -2147483648) {
                  var13Lifetime1 = nc.field_b[var10];
                  if (var13Lifetime1 != -2147483648) {
                    var14 = nc.field_b[var11];
                    if (-2147483648 != var14) {
                      var15 = -var6 + var14 + (var13Lifetime1 + var12Lifetime1);
                      stackIn_30_0 = -1 + ug.field_bb.length;
                      if (var7 < 0) {
                        stackIn_31_1 = var15 << -var7;
                      } else {
                        stackIn_31_1 = var15 >> var7;
                      }
                      var16 = stackIn_30_0 - stackIn_31_1;
                      var17 = ug.field_bb[var16];
                      while (true) {
                        if (0 != var17 >> 4) {
                          var16--;
                          stackIn_41_0 = var16;
                          if (stackIn_41_0 < 0) {
                            System.err.println("Out of range!");
                            break;
                          }
                          var17 = ug.field_bb[var16];
                          continue;
                        }
                        stackIn_41_0Lifetime1 = var17 + (var16 << 4);
                        var18 = stackIn_41_0Lifetime1;
                        lg.field_ab[var18] = var8;
                        ug.field_bb[var16] = 1 + var17;
                        if (param2.field_Q > 0 &&
                          param2.field_u != null) {
                          dupTemp$0 = param2.field_u[var8];
                          c.field_m[dupTemp$0] = c.field_m[dupTemp$0] + 1;
                        }
                        og.field_f = og.field_f + 1;
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
            stackIn_50_0 = -1;
          }
          if (stackIn_50_0 > ~param2.field_Q &&
            null != param2.field_u) {
            var8Lifetime1 = 0;
            var9Lifetime1 = 0;
            while (!(var9Lifetime1 >= c.field_m.length)) {
              var10Lifetime1 = c.field_m[var9Lifetime1];
              c.field_m[var9Lifetime1] = var8Lifetime1;
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
          stackIn_64_1 = new StringBuilder().append("nh.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_65_2 = "null";
          } else {
            stackIn_65_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_64_0), ((StringBuilder) (Object) stackIn_64_1).append(stackIn_65_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2) {
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
          var4_int = -param0;
          var5 = -param0;
          if (this.field_Qb != null) {
            var4_int = this.field_Qb.f(-76);
          }
          if (this.field_Rb != null) {
            var5 = this.field_Rb.c(125, -param0 + (this.field_Hb - param1) - (var4_int + param1));
          }
          var6 = var5 + var4_int + (param1 + param0 + param1);
          if (param2 > -67) {
            this.field_Rb = (hl) null;
          }
          if (var6 > this.field_Hb) {
            var5 = var5 + (this.field_Hb - var6);
            var6 = this.field_Hb;
          }
          if (1 == this.field_xb) {
            param1 = param1 + (-var6 + this.field_Hb) / 2;
          }
          if (this.field_xb == 2) {
            param1 = param1 + (this.field_Hb - var6);
          }
          if (this.field_Qb != null) {
            this.field_Qb.a((byte) -105, var4_int, 0, this.field_R, param1);
            this.field_Qb.field_J = this.field_J;
          }
          if (null != this.field_Rb) {
            this.field_Rb.a((byte) -106, var5, 0, this.field_R, param1 + var4_int + param0);
            if (null != this.field_Qb) {
              this.field_Rb.field_xb = 0;
              if (TetraLink.field_J != 0) {
                this.field_Rb.field_xb = this.field_xb;
              }
            } else {
              this.field_Rb.field_xb = this.field_xb;
            }
            this.field_Rb.field_J = this.field_J;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var4), "nh.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final int b(int param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -26606) {
            nh.a(7, 48, (id) null, false, true);
          }
          var4_int = -param1;
          var5 = -param1;
          if (null != this.field_Qb) {
            var4_int = this.field_Qb.f(param0 + 26480);
          }
          if (null != this.field_Rb) {
            var5 = this.field_Rb.f(-64);
          }
          stackIn_8_0 = param2 + var5 + (param1 + param2 + var4_int);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var4), "nh.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_Sb = false;
        field_Lb = "Invite <%0> to this game";
        field_Ob = new String[]{"Play 5 Rated games", "Play 10 Rated games", "Win 5 Rated games", "Win 10 Rated games", "Win 25 Rated games", "Win a Rated game with two (or more) lines of four", "Build a row of five counters in a Rated game", "Win 7 Rated games during the Halloween season"};
        field_Kb = "Private";
        field_Pb = "No spectators";
    }
}
