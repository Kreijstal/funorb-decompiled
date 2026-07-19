/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class io extends tc {
    static int field_n;
    static String field_u;
    static int field_t;
    int field_s;
    static boolean field_w;
    static String field_p;
    static wk field_z;
    byte[] field_x;
    short[] field_r;
    private int[] field_q;
    fq[] field_v;
    static String field_o;
    byte[] field_l;
    byte[] field_k;
    static wk[] field_m;
    sn[] field_y;

    final static void a(wp param0, byte param1) {
        try {
            ft.field_q = param0;
            if (param1 != -34) {
                field_m = (wk[]) null;
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "io.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(byte param0) {
        field_p = null;
        field_z = null;
        field_o = null;
        field_m = null;
        if (param0 != 52) {
            return;
        }
        field_u = null;
    }

    final void a(int param0) {
        if (param0 <= 117) {
            this.field_q = (int[]) null;
        }
        this.field_q = null;
    }

    final static boolean a(int[] param0, byte param1) {
        boolean discarded$2 = false;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int[] var4 = null;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 > 106) {
                break L1;
              } else {
                var4 = (int[]) null;
                discarded$2 = io.a((int[]) null, (byte) -31);
                break L1;
              }
            }
            var2_int = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (-9 >= (var2_int ^ -1)) {
                    break L4;
                  } else {
                    stackOut_5_0 = param0[var2_int] ^ -1;
                    stackIn_11_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var3 != 0) {
                      break L3;
                    } else {
                      if (stackIn_6_0 == -1) {
                        var2_int++;
                        if (var3 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      } else {
                        stackOut_7_0 = 1;
                        stackIn_8_0 = stackOut_7_0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                }
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                break L3;
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var2);
            stackOut_12_1 = new StringBuilder().append("io.E(");
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
          throw ig.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_11_0 != 0;
        } else {
          return stackIn_8_0 != 0;
        }
    }

    final boolean a(int param0, byte[] param1, int[] param2, p param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = 1;
              var6 = 0;
              var7 = null;
              if (param0 == 11008) {
                break L1;
              } else {
                field_o = (String) null;
                break L1;
              }
            }
            var8 = 0;
            L2: while (true) {
              L3: {
                if (-129 >= (var8 ^ -1)) {
                  break L3;
                } else {
                  L4: {
                    L5: {
                      if (param1 == null) {
                        break L5;
                      } else {
                        if ((param1[var8] ^ -1) == -1) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      var9 = this.field_q[var8];
                      if (-1 != (var9 ^ -1)) {
                        break L6;
                      } else {
                        if (var10 == 0) {
                          break L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      if (var6 == var9) {
                        break L7;
                      } else {
                        L8: {
                          L9: {
                            var6 = var9;
                            var9--;
                            if ((1 & var9 ^ -1) != -1) {
                              break L9;
                            } else {
                              var7 = param3.a(true, param2, var9 >> -1323980030);
                              if (var10 == 0) {
                                break L8;
                              } else {
                                break L9;
                              }
                            }
                          }
                          var7 = param3.a(param2, 36, var9 >> -634626462);
                          break L8;
                        }
                        if (var7 != null) {
                          break L7;
                        } else {
                          var5_int = 0;
                          break L7;
                        }
                      }
                    }
                    if (var7 == null) {
                      break L4;
                    } else {
                      this.field_y[var8] = (sn) (var7);
                      this.field_q[var8] = 0;
                      break L4;
                    }
                  }
                  var8++;
                  if (var10 == 0) {
                    continue L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_20_0 = var5_int;
              stackIn_21_0 = stackOut_20_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var5);
            stackOut_22_1 = new StringBuilder().append("io.C(").append(param0).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L10;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L10;
            }
          }
          L11: {
            stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param2 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L11;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L11;
            }
          }
          L12: {
            stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param3 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L12;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L12;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ')');
        }
        return stackIn_21_0 != 0;
    }

    io(byte[] param0) {
        int incrementValue$9 = 0;
        fq dupTemp$10 = null;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        byte[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        byte[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        byte[] var10 = null;
        int var11_int = 0;
        byte[] var11 = null;
        int var12 = 0;
        int var13_int = 0;
        fq[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        fq var15 = null;
        byte[] var15_array = null;
        int var16_int = 0;
        byte[] var16 = null;
        int var17 = 0;
        byte[] var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25_int = 0;
        Object var25 = null;
        int var26 = 0;
        int var27 = 0;
        int var28_int = 0;
        fq var28 = null;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        vh var37 = null;
        byte[] var38 = null;
        fq var39 = null;
        byte[] var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        fq var44 = null;
        byte[] var45 = null;
        byte[] var46 = null;
        fq var47 = null;
        fq var48 = null;
        fq var49 = null;
        fq var50 = null;
        fq var51 = null;
        byte[] var52 = null;
        byte[] var53 = null;
        byte[] var54 = null;
        byte[] var55 = null;
        byte[] var56 = null;
        byte[] var57 = null;
        int stackIn_30_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        int stackIn_46_0 = 0;
        int stackIn_46_1 = 0;
        byte[] stackIn_49_0 = null;
        byte[] stackIn_52_0 = null;
        int stackIn_73_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_92_0 = 0;
        int stackIn_95_0 = 0;
        int stackIn_103_0 = 0;
        int stackIn_106_0 = 0;
        int stackIn_114_0 = 0;
        int stackIn_117_0 = 0;
        int stackIn_117_1 = 0;
        int stackIn_126_0 = 0;
        int stackIn_126_1 = 0;
        Object stackIn_128_0 = null;
        byte[] stackIn_128_1 = null;
        Object stackIn_141_0 = null;
        byte[] stackIn_141_1 = null;
        Object stackIn_154_0 = null;
        byte[] stackIn_154_1 = null;
        Object stackIn_164_0 = null;
        byte[] stackIn_164_1 = null;
        int stackIn_184_0 = 0;
        int stackIn_191_0 = 0;
        Object stackIn_197_0 = null;
        byte[] stackIn_197_1 = null;
        int stackIn_206_0 = 0;
        int stackIn_212_0 = 0;
        int stackIn_214_0 = 0;
        int stackIn_214_1 = 0;
        int stackIn_216_0 = 0;
        int stackIn_219_0 = 0;
        int stackIn_219_1 = 0;
        int stackIn_233_0 = 0;
        fq stackIn_240_0 = null;
        int stackIn_254_0 = 0;
        int stackIn_254_1 = 0;
        int stackIn_259_0 = 0;
        int stackIn_259_1 = 0;
        fq stackIn_262_0 = null;
        RuntimeException stackIn_267_0 = null;
        StringBuilder stackIn_267_1 = null;
        RuntimeException stackIn_268_0 = null;
        StringBuilder stackIn_268_1 = null;
        RuntimeException stackIn_269_0 = null;
        StringBuilder stackIn_269_1 = null;
        String stackIn_269_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_29_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_39_1 = 0;
        int stackOut_45_0 = 0;
        int stackOut_45_1 = 0;
        Object stackOut_48_0 = null;
        byte[] stackOut_47_0 = null;
        byte[] stackOut_51_0 = null;
        Object stackOut_50_0 = null;
        int stackOut_72_0 = 0;
        int stackOut_79_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_91_0 = 0;
        int stackOut_94_0 = 0;
        int stackOut_102_0 = 0;
        int stackOut_105_0 = 0;
        int stackOut_113_0 = 0;
        int stackOut_116_0 = 0;
        int stackOut_116_1 = 0;
        Object stackOut_127_0 = null;
        byte[] stackOut_127_1 = null;
        int stackOut_125_0 = 0;
        int stackOut_125_1 = 0;
        Object stackOut_140_0 = null;
        byte[] stackOut_140_1 = null;
        Object stackOut_153_0 = null;
        byte[] stackOut_153_1 = null;
        Object stackOut_163_0 = null;
        byte[] stackOut_163_1 = null;
        int stackOut_183_0 = 0;
        int stackOut_190_0 = 0;
        Object stackOut_196_0 = null;
        byte[] stackOut_196_1 = null;
        int stackOut_205_0 = 0;
        int stackOut_211_0 = 0;
        int stackOut_213_0 = 0;
        int stackOut_213_1 = 0;
        int stackOut_215_0 = 0;
        int stackOut_218_0 = 0;
        int stackOut_218_1 = 0;
        int stackOut_232_0 = 0;
        fq stackOut_239_0 = null;
        int stackOut_258_0 = 0;
        int stackOut_258_1 = 0;
        fq stackOut_261_0 = null;
        int stackOut_253_0 = 0;
        int stackOut_253_1 = 0;
        RuntimeException stackOut_266_0 = null;
        StringBuilder stackOut_266_1 = null;
        RuntimeException stackOut_268_0 = null;
        StringBuilder stackOut_268_1 = null;
        String stackOut_268_2 = null;
        RuntimeException stackOut_267_0 = null;
        StringBuilder stackOut_267_1 = null;
        String stackOut_267_2 = null;
        var36 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            this.field_x = new byte[128];
            this.field_y = new sn[128];
            this.field_k = new byte[128];
            this.field_r = new short[128];
            this.field_q = new int[128];
            this.field_v = new fq[128];
            this.field_l = new byte[128];
            var37 = new vh(param0);
            var3 = 0;
            L1: while (true) {
              L2: {
                if (-1 == (var37.field_o[var3 + var37.field_q] ^ -1)) {
                  break L2;
                } else {
                  var3++;
                  if (var36 == 0) {
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              var54 = new byte[var3];
              var41 = var54;
              var4 = var41;
              var5 = 0;
              L3: while (true) {
                L4: {
                  L5: {
                    if (var5 >= var3) {
                      break L5;
                    } else {
                      var4[var5] = var37.a((byte) 8);
                      var5++;
                      if (var36 != 0) {
                        break L4;
                      } else {
                        if (var36 == 0) {
                          continue L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  var3++;
                  var37.field_q = var37.field_q + 1;
                  var5 = var37.field_q;
                  var37.field_q = var37.field_q + var3;
                  break L4;
                }
                var6 = 0;
                L6: while (true) {
                  L7: {
                    if (-1 == (var37.field_o[var6 + var37.field_q] ^ -1)) {
                      break L7;
                    } else {
                      var6++;
                      if (var36 == 0) {
                        continue L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  var55 = new byte[var6];
                  var42 = var55;
                  var7 = var42;
                  var8 = 0;
                  L8: while (true) {
                    L9: {
                      L10: {
                        if ((var8 ^ -1) <= (var6 ^ -1)) {
                          break L10;
                        } else {
                          var7[var8] = var37.a((byte) -120);
                          var8++;
                          if (var36 != 0) {
                            break L9;
                          } else {
                            if (var36 == 0) {
                              continue L8;
                            } else {
                              break L10;
                            }
                          }
                        }
                      }
                      var6++;
                      var37.field_q = var37.field_q + 1;
                      var8 = var37.field_q;
                      var37.field_q = var37.field_q + var6;
                      break L9;
                    }
                    var9 = 0;
                    L11: while (true) {
                      L12: {
                        if (-1 == (var37.field_o[var9 + var37.field_q] ^ -1)) {
                          break L12;
                        } else {
                          var9++;
                          if (var36 == 0) {
                            continue L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                      var56 = new byte[var9];
                      var43 = var56;
                      var10 = var43;
                      var11_int = 0;
                      L13: while (true) {
                        L14: {
                          L15: {
                            if ((var9 ^ -1) >= (var11_int ^ -1)) {
                              break L15;
                            } else {
                              var10[var11_int] = var37.a((byte) -113);
                              var11_int++;
                              if (var36 != 0) {
                                break L14;
                              } else {
                                if (var36 == 0) {
                                  continue L13;
                                } else {
                                  break L15;
                                }
                              }
                            }
                          }
                          var9++;
                          var37.field_q = var37.field_q + 1;
                          break L14;
                        }
                        L16: {
                          L17: {
                            L18: {
                              var52 = new byte[var9];
                              var38 = var52;
                              var11 = var38;
                              if ((var9 ^ -1) < -2) {
                                break L18;
                              } else {
                                var12 = var9;
                                if (var36 == 0) {
                                  break L17;
                                } else {
                                  break L18;
                                }
                              }
                            }
                            var52[1] = (byte) 1;
                            var13_int = 1;
                            var12 = 2;
                            var14 = 2;
                            L19: while (true) {
                              if (var14 >= var9) {
                                break L17;
                              } else {
                                var15_int = var37.k(0);
                                stackOut_29_0 = var15_int;
                                stackIn_37_0 = stackOut_29_0;
                                stackIn_30_0 = stackOut_29_0;
                                if (var36 != 0) {
                                  break L16;
                                } else {
                                  L20: {
                                    L21: {
                                      if (stackIn_30_0 != 0) {
                                        break L21;
                                      } else {
                                        incrementValue$9 = var12;
                                        var12++;
                                        var13_int = incrementValue$9;
                                        if (var36 == 0) {
                                          break L20;
                                        } else {
                                          break L21;
                                        }
                                      }
                                    }
                                    L22: {
                                      if (var15_int > var13_int) {
                                        break L22;
                                      } else {
                                        var15_int--;
                                        break L22;
                                      }
                                    }
                                    var13_int = var15_int;
                                    break L20;
                                  }
                                  var11[var14] = (byte)var13_int;
                                  var14++;
                                  if (var36 == 0) {
                                    continue L19;
                                  } else {
                                    break L17;
                                  }
                                }
                              }
                            }
                          }
                          stackOut_36_0 = var12;
                          stackIn_37_0 = stackOut_36_0;
                          break L16;
                        }
                        var13 = new fq[stackIn_37_0];
                        var14 = 0;
                        L23: while (true) {
                          L24: {
                            L25: {
                              if ((var14 ^ -1) <= (var13.length ^ -1)) {
                                break L25;
                              } else {
                                dupTemp$10 = new fq();
                                var13[var14] = dupTemp$10;
                                var39 = dupTemp$10;
                                var15 = var39;
                                var16_int = var37.k(0);
                                stackOut_39_0 = var16_int ^ -1;
                                stackOut_39_1 = -1;
                                stackIn_46_0 = stackOut_39_0;
                                stackIn_46_1 = stackOut_39_1;
                                stackIn_40_0 = stackOut_39_0;
                                stackIn_40_1 = stackOut_39_1;
                                if (var36 != 0) {
                                  break L24;
                                } else {
                                  L26: {
                                    if (stackIn_40_0 >= stackIn_40_1) {
                                      break L26;
                                    } else {
                                      var15.field_l = new byte[2 * var16_int];
                                      break L26;
                                    }
                                  }
                                  L27: {
                                    var16_int = var37.k(0);
                                    if (0 >= var16_int) {
                                      break L27;
                                    } else {
                                      var15.field_g = new byte[2 + var16_int * 2];
                                      var39.field_g[1] = (byte)64;
                                      break L27;
                                    }
                                  }
                                  var14++;
                                  if (var36 == 0) {
                                    continue L23;
                                  } else {
                                    break L25;
                                  }
                                }
                              }
                            }
                            var14 = var37.k(0);
                            stackOut_45_0 = -1;
                            stackOut_45_1 = var14 ^ -1;
                            stackIn_46_0 = stackOut_45_0;
                            stackIn_46_1 = stackOut_45_1;
                            break L24;
                          }
                          L28: {
                            if (stackIn_46_0 <= stackIn_46_1) {
                              stackOut_48_0 = null;
                              stackIn_49_0 = (byte[]) ((Object) stackOut_48_0);
                              break L28;
                            } else {
                              stackOut_47_0 = new byte[2 * var14];
                              stackIn_49_0 = stackOut_47_0;
                              break L28;
                            }
                          }
                          L29: {
                            var45 = stackIn_49_0;
                            var15_array = var45;
                            var14 = var37.k(0);
                            if (0 < var14) {
                              stackOut_51_0 = new byte[var14 * 2];
                              stackIn_52_0 = stackOut_51_0;
                              break L29;
                            } else {
                              stackOut_50_0 = null;
                              stackIn_52_0 = (byte[]) ((Object) stackOut_50_0);
                              break L29;
                            }
                          }
                          var57 = stackIn_52_0;
                          var46 = var57;
                          var16 = var46;
                          var17 = 0;
                          L30: while (true) {
                            L31: {
                              if (0 == var37.field_o[var37.field_q + var17]) {
                                break L31;
                              } else {
                                var17++;
                                if (var36 == 0) {
                                  continue L30;
                                } else {
                                  break L31;
                                }
                              }
                            }
                            var53 = new byte[var17];
                            var40 = var53;
                            var18 = var40;
                            var19 = 0;
                            L32: while (true) {
                              L33: {
                                L34: {
                                  if ((var19 ^ -1) <= (var17 ^ -1)) {
                                    break L34;
                                  } else {
                                    var18[var19] = var37.a((byte) -53);
                                    var19++;
                                    if (var36 != 0) {
                                      break L33;
                                    } else {
                                      if (var36 == 0) {
                                        continue L32;
                                      } else {
                                        break L34;
                                      }
                                    }
                                  }
                                }
                                var17++;
                                var37.field_q = var37.field_q + 1;
                                var19 = 0;
                                break L33;
                              }
                              var20 = 0;
                              L35: while (true) {
                                L36: {
                                  L37: {
                                    if (128 <= var20) {
                                      break L37;
                                    } else {
                                      var19 = var19 + var37.k(0);
                                      this.field_r[var20] = (short)var19;
                                      var20++;
                                      if (var36 != 0) {
                                        break L36;
                                      } else {
                                        if (var36 == 0) {
                                          continue L35;
                                        } else {
                                          break L37;
                                        }
                                      }
                                    }
                                  }
                                  var19 = 0;
                                  break L36;
                                }
                                var20 = 0;
                                L38: while (true) {
                                  L39: {
                                    L40: {
                                      if (128 <= var20) {
                                        break L40;
                                      } else {
                                        var19 = var19 + var37.k(0);
                                        this.field_r[var20] = (short)(this.field_r[var20] + (var19 << 815836392));
                                        var20++;
                                        if (var36 != 0) {
                                          break L39;
                                        } else {
                                          if (var36 == 0) {
                                            continue L38;
                                          } else {
                                            break L40;
                                          }
                                        }
                                      }
                                    }
                                    var20 = 0;
                                    break L39;
                                  }
                                  var21 = 0;
                                  var22 = 0;
                                  var23 = 0;
                                  L41: while (true) {
                                    L42: {
                                      L43: {
                                        if ((var23 ^ -1) <= -129) {
                                          break L43;
                                        } else {
                                          stackOut_72_0 = 0;
                                          stackIn_80_0 = stackOut_72_0;
                                          stackIn_73_0 = stackOut_72_0;
                                          if (var36 != 0) {
                                            break L42;
                                          } else {
                                            L44: {
                                              if (stackIn_73_0 != var20) {
                                                break L44;
                                              } else {
                                                L45: {
                                                  L46: {
                                                    if ((var53.length ^ -1) >= (var21 ^ -1)) {
                                                      break L46;
                                                    } else {
                                                      incrementValue$11 = var21;
                                                      var21++;
                                                      var20 = var18[incrementValue$11];
                                                      if (var36 == 0) {
                                                        break L45;
                                                      } else {
                                                        break L46;
                                                      }
                                                    }
                                                  }
                                                  var20 = -1;
                                                  break L45;
                                                }
                                                var22 = var37.h(110);
                                                break L44;
                                              }
                                            }
                                            this.field_r[var23] = (short)(this.field_r[var23] + (rn.a(-1 + var22, 2) << 1552347598));
                                            this.field_q[var23] = var22;
                                            var20--;
                                            var23++;
                                            if (var36 == 0) {
                                              continue L41;
                                            } else {
                                              break L43;
                                            }
                                          }
                                        }
                                      }
                                      var20 = 0;
                                      var21 = 0;
                                      var23 = 0;
                                      stackOut_79_0 = 0;
                                      stackIn_80_0 = stackOut_79_0;
                                      break L42;
                                    }
                                    var24 = stackIn_80_0;
                                    L47: while (true) {
                                      L48: {
                                        L49: {
                                          if (var24 >= 128) {
                                            break L49;
                                          } else {
                                            stackOut_82_0 = this.field_q[var24];
                                            stackIn_92_0 = stackOut_82_0;
                                            stackIn_83_0 = stackOut_82_0;
                                            if (var36 != 0) {
                                              break L48;
                                            } else {
                                              L50: {
                                                L51: {
                                                  if (stackIn_83_0 != 0) {
                                                    break L51;
                                                  } else {
                                                    if (var36 == 0) {
                                                      break L50;
                                                    } else {
                                                      break L51;
                                                    }
                                                  }
                                                }
                                                L52: {
                                                  if (-1 != (var20 ^ -1)) {
                                                    break L52;
                                                  } else {
                                                    L53: {
                                                      incrementValue$12 = var5;
                                                      var5++;
                                                      var23 = -1 + var37.field_o[incrementValue$12];
                                                      if ((var21 ^ -1) <= (var54.length ^ -1)) {
                                                        break L53;
                                                      } else {
                                                        incrementValue$13 = var21;
                                                        var21++;
                                                        var20 = var4[incrementValue$13];
                                                        if (var36 == 0) {
                                                          break L52;
                                                        } else {
                                                          break L53;
                                                        }
                                                      }
                                                    }
                                                    var20 = -1;
                                                    break L52;
                                                  }
                                                }
                                                var20--;
                                                this.field_k[var24] = (byte)var23;
                                                break L50;
                                              }
                                              var24++;
                                              if (var36 == 0) {
                                                continue L47;
                                              } else {
                                                break L49;
                                              }
                                            }
                                          }
                                        }
                                        var21 = 0;
                                        var20 = 0;
                                        var24 = 0;
                                        stackOut_91_0 = 0;
                                        stackIn_92_0 = stackOut_91_0;
                                        break L48;
                                      }
                                      var25_int = stackIn_92_0;
                                      L54: while (true) {
                                        L55: {
                                          L56: {
                                            if (-129 >= (var25_int ^ -1)) {
                                              break L56;
                                            } else {
                                              stackOut_94_0 = -1;
                                              stackIn_103_0 = stackOut_94_0;
                                              stackIn_95_0 = stackOut_94_0;
                                              if (var36 != 0) {
                                                break L55;
                                              } else {
                                                L57: {
                                                  if (stackIn_95_0 == (this.field_q[var25_int] ^ -1)) {
                                                    break L57;
                                                  } else {
                                                    L58: {
                                                      if ((var20 ^ -1) != -1) {
                                                        break L58;
                                                      } else {
                                                        L59: {
                                                          incrementValue$14 = var8;
                                                          var8++;
                                                          var24 = 16 + var37.field_o[incrementValue$14] << 1530818946;
                                                          if ((var55.length ^ -1) < (var21 ^ -1)) {
                                                            break L59;
                                                          } else {
                                                            var20 = -1;
                                                            if (var36 == 0) {
                                                              break L58;
                                                            } else {
                                                              break L59;
                                                            }
                                                          }
                                                        }
                                                        incrementValue$15 = var21;
                                                        var21++;
                                                        var20 = var7[incrementValue$15];
                                                        break L58;
                                                      }
                                                    }
                                                    var20--;
                                                    this.field_x[var25_int] = (byte)var24;
                                                    break L57;
                                                  }
                                                }
                                                var25_int++;
                                                if (var36 == 0) {
                                                  continue L54;
                                                } else {
                                                  break L56;
                                                }
                                              }
                                            }
                                          }
                                          var21 = 0;
                                          stackOut_102_0 = 0;
                                          stackIn_103_0 = stackOut_102_0;
                                          break L55;
                                        }
                                        var20 = stackIn_103_0;
                                        var25 = null;
                                        var26 = 0;
                                        L60: while (true) {
                                          L61: {
                                            L62: {
                                              if ((var26 ^ -1) <= -129) {
                                                break L62;
                                              } else {
                                                stackOut_105_0 = 0;
                                                stackIn_114_0 = stackOut_105_0;
                                                stackIn_106_0 = stackOut_105_0;
                                                if (var36 != 0) {
                                                  break L61;
                                                } else {
                                                  L63: {
                                                    if (stackIn_106_0 == this.field_q[var26]) {
                                                      break L63;
                                                    } else {
                                                      L64: {
                                                        if ((var20 ^ -1) != -1) {
                                                          break L64;
                                                        } else {
                                                          L65: {
                                                            var25 = var13[var52[var21]];
                                                            if ((var21 ^ -1) > (var56.length ^ -1)) {
                                                              break L65;
                                                            } else {
                                                              var20 = -1;
                                                              if (var36 == 0) {
                                                                break L64;
                                                              } else {
                                                                break L65;
                                                              }
                                                            }
                                                          }
                                                          incrementValue$16 = var21;
                                                          var21++;
                                                          var20 = var10[incrementValue$16];
                                                          break L64;
                                                        }
                                                      }
                                                      this.field_v[var26] = (fq) (var25);
                                                      var20--;
                                                      break L63;
                                                    }
                                                  }
                                                  var26++;
                                                  if (var36 == 0) {
                                                    continue L60;
                                                  } else {
                                                    break L62;
                                                  }
                                                }
                                              }
                                            }
                                            var21 = 0;
                                            var20 = 0;
                                            var26 = 0;
                                            stackOut_113_0 = 0;
                                            stackIn_114_0 = stackOut_113_0;
                                            break L61;
                                          }
                                          var27 = stackIn_114_0;
                                          L66: while (true) {
                                            L67: {
                                              L68: {
                                                L69: {
                                                  if (var27 >= 128) {
                                                    break L69;
                                                  } else {
                                                    stackOut_116_0 = -1;
                                                    stackOut_116_1 = var20 ^ -1;
                                                    stackIn_126_0 = stackOut_116_0;
                                                    stackIn_126_1 = stackOut_116_1;
                                                    stackIn_117_0 = stackOut_116_0;
                                                    stackIn_117_1 = stackOut_116_1;
                                                    if (var36 != 0) {
                                                      L70: while (true) {
                                                        if (stackIn_126_0 <= stackIn_126_1) {
                                                          break L68;
                                                        } else {
                                                          var44 = var13[var27];
                                                          stackOut_127_0 = null;
                                                          stackOut_127_1 = var44.field_l;
                                                          stackIn_141_0 = stackOut_127_0;
                                                          stackIn_141_1 = stackOut_127_1;
                                                          stackIn_128_0 = stackOut_127_0;
                                                          stackIn_128_1 = stackOut_127_1;
                                                          if (var36 != 0) {
                                                            break L67;
                                                          } else {
                                                            L71: {
                                                              L72: {
                                                                if (stackIn_128_0 == stackIn_128_1) {
                                                                  break L72;
                                                                } else {
                                                                  var29 = 1;
                                                                  L73: while (true) {
                                                                    if ((var29 ^ -1) <= (var44.field_l.length ^ -1)) {
                                                                      break L72;
                                                                    } else {
                                                                      var44.field_l[var29] = var37.a((byte) -89);
                                                                      var29 += 2;
                                                                      if (var36 != 0) {
                                                                        break L71;
                                                                      } else {
                                                                        if (var36 == 0) {
                                                                          continue L73;
                                                                        } else {
                                                                          break L72;
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                              L74: {
                                                                if (null == var44.field_g) {
                                                                  break L74;
                                                                } else {
                                                                  var29 = 3;
                                                                  L75: while (true) {
                                                                    if ((var29 ^ -1) <= (var44.field_g.length - 2 ^ -1)) {
                                                                      break L74;
                                                                    } else {
                                                                      var44.field_g[var29] = var37.a((byte) 103);
                                                                      var29 += 2;
                                                                      if (var36 != 0) {
                                                                        break L71;
                                                                      } else {
                                                                        if (var36 == 0) {
                                                                          continue L75;
                                                                        } else {
                                                                          break L74;
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                              var27++;
                                                              break L71;
                                                            }
                                                            if (var36 == 0) {
                                                              stackOut_125_0 = var27 ^ -1;
                                                              stackOut_125_1 = var12 ^ -1;
                                                              stackIn_126_0 = stackOut_125_0;
                                                              stackIn_126_1 = stackOut_125_1;
                                                              continue L70;
                                                            } else {
                                                              break L68;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      L76: {
                                                        if (stackIn_117_0 != stackIn_117_1) {
                                                          break L76;
                                                        } else {
                                                          L77: {
                                                            L78: {
                                                              if ((var21 ^ -1) <= (var53.length ^ -1)) {
                                                                break L78;
                                                              } else {
                                                                incrementValue$17 = var21;
                                                                var21++;
                                                                var20 = var18[incrementValue$17];
                                                                if (var36 == 0) {
                                                                  break L77;
                                                                } else {
                                                                  break L78;
                                                                }
                                                              }
                                                            }
                                                            var20 = -1;
                                                            break L77;
                                                          }
                                                          if (-1 <= (this.field_q[var27] ^ -1)) {
                                                            break L76;
                                                          } else {
                                                            var26 = var37.k(0) - -1;
                                                            break L76;
                                                          }
                                                        }
                                                      }
                                                      this.field_l[var27] = (byte)var26;
                                                      var20--;
                                                      var27++;
                                                      if (var36 == 0) {
                                                        continue L66;
                                                      } else {
                                                        break L69;
                                                      }
                                                    }
                                                  }
                                                }
                                                this.field_s = var37.k(0) - -1;
                                                var27 = 0;
                                                L79: while (true) {
                                                  stackOut_125_0 = var27 ^ -1;
                                                  stackOut_125_1 = var12 ^ -1;
                                                  stackIn_126_0 = stackOut_125_0;
                                                  stackIn_126_1 = stackOut_125_1;
                                                  if (stackIn_126_0 <= stackIn_126_1) {
                                                    break L68;
                                                  } else {
                                                    var44 = var13[var27];
                                                    stackOut_127_0 = null;
                                                    stackOut_127_1 = var44.field_l;
                                                    stackIn_141_0 = stackOut_127_0;
                                                    stackIn_141_1 = stackOut_127_1;
                                                    stackIn_128_0 = stackOut_127_0;
                                                    stackIn_128_1 = stackOut_127_1;
                                                    if (var36 != 0) {
                                                      break L67;
                                                    } else {
                                                      L80: {
                                                        L81: {
                                                          if (stackIn_128_0 == stackIn_128_1) {
                                                            break L81;
                                                          } else {
                                                            var29 = 1;
                                                            L82: while (true) {
                                                              if ((var29 ^ -1) <= (var44.field_l.length ^ -1)) {
                                                                break L81;
                                                              } else {
                                                                var44.field_l[var29] = var37.a((byte) -89);
                                                                var29 += 2;
                                                                if (var36 != 0) {
                                                                  break L80;
                                                                } else {
                                                                  if (var36 == 0) {
                                                                    continue L82;
                                                                  } else {
                                                                    break L81;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                        L83: {
                                                          if (null == var44.field_g) {
                                                            break L83;
                                                          } else {
                                                            var29 = 3;
                                                            L84: while (true) {
                                                              if ((var29 ^ -1) <= (var44.field_g.length - 2 ^ -1)) {
                                                                break L83;
                                                              } else {
                                                                var44.field_g[var29] = var37.a((byte) 103);
                                                                var29 += 2;
                                                                if (var36 != 0) {
                                                                  break L80;
                                                                } else {
                                                                  if (var36 == 0) {
                                                                    continue L84;
                                                                  } else {
                                                                    break L83;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                        var27++;
                                                        break L80;
                                                      }
                                                      if (var36 == 0) {
                                                        continue L79;
                                                      } else {
                                                        break L68;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              stackOut_140_0 = null;
                                              stackOut_140_1 = (byte[]) (var15_array);
                                              stackIn_141_0 = stackOut_140_0;
                                              stackIn_141_1 = stackOut_140_1;
                                              break L67;
                                            }
                                            L85: {
                                              L86: {
                                                L87: {
                                                  L88: {
                                                    if (stackIn_141_0 == stackIn_141_1) {
                                                      break L88;
                                                    } else {
                                                      var27 = 1;
                                                      L89: while (true) {
                                                        if ((var27 ^ -1) <= (var45.length ^ -1)) {
                                                          break L88;
                                                        } else {
                                                          var15_array[var27] = var37.a((byte) 111);
                                                          var27 += 2;
                                                          if (var36 != 0) {
                                                            break L87;
                                                          } else {
                                                            if (var36 == 0) {
                                                              continue L89;
                                                            } else {
                                                              break L88;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                  if (var16 == null) {
                                                    break L86;
                                                  } else {
                                                    break L87;
                                                  }
                                                }
                                                var27 = 1;
                                                L90: while (true) {
                                                  if (var57.length <= var27) {
                                                    break L86;
                                                  } else {
                                                    var16[var27] = var37.a((byte) 116);
                                                    var27 += 2;
                                                    if (var36 != 0) {
                                                      break L85;
                                                    } else {
                                                      if (var36 == 0) {
                                                        continue L90;
                                                      } else {
                                                        break L86;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              var27 = 0;
                                              break L85;
                                            }
                                            L91: while (true) {
                                              L92: {
                                                L93: {
                                                  if (var12 <= var27) {
                                                    break L93;
                                                  } else {
                                                    var47 = var13[var27];
                                                    stackOut_153_0 = null;
                                                    stackOut_153_1 = var47.field_g;
                                                    stackIn_197_0 = stackOut_153_0;
                                                    stackIn_197_1 = stackOut_153_1;
                                                    stackIn_154_0 = stackOut_153_0;
                                                    stackIn_154_1 = stackOut_153_1;
                                                    if (var36 != 0) {
                                                      break L92;
                                                    } else {
                                                      L94: {
                                                        L95: {
                                                          if (stackIn_154_0 == stackIn_154_1) {
                                                            break L95;
                                                          } else {
                                                            var19 = 0;
                                                            var29 = 2;
                                                            L96: while (true) {
                                                              if (var29 >= var47.field_g.length) {
                                                                break L95;
                                                              } else {
                                                                var19 = 1 + var19 + var37.k(0);
                                                                var47.field_g[var29] = (byte)var19;
                                                                var29 += 2;
                                                                if (var36 != 0) {
                                                                  break L94;
                                                                } else {
                                                                  if (var36 == 0) {
                                                                    continue L96;
                                                                  } else {
                                                                    break L95;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                        var27++;
                                                        break L94;
                                                      }
                                                      if (var36 == 0) {
                                                        continue L91;
                                                      } else {
                                                        break L93;
                                                      }
                                                    }
                                                  }
                                                }
                                                var27 = 0;
                                                L97: while (true) {
                                                  L98: {
                                                    if (var27 >= var12) {
                                                      break L98;
                                                    } else {
                                                      var48 = var13[var27];
                                                      stackOut_163_0 = null;
                                                      stackOut_163_1 = var48.field_l;
                                                      stackIn_197_0 = stackOut_163_0;
                                                      stackIn_197_1 = stackOut_163_1;
                                                      stackIn_164_0 = stackOut_163_0;
                                                      stackIn_164_1 = stackOut_163_1;
                                                      if (var36 != 0) {
                                                        break L92;
                                                      } else {
                                                        L99: {
                                                          L100: {
                                                            if (stackIn_164_0 == stackIn_164_1) {
                                                              break L100;
                                                            } else {
                                                              var19 = 0;
                                                              var29 = 2;
                                                              L101: while (true) {
                                                                if ((var29 ^ -1) <= (var48.field_l.length ^ -1)) {
                                                                  break L100;
                                                                } else {
                                                                  var19 = var37.k(0) + (1 + var19);
                                                                  var48.field_l[var29] = (byte)var19;
                                                                  var29 += 2;
                                                                  if (var36 != 0) {
                                                                    break L99;
                                                                  } else {
                                                                    if (var36 == 0) {
                                                                      continue L101;
                                                                    } else {
                                                                      break L100;
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                          var27++;
                                                          break L99;
                                                        }
                                                        if (var36 == 0) {
                                                          continue L97;
                                                        } else {
                                                          break L98;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  L102: {
                                                    if (var15_array == null) {
                                                      break L102;
                                                    } else {
                                                      var19 = var37.k(0);
                                                      var15_array[0] = (byte)var19;
                                                      var27 = 2;
                                                      L103: while (true) {
                                                        L104: {
                                                          L105: {
                                                            if (var27 >= var45.length) {
                                                              break L105;
                                                            } else {
                                                              var19 = var19 + 1 - -var37.k(0);
                                                              var15_array[var27] = (byte)var19;
                                                              var27 += 2;
                                                              if (var36 != 0) {
                                                                break L104;
                                                              } else {
                                                                if (var36 == 0) {
                                                                  continue L103;
                                                                } else {
                                                                  break L105;
                                                                }
                                                              }
                                                            }
                                                          }
                                                          var27 = var45[0];
                                                          break L104;
                                                        }
                                                        var28_int = var45[1];
                                                        var29 = 0;
                                                        L106: while (true) {
                                                          L107: {
                                                            L108: {
                                                              if (var27 <= var29) {
                                                                break L108;
                                                              } else {
                                                                this.field_l[var29] = (byte)(32 + var28_int * this.field_l[var29] >> 1958956870);
                                                                var29++;
                                                                if (var36 != 0) {
                                                                  break L107;
                                                                } else {
                                                                  if (var36 == 0) {
                                                                    continue L106;
                                                                  } else {
                                                                    break L108;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                            var29 = 2;
                                                            break L107;
                                                          }
                                                          L109: while (true) {
                                                            L110: {
                                                              L111: {
                                                                if ((var29 ^ -1) <= (var45.length ^ -1)) {
                                                                  break L111;
                                                                } else {
                                                                  var30 = var45[var29];
                                                                  var31 = var15_array[1 + var29];
                                                                  var32 = (-var27 + var30) * var28_int - -((-var27 + var30) / 2);
                                                                  stackOut_183_0 = var27;
                                                                  stackIn_191_0 = stackOut_183_0;
                                                                  stackIn_184_0 = stackOut_183_0;
                                                                  if (var36 != 0) {
                                                                    break L110;
                                                                  } else {
                                                                    var33 = stackIn_184_0;
                                                                    L112: while (true) {
                                                                      L113: {
                                                                        L114: {
                                                                          if (var30 <= var33) {
                                                                            break L114;
                                                                          } else {
                                                                            var34 = os.a(-var27 + var30, var32, 1589591487);
                                                                            var32 = var32 + (var31 - var28_int);
                                                                            this.field_l[var33] = (byte)(32 + var34 * this.field_l[var33] >> -40104826);
                                                                            var33++;
                                                                            if (var36 != 0) {
                                                                              break L113;
                                                                            } else {
                                                                              if (var36 == 0) {
                                                                                continue L112;
                                                                              } else {
                                                                                break L114;
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                        var28_int = var31;
                                                                        var27 = var30;
                                                                        var29 += 2;
                                                                        break L113;
                                                                      }
                                                                      if (var36 == 0) {
                                                                        continue L109;
                                                                      } else {
                                                                        break L111;
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                              stackOut_190_0 = var27;
                                                              stackIn_191_0 = stackOut_190_0;
                                                              break L110;
                                                            }
                                                            var30 = stackIn_191_0;
                                                            L115: while (true) {
                                                              L116: {
                                                                if (var30 >= 128) {
                                                                  break L116;
                                                                } else {
                                                                  this.field_l[var30] = (byte)(32 + this.field_l[var30] * var28_int >> -53581754);
                                                                  var30++;
                                                                  if (var36 != 0) {
                                                                    break L102;
                                                                  } else {
                                                                    if (var36 == 0) {
                                                                      continue L115;
                                                                    } else {
                                                                      break L116;
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                              var15_array = null;
                                                              break L102;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                  stackOut_196_0 = null;
                                                  stackOut_196_1 = (byte[]) (var16);
                                                  stackIn_197_0 = stackOut_196_0;
                                                  stackIn_197_1 = stackOut_196_1;
                                                  break L92;
                                                }
                                              }
                                              L117: {
                                                L118: {
                                                  if (stackIn_197_0 == stackIn_197_1) {
                                                    break L118;
                                                  } else {
                                                    var19 = var37.k(0);
                                                    var16[0] = (byte)var19;
                                                    var27 = 2;
                                                    L119: while (true) {
                                                      L120: {
                                                        L121: {
                                                          if (var57.length <= var27) {
                                                            break L121;
                                                          } else {
                                                            var19 = var19 + 1 - -var37.k(0);
                                                            var16[var27] = (byte)var19;
                                                            var27 += 2;
                                                            if (var36 != 0) {
                                                              break L120;
                                                            } else {
                                                              if (var36 == 0) {
                                                                continue L119;
                                                              } else {
                                                                break L121;
                                                              }
                                                            }
                                                          }
                                                        }
                                                        var27 = var57[0];
                                                        break L120;
                                                      }
                                                      var28_int = var57[1] << 620094721;
                                                      var29 = 0;
                                                      L122: while (true) {
                                                        L123: {
                                                          L124: {
                                                            if ((var29 ^ -1) <= (var27 ^ -1)) {
                                                              break L124;
                                                            } else {
                                                              var30 = var28_int + (255 & this.field_x[var29]);
                                                              stackOut_205_0 = var30;
                                                              stackIn_212_0 = stackOut_205_0;
                                                              stackIn_206_0 = stackOut_205_0;
                                                              if (var36 != 0) {
                                                                break L123;
                                                              } else {
                                                                L125: {
                                                                  if (stackIn_206_0 >= 0) {
                                                                    break L125;
                                                                  } else {
                                                                    var30 = 0;
                                                                    break L125;
                                                                  }
                                                                }
                                                                L126: {
                                                                  if ((var30 ^ -1) >= -129) {
                                                                    break L126;
                                                                  } else {
                                                                    var30 = 128;
                                                                    break L126;
                                                                  }
                                                                }
                                                                this.field_x[var29] = (byte)var30;
                                                                var29++;
                                                                if (var36 == 0) {
                                                                  continue L122;
                                                                } else {
                                                                  break L124;
                                                                }
                                                              }
                                                            }
                                                          }
                                                          stackOut_211_0 = 2;
                                                          stackIn_212_0 = stackOut_211_0;
                                                          break L123;
                                                        }
                                                        var29 = stackIn_212_0;
                                                        L127: while (true) {
                                                          stackOut_213_0 = var29 ^ -1;
                                                          stackOut_213_1 = var57.length ^ -1;
                                                          stackIn_214_0 = stackOut_213_0;
                                                          stackIn_214_1 = stackOut_213_1;
                                                          L128: while (true) {
                                                            L129: {
                                                              if (stackIn_214_0 <= stackIn_214_1) {
                                                                break L129;
                                                              } else {
                                                                var30 = var57[var29];
                                                                var31 = var16[var29 - -1] << -902000799;
                                                                var32 = (-var27 + var30) / 2 + var28_int * (-var27 + var30);
                                                                stackOut_215_0 = var27;
                                                                stackIn_233_0 = stackOut_215_0;
                                                                stackIn_216_0 = stackOut_215_0;
                                                                if (var36 != 0) {
                                                                  break L117;
                                                                } else {
                                                                  var33 = stackIn_216_0;
                                                                  L130: while (true) {
                                                                    L131: {
                                                                      if ((var33 ^ -1) <= (var30 ^ -1)) {
                                                                        break L131;
                                                                      } else {
                                                                        var34 = os.a(-var27 + var30, var32, 1589591487);
                                                                        var35 = var34 + (255 & this.field_x[var33]);
                                                                        stackOut_218_0 = -1;
                                                                        stackOut_218_1 = var35 ^ -1;
                                                                        stackIn_214_0 = stackOut_218_0;
                                                                        stackIn_214_1 = stackOut_218_1;
                                                                        stackIn_219_0 = stackOut_218_0;
                                                                        stackIn_219_1 = stackOut_218_1;
                                                                        if (var36 != 0) {
                                                                          continue L128;
                                                                        } else {
                                                                          L132: {
                                                                            if (stackIn_219_0 >= stackIn_219_1) {
                                                                              break L132;
                                                                            } else {
                                                                              var35 = 0;
                                                                              break L132;
                                                                            }
                                                                          }
                                                                          L133: {
                                                                            if (128 >= var35) {
                                                                              break L133;
                                                                            } else {
                                                                              var35 = 128;
                                                                              break L133;
                                                                            }
                                                                          }
                                                                          this.field_x[var33] = (byte)var35;
                                                                          var32 = var32 + (var31 + -var28_int);
                                                                          var33++;
                                                                          if (var36 == 0) {
                                                                            continue L130;
                                                                          } else {
                                                                            break L131;
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                    var29 += 2;
                                                                    var28_int = var31;
                                                                    var27 = var30;
                                                                    if (var36 == 0) {
                                                                      continue L127;
                                                                    } else {
                                                                      break L129;
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                            var16 = null;
                                                            var30 = var27;
                                                            L134: while (true) {
                                                              if (-129 >= (var30 ^ -1)) {
                                                                break L118;
                                                              } else {
                                                                L135: {
                                                                  var31 = var28_int + (this.field_x[var30] & 255);
                                                                  if ((var31 ^ -1) <= -1) {
                                                                    break L135;
                                                                  } else {
                                                                    var31 = 0;
                                                                    break L135;
                                                                  }
                                                                }
                                                                L136: {
                                                                  if (var31 <= 128) {
                                                                    break L136;
                                                                  } else {
                                                                    var31 = 128;
                                                                    break L136;
                                                                  }
                                                                }
                                                                this.field_x[var30] = (byte)var31;
                                                                var30++;
                                                                continue L134;
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                                stackOut_232_0 = 0;
                                                stackIn_233_0 = stackOut_232_0;
                                                break L117;
                                              }
                                              var27 = stackIn_233_0;
                                              L137: while (true) {
                                                L138: {
                                                  L139: {
                                                    if ((var12 ^ -1) >= (var27 ^ -1)) {
                                                      break L139;
                                                    } else {
                                                      var13[var27].field_d = var37.k(0);
                                                      var27++;
                                                      if (var36 != 0) {
                                                        break L138;
                                                      } else {
                                                        if (var36 == 0) {
                                                          continue L137;
                                                        } else {
                                                          break L139;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  var27 = 0;
                                                  break L138;
                                                }
                                                L140: while (true) {
                                                  L141: {
                                                    L142: {
                                                      L143: {
                                                        if ((var27 ^ -1) <= (var12 ^ -1)) {
                                                          break L143;
                                                        } else {
                                                          var49 = var13[var27];
                                                          var28 = var49;
                                                          stackOut_239_0 = (fq) (var49);
                                                          stackIn_262_0 = stackOut_239_0;
                                                          stackIn_240_0 = stackOut_239_0;
                                                          if (var36 != 0) {
                                                            L144: while (true) {
                                                              L145: {
                                                                if (stackIn_262_0.field_j <= 0) {
                                                                  break L145;
                                                                } else {
                                                                  var28.field_e = var37.k(0);
                                                                  break L145;
                                                                }
                                                              }
                                                              var27++;
                                                              if (var36 == 0) {
                                                                stackOut_258_0 = var27;
                                                                stackOut_258_1 = var12;
                                                                stackIn_259_0 = stackOut_258_0;
                                                                stackIn_259_1 = stackOut_258_1;
                                                                if (stackIn_259_0 >= stackIn_259_1) {
                                                                  break L141;
                                                                } else {
                                                                  var51 = var13[var27];
                                                                  var28 = var51;
                                                                  if (var36 != 0) {
                                                                    break L142;
                                                                  } else {
                                                                    stackOut_261_0 = (fq) (var51);
                                                                    stackIn_262_0 = stackOut_261_0;
                                                                    continue L144;
                                                                  }
                                                                }
                                                              } else {
                                                                break L141;
                                                              }
                                                            }
                                                          } else {
                                                            L146: {
                                                              if (stackIn_240_0.field_l == null) {
                                                                break L146;
                                                              } else {
                                                                var49.field_m = var37.k(0);
                                                                break L146;
                                                              }
                                                            }
                                                            L147: {
                                                              if (null == var49.field_g) {
                                                                break L147;
                                                              } else {
                                                                var49.field_c = var37.k(0);
                                                                break L147;
                                                              }
                                                            }
                                                            L148: {
                                                              if (0 >= var49.field_d) {
                                                                break L148;
                                                              } else {
                                                                var49.field_i = var37.k(0);
                                                                break L148;
                                                              }
                                                            }
                                                            var27++;
                                                            if (var36 == 0) {
                                                              continue L140;
                                                            } else {
                                                              break L143;
                                                            }
                                                          }
                                                        }
                                                      }
                                                      var27 = 0;
                                                      L149: while (true) {
                                                        L150: {
                                                          L151: {
                                                            if (var12 <= var27) {
                                                              break L151;
                                                            } else {
                                                              var13[var27].field_b = var37.k(0);
                                                              var27++;
                                                              if (var36 != 0) {
                                                                break L150;
                                                              } else {
                                                                if (var36 == 0) {
                                                                  continue L149;
                                                                } else {
                                                                  break L151;
                                                                }
                                                              }
                                                            }
                                                          }
                                                          var27 = 0;
                                                          break L150;
                                                        }
                                                        L152: while (true) {
                                                          L153: {
                                                            if ((var27 ^ -1) <= (var12 ^ -1)) {
                                                              break L153;
                                                            } else {
                                                              var50 = var13[var27];
                                                              stackOut_253_0 = -1;
                                                              stackOut_253_1 = var50.field_b ^ -1;
                                                              stackIn_259_0 = stackOut_253_0;
                                                              stackIn_259_1 = stackOut_253_1;
                                                              stackIn_254_0 = stackOut_253_0;
                                                              stackIn_254_1 = stackOut_253_1;
                                                              if (var36 != 0) {
                                                                L154: while (true) {
                                                                  if (stackIn_259_0 >= stackIn_259_1) {
                                                                    break L141;
                                                                  } else {
                                                                    var51 = var13[var27];
                                                                    var28 = var51;
                                                                    if (var36 != 0) {
                                                                      break L142;
                                                                    } else {
                                                                      stackOut_261_0 = (fq) (var51);
                                                                      stackIn_262_0 = stackOut_261_0;
                                                                      L155: {
                                                                        if (stackIn_262_0.field_j <= 0) {
                                                                          break L155;
                                                                        } else {
                                                                          var28.field_e = var37.k(0);
                                                                          break L155;
                                                                        }
                                                                      }
                                                                      var27++;
                                                                      if (var36 == 0) {
                                                                        stackOut_258_0 = var27;
                                                                        stackOut_258_1 = var12;
                                                                        stackIn_259_0 = stackOut_258_0;
                                                                        stackIn_259_1 = stackOut_258_1;
                                                                        continue L154;
                                                                      } else {
                                                                        break L141;
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              } else {
                                                                L156: {
                                                                  if (stackIn_254_0 <= stackIn_254_1) {
                                                                    break L156;
                                                                  } else {
                                                                    var50.field_j = var37.k(0);
                                                                    break L156;
                                                                  }
                                                                }
                                                                var27++;
                                                                if (var36 == 0) {
                                                                  continue L152;
                                                                } else {
                                                                  break L153;
                                                                }
                                                              }
                                                            }
                                                          }
                                                          var27 = 0;
                                                          L157: while (true) {
                                                            stackOut_258_0 = var27;
                                                            stackOut_258_1 = var12;
                                                            stackIn_259_0 = stackOut_258_0;
                                                            stackIn_259_1 = stackOut_258_1;
                                                            if (stackIn_259_0 >= stackIn_259_1) {
                                                              break L141;
                                                            } else {
                                                              var51 = var13[var27];
                                                              var28 = var51;
                                                              if (var36 != 0) {
                                                                break L142;
                                                              } else {
                                                                stackOut_261_0 = (fq) (var51);
                                                                stackIn_262_0 = stackOut_261_0;
                                                                L158: {
                                                                  if (stackIn_262_0.field_j <= 0) {
                                                                    break L158;
                                                                  } else {
                                                                    var28.field_e = var37.k(0);
                                                                    break L158;
                                                                  }
                                                                }
                                                                var27++;
                                                                if (var36 == 0) {
                                                                  continue L157;
                                                                } else {
                                                                  break L141;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                    decompiledRegionSelector0 = 0;
                                                    break L0;
                                                  }
                                                  decompiledRegionSelector0 = 1;
                                                  break L0;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L159: {
            var2 = decompiledCaughtException;
            stackOut_266_0 = (RuntimeException) (var2);
            stackOut_266_1 = new StringBuilder().append("io.<init>(");
            stackIn_268_0 = stackOut_266_0;
            stackIn_268_1 = stackOut_266_1;
            stackIn_267_0 = stackOut_266_0;
            stackIn_267_1 = stackOut_266_1;
            if (param0 == null) {
              stackOut_268_0 = (RuntimeException) ((Object) stackIn_268_0);
              stackOut_268_1 = (StringBuilder) ((Object) stackIn_268_1);
              stackOut_268_2 = "null";
              stackIn_269_0 = stackOut_268_0;
              stackIn_269_1 = stackOut_268_1;
              stackIn_269_2 = stackOut_268_2;
              break L159;
            } else {
              stackOut_267_0 = (RuntimeException) ((Object) stackIn_267_0);
              stackOut_267_1 = (StringBuilder) ((Object) stackIn_267_1);
              stackOut_267_2 = "{...}";
              stackIn_269_0 = stackOut_267_0;
              stackIn_269_1 = stackOut_267_1;
              stackIn_269_2 = stackOut_267_2;
              break L159;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_269_0), stackIn_269_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_u = "This <%0> is currently carrying the <%2>. Are you sure you wish to replace it with the <%1>? The <%2> will be lost forever if you do this.";
        field_p = "Open";
        field_o = "Play Campaign";
    }
}
