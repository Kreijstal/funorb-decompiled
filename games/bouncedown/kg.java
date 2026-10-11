/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kg {
    private int field_h;
    static String field_j;
    static int field_f;
    private int field_a;
    private boolean field_c;
    static gk field_b;
    tg field_o;
    static String field_d;
    tg[] field_n;
    static boolean field_i;
    static rb field_k;
    static int[] field_g;
    private int field_l;
    private int field_m;
    private int field_e;

    final kg a(byte param0, int param1) {
        this.field_a = param1;
        if (param0 <= 6) {
          this.field_m = -22;
        }
        return this;
    }

    final kg a(boolean param0, byte param1) {
        int var3 = -74 / ((param1 - 63) / 40);
        this.field_c = param0 ? true : false;
        return this;
    }

    final kg a(int param0, byte param1) {
        if (param1 > -47) {
          return (kg) null;
        }
        this.field_h = param0;
        return this;
    }

    final void a(kg param0, byte param1) {
        try {
          param0.field_o = this.field_o;
          param0.field_h = this.field_h;
          param0.field_l = this.field_l;
          if (param1 != 55) {
            field_k = (rb) null;
          }
          param0.field_n = this.field_n;
          param0.field_c = this.field_c;
          param0.field_a = this.field_a;
          param0.field_m = this.field_m;
          param0.field_e = this.field_e;
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "kg.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0) {
        this.field_e = 256;
        this.field_o = null;
        this.field_a = 0;
        if (param0 != -29776) {
          field_b = (gk) null;
        }
        this.field_n = null;
        this.field_h = -1;
        this.field_m = 0;
        this.field_l = 0;
    }

    final static tg[] a(int param0, int param1, int param2, int param3, int param4) {
        tg[] var6 = null;
        tg[] var5 = null;
        tg dupTemp$0 = null;
        tg dupTemp$1 = null;
        if (param3 == -2147483648) {
          var6 = new tg[9];
          var5 = var6;
          dupTemp$0 = hc.a(param1, param2, (byte) -126);
          var6[6] = dupTemp$0;
          var5[3] = dupTemp$0;
          var5[2] = dupTemp$0;
          var5[1] = dupTemp$0;
          var5[0] = dupTemp$0;
          dupTemp$1 = hc.a(param1, param0, (byte) -123);
          var6[8] = dupTemp$1;
          var5[7] = dupTemp$1;
          var5[5] = dupTemp$1;
          if (param4 != 0) {
            var6[4] = hc.a(64, param4, (byte) -127);
          }
          return var5;
        }
        return (tg[]) null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int[] param5, int param6, int param7, int param8) {
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_83_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
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
        String var20 = null;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var16Lifetime2;
        int var16Lifetime3;
        int var17Lifetime2;
        var19 = Bounce.field_N;
        try {
          if (param3 >= 0 &&
            param2 < qk.field_g) {
            if (param8 < 0 &&
              0 > param0 &&
              param4 < 0) {
              return;
            }
            if (param8 >= qk.field_a &&
              param0 >= qk.field_a &&
              param4 >= qk.field_a) {
              return;
            }
            var14 = param3 - param2;
            if (param1 == param2) {
              if (param3 != param2) {
                var15 = param3 - param1;
                if (param8 >= param0) {
                  var10 = param8 << 16;
                  var9_int = param0 << 16;
                  var11 = (-param0 + param4 << 16) / var15;
                  var12 = (-param8 + param4 << 16) / var14;
                } else {
                  var11 = (param4 - param8 << 16) / var14;
                  var10 = param0 << 16;
                  var12 = (-param0 + param4 << 16) / var15;
                  var9_int = param8 << 16;
                }
              } else {
                var9_int = param8 << 16;
                var10 = param0 << 16;
                var11 = 0;
                var12 = 0;
              }
              if (0 > param2) {
                param2 = Math.min(-param2, -param2 + param1);
                var10 = var10 + param2 * var12;
                var9_int = var9_int + var11 * param2;
                param2 = 0;
              }
              var13 = 0;
            } else {
              var10 = param8 << 16;
              var9_int = param8 << 16;
              var15 = -param2 + param1;
              var11 = (param0 - param8 << 16) / var15;
              var12 = (param4 - param8 << 16) / var14;
              if (var12 <= var11) {
                var16 = var11;
                var11 = var12;
                var12 = var16;
                var13 = 1;
              } else {
                var13 = 0;
              }
              boolean decompiledFrameRemainder0 = true;
              if (param2 < 0) {
                if (param1 < 0) {
                  param2 = param1 - param2;
                  var9_int = var9_int + param2 * var11;
                  var10 = var10 + var12 * param2;
                  param2 = param1;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param2 = -param2;
                  var10 = var10 + var12 * param2;
                  var9_int = var9_int + param2 * var11;
                  param2 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var16Lifetime2 = qk.field_b[param2];
                while (param1 > param2) {
                  var17 = var9_int >> 16;
                  if (qk.field_a > var17) {
                    var18 = (var10 >> 16) - (var9_int >> 16);
                    if (var18 != 0) {
                      if (qk.field_a <= var17 + var18) {
                        var18 = -1 + (qk.field_a - var17);
                      }
                      if (var17 >= 0) {
                        la.a(param6, 2, var18, var17 + var16Lifetime2, param5);
                      } else {
                        la.a(param6, 2, var17 + var18, var16Lifetime2, param5);
                      }
                    } else {
                      if (var17 >= 0 &&
                        qk.field_a > var17) {
                        la.a(param6, 2, var18, var16Lifetime2 + var17, param5);
                      }
                    }
                  }
                  param2++;
                  if (param2 >= qk.field_g) {
                    return;
                  }
                  var10 = var10 + var12;
                  var16Lifetime2 = var16Lifetime2 + na.field_e;
                  var9_int = var9_int + var11;
                }
              }
              var16Lifetime3 = param3 - param1;
              if (0 != var16Lifetime3) {
                if (var13 != 0) {
                  var10 = param0 << 16;
                } else {
                  var9_int = param0 << 16;
                }
                var17Lifetime2 = param4 << 16;
                var11 = (-var9_int + var17Lifetime2) / var16Lifetime3;
                var12 = (-var10 + var17Lifetime2) / var16Lifetime3;
              } else {
                var12 = 0;
                var11 = 0;
              }
            }
            if (param7 < 74) {
              var20 = (String) null;
              kg.a(-100, (String) null);
            }
            if (param2 < 0) {
              param2 = -param2;
              var10 = var10 + var12 * param2;
              var9_int = var9_int + var11 * param2;
              param2 = 0;
            }
            var15Lifetime1 = qk.field_b[param2];
            while (param3 > param2) {
              var16Lifetime1 = var9_int >> 16;
              if (qk.field_a > var16Lifetime1) {
                var17Lifetime1 = (var10 >> 16) - (var9_int >> 16);
                if (var17Lifetime1 == 0) {
                  if (var16Lifetime1 >= 0 &&
                    qk.field_a > var16Lifetime1) {
                    la.a(param6, 2, var17Lifetime1, var16Lifetime1 + var15Lifetime1, param5);
                  }
                } else {
                  if (qk.field_a <= var17Lifetime1 + var16Lifetime1) {
                    var17Lifetime1 = -1 + qk.field_a - var16Lifetime1;
                  }
                  if (var16Lifetime1 < 0) {
                    la.a(param6, 2, var17Lifetime1 + var16Lifetime1, var15Lifetime1, param5);
                  } else {
                    la.a(param6, 2, var17Lifetime1, var15Lifetime1 + var16Lifetime1, param5);
                  }
                }
              }
              param2++;
              if (param2 >= qk.field_g) {
                return;
              }
              var9_int = var9_int + var11;
              var15Lifetime1 = var15Lifetime1 + na.field_e;
              var10 = var10 + var12;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_82_0 = var9;
          stackIn_82_1 = new StringBuilder().append("kg.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_83_2 = "null";
          } else {
            stackIn_83_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_82_0), ((StringBuilder) (Object) stackIn_82_1).append(stackIn_83_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    final static qh a(int param0, String param1) {
        RuntimeException var2 = null;
        int[] var3 = null;
        qh stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 2) {
            var3 = (int[]) null;
            kg.a(-22, -118, -32, 113, 57, (int[]) null, 57, 112, 26);
          }
          stackIn_3_0 = new qh(param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("kg.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void a(int param0, qi param1, lk param2, int param3, int param4) {
        tj stackIn_17_0 = null;
        String stackIn_17_1 = null;
        int stackIn_18_2 = 0;
        int stackIn_20_2 = 0;
        int stackIn_21_3 = 0;
        int stackIn_23_3;
        int stackIn_23_4;
        int stackIn_23_5;
        int stackIn_23_6;
        int stackIn_23_7;
        int stackIn_24_8;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7_int = 0;
        String var7 = null;
        int var8 = 0;
        try {
          ve.a(param2.field_m, param2.field_i + param0, this.field_n, (byte) -128, param2.field_k, param3 + param2.field_r);
          var6_int = -105 / ((74 - param4) / 44);
          if (this.field_o != null) {
            var7_int = this.field_a + param2.field_r + param3;
            var8 = this.field_m + (param0 + param2.field_i);
            if (param1.field_d == 1) {
              var7_int = var7_int + (param2.field_k - this.field_o.field_t) / 2;
            }
            if (1 == param1.field_p) {
              var8 = var8 + (param2.field_m - this.field_o.field_o) / 2;
            }
            if (param1.field_d == 2) {
              var7_int = var7_int + (-this.field_o.field_t + param2.field_k);
            }
            if (2 == param1.field_p) {
              var8 = var8 + (param2.field_m - this.field_o.field_o);
            }
            this.field_o.a(var7_int, var8);
          }
          var7 = param1.a(true, param2);
          if (var7 != null &&
            param1.field_b != null &&
            this.field_l >= 0) {
            stackIn_17_0 = param1.field_b;
            stackIn_17_1 = var7;
            if (this.field_a != -2147483648) {
              stackIn_18_2 = this.field_a;
            } else {
              stackIn_18_2 = 0;
            }
            stackIn_20_2 = stackIn_18_2 + (param1.field_m + (param3 + param2.field_r));
            if (-2147483648 != this.field_m) {
              stackIn_21_3 = this.field_m;
            } else {
              stackIn_21_3 = 0;
            }
            stackIn_23_3 = stackIn_21_3 + (param0 + param2.field_i + param1.field_o);
            stackIn_23_4 = -param1.field_k - param1.field_m + param2.field_k;
            stackIn_23_5 = -param1.field_n - param1.field_o + param2.field_m;
            stackIn_23_6 = this.field_l;
            stackIn_23_7 = this.field_h;
            if (this.field_e != -2147483648) {
              stackIn_24_8 = this.field_e;
            } else {
              stackIn_24_8 = 256;
            }
            ((tj) (Object) stackIn_17_0).a(stackIn_17_1, stackIn_20_2, stackIn_23_3, stackIn_23_4, stackIn_23_5, stackIn_23_6, stackIn_23_7, stackIn_24_8, param1.field_d, param1.field_p, param1.field_f);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_28_0 = var6;
          stackIn_28_1 = new StringBuilder().append("kg.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',');
          if (param2 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final kg a(tg[] param0, int param1) {
        RuntimeException var3 = null;
        kg stackIn_2_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_n = param0;
          if (param1 == -1) {
            return this;
          }
          stackIn_2_0 = (kg) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("kg.K(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final kg b(int param0, byte param1) {
        if (param1 >= -30) {
          return (kg) null;
        }
        this.field_m = param0;
        return this;
    }

    final kg a(int param0, int param1) {
        if (param1 != -2) {
          this.a(true, (byte) -16);
        }
        this.field_l = param0;
        return this;
    }

    public static void a(byte param0) {
        field_k = null;
        field_j = null;
        field_g = null;
        field_d = null;
        if (param0 != -64) {
          field_d = (String) null;
        }
        field_b = null;
    }

    final void a(kg param0, int param1, int param2, qi param3, boolean param4, lk param5) {
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          if (this.field_c) {
            param0.a(param2, param3, param5, param1, -89);
            param0.a(-29776);
          }
          if (this.field_a != -2147483648) {
            param0.field_a = this.field_a;
          }
          if (this.field_l >= -1) {
            param0.field_l = this.field_l;
          }
          if (null != this.field_o) {
            param0.field_o = this.field_o;
          }
          if (this.field_m != -2147483648) {
            param0.field_m = this.field_m;
          }
          if (null != this.field_n) {
            param0.field_n = this.field_n;
          }
          if (this.field_h >= -1) {
            param0.field_h = this.field_h;
          }
          if (this.field_e != -2147483648) {
            param0.field_e = this.field_e;
          }
          if (param4) {
            this.a(-108, 126);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_25_0 = var7;
          stackIn_25_1 = new StringBuilder().append("kg.E(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    kg() {
        this.field_h = -2;
        this.field_a = -2147483648;
        this.field_o = null;
        this.field_c = false;
        this.field_m = -2147483648;
        this.field_n = null;
        this.field_e = -2147483648;
        this.field_l = -2;
    }

    static {
        field_j = null;
        field_f = 0;
        field_d = "Create a free account to start using this feature";
        field_i = true;
        field_g = new int[8192];
    }
}
