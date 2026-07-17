/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gla extends ci {
    private int field_n;
    static String field_q;
    static it field_p;
    static String field_o;
    static int field_m;

    public static void d(byte param0) {
        field_p = null;
        field_o = null;
        field_p = null;
        field_q = null;
    }

    final int[] c(int param0, int param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] stackIn_9_0 = null;
        int stackIn_17_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_37_0 = 0;
        int[] stackIn_41_0 = null;
        int[] stackIn_48_0 = null;
        int stackIn_56_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_76_0 = 0;
        int[] stackIn_80_0 = null;
        int[] stackOut_47_0 = null;
        int stackOut_55_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_74_0 = 0;
        int[] stackOut_79_0 = null;
        int[] stackOut_8_0 = null;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        int[] stackOut_40_0 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        if (param0 == 1) {
          var15 = ((gla) this).field_i.a((byte) 17, param1);
          var13 = var15;
          var11 = var13;
          var10 = var11;
          var9 = var10;
          var3 = var9;
          if (((gla) this).field_i.field_d) {
            var4 = sj.field_b[param1];
            var5 = 0;
            L0: while (true) {
              if (ns.field_g > var5) {
                L1: {
                  stackOut_47_0 = ht.field_Fb;
                  stackIn_80_0 = stackOut_47_0;
                  stackIn_48_0 = stackOut_47_0;
                  if (var8 != 0) {
                    break L1;
                  } else {
                    L2: {
                      L3: {
                        var6 = stackIn_48_0[var5];
                        if (var6 <= ((gla) this).field_n) {
                          break L3;
                        } else {
                          if (var6 >= -((gla) this).field_n + 4096) {
                            break L3;
                          } else {
                            if (var4 <= -((gla) this).field_n + 2048) {
                              break L3;
                            } else {
                              if (var4 < ((gla) this).field_n + 2048) {
                                L4: {
                                  var7 = 2048 + -var6;
                                  if (var7 < 0) {
                                    stackOut_55_0 = -var7;
                                    stackIn_56_0 = stackOut_55_0;
                                    break L4;
                                  } else {
                                    stackOut_54_0 = var7;
                                    stackIn_56_0 = stackOut_54_0;
                                    break L4;
                                  }
                                }
                                var7 = stackIn_56_0;
                                var7 = var7 << 12;
                                var7 = var7 / (-((gla) this).field_n + 2048);
                                var9[var5] = -var7 + 4096;
                                if (var8 == 0) {
                                  break L2;
                                } else {
                                  break L3;
                                }
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                      }
                      L5: {
                        if (var6 <= 2048 + -((gla) this).field_n) {
                          break L5;
                        } else {
                          if (var6 >= 2048 - -((gla) this).field_n) {
                            break L5;
                          } else {
                            L6: {
                              var7 = var4 + -2048;
                              if (0 > var7) {
                                stackOut_61_0 = -var7;
                                stackIn_62_0 = stackOut_61_0;
                                break L6;
                              } else {
                                stackOut_60_0 = var7;
                                stackIn_62_0 = stackOut_60_0;
                                break L6;
                              }
                            }
                            var7 = stackIn_62_0;
                            var7 = var7 - ((gla) this).field_n;
                            var7 = var7 << 12;
                            var9[var5] = var7 / (-((gla) this).field_n + 2048);
                            if (var8 == 0) {
                              break L2;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      L7: {
                        L8: {
                          if (((gla) this).field_n > var4) {
                            break L8;
                          } else {
                            if (4096 - ((gla) this).field_n >= var4) {
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                        L9: {
                          var7 = var6 - 2048;
                          if (var7 >= 0) {
                            stackOut_68_0 = var7;
                            stackIn_69_0 = stackOut_68_0;
                            break L9;
                          } else {
                            stackOut_67_0 = -var7;
                            stackIn_69_0 = stackOut_67_0;
                            break L9;
                          }
                        }
                        var7 = stackIn_69_0;
                        var7 = var7 - ((gla) this).field_n;
                        var7 = var7 << 12;
                        var9[var5] = var7 / (-((gla) this).field_n + 2048);
                        if (var8 == 0) {
                          break L2;
                        } else {
                          break L7;
                        }
                      }
                      L10: {
                        L11: {
                          if (var6 < ((gla) this).field_n) {
                            break L11;
                          } else {
                            if (var6 <= -((gla) this).field_n + 4096) {
                              break L10;
                            } else {
                              break L11;
                            }
                          }
                        }
                        L12: {
                          var7 = 2048 - var4;
                          if (var7 < 0) {
                            stackOut_75_0 = -var7;
                            stackIn_76_0 = stackOut_75_0;
                            break L12;
                          } else {
                            stackOut_74_0 = var7;
                            stackIn_76_0 = stackOut_74_0;
                            break L12;
                          }
                        }
                        var7 = stackIn_76_0;
                        var7 = var7 << 12;
                        var7 = var7 / (2048 - ((gla) this).field_n);
                        var9[var5] = -var7 + 4096;
                        if (var8 == 0) {
                          break L2;
                        } else {
                          break L10;
                        }
                      }
                      var15[var5] = 0;
                      break L2;
                    }
                    var5++;
                    if (var8 == 0) {
                      continue L0;
                    } else {
                      stackOut_79_0 = (int[]) var9;
                      stackIn_80_0 = stackOut_79_0;
                      break L1;
                    }
                  }
                }
                return stackIn_80_0;
              } else {
                return var9;
              }
            }
          } else {
            return var9;
          }
        } else {
          field_p = null;
          var14 = ((gla) this).field_i.a((byte) 17, param1);
          var12 = var14;
          var11 = var12;
          var10 = var11;
          var9 = var10;
          var3 = var9;
          if (((gla) this).field_i.field_d) {
            var9 = var3;
            var11 = var10;
            var4 = sj.field_b[param1];
            var5 = 0;
            L13: while (true) {
              if (ns.field_g > var5) {
                L14: {
                  stackOut_8_0 = ht.field_Fb;
                  stackIn_41_0 = stackOut_8_0;
                  stackIn_9_0 = stackOut_8_0;
                  if (var8 != 0) {
                    break L14;
                  } else {
                    L15: {
                      L16: {
                        var6 = stackIn_9_0[var5];
                        if (var6 <= ((gla) this).field_n) {
                          break L16;
                        } else {
                          if (var6 >= -((gla) this).field_n + 4096) {
                            break L16;
                          } else {
                            if (var4 <= -((gla) this).field_n + 2048) {
                              break L16;
                            } else {
                              if (var4 < ((gla) this).field_n + 2048) {
                                L17: {
                                  var7 = 2048 + -var6;
                                  if (var7 < 0) {
                                    stackOut_16_0 = -var7;
                                    stackIn_17_0 = stackOut_16_0;
                                    break L17;
                                  } else {
                                    stackOut_15_0 = var7;
                                    stackIn_17_0 = stackOut_15_0;
                                    break L17;
                                  }
                                }
                                var7 = stackIn_17_0;
                                var7 = var7 << 12;
                                var7 = var7 / (-((gla) this).field_n + 2048);
                                var9[var5] = -var7 + 4096;
                                if (var8 == 0) {
                                  break L15;
                                } else {
                                  break L16;
                                }
                              } else {
                                break L16;
                              }
                            }
                          }
                        }
                      }
                      L18: {
                        if (var6 <= 2048 + -((gla) this).field_n) {
                          break L18;
                        } else {
                          if (var6 >= 2048 - -((gla) this).field_n) {
                            break L18;
                          } else {
                            L19: {
                              var7 = var4 + -2048;
                              if (0 > var7) {
                                stackOut_22_0 = -var7;
                                stackIn_23_0 = stackOut_22_0;
                                break L19;
                              } else {
                                stackOut_21_0 = var7;
                                stackIn_23_0 = stackOut_21_0;
                                break L19;
                              }
                            }
                            var7 = stackIn_23_0;
                            var7 = var7 - ((gla) this).field_n;
                            var7 = var7 << 12;
                            var9[var5] = var7 / (-((gla) this).field_n + 2048);
                            if (var8 == 0) {
                              break L15;
                            } else {
                              break L18;
                            }
                          }
                        }
                      }
                      L20: {
                        L21: {
                          if (((gla) this).field_n > var4) {
                            break L21;
                          } else {
                            if (4096 - ((gla) this).field_n >= var4) {
                              break L20;
                            } else {
                              break L21;
                            }
                          }
                        }
                        L22: {
                          var7 = var6 - 2048;
                          if (var7 >= 0) {
                            stackOut_29_0 = var7;
                            stackIn_30_0 = stackOut_29_0;
                            break L22;
                          } else {
                            stackOut_28_0 = -var7;
                            stackIn_30_0 = stackOut_28_0;
                            break L22;
                          }
                        }
                        var7 = stackIn_30_0;
                        var7 = var7 - ((gla) this).field_n;
                        var7 = var7 << 12;
                        var9[var5] = var7 / (-((gla) this).field_n + 2048);
                        if (var8 == 0) {
                          break L15;
                        } else {
                          break L20;
                        }
                      }
                      L23: {
                        L24: {
                          if (var6 < ((gla) this).field_n) {
                            break L24;
                          } else {
                            if (var6 <= -((gla) this).field_n + 4096) {
                              break L23;
                            } else {
                              break L24;
                            }
                          }
                        }
                        L25: {
                          var7 = 2048 - var4;
                          if (var7 < 0) {
                            stackOut_36_0 = -var7;
                            stackIn_37_0 = stackOut_36_0;
                            break L25;
                          } else {
                            stackOut_35_0 = var7;
                            stackIn_37_0 = stackOut_35_0;
                            break L25;
                          }
                        }
                        var7 = stackIn_37_0;
                        var7 = var7 << 12;
                        var7 = var7 / (2048 - ((gla) this).field_n);
                        var9[var5] = -var7 + 4096;
                        if (var8 == 0) {
                          break L15;
                        } else {
                          break L23;
                        }
                      }
                      var14[var5] = 0;
                      break L15;
                    }
                    var5++;
                    if (var8 == 0) {
                      continue L13;
                    } else {
                      stackOut_40_0 = (int[]) var9;
                      stackIn_41_0 = stackOut_40_0;
                      break L14;
                    }
                  }
                }
                return stackIn_41_0;
              } else {
                return var9;
              }
            }
          } else {
            return var9;
          }
        }
    }

    public gla() {
        super(0, true);
        ((gla) this).field_n = 585;
    }

    final void a(byte param0, uia param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
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
              var4_int = param2;
              if (var4_int == 0) {
                ((gla) this).field_n = param1.d(124);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == 107) {
                break L2;
              } else {
                gla.d((byte) 92);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("gla.A(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Room complete +<%0>";
        field_p = new it();
        field_o = "Idols";
        field_m = -1;
    }
}
