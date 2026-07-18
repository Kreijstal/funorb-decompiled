/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rh {
    private boolean field_d;
    private gi field_i;
    static vb field_p;
    private int field_h;
    static ik field_c;
    static mj field_f;
    static String field_b;
    private Object[][] field_l;
    private rf field_m;
    static int field_a;
    private Object[] field_g;
    static String field_o;
    static ed field_k;
    static boolean[] field_j;
    static String field_e;
    static sf field_n;

    private final synchronized boolean a(int[] param0, int param1, int param2, int param3) {
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
        ni var10_ref = null;
        RuntimeException var11_ref_RuntimeException = null;
        int var11 = 0;
        int var12 = 0;
        ni var13 = null;
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
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_30_0 = 0;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        int stackIn_52_2 = 0;
        int stackIn_76_0 = 0;
        int stackIn_85_0 = 0;
        int stackIn_95_0 = 0;
        int stackIn_104_0 = 0;
        int stackIn_123_0 = 0;
        int stackIn_139_0 = 0;
        int stackIn_143_0 = 0;
        int stackIn_147_0 = 0;
        int stackIn_162_0 = 0;
        RuntimeException stackIn_164_0 = null;
        StringBuilder stackIn_164_1 = null;
        RuntimeException stackIn_166_0 = null;
        StringBuilder stackIn_166_1 = null;
        RuntimeException stackIn_167_0 = null;
        StringBuilder stackIn_167_1 = null;
        String stackIn_167_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        int stackOut_51_2 = 0;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        int stackOut_49_2 = 0;
        int stackOut_75_0 = 0;
        int stackOut_84_0 = 0;
        int stackOut_94_0 = 0;
        int stackOut_103_0 = 0;
        int stackOut_122_0 = 0;
        int stackOut_138_0 = 0;
        int stackOut_142_0 = 0;
        int stackOut_146_0 = 0;
        int stackOut_161_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_163_0 = null;
        StringBuilder stackOut_163_1 = null;
        RuntimeException stackOut_166_0 = null;
        StringBuilder stackOut_166_1 = null;
        String stackOut_166_2 = null;
        RuntimeException stackOut_164_0 = null;
        StringBuilder stackOut_164_1 = null;
        String stackOut_164_2 = null;
        var22 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (!this.a(true, param1)) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              if (null != ((rh) this).field_g[param1]) {
                L1: {
                  var5_int = ((rh) this).field_m.field_f[param1];
                  var6 = ((rh) this).field_m.field_h[param1];
                  if (null == ((rh) this).field_l[param1]) {
                    ((rh) this).field_l[param1] = new Object[((rh) this).field_m.field_v[param1]];
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var7 = ((rh) this).field_l[param1];
                var8 = 1;
                var9_int = param2;
                L2: while (true) {
                  L3: {
                    L4: {
                      if (var5_int <= var9_int) {
                        break L4;
                      } else {
                        if (var22 != 0) {
                          break L3;
                        } else {
                          L5: {
                            L6: {
                              if (var6 == null) {
                                break L6;
                              } else {
                                var10_int = var6[var9_int];
                                if (var22 == 0) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            var10_int = var9_int;
                            break L5;
                          }
                          L7: {
                            if (var7[var10_int] != null) {
                              break L7;
                            } else {
                              var8 = 0;
                              if (var22 == 0) {
                                break L4;
                              } else {
                                break L7;
                              }
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
                    if (var8 != 0) {
                      break L3;
                    } else {
                      L8: {
                        L9: {
                          if (null == param0) {
                            break L9;
                          } else {
                            L10: {
                              if (0 != param0[0]) {
                                break L10;
                              } else {
                                if (param0[1] != 0) {
                                  break L10;
                                } else {
                                  if (param0[2] != 0) {
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
                            var9_array = jg.a(false, ((rh) this).field_g[param1], true);
                            var10_ref = new ni(var9_array);
                            var10_ref.a(param0, 5, -1, var10_ref.field_k.length);
                            break L8;
                          }
                        }
                        var9_array = jg.a(false, ((rh) this).field_g[param1], false);
                        break L8;
                      }
                      try {
                        L11: {
                          var10 = qi.a(var9_array, -22518);
                          break L11;
                        }
                      } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L12: {
                          var11_ref_RuntimeException = decompiledCaughtException;
                          stackOut_48_0 = (RuntimeException) var11_ref_RuntimeException;
                          stackOut_48_1 = new StringBuilder();
                          stackIn_51_0 = stackOut_48_0;
                          stackIn_51_1 = stackOut_48_1;
                          stackIn_49_0 = stackOut_48_0;
                          stackIn_49_1 = stackOut_48_1;
                          if (param0 == null) {
                            stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
                            stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
                            stackOut_51_2 = 0;
                            stackIn_52_0 = stackOut_51_0;
                            stackIn_52_1 = stackOut_51_1;
                            stackIn_52_2 = stackOut_51_2;
                            break L12;
                          } else {
                            stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
                            stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
                            stackOut_49_2 = 1;
                            stackIn_52_0 = stackOut_49_0;
                            stackIn_52_1 = stackOut_49_1;
                            stackIn_52_2 = stackOut_49_2;
                            break L12;
                          }
                        }
                        throw pf.a((Throwable) (Object) stackIn_52_0, (stackIn_52_2 != 0) + " " + param1 + " " + var9_array.length + " " + ia.a(true, var9_array, var9_array.length) + " " + ia.a(true, var9_array, var9_array.length + -2) + " " + ((rh) this).field_m.field_u[param1] + " " + ((rh) this).field_m.field_p);
                      }
                      L13: {
                        if (((rh) this).field_d) {
                          ((rh) this).field_g[param1] = null;
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                      L14: {
                        L15: {
                          L16: {
                            if (var5_int > 1) {
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
                                  if (((rh) this).field_h != 0) {
                                    break L20;
                                  } else {
                                    var7[var11] = kh.a(false, var10, -137);
                                    if (var22 == 0) {
                                      break L19;
                                    } else {
                                      break L20;
                                    }
                                  }
                                }
                                var7[var11] = (Object) (Object) var10;
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
                            if (((rh) this).field_h == 2) {
                              break L21;
                            } else {
                              var11 = var10.length;
                              var11--;
                              var12 = var10[var11] & 255;
                              var11 = var11 - 4 * (var5_int * var12);
                              var13 = new ni(var10);
                              var14_ref_int__ = new int[var5_int];
                              var13.field_i = var11;
                              var15 = 0;
                              L22: while (true) {
                                L23: {
                                  L24: {
                                    if (~var12 >= ~var15) {
                                      break L24;
                                    } else {
                                      var16_int = 0;
                                      stackOut_75_0 = 0;
                                      stackIn_85_0 = stackOut_75_0;
                                      stackIn_76_0 = stackOut_75_0;
                                      if (var22 != 0) {
                                        break L23;
                                      } else {
                                        var17 = stackIn_76_0;
                                        L25: while (true) {
                                          L26: {
                                            L27: {
                                              if (var17 >= var5_int) {
                                                break L27;
                                              } else {
                                                var16_int = var16_int + var13.c((byte) -123);
                                                var14_ref_int__[var17] = var14_ref_int__[var17] + var16_int;
                                                var17++;
                                                if (var22 != 0) {
                                                  break L26;
                                                } else {
                                                  if (var22 == 0) {
                                                    continue L25;
                                                  } else {
                                                    break L27;
                                                  }
                                                }
                                              }
                                            }
                                            var15++;
                                            break L26;
                                          }
                                          if (var22 == 0) {
                                            continue L22;
                                          } else {
                                            break L24;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  stackOut_84_0 = var5_int;
                                  stackIn_85_0 = stackOut_84_0;
                                  break L23;
                                }
                                var15_ref_byte____ = new byte[stackIn_85_0][];
                                var16_int = 0;
                                L28: while (true) {
                                  L29: {
                                    L30: {
                                      if (var16_int >= var5_int) {
                                        break L30;
                                      } else {
                                        var15_ref_byte____[var16_int] = new byte[var14_ref_int__[var16_int]];
                                        var14_ref_int__[var16_int] = 0;
                                        var16_int++;
                                        if (var22 != 0) {
                                          break L29;
                                        } else {
                                          if (var22 == 0) {
                                            continue L28;
                                          } else {
                                            break L30;
                                          }
                                        }
                                      }
                                    }
                                    var13.field_i = var11;
                                    var16_int = 0;
                                    break L29;
                                  }
                                  var17 = 0;
                                  L31: while (true) {
                                    L32: {
                                      L33: {
                                        if (var17 >= var12) {
                                          break L33;
                                        } else {
                                          var18 = 0;
                                          stackOut_94_0 = 0;
                                          stackIn_104_0 = stackOut_94_0;
                                          stackIn_95_0 = stackOut_94_0;
                                          if (var22 != 0) {
                                            break L32;
                                          } else {
                                            var19 = stackIn_95_0;
                                            L34: while (true) {
                                              L35: {
                                                L36: {
                                                  if (~var19 <= ~var5_int) {
                                                    break L36;
                                                  } else {
                                                    var18 = var18 + var13.c((byte) -35);
                                                    dm.a(var10, var16_int, var15_ref_byte____[var19], var14_ref_int__[var19], var18);
                                                    var14_ref_int__[var19] = var14_ref_int__[var19] + var18;
                                                    var16_int = var16_int + var18;
                                                    var19++;
                                                    if (var22 != 0) {
                                                      break L35;
                                                    } else {
                                                      if (var22 == 0) {
                                                        continue L34;
                                                      } else {
                                                        break L36;
                                                      }
                                                    }
                                                  }
                                                }
                                                var17++;
                                                break L35;
                                              }
                                              if (var22 == 0) {
                                                continue L31;
                                              } else {
                                                break L33;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      stackOut_103_0 = 0;
                                      stackIn_104_0 = stackOut_103_0;
                                      break L32;
                                    }
                                    var17 = stackIn_104_0;
                                    L37: while (true) {
                                      L38: {
                                        if (var17 >= var5_int) {
                                          break L38;
                                        } else {
                                          if (var22 != 0) {
                                            break L15;
                                          } else {
                                            L39: {
                                              L40: {
                                                if (var6 != null) {
                                                  break L40;
                                                } else {
                                                  var18 = var17;
                                                  if (var22 == 0) {
                                                    break L39;
                                                  } else {
                                                    break L40;
                                                  }
                                                }
                                              }
                                              var18 = var6[var17];
                                              break L39;
                                            }
                                            L41: {
                                              L42: {
                                                if (((rh) this).field_h == 0) {
                                                  break L42;
                                                } else {
                                                  var7[var18] = (Object) (Object) var15_ref_byte____[var17];
                                                  if (var22 == 0) {
                                                    break L41;
                                                  } else {
                                                    break L42;
                                                  }
                                                }
                                              }
                                              var7[var18] = kh.a(false, var15_ref_byte____[var17], -137);
                                              break L41;
                                            }
                                            var17++;
                                            if (var22 == 0) {
                                              continue L37;
                                            } else {
                                              break L38;
                                            }
                                          }
                                        }
                                      }
                                      if (var22 == 0) {
                                        break L15;
                                      } else {
                                        break L21;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var11 = var10.length;
                          var11--;
                          var12 = 255 & var10[var11];
                          var11 = var11 - var12 * var5_int * 4;
                          var13 = new ni(var10);
                          var14 = 0;
                          var15 = 0;
                          var13.field_i = var11;
                          var16_int = 0;
                          L43: while (true) {
                            L44: {
                              L45: {
                                if (var16_int >= var12) {
                                  break L45;
                                } else {
                                  var17 = 0;
                                  stackOut_122_0 = 0;
                                  stackIn_139_0 = stackOut_122_0;
                                  stackIn_123_0 = stackOut_122_0;
                                  if (var22 != 0) {
                                    break L44;
                                  } else {
                                    var18 = stackIn_123_0;
                                    L46: while (true) {
                                      L47: {
                                        L48: {
                                          if (~var18 <= ~var5_int) {
                                            break L48;
                                          } else {
                                            var17 = var17 + var13.c((byte) -91);
                                            if (var22 != 0) {
                                              break L47;
                                            } else {
                                              L49: {
                                                L50: {
                                                  if (var6 != null) {
                                                    break L50;
                                                  } else {
                                                    var19 = var18;
                                                    if (var22 == 0) {
                                                      break L49;
                                                    } else {
                                                      break L50;
                                                    }
                                                  }
                                                }
                                                var19 = var6[var18];
                                                break L49;
                                              }
                                              L51: {
                                                if (~var19 == ~param3) {
                                                  var14 = var14 + var17;
                                                  var15 = var19;
                                                  break L51;
                                                } else {
                                                  break L51;
                                                }
                                              }
                                              var18++;
                                              if (var22 == 0) {
                                                continue L46;
                                              } else {
                                                break L48;
                                              }
                                            }
                                          }
                                        }
                                        var16_int++;
                                        break L47;
                                      }
                                      if (var22 == 0) {
                                        continue L43;
                                      } else {
                                        break L45;
                                      }
                                    }
                                  }
                                }
                              }
                              stackOut_138_0 = ~var14;
                              stackIn_139_0 = stackOut_138_0;
                              break L44;
                            }
                            if (stackIn_139_0 == -1) {
                              stackOut_142_0 = 1;
                              stackIn_143_0 = stackOut_142_0;
                              return stackIn_143_0 != 0;
                            } else {
                              var16 = new byte[var14];
                              var14 = 0;
                              var13.field_i = var11;
                              var17 = 0;
                              var18 = 0;
                              L52: while (true) {
                                L53: {
                                  if (~var12 >= ~var18) {
                                    break L53;
                                  } else {
                                    var19 = 0;
                                    stackOut_146_0 = 0;
                                    stackIn_162_0 = stackOut_146_0;
                                    stackIn_147_0 = stackOut_146_0;
                                    if (var22 != 0) {
                                      break L14;
                                    } else {
                                      var20 = stackIn_147_0;
                                      L54: while (true) {
                                        L55: {
                                          L56: {
                                            if (var5_int <= var20) {
                                              break L56;
                                            } else {
                                              var19 = var19 + var13.c((byte) -70);
                                              if (var22 != 0) {
                                                break L55;
                                              } else {
                                                L57: {
                                                  L58: {
                                                    if (null != var6) {
                                                      break L58;
                                                    } else {
                                                      var21 = var20;
                                                      if (var22 == 0) {
                                                        break L57;
                                                      } else {
                                                        break L58;
                                                      }
                                                    }
                                                  }
                                                  var21 = var6[var20];
                                                  break L57;
                                                }
                                                L59: {
                                                  if (param3 != var21) {
                                                    break L59;
                                                  } else {
                                                    dm.a(var10, var17, var16, var14, var19);
                                                    var14 = var14 + var19;
                                                    break L59;
                                                  }
                                                }
                                                var17 = var17 + var19;
                                                var20++;
                                                if (var22 == 0) {
                                                  continue L54;
                                                } else {
                                                  break L56;
                                                }
                                              }
                                            }
                                          }
                                          var18++;
                                          break L55;
                                        }
                                        if (var22 == 0) {
                                          continue L52;
                                        } else {
                                          break L53;
                                        }
                                      }
                                    }
                                  }
                                }
                                var7[var15] = (Object) (Object) var16;
                                break L15;
                              }
                            }
                          }
                        }
                        stackOut_161_0 = 1;
                        stackIn_162_0 = stackOut_161_0;
                        break L14;
                      }
                      break L0;
                    }
                  }
                  stackOut_29_0 = 1;
                  stackIn_30_0 = stackOut_29_0;
                  return stackIn_30_0 != 0;
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
            stackOut_163_0 = (RuntimeException) var5;
            stackOut_163_1 = new StringBuilder().append("rh.M(");
            stackIn_166_0 = stackOut_163_0;
            stackIn_166_1 = stackOut_163_1;
            stackIn_164_0 = stackOut_163_0;
            stackIn_164_1 = stackOut_163_1;
            if (param0 == null) {
              stackOut_166_0 = (RuntimeException) (Object) stackIn_166_0;
              stackOut_166_1 = (StringBuilder) (Object) stackIn_166_1;
              stackOut_166_2 = "null";
              stackIn_167_0 = stackOut_166_0;
              stackIn_167_1 = stackOut_166_1;
              stackIn_167_2 = stackOut_166_2;
              break L60;
            } else {
              stackOut_164_0 = (RuntimeException) (Object) stackIn_164_0;
              stackOut_164_1 = (StringBuilder) (Object) stackIn_164_1;
              stackOut_164_2 = "{...}";
              stackIn_167_0 = stackOut_164_0;
              stackIn_167_1 = stackOut_164_1;
              stackIn_167_2 = stackOut_164_2;
              break L60;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_167_0, stackIn_167_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_162_0 != 0;
    }

    final synchronized boolean a(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_20_0 = 0;
        var5 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (!((rh) this).b((byte) -126)) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              L1: {
                var2_int = 1;
                if (param0 <= -12) {
                  break L1;
                } else {
                  ((long[]) ((rh) this).field_g[3])[7] = ((long[]) ((rh) this).field_g[3])[8];
                  break L1;
                }
              }
              var3 = 0;
              L2: while (true) {
                L3: {
                  L4: {
                    if (~((rh) this).field_m.field_r.length >= ~var3) {
                      break L4;
                    } else {
                      stackOut_11_0 = ((rh) this).field_m.field_r[var3];
                      stackIn_21_0 = stackOut_11_0;
                      stackIn_12_0 = stackOut_11_0;
                      if (var5 != 0) {
                        break L3;
                      } else {
                        L5: {
                          var4 = stackIn_12_0;
                          if (null != ((rh) this).field_g[var4]) {
                            break L5;
                          } else {
                            this.a((byte) 101, var4);
                            if (((rh) this).field_g[var4] == null) {
                              var2_int = 0;
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                        }
                        var3++;
                        if (var5 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  stackOut_20_0 = var2_int;
                  stackIn_21_0 = stackOut_20_0;
                  break L3;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var2, "rh.N(" + param0 + ')');
        }
        return stackIn_21_0 != 0;
    }

    final int a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
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
            if (!((rh) this).b((byte) -126)) {
              stackOut_3_0 = -1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              L1: {
                if (param1 == -100) {
                  break L1;
                } else {
                  ((rh) this).field_g = null;
                  break L1;
                }
              }
              param0 = param0.toLowerCase();
              var3_int = ((rh) this).field_m.field_j.a(tb.a((CharSequence) (Object) param0, false), (byte) 123);
              if (!this.a(true, var3_int)) {
                stackOut_11_0 = -1;
                stackIn_12_0 = stackOut_11_0;
                return stackIn_12_0;
              } else {
                stackOut_13_0 = var3_int;
                stackIn_14_0 = stackOut_13_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3;
            stackOut_15_1 = new StringBuilder().append("rh.C(");
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
              break L2;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L2;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param1 + ')');
        }
        return stackIn_14_0;
    }

    final static void a(int param0, int param1, int param2, int[] param3, byte param4) {
        RuntimeException runtimeException = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var8 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              L2: {
                L3: {
                  param1--;
                  if (0 > param1) {
                    break L3;
                  } else {
                    var5 = param3;
                    var6 = param2;
                    var7 = param0;
                    var5[var6] = (sc.a(16711422, var5[var6]) >> 2080550305) + var7;
                    param2++;
                    if (var8 != 0) {
                      break L2;
                    } else {
                      if (var8 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param4 <= -65) {
                  break L2;
                } else {
                  rh.c((byte) -61);
                  break L2;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) runtimeException;
            stackOut_10_1 = new StringBuilder().append("rh.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L4;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param4 + ')');
        }
    }

    final synchronized boolean b(byte param0) {
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_12_0 = 0;
        try {
          L0: {
            L1: {
              if (((rh) this).field_m != null) {
                break L1;
              } else {
                ((rh) this).field_m = ((rh) this).field_i.a(-1712);
                if (((rh) this).field_m == null) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0 != 0;
                } else {
                  ((rh) this).field_l = new Object[((rh) this).field_m.field_i][];
                  ((rh) this).field_g = new Object[((rh) this).field_m.field_i];
                  break L1;
                }
              }
            }
            L2: {
              if (param0 <= -97) {
                break L2;
              } else {
                int discarded$2 = ((rh) this).a((String) null, (byte) 76);
                break L2;
              }
            }
            stackOut_12_0 = 1;
            stackIn_13_0 = stackOut_12_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var2, "rh.B(" + param0 + ')');
        }
        return stackIn_13_0 != 0;
    }

    final boolean a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
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
            L1: {
              if (param1 <= -91) {
                break L1;
              } else {
                boolean discarded$2 = this.a(((boolean[]) ((rh) this).field_g[0])[1], ((int[]) ((rh) this).field_g[3])[4]);
                break L1;
              }
            }
            if (!((rh) this).b((byte) -110)) {
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0 != 0;
            } else {
              param0 = param0.toLowerCase();
              var3_int = ((rh) this).field_m.field_j.a(tb.a((CharSequence) (Object) param0, false), (byte) 125);
              stackOut_8_0 = ((rh) this).c(var3_int, 14969);
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("rh.T(");
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
          throw pf.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    final boolean a(String param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        boolean stackOut_8_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (((rh) this).b((byte) -102)) {
              param1 = param1.toLowerCase();
              param0 = param0.toLowerCase();
              var4_int = ((rh) this).field_m.field_j.a(tb.a((CharSequence) (Object) param1, false), (byte) 121);
              if (!this.a(true, var4_int)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              } else {
                var5 = -70 / ((-21 - param2) / 33);
                var6 = ((rh) this).field_m.field_k[var4_int].a(tb.a((CharSequence) (Object) param0, false), (byte) 116);
                stackOut_8_0 = ((rh) this).a((byte) -29, var4_int, var6);
                stackIn_9_0 = stackOut_8_0;
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
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("rh.L(");
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
          L2: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L2;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param2 + ')');
        }
        return stackIn_9_0;
    }

    final synchronized boolean a(byte param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_5_0 = false;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_15_0 = 0;
        boolean stackOut_4_0 = false;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (this.a(-10, param1, param2)) {
              if (param0 == -29) {
                L1: {
                  if (((rh) this).field_l[param1] == null) {
                    break L1;
                  } else {
                    if (((rh) this).field_l[param1][param2] != null) {
                      stackOut_12_0 = 1;
                      stackIn_13_0 = stackOut_12_0;
                      return stackIn_13_0 != 0;
                    } else {
                      break L1;
                    }
                  }
                }
                if (((rh) this).field_g[param1] == null) {
                  this.a((byte) 101, param1);
                  if (null == ((rh) this).field_g[param1]) {
                    stackOut_20_0 = 0;
                    stackIn_21_0 = stackOut_20_0;
                    break L0;
                  } else {
                    stackOut_18_0 = 1;
                    stackIn_19_0 = stackOut_18_0;
                    return stackIn_19_0 != 0;
                  }
                } else {
                  stackOut_15_0 = 1;
                  stackIn_16_0 = stackOut_15_0;
                  return stackIn_16_0 != 0;
                }
              } else {
                stackOut_4_0 = ((boolean[]) ((rh) this).field_g[11])[1];
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
          var4 = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var4, "rh.CA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_21_0 != 0;
    }

    final boolean b(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
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
        int stackOut_4_0 = 0;
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
            L1: {
              if (param1 == 37) {
                break L1;
              } else {
                field_n = null;
                break L1;
              }
            }
            if (((rh) this).b((byte) -111)) {
              param0 = param0.toLowerCase();
              var3_int = ((rh) this).field_m.field_j.a(tb.a((CharSequence) (Object) param0, false), (byte) 126);
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
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("rh.K(");
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
          throw pf.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param1 + ')');
        }
        return stackIn_10_0 != 0;
    }

    public static void c(byte param0) {
        field_o = null;
        if (param0 != -110) {
            return;
        }
        try {
            field_f = null;
            field_c = null;
            field_k = null;
            field_p = null;
            field_b = null;
            field_n = null;
            field_j = null;
            field_e = null;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "rh.S(" + param0 + ')');
        }
    }

    final int a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
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
            if (((rh) this).b((byte) -101)) {
              if (param0 < -37) {
                param1 = param1.toLowerCase();
                var3_int = ((rh) this).field_m.field_j.a(tb.a((CharSequence) (Object) param1, false), (byte) 125);
                stackOut_6_0 = ((rh) this).b(var3_int, -2);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = ((int[]) ((rh) this).field_g[13])[2];
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("rh.P(").append(param0).append(',');
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L1;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
        return stackIn_7_0;
    }

    final int d(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (((rh) this).b((byte) -99)) {
              var2_int = -22 % ((-8 - param0) / 41);
              stackOut_3_0 = ((rh) this).field_m.field_v.length;
              stackIn_4_0 = stackOut_3_0;
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
          throw pf.a((Throwable) (Object) var2, "rh.D(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final static String a(byte param0, long param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        long var4 = 0L;
        StringBuilder var6 = null;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        String stackIn_29_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        byte stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        String stackOut_28_0 = null;
        Object stackOut_10_0 = null;
        Object stackOut_7_0 = null;
        var11 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 <= 0L) {
                break L1;
              } else {
                if (6582952005840035281L <= param1) {
                  break L1;
                } else {
                  if (0L != param1 % 37L) {
                    var3_int = 0;
                    var4 = param1;
                    L2: while (true) {
                      L3: {
                        if (var4 == 0L) {
                          break L3;
                        } else {
                          var3_int++;
                          var4 = var4 / 37L;
                          if (var11 == 0) {
                            continue L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      var6 = new StringBuilder(var3_int);
                      L4: while (true) {
                        L5: {
                          L6: {
                            if (param1 == 0L) {
                              break L6;
                            } else {
                              var7 = param1;
                              param1 = param1 / 37L;
                              var9 = ic.field_db[(int)(-(param1 * 37L) + var7)];
                              stackOut_17_0 = 95;
                              stackOut_17_1 = var9;
                              stackIn_25_0 = stackOut_17_0;
                              stackIn_25_1 = stackOut_17_1;
                              stackIn_18_0 = stackOut_17_0;
                              stackIn_18_1 = stackOut_17_1;
                              if (var11 != 0) {
                                break L5;
                              } else {
                                L7: {
                                  if (stackIn_18_0 == stackIn_18_1) {
                                    var10 = -1 + var6.length();
                                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                                    var9 = 160;
                                    break L7;
                                  } else {
                                    break L7;
                                  }
                                }
                                StringBuilder discarded$2 = var6.append((char) var9);
                                if (var11 == 0) {
                                  continue L4;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          stackOut_24_0 = param0;
                          stackOut_24_1 = -70;
                          stackIn_25_0 = stackOut_24_0;
                          stackIn_25_1 = stackOut_24_1;
                          break L5;
                        }
                        L8: {
                          if (stackIn_25_0 == stackIn_25_1) {
                            break L8;
                          } else {
                            field_e = null;
                            break L8;
                          }
                        }
                        StringBuilder discarded$3 = var6.reverse();
                        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
                        stackOut_28_0 = var6.toString();
                        stackIn_29_0 = stackOut_28_0;
                        break L0;
                      }
                    }
                  } else {
                    stackOut_10_0 = null;
                    stackIn_11_0 = stackOut_10_0;
                    return (String) (Object) stackIn_11_0;
                  }
                }
              }
            }
            stackOut_7_0 = null;
            stackIn_8_0 = stackOut_7_0;
            return (String) (Object) stackIn_8_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var3, "rh.J(" + param0 + ',' + param1 + ')');
        }
        return stackIn_29_0;
    }

    final int a(String param0, byte param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
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
            if (!this.a(true, param2)) {
              stackOut_3_0 = -1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              L1: {
                if (param1 == -15) {
                  break L1;
                } else {
                  field_b = null;
                  break L1;
                }
              }
              param0 = param0.toLowerCase();
              var4_int = ((rh) this).field_m.field_k[param2].a(tb.a((CharSequence) (Object) param0, false), (byte) 118);
              if (!this.a(-51, param2, var4_int)) {
                stackOut_11_0 = -1;
                stackIn_12_0 = stackOut_11_0;
                return stackIn_12_0;
              } else {
                stackOut_13_0 = var4_int;
                stackIn_14_0 = stackOut_13_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4;
            stackOut_15_1 = new StringBuilder().append("rh.V(");
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
              break L2;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L2;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_14_0;
    }

    final synchronized int b(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param1 == -2) {
              if (this.a(true, param0)) {
                if (null == ((rh) this).field_g[param0]) {
                  stackOut_9_0 = ((rh) this).field_i.a(param0, (byte) -5);
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  stackOut_7_0 = 100;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                }
              } else {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = -13;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var3, "rh.H(" + param0 + ',' + param1 + ')');
        }
        return stackIn_10_0;
    }

    private final synchronized boolean a(boolean param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0) {
              if (((rh) this).b((byte) -124)) {
                L1: {
                  if (param1 < 0) {
                    break L1;
                  } else {
                    if (param1 >= ((rh) this).field_m.field_v.length) {
                      break L1;
                    } else {
                      if (((rh) this).field_m.field_v[param1] != 0) {
                        stackOut_20_0 = 1;
                        stackIn_21_0 = stackOut_20_0;
                        break L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
                if (!rj.field_n) {
                  stackOut_18_0 = 0;
                  stackIn_19_0 = stackOut_18_0;
                  return stackIn_19_0 != 0;
                } else {
                  throw new IllegalArgumentException(Integer.toString(param1));
                }
              } else {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0 != 0;
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var3, "rh.G(" + param0 + ',' + param1 + ')');
        }
        return stackIn_21_0 != 0;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, String param5, int param6, int param7, ce param8) {
        RuntimeException var9 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              fh.field_g = param5;
              wj.field_d = param1;
              il.field_g = param4;
              of.field_b = param3;
              pg.field_c = param6;
              if (param2 == 8737) {
                break L1;
              } else {
                field_p = null;
                break L1;
              }
            }
            b.field_a = param0;
            mh.field_x = param8;
            tj.field_c = param7;
            td.field_k = (w) (Object) new g();
            vg.field_r = new af(param8);
            gf.field_e = new uf(td.field_k, vg.field_r);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var9 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var9;
            stackOut_5_1 = new StringBuilder().append("rh.R(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param5 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param6).append(',').append(param7).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param8 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
    }

    private final synchronized byte[] a(int param0, boolean param1, int[] param2, int param3) {
        Object var5 = null;
        int var6 = 0;
        Object stackIn_2_0 = null;
        byte[] stackIn_5_0 = null;
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
        Object stackOut_16_0 = null;
        Object stackOut_43_0 = null;
        byte[] stackOut_4_0 = null;
        Object stackOut_1_0 = null;
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
            if (this.a(-63, param3, param0)) {
              var5 = null;
              if (param1) {
                L1: {
                  L2: {
                    if (null == ((rh) this).field_l[param3]) {
                      break L2;
                    } else {
                      if (((rh) this).field_l[param3][param0] == null) {
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                  var6 = this.a(param2, param3, 0, param0) ? 1 : 0;
                  if (var6 != 0) {
                    break L1;
                  } else {
                    this.a((byte) 101, param3);
                    var6 = this.a(param2, param3, 0, param0) ? 1 : 0;
                    if (var6 == 0) {
                      stackOut_16_0 = null;
                      stackIn_17_0 = stackOut_16_0;
                      return (byte[]) (Object) stackIn_17_0;
                    } else {
                      break L1;
                    }
                  }
                }
                if (((rh) this).field_l[param3] != null) {
                  L3: {
                    if (((rh) this).field_l[param3][param0] != null) {
                      var5 = (Object) (Object) jg.a(false, ((rh) this).field_l[param3][param0], false);
                      if (var5 != null) {
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
                        if (((rh) this).field_h == 1) {
                          break L5;
                        } else {
                          if (((rh) this).field_h == 2) {
                            ((rh) this).field_l[param3] = null;
                            if (!fleas.field_A) {
                              break L4;
                            } else {
                              break L5;
                            }
                          } else {
                            break L4;
                          }
                        }
                      }
                      ((rh) this).field_l[param3][param0] = null;
                      if (1 == ((rh) this).field_m.field_v[param3]) {
                        ((rh) this).field_l[param3] = null;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  stackOut_43_0 = var5;
                  stackIn_44_0 = stackOut_43_0;
                  break L0;
                } else {
                  throw new RuntimeException("");
                }
              } else {
                stackOut_4_0 = (byte[]) ((rh) this).field_g[0];
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
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
            stackOut_45_0 = var5;
            stackOut_45_1 = new StringBuilder().append("rh.AA(").append(param0).append(',').append(param1).append(',');
            stackIn_48_0 = stackOut_45_0;
            stackIn_48_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param2 == null) {
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
          throw pf.a((Throwable) (Object) stackIn_49_0, stackIn_49_2 + ',' + param3 + ')');
        }
        return (byte[]) (Object) stackIn_44_0;
    }

    final byte[] a(int param0, byte param1, int param2) {
        RuntimeException var4 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              if (param1 >= 113) {
                break L1;
              } else {
                field_j = null;
                break L1;
              }
            }
            stackOut_3_0 = this.a(param2, true, (int[]) null, param0);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var4, "rh.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_4_0;
    }

    private final synchronized boolean a(int param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_18_0 = 0;
        try {
          L0: {
            var4_int = -7 / ((param0 - 68) / 34);
            if (!((rh) this).b((byte) -110)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                if (param1 < 0) {
                  break L1;
                } else {
                  if (param2 < 0) {
                    break L1;
                  } else {
                    if (~((rh) this).field_m.field_v.length >= ~param1) {
                      break L1;
                    } else {
                      if (~param2 <= ~((rh) this).field_m.field_v[param1]) {
                        break L1;
                      } else {
                        stackOut_21_0 = 1;
                        stackIn_22_0 = stackOut_21_0;
                        break L0;
                      }
                    }
                  }
                }
              }
              if (rj.field_n) {
                throw new IllegalArgumentException(param1 + " " + param2);
              } else {
                stackOut_18_0 = 0;
                stackIn_19_0 = stackOut_18_0;
                return stackIn_19_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var4, "rh.Q(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_22_0 != 0;
    }

    final synchronized byte[] a(int param0, int param1) {
        RuntimeException var3 = null;
        Object stackIn_4_0 = null;
        byte[] stackIn_7_0 = null;
        Object stackIn_10_0 = null;
        byte[] stackIn_15_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        byte[] stackOut_14_0 = null;
        Object stackOut_9_0 = null;
        byte[] stackOut_6_0 = null;
        try {
          if (!((rh) this).b((byte) -115)) {
            stackOut_3_0 = null;
            stackIn_4_0 = stackOut_3_0;
            return (byte[]) (Object) stackIn_4_0;
          } else {
            if (1 != ((rh) this).field_m.field_v.length) {
              if (this.a(true, param0)) {
                if (((rh) this).field_m.field_v[param0] == 1) {
                  stackOut_14_0 = ((rh) this).a(param0, (byte) 116, 0);
                  stackIn_15_0 = stackOut_14_0;
                  return stackIn_15_0;
                } else {
                  L0: {
                    if (param1 == 0) {
                      break L0;
                    } else {
                      ((rh) this).field_l = null;
                      break L0;
                    }
                  }
                  throw new RuntimeException();
                }
              } else {
                stackOut_9_0 = null;
                stackIn_10_0 = stackOut_9_0;
                return (byte[]) (Object) stackIn_10_0;
              }
            } else {
              stackOut_6_0 = ((rh) this).a(0, (byte) 117, param0);
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var3, "rh.A(" + param0 + ',' + param1 + ')');
        }
    }

    final int a(int param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_8_0 = 0;
        try {
          L0: {
            if (!this.a(true, param0)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              L1: {
                if (param1 <= -91) {
                  break L1;
                } else {
                  boolean discarded$2 = ((rh) this).c(-123, 42);
                  break L1;
                }
              }
              stackOut_8_0 = ((rh) this).field_m.field_v[param0];
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var3, "rh.U(" + param0 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    final synchronized byte[] a(int param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Object stackIn_2_0 = null;
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
        Object stackOut_9_0 = null;
        byte[] stackOut_11_0 = null;
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
            if (((rh) this).b((byte) -128)) {
              L1: {
                param2 = param2.toLowerCase();
                param1 = param1.toLowerCase();
                if (param0 == 0) {
                  break L1;
                } else {
                  field_k = null;
                  break L1;
                }
              }
              var4_int = ((rh) this).field_m.field_j.a(tb.a((CharSequence) (Object) param2, false), (byte) 118);
              if (!this.a(true, var4_int)) {
                stackOut_9_0 = null;
                stackIn_10_0 = stackOut_9_0;
                return (byte[]) (Object) stackIn_10_0;
              } else {
                var5 = ((rh) this).field_m.field_k[var4_int].a(tb.a((CharSequence) (Object) param1, false), (byte) 117);
                stackOut_11_0 = ((rh) this).a(var4_int, (byte) 115, var5);
                stackIn_12_0 = stackOut_11_0;
                break L0;
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
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("rh.W(").append(param0).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
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
          L3: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L3;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L3;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
        return stackIn_12_0;
    }

    private final synchronized void a(byte param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 101) {
                break L1;
              } else {
                boolean discarded$2 = ((rh) this).b((String) null, ((int[]) ((Object[]) ((rh) this).field_g[3])[7])[1]);
                break L1;
              }
            }
            L2: {
              L3: {
                if (((rh) this).field_d) {
                  break L3;
                } else {
                  ((rh) this).field_g[param1] = kh.a(false, ((rh) this).field_i.b(param1, false), -137);
                  if (!fleas.field_A) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              ((rh) this).field_g[param1] = (Object) (Object) ((rh) this).field_i.b(param1, false);
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var3, "rh.BA(" + param0 + ',' + param1 + ')');
        }
    }

    final synchronized int a(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_7_0 = 0;
        var5 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (!((rh) this).b((byte) -113)) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              var2_int = 0;
              var3 = 0;
              var4 = 0;
              if (param0 < -38) {
                L1: while (true) {
                  L2: {
                    L3: {
                      if (var4 >= ((rh) this).field_g.length) {
                        break L3;
                      } else {
                        stackOut_10_0 = ~((rh) this).field_m.field_f[var4];
                        stackOut_10_1 = -1;
                        stackIn_17_0 = stackOut_10_0;
                        stackIn_17_1 = stackOut_10_1;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        if (var5 != 0) {
                          break L2;
                        } else {
                          L4: {
                            if (stackIn_11_0 >= stackIn_11_1) {
                              break L4;
                            } else {
                              var2_int += 100;
                              var3 = var3 + ((rh) this).b(var4, -2);
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
                    stackOut_16_0 = ~var2_int;
                    stackOut_16_1 = -1;
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    break L2;
                  }
                  if (stackIn_17_0 != stackIn_17_1) {
                    var4 = var3 * 100 / var2_int;
                    stackOut_20_0 = var4;
                    stackIn_21_0 = stackOut_20_0;
                    break L0;
                  } else {
                    stackOut_18_0 = 100;
                    stackIn_19_0 = stackOut_18_0;
                    return stackIn_19_0;
                  }
                }
              } else {
                stackOut_7_0 = -101;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var2, "rh.I(" + param0 + ')');
        }
        return stackIn_21_0;
    }

    final synchronized boolean c(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (this.a(true, param0)) {
              if (null != ((rh) this).field_g[param0]) {
                stackOut_6_0 = 1;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              } else {
                this.a((byte) 101, param0);
                if (param1 == 14969) {
                  if (((rh) this).field_g[param0] != null) {
                    stackOut_14_0 = 1;
                    stackIn_15_0 = stackOut_14_0;
                    return stackIn_15_0 != 0;
                  } else {
                    stackOut_16_0 = 0;
                    stackIn_17_0 = stackOut_16_0;
                    break L0;
                  }
                } else {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0 != 0;
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
          var3 = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var3, "rh.O(" + param0 + ',' + param1 + ')');
        }
        return stackIn_17_0 != 0;
    }

    rh(gi param0, boolean param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        ((rh) this).field_m = null;
        try {
          L0: {
            L1: {
              if (param2 < 0) {
                break L1;
              } else {
                if (param2 <= 2) {
                  ((rh) this).field_h = param2;
                  ((rh) this).field_i = param0;
                  ((rh) this).field_d = param1;
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
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) runtimeException;
            stackOut_7_1 = new StringBuilder().append("rh.<init>(");
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L2;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Previous";
        field_o = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        field_a = 20;
        field_f = new mj();
        field_e = null;
        field_j = new boolean[]{false, false, false, true, true, false, false, false, false, false, false, false, false, false, false, false};
    }
}
