/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kva extends dg {
    private uh field_u;
    private oia[][] field_q;
    static en field_n;
    static String field_r;
    private dpa[][] field_m;
    static jea[] field_p;
    static kea field_s;
    private int field_t;
    private int field_v;
    private int field_o;

    kva(int param0) {
        super(param0);
    }

    final void a(uw param0, int param1) {
        ev var3 = null;
        sva var4 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          if (param1 < 82) {
            this.field_t = 34;
          }
          super.a(param0, 87);
          this.field_q = (oia[][]) null;
          this.field_m = (dpa[][]) null;
          if (null != this.field_u) {
            var3 = param0.a((byte) 59);
            if (var3 instanceof sva) {
              var4 = (sva) (var3);
              var4.b((byte) -105, this.field_u);
            }
            this.field_u = null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("kva.RA(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final ka a(int param0, dpa param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        kh var5 = null;
        ka stackIn_15_0 = null;
        ka stackIn_23_0 = null;
        ka stackIn_25_0 = null;
        ka stackIn_27_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_intLifetime1;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          if (param0 < 90) {
            var5 = (kh) null;
            this.a((byte) -47, (kh) null);
          }
          var3_int = this.field_v;
          if (var3_int != 0 &&
            var3_int == 1) {
            var3_int = param1.field_j;
            if (0 != var3_int) {
              if (var3_int == 1) {
                stackIn_25_0 = df.field_J[91];
                return stackIn_25_0;
              }
              if (var3_int == 2) {
                stackIn_27_0 = df.field_J[92];
                return stackIn_27_0;
              }
              if (var3_int == 3) {
                return null;
              }
            }
            stackIn_23_0 = df.field_J[90];
            return stackIn_23_0;
          }
          var3_intLifetime1 = param1.field_j;
          if (var3_intLifetime1 != 0) {
            if (var3_intLifetime1 == 1) {
              return df.field_J[72];
            }
            if (var3_intLifetime1 == 2) {
              return df.field_J[73];
            }
            if (var3_intLifetime1 == 3) {
              return null;
            }
          }
          stackIn_15_0 = df.field_J[71];
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_31_0 = var3;
          stackIn_31_1 = new StringBuilder().append("kva.PA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    final ka a(dpa param0, int param1) {
        ka stackIn_10_0 = null;
        ka stackIn_12_0 = null;
        ka stackIn_15_0 = null;
        ka stackIn_18_0 = null;
        ka stackIn_21_0 = null;
        ka stackIn_24_0 = null;
        ka stackIn_27_0 = null;
        ka stackIn_30_0 = null;
        ka stackIn_33_0 = null;
        ka stackIn_36_0 = null;
        ka stackIn_38_0 = null;
        ka stackIn_40_0 = null;
        ka stackIn_42_0 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        kh var4 = null;
        try {
          if (param1 != 44) {
            var4 = (kh) null;
            this.a((byte) -87, (kh) null);
          }
          var3_int = param0.field_j;
          if (var3_int != 0) {
            if (1 == var3_int) {
              stackIn_40_0 = df.field_J[29];
              return stackIn_40_0;
            }
            if (var3_int == 2) {
              stackIn_42_0 = df.field_J[30];
              return stackIn_42_0;
            }
            if (var3_int == 3) {
              return null;
            }
          }
          if (param0.field_g) {
            if (param0.field_d >= 50) {
              stackIn_12_0 = df.field_J[114];
              return stackIn_12_0;
            }
            stackIn_10_0 = df.field_J[113];
            return stackIn_10_0;
          }
          if (param0.field_d < 11) {
            stackIn_15_0 = df.field_J[31];
            return stackIn_15_0;
          }
          if (param0.field_d < 22) {
            stackIn_18_0 = df.field_J[32];
            return stackIn_18_0;
          }
          if (33 > param0.field_d) {
            stackIn_21_0 = df.field_J[33];
            return stackIn_21_0;
          }
          if (param0.field_d < 44) {
            stackIn_24_0 = df.field_J[34];
            return stackIn_24_0;
          }
          if (55 > param0.field_d) {
            stackIn_27_0 = df.field_J[35];
            return stackIn_27_0;
          }
          if (param0.field_d < 66) {
            stackIn_30_0 = df.field_J[36];
            return stackIn_30_0;
          }
          if (param0.field_d < 77) {
            stackIn_33_0 = df.field_J[37];
            return stackIn_33_0;
          }
          if (param0.field_d >= 88) {
            stackIn_38_0 = df.field_J[39];
            return stackIn_38_0;
          }
          stackIn_36_0 = df.field_J[38];
          return stackIn_36_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_45_0 = var3;
          stackIn_45_1 = new StringBuilder().append("kva.TA(");
          if (param0 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param1).append(')').toString());
        }
    }

    kva(int param0, la param1, kh param2) {
        super(param0, param1, param2);
    }

    private final void n(byte param0) {
        int var8 = 0;
        int var10 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_105_0 = 0;
        int stackIn_117_0 = 0;
        int stackIn_129_0 = 0;
        int stackIn_141_0 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var9;
        dpa var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        int var25;
        int var26;
        dpa var27;
        dpa var28;
        dpa var29;
        la var30;
        dpa var31;
        var26 = TombRacer.field_G ? 1 : 0;
        var30 = this.a(113);
        var3 = var30.m((byte) -86);
        var4 = var30.s(85);
        var5 = this.field_h.d(3);
        var6 = this.field_h.e(param0 + 9758);
        this.field_o = this.field_h.c(-128) / 2097152;
        this.field_t = this.field_h.a((byte) 55) / 2097152;
        this.field_m = new dpa[this.field_o][this.field_t];
        var7 = -(this.field_h.a((byte) 55) / 2) + (var6 + 1048576);
        if (param0 != -110) {
          var27 = (dpa) null;
          this.a(-101, (dpa) null);
        }
        for (var8 = 0; var8 < this.field_t; var8++) {
          var9 = -(this.field_h.c(-53) / 2) + var5 + 1048576;
          for (var10 = 0; var10 < this.field_o; var10++) {
            var28 = new dpa();
            var29 = var28;
            var31 = var29;
            var11 = var31;
            this.field_m[var10][var8] = var28;
            stackIn_9_0 = (0 >= var10) ? 0 : 1;
            var12 = stackIn_9_0;
            stackIn_12_0 = (-1 + this.field_o <= var10) ? 0 : 1;
            var13 = stackIn_12_0;
            stackIn_15_0 = (var8 <= 0) ? 0 : 1;
            var14 = stackIn_15_0;
            stackIn_18_0 = (-1 + this.field_t <= var8) ? 0 : 1;
            var15 = stackIn_18_0;
            if (var12 == 0) {
              if (2097152 <= var9) {
                stackIn_26_0 = (var30.a(var9 - 2097152, 2097152, var7, 2097152, true, 1, (byte) -101)) ? 1 : 0;
              } else {
                stackIn_26_0 = 1;
              }
            } else {
              stackIn_26_0 = 1;
            }
            var16 = stackIn_26_0;
            if (var13 == 0) {
              if (var9 <= var3 - 2097152) {
                stackIn_34_0 = (var30.a(2097152 + var9, 2097152, var7, 2097152, true, 1, (byte) -86)) ? 1 : 0;
              } else {
                stackIn_34_0 = 1;
              }
            } else {
              stackIn_34_0 = 1;
            }
            var17 = stackIn_34_0;
            if (var14 == 0) {
              if (var7 >= 2097152) {
                stackIn_42_0 = (var30.a(var9, 2097152, -2097152 + var7, 2097152, true, 1, (byte) -44)) ? 1 : 0;
              } else {
                stackIn_42_0 = 1;
              }
            } else {
              stackIn_42_0 = 1;
            }
            var18 = stackIn_42_0;
            if (var15 == 0) {
              if (var7 <= -2097152 + var4) {
                stackIn_50_0 = (var30.a(var9, 2097152, 2097152 + var7, 2097152, true, 1, (byte) 92)) ? 1 : 0;
              } else {
                stackIn_50_0 = 1;
              }
            } else {
              stackIn_50_0 = 1;
            }
            var19 = stackIn_50_0;
            var20 = 0;
            if (var16 != 0) {
              var20++;
            }
            if (var17 != 0) {
              var20++;
            }
            if (var18 != 0) {
              var20++;
            }
            if (var19 != 0) {
              var20++;
            }
            var21 = 0;
            switch (var20) {
              case 4:
                if (var12 != 0 &&
                  var14 != 0) {
                  stackIn_105_0 = 1;
                } else {
                  if (var9 >= 2097152) {
                    if (var7 >= 2097152) {
                      stackIn_105_0 = (var30.a(-2097152 + var9, 2097152, var7 - 2097152, 2097152, true, 1, (byte) -103)) ? 1 : 0;
                    } else {
                      stackIn_105_0 = 1;
                    }
                  } else {
                    stackIn_105_0 = 1;
                  }
                }
                var22 = stackIn_105_0;
                if (var13 != 0 &&
                  var14 != 0) {
                  stackIn_117_0 = 1;
                } else {
                  if (var9 <= -2097152 + var3) {
                    if (var7 >= 2097152) {
                      stackIn_117_0 = (var30.a(2097152 + var9, 2097152, var7 - 2097152, 2097152, true, 1, (byte) 114)) ? 1 : 0;
                    } else {
                      stackIn_117_0 = 1;
                    }
                  } else {
                    stackIn_117_0 = 1;
                  }
                }
                var23 = stackIn_117_0;
                if (var12 != 0 &&
                  var15 != 0) {
                  stackIn_129_0 = 1;
                } else {
                  if (var9 >= 2097152) {
                    if (var7 <= -2097152 + var4) {
                      stackIn_129_0 = (var30.a(var9 - 2097152, 2097152, var7 + 2097152, 2097152, true, 1, (byte) 126)) ? 1 : 0;
                    } else {
                      stackIn_129_0 = 1;
                    }
                  } else {
                    stackIn_129_0 = 1;
                  }
                }
                var24 = stackIn_129_0;
                if (var13 != 0 &&
                  var15 != 0) {
                  stackIn_141_0 = 1;
                } else {
                  if (var9 <= var3 - 2097152) {
                    if (var7 <= -2097152 + var4) {
                      stackIn_141_0 = (var30.a(2097152 + var9, 2097152, var7 + 2097152, 2097152, true, 1, (byte) 77)) ? 1 : 0;
                    } else {
                      stackIn_141_0 = 1;
                    }
                  } else {
                    stackIn_141_0 = 1;
                  }
                }
                var25 = stackIn_141_0;
                if (var22 != 0 &&
                  var23 != 0 &&
                  var24 != 0 &&
                  var25 != 0) {
                  var29.field_j = 3;
                } else {
                  if (var22 != 0) {
                    if (var24 == 0) {
                      var21 = 0;
                    } else {
                      var21 = (var23 != 0) ? -512 : 1024;
                    }
                  } else {
                    var21 = 512;
                  }
                  var31.field_j = 2;
                }
                break;
              case 3:
                var31.field_j = 0;
                if (var18 != 0) {
                  if (var19 != 0) {
                    if (var17 == 0) {
                      var31.field_g = var30.a(2097152 + var9, 2097152, var7, 2097152, true, 0, (byte) -88);
                      var21 = -512;
                    } else {
                      var31.field_g = var30.a(var9 - 2097152, 2097152, var7, 2097152, true, 0, (byte) 108);
                      var21 = 512;
                    }
                  } else {
                    var21 = 0;
                    var31.field_g = var30.a(var9, 2097152, 2097152 + var7, 2097152, true, 0, (byte) -52);
                  }
                } else {
                  var31.field_g = var30.a(var9, 2097152, -2097152 + var7, 2097152, true, 0, (byte) -20);
                  var21 = 1024;
                }
                break;
              case 2:
                if (var18 == 0 &&
                  var19 == 0) {
                  var31.field_j = 3;
                } else {
                  if (var16 == 0 &&
                    var17 == 0) {
                    var31.field_j = 3;
                  } else {
                    var31.field_f = var31.field_f - 512;
                    if (var16 == 0 &&
                      var18 == 0) {
                      var21 = 512;
                    } else {
                      if (var16 == 0 &&
                        var19 == 0) {
                        var21 = 0;
                        var31.field_j = 1;
                        break;
                      }
                      if (var17 == 0 &&
                        var18 == 0) {
                        var21 = 1024;
                        var31.field_j = 1;
                        break;
                      }
                      if (var17 == 0 &&
                        var19 == 0) {
                        var21 = -512;
                        var31.field_j = 1;
                        break;
                      }
                    }
                    var31.field_j = 1;
                  }
                }
                break;
              default:
                var29.field_j = 3;
                break;
            }
            var31.field_d = var30.e(true).a(100, param0 + 110);
            var31.field_f = dfa.a(var21 + ku.field_j[var31.field_j], 2048, param0 ^ -57);
            var31.field_a = -var6 + var7;
            var31.field_i = -var5 + var9;
            var31.field_e = this;
            var22 = 0;
            var23 = 80;
            var24 = 80;
            while (var23 > var22) {
              var22 = var22 + var24;
              var11.field_b = var11.b(53);
              var11.field_b.field_h = var22;
              var11 = var11.field_b;
            }
            var9 = var9 + 2097152;
          }
          var7 = var7 + 2097152;
        }
    }

    final int m(byte param0) {
        if (param0 >= -63) {
          return -93;
        }
        return 0;
    }

    final void a(byte param0, kh param1) {
        try {
          int var3_int = -114 % ((param0 + 8) / 40);
          super.a((byte) -68, param1);
          param1.a((byte) -127, this.field_v, 2);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "kva.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void h(int param0) {
        int var2 = 0;
        int var3 = 0;
        dpa var4 = null;
        int var5 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        if (param0 < 0) {
          this.field_o = 122;
        }
        super.h(70);
        if (null == this.field_m) {
          return;
        }
        for (var2 = 0; this.field_o > var2; var2++) {
          for (var3 = 0; var3 < this.field_t; var3++) {
            var4 = this.field_m[var2][var3];
            var5 = ku.field_j[var4.field_j];
            var4.field_f = dfa.a(-var4.field_f + var5, 2048, 93);
            var4.field_i = -var4.field_i;
          }
        }
    }

    final int k(byte param0) {
        if (param0 != -99) {
          field_r = (String) null;
        }
        return 2;
    }

    final void a(int param0, uw param1, byte param2) {
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        dpa var6 = null;
        int var7 = 0;
        int var8 = 0;
        dpa var9 = null;
        int var4_intLifetime1;
        int var5Lifetime1;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          if (this.field_m != null) {
            for (var4_int = 0; this.field_o > var4_int; var4_int++) {
              for (var5 = 0; var5 < this.field_t; var5++) {
                var9 = this.field_m[var4_int][var5];
                var6 = var9;
                if (var9 != null &&
                  var9.field_j != 3) {
                  while (var6 != null) {
                    param1.a(param0, var6, (byte) -33);
                    var6 = var6.field_b;
                  }
                }
              }
            }
          }
          if (this.field_q != null) {
            for (var4_intLifetime1 = 0; this.field_o > var4_intLifetime1; var4_intLifetime1++) {
              var8 = 0;
              var5Lifetime1 = var8;
              while (var8 < this.field_t) {
                if (this.field_q[var4_intLifetime1][var8] != null) {
                  param1.a(0, this.field_q[var4_intLifetime1][var8], (byte) -33);
                }
                var8++;
              }
            }
          }
          if (param2 <= 40) {
            field_s = (kea) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_29_0 = var4;
          stackIn_29_1 = new StringBuilder().append("kva.FA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param2).append(')').toString());
        }
    }

    final int f(byte param0) {
        int var2 = 89 / ((param0 - 15) / 45);
        return 1;
    }

    public static void i(int param0) {
        field_n = null;
        int var1 = -43 / ((param0 + 84) / 37);
        field_s = null;
        field_p = null;
        field_r = null;
    }

    final void a(iq param0, int param1, int param2, int param3, byte param4) {
        try {
          int var6_int = -76 / ((param4 + 38) / 47);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "kva.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final ka a(byte param0, oia param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        ka stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 102 / ((param0 + 68) / 49);
          var7 = this.field_v;
          if (var7 == 0) {
            return null;
          }
          if (1 != var7) {
            return null;
          }
          var4 = param1.b((byte) 111) / 2097152 % 3;
          var5 = param1.c((byte) 102) / 2097152 % 3;
          var6 = 3 * var5 + (80 + var4);
          stackIn_6_0 = df.field_J[var6];
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("kva.SA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void a(int param0, la param1, kh param2) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param0 <= 119) {
            this.f((byte) -126);
          }
          super.a(122, param1, param2);
          if (param1.field_E >= 19) {
            this.field_v = param2.b((byte) 44, 2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("kva.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    private final void j(int param0) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        oia var8 = null;
        int var9 = TombRacer.field_G ? 1 : 0;
        int var2 = this.field_h.d(3);
        int var3 = this.field_h.e(param0 - 211);
        if (param0 != 9859) {
          return;
        }
        this.field_q = new oia[this.field_o][this.field_t];
        int var4 = -(this.field_h.a((byte) 55) / 2) + var3 + 1048576;
        for (var5 = 0; this.field_t > var5; var5++) {
          var6 = 1048576 + (var2 - this.field_h.c(-100) / 2);
          for (var7 = 0; var7 < this.field_o; var7++) {
            var8 = new oia();
            this.field_q[var7][var5] = var8;
            var8.field_c = this;
            var8.field_b = var4 - var3;
            var8.field_a = var6 - var2;
            var6 = var6 + 2097152;
          }
          var4 = var4 + 2097152;
        }
    }

    final void a(byte param0, int param1, uw param2) {
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        dpa var6 = null;
        int var7 = 0;
        int var8 = 0;
        dpa var9 = null;
        int var4_intLifetime1;
        int var5Lifetime1;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          if (null != this.field_m) {
            for (var4_int = 0; this.field_o > var4_int; var4_int++) {
              for (var5 = 0; var5 < this.field_t; var5++) {
                var9 = this.field_m[var4_int][var5];
                var6 = var9;
                if (var9 != null &&
                  var9.field_j != 3) {
                  while (var6 != null) {
                    param2.a((byte) -5, param1, var6);
                    var6 = var6.field_b;
                  }
                }
              }
            }
          }
          if (null != this.field_q) {
            for (var4_intLifetime1 = 0; var4_intLifetime1 < this.field_o; var4_intLifetime1++) {
              var8 = 0;
              var5Lifetime1 = var8;
              while (this.field_t > var8) {
                if (null != this.field_q[var4_intLifetime1][var8]) {
                  param2.a((byte) 17, 0, this.field_q[var4_intLifetime1][var8]);
                }
                var8++;
              }
            }
          }
          if (param0 < 50) {
            this.k((byte) 96);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_28_0 = var4;
          stackIn_28_1 = new StringBuilder().append("kva.V(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    final void b(int param0, uw param1) {
        aga var6 = null;
        ev var4 = null;
        sva var5 = null;
        try {
          if (null == this.field_m) {
            this.n((byte) -110);
          }
          if (this.field_q == null) {
            this.j(9859);
          }
          if (this.field_v == 1) {
            var6 = new aga(tga.field_a, 0, 0, 0, 0, 16720418, 200, 8);
            this.field_u = new uh(var6);
            this.field_u.a(-17825792 + this.e((byte) -118) + 4194304, (byte) 95, this.c((byte) 108), this.b((byte) 84));
            var4 = param1.a((byte) 59);
            if (var4 instanceof sva) {
              var5 = (sva) (var4);
              var5.a((byte) 45, this.field_u);
            }
          }
          super.b(param0 + param0, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "kva.WA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, int param1) {
        this.field_v = param1;
        if (param0 != 2097152) {
          this.field_u = (uh) null;
        }
    }

    static {
        field_r = "Wandering walls";
        field_s = new kea();
    }
}
