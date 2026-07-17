/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cm {
    private fa field_o;
    boolean field_f;
    int field_d;
    private Object[] field_k;
    private jl field_a;
    private Object[][] field_i;
    static int[] field_l;
    static String field_c;
    static String field_n;
    static int[] field_e;
    static String[] field_m;
    static wk[] field_b;
    static String field_p;
    static tb field_j;
    static int field_g;
    static gh field_h;

    final synchronized boolean a(byte param0, int param1, int param2) {
        if (!(this.b(param2, param1, -17637))) {
            return false;
        }
        if (null != ((cm) this).field_i[param2]) {
            if (!(null == ((cm) this).field_i[param2][param1])) {
                return true;
            }
        }
        if (!(null == ((cm) this).field_k[param2])) {
            return true;
        }
        this.a(-66, param2);
        if (null != ((cm) this).field_k[param2]) {
            return true;
        }
        if (param0 <= 53) {
            boolean discarded$0 = ((cm) this).a(98);
            return false;
        }
        return false;
    }

    private final synchronized boolean b(int param0, int param1, int param2) {
        if (((cm) this).a(true)) {
          if (param2 == -17637) {
            L0: {
              if (param0 < 0) {
                break L0;
              } else {
                if (param1 < 0) {
                  break L0;
                } else {
                  if (((cm) this).field_a.field_g.length <= param0) {
                    break L0;
                  } else {
                    if (param1 < ((cm) this).field_a.field_g[param0]) {
                      return true;
                    } else {
                      break L0;
                    }
                  }
                }
              }
            }
            if (!qi.field_l) {
              return false;
            } else {
              throw new IllegalArgumentException(param0 + " " + param1);
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    private final synchronized boolean a(int param0, int param1, int param2, int[] param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        Object var9 = null;
        int var9_int = 0;
        byte[] var9_array = null;
        gi var10 = null;
        int var10_int = 0;
        byte[] var10_array = null;
        RuntimeException var11_ref_RuntimeException = null;
        int var11 = 0;
        int var12 = 0;
        gi var13 = null;
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
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int[] stackIn_14_0 = null;
        int stackIn_24_0 = 0;
        int[] stackIn_27_0 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        int stackIn_39_2 = 0;
        int stackIn_56_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_96_0 = 0;
        int stackIn_109_0 = 0;
        int stackIn_112_0 = 0;
        int stackIn_116_0 = 0;
        int stackIn_130_0 = 0;
        RuntimeException stackIn_132_0 = null;
        StringBuilder stackIn_132_1 = null;
        RuntimeException stackIn_133_0 = null;
        StringBuilder stackIn_133_1 = null;
        RuntimeException stackIn_134_0 = null;
        StringBuilder stackIn_134_1 = null;
        String stackIn_134_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int[] stackOut_13_0 = null;
        int[] stackOut_26_0 = null;
        int stackOut_23_0 = 0;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        int stackOut_38_2 = 0;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        int stackOut_37_2 = 0;
        int stackOut_63_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_80_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_108_0 = 0;
        int stackOut_95_0 = 0;
        int stackOut_111_0 = 0;
        int stackOut_115_0 = 0;
        int stackOut_129_0 = 0;
        RuntimeException stackOut_131_0 = null;
        StringBuilder stackOut_131_1 = null;
        RuntimeException stackOut_133_0 = null;
        StringBuilder stackOut_133_1 = null;
        String stackOut_133_2 = null;
        RuntimeException stackOut_132_0 = null;
        StringBuilder stackOut_132_1 = null;
        String stackOut_132_2 = null;
        var22 = SteelSentinels.field_G;
        try {
          L0: {
            if (!this.b(param1, true)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (null == ((cm) this).field_k[param1]) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0 != 0;
              } else {
                L1: {
                  var5_int = ((cm) this).field_a.field_j[param1];
                  var6 = ((cm) this).field_a.field_o[param1];
                  if (null != ((cm) this).field_i[param1]) {
                    break L1;
                  } else {
                    ((cm) this).field_i[param1] = new Object[((cm) this).field_a.field_g[param1]];
                    break L1;
                  }
                }
                var7 = ((cm) this).field_i[param1];
                var8 = 1;
                var9_int = param2;
                L2: while (true) {
                  L3: {
                    L4: {
                      L5: {
                        L6: {
                          if (var9_int >= var5_int) {
                            break L6;
                          } else {
                            stackOut_13_0 = (int[]) var6;
                            stackIn_27_0 = stackOut_13_0;
                            stackIn_14_0 = stackOut_13_0;
                            if (var22 != 0) {
                              break L5;
                            } else {
                              L7: {
                                L8: {
                                  if (stackIn_14_0 != null) {
                                    break L8;
                                  } else {
                                    var10_int = var9_int;
                                    if (var22 == 0) {
                                      break L7;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                                var10_int = var6[var9_int];
                                break L7;
                              }
                              L9: {
                                if (null == var7[var10_int]) {
                                  var8 = 0;
                                  if (var22 == 0) {
                                    break L6;
                                  } else {
                                    break L9;
                                  }
                                } else {
                                  break L9;
                                }
                              }
                              var9_int++;
                              continue L2;
                            }
                          }
                        }
                        if (var8 == 0) {
                          if (param3 == null) {
                            break L4;
                          } else {
                            stackOut_26_0 = (int[]) param3;
                            stackIn_27_0 = stackOut_26_0;
                            break L5;
                          }
                        } else {
                          stackOut_23_0 = 1;
                          stackIn_24_0 = stackOut_23_0;
                          return stackIn_24_0 != 0;
                        }
                      }
                      L10: {
                        if (stackIn_27_0[0] != 0) {
                          break L10;
                        } else {
                          if (0 != param3[1]) {
                            break L10;
                          } else {
                            if (param3[2] != 0) {
                              break L10;
                            } else {
                              if (param3[3] == 0) {
                                break L4;
                              } else {
                                break L10;
                              }
                            }
                          }
                        }
                      }
                      var9_array = dk.a(true, ((cm) this).field_k[param1], 0);
                      var10 = new gi(var9_array);
                      var10.a(5, param2 ^ 32203, var10.field_t.length, param3);
                      break L3;
                    }
                    var9_array = dk.a(false, ((cm) this).field_k[param1], 0);
                    break L3;
                  }
                  try {
                    L11: {
                      var23 = ln.a(var9_array, (byte) 127);
                      var10_array = var23;
                      break L11;
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L12: {
                      var11_ref_RuntimeException = decompiledCaughtException;
                      stackOut_36_0 = (RuntimeException) var11_ref_RuntimeException;
                      stackOut_36_1 = new StringBuilder();
                      stackIn_38_0 = stackOut_36_0;
                      stackIn_38_1 = stackOut_36_1;
                      stackIn_37_0 = stackOut_36_0;
                      stackIn_37_1 = stackOut_36_1;
                      if (param3 == null) {
                        stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
                        stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
                        stackOut_38_2 = 0;
                        stackIn_39_0 = stackOut_38_0;
                        stackIn_39_1 = stackOut_38_1;
                        stackIn_39_2 = stackOut_38_2;
                        break L12;
                      } else {
                        stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
                        stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
                        stackOut_37_2 = 1;
                        stackIn_39_0 = stackOut_37_0;
                        stackIn_39_1 = stackOut_37_1;
                        stackIn_39_2 = stackOut_37_2;
                        break L12;
                      }
                    }
                    throw ci.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + " " + param1 + " " + param3.length + " " + ba.a((byte) -107, var9_array, param3.length) + " " + ba.a((byte) -107, var9_array, param3.length + -2) + " " + ((cm) this).field_a.field_a[param1] + " " + ((cm) this).field_a.field_e);
                  }
                  L13: {
                    if (((cm) this).field_f) {
                      ((cm) this).field_k[param1] = null;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  L14: {
                    L15: {
                      L16: {
                        if (1 < var5_int) {
                          break L16;
                        } else {
                          L17: {
                            L18: {
                              if (var6 == null) {
                                break L18;
                              } else {
                                var11 = var6[0];
                                if (var22 == 0) {
                                  break L17;
                                } else {
                                  break L18;
                                }
                              }
                            }
                            var11 = 0;
                            break L17;
                          }
                          L19: {
                            L20: {
                              if (((cm) this).field_d == 0) {
                                break L20;
                              } else {
                                var7[var11] = (Object) (Object) var23;
                                if (var22 == 0) {
                                  break L19;
                                } else {
                                  break L20;
                                }
                              }
                            }
                            var7[var11] = ah.a(false, var23, 0);
                            break L19;
                          }
                          if (var22 == 0) {
                            break L15;
                          } else {
                            break L16;
                          }
                        }
                      }
                      L21: {
                        if (((cm) this).field_d == 2) {
                          break L21;
                        } else {
                          var11 = var23.length;
                          var11--;
                          var12 = var23[var11] & 255;
                          var11 = var11 - var12 * var5_int * 4;
                          var13 = new gi(var10_array);
                          var13.field_p = var11;
                          var14_ref_int__ = new int[var5_int];
                          var15 = 0;
                          L22: while (true) {
                            L23: {
                              if (var15 >= var12) {
                                stackOut_63_0 = var5_int;
                                stackIn_64_0 = stackOut_63_0;
                                break L23;
                              } else {
                                var16_int = 0;
                                stackOut_55_0 = 0;
                                stackIn_64_0 = stackOut_55_0;
                                stackIn_56_0 = stackOut_55_0;
                                if (var22 != 0) {
                                  break L23;
                                } else {
                                  var17 = stackIn_56_0;
                                  L24: while (true) {
                                    L25: {
                                      if (var5_int <= var17) {
                                        var15++;
                                        break L25;
                                      } else {
                                        var16_int = var16_int + var13.i(0);
                                        var14_ref_int__[var17] = var14_ref_int__[var17] + var16_int;
                                        var17++;
                                        if (var22 != 0) {
                                          break L25;
                                        } else {
                                          continue L24;
                                        }
                                      }
                                    }
                                    continue L22;
                                  }
                                }
                              }
                            }
                            var15_ref_byte____ = new byte[stackIn_64_0][];
                            var16_int = 0;
                            L26: while (true) {
                              L27: {
                                if (var16_int >= var5_int) {
                                  var13.field_p = var11;
                                  var16_int = 0;
                                  break L27;
                                } else {
                                  var15_ref_byte____[var16_int] = new byte[var14_ref_int__[var16_int]];
                                  var14_ref_int__[var16_int] = 0;
                                  var16_int++;
                                  if (var22 != 0) {
                                    break L27;
                                  } else {
                                    continue L26;
                                  }
                                }
                              }
                              var17 = 0;
                              L28: while (true) {
                                L29: {
                                  if (var17 >= var12) {
                                    stackOut_80_0 = 0;
                                    stackIn_81_0 = stackOut_80_0;
                                    break L29;
                                  } else {
                                    var18 = 0;
                                    stackOut_72_0 = 0;
                                    stackIn_81_0 = stackOut_72_0;
                                    stackIn_73_0 = stackOut_72_0;
                                    if (var22 != 0) {
                                      break L29;
                                    } else {
                                      var19 = stackIn_73_0;
                                      L30: while (true) {
                                        L31: {
                                          if (var19 >= var5_int) {
                                            var17++;
                                            break L31;
                                          } else {
                                            var18 = var18 + var13.i(0);
                                            ii.a(var23, var16_int, var15_ref_byte____[var19], var14_ref_int__[var19], var18);
                                            var16_int = var16_int + var18;
                                            var14_ref_int__[var19] = var14_ref_int__[var19] + var18;
                                            var19++;
                                            if (var22 != 0) {
                                              break L31;
                                            } else {
                                              continue L30;
                                            }
                                          }
                                        }
                                        continue L28;
                                      }
                                    }
                                  }
                                }
                                var17 = stackIn_81_0;
                                L32: while (true) {
                                  if (var17 >= var5_int) {
                                    if (var22 == 0) {
                                      break L15;
                                    } else {
                                      break L21;
                                    }
                                  } else {
                                    if (var22 != 0) {
                                      break L15;
                                    } else {
                                      L33: {
                                        L34: {
                                          if (var6 == null) {
                                            break L34;
                                          } else {
                                            var18 = var6[var17];
                                            if (var22 == 0) {
                                              break L33;
                                            } else {
                                              break L34;
                                            }
                                          }
                                        }
                                        var18 = var17;
                                        break L33;
                                      }
                                      L35: {
                                        L36: {
                                          if (0 != ((cm) this).field_d) {
                                            break L36;
                                          } else {
                                            var7[var18] = ah.a(false, var15_ref_byte____[var17], 0);
                                            if (var22 == 0) {
                                              break L35;
                                            } else {
                                              break L36;
                                            }
                                          }
                                        }
                                        var7[var18] = (Object) (Object) var15_ref_byte____[var17];
                                        break L35;
                                      }
                                      var17++;
                                      continue L32;
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
                      var12 = var23[var11] & 255;
                      var11 = var11 - var5_int * var12 * 4;
                      var13 = new gi(var10_array);
                      var14 = 0;
                      var13.field_p = var11;
                      var15 = 0;
                      var16_int = 0;
                      L37: while (true) {
                        L38: {
                          if (var12 <= var16_int) {
                            stackOut_108_0 = ~var14;
                            stackIn_109_0 = stackOut_108_0;
                            break L38;
                          } else {
                            var17 = 0;
                            stackOut_95_0 = 0;
                            stackIn_109_0 = stackOut_95_0;
                            stackIn_96_0 = stackOut_95_0;
                            if (var22 != 0) {
                              break L38;
                            } else {
                              var18 = stackIn_96_0;
                              L39: while (true) {
                                L40: {
                                  if (var18 >= var5_int) {
                                    var16_int++;
                                    break L40;
                                  } else {
                                    var17 = var17 + var13.i(0);
                                    if (var22 != 0) {
                                      break L40;
                                    } else {
                                      L41: {
                                        L42: {
                                          if (var6 != null) {
                                            break L42;
                                          } else {
                                            var19 = var18;
                                            if (var22 == 0) {
                                              break L41;
                                            } else {
                                              break L42;
                                            }
                                          }
                                        }
                                        var19 = var6[var18];
                                        break L41;
                                      }
                                      L43: {
                                        if (param0 == var19) {
                                          var15 = var19;
                                          var14 = var14 + var17;
                                          break L43;
                                        } else {
                                          break L43;
                                        }
                                      }
                                      var18++;
                                      continue L39;
                                    }
                                  }
                                }
                                continue L37;
                              }
                            }
                          }
                        }
                        if (stackIn_109_0 == -1) {
                          stackOut_111_0 = 1;
                          stackIn_112_0 = stackOut_111_0;
                          return stackIn_112_0 != 0;
                        } else {
                          var16 = new byte[var14];
                          var14 = 0;
                          var13.field_p = var11;
                          var17 = 0;
                          var18 = 0;
                          L44: while (true) {
                            if (var18 >= var12) {
                              var7[var15] = (Object) (Object) var16;
                              break L15;
                            } else {
                              var19 = 0;
                              stackOut_115_0 = 0;
                              stackIn_130_0 = stackOut_115_0;
                              stackIn_116_0 = stackOut_115_0;
                              if (var22 != 0) {
                                break L14;
                              } else {
                                var20 = stackIn_116_0;
                                L45: while (true) {
                                  L46: {
                                    if (var5_int <= var20) {
                                      var18++;
                                      break L46;
                                    } else {
                                      var19 = var19 + var13.i(param2);
                                      if (var22 != 0) {
                                        break L46;
                                      } else {
                                        L47: {
                                          L48: {
                                            if (var6 != null) {
                                              break L48;
                                            } else {
                                              var21 = var20;
                                              if (var22 == 0) {
                                                break L47;
                                              } else {
                                                break L48;
                                              }
                                            }
                                          }
                                          var21 = var6[var20];
                                          break L47;
                                        }
                                        L49: {
                                          if (var21 == param0) {
                                            ii.a(var10_array, var17, var16, var14, var19);
                                            var14 = var14 + var19;
                                            break L49;
                                          } else {
                                            break L49;
                                          }
                                        }
                                        var17 = var17 + var19;
                                        var20++;
                                        continue L45;
                                      }
                                    }
                                  }
                                  continue L44;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    stackOut_129_0 = 1;
                    stackIn_130_0 = stackOut_129_0;
                    break L14;
                  }
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L50: {
            var5 = decompiledCaughtException;
            stackOut_131_0 = (RuntimeException) var5;
            stackOut_131_1 = new StringBuilder().append("cm.V(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_133_0 = stackOut_131_0;
            stackIn_133_1 = stackOut_131_1;
            stackIn_132_0 = stackOut_131_0;
            stackIn_132_1 = stackOut_131_1;
            if (param3 == null) {
              stackOut_133_0 = (RuntimeException) (Object) stackIn_133_0;
              stackOut_133_1 = (StringBuilder) (Object) stackIn_133_1;
              stackOut_133_2 = "null";
              stackIn_134_0 = stackOut_133_0;
              stackIn_134_1 = stackOut_133_1;
              stackIn_134_2 = stackOut_133_2;
              break L50;
            } else {
              stackOut_132_0 = (RuntimeException) (Object) stackIn_132_0;
              stackOut_132_1 = (StringBuilder) (Object) stackIn_132_1;
              stackOut_132_2 = "{...}";
              stackIn_134_0 = stackOut_132_0;
              stackIn_134_1 = stackOut_132_1;
              stackIn_134_2 = stackOut_132_2;
              break L50;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_134_0, stackIn_134_2 + 41);
        }
        return stackIn_130_0 != 0;
    }

    final int a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_5_0 = 0;
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
        int stackOut_4_0 = 0;
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
            L1: {
              if (param1 >= 0) {
                break L1;
              } else {
                ((byte[]) ((cm) this).field_k[18])[0] = (byte) -10;
                break L1;
              }
            }
            if (!((cm) this).a(true)) {
              stackOut_4_0 = -1;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              param0 = param0.toLowerCase();
              var4 = (CharSequence) (Object) param0;
              var3_int = ((cm) this).field_a.field_n.a(ij.a(var4, false), (byte) 120);
              if (this.b(var3_int, true)) {
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
            stackOut_11_1 = new StringBuilder().append("cm.C(");
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
          throw ci.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 41);
        }
        return stackIn_10_0;
    }

    final int a(boolean param0, int param1) {
        if (!(this.b(param1, param0))) {
            return 0;
        }
        return ((cm) this).field_a.field_g[param1];
    }

    final synchronized int b(int param0, int param1) {
        if (!this.b(param1, true)) {
            return 0;
        }
        if (param0 != 10407) {
            ((cm) this).field_i = null;
        }
        if (!(((cm) this).field_k[param1] == null)) {
            return 100;
        }
        return ((cm) this).field_o.a(false, param1);
    }

    private final synchronized void a(int param0, int param1) {
        L0: {
          L1: {
            if (!((cm) this).field_f) {
              break L1;
            } else {
              ((cm) this).field_k[param1] = (Object) (Object) ((cm) this).field_o.a(param1, 82);
              if (SteelSentinels.field_G == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          ((cm) this).field_k[param1] = ah.a(false, ((cm) this).field_o.a(param1, 2), 0);
          break L0;
        }
        L2: {
          if (param0 <= -12) {
            break L2;
          } else {
            cm.b(true);
            break L2;
          }
        }
    }

    final synchronized int a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        var5 = SteelSentinels.field_G;
        if (param0 == -33) {
          if (!((cm) this).a(true)) {
            return 0;
          } else {
            var2 = 0;
            var3 = 0;
            var4 = 0;
            L0: while (true) {
              L1: {
                L2: {
                  if (((cm) this).field_k.length <= var4) {
                    break L2;
                  } else {
                    stackOut_7_0 = ~((cm) this).field_a.field_j[var4];
                    stackOut_7_1 = -1;
                    stackIn_13_0 = stackOut_7_0;
                    stackIn_13_1 = stackOut_7_1;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    if (var5 != 0) {
                      break L1;
                    } else {
                      L3: {
                        if (stackIn_8_0 < stackIn_8_1) {
                          var2 += 100;
                          var3 = var3 + ((cm) this).b(10407, var4);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      var4++;
                      if (var5 == 0) {
                        continue L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                stackOut_12_0 = -1;
                stackOut_12_1 = ~var2;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                break L1;
              }
              if (stackIn_13_0 == stackIn_13_1) {
                return 100;
              } else {
                var4 = var3 * 100 / var2;
                return var4;
              }
            }
          }
        } else {
          return ((int[]) ((cm) this).field_k[12])[1];
        }
    }

    public static void b(boolean param0) {
        field_l = null;
        field_m = null;
        field_p = null;
        if (param0) {
            cm.a((String[][]) null, (byte) 89, (cm) null, (int[]) null, (cm) null, (wk[][]) null, false, 80, 61, (String[]) null, (gk[]) null, (int[]) null, (wk[][]) null, (cm) null, (byte[]) null, (String[][]) null, (byte[]) null);
        }
        field_c = null;
        field_b = null;
        field_e = null;
        field_n = null;
        field_j = null;
        field_h = null;
    }

    private final synchronized boolean b(int param0, boolean param1) {
        if (!(((cm) this).a(param1))) {
            return false;
        }
        if (param0 >= 0) {
            if (param0 < ((cm) this).field_a.field_g.length) {
                if (((cm) this).field_a.field_g[param0] != 0) {
                    return true;
                }
            }
        }
        if (qi.field_l) {
            throw new IllegalArgumentException(Integer.toString(param0));
        }
        return false;
    }

    final int a(int param0, int param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        CharSequence var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_1_0 = 0;
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
            if (this.b(param0, true)) {
              L1: {
                param2 = param2.toLowerCase();
                var5 = (CharSequence) (Object) param2;
                var4_int = ((cm) this).field_a.field_d[param0].a(ij.a(var5, false), (byte) 114);
                if (param1 == -32759) {
                  break L1;
                } else {
                  int discarded$2 = ((cm) this).a((byte) -29, (String) null);
                  break L1;
                }
              }
              if (!this.b(param0, var4_int, -17637)) {
                stackOut_7_0 = -1;
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                return var4_int;
              }
            } else {
              stackOut_1_0 = -1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var4;
            stackOut_9_1 = new StringBuilder().append("cm.E(").append(param0).append(44).append(param1).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
        return stackIn_8_0;
    }

    final boolean a(byte param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_7_0 = false;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
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
            if (!((cm) this).a(true)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              param2 = param2.toLowerCase();
              param1 = param1.toLowerCase();
              var7 = (CharSequence) (Object) param2;
              var4_int = ((cm) this).field_a.field_n.a(ij.a(var7, false), (byte) 116);
              if (this.b(var4_int, true)) {
                var6 = -120 % ((param0 - 40) / 43);
                var8 = (CharSequence) (Object) param1;
                var5 = ((cm) this).field_a.field_d[var4_int].a(ij.a(var8, false), (byte) -77);
                stackOut_7_0 = ((cm) this).a((byte) 97, var5, var4_int);
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
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var4;
            stackOut_9_1 = new StringBuilder().append("cm.Q(").append(param0).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
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
          L2: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
        return stackIn_8_0;
    }

    final boolean a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        boolean stackOut_7_0 = false;
        int stackOut_1_0 = 0;
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
            if (param1 == 90) {
              if (!((cm) this).a(true)) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              } else {
                param0 = param0.toLowerCase();
                var4 = (CharSequence) (Object) param0;
                var3_int = ((cm) this).field_a.field_n.a(ij.a(var4, false), (byte) 123);
                stackOut_7_0 = ((cm) this).a(var3_int, true);
                stackIn_8_0 = stackOut_7_0;
                break L0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("cm.K(");
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
          throw ci.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 41);
        }
        return stackIn_8_0;
    }

    final boolean a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 12145) {
                break L1;
              } else {
                boolean discarded$2 = this.b(((int[]) ((Object[]) ((cm) this).field_k[29])[8])[0], -80, -37);
                break L1;
              }
            }
            if (((cm) this).a(true)) {
              param1 = param1.toLowerCase();
              var4 = (CharSequence) (Object) param1;
              var3_int = ((cm) this).field_a.field_n.a(ij.a(var4, false), (byte) -121);
              if (var3_int >= 0) {
                stackOut_8_0 = 1;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              }
            } else {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("cm.O(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
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
          throw ci.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_9_0 != 0;
    }

    final static void a(String[][] param0, byte param1, cm param2, int[] param3, cm param4, wk[][] param5, boolean param6, int param7, int param8, String[] param9, gk[] param10, int[] param11, wk[][] param12, cm param13, byte[] param14, String[][] param15, byte[] param16) {
        RuntimeException var17 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
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
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
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
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
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
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
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
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        try {
          L0: {
            L1: {
              if (param1 >= 53) {
                break L1;
              } else {
                cm.b(false);
                break L1;
              }
            }
            lh.a(param11, param5, 72, param15, param4, param3, param6, param13, param9, param10, param2, param0, param14, param12, param8, (String[]) null, param16, 1, param7);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var17 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var17;
            stackOut_4_1 = new StringBuilder().append("cm.H(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44).append(param1).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param4 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          L6: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param5 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          L7: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(44).append(param6).append(44).append(param7).append(44).append(param8).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param9 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          L8: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param10 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          L9: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(44);
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param11 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L9;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L9;
            }
          }
          L10: {
            stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(44);
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param12 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L10;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L10;
            }
          }
          L11: {
            stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(44);
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param13 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L11;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L11;
            }
          }
          L12: {
            stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
            stackOut_34_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(44);
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param14 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L12;
            } else {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L12;
            }
          }
          L13: {
            stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
            stackOut_37_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_37_2).append(44);
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param15 == null) {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L13;
            } else {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L13;
            }
          }
          L14: {
            stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
            stackOut_40_1 = ((StringBuilder) (Object) stackIn_40_1).append(stackIn_40_2).append(44);
            stackIn_42_0 = stackOut_40_0;
            stackIn_42_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param16 == null) {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L14;
            } else {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "{...}";
              stackIn_43_0 = stackOut_41_0;
              stackIn_43_1 = stackOut_41_1;
              stackIn_43_2 = stackOut_41_2;
              break L14;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_43_0, stackIn_43_2 + 41);
        }
    }

    final static int a(int param0, int param1, int param2) {
        if (param1 != 200) {
            cm.b(false);
        }
        if (param2 == 0) {
            if (param0 == 0) {
                return 0;
            }
            if (0 > param0) {
                return -2048;
            }
            return 2048;
        }
        if (0 > param2) {
            if (param0 == 0) {
                return 4096;
            }
            if (param0 < 0) {
                return rb.a(-param2, 2048, -param0) + -4096;
            }
            return 4096 - rb.a(-param2, 2048, param0);
        }
        if (0 == param0) {
            return 0;
        }
        if (param0 < 0) {
            return -rb.a(param2, 2048, -param0);
        }
        return rb.a(param2, 2048, param0);
    }

    final byte[] a(int param0, byte param1, int param2) {
        if (param1 <= 20) {
            return null;
        }
        return this.b(param2, 126, param0, (int[]) null);
    }

    final synchronized boolean a(boolean param0) {
        if (!(null != ((cm) this).field_a)) {
            ((cm) this).field_a = ((cm) this).field_o.b((byte) 114);
            if (!(((cm) this).field_a != null)) {
                return false;
            }
            ((cm) this).field_i = new Object[((cm) this).field_a.field_u][];
            ((cm) this).field_k = new Object[((cm) this).field_a.field_u];
        }
        if (!param0) {
            int discarded$0 = ((cm) this).b(((byte[]) ((cm) this).field_k[0])[10]);
            return true;
        }
        return true;
    }

    final int a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (((cm) this).a(true)) {
              L1: {
                param1 = param1.toLowerCase();
                var4 = (CharSequence) (Object) param1;
                var3_int = ((cm) this).field_a.field_n.a(ij.a(var4, false), (byte) -95);
                if (param0 > 66) {
                  break L1;
                } else {
                  boolean discarded$2 = ((cm) this).a((String) ((cm) this).field_k[20], (byte) -91);
                  break L1;
                }
              }
              stackOut_5_0 = ((cm) this).b(10407, var3_int);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("cm.S(").append(param0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_6_0;
    }

    final synchronized boolean a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_11_0 = 0;
        var5 = SteelSentinels.field_G;
        if (((cm) this).a(true)) {
          L0: {
            var2 = 1;
            if (param0 == 25) {
              break L0;
            } else {
              this.a(((int[]) ((Object[]) ((cm) this).field_k[2])[10])[1], -7);
              break L0;
            }
          }
          var3 = 0;
          L1: while (true) {
            L2: {
              L3: {
                if (((cm) this).field_a.field_h.length <= var3) {
                  break L3;
                } else {
                  stackOut_6_0 = ((cm) this).field_a.field_h[var3];
                  stackIn_12_0 = stackOut_6_0;
                  stackIn_7_0 = stackOut_6_0;
                  if (var5 != 0) {
                    break L2;
                  } else {
                    L4: {
                      var4 = stackIn_7_0;
                      if (null != ((cm) this).field_k[var4]) {
                        break L4;
                      } else {
                        this.a(-52, var4);
                        if (null != ((cm) this).field_k[var4]) {
                          break L4;
                        } else {
                          var2 = 0;
                          break L4;
                        }
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
              stackOut_11_0 = var2;
              stackIn_12_0 = stackOut_11_0;
              break L2;
            }
            return stackIn_12_0 != 0;
          }
        } else {
          return false;
        }
    }

    final int b(byte param0) {
        int var2 = -38 / ((param0 - 62) / 49);
        if (!(((cm) this).a(true))) {
            return -1;
        }
        return ((cm) this).field_a.field_g.length;
    }

    final synchronized boolean a(int param0, boolean param1) {
        if (!this.b(param0, param1)) {
            return false;
        }
        if (null != ((cm) this).field_k[param0]) {
            return true;
        }
        this.a(-123, param0);
        if (null != ((cm) this).field_k[param0]) {
            return true;
        }
        return false;
    }

    final synchronized byte[] c(int param0, int param1) {
        if (!((cm) this).a(true)) {
            return null;
        }
        if (((cm) this).field_a.field_g.length == 1) {
            return ((cm) this).a(0, (byte) 94, param0);
        }
        if (!this.b(param0, true)) {
            return null;
        }
        if (param1 != 28694) {
            int discarded$0 = ((cm) this).b((byte) -24);
        }
        if (((cm) this).field_a.field_g[param0] == 1) {
            return ((cm) this).a(param0, (byte) 105, 0);
        }
        throw new RuntimeException();
    }

    private final synchronized byte[] b(int param0, int param1, int param2, int[] param3) {
        Object var5 = null;
        byte[] var7 = null;
        Object stackIn_12_0 = null;
        Object stackIn_27_0 = null;
        Object stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        Object stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        Object stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_11_0 = null;
        Object stackOut_26_0 = null;
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
            L1: {
              if (param1 > 57) {
                break L1;
              } else {
                ((cm) this).field_d = ((int[]) ((cm) this).field_k[0])[7];
                break L1;
              }
            }
            if (this.b(param2, param0, -17637)) {
              L2: {
                L3: {
                  var5 = null;
                  if (((cm) this).field_i[param2] == null) {
                    break L3;
                  } else {
                    if (null != ((cm) this).field_i[param2][param0]) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (!this.a(param0, param2, 0, param3)) {
                  this.a(-70, param2);
                  if (this.a(param0, param2, 0, param3)) {
                    break L2;
                  } else {
                    stackOut_11_0 = null;
                    stackIn_12_0 = stackOut_11_0;
                    return (byte[]) (Object) stackIn_12_0;
                  }
                } else {
                  break L2;
                }
              }
              if (((cm) this).field_i[param2] != null) {
                L4: {
                  if (null == ((cm) this).field_i[param2][param0]) {
                    break L4;
                  } else {
                    var7 = dk.a(false, ((cm) this).field_i[param2][param0], 0);
                    var5 = (Object) (Object) var7;
                    if (var7 != null) {
                      break L4;
                    } else {
                      throw new RuntimeException("");
                    }
                  }
                }
                L5: {
                  if (var5 != null) {
                    L6: {
                      if (1 != ((cm) this).field_d) {
                        break L6;
                      } else {
                        ((cm) this).field_i[param2][param0] = null;
                        if (-2 != ((cm) this).field_a.field_g[param2]) {
                          break L5;
                        } else {
                          ((cm) this).field_i[param2] = null;
                          if (SteelSentinels.field_G == 0) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    if (-3 != ((cm) this).field_d) {
                      break L5;
                    } else {
                      ((cm) this).field_i[param2] = null;
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                stackOut_26_0 = var5;
                stackIn_27_0 = stackOut_26_0;
                break L0;
              } else {
                throw new RuntimeException("");
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = (Object) (Object) decompiledCaughtException;
            stackOut_28_0 = var5;
            stackOut_28_1 = new StringBuilder().append("cm.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param3 == null) {
              stackOut_30_0 = stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L7;
            } else {
              stackOut_29_0 = stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L7;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + 41);
        }
        return (byte[]) (Object) stackIn_27_0;
    }

    final synchronized byte[] a(String param0, int param1, String param2) {
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
            if (((cm) this).a(true)) {
              param2 = param2.toLowerCase();
              param0 = param0.toLowerCase();
              if (param1 == -742) {
                var6 = (CharSequence) (Object) param2;
                var4_int = ((cm) this).field_a.field_n.a(ij.a(var6, false), (byte) 117);
                if (this.b(var4_int, true)) {
                  var7 = (CharSequence) (Object) param0;
                  var5 = ((cm) this).field_a.field_d[var4_int].a(ij.a(var7, false), (byte) -17);
                  stackOut_9_0 = ((cm) this).a(var4_int, (byte) 56, var5);
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
            stackOut_11_1 = new StringBuilder().append("cm.U(");
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
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44).append(param1).append(44);
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
          throw ci.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
        return stackIn_10_0;
    }

    cm(fa param0, boolean param1, int param2) {
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
        ((cm) this).field_a = null;
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
                  ((cm) this).field_f = stackIn_7_1 != 0;
                  ((cm) this).field_d = param2;
                  ((cm) this).field_o = param0;
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
            stackOut_9_1 = new StringBuilder().append("cm.<init>(");
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
          throw ci.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_l = new int[8192];
        field_c = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find a suitable opponent in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
        field_e = new int[105];
        field_n = "Unpacking sound effects";
        field_e[1] = 256;
        field_e[39] = 148;
        field_e[63] = 100;
        field_e[38] = 16;
        field_e[42] = 105;
        field_e[49] = 40;
        field_e[82] = 128;
        field_e[10] = 256;
        field_e[46] = 149;
        field_e[100] = 256;
        field_e[40] = 20;
        field_e[2] = 256;
        field_e[33] = 148;
        field_e[21] = 200;
        field_e[98] = 256;
        field_e[32] = 150;
        field_e[71] = 128;
        field_e[89] = 150;
        field_e[4] = 200;
        field_e[54] = 150;
        field_e[83] = 128;
        field_e[26] = 90;
        field_e[93] = 256;
        field_e[31] = 137;
        field_e[48] = 150;
        field_e[74] = 128;
        field_e[44] = 89;
        field_e[79] = 128;
        field_e[102] = 256;
        field_e[12] = 256;
        field_e[92] = 256;
        field_e[69] = 256;
        field_e[47] = 150;
        field_e[66] = 25;
        field_e[95] = 256;
        field_e[60] = 256;
        field_e[97] = 256;
        field_e[7] = 256;
        field_e[35] = 256;
        field_e[84] = 150;
        field_e[85] = 150;
        field_e[20] = 179;
        field_e[17] = 256;
        field_e[56] = 150;
        field_e[13] = 120;
        field_e[16] = 32;
        field_e[86] = 150;
        field_e[104] = 256;
        field_e[103] = 256;
        field_e[80] = 128;
        field_e[81] = 128;
        field_e[50] = 137;
        field_e[8] = 200;
        field_e[15] = 118;
        field_e[37] = 52;
        field_e[64] = 114;
        field_e[87] = 150;
        field_e[90] = 200;
        field_e[67] = 40;
        field_e[91] = 256;
        field_e[75] = 128;
        field_e[25] = 150;
        field_e[9] = 200;
        field_e[73] = 128;
        field_e[94] = 166;
        field_e[11] = 110;
        field_e[96] = 256;
        field_e[19] = 177;
        field_e[58] = 256;
        field_e[88] = 150;
        field_e[76] = 128;
        field_e[77] = 128;
        field_e[59] = 25;
        field_e[27] = 256;
        field_e[68] = 16;
        field_e[61] = 160;
        field_e[14] = 150;
        field_e[62] = 73;
        field_e[28] = 90;
        field_e[57] = 150;
        field_e[22] = 144;
        field_e[23] = 256;
        field_e[99] = 256;
        field_e[43] = 139;
        field_e[24] = 155;
        field_e[18] = 256;
        field_e[30] = 256;
        field_e[65] = 256;
        field_e[6] = 256;
        field_e[51] = 170;
        field_e[55] = 100;
        field_e[72] = 128;
        field_e[41] = 256;
        field_e[5] = 256;
        field_e[36] = 16;
        field_e[29] = 256;
        field_e[45] = 150;
        field_e[78] = 128;
        field_e[34] = 150;
        field_e[52] = 150;
        field_e[3] = 256;
        field_e[53] = 150;
        field_e[0] = 200;
        for (var0 = 0; var0 < field_e.length; var0++) {
            field_e[var0] = field_e[var0] * 3 / 4;
        }
        field_m = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_p = "FAVOURITES";
    }
}
