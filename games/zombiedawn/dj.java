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
        Object[] var9 = null;
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
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int[] stackIn_16_0 = null;
        int stackIn_32_0 = 0;
        int[] stackIn_48_0 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        int stackIn_58_2 = 0;
        int stackIn_81_0 = 0;
        int stackIn_97_0 = 0;
        int stackIn_101_0 = 0;
        int stackIn_105_0 = 0;
        int stackIn_124_0 = 0;
        int stackIn_133_0 = 0;
        int stackIn_143_0 = 0;
        int stackIn_152_0 = 0;
        int stackIn_165_0 = 0;
        RuntimeException stackIn_167_0 = null;
        StringBuilder stackIn_167_1 = null;
        RuntimeException stackIn_169_0 = null;
        StringBuilder stackIn_169_1 = null;
        RuntimeException stackIn_170_0 = null;
        StringBuilder stackIn_170_1 = null;
        String stackIn_170_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int[] stackOut_15_0 = null;
        int stackOut_31_0 = 0;
        Object stackOut_47_0 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        int stackOut_57_2 = 0;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        int stackOut_55_2 = 0;
        int stackOut_80_0 = 0;
        int stackOut_96_0 = 0;
        int stackOut_100_0 = 0;
        int stackOut_104_0 = 0;
        int stackOut_123_0 = 0;
        int stackOut_132_0 = 0;
        int stackOut_142_0 = 0;
        int stackOut_151_0 = 0;
        int stackOut_164_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_166_0 = null;
        StringBuilder stackOut_166_1 = null;
        RuntimeException stackOut_169_0 = null;
        StringBuilder stackOut_169_1 = null;
        String stackOut_169_2 = null;
        RuntimeException stackOut_167_0 = null;
        StringBuilder stackOut_167_1 = null;
        String stackOut_167_2 = null;
        var22 = ZombieDawn.field_J;
        try {
          L0: {
            if (this.b(param2, (byte) -82)) {
              if (((dj) this).field_j[param2] == null) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0 != 0;
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
                          stackOut_15_0 = (int[]) var6;
                          stackIn_48_0 = stackOut_15_0;
                          stackIn_16_0 = stackOut_15_0;
                          if (var22 != 0) {
                            break L4;
                          } else {
                            L6: {
                              L7: {
                                if (stackIn_16_0 == null) {
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
                            if (var22 == 0) {
                              continue L2;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      if (var8 != 0) {
                        stackOut_31_0 = 1;
                        stackIn_32_0 = stackOut_31_0;
                        return stackIn_32_0 != 0;
                      } else {
                        L9: {
                          if (null == param0) {
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
                        stackOut_47_0 = ((dj) this).field_j[param2];
                        stackIn_48_0 = (int[]) (Object) stackOut_47_0;
                        break L4;
                      }
                    }
                    var9_array = ag.a((Object) (Object) stackIn_48_0, (byte) 88, false);
                    break L3;
                  }
                  L11: {
                    if (param3 <= -28) {
                      break L11;
                    } else {
                      byte[] discarded$1 = ((dj) this).a((String) ((dj) this).field_j[2], -6, (String) null);
                      break L11;
                    }
                  }
                  try {
                    L12: {
                      var10 = va.a((byte) -112, var9_array);
                      break L12;
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L13: {
                      var11_ref_RuntimeException = decompiledCaughtException;
                      stackOut_54_0 = (RuntimeException) var11_ref_RuntimeException;
                      stackOut_54_1 = new StringBuilder();
                      stackIn_57_0 = stackOut_54_0;
                      stackIn_57_1 = stackOut_54_1;
                      stackIn_55_0 = stackOut_54_0;
                      stackIn_55_1 = stackOut_54_1;
                      if (param0 == null) {
                        stackOut_57_0 = (RuntimeException) (Object) stackIn_57_0;
                        stackOut_57_1 = (StringBuilder) (Object) stackIn_57_1;
                        stackOut_57_2 = 0;
                        stackIn_58_0 = stackOut_57_0;
                        stackIn_58_1 = stackOut_57_1;
                        stackIn_58_2 = stackOut_57_2;
                        break L13;
                      } else {
                        stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
                        stackOut_55_1 = (StringBuilder) (Object) stackIn_55_1;
                        stackOut_55_2 = 1;
                        stackIn_58_0 = stackOut_55_0;
                        stackIn_58_1 = stackOut_55_1;
                        stackIn_58_2 = stackOut_55_2;
                        break L13;
                      }
                    }
                    throw sh.a((Throwable) (Object) stackIn_58_0, (stackIn_58_2 != 0) + " " + param2 + " " + var9_array.length + " " + ii.a(8099, var9_array.length, var9_array) + " " + ii.a(8099, var9_array.length - 2, var9_array) + " " + ((dj) this).field_b.field_j[param2] + " " + ((dj) this).field_b.field_m);
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
                                var7[var11] = (Object) (Object) var10;
                                if (var22 == 0) {
                                  break L20;
                                } else {
                                  break L21;
                                }
                              }
                            }
                            var7[var11] = el.a((byte) 94, false, var10);
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
                          var11 = var10.length;
                          var11--;
                          var12 = 255 & var10[var11];
                          var11 = var11 - var12 * (var5_int * 4);
                          var13 = new de(var10);
                          var14_int = 0;
                          var13.field_j = var11;
                          var15_int = 0;
                          var16 = 0;
                          L23: while (true) {
                            L24: {
                              L25: {
                                if (~var12 >= ~var16) {
                                  break L25;
                                } else {
                                  var17 = 0;
                                  stackOut_80_0 = 0;
                                  stackIn_97_0 = stackOut_80_0;
                                  stackIn_81_0 = stackOut_80_0;
                                  if (var22 != 0) {
                                    break L24;
                                  } else {
                                    var18 = stackIn_81_0;
                                    L26: while (true) {
                                      L27: {
                                        L28: {
                                          if (var5_int <= var18) {
                                            break L28;
                                          } else {
                                            var17 = var17 + var13.c(100);
                                            if (var22 != 0) {
                                              break L27;
                                            } else {
                                              L29: {
                                                L30: {
                                                  if (null != var6) {
                                                    break L30;
                                                  } else {
                                                    var19 = var18;
                                                    if (var22 == 0) {
                                                      break L29;
                                                    } else {
                                                      break L30;
                                                    }
                                                  }
                                                }
                                                var19 = var6[var18];
                                                break L29;
                                              }
                                              L31: {
                                                if (~var19 == ~param1) {
                                                  var14_int = var14_int + var17;
                                                  var15_int = var19;
                                                  break L31;
                                                } else {
                                                  break L31;
                                                }
                                              }
                                              var18++;
                                              if (var22 == 0) {
                                                continue L26;
                                              } else {
                                                break L28;
                                              }
                                            }
                                          }
                                        }
                                        var16++;
                                        break L27;
                                      }
                                      if (var22 == 0) {
                                        continue L23;
                                      } else {
                                        break L25;
                                      }
                                    }
                                  }
                                }
                              }
                              stackOut_96_0 = ~var14_int;
                              stackIn_97_0 = stackOut_96_0;
                              break L24;
                            }
                            if (stackIn_97_0 == -1) {
                              stackOut_100_0 = 1;
                              stackIn_101_0 = stackOut_100_0;
                              return stackIn_101_0 != 0;
                            } else {
                              var16_ref_byte__ = new byte[var14_int];
                              var14_int = 0;
                              var13.field_j = var11;
                              var17 = 0;
                              var18 = 0;
                              L32: while (true) {
                                L33: {
                                  if (~var12 >= ~var18) {
                                    break L33;
                                  } else {
                                    var19 = 0;
                                    stackOut_104_0 = 0;
                                    stackIn_165_0 = stackOut_104_0;
                                    stackIn_105_0 = stackOut_104_0;
                                    if (var22 != 0) {
                                      break L15;
                                    } else {
                                      var20 = stackIn_105_0;
                                      L34: while (true) {
                                        L35: {
                                          L36: {
                                            if (~var20 <= ~var5_int) {
                                              break L36;
                                            } else {
                                              var19 = var19 + var13.c(-44);
                                              if (var22 != 0) {
                                                break L35;
                                              } else {
                                                L37: {
                                                  L38: {
                                                    if (var6 == null) {
                                                      break L38;
                                                    } else {
                                                      var21 = var6[var20];
                                                      if (var22 == 0) {
                                                        break L37;
                                                      } else {
                                                        break L38;
                                                      }
                                                    }
                                                  }
                                                  var21 = var20;
                                                  break L37;
                                                }
                                                L39: {
                                                  if (var21 == param1) {
                                                    gp.a(var10, var17, var16_ref_byte__, var14_int, var19);
                                                    var14_int = var14_int + var19;
                                                    break L39;
                                                  } else {
                                                    break L39;
                                                  }
                                                }
                                                var17 = var17 + var19;
                                                var20++;
                                                if (var22 == 0) {
                                                  continue L34;
                                                } else {
                                                  break L36;
                                                }
                                              }
                                            }
                                          }
                                          var18++;
                                          break L35;
                                        }
                                        if (var22 == 0) {
                                          continue L32;
                                        } else {
                                          break L33;
                                        }
                                      }
                                    }
                                  }
                                }
                                var7[var15_int] = (Object) (Object) var16_ref_byte__;
                                if (var22 == 0) {
                                  break L16;
                                } else {
                                  break L22;
                                }
                              }
                            }
                          }
                        }
                      }
                      var11 = var10.length;
                      var11--;
                      var12 = 255 & var10[var11];
                      var11 = var11 - 4 * (var12 * var5_int);
                      var13 = new de(var10);
                      var14 = new int[var5_int];
                      var13.field_j = var11;
                      var15_int = 0;
                      L40: while (true) {
                        L41: {
                          L42: {
                            if (~var15_int <= ~var12) {
                              break L42;
                            } else {
                              var16 = 0;
                              stackOut_123_0 = 0;
                              stackIn_133_0 = stackOut_123_0;
                              stackIn_124_0 = stackOut_123_0;
                              if (var22 != 0) {
                                break L41;
                              } else {
                                var17 = stackIn_124_0;
                                L43: while (true) {
                                  L44: {
                                    L45: {
                                      if (~var17 <= ~var5_int) {
                                        break L45;
                                      } else {
                                        var16 = var16 + var13.c(124);
                                        var14[var17] = var14[var17] + var16;
                                        var17++;
                                        if (var22 != 0) {
                                          break L44;
                                        } else {
                                          if (var22 == 0) {
                                            continue L43;
                                          } else {
                                            break L45;
                                          }
                                        }
                                      }
                                    }
                                    var15_int++;
                                    break L44;
                                  }
                                  if (var22 == 0) {
                                    continue L40;
                                  } else {
                                    break L42;
                                  }
                                }
                              }
                            }
                          }
                          stackOut_132_0 = var5_int;
                          stackIn_133_0 = stackOut_132_0;
                          break L41;
                        }
                        var15 = new byte[stackIn_133_0][];
                        var16 = 0;
                        L46: while (true) {
                          L47: {
                            L48: {
                              if (var16 >= var5_int) {
                                break L48;
                              } else {
                                var15[var16] = new byte[var14[var16]];
                                var14[var16] = 0;
                                var16++;
                                if (var22 != 0) {
                                  break L47;
                                } else {
                                  if (var22 == 0) {
                                    continue L46;
                                  } else {
                                    break L48;
                                  }
                                }
                              }
                            }
                            var13.field_j = var11;
                            var16 = 0;
                            break L47;
                          }
                          var17 = 0;
                          L49: while (true) {
                            L50: {
                              L51: {
                                if (~var12 >= ~var17) {
                                  break L51;
                                } else {
                                  var18 = 0;
                                  stackOut_142_0 = 0;
                                  stackIn_152_0 = stackOut_142_0;
                                  stackIn_143_0 = stackOut_142_0;
                                  if (var22 != 0) {
                                    break L50;
                                  } else {
                                    var19 = stackIn_143_0;
                                    L52: while (true) {
                                      L53: {
                                        L54: {
                                          if (var5_int <= var19) {
                                            break L54;
                                          } else {
                                            var18 = var18 + var13.c(-48);
                                            gp.a(var10, var16, var15[var19], var14[var19], var18);
                                            var14[var19] = var14[var19] + var18;
                                            var16 = var16 + var18;
                                            var19++;
                                            if (var22 != 0) {
                                              break L53;
                                            } else {
                                              if (var22 == 0) {
                                                continue L52;
                                              } else {
                                                break L54;
                                              }
                                            }
                                          }
                                        }
                                        var17++;
                                        break L53;
                                      }
                                      if (var22 == 0) {
                                        continue L49;
                                      } else {
                                        break L51;
                                      }
                                    }
                                  }
                                }
                              }
                              stackOut_151_0 = 0;
                              stackIn_152_0 = stackOut_151_0;
                              break L50;
                            }
                            var17 = stackIn_152_0;
                            L55: while (true) {
                              if (var5_int <= var17) {
                                break L16;
                              } else {
                                L56: {
                                  L57: {
                                    if (var6 == null) {
                                      break L57;
                                    } else {
                                      var18 = var6[var17];
                                      if (var22 == 0) {
                                        break L56;
                                      } else {
                                        break L57;
                                      }
                                    }
                                  }
                                  var18 = var17;
                                  break L56;
                                }
                                L58: {
                                  L59: {
                                    if (((dj) this).field_d != 0) {
                                      break L59;
                                    } else {
                                      var7[var18] = el.a((byte) 94, false, var15[var17]);
                                      if (var22 == 0) {
                                        break L58;
                                      } else {
                                        break L59;
                                      }
                                    }
                                  }
                                  var7[var18] = (Object) (Object) var15[var17];
                                  break L58;
                                }
                                var17++;
                                if (var22 == 0) {
                                  continue L55;
                                } else {
                                  break L16;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    stackOut_164_0 = 1;
                    stackIn_165_0 = stackOut_164_0;
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
          L60: {
            var5 = decompiledCaughtException;
            stackOut_166_0 = (RuntimeException) var5;
            stackOut_166_1 = new StringBuilder().append("dj.A(");
            stackIn_169_0 = stackOut_166_0;
            stackIn_169_1 = stackOut_166_1;
            stackIn_167_0 = stackOut_166_0;
            stackIn_167_1 = stackOut_166_1;
            if (param0 == null) {
              stackOut_169_0 = (RuntimeException) (Object) stackIn_169_0;
              stackOut_169_1 = (StringBuilder) (Object) stackIn_169_1;
              stackOut_169_2 = "null";
              stackIn_170_0 = stackOut_169_0;
              stackIn_170_1 = stackOut_169_1;
              stackIn_170_2 = stackOut_169_2;
              break L60;
            } else {
              stackOut_167_0 = (RuntimeException) (Object) stackIn_167_0;
              stackOut_167_1 = (StringBuilder) (Object) stackIn_167_1;
              stackOut_167_2 = "{...}";
              stackIn_170_0 = stackOut_167_0;
              stackIn_170_1 = stackOut_167_1;
              stackIn_170_2 = stackOut_167_2;
              break L60;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_170_0, stackIn_170_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_165_0 != 0;
    }

    final boolean a(String param0, byte param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_9_0 = false;
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
              var4_int = ((dj) this).field_b.field_g.a(1, tc.a((CharSequence) (Object) param0, 14));
              if (this.b(var4_int, (byte) -82)) {
                var5 = ((dj) this).field_b.field_a[var4_int].a(1, tc.a((CharSequence) (Object) param2, 14));
                stackOut_9_0 = ((dj) this).a(var5, (byte) -128, var4_int);
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
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("dj.B(");
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
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
          L3: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param1).append(',');
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L3;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
        return stackIn_10_0;
    }

    final int d(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (((dj) this).a((byte) 73)) {
              L1: {
                if (param0 == -1) {
                  break L1;
                } else {
                  field_l = null;
                  break L1;
                }
              }
              stackOut_6_0 = ((dj) this).field_b.field_d.length;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_1_0 = -1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var2, "dj.E(" + param0 + ')');
        }
        return stackIn_7_0;
    }

    private final synchronized byte[] a(int[] param0, int param1, int param2, int param3) {
        Object var5 = null;
        int var6 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_13_0 = null;
        Object stackIn_39_0 = null;
        Object stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        Object stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        Object stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_12_0 = null;
        Object stackOut_38_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        Object stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        Object stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
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
                var6 = this.a(param0, param1, param2, (byte) -57) ? 1 : 0;
                if (var6 != 0) {
                  break L2;
                } else {
                  this.c(4, param2);
                  var6 = this.a(param0, param1, param2, (byte) -85) ? 1 : 0;
                  if (var6 != 0) {
                    break L2;
                  } else {
                    stackOut_12_0 = null;
                    stackIn_13_0 = stackOut_12_0;
                    return (byte[]) (Object) stackIn_13_0;
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
                    var5 = (Object) (Object) ag.a(((dj) this).field_c[param2][param1], (byte) 98, false);
                    if (var5 == null) {
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
                stackOut_38_0 = var5;
                stackIn_39_0 = stackOut_38_0;
                break L0;
              }
            } else {
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (byte[]) (Object) stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = (Object) (Object) decompiledCaughtException;
            stackOut_40_0 = var5;
            stackOut_40_1 = new StringBuilder().append("dj.D(");
            stackIn_43_0 = stackOut_40_0;
            stackIn_43_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param0 == null) {
              stackOut_43_0 = stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L7;
            } else {
              stackOut_41_0 = stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "{...}";
              stackIn_44_0 = stackOut_41_0;
              stackIn_44_1 = stackOut_41_1;
              stackIn_44_2 = stackOut_41_2;
              break L7;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_44_0, stackIn_44_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return (byte[]) (Object) stackIn_39_0;
    }

    final synchronized boolean a(byte param0) {
        RuntimeException var2 = null;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_10_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 73) {
                break L1;
              } else {
                ((dj) this).field_b = (jh) ((dj) this).field_j[19];
                break L1;
              }
            }
            L2: {
              if (((dj) this).field_b == null) {
                ((dj) this).field_b = ((dj) this).field_h.b((byte) 106);
                if (null != ((dj) this).field_b) {
                  ((dj) this).field_j = new Object[((dj) this).field_b.field_s];
                  ((dj) this).field_c = new Object[((dj) this).field_b.field_s][];
                  break L2;
                } else {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0 != 0;
                }
              } else {
                break L2;
              }
            }
            stackOut_10_0 = 1;
            stackIn_11_0 = stackOut_10_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var2, "dj.I(" + param0 + ')');
        }
        return stackIn_11_0 != 0;
    }

    final static void a(int param0) {
        try {
            jm.a((String) null, "", -901373652);
            int var1_int = -106 % ((67 - param0) / 40);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "dj.P(" + param0 + ')');
        }
    }

    final synchronized int e(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_2_0 = 0;
        var5 = ZombieDawn.field_J;
        try {
          L0: {
            if (((dj) this).a((byte) 73)) {
              L1: {
                var2_int = 0;
                if (param0 < -79) {
                  break L1;
                } else {
                  int discarded$2 = ((dj) this).a((byte) -52, 65);
                  break L1;
                }
              }
              var3 = 0;
              var4 = 0;
              L2: while (true) {
                L3: {
                  L4: {
                    if (((dj) this).field_j.length <= var4) {
                      break L4;
                    } else {
                      stackOut_9_0 = 0;
                      stackOut_9_1 = ((dj) this).field_b.field_t[var4];
                      stackIn_16_0 = stackOut_9_0;
                      stackIn_16_1 = stackOut_9_1;
                      stackIn_10_0 = stackOut_9_0;
                      stackIn_10_1 = stackOut_9_1;
                      if (var5 != 0) {
                        break L3;
                      } else {
                        L5: {
                          if (stackIn_10_0 >= stackIn_10_1) {
                            break L5;
                          } else {
                            var3 = var3 + ((dj) this).a(var4, -5366);
                            var2_int += 100;
                            break L5;
                          }
                        }
                        var4++;
                        if (var5 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  stackOut_15_0 = -1;
                  stackOut_15_1 = ~var2_int;
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  break L3;
                }
                if (stackIn_16_0 != stackIn_16_1) {
                  var4 = var3 * 100 / var2_int;
                  stackOut_19_0 = var4;
                  stackIn_20_0 = stackOut_19_0;
                  break L0;
                } else {
                  stackOut_17_0 = 100;
                  stackIn_18_0 = stackOut_17_0;
                  return stackIn_18_0;
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
          throw sh.a((Throwable) (Object) var2, "dj.C(" + param0 + ')');
        }
        return stackIn_20_0;
    }

    final int a(int param0, String param1, boolean param2) {
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
            if (!this.b(param0, (byte) -82)) {
              stackOut_3_0 = -1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              param1 = param1.toLowerCase();
              if (param2) {
                var4_int = ((dj) this).field_b.field_a[param0].a(1, tc.a((CharSequence) (Object) param1, 14));
                if (!this.a(var4_int, param0, 126)) {
                  stackOut_11_0 = -1;
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0;
                } else {
                  stackOut_13_0 = var4_int;
                  stackIn_14_0 = stackOut_13_0;
                  break L0;
                }
              } else {
                stackOut_6_0 = 8;
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
            stackOut_15_1 = new StringBuilder().append("dj.Q(").append(param0).append(',');
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
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
          throw sh.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param2 + ')');
        }
        return stackIn_14_0;
    }

    final int b(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
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
            if (!((dj) this).a((byte) 73)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
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
              var3_int = ((dj) this).field_b.field_g.a(1, tc.a((CharSequence) (Object) param0, 14));
              stackOut_8_0 = ((dj) this).a(var3_int, -5366);
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("dj.V(");
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
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L2;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    final synchronized boolean a(int param0, byte param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (this.a(param0, param2, 113)) {
              L1: {
                var4_int = -105 / ((-38 - param1) / 58);
                if (((dj) this).field_c[param2] == null) {
                  break L1;
                } else {
                  if (null == ((dj) this).field_c[param2][param0]) {
                    break L1;
                  } else {
                    stackOut_7_0 = 1;
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0 != 0;
                  }
                }
              }
              if (null != ((dj) this).field_j[param2]) {
                stackOut_12_0 = 1;
                stackIn_13_0 = stackOut_12_0;
                return stackIn_13_0 != 0;
              } else {
                this.c(4, param2);
                if (((dj) this).field_j[param2] != null) {
                  stackOut_17_0 = 1;
                  stackIn_18_0 = stackOut_17_0;
                  return stackIn_18_0 != 0;
                } else {
                  stackOut_19_0 = 0;
                  stackIn_20_0 = stackOut_19_0;
                  break L0;
                }
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
          throw sh.a((Throwable) (Object) var4, "dj.S(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_20_0 != 0;
    }

    final synchronized byte[] a(String param0, int param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_8_0 = null;
        byte[] stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_9_0 = null;
        Object stackOut_7_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
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
              var4_int = ((dj) this).field_b.field_g.a(1, tc.a((CharSequence) (Object) param2, 14));
              if (this.b(var4_int, (byte) -82)) {
                var5 = ((dj) this).field_b.field_a[var4_int].a(1, tc.a((CharSequence) (Object) param0, 14));
                stackOut_9_0 = ((dj) this).a((byte) 51, var4_int, var5);
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                stackOut_7_0 = null;
                stackIn_8_0 = stackOut_7_0;
                return (byte[]) (Object) stackIn_8_0;
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
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("dj.AA(");
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
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
          L3: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param1).append(',');
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L3;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
        return stackIn_10_0;
    }

    final boolean a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        boolean stackOut_8_0 = false;
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
            if (!((dj) this).a((byte) 73)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
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
              var3_int = ((dj) this).field_b.field_g.a(1, tc.a((CharSequence) (Object) param1, param0 + 15));
              stackOut_8_0 = ((dj) this).b(-29092, var3_int);
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("dj.U(").append(param0).append(',');
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L2;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_9_0;
    }

    private final synchronized void c(int param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 4) {
              L1: {
                L2: {
                  if (!((dj) this).field_f) {
                    break L2;
                  } else {
                    ((dj) this).field_j[param1] = (Object) (Object) ((dj) this).field_h.a(param1, (byte) 112);
                    if (ZombieDawn.field_J == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                ((dj) this).field_j[param1] = el.a((byte) 94, false, ((dj) this).field_h.a(param1, (byte) 112));
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
          throw sh.a((Throwable) (Object) var3, "dj.J(" + param0 + ',' + param1 + ')');
        }
    }

    private final synchronized boolean b(int param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              if (param1 == -82) {
                break L1;
              } else {
                this.c(((int[]) ((dj) this).field_j[4])[0], 99);
                break L1;
              }
            }
            if (((dj) this).a((byte) 73)) {
              L2: {
                if (param0 < 0) {
                  break L2;
                } else {
                  if (~param0 <= ~((dj) this).field_b.field_d.length) {
                    break L2;
                  } else {
                    if (((dj) this).field_b.field_d[param0] != 0) {
                      stackOut_20_0 = 1;
                      stackIn_21_0 = stackOut_20_0;
                      break L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              if (!sg.field_ib) {
                stackOut_18_0 = 0;
                stackIn_19_0 = stackOut_18_0;
                return stackIn_19_0 != 0;
              } else {
                throw new IllegalArgumentException(Integer.toString(param0));
              }
            } else {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var3, "dj.R(" + param0 + ',' + param1 + ')');
        }
        return stackIn_21_0 != 0;
    }

    final byte[] a(byte param0, int param1, int param2) {
        RuntimeException var4 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              if (param0 == 51) {
                break L1;
              } else {
                ((dj) this).field_d = -23;
                break L1;
              }
            }
            stackOut_3_0 = this.a((int[]) null, param2, param1, param0 ^ 77);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var4, "dj.W(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_4_0;
    }

    public static void b(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_k = null;
              field_i = null;
              field_a = null;
              field_m = null;
              field_l = null;
              if (param0 > 67) {
                break L1;
              } else {
                field_e = null;
                break L1;
              }
            }
            field_e = null;
            field_g = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var1, "dj.F(" + param0 + ')');
        }
    }

    final int a(byte param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 >= 53) {
              if (!this.b(param1, (byte) -82)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                stackOut_8_0 = ((dj) this).field_b.field_d[param1];
                stackIn_9_0 = stackOut_8_0;
                break L0;
              }
            } else {
              stackOut_1_0 = 18;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var3, "dj.M(" + param0 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    final synchronized int a(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (this.b(param0, (byte) -82)) {
              if (((dj) this).field_j[param0] != null) {
                stackOut_6_0 = 100;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                L1: {
                  if (param1 == -5366) {
                    break L1;
                  } else {
                    byte[] discarded$2 = ((dj) this).a((String) null, -127, (String) ((dj) this).field_j[4]);
                    break L1;
                  }
                }
                stackOut_11_0 = ((dj) this).field_h.a(-90, param0);
                stackIn_12_0 = stackOut_11_0;
                break L0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var3, "dj.G(" + param0 + ',' + param1 + ')');
        }
        return stackIn_12_0;
    }

    final boolean a(String param0, int param1) {
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
            if (!((dj) this).a((byte) 73)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              param0 = param0.toLowerCase();
              var3_int = ((dj) this).field_b.field_g.a(1, tc.a((CharSequence) (Object) param0, 14));
              if (param1 <= var3_int) {
                stackOut_8_0 = 1;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("dj.O(");
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
          throw sh.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ')');
        }
        return stackIn_9_0 != 0;
    }

    private final synchronized boolean a(int param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_20_0 = 0;
        try {
          L0: {
            if (!((dj) this).a((byte) 73)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                if (0 > param1) {
                  break L1;
                } else {
                  if (param0 < 0) {
                    break L1;
                  } else {
                    if (~param1 <= ~((dj) this).field_b.field_d.length) {
                      break L1;
                    } else {
                      if (param0 >= ((dj) this).field_b.field_d[param1]) {
                        break L1;
                      } else {
                        var4_int = -60 % ((63 - param2) / 41);
                        stackOut_22_0 = 1;
                        stackIn_23_0 = stackOut_22_0;
                        break L0;
                      }
                    }
                  }
                }
              }
              if (!sg.field_ib) {
                stackOut_20_0 = 0;
                stackIn_21_0 = stackOut_20_0;
                return stackIn_21_0 != 0;
              } else {
                throw new IllegalArgumentException(param1 + " " + param0);
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var4, "dj.H(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_23_0 != 0;
    }

    final synchronized byte[] a(int param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_5_0 = null;
        Object stackIn_10_0 = null;
        byte[] stackIn_15_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_9_0 = null;
        byte[] stackOut_14_0 = null;
        byte[] stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        try {
          if (((dj) this).a((byte) 73)) {
            if (1 != ((dj) this).field_b.field_d.length) {
              var3_int = 84 % ((-21 - param1) / 37);
              if (!this.b(param0, (byte) -82)) {
                stackOut_9_0 = null;
                stackIn_10_0 = stackOut_9_0;
                return (byte[]) (Object) stackIn_10_0;
              } else {
                if (((dj) this).field_b.field_d[param0] == 1) {
                  stackOut_14_0 = ((dj) this).a((byte) 51, param0, 0);
                  stackIn_15_0 = stackOut_14_0;
                  return stackIn_15_0;
                } else {
                  throw new RuntimeException();
                }
              }
            } else {
              stackOut_4_0 = ((dj) this).a((byte) 51, 0, param0);
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
          throw sh.a((Throwable) (Object) var3, "dj.N(" + param0 + ',' + param1 + ')');
        }
    }

    final int a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (!((dj) this).a((byte) 73)) {
              stackOut_3_0 = -1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
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
              var3_int = ((dj) this).field_b.field_g.a(param1 ^ 9, tc.a((CharSequence) (Object) param0, 14));
              if (this.b(var3_int, (byte) -82)) {
                stackOut_11_0 = var3_int;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                stackOut_9_0 = -1;
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("dj.L(");
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
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L2;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param1 + ')');
        }
        return stackIn_12_0;
    }

    final synchronized boolean b(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_6_0 = 0;
        try {
          L0: {
            if (!this.b(param1, (byte) -82)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (param0 == -29092) {
                if (null == ((dj) this).field_j[param1]) {
                  this.c(4, param1);
                  if (((dj) this).field_j[param1] != null) {
                    stackOut_14_0 = 1;
                    stackIn_15_0 = stackOut_14_0;
                    return stackIn_15_0 != 0;
                  } else {
                    stackOut_16_0 = 0;
                    stackIn_17_0 = stackOut_16_0;
                    break L0;
                  }
                } else {
                  stackOut_9_0 = 1;
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
          var3 = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var3, "dj.K(" + param0 + ',' + param1 + ')');
        }
        return stackIn_17_0 != 0;
    }

    final synchronized boolean c(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_3_0 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_20_0 = null;
        int stackIn_22_0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_6_0 = null;
        Object stackOut_18_0 = null;
        int stackOut_21_0 = 0;
        int stackOut_2_0 = 0;
        var5 = ZombieDawn.field_J;
        try {
          L0: {
            if (((dj) this).a((byte) 73)) {
              var2_int = 1;
              var3 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    L4: {
                      if (((dj) this).field_b.field_n.length <= var3) {
                        break L4;
                      } else {
                        var4 = ((dj) this).field_b.field_n[var3];
                        stackOut_6_0 = this;
                        stackIn_20_0 = stackOut_6_0;
                        stackIn_7_0 = stackOut_6_0;
                        if (var5 != 0) {
                          break L3;
                        } else {
                          L5: {
                            if (((dj) this).field_j[var4] != null) {
                              break L5;
                            } else {
                              this.c(param0 + -8997, var4);
                              if (null == ((dj) this).field_j[var4]) {
                                var2_int = 0;
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                          }
                          var3++;
                          if (var5 == 0) {
                            continue L1;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    if (param0 == 9001) {
                      break L2;
                    } else {
                      stackOut_18_0 = this;
                      stackIn_20_0 = stackOut_18_0;
                      break L3;
                    }
                  }
                  boolean discarded$2 = ((dj) this).a(70, ((byte[]) ((dj) this).field_j[19])[2], 26);
                  break L2;
                }
                stackOut_21_0 = var2_int;
                stackIn_22_0 = stackOut_21_0;
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
          throw sh.a((Throwable) (Object) var2, "dj.T(" + param0 + ')');
        }
        return stackIn_22_0 != 0;
    }

    dj(w param0, boolean param1, int param2) {
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
        ((dj) this).field_b = null;
        try {
          L0: {
            L1: {
              if (param2 < 0) {
                break L1;
              } else {
                if (param2 > 2) {
                  break L1;
                } else {
                  ((dj) this).field_f = param1;
                  ((dj) this).field_d = param2;
                  ((dj) this).field_h = param0;
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
            stackOut_8_1 = new StringBuilder().append("dj.<init>(");
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
          throw sh.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ',' + param2 + ')');
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
