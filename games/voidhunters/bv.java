/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bv {
    private int field_c;
    static int[] field_a;
    static llb field_b;
    static boolean field_d;
    static int field_e;

    private final void a(byte param0, int param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            int discarded$3 = 0;
            this.a(param1, 127, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var4, "bv.F(" + 113 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final int[] a(int param0, ij param1, int param2, int param3, lta param4, int param5, int param6, int param7) {
        lw var9 = null;
        RuntimeException var9_ref = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int[] stackIn_9_0 = null;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        Object stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int[] stackOut_8_0 = null;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        Object stackOut_15_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var13 = VoidHunters.field_G;
        try {
          L0: {
            var9 = (lw) (Object) param1.d(0);
            L1: while (true) {
              L2: {
                L3: {
                  if (var9 == null) {
                    break L3;
                  } else {
                    var10 = var9.field_l;
                    stackOut_3_0 = param0;
                    stackOut_3_1 = var10;
                    stackIn_12_0 = stackOut_3_0;
                    stackIn_12_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (var13 != 0) {
                      break L2;
                    } else {
                      if (stackIn_4_0 == stackIn_4_1) {
                        var11 = var9.field_m;
                        var12 = var9.field_h;
                        stackOut_8_0 = new int[]{var11, var11 + chb.field_a, var12, bhb.field_g + var12};
                        stackIn_9_0 = stackOut_8_0;
                        return stackIn_9_0;
                      } else {
                        var9 = (lw) (Object) param1.a((byte) 39);
                        if (var13 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                stackOut_11_0 = 30;
                stackOut_11_1 = 30;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                break L2;
              }
              L4: {
                if (stackIn_12_0 == stackIn_12_1) {
                  break L4;
                } else {
                  ((bv) this).a(-87, (rsb) null, 37, 98, (sg) null, 100, (lta) null);
                  break L4;
                }
              }
              stackOut_15_0 = null;
              stackIn_16_0 = stackOut_15_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var9_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var9_ref;
            stackOut_17_1 = new StringBuilder().append("bv.I(").append(param0).append(',');
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L5;
            }
          }
          L6: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',').append(30).append(',').append(param3).append(',');
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param4 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L6;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
        return (int[]) (Object) stackIn_16_0;
    }

    private final void a(int param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.a((byte) 113, 100, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var3, "bv.J(" + -26476 + ',' + param1 + ')');
        }
    }

    final boolean b(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param1 <= -4) {
              L1: {
                if (lu.field_f[param0] < 50) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_7_0 = stackOut_4_0;
                  break L1;
                }
              }
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var3, "bv.D(" + param0 + ',' + param1 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final boolean b(byte param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 == 11) {
              L1: {
                L2: {
                  if (!qd.field_a[param1]) {
                    break L2;
                  } else {
                    if (lu.field_f[param1] >= 50) {
                      break L2;
                    } else {
                      stackOut_7_0 = 1;
                      stackIn_10_0 = stackOut_7_0;
                      break L1;
                    }
                  }
                }
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L1;
              }
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var3, "bv.K(" + param0 + ',' + param1 + ')');
        }
        return stackIn_10_0 != 0;
    }

    private final String a(int param0, int param1, boolean param2) {
        RuntimeException var4 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_6_0 = null;
        String stackOut_4_0 = null;
        try {
          L0: {
            L1: {
              if (param0 == -6448) {
                break L1;
              } else {
                this.a((rsb) null, (lta) null, 32, -33, (int[]) null, (String) null, -106);
                break L1;
              }
            }
            if (!param2) {
              stackOut_6_0 = bpb.field_q[param1];
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_4_0 = "<col=ffaa00>" + bpb.field_q[param1] + "</col>";
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var4, "bv.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_7_0;
    }

    final boolean a(int param0, boolean param1) {
        RuntimeException var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                ((bv) this).field_c = -29;
                break L1;
              }
            }
            stackOut_3_0 = qd.field_a[param0];
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var3, "bv.H(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final void a(byte param0) {
        try {
            int var2_int = -50 / ((55 - param0) / 38);
            m.a(-98);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "bv.B(" + param0 + ')');
        }
    }

    final void a(byte param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 > 66) {
                break L1;
              } else {
                ((bv) this).a((byte) -23, 1);
                break L1;
              }
            }
            qd.field_a[param1] = true;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var3, "bv.E(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 39) {
                break L1;
              } else {
                bv.a(105);
                break L1;
              }
            }
            field_a = null;
            field_b = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var1, "bv.N(" + param0 + ')');
        }
    }

    private final void a(int[] param0, lta param1, boolean param2, int param3, rsb param4, boolean param5, String param6, int param7, byte param8) {
        RuntimeException var10 = null;
        int var10_int = 0;
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
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        String stackIn_85_2 = null;
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        RuntimeException stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        String stackIn_89_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        String stackOut_78_2 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        RuntimeException stackOut_84_0 = null;
        StringBuilder stackOut_84_1 = null;
        String stackOut_84_2 = null;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        String stackOut_82_2 = null;
        RuntimeException stackOut_85_0 = null;
        StringBuilder stackOut_85_1 = null;
        RuntimeException stackOut_88_0 = null;
        StringBuilder stackOut_88_1 = null;
        String stackOut_88_2 = null;
        RuntimeException stackOut_86_0 = null;
        StringBuilder stackOut_86_1 = null;
        String stackOut_86_2 = null;
        var30 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var10_int = -16384;
              var11 = -2048;
              int discarded$1 = 13879;
              var12 = tea.a(param7, param6);
              var13 = onb.field_a;
              var14 = lj.field_a;
              var15 = param0[0];
              var16 = param0[1];
              if (param5) {
                L2: {
                  if (!param2) {
                    break L2;
                  } else {
                    var16 = param0[2] + param0[3] >> 1;
                    var15 = param0[0] - -param0[1] >> 1;
                    if (var30 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var15 = param1.a((param0[1] + param0[0] >> 1) + var10_int, (byte) 124);
                var16 = param1.b(true, var11 + (param0[2] + param0[3] >> 1));
                break L1;
              } else {
                break L1;
              }
            }
            L3: {
              L4: {
                var17 = pqa.a(false, param7);
                if (param5) {
                  break L4;
                } else {
                  var16 = var16 - var17 / 2;
                  var15 = var15 - var12 / 2;
                  if (var30 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              var16 = var16 - var17;
              var15 = var15 - var12;
              break L3;
            }
            L5: {
              L6: {
                var18 = -105 / ((10 - param8) / 45);
                if (~(16 + var16) < ~var14) {
                  break L6;
                } else {
                  if (0 > var16 + (-var17 - 16)) {
                    var16 = 16 + var17;
                    if (var30 == 0) {
                      break L5;
                    } else {
                      break L6;
                    }
                  } else {
                    break L5;
                  }
                }
              }
              var16 = -16 + var14;
              break L5;
            }
            L7: {
              L8: {
                if (16 + var15 + var12 <= var13) {
                  break L8;
                } else {
                  var15 = -var12 + var13 - 16;
                  if (var30 == 0) {
                    break L7;
                  } else {
                    break L8;
                  }
                }
              }
              if (var15 + -16 < 0) {
                var15 = 16;
                break L7;
              } else {
                break L7;
              }
            }
            L9: {
              L10: {
                var19 = 4;
                var20 = -var19 + var15;
                var21 = -var17 + var16;
                var22 = var12 + 2 * var19;
                var23 = 18;
                if (!param5) {
                  break L10;
                } else {
                  L11: {
                    L12: {
                      var24 = 0;
                      var25 = 0;
                      if (param2) {
                        break L12;
                      } else {
                        var24 = param1.a(param0[0] + param0[1] >> 1, (byte) 120);
                        var25 = param1.b(true, param0[2] + param0[3] >> 1);
                        if (var30 == 0) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    var24 = param0[1] - -param0[0] >> 1;
                    var25 = param0[3] + param0[2] >> 1;
                    break L11;
                  }
                  L13: {
                    if (~var24 <= ~(var22 + var15)) {
                      break L13;
                    } else {
                      if (~var25 > ~(var16 - -(var23 / 2))) {
                        var26 = param1.b(true, param0[3] - var11);
                        var27 = var23 + var26;
                        var28 = var23 + var27 - var17;
                        if (~(var28 - -16) <= ~var14) {
                          break L13;
                        } else {
                          var16 = var27;
                          var20 = -var19 + var15;
                          var21 = var16 + -var17;
                          break L13;
                        }
                      } else {
                        break L13;
                      }
                    }
                  }
                  L14: {
                    var26 = var24;
                    var27 = 7;
                    var28 = var27 - (1 - var23) + var21;
                    if (~(var27 + var24) < ~(var22 + var20)) {
                      var20 = -var22 + var24 - -var27;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    if (~var20 < ~(-var27 + var24)) {
                      var20 = -var27 + var24;
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  L16: {
                    if (6 <= -var20 + 1 + (-var27 + var26)) {
                      break L16;
                    } else {
                      var26 = var20 + (-1 + var27);
                      break L16;
                    }
                  }
                  L17: {
                    var15 = var20 + var19;
                    if (var27 + (var26 + -var20) + var22 < 6) {
                      var26 = -var27 + (var20 + var22);
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                  var29 = param3 << 24;
                  opb.a(var20 + -1, -1 + var21, (byte) -128, var23 - -2, param3, 1, 2 + var22);
                  hcb.a(8, -var27 + var28, 1, 1 | var29, var26, -1 + (var26 - var27) - -1, var28 + -var27, var28 + 1, var29 | 1, 1 + (var27 + var26), 1 | var29);
                  hcb.a(8, -var27 + var28, 1, var29 | 236981, var26, var26 + (1 + -var27), -var27 + var28, var28, var29 | 56035, var26 - -var27, 236981 | var29);
                  if (var30 == 0) {
                    break L9;
                  } else {
                    break L10;
                  }
                }
              }
              opb.a(-1 + var20, var21 + -1, (byte) -128, 2 + var23, param3, 1, 2 + var22);
              break L9;
            }
            L18: {
              ga.a(param3, false, var20, var21, var23, var22, 236981);
              var24 = param1.a(0, 4 + var16 + var19);
              if (param5) {
                L19: {
                  if (~param0[3] > ~var24) {
                    L20: {
                      if (var24 < param0[2]) {
                        break L20;
                      } else {
                        var24 = param1.a(0, -var17 + var16);
                        if (var30 == 0) {
                          break L19;
                        } else {
                          break L20;
                        }
                      }
                    }
                    var24 = param1.a(0, var16 - var17);
                    break L19;
                  } else {
                    break L19;
                  }
                }
                var25 = param1.b(true, param0[2] + param0[3] >> 1);
                if (var25 <= var21) {
                  break L18;
                } else {
                  if (~(var23 + var21) < ~var25) {
                    var24 = param1.a(0, var16);
                    break L18;
                  } else {
                    break L18;
                  }
                }
              } else {
                break L18;
              }
            }
            ibb.a(1, param3, -1, param6, (byte) -117, param7, -5 + var16, var15);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L21: {
            var10 = decompiledCaughtException;
            stackOut_73_0 = (RuntimeException) var10;
            stackOut_73_1 = new StringBuilder().append("bv.L(");
            stackIn_76_0 = stackOut_73_0;
            stackIn_76_1 = stackOut_73_1;
            stackIn_74_0 = stackOut_73_0;
            stackIn_74_1 = stackOut_73_1;
            if (param0 == null) {
              stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
              stackOut_76_1 = (StringBuilder) (Object) stackIn_76_1;
              stackOut_76_2 = "null";
              stackIn_77_0 = stackOut_76_0;
              stackIn_77_1 = stackOut_76_1;
              stackIn_77_2 = stackOut_76_2;
              break L21;
            } else {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "{...}";
              stackIn_77_0 = stackOut_74_0;
              stackIn_77_1 = stackOut_74_1;
              stackIn_77_2 = stackOut_74_2;
              break L21;
            }
          }
          L22: {
            stackOut_77_0 = (RuntimeException) (Object) stackIn_77_0;
            stackOut_77_1 = ((StringBuilder) (Object) stackIn_77_1).append(stackIn_77_2).append(',');
            stackIn_80_0 = stackOut_77_0;
            stackIn_80_1 = stackOut_77_1;
            stackIn_78_0 = stackOut_77_0;
            stackIn_78_1 = stackOut_77_1;
            if (param1 == null) {
              stackOut_80_0 = (RuntimeException) (Object) stackIn_80_0;
              stackOut_80_1 = (StringBuilder) (Object) stackIn_80_1;
              stackOut_80_2 = "null";
              stackIn_81_0 = stackOut_80_0;
              stackIn_81_1 = stackOut_80_1;
              stackIn_81_2 = stackOut_80_2;
              break L22;
            } else {
              stackOut_78_0 = (RuntimeException) (Object) stackIn_78_0;
              stackOut_78_1 = (StringBuilder) (Object) stackIn_78_1;
              stackOut_78_2 = "{...}";
              stackIn_81_0 = stackOut_78_0;
              stackIn_81_1 = stackOut_78_1;
              stackIn_81_2 = stackOut_78_2;
              break L22;
            }
          }
          L23: {
            stackOut_81_0 = (RuntimeException) (Object) stackIn_81_0;
            stackOut_81_1 = ((StringBuilder) (Object) stackIn_81_1).append(stackIn_81_2).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_84_0 = stackOut_81_0;
            stackIn_84_1 = stackOut_81_1;
            stackIn_82_0 = stackOut_81_0;
            stackIn_82_1 = stackOut_81_1;
            if (param4 == null) {
              stackOut_84_0 = (RuntimeException) (Object) stackIn_84_0;
              stackOut_84_1 = (StringBuilder) (Object) stackIn_84_1;
              stackOut_84_2 = "null";
              stackIn_85_0 = stackOut_84_0;
              stackIn_85_1 = stackOut_84_1;
              stackIn_85_2 = stackOut_84_2;
              break L23;
            } else {
              stackOut_82_0 = (RuntimeException) (Object) stackIn_82_0;
              stackOut_82_1 = (StringBuilder) (Object) stackIn_82_1;
              stackOut_82_2 = "{...}";
              stackIn_85_0 = stackOut_82_0;
              stackIn_85_1 = stackOut_82_1;
              stackIn_85_2 = stackOut_82_2;
              break L23;
            }
          }
          L24: {
            stackOut_85_0 = (RuntimeException) (Object) stackIn_85_0;
            stackOut_85_1 = ((StringBuilder) (Object) stackIn_85_1).append(stackIn_85_2).append(',').append(param5).append(',');
            stackIn_88_0 = stackOut_85_0;
            stackIn_88_1 = stackOut_85_1;
            stackIn_86_0 = stackOut_85_0;
            stackIn_86_1 = stackOut_85_1;
            if (param6 == null) {
              stackOut_88_0 = (RuntimeException) (Object) stackIn_88_0;
              stackOut_88_1 = (StringBuilder) (Object) stackIn_88_1;
              stackOut_88_2 = "null";
              stackIn_89_0 = stackOut_88_0;
              stackIn_89_1 = stackOut_88_1;
              stackIn_89_2 = stackOut_88_2;
              break L24;
            } else {
              stackOut_86_0 = (RuntimeException) (Object) stackIn_86_0;
              stackOut_86_1 = (StringBuilder) (Object) stackIn_86_1;
              stackOut_86_2 = "{...}";
              stackIn_89_0 = stackOut_86_0;
              stackIn_89_1 = stackOut_86_1;
              stackIn_89_2 = stackOut_86_2;
              break L24;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_89_0, stackIn_89_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    private final void a(rsb param0, lta param1, int param2, int param3, int[] param4, String param5, int param6) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              this.a(param4, param1, false, param2, param0, true, param5, param3, (byte) -76);
              if (param6 == 1619) {
                break L1;
              } else {
                String discarded$3 = this.a(-4, -53, false);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("bv.M(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param4 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param5 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L5;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param6 + ')');
        }
    }

    bv() {
        ((bv) this).field_c = -1;
    }

    private final void a(int param0, int param1, int param2) {
        RuntimeException var5 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (qd.field_a[param2]) {
                break L1;
              } else {
                if (lu.field_f[param2] >= param0) {
                  break L1;
                } else {
                  L2: {
                    if (-1 == vl.field_o) {
                      break L2;
                    } else {
                      if (param2 != vl.field_o) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  lu.field_f[param2] = lu.field_f[param2] + 2;
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var5, "bv.G(" + param0 + ',' + 127 + ',' + param2 + ',' + false + ')');
        }
    }

    final void a(int param0, rsb param1, int param2, int param3, sg param4, int param5, lta param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        ij var9 = null;
        tj var10 = null;
        nbb[] var10_array = null;
        nbb[] var11_ref_nbb__ = null;
        int var11 = 0;
        int var12 = 0;
        Object var13 = null;
        sg var14 = null;
        rca var15 = null;
        bba var16 = null;
        int var17 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_27_0 = 0;
        int stackOut_25_0 = 0;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        var17 = VoidHunters.field_G;
        try {
          L0: {
            var8_int = -18 % ((94 - param2) / 32);
            var9 = param1.field_g.c(true);
            var10 = (tj) (Object) var9.d(0);
            L1: while (true) {
              L2: {
                if (var10 == null) {
                  break L2;
                } else {
                  L3: {
                    if (var10.e(512) != 0) {
                      var10.b(0, 71);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var10 = (tj) (Object) var9.a((byte) 109);
                  if (var17 == 0) {
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              var10_array = param1.field_g.h((byte) -33);
              var11_ref_nbb__ = var10_array;
              var12 = 0;
              L4: while (true) {
                L5: {
                  L6: {
                    if (var11_ref_nbb__.length <= var12) {
                      break L6;
                    } else {
                      var13 = (Object) (Object) var11_ref_nbb__[var12];
                      if (var17 != 0) {
                        break L5;
                      } else {
                        L7: {
                          if (null != var13) {
                            if (((nbb) var13).field_k.a(27, 0) <= 0) {
                              break L7;
                            } else {
                              ((nbb) var13).field_k.e(122, 27);
                              break L7;
                            }
                          } else {
                            break L7;
                          }
                        }
                        var12++;
                        if (var17 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  if (!((bv) this).b((byte) 11, 1)) {
                    break L5;
                  } else {
                    if (param1.field_g.c(0) > 1) {
                      break L5;
                    } else {
                      L8: {
                        var11 = param1.field_e.b(7061, 0);
                        if (0 != param1.field_g.b(true)) {
                          stackOut_27_0 = 0;
                          stackIn_28_0 = stackOut_27_0;
                          break L8;
                        } else {
                          stackOut_25_0 = 1;
                          stackIn_28_0 = stackOut_25_0;
                          break L8;
                        }
                      }
                      L9: {
                        var12 = stackIn_28_0;
                        var13 = null;
                        if (var11 != 0) {
                          if (var11 != 1) {
                            break L9;
                          } else {
                            if (var12 != 0) {
                              var13 = (Object) (Object) new int[]{8, 0, 39, 0, 13, 1, 45, 2, 27, 3, 30, 0, 25, -1, -1, 10, 38, 2, 30, 1, 25, 3, 27, 4, 45, 5, 13};
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                        } else {
                          var13 = (Object) (Object) new int[]{9, 1, 38, 2, 30, -1, -1, 3, 13, 12, 15, 14, 15, 23, 13, 25, 39, 3, 30, -1, -1};
                          break L9;
                        }
                      }
                      if (var13 != null) {
                        var14 = ae.a((int[]) var13, (byte) 56);
                        var14.h(17704, 1);
                        var14.a(new aoa(), 4);
                        var15 = param1.field_g.a(0, param1.field_g.m(1) / 2, 0, 0, var14.q((byte) 108), param1.field_g.g((byte) -122) / 2);
                        var14.a(var15.field_c, var15.field_b, (byte) 80);
                        param1.field_g.a(var14, (byte) 72);
                        var14.r(-2);
                        var16 = new bba();
                        var16.a((byte) -106, (wm) (Object) new cc(var14.c(false)));
                        var16.a((rna) (Object) new uoa(0, 1), true);
                        var16.a((rna) (Object) new oca(), true);
                        param1.field_g.a(var16, -38);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var8 = decompiledCaughtException;
            stackOut_42_0 = (RuntimeException) var8;
            stackOut_42_1 = new StringBuilder().append("bv.O(").append(param0).append(',');
            stackIn_45_0 = stackOut_42_0;
            stackIn_45_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param1 == null) {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L10;
            } else {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "{...}";
              stackIn_46_0 = stackOut_43_0;
              stackIn_46_1 = stackOut_43_1;
              stackIn_46_2 = stackOut_43_2;
              break L10;
            }
          }
          L11: {
            stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
            stackOut_46_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_46_2).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_49_0 = stackOut_46_0;
            stackIn_49_1 = stackOut_46_1;
            stackIn_47_0 = stackOut_46_0;
            stackIn_47_1 = stackOut_46_1;
            if (param4 == null) {
              stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "null";
              stackIn_50_0 = stackOut_49_0;
              stackIn_50_1 = stackOut_49_1;
              stackIn_50_2 = stackOut_49_2;
              break L11;
            } else {
              stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "{...}";
              stackIn_50_0 = stackOut_47_0;
              stackIn_50_1 = stackOut_47_1;
              stackIn_50_2 = stackOut_47_2;
              break L11;
            }
          }
          L12: {
            stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
            stackOut_50_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_50_2).append(',').append(param5).append(',');
            stackIn_53_0 = stackOut_50_0;
            stackIn_53_1 = stackOut_50_1;
            stackIn_51_0 = stackOut_50_0;
            stackIn_51_1 = stackOut_50_1;
            if (param6 == null) {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "null";
              stackIn_54_0 = stackOut_53_0;
              stackIn_54_1 = stackOut_53_1;
              stackIn_54_2 = stackOut_53_2;
              break L12;
            } else {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "{...}";
              stackIn_54_0 = stackOut_51_0;
              stackIn_54_1 = stackOut_51_1;
              stackIn_54_2 = stackOut_51_2;
              break L12;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_54_0, stackIn_54_2 + ')');
        }
    }

    final void a(rsb param0, int param1, boolean param2, lta param3, int param4, int param5, int param6, int param7, byte param8, ij param9, int param10, int param11, sg param12) {
        int var14_int = 0;
        tfa var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19_int = 0;
        int[] var19 = null;
        String var20 = null;
        int var20_int = 0;
        nbb var20_ref = null;
        ij var20_ref2 = null;
        int var21 = 0;
        int[] var21_ref_int__ = null;
        int var22 = 0;
        int[] var22_ref_int__ = null;
        String var22_ref_String = null;
        ml var23 = null;
        int var23_int = 0;
        int[] var23_array = null;
        ml var24 = null;
        int var24_int = 0;
        int[] var24_array = null;
        int var25 = 0;
        int var26_int = 0;
        aja var26 = null;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        int var43 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_30_0 = 0;
        boolean stackIn_60_0 = false;
        int stackIn_68_0 = 0;
        boolean stackIn_75_0 = false;
        int stackIn_88_0 = 0;
        int stackIn_172_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_19_0 = 0;
        boolean stackOut_29_0 = false;
        boolean stackOut_59_0 = false;
        int stackOut_67_0 = 0;
        boolean stackOut_74_0 = false;
        int stackOut_87_0 = 0;
        int stackOut_171_0 = 0;
        int stackOut_170_0 = 0;
        L0: {
          var43 = VoidHunters.field_G;
          if (0 > param11) {
            break L0;
          } else {
            if (param0.field_c.length <= param11) {
              break L0;
            } else {
              L1: {
                var14_int = param0.field_e.e(8);
                if (1 == var14_int) {
                  break L1;
                } else {
                  if (var14_int != 2) {
                    var15 = param0.a(param11, (byte) 59);
                    var17 = 0;
                    L2: while (true) {
                      L3: {
                        L4: {
                          if (~lu.field_f.length >= ~var17) {
                            break L4;
                          } else {
                            stackOut_11_0 = lu.field_f[var17];
                            stackIn_17_0 = stackOut_11_0;
                            stackIn_12_0 = stackOut_11_0;
                            if (var43 != 0) {
                              break L3;
                            } else {
                              L5: {
                                if (stackIn_12_0 <= 0) {
                                  break L5;
                                } else {
                                  lu.field_f[var17] = lu.field_f[var17] - 1;
                                  break L5;
                                }
                              }
                              var17++;
                              if (var43 == 0) {
                                continue L2;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                        stackOut_16_0 = -68 / ((param8 - 60) / 61);
                        stackIn_17_0 = stackOut_16_0;
                        break L3;
                      }
                      var18 = stackIn_17_0;
                      var16 = 4;
                      var17 = param3.a(true, pk.field_o);
                      var18 = param3.a(0, noa.field_q);
                      vl.field_o = -1;
                      var19_int = 0;
                      L6: while (true) {
                        L7: {
                          L8: {
                            L9: {
                              if (11 <= var19_int) {
                                break L9;
                              } else {
                                stackOut_19_0 = var19_int;
                                stackIn_30_0 = stackOut_19_0;
                                stackIn_20_0 = stackOut_19_0;
                                if (var43 != 0) {
                                  break L8;
                                } else {
                                  L10: {
                                    if (stackIn_20_0 == 4) {
                                      break L10;
                                    } else {
                                      if (lu.field_f[var19_int] <= 0) {
                                        break L10;
                                      } else {
                                        vl.field_o = var19_int;
                                        if (var43 == 0) {
                                          break L9;
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                  }
                                  var19_int++;
                                  if (var43 == 0) {
                                    continue L6;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                            }
                            if (param12 == null) {
                              break L7;
                            } else {
                              stackOut_29_0 = param12.d(9, 49);
                              stackIn_30_0 = stackOut_29_0 ? 1 : 0;
                              break L8;
                            }
                          }
                          if (stackIn_30_0 != 0) {
                            break L7;
                          } else {
                            L11: {
                              var19 = param12.f((byte) -66);
                              this.a(-26476, 0);
                              if (!mja.field_o) {
                                break L11;
                              } else {
                                if (!eka.field_b) {
                                  break L11;
                                } else {
                                  if (!bva.field_d) {
                                    break L11;
                                  } else {
                                    if (mfb.field_a) {
                                      ((bv) this).a((byte) 86, 0);
                                      break L11;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                              }
                            }
                            L12: {
                              if ((2 & var15.field_f) == 0) {
                                break L12;
                              } else {
                                eka.field_b = true;
                                break L12;
                              }
                            }
                            L13: {
                              if ((var15.field_f & 8) != 0) {
                                mfb.field_a = true;
                                break L13;
                              } else {
                                break L13;
                              }
                            }
                            L14: {
                              if (0 != (var15.field_f & 1)) {
                                mja.field_o = true;
                                break L14;
                              } else {
                                break L14;
                              }
                            }
                            L15: {
                              if ((var15.field_f & 4) == 0) {
                                break L15;
                              } else {
                                bva.field_d = true;
                                break L15;
                              }
                            }
                            L16: {
                              if (((bv) this).b(0, -116)) {
                                var20 = isa.a(ge.field_b, new String[4], 90);
                                this.a(param0, param3, hlb.a(lu.field_f[0], 255), var16, var19, var20, 1619);
                                break L16;
                              } else {
                                break L16;
                              }
                            }
                            L17: {
                              if (!((bv) this).b((byte) 11, 0)) {
                                break L17;
                              } else {
                                if (!param12.v(32)) {
                                  var20_int = param12.field_k.b(126, 0);
                                  var21 = 0;
                                  var22 = 0;
                                  L18: while (true) {
                                    L19: {
                                      L20: {
                                        if (var22 >= var20_int) {
                                          break L20;
                                        } else {
                                          var23 = lcb.field_q[var22];
                                          stackOut_59_0 = var23.k((byte) 122);
                                          stackIn_68_0 = stackOut_59_0 ? 1 : 0;
                                          stackIn_60_0 = stackOut_59_0;
                                          if (var43 != 0) {
                                            break L19;
                                          } else {
                                            L21: {
                                              if (stackIn_60_0) {
                                                break L21;
                                              } else {
                                                if (!var23.field_c.b((byte) 119)) {
                                                  break L21;
                                                } else {
                                                  var24_int = var23.c(-14);
                                                  if (var24_int == 0) {
                                                    break L21;
                                                  } else {
                                                    var21 = 1;
                                                    break L21;
                                                  }
                                                }
                                              }
                                            }
                                            var22++;
                                            if (var43 == 0) {
                                              continue L18;
                                            } else {
                                              break L20;
                                            }
                                          }
                                        }
                                      }
                                      stackOut_67_0 = var21;
                                      stackIn_68_0 = stackOut_67_0;
                                      break L19;
                                    }
                                    L22: {
                                      if (stackIn_68_0 == 0) {
                                        break L22;
                                      } else {
                                        this.a(-26476, 1);
                                        break L22;
                                      }
                                    }
                                    if (((bv) this).b(1, -60)) {
                                      var22 = 0;
                                      var23_int = 0;
                                      L23: while (true) {
                                        L24: {
                                          L25: {
                                            if (~var23_int <= ~var20_int) {
                                              break L25;
                                            } else {
                                              var24 = lcb.field_q[var23_int];
                                              stackOut_74_0 = var24.k((byte) 73);
                                              stackIn_88_0 = stackOut_74_0 ? 1 : 0;
                                              stackIn_75_0 = stackOut_74_0;
                                              if (var43 != 0) {
                                                break L24;
                                              } else {
                                                L26: {
                                                  L27: {
                                                    if (!stackIn_75_0) {
                                                      break L27;
                                                    } else {
                                                      if (var43 == 0) {
                                                        break L26;
                                                      } else {
                                                        break L27;
                                                      }
                                                    }
                                                  }
                                                  var25 = var24.c(118);
                                                  if (var25 == 0) {
                                                    break L26;
                                                  } else {
                                                    L28: {
                                                      L29: {
                                                        var26_int = rrb.a(22433, var24.g((byte) -127) + -var24.c(-61));
                                                        var27 = rrb.a(22433, var24.g((byte) -127) - -var24.c(-118));
                                                        var28 = var24.a(var24.i((byte) -112), (byte) -69);
                                                        var29 = var24.a(125, var24.i((byte) -112));
                                                        var30 = 8;
                                                        var31 = var28 + (fc.a(var26_int, (byte) -96) * var30 >> 1);
                                                        var32 = (eu.a(var26_int, 44) * var30 >> 1) + var29;
                                                        var33 = (var30 * fc.a(var27, (byte) 109) >> 1) + var28;
                                                        var34 = (var30 * eu.a(var27, 87) >> 1) + var29;
                                                        var35 = param3.a(var31, (byte) 118);
                                                        var36 = param3.b(true, var32);
                                                        var37 = param3.a(var33, (byte) 115);
                                                        var38 = param3.b(true, var34);
                                                        var39 = param3.a(var28, (byte) 115);
                                                        var40 = param3.b(true, var29);
                                                        var41 = 11142145;
                                                        var42 = hlb.a(lu.field_f[1], 255) >>> 2;
                                                        if (var24.field_c.a(-26772, var18, var17, var24.i((byte) -112), var24)) {
                                                          break L29;
                                                        } else {
                                                          if (ds.field_g == 0) {
                                                            break L28;
                                                          } else {
                                                            var41 = 16712705;
                                                            if (var43 == 0) {
                                                              break L28;
                                                            } else {
                                                              break L29;
                                                            }
                                                          }
                                                        }
                                                      }
                                                      var41 = 16712705;
                                                      hha.a(var39, (byte) 66, var35, var40, 11142145, var36, var42);
                                                      var22 = 1;
                                                      hha.a(var39, (byte) 66, var37, var40, 11142145, var38, var42);
                                                      break L28;
                                                    }
                                                    hcb.a(8, var36, 1, 131586, var39, var35, var38, var40, var41 | var42 << 24, var37, 131586);
                                                    break L26;
                                                  }
                                                }
                                                var23_int++;
                                                if (var43 == 0) {
                                                  continue L23;
                                                } else {
                                                  break L25;
                                                }
                                              }
                                            }
                                          }
                                          stackOut_87_0 = ~pk.field_o;
                                          stackIn_88_0 = stackOut_87_0;
                                          break L24;
                                        }
                                        L30: {
                                          L31: {
                                            L32: {
                                              if (stackIn_88_0 == 0) {
                                                break L32;
                                              } else {
                                                if (-1 != noa.field_q) {
                                                  break L31;
                                                } else {
                                                  break L32;
                                                }
                                              }
                                            }
                                            var17 = param12.field_d;
                                            var18 = param12.f((byte) -112)[2];
                                            if (var43 == 0) {
                                              break L30;
                                            } else {
                                              break L31;
                                            }
                                          }
                                          if (var22 == 0) {
                                            break L30;
                                          } else {
                                            var24_int = kc.field_b;
                                            var25 = uia.field_b;
                                            var26 = mmb.field_d[0];
                                            var26.a(-(var26.d() / 2) + var24_int, -(var26.a() / 2) + var25, 0, 16777215 | hlb.a(lu.field_f[1], 255) << 24, 1);
                                            break L30;
                                          }
                                        }
                                        var23_int = 1024;
                                        var24_array = new int[]{-var23_int + var17, var23_int + var17, -var23_int + var18, var23_int + var18};
                                        this.a(param0, param3, hlb.a(lu.field_f[1], 255), var16, var24_array, bhb.field_e, 1619);
                                        break L17;
                                      }
                                    } else {
                                      break L17;
                                    }
                                  }
                                } else {
                                  break L17;
                                }
                              }
                            }
                            L33: {
                              if (!((bv) this).b((byte) 11, 0)) {
                                break L33;
                              } else {
                                if (!((bv) this).b((byte) 11, 1)) {
                                  break L33;
                                } else {
                                  if (param12.d(4, 50)) {
                                    break L33;
                                  } else {
                                    L34: {
                                      L35: {
                                        if (pk.field_o == -1) {
                                          break L35;
                                        } else {
                                          if (-1 == noa.field_q) {
                                            break L35;
                                          } else {
                                            break L34;
                                          }
                                        }
                                      }
                                      var17 = param12.field_d;
                                      var18 = param12.field_e;
                                      break L34;
                                    }
                                    L36: {
                                      L37: {
                                        var20_ref = param0.field_g.b(1, 2147483647, param12.d(false), var17, var18, param12.g((byte) 124));
                                        if (var20_ref != null) {
                                          break L37;
                                        } else {
                                          if (param12.x(-96) == -1) {
                                            break L36;
                                          } else {
                                            break L37;
                                          }
                                        }
                                      }
                                      L38: {
                                        this.a(-26476, 3);
                                        if (param2) {
                                          L39: {
                                            if (param0.field_g.b(true) <= 0) {
                                              break L39;
                                            } else {
                                              if (param0.field_g.b(true) > 1) {
                                                break L38;
                                              } else {
                                                if (param12.x(46) != -1) {
                                                  break L39;
                                                } else {
                                                  break L38;
                                                }
                                              }
                                            }
                                          }
                                          ((bv) this).a((byte) 99, 3);
                                          lu.field_f[3] = 0;
                                          break L38;
                                        } else {
                                          break L38;
                                        }
                                      }
                                      L40: {
                                        if (param12.x(-119) == -1) {
                                          break L40;
                                        } else {
                                          L41: {
                                            if (!param2) {
                                              ((bv) this).a((byte) 123, 3);
                                              break L41;
                                            } else {
                                              break L41;
                                            }
                                          }
                                          lu.field_f[3] = 0;
                                          break L40;
                                        }
                                      }
                                      if (!((bv) this).b(3, -123)) {
                                        break L33;
                                      } else {
                                        var21_ref_int__ = var20_ref.f((byte) -82);
                                        this.a(param0, param3, hlb.a(lu.field_f[3], 255), var16, var21_ref_int__, nr.field_o, 1619);
                                        if (var43 == 0) {
                                          break L33;
                                        } else {
                                          break L36;
                                        }
                                      }
                                    }
                                    if (qd.field_a[3]) {
                                      break L33;
                                    } else {
                                      if (lu.field_f[3] > 0) {
                                        lu.field_f[3] = lu.field_f[3] - 1;
                                        break L33;
                                      } else {
                                        break L33;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            L42: {
                              if (!((bv) this).b((byte) 11, 0)) {
                                break L42;
                              } else {
                                if (!((bv) this).b((byte) 11, 1)) {
                                  break L42;
                                } else {
                                  L43: {
                                    L44: {
                                      this.a(-26476, 2);
                                      if (tcb.field_o < 0) {
                                        break L44;
                                      } else {
                                        if (si.field_o[baa.field_p]) {
                                          break L44;
                                        } else {
                                          if (!si.field_o[wpa.field_r]) {
                                            break L43;
                                          } else {
                                            break L44;
                                          }
                                        }
                                      }
                                    }
                                    gk.field_p = true;
                                    break L43;
                                  }
                                  L45: {
                                    L46: {
                                      if (tcb.field_o > 0) {
                                        break L46;
                                      } else {
                                        if (si.field_o[oeb.field_o]) {
                                          break L46;
                                        } else {
                                          if (si.field_o[hna.field_n]) {
                                            break L46;
                                          } else {
                                            break L45;
                                          }
                                        }
                                      }
                                    }
                                    nqa.field_c = true;
                                    break L45;
                                  }
                                  L47: {
                                    if (!gk.field_p) {
                                      break L47;
                                    } else {
                                      if (!nqa.field_c) {
                                        break L47;
                                      } else {
                                        ((bv) this).a((byte) 83, 2);
                                        break L47;
                                      }
                                    }
                                  }
                                  if (!((bv) this).b(2, -104)) {
                                    break L42;
                                  } else {
                                    var20_int = param10 / 2;
                                    var21 = param5 / 4;
                                    var22_ref_int__ = new int[]{var20_int, var21};
                                    this.a(var22_ref_int__, param3, false, hlb.a(lu.field_f[2], 255), param0, false, ei.field_f, var16, (byte) 116);
                                    break L42;
                                  }
                                }
                              }
                            }
                            if (!((bv) this).b((byte) 11, 0)) {
                              break L7;
                            } else {
                              if (!((bv) this).b((byte) 11, 1)) {
                                break L7;
                              } else {
                                if (var14_int == 5) {
                                  L48: {
                                    L49: {
                                      var20_int = cab.field_p;
                                      var21_ref_int__ = new int[]{param12.d(false) - var20_int, -var20_int + param12.d(false), param12.g((byte) 127), param12.g((byte) 124)};
                                      if (param3.field_f[0] < var21_ref_int__[0]) {
                                        break L49;
                                      } else {
                                        if (param3.field_f[1] > var21_ref_int__[1]) {
                                          break L49;
                                        } else {
                                          if (~var21_ref_int__[2] < ~param3.field_f[2]) {
                                            break L49;
                                          } else {
                                            if (var21_ref_int__[3] >= param3.field_f[3]) {
                                              stackOut_171_0 = 0;
                                              stackIn_172_0 = stackOut_171_0;
                                              break L48;
                                            } else {
                                              break L49;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    stackOut_170_0 = 1;
                                    stackIn_172_0 = stackOut_170_0;
                                    break L48;
                                  }
                                  L50: {
                                    var22 = stackIn_172_0;
                                    if (var22 != 0) {
                                      L51: {
                                        var23_int = oq.field_l * 5 + 100;
                                        var24_int = vl.field_o;
                                        vl.field_o = -1;
                                        this.a((byte) 113, var23_int, 4);
                                        if (~lu.field_f[4] != ~var23_int) {
                                          break L51;
                                        } else {
                                          ((bv) this).a((byte) 113, 4);
                                          break L51;
                                        }
                                      }
                                      L52: {
                                        if (((bv) this).b(4, -124)) {
                                          this.a(param0, param3, hlb.a(lu.field_f[4], 255), var16, var21_ref_int__, uia.field_a, 1619);
                                          break L52;
                                        } else {
                                          break L52;
                                        }
                                      }
                                      vl.field_o = var24_int;
                                      break L50;
                                    } else {
                                      break L50;
                                    }
                                  }
                                  L53: {
                                    var20_ref2 = new ij();
                                    param12.a(var20_ref2, 9, param2, param0.field_g.d(param12.c(false), (byte) 21));
                                    if (var20_ref2.c(3) > 1) {
                                      L54: {
                                        this.a(-26476, 9);
                                        if (!si.field_o[81]) {
                                          break L54;
                                        } else {
                                          ((bv) this).a((byte) 127, 9);
                                          break L54;
                                        }
                                      }
                                      if (!((bv) this).b(9, -56)) {
                                        break L53;
                                      } else {
                                        var21 = 172;
                                        var22 = param5 + -58;
                                        var23_array = new int[]{var21, var22};
                                        this.a(var23_array, param3, false, hlb.a(lu.field_f[9], 255), param0, false, slb.field_b, var16, (byte) -47);
                                        break L53;
                                      }
                                    } else {
                                      break L53;
                                    }
                                  }
                                  L55: {
                                    if (((bv) this).b((byte) 11, 9)) {
                                      L56: {
                                        this.a(-26476, 10);
                                        if (null == es.field_b) {
                                          break L56;
                                        } else {
                                          if (es.field_b.field_f == null) {
                                            break L56;
                                          } else {
                                            ((bv) this).a((byte) 123, 10);
                                            break L56;
                                          }
                                        }
                                      }
                                      if (((bv) this).b(10, -61)) {
                                        var21_ref_int__ = this.a(11, param9, 30, param4, param3, param6, param5, param1);
                                        if (null == var21_ref_int__) {
                                          break L55;
                                        } else {
                                          var22_ref_String = isa.a(vsa.field_o, new String[1], 110);
                                          this.a(var21_ref_int__, param3, true, hlb.a(lu.field_f[10], 255), param0, true, var22_ref_String, var16, (byte) -50);
                                          break L55;
                                        }
                                      } else {
                                        break L55;
                                      }
                                    } else {
                                      break L55;
                                    }
                                  }
                                  L57: {
                                    if (!ssa.b(2)) {
                                      break L57;
                                    } else {
                                      if (si.field_o[101]) {
                                        ((bv) this).a((byte) 118, 10);
                                        break L57;
                                      } else {
                                        break L57;
                                      }
                                    }
                                  }
                                  L58: {
                                    L59: {
                                      var21_ref_int__ = new int[2];
                                      param12.field_k.a(var21_ref_int__, (byte) -17, true);
                                      var22 = var21_ref_int__[0] * 256 / var21_ref_int__[1];
                                      var21_ref_int__[0] = 0;
                                      var21_ref_int__[1] = 0;
                                      param12.field_k.a(var21_ref_int__, (byte) -17, false);
                                      var23_int = 256 * var21_ref_int__[0] / var21_ref_int__[1];
                                      if (var22 >= var23_int) {
                                        break L59;
                                      } else {
                                        this.a(-26476, 5);
                                        if (var43 == 0) {
                                          break L58;
                                        } else {
                                          break L59;
                                        }
                                      }
                                    }
                                    if (0 < lu.field_f[5]) {
                                      lu.field_f[5] = lu.field_f[5] - 1;
                                      break L58;
                                    } else {
                                      break L58;
                                    }
                                  }
                                  L60: {
                                    if (param12.d(4, 75)) {
                                      ((bv) this).a((byte) 118, 5);
                                      break L60;
                                    } else {
                                      break L60;
                                    }
                                  }
                                  L61: {
                                    if (((bv) this).b(5, -12)) {
                                      var24_array = this.a(4, param9, 30, param4, param3, param6, param5, param1);
                                      if (var24_array != null) {
                                        this.a(var24_array, param3, true, hlb.a(lu.field_f[5], 255), param0, true, oba.field_o, var16, (byte) 98);
                                        break L61;
                                      } else {
                                        break L61;
                                      }
                                    } else {
                                      break L61;
                                    }
                                  }
                                  L62: {
                                    if (!param12.d(4, 72)) {
                                      break L62;
                                    } else {
                                      L63: {
                                        if (!param12.q(-50)) {
                                          break L63;
                                        } else {
                                          this.a(-26476, 6);
                                          break L63;
                                        }
                                      }
                                      if (param12.v(32)) {
                                        break L62;
                                      } else {
                                        ((bv) this).a((byte) 106, 6);
                                        break L62;
                                      }
                                    }
                                  }
                                  L64: {
                                    if (((bv) this).b(6, -88)) {
                                      var21_ref_int__ = this.a(4, param9, 30, param4, param3, param6, param5, param1);
                                      if (var21_ref_int__ == null) {
                                        break L64;
                                      } else {
                                        this.a(var21_ref_int__, param3, true, hlb.a(lu.field_f[6], 255), param0, true, afa.field_p, var16, (byte) 102);
                                        break L64;
                                      }
                                    } else {
                                      break L64;
                                    }
                                  }
                                  L65: {
                                    var21_ref_int__ = this.a(0, param9, 30, param4, param3, param6, param5, param1);
                                    if (null == var21_ref_int__) {
                                      break L65;
                                    } else {
                                      L66: {
                                        this.a(-26476, 7);
                                        if (param7 == 0) {
                                          ((bv) this).a((byte) 82, 7);
                                          if (!((bv) this).b((byte) 11, 7)) {
                                            break L66;
                                          } else {
                                            if (pk.field_o == -1) {
                                              break L66;
                                            } else {
                                              if (noa.field_q == -1) {
                                                break L66;
                                              } else {
                                                this.a(-26476, 8);
                                                if (((bv) this).b(8, -43)) {
                                                  var22 = 1024;
                                                  var23_array = new int[]{var17 - var22, var17 - -var22, -var22 + var18, var18 + var22};
                                                  this.a(var23_array, param3, false, hlb.a(lu.field_f[8], 255), param0, true, pja.field_i, var16, (byte) -115);
                                                  break L66;
                                                } else {
                                                  break L66;
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          break L66;
                                        }
                                      }
                                      if (((bv) this).b(7, -106)) {
                                        this.a(var21_ref_int__, param3, true, hlb.a(lu.field_f[7], 255), param0, true, gla.field_b, var16, (byte) 60);
                                        break L65;
                                      } else {
                                        break L65;
                                      }
                                    }
                                  }
                                  if (!((bv) this).b((byte) 11, 10)) {
                                    break L7;
                                  } else {
                                    if (param2) {
                                      ((bv) this).field_c = ((bv) this).field_c + 1;
                                      var21 = -100 + ((bv) this).field_c;
                                      if (var21 > 0) {
                                        L67: {
                                          if (var21 > 200) {
                                            var21 = 200;
                                            break L67;
                                          } else {
                                            break L67;
                                          }
                                        }
                                        int discarded$1 = maa.a(165, (byte) -127, 2, qoa.field_p, var21);
                                        break L7;
                                      } else {
                                        break L7;
                                      }
                                    } else {
                                      break L7;
                                    }
                                  }
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                        }
                        return;
                      }
                    }
                  } else {
                    break L1;
                  }
                }
              }
              return;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = oea.f((byte) -49);
        field_e = 2;
    }
}
