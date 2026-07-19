/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class nl {
    static aj field_b;
    static String[] field_a;
    static boolean field_c;

    final static byte[] a(Object param0, byte param1, boolean param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        nl var4 = null;
        byte[] stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        byte[] stackIn_9_0 = null;
        byte[] stackIn_11_0 = null;
        byte[] stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_14_0 = null;
        byte[] stackOut_10_0 = null;
        byte[] stackOut_8_0 = null;
        Object stackOut_4_0 = null;
        byte[] stackOut_1_0 = null;
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
            if (param1 == -74) {
              if (param0 != null) {
                if (!(param0 instanceof byte[])) {
                  if (param0 instanceof nl) {
                    var4 = (nl) (param0);
                    stackOut_14_0 = var4.a((byte) -121);
                    stackIn_15_0 = stackOut_14_0;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    throw new IllegalArgumentException();
                  }
                } else {
                  var3 = (byte[]) (param0);
                  if (param2) {
                    stackOut_10_0 = ld.a(120, var3);
                    stackIn_11_0 = stackOut_10_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    stackOut_8_0 = (byte[]) (var3);
                    stackIn_9_0 = stackOut_8_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = (byte[]) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var3_ref);
            stackOut_17_1 = new StringBuilder().append("nl.H(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L1;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L1;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (byte[]) ((Object) stackIn_5_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_11_0;
              } else {
                return stackIn_15_0;
              }
            }
          }
        }
    }

    public static void b(byte param0) {
        field_a = null;
        field_b = null;
        if (param0 > -107) {
            field_a = (String[]) null;
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        int incrementValue$1 = 0;
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_13_0 = 0;
        boolean stackIn_17_0 = false;
        boolean stackIn_25_0 = false;
        int stackIn_28_0 = 0;
        int stackIn_36_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_35_0 = 0;
        boolean stackOut_24_0 = false;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_12_0 = 0;
        boolean stackOut_16_0 = false;
        var14 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if (param0 > param1) {
              L1: {
                if (param3 <= -73) {
                  break L1;
                } else {
                  field_b = (aj) null;
                  break L1;
                }
              }
              if (1 + param1 >= param6) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L2: {
                  if (5 + param1 >= param6) {
                    break L2;
                  } else {
                    if (param5 != param4) {
                      var7_int = (param5 >> 10292033) + (param4 >> -535788159) + (1 & (param5 & param4));
                      var8 = param1;
                      var9 = param4;
                      var10 = param5;
                      var11 = param1;
                      L3: while (true) {
                        L4: {
                          if (param6 <= var11) {
                            nl.a(param0, param1, param2, -86, param4, var9, var8);
                            stackOut_35_0 = param0;
                            stackIn_36_0 = stackOut_35_0;
                            break L4;
                          } else {
                            var12 = ff.field_a[var11];
                            stackOut_24_0 = param2;
                            stackIn_36_0 = stackOut_24_0 ? 1 : 0;
                            stackIn_25_0 = stackOut_24_0;
                            if (var14 != 0) {
                              break L4;
                            } else {
                              L5: {
                                if (stackIn_25_0) {
                                  stackOut_27_0 = we.field_g[var12];
                                  stackIn_28_0 = stackOut_27_0;
                                  break L5;
                                } else {
                                  stackOut_26_0 = oj.field_j[var12];
                                  stackIn_28_0 = stackOut_26_0;
                                  break L5;
                                }
                              }
                              L6: {
                                L7: {
                                  var13 = stackIn_28_0;
                                  if (var13 <= var7_int) {
                                    break L7;
                                  } else {
                                    ff.field_a[var11] = ff.field_a[var8];
                                    incrementValue$1 = var8;
                                    var8++;
                                    ff.field_a[incrementValue$1] = var12;
                                    if (var13 < var9) {
                                      var9 = var13;
                                      if (var14 == 0) {
                                        break L6;
                                      } else {
                                        break L7;
                                      }
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                                if (var10 >= var13) {
                                  break L6;
                                } else {
                                  var10 = var13;
                                  break L6;
                                }
                              }
                              var11++;
                              continue L3;
                            }
                          }
                        }
                        nl.a(stackIn_36_0, var8, param2, -122, var10, param5, param6);
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    } else {
                      break L2;
                    }
                  }
                }
                var7_int = param6 + -1;
                L8: while (true) {
                  stackOut_12_0 = param1 ^ -1;
                  stackIn_13_0 = stackOut_12_0;
                  L9: while (true) {
                    L10: {
                      if (stackIn_13_0 <= (var7_int ^ -1)) {
                        break L10;
                      } else {
                        var8 = param1;
                        L11: while (true) {
                          L12: {
                            if (var8 >= var7_int) {
                              break L12;
                            } else {
                              var9 = ff.field_a[var8];
                              var10 = ff.field_a[1 + var8];
                              stackOut_16_0 = cb.a((byte) 63, param2, var10, var9);
                              stackIn_13_0 = stackOut_16_0 ? 1 : 0;
                              stackIn_17_0 = stackOut_16_0;
                              if (var14 != 0) {
                                continue L9;
                              } else {
                                L13: {
                                  if (!stackIn_17_0) {
                                    break L13;
                                  } else {
                                    ff.field_a[var8] = var10;
                                    ff.field_a[1 + var8] = var9;
                                    break L13;
                                  }
                                }
                                var8++;
                                if (var14 == 0) {
                                  continue L11;
                                } else {
                                  break L12;
                                }
                              }
                            }
                          }
                          var7_int--;
                          if (var14 == 0) {
                            continue L8;
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var7), "nl.J(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    final static void a(int param0, int param1, String param2, String[] param3) {
        RuntimeException runtimeException = null;
        int var5 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var5 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              bk.field_c = c.field_o;
              if (param1 == -6258) {
                break L1;
              } else {
                field_c = true;
                break L1;
              }
            }
            L2: {
              L3: {
                if ((param0 ^ -1) == -256) {
                  break L3;
                } else {
                  L4: {
                    if (-101 < (param0 ^ -1)) {
                      break L4;
                    } else {
                      if (param0 > 105) {
                        break L4;
                      } else {
                        li.field_T = oe.a(124, param3);
                        if (var5 == 0) {
                          break L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  li.field_T = wi.a(param0, (byte) -65, param2);
                  if (var5 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L5: {
                if ((cg.field_l ^ -1) <= -14) {
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  break L5;
                } else {
                  stackOut_11_0 = 1;
                  stackIn_13_0 = stackOut_11_0;
                  break L5;
                }
              }
              li.field_T = mc.b(stackIn_13_0 != 0, param1 ^ -6168);
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            runtimeException = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (runtimeException);
            stackOut_15_1 = new StringBuilder().append("nl.I(").append(param0).append(',').append(param1).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          L7: {
            stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L7;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
    }

    abstract byte[] a(byte param0);

    abstract void a(byte[] param0, boolean param1);

    final static int a(int param0, int param1, byte param2, byte[] param3, CharSequence param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_6_0 = 0;
        int stackIn_98_0 = 0;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        String stackIn_102_2 = null;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        String stackIn_105_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_97_0 = 0;
        RuntimeException stackOut_99_0 = null;
        StringBuilder stackOut_99_1 = null;
        RuntimeException stackOut_101_0 = null;
        StringBuilder stackOut_101_1 = null;
        String stackOut_101_2 = null;
        RuntimeException stackOut_100_0 = null;
        StringBuilder stackOut_100_1 = null;
        String stackOut_100_2 = null;
        RuntimeException stackOut_102_0 = null;
        StringBuilder stackOut_102_1 = null;
        RuntimeException stackOut_104_0 = null;
        StringBuilder stackOut_104_1 = null;
        String stackOut_104_2 = null;
        RuntimeException stackOut_103_0 = null;
        StringBuilder stackOut_103_1 = null;
        String stackOut_103_2 = null;
        var9 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 < -79) {
                break L1;
              } else {
                field_b = (aj) null;
                break L1;
              }
            }
            var6_int = -param1 + param0;
            var7 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (var6_int <= var7) {
                    break L4;
                  } else {
                    var8 = param4.charAt(param1 + var7);
                    stackOut_5_0 = var8 ^ -1;
                    stackIn_98_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var9 != 0) {
                      break L3;
                    } else {
                      L5: {
                        L6: {
                          L7: {
                            L8: {
                              if (stackIn_6_0 >= -1) {
                                break L8;
                              } else {
                                if (var8 < 128) {
                                  break L7;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            if (var8 < 160) {
                              break L6;
                            } else {
                              if (var8 > 255) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          param3[param5 + var7] = (byte)var8;
                          if (var9 == 0) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                        L9: {
                          if (8364 == var8) {
                            break L9;
                          } else {
                            L10: {
                              if (var8 == 8218) {
                                break L10;
                              } else {
                                L11: {
                                  if (var8 != 402) {
                                    break L11;
                                  } else {
                                    param3[var7 + param5] = (byte)-125;
                                    if (var9 == 0) {
                                      break L5;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                                L12: {
                                  if (var8 != 8222) {
                                    break L12;
                                  } else {
                                    param3[param5 - -var7] = (byte)-124;
                                    if (var9 == 0) {
                                      break L5;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                                L13: {
                                  if (8230 == var8) {
                                    break L13;
                                  } else {
                                    L14: {
                                      if (var8 != 8224) {
                                        break L14;
                                      } else {
                                        param3[param5 - -var7] = (byte)-122;
                                        if (var9 == 0) {
                                          break L5;
                                        } else {
                                          break L14;
                                        }
                                      }
                                    }
                                    L15: {
                                      if (var8 != 8225) {
                                        break L15;
                                      } else {
                                        param3[var7 + param5] = (byte)-121;
                                        if (var9 == 0) {
                                          break L5;
                                        } else {
                                          break L15;
                                        }
                                      }
                                    }
                                    L16: {
                                      if (710 == var8) {
                                        break L16;
                                      } else {
                                        L17: {
                                          if (8240 == var8) {
                                            break L17;
                                          } else {
                                            L18: {
                                              if (var8 != 352) {
                                                break L18;
                                              } else {
                                                param3[var7 + param5] = (byte)-118;
                                                if (var9 == 0) {
                                                  break L5;
                                                } else {
                                                  break L18;
                                                }
                                              }
                                            }
                                            L19: {
                                              if (var8 == 8249) {
                                                break L19;
                                              } else {
                                                L20: {
                                                  if (var8 == 338) {
                                                    break L20;
                                                  } else {
                                                    L21: {
                                                      if (var8 == 381) {
                                                        break L21;
                                                      } else {
                                                        L22: {
                                                          if (var8 == 8216) {
                                                            break L22;
                                                          } else {
                                                            L23: {
                                                              if (8217 != var8) {
                                                                break L23;
                                                              } else {
                                                                param3[var7 + param5] = (byte)-110;
                                                                if (var9 == 0) {
                                                                  break L5;
                                                                } else {
                                                                  break L23;
                                                                }
                                                              }
                                                            }
                                                            L24: {
                                                              if (var8 != 8220) {
                                                                break L24;
                                                              } else {
                                                                param3[var7 + param5] = (byte)-109;
                                                                if (var9 == 0) {
                                                                  break L5;
                                                                } else {
                                                                  break L24;
                                                                }
                                                              }
                                                            }
                                                            L25: {
                                                              if (8221 != var8) {
                                                                break L25;
                                                              } else {
                                                                param3[param5 - -var7] = (byte)-108;
                                                                if (var9 == 0) {
                                                                  break L5;
                                                                } else {
                                                                  break L25;
                                                                }
                                                              }
                                                            }
                                                            L26: {
                                                              if (var8 != 8226) {
                                                                break L26;
                                                              } else {
                                                                param3[var7 + param5] = (byte)-107;
                                                                if (var9 == 0) {
                                                                  break L5;
                                                                } else {
                                                                  break L26;
                                                                }
                                                              }
                                                            }
                                                            L27: {
                                                              if (var8 != 8211) {
                                                                break L27;
                                                              } else {
                                                                param3[var7 + param5] = (byte)-106;
                                                                if (var9 == 0) {
                                                                  break L5;
                                                                } else {
                                                                  break L27;
                                                                }
                                                              }
                                                            }
                                                            L28: {
                                                              if (var8 == 8212) {
                                                                break L28;
                                                              } else {
                                                                L29: {
                                                                  if (var8 != 732) {
                                                                    break L29;
                                                                  } else {
                                                                    param3[var7 + param5] = (byte)-104;
                                                                    if (var9 == 0) {
                                                                      break L5;
                                                                    } else {
                                                                      break L29;
                                                                    }
                                                                  }
                                                                }
                                                                L30: {
                                                                  if (var8 == 8482) {
                                                                    break L30;
                                                                  } else {
                                                                    L31: {
                                                                      if (353 == var8) {
                                                                        break L31;
                                                                      } else {
                                                                        L32: {
                                                                          if (var8 == 8250) {
                                                                            break L32;
                                                                          } else {
                                                                            L33: {
                                                                              if (var8 == 339) {
                                                                                break L33;
                                                                              } else {
                                                                                L34: {
                                                                                  if (var8 != 382) {
                                                                                    break L34;
                                                                                  } else {
                                                                                    param3[var7 + param5] = (byte)-98;
                                                                                    if (var9 == 0) {
                                                                                      break L5;
                                                                                    } else {
                                                                                      break L34;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                L35: {
                                                                                  if (var8 == 376) {
                                                                                    break L35;
                                                                                  } else {
                                                                                    param3[param5 - -var7] = (byte)63;
                                                                                    if (var9 == 0) {
                                                                                      break L5;
                                                                                    } else {
                                                                                      break L35;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                param3[param5 - -var7] = (byte)-97;
                                                                                if (var9 == 0) {
                                                                                  break L5;
                                                                                } else {
                                                                                  break L33;
                                                                                }
                                                                              }
                                                                            }
                                                                            param3[param5 - -var7] = (byte)-100;
                                                                            if (var9 == 0) {
                                                                              break L5;
                                                                            } else {
                                                                              break L32;
                                                                            }
                                                                          }
                                                                        }
                                                                        param3[param5 + var7] = (byte)-101;
                                                                        if (var9 == 0) {
                                                                          break L5;
                                                                        } else {
                                                                          break L31;
                                                                        }
                                                                      }
                                                                    }
                                                                    param3[param5 + var7] = (byte)-102;
                                                                    if (var9 == 0) {
                                                                      break L5;
                                                                    } else {
                                                                      break L30;
                                                                    }
                                                                  }
                                                                }
                                                                param3[param5 - -var7] = (byte)-103;
                                                                if (var9 == 0) {
                                                                  break L5;
                                                                } else {
                                                                  break L28;
                                                                }
                                                              }
                                                            }
                                                            param3[param5 + var7] = (byte)-105;
                                                            if (var9 == 0) {
                                                              break L5;
                                                            } else {
                                                              break L22;
                                                            }
                                                          }
                                                        }
                                                        param3[var7 + param5] = (byte)-111;
                                                        if (var9 == 0) {
                                                          break L5;
                                                        } else {
                                                          break L21;
                                                        }
                                                      }
                                                    }
                                                    param3[var7 + param5] = (byte)-114;
                                                    if (var9 == 0) {
                                                      break L5;
                                                    } else {
                                                      break L20;
                                                    }
                                                  }
                                                }
                                                param3[param5 - -var7] = (byte)-116;
                                                if (var9 == 0) {
                                                  break L5;
                                                } else {
                                                  break L19;
                                                }
                                              }
                                            }
                                            param3[param5 + var7] = (byte)-117;
                                            if (var9 == 0) {
                                              break L5;
                                            } else {
                                              break L17;
                                            }
                                          }
                                        }
                                        param3[var7 + param5] = (byte)-119;
                                        if (var9 == 0) {
                                          break L5;
                                        } else {
                                          break L16;
                                        }
                                      }
                                    }
                                    param3[var7 + param5] = (byte)-120;
                                    if (var9 == 0) {
                                      break L5;
                                    } else {
                                      break L13;
                                    }
                                  }
                                }
                                param3[var7 + param5] = (byte)-123;
                                if (var9 == 0) {
                                  break L5;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            param3[param5 - -var7] = (byte)-126;
                            if (var9 == 0) {
                              break L5;
                            } else {
                              break L9;
                            }
                          }
                        }
                        param3[param5 - -var7] = (byte)-128;
                        break L5;
                      }
                      var7++;
                      if (var9 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_97_0 = var6_int;
                stackIn_98_0 = stackOut_97_0;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L36: {
            var6 = decompiledCaughtException;
            stackOut_99_0 = (RuntimeException) (var6);
            stackOut_99_1 = new StringBuilder().append("nl.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_101_0 = stackOut_99_0;
            stackIn_101_1 = stackOut_99_1;
            stackIn_100_0 = stackOut_99_0;
            stackIn_100_1 = stackOut_99_1;
            if (param3 == null) {
              stackOut_101_0 = (RuntimeException) ((Object) stackIn_101_0);
              stackOut_101_1 = (StringBuilder) ((Object) stackIn_101_1);
              stackOut_101_2 = "null";
              stackIn_102_0 = stackOut_101_0;
              stackIn_102_1 = stackOut_101_1;
              stackIn_102_2 = stackOut_101_2;
              break L36;
            } else {
              stackOut_100_0 = (RuntimeException) ((Object) stackIn_100_0);
              stackOut_100_1 = (StringBuilder) ((Object) stackIn_100_1);
              stackOut_100_2 = "{...}";
              stackIn_102_0 = stackOut_100_0;
              stackIn_102_1 = stackOut_100_1;
              stackIn_102_2 = stackOut_100_2;
              break L36;
            }
          }
          L37: {
            stackOut_102_0 = (RuntimeException) ((Object) stackIn_102_0);
            stackOut_102_1 = ((StringBuilder) (Object) stackIn_102_1).append(stackIn_102_2).append(',');
            stackIn_104_0 = stackOut_102_0;
            stackIn_104_1 = stackOut_102_1;
            stackIn_103_0 = stackOut_102_0;
            stackIn_103_1 = stackOut_102_1;
            if (param4 == null) {
              stackOut_104_0 = (RuntimeException) ((Object) stackIn_104_0);
              stackOut_104_1 = (StringBuilder) ((Object) stackIn_104_1);
              stackOut_104_2 = "null";
              stackIn_105_0 = stackOut_104_0;
              stackIn_105_1 = stackOut_104_1;
              stackIn_105_2 = stackOut_104_2;
              break L37;
            } else {
              stackOut_103_0 = (RuntimeException) ((Object) stackIn_103_0);
              stackOut_103_1 = (StringBuilder) ((Object) stackIn_103_1);
              stackOut_103_2 = "{...}";
              stackIn_105_0 = stackOut_103_0;
              stackIn_105_1 = stackOut_103_1;
              stackIn_105_2 = stackOut_103_2;
              break L37;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_105_0), stackIn_105_2 + ',' + param5 + ')');
        }
        return stackIn_98_0;
    }

    static {
        field_b = new aj(10, 2, 2, 0);
    }
}
