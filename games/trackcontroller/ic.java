/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ic implements t, dl {
    int field_d;
    private boolean field_a;
    int field_f;
    static String field_g;
    int field_j;
    oh field_k;
    int field_e;
    int field_l;
    private int field_m;
    int field_c;
    int field_b;
    int field_n;
    int field_h;
    int field_i;

    public static void b(byte param0) {
        if (param0 >= -29) {
          field_g = (String) null;
        }
        field_g = null;
    }

    public final int a(int param0, al param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 0) {
            this.field_c = -91;
          }
          stackIn_3_0 = this.a(0, param0, param1, (byte) -128);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("ic.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    ic(oh param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    public final rb a(byte param0, al param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        rb stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -22 / ((param0 - 11) / 50);
          if (param1.field_k == null) {
            param1.field_k = (rb) ((Object) new cj());
          }
          if (!this.field_a) {
            this.b((byte) 116, param1);
          } else {
            ((cj) (param1.field_k)).a(this.field_k, 64, this.field_f, this.b(17910, param1), this.field_n, this.a(param1, 112), this.c((byte) 106, param1), this.field_l);
          }
          stackIn_7_0 = param1.field_k;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ic.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static boolean a(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != 1) {
          return false;
        }
        stackIn_6_0 = (rl.field_N >= 10) && (13 <= gl.field_I);
        return stackIn_6_0;
    }

    final void a(int param0, ic param1) {
        try {
          if (param0 != -19397) {
            al var4 = (al) null;
            this.a(true, (al) null);
          }
          param1.field_i = this.field_i;
          param1.field_a = this.field_a;
          param1.field_n = this.field_n;
          param1.field_d = this.field_d;
          param1.field_m = this.field_m;
          param1.field_k = this.field_k;
          param1.field_h = this.field_h;
          param1.field_l = this.field_l;
          param1.field_b = this.field_b;
          param1.field_c = this.field_c;
          param1.field_e = this.field_e;
          param1.field_j = this.field_j;
          param1.field_f = this.field_f;
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "ic.GA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final int a(al param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = -32 % ((50 - param1) / 39);
          stackIn_1_0 = this.a(param2, 0, param0, -110);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("ic.D(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public final int a(int param0, int param1, int param2, int param3, int param4, al param5) {
        int var7_int = 0;
        RuntimeException var7 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7_int = -126 / ((18 - param2) / 61);
          this.a((byte) -116, param5);
          stackIn_1_0 = param5.field_k.a(param1 - this.a(param4, param5, 0), false, param3 - this.a(param5, 122, param0));
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_4_0 = var7;
          stackIn_4_1 = new StringBuilder().append("ic.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    public final int a(int param0, al param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.a((byte) 72, param1);
          if (param0 >= 82) {
            stackIn_4_0 = param1.field_k.a(12323) + this.field_h + this.field_d;
            return stackIn_4_0;
          }
          stackIn_2_0 = 94;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ic.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public final int a(byte param0) {
        if (param0 != 46) {
          return -9;
        }
        return this.field_k.field_u + this.field_k.field_G;
    }

    private final void b(byte param0, al param1) {
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var6Lifetime1;
        var7 = TrackController.field_F ? 1 : 0;
        try {
          if (null == param1.field_k) {
            param1.field_k = (rb) ((Object) new cj());
          }
          var3_int = this.a(param1, 107);
          var4 = this.b(17910, param1);
          if (param0 < 112) {
            this.field_d = -71;
          }
          var6 = this.field_l;
          if (var6 != 0) {
            if (var6 != 2) {
              if (var6 != 3 &&
                1 != var6) {
              }
              var5 = this.field_k.field_G + (-this.field_k.field_G + var4 - this.field_k.field_u >> 1);
            } else {
              var5 = var4 - this.field_k.field_u;
            }
          } else {
            var5 = this.field_k.field_G;
          }
          var6Lifetime1 = this.field_f;
          if (0 != var6Lifetime1 &&
            3 != var6Lifetime1) {
            if (var6Lifetime1 == 1) {
              if (!(param1.field_k instanceof cj)) {
                return;
              }
              ((cj) (param1.field_k)).a(113, this.field_k, this.c((byte) 78, param1), var5, var3_int >> 1);
              return;
            }
            if (var6Lifetime1 != 2) {
              return;
            }
            if (!(param1.field_k instanceof cj)) {
              return;
            }
            ((cj) (param1.field_k)).a(-19121, this.c((byte) 78, param1), var5, this.field_k, var3_int);
            return;
          }
          if (param1.field_k instanceof cj) {
            ((cj) (param1.field_k)).a(1888, var5, this.field_k, 0, this.c((byte) 67, param1));
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_34_0 = var3;
          stackIn_34_1 = new StringBuilder().append("ic.U(").append(param0).append(',');
          if (param1 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(')').toString());
        }
    }

    String c(byte param0, al param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= 49) {
            stackIn_4_0 = param1.field_s;
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ic.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    private final void a(byte param0, int param1, al param2, int param3) {
        try {
          this.a(param2, this.field_m, 0, 0, param3, param1, (byte) -114, this.field_i);
          if (param0 >= -37) {
            al var6 = (al) null;
            this.a((al) null, 74);
          }
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "ic.AA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    private final int a(int param0, int param1, al param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = -125 % ((param3 + 22) / 57);
          stackIn_1_0 = this.field_h + (param0 + param2.field_m) + (param2.field_A + param1);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_4_0 = var5;
          stackIn_4_1 = new StringBuilder().append("ic.EA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param3).append(')').toString());
        }
    }

    public void a(int param0, al param1, int param2, boolean param3, int param4) {
        if (param0 != -24969) {
          this.field_e = 120;
        }
        if (this.field_k == null) {
          return;
        }
        try {
          this.a((byte) -110, param2, param1, param4);
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "ic.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final int a(boolean param0, al param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            this.field_l = 99;
          }
          this.a((byte) -51, param1);
          stackIn_3_0 = param1.field_k.c(-1) + this.field_e + this.field_b;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ic.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final void b(int param0, int param1, int param2, int param3, int param4, al param5) {
        int var12 = 0;
        int stackIn_15_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        va var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        rb var17 = null;
        rb var18 = null;
        var16 = TrackController.field_F ? 1 : 0;
        try {
          if (param3 > -36) {
            this.field_l = -49;
          }
          if (param2 == param4) {
            return;
          }
          if (param5.h(-123)) {
            var17 = this.a((byte) -106, param5);
            var18 = var17;
            if (param2 <= param4) {
              var8 = param2;
              var9 = param4;
            } else {
              var9 = param2;
              var8 = param4;
            }
            var10 = var18.a(var8, (byte) -36);
            var11 = var18.a(var9, (byte) -36);
            mb.a(param0 + param5.field_p, param5.field_m + param1, param5.field_u + (param5.field_m + param1), (byte) -84, param0 + param5.field_p + param5.field_x);
            for (var12 = var10; var12 <= var11; var12++) {
              var13 = var17.field_b[var12];
              if (var10 != var12) {
                stackIn_15_0 = var13.field_b[0];
              } else {
                stackIn_15_0 = var18.a((byte) 111, var8);
              }
              var14 = stackIn_15_0;
              if (var11 != var12) {
                if (var13 != null) {
                  stackIn_20_0 = var13.field_b[-1 + var13.field_b.length];
                } else {
                  stackIn_20_0 = 0;
                }
              } else {
                stackIn_20_0 = var18.a((byte) 111, var9);
              }
              var15 = stackIn_20_0;
              lb.field_O.a(var13.field_c + this.field_h + param1 - (-param5.field_m - param5.field_A), 10066329, -var14 + var15, this.field_j >>> 24, this.field_j, var13.field_f, this.a(var14, param0, param5, (byte) -33));
            }
            ch.m(-85);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_25_0 = var7;
          stackIn_25_1 = new StringBuilder().append("ic.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    private final int a(int param0, int param1, al param2, byte param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 > -24) {
            this.field_h = 5;
          }
          stackIn_3_0 = this.field_e + param2.field_p + (param1 + param2.field_o + param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("ic.FA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(al param0, int param1, int param2, int param3, int param4, int param5, byte param6, int param7) {
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var12Lifetime1;
        var13 = TrackController.field_F ? 1 : 0;
        try {
          boolean decompiledFrameRemainder0 = true;
          mb.a(param0.field_p + param4, param0.field_m + param5, param0.field_u + param0.field_m + param5, (byte) -64, param4 + param0.field_p + param0.field_x);
          var9_int = this.a(param0, 103);
          var10 = this.b(17910, param0);
          if (!this.field_a) {
            var12 = this.field_l;
            if (var12 != 0) {
              if (var12 != 2) {
                if (var12 != 3 &&
                  var12 == 1) {
                }
                var11 = this.field_k.field_G + (-this.field_k.field_G + var10 - this.field_k.field_u >> 1);
              } else {
                var11 = var10 - this.field_k.field_u;
              }
            } else {
              var11 = this.field_k.field_G;
            }
            var12Lifetime1 = this.field_f;
            if (var12Lifetime1 != 0 &&
              3 != var12Lifetime1) {
              if (var12Lifetime1 == 1) {
                this.field_k.b(this.c((byte) 100, param0), this.a(param3, param4, param0, (byte) -66) + (var9_int >> 1), this.a(param5, param2, param0, 78) + var11, param7, param1);
              } else {
                if ((var12Lifetime1 == 2)) {
                  this.field_k.a(this.c((byte) 118, param0), var9_int + this.a(param3, param4, param0, (byte) -125), this.a(param5, param2, param0, 124) + var11, param7, param1);
                }
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_k.c(this.c((byte) 95, param0), this.a(param3, param4, param0, (byte) -112), var11 + this.a(param5, param2, param0, 123), param7, param1);
            }
          } else {
            this.field_k.a(this.c((byte) 86, param0), this.a(param3, param4, param0, (byte) -45), this.a(param5, param2, param0, 37), var9_int, var10, param7, param1, this.field_f, this.field_l, this.field_n);
          }
          if (param6 != -114) {
            return;
          }
          ch.m(67);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_29_0 = var9;
          stackIn_29_1 = new StringBuilder().append("ic.DA(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    private final int b(int param0, al param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 17910) {
            this.field_e = -68;
          }
          stackIn_3_0 = -this.field_d + (param1.field_u - this.field_h);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ic.W(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    protected ic() {
    }

    public final void a(int param0, al param1, int param2, int param3, int param4) {
        int discarded$1 = 0;
        int var7 = 0;
        va var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        al var13 = null;
        rb var14 = null;
        rb var15 = null;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_4_3;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (param1.h(-125)) {
            var14 = this.a((byte) 82, param1);
            var15 = var14;
            var7 = var15.a(param0, (byte) -36);
            var8 = var14.field_b[var7];
            var9 = var15.a((byte) 111, param0);
            var10 = this.a(var9, param4, param1, (byte) -108);
            var11 = this.a(param1, -119, param3) + Math.max(0, var8.field_c);
            stackIn_3_0 = this.a(param1, 98, param3);
            stackIn_3_1 = this.b(17910, param1);
            stackIn_3_2 = var8.field_f;
            if (var15.field_b.length <= 1 + var7) {
              stackIn_4_3 = var8.field_f;
            } else {
              stackIn_4_3 = var14.field_b[1 + var7].field_c;
            }
            var12 = stackIn_3_0 + Math.min(stackIn_3_1, Math.min(stackIn_3_2, stackIn_4_3));
            mb.a(param1.field_p + param4, param3 + param1.field_m, param3 + (param1.field_m + param1.field_u), (byte) -69, param4 + param1.field_p + param1.field_x);
            lb.field_O.a(94, var10, var12, this.field_c, var11, var10);
            ch.m(88);
          }
          if (param2 >= -73) {
            var13 = (al) null;
            discarded$1 = this.a(122, 27, (al) null, (byte) -18);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("ic.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public final int a(al param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= 78) {
            stackIn_4_0 = -this.field_b + (-this.field_e + param0.field_x);
            return stackIn_4_0;
          }
          stackIn_2_0 = 116;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ic.G(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    ic(oh param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        try {
          this.field_f = param7;
          this.field_e = param1;
          this.field_m = param6;
          this.field_n = param9;
          this.field_d = param4;
          this.field_j = param11;
          this.field_a = param12 ? true : false;
          this.field_i = param5;
          this.field_h = param3;
          this.field_b = param2;
          this.field_k = param0;
          this.field_l = param8;
          this.field_c = param10;
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "ic.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
    }

    final static boolean a(boolean param0) {
        if (param0) {
          field_g = (String) null;
        }
        return fb.field_a > 250 ? true : false;
    }

    static {
        field_g = "Create your own free Jagex account";
    }
}
