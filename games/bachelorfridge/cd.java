/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cd extends k {
    static String field_m;
    private int field_q;
    private int field_r;
    static String field_k;
    static sna field_n;
    static String field_p;
    static String field_l;
    static String[] field_o;

    final int[] a(int param0, int param1) {
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] stackIn_10_0 = null;
        int[] stackIn_24_0 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_9_0 = null;
        int[] stackOut_23_0 = null;
        var7 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                field_k = null;
                break L1;
              }
            }
            L2: {
              L3: {
                var3 = ((cd) this).field_j.a(param0, -1);
                if (((cd) this).field_j.field_m) {
                  var4 = ((cd) this).a(0, param0, (byte) 107);
                  var5 = 0;
                  L4: while (true) {
                    if (hh.field_d <= var5) {
                      break L3;
                    } else {
                      stackOut_9_0 = (int[]) var4;
                      stackIn_24_0 = stackOut_9_0;
                      stackIn_10_0 = stackOut_9_0;
                      if (var7 != 0) {
                        break L2;
                      } else {
                        L5: {
                          L6: {
                            var6 = stackIn_10_0[var5];
                            if (var6 >= ((cd) this).field_q) {
                              break L6;
                            } else {
                              var3[var5] = ((cd) this).field_q;
                              if (var7 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          L7: {
                            if (((cd) this).field_r < var6) {
                              break L7;
                            } else {
                              var3[var5] = var6;
                              if (var7 == 0) {
                                break L5;
                              } else {
                                break L7;
                              }
                            }
                          }
                          var3[var5] = ((cd) this).field_r;
                          break L5;
                        }
                        var5++;
                        if (var7 == 0) {
                          continue L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                } else {
                  break L3;
                }
              }
              stackOut_23_0 = (int[]) var3;
              stackIn_24_0 = stackOut_23_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var3_ref, "cd.J(" + param0 + ',' + param1 + ')');
        }
        return stackIn_24_0;
    }

    public static void d(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_o = null;
              field_p = null;
              field_n = null;
              field_m = null;
              field_k = null;
              if (param0 == 0) {
                break L1;
              } else {
                field_o = null;
                break L1;
              }
            }
            field_l = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var1, "cd.C(" + param0 + ')');
        }
    }

    final int[][] a(boolean param0, int param1) {
        RuntimeException var3 = null;
        int[][] var3_array = null;
        int[][] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[][] stackIn_47_0 = null;
        RuntimeException decompiledCaughtException = null;
        int[][] stackOut_46_0 = null;
        var15 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                cd.d(91);
                break L1;
              }
            }
            L2: {
              var3_array = ((cd) this).field_h.a(param1, -858);
              if (((cd) this).field_h.field_b) {
                var4 = ((cd) this).a((byte) -104, 0, param1);
                var5 = var4[0];
                var6 = var4[1];
                var7 = var4[2];
                var8 = var3_array[0];
                var9 = var3_array[1];
                var10 = var3_array[2];
                var11 = 0;
                L3: while (true) {
                  if (hh.field_d <= var11) {
                    break L2;
                  } else {
                    L4: {
                      L5: {
                        var12 = var5[var11];
                        var13 = var6[var11];
                        var14 = var7[var11];
                        if (~var12 <= ~((cd) this).field_q) {
                          break L5;
                        } else {
                          var8[var11] = ((cd) this).field_q;
                          if (var15 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L6: {
                        if (~var12 >= ~((cd) this).field_r) {
                          break L6;
                        } else {
                          var8[var11] = ((cd) this).field_r;
                          if (var15 == 0) {
                            break L4;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var8[var11] = var12;
                      break L4;
                    }
                    L7: {
                      L8: {
                        if (var13 < ((cd) this).field_q) {
                          break L8;
                        } else {
                          L9: {
                            if (((cd) this).field_r < var13) {
                              break L9;
                            } else {
                              var9[var11] = var13;
                              if (var15 == 0) {
                                break L7;
                              } else {
                                break L9;
                              }
                            }
                          }
                          var9[var11] = ((cd) this).field_r;
                          if (var15 == 0) {
                            break L7;
                          } else {
                            break L8;
                          }
                        }
                      }
                      var9[var11] = ((cd) this).field_q;
                      break L7;
                    }
                    L10: {
                      L11: {
                        if (var14 < ((cd) this).field_q) {
                          break L11;
                        } else {
                          L12: {
                            if (((cd) this).field_r >= var14) {
                              break L12;
                            } else {
                              var10[var11] = ((cd) this).field_r;
                              if (var15 == 0) {
                                break L10;
                              } else {
                                break L12;
                              }
                            }
                          }
                          var10[var11] = var14;
                          if (var15 == 0) {
                            break L10;
                          } else {
                            break L11;
                          }
                        }
                      }
                      var10[var11] = ((cd) this).field_q;
                      break L10;
                    }
                    var11++;
                    if (var15 == 0) {
                      continue L3;
                    } else {
                      break L2;
                    }
                  }
                }
              } else {
                break L2;
              }
            }
            stackOut_46_0 = (int[][]) var3_array;
            stackIn_47_0 = stackOut_46_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var3, "cd.B(" + param0 + ',' + param1 + ')');
        }
        return stackIn_47_0;
    }

    final void a(byte param0, lu param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        Object stackIn_18_0 = null;
        Object stackIn_20_0 = null;
        Object stackIn_22_0 = null;
        Object stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_17_0 = null;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        Object stackOut_18_0 = null;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  L4: {
                    var4_int = param2;
                    if (0 != var4_int) {
                      break L4;
                    } else {
                      if (var5 == 0) {
                        ((cd) this).field_q = param1.e((byte) 79);
                        if (var5 == 0) {
                          break L1;
                        } else {
                          break L3;
                        }
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (var4_int == 1) {
                    break L3;
                  } else {
                    if (2 == var4_int) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                ((cd) this).field_r = param1.e((byte) 93);
                if (var5 == 0) {
                  break L1;
                } else {
                  break L2;
                }
              }
              L5: {
                stackOut_17_0 = this;
                stackIn_22_0 = stackOut_17_0;
                stackIn_18_0 = stackOut_17_0;
                if (param1.b(16711935) != 1) {
                  stackOut_22_0 = this;
                  stackOut_22_1 = 0;
                  stackIn_23_0 = stackOut_22_0;
                  stackIn_23_1 = stackOut_22_1;
                  break L5;
                } else {
                  stackOut_18_0 = this;
                  stackIn_20_0 = stackOut_18_0;
                  stackOut_20_0 = this;
                  stackOut_20_1 = 1;
                  stackIn_23_0 = stackOut_20_0;
                  stackIn_23_1 = stackOut_20_1;
                  break L5;
                }
              }
              ((cd) this).field_f = stackIn_23_1 != 0;
              break L1;
            }
            L6: {
              if (param0 == -71) {
                break L6;
              } else {
                field_k = null;
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            runtimeException = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) runtimeException;
            stackOut_28_1 = new StringBuilder().append("cd.E(").append(param0).append(',');
            stackIn_31_0 = stackOut_28_0;
            stackIn_31_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param1 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L7;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_32_0 = stackOut_29_0;
              stackIn_32_1 = stackOut_29_1;
              stackIn_32_2 = stackOut_29_2;
              break L7;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + ',' + param2 + ')');
        }
    }

    public cd() {
        super(1, false);
        ((cd) this).field_r = 4096;
        ((cd) this).field_q = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Remove friend";
        field_k = "Cancel draw";
        field_o = new String[]{"Annihilation", "Take the Grub", "Capture the Fly"};
        field_m = "Invite only";
        field_l = "Chat view has been scrolled up. Scroll down to chat.";
    }
}
