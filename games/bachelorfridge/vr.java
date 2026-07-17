/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vr {
    int field_e;
    static int field_b;
    boolean field_g;
    private rf field_f;
    private tja field_a;
    private Object[][] field_d;
    private Object[] field_c;
    static String field_h;

    final int a(String param0, boolean param1) {
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
            if (!((vr) this).a(0)) {
              stackOut_2_0 = -1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                param0 = param0.toLowerCase();
                var4 = (CharSequence) (Object) param0;
                var3_int = ((vr) this).field_f.field_m.a((byte) -79, efa.a(var4, true));
                if (!param1) {
                  break L1;
                } else {
                  byte[] discarded$2 = ((vr) this).b(87, 101);
                  break L1;
                }
              }
              if (this.a(var3_int, (byte) 70)) {
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
            stackOut_11_1 = new StringBuilder().append("vr.U(");
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
          throw pe.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 41);
        }
        return stackIn_10_0;
    }

    final boolean a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_5_0 = 0;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
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
            L1: {
              if (param1 == 20637) {
                break L1;
              } else {
                boolean discarded$2 = ((vr) this).a(15);
                break L1;
              }
            }
            if (!((vr) this).a(param1 + -20637)) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              param0 = param0.toLowerCase();
              var4 = (CharSequence) (Object) param0;
              var3_int = ((vr) this).field_f.field_m.a((byte) -75, efa.a(var4, true));
              stackOut_6_0 = ((vr) this).c(var3_int, -734);
              stackIn_7_0 = stackOut_6_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("vr.AA(");
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
          throw pe.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 41);
        }
        return stackIn_7_0;
    }

    final synchronized boolean a(int param0) {
        if (param0 != 0) {
            int discarded$0 = ((vr) this).a((byte) -17);
        }
        if (((vr) this).field_f != null) {
            return true;
        }
        ((vr) this).field_f = ((vr) this).field_a.b(-16);
        if (!(((vr) this).field_f != null)) {
            return false;
        }
        ((vr) this).field_c = new Object[((vr) this).field_f.field_f];
        ((vr) this).field_d = new Object[((vr) this).field_f.field_f][];
        return true;
    }

    private final synchronized boolean a(int[] param0, byte param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        Object var9 = null;
        int var9_int = 0;
        byte[] var9_array = null;
        lu var10 = null;
        int var10_int = 0;
        byte[] var10_array = null;
        RuntimeException var11_ref_RuntimeException = null;
        int var11 = 0;
        int var12 = 0;
        lu var13 = null;
        int var14 = 0;
        int[] var14_ref_int__ = null;
        int var15 = 0;
        byte[][] var15_ref_byte____ = null;
        int var16_int = 0;
        byte[] var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        byte[] var23 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int[] stackIn_16_0 = null;
        int stackIn_27_0 = 0;
        int[] stackIn_31_0 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        int stackIn_42_2 = 0;
        int stackIn_58_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_98_0 = 0;
        int stackIn_111_0 = 0;
        int stackIn_113_0 = 0;
        int stackIn_117_0 = 0;
        int stackIn_131_0 = 0;
        RuntimeException stackIn_133_0 = null;
        StringBuilder stackIn_133_1 = null;
        RuntimeException stackIn_134_0 = null;
        StringBuilder stackIn_134_1 = null;
        RuntimeException stackIn_135_0 = null;
        StringBuilder stackIn_135_1 = null;
        String stackIn_135_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int[] stackOut_15_0 = null;
        int stackOut_26_0 = 0;
        int[] stackOut_30_0 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        int stackOut_41_2 = 0;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        int stackOut_40_2 = 0;
        int stackOut_65_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_110_0 = 0;
        int stackOut_97_0 = 0;
        int stackOut_116_0 = 0;
        int stackOut_112_0 = 0;
        int stackOut_130_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_132_0 = null;
        StringBuilder stackOut_132_1 = null;
        RuntimeException stackOut_134_0 = null;
        StringBuilder stackOut_134_1 = null;
        String stackOut_134_2 = null;
        RuntimeException stackOut_133_0 = null;
        StringBuilder stackOut_133_1 = null;
        String stackOut_133_2 = null;
        var22 = BachelorFridge.field_y;
        try {
          L0: {
            if (this.a(param3, (byte) 70)) {
              if (((vr) this).field_c[param3] == null) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              } else {
                L1: {
                  var5_int = ((vr) this).field_f.field_e[param3];
                  var6 = ((vr) this).field_f.field_c[param3];
                  if (((vr) this).field_d[param3] == null) {
                    ((vr) this).field_d[param3] = new Object[((vr) this).field_f.field_j[param3]];
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  var7 = ((vr) this).field_d[param3];
                  var8 = 1;
                  if (param1 <= -83) {
                    break L2;
                  } else {
                    ((vr) this).field_c = null;
                    break L2;
                  }
                }
                var9_int = 0;
                L3: while (true) {
                  L4: {
                    L5: {
                      L6: {
                        L7: {
                          L8: {
                            if (var9_int >= var5_int) {
                              break L8;
                            } else {
                              stackOut_15_0 = (int[]) var6;
                              stackIn_31_0 = stackOut_15_0;
                              stackIn_16_0 = stackOut_15_0;
                              if (var22 != 0) {
                                break L7;
                              } else {
                                L9: {
                                  L10: {
                                    if (stackIn_16_0 == null) {
                                      break L10;
                                    } else {
                                      var10_int = var6[var9_int];
                                      if (var22 == 0) {
                                        break L9;
                                      } else {
                                        break L10;
                                      }
                                    }
                                  }
                                  var10_int = var9_int;
                                  break L9;
                                }
                                L11: {
                                  if (var7[var10_int] == null) {
                                    var8 = 0;
                                    if (var22 == 0) {
                                      break L8;
                                    } else {
                                      break L11;
                                    }
                                  } else {
                                    break L11;
                                  }
                                }
                                var9_int++;
                                continue L3;
                              }
                            }
                          }
                          if (var8 != 0) {
                            stackOut_26_0 = 1;
                            stackIn_27_0 = stackOut_26_0;
                            return stackIn_27_0 != 0;
                          } else {
                            if (param0 == null) {
                              break L5;
                            } else {
                              if (param0[0] != 0) {
                                break L6;
                              } else {
                                stackOut_30_0 = (int[]) param0;
                                stackIn_31_0 = stackOut_30_0;
                                break L7;
                              }
                            }
                          }
                        }
                        if (stackIn_31_0[1] != 0) {
                          break L6;
                        } else {
                          if (0 != param0[2]) {
                            break L6;
                          } else {
                            if (param0[3] == 0) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                      var9_array = tb.a(true, (byte) 105, ((vr) this).field_c[param3]);
                      var10 = new lu(var9_array);
                      var10.a(17654, 5, param0, var10.field_h.length);
                      break L4;
                    }
                    var9_array = tb.a(false, (byte) 81, ((vr) this).field_c[param3]);
                    break L4;
                  }
                  try {
                    L12: {
                      var23 = td.a(-124, var9_array);
                      var10_array = var23;
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
                    throw pe.a((Throwable) (Object) stackIn_42_0, stackIn_42_2 + " " + param3 + " " + param0.length + " " + wc.a(var9_array, -31303, param0.length) + " " + wc.a(var9_array, -31303, param0.length - 2) + " " + ((vr) this).field_f.field_p[param3] + " " + ((vr) this).field_f.field_b);
                  }
                  L14: {
                    if (!((vr) this).field_g) {
                      break L14;
                    } else {
                      ((vr) this).field_c[param3] = null;
                      break L14;
                    }
                  }
                  L15: {
                    L16: {
                      L17: {
                        if (var5_int > 1) {
                          break L17;
                        } else {
                          L18: {
                            L19: {
                              if (var6 != null) {
                                break L19;
                              } else {
                                var11 = 0;
                                if (var22 == 0) {
                                  break L18;
                                } else {
                                  break L19;
                                }
                              }
                            }
                            var11 = var6[0];
                            break L18;
                          }
                          L20: {
                            L21: {
                              if (((vr) this).field_e == 0) {
                                break L21;
                              } else {
                                var7[var11] = (Object) (Object) var23;
                                if (var22 == 0) {
                                  break L20;
                                } else {
                                  break L21;
                                }
                              }
                            }
                            var7[var11] = ug.a(false, var23, -19524);
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
                        if (((vr) this).field_e == 2) {
                          break L22;
                        } else {
                          var11 = var23.length;
                          var11--;
                          var12 = var23[var11] & 255;
                          var11 = var11 - 4 * (var5_int * var12);
                          var13 = new lu(var10_array);
                          var13.field_g = var11;
                          var14_ref_int__ = new int[var5_int];
                          var15 = 0;
                          L23: while (true) {
                            L24: {
                              if (var15 >= var12) {
                                stackOut_65_0 = var5_int;
                                stackIn_66_0 = stackOut_65_0;
                                break L24;
                              } else {
                                var16_int = 0;
                                stackOut_57_0 = 0;
                                stackIn_66_0 = stackOut_57_0;
                                stackIn_58_0 = stackOut_57_0;
                                if (var22 != 0) {
                                  break L24;
                                } else {
                                  var17 = stackIn_58_0;
                                  L25: while (true) {
                                    L26: {
                                      if (var17 >= var5_int) {
                                        var15++;
                                        break L26;
                                      } else {
                                        var16_int = var16_int + var13.f(-128);
                                        var14_ref_int__[var17] = var14_ref_int__[var17] + var16_int;
                                        var17++;
                                        if (var22 != 0) {
                                          break L26;
                                        } else {
                                          continue L25;
                                        }
                                      }
                                    }
                                    continue L23;
                                  }
                                }
                              }
                            }
                            var15_ref_byte____ = new byte[stackIn_66_0][];
                            var16_int = 0;
                            L27: while (true) {
                              L28: {
                                if (var5_int <= var16_int) {
                                  var13.field_g = var11;
                                  var16_int = 0;
                                  break L28;
                                } else {
                                  var15_ref_byte____[var16_int] = new byte[var14_ref_int__[var16_int]];
                                  var14_ref_int__[var16_int] = 0;
                                  var16_int++;
                                  if (var22 != 0) {
                                    break L28;
                                  } else {
                                    continue L27;
                                  }
                                }
                              }
                              var17 = 0;
                              L29: while (true) {
                                L30: {
                                  if (var17 >= var12) {
                                    stackOut_82_0 = 0;
                                    stackIn_83_0 = stackOut_82_0;
                                    break L30;
                                  } else {
                                    var18 = 0;
                                    stackOut_74_0 = 0;
                                    stackIn_83_0 = stackOut_74_0;
                                    stackIn_75_0 = stackOut_74_0;
                                    if (var22 != 0) {
                                      break L30;
                                    } else {
                                      var19 = stackIn_75_0;
                                      L31: while (true) {
                                        L32: {
                                          if (var19 >= var5_int) {
                                            var17++;
                                            break L32;
                                          } else {
                                            var18 = var18 + var13.f(72);
                                            bl.a(var23, var16_int, var15_ref_byte____[var19], var14_ref_int__[var19], var18);
                                            var16_int = var16_int + var18;
                                            var14_ref_int__[var19] = var14_ref_int__[var19] + var18;
                                            var19++;
                                            if (var22 != 0) {
                                              break L32;
                                            } else {
                                              continue L31;
                                            }
                                          }
                                        }
                                        continue L29;
                                      }
                                    }
                                  }
                                }
                                var17 = stackIn_83_0;
                                L33: while (true) {
                                  if (var17 >= var5_int) {
                                    if (var22 == 0) {
                                      break L16;
                                    } else {
                                      break L22;
                                    }
                                  } else {
                                    if (var22 != 0) {
                                      break L16;
                                    } else {
                                      L34: {
                                        L35: {
                                          if (var6 == null) {
                                            break L35;
                                          } else {
                                            var18 = var6[var17];
                                            if (var22 == 0) {
                                              break L34;
                                            } else {
                                              break L35;
                                            }
                                          }
                                        }
                                        var18 = var17;
                                        break L34;
                                      }
                                      L36: {
                                        L37: {
                                          if (((vr) this).field_e == 0) {
                                            break L37;
                                          } else {
                                            var7[var18] = (Object) (Object) var15_ref_byte____[var17];
                                            if (var22 == 0) {
                                              break L36;
                                            } else {
                                              break L37;
                                            }
                                          }
                                        }
                                        var7[var18] = ug.a(false, var15_ref_byte____[var17], -19524);
                                        break L36;
                                      }
                                      var17++;
                                      continue L33;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      var11 = var23.length;
                      var11--;
                      var12 = 255 & var23[var11];
                      var11 = var11 - var12 * (var5_int * 4);
                      var13 = new lu(var10_array);
                      var14 = 0;
                      var15 = 0;
                      var13.field_g = var11;
                      var16_int = 0;
                      L38: while (true) {
                        L39: {
                          if (var12 <= var16_int) {
                            stackOut_110_0 = ~var14;
                            stackIn_111_0 = stackOut_110_0;
                            break L39;
                          } else {
                            var17 = 0;
                            stackOut_97_0 = 0;
                            stackIn_111_0 = stackOut_97_0;
                            stackIn_98_0 = stackOut_97_0;
                            if (var22 != 0) {
                              break L39;
                            } else {
                              var18 = stackIn_98_0;
                              L40: while (true) {
                                L41: {
                                  if (var5_int <= var18) {
                                    var16_int++;
                                    break L41;
                                  } else {
                                    var17 = var17 + var13.f(-68);
                                    if (var22 != 0) {
                                      break L41;
                                    } else {
                                      L42: {
                                        L43: {
                                          if (var6 != null) {
                                            break L43;
                                          } else {
                                            var19 = var18;
                                            if (var22 == 0) {
                                              break L42;
                                            } else {
                                              break L43;
                                            }
                                          }
                                        }
                                        var19 = var6[var18];
                                        break L42;
                                      }
                                      L44: {
                                        if (param2 == var19) {
                                          var14 = var14 + var17;
                                          var15 = var19;
                                          break L44;
                                        } else {
                                          break L44;
                                        }
                                      }
                                      var18++;
                                      continue L40;
                                    }
                                  }
                                }
                                continue L38;
                              }
                            }
                          }
                        }
                        if (stackIn_111_0 != -1) {
                          var16 = new byte[var14];
                          var13.field_g = var11;
                          var14 = 0;
                          var17 = 0;
                          var18 = 0;
                          L45: while (true) {
                            if (var18 >= var12) {
                              var7[var15] = (Object) (Object) var16;
                              break L16;
                            } else {
                              var19 = 0;
                              stackOut_116_0 = 0;
                              stackIn_131_0 = stackOut_116_0;
                              stackIn_117_0 = stackOut_116_0;
                              if (var22 != 0) {
                                break L15;
                              } else {
                                var20 = stackIn_117_0;
                                L46: while (true) {
                                  L47: {
                                    if (var20 >= var5_int) {
                                      var18++;
                                      break L47;
                                    } else {
                                      var19 = var19 + var13.f(124);
                                      if (var22 != 0) {
                                        break L47;
                                      } else {
                                        L48: {
                                          L49: {
                                            if (var6 == null) {
                                              break L49;
                                            } else {
                                              var21 = var6[var20];
                                              if (var22 == 0) {
                                                break L48;
                                              } else {
                                                break L49;
                                              }
                                            }
                                          }
                                          var21 = var20;
                                          break L48;
                                        }
                                        L50: {
                                          if (var21 == param2) {
                                            bl.a(var10_array, var17, var16, var14, var19);
                                            var14 = var14 + var19;
                                            break L50;
                                          } else {
                                            break L50;
                                          }
                                        }
                                        var17 = var17 + var19;
                                        var20++;
                                        continue L46;
                                      }
                                    }
                                  }
                                  continue L45;
                                }
                              }
                            }
                          }
                        } else {
                          stackOut_112_0 = 1;
                          stackIn_113_0 = stackOut_112_0;
                          return stackIn_113_0 != 0;
                        }
                      }
                    }
                    stackOut_130_0 = 1;
                    stackIn_131_0 = stackOut_130_0;
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
            stackOut_132_0 = (RuntimeException) var5;
            stackOut_132_1 = new StringBuilder().append("vr.CA(");
            stackIn_134_0 = stackOut_132_0;
            stackIn_134_1 = stackOut_132_1;
            stackIn_133_0 = stackOut_132_0;
            stackIn_133_1 = stackOut_132_1;
            if (param0 == null) {
              stackOut_134_0 = (RuntimeException) (Object) stackIn_134_0;
              stackOut_134_1 = (StringBuilder) (Object) stackIn_134_1;
              stackOut_134_2 = "null";
              stackIn_135_0 = stackOut_134_0;
              stackIn_135_1 = stackOut_134_1;
              stackIn_135_2 = stackOut_134_2;
              break L51;
            } else {
              stackOut_133_0 = (RuntimeException) (Object) stackIn_133_0;
              stackOut_133_1 = (StringBuilder) (Object) stackIn_133_1;
              stackOut_133_2 = "{...}";
              stackIn_135_0 = stackOut_133_0;
              stackIn_135_1 = stackOut_133_1;
              stackIn_135_2 = stackOut_133_2;
              break L51;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_135_0, stackIn_135_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_131_0 != 0;
    }

    final synchronized byte[] a(byte param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_8_0 = null;
        byte[] stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_9_0 = null;
        Object stackOut_7_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (((vr) this).a(0)) {
              param2 = param2.toLowerCase();
              if (param0 == 123) {
                param1 = param1.toLowerCase();
                var6 = (CharSequence) (Object) param2;
                var4_int = ((vr) this).field_f.field_m.a((byte) -87, efa.a(var6, true));
                if (this.a(var4_int, (byte) 70)) {
                  var7 = (CharSequence) (Object) param1;
                  var5 = ((vr) this).field_f.field_l[var4_int].a((byte) -81, efa.a(var7, true));
                  stackOut_9_0 = ((vr) this).b(-71, var4_int, var5);
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  stackOut_7_0 = null;
                  stackIn_8_0 = stackOut_7_0;
                  return (byte[]) (Object) stackIn_8_0;
                }
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                return (byte[]) (Object) stackIn_5_0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (byte[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("vr.Q(").append(param0).append(44);
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
          L2: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
        return stackIn_10_0;
    }

    public static void b(int param0) {
        if (param0 != -19779) {
            return;
        }
        field_h = null;
    }

    final int a(byte param0) {
        if (param0 != 20) {
            return -79;
        }
        if (!(((vr) this).a(0))) {
            return -1;
        }
        return ((vr) this).field_f.field_j.length;
    }

    private final synchronized boolean a(boolean param0, int param1, int param2) {
        Object var5 = null;
        if (((vr) this).a(0)) {
          L0: {
            if (param1 < 0) {
              break L0;
            } else {
              if (param2 < 0) {
                break L0;
              } else {
                if (((vr) this).field_f.field_j.length <= param1) {
                  break L0;
                } else {
                  if (param2 >= ((vr) this).field_f.field_j[param1]) {
                    break L0;
                  } else {
                    if (param0) {
                      var5 = null;
                      int discarded$2 = ((vr) this).a((String) null, false);
                      return true;
                    } else {
                      return true;
                    }
                  }
                }
              }
            }
          }
          if (cia.field_j) {
            throw new IllegalArgumentException(param1 + " " + param2);
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final boolean a(String param0, boolean param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_5_0 = false;
        cr stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        String stackIn_7_2 = null;
        cr stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        String stackIn_8_2 = null;
        cr stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        String stackIn_9_2 = null;
        int stackIn_9_3 = 0;
        int stackIn_11_0 = 0;
        boolean stackIn_13_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        cr stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        String stackOut_6_2 = null;
        cr stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        String stackOut_8_2 = null;
        int stackOut_8_3 = 0;
        cr stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        String stackOut_7_2 = null;
        int stackOut_7_3 = 0;
        boolean stackOut_12_0 = false;
        int stackOut_10_0 = 0;
        boolean stackOut_4_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            if (((vr) this).a(0)) {
              if (!param1) {
                L1: {
                  param2 = param2.toLowerCase();
                  param0 = param0.toLowerCase();
                  stackOut_6_0 = ((vr) this).field_f.field_m;
                  stackOut_6_1 = -92;
                  stackOut_6_2 = (String) param2;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_8_1 = stackOut_6_1;
                  stackIn_8_2 = stackOut_6_2;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  stackIn_7_2 = stackOut_6_2;
                  if (param1) {
                    stackOut_8_0 = (cr) (Object) stackIn_8_0;
                    stackOut_8_1 = stackIn_8_1;
                    stackOut_8_2 = (String) (Object) stackIn_8_2;
                    stackOut_8_3 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    stackIn_9_2 = stackOut_8_2;
                    stackIn_9_3 = stackOut_8_3;
                    break L1;
                  } else {
                    stackOut_7_0 = (cr) (Object) stackIn_7_0;
                    stackOut_7_1 = stackIn_7_1;
                    stackOut_7_2 = (String) (Object) stackIn_7_2;
                    stackOut_7_3 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_9_1 = stackOut_7_1;
                    stackIn_9_2 = stackOut_7_2;
                    stackIn_9_3 = stackOut_7_3;
                    break L1;
                  }
                }
                var4_int = ((cr) (Object) stackIn_9_0).a((byte) stackIn_9_1, efa.a((CharSequence) (Object) stackIn_9_2, stackIn_9_3 != 0));
                if (this.a(var4_int, (byte) 70)) {
                  var6 = (CharSequence) (Object) param0;
                  var5 = ((vr) this).field_f.field_l[var4_int].a((byte) -104, efa.a(var6, true));
                  stackOut_12_0 = ((vr) this).a(-121, var5, var4_int);
                  stackIn_13_0 = stackOut_12_0;
                  break L0;
                } else {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0 != 0;
                }
              } else {
                stackOut_4_0 = ((boolean[]) ((vr) this).field_c[5])[9];
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
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
            stackOut_14_0 = (RuntimeException) var4;
            stackOut_14_1 = new StringBuilder().append("vr.P(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          L3: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44).append(param1).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
        }
        return stackIn_13_0;
    }

    final synchronized int a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        var5 = BachelorFridge.field_y;
        if (!((vr) this).a(0)) {
          return 0;
        } else {
          var2 = 0;
          var3 = 0;
          if (param0) {
            var4 = 0;
            L0: while (true) {
              L1: {
                if (var4 >= ((vr) this).field_c.length) {
                  if (var2 == 0) {
                    return 100;
                  } else {
                    var4 = var3 * 100 / var2;
                    break L1;
                  }
                } else {
                  stackOut_7_0 = ~((vr) this).field_f.field_e[var4];
                  stackOut_7_1 = -1;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_8_0 = stackOut_7_0;
                  stackIn_8_1 = stackOut_7_1;
                  if (var5 == 0) {
                    L2: {
                      if (stackIn_9_0 >= stackIn_9_1) {
                        break L2;
                      } else {
                        var3 = var3 + ((vr) this).b(var4, (byte) -87);
                        var2 += 100;
                        break L2;
                      }
                    }
                    var4++;
                    continue L0;
                  } else {
                    var4 = stackIn_8_0 / stackIn_8_1;
                    break L1;
                  }
                }
              }
              return var4;
            }
          } else {
            return 1;
          }
        }
    }

    final boolean b(String param0, boolean param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (!((vr) this).a(0)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              param0 = param0.toLowerCase();
              var4 = (CharSequence) (Object) param0;
              var3_int = ((vr) this).field_f.field_m.a((byte) -115, efa.a(var4, true));
              if (var3_int < 0) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              } else {
                if (!param1) {
                  stackOut_10_0 = 1;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  int discarded$2 = ((vr) this).a(((byte[]) ((vr) this).field_c[0])[9], -128, (String) ((vr) this).field_c[0]);
                  return true;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("vr.W(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L1;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 41);
        }
        return stackIn_11_0 != 0;
    }

    final synchronized int b(int param0, byte param1) {
        if (param1 != -87) {
            boolean discarded$0 = ((vr) this).a(((int[]) ((vr) this).field_c[13])[1]);
        }
        if (!(this.a(param0, (byte) 70))) {
            return 0;
        }
        if (!(((vr) this).field_c[param0] == null)) {
            return 100;
        }
        return ((vr) this).field_a.a(8192, param0);
    }

    private final synchronized byte[] a(int param0, int[] param1, int param2, int param3) {
        Object var5 = null;
        byte[] var7 = null;
        Object stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_27_0 = null;
        Object stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        Object stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        Object stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_26_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        Object stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        Object stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        Object stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        try {
          L0: {
            if (this.a(false, param0, param3)) {
              if (param2 == -3) {
                L1: {
                  L2: {
                    var5 = null;
                    if (null == ((vr) this).field_d[param0]) {
                      break L2;
                    } else {
                      if (((vr) this).field_d[param0][param3] == null) {
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                  if (this.a(param1, (byte) -116, param3, param0)) {
                    break L1;
                  } else {
                    this.e(param0, param2 + 3);
                    if (this.a(param1, (byte) -101, param3, param0)) {
                      break L1;
                    } else {
                      return null;
                    }
                  }
                }
                if (((vr) this).field_d[param0] != null) {
                  L3: {
                    if (null != ((vr) this).field_d[param0][param3]) {
                      var7 = tb.a(false, (byte) 96, ((vr) this).field_d[param0][param3]);
                      var5 = (Object) (Object) var7;
                      if (var7 != null) {
                        break L3;
                      } else {
                        throw new RuntimeException("");
                      }
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (var5 == null) {
                      break L4;
                    } else {
                      L5: {
                        if (((vr) this).field_e != 1) {
                          break L5;
                        } else {
                          ((vr) this).field_d[param0][param3] = null;
                          if (((vr) this).field_f.field_j[param0] != 1) {
                            break L4;
                          } else {
                            ((vr) this).field_d[param0] = null;
                            if (BachelorFridge.field_y == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      if (((vr) this).field_e != 2) {
                        break L4;
                      } else {
                        ((vr) this).field_d[param0] = null;
                        break L4;
                      }
                    }
                  }
                  stackOut_26_0 = var5;
                  stackIn_27_0 = stackOut_26_0;
                  break L0;
                } else {
                  throw new RuntimeException("");
                }
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                return (byte[]) (Object) stackIn_5_0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (byte[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = (Object) (Object) decompiledCaughtException;
            stackOut_28_0 = var5;
            stackOut_28_1 = new StringBuilder().append("vr.I(").append(param0).append(44);
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param1 == null) {
              stackOut_30_0 = stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L6;
            } else {
              stackOut_29_0 = stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L6;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + 44 + param2 + 44 + param3 + 41);
        }
        return (byte[]) (Object) stackIn_27_0;
    }

    final static void a(byte param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        ne var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param0 == 75) {
                break L1;
              } else {
                field_b = 75;
                break L1;
              }
            }
            var4 = (ne) (Object) rg.field_f.b((byte) 90);
            L2: while (true) {
              L3: {
                if (var4 == null) {
                  break L3;
                } else {
                  kja.a(param1, (byte) 58, var4);
                  var4 = (ne) (Object) rg.field_f.c(0);
                  if (var3 != 0) {
                    break L3;
                  } else {
                    if (var3 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "vr.M(" + param0 + 44 + param1 + 41);
        }
    }

    final synchronized boolean c(int param0, int param1) {
        if (!this.a(param0, (byte) 70)) {
          return false;
        } else {
          L0: {
            if (param1 == -734) {
              break L0;
            } else {
              ((vr) this).field_a = null;
              break L0;
            }
          }
          if (((vr) this).field_c[param0] != null) {
            return true;
          } else {
            this.e(param0, 0);
            if (((vr) this).field_c[param0] == null) {
              return false;
            } else {
              return true;
            }
          }
        }
    }

    final synchronized boolean b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_13_0 = 0;
        var5 = BachelorFridge.field_y;
        if (!((vr) this).a(0)) {
          return false;
        } else {
          L0: {
            var2 = 1;
            if (param0 >= 87) {
              break L0;
            } else {
              vr.a((byte) -107, ((int[]) ((vr) this).field_c[5])[10]);
              break L0;
            }
          }
          var3 = 0;
          L1: while (true) {
            L2: {
              L3: {
                if (var3 >= ((vr) this).field_f.field_o.length) {
                  break L3;
                } else {
                  stackOut_7_0 = ((vr) this).field_f.field_o[var3];
                  stackIn_14_0 = stackOut_7_0;
                  stackIn_8_0 = stackOut_7_0;
                  if (var5 != 0) {
                    break L2;
                  } else {
                    L4: {
                      var4 = stackIn_8_0;
                      if (null == ((vr) this).field_c[var4]) {
                        this.e(var4, 0);
                        if (null != ((vr) this).field_c[var4]) {
                          break L4;
                        } else {
                          var2 = 0;
                          break L4;
                        }
                      } else {
                        break L4;
                      }
                    }
                    var3++;
                    if (var5 == 0) {
                      continue L1;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              stackOut_13_0 = var2;
              stackIn_14_0 = stackOut_13_0;
              break L2;
            }
            return stackIn_14_0 != 0;
          }
        }
    }

    final byte[] b(int param0, int param1, int param2) {
        int var4 = -67 % ((param0 - 20) / 34);
        return this.a(param1, (int[]) null, -3, param2);
    }

    private final synchronized void e(int param0, int param1) {
        L0: {
          if (param1 == 0) {
            break L0;
          } else {
            boolean discarded$2 = ((vr) this).b((byte) 86);
            break L0;
          }
        }
        L1: {
          L2: {
            if (!((vr) this).field_g) {
              break L2;
            } else {
              ((vr) this).field_c[param0] = (Object) (Object) ((vr) this).field_a.a((byte) 112, param0);
              if (BachelorFridge.field_y == 0) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          ((vr) this).field_c[param0] = ug.a(false, ((vr) this).field_a.a((byte) 101, param0), -19524);
          break L1;
        }
    }

    private final synchronized boolean a(int param0, byte param1) {
        if (!((vr) this).a(0)) {
          return false;
        } else {
          L0: {
            if (param0 < 0) {
              break L0;
            } else {
              if (~param0 <= ~((vr) this).field_f.field_j.length) {
                break L0;
              } else {
                if (((vr) this).field_f.field_j[param0] != 0) {
                  return true;
                } else {
                  break L0;
                }
              }
            }
          }
          if (!cia.field_j) {
            return false;
          } else {
            throw new IllegalArgumentException(Integer.toString(param0));
          }
        }
    }

    final synchronized boolean a(int param0, int param1) {
        if (!((vr) this).a(param0 + param0)) {
            return false;
        }
        if (!(((vr) this).field_f.field_j.length != 1)) {
            return ((vr) this).a(-126, param1, 0);
        }
        if (!this.a(param1, (byte) 70)) {
            return false;
        }
        if (!(((vr) this).field_f.field_j[param1] != 1)) {
            return ((vr) this).a(param0 + -102, 0, param1);
        }
        throw new RuntimeException();
    }

    final int a(byte param0, int param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        CharSequence var5 = null;
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
            if (!this.a(param1, (byte) 70)) {
              stackOut_2_0 = -1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                param2 = param2.toLowerCase();
                if (param0 == 6) {
                  break L1;
                } else {
                  ((vr) this).field_f = null;
                  break L1;
                }
              }
              var5 = (CharSequence) (Object) param2;
              var4_int = ((vr) this).field_f.field_l[param1].a((byte) -128, efa.a(var5, true));
              if (this.a(false, param1, var4_int)) {
                stackOut_9_0 = var4_int;
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
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("vr.C(").append(param0).append(44).append(param1).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
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
          throw pe.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_10_0;
    }

    final int d(int param0, int param1) {
        L0: {
          if (param1 == 0) {
            break L0;
          } else {
            vr.a(-90, (po) ((Object[]) ((Object[]) ((vr) this).field_c[6])[0])[9], 120, ((int[]) ((vr) this).field_c[35])[29], 19, (kv[]) null, -99, (po) null, -110, ((int[]) ((vr) this).field_c[0])[6], ((boolean[]) ((vr) this).field_c[35])[11], (kv[]) null, 84, ((int[]) ((vr) this).field_c[0])[0], 54);
            break L0;
          }
        }
        if (!this.a(param0, (byte) 70)) {
          return 0;
        } else {
          return ((vr) this).field_f.field_j[param0];
        }
    }

    final static void a(int param0, po param1, int param2, int param3, int param4, kv[] param5, int param6, po param7, int param8, int param9, boolean param10, kv[] param11, int param12, int param13, int param14) {
        try {
            Object var16 = null;
            ll.a(jc.field_t, param13, param3, param2, param8, param5, 0, param6, param1, param9, param4, (kv[]) null, nja.field_a, param11, param7, param0, 0, 256, param12, 54, fa.field_f);
            la.a(param10, 2);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "vr.L(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 44 + (param5 != null ? "{...}" : "null") + 44 + param6 + 44 + (param7 != null ? "{...}" : "null") + 44 + param8 + 44 + param9 + 44 + param10 + 44 + (param11 != null ? "{...}" : "null") + 44 + param12 + 44 + param13 + 44 + 54 + 41);
        }
    }

    final synchronized byte[] b(int param0, int param1) {
        if (!((vr) this).a(param1)) {
            return null;
        }
        if (((vr) this).field_f.field_j.length == 1) {
            return ((vr) this).b(param1 ^ -56, 0, param0);
        }
        if (!this.a(param0, (byte) 70)) {
            return null;
        }
        if (!(((vr) this).field_f.field_j[param0] != 1)) {
            return ((vr) this).b(param1 + -45, param0, 0);
        }
        throw new RuntimeException();
    }

    final synchronized boolean a(int param0, int param1, int param2) {
        if (param0 < -101) {
          if (!this.a(false, param2, param1)) {
            return false;
          } else {
            L0: {
              if (null == ((vr) this).field_d[param2]) {
                break L0;
              } else {
                if (((vr) this).field_d[param2][param1] != null) {
                  return true;
                } else {
                  break L0;
                }
              }
            }
            if (null != ((vr) this).field_c[param2]) {
              return true;
            } else {
              this.e(param2, 0);
              if (null != ((vr) this).field_c[param2]) {
                return true;
              } else {
                return false;
              }
            }
          }
        } else {
          return ((boolean[]) ((vr) this).field_c[3])[6];
        }
    }

    vr(tja param0, boolean param1, int param2) {
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
        ((vr) this).field_f = null;
        try {
          L0: {
            L1: {
              if (param2 < 0) {
                break L1;
              } else {
                if (2 >= param2) {
                  L2: {
                    ((vr) this).field_a = param0;
                    ((vr) this).field_e = param2;
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
                  ((vr) this).field_g = stackIn_7_1 != 0;
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
            stackOut_9_1 = new StringBuilder().append("vr.<init>(");
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
          throw pe.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final int a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
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
            if (!((vr) this).a(param0)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              param1 = param1.toLowerCase();
              var4 = (CharSequence) (Object) param1;
              var3_int = ((vr) this).field_f.field_m.a((byte) -95, efa.a(var4, true));
              stackOut_4_0 = ((vr) this).b(var3_int, (byte) -87);
              stackIn_5_0 = stackOut_4_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("vr.T(").append(param0).append(44);
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
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
        return stackIn_5_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Age:";
    }
}
