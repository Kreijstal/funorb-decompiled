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
        try {
            this.a(param1, 127, param2, false);
            if (param0 != 113) {
                field_d = true;
            }
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "bv.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final int[] a(int param0, ij param1, int param2, int param3, lta param4, int param5, int param6, int param7) {
        lw var9 = null;
        int var10 = 0;
        int var13 = 0;
        int[] stackIn_9_0 = null;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        Object stackIn_16_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9_ref = null;
        int var11 = 0;
        int var12 = 0;
        var13 = VoidHunters.field_G;
        try {
          L0: {
            var9 = (lw) ((Object) param1.d(0));
            L1: while (true) {
              L2: {
                L3: {
                  if (var9 == null) {
                    break L3;
                  } else {
                    var10 = var9.field_l;
                    stackIn_12_0 = param0;

                    stackIn_12_1 = var10;

                    if (var13 != 0) {
                      break L2;
                    } else {
                      if (stackIn_12_0 == stackIn_12_1) {
                        var11 = var9.field_m;
                        var12 = var9.field_h;
                        stackIn_9_0 = new int[]{var11, var11 + chb.field_a, var12, bhb.field_g + var12};
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        var9 = (lw) ((Object) param1.a((byte) 39));
                        if (var13 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                stackIn_12_0 = param2;
                stackIn_12_1 = 30;
                break L2;
              }
              L4: {
                if (stackIn_12_0 == stackIn_12_1) {
                  break L4;
                } else {
                  this.a(-87, (rsb) null, 37, 98, (sg) null, 100, (lta) null);
                  break L4;
                }
              }
              stackIn_16_0 = null;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var9_ref = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var9_ref);

            stackIn_20_1 = new StringBuilder().append("bv.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L6;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L6;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_21_0), stackIn_25_2 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          return (int[]) ((Object) stackIn_16_0);
        }
    }

    private final void a(int param0, int param1) {
        try {
            this.a((byte) 113, 100, param1);
            if (param0 != -26476) {
                this.a((rsb) null, (lta) null, 111, -69, (int[]) null, (String) null, -41);
            }
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "bv.J(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean b(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 <= -4) {
              L1: {
                if (lu.field_f[param0] < 50) {
                  stackIn_7_0 = 0;
                  break L1;
                } else {
                  stackIn_7_0 = 1;
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var3), "bv.D(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_7_0 != 0;
        }
    }

    final boolean b(byte param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
                      stackIn_10_0 = 1;
                      break L1;
                    }
                  }
                }
                stackIn_10_0 = 0;
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var3), "bv.K(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    private final String a(int param0, int param1, boolean param2) {
        RuntimeException var4 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
              stackIn_7_0 = bpb.field_q[param1];
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_5_0 = "<col=ffaa00>" + bpb.field_q[param1] + "</col>";
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var4), "bv.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_7_0;
        }
    }

    final boolean a(int param0, boolean param1) {
        RuntimeException var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                this.field_c = -29;
                break L1;
              }
            }
            stackIn_4_0 = qd.field_a[param0];
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var3), "bv.H(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final void a(byte param0) {
        try {
            int var2_int = -50 / ((55 - param0) / 38);
            m.a(-98);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "bv.B(" + param0 + ')');
        }
    }

    final void a(byte param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (param0 > 66) {
                break L1;
              } else {
                this.a((byte) -23, 1);
                break L1;
              }
            }
            qd.field_a[param1] = true;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var3), "bv.E(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
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
          throw rta.a((Throwable) ((Object) var1), "bv.N(" + param0 + ')');
        }
    }

    private final void a(int[] param0, lta param1, boolean param2, int param3, rsb param4, boolean param5, String param6, int param7, byte param8) {
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        StringBuilder stackIn_80_1 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        StringBuilder stackIn_84_1 = null;
        StringBuilder stackIn_85_1 = null;
        String stackIn_85_2 = null;
        StringBuilder stackIn_88_1 = null;
        StringBuilder stackIn_89_1 = null;
        String stackIn_89_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
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
        var30 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var10_int = -16384;
              var11 = -2048;
              var12 = tea.a(param7, param6, 13879);
              var13 = onb.field_a;
              var14 = lj.field_a;
              var15 = param0[0];
              var16 = param0[1];
              if (param5) {
                L2: {
                  if (!param2) {
                    break L2;
                  } else {
                    var16 = param0[2] + param0[3] >> 246963873;
                    var15 = param0[0] - -param0[1] >> -872091743;
                    if (var30 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var15 = param1.a((param0[1] + param0[0] >> 1869467009) + var10_int, (byte) 124);
                var16 = param1.b(true, var11 + (param0[2] + param0[3] >> -79720447));
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
                if ((16 + var16 ^ -1) < (var14 ^ -1)) {
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
              if ((var15 + -16 ^ -1) > -1) {
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
                        var24 = param1.a(param0[0] + param0[1] >> 1680100609, (byte) 120);
                        var25 = param1.b(true, param0[2] + param0[3] >> 599844833);
                        if (var30 == 0) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    var24 = param0[1] - -param0[0] >> 1025049633;
                    var25 = param0[3] + param0[2] >> 1781805281;
                    break L11;
                  }
                  L13: {
                    if ((var24 ^ -1) <= (var22 + var15 ^ -1)) {
                      break L13;
                    } else {
                      if ((var25 ^ -1) > (var16 - -(var23 / 2) ^ -1)) {
                        var26 = param1.b(true, param0[3] - var11);
                        var27 = var23 + var26;
                        var28 = var23 + var27 - var17;
                        if ((var28 - -16 ^ -1) <= (var14 ^ -1)) {
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
                    if ((var27 + var24 ^ -1) < (var22 + var20 ^ -1)) {
                      var20 = -var22 + var24 - -var27;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    if ((var20 ^ -1) < (-var27 + var24 ^ -1)) {
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
                  var29 = param3 << 1039338296;
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
                  if ((param0[3] ^ -1) > (var24 ^ -1)) {
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
                var25 = param1.b(true, param0[2] + param0[3] >> -768319071);
                if (var25 <= var21) {
                  break L18;
                } else {
                  if ((var23 + var21 ^ -1) < (var25 ^ -1)) {
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
            stackIn_76_0 = (RuntimeException) (var10);

            stackIn_76_1 = new StringBuilder().append("bv.L(");

            if (param0 == null) {
              stackIn_77_0 = (RuntimeException) ((Object) stackIn_76_0);
              stackIn_77_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackIn_77_2 = "null";
              break L21;
            } else {
              stackIn_77_0 = (RuntimeException) ((Object) stackIn_76_0);
              stackIn_77_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackIn_77_2 = "{...}";
              break L21;
            }
          }
          L22: {


            stackIn_80_1 = ((StringBuilder) (Object) stackIn_77_1).append(stackIn_77_2).append(',');

            if (param1 == null) {
              stackIn_77_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackIn_81_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackIn_81_2 = "null";
              break L22;
            } else {
              stackIn_77_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackIn_81_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackIn_81_2 = "{...}";
              break L22;
            }
          }
          L23: {


            stackIn_84_1 = ((StringBuilder) (Object) stackIn_81_1).append(stackIn_81_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_77_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackIn_85_1 = (StringBuilder) ((Object) stackIn_84_1);
              stackIn_85_2 = "null";
              break L23;
            } else {
              stackIn_77_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackIn_85_1 = (StringBuilder) ((Object) stackIn_84_1);
              stackIn_85_2 = "{...}";
              break L23;
            }
          }
          L24: {


            stackIn_88_1 = ((StringBuilder) (Object) stackIn_85_1).append(stackIn_85_2).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_77_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackIn_89_1 = (StringBuilder) ((Object) stackIn_88_1);
              stackIn_89_2 = "null";
              break L24;
            } else {
              stackIn_77_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackIn_89_1 = (StringBuilder) ((Object) stackIn_88_1);
              stackIn_89_2 = "{...}";
              break L24;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_77_0), stackIn_89_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    private final void a(rsb param0, lta param1, int param2, int param3, int[] param4, String param5, int param6) {
        String discarded$1 = null;
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.a(param4, param1, false, param2, param0, true, param5, param3, (byte) -76);
              if (param6 == 1619) {
                break L1;
              } else {
                discarded$1 = this.a(-4, -53, false);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("bv.M(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param5 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_19_2 + ',' + param6 + ')');
        }
    }

    bv() {
        this.field_c = -1;
    }

    private final void a(int param0, int param1, int param2, boolean param3) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
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
                    if (param3) {
                      break L2;
                    } else {
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
                  }
                  lu.field_f[param2] = lu.field_f[param2] + 2;
                  break L1;
                }
              }
            }
            L3: {
              if (param1 > 85) {
                break L3;
              } else {
                field_a = (int[]) null;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var5), "bv.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, rsb param1, int param2, int param3, sg param4, int param5, lta param6) {
        int stackIn_28_0 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        StringBuilder stackIn_49_1 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        StringBuilder stackIn_53_1 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
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
        var17 = VoidHunters.field_G;
        try {
          L0: {
            var8_int = -18 % ((94 - param2) / 32);
            var9 = param1.field_g.c(true);
            var10 = (tj) ((Object) var9.d(0));
            L1: while (true) {
              L2: {
                if (var10 == null) {
                  break L2;
                } else {
                  L3: {
                    if ((var10.e(512) ^ -1) != -1) {
                      var10.b(0, 71);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var10 = (tj) ((Object) var9.a((byte) 109));
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
                      var13 = var11_ref_nbb__[var12];
                      if (var17 != 0) {
                        break L5;
                      } else {
                        L7: {
                          if (null != var13) {
                            if ((((nbb) (var13)).field_k.a(27, 0) ^ -1) >= -1) {
                              break L7;
                            } else {
                              ((nbb) (var13)).field_k.e(122, 27);
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
                  if (!this.b((byte) 11, 1)) {
                    break L5;
                  } else {
                    if (param1.field_g.c(0) > 1) {
                      break L5;
                    } else {
                      L8: {
                        var11 = param1.field_e.b(7061, 0);
                        if (0 != param1.field_g.b(true)) {
                          stackIn_28_0 = 0;
                          break L8;
                        } else {
                          stackIn_28_0 = 1;
                          break L8;
                        }
                      }
                      L9: {
                        var12 = stackIn_28_0;
                        var13 = null;
                        if (-1 != (var11 ^ -1)) {
                          if (var11 != 1) {
                            break L9;
                          } else {
                            if (var12 != 0) {
                              var13 = new int[]{8, 0, 39, 0, 13, 1, 45, 2, 27, 3, 30, 0, 25, -1, -1, 10, 38, 2, 30, 1, 25, 3, 27, 4, 45, 5, 13};
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                        } else {
                          var13 = new int[]{9, 1, 38, 2, 30, -1, -1, 3, 13, 12, 15, 14, 15, 23, 13, 25, 39, 3, 30, -1, -1};
                          break L9;
                        }
                      }
                      if (var13 != null) {
                        var14 = ae.a((int[]) (var13), (byte) 56);
                        var14.h(17704, 1);
                        var14.a(new aoa(), 4);
                        var15 = param1.field_g.a(0, param1.field_g.m(1) / 2, 0, 0, var14.q((byte) 108), param1.field_g.g((byte) -122) / 2);
                        var14.a(var15.field_c, var15.field_b, (byte) 80);
                        param1.field_g.a(var14, (byte) 72);
                        var14.r(-2);
                        var16 = new bba();
                        var16.a((byte) -106, (wm) (new cc(var14.c(false))));
                        var16.a(new uoa(0, 1), true);
                        var16.a(new oca(), true);
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
            stackIn_45_0 = (RuntimeException) (var8);

            stackIn_45_1 = new StringBuilder().append("bv.O(").append(param0).append(',');

            if (param1 == null) {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "null";
              break L10;
            } else {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_49_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_46_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackIn_50_2 = "null";
              break L11;
            } else {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackIn_50_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_53_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_50_2).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackIn_54_2 = "null";
              break L12;
            } else {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackIn_54_2 = "{...}";
              break L12;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_46_0), stackIn_54_2 + ')');
        }
    }

    final void a(rsb param0, int param1, boolean param2, lta param3, int param4, int param5, int param6, int param7, byte param8, ij param9, int param10, int param11, sg param12) {
        int stackIn_16_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_41_0 = 0;
        boolean stackIn_82_0 = false;
        int stackIn_92_0 = 0;
        boolean stackIn_101_0 = false;
        int stackIn_117_0 = 0;
        int stackIn_236_0 = 0;
        RuntimeException stackIn_351_0 = null;
        StringBuilder stackIn_351_1 = null;
        RuntimeException stackIn_353_0 = null;
        StringBuilder stackIn_353_1 = null;
        RuntimeException stackIn_354_0 = null;
        StringBuilder stackIn_354_1 = null;
        String stackIn_354_2 = null;
        RuntimeException stackIn_355_0 = null;
        StringBuilder stackIn_355_1 = null;
        RuntimeException stackIn_357_0 = null;
        StringBuilder stackIn_357_1 = null;
        RuntimeException stackIn_358_0 = null;
        StringBuilder stackIn_358_1 = null;
        String stackIn_358_2 = null;
        RuntimeException stackIn_359_0 = null;
        StringBuilder stackIn_359_1 = null;
        RuntimeException stackIn_361_0 = null;
        StringBuilder stackIn_361_1 = null;
        RuntimeException stackIn_362_0 = null;
        StringBuilder stackIn_362_1 = null;
        String stackIn_362_2 = null;
        RuntimeException stackIn_363_0 = null;
        StringBuilder stackIn_363_1 = null;
        RuntimeException stackIn_365_0 = null;
        StringBuilder stackIn_365_1 = null;
        RuntimeException stackIn_366_0 = null;
        StringBuilder stackIn_366_1 = null;
        String stackIn_366_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        boolean stackOut_81_0;
        boolean stackOut_100_0;
        int statePc = 0;
        int var14_int = 0;
        RuntimeException var14 = null;
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
        int var24_int = 0;
        ml var24 = null;
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
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var43 = VoidHunters.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (0 > param11) {
                        statePc = 7;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if (param0.field_c.length <= param11) {
                        statePc = 7;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 7: {
                    return;
                }
                case 8: {
                    var14_int = param0.field_e.e(8);
                    if (1 == var14_int) {
                        statePc = 12;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (-3 != (var14_int ^ -1)) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    return;
                }
                case 13: {
                    var15 = param0.a(param11, (byte) 59);
                    var17 = 0;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if ((lu.field_f.length ^ -1) >= (var17 ^ -1)) {
                        statePc = 22;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    stackIn_23_0 = lu.field_f[var17];
                    stackIn_16_0 = stackIn_23_0;
                    if (var43 != 0) {
                        statePc = 23;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (stackIn_16_0 <= 0) {
                        statePc = 21;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    lu.field_f[var17] = lu.field_f[var17] - 1;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    var17++;
                    if (var43 == 0) {
                        statePc = 14;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    stackIn_23_0 = -68 / ((param8 - 60) / 61);
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    var18 = stackIn_23_0;
                    var16 = 4;
                    var17 = param3.a(true, pk.field_o);
                    var18 = param3.a(0, noa.field_q);
                    vl.field_o = -1;
                    var19_int = 0;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    if (11 <= var19_int) {
                        statePc = 38;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    stackIn_41_0 = var19_int;
                    stackIn_26_0 = stackIn_41_0;
                    if (var43 != 0) {
                        statePc = 41;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (stackIn_26_0 == 4) {
                        statePc = 35;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    if (-1 <= (lu.field_f[var19_int] ^ -1)) {
                        statePc = 35;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    vl.field_o = var19_int;
                    if (var43 == 0) {
                        statePc = 38;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    var19_int++;
                    if (var43 == 0) {
                        statePc = 24;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    if (param12 == null) {
                        statePc = 367;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    stackIn_41_0 = param12.d(9, 49) ? 1 : 0;
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    if (stackIn_41_0 != 0) {
                        statePc = 367;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    var19 = param12.f((byte) -66);
                    this.a(-26476, 0);
                    if (!mja.field_o) {
                        statePc = 55;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if (!eka.field_b) {
                        statePc = 55;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    if (!bva.field_d) {
                        statePc = 55;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    if (mfb.field_a) {
                        statePc = 54;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 54: {
                    this.a((byte) 86, 0);
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    if ((2 & var15.field_f ^ -1) == -1) {
                        statePc = 58;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    eka.field_b = true;
                    statePc = 58;
                    continue stateLoop;
                }
                case 58: {
                    if (-1 != (var15.field_f & 8 ^ -1)) {
                        statePc = 61;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 61: {
                    mfb.field_a = true;
                    statePc = 62;
                    continue stateLoop;
                }
                case 62: {
                    if (0 != (var15.field_f & 1)) {
                        statePc = 65;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 65: {
                    mja.field_o = true;
                    statePc = 66;
                    continue stateLoop;
                }
                case 66: {
                    if ((var15.field_f & 4 ^ -1) == -1) {
                        statePc = 69;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    bva.field_d = true;
                    statePc = 69;
                    continue stateLoop;
                }
                case 69: {
                    if (this.b(0, -116)) {
                        statePc = 72;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 72: {
                    var20 = isa.a(ge.field_b, new String[]{this.a(-6448, mgb.field_q, mja.field_o), this.a(-6448, nd.field_p, bva.field_d), this.a(-6448, bib.field_f, mfb.field_a), this.a(-6448, dn.field_q, eka.field_b)}, 90);
                    this.a(param0, param3, hlb.a(lu.field_f[0], 255), var16, var19, var20, 1619);
                    statePc = 73;
                    continue stateLoop;
                }
                case 73: {
                    if (!this.b((byte) 11, 0)) {
                        statePc = 127;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    if (!param12.v(32)) {
                        statePc = 79;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 79: {
                    var20_int = param12.field_k.b(126, 0);
                    var21 = 0;
                    var22 = 0;
                    statePc = 80;
                    continue stateLoop;
                }
                case 80: {
                    if (var22 >= var20_int) {
                        statePc = 91;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    var23 = lcb.field_q[var22];
                    stackOut_81_0 = var23.k((byte) 122);
                    stackIn_92_0 = stackOut_81_0 ? 1 : 0;
                    stackIn_82_0 = stackOut_81_0;
                    if (var43 != 0) {
                        statePc = 92;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    if (stackIn_82_0) {
                        statePc = 90;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    if (!var23.field_c.b((byte) 119)) {
                        statePc = 90;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    var24_int = var23.c(-14);
                    if (-1 == (var24_int ^ -1)) {
                        statePc = 90;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    var21 = 1;
                    statePc = 90;
                    continue stateLoop;
                }
                case 90: {
                    var22++;
                    if (var43 == 0) {
                        statePc = 80;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    stackIn_92_0 = var21;
                    statePc = 92;
                    continue stateLoop;
                }
                case 92: {
                    if (stackIn_92_0 == 0) {
                        statePc = 95;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    this.a(-26476, 1);
                    statePc = 95;
                    continue stateLoop;
                }
                case 95: {
                    if (this.b(1, -60)) {
                        statePc = 98;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 98: {
                    var22 = 0;
                    var23_int = 0;
                    statePc = 99;
                    continue stateLoop;
                }
                case 99: {
                    if ((var23_int ^ -1) <= (var20_int ^ -1)) {
                        statePc = 116;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 100: {
                    var24 = lcb.field_q[var23_int];
                    stackOut_100_0 = var24.k((byte) 73);
                    stackIn_117_0 = stackOut_100_0 ? 1 : 0;
                    stackIn_101_0 = stackOut_100_0;
                    if (var43 != 0) {
                        statePc = 117;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    if (!stackIn_101_0) {
                        statePc = 107;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    if (var43 == 0) {
                        statePc = 115;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    var25 = var24.c(118);
                    if (-1 == (var25 ^ -1)) {
                        statePc = 115;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    var26_int = rrb.a(22433, var24.g((byte) -127) + -var24.c(-61));
                    var27 = rrb.a(22433, var24.g((byte) -127) - -var24.c(-118));
                    var28 = var24.a(var24.i((byte) -112), (byte) -69);
                    var29 = var24.a(125, var24.i((byte) -112));
                    var30 = 8;
                    var31 = var28 + (fc.a(var26_int, (byte) -96) * var30 >> -739944543);
                    var32 = (eu.a(var26_int, 44) * var30 >> 1877342081) + var29;
                    var33 = (var30 * fc.a(var27, (byte) 109) >> -802334943) + var28;
                    var34 = (var30 * eu.a(var27, 87) >> 1525799009) + var29;
                    var35 = param3.a(var31, (byte) 118);
                    var36 = param3.b(true, var32);
                    var37 = param3.a(var33, (byte) 115);
                    var38 = param3.b(true, var34);
                    var39 = param3.a(var28, (byte) 115);
                    var40 = param3.b(true, var29);
                    var41 = 11142145;
                    var42 = hlb.a(lu.field_f[1], 255) >>> -2098323134;
                    if (var24.field_c.a(-26772, var18, var17, var24.i((byte) -112), var24)) {
                        statePc = 113;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    if (-1 == (ds.field_g ^ -1)) {
                        statePc = 114;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 112: {
                    var41 = 16712705;
                    if (var43 == 0) {
                        statePc = 114;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 113: {
                    var41 = 16712705;
                    hha.a(var39, (byte) 66, var35, var40, 11142145, var36, var42);
                    var22 = 1;
                    hha.a(var39, (byte) 66, var37, var40, 11142145, var38, var42);
                    statePc = 114;
                    continue stateLoop;
                }
                case 114: {
                    hcb.a(8, var36, 1, 131586, var39, var35, var38, var40, var41 | var42 << -1557213384, var37, 131586);
                    statePc = 115;
                    continue stateLoop;
                }
                case 115: {
                    var23_int++;
                    if (var43 == 0) {
                        statePc = 99;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 116: {
                    stackIn_117_0 = pk.field_o ^ -1;
                    statePc = 117;
                    continue stateLoop;
                }
                case 117: {
                    if (stackIn_117_0 == 0) {
                        statePc = 121;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 118: {
                    if (-1 != noa.field_q) {
                        statePc = 122;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 121: {
                    var17 = param12.field_d;
                    var18 = param12.f((byte) -112)[2];
                    if (var43 == 0) {
                        statePc = 126;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 122: {
                    if (var22 == 0) {
                        statePc = 126;
                    } else {
                        statePc = 125;
                    }
                    continue stateLoop;
                }
                case 125: {
                    var24_int = kc.field_b;
                    var25 = uia.field_b;
                    var26 = mmb.field_d[0];
                    var26.a(-(var26.d() / 2) + var24_int, -(var26.a() / 2) + var25, 0, 16777215 | hlb.a(lu.field_f[1], 255) << 1711121432, 1);
                    statePc = 126;
                    continue stateLoop;
                }
                case 126: {
                    var23_int = 1024;
                    var24_array = new int[]{-var23_int + var17, var23_int + var17, -var23_int + var18, var23_int + var18};
                    this.a(param0, param3, hlb.a(lu.field_f[1], 255), var16, var24_array, bhb.field_e, 1619);
                    statePc = 127;
                    continue stateLoop;
                }
                case 127: {
                    if (!this.b((byte) 11, 0)) {
                        statePc = 181;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 128: {
                    if (!this.b((byte) 11, 1)) {
                        statePc = 181;
                    } else {
                        statePc = 131;
                    }
                    continue stateLoop;
                }
                case 131: {
                    if (param12.d(4, 50)) {
                        statePc = 181;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 134: {
                    if (0 == (pk.field_o ^ -1)) {
                        statePc = 142;
                    } else {
                        statePc = 137;
                    }
                    continue stateLoop;
                }
                case 137: {
                    if (-1 == noa.field_q) {
                        statePc = 142;
                    } else {
                        statePc = 143;
                    }
                    continue stateLoop;
                }
                case 142: {
                    var17 = param12.field_d;
                    var18 = param12.field_e;
                    statePc = 143;
                    continue stateLoop;
                }
                case 143: {
                    var20_ref = param0.field_g.b(1, 2147483647, param12.d(false), var17, var18, param12.g((byte) 124));
                    if (var20_ref != null) {
                        statePc = 147;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 144: {
                    if ((param12.x(-96) ^ -1) == 0) {
                        statePc = 172;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 147: {
                    this.a(-26476, 3);
                    if (param2) {
                        statePc = 152;
                    } else {
                        statePc = 162;
                    }
                    continue stateLoop;
                }
                case 152: {
                    if ((param0.field_g.b(true) ^ -1) >= -1) {
                        statePc = 161;
                    } else {
                        statePc = 153;
                    }
                    continue stateLoop;
                }
                case 153: {
                    if (param0.field_g.b(true) > 1) {
                        statePc = 162;
                    } else {
                        statePc = 156;
                    }
                    continue stateLoop;
                }
                case 156: {
                    if ((param12.x(46) ^ -1) != 0) {
                        statePc = 161;
                    } else {
                        statePc = 162;
                    }
                    continue stateLoop;
                }
                case 161: {
                    this.a((byte) 99, 3);
                    lu.field_f[3] = 0;
                    statePc = 162;
                    continue stateLoop;
                }
                case 162: {
                    if ((param12.x(-119) ^ -1) == 0) {
                        statePc = 170;
                    } else {
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 163: {
                    if (!param2) {
                        statePc = 168;
                    } else {
                        statePc = 169;
                    }
                    continue stateLoop;
                }
                case 168: {
                    this.a((byte) 123, 3);
                    statePc = 169;
                    continue stateLoop;
                }
                case 169: {
                    lu.field_f[3] = 0;
                    statePc = 170;
                    continue stateLoop;
                }
                case 170: {
                    if (!this.b(3, -123)) {
                        statePc = 181;
                    } else {
                        statePc = 171;
                    }
                    continue stateLoop;
                }
                case 171: {
                    var21_ref_int__ = var20_ref.f((byte) -82);
                    this.a(param0, param3, hlb.a(lu.field_f[3], 255), var16, var21_ref_int__, nr.field_o, 1619);
                    if (var43 == 0) {
                        statePc = 181;
                    } else {
                        statePc = 172;
                    }
                    continue stateLoop;
                }
                case 172: {
                    if (qd.field_a[3]) {
                        statePc = 181;
                    } else {
                        statePc = 175;
                    }
                    continue stateLoop;
                }
                case 175: {
                    if (-1 > (lu.field_f[3] ^ -1)) {
                        statePc = 180;
                    } else {
                        statePc = 181;
                    }
                    continue stateLoop;
                }
                case 180: {
                    lu.field_f[3] = lu.field_f[3] - 1;
                    statePc = 181;
                    continue stateLoop;
                }
                case 181: {
                    if (!this.b((byte) 11, 0)) {
                        statePc = 214;
                    } else {
                        statePc = 182;
                    }
                    continue stateLoop;
                }
                case 182: {
                    if (!this.b((byte) 11, 1)) {
                        statePc = 214;
                    } else {
                        statePc = 185;
                    }
                    continue stateLoop;
                }
                case 185: {
                    this.a(-26476, 2);
                    if (-1 < (tcb.field_o ^ -1)) {
                        statePc = 194;
                    } else {
                        statePc = 188;
                    }
                    continue stateLoop;
                }
                case 188: {
                    if (si.field_o[baa.field_p]) {
                        statePc = 194;
                    } else {
                        statePc = 191;
                    }
                    continue stateLoop;
                }
                case 191: {
                    if (!si.field_o[wpa.field_r]) {
                        statePc = 196;
                    } else {
                        statePc = 194;
                    }
                    continue stateLoop;
                }
                case 194: {
                    gk.field_p = true;
                    statePc = 196;
                    continue stateLoop;
                }
                case 196: {
                    if (-1 > (tcb.field_o ^ -1)) {
                        statePc = 205;
                    } else {
                        statePc = 197;
                    }
                    continue stateLoop;
                }
                case 197: {
                    if (si.field_o[oeb.field_o]) {
                        statePc = 205;
                    } else {
                        statePc = 200;
                    }
                    continue stateLoop;
                }
                case 200: {
                    if (si.field_o[hna.field_n]) {
                        statePc = 205;
                    } else {
                        statePc = 206;
                    }
                    continue stateLoop;
                }
                case 205: {
                    nqa.field_c = true;
                    statePc = 206;
                    continue stateLoop;
                }
                case 206: {
                    if (!gk.field_p) {
                        statePc = 212;
                    } else {
                        statePc = 207;
                    }
                    continue stateLoop;
                }
                case 207: {
                    if (!nqa.field_c) {
                        statePc = 212;
                    } else {
                        statePc = 210;
                    }
                    continue stateLoop;
                }
                case 210: {
                    this.a((byte) 83, 2);
                    statePc = 212;
                    continue stateLoop;
                }
                case 212: {
                    if (!this.b(2, -104)) {
                        statePc = 214;
                    } else {
                        statePc = 213;
                    }
                    continue stateLoop;
                }
                case 213: {
                    var20_int = param10 / 2;
                    var21 = param5 / 4;
                    var22_ref_int__ = new int[]{var20_int, var21};
                    this.a(var22_ref_int__, param3, false, hlb.a(lu.field_f[2], 255), param0, false, ei.field_f, var16, (byte) 116);
                    statePc = 214;
                    continue stateLoop;
                }
                case 214: {
                    if (!this.b((byte) 11, 0)) {
                        statePc = 367;
                    } else {
                        statePc = 215;
                    }
                    continue stateLoop;
                }
                case 215: {
                    if (!this.b((byte) 11, 1)) {
                        statePc = 367;
                    } else {
                        statePc = 218;
                    }
                    continue stateLoop;
                }
                case 218: {
                    if (var14_int == 5) {
                        statePc = 223;
                    } else {
                        statePc = 367;
                    }
                    continue stateLoop;
                }
                case 223: {
                    var20_int = cab.field_p;
                    var21_ref_int__ = new int[]{param12.d(false) - var20_int, -var20_int + param12.d(false), param12.g((byte) 127), param12.g((byte) 124)};
                    if (param3.field_f[0] < var21_ref_int__[0]) {
                        statePc = 233;
                    } else {
                        statePc = 224;
                    }
                    continue stateLoop;
                }
                case 224: {
                    if (param3.field_f[1] > var21_ref_int__[1]) {
                        statePc = 233;
                    } else {
                        statePc = 227;
                    }
                    continue stateLoop;
                }
                case 227: {
                    if ((var21_ref_int__[2] ^ -1) < (param3.field_f[2] ^ -1)) {
                        statePc = 233;
                    } else {
                        statePc = 230;
                    }
                    continue stateLoop;
                }
                case 230: {
                    if (var21_ref_int__[3] >= param3.field_f[3]) {
                        statePc = 235;
                    } else {
                        statePc = 233;
                    }
                    continue stateLoop;
                }
                case 233: {
                    stackIn_236_0 = 1;
                    statePc = 236;
                    continue stateLoop;
                }
                case 235: {
                    stackIn_236_0 = 0;
                    statePc = 236;
                    continue stateLoop;
                }
                case 236: {
                    var22 = stackIn_236_0;
                    if (var22 != 0) {
                        statePc = 239;
                    } else {
                        statePc = 247;
                    }
                    continue stateLoop;
                }
                case 239: {
                    var23_int = oq.field_l * 5 + 100;
                    var24_int = vl.field_o;
                    vl.field_o = -1;
                    this.a((byte) 113, var23_int, 4);
                    if ((lu.field_f[4] ^ -1) != (var23_int ^ -1)) {
                        statePc = 242;
                    } else {
                        statePc = 240;
                    }
                    continue stateLoop;
                }
                case 240: {
                    this.a((byte) 113, 4);
                    statePc = 242;
                    continue stateLoop;
                }
                case 242: {
                    if (this.b(4, -124)) {
                        statePc = 245;
                    } else {
                        statePc = 246;
                    }
                    continue stateLoop;
                }
                case 245: {
                    this.a(param0, param3, hlb.a(lu.field_f[4], 255), var16, var21_ref_int__, uia.field_a, 1619);
                    statePc = 246;
                    continue stateLoop;
                }
                case 246: {
                    vl.field_o = var24_int;
                    statePc = 247;
                    continue stateLoop;
                }
                case 247: {
                    var20_ref2 = new ij();
                    param12.a(var20_ref2, 9, param2, param0.field_g.d(param12.c(false), (byte) 21));
                    if (var20_ref2.c(3) > 1) {
                        statePc = 250;
                    } else {
                        statePc = 255;
                    }
                    continue stateLoop;
                }
                case 250: {
                    this.a(-26476, 9);
                    if (!si.field_o[81]) {
                        statePc = 253;
                    } else {
                        statePc = 251;
                    }
                    continue stateLoop;
                }
                case 251: {
                    this.a((byte) 127, 9);
                    statePc = 253;
                    continue stateLoop;
                }
                case 253: {
                    if (!this.b(9, -56)) {
                        statePc = 255;
                    } else {
                        statePc = 254;
                    }
                    continue stateLoop;
                }
                case 254: {
                    var21 = 172;
                    var22 = param5 + -58;
                    var23_array = new int[]{var21, var22};
                    this.a(var23_array, param3, false, hlb.a(lu.field_f[9], 255), param0, false, slb.field_b, var16, (byte) -47);
                    statePc = 255;
                    continue stateLoop;
                }
                case 255: {
                    if (this.b((byte) 11, 9)) {
                        statePc = 258;
                    } else {
                        statePc = 269;
                    }
                    continue stateLoop;
                }
                case 258: {
                    this.a(-26476, 10);
                    if (null == es.field_b) {
                        statePc = 264;
                    } else {
                        statePc = 259;
                    }
                    continue stateLoop;
                }
                case 259: {
                    if (es.field_b.field_f == null) {
                        statePc = 264;
                    } else {
                        statePc = 262;
                    }
                    continue stateLoop;
                }
                case 262: {
                    this.a((byte) 123, 10);
                    statePc = 264;
                    continue stateLoop;
                }
                case 264: {
                    if (this.b(10, -61)) {
                        statePc = 267;
                    } else {
                        statePc = 269;
                    }
                    continue stateLoop;
                }
                case 267: {
                    var21_ref_int__ = this.a(11, param9, 30, param4, param3, param6, param5, param1);
                    if (null == var21_ref_int__) {
                        statePc = 269;
                    } else {
                        statePc = 268;
                    }
                    continue stateLoop;
                }
                case 268: {
                    var22_ref_String = isa.a(vsa.field_o, new String[]{bpb.field_q[ve.field_p]}, 110);
                    this.a(var21_ref_int__, param3, true, hlb.a(lu.field_f[10], 255), param0, true, var22_ref_String, var16, (byte) -50);
                    statePc = 269;
                    continue stateLoop;
                }
                case 269: {
                    if (!ssa.b(2)) {
                        statePc = 276;
                    } else {
                        statePc = 270;
                    }
                    continue stateLoop;
                }
                case 270: {
                    if (si.field_o[101]) {
                        statePc = 275;
                    } else {
                        statePc = 276;
                    }
                    continue stateLoop;
                }
                case 275: {
                    this.a((byte) 118, 10);
                    statePc = 276;
                    continue stateLoop;
                }
                case 276: {
                    var21_ref_int__ = new int[2];
                    param12.field_k.a(var21_ref_int__, (byte) -17, true);
                    var22 = var21_ref_int__[0] * 256 / var21_ref_int__[1];
                    var21_ref_int__[0] = 0;
                    var21_ref_int__[1] = 0;
                    param12.field_k.a(var21_ref_int__, (byte) -17, false);
                    var23_int = 256 * var21_ref_int__[0] / var21_ref_int__[1];
                    if (var22 >= var23_int) {
                        statePc = 280;
                    } else {
                        statePc = 277;
                    }
                    continue stateLoop;
                }
                case 277: {
                    this.a(-26476, 5);
                    if (var43 == 0) {
                        statePc = 286;
                    } else {
                        statePc = 280;
                    }
                    continue stateLoop;
                }
                case 280: {
                    if (0 < lu.field_f[5]) {
                        statePc = 285;
                    } else {
                        statePc = 286;
                    }
                    continue stateLoop;
                }
                case 285: {
                    lu.field_f[5] = lu.field_f[5] - 1;
                    statePc = 286;
                    continue stateLoop;
                }
                case 286: {
                    if (param12.d(4, 75)) {
                        statePc = 289;
                    } else {
                        statePc = 290;
                    }
                    continue stateLoop;
                }
                case 289: {
                    this.a((byte) 118, 5);
                    statePc = 290;
                    continue stateLoop;
                }
                case 290: {
                    if (this.b(5, -12)) {
                        statePc = 293;
                    } else {
                        statePc = 297;
                    }
                    continue stateLoop;
                }
                case 293: {
                    var24_array = this.a(4, param9, 30, param4, param3, param6, param5, param1);
                    if (var24_array != null) {
                        statePc = 296;
                    } else {
                        statePc = 297;
                    }
                    continue stateLoop;
                }
                case 296: {
                    this.a(var24_array, param3, true, hlb.a(lu.field_f[5], 255), param0, true, oba.field_o, var16, (byte) 98);
                    statePc = 297;
                    continue stateLoop;
                }
                case 297: {
                    if (!param12.d(4, 72)) {
                        statePc = 306;
                    } else {
                        statePc = 298;
                    }
                    continue stateLoop;
                }
                case 298: {
                    if (!param12.q(-50)) {
                        statePc = 303;
                    } else {
                        statePc = 301;
                    }
                    continue stateLoop;
                }
                case 301: {
                    this.a(-26476, 6);
                    statePc = 303;
                    continue stateLoop;
                }
                case 303: {
                    if (param12.v(32)) {
                        statePc = 306;
                    } else {
                        statePc = 304;
                    }
                    continue stateLoop;
                }
                case 304: {
                    this.a((byte) 106, 6);
                    statePc = 306;
                    continue stateLoop;
                }
                case 306: {
                    if (this.b(6, -88)) {
                        statePc = 309;
                    } else {
                        statePc = 312;
                    }
                    continue stateLoop;
                }
                case 309: {
                    var21_ref_int__ = this.a(4, param9, 30, param4, param3, param6, param5, param1);
                    if (var21_ref_int__ == null) {
                        statePc = 312;
                    } else {
                        statePc = 310;
                    }
                    continue stateLoop;
                }
                case 310: {
                    this.a(var21_ref_int__, param3, true, hlb.a(lu.field_f[6], 255), param0, true, afa.field_p, var16, (byte) 102);
                    statePc = 312;
                    continue stateLoop;
                }
                case 312: {
                    var21_ref_int__ = this.a(0, param9, 30, param4, param3, param6, param5, param1);
                    if (null == var21_ref_int__) {
                        statePc = 335;
                    } else {
                        statePc = 313;
                    }
                    continue stateLoop;
                }
                case 313: {
                    this.a(-26476, 7);
                    if (-1 == (param7 ^ -1)) {
                        statePc = 318;
                    } else {
                        statePc = 331;
                    }
                    continue stateLoop;
                }
                case 318: {
                    this.a((byte) 82, 7);
                    if (!this.b((byte) 11, 7)) {
                        statePc = 331;
                    } else {
                        statePc = 319;
                    }
                    continue stateLoop;
                }
                case 319: {
                    if (0 == (pk.field_o ^ -1)) {
                        statePc = 331;
                    } else {
                        statePc = 322;
                    }
                    continue stateLoop;
                }
                case 322: {
                    if (0 == (noa.field_q ^ -1)) {
                        statePc = 331;
                    } else {
                        statePc = 325;
                    }
                    continue stateLoop;
                }
                case 325: {
                    this.a(-26476, 8);
                    if (this.b(8, -43)) {
                        statePc = 330;
                    } else {
                        statePc = 331;
                    }
                    continue stateLoop;
                }
                case 330: {
                    var22 = 1024;
                    var23_array = new int[]{var17 - var22, var17 - -var22, -var22 + var18, var18 + var22};
                    this.a(var23_array, param3, false, hlb.a(lu.field_f[8], 255), param0, true, pja.field_i, var16, (byte) -115);
                    statePc = 331;
                    continue stateLoop;
                }
                case 331: {
                    if (this.b(7, -106)) {
                        statePc = 334;
                    } else {
                        statePc = 335;
                    }
                    continue stateLoop;
                }
                case 334: {
                    this.a(var21_ref_int__, param3, true, hlb.a(lu.field_f[7], 255), param0, true, gla.field_b, var16, (byte) 60);
                    statePc = 335;
                    continue stateLoop;
                }
                case 335: {
                    if (!this.b((byte) 11, 10)) {
                        statePc = 367;
                    } else {
                        statePc = 336;
                    }
                    continue stateLoop;
                }
                case 336: {
                    if (param2) {
                        statePc = 341;
                    } else {
                        statePc = 367;
                    }
                    continue stateLoop;
                }
                case 341: {
                    this.field_c = this.field_c + 1;
                    var21 = -100 + this.field_c;
                    if ((var21 ^ -1) < -1) {
                        statePc = 344;
                    } else {
                        statePc = 367;
                    }
                    continue stateLoop;
                }
                case 344: {
                    if (var21 > 200) {
                        statePc = 347;
                    } else {
                        statePc = 348;
                    }
                    continue stateLoop;
                }
                case 347: {
                    var21 = 200;
                    statePc = 348;
                    continue stateLoop;
                }
                case 348: {
                    maa.a(165, (byte) -127, 2, qoa.field_p, var21);
                    statePc = 367;
                    continue stateLoop;
                }
                case 367: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_a = oea.f((byte) -49);
        field_e = 2;
    }
}
