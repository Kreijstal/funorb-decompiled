/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wk {
    static String field_b;
    private int field_i;
    private boolean field_f;
    private int field_c;
    private int field_d;
    bi field_g;
    static String[] field_a;
    private int field_j;
    bi[] field_h;
    private int field_e;

    final wk a(bi[] param0, int param1) {
        RuntimeException var3 = null;
        wk stackIn_2_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_h = param0;
          if (param1 <= -62) {
            return this;
          }
          stackIn_2_0 = (wk) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("wk.D(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        int var1 = -11 % ((-6 - param0) / 63);
    }

    final static void a(boolean param0, boolean param1) {
        wa.a((byte) 109, param1, param0);
    }

    final wk a(byte param0, int param1) {
        if (param0 <= 47) {
          return (wk) null;
        }
        this.field_c = param1;
        return this;
    }

    final static boolean a(int param0, CharSequence param1, int param2, boolean param3) {
        int var9 = 0;
        int stackIn_42_0 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param0 >= 2 &&
            param0 <= 36) {
            var4_int = 0;
            var5 = 0;
            var6 = 0;
            var7 = param1.length();
            var8 = -2 % ((param2 - 69) / 57);
            for (var9 = 0; var9 < var7; var9++) {
              boolean decompiledFrameRemainder0 = true;
              var10 = param1.charAt(var9);
              if ((var9 == 0) &&
                (var10 == 45)) {
                var4_int = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (var9 != 0 || (var10 != 43 ||
                !param3))) {
                if (var10 >= 48 &&
                  var10 <= 57) {
                  var10 -= 48;
                } else if (65 <= var10 &&
                  var10 <= 90) {
                  var10 -= 55;
                } else {
                  if (var10 < 97) {
                    return false;
                  }
                  if (122 < var10) {
                    return false;
                  }
                  var10 -= 87;
                }
                if (param0 <= var10) {
                  return false;
                }
                if (var4_int != 0) {
                  var10 = -var10;
                }
                var11 = var6 * param0 + var10;
                if (var11 / param0 != var6) {
                  return false;
                }
                var6 = var11;
                var5 = 1;
              }
            }
            stackIn_42_0 = var5;
            return stackIn_42_0 != 0;
          }
          throw new IllegalArgumentException("" + param0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_45_0 = var4;
          stackIn_45_1 = new StringBuilder().append("wk.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final wk a(int param0, boolean param1) {
        if (param1) {
          this.field_e = 102;
        }
        this.field_j = param0;
        return this;
    }

    final static int a(int param0, String param1, nq param2, int[] param3) {
        ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        try {
          if (rm.field_g == null) {
            rm.field_g = new String[32];
          }
          do {
            try {
              var4_int = param2.a(param1, param3, rm.field_g);
              decompiledRegionSelector0 = 0;
            } catch (java.lang.ArrayIndexOutOfBoundsException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              arrayIndexOutOfBoundsException = (ArrayIndexOutOfBoundsException) (Object) decompiledCaughtException;
              if (rm.field_g.length >= 1024) {
                stackIn_6_0 = -1;
                return stackIn_6_0;
              }
              rm.field_g = new String[rm.field_g.length << 1];
              decompiledRegionSelector0 = 1;
            }
          } while (decompiledRegionSelector0 != 0);
          if (param0 == -9615) {
            stackIn_12_0 = var4_int;
            return stackIn_12_0;
          }
          stackIn_10_0 = 47;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var4 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("wk.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final void a(vg param0, wk param1, gn param2, int param3, int param4, int param5) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          if (this.field_f) {
            param1.a(param3, true, param0, param5, param2);
            param1.a(false);
          }
          if (null != this.field_g) {
            param1.field_g = this.field_g;
          }
          if (~this.field_e <= param4) {
            param1.field_e = this.field_e;
          }
          if (this.field_h != null) {
            param1.field_h = this.field_h;
          }
          if (this.field_c >= -1) {
            param1.field_c = this.field_c;
          }
          if (-2147483648 != this.field_i) {
            param1.field_i = this.field_i;
          }
          if (-2147483648 != this.field_j) {
            param1.field_j = this.field_j;
          }
          if (-2147483648 != this.field_d) {
            param1.field_d = this.field_d;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_24_0 = var7;
          stackIn_24_1 = new StringBuilder().append("wk.J(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param2 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final void a(boolean param0) {
        this.field_h = null;
        if (param0) {
          this.a(15, true);
        }
        this.field_c = 0;
        this.field_g = null;
        this.field_e = -1;
        this.field_i = 0;
        this.field_j = 0;
        this.field_d = 256;
    }

    final void a(byte param0, wk param1) {
        try {
          param1.field_j = this.field_j;
          param1.field_h = this.field_h;
          param1.field_d = this.field_d;
          param1.field_g = this.field_g;
          param1.field_f = this.field_f;
          param1.field_e = this.field_e;
          if (param0 <= 39) {
            this.field_i = 24;
          }
          param1.field_i = this.field_i;
          param1.field_c = this.field_c;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "wk.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0, java.awt.Component param1) {
        param1.addMouseListener(pd.field_j);
        if (param0 != -58) {
          return;
        }
        try {
          param1.addMouseMotionListener(pd.field_j);
          param1.addFocusListener(pd.field_j);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "wk.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final wk a(boolean param0, int param1) {
        if (param1 != -28639) {
          this.field_h = (bi[]) null;
        }
        this.field_f = param0 ? true : false;
        return this;
    }

    final wk a(int param0, int param1) {
        this.field_e = param0;
        if (param1 != 1) {
          gn var4 = (gn) null;
          this.a(-68, false, (vg) null, 40, (gn) null);
        }
        return this;
    }

    final void a(int param0, boolean param1, vg param2, int param3, gn param4) {
        nq stackIn_21_0 = null;
        String stackIn_21_1 = null;
        int stackIn_22_2 = 0;
        int stackIn_24_2;
        int stackIn_24_3;
        int stackIn_24_4;
        int stackIn_24_5;
        int stackIn_25_6 = 0;
        int stackIn_27_3;
        int stackIn_27_4;
        int stackIn_27_5;
        int stackIn_27_6;
        int stackIn_27_7;
        int stackIn_28_8;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        String var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        try {
          em.a(param2.field_n, param2.field_x, 7, param2.field_q + param3, this.field_h, param2.field_m + param0);
          if (null != this.field_g) {
            var6_int = param0 + (param2.field_m + this.field_i);
            if (param4.field_r == 1) {
              var6_int = var6_int + (-this.field_g.field_o + param2.field_x) / 2;
            }
            var7 = param2.field_q + param3 + this.field_j;
            if (2 == param4.field_r) {
              var6_int = var6_int + (-this.field_g.field_o + param2.field_x);
            }
            if (param4.field_l == 1) {
              var7 = var7 + (-this.field_g.field_p + param2.field_n) / 2;
            }
            if (2 == param4.field_l) {
              var7 = var7 + (param2.field_n - this.field_g.field_p);
            }
            this.field_g.f(var6_int, var7);
          }
          if (!param1) {
            return;
          }
          var6 = param4.b(param1, param2);
          if (var6 != null &&
            param4.field_c != null &&
            this.field_c >= 0) {
            stackIn_21_0 = param4.field_c;
            stackIn_21_1 = var6;
            if (this.field_i == -2147483648) {
              stackIn_22_2 = 0;
            } else {
              stackIn_22_2 = this.field_i;
            }
            stackIn_24_2 = stackIn_22_2 + (param4.field_o + param0) + param2.field_m;
            stackIn_24_3 = param3;
            stackIn_24_4 = -param2.field_q;
            stackIn_24_5 = -param4.field_b;
            if (this.field_j == -2147483648) {
              stackIn_25_6 = 0;
            } else {
              stackIn_25_6 = this.field_j;
            }
            stackIn_27_3 = stackIn_24_3 - (stackIn_24_4 + (stackIn_24_5 - stackIn_25_6));
            stackIn_27_4 = -param4.field_g + (param2.field_x - param4.field_o);
            stackIn_27_5 = param2.field_n - param4.field_b - param4.field_f;
            stackIn_27_6 = this.field_c;
            stackIn_27_7 = this.field_e;
            if (this.field_d == -2147483648) {
              stackIn_28_8 = 256;
            } else {
              stackIn_28_8 = this.field_d;
            }
            ((nq) (Object) stackIn_21_0).a(stackIn_21_1, stackIn_24_2, stackIn_27_3, stackIn_27_4, stackIn_27_5, stackIn_27_6, stackIn_27_7, stackIn_28_8, param4.field_r, param4.field_l, param4.field_j);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_32_0 = var6_ref;
          stackIn_32_1 = new StringBuilder().append("wk.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(')').toString());
        }
    }

    final wk a(int param0, byte param1) {
        this.field_i = param0;
        if (param1 <= 86) {
          this.field_f = true;
        }
        return this;
    }

    wk() {
        this.field_c = -2;
        this.field_j = -2147483648;
        this.field_f = false;
        this.field_d = -2147483648;
        this.field_i = -2147483648;
        this.field_g = null;
        this.field_e = -2;
        this.field_h = null;
    }

    static {
        field_b = "Ignore";
        field_a = new String[]{"(Old) Standard", "(Old) Cautious", "Tutorial", "Standard", "Aggressive", "Reckless", "Isolationist", "Defensive", "Task"};
    }
}
