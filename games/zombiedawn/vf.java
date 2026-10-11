/*
 * Decompiled by CFR-JS 0.4.0.
 */
class vf implements io, ak {
    static int field_d;
    int field_l;
    int field_o;
    int field_n;
    static int field_k;
    int field_a;
    static int field_f;
    int field_g;
    static fn field_c;
    int field_i;
    private boolean field_e;
    int field_j;
    private int field_q;
    int field_p;
    rb field_m;
    int field_b;
    int field_h;

    public final vg a(int param0, ga param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        vg stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1.field_t == null) {
            param1.field_t = (vg) ((Object) new ad());
          }
          if (this.field_e) {
            ((ad) (param1.field_t)).a(this.b(12307, param1), (byte) -106, this.a(param1, -23803), this.field_m, this.field_n, this.field_i, this.field_h, this.a((byte) 127, param1));
          } else {
            this.c(26289, param1);
          }
          var3_int = -7 % ((param0 - 25) / 63);
          stackIn_7_0 = param1.field_t;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("vf.W(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public final int a(ga param0, int param1, int param2) {
        RuntimeException var4 = null;
        ga var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 1) {
            var5 = (ga) null;
            this.a((byte) -2, (ga) null);
          }
          stackIn_3_0 = this.a(param0, 0, (byte) 24, param2);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("vf.K(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    vf(rb param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    public final int b(ga param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 128) {
            stackIn_4_0 = this.a(true, param0, 0, param2);
            return stackIn_4_0;
          }
          stackIn_2_0 = -51;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("vf.O(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, ga param6, int param7) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        ga var14 = null;
        int var12Lifetime1;
        var13 = ZombieDawn.field_J;
        try {
          g.$cfr$intArgs$a$3aedf8649552(param2 + param6.field_j, 99, param6.field_i + (param4 + param6.field_k), param6.field_n + (param6.field_j + param2), param4 + param6.field_k);
          if (param7 < 3) {
            var14 = (ga) null;
            this.b((ga) null, 57, -8);
          }
          boolean decompiledFrameRemainder0 = true;
          var9_int = this.a((byte) 123, param6);
          var10 = this.a(param6, -23803);
          if (!this.field_e) {
            var12 = this.field_i;
            if (var12 == 0) {
              var11 = this.field_m.field_I;
            } else {
              if (var12 == 2) {
                var11 = var10 - this.field_m.field_x;
              } else {
                if (var12 != 3 &&
                  var12 != 1) {
                }
                var11 = this.field_m.field_I + (-this.field_m.field_I + var10 - this.field_m.field_x >> 1);
              }
            }
            var12Lifetime1 = this.field_h;
            if (var12Lifetime1 != 0 &&
              var12Lifetime1 != 3) {
              if (var12Lifetime1 == 1) {
                this.field_m.a(this.b(12307, param6), (var9_int >> 1) + this.a(true, param6, param0, param4), var11 + this.a(param6, param1, (byte) 24, param2), param3, param5);
              } else {
                if ((var12Lifetime1 == 2)) {
                  this.field_m.b(this.b(12307, param6), this.a(true, param6, param0, param4) + var9_int, var11 + this.a(param6, param1, (byte) 24, param2), param3, param5);
                }
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_m.c(this.b(12307, param6), this.a(true, param6, param0, param4), var11 + this.a(param6, param1, (byte) 24, param2), param3, param5);
            }
          } else {
            this.field_m.a(this.b(12307, param6), this.a(true, param6, param0, param4), this.a(param6, param1, (byte) 24, param2), var9_int, var10, param3, param5, this.field_h, this.field_i, this.field_n);
          }
          pa.a(-21189);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_26_0 = var9;
          stackIn_26_1 = new StringBuilder().append("vf.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param7).append(')').toString());
        }
    }

    String b(int param0, ga param1) {
        RuntimeException var3 = null;
        ga var4 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 12307) {
            var4 = (ga) null;
            this.b((byte) 77, (ga) null);
          }
          stackIn_3_0 = param1.field_o;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("vf.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final int a(int param0) {
        if (param0 != 5) {
          return -34;
        }
        return this.field_m.field_I + this.field_m.field_x;
    }

    final static void a(int param0, String param1) {
        try {
          int var2_int = 90 / ((-63 - param0) / 58);
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "vf.AA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(int param0, int param1, int param2, ga param3, int param4, int param5) {
        int var12 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        oe var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        vg var17 = null;
        vg var18 = null;
        var16 = ZombieDawn.field_J;
        try {
          if (param1 == param5) {
            return;
          }
          if (param3.e(-17741)) {
            var17 = this.a(104, param3);
            var18 = var17;
            if (param5 > param1) {
              var8 = param1;
              var9 = param5;
            } else {
              var8 = param5;
              var9 = param1;
            }
            var10 = var18.a(104, var8);
            var11 = var18.a(-71, var9);
            g.$cfr$intArgs$a$3aedf8649552(param2 + param3.field_j, 99, param4 + (param3.field_k + param3.field_i), param3.field_n + (param3.field_j + param2), param4 + param3.field_k);
            for (var12 = var10; var11 >= var12; var12++) {
              var13 = var17.field_b[var12];
              if (~var10 != ~var12) {
                stackIn_12_0 = var13.field_e[0];
              } else {
                stackIn_12_0 = var18.a((byte) -72, var8);
              }
              var14 = stackIn_12_0;
              if (var12 == var11) {
                stackIn_17_0 = var18.a((byte) -72, var9);
              } else {
                if (var13 == null) {
                  stackIn_17_0 = 0;
                } else {
                  stackIn_17_0 = var13.field_e[-1 + var13.field_e.length];
                }
              }
              var15 = stackIn_17_0;
              se.field_j.a(var13.field_b + param3.field_p + (param3.field_j + param2 + this.field_b), var13.field_g, var15 - var14, this.a(true, param3, var14, param4), this.field_j >>> 24, (byte) -90, this.field_j);
            }
            pa.a(-21189);
          }
          if (param0 >= -99) {
            vf.b(-125);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_24_0 = var7;
          stackIn_24_1 = new StringBuilder().append("vf.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public void a(int param0, boolean param1, int param2, ga param3, int param4) {
        if (null == this.field_m) {
          return;
        }
        try {
          this.a(param2, (byte) 119, param4, param3);
          if (param0 != 16777215) {
            this.field_m = (rb) null;
          }
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "vf.A(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    public final int a(boolean param0, ga param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            stackIn_2_0 = -79;
            return stackIn_2_0;
          }
          this.a(114, param1);
          stackIn_4_0 = param1.field_t.a((byte) -38) + this.field_b + this.field_p;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("vf.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static void a(int param0, vn[] param1, int param2, int param3, int param4, int param5) {
        int var21 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
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
        int var22 = 0;
        int var20Lifetime1;
        int var20Lifetime2;
        int var20Lifetime3;
        int var20Lifetime4;
        var22 = ZombieDawn.field_J;
        try {
          if (param1 == null) {
            return;
          }
          if (param4 > 0 &&
            param5 > 0) {
            if (null == param1[3]) {
              stackIn_10_0 = 0;
            } else {
              stackIn_10_0 = param1[3].field_r;
            }
            var6_int = stackIn_10_0;
            if (null == param1[5]) {
              stackIn_13_0 = 0;
            } else {
              stackIn_13_0 = param1[5].field_r;
            }
            var7 = stackIn_13_0;
            if (null == param1[1]) {
              stackIn_16_0 = 0;
            } else {
              stackIn_16_0 = param1[1].field_q;
            }
            var8 = stackIn_16_0;
            if (null == param1[7]) {
              stackIn_19_0 = 0;
            } else {
              stackIn_19_0 = param1[7].field_q;
            }
            var9 = stackIn_19_0;
            var10 = param2 + param4;
            var11 = param0 + param5;
            var12 = param2 + var6_int;
            var13 = -var7 + var10;
            var14 = var8 + param0;
            var15 = -var9 + var11;
            var16 = var12;
            var17 = var13;
            if (var16 > var17) {
              var17 = var6_int * param4 / (var6_int + var7) + param2;
              var16 = var6_int * param4 / (var6_int + var7) + param2;
            }
            var18 = var14;
            var19 = var15;
            if (var18 > var19) {
              var19 = param5 * var8 / (var8 + var9) + param0;
              var18 = param5 * var8 / (var8 + var9) + param0;
            }
            bi.b(dd.field_c);
            if (param1[0] != null) {
              bi.c(param2, param0, var16, var18);
              param1[0].b(param2, param0);
              bi.a(dd.field_c);
            }
            if (null != param1[2]) {
              bi.c(var17, param0, var10, var18);
              param1[2].b(var13, param0);
              bi.a(dd.field_c);
            }
            if (param1[6] != null) {
              bi.c(param2, var19, var16, var11);
              param1[6].b(param2, var15);
              bi.a(dd.field_c);
            }
            if (param1[8] != null) {
              bi.c(var17, var19, var10, var11);
              param1[8].b(var13, var15);
              bi.a(dd.field_c);
            }
            if (null != param1[1] &&
              0 != param1[1].field_r) {
              bi.c(var16, param0, var17, var18);
              for (var20 = var12; var20 < var13; var20 = var20 + param1[1].field_r) {
                param1[1].b(var20, param0);
              }
              bi.a(dd.field_c);
            }
            if (param1[7] != null &&
              param1[7].field_r != 0) {
              bi.c(var16, var19, var17, var11);
              for (var20Lifetime1 = var12; var20Lifetime1 < var13; var20Lifetime1 = var20Lifetime1 + param1[7].field_r) {
                param1[7].b(var20Lifetime1, var15);
              }
              bi.a(dd.field_c);
            }
            if (null != param1[param3] &&
              0 != param1[3].field_q) {
              bi.c(param2, var18, var16, var19);
              for (var20Lifetime2 = var14; var20Lifetime2 < var15; var20Lifetime2 = var20Lifetime2 + param1[3].field_q) {
                param1[3].b(param2, var20Lifetime2);
              }
              bi.a(dd.field_c);
            }
            if (param1[5] != null &&
              param1[5].field_q != 0) {
              bi.c(var17, var18, var10, var19);
              for (var20Lifetime3 = var14; var20Lifetime3 < var15; var20Lifetime3 = var20Lifetime3 + param1[5].field_q) {
                param1[5].b(var13, var20Lifetime3);
              }
              bi.a(dd.field_c);
            }
            if (null != param1[4] &&
              param1[4].field_r != 0 &&
              0 != param1[4].field_q) {
              bi.c(var16, var18, var17, var19);
              for (var20Lifetime4 = var14; var15 > var20Lifetime4; var20Lifetime4 = var20Lifetime4 + param1[4].field_q) {
                for (var21 = var12; var21 < var13; var21 = var21 + param1[4].field_r) {
                  param1[4].b(var21, var20Lifetime4);
                }
              }
              bi.a(dd.field_c);
              return;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_71_0 = var6;
          stackIn_71_1 = new StringBuilder().append("vf.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_71_0), ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final void a(vf param0, byte param1) {
        try {
          param0.field_h = this.field_h;
          param0.field_i = this.field_i;
          param0.field_q = this.field_q;
          param0.field_g = this.field_g;
          param0.field_m = this.field_m;
          int var3_int = 111 / ((39 - param1) / 44);
          param0.field_l = this.field_l;
          param0.field_e = this.field_e;
          param0.field_p = this.field_p;
          param0.field_a = this.field_a;
          param0.field_n = this.field_n;
          param0.field_o = this.field_o;
          param0.field_j = this.field_j;
          param0.field_b = this.field_b;
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "vf.V(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final int a(byte param0, ga param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 111) {
            this.field_a = -122;
          }
          stackIn_3_0 = -this.field_o + (-this.field_g + param1.field_i);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("vf.BA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    private final int a(ga param0, int param1, byte param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == 24) {
            stackIn_4_0 = param0.field_p + param0.field_j + (param3 + this.field_b) + param1;
            return stackIn_4_0;
          }
          stackIn_2_0 = 54;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("vf.J(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final int a(ga param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == -23803) {
            stackIn_4_0 = -this.field_p + param0.field_n - this.field_b;
            return stackIn_4_0;
          }
          stackIn_2_0 = 117;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("vf.P(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(int param0, byte param1, int param2, ga param3) {
        try {
          this.a(0, 0, param0, this.field_l, param2, this.field_q, param3, 72);
          if (param1 <= 42) {
            this.field_p = -124;
          }
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "vf.S(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public final int b(byte param0, ga param1) {
        RuntimeException var3 = null;
        ga var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -31) {
            var4 = (ga) null;
            this.a(62, 84, 6, -2, (ga) null);
          }
          this.a(106, param1);
          stackIn_3_0 = param1.field_t.b((byte) 63) + (this.field_g + this.field_o);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("vf.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    private final void c(int param0, ga param1) {
        int discarded$0 = 0;
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
        ga var8 = null;
        int var6Lifetime1;
        var7 = ZombieDawn.field_J;
        try {
          if (null == param1.field_t) {
            param1.field_t = (vg) ((Object) new ad());
          }
          var3_int = this.a((byte) 112, param1);
          var4 = this.a(param1, -23803);
          var6 = this.field_i;
          if (var6 != 0) {
            if (var6 != 2) {
              if (var6 != 3 &&
                var6 == 1) {
              }
              var5 = (-this.field_m.field_x + (-this.field_m.field_I + var4) >> 1) + this.field_m.field_I;
            } else {
              var5 = var4 - this.field_m.field_x;
            }
          } else {
            var5 = this.field_m.field_I;
          }
          var6Lifetime1 = this.field_h;
          if (0 != var6Lifetime1 &&
            var6Lifetime1 != 3) {
            if (var6Lifetime1 == 1) {
              if (param1.field_t instanceof ad) {
                ((ad) (param1.field_t)).a(var3_int >> 1, 91, var5, this.b(param0 ^ 22178, param1), this.field_m);
              }
            } else if (var6Lifetime1 == 2 &&
              param1.field_t instanceof ad) {
              ((ad) (param1.field_t)).a(this.b(param0 - 13982, param1), var5, this.field_m, (byte) 83, var3_int);
            }
          } else {
            if (param1.field_t instanceof ad) {
              ((ad) (param1.field_t)).a(95, this.field_m, this.b(param0 - 13982, param1), 0, var5);
            }
          }
          if (param0 != 26289) {
            var8 = (ga) null;
            discarded$0 = this.a((ga) null, 125);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_32_0 = var3;
          stackIn_32_1 = new StringBuilder().append("vf.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    public final void a(int param0, int param1, int param2, int param3, ga param4) {
        vg var13 = null;
        vg var14 = null;
        int var7 = 0;
        oe var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        try {
          if (param4.e(-17741)) {
            var13 = this.a(-66, param4);
            var14 = var13;
            var7 = var14.a(124, param0);
            var8 = var13.field_b[var7];
            var9 = var14.a((byte) -72, param0);
            var10 = this.a(true, param4, var9, param1);
            var11 = this.a(param4, 1, param2) + Math.max(0, var8.field_b);
            var12 = this.a(param4, 1, param2) + Math.min(this.a(param4, -23803), Math.min(var8.field_g, var7 + 1 >= var14.field_b.length ? var8.field_g : var13.field_b[1 + var7].field_b));
            g.$cfr$intArgs$a$3aedf8649552(param4.field_j + param2, 99, param4.field_i + (param4.field_k + param1), param4.field_n + (param2 + param4.field_j), param4.field_k + param1);
            se.field_j.a(var12, this.field_a, (byte) -14, var10, var11, var10);
            pa.a(-21189);
          }
          int var6_int = -62 % ((param3 - 37) / 55);
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "vf.H(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(int param0) {
        field_c = null;
        if (param0 != 4056) {
          field_k = 76;
        }
    }

    private final int a(boolean param0, ga param1, int param2, int param3) {
        RuntimeException var5 = null;
        ga var6 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            var6 = (ga) null;
            this.a(-121, false, -32, (ga) null, -20);
          }
          stackIn_3_0 = param1.field_u + (param3 + param1.field_k + this.field_g + param2);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("vf.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    protected vf() {
    }

    vf(rb param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        try {
          this.field_q = param6;
          this.field_n = param9;
          this.field_i = param8;
          this.field_e = param12 ? true : false;
          this.field_a = param10;
          this.field_p = param4;
          this.field_g = param1;
          this.field_m = param0;
          this.field_j = param11;
          this.field_h = param7;
          this.field_o = param2;
          this.field_b = param3;
          this.field_l = param5;
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "vf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
    }

    public final int a(ga param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -1) {
            this.field_q = -68;
          }
          this.a(-52, param0);
          stackIn_3_0 = param0.field_t.a(param3 - this.b(param0, 128, param5), -this.a(param0, param1 ^ -2, param2) + param4, true);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("vf.M(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    static {
        field_k = 250;
        field_d = 33;
        field_c = null;
    }
}
