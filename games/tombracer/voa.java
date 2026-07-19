/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class voa extends ci {
    private int field_p;
    static boolean field_v;
    static String field_s;
    private int field_n;
    private int field_r;
    private int field_m;
    private int field_u;
    private int field_o;
    static String field_q;
    private int field_t;

    final int[] c(int param0, int param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int[] stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        int[] stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        int[] stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        int[] stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        int stackIn_33_2 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        int[] stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        int[] stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        int[] stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        int stackOut_31_2 = 0;
        int[] stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        int stackOut_32_2 = 0;
        L0: {
          var11 = TombRacer.field_G ? 1 : 0;
          var12 = this.field_i.a((byte) -109, param1);
          var3 = var12;
          if (param0 == 1) {
            break L0;
          } else {
            this.field_p = 94;
            break L0;
          }
        }
        L1: {
          if (!this.field_i.field_d) {
            break L1;
          } else {
            var4 = sj.field_b[param1] - 2048;
            var5 = 0;
            L2: while (true) {
              if (var5 >= ns.field_g) {
                break L1;
              } else {
                L3: {
                  var6 = -2048 + ht.field_Fb[var5];
                  var7 = this.field_p + var6;
                  if (var7 < -2048) {
                    stackOut_7_0 = var7 - -4096;
                    stackIn_8_0 = stackOut_7_0;
                    break L3;
                  } else {
                    stackOut_6_0 = var7;
                    stackIn_8_0 = stackOut_6_0;
                    break L3;
                  }
                }
                L4: {
                  var7 = stackIn_8_0;
                  if (-2049 <= (var7 ^ -1)) {
                    stackOut_10_0 = var7;
                    stackIn_11_0 = stackOut_10_0;
                    break L4;
                  } else {
                    stackOut_9_0 = var7 + -4096;
                    stackIn_11_0 = stackOut_9_0;
                    break L4;
                  }
                }
                L5: {
                  var7 = stackIn_11_0;
                  var8 = var4 - -this.field_u;
                  if (var8 < -2048) {
                    stackOut_13_0 = 4096 + var8;
                    stackIn_14_0 = stackOut_13_0;
                    break L5;
                  } else {
                    stackOut_12_0 = var8;
                    stackIn_14_0 = stackOut_12_0;
                    break L5;
                  }
                }
                L6: {
                  var8 = stackIn_14_0;
                  if (var8 > 2048) {
                    stackOut_16_0 = var8 + -4096;
                    stackIn_17_0 = stackOut_16_0;
                    break L6;
                  } else {
                    stackOut_15_0 = var8;
                    stackIn_17_0 = stackOut_15_0;
                    break L6;
                  }
                }
                L7: {
                  var8 = stackIn_17_0;
                  var9 = this.field_o + var6;
                  if (2047 >= (var9 ^ -1)) {
                    stackOut_19_0 = var9;
                    stackIn_20_0 = stackOut_19_0;
                    break L7;
                  } else {
                    stackOut_18_0 = 4096 + var9;
                    stackIn_20_0 = stackOut_18_0;
                    break L7;
                  }
                }
                L8: {
                  var9 = stackIn_20_0;
                  if ((var9 ^ -1) < -2049) {
                    stackOut_22_0 = -4096 + var9;
                    stackIn_23_0 = stackOut_22_0;
                    break L8;
                  } else {
                    stackOut_21_0 = var9;
                    stackIn_23_0 = stackOut_21_0;
                    break L8;
                  }
                }
                L9: {
                  var9 = stackIn_23_0;
                  var10 = var4 + this.field_n;
                  if (var10 >= -2048) {
                    stackOut_25_0 = var10;
                    stackIn_26_0 = stackOut_25_0;
                    break L9;
                  } else {
                    stackOut_24_0 = var10 - -4096;
                    stackIn_26_0 = stackOut_24_0;
                    break L9;
                  }
                }
                L10: {
                  var10 = stackIn_26_0;
                  if ((var10 ^ -1) < -2049) {
                    stackOut_28_0 = var10 + -4096;
                    stackIn_29_0 = stackOut_28_0;
                    break L10;
                  } else {
                    stackOut_27_0 = var10;
                    stackIn_29_0 = stackOut_27_0;
                    break L10;
                  }
                }
                L11: {
                  L12: {
                    var10 = stackIn_29_0;
                    stackOut_29_0 = (int[]) (var12);
                    stackOut_29_1 = var5;
                    stackIn_32_0 = stackOut_29_0;
                    stackIn_32_1 = stackOut_29_1;
                    stackIn_30_0 = stackOut_29_0;
                    stackIn_30_1 = stackOut_29_1;
                    if (this.a(var8, var7, (byte) 84)) {
                      break L12;
                    } else {
                      stackOut_30_0 = (int[]) ((Object) stackIn_30_0);
                      stackOut_30_1 = stackIn_30_1;
                      stackIn_32_0 = stackOut_30_0;
                      stackIn_32_1 = stackOut_30_1;
                      stackIn_31_0 = stackOut_30_0;
                      stackIn_31_1 = stackOut_30_1;
                      if (this.a(var9, (byte) -128, var10)) {
                        break L12;
                      } else {
                        stackOut_31_0 = (int[]) ((Object) stackIn_31_0);
                        stackOut_31_1 = stackIn_31_1;
                        stackOut_31_2 = 0;
                        stackIn_33_0 = stackOut_31_0;
                        stackIn_33_1 = stackOut_31_1;
                        stackIn_33_2 = stackOut_31_2;
                        break L11;
                      }
                    }
                  }
                  stackOut_32_0 = (int[]) ((Object) stackIn_32_0);
                  stackOut_32_1 = stackIn_32_1;
                  stackOut_32_2 = 4096;
                  stackIn_33_0 = stackOut_32_0;
                  stackIn_33_1 = stackOut_32_1;
                  stackIn_33_2 = stackOut_32_2;
                  break L11;
                }
                stackIn_33_0[stackIn_33_1] = stackIn_33_2;
                var5++;
                if (var11 == 0) {
                  continue L2;
                } else {
                  break L1;
                }
              }
            }
          }
        }
        return var12;
    }

    final void a(byte param0, uia param1, int param2) {
        boolean discarded$1 = false;
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  L4: {
                    L5: {
                      L6: {
                        L7: {
                          L8: {
                            L9: {
                              var4_int = param2;
                              if (-1 != (var4_int ^ -1)) {
                                break L9;
                              } else {
                                if (var5 == 0) {
                                  break L8;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            L10: {
                              if (1 != var4_int) {
                                break L10;
                              } else {
                                if (var5 == 0) {
                                  break L7;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            if (-3 == (var4_int ^ -1)) {
                              break L6;
                            } else {
                              L11: {
                                if (-4 != (var4_int ^ -1)) {
                                  break L11;
                                } else {
                                  if (var5 == 0) {
                                    break L5;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                              if (-5 == (var4_int ^ -1)) {
                                break L4;
                              } else {
                                L12: {
                                  if ((var4_int ^ -1) != -6) {
                                    break L12;
                                  } else {
                                    if (var5 == 0) {
                                      break L3;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                                if (var4_int != 6) {
                                  break L1;
                                } else {
                                  if (var5 == 0) {
                                    break L2;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                            }
                          }
                          this.field_p = param1.d(param0 ^ 23);
                          if (var5 == 0) {
                            break L1;
                          } else {
                            break L7;
                          }
                        }
                        this.field_u = param1.d(122);
                        if (var5 == 0) {
                          break L1;
                        } else {
                          break L6;
                        }
                      }
                      this.field_o = param1.d(122);
                      if (var5 == 0) {
                        break L1;
                      } else {
                        break L5;
                      }
                    }
                    this.field_n = param1.d(param0 + 17);
                    if (var5 == 0) {
                      break L1;
                    } else {
                      break L4;
                    }
                  }
                  this.field_t = param1.d(127);
                  if (var5 == 0) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
                this.field_m = param1.d(125);
                if (var5 == 0) {
                  break L1;
                } else {
                  break L2;
                }
              }
              this.field_r = param1.d(122);
              break L1;
            }
            L13: {
              if (param0 == 107) {
                break L13;
              } else {
                discarded$1 = this.a(3, 43, (byte) 18);
                break L13;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var4 = decompiledCaughtException;
            stackOut_34_0 = (RuntimeException) (var4);
            stackOut_34_1 = new StringBuilder().append("voa.A(").append(param0).append(',');
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param1 == null) {
              stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L14;
            } else {
              stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L14;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_37_0), stackIn_37_2 + ',' + param2 + ')');
        }
    }

    final static void d(int param0) {
        String[][] dupTemp$6 = null;
        long[][] dupTemp$7 = null;
        int[][] dupTemp$8 = null;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        bb var4 = null;
        long var4_long = 0L;
        int var5 = 0;
        kb var6_ref_kb = null;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        long[][] var10 = null;
        int[][] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        kh var28 = null;
        kh var29 = null;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_28_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_27_0 = 0;
        var26 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var28 = vc.field_q;
            var29 = var28;
            if (param0 <= -48) {
              L1: {
                L2: {
                  var2 = var29.h(255);
                  if (var2 == 0) {
                    break L2;
                  } else {
                    L3: {
                      if ((var2 ^ -1) == -2) {
                        break L3;
                      } else {
                        ssa.a("HS1: " + kk.a(32), (byte) 121, (Throwable) null);
                        dea.a(60);
                        if (var26 == 0) {
                          break L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var3 = var29.d(125);
                    var4_long = var29.b(290646880);
                    var6_ref_kb = (kb) ((Object) nn.field_a.f(-80));
                    L4: while (true) {
                      L5: {
                        L6: {
                          if (var6_ref_kb == null) {
                            break L6;
                          } else {
                            stackOut_9_0 = var6_ref_kb.field_l;
                            stackIn_14_0 = stackOut_9_0;
                            stackIn_10_0 = stackOut_9_0;
                            if (var26 != 0) {
                              break L5;
                            } else {
                              if (stackIn_10_0 == var3) {
                                break L6;
                              } else {
                                var6_ref_kb = (kb) ((Object) nn.field_a.e(122));
                                if (var26 == 0) {
                                  continue L4;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                        }
                        if (var6_ref_kb != null) {
                          var6_ref_kb.field_h = var4_long;
                          var6_ref_kb.p(39);
                          if (var26 == 0) {
                            break L1;
                          } else {
                            break L2;
                          }
                        } else {
                          stackOut_13_0 = 60;
                          stackIn_14_0 = stackOut_13_0;
                          break L5;
                        }
                      }
                      dea.a(stackIn_14_0);
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
                var3 = var29.d(122);
                var4 = (bb) ((Object) mg.field_b.f(-80));
                L7: while (true) {
                  L8: {
                    L9: {
                      if (var4 == null) {
                        break L9;
                      } else {
                        stackOut_19_0 = var4.field_n ^ -1;
                        stackIn_28_0 = stackOut_19_0;
                        stackIn_20_0 = stackOut_19_0;
                        if (var26 != 0) {
                          break L8;
                        } else {
                          L10: {
                            if (stackIn_20_0 != (var3 ^ -1)) {
                              break L10;
                            } else {
                              if (var26 == 0) {
                                break L9;
                              } else {
                                break L10;
                              }
                            }
                          }
                          var4 = (bb) ((Object) mg.field_b.e(124));
                          if (var26 == 0) {
                            continue L7;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                    if (var4 != null) {
                      stackOut_27_0 = var29.h(255);
                      stackIn_28_0 = stackOut_27_0;
                      break L8;
                    } else {
                      dea.a(60);
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  }
                  L11: {
                    var5 = stackIn_28_0;
                    if (-1 == (var5 ^ -1)) {
                      break L11;
                    } else {
                      var6 = var4.field_j;
                      bj.field_s[0].field_a = fna.field_k;
                      bj.field_s[0].field_c = null;
                      bj.field_s[0].field_d = false;
                      var7 = var4.field_i;
                      var8_int = 1;
                      L12: while (true) {
                        if (var5 <= var8_int) {
                          dupTemp$6 = new String[3][var6];
                          var4.field_k = dupTemp$6;
                          var8 = dupTemp$6;
                          var9 = new String[3][var6];
                          dupTemp$7 = new long[3][var6];
                          var4.field_o = dupTemp$7;
                          var10 = dupTemp$7;
                          dupTemp$8 = new int[3][var6 * var7];
                          var4.field_p = dupTemp$8;
                          var11 = dupTemp$8;
                          var12 = 0;
                          var13 = 0;
                          var14 = 0;
                          var15 = 0;
                          var16 = 0;
                          var17 = 0;
                          var18 = var29.h(255);
                          if (var18 <= 0) {
                            break L11;
                          } else {
                            var19 = 0;
                            L13: while (true) {
                              if (var18 <= var19) {
                                break L11;
                              } else {
                                var20 = var28.h(255);
                                var21 = bj.field_s[var20].field_a;
                                var22 = var29.b(290646880);
                                var24 = var29.field_h;
                                if (var26 == 0) {
                                  L14: {
                                    if (var19 >= var6) {
                                      break L14;
                                    } else {
                                      var8[0][var12] = var21;
                                      var9[0][var12] = bj.field_s[var20].field_c;
                                      var10[0][var12] = var22;
                                      var25 = 0;
                                      L15: while (true) {
                                        if (var25 >= var7) {
                                          var12++;
                                          break L14;
                                        } else {
                                          incrementValue$9 = var15;
                                          var15++;
                                          var11[0][incrementValue$9] = var28.e(-41);
                                          var25++;
                                          if (var26 != 0) {
                                            break L14;
                                          } else {
                                            continue L15;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  L16: {
                                    L17: {
                                      if (var21 == null) {
                                        break L17;
                                      } else {
                                        if (!ue.a(var21, 0)) {
                                          break L17;
                                        } else {
                                          var8[1][var13] = fna.field_k;
                                          var9[1][var13] = null;
                                          var10[1][var13] = var22;
                                          var29.field_h = var24;
                                          var13++;
                                          var25 = 0;
                                          L18: while (true) {
                                            if (var7 <= var25) {
                                              break L17;
                                            } else {
                                              incrementValue$10 = var16;
                                              var16++;
                                              var11[1][incrementValue$10] = var28.e(121);
                                              var25++;
                                              if (var26 != 0) {
                                                break L16;
                                              } else {
                                                continue L18;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    L19: {
                                      if (var14 >= var6) {
                                        break L19;
                                      } else {
                                        if (bj.field_s[var20].field_d) {
                                          break L19;
                                        } else {
                                          bj.field_s[var20].field_d = true;
                                          var8[2][var14] = var21;
                                          var9[2][var14] = bj.field_s[var20].field_c;
                                          var10[2][var14] = var22;
                                          var14++;
                                          var29.field_h = var24;
                                          var25 = 0;
                                          L20: while (true) {
                                            if (var25 >= var7) {
                                              break L19;
                                            } else {
                                              incrementValue$11 = var17;
                                              var17++;
                                              var11[2][incrementValue$11] = var28.e(-105);
                                              var25++;
                                              if (var26 != 0) {
                                                break L16;
                                              } else {
                                                continue L20;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    var19++;
                                    break L16;
                                  }
                                  if (var26 == 0) {
                                    continue L13;
                                  } else {
                                    break L11;
                                  }
                                } else {
                                  var4.p(125);
                                  break L1;
                                }
                              }
                            }
                          }
                        } else {
                          bj.field_s[var8_int].field_a = var28.e((byte) -76);
                          bj.field_s[var8_int].field_d = false;
                          if (var26 == 0) {
                            L21: {
                              L22: {
                                if ((var29.h(255) ^ -1) == -2) {
                                  break L22;
                                } else {
                                  bj.field_s[var8_int].field_c = null;
                                  if (var26 == 0) {
                                    break L21;
                                  } else {
                                    break L22;
                                  }
                                }
                              }
                              bj.field_s[var8_int].field_c = var29.e((byte) -76);
                              break L21;
                            }
                            var8_int++;
                            continue L12;
                          } else {
                            var4.p(125);
                            break L1;
                          }
                        }
                      }
                    }
                  }
                  var4.field_h = true;
                  var4.p(125);
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1), "voa.E(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    public static void c(int param0) {
        if (param0 != 0) {
            field_q = (String) null;
        }
        field_q = null;
        field_s = null;
    }

    final void b(byte param0) {
        tka.b((byte) 105);
        if (param0 != 116) {
            this.field_p = 92;
        }
    }

    final static void a(int param0, boolean param1, int param2, boolean param3, int param4, boolean param5, int param6, int param7, boolean param8, boolean param9) {
        int var11 = 0;
        L0: {
          var11 = TombRacer.field_G ? 1 : 0;
          if (param1) {
            break L0;
          } else {
            L1: {
              if (bea.field_g != ob.field_i) {
                break L1;
              } else {
                if (jqa.field_g == bea.field_a) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (bea.field_a != gn.field_C.field_e) {
              break L0;
            } else {
              if (gn.field_C.field_f != bea.field_g) {
                break L0;
              } else {
                L2: {
                  if (null != uu.field_a) {
                    break L2;
                  } else {
                    L3: {
                      if (null == ifa.field_n) {
                        break L3;
                      } else {
                        hn.c(true, 2);
                        if (var11 == 0) {
                          break L0;
                        } else {
                          break L3;
                        }
                      }
                    }
                    re.a(-29040);
                    if (var11 == 0) {
                      break L0;
                    } else {
                      break L2;
                    }
                  }
                }
                hn.c(false, 2);
                break L0;
              }
            }
          }
        }
        L4: {
          L5: {
            if (param1) {
              break L5;
            } else {
              ava.field_d = (-640 + ob.field_i) / 2;
              if (var11 == 0) {
                break L4;
              } else {
                break L5;
              }
            }
          }
          ava.field_d = ht.field_Xb;
          break L4;
        }
        L6: {
          di.a((byte) -98, param1);
          if (mla.field_a > 0) {
            jc.a(param5, true, param1, param6);
            break L6;
          } else {
            break L6;
          }
        }
        L7: {
          dl.field_t.field_x = tka.field_q.field_x;
          dl.field_t.field_z = 1;
          if (0 < gt.field_a) {
            vu.a((byte) 1, param5, param1, param6);
            break L7;
          } else {
            break L7;
          }
        }
        L8: {
          if (0 < fp.field_e) {
            aja.a(param1, -1, param6, param8, param5);
            break L8;
          } else {
            break L8;
          }
        }
        L9: {
          L10: {
            L11: {
              if (!tla.field_e) {
                break L11;
              } else {
                if (uu.field_a.field_Mb >= uu.field_a.field_Jb) {
                  break L10;
                } else {
                  break L11;
                }
              }
            }
            rra.field_e.field_X = true;
            bsa.field_j.field_vb.field_r = null;
            ava.a(bsa.field_j, param6, param0, param9, 2);
            if (var11 == 0) {
              break L9;
            } else {
              break L10;
            }
          }
          rra.field_e.field_X = false;
          bsa.field_j.field_vb.field_r = ml.field_c;
          vsa.a(-116, bsa.field_j.field_tb);
          break L9;
        }
        bh.a(param7, 0, param3, param0, param4, param6, param9);
        if (param2 != 4096) {
          return;
        } else {
          ava.a(tn.field_n, param6, param0, param9, 2);
          lh.field_a = lh.field_a + 1;
          return;
        }
    }

    private final boolean a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          var4 = (param2 + param0) * this.field_t >> -1450908500;
          var5 = lm.field_r[(1047023 & 255 * var4) >> 777228428];
          var5 = (var5 << 1429157708) / this.field_t;
          if (param1 == -128) {
            break L0;
          } else {
            this.field_r = 96;
            break L0;
          }
        }
        L1: {
          L2: {
            var5 = (var5 << 1054545772) / this.field_r;
            var5 = this.field_m * var5 >> -1955688532;
            if (var5 <= param2 - param0) {
              break L2;
            } else {
              if (-var5 >= param2 - param0) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    private final boolean a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          var4 = (param0 + -param1) * this.field_t >> -762271956;
          var5 = lm.field_r[(var4 * 255 & 1048064) >> 1852256588];
          var5 = (var5 << -1966904724) / this.field_t;
          var5 = (var5 << -1995003860) / this.field_r;
          var5 = var5 * this.field_m >> 265579116;
          if (param2 >= 51) {
            break L0;
          } else {
            this.field_p = -19;
            break L0;
          }
        }
        L1: {
          L2: {
            if (var5 <= param1 - -param0) {
              break L2;
            } else {
              if (param1 - -param0 <= -var5) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    public voa() {
        super(0, true);
        this.field_p = 2048;
        this.field_o = 0;
        this.field_r = 8192;
        this.field_n = 2048;
        this.field_m = 4096;
        this.field_u = 0;
        this.field_t = 12288;
    }

    static {
        field_v = true;
        field_q = "Watching";
    }
}
