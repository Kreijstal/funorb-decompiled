/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lra extends fh {
    private le field_m;
    static String field_o;
    private int[] field_n;
    private int[] field_l;
    private le[] field_q;
    private le field_k;
    private le field_p;

    final float[] a(int param0, int param1, d param2, boolean param3, asb param4, int param5) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        float[] stackIn_33_0 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        StringBuilder stackIn_39_1 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        float[] var7 = null;
        RuntimeException var7_ref = null;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
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
        var18 = VoidHunters.field_G;
        try {
          L0: {
            qnb.field_o = param4;
            nl.field_e = param2;
            var7_int = 0;
            L1: while (true) {
              if (this.field_q.length <= var7_int) {
                hr.a(param5, param1, -116);
                var20 = new float[4 * (param1 * param5)];
                var7 = var20;
                var8 = 0;
                var9 = 0;
                L2: while (true) {
                  if (var9 >= param5) {
                    var21 = 0;
                    var9 = var21;
                    L3: while (true) {
                      if (var21 >= this.field_q.length) {
                        L4: {
                          if (param0 == 2) {
                            break L4;
                          } else {
                            lra.a(false);
                            break L4;
                          }
                        }
                        stackIn_33_0 = (float[]) (var7);
                        break L0;
                      } else {
                        this.field_q[var21].c(-36);
                        var21++;
                        continue L3;
                      }
                    }
                  } else {
                    L5: {
                      if (this.field_m.field_g) {
                        var15_ref_int__ = this.field_m.a(var9, true);
                        var12 = var15_ref_int__;
                        var11 = var15_ref_int__;
                        var10 = var15_ref_int__;
                        break L5;
                      } else {
                        var23 = this.field_m.a(255, var9);
                        var22 = var23;
                        var19 = var22;
                        var15_ref_int____ = var19;
                        var11 = var23[1];
                        var10 = var23[0];
                        var12 = var23[2];
                        break L5;
                      }
                    }
                    L6: {
                      if (this.field_p.field_g) {
                        var13 = this.field_p.a(var9, true);
                        break L6;
                      } else {
                        var13 = this.field_p.a(255, var9)[0];
                        break L6;
                      }
                    }
                    L7: {
                      if (!param3) {
                        break L7;
                      } else {
                        var8 = var9 << -300082078;
                        break L7;
                      }
                    }
                    L8: {
                      if (this.field_k.field_g) {
                        var14 = this.field_k.a(var9, true);
                        break L8;
                      } else {
                        var14 = this.field_k.a(255, var9)[0];
                        break L8;
                      }
                    }
                    var15 = param1 - 1;
                    L9: while (true) {
                      if (0 > var15) {
                        var9++;
                        continue L2;
                      } else {
                        L10: {
                          var16 = (float)var13[var15] / 4096.0f;
                          var17 = (31.0f * (float)var14[var15] / 4096.0f + 1.0f) / 4096.0f;
                          if (0.0f > var16) {
                            var16 = 0.0f;
                            break L10;
                          } else {
                            if (1.0f >= var16) {
                              break L10;
                            } else {
                              var16 = 1.0f;
                              break L10;
                            }
                          }
                        }
                        incrementValue$0 = var8;
                        var8++;
                        var20[incrementValue$0] = var17 * (float)var10[var15];
                        incrementValue$1 = var8;
                        var8++;
                        var20[incrementValue$1] = (float)var11[var15] * var17;
                        incrementValue$2 = var8;
                        var8++;
                        var20[incrementValue$2] = (float)var12[var15] * var17;
                        incrementValue$3 = var8;
                        var8++;
                        var20[incrementValue$3] = var16;
                        if (param3) {
                          var8 = var8 + (-4 + (param1 << -341523294));
                          var15--;
                          continue L9;
                        } else {
                          var15--;
                          continue L9;
                        }
                      }
                    }
                  }
                }
              } else {
                this.field_q[var7_int].b(-9163, param1, param5);
                var7_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var7_ref = decompiledCaughtException;
            stackIn_36_0 = (RuntimeException) (var7_ref);

            stackIn_36_1 = new StringBuilder().append("lra.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "null";
              break L11;
            } else {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_39_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_37_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "null";
              break L12;
            } else {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "{...}";
              break L12;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_37_0), stackIn_40_2 + ',' + param5 + ')');
        }
        return stackIn_33_0;
    }

    final boolean a(int param0, asb param1, d param2) {
        int var4_int = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (dbb.field_o >= 0) {
                var4_int = 0;
                L2: while (true) {
                  if (var4_int >= this.field_n.length) {
                    break L1;
                  } else {
                    if (!param1.a((byte) 67, this.field_n[var4_int], dbb.field_o)) {
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
                  if (var4_int >= this.field_n.length) {
                    break L1;
                  } else {
                    if (param1.a(this.field_n[var4_int], true)) {
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
            var4_int = param0;
            L4: while (true) {
              if (var4_int >= this.field_l.length) {
                stackIn_22_0 = 1;
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                if (param2.a(this.field_l[var4_int], (byte) -84)) {
                  var4_int++;
                  continue L4;
                } else {
                  stackIn_19_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var4);

            stackIn_25_1 = new StringBuilder().append("lra.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L5;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_28_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');

            if (param2 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L6;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L6;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_26_0), stackIn_29_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_19_0 != 0;
            } else {
              return stackIn_22_0 != 0;
            }
          }
        }
    }

    final int[] a(int param0, boolean param1, int param2, boolean param3, asb param4, d param5, double param6) {
        int incrementValue$0 = 0;
        int[] stackIn_51_0 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        StringBuilder stackIn_57_1 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_58_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        int[] var9 = null;
        RuntimeException var9_ref = null;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[][] var15_array = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        d var22 = null;
        int[][] var23 = null;
        int[] var24 = null;
        int var25 = 0;
        int[][] var26 = null;
        int[][] var27 = null;
        var21 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                var22 = (d) null;
                this.a(45, (asb) null, (d) null);
                break L1;
              }
            }
            nl.field_e = param5;
            qnb.field_o = param4;
            var9_int = 0;
            L2: while (true) {
              if (this.field_q.length <= var9_int) {
                igb.a(true, param6);
                hr.a(param2, param0, -99);
                var9 = new int[param2 * param0];
                var10 = 0;
                var11 = 0;
                L3: while (true) {
                  if (param2 <= var11) {
                    var25 = 0;
                    var11 = var25;
                    L4: while (true) {
                      if (this.field_q.length <= var25) {
                        stackIn_51_0 = (int[]) (var9);
                        break L0;
                      } else {
                        this.field_q[var25].c(-72);
                        var25++;
                        continue L4;
                      }
                    }
                  } else {
                    L5: {
                      if (this.field_m.field_g) {
                        var24 = this.field_m.a(var11, true);
                        var15 = var24;
                        var14 = var24;
                        var13 = var24;
                        var12 = var24;
                        break L5;
                      } else {
                        var27 = this.field_m.a(255, var11);
                        var26 = var27;
                        var23 = var26;
                        var15_array = var23;
                        var12 = var27[0];
                        var14 = var27[2];
                        var13 = var27[1];
                        break L5;
                      }
                    }
                    L6: {
                      if (!param3) {
                        break L6;
                      } else {
                        var10 = var11;
                        break L6;
                      }
                    }
                    L7: {
                      if (this.field_p.field_g) {
                        var15 = this.field_p.a(var11, true);
                        break L7;
                      } else {
                        var15 = this.field_p.a(255, var11)[0];
                        break L7;
                      }
                    }
                    var16 = -1 + param0;
                    L8: while (true) {
                      if (var16 < 0) {
                        var11++;
                        continue L3;
                      } else {
                        L9: {
                          var17 = var12[var16] >> 759779108;
                          if (255 >= var17) {
                            break L9;
                          } else {
                            var17 = 255;
                            break L9;
                          }
                        }
                        L10: {
                          if ((var17 ^ -1) > -1) {
                            var17 = 0;
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        L11: {
                          var18 = var13[var16] >> 1494761604;
                          if (255 < var18) {
                            var18 = 255;
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                        L12: {
                          if ((var18 ^ -1) <= -1) {
                            break L12;
                          } else {
                            var18 = 0;
                            break L12;
                          }
                        }
                        L13: {
                          var19 = var14[var16] >> -1941117884;
                          if (255 >= var19) {
                            break L13;
                          } else {
                            var19 = 255;
                            break L13;
                          }
                        }
                        L14: {
                          var17 = pp.field_o[var17];
                          var18 = pp.field_o[var18];
                          if ((var19 ^ -1) > -1) {
                            var19 = 0;
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                        L15: {
                          L16: {
                            var19 = pp.field_o[var19];
                            if (var17 != 0) {
                              break L16;
                            } else {
                              if (var18 != 0) {
                                break L16;
                              } else {
                                if (-1 == (var19 ^ -1)) {
                                  var20 = 0;
                                  break L15;
                                } else {
                                  break L16;
                                }
                              }
                            }
                          }
                          L17: {
                            var20 = var15[var16] >> -646953148;
                            if ((var20 ^ -1) >= -256) {
                              break L17;
                            } else {
                              var20 = 255;
                              break L17;
                            }
                          }
                          if (var20 >= 0) {
                            break L15;
                          } else {
                            var20 = 0;
                            break L15;
                          }
                        }
                        L18: {
                          incrementValue$0 = var10;
                          var10++;
                          var9[incrementValue$0] = (var17 << 1784557616) + (var20 << 786413304) - -(var18 << 81684200) + var19;
                          if (param3) {
                            var10 = var10 + (param0 - 1);
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
                this.field_q[var9_int].b(-9163, param0, param2);
                var9_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var9_ref = decompiledCaughtException;
            stackIn_54_0 = (RuntimeException) (var9_ref);

            stackIn_54_1 = new StringBuilder().append("lra.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_55_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackIn_55_2 = "null";
              break L19;
            } else {
              stackIn_55_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackIn_55_2 = "{...}";
              break L19;
            }
          }
          L20: {


            stackIn_57_1 = ((StringBuilder) (Object) stackIn_55_1).append(stackIn_55_2).append(',');

            if (param5 == null) {
              stackIn_55_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackIn_58_1 = (StringBuilder) ((Object) stackIn_57_1);
              stackIn_58_2 = "null";
              break L20;
            } else {
              stackIn_55_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackIn_58_1 = (StringBuilder) ((Object) stackIn_57_1);
              stackIn_58_2 = "{...}";
              break L20;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_55_0), stackIn_58_2 + ',' + param6 + ')');
        }
        return stackIn_51_0;
    }

    final int[] a(boolean param0, d param1, asb param2, int param3, boolean param4, int param5, double param6, int param7) {
        int[][] dupTemp$0 = null;
        int incrementValue$1 = 0;
        int[] stackIn_43_0 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        StringBuilder stackIn_49_1 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
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
        int[][] var19_ref_int____ = null;
        int[] var19_ref_int__ = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int[][] var25 = null;
        int[] var26 = null;
        int var27 = 0;
        var24 = VoidHunters.field_G;
        try {
          L0: {
            qnb.field_o = param2;
            nl.field_e = param1;
            var10_int = 0;
            L1: while (true) {
              if (this.field_q.length <= var10_int) {
                L2: {
                  igb.a(true, param6);
                  hr.a(param7, param5, -128);
                  var26 = new int[param5 * param7];
                  var10 = var26;
                  if (!param0) {
                    var12 = param5;
                    var13 = 1;
                    var11 = 0;
                    break L2;
                  } else {
                    var13 = -1;
                    var12 = -1;
                    var11 = -1 + param5;
                    break L2;
                  }
                }
                var14 = 0;
                var15 = 0;
                L3: while (true) {
                  if (var15 >= param7) {
                    var27 = param3;
                    var15 = var27;
                    L4: while (true) {
                      if (this.field_q.length <= var27) {
                        stackIn_43_0 = (int[]) (var10);
                        break L0;
                      } else {
                        this.field_q[var27].c(-91);
                        var27++;
                        continue L4;
                      }
                    }
                  } else {
                    L5: {
                      if (param4) {
                        var14 = var15;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    L6: {
                      if (!this.field_m.field_g) {
                        dupTemp$0 = this.field_m.a(255, var15);
                        var25 = dupTemp$0;
                        var19_ref_int____ = dupTemp$0;
                        var17 = var25[1];
                        var16 = var25[0];
                        var18 = var25[2];
                        break L6;
                      } else {
                        var19_ref_int__ = this.field_m.a(var15, true);
                        var16 = var19_ref_int__;
                        var17 = var19_ref_int__;
                        var18 = var19_ref_int__;
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
                          var20 = var16[var19] >> 2109647748;
                          if ((var20 ^ -1) < -256) {
                            var20 = 255;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        L9: {
                          if (-1 < (var20 ^ -1)) {
                            var20 = 0;
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        L10: {
                          var21 = var17[var19] >> 727160068;
                          if (-256 > (var21 ^ -1)) {
                            var21 = 255;
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        L11: {
                          if (0 <= var21) {
                            break L11;
                          } else {
                            var21 = 0;
                            break L11;
                          }
                        }
                        L12: {
                          var22 = var18[var19] >> 1734755364;
                          if (var22 > 255) {
                            var22 = 255;
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                        L13: {
                          if (0 <= var22) {
                            break L13;
                          } else {
                            var22 = 0;
                            break L13;
                          }
                        }
                        L14: {
                          var20 = pp.field_o[var20];
                          var21 = pp.field_o[var21];
                          var22 = pp.field_o[var22];
                          var23 = var22 + (var20 << 1092891696) - -(var21 << 1184712264);
                          if (-1 == (var23 ^ -1)) {
                            break L14;
                          } else {
                            var23 = var23 | -16777216;
                            break L14;
                          }
                        }
                        L15: {
                          incrementValue$1 = var14;
                          var14++;
                          var26[incrementValue$1] = var23;
                          if (!param4) {
                            break L15;
                          } else {
                            var14 = var14 + (param5 - 1);
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
                this.field_q[var10_int].b(-9163, param5, param7);
                var10_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var10_ref = decompiledCaughtException;
            stackIn_46_0 = (RuntimeException) (var10_ref);

            stackIn_46_1 = new StringBuilder().append("lra.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_47_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackIn_47_2 = "null";
              break L16;
            } else {
              stackIn_47_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackIn_47_2 = "{...}";
              break L16;
            }
          }
          L17: {


            stackIn_49_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_47_2).append(',');

            if (param2 == null) {
              stackIn_47_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackIn_50_2 = "null";
              break L17;
            } else {
              stackIn_47_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackIn_50_2 = "{...}";
              break L17;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_47_0), stackIn_50_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
        return stackIn_43_0;
    }

    lra(ds param0) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int[] array$2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
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
        le var13 = null;
        le var14 = null;
        le var15 = null;
        try {
          L0: {
            var2_int = param0.e((byte) -120);
            var3 = 0;
            var4 = 0;
            var12 = new int[var2_int][];
            this.field_q = new le[var2_int];
            var6 = 0;
            L1: while (true) {
              if (var2_int <= var6) {
                this.field_n = new int[var3];
                var3 = 0;
                this.field_l = new int[var4];
                var4 = 0;
                var6 = 0;
                L2: while (true) {
                  if (var2_int <= var6) {
                    this.field_m = this.field_q[param0.e((byte) -114)];
                    this.field_p = this.field_q[param0.e((byte) -90)];
                    var5 = (int[][]) null;
                    this.field_k = this.field_q[param0.e((byte) -108)];
                    break L0;
                  } else {
                    var15 = this.field_q[var6];
                    var8 = var15.field_e.length;
                    var9 = 0;
                    L3: while (true) {
                      if (var8 <= var9) {
                        L4: {
                          var9 = var15.a(-1);
                          var10 = var15.d((byte) 77);
                          if (0 >= var9) {
                            break L4;
                          } else {
                            incrementValue$0 = var3;
                            var3++;
                            this.field_n[incrementValue$0] = var9;
                            break L4;
                          }
                        }
                        L5: {
                          if ((var10 ^ -1) >= -1) {
                            break L5;
                          } else {
                            incrementValue$1 = var4;
                            var4++;
                            this.field_l[incrementValue$1] = var10;
                            break L5;
                          }
                        }
                        var12[var6] = null;
                        var6++;
                        continue L2;
                      } else {
                        var15.field_e[var9] = this.field_q[var12[var6][var9]];
                        var9++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                L6: {
                  var13 = sk.a(param0, (byte) 55);
                  var14 = var13;
                  if (-1 >= (var14.a(-1) ^ -1)) {
                    var3++;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (var14.d((byte) 81) < 0) {
                    break L7;
                  } else {
                    var4++;
                    break L7;
                  }
                }
                var8 = var14.field_e.length;
                array$2 = new int[var8];
                var12[var6] = array$2;
                var9 = 0;
                L8: while (true) {
                  if (var8 <= var9) {
                    this.field_q[var6] = var13;
                    var6++;
                    continue L1;
                  } else {
                    var12[var6][var9] = param0.e((byte) -125);
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
            stackIn_27_0 = (RuntimeException) (var2);

            stackIn_27_1 = new StringBuilder().append("lra.<init>(");

            if (param0 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L9;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L9;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
    }

    public static void a(boolean param0) {
        field_o = null;
        if (!param0) {
            lra.a(false);
        }
    }

    static {
        field_o = "This game has started.";
    }
}
