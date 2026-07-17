/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dj {
    private Object[] field_j;
    static vo field_l;
    private int field_d;
    private w field_h;
    static String field_a;
    private boolean field_f;
    static vo field_m;
    static int[] field_g;
    private Object[][] field_c;
    static hi field_e;
    private jh field_b;
    static vn[] field_k;
    static int[] field_i;

    private final synchronized boolean a(int[] param0, int param1, int param2, byte param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        Object var9 = null;
        int var9_int = 0;
        byte[] var9_array = null;
        int var10_int = 0;
        byte[] var10 = null;
        de var10_ref = null;
        RuntimeException var11_ref_RuntimeException = null;
        int var11 = 0;
        int var12 = 0;
        de var13 = null;
        int[] var14 = null;
        int var14_int = 0;
        int var15_int = 0;
        byte[][] var15 = null;
        int var16 = 0;
        byte[] var16_ref_byte__ = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        Object var23 = null;
        byte[] var24 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int[] stackIn_14_0 = null;
        int stackIn_25_0 = 0;
        int[] stackIn_34_0 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        int stackIn_42_2 = 0;
        int stackIn_58_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_94_0 = 0;
        int stackIn_102_0 = 0;
        int stackIn_111_0 = 0;
        int stackIn_119_0 = 0;
        int stackIn_130_0 = 0;
        RuntimeException stackIn_132_0 = null;
        StringBuilder stackIn_132_1 = null;
        RuntimeException stackIn_133_0 = null;
        StringBuilder stackIn_133_1 = null;
        RuntimeException stackIn_134_0 = null;
        StringBuilder stackIn_134_1 = null;
        String stackIn_134_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int[] stackOut_13_0 = null;
        int stackOut_24_0 = 0;
        Object stackOut_33_0 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        int stackOut_41_2 = 0;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        int stackOut_40_2 = 0;
        int stackOut_70_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_101_0 = 0;
        int stackOut_93_0 = 0;
        int stackOut_118_0 = 0;
        int stackOut_110_0 = 0;
        int stackOut_129_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_131_0 = null;
        StringBuilder stackOut_131_1 = null;
        RuntimeException stackOut_133_0 = null;
        StringBuilder stackOut_133_1 = null;
        String stackOut_133_2 = null;
        RuntimeException stackOut_132_0 = null;
        StringBuilder stackOut_132_1 = null;
        String stackOut_132_2 = null;
        var22 = ZombieDawn.field_J;
        try {
          L0: {
            if (this.b(param2, (byte) -82)) {
              if (((dj) this).field_j[param2] == null) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              } else {
                L1: {
                  var5_int = ((dj) this).field_b.field_t[param2];
                  var6 = ((dj) this).field_b.field_p[param2];
                  if (((dj) this).field_c[param2] == null) {
                    ((dj) this).field_c[param2] = new Object[((dj) this).field_b.field_d[param2]];
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var7 = ((dj) this).field_c[param2];
                var8 = 1;
                var9_int = 0;
                L2: while (true) {
                  L3: {
                    L4: {
                      L5: {
                        if (var5_int <= var9_int) {
                          break L5;
                        } else {
                          stackOut_13_0 = (int[]) var6;
                          stackIn_34_0 = stackOut_13_0;
                          stackIn_14_0 = stackOut_13_0;
                          if (var22 != 0) {
                            break L4;
                          } else {
                            L6: {
                              L7: {
                                if (stackIn_14_0 == null) {
                                  break L7;
                                } else {
                                  var10_int = var6[var9_int];
                                  if (var22 == 0) {
                                    break L6;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                              var10_int = var9_int;
                              break L6;
                            }
                            L8: {
                              if (var7[var10_int] == null) {
                                var8 = 0;
                                if (var22 == 0) {
                                  break L5;
                                } else {
                                  break L8;
                                }
                              } else {
                                break L8;
                              }
                            }
                            var9_int++;
                            continue L2;
                          }
                        }
                      }
                      if (var8 != 0) {
                        stackOut_24_0 = 1;
                        stackIn_25_0 = stackOut_24_0;
                        return stackIn_25_0 != 0;
                      } else {
                        L9: {
                          if (param0 == null) {
                            break L9;
                          } else {
                            L10: {
                              if (param0[0] != 0) {
                                break L10;
                              } else {
                                if (param0[1] != 0) {
                                  break L10;
                                } else {
                                  if (0 != param0[2]) {
                                    break L10;
                                  } else {
                                    if (param0[3] == 0) {
                                      break L9;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                              }
                            }
                            var9_array = ag.a(((dj) this).field_j[param2], (byte) 125, true);
                            var10_ref = new de(var9_array);
                            var10_ref.a(153818020, var10_ref.field_h.length, param0, 5);
                            break L3;
                          }
                        }
                        stackOut_33_0 = ((dj) this).field_j[param2];
                        stackIn_34_0 = (int[]) (Object) stackOut_33_0;
                        break L4;
                      }
                    }
                    var9_array = ag.a((Object) (Object) stackIn_34_0, (byte) 88, false);
                    break L3;
                  }
                  L11: {
                    if (param3 <= -28) {
                      break L11;
                    } else {
                      var23 = null;
                      byte[] discarded$1 = ((dj) this).a((String) ((dj) this).field_j[2], -6, (String) null);
                      break L11;
                    }
                  }
                  try {
                    L12: {
                      var24 = va.a((byte) -112, var9_array);
                      var10 = var24;
                      break L12;
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L13: {
                      var11_ref_RuntimeException = decompiledCaughtException;
                      stackOut_39_0 = (RuntimeException) var11_ref_RuntimeException;
                      stackOut_39_1 = new StringBuilder();
                      stackIn_41_0 = stackOut_39_0;
                      stackIn_41_1 = stackOut_39_1;
                      stackIn_40_0 = stackOut_39_0;
                      stackIn_40_1 = stackOut_39_1;
                      if (param0 == null) {
                        stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
                        stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
                        stackOut_41_2 = 0;
                        stackIn_42_0 = stackOut_41_0;
                        stackIn_42_1 = stackOut_41_1;
                        stackIn_42_2 = stackOut_41_2;
                        break L13;
                      } else {
                        stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
                        stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
                        stackOut_40_2 = 1;
                        stackIn_42_0 = stackOut_40_0;
                        stackIn_42_1 = stackOut_40_1;
                        stackIn_42_2 = stackOut_40_2;
                        break L13;
                      }
                    }
                    throw sh.a((Throwable) (Object) stackIn_42_0, stackIn_42_2 + " " + param2 + " " + param0.length + " " + ii.a(8099, param0.length, var9_array) + " " + ii.a(8099, param0.length - 2, var9_array) + " " + ((dj) this).field_b.field_j[param2] + " " + ((dj) this).field_b.field_m);
                  }
                  L14: {
                    if (!((dj) this).field_f) {
                      break L14;
                    } else {
                      ((dj) this).field_j[param2] = null;
                      break L14;
                    }
                  }
                  L15: {
                    L16: {
                      L17: {
                        if (1 < var5_int) {
                          break L17;
                        } else {
                          L18: {
                            L19: {
                              if (var6 == null) {
                                break L19;
                              } else {
                                var11 = var6[0];
                                if (var22 == 0) {
                                  break L18;
                                } else {
                                  break L19;
                                }
                              }
                            }
                            var11 = 0;
                            break L18;
                          }
                          L20: {
                            L21: {
                              if (((dj) this).field_d == 0) {
                                break L21;
                              } else {
                                var7[var11] = (Object) (Object) var24;
                                if (var22 == 0) {
                                  break L20;
                                } else {
                                  break L21;
                                }
                              }
                            }
                            var7[var11] = el.a((byte) 94, false, var24);
                            break L20;
                          }
                          if (var22 == 0) {
                            break L16;
                          } else {
                            break L17;
                          }
                        }
                      }
                      L22: {
                        if (((dj) this).field_d != 2) {
                          break L22;
                        } else {
                          var11 = var24.length;
                          var11--;
                          var12 = 255 & var24[var11];
                          var11 = var11 - var12 * (var5_int * 4);
                          var13 = new de(var10);
                          var14_int = 0;
                          var13.field_j = var11;
                          var15_int = 0;
                          var16 = 0;
                          L23: while (true) {
                            L24: {
                              if (var12 <= var16) {
                                stackOut_70_0 = ~var14_int;
                                stackIn_71_0 = stackOut_70_0;
                                break L24;
                              } else {
                                var17 = 0;
                                stackOut_57_0 = 0;
                                stackIn_71_0 = stackOut_57_0;
                                stackIn_58_0 = stackOut_57_0;
                                if (var22 != 0) {
                                  break L24;
                                } else {
                                  var18 = stackIn_58_0;
                                  L25: while (true) {
                                    L26: {
                                      if (var5_int <= var18) {
                                        var16++;
                                        break L26;
                                      } else {
                                        var17 = var17 + var13.c(100);
                                        if (var22 != 0) {
                                          break L26;
                                        } else {
                                          L27: {
                                            L28: {
                                              if (var6 != null) {
                                                break L28;
                                              } else {
                                                var19 = var18;
                                                if (var22 == 0) {
                                                  break L27;
                                                } else {
                                                  break L28;
                                                }
                                              }
                                            }
                                            var19 = var6[var18];
                                            break L27;
                                          }
                                          L29: {
                                            if (var19 == param1) {
                                              var14_int = var14_int + var17;
                                              var15_int = var19;
                                              break L29;
                                            } else {
                                              break L29;
                                            }
                                          }
                                          var18++;
                                          continue L25;
                                        }
                                      }
                                    }
                                    continue L23;
                                  }
                                }
                              }
                            }
                            if (stackIn_71_0 == -1) {
                              stackOut_73_0 = 1;
                              stackIn_74_0 = stackOut_73_0;
                              return stackIn_74_0 != 0;
                            } else {
                              var16_ref_byte__ = new byte[var14_int];
                              var14_int = 0;
                              var13.field_j = var11;
                              var17 = 0;
                              var18 = 0;
                              L30: while (true) {
                                if (var12 <= var18) {
                                  var7[var15_int] = (Object) (Object) var16_ref_byte__;
                                  if (var22 == 0) {
                                    break L16;
                                  } else {
                                    break L22;
                                  }
                                } else {
                                  var19 = 0;
                                  stackOut_77_0 = 0;
                                  stackIn_130_0 = stackOut_77_0;
                                  stackIn_78_0 = stackOut_77_0;
                                  if (var22 != 0) {
                                    break L15;
                                  } else {
                                    var20 = stackIn_78_0;
                                    L31: while (true) {
                                      L32: {
                                        if (var20 >= var5_int) {
                                          var18++;
                                          break L32;
                                        } else {
                                          var19 = var19 + var13.c(-44);
                                          if (var22 != 0) {
                                            break L32;
                                          } else {
                                            L33: {
                                              L34: {
                                                if (var6 == null) {
                                                  break L34;
                                                } else {
                                                  var21 = var6[var20];
                                                  if (var22 == 0) {
                                                    break L33;
                                                  } else {
                                                    break L34;
                                                  }
                                                }
                                              }
                                              var21 = var20;
                                              break L33;
                                            }
                                            L35: {
                                              if (var21 == param1) {
                                                gp.a(var10, var17, var16_ref_byte__, var14_int, var19);
                                                var14_int = var14_int + var19;
                                                break L35;
                                              } else {
                                                break L35;
                                              }
                                            }
                                            var17 = var17 + var19;
                                            var20++;
                                            continue L31;
                                          }
                                        }
                                      }
                                      continue L30;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      var11 = var24.length;
                      var11--;
                      var12 = 255 & var24[var11];
                      var11 = var11 - 4 * (var12 * var5_int);
                      var13 = new de(var10);
                      var14 = new int[var5_int];
                      var13.field_j = var11;
                      var15_int = 0;
                      L36: while (true) {
                        L37: {
                          if (var15_int >= var12) {
                            stackOut_101_0 = var5_int;
                            stackIn_102_0 = stackOut_101_0;
                            break L37;
                          } else {
                            var16 = 0;
                            stackOut_93_0 = 0;
                            stackIn_102_0 = stackOut_93_0;
                            stackIn_94_0 = stackOut_93_0;
                            if (var22 != 0) {
                              break L37;
                            } else {
                              var17 = stackIn_94_0;
                              L38: while (true) {
                                L39: {
                                  if (var17 >= var5_int) {
                                    var15_int++;
                                    break L39;
                                  } else {
                                    var16 = var16 + var13.c(124);
                                    var14[var17] = var14[var17] + var16;
                                    var17++;
                                    if (var22 != 0) {
                                      break L39;
                                    } else {
                                      continue L38;
                                    }
                                  }
                                }
                                continue L36;
                              }
                            }
                          }
                        }
                        var15 = new byte[stackIn_102_0][];
                        var16 = 0;
                        L40: while (true) {
                          L41: {
                            if (var16 >= var5_int) {
                              var13.field_j = var11;
                              var16 = 0;
                              break L41;
                            } else {
                              var15[var16] = new byte[var14[var16]];
                              var14[var16] = 0;
                              var16++;
                              if (var22 != 0) {
                                break L41;
                              } else {
                                continue L40;
                              }
                            }
                          }
                          var17 = 0;
                          L42: while (true) {
                            L43: {
                              if (var12 <= var17) {
                                stackOut_118_0 = 0;
                                stackIn_119_0 = stackOut_118_0;
                                break L43;
                              } else {
                                var18 = 0;
                                stackOut_110_0 = 0;
                                stackIn_119_0 = stackOut_110_0;
                                stackIn_111_0 = stackOut_110_0;
                                if (var22 != 0) {
                                  break L43;
                                } else {
                                  var19 = stackIn_111_0;
                                  L44: while (true) {
                                    L45: {
                                      if (var5_int <= var19) {
                                        var17++;
                                        break L45;
                                      } else {
                                        var18 = var18 + var13.c(-48);
                                        gp.a(var24, var16, var15[var19], var14[var19], var18);
                                        var14[var19] = var14[var19] + var18;
                                        var16 = var16 + var18;
                                        var19++;
                                        if (var22 != 0) {
                                          break L45;
                                        } else {
                                          continue L44;
                                        }
                                      }
                                    }
                                    continue L42;
                                  }
                                }
                              }
                            }
                            var17 = stackIn_119_0;
                            L46: while (true) {
                              if (var5_int <= var17) {
                                break L16;
                              } else {
                                L47: {
                                  L48: {
                                    if (var6 == null) {
                                      break L48;
                                    } else {
                                      var18 = var6[var17];
                                      if (var22 == 0) {
                                        break L47;
                                      } else {
                                        break L48;
                                      }
                                    }
                                  }
                                  var18 = var17;
                                  break L47;
                                }
                                L49: {
                                  L50: {
                                    if (((dj) this).field_d != 0) {
                                      break L50;
                                    } else {
                                      var7[var18] = el.a((byte) 94, false, var15[var17]);
                                      if (var22 == 0) {
                                        break L49;
                                      } else {
                                        break L50;
                                      }
                                    }
                                  }
                                  var7[var18] = (Object) (Object) var15[var17];
                                  break L49;
                                }
                                var17++;
                                continue L46;
                              }
                            }
                          }
                        }
                      }
                    }
                    stackOut_129_0 = 1;
                    stackIn_130_0 = stackOut_129_0;
                    break L15;
                  }
                  break L0;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L51: {
            var5 = decompiledCaughtException;
            stackOut_131_0 = (RuntimeException) var5;
            stackOut_131_1 = new StringBuilder().append("dj.A(");
            stackIn_133_0 = stackOut_131_0;
            stackIn_133_1 = stackOut_131_1;
            stackIn_132_0 = stackOut_131_0;
            stackIn_132_1 = stackOut_131_1;
            if (param0 == null) {
              stackOut_133_0 = (RuntimeException) (Object) stackIn_133_0;
              stackOut_133_1 = (StringBuilder) (Object) stackIn_133_1;
              stackOut_133_2 = "null";
              stackIn_134_0 = stackOut_133_0;
              stackIn_134_1 = stackOut_133_1;
              stackIn_134_2 = stackOut_133_2;
              break L51;
            } else {
              stackOut_132_0 = (RuntimeException) (Object) stackIn_132_0;
              stackOut_132_1 = (StringBuilder) (Object) stackIn_132_1;
              stackOut_132_2 = "{...}";
              stackIn_134_0 = stackOut_132_0;
              stackIn_134_1 = stackOut_132_1;
              stackIn_134_2 = stackOut_132_2;
              break L51;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_134_0, stackIn_134_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_130_0 != 0;
    }

    final boolean a(String param0, byte param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_8_0 = false;
        int stackOut_6_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (((dj) this).a((byte) 73)) {
              L1: {
                param0 = param0.toLowerCase();
                if (param1 < -9) {
                  break L1;
                } else {
                  boolean discarded$2 = ((dj) this).a(76, (byte) -89, 2);
                  break L1;
                }
              }
              param2 = param2.toLowerCase();
              var6 = (CharSequence) (Object) param0;
              var4_int = ((dj) this).field_b.field_g.a(1, tc.a(var6, 14));
              if (this.b(var4_int, (byte) -82)) {
                var7 = (CharSequence) (Object) param2;
                var5 = ((dj) this).field_b.field_a[var4_int].a(1, tc.a(var7, 14));
                stackOut_8_0 = ((dj) this).a(var5, (byte) -128, var4_int);
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("dj.B(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          L3: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44).append(param1).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
        return stackIn_9_0;
    }

    final int d(int param0) {
        if (!((dj) this).a((byte) 73)) {
            return -1;
        }
        if (param0 != -1) {
            field_l = null;
        }
        return ((dj) this).field_b.field_d.length;
    }

    private final synchronized byte[] a(int[] param0, int param1, int param2, int param3) {
        Object var5 = null;
        byte[] var7 = null;
        Object stackIn_4_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_28_0 = null;
        Object stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        Object stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        Object stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_10_0 = null;
        Object stackOut_27_0 = null;
        Object stackOut_3_0 = null;
        Object stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        Object stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        Object stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        try {
          L0: {
            L1: {
              if (param3 >= 124) {
                break L1;
              } else {
                ((dj) this).field_b = (jh) ((Object[]) ((dj) this).field_j[16])[1];
                break L1;
              }
            }
            if (this.a(param1, param2, 105)) {
              L2: {
                L3: {
                  var5 = null;
                  if (((dj) this).field_c[param2] == null) {
                    break L3;
                  } else {
                    if (((dj) this).field_c[param2][param1] != null) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (this.a(param0, param1, param2, (byte) -57)) {
                  break L2;
                } else {
                  this.c(4, param2);
                  if (this.a(param0, param1, param2, (byte) -85)) {
                    break L2;
                  } else {
                    stackOut_10_0 = null;
                    stackIn_11_0 = stackOut_10_0;
                    return (byte[]) (Object) stackIn_11_0;
                  }
                }
              }
              if (((dj) this).field_c[param2] == null) {
                throw new RuntimeException("");
              } else {
                L4: {
                  if (null == ((dj) this).field_c[param2][param1]) {
                    break L4;
                  } else {
                    var7 = ag.a(((dj) this).field_c[param2][param1], (byte) 98, false);
                    var5 = (Object) (Object) var7;
                    if (var7 == null) {
                      throw new RuntimeException("");
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (var5 != null) {
                    L6: {
                      if (1 != ((dj) this).field_d) {
                        break L6;
                      } else {
                        ((dj) this).field_c[param2][param1] = null;
                        if (((dj) this).field_b.field_d[param2] != 1) {
                          break L5;
                        } else {
                          ((dj) this).field_c[param2] = null;
                          if (ZombieDawn.field_J == 0) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    if (((dj) this).field_d != 2) {
                      break L5;
                    } else {
                      ((dj) this).field_c[param2] = null;
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                stackOut_27_0 = var5;
                stackIn_28_0 = stackOut_27_0;
                break L0;
              }
            } else {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (byte[]) (Object) stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = (Object) (Object) decompiledCaughtException;
            stackOut_29_0 = var5;
            stackOut_29_1 = new StringBuilder().append("dj.D(");
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_31_0 = stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L7;
            } else {
              stackOut_30_0 = stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L7;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return (byte[]) (Object) stackIn_28_0;
    }

    final synchronized boolean a(byte param0) {
        L0: {
          if (param0 == 73) {
            break L0;
          } else {
            ((dj) this).field_b = (jh) ((dj) this).field_j[19];
            break L0;
          }
        }
        if (((dj) this).field_b == null) {
          ((dj) this).field_b = ((dj) this).field_h.b((byte) 106);
          if (null == ((dj) this).field_b) {
            return false;
          } else {
            ((dj) this).field_j = new Object[((dj) this).field_b.field_s];
            ((dj) this).field_c = new Object[((dj) this).field_b.field_s][];
            return true;
          }
        } else {
          return true;
        }
    }

    final static void a(int param0) {
        Object var2 = null;
        jm.a((String) null, "", -901373652);
        int var1 = -106 % ((67 - param0) / 40);
    }

    final synchronized int e(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        var5 = ZombieDawn.field_J;
        if (((dj) this).a((byte) 73)) {
          L0: {
            var2 = 0;
            if (param0 < -79) {
              break L0;
            } else {
              int discarded$2 = ((dj) this).a((byte) -52, 65);
              break L0;
            }
          }
          var3 = 0;
          var4 = 0;
          L1: while (true) {
            L2: {
              L3: {
                if (((dj) this).field_j.length <= var4) {
                  break L3;
                } else {
                  stackOut_6_0 = 0;
                  stackOut_6_1 = ((dj) this).field_b.field_t[var4];
                  stackIn_11_0 = stackOut_6_0;
                  stackIn_11_1 = stackOut_6_1;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  if (var5 != 0) {
                    break L2;
                  } else {
                    L4: {
                      if (stackIn_7_0 >= stackIn_7_1) {
                        break L4;
                      } else {
                        var3 = var3 + ((dj) this).a(var4, -5366);
                        var2 += 100;
                        break L4;
                      }
                    }
                    var4++;
                    if (var5 == 0) {
                      continue L1;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              stackOut_10_0 = -1;
              stackOut_10_1 = ~var2;
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              break L2;
            }
            if (stackIn_11_0 == stackIn_11_1) {
              return 100;
            } else {
              var4 = var3 * 100 / var2;
              return var4;
            }
          }
        } else {
          return 0;
        }
    }

    final int a(int param0, String param1, boolean param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        CharSequence var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (!this.b(param0, (byte) -82)) {
              stackOut_2_0 = -1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              param1 = param1.toLowerCase();
              if (param2) {
                var5 = (CharSequence) (Object) param1;
                var4_int = ((dj) this).field_b.field_a[param0].a(1, tc.a(var5, 14));
                if (!this.a(var4_int, param0, 126)) {
                  stackOut_9_0 = -1;
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  return var4_int;
                }
              } else {
                stackOut_5_0 = 8;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("dj.Q(").append(param0).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param2 + 41);
        }
        return stackIn_10_0;
    }

    final int b(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (!((dj) this).a((byte) 73)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                if (param1 > 83) {
                  break L1;
                } else {
                  ((dj) this).field_d = -4;
                  break L1;
                }
              }
              param0 = param0.toLowerCase();
              var4 = (CharSequence) (Object) param0;
              var3_int = ((dj) this).field_b.field_g.a(1, tc.a(var4, 14));
              stackOut_6_0 = ((dj) this).a(var3_int, -5366);
              stackIn_7_0 = stackOut_6_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("dj.V(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 41);
        }
        return stackIn_7_0;
    }

    final synchronized boolean a(int param0, byte param1, int param2) {
        int var4 = 0;
        if (this.a(param0, param2, 113)) {
          L0: {
            var4 = -105 / ((-38 - param1) / 58);
            if (((dj) this).field_c[param2] == null) {
              break L0;
            } else {
              if (null == ((dj) this).field_c[param2][param0]) {
                break L0;
              } else {
                return true;
              }
            }
          }
          if (null != ((dj) this).field_j[param2]) {
            return true;
          } else {
            this.c(4, param2);
            if (((dj) this).field_j[param2] == null) {
              return false;
            } else {
              return true;
            }
          }
        } else {
          return false;
        }
    }

    final synchronized byte[] a(String param0, int param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_2_0 = null;
        Object stackIn_7_0 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_8_0 = null;
        Object stackOut_6_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (((dj) this).a((byte) 73)) {
              L1: {
                if (param1 < -82) {
                  break L1;
                } else {
                  boolean discarded$2 = ((dj) this).a((String) null, (byte) 28, (String) ((dj) this).field_j[1]);
                  break L1;
                }
              }
              param2 = param2.toLowerCase();
              param0 = param0.toLowerCase();
              var6 = (CharSequence) (Object) param2;
              var4_int = ((dj) this).field_b.field_g.a(1, tc.a(var6, 14));
              if (this.b(var4_int, (byte) -82)) {
                var7 = (CharSequence) (Object) param0;
                var5 = ((dj) this).field_b.field_a[var4_int].a(1, tc.a(var7, 14));
                stackOut_8_0 = ((dj) this).a((byte) 51, var4_int, var5);
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (byte[]) (Object) stackIn_7_0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (byte[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("dj.AA(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          L3: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44).append(param1).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
        return stackIn_9_0;
    }

    final boolean a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_6_0 = false;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (!((dj) this).a((byte) 73)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              L1: {
                param1 = param1.toLowerCase();
                if (param0 == -1) {
                  break L1;
                } else {
                  int discarded$2 = ((dj) this).a(((int[]) ((dj) this).field_j[7])[0], -46);
                  break L1;
                }
              }
              var4 = (CharSequence) (Object) param1;
              var3_int = ((dj) this).field_b.field_g.a(1, tc.a(var4, param0 + 15));
              stackOut_6_0 = ((dj) this).b(-29092, var3_int);
              stackIn_7_0 = stackOut_6_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("dj.U(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_7_0;
    }

    private final synchronized void c(int param0, int param1) {
        if (param0 != 4) {
          return;
        } else {
          L0: {
            L1: {
              if (!((dj) this).field_f) {
                break L1;
              } else {
                ((dj) this).field_j[param1] = (Object) (Object) ((dj) this).field_h.a(param1, (byte) 112);
                if (ZombieDawn.field_J == 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            ((dj) this).field_j[param1] = el.a((byte) 94, false, ((dj) this).field_h.a(param1, (byte) 112));
            break L0;
          }
          return;
        }
    }

    private final synchronized boolean b(int param0, byte param1) {
        if (((dj) this).a((byte) 73)) {
          L0: {
            if (param0 < 0) {
              break L0;
            } else {
              if (~param0 <= ~((dj) this).field_b.field_d.length) {
                break L0;
              } else {
                if (((dj) this).field_b.field_d[param0] != 0) {
                  return true;
                } else {
                  break L0;
                }
              }
            }
          }
          if (!sg.field_ib) {
            return false;
          } else {
            throw new IllegalArgumentException(Integer.toString(param0));
          }
        } else {
          return false;
        }
    }

    final byte[] a(byte param0, int param1, int param2) {
        if (param0 != 51) {
            ((dj) this).field_d = -23;
        }
        return this.a((int[]) null, param2, param1, param0 ^ 77);
    }

    public static void b(int param0) {
        field_k = null;
        field_i = null;
        field_a = null;
        field_m = null;
        field_l = null;
        if (param0 <= 67) {
            field_e = null;
        }
        field_e = null;
        field_g = null;
    }

    final int a(byte param0, int param1) {
        if (param0 < 53) {
            return 18;
        }
        if (!(this.b(param1, (byte) -82))) {
            return 0;
        }
        return ((dj) this).field_b.field_d[param1];
    }

    final synchronized int a(int param0, int param1) {
        if (!this.b(param0, (byte) -82)) {
            return 0;
        }
        if (!(((dj) this).field_j[param0] == null)) {
            return 100;
        }
        if (param1 != -5366) {
            byte[] discarded$0 = ((dj) this).a((String) null, -127, (String) ((dj) this).field_j[4]);
        }
        return ((dj) this).field_h.a(-90, param0);
    }

    final boolean a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            if (!((dj) this).a((byte) 73)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              param0 = param0.toLowerCase();
              var4 = (CharSequence) (Object) param0;
              var3_int = ((dj) this).field_b.field_g.a(1, tc.a(var4, 14));
              if (param1 <= var3_int) {
                stackOut_7_0 = 1;
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("dj.O(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L1;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L1;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 41);
        }
        return stackIn_8_0 != 0;
    }

    private final synchronized boolean a(int param0, int param1, int param2) {
        int var4 = 0;
        if (!((dj) this).a((byte) 73)) {
          return false;
        } else {
          L0: {
            if (0 > param1) {
              break L0;
            } else {
              if (param0 < 0) {
                break L0;
              } else {
                if (param1 >= ((dj) this).field_b.field_d.length) {
                  break L0;
                } else {
                  if (param0 >= ((dj) this).field_b.field_d[param1]) {
                    break L0;
                  } else {
                    var4 = -60 % ((63 - param2) / 41);
                    return true;
                  }
                }
              }
            }
          }
          if (sg.field_ib) {
            throw new IllegalArgumentException(param1 + " " + param0);
          } else {
            return false;
          }
        }
    }

    final synchronized byte[] a(int param0, byte param1) {
        if (!((dj) this).a((byte) 73)) {
            return null;
        }
        if (1 == ((dj) this).field_b.field_d.length) {
            return ((dj) this).a((byte) 51, 0, param0);
        }
        int var3 = 84 % ((-21 - param1) / 37);
        if (!this.b(param0, (byte) -82)) {
            return null;
        }
        if (!(((dj) this).field_b.field_d[param0] != 1)) {
            return ((dj) this).a((byte) 51, param0, 0);
        }
        throw new RuntimeException();
    }

    final int a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (!((dj) this).a((byte) 73)) {
              stackOut_2_0 = -1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                param0 = param0.toLowerCase();
                if (param1 == 8) {
                  break L1;
                } else {
                  field_a = null;
                  break L1;
                }
              }
              var4 = (CharSequence) (Object) param0;
              var3_int = ((dj) this).field_b.field_g.a(param1 ^ 9, tc.a(var4, 14));
              if (this.b(var3_int, (byte) -82)) {
                stackOut_9_0 = var3_int;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                stackOut_7_0 = -1;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("dj.L(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 41);
        }
        return stackIn_10_0;
    }

    final synchronized boolean b(int param0, int param1) {
        if (!this.b(param1, (byte) -82)) {
          return false;
        } else {
          if (param0 == -29092) {
            if (null == ((dj) this).field_j[param1]) {
              this.c(4, param1);
              if (((dj) this).field_j[param1] == null) {
                return false;
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final synchronized boolean c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_11_0 = null;
        Object stackOut_3_0 = null;
        Object stackOut_10_0 = null;
        var5 = ZombieDawn.field_J;
        if (!((dj) this).a((byte) 73)) {
          return false;
        } else {
          var2 = 1;
          var3 = 0;
          L0: while (true) {
            L1: {
              L2: {
                L3: {
                  if (((dj) this).field_b.field_n.length <= var3) {
                    break L3;
                  } else {
                    var4 = ((dj) this).field_b.field_n[var3];
                    stackOut_3_0 = this;
                    stackIn_11_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var5 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (((dj) this).field_j[var4] != null) {
                          break L4;
                        } else {
                          this.c(param0 + -8997, var4);
                          if (null == ((dj) this).field_j[var4]) {
                            var2 = 0;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var3++;
                      if (var5 == 0) {
                        continue L0;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param0 == 9001) {
                  break L1;
                } else {
                  stackOut_10_0 = this;
                  stackIn_11_0 = stackOut_10_0;
                  break L2;
                }
              }
              boolean discarded$2 = ((dj) this).a(70, ((byte[]) ((dj) this).field_j[19])[2], 26);
              break L1;
            }
            return var2 != 0;
          }
        }
    }

    dj(w param0, boolean param1, int param2) {
        RuntimeException runtimeException = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        ((dj) this).field_b = null;
        try {
          L0: {
            L1: {
              if (param2 < 0) {
                break L1;
              } else {
                if (param2 <= 2) {
                  L2: {
                    stackOut_4_0 = this;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (!param1) {
                      stackOut_6_0 = this;
                      stackOut_6_1 = 0;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      break L2;
                    } else {
                      stackOut_5_0 = this;
                      stackOut_5_1 = 1;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_7_1 = stackOut_5_1;
                      break L2;
                    }
                  }
                  ((dj) this).field_f = stackIn_7_1 != 0;
                  ((dj) this).field_d = param2;
                  ((dj) this).field_h = param0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            throw new IllegalArgumentException("");
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) runtimeException;
            stackOut_9_1 = new StringBuilder().append("dj.<init>(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Passwords can only contain letters and numbers";
        field_l = new vo();
        field_i = ae.a(14821);
    }
}
