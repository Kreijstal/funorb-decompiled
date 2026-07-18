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
            if (!((vr) this).a(0)) {
              stackOut_3_0 = -1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              L1: {
                param0 = param0.toLowerCase();
                var3_int = ((vr) this).field_f.field_m.a((byte) -79, efa.a((CharSequence) (Object) param0, true));
                if (!param1) {
                  break L1;
                } else {
                  byte[] discarded$2 = ((vr) this).b(87, 101);
                  break L1;
                }
              }
              if (this.a(var3_int, (byte) 70)) {
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
            stackOut_13_1 = new StringBuilder().append("vr.U(");
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
          throw pe.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param1 + ')');
        }
        return stackIn_12_0;
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
              if (param1 == 20637) {
                break L1;
              } else {
                boolean discarded$2 = ((vr) this).a(15);
                break L1;
              }
            }
            if (!((vr) this).a(param1 + -20637)) {
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0 != 0;
            } else {
              param0 = param0.toLowerCase();
              var3_int = ((vr) this).field_f.field_m.a((byte) -75, efa.a((CharSequence) (Object) param0, true));
              stackOut_8_0 = ((vr) this).c(var3_int, -734);
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("vr.AA(");
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
          throw pe.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    final synchronized boolean a(int param0) {
        RuntimeException var2 = null;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_12_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                int discarded$2 = ((vr) this).a((byte) -17);
                break L1;
              }
            }
            L2: {
              if (((vr) this).field_f != null) {
                break L2;
              } else {
                ((vr) this).field_f = ((vr) this).field_a.b(-16);
                if (((vr) this).field_f == null) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0 != 0;
                } else {
                  ((vr) this).field_c = new Object[((vr) this).field_f.field_f];
                  ((vr) this).field_d = new Object[((vr) this).field_f.field_f][];
                  break L2;
                }
              }
            }
            stackOut_12_0 = 1;
            stackIn_13_0 = stackOut_12_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "vr.N(" + param0 + ')');
        }
        return stackIn_13_0 != 0;
    }

    private final synchronized boolean a(int[] param0, byte param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        Object[] var9 = null;
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
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int[] stackIn_19_0 = null;
        int stackIn_35_0 = 0;
        int[] stackIn_42_0 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        int stackIn_57_2 = 0;
        int stackIn_80_0 = 0;
        int stackIn_89_0 = 0;
        int stackIn_99_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_127_0 = 0;
        int stackIn_143_0 = 0;
        int stackIn_145_0 = 0;
        int stackIn_149_0 = 0;
        int stackIn_166_0 = 0;
        RuntimeException stackIn_168_0 = null;
        StringBuilder stackIn_168_1 = null;
        RuntimeException stackIn_170_0 = null;
        StringBuilder stackIn_170_1 = null;
        RuntimeException stackIn_171_0 = null;
        StringBuilder stackIn_171_1 = null;
        String stackIn_171_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int[] stackOut_18_0 = null;
        int stackOut_34_0 = 0;
        int[] stackOut_40_0 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        int stackOut_56_2 = 0;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        int stackOut_54_2 = 0;
        int stackOut_79_0 = 0;
        int stackOut_88_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_107_0 = 0;
        int stackOut_126_0 = 0;
        int stackOut_142_0 = 0;
        int stackOut_148_0 = 0;
        int stackOut_144_0 = 0;
        int stackOut_165_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_167_0 = null;
        StringBuilder stackOut_167_1 = null;
        RuntimeException stackOut_170_0 = null;
        StringBuilder stackOut_170_1 = null;
        String stackOut_170_2 = null;
        RuntimeException stackOut_168_0 = null;
        StringBuilder stackOut_168_1 = null;
        String stackOut_168_2 = null;
        var22 = BachelorFridge.field_y;
        try {
          L0: {
            if (this.a(param3, (byte) 70)) {
              if (((vr) this).field_c[param3] == null) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0 != 0;
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
                            if (~var9_int <= ~var5_int) {
                              break L8;
                            } else {
                              stackOut_18_0 = (int[]) var6;
                              stackIn_42_0 = stackOut_18_0;
                              stackIn_19_0 = stackOut_18_0;
                              if (var22 != 0) {
                                break L7;
                              } else {
                                L9: {
                                  L10: {
                                    if (stackIn_19_0 == null) {
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
                                if (var22 == 0) {
                                  continue L3;
                                } else {
                                  break L8;
                                }
                              }
                            }
                          }
                          if (var8 != 0) {
                            stackOut_34_0 = 1;
                            stackIn_35_0 = stackOut_34_0;
                            return stackIn_35_0 != 0;
                          } else {
                            if (null == param0) {
                              break L5;
                            } else {
                              if (param0[0] != 0) {
                                break L6;
                              } else {
                                stackOut_40_0 = (int[]) param0;
                                stackIn_42_0 = stackOut_40_0;
                                break L7;
                              }
                            }
                          }
                        }
                        if (stackIn_42_0[1] != 0) {
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
                      var10_array = td.a(-124, var9_array);
                      break L12;
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L13: {
                      var11_ref_RuntimeException = decompiledCaughtException;
                      stackOut_53_0 = (RuntimeException) var11_ref_RuntimeException;
                      stackOut_53_1 = new StringBuilder();
                      stackIn_56_0 = stackOut_53_0;
                      stackIn_56_1 = stackOut_53_1;
                      stackIn_54_0 = stackOut_53_0;
                      stackIn_54_1 = stackOut_53_1;
                      if (param0 == null) {
                        stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
                        stackOut_56_1 = (StringBuilder) (Object) stackIn_56_1;
                        stackOut_56_2 = 0;
                        stackIn_57_0 = stackOut_56_0;
                        stackIn_57_1 = stackOut_56_1;
                        stackIn_57_2 = stackOut_56_2;
                        break L13;
                      } else {
                        stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
                        stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
                        stackOut_54_2 = 1;
                        stackIn_57_0 = stackOut_54_0;
                        stackIn_57_1 = stackOut_54_1;
                        stackIn_57_2 = stackOut_54_2;
                        break L13;
                      }
                    }
                    throw pe.a((Throwable) (Object) stackIn_57_0, (stackIn_57_2 != 0) + " " + param3 + " " + var9_array.length + " " + wc.a(var9_array, -31303, var9_array.length) + " " + wc.a(var9_array, -31303, var9_array.length - 2) + " " + ((vr) this).field_f.field_p[param3] + " " + ((vr) this).field_f.field_b);
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
                              if (null != var6) {
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
                                var7[var11] = (Object) (Object) var10_array;
                                if (var22 == 0) {
                                  break L20;
                                } else {
                                  break L21;
                                }
                              }
                            }
                            var7[var11] = ug.a(false, var10_array, -19524);
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
                          var11 = var10_array.length;
                          var11--;
                          var12 = var10_array[var11] & 255;
                          var11 = var11 - 4 * (var5_int * var12);
                          var13 = new lu(var10_array);
                          var13.field_g = var11;
                          var14_ref_int__ = new int[var5_int];
                          var15 = 0;
                          L23: while (true) {
                            L24: {
                              L25: {
                                if (var15 >= var12) {
                                  break L25;
                                } else {
                                  var16_int = 0;
                                  stackOut_79_0 = 0;
                                  stackIn_89_0 = stackOut_79_0;
                                  stackIn_80_0 = stackOut_79_0;
                                  if (var22 != 0) {
                                    break L24;
                                  } else {
                                    var17 = stackIn_80_0;
                                    L26: while (true) {
                                      L27: {
                                        L28: {
                                          if (~var17 <= ~var5_int) {
                                            break L28;
                                          } else {
                                            var16_int = var16_int + var13.f(-128);
                                            var14_ref_int__[var17] = var14_ref_int__[var17] + var16_int;
                                            var17++;
                                            if (var22 != 0) {
                                              break L27;
                                            } else {
                                              if (var22 == 0) {
                                                continue L26;
                                              } else {
                                                break L28;
                                              }
                                            }
                                          }
                                        }
                                        var15++;
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
                              stackOut_88_0 = var5_int;
                              stackIn_89_0 = stackOut_88_0;
                              break L24;
                            }
                            var15_ref_byte____ = new byte[stackIn_89_0][];
                            var16_int = 0;
                            L29: while (true) {
                              L30: {
                                L31: {
                                  if (var5_int <= var16_int) {
                                    break L31;
                                  } else {
                                    var15_ref_byte____[var16_int] = new byte[var14_ref_int__[var16_int]];
                                    var14_ref_int__[var16_int] = 0;
                                    var16_int++;
                                    if (var22 != 0) {
                                      break L30;
                                    } else {
                                      if (var22 == 0) {
                                        continue L29;
                                      } else {
                                        break L31;
                                      }
                                    }
                                  }
                                }
                                var13.field_g = var11;
                                var16_int = 0;
                                break L30;
                              }
                              var17 = 0;
                              L32: while (true) {
                                L33: {
                                  L34: {
                                    if (~var17 <= ~var12) {
                                      break L34;
                                    } else {
                                      var18 = 0;
                                      stackOut_98_0 = 0;
                                      stackIn_108_0 = stackOut_98_0;
                                      stackIn_99_0 = stackOut_98_0;
                                      if (var22 != 0) {
                                        break L33;
                                      } else {
                                        var19 = stackIn_99_0;
                                        L35: while (true) {
                                          L36: {
                                            L37: {
                                              if (~var19 <= ~var5_int) {
                                                break L37;
                                              } else {
                                                var18 = var18 + var13.f(72);
                                                bl.a(var10_array, var16_int, var15_ref_byte____[var19], var14_ref_int__[var19], var18);
                                                var16_int = var16_int + var18;
                                                var14_ref_int__[var19] = var14_ref_int__[var19] + var18;
                                                var19++;
                                                if (var22 != 0) {
                                                  break L36;
                                                } else {
                                                  if (var22 == 0) {
                                                    continue L35;
                                                  } else {
                                                    break L37;
                                                  }
                                                }
                                              }
                                            }
                                            var17++;
                                            break L36;
                                          }
                                          if (var22 == 0) {
                                            continue L32;
                                          } else {
                                            break L34;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  stackOut_107_0 = 0;
                                  stackIn_108_0 = stackOut_107_0;
                                  break L33;
                                }
                                var17 = stackIn_108_0;
                                L38: while (true) {
                                  L39: {
                                    if (var17 >= var5_int) {
                                      break L39;
                                    } else {
                                      if (var22 != 0) {
                                        break L16;
                                      } else {
                                        L40: {
                                          L41: {
                                            if (var6 == null) {
                                              break L41;
                                            } else {
                                              var18 = var6[var17];
                                              if (var22 == 0) {
                                                break L40;
                                              } else {
                                                break L41;
                                              }
                                            }
                                          }
                                          var18 = var17;
                                          break L40;
                                        }
                                        L42: {
                                          L43: {
                                            if (((vr) this).field_e == 0) {
                                              break L43;
                                            } else {
                                              var7[var18] = (Object) (Object) var15_ref_byte____[var17];
                                              if (var22 == 0) {
                                                break L42;
                                              } else {
                                                break L43;
                                              }
                                            }
                                          }
                                          var7[var18] = ug.a(false, var15_ref_byte____[var17], -19524);
                                          break L42;
                                        }
                                        var17++;
                                        if (var22 == 0) {
                                          continue L38;
                                        } else {
                                          break L39;
                                        }
                                      }
                                    }
                                  }
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
                      }
                      var11 = var10_array.length;
                      var11--;
                      var12 = 255 & var10_array[var11];
                      var11 = var11 - var12 * (var5_int * 4);
                      var13 = new lu(var10_array);
                      var14 = 0;
                      var15 = 0;
                      var13.field_g = var11;
                      var16_int = 0;
                      L44: while (true) {
                        L45: {
                          L46: {
                            if (var12 <= var16_int) {
                              break L46;
                            } else {
                              var17 = 0;
                              stackOut_126_0 = 0;
                              stackIn_143_0 = stackOut_126_0;
                              stackIn_127_0 = stackOut_126_0;
                              if (var22 != 0) {
                                break L45;
                              } else {
                                var18 = stackIn_127_0;
                                L47: while (true) {
                                  L48: {
                                    L49: {
                                      if (var5_int <= var18) {
                                        break L49;
                                      } else {
                                        var17 = var17 + var13.f(-68);
                                        if (var22 != 0) {
                                          break L48;
                                        } else {
                                          L50: {
                                            L51: {
                                              if (null != var6) {
                                                break L51;
                                              } else {
                                                var19 = var18;
                                                if (var22 == 0) {
                                                  break L50;
                                                } else {
                                                  break L51;
                                                }
                                              }
                                            }
                                            var19 = var6[var18];
                                            break L50;
                                          }
                                          L52: {
                                            if (param2 == var19) {
                                              var14 = var14 + var17;
                                              var15 = var19;
                                              break L52;
                                            } else {
                                              break L52;
                                            }
                                          }
                                          var18++;
                                          if (var22 == 0) {
                                            continue L47;
                                          } else {
                                            break L49;
                                          }
                                        }
                                      }
                                    }
                                    var16_int++;
                                    break L48;
                                  }
                                  if (var22 == 0) {
                                    continue L44;
                                  } else {
                                    break L46;
                                  }
                                }
                              }
                            }
                          }
                          stackOut_142_0 = ~var14;
                          stackIn_143_0 = stackOut_142_0;
                          break L45;
                        }
                        if (stackIn_143_0 != -1) {
                          var16 = new byte[var14];
                          var13.field_g = var11;
                          var14 = 0;
                          var17 = 0;
                          var18 = 0;
                          L53: while (true) {
                            L54: {
                              if (~var18 <= ~var12) {
                                break L54;
                              } else {
                                var19 = 0;
                                stackOut_148_0 = 0;
                                stackIn_166_0 = stackOut_148_0;
                                stackIn_149_0 = stackOut_148_0;
                                if (var22 != 0) {
                                  break L15;
                                } else {
                                  var20 = stackIn_149_0;
                                  L55: while (true) {
                                    L56: {
                                      L57: {
                                        if (var20 >= var5_int) {
                                          break L57;
                                        } else {
                                          var19 = var19 + var13.f(124);
                                          if (var22 != 0) {
                                            break L56;
                                          } else {
                                            L58: {
                                              L59: {
                                                if (null == var6) {
                                                  break L59;
                                                } else {
                                                  var21 = var6[var20];
                                                  if (var22 == 0) {
                                                    break L58;
                                                  } else {
                                                    break L59;
                                                  }
                                                }
                                              }
                                              var21 = var20;
                                              break L58;
                                            }
                                            L60: {
                                              if (~var21 == ~param2) {
                                                bl.a(var10_array, var17, var16, var14, var19);
                                                var14 = var14 + var19;
                                                break L60;
                                              } else {
                                                break L60;
                                              }
                                            }
                                            var17 = var17 + var19;
                                            var20++;
                                            if (var22 == 0) {
                                              continue L55;
                                            } else {
                                              break L57;
                                            }
                                          }
                                        }
                                      }
                                      var18++;
                                      break L56;
                                    }
                                    if (var22 == 0) {
                                      continue L53;
                                    } else {
                                      break L54;
                                    }
                                  }
                                }
                              }
                            }
                            var7[var15] = (Object) (Object) var16;
                            break L16;
                          }
                        } else {
                          stackOut_144_0 = 1;
                          stackIn_145_0 = stackOut_144_0;
                          return stackIn_145_0 != 0;
                        }
                      }
                    }
                    stackOut_165_0 = 1;
                    stackIn_166_0 = stackOut_165_0;
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
          L61: {
            var5 = decompiledCaughtException;
            stackOut_167_0 = (RuntimeException) var5;
            stackOut_167_1 = new StringBuilder().append("vr.CA(");
            stackIn_170_0 = stackOut_167_0;
            stackIn_170_1 = stackOut_167_1;
            stackIn_168_0 = stackOut_167_0;
            stackIn_168_1 = stackOut_167_1;
            if (param0 == null) {
              stackOut_170_0 = (RuntimeException) (Object) stackIn_170_0;
              stackOut_170_1 = (StringBuilder) (Object) stackIn_170_1;
              stackOut_170_2 = "null";
              stackIn_171_0 = stackOut_170_0;
              stackIn_171_1 = stackOut_170_1;
              stackIn_171_2 = stackOut_170_2;
              break L61;
            } else {
              stackOut_168_0 = (RuntimeException) (Object) stackIn_168_0;
              stackOut_168_1 = (StringBuilder) (Object) stackIn_168_1;
              stackOut_168_2 = "{...}";
              stackIn_171_0 = stackOut_168_0;
              stackIn_171_1 = stackOut_168_1;
              stackIn_171_2 = stackOut_168_2;
              break L61;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_171_0, stackIn_171_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_166_0 != 0;
    }

    final synchronized byte[] a(byte param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_5_0 = null;
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
        Object stackOut_4_0 = null;
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
            if (((vr) this).a(0)) {
              param2 = param2.toLowerCase();
              if (param0 == 123) {
                param1 = param1.toLowerCase();
                var4_int = ((vr) this).field_f.field_m.a((byte) -87, efa.a((CharSequence) (Object) param2, true));
                if (this.a(var4_int, (byte) 70)) {
                  var5 = ((vr) this).field_f.field_l[var4_int].a((byte) -81, efa.a((CharSequence) (Object) param1, true));
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
            stackOut_11_1 = new StringBuilder().append("vr.Q(").append(param0).append(',');
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
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L1;
            }
          }
          L2: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
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
          throw pe.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
        return stackIn_10_0;
    }

    public static void b(int param0) {
        if (param0 != -19779) {
            return;
        }
        try {
            field_h = null;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "vr.R(" + param0 + ')');
        }
    }

    final int a(byte param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 == 20) {
              if (!((vr) this).a(0)) {
                stackOut_6_0 = -1;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                stackOut_8_0 = ((vr) this).field_f.field_j.length;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              }
            } else {
              stackOut_1_0 = -79;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "vr.B(" + param0 + ')');
        }
        return stackIn_9_0;
    }

    private final synchronized boolean a(boolean param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_23_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (((vr) this).a(0)) {
              L1: {
                if (param1 < 0) {
                  break L1;
                } else {
                  if (param2 < 0) {
                    break L1;
                  } else {
                    if (~((vr) this).field_f.field_j.length >= ~param1) {
                      break L1;
                    } else {
                      if (~param2 <= ~((vr) this).field_f.field_j[param1]) {
                        break L1;
                      } else {
                        L2: {
                          if (!param0) {
                            break L2;
                          } else {
                            int discarded$2 = ((vr) this).a((String) null, false);
                            break L2;
                          }
                        }
                        stackOut_23_0 = 1;
                        stackIn_24_0 = stackOut_23_0;
                        break L0;
                      }
                    }
                  }
                }
              }
              if (!cia.field_j) {
                stackOut_18_0 = 0;
                stackIn_19_0 = stackOut_18_0;
                return stackIn_19_0 != 0;
              } else {
                throw new IllegalArgumentException(param1 + " " + param2);
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
          throw pe.a((Throwable) (Object) var4, "vr.K(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_24_0 != 0;
    }

    final boolean a(String param0, boolean param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_2_0 = 0;
        boolean stackIn_5_0 = false;
        cr stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        String stackIn_7_2 = null;
        cr stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        String stackIn_9_2 = null;
        cr stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        String stackIn_10_2 = null;
        int stackIn_10_3 = 0;
        int stackIn_12_0 = 0;
        boolean stackIn_14_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        cr stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        String stackOut_6_2 = null;
        cr stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        String stackOut_9_2 = null;
        int stackOut_9_3 = 0;
        cr stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        String stackOut_7_2 = null;
        int stackOut_7_3 = 0;
        boolean stackOut_13_0 = false;
        int stackOut_11_0 = 0;
        boolean stackOut_4_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
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
                  stackIn_9_0 = stackOut_6_0;
                  stackIn_9_1 = stackOut_6_1;
                  stackIn_9_2 = stackOut_6_2;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  stackIn_7_2 = stackOut_6_2;
                  if (param1) {
                    stackOut_9_0 = (cr) (Object) stackIn_9_0;
                    stackOut_9_1 = stackIn_9_1;
                    stackOut_9_2 = (String) (Object) stackIn_9_2;
                    stackOut_9_3 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    stackIn_10_2 = stackOut_9_2;
                    stackIn_10_3 = stackOut_9_3;
                    break L1;
                  } else {
                    stackOut_7_0 = (cr) (Object) stackIn_7_0;
                    stackOut_7_1 = stackIn_7_1;
                    stackOut_7_2 = (String) (Object) stackIn_7_2;
                    stackOut_7_3 = 1;
                    stackIn_10_0 = stackOut_7_0;
                    stackIn_10_1 = stackOut_7_1;
                    stackIn_10_2 = stackOut_7_2;
                    stackIn_10_3 = stackOut_7_3;
                    break L1;
                  }
                }
                var4_int = ((cr) (Object) stackIn_10_0).a((byte) stackIn_10_1, efa.a((CharSequence) (Object) stackIn_10_2, stackIn_10_3 != 0));
                if (this.a(var4_int, (byte) 70)) {
                  var5 = ((vr) this).field_f.field_l[var4_int].a((byte) -104, efa.a((CharSequence) (Object) param0, true));
                  stackOut_13_0 = ((vr) this).a(-121, var5, var4_int);
                  stackIn_14_0 = stackOut_13_0;
                  break L0;
                } else {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0 != 0;
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
            stackOut_15_0 = (RuntimeException) var4;
            stackOut_15_1 = new StringBuilder().append("vr.P(");
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
          L3: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param1).append(',');
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L3;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ')');
        }
        return stackIn_14_0;
    }

    final synchronized int a(boolean param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_7_0 = 0;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            if (!((vr) this).a(0)) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              var2_int = 0;
              var3 = 0;
              if (param0) {
                var4 = 0;
                L1: while (true) {
                  L2: {
                    L3: {
                      if (~var4 <= ~((vr) this).field_c.length) {
                        break L3;
                      } else {
                        stackOut_11_0 = ~((vr) this).field_f.field_e[var4];
                        stackOut_11_1 = -1;
                        stackIn_23_0 = stackOut_11_0;
                        stackIn_23_1 = stackOut_11_1;
                        stackIn_12_0 = stackOut_11_0;
                        stackIn_12_1 = stackOut_11_1;
                        if (var5 != 0) {
                          break L2;
                        } else {
                          L4: {
                            if (stackIn_12_0 >= stackIn_12_1) {
                              break L4;
                            } else {
                              var3 = var3 + ((vr) this).b(var4, (byte) -87);
                              var2_int += 100;
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
                    if (var2_int == 0) {
                      stackOut_20_0 = 100;
                      stackIn_21_0 = stackOut_20_0;
                      return stackIn_21_0;
                    } else {
                      stackOut_22_0 = var3 * 100;
                      stackOut_22_1 = var2_int;
                      stackIn_23_0 = stackOut_22_0;
                      stackIn_23_1 = stackOut_22_1;
                      break L2;
                    }
                  }
                  var4 = stackIn_23_0 / stackIn_23_1;
                  stackOut_23_0 = var4;
                  stackIn_24_0 = stackOut_23_0;
                  break L0;
                }
              } else {
                stackOut_7_0 = 1;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "vr.V(" + param0 + ')');
        }
        return stackIn_24_0;
    }

    final boolean b(String param0, boolean param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
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
        int stackOut_8_0 = 0;
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
            if (!((vr) this).a(0)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              param0 = param0.toLowerCase();
              var3_int = ((vr) this).field_f.field_m.a((byte) -115, efa.a((CharSequence) (Object) param0, true));
              if (var3_int < 0) {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0 != 0;
              } else {
                L1: {
                  if (!param1) {
                    break L1;
                  } else {
                    int discarded$2 = ((vr) this).a(((byte[]) ((vr) this).field_c[0])[9], -128, (String) ((vr) this).field_c[0]);
                    break L1;
                  }
                }
                stackOut_13_0 = 1;
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
            stackOut_15_1 = new StringBuilder().append("vr.W(");
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
          throw pe.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param1 + ')');
        }
        return stackIn_14_0 != 0;
    }

    final synchronized int b(int param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_13_0 = 0;
        try {
          L0: {
            L1: {
              if (param1 == -87) {
                break L1;
              } else {
                boolean discarded$2 = ((vr) this).a(((int[]) ((vr) this).field_c[13])[1]);
                break L1;
              }
            }
            if (!this.a(param0, (byte) 70)) {
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            } else {
              if (((vr) this).field_c[param0] != null) {
                stackOut_11_0 = 100;
                stackIn_12_0 = stackOut_11_0;
                return stackIn_12_0;
              } else {
                stackOut_13_0 = ((vr) this).field_a.a(8192, param0);
                stackIn_14_0 = stackOut_13_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var3, "vr.H(" + param0 + ',' + param1 + ')');
        }
        return stackIn_14_0;
    }

    private final synchronized byte[] a(int param0, int[] param1, int param2, int param3) {
        Object var5 = null;
        int var6 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_17_0 = null;
        Object stackIn_43_0 = null;
        Object stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        Object stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        Object stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_16_0 = null;
        Object stackOut_42_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        Object stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        Object stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        Object stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
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
                  var6 = this.a(param1, (byte) -116, param3, param0) ? 1 : 0;
                  if (var6 != 0) {
                    break L1;
                  } else {
                    this.e(param0, param2 + 3);
                    var6 = this.a(param1, (byte) -101, param3, param0) ? 1 : 0;
                    if (var6 == 0) {
                      stackOut_16_0 = null;
                      stackIn_17_0 = stackOut_16_0;
                      return (byte[]) (Object) stackIn_17_0;
                    } else {
                      break L1;
                    }
                  }
                }
                if (((vr) this).field_d[param0] != null) {
                  L3: {
                    if (null != ((vr) this).field_d[param0][param3]) {
                      var5 = (Object) (Object) tb.a(false, (byte) 96, ((vr) this).field_d[param0][param3]);
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
                  stackOut_42_0 = var5;
                  stackIn_43_0 = stackOut_42_0;
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
            stackOut_44_0 = var5;
            stackOut_44_1 = new StringBuilder().append("vr.I(").append(param0).append(',');
            stackIn_47_0 = stackOut_44_0;
            stackIn_47_1 = stackOut_44_1;
            stackIn_45_0 = stackOut_44_0;
            stackIn_45_1 = stackOut_44_1;
            if (param1 == null) {
              stackOut_47_0 = stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "null";
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              break L6;
            } else {
              stackOut_45_0 = stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "{...}";
              stackIn_48_0 = stackOut_45_0;
              stackIn_48_1 = stackOut_45_1;
              stackIn_48_2 = stackOut_45_2;
              break L6;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_48_0, stackIn_48_2 + ',' + param2 + ',' + param3 + ')');
        }
        return (byte[]) (Object) stackIn_43_0;
    }

    final static void a(byte param0, int param1) {
        ne var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
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
            var2 = (ne) (Object) rg.field_f.b((byte) 90);
            L2: while (true) {
              L3: {
                L4: {
                  if (var2 == null) {
                    break L4;
                  } else {
                    kja.a(param1, (byte) 58, var2);
                    var2 = (ne) (Object) rg.field_f.c(0);
                    if (var3 != 0) {
                      break L3;
                    } else {
                      if (var3 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2_ref, "vr.M(" + param0 + ',' + param1 + ')');
        }
    }

    final synchronized boolean c(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_18_0 = 0;
        try {
          L0: {
            if (!this.a(param0, (byte) 70)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                if (param1 == -734) {
                  break L1;
                } else {
                  ((vr) this).field_a = null;
                  break L1;
                }
              }
              if (((vr) this).field_c[param0] != null) {
                stackOut_11_0 = 1;
                stackIn_12_0 = stackOut_11_0;
                return stackIn_12_0 != 0;
              } else {
                this.e(param0, 0);
                if (((vr) this).field_c[param0] != null) {
                  stackOut_16_0 = 1;
                  stackIn_17_0 = stackOut_16_0;
                  return stackIn_17_0 != 0;
                } else {
                  stackOut_18_0 = 0;
                  stackIn_19_0 = stackOut_18_0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var3, "vr.O(" + param0 + ',' + param1 + ')');
        }
        return stackIn_19_0 != 0;
    }

    final synchronized boolean b(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_18_0 = 0;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            if (!((vr) this).a(0)) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              L1: {
                var2_int = 1;
                if (param0 >= 87) {
                  break L1;
                } else {
                  vr.a((byte) -107, ((int[]) ((vr) this).field_c[5])[10]);
                  break L1;
                }
              }
              var3 = 0;
              L2: while (true) {
                L3: {
                  L4: {
                    if (var3 >= ((vr) this).field_f.field_o.length) {
                      break L4;
                    } else {
                      stackOut_11_0 = ((vr) this).field_f.field_o[var3];
                      stackIn_19_0 = stackOut_11_0;
                      stackIn_12_0 = stackOut_11_0;
                      if (var5 != 0) {
                        break L3;
                      } else {
                        L5: {
                          var4 = stackIn_12_0;
                          if (null == ((vr) this).field_c[var4]) {
                            this.e(var4, 0);
                            if (null != ((vr) this).field_c[var4]) {
                              break L5;
                            } else {
                              var2_int = 0;
                              break L5;
                            }
                          } else {
                            break L5;
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
                  stackOut_18_0 = var2_int;
                  stackIn_19_0 = stackOut_18_0;
                  break L3;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "vr.G(" + param0 + ')');
        }
        return stackIn_19_0 != 0;
    }

    final byte[] b(int param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        byte[] stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_0_0 = null;
        try {
          L0: {
            var4_int = -67 % ((param0 - 20) / 34);
            stackOut_0_0 = this.a(param1, (int[]) null, -3, param2);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var4, "vr.S(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_1_0;
    }

    private final synchronized void e(int param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                boolean discarded$2 = ((vr) this).b((byte) 86);
                break L1;
              }
            }
            L2: {
              L3: {
                if (!((vr) this).field_g) {
                  break L3;
                } else {
                  ((vr) this).field_c[param0] = (Object) (Object) ((vr) this).field_a.a((byte) 112, param0);
                  if (BachelorFridge.field_y == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              ((vr) this).field_c[param0] = ug.a(false, ((vr) this).field_a.a((byte) 101, param0), -19524);
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var3, "vr.A(" + param0 + ',' + param1 + ')');
        }
    }

    private final synchronized boolean a(int param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_17_0 = 0;
        try {
          L0: {
            if (!((vr) this).a(0)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                if (param0 < 0) {
                  break L1;
                } else {
                  if (~param0 <= ~((vr) this).field_f.field_j.length) {
                    break L1;
                  } else {
                    if (((vr) this).field_f.field_j[param0] != 0) {
                      L2: {
                        if (param1 == 70) {
                          break L2;
                        } else {
                          boolean discarded$2 = this.a((int[]) ((vr) this).field_c[7], ((byte[]) ((vr) this).field_c[23])[2], ((int[]) ((vr) this).field_c[11])[1], 106);
                          break L2;
                        }
                      }
                      stackOut_22_0 = 1;
                      stackIn_23_0 = stackOut_22_0;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              if (!cia.field_j) {
                stackOut_17_0 = 0;
                stackIn_18_0 = stackOut_17_0;
                return stackIn_18_0 != 0;
              } else {
                throw new IllegalArgumentException(Integer.toString(param0));
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var3, "vr.BA(" + param0 + ',' + param1 + ')');
        }
        return stackIn_23_0 != 0;
    }

    final synchronized boolean a(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_7_0 = false;
        int stackIn_10_0 = 0;
        boolean stackIn_15_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0 = false;
        boolean stackOut_14_0 = false;
        int stackOut_9_0 = 0;
        int stackOut_1_0 = 0;
        try {
          if (((vr) this).a(param0 + param0)) {
            if (((vr) this).field_f.field_j.length == 1) {
              stackOut_6_0 = ((vr) this).a(-126, param1, 0);
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            } else {
              if (this.a(param1, (byte) 70)) {
                if (((vr) this).field_f.field_j[param1] == 1) {
                  stackOut_14_0 = ((vr) this).a(param0 + -102, 0, param1);
                  stackIn_15_0 = stackOut_14_0;
                  return stackIn_15_0;
                } else {
                  throw new RuntimeException();
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
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var3, "vr.D(" + param0 + ',' + param1 + ')');
        }
    }

    final int a(byte param0, int param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
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
            if (!this.a(param1, (byte) 70)) {
              stackOut_3_0 = -1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
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
              var4_int = ((vr) this).field_f.field_l[param1].a((byte) -128, efa.a((CharSequence) (Object) param2, true));
              if (this.a(false, param1, var4_int)) {
                stackOut_11_0 = var4_int;
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
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("vr.C(").append(param0).append(',').append(param1).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
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
          throw pe.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
        return stackIn_12_0;
    }

    final int d(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                vr.a(-90, (po) ((Object[]) ((Object[]) ((vr) this).field_c[6])[0])[9], 120, ((int[]) ((vr) this).field_c[35])[29], 19, (kv[]) null, -99, (po) null, -110, ((int[]) ((vr) this).field_c[0])[6], ((boolean[]) ((vr) this).field_c[35])[11], (kv[]) null, 84, ((int[]) ((vr) this).field_c[0])[0], 54);
                break L1;
              }
            }
            if (this.a(param0, (byte) 70)) {
              stackOut_6_0 = ((vr) this).field_f.field_j[param0];
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var3, "vr.J(" + param0 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    final static void a(int param0, po param1, int param2, int param3, int param4, kv[] param5, int param6, po param7, int param8, int param9, boolean param10, kv[] param11, int param12, int param13, int param14) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
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
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
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
            ll.a(jc.field_t, param13, param3, param2, param8, param5, 0, param6, param1, param9, param4, (kv[]) null, nja.field_a, param11, param7, param0, 0, 256, param12, param14, fa.field_f);
            la.a(param10, 2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("vr.L(").append(param0).append(',');
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_9_0 = stackOut_6_0;
            stackIn_9_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param5 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_10_0 = stackOut_7_0;
              stackIn_10_1 = stackOut_7_1;
              stackIn_10_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param6).append(',');
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param7 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L3;
            }
          }
          L4: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',');
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param11 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L4;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param12 + ',' + param13 + ',' + param14 + ')');
        }
    }

    final synchronized byte[] b(int param0, int param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_5_0 = null;
        Object stackIn_8_0 = null;
        byte[] stackIn_13_0 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_12_0 = null;
        Object stackOut_7_0 = null;
        byte[] stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        try {
          if (((vr) this).a(param1)) {
            if (((vr) this).field_f.field_j.length != 1) {
              if (this.a(param0, (byte) 70)) {
                if (((vr) this).field_f.field_j[param0] == 1) {
                  stackOut_12_0 = ((vr) this).b(param1 + -45, param0, 0);
                  stackIn_13_0 = stackOut_12_0;
                  return stackIn_13_0;
                } else {
                  throw new RuntimeException();
                }
              } else {
                stackOut_7_0 = null;
                stackIn_8_0 = stackOut_7_0;
                return (byte[]) (Object) stackIn_8_0;
              }
            } else {
              stackOut_4_0 = ((vr) this).b(param1 ^ -56, 0, param0);
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
          throw pe.a((Throwable) (Object) var3, "vr.F(" + param0 + ',' + param1 + ')');
        }
    }

    final synchronized boolean a(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        boolean stackIn_2_0 = false;
        int stackIn_7_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_22_0 = 0;
        boolean stackOut_1_0 = false;
        try {
          L0: {
            if (param0 < -101) {
              if (!this.a(false, param2, param1)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              } else {
                L1: {
                  if (null == ((vr) this).field_d[param2]) {
                    break L1;
                  } else {
                    if (((vr) this).field_d[param2][param1] != null) {
                      stackOut_14_0 = 1;
                      stackIn_15_0 = stackOut_14_0;
                      return stackIn_15_0 != 0;
                    } else {
                      break L1;
                    }
                  }
                }
                if (null != ((vr) this).field_c[param2]) {
                  stackOut_19_0 = 1;
                  stackIn_20_0 = stackOut_19_0;
                  return stackIn_20_0 != 0;
                } else {
                  this.e(param2, 0);
                  if (null == ((vr) this).field_c[param2]) {
                    stackOut_24_0 = 0;
                    stackIn_25_0 = stackOut_24_0;
                    break L0;
                  } else {
                    stackOut_22_0 = 1;
                    stackIn_23_0 = stackOut_22_0;
                    return stackIn_23_0 != 0;
                  }
                }
              }
            } else {
              stackOut_1_0 = ((boolean[]) ((vr) this).field_c[3])[6];
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var4, "vr.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_25_0 != 0;
    }

    vr(tja param0, boolean param1, int param2) {
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
        ((vr) this).field_f = null;
        try {
          L0: {
            L1: {
              if (param2 < 0) {
                break L1;
              } else {
                if (2 < param2) {
                  break L1;
                } else {
                  ((vr) this).field_a = param0;
                  ((vr) this).field_e = param2;
                  ((vr) this).field_g = param1;
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
            stackOut_8_1 = new StringBuilder().append("vr.<init>(");
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
          throw pe.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final int a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (!((vr) this).a(param0)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              param1 = param1.toLowerCase();
              var3_int = ((vr) this).field_f.field_m.a((byte) -95, efa.a((CharSequence) (Object) param1, true));
              stackOut_5_0 = ((vr) this).b(var3_int, (byte) -87);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("vr.T(").append(param0).append(',');
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L1;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
        return stackIn_6_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Age:";
    }
}
