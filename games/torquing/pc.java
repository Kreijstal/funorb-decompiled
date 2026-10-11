/*
 * Decompiled by CFR-JS 0.4.0.
 */
class pc implements el, fe {
    int field_e;
    uc field_m;
    int field_h;
    private boolean field_l;
    int field_g;
    private int field_c;
    int field_f;
    int field_j;
    static int[] field_d;
    int field_p;
    int field_b;
    int field_k;
    int field_a;
    static String field_n;
    static String field_i;
    int field_o;

    private final void a(gm param0, int param1, int param2, int param3) {
        try {
          this.a(-2, param0, param1, this.field_h, 0, param2, 0, this.field_c);
          if (param3 != -546) {
            this.field_a = -66;
          }
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "pc.DA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, kh param5, short param6, short param7, int param8) {
        RuntimeException var9 = null;
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
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        rm var30 = null;
        rm var31 = null;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var27Lifetime1;
        int var28Lifetime1;
        var29 = Torquing.field_u;
        try {
          var30 = param5.field_l;
          var31 = var30;
          var10 = var30.field_M[param4];
          var11 = var30.field_M[param0];
          var12 = var30.field_M[param2];
          var13 = var30.field_M[param3];
          var14 = var30.field_B[param4];
          var15 = var30.field_B[param0];
          var16 = var30.field_B[param2];
          var17 = var30.field_B[param3];
          var18 = var30.field_E[param4];
          var19 = var30.field_E[param0];
          var20 = var30.field_E[param2];
          var21 = var30.field_E[param3];
          if (param1 != 5265) {
            return;
          }
          var22 = 40000;
          stackIn_6_0 = (var22 >= ((var14 - var15) * (-var15 + var14) + ((var10 - var11) * (var10 - var11) + (-var19 + var18) * (var18 - var19)))) ? 0 : 1;
          var23 = stackIn_6_0;
          stackIn_9_0 = ((-var20 + var19) * (var19 - var20) + ((var15 - var16) * (var15 - var16) + (-var12 + var11) * (var11 - var12)) <= var22) ? 0 : 1;
          var24 = stackIn_9_0;
          stackIn_12_0 = ((-var21 + var20) * (-var21 + var20) + (var16 - var17) * (-var17 + var16) + (var12 - var13) * (-var13 + var12) <= var22) ? 0 : 1;
          var25 = stackIn_12_0;
          stackIn_15_0 = (var22 >= ((-var18 + var21) * (-var18 + var21) + ((-var10 + var13) * (var13 - var10) + (var17 - var14) * (var17 - var14)))) ? 0 : 1;
          var26 = stackIn_15_0;
          if (var23 != 0 &&
            var24 == 0 &&
            var25 != 0 &&
            var26 == 0) {
            cd.a(var31, param1 ^ -22914, 2);
            var27 = var31.a((var11 + var10) / 2, (var15 + var14) / 2, (var19 + var18) / 2);
            var28 = var31.a((var12 + var13) / 2, (var17 + var16) / 2, (var21 + var20) / 2);
            pc.a(var27, 5265, var28, param3, param4, param5, param6, param7, param8);
            pc.a(var28, 5265, var27, param0, param2, param5, param6, param7, param8);
            return;
          }
          if (var23 == 0 &&
            var24 != 0 &&
            var25 == 0 &&
            var26 != 0) {
            cd.a(var31, -19729, 2);
            var27Lifetime1 = var31.a((var12 + var11) / 2, (var16 + var15) / 2, (var20 + var19) / 2);
            var28Lifetime1 = var31.a((var13 + var10) / 2, (var14 + var17) / 2, (var18 + var21) / 2);
            pc.a(var27Lifetime1, 5265, var28Lifetime1, param4, param0, param5, param6, param7, param8);
            pc.a(var28Lifetime1, 5265, var27Lifetime1, param2, param3, param5, param6, param7, param8);
            return;
          }
          oj.a(param8, param7, 2, true, true, param4, param0, param6, param2, param5);
          oj.a(param8, param7, 1, true, true, param2, param3, param6, param4, param5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_30_0 = var9;
          stackIn_30_1 = new StringBuilder().append("pc.W(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    private final int c(gm param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 8557) {
            stackIn_4_0 = -this.field_p + (param0.field_o - this.field_o);
            return stackIn_4_0;
          }
          stackIn_2_0 = -106;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("pc.CA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void a(int param0, gm param1, int param2, boolean param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        kp var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        uj var13 = null;
        uj var14 = null;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_5_3;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1.g(2)) {
            var13 = this.b((byte) 121, param1);
            var14 = var13;
            var7 = var14.b(param2, (byte) 110);
            var8 = var13.field_c[var7];
            var9 = var14.a(param2, (byte) -125);
            var10 = this.a(var9, param0, 2, param1);
            var11 = this.a(param1, param4, -72) + Math.max(0, var8.field_c);
            stackIn_4_0 = this.a(param1, param4, -108);
            stackIn_4_1 = this.c(param1, 8557);
            stackIn_4_2 = var8.field_a;
            if (1 + var7 < var14.field_c.length) {
              stackIn_5_3 = var13.field_c[var7 + 1].field_c;
            } else {
              stackIn_5_3 = var8.field_a;
            }
            var12 = stackIn_4_0 + Math.min(stackIn_4_1, Math.min(stackIn_4_2, stackIn_5_3));
            ld.a(param1.field_p + (param0 + param1.field_w), param0 + param1.field_w, param1.field_o + param4 + param1.field_k, param1.field_k + param4, (byte) -116);
            ah.field_c.a(var11, var12, false, var10, this.field_j, var10);
            r.a(126);
          }
          if (!param3) {
            return;
          }
          field_d = (int[]) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("pc.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public final int a(byte param0, gm param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.b((byte) 112, param1);
          var3_int = 127 / ((18 - param0) / 53);
          stackIn_1_0 = param1.field_u.a(true) - (-this.field_k - this.field_e);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("pc.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    String c(byte param0, gm param1) {
        RuntimeException var3 = null;
        gm var4 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 65) {
            var4 = (gm) null;
            this.a((byte) -109, (gm) null);
          }
          stackIn_3_0 = param1.field_m;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("pc.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final int a(gm param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = 88 % ((22 - param2) / 43);
          stackIn_1_0 = this.a((byte) -123, param0, param1, 0);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("pc.M(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public final uj b(byte param0, gm param1) {
        RuntimeException var3 = null;
        uj stackIn_2_0 = null;
        uj stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 96) {
            stackIn_2_0 = (uj) null;
            return stackIn_2_0;
          }
          if (param1.field_u == null) {
            param1.field_u = (uj) ((Object) new cm());
          }
          if (this.field_l) {
            ((cm) (param1.field_u)).a(this.field_a, this.field_m, (byte) 26, this.c(param1, 8557), this.b(param1, -1), this.c((byte) 65, param1), this.field_f, this.field_g);
          } else {
            this.a(false, param1);
          }
          stackIn_10_0 = param1.field_u;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("pc.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final void a(int param0, pc param1) {
        try {
          param1.field_f = this.field_f;
          param1.field_c = this.field_c;
          param1.field_b = this.field_b;
          param1.field_e = this.field_e;
          param1.field_h = this.field_h;
          param1.field_j = this.field_j;
          param1.field_l = this.field_l;
          param1.field_m = this.field_m;
          param1.field_g = this.field_g;
          param1.field_k = this.field_k;
          int var3_int = 104 / ((-5 - param0) / 37);
          param1.field_a = this.field_a;
          param1.field_o = this.field_o;
          param1.field_p = this.field_p;
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "pc.FA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final int b(gm param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == -1) {
            stackIn_4_0 = -this.field_e + (-this.field_k + param0.field_p);
            return stackIn_4_0;
          }
          stackIn_2_0 = -14;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("pc.J(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(int param0, gm param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var12Lifetime1;
        var13 = Torquing.field_u;
        try {
          ld.a(param1.field_p + (param1.field_w + param2), param2 + param1.field_w, param5 + param1.field_k + param1.field_o, param1.field_k + param5, (byte) -105);
          if (param0 != -2) {
            field_d = (int[]) null;
          }
          boolean decompiledFrameRemainder0 = true;
          var9_int = this.b(param1, -1);
          var10 = this.c(param1, 8557);
          if (!this.field_l) {
            var12 = this.field_g;
            if (var12 != 0) {
              if (2 == var12) {
                var11 = -this.field_m.field_t + var10;
              } else {
                if (3 != var12 &&
                  var12 == 1) {
                }
                var11 = this.field_m.field_x + (-this.field_m.field_t + (var10 - this.field_m.field_x) >> 1);
              }
            } else {
              var11 = this.field_m.field_x;
            }
            var12Lifetime1 = this.field_f;
            if (var12Lifetime1 != 0 &&
              var12Lifetime1 != 3) {
              if (var12Lifetime1 == 1) {
                this.field_m.c(this.c((byte) 65, param1), (var9_int >> 1) + this.a(param4, param2, 2, param1), this.a((byte) 113, param1, param5, param6) + var11, param3, param7);
              } else {
                if ((var12Lifetime1 == 2)) {
                  this.field_m.a(this.c((byte) 65, param1), this.a(param4, param2, 2, param1) + var9_int, this.a((byte) 72, param1, param5, param6) + var11, param3, param7);
                }
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_m.b(this.c((byte) 65, param1), this.a(param4, param2, 2, param1), var11 + this.a((byte) 88, param1, param5, param6), param3, param7);
            }
          } else {
            this.field_m.a(this.c((byte) 65, param1), this.a(param4, param2, 2, param1), this.a((byte) 78, param1, param5, param6), var9_int, var10, param3, param7, this.field_f, this.field_g, this.field_a);
          }
          r.a(127);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_28_0 = var9;
          stackIn_28_1 = new StringBuilder().append("pc.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_i = null;
        field_n = null;
        if (param0 != 4252) {
          return;
        }
        field_d = null;
    }

    pc(uc param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    final static void b(boolean param0) {
        try {
          Exception var1 = null;
          int decompiledRegionSelector0 = 0;
          Throwable decompiledCaughtException = null;
          if (jl.field_W != null) {
            try {
              jl.field_W.a(false, 0L);
              jl.field_W.a(-1, 24, kj.field_d.field_n, kj.field_d.field_j);
              decompiledRegionSelector0 = 0;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = (Exception) (Object) decompiledCaughtException;
              decompiledRegionSelector0 = 1;
            }
            if (decompiledRegionSelector0 == 0) {
              kj.field_d.field_n = kj.field_d.field_n + 24;
              if (param0) {
                field_n = (String) null;
              }
              return;
            }
          }
          kj.field_d.field_n = kj.field_d.field_n + 24;
          if (!param0) {
            return;
          }
          field_n = (String) null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final int a(int param0, int param1, int param2, gm param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == 2) {
            stackIn_4_0 = param3.field_j + this.field_k + (param3.field_w + (param1 + param0));
            return stackIn_4_0;
          }
          stackIn_2_0 = 11;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("pc.T(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public final int a(boolean param0) {
        if (!param0) {
          return this.field_m.field_t + this.field_m.field_x;
        }
        field_i = (String) null;
        return this.field_m.field_t + this.field_m.field_x;
    }

    public final void a(int param0, int param1, int param2, int param3, int param4, gm param5) {
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
        kp var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        uj var17 = null;
        uj var18 = null;
        var16 = Torquing.field_u;
        try {
          if (param2 == param1) {
            return;
          }
          if (param3 != -1419356520) {
            return;
          }
          if (!param5.g(2)) {
            return;
          }
          var17 = this.b((byte) 99, param5);
          var18 = var17;
          if (param1 <= param2) {
            var8 = param1;
            var9 = param2;
          } else {
            var9 = param1;
            var8 = param2;
          }
          var10 = var18.b(var8, (byte) 110);
          var11 = var18.b(var9, (byte) 110);
          ld.a(param5.field_p + (param5.field_w + param0), param5.field_w + param0, param5.field_o + param5.field_k + param4, param4 + param5.field_k, (byte) -97);
          for (var12 = var10; var11 >= var12; var12++) {
            var13 = var17.field_c[var12];
            if (var12 == var10) {
              stackIn_15_0 = var18.a(var8, (byte) -120);
            } else {
              stackIn_15_0 = var13.field_b[0];
            }
            var14 = stackIn_15_0;
            if (var12 == var11) {
              stackIn_20_0 = var18.a(var9, (byte) -114);
            } else {
              if (var13 != null) {
                stackIn_20_0 = var13.field_b[-1 + var13.field_b.length];
              } else {
                stackIn_20_0 = 0;
              }
            }
            var15 = stackIn_20_0;
            ah.field_c.a(param3 + 1436133735, -var14 + var15, var13.field_a, this.a(var14, param0, param3 ^ -1419356518, param5), this.field_b >>> 24, var13.field_c + param5.field_v + (this.field_p + param5.field_k) + param4, this.field_b);
          }
          r.a(127);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_25_0 = var7;
          stackIn_25_1 = new StringBuilder().append("pc.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    public final int a(gm param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.b((byte) 100, param0);
          if (param1 != 2) {
            this.field_k = -37;
          }
          stackIn_3_0 = param0.field_u.b(false) + this.field_p + this.field_o;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("pc.O(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public void a(int param0, int param1, int param2, boolean param3, gm param4) {
        if (param0 < 89) {
          this.a(false);
        }
        if (this.field_m == null) {
          return;
        }
        try {
          this.a(param4, param2, param1, -546);
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "pc.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    private final int a(byte param0, gm param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = 58 % ((param0 - 36) / 35);
          stackIn_1_0 = this.field_p + (param2 - (-param1.field_k - (param1.field_v + param3)));
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_4_0 = var5;
          stackIn_4_1 = new StringBuilder().append("pc.EA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final int a(int param0, int param1, gm param2) {
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 2) {
            this.field_k = -100;
          }
          stackIn_3_0 = this.a(0, param1, 2, param2);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("pc.K(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final int a(int param0, int param1, gm param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.b((byte) 97, param2);
          if (param1 != -1) {
            this.field_l = true;
          }
          stackIn_3_0 = param2.field_u.a(param0 - this.a(param2, param4, 115), (byte) -83, param3 - this.a(2, param5, param2));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("pc.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    protected pc() {
    }

    private final void a(boolean param0, gm param1) {
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
        var7 = Torquing.field_u;
        try {
          if (null == param1.field_u) {
            param1.field_u = (uj) ((Object) new cm());
          }
          var3_int = this.b(param1, -1);
          var4 = this.c(param1, 8557);
          var6 = this.field_g;
          if (var6 == 0) {
            var5 = this.field_m.field_x;
          } else {
            if (var6 == 2) {
              var5 = -this.field_m.field_t + var4;
            } else {
              if (var6 != 3 &&
                var6 == 1) {
              }
              var5 = (-this.field_m.field_t + var4 - this.field_m.field_x >> 1) + this.field_m.field_x;
            }
          }
          if (param0) {
            return;
          }
          var6Lifetime1 = this.field_f;
          if (var6Lifetime1 != 0 &&
            var6Lifetime1 != 3) {
            if (1 == var6Lifetime1) {
              if (!(param1.field_u instanceof cm)) {
                return;
              }
              ((cm) (param1.field_u)).a(var3_int >> 1, 0, this.field_m, var5, this.c((byte) 65, param1));
              return;
            }
            if (2 != var6Lifetime1) {
              return;
            }
            if (!(param1.field_u instanceof cm)) {
              return;
            }
            ((cm) (param1.field_u)).a(var5, -22746, this.field_m, this.c((byte) 65, param1), var3_int);
            return;
          }
          if (!(param1.field_u instanceof cm)) {
            return;
          }
          ((cm) (param1.field_u)).a(this.c((byte) 65, param1), (byte) -123, this.field_m, var5, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_33_0 = var3;
          stackIn_33_1 = new StringBuilder().append("pc.U(").append(param0).append(',');
          if (param1 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    pc(uc param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        try {
          this.field_a = param9;
          this.field_o = param4;
          this.field_k = param1;
          this.field_m = param0;
          this.field_h = param5;
          this.field_b = param11;
          this.field_p = param3;
          this.field_l = param12 ? true : false;
          this.field_c = param6;
          this.field_e = param2;
          this.field_g = param8;
          this.field_f = param7;
          this.field_j = param10;
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "pc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
    }

    static {
        field_n = "World <%0> complete!";
        field_d = new int[8192];
        field_i = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
    }
}
