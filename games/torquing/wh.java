/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wh extends am {
    static int field_x;
    static sm[] field_t;
    static String[] field_z;
    static int field_s;
    static int field_w;
    private boolean field_A;
    static String field_u;
    private int field_v;
    static int[] field_y;

    final static String a(int param0, byte param1) {
        StringBuilder discarded$3 = null;
        int var6 = Torquing.field_u;
        if (!(param0 >= 0)) {
            param0 = 0;
        }
        int var2 = (999 + param0) / 1000;
        int var3 = var2 / 60;
        var2 = var2 % 60;
        int var4 = 16 / ((-66 - param1) / 52);
        StringBuilder var5 = new StringBuilder(5);
        StringBuilder discarded$0 = var5.append((char)(48 - -(var2 % 10)));
        StringBuilder discarded$1 = var5.append((char)(48 + var2 / 10));
        StringBuilder discarded$2 = var5.append(':');
        do {
            discarded$3 = var5.append((char)(48 + var3 % 10));
            var3 = var3 / 10;
        } while (var3 > 0);
        return db.a(var5.toString(), 31108);
    }

    final void a(fj param0, int param1, int param2) {
        int[][] discarded$1 = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var5 = Torquing.field_u;
        try {
          L0: {
            L1: {
              var4_int = param2;
              if (-1 == (var4_int ^ -1)) {
                this.field_v = param0.i(param1 ^ 7059);
                break L1;
              } else {
                if (-2 != (var4_int ^ -1)) {
                  break L1;
                } else {
                  L2: {
                    stackOut_5_0 = this;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (-2 != (param0.i((byte) -101) ^ -1)) {
                      stackOut_7_0 = this;
                      stackOut_7_1 = 0;
                      stackIn_8_0 = stackOut_7_0;
                      stackIn_8_1 = stackOut_7_1;
                      break L2;
                    } else {
                      stackOut_6_0 = this;
                      stackOut_6_1 = 1;
                      stackIn_8_0 = stackOut_6_0;
                      stackIn_8_1 = stackOut_6_1;
                      break L2;
                    }
                  }
                  ((wh) (this)).field_A = stackIn_8_1 != 0;
                  break L1;
                }
              }
            }
            L3: {
              if (param1 == 35) {
                break L3;
              } else {
                discarded$1 = this.a(-19, 115);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var4);
            stackOut_12_1 = new StringBuilder().append("wh.H(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void g(byte param0) {
        if (param0 < 86) {
            wh.b(104);
        }
        field_t = null;
        field_u = null;
        field_y = null;
        field_z = null;
    }

    final int[][] a(int param0, int param1) {
        int[][] var3 = null;
        int[] var5 = null;
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
        int[][] var22 = null;
        int[][] var23 = null;
        int[][] var29 = null;
        int[] var40 = null;
        int[] var41 = null;
        int[] var42 = null;
        int[] var43 = null;
        int[] var44 = null;
        L0: {
          var21 = Torquing.field_u;
          if (param0 == -29116) {
            break L0;
          } else {
            field_t = (sm[]) null;
            break L0;
          }
        }
        L1: {
          var29 = this.field_r.a(15142, param1);
          var23 = var29;
          var22 = var23;
          var3 = var22;
          if (this.field_r.field_b) {
            var40 = this.b(param0 + 29116, 0, vp.field_I & param1 - 1);
            var5 = this.b(0, 0, param1);
            var41 = this.b(0, 0, vp.field_I & param1 - -1);
            var42 = var29[0];
            var43 = var29[1];
            var44 = var29[2];
            var10 = 0;
            L2: while (true) {
              if (var10 >= ci.field_c) {
                break L1;
              } else {
                L3: {
                  var14 = this.field_v * (-var40[var10] + var41[var10]);
                  var15 = (var5[jh.field_A & var10 + 1] - var5[var10 + -1 & jh.field_A]) * this.field_v;
                  var16 = var15 >> -819595412;
                  var17 = var14 >> 957691148;
                  var18 = var16 * var16 >> 332158284;
                  var19 = var17 * var17 >> -1797864884;
                  var20 = (int)(Math.sqrt((double)((float)(var19 + var18 + 4096) / 4096.0f)) * 4096.0);
                  if (-1 == (var20 ^ -1)) {
                    var13 = 0;
                    var11 = 0;
                    var12 = 0;
                    break L3;
                  } else {
                    var11 = var15 / var20;
                    var12 = var14 / var20;
                    var13 = 16777216 / var20;
                    break L3;
                  }
                }
                L4: {
                  if (this.field_A) {
                    var12 = 2048 - -(var12 >> -1814227007);
                    var13 = 2048 - -(var13 >> 836068001);
                    var11 = 2048 - -(var11 >> -762267295);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var42[var10] = var11;
                var43[var10] = var12;
                var44[var10] = var13;
                var10++;
                continue L2;
              }
            }
          } else {
            break L1;
          }
        }
        return var22;
    }

    final static void b(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        h var4_ref_h = null;
        int var4 = 0;
        qk var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        df var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = Torquing.field_u;
        try {
          L0: {
            L1: {
              if (param0 >= 85) {
                break L1;
              } else {
                wh.a(0, -125, 67, -97, -50, -52);
                break L1;
              }
            }
            L2: {
              var10 = kj.field_d;
              var2 = var10.i((byte) -101);
              var3 = var10.i((byte) -101);
              if (-1 != (var2 ^ -1)) {
                if (var2 == 1) {
                  var4 = var10.g((byte) -126);
                  var5 = (qk) ((Object) kc.field_z.b(0));
                  L3: while (true) {
                    L4: {
                      if (var5 == null) {
                        break L4;
                      } else {
                        L5: {
                          if (var5.field_k != var3) {
                            break L5;
                          } else {
                            if (var5.field_o != var4) {
                              break L5;
                            } else {
                              break L4;
                            }
                          }
                        }
                        var5 = (qk) ((Object) kc.field_z.f(-24059));
                        continue L3;
                      }
                    }
                    if (var5 != null) {
                      var5.f(0);
                      break L2;
                    } else {
                      ih.b(true);
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                } else {
                  nn.a("LR1: " + me.a(-1), (Throwable) null, -9958);
                  ih.b(true);
                  break L2;
                }
              } else {
                var4_ref_h = (h) ((Object) to.field_s.b(0));
                if (var4_ref_h != null) {
                  L6: {
                    var5_int = -var10.field_n + oo.field_a;
                    var12 = var4_ref_h.field_k;
                    var11 = var12;
                    var6 = var11;
                    if (var5_int > var12.length << -1592443038) {
                      var5_int = var12.length << 1596787554;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  var7 = 0;
                  L7: while (true) {
                    if (var7 >= var5_int) {
                      var4_ref_h.field_n = true;
                      var4_ref_h.f(0);
                      break L2;
                    } else {
                      var6[var7 >> -1098411454] = var6[var7 >> -1098411454] + (var10.i((byte) -101) << ie.a(768, var7 << -718339416));
                      var7++;
                      continue L7;
                    }
                  }
                } else {
                  ih.b(true);
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var1), "wh.E(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
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
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var25 = Torquing.field_u;
        try {
          L0: {
            var6_int = 0;
            var7 = param4;
            var8 = param2 * param2;
            var9 = param4 * param4;
            var10 = var9 << 2134152833;
            var11 = var8 << 1360761473;
            var12 = param4 << 1581020257;
            var13 = var10 + var8 * (-var12 + 1);
            var14 = -((-1 + var12) * var11) + var9;
            var15 = var8 << -1111137022;
            var16 = var9 << -1051049182;
            var17 = (3 + (var6_int << 990224545)) * var10;
            var18 = ((var7 << -49778943) - 3) * var11;
            var19 = (1 + var6_int) * var16;
            if (param1 == -1817) {
              di.a(param3 + -param2, (byte) 108, param0, qd.field_a[param5], param3 + param2);
              var20 = (-1 + var7) * var15;
              L1: while (true) {
                if (0 >= var7) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    if (0 <= var13) {
                      break L2;
                    } else {
                      L3: while (true) {
                        if ((var13 ^ -1) <= -1) {
                          break L2;
                        } else {
                          var14 = var14 + var19;
                          var13 = var13 + var17;
                          var6_int++;
                          var19 = var19 + var16;
                          var17 = var17 + var16;
                          continue L3;
                        }
                      }
                    }
                  }
                  L4: {
                    if (var14 >= 0) {
                      break L4;
                    } else {
                      var14 = var14 + var19;
                      var13 = var13 + var17;
                      var6_int++;
                      var17 = var17 + var16;
                      var19 = var19 + var16;
                      break L4;
                    }
                  }
                  var14 = var14 + -var18;
                  var13 = var13 + -var20;
                  var20 = var20 - var15;
                  var18 = var18 - var15;
                  var7--;
                  var21 = param5 + -var7;
                  var22 = param5 - -var7;
                  var23 = param3 + var6_int;
                  var24 = -var6_int + param3;
                  di.a(var24, (byte) 114, param0, qd.field_a[var21], var23);
                  di.a(var24, (byte) 37, param0, qd.field_a[var22], var23);
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var6), "wh.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public wh() {
        super(1, false);
        this.field_v = 4096;
        this.field_A = true;
    }

    final static void a(int param0, int param1, byte[] param2, int param3, int param4, int param5, int[] param6, byte param7, int param8, int param9, int param10, int[] param11) {
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        RuntimeException var12 = null;
        int var12_int = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var16 = Torquing.field_u;
        try {
          L0: {
            L1: {
              var12_int = 256 + -param4;
              var13 = -param3;
              if (param7 == 29) {
                break L1;
              } else {
                wh.g((byte) -10);
                break L1;
              }
            }
            L2: while (true) {
              if ((var13 ^ -1) <= -1) {
                break L0;
              } else {
                var14 = -param10;
                L3: while (true) {
                  if (-1 >= (var14 ^ -1)) {
                    param1 = param1 + param8;
                    param9 = param9 + param5;
                    var13++;
                    continue L2;
                  } else {
                    L4: {
                      incrementValue$2 = param1;
                      param1++;
                      param0 = param2[incrementValue$2];
                      if (param0 == 0) {
                        param9++;
                        break L4;
                      } else {
                        var15 = param6[param9];
                        incrementValue$3 = param9;
                        param9++;
                        param6[incrementValue$3] = ie.a(16711680, var12_int * ie.a(var15, 65280)) + ie.a(ie.a(16711935, var15) * var12_int, -16711936) >> -1611374008;
                        break L4;
                      }
                    }
                    var14++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var12 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var12);
            stackOut_12_1 = new StringBuilder().append("wh.D(").append(param0).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          L6: {
            stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param6 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          L7: {
            stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param11 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L7;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
    }

    static {
        field_s = 0;
        field_x = 0;
    }
}
