/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wa extends ik {
    static String field_h;
    static String field_e;
    int field_f;
    int field_g;

    private final void a(int param0, ha param1) {
        jd var5 = null;
        try {
            var5 = param1.c(this.field_f, true, this.field_g);
            jd var3 = var5;
            if (param0 != 0) {
                ha var4 = (ha) null;
                this.b((byte) 119, (ha) null);
            }
            var5.field_P = uc.field_d[this.field_c][5];
            var5.field_o = uc.field_d[this.field_c][6];
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "wa.S(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, vh param1) {
        try {
            param1.b(true, this.field_c);
            param1.b(1, this.field_g);
            param1.b(1, this.field_f);
            if (param0 != -11637) {
                field_e = (String) null;
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "wa.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void d(byte param0, ha param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        jd var5 = null;
        jd var6 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 < -100) {
                break L1;
              } else {
                this.field_f = 58;
                break L1;
              }
            }
            L2: {
              var5 = param1.c(this.field_f, true, this.field_g);
              var6 = var5;
              if (-8 == (uc.field_d[this.field_c][6] ^ -1)) {
                var5.field_I = true;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              L4: {
                if (uc.field_d[this.field_c][6] != 16) {
                  break L4;
                } else {
                  L5: {
                    if (-1 > (var6.field_cb ^ -1)) {
                      break L5;
                    } else {
                      L6: {
                        L7: {
                          if (34 != var6.field_N) {
                            break L7;
                          } else {
                            if (var6.field_W) {
                              break L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                        var6.field_s = false;
                        break L6;
                      }
                      L8: {
                        if (74 != var6.field_N) {
                          break L8;
                        } else {
                          var6.field_B = 2;
                          if (var4 == 0) {
                            break L4;
                          } else {
                            break L8;
                          }
                        }
                      }
                      var6.field_B = 1;
                      if (var4 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var6.field_cb = var6.field_cb - 1;
                  break L3;
                }
              }
              break L3;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var3);
            stackOut_19_1 = new StringBuilder().append("wa.R(").append(param0).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L9;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L9;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
    }

    private final void a(boolean param0, ha param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        ha var5 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                var5 = (ha) null;
                this.a((ha) null, false);
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  L5: {
                    L6: {
                      L7: {
                        var3_int = uc.field_d[this.field_c][5];
                        if (var3_int != 0) {
                          break L7;
                        } else {
                          if (var4 == 0) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      if (var3_int != 64) {
                        break L3;
                      } else {
                        if (var4 == 0) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    this.d((byte) -106, param1);
                    if (var4 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                  this.c((byte) 78, param1);
                  if (var4 == 0) {
                    break L4;
                  } else {
                    break L3;
                  }
                }
                break L2;
              }
              this.b(true, param1);
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var3);
            stackOut_15_1 = new StringBuilder().append("wa.M(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L8;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L8;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
    }

    private final void b(int param0, ha param1) {
        jd var5 = null;
        try {
            if (param0 <= 80) {
                ha var4 = (ha) null;
                this.a((ha) null, 28);
            }
            var5 = param1.c(this.field_f, true, this.field_g);
            jd var3 = var5;
            var5.field_r = uc.field_d[this.field_c][6] | uc.field_d[this.field_c][5] << -379528731;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "wa.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void c(byte param0, ha param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        jd var6 = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 78) {
                break L1;
              } else {
                field_h = (String) null;
                break L1;
              }
            }
            var3_int = uc.field_d[this.field_c][7];
            var4 = this.field_g + -var3_int;
            L2: while (true) {
              L3: {
                if (var4 > var3_int + this.field_g) {
                  break L3;
                } else {
                  if (var8 != 0) {
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    var5 = -var3_int + this.field_f;
                    L4: while (true) {
                      L5: {
                        L6: {
                          if ((this.field_f + var3_int ^ -1) > (var5 ^ -1)) {
                            break L6;
                          } else {
                            var6 = param1.c(var5, true, var4);
                            if (var8 != 0) {
                              break L5;
                            } else {
                              L7: {
                                L8: {
                                  L9: {
                                    if (var6 != null) {
                                      break L9;
                                    } else {
                                      if (var8 == 0) {
                                        break L8;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                  var7 = 0;
                                  L10: while (true) {
                                    L11: {
                                      L12: {
                                        if ((uc.field_d[this.field_c][6] ^ -1) >= (var7 ^ -1)) {
                                          break L12;
                                        } else {
                                          param1.field_l.a(750, new st(var6, 6));
                                          var7++;
                                          if (var8 != 0) {
                                            break L11;
                                          } else {
                                            if (var8 == 0) {
                                              continue L10;
                                            } else {
                                              break L12;
                                            }
                                          }
                                        }
                                      }
                                      var7 = 0;
                                      break L11;
                                    }
                                    L13: while (true) {
                                      if (uc.field_d[this.field_c][6] >= var7) {
                                        break L8;
                                      } else {
                                        param1.field_l.a(750, new st(var6, 4));
                                        var7--;
                                        if (var8 != 0) {
                                          break L7;
                                        } else {
                                          if (var8 == 0) {
                                            continue L13;
                                          } else {
                                            break L8;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                var5++;
                                break L7;
                              }
                              if (var8 == 0) {
                                continue L4;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        var4++;
                        break L5;
                      }
                      if (var8 == 0) {
                        continue L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var3 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) (var3);
            stackOut_28_1 = new StringBuilder().append("wa.N(").append(param0).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param1 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L14;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L14;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void b(boolean param0, ha param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        jd var6 = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = uc.field_d[this.field_c][7];
              if (param0) {
                break L1;
              } else {
                this.field_g = -123;
                break L1;
              }
            }
            var4 = this.field_g - var3_int;
            L2: while (true) {
              L3: {
                if ((var3_int + this.field_g ^ -1) > (var4 ^ -1)) {
                  break L3;
                } else {
                  if (var8 != 0) {
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    var5 = this.field_f + -var3_int;
                    L4: while (true) {
                      L5: {
                        L6: {
                          if ((var3_int + this.field_f ^ -1) > (var5 ^ -1)) {
                            break L6;
                          } else {
                            var6 = param1.c(var5, true, var4);
                            if (var8 != 0) {
                              break L5;
                            } else {
                              L7: {
                                L8: {
                                  if (var6 == null) {
                                    break L8;
                                  } else {
                                    L9: {
                                      if ((uc.field_d[this.field_c][6] ^ -1) < -1) {
                                        break L9;
                                      } else {
                                        var7 = 0;
                                        L10: while (true) {
                                          L11: {
                                            if (var7 <= uc.field_d[this.field_c][6]) {
                                              break L11;
                                            } else {
                                              param1.field_l.a(750, new st(var6, 1));
                                              var7--;
                                              if (var8 != 0) {
                                                break L7;
                                              } else {
                                                if (var8 == 0) {
                                                  continue L10;
                                                } else {
                                                  break L11;
                                                }
                                              }
                                            }
                                          }
                                          if (var8 == 0) {
                                            break L8;
                                          } else {
                                            break L9;
                                          }
                                        }
                                      }
                                    }
                                    param1.field_l.a(750, new nw(var6, param1.a(var6, (byte) -128, uc.field_d[this.field_c][5], uc.field_d[this.field_c][6]), false));
                                    break L8;
                                  }
                                }
                                var5++;
                                break L7;
                              }
                              if (var8 == 0) {
                                continue L4;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        var4++;
                        break L5;
                      }
                      if (var8 == 0) {
                        continue L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var3 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (var3);
            stackOut_23_1 = new StringBuilder().append("wa.O(").append(param0).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L12;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L12;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, ok param1) {
        try {
            bd.a((byte) 111, new fj(param1));
            if (param0 < 8) {
                field_h = (String) null;
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "wa.T(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(byte param0, int param1, ha param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        ne var7_ref_ne = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_30_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_62_1 = 0;
        RuntimeException stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        RuntimeException stackIn_90_0 = null;
        StringBuilder stackIn_90_1 = null;
        RuntimeException stackIn_91_0 = null;
        StringBuilder stackIn_91_1 = null;
        String stackIn_91_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_41_1 = 0;
        int stackOut_50_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_61_1 = 0;
        RuntimeException stackOut_88_0 = null;
        StringBuilder stackOut_88_1 = null;
        RuntimeException stackOut_90_0 = null;
        StringBuilder stackOut_90_1 = null;
        String stackOut_90_2 = null;
        RuntimeException stackOut_89_0 = null;
        StringBuilder stackOut_89_1 = null;
        String stackOut_89_2 = null;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (uc.field_d[this.field_c][5] == 5) {
                  var4_int = uc.field_d[this.field_c][7];
                  var5 = this.field_g - var4_int;
                  L3: while (true) {
                    stackOut_4_0 = var4_int + this.field_g ^ -1;
                    stackOut_4_1 = var5 ^ -1;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    L4: while (true) {
                      if (stackIn_5_0 > stackIn_5_1) {
                        break L2;
                      } else {
                        stackOut_6_0 = -1;
                        stackOut_6_1 = var5 ^ -1;
                        stackIn_24_0 = stackOut_6_0;
                        stackIn_24_1 = stackOut_6_1;
                        stackIn_7_0 = stackOut_6_0;
                        stackIn_7_1 = stackOut_6_1;
                        if (var11 != 0) {
                          break L1;
                        } else {
                          L5: {
                            L6: {
                              if (stackIn_7_0 >= stackIn_7_1) {
                                break L6;
                              } else {
                                if (var11 == 0) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            L7: {
                              if (param2.field_v > var5) {
                                break L7;
                              } else {
                                if (var11 == 0) {
                                  break L2;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            var6 = -var4_int + this.field_f;
                            L8: while (true) {
                              if ((var6 ^ -1) < (this.field_f + var4_int ^ -1)) {
                                break L5;
                              } else {
                                stackOut_15_0 = var6 ^ -1;
                                stackOut_15_1 = -1;
                                stackIn_5_0 = stackOut_15_0;
                                stackIn_5_1 = stackOut_15_1;
                                stackIn_16_0 = stackOut_15_0;
                                stackIn_16_1 = stackOut_15_1;
                                if (var11 != 0) {
                                  continue L4;
                                } else {
                                  L9: {
                                    L10: {
                                      if (stackIn_16_0 <= stackIn_16_1) {
                                        break L10;
                                      } else {
                                        if (var11 == 0) {
                                          break L9;
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                    if ((var6 ^ -1) <= (param2.field_db ^ -1)) {
                                      break L5;
                                    } else {
                                      var7_ref_ne = param2.field_Eb[var5 + param2.field_v * var6];
                                      var7_ref_ne.b(true, param2.o(param1, -1));
                                      break L9;
                                    }
                                  }
                                  var6++;
                                  if (var11 == 0) {
                                    continue L8;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                            }
                          }
                          var5++;
                          if (var11 == 0) {
                            continue L3;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                } else {
                  break L2;
                }
              }
              stackOut_23_0 = uc.field_d[this.field_c][5];
              stackOut_23_1 = 6;
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              break L1;
            }
            L11: {
              L12: {
                L13: {
                  L14: {
                    if (stackIn_24_0 == stackIn_24_1) {
                      break L14;
                    } else {
                      if (uc.field_d[this.field_c][5] == 3) {
                        var4_int = uc.field_d[this.field_c][7];
                        var5 = -var4_int + this.field_g;
                        L15: while (true) {
                          L16: {
                            if (var4_int + this.field_g < var5) {
                              break L16;
                            } else {
                              stackOut_29_0 = this.field_f + -var4_int;
                              stackIn_61_0 = stackOut_29_0;
                              stackIn_30_0 = stackOut_29_0;
                              if (var11 != 0) {
                                break L12;
                              } else {
                                var6 = stackIn_30_0;
                                L17: while (true) {
                                  L18: {
                                    L19: {
                                      if (var4_int + this.field_f < var6) {
                                        break L19;
                                      } else {
                                        param2.b(var5, true, uc.field_d[this.field_c][6], param1, var6);
                                        var6++;
                                        if (var11 != 0) {
                                          break L18;
                                        } else {
                                          if (var11 == 0) {
                                            continue L17;
                                          } else {
                                            break L19;
                                          }
                                        }
                                      }
                                    }
                                    var5++;
                                    break L18;
                                  }
                                  if (var11 == 0) {
                                    continue L15;
                                  } else {
                                    break L16;
                                  }
                                }
                              }
                            }
                          }
                          if (var11 == 0) {
                            break L13;
                          } else {
                            break L14;
                          }
                        }
                      } else {
                        break L13;
                      }
                    }
                  }
                  var4_int = uc.field_d[this.field_c][7];
                  var5 = this.field_g - var4_int;
                  L20: while (true) {
                    stackOut_39_0 = this.field_g - -var4_int ^ -1;
                    stackIn_40_0 = stackOut_39_0;
                    L21: while (true) {
                      if (stackIn_40_0 > (var5 ^ -1)) {
                        break L13;
                      } else {
                        stackOut_41_0 = 0;
                        stackOut_41_1 = var5;
                        stackIn_62_0 = stackOut_41_0;
                        stackIn_62_1 = stackOut_41_1;
                        stackIn_42_0 = stackOut_41_0;
                        stackIn_42_1 = stackOut_41_1;
                        if (var11 != 0) {
                          break L11;
                        } else {
                          L22: {
                            L23: {
                              if (stackIn_42_0 <= stackIn_42_1) {
                                break L23;
                              } else {
                                if (var11 == 0) {
                                  break L22;
                                } else {
                                  break L23;
                                }
                              }
                            }
                            L24: {
                              if ((param2.field_v ^ -1) < (var5 ^ -1)) {
                                break L24;
                              } else {
                                if (var11 == 0) {
                                  break L13;
                                } else {
                                  break L24;
                                }
                              }
                            }
                            var6 = this.field_f - var4_int;
                            L25: while (true) {
                              if ((this.field_f + var4_int ^ -1) > (var6 ^ -1)) {
                                break L22;
                              } else {
                                stackOut_50_0 = var6;
                                stackIn_40_0 = stackOut_50_0;
                                stackIn_51_0 = stackOut_50_0;
                                if (var11 != 0) {
                                  continue L21;
                                } else {
                                  L26: {
                                    L27: {
                                      if (stackIn_51_0 >= 0) {
                                        break L27;
                                      } else {
                                        if (var11 == 0) {
                                          break L26;
                                        } else {
                                          break L27;
                                        }
                                      }
                                    }
                                    L28: {
                                      if (param2.field_db > var6) {
                                        break L28;
                                      } else {
                                        if (var11 == 0) {
                                          break L22;
                                        } else {
                                          break L28;
                                        }
                                      }
                                    }
                                    param2.a((byte) 86, param1, var6, var5);
                                    break L26;
                                  }
                                  var6++;
                                  if (var11 == 0) {
                                    continue L25;
                                  } else {
                                    break L22;
                                  }
                                }
                              }
                            }
                          }
                          var5++;
                          if (var11 == 0) {
                            continue L20;
                          } else {
                            break L13;
                          }
                        }
                      }
                    }
                  }
                }
                stackOut_60_0 = uc.field_d[this.field_c][5];
                stackIn_61_0 = stackOut_60_0;
                break L12;
              }
              stackOut_61_0 = stackIn_61_0;
              stackOut_61_1 = 4;
              stackIn_62_0 = stackOut_61_0;
              stackIn_62_1 = stackOut_61_1;
              break L11;
            }
            L29: {
              if (stackIn_62_0 != stackIn_62_1) {
                break L29;
              } else {
                L30: {
                  L31: {
                    L32: {
                      L33: {
                        L34: {
                          L35: {
                            L36: {
                              L37: {
                                var4_int = param2.a(this.field_f, 2056, this.field_g);
                                var5 = param2.g(this.field_f, -85, this.field_g);
                                var6 = this.field_g;
                                var7 = this.field_f;
                                var8 = 0;
                                var9 = 0;
                                var10 = var4_int;
                                if (1 != var10) {
                                  break L37;
                                } else {
                                  if (var11 == 0) {
                                    var9 = -1;
                                    var8 = 0;
                                    if (var11 == 0) {
                                      break L31;
                                    } else {
                                      break L36;
                                    }
                                  } else {
                                    break L37;
                                  }
                                }
                              }
                              if (2 == var10) {
                                break L36;
                              } else {
                                if (var10 == 3) {
                                  break L35;
                                } else {
                                  if ((var10 ^ -1) == -1) {
                                    break L34;
                                  } else {
                                    break L33;
                                  }
                                }
                              }
                            }
                            var8 = 0;
                            var9 = 1;
                            if (var11 == 0) {
                              break L31;
                            } else {
                              break L35;
                            }
                          }
                          var9 = 0;
                          var8 = -1;
                          if (var11 == 0) {
                            break L32;
                          } else {
                            break L34;
                          }
                        }
                        var9 = 0;
                        var8 = 1;
                        if (var11 == 0) {
                          break L32;
                        } else {
                          break L33;
                        }
                      }
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                    break L30;
                  }
                  break L30;
                }
                L38: while (true) {
                  L39: {
                    L40: {
                      if ((param2.g(var7, -85, var6) ^ -1) != (var5 ^ -1)) {
                        break L40;
                      } else {
                        param2.b(var6, true, 10, param1, var7);
                        var7 = var7 + var9;
                        var6 = var6 + var8;
                        if (var11 != 0) {
                          break L39;
                        } else {
                          if (var11 == 0) {
                            continue L38;
                          } else {
                            break L40;
                          }
                        }
                      }
                    }
                    param2.b(var6, true, 1, param1, var7);
                    break L39;
                  }
                  param2.b(this.field_g + -var8, true, 1, param1, this.field_f - var9);
                  break L29;
                }
              }
            }
            if (param0 == -100) {
              L41: {
                if (uc.field_d[this.field_c][5] != 7) {
                  break L41;
                } else {
                  param2.field_Eb[this.field_f * param2.field_v + this.field_g].field_a = -1;
                  param2.f(-2);
                  param2.b(param0 ^ -98);
                  break L41;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L42: {
            var4 = decompiledCaughtException;
            stackOut_88_0 = (RuntimeException) (var4);
            stackOut_88_1 = new StringBuilder().append("wa.J(").append(param0).append(',').append(param1).append(',');
            stackIn_90_0 = stackOut_88_0;
            stackIn_90_1 = stackOut_88_1;
            stackIn_89_0 = stackOut_88_0;
            stackIn_89_1 = stackOut_88_1;
            if (param2 == null) {
              stackOut_90_0 = (RuntimeException) ((Object) stackIn_90_0);
              stackOut_90_1 = (StringBuilder) ((Object) stackIn_90_1);
              stackOut_90_2 = "null";
              stackIn_91_0 = stackOut_90_0;
              stackIn_91_1 = stackOut_90_1;
              stackIn_91_2 = stackOut_90_2;
              break L42;
            } else {
              stackOut_89_0 = (RuntimeException) ((Object) stackIn_89_0);
              stackOut_89_1 = (StringBuilder) ((Object) stackIn_89_1);
              stackOut_89_2 = "{...}";
              stackIn_91_0 = stackOut_89_0;
              stackIn_91_1 = stackOut_89_1;
              stackIn_91_2 = stackOut_89_2;
              break L42;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_91_0), stackIn_91_2 + ')');
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

    final static int a(bv param0, int param1, int param2) {
        int discarded$2 = 0;
        RuntimeException var3 = null;
        bv var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == 1) {
                break L1;
              } else {
                var4 = (bv) null;
                discarded$2 = wa.a((bv) null, 11, -12);
                break L1;
              }
            }
            stackOut_2_0 = (param0.g(param2 + -102, param1) ^ 1 << param1 - 1) + -(1 << param1 - 1);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("wa.L(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    final void a(int param0, ha param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        jd var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (-1 != (uc.field_d[this.field_c][3] ^ -1)) {
                break L1;
              } else {
                var4_ref = param1.c(this.field_f, true, this.field_g);
                if (var4_ref == null) {
                  break L1;
                } else {
                  var4_ref.field_D = true;
                  break L1;
                }
              }
            }
            var4_int = uc.field_d[this.field_c][4];
            if (param2 == 26123) {
              L2: {
                L3: {
                  L4: {
                    L5: {
                      L6: {
                        L7: {
                          L8: {
                            L9: {
                              L10: {
                                var5 = var4_int;
                                if (-5 != (var5 ^ -1)) {
                                  break L10;
                                } else {
                                  if (var6 == 0) {
                                    break L9;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              L11: {
                                if ((var5 ^ -1) != -7) {
                                  break L11;
                                } else {
                                  if (var6 == 0) {
                                    break L8;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                              L12: {
                                if ((var5 ^ -1) != -1) {
                                  break L12;
                                } else {
                                  if (var6 == 0) {
                                    break L7;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                              L13: {
                                if (-2 != (var5 ^ -1)) {
                                  break L13;
                                } else {
                                  if (var6 == 0) {
                                    break L6;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                              if ((var5 ^ -1) == -4) {
                                break L5;
                              } else {
                                if (-3 != (var5 ^ -1)) {
                                  break L3;
                                } else {
                                  if (var6 == 0) {
                                    break L4;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                            }
                            this.a(true, param1);
                            if (var6 == 0) {
                              break L3;
                            } else {
                              break L8;
                            }
                          }
                          this.a((byte) -100, param0, param1);
                          if (var6 == 0) {
                            break L3;
                          } else {
                            break L7;
                          }
                        }
                        this.a(0, param1);
                        if (var6 == 0) {
                          break L3;
                        } else {
                          break L6;
                        }
                      }
                      this.b(95, param1);
                      if (var6 == 0) {
                        break L3;
                      } else {
                        break L5;
                      }
                    }
                    this.b((byte) 51, param1);
                    if (var6 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                  this.a(param1, true);
                  break L2;
                }
                break L2;
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
          L14: {
            var4 = decompiledCaughtException;
            stackOut_34_0 = (RuntimeException) (var4);
            stackOut_34_1 = new StringBuilder().append("wa.A(").append(param0).append(',');
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
          throw ig.a((Throwable) ((Object) stackIn_37_0), stackIn_37_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final int a(int param0) {
        if (param0 != 25365) {
            return -57;
        }
        return 4;
    }

    final static void a(int param0, int param1, aj param2) {
        try {
            if (param1 != 1) {
                ok var4 = (ok) null;
                wa.a(-25, (ok) null);
            }
            oj.field_r.a((byte) -119, (tc) (param2));
            wr.a((byte) -57, param2, param0);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "wa.U(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void b(byte param0, ha param1) {
        jd var3 = null;
        RuntimeException var3_ref = null;
        jd var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              var4 = param1.c(this.field_f, true, this.field_g);
              var3 = var4;
              if (param0 == 51) {
                break L1;
              } else {
                field_h = (String) null;
                break L1;
              }
            }
            L2: {
              if (var3 != null) {
                var4.field_ab = uc.field_d[this.field_c][5];
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var3_ref);
            stackOut_6_1 = new StringBuilder().append("wa.K(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final void a(byte param0, ha param1) {
        try {
            if (param0 != -37) {
                this.field_g = 12;
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "wa.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(ha param0, boolean param1) {
        RuntimeException var3 = null;
        jd var4 = null;
        jd var5 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  var4 = param0.c(this.field_f, param1, this.field_g);
                  var5 = var4;
                  if (115 != this.field_c) {
                    break L3;
                  } else {
                    if (-64 == (var5.field_N ^ -1)) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (119 != this.field_c) {
                    break L4;
                  } else {
                    if (43 == var5.field_N) {
                      break L2;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (-119 != (this.field_c ^ -1)) {
                    break L5;
                  } else {
                    if (var5.field_N == 59) {
                      break L2;
                    } else {
                      break L5;
                    }
                  }
                }
                L6: {
                  if (-117 != (this.field_c ^ -1)) {
                    break L6;
                  } else {
                    if (-59 == (var5.field_N ^ -1)) {
                      break L2;
                    } else {
                      break L6;
                    }
                  }
                }
                if ((this.field_c ^ -1) != -118) {
                  break L1;
                } else {
                  if (-54 == (var5.field_N ^ -1)) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              var5.field_F = true;
              param0.a(this.field_f, this.field_g, 0, 3);
              break L1;
            }
            L7: {
              if (-121 == (this.field_c ^ -1)) {
                var4.field_C = true;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (19 != uc.field_d[this.field_c][5]) {
                break L8;
              } else {
                var5.field_bb = true;
                break L8;
              }
            }
            L9: {
              L10: {
                if ((uc.field_d[this.field_c][5] ^ -1) != -22) {
                  break L10;
                } else {
                  var4.field_cb = var4.field_cb + uc.field_d[this.field_c][6];
                  var5.field_s = true;
                  var5.field_B = 0;
                  if (-101 > (var5.field_cb ^ -1)) {
                    var5.field_cb = 100;
                    break L10;
                  } else {
                    break L9;
                  }
                }
              }
              break L9;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var3 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) (var3);
            stackOut_26_1 = new StringBuilder().append("wa.P(");
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param0 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L11;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L11;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param1 + ')');
        }
    }

    public static void c(int param0) {
        field_h = null;
        field_e = null;
        if (param0 != 6) {
            field_h = (String) null;
        }
    }

    wa(int param0, int param1, int param2) {
        super(param0);
        this.field_f = param2;
        this.field_g = param1;
    }

    final void a(ha param0, int param1) {
        try {
            if (param1 != -1700635440) {
                field_h = (String) null;
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "wa.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_h = "(<%0> players want to join)";
    }
}
