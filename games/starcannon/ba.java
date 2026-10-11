/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ba {
    static String field_a;
    static hl field_c;
    private rk field_d;
    private rf field_b;
    static String field_e;

    final rf a(rf param0, int param1) {
        rf var3 = null;
        RuntimeException var3_ref = null;
        rf var4 = null;
        Object stackIn_7_0 = null;
        rf stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            var4 = (rf) null;
            this.a(-43, (rf) null);
          }
          if (param0 != null) {
            var3 = param0;
          } else {
            var3 = this.field_d.field_c.field_a;
          }
          if (var3 != this.field_d.field_c) {
            this.field_b = var3.field_a;
            stackIn_9_0 = var3;
            return stackIn_9_0;
          }
          this.field_b = null;
          stackIn_7_0 = null;
          return (rf) (stackIn_7_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("ba.H(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final rf a(boolean param0) {
        rf var2 = this.field_d.field_c.field_d;
        if (param0) {
          ba.a(true, false, 62);
        }
        if (var2 == this.field_d.field_c) {
          this.field_b = null;
          return null;
        }
        this.field_b = var2.field_d;
        return var2;
    }

    final rf a(int param0) {
        if (param0 != 0) {
          return (rf) null;
        }
        rf var2 = this.field_d.field_c.field_a;
        if (var2 != this.field_d.field_c) {
          this.field_b = var2.field_a;
          return var2;
        }
        this.field_b = null;
        return null;
    }

    final static void a(boolean param0, boolean param1, int param2) {
        if (param2 != 2) {
          return;
        }
        String var4 = (String) null;
        ae.a((String) null, param1, 0, param0);
    }

    final static boolean a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 6) {
            field_a = (String) null;
          }
          stackIn_3_0 = we.a((byte) -108, param1, true, 10);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ba.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final rf a(byte param0) {
        rf var2 = this.field_b;
        if (param0 != -34) {
          field_a = (String) null;
        }
        if (var2 == this.field_d.field_c) {
          this.field_b = null;
          return null;
        }
        this.field_b = var2.field_d;
        return var2;
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    public static void c(int param0) {
        field_a = null;
        if (param0 < 118) {
          return;
        }
        field_e = null;
        field_c = null;
    }

    final rf a(int param0, rf param1) {
        rf var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_8_0 = null;
        rf stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            var3 = this.field_d.field_c.field_d;
          } else {
            var3 = param1;
          }
          if (param0 != 0) {
            this.field_b = (rf) null;
          }
          if (var3 == this.field_d.field_c) {
            this.field_b = null;
            stackIn_8_0 = null;
            return (rf) (stackIn_8_0);
          }
          this.field_b = var3.field_d;
          stackIn_10_0 = var3;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("ba.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    ba(rk param0) {
        try {
          this.field_d = param0;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "ba.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, hl[] param1, byte param2, int param3, int param4, int param5) {
        int var22 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_76_2 = null;
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
        var23 = StarCannon.field_A;
        try {
          if (param1 == null) {
            return;
          }
          if (0 < param4 &&
            0 < param0) {
            if (null != param1[3]) {
              stackIn_10_0 = param1[3].field_x;
            } else {
              stackIn_10_0 = 0;
            }
            var6_int = stackIn_10_0;
            if (null != param1[5]) {
              stackIn_13_0 = param1[5].field_x;
            } else {
              stackIn_13_0 = 0;
            }
            var7 = stackIn_13_0;
            if (null == param1[1]) {
              stackIn_16_0 = 0;
            } else {
              stackIn_16_0 = param1[1].field_q;
            }
            var8 = stackIn_16_0;
            if (null != param1[7]) {
              stackIn_19_0 = param1[7].field_q;
            } else {
              stackIn_19_0 = 0;
            }
            var9 = stackIn_19_0;
            var10 = param4 + param3;
            var11 = param0 + param5;
            var14 = 13 / ((param2 + 51) / 57);
            var12 = param3 + var6_int;
            var13 = var10 - var7;
            var15 = param5 + var8;
            var16 = var11 - var9;
            var17 = var12;
            var18 = var13;
            if (var17 > var18) {
              var18 = param3 + var6_int * param4 / (var7 + var6_int);
              var17 = param3 + var6_int * param4 / (var7 + var6_int);
            }
            var19 = var15;
            var20 = var16;
            ki.a(pk.field_d);
            if (var19 > var20) {
              var20 = param0 * var8 / (var8 + var9) + param5;
              var19 = param0 * var8 / (var8 + var9) + param5;
            }
            if (null != param1[0]) {
              ki.c(param3, param5, var17, var19);
              param1[0].e(param3, param5);
              ki.b(pk.field_d);
            }
            if (null != param1[2]) {
              ki.c(var18, param5, var10, var19);
              param1[2].e(var13, param5);
              ki.b(pk.field_d);
            }
            if (param1[6] != null) {
              ki.c(param3, var20, var17, var11);
              param1[6].e(param3, var16);
              ki.b(pk.field_d);
            }
            if (null != param1[8]) {
              ki.c(var18, var20, var10, var11);
              param1[8].e(var13, var16);
              ki.b(pk.field_d);
            }
            if (param1[1] != null &&
              param1[1].field_x != 0) {
              ki.c(var17, param5, var18, var19);
              for (var21 = var12; var13 > var21; var21 = var21 + param1[1].field_x) {
                param1[1].e(var21, param5);
              }
              ki.b(pk.field_d);
            }
            if (null != param1[7] &&
              param1[7].field_x != 0) {
              ki.c(var17, var20, var18, var11);
              for (var21Lifetime1 = var12; var13 > var21Lifetime1; var21Lifetime1 = var21Lifetime1 + param1[7].field_x) {
                param1[7].e(var21Lifetime1, var16);
              }
              ki.b(pk.field_d);
            }
            if (null != param1[3] &&
              param1[3].field_q != 0) {
              ki.c(param3, var19, var17, var20);
              for (var21Lifetime2 = var15; var16 > var21Lifetime2; var21Lifetime2 = var21Lifetime2 + param1[3].field_q) {
                param1[3].e(param3, var21Lifetime2);
              }
              ki.b(pk.field_d);
            }
            if (param1[5] != null &&
              0 != param1[5].field_q) {
              ki.c(var18, var19, var10, var20);
              for (var21Lifetime3 = var15; var16 > var21Lifetime3; var21Lifetime3 = var21Lifetime3 + param1[5].field_q) {
                param1[5].e(var13, var21Lifetime3);
              }
              ki.b(pk.field_d);
            }
            if (param1[4] != null &&
              param1[4].field_x != 0) {
              if (param1[4].field_q == 0) {
                return;
              }
              ki.c(var17, var19, var18, var20);
              for (var21Lifetime4 = var15; var21Lifetime4 < var16; var21Lifetime4 = var21Lifetime4 + param1[4].field_q) {
                for (var22 = var12; var22 < var13; var22 = var22 + param1[4].field_x) {
                  param1[4].e(var22, var21Lifetime4);
                }
              }
              ki.b(pk.field_d);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_75_0 = var6;
          stackIn_75_1 = new StringBuilder().append("ba.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_75_0), ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final rf b(int param0) {
        if (param0 <= 64) {
          this.a(56);
        }
        rf var2 = this.field_b;
        if (this.field_d.field_c == var2) {
          this.field_b = null;
          return null;
        }
        this.field_b = var2.field_a;
        return var2;
    }

    static {
        field_a = "Please wait...";
    }
}
