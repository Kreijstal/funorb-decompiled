/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld {
    private gn field_a;
    private gn field_g;
    static String field_f;
    static gn field_c;
    static int field_b;
    private og field_d;
    private og field_e;

    public static void a(int param0) {
        field_c = null;
        int var1 = 99 / ((param0 - 4) / 49);
        field_f = null;
    }

    private final el a(int param0, int[] param1, String param2) {
        RuntimeException var4 = null;
        el stackIn_4_0 = null;
        el stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -1610608641) {
            ld.a(64);
          }
          if (!this.field_a.a("", true)) {
            stackIn_6_0 = this.a(param2, param1, param0 ^ -1610592021, "");
            return stackIn_6_0;
          }
          stackIn_4_0 = this.a("", param1, 24340, param2);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("ld.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static int a(byte param0, int param1) {
        int var2;
        int var2Lifetime1;
        int var2Lifetime2;
        if (param1 == 0) {
          return 0;
        }
        if (param0 <= -65) {
          if (param1 > 0) {
            var2 = 1;
            if (param1 > 65535) {
              var2 += 16;
              param1 = param1 >> 16;
            }
            if (255 < param1) {
              var2 += 8;
              param1 = param1 >> 8;
            }
            if (15 < param1) {
              var2 += 4;
              param1 = param1 >> 4;
            }
            if (3 < param1) {
              param1 = param1 >> 2;
              var2 += 2;
            }
            if (param1 > 1) {
              param1 = param1 >> 1;
              var2++;
            }
            return var2;
          }
          var2Lifetime2 = 2;
          if (param1 < -65536) {
            var2Lifetime2 += 16;
            param1 = param1 >> 16;
          }
          if (param1 < -256) {
            param1 = param1 >> 8;
            var2Lifetime2 += 8;
          }
          if (param1 < -16) {
            param1 = param1 >> 4;
            var2Lifetime2 += 4;
          }
          if (param1 < -4) {
            param1 = param1 >> 2;
            var2Lifetime2 += 2;
          }
          if (-2 > param1) {
            var2Lifetime2++;
            param1 = param1 >> 1;
          }
          return var2Lifetime2;
        }
        field_f = (String) null;
        if (param1 > 0) {
          var2Lifetime1 = 1;
          if (param1 > 65535) {
            var2Lifetime1 += 16;
            param1 = param1 >> 16;
          }
          if (255 < param1) {
            var2Lifetime1 += 8;
            param1 = param1 >> 8;
          }
          if (15 < param1) {
            var2Lifetime1 += 4;
            param1 = param1 >> 4;
          }
          if (3 < param1) {
            param1 = param1 >> 2;
            var2Lifetime1 += 2;
          }
          if (param1 > 1) {
            param1 = param1 >> 1;
            var2Lifetime1++;
          }
        } else {
          var2Lifetime1 = 2;
          if (param1 < -65536) {
            var2Lifetime1 += 16;
            param1 = param1 >> 16;
          }
          if (param1 < -256) {
            param1 = param1 >> 8;
            var2Lifetime1 += 8;
          }
          if (param1 < -16) {
            param1 = param1 >> 4;
            var2Lifetime1 += 4;
          }
          if (param1 < -4) {
            param1 = param1 >> 2;
            var2Lifetime1 += 2;
          }
          if (-2 > param1) {
            var2Lifetime1++;
            param1 = param1 >> 1;
          }
        }
        return var2Lifetime1;
    }

    private final el a(int[] param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        el var8 = null;
        pm var9 = null;
        el var10 = null;
        el stackIn_2_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_9_0 = null;
        el stackIn_12_0 = null;
        el stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        el var8Lifetime1;
        try {
          var5_int = (param3 >>> 12 | (param3 & -1610608641) << 4) ^ param1;
          var5_int = var5_int | param3 << 16;
          var6 = (long)var5_int;
          var8 = (el) (this.field_e.a((byte) 114, var6));
          if (var8 != null) {
            stackIn_2_0 = var8;
            return stackIn_2_0;
          }
          if (param0 != null &&
            param0[0] <= 0) {
            stackIn_6_0 = null;
            return (el) (stackIn_6_0);
          }
          var9 = pm.a(this.field_a, param3, param1);
          if (var9 == null) {
            stackIn_9_0 = null;
            return (el) (stackIn_9_0);
          }
          var10 = var9.b();
          var8Lifetime1 = var10;
          this.field_e.a(var8Lifetime1, var6, false);
          if (param2 != -14322) {
            stackIn_12_0 = (el) null;
            return stackIn_12_0;
          }
          if (param0 != null) {
            param0[0] = param0[0] - var10.field_n.length;
          }
          stackIn_17_0 = var8Lifetime1;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("ld.E(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final el a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        el stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -124 / ((-61 - param1) / 62);
          stackIn_1_0 = this.a(-1610608641, (int[]) null, param0);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("ld.C(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    final el a(int[] param0, int param1, byte param2) {
        RuntimeException var4 = null;
        CharSequence var5 = null;
        el stackIn_3_0 = null;
        el stackIn_8_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_g.b(-1) == 1) {
            stackIn_3_0 = this.a(param1, param0, 0, 0);
            return stackIn_3_0;
          }
          if (param2 != 115) {
            var5 = (CharSequence) null;
            ld.a(false, true, (CharSequence) null);
          }
          if (1 != this.field_g.a((byte) 120, param1)) {
            throw new RuntimeException();
          }
          stackIn_8_0 = this.a(0, param0, 0, param1);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("ld.D(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final el a(int param0, String param1) {
        RuntimeException var3 = null;
        el stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -32660) {
            ld.a(49);
          }
          stackIn_3_0 = this.a((int[]) null, param1, -343045972);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ld.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final el a(int param0, byte param1, int[] param2) {
        RuntimeException var4 = null;
        el stackIn_2_0 = null;
        el stackIn_6_0 = null;
        el stackIn_9_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_a.b(-1) == 1) {
            stackIn_2_0 = this.a(param2, param0, -14322, 0);
            return stackIn_2_0;
          }
          if (this.field_a.a((byte) 125, param0) == 1) {
            stackIn_6_0 = this.a(param2, 0, -14322, param0);
            return stackIn_6_0;
          }
          if (param1 >= 91) {
            throw new RuntimeException();
          }
          stackIn_9_0 = (el) null;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("ld.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final el a(int[] param0, String param1, int param2) {
        RuntimeException var4 = null;
        int[] var5 = null;
        el stackIn_2_0 = null;
        el stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_g.a("", true)) {
            stackIn_2_0 = this.a(param1, param0, (byte) 104, "");
            return stackIn_2_0;
          }
          if (param2 != -343045972) {
            var5 = (int[]) null;
            this.a(124, (byte) 87, (int[]) null);
          }
          stackIn_6_0 = this.a("", param0, (byte) 104, param1);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("ld.B(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(')').toString());
        }
    }

    private final el a(String param0, int[] param1, int param2, String param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        el stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = this.field_a.c(param0, param2 - 24337);
          if (var5_int < 0) {
            return null;
          }
          var6 = this.field_a.a(var5_int, param3, false);
          if (var6 < 0) {
            return null;
          }
          if (param2 != 24340) {
            field_b = 100;
          }
          stackIn_9_0 = this.a(param1, var6, param2 ^ -26854, var5_int);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("ld.J(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    private final el a(String param0, int[] param1, byte param2, String param3) {
        el discarded$1 = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        el stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 104) {
            var7 = (String) null;
            discarded$1 = this.a((String) null, (int[]) null, (byte) -52, (String) null);
          }
          var5_int = this.field_g.c(param3, 3);
          if (0 > var5_int) {
            return null;
          }
          var6 = this.field_g.a(var5_int, param0, false);
          if (var6 < 0) {
            return null;
          }
          stackIn_9_0 = this.a(var6, param1, param2 - 104, var5_int);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("ld.F(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final static String a(boolean param0, boolean param1, CharSequence param2) {
        int var6 = 0;
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        String stackIn_16_0 = null;
        String stackIn_21_0 = null;
        String stackIn_31_0 = null;
        String stackIn_36_0 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = HoldTheLine.field_D;
        try {
          if (param2 == null) {
            stackIn_4_0 = ao.field_e;
            return stackIn_4_0;
          }
          var3_int = param2.length();
          if (1 <= var3_int &&
            var3_int <= 12) {
            if (param0) {
              ld.a(18);
            }
            var4 = kf.a(param2, (byte) -98);
            if (var4 != null &&
              var4.length() >= 1) {
              if (!ag.a(-2821, var4.charAt(0)) &&
                !ag.a(-2821, var4.charAt(-1 + var4.length()))) {
                var5 = 0;
                for (var6 = 0; param2.length() > var6; var6++) {
                  var7 = param2.charAt(var6);
                  if (ag.a(-2821, (char) var7)) {
                    var5++;
                  } else {
                    var5 = 0;
                  }
                  if (var5 >= 2 &&
                    !param1) {
                    stackIn_31_0 = kd.field_a;
                    return stackIn_31_0;
                  }
                }
                if (0 >= var5) {
                  return null;
                }
                stackIn_36_0 = mj.field_b;
                return stackIn_36_0;
              }
              stackIn_21_0 = mj.field_b;
              return stackIn_21_0;
            }
            stackIn_16_0 = ao.field_e;
            return stackIn_16_0;
          }
          stackIn_9_0 = ao.field_e;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_40_0 = var3;
          stackIn_40_1 = new StringBuilder().append("ld.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(')').toString());
        }
    }

    private final el a(int param0, int[] param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        el var8 = null;
        sn var9 = null;
        el stackIn_2_0 = null;
        Object stackIn_15_0 = null;
        el stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        el var8Lifetime1;
        try {
          var5_int = param0 ^ (param3 >>> 12 | 65531 & param3 << 4);
          var5_int = var5_int | param3 << 16;
          var6 = 4294967296L ^ (long)var5_int;
          var8 = (el) (this.field_e.a((byte) 121, var6));
          if (var8 != null) {
            stackIn_2_0 = var8;
            return stackIn_2_0;
          }
          if (param1 != null &&
            param1[0] <= 0) {
            return null;
          }
          var9 = (sn) (this.field_d.a((byte) 120, var6));
          if (var9 == null) {
            var9 = sn.a(this.field_g, param3, param0);
            if (var9 == null) {
              return null;
            }
            this.field_d.a(var9, var6, false);
          }
          var8Lifetime1 = var9.a(param1);
          if (var8Lifetime1 == null) {
            stackIn_15_0 = null;
            return (el) (stackIn_15_0);
          }
          var9.d(param2);
          this.field_e.a(var8Lifetime1, var6, false);
          stackIn_17_0 = var8Lifetime1;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("ld.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    ld(gn param0, gn param1) {
        this.field_d = new og(256);
        this.field_e = new og(256);
        try {
          this.field_g = param1;
          this.field_a = param0;
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "ld.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_f = "Log in/Register";
        field_b = -1;
    }
}
