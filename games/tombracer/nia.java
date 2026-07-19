/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nia extends ci {
    static String field_m;

    final int[] c(int param0, int param1) {
        int[] var3 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int var23 = 0;
        int var24 = 0;
        var9 = TombRacer.field_G ? 1 : 0;
        var10 = this.field_i.a((byte) 23, param1);
        var3 = var10;
        if (this.field_i.field_d) {
          var22 = this.c(0, -39, param1);
          var21 = this.c(1, -74, param1);
          var20 = this.c(2, -7, param1);
          var7 = 0;
          L0: while (true) {
            L1: {
              if (ns.field_g <= var7) {
                break L1;
              } else {
                var8 = var20[var7];
                var24 = var8 ^ -1;
                var23 = -4097;
                if (var9 != 0) {
                  if (var23 != var24) {
                    return (int[]) null;
                  } else {
                    var10 = var3;
                    return var10;
                  }
                } else {
                  L2: {
                    L3: {
                      if (var23 == var24) {
                        break L3;
                      } else {
                        L4: {
                          var10 = var3;
                          if (var8 == 0) {
                            break L4;
                          } else {
                            var10[var7] = var21[var7] * (4096 - var8) + var8 * var22[var7] >> -996530996;
                            if (var9 == 0) {
                              break L2;
                            } else {
                              break L4;
                            }
                          }
                        }
                        var10 = var3;
                        var10[var7] = var21[var7];
                        if (var9 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var10 = var3;
                    var10[var7] = var22[var7];
                    break L2;
                  }
                  var7++;
                  if (var9 == 0) {
                    continue L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            if (param0 != 1) {
              return (int[]) null;
            } else {
              return var10;
            }
          }
        } else {
          if (param0 != 1) {
            return (int[]) null;
          } else {
            return var10;
          }
        }
    }

    final int[][] b(int param0, int param1) {
        int[][] var3 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int[][] var20 = null;
        int[][] var21 = null;
        int[][] var31 = null;
        int[] var34 = null;
        int[] var35 = null;
        int[] var36 = null;
        int[] var37 = null;
        int[] var38 = null;
        int[] var39 = null;
        int[] var40 = null;
        int[] var43 = null;
        int[] var44 = null;
        int[] var45 = null;
        int[] var46 = null;
        int[] var47 = null;
        int[] var48 = null;
        int[] var49 = null;
        int[][] var59 = null;
        int[][] var60 = null;
        int[][] var61 = null;
        int[][] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int[] var65 = null;
        int[] var66 = null;
        int[] var67 = null;
        int[] var68 = null;
        int[] var69 = null;
        var19 = TombRacer.field_G ? 1 : 0;
        if (param1 == -1) {
          var31 = this.field_h.a(param0, (byte) 113);
          var21 = var31;
          var20 = var21;
          var3 = var20;
          if (this.field_h.field_f) {
            var63 = this.c(2, -104, param0);
            var61 = this.a(param0, 0, -1);
            var62 = this.a(param0, 1, param1 + 0);
            var7 = var31[0];
            var8 = var31[1];
            var9 = var31[2];
            var64 = var61[0];
            var65 = var61[1];
            var66 = var61[2];
            var67 = var62[0];
            var68 = var62[1];
            var69 = var62[2];
            var16 = 0;
            L0: while (true) {
              if (var16 < ns.field_g) {
                L1: {
                  L2: {
                    var17 = var63[var16];
                    if (4096 != var17) {
                      break L2;
                    } else {
                      var7[var16] = var64[var16];
                      var8[var16] = var65[var16];
                      var9[var16] = var66[var16];
                      if (var19 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L3: {
                    if (0 == var17) {
                      break L3;
                    } else {
                      var18 = 4096 + -var17;
                      var7[var16] = var17 * var64[var16] - -(var67[var16] * var18) >> 1744457964;
                      var8[var16] = var18 * var68[var16] + var17 * var65[var16] >> 1406100780;
                      var9[var16] = var18 * var69[var16] + var66[var16] * var17 >> -1506313140;
                      if (var19 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var7[var16] = var67[var16];
                  var8[var16] = var68[var16];
                  var9[var16] = var69[var16];
                  break L1;
                }
                var16++;
                if (var19 == 0) {
                  continue L0;
                } else {
                  return var20;
                }
              } else {
                return var20;
              }
            }
          } else {
            return var20;
          }
        } else {
          nia.d(86);
          var31 = this.field_h.a(param0, (byte) 113);
          var21 = var31;
          var20 = var21;
          var3 = var20;
          if (this.field_h.field_f) {
            var43 = this.c(2, -104, param0);
            var34 = var43;
            var59 = this.a(param0, 0, -1);
            var60 = this.a(param0, 1, param1 + 0);
            var7 = var31[0];
            var8 = var31[1];
            var9 = var31[2];
            var44 = var59[0];
            var35 = var44;
            var45 = var59[1];
            var36 = var45;
            var46 = var59[2];
            var37 = var46;
            var47 = var60[0];
            var38 = var47;
            var48 = var60[1];
            var39 = var48;
            var49 = var60[2];
            var40 = var49;
            var16 = 0;
            L4: while (true) {
              if (var16 < ns.field_g) {
                L5: {
                  L6: {
                    var44 = var59[0];
                    var17 = var43[var16];
                    if (4096 != var17) {
                      break L6;
                    } else {
                      var7[var16] = var44[var16];
                      var8[var16] = var45[var16];
                      var9[var16] = var46[var16];
                      if (var19 == 0) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  L7: {
                    var44 = var59[0];
                    if (0 == var17) {
                      break L7;
                    } else {
                      var18 = 4096 + -var17;
                      var7[var16] = var17 * var44[var16] - -(var47[var16] * var18) >> 1744457964;
                      var8[var16] = var18 * var48[var16] + var17 * var45[var16] >> 1406100780;
                      var9[var16] = var18 * var49[var16] + var46[var16] * var17 >> -1506313140;
                      if (var19 == 0) {
                        break L5;
                      } else {
                        break L7;
                      }
                    }
                  }
                  var7[var16] = var47[var16];
                  var8[var16] = var48[var16];
                  var9[var16] = var49[var16];
                  break L5;
                }
                var16++;
                if (var19 == 0) {
                  continue L4;
                } else {
                  return var20;
                }
              } else {
                return var20;
              }
            }
          } else {
            return var20;
          }
        }
    }

    final static iu a(cn param0, String param1, String param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        iu stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        iu stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var4_int = param0.b(param1, -7768);
            var6 = 88 / ((-9 - param3) / 60);
            var5 = param0.a(true, param2, var4_int);
            stackOut_0_0 = ot.a(var4_int, var5, param0, true);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var4);
            stackOut_2_1 = new StringBuilder().append("nia.D(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ')');
        }
        return stackIn_1_0;
    }

    public nia() {
        super(3, false);
    }

    final static void d(int param0) {
        iu discarded$2 = null;
        String var2 = null;
        tga.field_a = baa.field_d.field_i.field_d;
        tga.field_a.b(8192);
        iga.field_o = uja.a((byte) 65, tga.field_a);
        sw.k((byte) 94);
        hm.h((byte) 45);
        if (param0 != -25405) {
          var2 = (String) null;
          discarded$2 = nia.a((cn) null, (String) null, (String) null, 78);
          rka.a(false);
          ina.a(tga.field_a, 0);
          ob.a(tga.field_a, 17186);
          wpa.a(tga.field_a, -90);
          return;
        } else {
          rka.a(false);
          ina.a(tga.field_a, 0);
          ob.a(tga.field_a, 17186);
          wpa.a(tga.field_a, -90);
          return;
        }
    }

    final static String a(byte[] param0, int param1, int param2, int param3) {
        String discarded$4 = null;
        int incrementValue$5 = 0;
        char[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        byte[] var10 = null;
        char[] var11 = null;
        char[] var12 = null;
        char[] var13 = null;
        String stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_15_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 == 255) {
                break L1;
              } else {
                var10 = (byte[]) null;
                discarded$4 = nia.a((byte[]) null, -10, 68, 102);
                break L1;
              }
            }
            var13 = new char[param2];
            var12 = var13;
            var11 = var12;
            var4 = var11;
            var5 = 0;
            var6 = 0;
            L2: while (true) {
              if (param2 <= var6) {
                stackOut_15_0 = new String(var13, 0, var5);
                stackIn_16_0 = stackOut_15_0;
                break L0;
              } else {
                L3: {
                  L4: {
                    var7 = 255 & param0[var6 + param1];
                    if (var7 != 0) {
                      break L4;
                    } else {
                      if (var9 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (-129 < (var7 ^ -1)) {
                      break L5;
                    } else {
                      if (var7 >= 160) {
                        break L5;
                      } else {
                        L6: {
                          var8 = gha.field_a[var7 - 128];
                          if (0 != var8) {
                            break L6;
                          } else {
                            var8 = 63;
                            break L6;
                          }
                        }
                        var7 = var8;
                        break L5;
                      }
                    }
                  }
                  incrementValue$5 = var5;
                  var5++;
                  var11[incrementValue$5] = (char)var7;
                  break L3;
                }
                var6++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var4_ref);
            stackOut_17_1 = new StringBuilder().append("nia.C(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L7;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L7;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_16_0;
    }

    final void a(byte param0, uia param1, int param2) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (param2 != 0) {
                break L1;
              } else {
                L2: {
                  stackOut_1_0 = this;
                  stackIn_3_0 = stackOut_1_0;
                  stackIn_2_0 = stackOut_1_0;
                  if ((param1.h(255) ^ -1) != -2) {
                    stackOut_3_0 = this;
                    stackOut_3_1 = 0;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    break L2;
                  } else {
                    stackOut_2_0 = this;
                    stackOut_2_1 = 1;
                    stackIn_4_0 = stackOut_2_0;
                    stackIn_4_1 = stackOut_2_1;
                    break L2;
                  }
                }
                ((nia) (this)).field_g = stackIn_4_1 != 0;
                break L1;
              }
            }
            L3: {
              if (param0 == 107) {
                break L3;
              } else {
                field_m = (String) null;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var4);
            stackOut_8_1 = new StringBuilder().append("nia.A(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ')');
        }
    }

    public static void c(int param0) {
        if (param0 > -118) {
            field_m = (String) null;
            field_m = null;
            return;
        }
        field_m = null;
    }

    static {
        field_m = "Invalid date";
    }
}
