/*
 * Decompiled by CFR-JS 0.4.0.
 */
class af implements j, eg {
    int field_j;
    int field_n;
    int field_f;
    int field_g;
    int field_b;
    private boolean field_i;
    int field_o;
    int field_e;
    int field_m;
    int field_a;
    mg field_l;
    private int field_k;
    static int[] field_h;
    int field_d;
    static da field_c;

    private final int c(int param0, rc param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 3) {
            this.field_b = 126;
          }
          stackIn_3_0 = -this.field_j - this.field_d + param1.field_x;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("af.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final int a(boolean param0, rc param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            stackIn_2_0 = -119;
            return stackIn_2_0;
          }
          this.a(-21480, param1);
          stackIn_4_0 = param1.field_h.b(62) + (this.field_a + this.field_n);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("af.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    private final void a(rc param0, int param1, int param2, int param3) {
        try {
          this.a(param1, param2, -3, 0, this.field_o, this.field_k, param0, 0);
          int var5_int = -24 % ((param3 + 6) / 63);
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "af.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final void a(int param0, int param1, int param2, rc param3, int param4) {
        jf var13 = null;
        jf var14 = null;
        int var7 = 0;
        le var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        if (param2 != 1) {
          return;
        }
        try {
          if (param3.b(true)) {
            var13 = this.a(-21480, param3);
            var14 = var13;
            var7 = var14.a((byte) -94, param0);
            var8 = var13.field_c[var7];
            var9 = var14.a(0, param0);
            var10 = this.a(param3, param4, var9, (byte) 78);
            var11 = this.a(param3, false, param1) + Math.max(0, var8.field_g);
            var12 = this.a(param3, false, param1) + Math.min(this.c(param2 ^ 2, param3), Math.min(var8.field_e, var14.field_c.length <= 1 + var7 ? var8.field_e : var13.field_c[var7 + 1].field_g));
            kf.a((byte) 97, param4 + param3.field_m, param3.field_j + param1, param3.field_t + param3.field_m + param4, param3.field_x + param1 + param3.field_j);
            ph.field_f.a((byte) -67, var11, var12, var10, this.field_m, var10);
            mf.e(param2 + 4095);
          }
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "af.F(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    private final int a(int param0, int param1, int param2, rc param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == -5) {
            stackIn_4_0 = param0 + (param3.field_q + (param3.field_j + param2) + this.field_d);
            return stackIn_4_0;
          }
          stackIn_2_0 = -87;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("af.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static boolean b(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != -3) {
          return false;
        }
        stackIn_6_0 = (vg.field_J != null) && (vg.field_J.d((byte) 125) != null);
        return stackIn_6_0;
    }

    af(mg param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, rc param6, int param7) {
        int discarded$0 = 0;
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
        rc var14 = null;
        int var12Lifetime1;
        var13 = SolKnight.field_L ? 1 : 0;
        try {
          kf.a((byte) 97, param6.field_m + param0, param1 + param6.field_j, param6.field_m + (param0 + param6.field_t), param6.field_j + param1 + param6.field_x);
          var9_int = this.b(param2 ^ -268, param6);
          if (param2 != -3) {
            var14 = (rc) null;
            discarded$0 = this.c(124, (rc) null);
          }
          boolean decompiledFrameRemainder0 = true;
          var10 = this.c(param2 + 6, param6);
          if (!this.field_i) {
            var12 = this.field_b;
            if (var12 == 0) {
              var11 = this.field_l.field_F;
            } else {
              if (var12 != 2) {
                if (var12 != 3 &&
                  1 != var12) {
                }
                var11 = (-this.field_l.field_F + var10 - this.field_l.field_s >> 1) + this.field_l.field_F;
              } else {
                var11 = -this.field_l.field_s + var10;
              }
            }
            var12Lifetime1 = this.field_g;
            if (var12Lifetime1 != 0 &&
              var12Lifetime1 != 3) {
              if (1 == var12Lifetime1) {
                this.field_l.a(this.b(param6, 0), (var9_int >> 1) + this.a(param6, param0, param3, (byte) 78), this.a(param7, param2 - 2, param1, param6) + var11, param4, param5);
              } else {
                if ((var12Lifetime1 == 2)) {
                  this.field_l.b(this.b(param6, 0), var9_int + this.a(param6, param0, param3, (byte) 78), this.a(param7, -5, param1, param6) + var11, param4, param5);
                }
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_l.c(this.b(param6, param2 + 3), this.a(param6, param0, param3, (byte) 78), var11 + this.a(param7, -5, param1, param6), param4, param5);
            }
          } else {
            this.field_l.a(this.b(param6, 0), this.a(param6, param0, param3, (byte) 78), this.a(param7, -5, param1, param6), var9_int, var10, param4, param5, this.field_g, this.field_b, this.field_f);
          }
          mf.e(4096);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_27_0 = var9;
          stackIn_27_1 = new StringBuilder().append("af.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param7).append(')').toString());
        }
    }

    public final void a(int param0, rc param1, int param2, int param3, int param4, int param5) {
        int var12 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        le var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        jf var17 = null;
        jf var18 = null;
        var16 = SolKnight.field_L ? 1 : 0;
        try {
          if (param0 == param2) {
            return;
          }
          if (param1.b(true)) {
            var17 = this.a(-21480, param1);
            var18 = var17;
            if (param0 < param2) {
              var9 = param2;
              var8 = param0;
            } else {
              var9 = param0;
              var8 = param2;
            }
            var10 = var18.a((byte) -106, var8);
            var11 = var18.a((byte) -121, var9);
            kf.a((byte) 97, param5 + param1.field_m, param4 + param1.field_j, param1.field_m + param5 + param1.field_t, param1.field_x + (param1.field_j + param4));
            for (var12 = var10; var12 <= var11; var12++) {
              var13 = var17.field_c[var12];
              if (~var12 == ~var10) {
                stackIn_13_0 = var18.a(0, var8);
              } else {
                stackIn_13_0 = var13.field_c[0];
              }
              var14 = stackIn_13_0;
              if (var11 != var12) {
                if (var13 == null) {
                  stackIn_18_0 = 0;
                } else {
                  stackIn_18_0 = var13.field_c[var13.field_c.length - 1];
                }
              } else {
                stackIn_18_0 = var18.a(0, var9);
              }
              var15 = stackIn_18_0;
              ph.field_f.a(var13.field_g + (this.field_d + param1.field_j + (param4 + param1.field_q)), this.field_e >>> 24, var15 - var14, this.field_e, 1, var13.field_e, this.a(param1, param5, var14, (byte) 78));
            }
            mf.e(4096);
          }
          var7_int = -39 % ((param3 - 34) / 46);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_24_0 = var7;
          stackIn_24_1 = new StringBuilder().append("af.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public final int a(rc param0, boolean param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            this.field_n = 98;
          }
          stackIn_3_0 = this.a(0, -5, param2, param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("af.P(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public final int a(int param0, rc param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 0) {
            this.field_f = 89;
          }
          stackIn_3_0 = this.a(param1, param0, 0, (byte) 78);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("af.U(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    public final int b(int param0, rc param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 265) {
            this.field_j = 108;
          }
          stackIn_3_0 = param1.field_t - (this.field_a + this.field_n);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("af.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public void a(byte param0, int param1, boolean param2, int param3, rc param4) {
        if (null == this.field_l) {
          return;
        }
        try {
          this.a(param4, param3, param1, -117);
          if (param0 < 113) {
            af var7 = (af) null;
            this.a((af) null, 127);
          }
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "af.T(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    public final int a(rc param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            stackIn_2_0 = -113;
            return stackIn_2_0;
          }
          this.a(param1 ^ -21480, param0);
          stackIn_4_0 = param0.field_h.a(-2592, param3 - this.a(param0, false, param4), param2 - this.a(param5, param0, param1 + 0));
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_7_0 = var7;
          stackIn_7_1 = new StringBuilder().append("af.O(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public final jf a(int param0, rc param1) {
        RuntimeException var3 = null;
        rc var4 = null;
        jf stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1.field_h == null) {
            param1.field_h = (jf) ((Object) new vk());
          }
          if (param0 != -21480) {
            var4 = (rc) null;
            this.a(-117, (rc) null);
          }
          if (this.field_i) {
            ((vk) (param1.field_h)).a(this.b(param1, 0), this.field_f, this.field_g, 127, this.field_l, this.b(265, param1), this.c(3, param1), this.field_b);
          } else {
            this.a(param1, (byte) 93);
          }
          stackIn_8_0 = param1.field_h;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("af.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    public static void c(int param0) {
        if (param0 != 0) {
          return;
        }
        field_c = null;
        field_h = null;
    }

    final void a(af param0, int param1) {
        try {
          param0.field_n = this.field_n;
          param0.field_b = this.field_b;
          param0.field_g = this.field_g;
          param0.field_f = this.field_f;
          param0.field_o = this.field_o;
          param0.field_l = this.field_l;
          param0.field_a = this.field_a;
          if (param1 != 6935) {
            this.field_j = 86;
          }
          param0.field_d = this.field_d;
          param0.field_m = this.field_m;
          param0.field_e = this.field_e;
          param0.field_j = this.field_j;
          param0.field_k = this.field_k;
          param0.field_i = this.field_i;
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "af.N(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void a(rc param0, byte param1) {
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var6Lifetime1;
        var7 = SolKnight.field_L ? 1 : 0;
        try {
          if (null == param0.field_h) {
            param0.field_h = (jf) ((Object) new vk());
          }
          var3_int = this.b(265, param0);
          if (param1 <= 81) {
            return;
          }
          var4 = this.c(3, param0);
          var6 = this.field_b;
          if (var6 == 0) {
            var5 = this.field_l.field_F;
          } else {
            if (var6 != 2) {
              if (var6 != 3 &&
                1 == var6) {
              }
              var5 = this.field_l.field_F + (-this.field_l.field_s - this.field_l.field_F + var4 >> 1);
            } else {
              var5 = -this.field_l.field_s + var4;
            }
          }
          var6Lifetime1 = this.field_g;
          if (var6Lifetime1 != 0 &&
            var6Lifetime1 != 3) {
            if (var6Lifetime1 == 1) {
              if (!(param0.field_h instanceof vk)) {
                return;
              }
              ((vk) (param0.field_h)).a(var3_int >> 1, 0, var5, this.field_l, this.b(param0, 0));
              return;
            }
            if (var6Lifetime1 == 2) {
              if (!(param0.field_h instanceof vk)) {
                return;
              }
              ((vk) (param0.field_h)).a(-13323, this.field_l, var5, this.b(param0, 0), var3_int);
            }
          } else {
            if (param0.field_h instanceof vk) {
              ((vk) (param0.field_h)).a(this.field_l, (byte) -111, 0, var5, this.b(param0, 0));
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_32_0 = var3;
          stackIn_32_1 = new StringBuilder().append("af.M(");
          if (param0 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param1).append(')').toString());
        }
    }

    public final int a(rc param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 28 % ((-60 - param1) / 61);
          this.a(-21480, param0);
          stackIn_1_0 = param0.field_h.a((byte) 121) + (this.field_d + this.field_j);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("af.J(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    private final int a(rc param0, int param1, int param2, byte param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 78) {
            this.field_n = -51;
          }
          stackIn_3_0 = param2 + (param0.field_k + (this.field_a + param1 + param0.field_m));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("af.S(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final int a(int param0) {
        if (param0 != 3) {
          return -52;
        }
        return this.field_l.field_s + this.field_l.field_F;
    }

    String b(rc param0, int param1) {
        RuntimeException var3 = null;
        rc var4 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            var4 = (rc) null;
            this.a((byte) -115, 127, false, 29, (rc) null);
          }
          stackIn_3_0 = param0.field_i;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("af.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(dl param0, gb param1, byte param2, int param3) {
        try {
          int var5 = 0;
          int var11_int = 0;
          int var12_int = 0;
          byte[] array$0 = null;
          RuntimeException stackIn_40_0 = null;
          StringBuilder stackIn_40_1 = null;
          String stackIn_41_2 = null;
          StringBuilder stackIn_43_1 = null;
          String stackIn_44_2 = null;
          Throwable decompiledCaughtException = null;
          RuntimeException var4 = null;
          int var6_int = 0;
          ClassNotFoundException var6 = null;
          SecurityException var6_ref = null;
          NullPointerException var6_ref2 = null;
          Exception var6_ref3 = null;
          Throwable var6_ref4 = null;
          String var7 = null;
          String var8 = null;
          int var9 = 0;
          String[] var10 = null;
          byte[][] var11 = null;
          Class[] var12 = null;
          int var13 = 0;
          int var14 = 0;
          String var15 = null;
          String var16 = null;
          int var17 = 0;
          di var18 = null;
          byte[][] var19 = null;
          String var20 = null;
          byte[][] var21 = null;
          int var13Lifetime1;
          var14 = SolKnight.field_L ? 1 : 0;
          try {
            var18 = new di();
            var18.field_h = param1.j(255);
            var18.field_o = param1.e(true);
            var18.field_k = new nj[var18.field_h];
            var18.field_s = new nj[var18.field_h];
            var18.field_m = new int[var18.field_h];
            var18.field_q = new byte[var18.field_h][][];
            var18.field_p = new int[var18.field_h];
            var18.field_r = new int[var18.field_h];
            for (var5 = 0; var18.field_h > var5; var5++) {
              try {
                var6_int = param1.j(255);
                if (var6_int != 0 &&
                  var6_int != 1 &&
                  var6_int != 2) {
                  if (var6_int == 3 ||
                    var6_int == 4) {
                    var20 = param1.h(123);
                    var8 = param1.h(11);
                    var9 = param1.j(255);
                    var10 = new String[var9];
                    for (var11_int = 0; var11_int < var9; var11_int++) {
                      var10[var11_int] = param1.h(19);
                    }
                    var21 = new byte[var9][];
                    var19 = var21;
                    var11 = var19;
                    if (var6_int == 3) {
                      for (var12_int = 0; var9 > var12_int; var12_int++) {
                        var13 = param1.e(true);
                        array$0 = new byte[var13];
                        var11[var12_int] = array$0;
                        param1.a(var13, 0, -113, var21[var12_int]);
                      }
                    }
                    var18.field_r[var5] = var6_int;
                    var12 = new Class[var9];
                    var17 = 0;
                    var13Lifetime1 = var17;
                    while (var9 > var17) {
                      var12[var17] = k.a(var10[var17], (byte) -106);
                      var17++;
                    }
                    var18.field_s[var5] = param0.a((byte) 113, var8, var12, k.a(var20, (byte) -101));
                    var18.field_q[var5] = var21;
                  }
                } else {
                  var15 = param1.h(94);
                  var7 = var15;
                  var16 = param1.h(36);
                  var8 = var16;
                  var9 = 0;
                  if (var6_int == 1) {
                    var9 = param1.e(true);
                  }
                  var18.field_r[var5] = var6_int;
                  var18.field_m[var5] = var9;
                  var18.field_k[var5] = param0.a(0, k.a(var15, (byte) -115), var16);
                }
              } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                var18.field_p[var5] = -1;
              } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var6_ref = (SecurityException) (Object) decompiledCaughtException;
                var18.field_p[var5] = -2;
              } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                var18.field_p[var5] = -3;
              } catch (java.lang.Exception decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var6_ref3 = (Exception) (Object) decompiledCaughtException;
                var18.field_p[var5] = -4;
              } catch (java.lang.Throwable decompiledCaughtParameter4) {
                decompiledCaughtException = decompiledCaughtParameter4;
                var6_ref4 = decompiledCaughtException;
                var18.field_p[var5] = -5;
              }
            }
            if (param2 >= -94) {
              field_h = (int[]) null;
            }
            ga.field_E.a(var18, -7044);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
            decompiledCaughtException = decompiledCaughtParameter5;
            var4 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_40_0 = var4;
            stackIn_40_1 = new StringBuilder().append("af.C(");
            if (param0 == null) {
              stackIn_41_2 = "null";
            } else {
              stackIn_41_2 = "{...}";
            }
            stackIn_43_1 = ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',');
            if (param1 == null) {
              stackIn_44_2 = "null";
            } else {
              stackIn_44_2 = "{...}";
            }
            throw fc.a((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(param2).append(',').append(param3).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    protected af() {
    }

    af(mg param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        try {
          this.field_j = param4;
          this.field_g = param7;
          this.field_i = param12 ? true : false;
          this.field_m = param10;
          this.field_n = param2;
          this.field_e = param11;
          this.field_l = param0;
          this.field_f = param9;
          this.field_o = param5;
          this.field_d = param3;
          this.field_k = param6;
          this.field_b = param8;
          this.field_a = param1;
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "af.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
    }

    static {
    }
}
