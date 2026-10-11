/*
 * Decompiled by CFR-JS 0.4.0.
 */
class l implements cg, va {
    int field_b;
    private int field_i;
    int field_k;
    int field_a;
    static he[][] field_f;
    int field_m;
    static int field_q;
    int field_d;
    int field_o;
    private boolean field_r;
    static int[][] field_n;
    int field_j;
    int field_l;
    static String field_h;
    int field_c;
    static String[] field_e;
    int field_p;
    static String field_s;
    rf field_g;

    private final int a(int param0, int param1, vg param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 < 54) {
            this.field_a = 17;
          }
          stackIn_3_0 = param2.field_t + this.field_j + (param2.field_o + param0 + param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("l.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2, vg param3) {
        try {
          this.a(this.field_o, param0, 0, param2, (byte) -128, this.field_i, param1, param3);
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "l.H(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    l(rf param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    public final void a(int param0, int param1, int param2, vg param3, int param4, int param5) {
        int var12 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        mi var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        em var17 = null;
        em var18 = null;
        var16 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          if (param2 > -50) {
            return;
          }
          if (param0 == param5) {
            return;
          }
          if (param3.a(true)) {
            var17 = this.a(param3, true);
            var18 = var17;
            if (param0 <= param5) {
              var8 = param0;
              var9 = param5;
            } else {
              var8 = param5;
              var9 = param0;
            }
            var10 = var18.b(var8, -12280);
            var11 = var18.b(var9, -12280);
            ib.a(param1 + param3.field_m, param3.field_k + (param1 + param3.field_m), (byte) 118, param3.field_w + (param3.field_o + param4), param4 + param3.field_o);
            for (var12 = var10; var11 >= var12; var12++) {
              var13 = var17.field_a[var12];
              if (var12 != var10) {
                stackIn_14_0 = var13.field_a[0];
              } else {
                stackIn_14_0 = var18.a(89, var8);
              }
              var14 = stackIn_14_0;
              if (var11 == var12) {
                stackIn_19_0 = var18.a(-76, var9);
              } else {
                if (var13 != null) {
                  stackIn_19_0 = var13.field_a[var13.field_a.length - 1];
                } else {
                  stackIn_19_0 = 0;
                }
              }
              var15 = stackIn_19_0;
              ja.field_Q.a(false, this.field_b, -var14 + var15, this.field_b >>> 24, param3.field_q + this.field_d + (param3.field_m + param1) + var13.field_e, var13.field_b, this.a(param4, var14, param3, 123));
            }
            cl.d((byte) -68);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_24_0 = var7;
          stackIn_24_1 = new StringBuilder().append("l.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public final int a(byte param0) {
        if (param0 <= -114) {
          return this.field_g.field_x + this.field_g.field_S;
        }
        vg var3 = (vg) null;
        int discarded$0 = this.a(65, (vg) null, -54, (byte) -62);
        return this.field_g.field_x + this.field_g.field_S;
    }

    public final int a(int param0, vg param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.a(param1, true);
          if (param0 == 170) {
            stackIn_4_0 = param1.field_s.b(param0 + 19941) + (this.field_d + this.field_m);
            return stackIn_4_0;
          }
          stackIn_2_0 = 20;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("l.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public final int a(vg param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.a(param0, true);
          if (param4 != 3) {
            this.field_r = true;
          }
          stackIn_3_0 = param0.field_s.a(-this.a(param0, 1540021377, param1) + param5, param4 - 3, param3 - this.a(param0, param2, (byte) 60));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("l.Q(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final int a(int param0, vg param1, int param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = -58 % ((57 - param3) / 54);
          stackIn_1_0 = param1.field_q + (this.field_d + param2 - (-param1.field_m - param0));
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_4_0 = var5;
          stackIn_4_1 = new StringBuilder().append("l.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static boolean b(int param0) {
        if (param0 != -1) {
          l.a(-83);
          if (null == pi.field_V) {
            return false;
          }
          if (pi.field_V.a(-30292)) {
            return true;
          }
          return false;
        }
        if (null == pi.field_V) {
          return false;
        }
        if (pi.field_V.a(-30292)) {
          return true;
        }
        return false;
    }

    public void a(boolean param0, int param1, vg param2, int param3, int param4) {
        if (param1 < 94) {
          return;
        }
        if (this.field_g == null) {
          return;
        }
        try {
          this.a(param3, 0, param4, param2);
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "l.J(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final int a(vg param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -21 / ((-35 - param1) / 48);
          stackIn_1_0 = -this.field_k + (-this.field_j + param0.field_w);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("l.O(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    public final int a(byte param0, vg param1) {
        RuntimeException var3 = null;
        vg var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 48) {
            var4 = (vg) null;
            this.a(76, -76, 54, -23, (byte) -66, 2, -19, (vg) null);
          }
          this.a(param1, true);
          stackIn_3_0 = param1.field_s.a(param0 ^ -17335) + (this.field_j + this.field_k);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("l.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final em a(vg param0, boolean param1) {
        RuntimeException var3 = null;
        em stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == param0.field_s) {
            param0.field_s = (em) ((Object) new o());
          }
          if (!this.field_r) {
            this.b(param0, -2);
          } else {
            ((o) (param0.field_s)).a(this.field_g, this.a(param0, -83), this.field_p, -3, this.field_a, this.b(-121, param0), this.field_c, this.b((byte) -127, param0));
          }
          if (!param1) {
            l.b(13);
          }
          stackIn_9_0 = param0.field_s;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("l.T(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void b(vg param0, int param1) {
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        vg var8 = null;
        int var6Lifetime1;
        var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          if (param1 != -2) {
            var8 = (vg) null;
            this.a(95, -105, 14, 89, (byte) -60, 25, -3, (vg) null);
          }
          if (null == param0.field_s) {
            param0.field_s = (em) ((Object) new o());
          }
          var3_int = this.a(param0, -117);
          var4 = this.b((byte) -128, param0);
          var6 = this.field_c;
          if (0 != var6) {
            if (2 != var6) {
              if (var6 != 3 &&
                var6 != 1) {
              }
              var5 = (-this.field_g.field_S + var4 - this.field_g.field_x >> 1) + this.field_g.field_x;
            } else {
              var5 = -this.field_g.field_S + var4;
            }
          } else {
            var5 = this.field_g.field_x;
          }
          var6Lifetime1 = this.field_p;
          if (var6Lifetime1 != 0 &&
            var6Lifetime1 != 3) {
            if (var6Lifetime1 == 1) {
              if (param0.field_s instanceof o) {
                ((o) (param0.field_s)).a(this.field_g, var3_int >> 1, var5, this.b(-116, param0), false);
                return;
              }
            } else {
              if (var6Lifetime1 != 2) {
                return;
              }
              if (!(param0.field_s instanceof o)) {
                return;
              }
              ((o) (param0.field_s)).a(this.field_g, var3_int, false, var5, this.b(-108, param0));
            }
            return;
          }
          if (!(param0.field_s instanceof o)) {
            return;
          }
          ((o) (param0.field_s)).a(this.field_g, this.b(-120, param0), 0, var5, param1 ^ -2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_33_0 = var3;
          stackIn_33_1 = new StringBuilder().append("l.F(");
          if (param0 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2, int param3, byte param4, int param5, int param6, vg param7) {
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var12Lifetime1;
        var13 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          ib.a(param1 + param7.field_m, param7.field_m + param1 + param7.field_k, (byte) 29, param3 + param7.field_o + param7.field_w, param7.field_o + param3);
          var9_int = this.a(param7, 56);
          if (param4 != -128) {
            return;
          }
          boolean decompiledFrameRemainder0 = true;
          var10 = this.b((byte) -116, param7);
          if (!this.field_r) {
            var12 = this.field_c;
            if (var12 != 0) {
              if (var12 != 2) {
                if (3 != var12 &&
                  var12 == 1) {
                }
                var11 = this.field_g.field_x + (-this.field_g.field_S + (var10 - this.field_g.field_x) >> 1);
              } else {
                var11 = -this.field_g.field_S + var10;
              }
            } else {
              var11 = this.field_g.field_x;
            }
            var12Lifetime1 = this.field_p;
            if (0 != var12Lifetime1 &&
              3 != var12Lifetime1) {
              if (var12Lifetime1 == 1) {
                this.field_g.b(this.b(param4 + 5, param7), (var9_int >> 1) + this.a(param3, param6, param7, 75), var11 + this.a(param2, param7, param1, (byte) 121), param0, param5);
              } else {
                if ((var12Lifetime1 == 2)) {
                  this.field_g.a(this.b(-115, param7), this.a(param3, param6, param7, 84) + var9_int, this.a(param2, param7, param1, (byte) -118) + var11, param0, param5);
                }
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_g.c(this.b(param4 ^ 22, param7), this.a(param3, param6, param7, 87), this.a(param2, param7, param1, (byte) 125) + var11, param0, param5);
            }
          } else {
            this.field_g.a(this.b(-114, param7), this.a(param3, param6, param7, 99), this.a(param2, param7, param1, (byte) -81), var9_int, var10, param0, param5, this.field_p, this.field_c, this.field_a);
          }
          cl.d((byte) -80);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_31_0 = var9;
          stackIn_31_1 = new StringBuilder().append("l.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    public final int a(vg param0, int param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = 59 % ((-5 - param2) / 61);
          stackIn_1_0 = this.a(0, param0, param1, (byte) -36);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("l.K(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final int b(byte param0, vg param1) {
        RuntimeException var3 = null;
        vg var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -114) {
            var4 = (vg) null;
            this.a(-12, -1, (vg) null, -112, (byte) -125);
          }
          stackIn_3_0 = -this.field_d + param1.field_k - this.field_m;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("l.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void a(l param0, int param1) {
        try {
          int var3_int = 124 % ((15 - param1) / 39);
          param0.field_l = this.field_l;
          param0.field_d = this.field_d;
          param0.field_b = this.field_b;
          param0.field_i = this.field_i;
          param0.field_m = this.field_m;
          param0.field_r = this.field_r;
          param0.field_p = this.field_p;
          param0.field_a = this.field_a;
          param0.field_j = this.field_j;
          param0.field_g = this.field_g;
          param0.field_o = this.field_o;
          param0.field_c = this.field_c;
          param0.field_k = this.field_k;
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "l.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_s = null;
        field_f = (he[][]) null;
        field_h = null;
        field_n = (int[][]) null;
        field_e = null;
        if (param0 != 0) {
          field_n = (int[][]) null;
        }
    }

    protected l() {
    }

    public final int a(vg param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 1540021377) {
            this.field_d = -102;
          }
          stackIn_3_0 = this.a(param2, 0, param0, 117);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("l.U(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    l(rf param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        try {
          this.field_d = param3;
          this.field_j = param1;
          this.field_a = param9;
          this.field_c = param8;
          this.field_k = param2;
          this.field_i = param6;
          this.field_l = param10;
          this.field_m = param4;
          this.field_p = param7;
          this.field_g = param0;
          this.field_b = param11;
          this.field_o = param5;
          this.field_r = param12 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "l.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
    }

    public final void a(int param0, int param1, vg param2, int param3, byte param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        mi var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        em var13 = null;
        em var14 = null;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_5_3;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2.a(true)) {
            var13 = this.a(param2, true);
            var14 = var13;
            var7 = var14.b(param3, -12280);
            var8 = var13.field_a[var7];
            var9 = var14.a(-98, param3);
            var10 = this.a(param1, var9, param2, 107);
            var11 = this.a(param2, param0, (byte) -101) + Math.max(0, var8.field_e);
            stackIn_4_0 = this.a(param2, param0, (byte) 63);
            stackIn_4_1 = this.b((byte) -116, param2);
            stackIn_4_2 = var8.field_b;
            if (var14.field_a.length > var7 + 1) {
              stackIn_5_3 = var13.field_a[var7 + 1].field_e;
            } else {
              stackIn_5_3 = var8.field_b;
            }
            var12 = stackIn_4_0 + Math.min(stackIn_4_1, Math.min(stackIn_4_2, stackIn_5_3));
            ib.a(param0 + param2.field_m, param0 + param2.field_m + param2.field_k, (byte) 71, param2.field_w + param1 + param2.field_o, param2.field_o + param1);
            ja.field_Q.a((byte) 95, var12, var10, var10, this.field_l, var11);
            cl.d((byte) -116);
          }
          if (param4 == -90) {
            return;
          }
          field_f = (he[][]) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("l.S(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    String b(int param0, vg param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < -101) {
            stackIn_4_0 = param1.field_p;
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("l.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    static {
        field_q = -1;
        field_e = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
        field_f = new he[9][2];
        field_h = " buildings): ";
        field_n = new int[][]{new int[]{0, 170, 650, 1050, 1500, 1700, 1800, 1900}, new int[]{0}, new int[]{0}, new int[]{0, 600, 1400}, new int[]{0}, new int[]{0}, new int[]{0, 300, 900}, new int[]{0}, new int[]{0}};
        field_s = "Waiting for levels";
    }
}
