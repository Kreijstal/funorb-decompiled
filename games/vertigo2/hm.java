/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hm extends ji {
    private int field_E;
    private int[] field_y;
    private int field_D;
    private int field_G;
    static String field_z;
    static int field_F;
    static int[] field_A;
    static int[] field_C;
    static String field_B;
    static String field_H;

    final static byte[] a(int param0, byte[] param1) {
        byte[] stackIn_2_0 = null;
        byte[] stackIn_22_0 = null;
        byte[] stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        byte[] var5 = null;
        int var5_int = 0;
        byte[] var6 = null;
        Object var7 = null;
        ed var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        try {
          var9 = new ed(param1);
          var3 = var9.h(-11);
          if (param0 != -20595) {
            stackIn_2_0 = (byte[]) null;
            return stackIn_2_0;
          }
          var4 = var9.b(true);
          if (0 <= var4 && (0 == eo.field_j ||
            !(var4 > eo.field_j))) {
            if (0 == var3) {
              var13 = new byte[var4];
              var11 = var13;
              var5 = var11;
              var9.a(0, var13, var4, -124);
              stackIn_24_0 = var5;
              return stackIn_24_0;
            }
            var5_int = var9.b(true);
            if (var5_int >= 0 && (eo.field_j == 0 ||
              !(eo.field_j < var5_int))) {
              var12 = new byte[var5_int];
              var10 = var12;
              var6 = var10;
              if (var3 != 1) {
                var7 = uo.field_g;
                synchronized (var7) {
                  uo.field_g.a(var9, (byte) 88, var12);
                }
              } else {
                rj.a(var12, var5_int, param1, var4, 9);
              }
              stackIn_22_0 = var6;
              return stackIn_22_0;
            }
            throw new RuntimeException();
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_27_0 = var2;
          stackIn_27_1 = new StringBuilder().append("hm.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    final static void a(int[] param0, int param1, int param2, int param3, int param4, byte param5, int param6, int param7, int param8) {
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        String stackIn_98_2 = null;
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
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var16Lifetime2;
        int var16Lifetime3;
        int var17Lifetime2;
        var19 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param3 >= 0 &&
            param1 < oo.field_b) {
            if (param8 < 0 &&
              param2 < 0 &&
              param4 < 0) {
              return;
            }
            if (oo.field_q <= param8 &&
              param2 >= oo.field_q &&
              oo.field_q <= param4) {
              return;
            }
            if (param5 > -21) {
              hm.a((int[]) null, 56, -5, 126, 17, (byte) -38, -43, 90, -128);
            }
            var14 = -param1 + param3;
            if (param1 == param6) {
              if (param3 == param1) {
                var9_int = param8 << 16;
                var10 = param2 << 16;
                var11 = 0;
                var12 = 0;
              } else {
                var15 = param3 - param6;
                if (param2 <= param8) {
                  var10 = param8 << 16;
                  var11 = (param4 - param2 << 16) / var15;
                  var9_int = param2 << 16;
                  var12 = (param4 - param8 << 16) / var14;
                } else {
                  var12 = (param4 - param2 << 16) / var15;
                  var9_int = param8 << 16;
                  var11 = (-param8 + param4 << 16) / var14;
                  var10 = param2 << 16;
                }
              }
              if (0 > param1) {
                param1 = Math.min(-param1, -param1 + param6);
                var10 = var10 + var12 * param1;
                var9_int = var9_int + param1 * var11;
                param1 = 0;
              }
              var13 = 0;
            } else {
              var10 = param8 << 16;
              var9_int = param8 << 16;
              var15 = -param1 + param6;
              var12 = (param4 - param8 << 16) / var14;
              var11 = (param2 - param8 << 16) / var15;
              if (var11 < var12) {
                var13 = 0;
              } else {
                var16 = var11;
                var11 = var12;
                var12 = var16;
                var13 = 1;
              }
              if (param1 >= 0) {
                var16Lifetime2 = oo.field_a[param1];
                while (param6 > param1) {
                  var17 = var9_int >> 16;
                  if (oo.field_q > var17) {
                    var18 = -(var9_int >> 16) + (var10 >> 16);
                    if (0 != var18) {
                      if (oo.field_q <= var18 + var17) {
                        var18 = -1 + oo.field_q - var17;
                      }
                      if (var17 >= 0) {
                        md.a(-95, var17 + var16Lifetime2, param0, var18, param7);
                      } else {
                        md.a(-108, var16Lifetime2, param0, var18 + var17, param7);
                      }
                    } else {
                      if (0 <= var17 &&
                        var17 < oo.field_q) {
                        md.a(32, var17 + var16Lifetime2, param0, var18, param7);
                      }
                    }
                  }
                  param1++;
                  if (param1 >= oo.field_b) {
                    return;
                  }
                  var16Lifetime2 = var16Lifetime2 + bi.field_e;
                  var10 = var10 + var12;
                  var9_int = var9_int + var11;
                }
              } else if (param6 >= 0) {
                param1 = -param1;
                var10 = var10 + param1 * var12;
                var9_int = var9_int + var11 * param1;
                param1 = 0;
                var16Lifetime2 = oo.field_a[param1];
                while (param6 > param1) {
                  var17 = var9_int >> 16;
                  if (oo.field_q > var17) {
                    var18 = -(var9_int >> 16) + (var10 >> 16);
                    if (0 != var18) {
                      if (oo.field_q <= var18 + var17) {
                        var18 = -1 + oo.field_q - var17;
                      }
                      if (var17 >= 0) {
                        md.a(-95, var17 + var16Lifetime2, param0, var18, param7);
                      } else {
                        md.a(-108, var16Lifetime2, param0, var18 + var17, param7);
                      }
                    } else {
                      if (0 <= var17 &&
                        var17 < oo.field_q) {
                        md.a(32, var17 + var16Lifetime2, param0, var18, param7);
                      }
                    }
                  }
                  param1++;
                  if (param1 >= oo.field_b) {
                    return;
                  }
                  var16Lifetime2 = var16Lifetime2 + bi.field_e;
                  var10 = var10 + var12;
                  var9_int = var9_int + var11;
                }
              } else {
                param1 = -param1 + param6;
                var10 = var10 + var12 * param1;
                var9_int = var9_int + param1 * var11;
                param1 = param6;
              }
              var16Lifetime3 = -param6 + param3;
              if (var16Lifetime3 != 0) {
                var17Lifetime2 = param4 << 16;
                if (var13 == 0) {
                  var9_int = param2 << 16;
                } else {
                  var10 = param2 << 16;
                }
                var11 = (var17Lifetime2 - var9_int) / var16Lifetime3;
                var12 = (var17Lifetime2 - var10) / var16Lifetime3;
              } else {
                var12 = 0;
                var11 = 0;
              }
            }
            if (param1 < 0) {
              param1 = -param1;
              var9_int = var9_int + param1 * var11;
              var10 = var10 + var12 * param1;
              param1 = 0;
            }
            var15Lifetime1 = oo.field_a[param1];
            while (param1 < param3) {
              var16Lifetime1 = var9_int >> 16;
              if (oo.field_q > var16Lifetime1) {
                var17Lifetime1 = (var10 >> 16) - (var9_int >> 16);
                if (var17Lifetime1 != 0) {
                  if (var17Lifetime1 + var16Lifetime1 >= oo.field_q) {
                    var17Lifetime1 = -var16Lifetime1 + (oo.field_q - 1);
                  }
                  if (var16Lifetime1 >= 0) {
                    md.a(58, var15Lifetime1 + var16Lifetime1, param0, var17Lifetime1, param7);
                  } else {
                    md.a(97, var15Lifetime1, param0, var16Lifetime1 + var17Lifetime1, param7);
                  }
                } else {
                  if (var16Lifetime1 >= 0 &&
                    var16Lifetime1 < oo.field_q) {
                    md.a(-115, var15Lifetime1 + var16Lifetime1, param0, var17Lifetime1, param7);
                  }
                }
              }
              param1++;
              if (param1 >= oo.field_b) {
                return;
              }
              var15Lifetime1 = var15Lifetime1 + bi.field_e;
              var9_int = var9_int + var11;
              var10 = var10 + var12;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_97_0 = var9;
          stackIn_97_1 = new StringBuilder().append("hm.I(");
          if (param0 == null) {
            stackIn_98_2 = "null";
          } else {
            stackIn_98_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_97_0), ((StringBuilder) (Object) stackIn_97_1).append(stackIn_98_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    public hm() {
        super(1, true);
        this.field_E = 3216;
        this.field_G = 3216;
        this.field_D = 4096;
        this.field_y = new int[3];
    }

    final void a(int param0) {
        this.h(4096);
        if (param0 >= -98) {
          hm.g(40);
        }
    }

    final void a(byte param0, int param1, ed param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          var4_int = param1;
          if (var4_int != 0) {
            if (var4_int == 1) {
              this.field_G = param2.a((byte) -11);
            } else {
              if (var4_int == 2) {
                this.field_E = param2.a((byte) -11);
              }
            }
          } else {
            this.field_D = param2.a((byte) -11);
          }
          if (param0 != 110) {
            this.field_y = (int[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("hm.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static void g(int param0) {
        String var3 = null;
        if (param0 < 9) {
          int[] var2 = (int[]) null;
          hm.a(-60, -51, 24, 49, (byte) 92, -38, 53, (int[]) null, -113, -61);
        }
        if (null != nr.field_q) {
          var3 = nr.field_q;
          String var1 = var3;
          fh.a(Vertigo2.a(new String[]{var3}, ua.field_b, 92), -19615);
          nr.field_q = null;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4, int param5, int param6, int[] param7, int param8, int param9) {
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10_ref = null;
        var16 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param4 < 19) {
            hm.b(false);
          }
          while (true) {
            param3--;
            if (0 > param3) {
              return;
            }
            var17 = param7;
            var10 = var17;
            var11 = param8;
            var12 = param5;
            var13 = param2;
            var14 = param6;
            var15 = var17[var11] >> 1 & 8355711;
            var10[var11] = (b.a(33423531, var13) >> 9) + ((b.a(var12, 33423360) >> 1) + b.a(var14 >> 17, 255) + var15);
            param6 = param6 + param0;
            param5 = param5 + param9;
            param8++;
            param2 = param2 + param1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10_ref = decompiledCaughtException;
          stackIn_8_0 = var10_ref;
          stackIn_8_1 = new StringBuilder().append("hm.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    final static void d(int param0, int param1) {
        mi var2 = uh.field_Wb;
        var2.j(param1, param0 + 120);
        if (param0 != 0) {
          field_F = -89;
        }
        var2.f(1, -83);
        var2.f(2, 78);
    }

    public static void b(boolean param0) {
        field_z = null;
        field_H = null;
        if (!param0) {
          hm.g(-111);
        }
        field_B = null;
        field_C = null;
        field_A = null;
    }

    final static hq a(int param0, boolean param1) {
        hq var2 = new hq();
        mo.field_h.a(var2, !param1 ? true : false);
        if (!param1) {
          field_C = (int[]) null;
        }
        hm.d(0, param0);
        return var2;
    }

    final int[] c(int param0, int param1) {
        int var11 = 0;
        int[] var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int[] var9;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int[] var18;
        int[] var25;
        int[] var26;
        var17 = Vertigo2.field_L ? 1 : 0;
        var18 = this.field_x.a(param0, (byte) -115);
        var3 = var18;
        if (this.field_x.field_i) {
          var7 = this.field_D * h.field_y >> 12;
          var26 = this.a(0, -1, param0 - 1 & fk.field_x);
          var9 = this.a(0, -1, param0);
          var25 = this.a(0, -1, param0 + 1 & fk.field_x);
          for (var11 = 0; we.field_M > var11; var11++) {
            var12 = (var25[var11] - var26[var11]) * var7 >> 12;
            var13 = (var9[-1 + var11 & rm.field_z] - var9[var11 + 1 & rm.field_z]) * var7 >> 12;
            var14 = var13 >> 4;
            if (var14 < 0) {
              var14 = -var14;
            }
            var15 = var12 >> 4;
            if (255 < var14) {
              var14 = 255;
            }
            if (var15 < 0) {
              var15 = -var15;
            }
            if (var15 > 255) {
              var15 = 255;
            }
            var16 = tl.field_b[((1 + var15) * var15 >> 1) + var14] & 255;
            var5 = var12 * var16 >> 8;
            var6 = var16 * 4096 >> 8;
            var4 = var13 * var16 >> 8;
            var4 = var4 * this.field_y[0] >> 12;
            var5 = var5 * this.field_y[1] >> 12;
            var6 = this.field_y[2] * var6 >> 12;
            var18[var11] = var6 + var4 + var5;
          }
        }
        if (param1 <= 91) {
          hm.d(-50, 65);
        }
        return var18;
    }

    private final void h(int param0) {
        double var2 = Math.cos((double)((float)this.field_E / 4096.0f));
        this.field_y[0] = (int)(var2 * Math.sin((double)((float)this.field_G / 4096.0f)) * 4096.0);
        this.field_y[1] = (int)(Math.cos((double)((float)this.field_G / 4096.0f)) * var2 * (double)param0);
        this.field_y[2] = (int)(Math.sin((double)((float)this.field_E / 4096.0f)) * 4096.0);
        int var4 = this.field_y[0] * this.field_y[0] >> 12;
        int var5 = this.field_y[1] * this.field_y[1] >> 12;
        int var6 = this.field_y[2] * this.field_y[2] >> 12;
        int var7 = (int)(4096.0 * Math.sqrt((double)(var4 + var5 + var6 >> 12)));
        if (var7 != 0) {
          this.field_y[2] = (this.field_y[2] << 12) / var7;
          this.field_y[0] = (this.field_y[0] << 12) / var7;
          this.field_y[1] = (this.field_y[1] << 12) / var7;
        }
    }

    static {
        field_z = "Suggest muting this player";
        field_B = "Buying or selling an account";
        field_H = "To Customer Support";
    }
}
