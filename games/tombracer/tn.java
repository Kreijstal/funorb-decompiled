/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tn extends vg {
    byte[] field_j;
    byte[] field_l;
    int field_i;
    short[] field_g;
    bq[] field_m;
    static iv field_n;
    u[] field_h;
    private int[] field_k;
    byte[] field_f;

    final void a(boolean param0) {
        String discarded$0 = null;
        this.field_k = null;
        if (param0) {
            discarded$0 = tn.a(-65);
        }
    }

    final boolean a(int param0, byte[] param1, nda param2, int[] param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = 1;
              if (param0 == -5853) {
                break L1;
              } else {
                this.field_f = (byte[]) null;
                break L1;
              }
            }
            var6 = 0;
            var7 = null;
            var8 = 0;
            L2: while (true) {
              L3: {
                if (128 <= var8) {
                  break L3;
                } else {
                  L4: {
                    L5: {
                      if (param1 == null) {
                        break L5;
                      } else {
                        if (0 != param1[var8]) {
                          break L5;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var9 = this.field_k[var8];
                    if (-1 == (var9 ^ -1)) {
                      break L4;
                    } else {
                      L6: {
                        if ((var6 ^ -1) == (var9 ^ -1)) {
                          break L6;
                        } else {
                          L7: {
                            L8: {
                              var6 = var9;
                              var9--;
                              if (0 != (var9 & 1)) {
                                break L8;
                              } else {
                                var7 = param2.a(var9 >> 1581606882, param3, 0);
                                if (var10 == 0) {
                                  break L7;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            var7 = param2.a((byte) -32, param3, var9 >> -197324734);
                            break L7;
                          }
                          if (var7 != null) {
                            break L6;
                          } else {
                            var5_int = 0;
                            break L6;
                          }
                        }
                      }
                      if (var7 != null) {
                        this.field_h[var8] = (u) (var7);
                        this.field_k[var8] = 0;
                        break L4;
                      } else {
                        break L4;
                      }
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
              stackOut_19_0 = var5_int;
              stackIn_20_0 = stackOut_19_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var5);
            stackOut_21_1 = new StringBuilder().append("tn.C(").append(param0).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L9;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L9;
            }
          }
          L10: {
            stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L10;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L10;
            }
          }
          L11: {
            stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param3 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L11;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L11;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ')');
        }
        return stackIn_20_0 != 0;
    }

    public static void a(byte param0) {
        field_n = null;
        if (param0 != 94) {
            field_n = (iv) null;
        }
    }

    final static String a(int param0) {
        String discarded$0 = null;
        if (param0 != -10918) {
            discarded$0 = tn.a(120);
        }
        if ((cga.field_f ^ -1) > -3) {
            return ub.field_b;
        }
        if (nja.field_J != null) {
            if (!(nja.field_J.b(-60))) {
                return hra.field_c;
            }
            return voa.field_s;
        }
        if (!(tk.field_b.b(-97))) {
            return cv.field_r;
        }
        if (!tk.field_b.c("commonui", param0 ^ 10971)) {
            return q.field_o + " - " + tk.field_b.a("commonui", true) + "%";
        }
        if (!hm.field_n.b(-99)) {
            return hua.field_a;
        }
        if (!(hm.field_n.c("commonui", -128))) {
            return vja.field_b + " - " + hm.field_n.a("commonui", true) + "%";
        }
        if (!vc.field_p.b(param0 + 10827)) {
            return wt.field_b;
        }
        if (!(vc.field_p.a(0))) {
            return th.field_u + " - " + vc.field_p.a(true) + "%";
        }
        return dt.field_n;
    }

    tn(byte[] param0) {
        int incrementValue$9 = 0;
        bq dupTemp$10 = null;
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
        bq[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        bq var15 = null;
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
        bq var28 = null;
        int var28_int = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        uia var37 = null;
        byte[] var38 = null;
        bq var39 = null;
        byte[] var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        bq var44 = null;
        byte[] var45 = null;
        byte[] var46 = null;
        bq var47 = null;
        bq var48 = null;
        bq var49 = null;
        bq var50 = null;
        bq var51 = null;
        byte[] var52 = null;
        byte[] var53 = null;
        byte[] var54 = null;
        byte[] var55 = null;
        byte[] var56 = null;
        byte[] var57 = null;
        int stackIn_29_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_41_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        byte[] stackIn_50_0 = null;
        byte[] stackIn_53_0 = null;
        int stackIn_74_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_93_0 = 0;
        int stackIn_96_0 = 0;
        int stackIn_105_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_117_0 = 0;
        int stackIn_120_0 = 0;
        int stackIn_120_1 = 0;
        int stackIn_129_0 = 0;
        int stackIn_129_1 = 0;
        Object stackIn_131_0 = null;
        byte[] stackIn_131_1 = null;
        Object stackIn_144_0 = null;
        byte[] stackIn_144_1 = null;
        Object stackIn_157_0 = null;
        byte[] stackIn_157_1 = null;
        byte[] stackIn_167_0 = null;
        byte[] stackIn_175_0 = null;
        int stackIn_188_0 = 0;
        int stackIn_203_0 = 0;
        int stackIn_211_0 = 0;
        int stackIn_211_1 = 0;
        int stackIn_218_0 = 0;
        int stackIn_218_1 = 0;
        int stackIn_220_0 = 0;
        int stackIn_223_0 = 0;
        int stackIn_223_1 = 0;
        int stackIn_237_0 = 0;
        bq stackIn_244_0 = null;
        Object stackIn_247_0 = null;
        byte[] stackIn_247_1 = null;
        int stackIn_259_0 = 0;
        int stackIn_263_0 = 0;
        bq stackIn_267_0 = null;
        RuntimeException stackIn_272_0 = null;
        StringBuilder stackIn_272_1 = null;
        RuntimeException stackIn_273_0 = null;
        StringBuilder stackIn_273_1 = null;
        RuntimeException stackIn_274_0 = null;
        StringBuilder stackIn_274_1 = null;
        String stackIn_274_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_28_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_40_1 = 0;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        Object stackOut_49_0 = null;
        byte[] stackOut_48_0 = null;
        byte[] stackOut_52_0 = null;
        Object stackOut_51_0 = null;
        int stackOut_73_0 = 0;
        int stackOut_80_0 = 0;
        int stackOut_83_0 = 0;
        int stackOut_92_0 = 0;
        int stackOut_95_0 = 0;
        int stackOut_104_0 = 0;
        int stackOut_107_0 = 0;
        int stackOut_116_0 = 0;
        int stackOut_119_0 = 0;
        int stackOut_119_1 = 0;
        Object stackOut_130_0 = null;
        byte[] stackOut_130_1 = null;
        int stackOut_128_0 = 0;
        int stackOut_128_1 = 0;
        Object stackOut_143_0 = null;
        byte[] stackOut_143_1 = null;
        Object stackOut_156_0 = null;
        byte[] stackOut_156_1 = null;
        bq stackOut_243_0 = null;
        Object stackOut_246_0 = null;
        byte[] stackOut_246_1 = null;
        byte[] stackOut_166_0 = null;
        byte[] stackOut_174_0 = null;
        int stackOut_187_0 = 0;
        int stackOut_202_0 = 0;
        int stackOut_210_0 = 0;
        int stackOut_210_1 = 0;
        int stackOut_219_0 = 0;
        int stackOut_222_0 = 0;
        int stackOut_222_1 = 0;
        int stackOut_217_0 = 0;
        int stackOut_217_1 = 0;
        int stackOut_236_0 = 0;
        bq stackOut_266_0 = null;
        int stackOut_258_0 = 0;
        int stackOut_262_0 = 0;
        RuntimeException stackOut_271_0 = null;
        StringBuilder stackOut_271_1 = null;
        RuntimeException stackOut_273_0 = null;
        StringBuilder stackOut_273_1 = null;
        String stackOut_273_2 = null;
        RuntimeException stackOut_272_0 = null;
        StringBuilder stackOut_272_1 = null;
        String stackOut_272_2 = null;
        var36 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            this.field_l = new byte[128];
            this.field_h = new u[128];
            this.field_j = new byte[128];
            this.field_k = new int[128];
            this.field_f = new byte[128];
            this.field_m = new bq[128];
            this.field_g = new short[128];
            var37 = new uia(param0);
            var3 = 0;
            L1: while (true) {
              L2: {
                if (-1 == (var37.field_g[var3 + var37.field_h] ^ -1)) {
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
                    if ((var5 ^ -1) <= (var3 ^ -1)) {
                      break L5;
                    } else {
                      var4[var5] = var37.c((byte) 49);
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
                  var37.field_h = var37.field_h + 1;
                  var3++;
                  var5 = var37.field_h;
                  var37.field_h = var37.field_h + var3;
                  break L4;
                }
                var6 = 0;
                L6: while (true) {
                  L7: {
                    if (var37.field_g[var37.field_h + var6] == 0) {
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
                        if (var8 >= var6) {
                          break L10;
                        } else {
                          var7[var8] = var37.c((byte) 63);
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
                      var37.field_h = var37.field_h + 1;
                      var8 = var37.field_h;
                      var37.field_h = var37.field_h + var6;
                      break L9;
                    }
                    var9 = 0;
                    L11: while (true) {
                      L12: {
                        if (0 == var37.field_g[var9 + var37.field_h]) {
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
                            if (var11_int >= var9) {
                              break L15;
                            } else {
                              var10[var11_int] = var37.c((byte) 124);
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
                          var37.field_h = var37.field_h + 1;
                          break L14;
                        }
                        L16: {
                          L17: {
                            L18: {
                              var52 = new byte[var9];
                              var38 = var52;
                              var11 = var38;
                              if (1 >= var9) {
                                break L18;
                              } else {
                                var52[1] = (byte) 1;
                                var13_int = 1;
                                var12 = 2;
                                var14 = 2;
                                L19: while (true) {
                                  L20: {
                                    if (var9 <= var14) {
                                      break L20;
                                    } else {
                                      var15_int = var37.h(255);
                                      stackOut_28_0 = -1;
                                      stackIn_38_0 = stackOut_28_0;
                                      stackIn_29_0 = stackOut_28_0;
                                      if (var36 != 0) {
                                        break L16;
                                      } else {
                                        L21: {
                                          L22: {
                                            if (stackIn_29_0 != (var15_int ^ -1)) {
                                              break L22;
                                            } else {
                                              incrementValue$9 = var12;
                                              var12++;
                                              var13_int = incrementValue$9;
                                              if (var36 == 0) {
                                                break L21;
                                              } else {
                                                break L22;
                                              }
                                            }
                                          }
                                          L23: {
                                            if (var13_int < var15_int) {
                                              break L23;
                                            } else {
                                              var15_int--;
                                              break L23;
                                            }
                                          }
                                          var13_int = var15_int;
                                          break L21;
                                        }
                                        var11[var14] = (byte)var13_int;
                                        var14++;
                                        if (var36 == 0) {
                                          continue L19;
                                        } else {
                                          break L20;
                                        }
                                      }
                                    }
                                  }
                                  if (var36 == 0) {
                                    break L17;
                                  } else {
                                    break L18;
                                  }
                                }
                              }
                            }
                            var12 = var9;
                            break L17;
                          }
                          stackOut_37_0 = var12;
                          stackIn_38_0 = stackOut_37_0;
                          break L16;
                        }
                        var13 = new bq[stackIn_38_0];
                        var14 = 0;
                        L24: while (true) {
                          L25: {
                            L26: {
                              if (var13.length <= var14) {
                                break L26;
                              } else {
                                dupTemp$10 = new bq();
                                var13[var14] = dupTemp$10;
                                var39 = dupTemp$10;
                                var15 = var39;
                                var16_int = var37.h(255);
                                stackOut_40_0 = var16_int ^ -1;
                                stackOut_40_1 = -1;
                                stackIn_47_0 = stackOut_40_0;
                                stackIn_47_1 = stackOut_40_1;
                                stackIn_41_0 = stackOut_40_0;
                                stackIn_41_1 = stackOut_40_1;
                                if (var36 != 0) {
                                  break L25;
                                } else {
                                  L27: {
                                    if (stackIn_41_0 >= stackIn_41_1) {
                                      break L27;
                                    } else {
                                      var15.field_m = new byte[2 * var16_int];
                                      break L27;
                                    }
                                  }
                                  L28: {
                                    var16_int = var37.h(255);
                                    if (0 >= var16_int) {
                                      break L28;
                                    } else {
                                      var15.field_g = new byte[2 + 2 * var16_int];
                                      var39.field_g[1] = (byte)64;
                                      break L28;
                                    }
                                  }
                                  var14++;
                                  if (var36 == 0) {
                                    continue L24;
                                  } else {
                                    break L26;
                                  }
                                }
                              }
                            }
                            var14 = var37.h(255);
                            stackOut_46_0 = var14 ^ -1;
                            stackOut_46_1 = -1;
                            stackIn_47_0 = stackOut_46_0;
                            stackIn_47_1 = stackOut_46_1;
                            break L25;
                          }
                          L29: {
                            if (stackIn_47_0 >= stackIn_47_1) {
                              stackOut_49_0 = null;
                              stackIn_50_0 = (byte[]) ((Object) stackOut_49_0);
                              break L29;
                            } else {
                              stackOut_48_0 = new byte[2 * var14];
                              stackIn_50_0 = stackOut_48_0;
                              break L29;
                            }
                          }
                          L30: {
                            var45 = stackIn_50_0;
                            var15_array = var45;
                            var14 = var37.h(255);
                            if ((var14 ^ -1) < -1) {
                              stackOut_52_0 = new byte[2 * var14];
                              stackIn_53_0 = stackOut_52_0;
                              break L30;
                            } else {
                              stackOut_51_0 = null;
                              stackIn_53_0 = (byte[]) ((Object) stackOut_51_0);
                              break L30;
                            }
                          }
                          var57 = stackIn_53_0;
                          var46 = var57;
                          var16 = var46;
                          var17 = 0;
                          L31: while (true) {
                            L32: {
                              if (var37.field_g[var17 + var37.field_h] == 0) {
                                break L32;
                              } else {
                                var17++;
                                if (var36 == 0) {
                                  continue L31;
                                } else {
                                  break L32;
                                }
                              }
                            }
                            var53 = new byte[var17];
                            var40 = var53;
                            var18 = var40;
                            var19 = 0;
                            L33: while (true) {
                              L34: {
                                L35: {
                                  if ((var19 ^ -1) <= (var17 ^ -1)) {
                                    break L35;
                                  } else {
                                    var18[var19] = var37.c((byte) 86);
                                    var19++;
                                    if (var36 != 0) {
                                      break L34;
                                    } else {
                                      if (var36 == 0) {
                                        continue L33;
                                      } else {
                                        break L35;
                                      }
                                    }
                                  }
                                }
                                var37.field_h = var37.field_h + 1;
                                var17++;
                                var19 = 0;
                                break L34;
                              }
                              var20 = 0;
                              L36: while (true) {
                                L37: {
                                  L38: {
                                    if ((var20 ^ -1) <= -129) {
                                      break L38;
                                    } else {
                                      var19 = var19 + var37.h(255);
                                      this.field_g[var20] = (short)var19;
                                      var20++;
                                      if (var36 != 0) {
                                        break L37;
                                      } else {
                                        if (var36 == 0) {
                                          continue L36;
                                        } else {
                                          break L38;
                                        }
                                      }
                                    }
                                  }
                                  var19 = 0;
                                  break L37;
                                }
                                var20 = 0;
                                L39: while (true) {
                                  L40: {
                                    L41: {
                                      if (-129 >= (var20 ^ -1)) {
                                        break L41;
                                      } else {
                                        var19 = var19 + var37.h(255);
                                        this.field_g[var20] = (short)(this.field_g[var20] + (var19 << -2073954968));
                                        var20++;
                                        if (var36 != 0) {
                                          break L40;
                                        } else {
                                          if (var36 == 0) {
                                            continue L39;
                                          } else {
                                            break L41;
                                          }
                                        }
                                      }
                                    }
                                    var20 = 0;
                                    break L40;
                                  }
                                  var21 = 0;
                                  var22 = 0;
                                  var23 = 0;
                                  L42: while (true) {
                                    L43: {
                                      L44: {
                                        if (128 <= var23) {
                                          break L44;
                                        } else {
                                          stackOut_73_0 = -1;
                                          stackIn_81_0 = stackOut_73_0;
                                          stackIn_74_0 = stackOut_73_0;
                                          if (var36 != 0) {
                                            break L43;
                                          } else {
                                            L45: {
                                              if (stackIn_74_0 != (var20 ^ -1)) {
                                                break L45;
                                              } else {
                                                L46: {
                                                  L47: {
                                                    if (var53.length > var21) {
                                                      break L47;
                                                    } else {
                                                      var20 = -1;
                                                      if (var36 == 0) {
                                                        break L46;
                                                      } else {
                                                        break L47;
                                                      }
                                                    }
                                                  }
                                                  incrementValue$11 = var21;
                                                  var21++;
                                                  var20 = var18[incrementValue$11];
                                                  break L46;
                                                }
                                                var22 = var37.b((byte) -123);
                                                break L45;
                                              }
                                            }
                                            this.field_g[var23] = (short)(this.field_g[var23] + (sea.c(-1 + var22, 2) << 9434510));
                                            var20--;
                                            this.field_k[var23] = var22;
                                            var23++;
                                            if (var36 == 0) {
                                              continue L42;
                                            } else {
                                              break L44;
                                            }
                                          }
                                        }
                                      }
                                      var20 = 0;
                                      var21 = 0;
                                      var23 = 0;
                                      stackOut_80_0 = 0;
                                      stackIn_81_0 = stackOut_80_0;
                                      break L43;
                                    }
                                    var24 = stackIn_81_0;
                                    L48: while (true) {
                                      L49: {
                                        L50: {
                                          if ((var24 ^ -1) <= -129) {
                                            break L50;
                                          } else {
                                            stackOut_83_0 = this.field_k[var24];
                                            stackIn_93_0 = stackOut_83_0;
                                            stackIn_84_0 = stackOut_83_0;
                                            if (var36 != 0) {
                                              break L49;
                                            } else {
                                              L51: {
                                                L52: {
                                                  if (stackIn_84_0 != 0) {
                                                    break L52;
                                                  } else {
                                                    if (var36 == 0) {
                                                      break L51;
                                                    } else {
                                                      break L52;
                                                    }
                                                  }
                                                }
                                                L53: {
                                                  if (-1 != (var20 ^ -1)) {
                                                    break L53;
                                                  } else {
                                                    L54: {
                                                      incrementValue$12 = var5;
                                                      var5++;
                                                      var23 = -1 + var37.field_g[incrementValue$12];
                                                      if ((var21 ^ -1) <= (var54.length ^ -1)) {
                                                        break L54;
                                                      } else {
                                                        incrementValue$13 = var21;
                                                        var21++;
                                                        var20 = var4[incrementValue$13];
                                                        if (var36 == 0) {
                                                          break L53;
                                                        } else {
                                                          break L54;
                                                        }
                                                      }
                                                    }
                                                    var20 = -1;
                                                    break L53;
                                                  }
                                                }
                                                var20--;
                                                this.field_f[var24] = (byte)var23;
                                                break L51;
                                              }
                                              var24++;
                                              if (var36 == 0) {
                                                continue L48;
                                              } else {
                                                break L50;
                                              }
                                            }
                                          }
                                        }
                                        var20 = 0;
                                        var21 = 0;
                                        var24 = 0;
                                        stackOut_92_0 = 0;
                                        stackIn_93_0 = stackOut_92_0;
                                        break L49;
                                      }
                                      var25_int = stackIn_93_0;
                                      L55: while (true) {
                                        L56: {
                                          L57: {
                                            if (-129 >= (var25_int ^ -1)) {
                                              break L57;
                                            } else {
                                              stackOut_95_0 = this.field_k[var25_int];
                                              stackIn_105_0 = stackOut_95_0;
                                              stackIn_96_0 = stackOut_95_0;
                                              if (var36 != 0) {
                                                break L56;
                                              } else {
                                                L58: {
                                                  L59: {
                                                    if (stackIn_96_0 != 0) {
                                                      break L59;
                                                    } else {
                                                      if (var36 == 0) {
                                                        break L58;
                                                      } else {
                                                        break L59;
                                                      }
                                                    }
                                                  }
                                                  L60: {
                                                    if (-1 != (var20 ^ -1)) {
                                                      break L60;
                                                    } else {
                                                      L61: {
                                                        incrementValue$14 = var8;
                                                        var8++;
                                                        var24 = var37.field_g[incrementValue$14] + 16 << -679212414;
                                                        if ((var21 ^ -1) <= (var55.length ^ -1)) {
                                                          break L61;
                                                        } else {
                                                          incrementValue$15 = var21;
                                                          var21++;
                                                          var20 = var7[incrementValue$15];
                                                          if (var36 == 0) {
                                                            break L60;
                                                          } else {
                                                            break L61;
                                                          }
                                                        }
                                                      }
                                                      var20 = -1;
                                                      break L60;
                                                    }
                                                  }
                                                  this.field_l[var25_int] = (byte)var24;
                                                  var20--;
                                                  break L58;
                                                }
                                                var25_int++;
                                                if (var36 == 0) {
                                                  continue L55;
                                                } else {
                                                  break L57;
                                                }
                                              }
                                            }
                                          }
                                          var21 = 0;
                                          stackOut_104_0 = 0;
                                          stackIn_105_0 = stackOut_104_0;
                                          break L56;
                                        }
                                        var20 = stackIn_105_0;
                                        var25 = null;
                                        var26 = 0;
                                        L62: while (true) {
                                          L63: {
                                            L64: {
                                              if (128 <= var26) {
                                                break L64;
                                              } else {
                                                stackOut_107_0 = 0;
                                                stackIn_117_0 = stackOut_107_0;
                                                stackIn_108_0 = stackOut_107_0;
                                                if (var36 != 0) {
                                                  break L63;
                                                } else {
                                                  L65: {
                                                    L66: {
                                                      if (stackIn_108_0 != this.field_k[var26]) {
                                                        break L66;
                                                      } else {
                                                        if (var36 == 0) {
                                                          break L65;
                                                        } else {
                                                          break L66;
                                                        }
                                                      }
                                                    }
                                                    L67: {
                                                      if ((var20 ^ -1) != -1) {
                                                        break L67;
                                                      } else {
                                                        L68: {
                                                          var25 = var13[var52[var21]];
                                                          if ((var21 ^ -1) > (var56.length ^ -1)) {
                                                            break L68;
                                                          } else {
                                                            var20 = -1;
                                                            if (var36 == 0) {
                                                              break L67;
                                                            } else {
                                                              break L68;
                                                            }
                                                          }
                                                        }
                                                        incrementValue$16 = var21;
                                                        var21++;
                                                        var20 = var10[incrementValue$16];
                                                        break L67;
                                                      }
                                                    }
                                                    var20--;
                                                    this.field_m[var26] = (bq) (var25);
                                                    break L65;
                                                  }
                                                  var26++;
                                                  if (var36 == 0) {
                                                    continue L62;
                                                  } else {
                                                    break L64;
                                                  }
                                                }
                                              }
                                            }
                                            var21 = 0;
                                            var20 = 0;
                                            var26 = 0;
                                            stackOut_116_0 = 0;
                                            stackIn_117_0 = stackOut_116_0;
                                            break L63;
                                          }
                                          var27 = stackIn_117_0;
                                          L69: while (true) {
                                            L70: {
                                              L71: {
                                                L72: {
                                                  if (var27 >= 128) {
                                                    break L72;
                                                  } else {
                                                    stackOut_119_0 = 0;
                                                    stackOut_119_1 = var20;
                                                    stackIn_129_0 = stackOut_119_0;
                                                    stackIn_129_1 = stackOut_119_1;
                                                    stackIn_120_0 = stackOut_119_0;
                                                    stackIn_120_1 = stackOut_119_1;
                                                    if (var36 != 0) {
                                                      L73: while (true) {
                                                        if (stackIn_129_0 >= stackIn_129_1) {
                                                          break L71;
                                                        } else {
                                                          var44 = var13[var27];
                                                          stackOut_130_0 = null;
                                                          stackOut_130_1 = var44.field_m;
                                                          stackIn_144_0 = stackOut_130_0;
                                                          stackIn_144_1 = stackOut_130_1;
                                                          stackIn_131_0 = stackOut_130_0;
                                                          stackIn_131_1 = stackOut_130_1;
                                                          if (var36 != 0) {
                                                            break L70;
                                                          } else {
                                                            L74: {
                                                              L75: {
                                                                L76: {
                                                                  L77: {
                                                                    if (stackIn_131_0 == stackIn_131_1) {
                                                                      break L77;
                                                                    } else {
                                                                      var29 = 1;
                                                                      L78: while (true) {
                                                                        if (var29 >= var44.field_m.length) {
                                                                          break L77;
                                                                        } else {
                                                                          var44.field_m[var29] = var37.c((byte) 124);
                                                                          var29 += 2;
                                                                          if (var36 != 0) {
                                                                            break L76;
                                                                          } else {
                                                                            if (var36 == 0) {
                                                                              continue L78;
                                                                            } else {
                                                                              break L77;
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                  if (null == var44.field_g) {
                                                                    break L75;
                                                                  } else {
                                                                    break L76;
                                                                  }
                                                                }
                                                                var29 = 3;
                                                                L79: while (true) {
                                                                  if ((-2 + var44.field_g.length ^ -1) >= (var29 ^ -1)) {
                                                                    break L75;
                                                                  } else {
                                                                    var44.field_g[var29] = var37.c((byte) 81);
                                                                    var29 += 2;
                                                                    if (var36 != 0) {
                                                                      break L74;
                                                                    } else {
                                                                      if (var36 == 0) {
                                                                        continue L79;
                                                                      } else {
                                                                        break L75;
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                              var27++;
                                                              break L74;
                                                            }
                                                            if (var36 == 0) {
                                                              stackOut_128_0 = var27;
                                                              stackOut_128_1 = var12;
                                                              stackIn_129_0 = stackOut_128_0;
                                                              stackIn_129_1 = stackOut_128_1;
                                                              continue L73;
                                                            } else {
                                                              break L71;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      L80: {
                                                        if (stackIn_120_0 != stackIn_120_1) {
                                                          break L80;
                                                        } else {
                                                          L81: {
                                                            L82: {
                                                              if ((var53.length ^ -1) >= (var21 ^ -1)) {
                                                                break L82;
                                                              } else {
                                                                incrementValue$17 = var21;
                                                                var21++;
                                                                var20 = var18[incrementValue$17];
                                                                if (var36 == 0) {
                                                                  break L81;
                                                                } else {
                                                                  break L82;
                                                                }
                                                              }
                                                            }
                                                            var20 = -1;
                                                            break L81;
                                                          }
                                                          if (-1 <= (this.field_k[var27] ^ -1)) {
                                                            break L80;
                                                          } else {
                                                            var26 = var37.h(255) - -1;
                                                            break L80;
                                                          }
                                                        }
                                                      }
                                                      this.field_j[var27] = (byte)var26;
                                                      var20--;
                                                      var27++;
                                                      if (var36 == 0) {
                                                        continue L69;
                                                      } else {
                                                        break L72;
                                                      }
                                                    }
                                                  }
                                                }
                                                this.field_i = 1 + var37.h(255);
                                                var27 = 0;
                                                L83: while (true) {
                                                  stackOut_128_0 = var27;
                                                  stackOut_128_1 = var12;
                                                  stackIn_129_0 = stackOut_128_0;
                                                  stackIn_129_1 = stackOut_128_1;
                                                  if (stackIn_129_0 >= stackIn_129_1) {
                                                    break L71;
                                                  } else {
                                                    var44 = var13[var27];
                                                    stackOut_130_0 = null;
                                                    stackOut_130_1 = var44.field_m;
                                                    stackIn_144_0 = stackOut_130_0;
                                                    stackIn_144_1 = stackOut_130_1;
                                                    stackIn_131_0 = stackOut_130_0;
                                                    stackIn_131_1 = stackOut_130_1;
                                                    if (var36 != 0) {
                                                      break L70;
                                                    } else {
                                                      L84: {
                                                        L85: {
                                                          L86: {
                                                            L87: {
                                                              if (stackIn_131_0 == stackIn_131_1) {
                                                                break L87;
                                                              } else {
                                                                var29 = 1;
                                                                L88: while (true) {
                                                                  if (var29 >= var44.field_m.length) {
                                                                    break L87;
                                                                  } else {
                                                                    var44.field_m[var29] = var37.c((byte) 124);
                                                                    var29 += 2;
                                                                    if (var36 != 0) {
                                                                      break L86;
                                                                    } else {
                                                                      if (var36 == 0) {
                                                                        continue L88;
                                                                      } else {
                                                                        break L87;
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                            if (null == var44.field_g) {
                                                              break L85;
                                                            } else {
                                                              break L86;
                                                            }
                                                          }
                                                          var29 = 3;
                                                          L89: while (true) {
                                                            if ((-2 + var44.field_g.length ^ -1) >= (var29 ^ -1)) {
                                                              break L85;
                                                            } else {
                                                              var44.field_g[var29] = var37.c((byte) 81);
                                                              var29 += 2;
                                                              if (var36 != 0) {
                                                                break L84;
                                                              } else {
                                                                if (var36 == 0) {
                                                                  continue L89;
                                                                } else {
                                                                  break L85;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                        var27++;
                                                        break L84;
                                                      }
                                                      if (var36 == 0) {
                                                        continue L83;
                                                      } else {
                                                        break L71;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              stackOut_143_0 = null;
                                              stackOut_143_1 = (byte[]) (var15_array);
                                              stackIn_144_0 = stackOut_143_0;
                                              stackIn_144_1 = stackOut_143_1;
                                              break L70;
                                            }
                                            L90: {
                                              L91: {
                                                L92: {
                                                  if (stackIn_144_0 == stackIn_144_1) {
                                                    break L92;
                                                  } else {
                                                    var27 = 1;
                                                    L93: while (true) {
                                                      if (var45.length <= var27) {
                                                        break L92;
                                                      } else {
                                                        var15_array[var27] = var37.c((byte) 63);
                                                        var27 += 2;
                                                        if (var36 != 0) {
                                                          break L91;
                                                        } else {
                                                          if (var36 == 0) {
                                                            continue L93;
                                                          } else {
                                                            break L92;
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                                if (var16 == null) {
                                                  break L91;
                                                } else {
                                                  var27 = 1;
                                                  L94: while (true) {
                                                    if ((var57.length ^ -1) >= (var27 ^ -1)) {
                                                      break L91;
                                                    } else {
                                                      var16[var27] = var37.c((byte) 44);
                                                      var27 += 2;
                                                      if (var36 != 0) {
                                                        break L90;
                                                      } else {
                                                        if (var36 == 0) {
                                                          continue L94;
                                                        } else {
                                                          break L91;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              var27 = 0;
                                              break L90;
                                            }
                                            L95: while (true) {
                                              L96: {
                                                L97: {
                                                  L98: {
                                                    L99: {
                                                      L100: {
                                                        if (var12 <= var27) {
                                                          break L100;
                                                        } else {
                                                          var47 = var13[var27];
                                                          var28 = var47;
                                                          stackOut_156_0 = null;
                                                          stackOut_156_1 = var47.field_g;
                                                          stackIn_247_0 = stackOut_156_0;
                                                          stackIn_247_1 = stackOut_156_1;
                                                          stackIn_157_0 = stackOut_156_0;
                                                          stackIn_157_1 = stackOut_156_1;
                                                          if (var36 != 0) {
                                                            L101: while (true) {
                                                              L102: {
                                                                if (stackIn_247_0 == stackIn_247_1) {
                                                                  break L102;
                                                                } else {
                                                                  var28.field_f = var37.h(255);
                                                                  break L102;
                                                                }
                                                              }
                                                              L103: {
                                                                if (0 >= var28.field_n) {
                                                                  break L103;
                                                                } else {
                                                                  var28.field_c = var37.h(255);
                                                                  break L103;
                                                                }
                                                              }
                                                              var27++;
                                                              if (var36 == 0) {
                                                                if ((var27 ^ -1) <= (var12 ^ -1)) {
                                                                  break L98;
                                                                } else {
                                                                  var49 = var13[var27];
                                                                  var28 = var49;
                                                                  stackOut_243_0 = (bq) (var49);
                                                                  stackIn_267_0 = stackOut_243_0;
                                                                  stackIn_244_0 = stackOut_243_0;
                                                                  if (var36 != 0) {
                                                                    break L99;
                                                                  } else {
                                                                    L104: {
                                                                      if (stackIn_244_0.field_m == null) {
                                                                        break L104;
                                                                      } else {
                                                                        var49.field_i = var37.h(255);
                                                                        break L104;
                                                                      }
                                                                    }
                                                                    stackOut_246_0 = null;
                                                                    stackOut_246_1 = var49.field_g;
                                                                    stackIn_247_0 = stackOut_246_0;
                                                                    stackIn_247_1 = stackOut_246_1;
                                                                    continue L101;
                                                                  }
                                                                }
                                                              } else {
                                                                break L98;
                                                              }
                                                            }
                                                          } else {
                                                            L105: {
                                                              L106: {
                                                                if (stackIn_157_0 == stackIn_157_1) {
                                                                  break L106;
                                                                } else {
                                                                  var19 = 0;
                                                                  var29 = 2;
                                                                  L107: while (true) {
                                                                    if (var29 >= var47.field_g.length) {
                                                                      break L106;
                                                                    } else {
                                                                      var19 = 1 + (var19 + var37.h(255));
                                                                      var47.field_g[var29] = (byte)var19;
                                                                      var29 += 2;
                                                                      if (var36 != 0) {
                                                                        break L105;
                                                                      } else {
                                                                        if (var36 == 0) {
                                                                          continue L107;
                                                                        } else {
                                                                          break L106;
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                              var27++;
                                                              break L105;
                                                            }
                                                            if (var36 == 0) {
                                                              continue L95;
                                                            } else {
                                                              break L100;
                                                            }
                                                          }
                                                        }
                                                      }
                                                      var27 = 0;
                                                      L108: while (true) {
                                                        L109: {
                                                          L110: {
                                                            if ((var12 ^ -1) >= (var27 ^ -1)) {
                                                              break L110;
                                                            } else {
                                                              var48 = var13[var27];
                                                              stackOut_166_0 = var48.field_m;
                                                              stackIn_175_0 = stackOut_166_0;
                                                              stackIn_167_0 = stackOut_166_0;
                                                              if (var36 != 0) {
                                                                break L109;
                                                              } else {
                                                                L111: {
                                                                  L112: {
                                                                    if (stackIn_167_0 == null) {
                                                                      break L112;
                                                                    } else {
                                                                      var19 = 0;
                                                                      var29 = 2;
                                                                      L113: while (true) {
                                                                        if (var48.field_m.length <= var29) {
                                                                          break L112;
                                                                        } else {
                                                                          var19 = var37.h(255) + (1 + var19);
                                                                          var48.field_m[var29] = (byte)var19;
                                                                          var29 += 2;
                                                                          if (var36 != 0) {
                                                                            break L111;
                                                                          } else {
                                                                            if (var36 == 0) {
                                                                              continue L113;
                                                                            } else {
                                                                              break L112;
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                  var27++;
                                                                  break L111;
                                                                }
                                                                if (var36 == 0) {
                                                                  continue L108;
                                                                } else {
                                                                  break L110;
                                                                }
                                                              }
                                                            }
                                                          }
                                                          stackOut_174_0 = (byte[]) (var15_array);
                                                          stackIn_175_0 = stackOut_174_0;
                                                          break L109;
                                                        }
                                                        L114: {
                                                          L115: {
                                                            L116: {
                                                              L117: {
                                                                if (stackIn_175_0 == null) {
                                                                  break L117;
                                                                } else {
                                                                  var19 = var37.h(255);
                                                                  var15_array[0] = (byte)var19;
                                                                  var27 = 2;
                                                                  L118: while (true) {
                                                                    L119: {
                                                                      L120: {
                                                                        if ((var27 ^ -1) <= (var45.length ^ -1)) {
                                                                          break L120;
                                                                        } else {
                                                                          var19 = 1 + var19 - -var37.h(255);
                                                                          var15_array[var27] = (byte)var19;
                                                                          var27 += 2;
                                                                          if (var36 != 0) {
                                                                            break L119;
                                                                          } else {
                                                                            if (var36 == 0) {
                                                                              continue L118;
                                                                            } else {
                                                                              break L120;
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                      var27 = var45[0];
                                                                      break L119;
                                                                    }
                                                                    var28_int = var45[1];
                                                                    var29 = 0;
                                                                    L121: while (true) {
                                                                      L122: {
                                                                        L123: {
                                                                          if (var27 <= var29) {
                                                                            break L123;
                                                                          } else {
                                                                            this.field_j[var29] = (byte)(32 + this.field_j[var29] * var28_int >> -516278554);
                                                                            var29++;
                                                                            if (var36 != 0) {
                                                                              break L122;
                                                                            } else {
                                                                              if (var36 == 0) {
                                                                                continue L121;
                                                                              } else {
                                                                                break L123;
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                        var29 = 2;
                                                                        break L122;
                                                                      }
                                                                      L124: while (true) {
                                                                        L125: {
                                                                          if (var45.length <= var29) {
                                                                            break L125;
                                                                          } else {
                                                                            var30 = var45[var29];
                                                                            var31 = var15_array[var29 - -1];
                                                                            var32 = (var30 + -var27) / 2 + (var30 - var27) * var28_int;
                                                                            stackOut_187_0 = var27;
                                                                            stackIn_203_0 = stackOut_187_0;
                                                                            stackIn_188_0 = stackOut_187_0;
                                                                            if (var36 != 0) {
                                                                              break L116;
                                                                            } else {
                                                                              var33 = stackIn_188_0;
                                                                              L126: while (true) {
                                                                                L127: {
                                                                                  L128: {
                                                                                    if (var30 <= var33) {
                                                                                      break L128;
                                                                                    } else {
                                                                                      var34 = go.e(-1, var32, -var27 + var30);
                                                                                      this.field_j[var33] = (byte)(var34 * this.field_j[var33] - -32 >> -555708954);
                                                                                      var32 = var32 + (-var28_int + var31);
                                                                                      var33++;
                                                                                      if (var36 != 0) {
                                                                                        break L127;
                                                                                      } else {
                                                                                        if (var36 == 0) {
                                                                                          continue L126;
                                                                                        } else {
                                                                                          break L128;
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  var27 = var30;
                                                                                  var29 += 2;
                                                                                  var28_int = var31;
                                                                                  break L127;
                                                                                }
                                                                                if (var36 == 0) {
                                                                                  continue L124;
                                                                                } else {
                                                                                  break L125;
                                                                                }
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                        var15_array = null;
                                                                        var30 = var27;
                                                                        L129: while (true) {
                                                                          if (var30 >= 128) {
                                                                            break L117;
                                                                          } else {
                                                                            this.field_j[var30] = (byte)(32 + this.field_j[var30] * var28_int >> 1447188390);
                                                                            var30++;
                                                                            continue L129;
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                              L130: {
                                                                if (var16 != null) {
                                                                  break L130;
                                                                } else {
                                                                  var27 = 0;
                                                                  L131: while (true) {
                                                                    if (var27 >= var12) {
                                                                      break L115;
                                                                    } else {
                                                                      var13[var27].field_n = var37.h(255);
                                                                      var27++;
                                                                      if (var36 != 0) {
                                                                        break L114;
                                                                      } else {
                                                                        if (var36 == 0) {
                                                                          continue L131;
                                                                        } else {
                                                                          break L130;
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                              var19 = var37.h(255);
                                                              var16[0] = (byte)var19;
                                                              stackOut_202_0 = 2;
                                                              stackIn_203_0 = stackOut_202_0;
                                                              break L116;
                                                            }
                                                            var27 = stackIn_203_0;
                                                            L132: while (true) {
                                                              L133: {
                                                                L134: {
                                                                  if (var27 >= var57.length) {
                                                                    break L134;
                                                                  } else {
                                                                    var19 = var37.h(255) + (var19 + 1);
                                                                    var16[var27] = (byte)var19;
                                                                    var27 += 2;
                                                                    if (var36 != 0) {
                                                                      break L133;
                                                                    } else {
                                                                      if (var36 == 0) {
                                                                        continue L132;
                                                                      } else {
                                                                        break L134;
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                                var27 = var57[0];
                                                                break L133;
                                                              }
                                                              var28_int = var57[1] << -221185055;
                                                              var29 = 0;
                                                              L135: while (true) {
                                                                L136: {
                                                                  L137: {
                                                                    L138: {
                                                                      if ((var27 ^ -1) >= (var29 ^ -1)) {
                                                                        break L138;
                                                                      } else {
                                                                        var30 = (this.field_l[var29] & 255) - -var28_int;
                                                                        stackOut_210_0 = var30 ^ -1;
                                                                        stackOut_210_1 = -1;
                                                                        stackIn_218_0 = stackOut_210_0;
                                                                        stackIn_218_1 = stackOut_210_1;
                                                                        stackIn_211_0 = stackOut_210_0;
                                                                        stackIn_211_1 = stackOut_210_1;
                                                                        if (var36 != 0) {
                                                                          L139: while (true) {
                                                                            if (stackIn_218_0 >= stackIn_218_1) {
                                                                              break L137;
                                                                            } else {
                                                                              var30 = var57[var29];
                                                                              var31 = var16[var29 - -1] << 137960641;
                                                                              var32 = var28_int * (-var27 + var30) + (-var27 + var30) / 2;
                                                                              stackOut_219_0 = var27;
                                                                              stackIn_237_0 = stackOut_219_0;
                                                                              stackIn_220_0 = stackOut_219_0;
                                                                              if (var36 != 0) {
                                                                                break L136;
                                                                              } else {
                                                                                var33 = stackIn_220_0;
                                                                                L140: while (true) {
                                                                                  L141: {
                                                                                    if ((var30 ^ -1) >= (var33 ^ -1)) {
                                                                                      break L141;
                                                                                    } else {
                                                                                      var34 = go.e(-1, var32, -var27 + var30);
                                                                                      var35 = var34 + (255 & this.field_l[var33]);
                                                                                      stackOut_222_0 = var35 ^ -1;
                                                                                      stackOut_222_1 = -1;
                                                                                      stackIn_218_0 = stackOut_222_0;
                                                                                      stackIn_218_1 = stackOut_222_1;
                                                                                      stackIn_223_0 = stackOut_222_0;
                                                                                      stackIn_223_1 = stackOut_222_1;
                                                                                      if (var36 != 0) {
                                                                                        continue L139;
                                                                                      } else {
                                                                                        L142: {
                                                                                          if (stackIn_223_0 <= stackIn_223_1) {
                                                                                            break L142;
                                                                                          } else {
                                                                                            var35 = 0;
                                                                                            break L142;
                                                                                          }
                                                                                        }
                                                                                        L143: {
                                                                                          if (-129 <= (var35 ^ -1)) {
                                                                                            break L143;
                                                                                          } else {
                                                                                            var35 = 128;
                                                                                            break L143;
                                                                                          }
                                                                                        }
                                                                                        var32 = var32 + (var31 + -var28_int);
                                                                                        this.field_l[var33] = (byte)var35;
                                                                                        var33++;
                                                                                        if (var36 == 0) {
                                                                                          continue L140;
                                                                                        } else {
                                                                                          break L141;
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  var28_int = var31;
                                                                                  var29 += 2;
                                                                                  var27 = var30;
                                                                                  if (var36 == 0) {
                                                                                    stackOut_217_0 = var57.length ^ -1;
                                                                                    stackOut_217_1 = var29 ^ -1;
                                                                                    stackIn_218_0 = stackOut_217_0;
                                                                                    stackIn_218_1 = stackOut_217_1;
                                                                                    continue L139;
                                                                                  } else {
                                                                                    break L137;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                          }
                                                                        } else {
                                                                          L144: {
                                                                            if (stackIn_211_0 <= stackIn_211_1) {
                                                                              break L144;
                                                                            } else {
                                                                              var30 = 0;
                                                                              break L144;
                                                                            }
                                                                          }
                                                                          L145: {
                                                                            if (-129 <= (var30 ^ -1)) {
                                                                              break L145;
                                                                            } else {
                                                                              var30 = 128;
                                                                              break L145;
                                                                            }
                                                                          }
                                                                          this.field_l[var29] = (byte)var30;
                                                                          var29++;
                                                                          if (var36 == 0) {
                                                                            continue L135;
                                                                          } else {
                                                                            break L138;
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                    var29 = 2;
                                                                    L146: while (true) {
                                                                      stackOut_217_0 = var57.length ^ -1;
                                                                      stackOut_217_1 = var29 ^ -1;
                                                                      stackIn_218_0 = stackOut_217_0;
                                                                      stackIn_218_1 = stackOut_217_1;
                                                                      L147: while (true) {
                                                                        if (stackIn_218_0 >= stackIn_218_1) {
                                                                          break L137;
                                                                        } else {
                                                                          var30 = var57[var29];
                                                                          var31 = var16[var29 - -1] << 137960641;
                                                                          var32 = var28_int * (-var27 + var30) + (-var27 + var30) / 2;
                                                                          stackOut_219_0 = var27;
                                                                          stackIn_237_0 = stackOut_219_0;
                                                                          stackIn_220_0 = stackOut_219_0;
                                                                          if (var36 != 0) {
                                                                            break L136;
                                                                          } else {
                                                                            var33 = stackIn_220_0;
                                                                            L148: while (true) {
                                                                              L149: {
                                                                                if ((var30 ^ -1) >= (var33 ^ -1)) {
                                                                                  break L149;
                                                                                } else {
                                                                                  var34 = go.e(-1, var32, -var27 + var30);
                                                                                  var35 = var34 + (255 & this.field_l[var33]);
                                                                                  stackOut_222_0 = var35 ^ -1;
                                                                                  stackOut_222_1 = -1;
                                                                                  stackIn_218_0 = stackOut_222_0;
                                                                                  stackIn_218_1 = stackOut_222_1;
                                                                                  stackIn_223_0 = stackOut_222_0;
                                                                                  stackIn_223_1 = stackOut_222_1;
                                                                                  if (var36 != 0) {
                                                                                    continue L147;
                                                                                  } else {
                                                                                    L150: {
                                                                                      if (stackIn_223_0 <= stackIn_223_1) {
                                                                                        break L150;
                                                                                      } else {
                                                                                        var35 = 0;
                                                                                        break L150;
                                                                                      }
                                                                                    }
                                                                                    L151: {
                                                                                      if (-129 <= (var35 ^ -1)) {
                                                                                        break L151;
                                                                                      } else {
                                                                                        var35 = 128;
                                                                                        break L151;
                                                                                      }
                                                                                    }
                                                                                    var32 = var32 + (var31 + -var28_int);
                                                                                    this.field_l[var33] = (byte)var35;
                                                                                    var33++;
                                                                                    if (var36 == 0) {
                                                                                      continue L148;
                                                                                    } else {
                                                                                      break L149;
                                                                                    }
                                                                                  }
                                                                                }
                                                                              }
                                                                              var28_int = var31;
                                                                              var29 += 2;
                                                                              var27 = var30;
                                                                              if (var36 == 0) {
                                                                                continue L146;
                                                                              } else {
                                                                                break L137;
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                  var16 = null;
                                                                  var30 = var27;
                                                                  L152: while (true) {
                                                                    if (var30 >= 128) {
                                                                      stackOut_236_0 = 0;
                                                                      stackIn_237_0 = stackOut_236_0;
                                                                      break L136;
                                                                    } else {
                                                                      L153: {
                                                                        var31 = var28_int + (this.field_l[var30] & 255);
                                                                        if (0 <= var31) {
                                                                          break L153;
                                                                        } else {
                                                                          var31 = 0;
                                                                          break L153;
                                                                        }
                                                                      }
                                                                      L154: {
                                                                        if (128 >= var31) {
                                                                          break L154;
                                                                        } else {
                                                                          var31 = 128;
                                                                          break L154;
                                                                        }
                                                                      }
                                                                      this.field_l[var30] = (byte)var31;
                                                                      var30++;
                                                                      continue L152;
                                                                    }
                                                                  }
                                                                }
                                                                var27 = stackIn_237_0;
                                                                L155: while (true) {
                                                                  if (var27 >= var12) {
                                                                    break L115;
                                                                  } else {
                                                                    var13[var27].field_n = var37.h(255);
                                                                    var27++;
                                                                    if (var36 != 0) {
                                                                      break L114;
                                                                    } else {
                                                                      if (var36 == 0) {
                                                                        continue L155;
                                                                      } else {
                                                                        break L115;
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                          var27 = 0;
                                                          break L114;
                                                        }
                                                        L156: while (true) {
                                                          if ((var27 ^ -1) <= (var12 ^ -1)) {
                                                            break L98;
                                                          } else {
                                                            var49 = var13[var27];
                                                            var28 = var49;
                                                            stackOut_243_0 = (bq) (var49);
                                                            stackIn_267_0 = stackOut_243_0;
                                                            stackIn_244_0 = stackOut_243_0;
                                                            if (var36 != 0) {
                                                              break L99;
                                                            } else {
                                                              L157: {
                                                                if (stackIn_244_0.field_m == null) {
                                                                  break L157;
                                                                } else {
                                                                  var49.field_i = var37.h(255);
                                                                  break L157;
                                                                }
                                                              }
                                                              stackOut_246_0 = null;
                                                              stackOut_246_1 = var49.field_g;
                                                              stackIn_247_0 = stackOut_246_0;
                                                              stackIn_247_1 = stackOut_246_1;
                                                              L158: {
                                                                if (stackIn_247_0 == stackIn_247_1) {
                                                                  break L158;
                                                                } else {
                                                                  var28.field_f = var37.h(255);
                                                                  break L158;
                                                                }
                                                              }
                                                              L159: {
                                                                if (0 >= var28.field_n) {
                                                                  break L159;
                                                                } else {
                                                                  var28.field_c = var37.h(255);
                                                                  break L159;
                                                                }
                                                              }
                                                              var27++;
                                                              if (var36 == 0) {
                                                                continue L156;
                                                              } else {
                                                                break L98;
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L160: while (true) {
                                                      L161: {
                                                        if ((stackIn_267_0.field_l ^ -1) >= -1) {
                                                          break L161;
                                                        } else {
                                                          var28.field_j = var37.h(255);
                                                          break L161;
                                                        }
                                                      }
                                                      var27++;
                                                      if (var36 == 0) {
                                                        if ((var27 ^ -1) <= (var12 ^ -1)) {
                                                          break L96;
                                                        } else {
                                                          var51 = var13[var27];
                                                          var28 = var51;
                                                          if (var36 != 0) {
                                                            break L97;
                                                          } else {
                                                            stackOut_266_0 = (bq) (var51);
                                                            stackIn_267_0 = stackOut_266_0;
                                                            continue L160;
                                                          }
                                                        }
                                                      } else {
                                                        break L96;
                                                      }
                                                    }
                                                  }
                                                  var27 = 0;
                                                  L162: while (true) {
                                                    L163: {
                                                      L164: {
                                                        if (var27 >= var12) {
                                                          break L164;
                                                        } else {
                                                          var13[var27].field_d = var37.h(255);
                                                          var27++;
                                                          if (var36 != 0) {
                                                            break L163;
                                                          } else {
                                                            if (var36 == 0) {
                                                              continue L162;
                                                            } else {
                                                              break L164;
                                                            }
                                                          }
                                                        }
                                                      }
                                                      var27 = 0;
                                                      break L163;
                                                    }
                                                    L165: while (true) {
                                                      L166: {
                                                        L167: {
                                                          if ((var12 ^ -1) >= (var27 ^ -1)) {
                                                            break L167;
                                                          } else {
                                                            var50 = var13[var27];
                                                            stackOut_258_0 = var50.field_d;
                                                            stackIn_263_0 = stackOut_258_0;
                                                            stackIn_259_0 = stackOut_258_0;
                                                            if (var36 != 0) {
                                                              break L166;
                                                            } else {
                                                              L168: {
                                                                if (stackIn_259_0 <= 0) {
                                                                  break L168;
                                                                } else {
                                                                  var50.field_l = var37.h(255);
                                                                  break L168;
                                                                }
                                                              }
                                                              var27++;
                                                              if (var36 == 0) {
                                                                continue L165;
                                                              } else {
                                                                break L167;
                                                              }
                                                            }
                                                          }
                                                        }
                                                        stackOut_262_0 = 0;
                                                        stackIn_263_0 = stackOut_262_0;
                                                        break L166;
                                                      }
                                                      var27 = stackIn_263_0;
                                                      L169: while (true) {
                                                        if ((var27 ^ -1) <= (var12 ^ -1)) {
                                                          break L96;
                                                        } else {
                                                          var51 = var13[var27];
                                                          var28 = var51;
                                                          if (var36 != 0) {
                                                            break L97;
                                                          } else {
                                                            stackOut_266_0 = (bq) (var51);
                                                            stackIn_267_0 = stackOut_266_0;
                                                            L170: {
                                                              if ((stackIn_267_0.field_l ^ -1) >= -1) {
                                                                break L170;
                                                              } else {
                                                                var28.field_j = var37.h(255);
                                                                break L170;
                                                              }
                                                            }
                                                            var27++;
                                                            if (var36 == 0) {
                                                              continue L169;
                                                            } else {
                                                              break L96;
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
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L171: {
            var2 = decompiledCaughtException;
            stackOut_271_0 = (RuntimeException) (var2);
            stackOut_271_1 = new StringBuilder().append("tn.<init>(");
            stackIn_273_0 = stackOut_271_0;
            stackIn_273_1 = stackOut_271_1;
            stackIn_272_0 = stackOut_271_0;
            stackIn_272_1 = stackOut_271_1;
            if (param0 == null) {
              stackOut_273_0 = (RuntimeException) ((Object) stackIn_273_0);
              stackOut_273_1 = (StringBuilder) ((Object) stackIn_273_1);
              stackOut_273_2 = "null";
              stackIn_274_0 = stackOut_273_0;
              stackIn_274_1 = stackOut_273_1;
              stackIn_274_2 = stackOut_273_2;
              break L171;
            } else {
              stackOut_272_0 = (RuntimeException) ((Object) stackIn_272_0);
              stackOut_272_1 = (StringBuilder) ((Object) stackIn_272_1);
              stackOut_272_2 = "{...}";
              stackIn_274_0 = stackOut_272_0;
              stackIn_274_1 = stackOut_272_1;
              stackIn_274_2 = stackOut_272_2;
              break L171;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_274_0), stackIn_274_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
    }
}
