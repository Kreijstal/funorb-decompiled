/*
 * Decompiled by CFR-JS 0.4.0.
 */
class dk implements dh, vc {
    int field_h;
    static String field_m;
    int field_n;
    int field_i;
    static int field_l;
    int field_a;
    int field_d;
    int field_c;
    int field_b;
    int field_j;
    static int field_g;
    private int field_k;
    private boolean field_o;
    int field_p;
    qi field_f;
    int field_e;

    public static void b(boolean param0) {
        if (!param0) {
          return;
        }
        field_m = null;
    }

    public final int a(n param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == 13112) {
            stackIn_4_0 = this.a((byte) 122, 0, param1, param0);
            return stackIn_4_0;
          }
          stackIn_2_0 = 116;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("dk.K(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void a(byte param0, dk param1) {
        try {
          param1.field_f = this.field_f;
          param1.field_c = this.field_c;
          param1.field_d = this.field_d;
          param1.field_i = this.field_i;
          param1.field_j = this.field_j;
          param1.field_p = this.field_p;
          param1.field_a = this.field_a;
          param1.field_h = this.field_h;
          param1.field_k = this.field_k;
          param1.field_b = this.field_b;
          if (param0 >= -106) {
            this.field_b = -91;
          }
          param1.field_e = this.field_e;
          param1.field_o = this.field_o;
          param1.field_n = this.field_n;
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "dk.GA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(int param0, n param1, int param2, byte param3, int param4) {
        int var6_int = 0;
        lm var7 = null;
        int var8 = 0;
        lf var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_5_3;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          var6_int = -67 % ((param3 - 57) / 49);
          if (param1.c((byte) -20)) {
            var7 = this.a((byte) 20, param1);
            var8 = var7.b(param2, -22539);
            var9 = var7.field_b[var8];
            var10 = var7.a(16777215, param2);
            var11 = this.a((byte) -19, var10, param0, param1);
            var12 = this.a(-1337403295, param1, param4) + Math.max(0, var9.field_h);
            stackIn_4_0 = this.a(-1337403295, param1, param4);
            stackIn_4_1 = this.c((byte) -109, param1);
            stackIn_4_2 = var9.field_k;
            if (var7.field_b.length > 1 + var8) {
              stackIn_5_3 = var7.field_b[1 + var8].field_h;
            } else {
              stackIn_5_3 = var9.field_k;
            }
            var13 = stackIn_4_0 + Math.min(stackIn_4_1, Math.min(stackIn_4_2, stackIn_5_3));
            td.a(param1.field_k + (param0 + param1.field_x), param1.field_k + param0, param1.field_o + param4 + param1.field_u, true, param1.field_o + param4);
            pc.field_b.a(this.field_a, var12, (byte) -53, var13, var11, var11);
            dm.b((byte) -10);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_9_0 = var6;
          stackIn_9_1 = new StringBuilder().append("dk.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void a(int param0, int param1, n param2, byte param3) {
        if (param3 != -53) {
          return;
        }
        try {
          this.a(0, param0, this.field_k, (byte) -63, param1, this.field_c, param2, 0);
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "dk.V(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public void a(boolean param0, int param1, int param2, n param3, int param4) {
        if (param2 >= -48) {
          return;
        }
        if (null == this.field_f) {
          return;
        }
        try {
          this.a(param1, param4, param3, (byte) -53);
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "dk.C(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    public final lm a(byte param0, n param1) {
        RuntimeException var3 = null;
        lm stackIn_5_0 = null;
        lm stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1.field_i == null) {
            param1.field_i = (lm) ((Object) new lg());
          }
          if (param0 != 20) {
            stackIn_5_0 = (lm) null;
            return stackIn_5_0;
          }
          if (this.field_o) {
            ((lg) (param1.field_i)).a(this.a(45, param1), this.a(param1, (byte) 127), this.field_h, param0 - 19, this.c((byte) -109, param1), this.field_f, this.field_d, this.field_i);
          } else {
            this.b(-1337403295, param1);
          }
          stackIn_10_0 = param1.field_i;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("dk.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public final int b(byte param0, n param1) {
        RuntimeException var3 = null;
        n var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.a((byte) 20, param1);
          if (param0 != -36) {
            var4 = (n) null;
            this.a((n) null, -60);
          }
          stackIn_3_0 = param1.field_i.a((byte) 108) + this.field_j + this.field_n;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("dk.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    String a(n param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 114 / ((73 - param1) / 49);
          stackIn_1_0 = param0.field_q;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("dk.S(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2, byte param3, int param4, int param5, n param6, int param7) {
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var12Lifetime1;
        var13 = HoldTheLine.field_D;
        try {
          if (param3 > -57) {
            dk.b(true);
          }
          boolean decompiledFrameRemainder0 = true;
          td.a(param6.field_k + (param1 + param6.field_x), param6.field_k + param1, param6.field_o + (param4 + param6.field_u), true, param6.field_o + param4);
          var9_int = this.a(21, param6);
          var10 = this.c((byte) -63, param6);
          if (!this.field_o) {
            var12 = this.field_d;
            if (var12 != 0) {
              if (var12 == 2) {
                var11 = -this.field_f.field_I + var10;
              } else {
                if (var12 != 3 &&
                  1 != var12) {
                }
                var11 = this.field_f.field_G + (var10 + (-this.field_f.field_G - this.field_f.field_I) >> 1);
              }
            } else {
              var11 = this.field_f.field_G;
            }
            var12Lifetime1 = this.field_i;
            if (0 != var12Lifetime1 &&
              var12Lifetime1 != 3) {
              if (1 == var12Lifetime1) {
                this.field_f.b(this.a(param6, (byte) -98), (var9_int >> 1) + this.a((byte) 107, param0, param1, param6), this.a(param7, (byte) -46, param6, param4) + var11, param5, param2);
              } else {
                if ((var12Lifetime1 == 2)) {
                  this.field_f.c(this.a(param6, (byte) -5), this.a((byte) 98, param0, param1, param6) + var9_int, var11 + this.a(param7, (byte) -56, param6, param4), param5, param2);
                }
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_f.a(this.a(param6, (byte) 125), this.a((byte) -96, param0, param1, param6), var11 + this.a(param7, (byte) 57, param6, param4), param5, param2);
            }
          } else {
            this.field_f.a(this.a(param6, (byte) -12), this.a((byte) 101, param0, param1, param6), this.a(param7, (byte) -114, param6, param4), var9_int, var10, param5, param2, this.field_i, this.field_d, this.field_h);
          }
          dm.b((byte) -10);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_27_0 = var9;
          stackIn_27_1 = new StringBuilder().append("dk.FA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param7).append(')').toString());
        }
    }

    private final int c(byte param0, n param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -59) {
            this.field_f = (qi) null;
          }
          stackIn_3_0 = -this.field_e + param1.field_u - this.field_p;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("dk.W(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final int a(int param0, n param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 6) {
            this.field_n = 95;
          }
          stackIn_3_0 = -this.field_n + (param1.field_x - this.field_j);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("dk.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final int a(int param0, byte param1, int param2, int param3, n param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 38) {
            stackIn_2_0 = -32;
            return stackIn_2_0;
          }
          this.a((byte) 20, param4);
          stackIn_4_0 = param4.field_i.a(-this.a(param4, param3, 13112) + param2, 8, -this.a(-1337403295, param4, param0) + param5);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_7_0 = var7;
          stackIn_7_1 = new StringBuilder().append("dk.O(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param5).append(')').toString());
        }
    }

    private final int a(int param0, byte param1, n param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = 122 / ((-1 - param1) / 32);
          stackIn_1_0 = param0 + param3 + (param2.field_o + this.field_p) + param2.field_y;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_4_0 = var5;
          stackIn_4_1 = new StringBuilder().append("dk.EA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param3).append(')').toString());
        }
    }

    public final int a(boolean param0) {
        if (!param0) {
          this.field_n = 120;
        }
        return this.field_f.field_I + this.field_f.field_G;
    }

    public final int a(int param0, n param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -1337403295) {
            stackIn_4_0 = this.a(0, (byte) -68, param1, param2);
            return stackIn_4_0;
          }
          stackIn_2_0 = -41;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("dk.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    public final int a(n param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.a((byte) 20, param0);
          if (param1 > -82) {
            this.field_c = 115;
          }
          stackIn_3_0 = param0.field_i.a(-112) + (this.field_p + this.field_e);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("dk.M(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void a(int param0, int param1, int param2, int param3, int param4, n param5) {
        int var12 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        lf var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        lm var17 = null;
        lm var18 = null;
        var16 = HoldTheLine.field_D;
        try {
          if (param3 == param4) {
            return;
          }
          if (param5.c((byte) -20)) {
            var17 = this.a((byte) 20, param5);
            var18 = var17;
            if (param4 < param3) {
              var9 = param3;
              var8 = param4;
            } else {
              var9 = param4;
              var8 = param3;
            }
            var10 = var18.b(var8, -22539);
            var11 = var18.b(var9, -22539);
            td.a(param5.field_x + param2 + param5.field_k, param2 + param5.field_k, param1 + param5.field_o + param5.field_u, true, param5.field_o + param1);
            for (var12 = var10; var12 <= var11; var12++) {
              var13 = var17.field_b[var12];
              if (var12 == var10) {
                stackIn_16_0 = var18.a(16777215, var8);
              } else {
                stackIn_16_0 = var13.field_c[0];
              }
              var14 = stackIn_16_0;
              if (var11 == var12) {
                stackIn_21_0 = var18.a(16777215, var9);
              } else {
                if (var13 != null) {
                  stackIn_21_0 = var13.field_c[-1 + var13.field_c.length];
                } else {
                  stackIn_21_0 = 0;
                }
              }
              var15 = stackIn_21_0;
              pc.field_b.a(this.field_b >>> 24, 13421772, this.field_p + param5.field_o + (param1 + param5.field_y + var13.field_h), var13.field_k, this.a((byte) -54, var14, param2, param5), this.field_b, -var14 + var15);
            }
            dm.b((byte) -10);
          }
          if (param0 >= -23) {
            this.field_o = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_28_0 = var7;
          stackIn_28_1 = new StringBuilder().append("dk.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    private final int a(byte param0, int param1, int param2, n param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = 101 / ((58 - param0) / 36);
          stackIn_1_0 = param3.field_m + param2 + param3.field_k - (-this.field_j - param1);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_4_0 = var5;
          stackIn_4_1 = new StringBuilder().append("dk.DA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    protected dk() {
    }

    dk(qi param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    private final void b(int param0, n param1) {
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
        int var6Lifetime1;
        var7 = HoldTheLine.field_D;
        try {
          if (param1.field_i == null) {
            param1.field_i = (lm) ((Object) new lg());
          }
          var3_int = this.a(param0 ^ -1337403314, param1);
          if (param0 != -1337403295) {
            this.field_k = -67;
          }
          var4 = this.c((byte) -121, param1);
          var6 = this.field_d;
          if (0 != var6) {
            if (2 != var6) {
              if (var6 != 3 &&
                var6 == 1) {
              }
              var5 = (-this.field_f.field_I + (var4 - this.field_f.field_G) >> 1) + this.field_f.field_G;
            } else {
              var5 = var4 - this.field_f.field_I;
            }
          } else {
            var5 = this.field_f.field_G;
          }
          var6Lifetime1 = this.field_i;
          if (var6Lifetime1 != 0 &&
            var6Lifetime1 != 3) {
            if (1 == var6Lifetime1) {
              if (!(param1.field_i instanceof lg)) {
                return;
              }
              ((lg) (param1.field_i)).a(this.field_f, (byte) -37, var5, this.a(param1, (byte) -96), var3_int >> 1);
              return;
            }
            if (var6Lifetime1 == 2 &&
              param1.field_i instanceof lg) {
              ((lg) (param1.field_i)).a(this.a(param1, (byte) -43), 965, this.field_f, var5, var3_int);
              return;
            }
            return;
          }
          if (param1.field_i instanceof lg) {
            ((lg) (param1.field_i)).a(this.a(param1, (byte) 124), -12476, var5, 0, this.field_f);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_33_0 = var3;
          stackIn_33_1 = new StringBuilder().append("dk.BA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    final static io a(int param0) {
        String var1 = tn.d(param0 ^ param0);
        if (var1 != null &&
          !(var1.indexOf('@') < 0)) {
          var1 = "";
        }
        return new io(tn.d(0), ab.n(112));
    }

    dk(qi param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        try {
          this.field_a = param10;
          this.field_i = param7;
          this.field_c = param5;
          this.field_o = param12 ? true : false;
          this.field_f = param0;
          this.field_d = param8;
          this.field_p = param3;
          this.field_n = param2;
          this.field_k = param6;
          this.field_j = param1;
          this.field_b = param11;
          this.field_h = param9;
          this.field_e = param4;
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "dk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
    }

    static {
        field_m = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
    }
}
