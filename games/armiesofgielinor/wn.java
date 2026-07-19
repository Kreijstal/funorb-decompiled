/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wn extends ih {
    private boolean field_cb;
    private int[] field_fb;
    private int field_ib;
    static je field_kb;
    static String field_db;
    static String field_gb;
    private int[] field_S;
    static String[] field_eb;
    static mq field_jb;
    private vk field_hb;
    static String field_bb;

    final static boolean a(CharSequence param0, int param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        boolean stackIn_23_0 = false;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_37_0 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        boolean stackOut_22_0 = false;
        int stackOut_29_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param0 == null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var3_int = param0.length();
                if (var3_int < param1) {
                  break L1;
                } else {
                  if (-13 > (var3_int ^ -1)) {
                    break L1;
                  } else {
                    L2: {
                      var4 = k.a(param0, false);
                      if (var4 == null) {
                        break L2;
                      } else {
                        if ((var4.length() ^ -1) > -2) {
                          break L2;
                        } else {
                          L3: {
                            if (rs.a(var4.charAt(0), (byte) -111)) {
                              break L3;
                            } else {
                              if (rs.a(var4.charAt(var4.length() - 1), (byte) -74)) {
                                break L3;
                              } else {
                                var5 = 0;
                                var6 = 0;
                                L4: while (true) {
                                  L5: {
                                    L6: {
                                      if (var6 >= param0.length()) {
                                        break L6;
                                      } else {
                                        var7 = param0.charAt(var6);
                                        stackOut_22_0 = rs.a((char) var7, (byte) -42);
                                        stackIn_33_0 = stackOut_22_0 ? 1 : 0;
                                        stackIn_23_0 = stackOut_22_0;
                                        if (var8 != 0) {
                                          break L5;
                                        } else {
                                          L7: {
                                            if (!stackIn_23_0) {
                                              var5 = 0;
                                              if (var8 == 0) {
                                                break L7;
                                              } else {
                                                var5++;
                                                break L7;
                                              }
                                            } else {
                                              var5++;
                                              break L7;
                                            }
                                          }
                                          L8: {
                                            if (2 > var5) {
                                              break L8;
                                            } else {
                                              if (param2) {
                                                break L8;
                                              } else {
                                                stackOut_29_0 = 0;
                                                stackIn_30_0 = stackOut_29_0;
                                                decompiledRegionSelector0 = 4;
                                                break L0;
                                              }
                                            }
                                          }
                                          var6++;
                                          if (var8 == 0) {
                                            continue L4;
                                          } else {
                                            break L6;
                                          }
                                        }
                                      }
                                    }
                                    stackOut_32_0 = var5;
                                    stackIn_33_0 = stackOut_32_0;
                                    break L5;
                                  }
                                  if (stackIn_33_0 <= 0) {
                                    stackOut_36_0 = 1;
                                    stackIn_37_0 = stackOut_36_0;
                                    decompiledRegionSelector0 = 6;
                                    break L0;
                                  } else {
                                    stackOut_34_0 = 0;
                                    stackIn_35_0 = stackOut_34_0;
                                    decompiledRegionSelector0 = 5;
                                    break L0;
                                  }
                                }
                              }
                            }
                          }
                          stackOut_18_0 = 0;
                          stackIn_19_0 = stackOut_18_0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                      }
                    }
                    stackOut_13_0 = 0;
                    stackIn_14_0 = stackOut_13_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
              stackOut_8_0 = 0;
              stackIn_9_0 = stackOut_8_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) (var3);
            stackOut_38_1 = new StringBuilder().append("wn.AB(");
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param0 == null) {
              stackOut_40_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackOut_40_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L9;
            } else {
              stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L9;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_41_0), stackIn_41_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_19_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_30_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_35_0 != 0;
                  } else {
                    return stackIn_37_0 != 0;
                  }
                }
              }
            }
          }
        }
    }

    final synchronized void a(int param0, int param1, byte param2) {
        um var5 = null;
        if (-1 == param1) {
          this.field_ib = param0;
          return;
        } else {
          L0: {
            super.a(param0, param1, (byte) -28);
            this.field_S[param1] = param0 << 568932236;
            if (param2 <= -13) {
              break L0;
            } else {
              var5 = (um) null;
              this.a(true, (byte) 40, true, (um) null);
              break L0;
            }
          }
          return;
        }
    }

    public wn() {
        this.field_fb = new int[16];
        this.field_ib = 256;
        this.field_S = new int[16];
        this.k(3933);
    }

    final static void a(int param0, wk[] param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (-1 > (param2 ^ -1)) {
                  L2: {
                    var6_int = param1[0].field_A;
                    var7 = param1[2].field_A;
                    var8 = param1[1].field_A;
                    param1[0].b(param3, param4, param0);
                    param1[2].b(-var7 + param2 + param3, param4, param0);
                    qn.b(an.field_H);
                    qn.b(var6_int + param3, param4, param3 + param2 + -var7, param1[1].field_x + param4);
                    if (param5 == -3225) {
                      break L2;
                    } else {
                      wn.a(true);
                      break L2;
                    }
                  }
                  var9 = var6_int + param3;
                  var10 = -var7 + param2 + param3;
                  param3 = var9;
                  L3: while (true) {
                    L4: {
                      if (var10 <= param3) {
                        qn.a(an.field_H);
                        break L4;
                      } else {
                        param1[1].b(param3, param4, param0);
                        param3 = param3 + var8;
                        if (var11 != 0) {
                          break L4;
                        } else {
                          continue L3;
                        }
                      }
                    }
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var6);
            stackOut_13_1 = new StringBuilder().append("wn.VA(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void c(byte param0) {
        boolean discarded$2 = false;
        CharSequence var2 = null;
        if (param0 != 52) {
          var2 = (CharSequence) null;
          discarded$2 = wn.a((CharSequence) null, -50, false);
          field_kb = null;
          field_jb = null;
          field_eb = null;
          field_bb = null;
          field_db = null;
          field_gb = null;
          return;
        } else {
          field_kb = null;
          field_jb = null;
          field_eb = null;
          field_bb = null;
          field_db = null;
          field_gb = null;
          return;
        }
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_19_0 = 0;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = this.i(4096);
              this.f(-87, this.field_ib * var4_int >> -1208277848);
              super.b(param0, param1, param2);
              if (!this.field_cb) {
                var5 = 1;
                var6 = 0;
                L2: while (true) {
                  L3: {
                    L4: {
                      if ((var6 ^ -1) <= -17) {
                        break L4;
                      } else {
                        var7 = this.field_fb[var6];
                        stackOut_5_0 = 0;
                        stackIn_20_0 = stackOut_5_0;
                        stackIn_6_0 = stackOut_5_0;
                        if (var9 != 0) {
                          break L3;
                        } else {
                          L5: {
                            if (stackIn_6_0 != var7) {
                              L6: {
                                this.field_S[var6] = this.field_S[var6] + var7 * param2;
                                var8 = this.field_hb.field_a[var6];
                                if ((var7 ^ -1) >= -1) {
                                  stackOut_10_0 = 0;
                                  stackIn_11_0 = stackOut_10_0;
                                  break L6;
                                } else {
                                  stackOut_9_0 = 1;
                                  stackIn_11_0 = stackOut_9_0;
                                  break L6;
                                }
                              }
                              L7: {
                                stackOut_11_0 = stackIn_11_0;
                                stackIn_13_0 = stackOut_11_0;
                                stackIn_12_0 = stackOut_11_0;
                                if (this.field_S[var6] >> -136759284 >= var8) {
                                  stackOut_13_0 = stackIn_13_0;
                                  stackOut_13_1 = 0;
                                  stackIn_14_0 = stackOut_13_0;
                                  stackIn_14_1 = stackOut_13_1;
                                  break L7;
                                } else {
                                  stackOut_12_0 = stackIn_12_0;
                                  stackOut_12_1 = 1;
                                  stackIn_14_0 = stackOut_12_0;
                                  stackIn_14_1 = stackOut_12_1;
                                  break L7;
                                }
                              }
                              L8: {
                                L9: {
                                  if ((stackIn_14_0 ^ stackIn_14_1) != 0) {
                                    break L9;
                                  } else {
                                    var5 = 0;
                                    if (var9 == 0) {
                                      break L8;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                                this.field_fb[var6] = 0;
                                this.field_S[var6] = var8 << -719769620;
                                break L8;
                              }
                              super.a(this.field_S[var6] >> -1148159860, var6, (byte) -123);
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          var6++;
                          if (var9 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    stackOut_19_0 = var5;
                    stackIn_20_0 = stackOut_19_0;
                    break L3;
                  }
                  if (stackIn_20_0 != 0) {
                    this.field_cb = true;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            }
            this.f(-54, var4_int);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) (var4);
            stackOut_25_1 = new StringBuilder().append("wn.E(");
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L10;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L10;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final synchronized void a(int param0, vk param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_hb = param1;
              if (param2 == -20751) {
                break L1;
              } else {
                field_kb = (je) null;
                break L1;
              }
            }
            var4_int = 0;
            L2: while (true) {
              if (16 <= var4_int) {
                break L0;
              } else {
                this.c(param0, var4_int, -128, this.field_hb.field_a[var4_int]);
                var4_int++;
                if (var5 == 0) {
                  continue L2;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var4);
            stackOut_10_1 = new StringBuilder().append("wn.WA(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param2 + ')');
        }
    }

    private final synchronized void c(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int[] stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        int[] stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int[] stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int[] stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        int stackIn_23_2 = 0;
        int[] stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int[] stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        int stackOut_22_2 = 0;
        int[] stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        int stackOut_21_2 = 0;
        int[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int[] stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        int[] stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        L0: {
          this.field_cb = false;
          if (null == this.field_hb) {
            this.field_hb = new vk();
            break L0;
          } else {
            break L0;
          }
        }
        this.field_hb.field_a[param1] = param3;
        if (param2 >= -126) {
          L1: {
            this.a(82, -42, (byte) 31);
            var5 = this.field_S[param1];
            var6 = (this.field_hb.field_a[param1] << 1815846700) + -var5;
            var7 = 0;
            var8 = 0;
            if (var6 < 0) {
              var6 = -var6;
              var8 = 1;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (-1 > (var6 ^ -1)) {
              var7 = (1 + var6) / (param0 - -1);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            stackOut_20_0 = this.field_fb;
            stackOut_20_1 = param1;
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (var8 == 0) {
              stackOut_22_0 = (int[]) ((Object) stackIn_22_0);
              stackOut_22_1 = stackIn_22_1;
              stackOut_22_2 = var7;
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L3;
            } else {
              stackOut_21_0 = (int[]) ((Object) stackIn_21_0);
              stackOut_21_1 = stackIn_21_1;
              stackOut_21_2 = -var7;
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L3;
            }
          }
          stackIn_23_0[stackIn_23_1] = stackIn_23_2;
          return;
        } else {
          L4: {
            var5 = this.field_S[param1];
            var6 = (this.field_hb.field_a[param1] << 1815846700) + -var5;
            var7 = 0;
            var8 = 0;
            if (var6 < 0) {
              var6 = -var6;
              var8 = 1;
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            if (-1 > (var6 ^ -1)) {
              var7 = (1 + var6) / (param0 - -1);
              break L5;
            } else {
              break L5;
            }
          }
          L6: {
            stackOut_10_0 = this.field_fb;
            stackOut_10_1 = param1;
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (var8 == 0) {
              stackOut_12_0 = (int[]) ((Object) stackIn_12_0);
              stackOut_12_1 = stackIn_12_1;
              stackOut_12_2 = var7;
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L6;
            } else {
              stackOut_11_0 = (int[]) ((Object) stackIn_11_0);
              stackOut_11_1 = stackIn_11_1;
              stackOut_11_2 = -var7;
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L6;
            }
          }
          stackIn_13_0[stackIn_13_1] = stackIn_13_2;
          return;
        }
    }

    wn(ih param0) {
        super(param0);
        this.field_fb = new int[16];
        this.field_ib = 256;
        this.field_S = new int[16];
        try {
            this.k(3933);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "wn.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0) {
        int var1 = 0;
        L0: {
          if (32 < te.field_n) {
            L1: {
              var1 = te.field_n % 32;
              if (var1 != 0) {
                break L1;
              } else {
                var1 = 32;
                break L1;
              }
            }
            jf.b(te.field_n - var1, 108);
            break L0;
          } else {
            jf.b(0, 99);
            if (!ArmiesOfGielinor.field_M) {
              break L0;
            } else {
              L2: {
                var1 = te.field_n % 32;
                if (var1 != 0) {
                  break L2;
                } else {
                  var1 = 32;
                  break L2;
                }
              }
              jf.b(te.field_n - var1, 108);
              if (param0) {
                return;
              } else {
                field_jb = (mq) null;
                return;
              }
            }
          }
        }
        if (!param0) {
          field_jb = (mq) null;
          return;
        } else {
          return;
        }
    }

    final synchronized void a(boolean param0, byte param1, boolean param2, um param3) {
        try {
            if (param1 > -78) {
                this.field_hb = (vk) null;
            }
            this.k(3933);
            super.a(param0, (byte) -110, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "wn.EA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final synchronized void a(byte param0, int param1, vk param2) {
        int var4_int = 0;
        try {
            var4_int = param1 * rc.field_d / 1000;
            int var5 = 58 / ((9 - param0) / 36);
            this.a(var4_int, param2, -20751);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "wn.BB(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void k(int param0) {
        int var2 = 0;
        int var3 = 0;
        wk[] var4 = null;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          if (var2 >= 16) {
            if (param0 == 3933) {
              super.a(256, -1, (byte) -20);
              return;
            } else {
              var4 = (wk[]) null;
              wn.a(47, (wk[]) null, 67, -125, 49, -47);
              super.a(256, -1, (byte) -20);
              return;
            }
          } else {
            this.field_S[var2] = 1048576;
            var2++;
            if (var3 == 0) {
              continue L0;
            } else {
              return;
            }
          }
        }
    }

    static {
        field_gb = "Move here";
        field_eb = new String[]{"tutorial.lev", "tutorial2.lev"};
        field_bb = "This unit cannot use ranged weapons.";
    }
}
