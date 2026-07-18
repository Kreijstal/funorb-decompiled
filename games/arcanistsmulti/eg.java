/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg {
    private Object[] field_c;
    private jk field_i;
    static int[] field_g;
    boolean field_h;
    static int[] field_a;
    private tl field_e;
    private Object[][] field_b;
    static String field_d;
    int field_f;

    private final synchronized boolean a(int param0, int[] param1, byte param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        Object[] var9 = null;
        int var9_int = 0;
        byte[] var9_array = null;
        int var10_int = 0;
        wk var10 = null;
        byte[] var10_array = null;
        RuntimeException var11_ref_RuntimeException = null;
        int var11 = 0;
        int var12 = 0;
        wk var13 = null;
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
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        Object stackIn_16_0 = null;
        int[] stackIn_16_1 = null;
        int stackIn_30_0 = 0;
        Object stackIn_32_0 = null;
        int[] stackIn_32_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        int stackIn_56_2 = 0;
        int stackIn_68_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_90_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_116_0 = 0;
        int stackIn_126_0 = 0;
        int stackIn_135_0 = 0;
        int stackIn_163_0 = 0;
        RuntimeException stackIn_165_0 = null;
        StringBuilder stackIn_165_1 = null;
        RuntimeException stackIn_167_0 = null;
        StringBuilder stackIn_167_1 = null;
        RuntimeException stackIn_168_0 = null;
        StringBuilder stackIn_168_1 = null;
        String stackIn_168_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        Object stackOut_15_0 = null;
        int[] stackOut_15_1 = null;
        Object stackOut_31_0 = null;
        int[] stackOut_31_1 = null;
        int stackOut_29_0 = 0;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        int stackOut_55_2 = 0;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        int stackOut_53_2 = 0;
        int stackOut_67_0 = 0;
        int stackOut_83_0 = 0;
        int stackOut_89_0 = 0;
        int stackOut_85_0 = 0;
        int stackOut_106_0 = 0;
        int stackOut_115_0 = 0;
        int stackOut_125_0 = 0;
        int stackOut_134_0 = 0;
        int stackOut_162_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_164_0 = null;
        StringBuilder stackOut_164_1 = null;
        RuntimeException stackOut_167_0 = null;
        StringBuilder stackOut_167_1 = null;
        String stackOut_167_2 = null;
        RuntimeException stackOut_165_0 = null;
        StringBuilder stackOut_165_1 = null;
        String stackOut_165_2 = null;
        var22 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (!this.b(-127, param3)) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              if (((eg) this).field_c[param3] != null) {
                L1: {
                  var5_int = ((eg) this).field_i.field_b[param3];
                  var6 = ((eg) this).field_i.field_e[param3];
                  if (((eg) this).field_b[param3] == null) {
                    ((eg) this).field_b[param3] = new Object[((eg) this).field_i.field_i[param3]];
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var7 = ((eg) this).field_b[param3];
                var8 = 1;
                var9_int = 0;
                L2: while (true) {
                  L3: {
                    L4: {
                      if (var5_int <= var9_int) {
                        break L4;
                      } else {
                        stackOut_15_0 = null;
                        stackOut_15_1 = (int[]) var6;
                        stackIn_32_0 = stackOut_15_0;
                        stackIn_32_1 = stackOut_15_1;
                        stackIn_16_0 = stackOut_15_0;
                        stackIn_16_1 = stackOut_15_1;
                        if (var22 != 0) {
                          break L3;
                        } else {
                          L5: {
                            L6: {
                              if (stackIn_16_0 != (Object) (Object) stackIn_16_1) {
                                break L6;
                              } else {
                                var10_int = var9_int;
                                if (var22 == 0) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            var10_int = var6[var9_int];
                            break L5;
                          }
                          L7: {
                            if (var7[var10_int] == null) {
                              var8 = 0;
                              if (var22 == 0) {
                                break L4;
                              } else {
                                break L7;
                              }
                            } else {
                              break L7;
                            }
                          }
                          var9_int++;
                          if (var22 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    if (var8 == 0) {
                      stackOut_31_0 = null;
                      stackOut_31_1 = (int[]) param1;
                      stackIn_32_0 = stackOut_31_0;
                      stackIn_32_1 = stackOut_31_1;
                      break L3;
                    } else {
                      stackOut_29_0 = 1;
                      stackIn_30_0 = stackOut_29_0;
                      return stackIn_30_0 != 0;
                    }
                  }
                  L8: {
                    L9: {
                      if (stackIn_32_0 == (Object) (Object) stackIn_32_1) {
                        break L9;
                      } else {
                        L10: {
                          if (param1[0] != 0) {
                            break L10;
                          } else {
                            if (param1[1] != 0) {
                              break L10;
                            } else {
                              if (param1[2] != 0) {
                                break L10;
                              } else {
                                if (param1[3] != 0) {
                                  break L10;
                                } else {
                                  break L9;
                                }
                              }
                            }
                          }
                        }
                        var9_array = td.a(((eg) this).field_c[param3], -128, true);
                        var10 = new wk(var9_array);
                        var10.a(param1, 5, var10.field_j.length, 127);
                        break L8;
                      }
                    }
                    var9_array = td.a(((eg) this).field_c[param3], -19, false);
                    break L8;
                  }
                  try {
                    L11: {
                      L12: {
                        if (param2 >= 73) {
                          break L12;
                        } else {
                          boolean discarded$1 = ((eg) this).a(false, (String) null);
                          break L12;
                        }
                      }
                      var10_array = hb.a(false, var9_array);
                      break L11;
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L13: {
                      var11_ref_RuntimeException = decompiledCaughtException;
                      stackOut_52_0 = (RuntimeException) var11_ref_RuntimeException;
                      stackOut_52_1 = new StringBuilder();
                      stackIn_55_0 = stackOut_52_0;
                      stackIn_55_1 = stackOut_52_1;
                      stackIn_53_0 = stackOut_52_0;
                      stackIn_53_1 = stackOut_52_1;
                      if (null == param1) {
                        stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
                        stackOut_55_1 = (StringBuilder) (Object) stackIn_55_1;
                        stackOut_55_2 = 0;
                        stackIn_56_0 = stackOut_55_0;
                        stackIn_56_1 = stackOut_55_1;
                        stackIn_56_2 = stackOut_55_2;
                        break L13;
                      } else {
                        stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
                        stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
                        stackOut_53_2 = 1;
                        stackIn_56_0 = stackOut_53_0;
                        stackIn_56_1 = stackOut_53_1;
                        stackIn_56_2 = stackOut_53_2;
                        break L13;
                      }
                    }
                    throw aa.a((Throwable) (Object) stackIn_56_0, (stackIn_56_2 != 0) + " " + param3 + " " + var9_array.length + " " + mj.a(var9_array.length, (byte) -112, var9_array) + " " + mj.a(-2 + var9_array.length, (byte) -86, var9_array) + " " + ((eg) this).field_i.field_h[param3] + " " + ((eg) this).field_i.field_p);
                  }
                  L14: {
                    if (((eg) this).field_h) {
                      ((eg) this).field_c[param3] = null;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    L16: {
                      L17: {
                        if (var5_int <= 1) {
                          break L17;
                        } else {
                          L18: {
                            if (((eg) this).field_f != 2) {
                              break L18;
                            } else {
                              var11 = var10_array.length;
                              var11--;
                              var12 = 255 & var10_array[var11];
                              var11 = var11 - var5_int * (var12 * 4);
                              var13 = new wk(var10_array);
                              var14_int = 0;
                              var15_int = 0;
                              var13.field_g = var11;
                              var16 = 0;
                              L19: while (true) {
                                L20: {
                                  L21: {
                                    if (var16 >= var12) {
                                      break L21;
                                    } else {
                                      var17 = 0;
                                      stackOut_67_0 = 0;
                                      stackIn_84_0 = stackOut_67_0;
                                      stackIn_68_0 = stackOut_67_0;
                                      if (var22 != 0) {
                                        break L20;
                                      } else {
                                        var18 = stackIn_68_0;
                                        L22: while (true) {
                                          L23: {
                                            L24: {
                                              if (var5_int <= var18) {
                                                break L24;
                                              } else {
                                                var17 = var17 + var13.d(-10674);
                                                if (var22 != 0) {
                                                  break L23;
                                                } else {
                                                  L25: {
                                                    L26: {
                                                      if (null != var6) {
                                                        break L26;
                                                      } else {
                                                        var19 = var18;
                                                        if (var22 == 0) {
                                                          break L25;
                                                        } else {
                                                          break L26;
                                                        }
                                                      }
                                                    }
                                                    var19 = var6[var18];
                                                    break L25;
                                                  }
                                                  L27: {
                                                    if (~param0 == ~var19) {
                                                      var14_int = var14_int + var17;
                                                      var15_int = var19;
                                                      break L27;
                                                    } else {
                                                      break L27;
                                                    }
                                                  }
                                                  var18++;
                                                  if (var22 == 0) {
                                                    continue L22;
                                                  } else {
                                                    break L24;
                                                  }
                                                }
                                              }
                                            }
                                            var16++;
                                            break L23;
                                          }
                                          if (var22 == 0) {
                                            continue L19;
                                          } else {
                                            break L21;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  stackOut_83_0 = -1;
                                  stackIn_84_0 = stackOut_83_0;
                                  break L20;
                                }
                                if (stackIn_84_0 != ~var14_int) {
                                  var16_ref_byte__ = new byte[var14_int];
                                  var13.field_g = var11;
                                  var14_int = 0;
                                  var17 = 0;
                                  var18 = 0;
                                  L28: while (true) {
                                    L29: {
                                      if (var18 >= var12) {
                                        break L29;
                                      } else {
                                        var19 = 0;
                                        stackOut_89_0 = 0;
                                        stackIn_163_0 = stackOut_89_0;
                                        stackIn_90_0 = stackOut_89_0;
                                        if (var22 != 0) {
                                          break L15;
                                        } else {
                                          var20 = stackIn_90_0;
                                          L30: while (true) {
                                            L31: {
                                              L32: {
                                                if (var20 >= var5_int) {
                                                  break L32;
                                                } else {
                                                  var19 = var19 + var13.d(-10674);
                                                  if (var22 != 0) {
                                                    break L31;
                                                  } else {
                                                    L33: {
                                                      L34: {
                                                        if (null == var6) {
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
                                                      if (~var21 != ~param0) {
                                                        break L35;
                                                      } else {
                                                        sf.a(var10_array, var17, var16_ref_byte__, var14_int, var19);
                                                        var14_int = var14_int + var19;
                                                        break L35;
                                                      }
                                                    }
                                                    var17 = var17 + var19;
                                                    var20++;
                                                    if (var22 == 0) {
                                                      continue L30;
                                                    } else {
                                                      break L32;
                                                    }
                                                  }
                                                }
                                              }
                                              var18++;
                                              break L31;
                                            }
                                            if (var22 == 0) {
                                              continue L28;
                                            } else {
                                              break L29;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    var7[var15_int] = (Object) (Object) var16_ref_byte__;
                                    if (var22 == 0) {
                                      break L16;
                                    } else {
                                      break L18;
                                    }
                                  }
                                } else {
                                  stackOut_85_0 = 1;
                                  stackIn_86_0 = stackOut_85_0;
                                  return stackIn_86_0 != 0;
                                }
                              }
                            }
                          }
                          var11 = var10_array.length;
                          var11--;
                          var12 = 255 & var10_array[var11];
                          var11 = var11 - var12 * var5_int * 4;
                          var13 = new wk(var10_array);
                          var14 = new int[var5_int];
                          var13.field_g = var11;
                          var15_int = 0;
                          L36: while (true) {
                            L37: {
                              L38: {
                                if (var12 <= var15_int) {
                                  break L38;
                                } else {
                                  var16 = 0;
                                  stackOut_106_0 = 0;
                                  stackIn_116_0 = stackOut_106_0;
                                  stackIn_107_0 = stackOut_106_0;
                                  if (var22 != 0) {
                                    break L37;
                                  } else {
                                    var17 = stackIn_107_0;
                                    L39: while (true) {
                                      L40: {
                                        L41: {
                                          if (~var17 <= ~var5_int) {
                                            break L41;
                                          } else {
                                            var16 = var16 + var13.d(-10674);
                                            var14[var17] = var14[var17] + var16;
                                            var17++;
                                            if (var22 != 0) {
                                              break L40;
                                            } else {
                                              if (var22 == 0) {
                                                continue L39;
                                              } else {
                                                break L41;
                                              }
                                            }
                                          }
                                        }
                                        var15_int++;
                                        break L40;
                                      }
                                      if (var22 == 0) {
                                        continue L36;
                                      } else {
                                        break L38;
                                      }
                                    }
                                  }
                                }
                              }
                              stackOut_115_0 = var5_int;
                              stackIn_116_0 = stackOut_115_0;
                              break L37;
                            }
                            var15 = new byte[stackIn_116_0][];
                            var16 = 0;
                            L42: while (true) {
                              L43: {
                                L44: {
                                  if (~var5_int >= ~var16) {
                                    break L44;
                                  } else {
                                    var15[var16] = new byte[var14[var16]];
                                    var14[var16] = 0;
                                    var16++;
                                    if (var22 != 0) {
                                      break L43;
                                    } else {
                                      if (var22 == 0) {
                                        continue L42;
                                      } else {
                                        break L44;
                                      }
                                    }
                                  }
                                }
                                var13.field_g = var11;
                                var16 = 0;
                                break L43;
                              }
                              var17 = 0;
                              L45: while (true) {
                                L46: {
                                  L47: {
                                    if (var17 >= var12) {
                                      break L47;
                                    } else {
                                      var18 = 0;
                                      stackOut_125_0 = 0;
                                      stackIn_135_0 = stackOut_125_0;
                                      stackIn_126_0 = stackOut_125_0;
                                      if (var22 != 0) {
                                        break L46;
                                      } else {
                                        var19 = stackIn_126_0;
                                        L48: while (true) {
                                          L49: {
                                            L50: {
                                              if (~var19 <= ~var5_int) {
                                                break L50;
                                              } else {
                                                var18 = var18 + var13.d(-10674);
                                                sf.a(var10_array, var16, var15[var19], var14[var19], var18);
                                                var14[var19] = var14[var19] + var18;
                                                var16 = var16 + var18;
                                                var19++;
                                                if (var22 != 0) {
                                                  break L49;
                                                } else {
                                                  if (var22 == 0) {
                                                    continue L48;
                                                  } else {
                                                    break L50;
                                                  }
                                                }
                                              }
                                            }
                                            var17++;
                                            break L49;
                                          }
                                          if (var22 == 0) {
                                            continue L45;
                                          } else {
                                            break L47;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  stackOut_134_0 = 0;
                                  stackIn_135_0 = stackOut_134_0;
                                  break L46;
                                }
                                var17 = stackIn_135_0;
                                L51: while (true) {
                                  L52: {
                                    if (var17 >= var5_int) {
                                      break L52;
                                    } else {
                                      if (var22 != 0) {
                                        break L16;
                                      } else {
                                        L53: {
                                          L54: {
                                            if (var6 == null) {
                                              break L54;
                                            } else {
                                              var18 = var6[var17];
                                              if (var22 == 0) {
                                                break L53;
                                              } else {
                                                break L54;
                                              }
                                            }
                                          }
                                          var18 = var17;
                                          break L53;
                                        }
                                        L55: {
                                          L56: {
                                            if (0 != ((eg) this).field_f) {
                                              break L56;
                                            } else {
                                              var7[var18] = bi.a(false, 0, var15[var17]);
                                              if (var22 == 0) {
                                                break L55;
                                              } else {
                                                break L56;
                                              }
                                            }
                                          }
                                          var7[var18] = (Object) (Object) var15[var17];
                                          break L55;
                                        }
                                        var17++;
                                        if (var22 == 0) {
                                          continue L51;
                                        } else {
                                          break L52;
                                        }
                                      }
                                    }
                                  }
                                  if (var22 == 0) {
                                    break L16;
                                  } else {
                                    break L17;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      L57: {
                        L58: {
                          if (var6 != null) {
                            break L58;
                          } else {
                            var11 = 0;
                            if (var22 == 0) {
                              break L57;
                            } else {
                              break L58;
                            }
                          }
                        }
                        var11 = var6[0];
                        break L57;
                      }
                      L59: {
                        if (((eg) this).field_f == 0) {
                          break L59;
                        } else {
                          var7[var11] = (Object) (Object) var10_array;
                          if (var22 == 0) {
                            break L16;
                          } else {
                            break L59;
                          }
                        }
                      }
                      var7[var11] = bi.a(false, 0, var10_array);
                      break L16;
                    }
                    stackOut_162_0 = 1;
                    stackIn_163_0 = stackOut_162_0;
                    break L15;
                  }
                  break L0;
                }
              } else {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L60: {
            var5 = decompiledCaughtException;
            stackOut_164_0 = (RuntimeException) var5;
            stackOut_164_1 = new StringBuilder().append("eg.M(").append(param0).append(',');
            stackIn_167_0 = stackOut_164_0;
            stackIn_167_1 = stackOut_164_1;
            stackIn_165_0 = stackOut_164_0;
            stackIn_165_1 = stackOut_164_1;
            if (param1 == null) {
              stackOut_167_0 = (RuntimeException) (Object) stackIn_167_0;
              stackOut_167_1 = (StringBuilder) (Object) stackIn_167_1;
              stackOut_167_2 = "null";
              stackIn_168_0 = stackOut_167_0;
              stackIn_168_1 = stackOut_167_1;
              stackIn_168_2 = stackOut_167_2;
              break L60;
            } else {
              stackOut_165_0 = (RuntimeException) (Object) stackIn_165_0;
              stackOut_165_1 = (StringBuilder) (Object) stackIn_165_1;
              stackOut_165_2 = "{...}";
              stackIn_168_0 = stackOut_165_0;
              stackIn_168_1 = stackOut_165_1;
              stackIn_168_2 = stackOut_165_2;
              break L60;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_168_0, stackIn_168_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_163_0 != 0;
    }

    final int a(String param0, byte param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            if (!this.b(-98, param2)) {
              stackOut_3_0 = -1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              param0 = param0.toLowerCase();
              if (param1 > 21) {
                var4_int = ((eg) this).field_i.field_c[param2].a(ml.a((CharSequence) (Object) param0, -76), -140);
                if (!this.a(var4_int, 0, param2)) {
                  stackOut_11_0 = -1;
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0;
                } else {
                  stackOut_13_0 = var4_int;
                  stackIn_14_0 = stackOut_13_0;
                  break L0;
                }
              } else {
                stackOut_6_0 = -17;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4;
            stackOut_15_1 = new StringBuilder().append("eg.C(");
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L1;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L1;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_14_0;
    }

    final synchronized boolean a(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_2_0 = 0;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (((eg) this).c(-10923)) {
              var2_int = 1;
              var4 = 67 / ((param0 - 46) / 58);
              var3 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (~((eg) this).field_i.field_r.length >= ~var3) {
                      break L3;
                    } else {
                      stackOut_6_0 = ((eg) this).field_i.field_r[var3];
                      stackIn_16_0 = stackOut_6_0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var6 != 0) {
                        break L2;
                      } else {
                        L4: {
                          var5 = stackIn_7_0;
                          if (((eg) this).field_c[var5] != null) {
                            break L4;
                          } else {
                            this.c(var5, -126);
                            if (null == ((eg) this).field_c[var5]) {
                              var2_int = 0;
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                        }
                        var3++;
                        if (var6 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_15_0 = var2_int;
                  stackIn_16_0 = stackOut_15_0;
                  break L2;
                }
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "eg.E(" + param0 + ')');
        }
        return stackIn_16_0 != 0;
    }

    final synchronized int a(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_2_0 = 0;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (((eg) this).c(-10923)) {
              var2_int = 0;
              var3 = 0;
              var4 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var4 >= ((eg) this).field_c.length) {
                      break L3;
                    } else {
                      stackOut_6_0 = -1;
                      stackOut_6_1 = ~((eg) this).field_i.field_b[var4];
                      stackIn_13_0 = stackOut_6_0;
                      stackIn_13_1 = stackOut_6_1;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      if (var6 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (stackIn_7_0 <= stackIn_7_1) {
                            break L4;
                          } else {
                            var2_int += 100;
                            var3 = var3 + ((eg) this).a(var4, -23760);
                            break L4;
                          }
                        }
                        var4++;
                        if (var6 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_12_0 = 0;
                  stackOut_12_1 = var2_int;
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  break L2;
                }
                if (stackIn_13_0 == stackIn_13_1) {
                  stackOut_15_0 = 100;
                  stackIn_16_0 = stackOut_15_0;
                  return stackIn_16_0;
                } else {
                  var4 = var3 * 100 / var2_int;
                  var5 = -67 / ((param0 - 43) / 33);
                  stackOut_17_0 = var4;
                  stackIn_18_0 = stackOut_17_0;
                  break L0;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "eg.J(" + param0 + ')');
        }
        return stackIn_18_0;
    }

    private final synchronized boolean a(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (((eg) this).c(-10923)) {
              L1: {
                if (param2 < param1) {
                  break L1;
                } else {
                  if (param0 < 0) {
                    break L1;
                  } else {
                    if (~((eg) this).field_i.field_i.length >= ~param2) {
                      break L1;
                    } else {
                      if (~param0 <= ~((eg) this).field_i.field_i[param2]) {
                        break L1;
                      } else {
                        stackOut_20_0 = 1;
                        stackIn_21_0 = stackOut_20_0;
                        break L0;
                      }
                    }
                  }
                }
              }
              if (!ji.field_d) {
                stackOut_18_0 = 0;
                stackIn_19_0 = stackOut_18_0;
                return stackIn_19_0 != 0;
              } else {
                throw new IllegalArgumentException(param2 + " " + param0);
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var4, "eg.R(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_21_0 != 0;
    }

    final synchronized boolean a(boolean param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (this.b(-69, param1)) {
              if (((eg) this).field_c[param1] == null) {
                L1: {
                  if (param0) {
                    break L1;
                  } else {
                    eg.a(((boolean[]) ((eg) this).field_c[0])[14]);
                    break L1;
                  }
                }
                this.c(param1, -125);
                if (null == ((eg) this).field_c[param1]) {
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  break L0;
                } else {
                  stackOut_10_0 = 1;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0 != 0;
                }
              } else {
                stackOut_4_0 = 1;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0 != 0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var3, "eg.N(" + param0 + ',' + param1 + ')');
        }
        return stackIn_13_0 != 0;
    }

    final static void b(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 403300833) {
                break L1;
              } else {
                field_a = null;
                break L1;
              }
            }
            var1_int = mb.j((byte) 19);
            var2 = mo.b(25117);
            ol.field_f.a(-mj.field_r + bk.field_I, -tg.field_d + qe.field_o, -98, var1_int - -(mj.field_r << -1877115007), (tg.field_d << 403300833) + var2);
            mn.d(-1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var1, "eg.A(" + param0 + ')');
        }
    }

    final int b(byte param0) {
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 < -44) {
                break L1;
              } else {
                ((eg) this).field_c = (Object[]) ((Object[]) ((eg) this).field_c[0])[6];
                break L1;
              }
            }
            if (!((eg) this).c(-10923)) {
              stackOut_6_0 = -1;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            } else {
              stackOut_8_0 = ((eg) this).field_i.field_i.length;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "eg.G(" + param0 + ')');
        }
        return stackIn_9_0;
    }

    final synchronized int a(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_6_0 = 0;
        try {
          L0: {
            if (!this.b(-124, param0)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (((eg) this).field_c[param0] == null) {
                L1: {
                  if (param1 == -23760) {
                    break L1;
                  } else {
                    ((eg) this).field_i = (jk) ((eg) this).field_c[2];
                    break L1;
                  }
                }
                stackOut_11_0 = ((eg) this).field_e.a(param0, (byte) 124);
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                stackOut_6_0 = 100;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var3, "eg.AA(" + param0 + ',' + param1 + ')');
        }
        return stackIn_12_0;
    }

    final synchronized byte[] d(int param0, int param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_5_0 = null;
        Object stackIn_8_0 = null;
        byte[] stackIn_16_0 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_15_0 = null;
        Object stackOut_7_0 = null;
        byte[] stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        try {
          if (((eg) this).c(-10923)) {
            if (1 != ((eg) this).field_i.field_i.length) {
              if (this.b(-41, param0)) {
                L0: {
                  if (param1 == 31662) {
                    break L0;
                  } else {
                    int discarded$2 = ((eg) this).c((String) null, ((int[]) ((eg) this).field_c[0])[16]);
                    break L0;
                  }
                }
                if (((eg) this).field_i.field_i[param0] == 1) {
                  stackOut_15_0 = ((eg) this).b(0, 26219, param0);
                  stackIn_16_0 = stackOut_15_0;
                  return stackIn_16_0;
                } else {
                  throw new RuntimeException();
                }
              } else {
                stackOut_7_0 = null;
                stackIn_8_0 = stackOut_7_0;
                return (byte[]) (Object) stackIn_8_0;
              }
            } else {
              stackOut_4_0 = ((eg) this).b(param0, param1 + -5443, 0);
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          } else {
            stackOut_1_0 = null;
            stackIn_2_0 = stackOut_1_0;
            return (byte[]) (Object) stackIn_2_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var3, "eg.K(" + param0 + ',' + param1 + ')');
        }
    }

    final int a(int param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        try {
          L0: {
            L1: {
              if (param1 == -60) {
                break L1;
              } else {
                ((eg) this).field_c[1] = null;
                break L1;
              }
            }
            if (!this.b(-35, param0)) {
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            } else {
              stackOut_8_0 = ((eg) this).field_i.field_i[param0];
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var3, "eg.L(" + param0 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    private final synchronized boolean b(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_15_0 = 0;
        try {
          L0: {
            if (!((eg) this).c(-10923)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                if (param1 < 0) {
                  break L1;
                } else {
                  if (((eg) this).field_i.field_i.length <= param1) {
                    break L1;
                  } else {
                    if (((eg) this).field_i.field_i[param1] == 0) {
                      break L1;
                    } else {
                      if (param0 <= -27) {
                        stackOut_21_0 = 1;
                        stackIn_22_0 = stackOut_21_0;
                        break L0;
                      } else {
                        stackOut_19_0 = 1;
                        stackIn_20_0 = stackOut_19_0;
                        return stackIn_20_0 != 0;
                      }
                    }
                  }
                }
              }
              if (ji.field_d) {
                throw new IllegalArgumentException(Integer.toString(param1));
              } else {
                stackOut_15_0 = 0;
                stackIn_16_0 = stackOut_15_0;
                return stackIn_16_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var3, "eg.S(" + param0 + ',' + param1 + ')');
        }
        return stackIn_22_0 != 0;
    }

    final int c(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (!((eg) this).c(-10923)) {
              stackOut_3_0 = -1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              var3_int = 94 % ((23 - param1) / 61);
              param0 = param0.toLowerCase();
              var4 = ((eg) this).field_i.field_l.a(ml.a((CharSequence) (Object) param0, -83), -140);
              if (!this.b(-106, var4)) {
                stackOut_8_0 = -1;
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0;
              } else {
                stackOut_10_0 = var4;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("eg.B(");
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L1;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ')');
        }
        return stackIn_11_0;
    }

    final synchronized boolean c(int param0) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        try {
          L0: {
            L1: {
              if (null != ((eg) this).field_i) {
                break L1;
              } else {
                ((eg) this).field_i = ((eg) this).field_e.d((byte) 122);
                if (((eg) this).field_i != null) {
                  ((eg) this).field_c = new Object[((eg) this).field_i.field_f];
                  ((eg) this).field_b = new Object[((eg) this).field_i.field_f][];
                  break L1;
                } else {
                  stackOut_4_0 = 0;
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0 != 0;
                }
              }
            }
            if (param0 == -10923) {
              stackOut_10_0 = 1;
              stackIn_11_0 = stackOut_10_0;
              break L0;
            } else {
              stackOut_8_0 = 0;
              stackIn_9_0 = stackOut_8_0;
              return stackIn_9_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "eg.W(" + param0 + ')');
        }
        return stackIn_11_0 != 0;
    }

    final int b(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            if (!((eg) this).c(-10923)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (param1 > 79) {
                param0 = param0.toLowerCase();
                var3_int = ((eg) this).field_i.field_l.a(ml.a((CharSequence) (Object) param0, 80), -140);
                stackOut_8_0 = ((eg) this).a(var3_int, -23760);
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_6_0 = 91;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("eg.F(");
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L1;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    final boolean a(boolean param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        int stackIn_15_3 = 0;
        boolean stackIn_16_0 = false;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        int stackOut_14_3 = 0;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        int stackOut_12_3 = 0;
        boolean stackOut_15_0 = false;
        int stackOut_9_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            if (!((eg) this).c(-10923)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              param2 = param2.toLowerCase();
              param1 = param1.toLowerCase();
              var4_int = ((eg) this).field_i.field_l.a(ml.a((CharSequence) (Object) param2, 71), -140);
              if (this.b(-43, var4_int)) {
                var5 = ((eg) this).field_i.field_c[var4_int].a(ml.a((CharSequence) (Object) param1, -78), -140);
                if (param0) {
                  L1: {
                    stackOut_11_0 = this;
                    stackOut_11_1 = var4_int;
                    stackOut_11_2 = var5;
                    stackIn_14_0 = stackOut_11_0;
                    stackIn_14_1 = stackOut_11_1;
                    stackIn_14_2 = stackOut_11_2;
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    stackIn_12_2 = stackOut_11_2;
                    if (param0) {
                      stackOut_14_0 = this;
                      stackOut_14_1 = stackIn_14_1;
                      stackOut_14_2 = stackIn_14_2;
                      stackOut_14_3 = 0;
                      stackIn_15_0 = stackOut_14_0;
                      stackIn_15_1 = stackOut_14_1;
                      stackIn_15_2 = stackOut_14_2;
                      stackIn_15_3 = stackOut_14_3;
                      break L1;
                    } else {
                      stackOut_12_0 = this;
                      stackOut_12_1 = stackIn_12_1;
                      stackOut_12_2 = stackIn_12_2;
                      stackOut_12_3 = 1;
                      stackIn_15_0 = stackOut_12_0;
                      stackIn_15_1 = stackOut_12_1;
                      stackIn_15_2 = stackOut_12_2;
                      stackIn_15_3 = stackOut_12_3;
                      break L1;
                    }
                  }
                  stackOut_15_0 = ((eg) this).a(stackIn_15_1, stackIn_15_2, stackIn_15_3 != 0);
                  stackIn_16_0 = stackOut_15_0;
                  break L0;
                } else {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0 != 0;
                }
              } else {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var4;
            stackOut_17_1 = new StringBuilder().append("eg.I(").append(param0).append(',');
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L2;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L2;
            }
          }
          L3: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param2 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L3;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ')');
        }
        return stackIn_16_0;
    }

    final boolean a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (((eg) this).c(-10923)) {
              L1: {
                if (param1 == -24417) {
                  break L1;
                } else {
                  ((eg) this).field_e = null;
                  break L1;
                }
              }
              param0 = param0.toLowerCase();
              var3_int = ((eg) this).field_i.field_l.a(ml.a((CharSequence) (Object) param0, 82), -140);
              stackOut_6_0 = ((eg) this).a(true, var3_int);
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("eg.H(");
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    public static void a(boolean param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_d = null;
              field_g = null;
              if (!param0) {
                break L1;
              } else {
                eg.a(true);
                break L1;
              }
            }
            field_a = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var1, "eg.T(" + param0 + ')');
        }
    }

    final byte[] b(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              if (param1 == 26219) {
                break L1;
              } else {
                int discarded$2 = ((eg) this).a(-55, 23);
                break L1;
              }
            }
            stackOut_3_0 = this.a(param0, param2, -10452, (int[]) null);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var4, "eg.U(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_4_0;
    }

    final synchronized boolean a(int param0, int param1, boolean param2) {
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_20_0 = 0;
        try {
          L0: {
            if (!this.a(param1, 0, param0)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                if (null == ((eg) this).field_b[param0]) {
                  break L1;
                } else {
                  if (((eg) this).field_b[param0][param1] == null) {
                    break L1;
                  } else {
                    stackOut_9_0 = 1;
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0 != 0;
                  }
                }
              }
              L2: {
                if (!param2) {
                  break L2;
                } else {
                  ((eg) this).field_e = null;
                  break L2;
                }
              }
              if (((eg) this).field_c[param0] != null) {
                stackOut_17_0 = 1;
                stackIn_18_0 = stackOut_17_0;
                return stackIn_18_0 != 0;
              } else {
                this.c(param0, -125);
                if (null == ((eg) this).field_c[param0]) {
                  stackOut_22_0 = 0;
                  stackIn_23_0 = stackOut_22_0;
                  break L0;
                } else {
                  stackOut_20_0 = 1;
                  stackIn_21_0 = stackOut_20_0;
                  return stackIn_21_0 != 0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var4, "eg.O(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_23_0 != 0;
    }

    private final synchronized void c(int param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 < -124) {
              L1: {
                L2: {
                  if (!((eg) this).field_h) {
                    break L2;
                  } else {
                    ((eg) this).field_c[param0] = (Object) (Object) ((eg) this).field_e.a(param0, true);
                    if (!ArcanistsMulti.field_G) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                ((eg) this).field_c[param0] = bi.a(false, 0, ((eg) this).field_e.a(param0, true));
                break L1;
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var3, "eg.Q(" + param0 + ',' + param1 + ')');
        }
    }

    private final synchronized byte[] a(int param0, int param1, int param2, int[] param3) {
        Object var5 = null;
        int var6 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_17_0 = null;
        Object stackIn_44_0 = null;
        Object stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        Object stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        Object stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_16_0 = null;
        Object stackOut_43_0 = null;
        Object stackOut_6_0 = null;
        Object stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        Object stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        Object stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        try {
          L0: {
            if (!this.a(param0, 0, param1)) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (byte[]) (Object) stackIn_4_0;
            } else {
              if (param2 == -10452) {
                L1: {
                  L2: {
                    var5 = null;
                    if (((eg) this).field_b[param1] == null) {
                      break L2;
                    } else {
                      if (null != ((eg) this).field_b[param1][param0]) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var6 = this.a(param0, param3, (byte) 80, param1) ? 1 : 0;
                  if (var6 != 0) {
                    break L1;
                  } else {
                    this.c(param1, -125);
                    var6 = this.a(param0, param3, (byte) 84, param1) ? 1 : 0;
                    if (var6 == 0) {
                      stackOut_16_0 = null;
                      stackIn_17_0 = stackOut_16_0;
                      return (byte[]) (Object) stackIn_17_0;
                    } else {
                      break L1;
                    }
                  }
                }
                if (((eg) this).field_b[param1] == null) {
                  throw new RuntimeException("");
                } else {
                  L3: {
                    if (null != ((eg) this).field_b[param1][param0]) {
                      var5 = (Object) (Object) td.a(((eg) this).field_b[param1][param0], param2 ^ -10399, false);
                      if (null != var5) {
                        break L3;
                      } else {
                        throw new RuntimeException("");
                      }
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (null == var5) {
                      break L4;
                    } else {
                      L5: {
                        if (((eg) this).field_f == 1) {
                          break L5;
                        } else {
                          if (((eg) this).field_f != 2) {
                            break L4;
                          } else {
                            ((eg) this).field_b[param1] = null;
                            if (!ArcanistsMulti.field_G) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      ((eg) this).field_b[param1][param0] = null;
                      if (((eg) this).field_i.field_i[param1] != 1) {
                        break L4;
                      } else {
                        ((eg) this).field_b[param1] = null;
                        break L4;
                      }
                    }
                  }
                  stackOut_43_0 = var5;
                  stackIn_44_0 = stackOut_43_0;
                  break L0;
                }
              } else {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (byte[]) (Object) stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = (Object) (Object) decompiledCaughtException;
            stackOut_45_0 = var5;
            stackOut_45_1 = new StringBuilder().append("eg.BA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_48_0 = stackOut_45_0;
            stackIn_48_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param3 == null) {
              stackOut_48_0 = stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "null";
              stackIn_49_0 = stackOut_48_0;
              stackIn_49_1 = stackOut_48_1;
              stackIn_49_2 = stackOut_48_2;
              break L6;
            } else {
              stackOut_46_0 = stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "{...}";
              stackIn_49_0 = stackOut_46_0;
              stackIn_49_1 = stackOut_46_1;
              stackIn_49_2 = stackOut_46_2;
              break L6;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_49_0, stackIn_49_2 + ')');
        }
        return (byte[]) (Object) stackIn_44_0;
    }

    final synchronized byte[] a(String param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_10_0 = null;
        byte[] stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_6_0 = null;
        byte[] stackOut_11_0 = null;
        Object stackOut_9_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            if (((eg) this).c(param2 + -10922)) {
              param1 = param1.toLowerCase();
              param0 = param0.toLowerCase();
              var4_int = ((eg) this).field_i.field_l.a(ml.a((CharSequence) (Object) param1, param2 ^ 79), -140);
              if (!this.b(-125, var4_int)) {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (byte[]) (Object) stackIn_7_0;
              } else {
                var5 = ((eg) this).field_i.field_c[var4_int].a(ml.a((CharSequence) (Object) param0, param2 + -123), -140);
                if (param2 == -1) {
                  stackOut_11_0 = ((eg) this).b(var5, 26219, var4_int);
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  stackOut_9_0 = null;
                  stackIn_10_0 = stackOut_9_0;
                  return (byte[]) (Object) stackIn_10_0;
                }
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
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("eg.D(");
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L1;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L1;
            }
          }
          L2: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L2;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param2 + ')');
        }
        return stackIn_12_0;
    }

    final boolean a(boolean param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (((eg) this).c(-10923)) {
              L1: {
                param1 = param1.toLowerCase();
                if (param0) {
                  break L1;
                } else {
                  byte[] discarded$2 = ((eg) this).a((String) ((Object[]) ((Object[]) ((eg) this).field_c[6])[19])[0], (String) ((eg) this).field_c[2], -82);
                  break L1;
                }
              }
              var3_int = ((eg) this).field_i.field_l.a(ml.a((CharSequence) (Object) param1, 116), -140);
              if (var3_int >= 0) {
                stackOut_9_0 = 1;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0 != 0;
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
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("eg.V(").append(param0).append(',');
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final static void a(java.awt.Canvas param0, byte param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (11 == fj.field_j) {
                pe.h(7807);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              gi.a(ii.field_f, kl.field_C, af.field_Hb, (byte) -100);
              kn.a(param0, (byte) -112, 0, 0);
              if (param1 <= -15) {
                break L2;
              } else {
                eg.a((java.awt.Canvas) null, (byte) -58);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var2;
            stackOut_8_1 = new StringBuilder().append("eg.P(");
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ')');
        }
    }

    eg(tl param0, boolean param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        ((eg) this).field_i = null;
        try {
          L0: {
            L1: {
              if (0 > param2) {
                break L1;
              } else {
                if (param2 > 2) {
                  break L1;
                } else {
                  ((eg) this).field_f = param2;
                  ((eg) this).field_h = param1;
                  ((eg) this).field_e = param0;
                  break L0;
                }
              }
            }
            throw new IllegalArgumentException("");
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) runtimeException;
            stackOut_8_1 = new StringBuilder().append("eg.<init>(");
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new int[]{2, 20, 21, 6, 5, 13};
        field_a = new int[8192];
        field_d = "Resign";
    }
}
