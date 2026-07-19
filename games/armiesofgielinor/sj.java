/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj {
    private int field_c;
    static wj field_a;
    int field_h;
    static String field_b;
    private int[] field_f;
    static String field_g;
    private boolean field_i;
    static int field_e;
    static int field_d;

    final void a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_46_0 = 0;
        int stackIn_46_1 = 0;
        int stackIn_48_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        int stackOut_45_0 = 0;
        int stackOut_45_1 = 0;
        byte stackOut_47_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        byte stackOut_24_0 = 0;
        var14 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (this.field_i) {
          var4 = 0;
          var5 = qn.field_l * param0 - -param1;
          var6 = qn.field_l + -cm.field_b;
          var12 = 0;
          L0: while (true) {
            L1: {
              L2: {
                if (ac.field_m <= var12) {
                  break L2;
                } else {
                  stackOut_31_0 = 0;
                  stackIn_48_0 = stackOut_31_0;
                  stackIn_32_0 = stackOut_31_0;
                  if (var14 != 0) {
                    break L1;
                  } else {
                    var13 = stackIn_32_0;
                    L3: while (true) {
                      L4: {
                        L5: {
                          if (var13 >= cm.field_b) {
                            break L5;
                          } else {
                            var7 = vg.field_q[0].field_B[var4];
                            var11 = var7 >>> -550106088;
                            stackOut_34_0 = 0;
                            stackOut_34_1 = var11;
                            stackIn_46_0 = stackOut_34_0;
                            stackIn_46_1 = stackOut_34_1;
                            stackIn_35_0 = stackOut_34_0;
                            stackIn_35_1 = stackOut_34_1;
                            if (var14 != 0) {
                              break L4;
                            } else {
                              L6: {
                                if (stackIn_35_0 == stackIn_35_1) {
                                  break L6;
                                } else {
                                  L7: {
                                    if (var11 >= 255) {
                                      break L7;
                                    } else {
                                      L8: {
                                        if (this.field_h >= this.field_f[var4]) {
                                          var7 = vg.field_q[1].field_B[var4];
                                          var11 = var7 >>> -1276099368;
                                          break L8;
                                        } else {
                                          break L8;
                                        }
                                      }
                                      var8 = 16711935 & var7;
                                      var9 = var7 & 65280;
                                      var7 = 256 - var11;
                                      var8 = var8 * var7;
                                      var9 = var9 * var7;
                                      var7 = qn.field_d[var5];
                                      var10 = var7 & 16711935;
                                      var10 = var10 * var11;
                                      var9 = var9 + var9;
                                      var8 = var8 + var10;
                                      var8 = var8 & -16711936;
                                      var9 = var9 & 16711680;
                                      qn.field_d[var5] = oe.c(var9, var8) >>> 1113347688;
                                      if (var14 == 0) {
                                        break L6;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                  L9: {
                                    if (this.field_f[var4] > this.field_h) {
                                      break L9;
                                    } else {
                                      var7 = vg.field_q[1].field_B[var4];
                                      break L9;
                                    }
                                  }
                                  qn.field_d[var5] = var7;
                                  break L6;
                                }
                              }
                              var4++;
                              var13++;
                              var5++;
                              if (var14 == 0) {
                                continue L3;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        var12++;
                        stackOut_45_0 = var5;
                        stackOut_45_1 = var6;
                        stackIn_46_0 = stackOut_45_0;
                        stackIn_46_1 = stackOut_45_1;
                        break L4;
                      }
                      var5 = stackIn_46_0 + stackIn_46_1;
                      if (var14 == 0) {
                        continue L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              tr.field_z.b(384, 2464, param1 - -(cm.field_b >> 2024903585) << 1904174884, param0 + (ac.field_m >> 1648665153) << -1765359900, this.field_h * 65535 / this.field_c, 1024);
              stackOut_47_0 = param2;
              stackIn_48_0 = stackOut_47_0;
              break L1;
            }
            if (stackIn_48_0 != 121) {
              this.a(false, -122, (byte) -12);
              return;
            } else {
              return;
            }
          }
        } else {
          vg.field_q[0].g(param1, param0);
          if (var14 != 0) {
            var4 = 0;
            var5 = qn.field_l * param0 - -param1;
            var6 = qn.field_l + -cm.field_b;
            var12 = 0;
            L10: while (true) {
              L11: {
                L12: {
                  if (ac.field_m <= var12) {
                    break L12;
                  } else {
                    stackOut_8_0 = 0;
                    stackIn_25_0 = stackOut_8_0;
                    stackIn_9_0 = stackOut_8_0;
                    if (var14 != 0) {
                      break L11;
                    } else {
                      var13 = stackIn_9_0;
                      L13: while (true) {
                        L14: {
                          L15: {
                            if (var13 >= cm.field_b) {
                              break L15;
                            } else {
                              var7 = vg.field_q[0].field_B[var4];
                              var11 = var7 >>> -550106088;
                              stackOut_11_0 = 0;
                              stackOut_11_1 = var11;
                              stackIn_23_0 = stackOut_11_0;
                              stackIn_23_1 = stackOut_11_1;
                              stackIn_12_0 = stackOut_11_0;
                              stackIn_12_1 = stackOut_11_1;
                              if (var14 != 0) {
                                break L14;
                              } else {
                                L16: {
                                  if (stackIn_12_0 == stackIn_12_1) {
                                    break L16;
                                  } else {
                                    L17: {
                                      if (var11 >= 255) {
                                        break L17;
                                      } else {
                                        L18: {
                                          if (this.field_h >= this.field_f[var4]) {
                                            var7 = vg.field_q[1].field_B[var4];
                                            var11 = var7 >>> -1276099368;
                                            break L18;
                                          } else {
                                            break L18;
                                          }
                                        }
                                        var8 = 16711935 & var7;
                                        var9 = var7 & 65280;
                                        var7 = 256 - var11;
                                        var8 = var8 * var7;
                                        var9 = var9 * var7;
                                        var7 = qn.field_d[var5];
                                        var10 = var7 & 16711935;
                                        var10 = var10 * var11;
                                        var9 = var9 + var9;
                                        var8 = var8 + var10;
                                        var8 = var8 & -16711936;
                                        var9 = var9 & 16711680;
                                        qn.field_d[var5] = oe.c(var9, var8) >>> 1113347688;
                                        if (var14 == 0) {
                                          break L16;
                                        } else {
                                          break L17;
                                        }
                                      }
                                    }
                                    L19: {
                                      if (this.field_f[var4] > this.field_h) {
                                        break L19;
                                      } else {
                                        var7 = vg.field_q[1].field_B[var4];
                                        break L19;
                                      }
                                    }
                                    qn.field_d[var5] = var7;
                                    break L16;
                                  }
                                }
                                var4++;
                                var13++;
                                var5++;
                                if (var14 == 0) {
                                  continue L13;
                                } else {
                                  break L15;
                                }
                              }
                            }
                          }
                          var12++;
                          stackOut_22_0 = var5;
                          stackOut_22_1 = var6;
                          stackIn_23_0 = stackOut_22_0;
                          stackIn_23_1 = stackOut_22_1;
                          break L14;
                        }
                        var5 = stackIn_23_0 + stackIn_23_1;
                        if (var14 == 0) {
                          continue L10;
                        } else {
                          break L12;
                        }
                      }
                    }
                  }
                }
                tr.field_z.b(384, 2464, param1 - -(cm.field_b >> 2024903585) << 1904174884, param0 + (ac.field_m >> 1648665153) << -1765359900, this.field_h * 65535 / this.field_c, 1024);
                stackOut_24_0 = param2;
                stackIn_25_0 = stackOut_24_0;
                break L11;
              }
              if (stackIn_25_0 == 121) {
                return;
              } else {
                this.a(false, -122, (byte) -12);
                return;
              }
            }
          } else {
            tr.field_z.b(384, 2464, param1 - -(cm.field_b >> 2024903585) << 1904174884, param0 + (ac.field_m >> 1648665153) << -1765359900, this.field_h * 65535 / this.field_c, 1024);
            if (param2 != 121) {
              this.a(false, -122, (byte) -12);
              return;
            } else {
              return;
            }
          }
        }
    }

    final void a(boolean param0, int param1, byte param2) {
        int var5 = 0;
        int var6 = 0;
        if (!((param1 ^ -1) <= -1)) {
            this.field_h = 0;
            this.field_i = true;
            return;
        }
        if (!(param1 <= this.field_h)) {
            param1 = param1 - this.field_c;
        }
        int var4 = 23 % ((param2 - 82) / 42);
        if (!(this.field_h <= param1)) {
            var5 = -param1 + this.field_h;
            var6 = tp.b(-84) * 2;
            this.field_h = this.field_h - (var6 <= var5 ? var6 : var5);
        }
        if (!(0 <= this.field_h)) {
            this.field_i = param0 ? true : false;
            this.field_h = this.field_h + this.field_c;
        }
    }

    final static int a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6, int param7, int param8, bv param9) {
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        int var12 = 0;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        try {
          L0: {
            var10_int = 111 / ((25 - param2) / 56);
            var10_int = param9.g(-108, 2);
            if (0 != var10_int) {
              if (1 != var10_int) {
                if ((var10_int ^ -1) == -3) {
                  L1: {
                    if (param4 != 0) {
                      stackOut_25_0 = wa.a(param9, param4, 1);
                      stackIn_26_0 = stackOut_25_0;
                      break L1;
                    } else {
                      stackOut_24_0 = 0;
                      stackIn_26_0 = stackOut_24_0;
                      break L1;
                    }
                  }
                  L2: {
                    var11 = stackIn_26_0;
                    var12 = param5 + param6;
                    if (0 > var11) {
                      stackOut_28_0 = var11 + -var12;
                      stackIn_29_0 = stackOut_28_0;
                      break L2;
                    } else {
                      stackOut_27_0 = var12 + var11;
                      stackIn_29_0 = stackOut_27_0;
                      break L2;
                    }
                  }
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  if (3 != var10_int) {
                    throw new IllegalStateException();
                  } else {
                    L3: {
                      if (0 == param3) {
                        stackOut_17_0 = 0;
                        stackIn_18_0 = stackOut_17_0;
                        break L3;
                      } else {
                        stackOut_16_0 = wa.a(param9, param3, 1);
                        stackIn_18_0 = stackOut_16_0;
                        break L3;
                      }
                    }
                    L4: {
                      var11 = stackIn_18_0;
                      var12 = param5 + param1 + param6;
                      if (var11 < 0) {
                        stackOut_20_0 = -var12 + var11;
                        stackIn_21_0 = stackOut_20_0;
                        break L4;
                      } else {
                        stackOut_19_0 = var11 + var12;
                        stackIn_21_0 = stackOut_19_0;
                        break L4;
                      }
                    }
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              } else {
                L5: {
                  if (0 != param7) {
                    stackOut_8_0 = wa.a(param9, param7, 1);
                    stackIn_9_0 = stackOut_8_0;
                    break L5;
                  } else {
                    stackOut_7_0 = 0;
                    stackIn_9_0 = stackOut_7_0;
                    break L5;
                  }
                }
                L6: {
                  var11 = stackIn_9_0;
                  var12 = param6;
                  if (-1 >= (var11 ^ -1)) {
                    stackOut_11_0 = var11 - -var12;
                    stackIn_12_0 = stackOut_11_0;
                    break L6;
                  } else {
                    stackOut_10_0 = -var12 + var11;
                    stackIn_12_0 = stackOut_10_0;
                    break L6;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              L7: {
                if (param8 == 0) {
                  stackOut_3_0 = 0;
                  stackIn_4_0 = stackOut_3_0;
                  break L7;
                } else {
                  stackOut_2_0 = wa.a(param9, param8, 1);
                  stackIn_4_0 = stackOut_2_0;
                  break L7;
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var10 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) (var10);
            stackOut_30_1 = new StringBuilder().append("sj.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param9 == null) {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L8;
            } else {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L8;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_21_0;
            } else {
              return stackIn_29_0;
            }
          }
        }
    }

    final static void a(int param0, p param1) {
        sn[] array$2 = null;
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        sn var5 = null;
        int var6 = 0;
        int stackIn_4_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            wh.field_f = false;
            td.field_d = new sn[cr.field_W.length][];
            var2_int = 93 / ((27 - param0) / 62);
            var3 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (cr.field_W.length <= var3) {
                    break L3;
                  } else {
                    array$2 = new sn[cr.field_W[var3].length];
                    td.field_d[var3] = array$2;
                    stackOut_3_0 = 0;
                    stackIn_14_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var6 != 0) {
                      break L2;
                    } else {
                      var4 = stackIn_4_0;
                      L4: while (true) {
                        L5: {
                          L6: {
                            if (cr.field_W[var3].length <= var4) {
                              break L6;
                            } else {
                              var5 = param1.a(cr.field_W[var3][var4], (byte) -97, "");
                              if (var6 != 0) {
                                break L5;
                              } else {
                                L7: {
                                  if (var5 != null) {
                                    break L7;
                                  } else {
                                    var5 = param1.a((byte) -127, "", cr.field_W[var3][var4]);
                                    break L7;
                                  }
                                }
                                L8: {
                                  if (var5 == null) {
                                    break L8;
                                  } else {
                                    break L8;
                                  }
                                }
                                td.field_d[var3][var4] = var5;
                                var4++;
                                if (var6 == 0) {
                                  continue L4;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          var3++;
                          break L5;
                        }
                        if (var6 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                ke.a((byte) 90, param1);
                stackOut_13_0 = 1;
                stackIn_14_0 = stackOut_13_0;
                break L2;
              }
              wh.field_f = stackIn_14_0 != 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            runtimeException = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (runtimeException);
            stackOut_16_1 = new StringBuilder().append("sj.B(").append(param0).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L9;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L9;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        field_g = null;
        if (param0 > -17) {
            field_b = (String) null;
        }
    }

    sj(int param0) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        this.field_i = false;
        this.field_c = param0;
        int var2 = 2147483647;
        this.field_f = new int[ac.field_m * cm.field_b];
        int var3 = -2147483648;
        for (var4 = 0; ac.field_m * cm.field_b > var4; var4++) {
            var5 = var4 % cm.field_b - (cm.field_b >> -1354655903);
            var6 = -(ac.field_m >> -316584031) + var4 / cm.field_b;
            var7 = (this.field_c + -(int)(Math.atan2((double)(-var5), (double)var6) * (double)this.field_c / 3.141592653589793)) / 2;
            if (var8 != 0) {
                return;
            }
            if (var3 < var7) {
                var3 = var7;
            }
            this.field_f[var4] = var7;
            if (var7 < var2) {
                var2 = var7;
            }
        }
    }

    static {
        field_g = "You can only use equipment on your turn.";
        field_a = null;
        field_e = -1;
    }
}
