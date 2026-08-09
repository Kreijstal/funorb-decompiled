/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class km extends od {
    private ci[] field_l;
    private ci field_r;
    private ci field_k;
    private ci field_m;
    static fta field_p;
    static String field_n;
    private int[] field_o;
    private int[] field_q;

    final boolean a(cn param0, d param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 <= gla.field_m) {
                var4_int = 0;
                L2: while (true) {
                  if (var4_int >= this.field_q.length) {
                    break L1;
                  } else {
                    if (!param0.a(gla.field_m, (byte) -106, this.field_q[var4_int])) {
                      stackIn_13_0 = 0;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var4_int++;
                      continue L2;
                    }
                  }
                }
              } else {
                var4_int = 0;
                L3: while (true) {
                  if (var4_int >= this.field_q.length) {
                    break L1;
                  } else {
                    if (param0.a(-15121, this.field_q[var4_int])) {
                      var4_int++;
                      continue L3;
                    } else {
                      stackIn_6_0 = 0;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                }
              }
            }
            var4_int = 0;
            L4: while (true) {
              if (var4_int >= this.field_o.length) {
                stackIn_23_0 = 1;
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                if (!param1.a(this.field_o[var4_int], (byte) 105)) {
                  stackIn_20_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var4_int++;
                  continue L4;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var4);

            stackIn_26_1 = new StringBuilder().append("km.C(");

            if (param0 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L5;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');

            if (param1 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L6;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L6;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_27_0), stackIn_30_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_20_0 != 0;
            } else {
              return stackIn_23_0 != 0;
            }
          }
        }
    }

    public static void a(int param0) {
        field_p = null;
        field_n = null;
        if (param0 > -95) {
            field_p = (fta) null;
        }
    }

    final float[] a(d param0, byte param1, int param2, int param3, boolean param4, cn param5) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        float[] stackIn_32_0 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        StringBuilder stackIn_38_1 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        float[] var7 = null;
        RuntimeException var7_ref = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var10_ref_int__ = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15_ref_int__ = null;
        int[][] var15_ref_int____ = null;
        int var15 = 0;
        float var16 = 0.0f;
        float var17 = 0.0f;
        int var18 = 0;
        int[][] var19 = null;
        float[] var20 = null;
        int var21 = 0;
        int[][] var22 = null;
        int[][] var23 = null;
        var18 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            qw.field_j = param0;
            np.field_m = param5;
            var7_int = 0;
            L1: while (true) {
              if (this.field_l.length <= var7_int) {
                uta.a(0, param2, param3);
                var20 = new float[4 * param2 * param3];
                var7 = var20;
                var8 = 0;
                var9 = 0;
                L2: while (true) {
                  if (var9 >= param2) {
                    var10 = -41 / ((-67 - param1) / 38);
                    var21 = 0;
                    var9 = var21;
                    L3: while (true) {
                      if (var21 >= this.field_l.length) {
                        stackIn_32_0 = (float[]) (var7);
                        break L0;
                      } else {
                        this.field_l[var21].b(-54);
                        var21++;
                        continue L3;
                      }
                    }
                  } else {
                    L4: {
                      if (this.field_k.field_g) {
                        var15_ref_int__ = this.field_k.c(1, var9);
                        var10_ref_int__ = var15_ref_int__;
                        var11 = var15_ref_int__;
                        var12 = var15_ref_int__;
                        break L4;
                      } else {
                        var23 = this.field_k.b(var9, -1);
                        var22 = var23;
                        var19 = var22;
                        var15_ref_int____ = var19;
                        var11 = var23[1];
                        var12 = var23[2];
                        var10_ref_int__ = var23[0];
                        break L4;
                      }
                    }
                    L5: {
                      if (this.field_r.field_g) {
                        var13 = this.field_r.c(1, var9);
                        break L5;
                      } else {
                        var13 = this.field_r.b(var9, -1)[0];
                        break L5;
                      }
                    }
                    L6: {
                      if (!param4) {
                        break L6;
                      } else {
                        var8 = var9 << 170449506;
                        break L6;
                      }
                    }
                    L7: {
                      if (this.field_m.field_g) {
                        var14 = this.field_m.c(1, var9);
                        break L7;
                      } else {
                        var14 = this.field_m.b(var9, -1)[0];
                        break L7;
                      }
                    }
                    var15 = param3 + -1;
                    L8: while (true) {
                      if (var15 < 0) {
                        var9++;
                        continue L2;
                      } else {
                        L9: {
                          var16 = (float)var13[var15] / 4096.0f;
                          if (0.0f <= var16) {
                            if (1.0f < var16) {
                              var16 = 1.0f;
                              break L9;
                            } else {
                              break L9;
                            }
                          } else {
                            var16 = 0.0f;
                            break L9;
                          }
                        }
                        var17 = (1.0f + (float)var14[var15] * 31.0f / 4096.0f) / 4096.0f;
                        incrementValue$0 = var8;
                        var8++;
                        var20[incrementValue$0] = var17 * (float)var10_ref_int__[var15];
                        incrementValue$1 = var8;
                        var8++;
                        var20[incrementValue$1] = var17 * (float)var11[var15];
                        incrementValue$2 = var8;
                        var8++;
                        var20[incrementValue$2] = (float)var12[var15] * var17;
                        incrementValue$3 = var8;
                        var8++;
                        var20[incrementValue$3] = var16;
                        if (param4) {
                          var8 = var8 + ((param3 << 627931138) - 4);
                          var15--;
                          continue L8;
                        } else {
                          var15--;
                          continue L8;
                        }
                      }
                    }
                  }
                }
              } else {
                this.field_l[var7_int].b(param3, param2, -256);
                var7_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var7_ref = decompiledCaughtException;
            stackIn_35_0 = (RuntimeException) (var7_ref);

            stackIn_35_1 = new StringBuilder().append("km.D(");

            if (param0 == null) {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L10;
            } else {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_38_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_36_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "null";
              break L11;
            } else {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "{...}";
              break L11;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_36_0), stackIn_39_2 + ')');
        }
        return stackIn_32_0;
    }

    final int[] a(int param0, cn param1, boolean param2, double param3, d param4, byte param5, int param6, boolean param7) {
        int incrementValue$0 = 0;
        int[] stackIn_6_0 = null;
        int[] stackIn_46_0 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        StringBuilder stackIn_52_1 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        int[] var10 = null;
        RuntimeException var10_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19_ref_int__ = null;
        int[][] var19_ref_int____ = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int[][] var25 = null;
        int[] var26 = null;
        int var27 = 0;
        int[][] var28 = null;
        int[][] var29 = null;
        var24 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            qw.field_j = param4;
            np.field_m = param1;
            var10_int = 0;
            L1: while (true) {
              if (this.field_l.length <= var10_int) {
                if (param5 >= 17) {
                  L2: {
                    js.a(param3, -256);
                    uta.a(0, param0, param6);
                    var26 = new int[param6 * param0];
                    var10 = var26;
                    if (param2) {
                      var13 = -1;
                      var11 = param6 + -1;
                      var12 = -1;
                      break L2;
                    } else {
                      var12 = param6;
                      var11 = 0;
                      var13 = 1;
                      break L2;
                    }
                  }
                  var14 = 0;
                  var15 = 0;
                  L3: while (true) {
                    if (var15 >= param0) {
                      var27 = 0;
                      var15 = var27;
                      L4: while (true) {
                        if (var27 >= this.field_l.length) {
                          stackIn_46_0 = (int[]) (var10);
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          this.field_l[var27].b(-50);
                          var27++;
                          continue L4;
                        }
                      }
                    } else {
                      L5: {
                        if (this.field_k.field_g) {
                          var19_ref_int__ = this.field_k.c(1, var15);
                          var16 = var19_ref_int__;
                          var18 = var19_ref_int__;
                          var17 = var19_ref_int__;
                          break L5;
                        } else {
                          var29 = this.field_k.b(var15, -1);
                          var28 = var29;
                          var25 = var28;
                          var19_ref_int____ = var25;
                          var16 = var29[0];
                          var17 = var29[1];
                          var18 = var29[2];
                          break L5;
                        }
                      }
                      L6: {
                        if (!param7) {
                          break L6;
                        } else {
                          var14 = var15;
                          break L6;
                        }
                      }
                      var19 = var11;
                      L7: while (true) {
                        if (var19 == var12) {
                          var15++;
                          continue L3;
                        } else {
                          L8: {
                            var20 = var16[var19] >> 410727716;
                            if (-256 > (var20 ^ -1)) {
                              var20 = 255;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          L9: {
                            if ((var20 ^ -1) <= -1) {
                              break L9;
                            } else {
                              var20 = 0;
                              break L9;
                            }
                          }
                          L10: {
                            var21 = var17[var19] >> -1637273468;
                            if (-256 > (var21 ^ -1)) {
                              var21 = 255;
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          L11: {
                            if (-1 >= (var21 ^ -1)) {
                              break L11;
                            } else {
                              var21 = 0;
                              break L11;
                            }
                          }
                          L12: {
                            var22 = var18[var19] >> -1660820348;
                            if (255 >= var22) {
                              break L12;
                            } else {
                              var22 = 255;
                              break L12;
                            }
                          }
                          L13: {
                            if ((var22 ^ -1) > -1) {
                              var22 = 0;
                              break L13;
                            } else {
                              break L13;
                            }
                          }
                          L14: {
                            var20 = sk.field_c[var20];
                            var21 = sk.field_c[var21];
                            var22 = sk.field_c[var22];
                            var23 = var22 + ((var21 << 1281366568) + (var20 << 238148688));
                            if (0 != var23) {
                              var23 = var23 | -16777216;
                              break L14;
                            } else {
                              break L14;
                            }
                          }
                          L15: {
                            incrementValue$0 = var14;
                            var14++;
                            var26[incrementValue$0] = var23;
                            if (param7) {
                              var14 = var14 + (-1 + param6);
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                          var19 = var19 + var13;
                          continue L7;
                        }
                      }
                    }
                  }
                } else {
                  stackIn_6_0 = (int[]) null;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                this.field_l[var10_int].b(param6, param0, -256);
                var10_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var10_ref = decompiledCaughtException;
            stackIn_49_0 = (RuntimeException) (var10_ref);

            stackIn_49_1 = new StringBuilder().append("km.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_50_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackIn_50_2 = "null";
              break L16;
            } else {
              stackIn_50_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackIn_50_2 = "{...}";
              break L16;
            }
          }
          L17: {


            stackIn_52_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_50_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_50_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackIn_53_2 = "null";
              break L17;
            } else {
              stackIn_50_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackIn_53_2 = "{...}";
              break L17;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_50_0), stackIn_53_2 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return stackIn_46_0;
        }
    }

    km(uia param0) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int[] array$2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[][] var12 = null;
        ci var13 = null;
        ci var14 = null;
        ci var15 = null;
        try {
          L0: {
            var2_int = param0.h(255);
            var3 = 0;
            var4 = 0;
            this.field_l = new ci[var2_int];
            var12 = new int[var2_int][];
            var6 = 0;
            L1: while (true) {
              if (var6 >= var2_int) {
                this.field_q = new int[var3];
                this.field_o = new int[var4];
                var3 = 0;
                var4 = 0;
                var6 = 0;
                L2: while (true) {
                  if (var2_int <= var6) {
                    this.field_k = this.field_l[param0.h(255)];
                    this.field_r = this.field_l[param0.h(255)];
                    var5 = (int[][]) null;
                    this.field_m = this.field_l[param0.h(255)];
                    break L0;
                  } else {
                    var15 = this.field_l[var6];
                    var8 = var15.field_j.length;
                    var9 = 0;
                    L3: while (true) {
                      if (var8 <= var9) {
                        L4: {
                          var9 = var15.a(100);
                          var10 = var15.c((byte) -117);
                          if ((var9 ^ -1) >= -1) {
                            break L4;
                          } else {
                            incrementValue$0 = var3;
                            var3++;
                            this.field_q[incrementValue$0] = var9;
                            break L4;
                          }
                        }
                        L5: {
                          if (0 >= var10) {
                            break L5;
                          } else {
                            incrementValue$1 = var4;
                            var4++;
                            this.field_o[incrementValue$1] = var10;
                            break L5;
                          }
                        }
                        var12[var6] = null;
                        var6++;
                        continue L2;
                      } else {
                        var15.field_j[var9] = this.field_l[var12[var6][var9]];
                        var9++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                L6: {
                  var13 = aw.a(param0, 0);
                  var14 = var13;
                  if (var14.a(125) < 0) {
                    break L6;
                  } else {
                    var3++;
                    break L6;
                  }
                }
                L7: {
                  if (-1 < (var14.c((byte) -117) ^ -1)) {
                    break L7;
                  } else {
                    var4++;
                    break L7;
                  }
                }
                var8 = var14.field_j.length;
                array$2 = new int[var8];
                var12[var6] = array$2;
                var9 = 0;
                L8: while (true) {
                  if (var8 <= var9) {
                    this.field_l[var6] = var13;
                    var6++;
                    continue L1;
                  } else {
                    var12[var6][var9] = param0.h(255);
                    var9++;
                    continue L8;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var2);

            stackIn_25_1 = new StringBuilder().append("km.<init>(");

            if (param0 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L9;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L9;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
    }

    final int[] a(int param0, boolean param1, int param2, double param3, cn param4, d param5, boolean param6) {
        int incrementValue$0 = 0;
        int[] stackIn_52_0 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        StringBuilder stackIn_58_1 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_59_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        int[] var9 = null;
        RuntimeException var9_ref = null;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[][] var15 = null;
        int[] var15_array = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int[][] var22 = null;
        int[] var23 = null;
        int var24 = 0;
        int[][] var25 = null;
        int[][] var26 = null;
        var21 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            qw.field_j = param5;
            np.field_m = param4;
            var9_int = 0;
            L1: while (true) {
              if (this.field_l.length <= var9_int) {
                L2: {
                  js.a(param3, -256);
                  uta.a(0, param2, param0);
                  if (!param6) {
                    break L2;
                  } else {
                    this.field_m = (ci) null;
                    break L2;
                  }
                }
                var9 = new int[param0 * param2];
                var10 = 0;
                var11 = 0;
                L3: while (true) {
                  if (param2 <= var11) {
                    var24 = 0;
                    var11 = var24;
                    L4: while (true) {
                      if (var24 >= this.field_l.length) {
                        stackIn_52_0 = (int[]) (var9);
                        break L0;
                      } else {
                        this.field_l[var24].b(-126);
                        var24++;
                        continue L4;
                      }
                    }
                  } else {
                    L5: {
                      if (!this.field_k.field_g) {
                        var26 = this.field_k.b(var11, -1);
                        var25 = var26;
                        var22 = var25;
                        var15 = var22;
                        var13 = var26[1];
                        var12 = var26[0];
                        var14 = var26[2];
                        break L5;
                      } else {
                        var23 = this.field_k.c(1, var11);
                        var15_array = var23;
                        var14 = var23;
                        var12 = var23;
                        var13 = var23;
                        break L5;
                      }
                    }
                    L6: {
                      if (this.field_r.field_g) {
                        var15_array = this.field_r.c(1, var11);
                        break L6;
                      } else {
                        var15_array = this.field_r.b(var11, -1)[0];
                        break L6;
                      }
                    }
                    L7: {
                      if (!param1) {
                        break L7;
                      } else {
                        var10 = var11;
                        break L7;
                      }
                    }
                    var16 = -1 + param0;
                    L8: while (true) {
                      if (-1 < (var16 ^ -1)) {
                        var11++;
                        continue L3;
                      } else {
                        L9: {
                          var17 = var12[var16] >> 1855972;
                          if (-256 > (var17 ^ -1)) {
                            var17 = 255;
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        L10: {
                          if (0 > var17) {
                            var17 = 0;
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        L11: {
                          var18 = var13[var16] >> 103167844;
                          if ((var18 ^ -1) >= -256) {
                            break L11;
                          } else {
                            var18 = 255;
                            break L11;
                          }
                        }
                        L12: {
                          if (0 <= var18) {
                            break L12;
                          } else {
                            var18 = 0;
                            break L12;
                          }
                        }
                        L13: {
                          var19 = var14[var16] >> 1420546980;
                          if (-256 <= (var19 ^ -1)) {
                            break L13;
                          } else {
                            var19 = 255;
                            break L13;
                          }
                        }
                        L14: {
                          var17 = sk.field_c[var17];
                          var18 = sk.field_c[var18];
                          if (var19 >= 0) {
                            break L14;
                          } else {
                            var19 = 0;
                            break L14;
                          }
                        }
                        L15: {
                          L16: {
                            var19 = sk.field_c[var19];
                            if (-1 != (var17 ^ -1)) {
                              break L16;
                            } else {
                              if (var18 != 0) {
                                break L16;
                              } else {
                                if (var19 == 0) {
                                  var20 = 0;
                                  break L15;
                                } else {
                                  break L16;
                                }
                              }
                            }
                          }
                          L17: {
                            var20 = var15_array[var16] >> -1446832988;
                            if ((var20 ^ -1) < -256) {
                              var20 = 255;
                              break L17;
                            } else {
                              break L17;
                            }
                          }
                          if (-1 < (var20 ^ -1)) {
                            var20 = 0;
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                        L18: {
                          incrementValue$0 = var10;
                          var10++;
                          var9[incrementValue$0] = var19 + ((var18 << 1514685224) + ((var17 << -1006888912) + (var20 << -2094779528)));
                          if (param1) {
                            var10 = var10 + (param0 + -1);
                            break L18;
                          } else {
                            break L18;
                          }
                        }
                        var16--;
                        continue L8;
                      }
                    }
                  }
                }
              } else {
                this.field_l[var9_int].b(param0, param2, -256);
                var9_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var9_ref = decompiledCaughtException;
            stackIn_55_0 = (RuntimeException) (var9_ref);

            stackIn_55_1 = new StringBuilder().append("km.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackIn_56_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackIn_56_2 = "null";
              break L19;
            } else {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackIn_56_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackIn_56_2 = "{...}";
              break L19;
            }
          }
          L20: {


            stackIn_58_1 = ((StringBuilder) (Object) stackIn_56_1).append(stackIn_56_2).append(',');

            if (param5 == null) {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackIn_59_1 = (StringBuilder) ((Object) stackIn_58_1);
              stackIn_59_2 = "null";
              break L20;
            } else {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackIn_59_1 = (StringBuilder) ((Object) stackIn_58_1);
              stackIn_59_2 = "{...}";
              break L20;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_56_0), stackIn_59_2 + ',' + param6 + ')');
        }
        return stackIn_52_0;
    }

    static {
        field_n = "LASER stands for Light Amplification by Stimulated Emission of Radiation. Misuse of a LASER can turn a PLAYER into TOAST.";
    }
}
