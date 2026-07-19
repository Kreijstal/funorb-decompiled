/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cq extends tc {
    int field_k;
    static byte[][] field_z;
    bg field_n;
    int field_B;
    static int[] field_u;
    int field_D;
    String field_r;
    int field_A;
    wk field_m;
    int field_t;
    boolean field_l;
    int field_x;
    static int field_F;
    int field_v;
    om field_p;
    static String field_C;
    String field_w;
    String field_q;
    int field_o;
    static String field_E;
    int field_y;
    wk field_s;

    public static void a(int param0) {
        wk[] discarded$2 = null;
        field_z = (byte[][]) null;
        if (param0 != -101) {
          discarded$2 = cq.a(-99, -40, -126, (byte) 12, -104);
          field_E = null;
          field_u = null;
          field_C = null;
          return;
        } else {
          field_E = null;
          field_u = null;
          field_C = null;
          return;
        }
    }

    final static Class a(Object param0, byte param1) {
        RuntimeException var2 = null;
        Class stackIn_2_0 = null;
        Class stackIn_5_0 = null;
        Class stackIn_8_0 = null;
        Class stackIn_11_0 = null;
        Class stackIn_15_0 = null;
        Class stackIn_18_0 = null;
        Class stackIn_21_0 = null;
        Class stackIn_25_0 = null;
        Class stackIn_29_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Class stackOut_14_0 = null;
        Class stackOut_24_0 = null;
        Class stackOut_28_0 = null;
        Class stackOut_20_0 = null;
        Class stackOut_17_0 = null;
        Class stackOut_10_0 = null;
        Class stackOut_7_0 = null;
        Class stackOut_4_0 = null;
        Class stackOut_1_0 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        try {
          L0: {
            if (!Integer.class.isInstance(param0)) {
              if (param1 == -75) {
                if (!Byte.class.isInstance(param0)) {
                  if (!Short.class.isInstance(param0)) {
                    if (Long.class.isInstance(param0)) {
                      stackOut_14_0 = Long.TYPE;
                      stackIn_15_0 = stackOut_14_0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      if (!Boolean.class.isInstance(param0)) {
                        if (!Float.class.isInstance(param0)) {
                          if (Double.class.isInstance(param0)) {
                            stackOut_24_0 = Double.TYPE;
                            stackIn_25_0 = stackOut_24_0;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          } else {
                            if (Character.class.isInstance(param0)) {
                              stackOut_28_0 = Character.TYPE;
                              stackIn_29_0 = stackOut_28_0;
                              decompiledRegionSelector0 = 8;
                              break L0;
                            } else {
                              return null;
                            }
                          }
                        } else {
                          stackOut_20_0 = Float.TYPE;
                          stackIn_21_0 = stackOut_20_0;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      } else {
                        stackOut_17_0 = Boolean.TYPE;
                        stackIn_18_0 = stackOut_17_0;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    }
                  } else {
                    stackOut_10_0 = Short.TYPE;
                    stackIn_11_0 = stackOut_10_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackOut_7_0 = Byte.TYPE;
                  stackIn_8_0 = stackOut_7_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackOut_4_0 = (Class) null;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = Integer.TYPE;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) (var2);
            stackOut_31_1 = new StringBuilder().append("cq.F(");
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param0 == null) {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L1;
            } else {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_11_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_15_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_18_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_21_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_25_0;
                      } else {
                        return stackIn_29_0;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static void a(String param0, int param1, String[] param2, int param3) {
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
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              oh.field_L = lm.field_d;
              if (param1 == -14) {
                break L1;
              } else {
                cq.a(7);
                break L1;
              }
            }
            L2: {
              L3: {
                if (255 == param3) {
                  break L3;
                } else {
                  L4: {
                    if (-101 < (param3 ^ -1)) {
                      break L4;
                    } else {
                      if (-106 > (param3 ^ -1)) {
                        break L4;
                      } else {
                        p.field_a = ei.a(2, param2);
                        if (var5 == 0) {
                          break L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  p.field_a = il.a(-1, param3, param0);
                  if (var5 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L5: {
                if (-14 >= (nm.field_z ^ -1)) {
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  break L5;
                } else {
                  stackOut_11_0 = 1;
                  stackIn_13_0 = stackOut_11_0;
                  break L5;
                }
              }
              p.field_a = dc.a(stackIn_13_0 != 0, false);
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            runtimeException = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (runtimeException);
            stackOut_15_1 = new StringBuilder().append("cq.D(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
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
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param3 + ')');
        }
    }

    final static void a(byte param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = ArmiesOfGielinor.field_M ? 1 : 0;
          var2 = 0;
          var3 = ib.field_j;
          if ((var3 ^ -1) <= -6) {
            break L0;
          } else {
            var2 = 8192 * (var3 * var3) / 1100;
            if (var6 != 0) {
              break L0;
            } else {
              L1: {
                var4 = 1;
                var5 = 0;
                if (1 == param1) {
                  var5 = 1;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (param1 == 3) {
                  var4 = -1;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if ((param1 ^ -1) == -5) {
                  var5 = 1;
                  var4 = 1;
                  break L3;
                } else {
                  break L3;
                }
              }
              if (param0 != -116) {
                L4: {
                  cq.a((byte) 74, 85);
                  if (param1 == 5) {
                    var4 = -1;
                    var5 = 1;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if ((param1 ^ -1) == -7) {
                    var4 = 1;
                    var5 = -1;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  L7: {
                    if (-8 == (param1 ^ -1)) {
                      break L7;
                    } else {
                      if (-9 == (param1 ^ -1)) {
                        break L7;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var5 = -1;
                  var4 = -1;
                  break L6;
                }
                L8: {
                  if (11 != param1) {
                    break L8;
                  } else {
                    var4 = -1;
                    break L8;
                  }
                }
                L9: {
                  if (-13 == (param1 ^ -1)) {
                    var5 = -1;
                    var4 = -1;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  if ((param1 ^ -1) != -14) {
                    break L10;
                  } else {
                    var5 = -1;
                    var4 = 1;
                    break L10;
                  }
                }
                L11: {
                  if (-15 == (param1 ^ -1)) {
                    var4 = -1;
                    var5 = 1;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  if (15 != param1) {
                    break L12;
                  } else {
                    var4 = 1;
                    var5 = 1;
                    break L12;
                  }
                }
                pd.field_a = ek.a(-125, var4 * var2, var2 * var5);
                return;
              } else {
                L13: {
                  if (param1 == 5) {
                    var4 = -1;
                    var5 = 1;
                    break L13;
                  } else {
                    break L13;
                  }
                }
                L14: {
                  if ((param1 ^ -1) == -7) {
                    var4 = 1;
                    var5 = -1;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L15: {
                  L16: {
                    if (-8 == (param1 ^ -1)) {
                      break L16;
                    } else {
                      if (-9 == (param1 ^ -1)) {
                        break L16;
                      } else {
                        break L15;
                      }
                    }
                  }
                  var5 = -1;
                  var4 = -1;
                  break L15;
                }
                L17: {
                  if (11 != param1) {
                    break L17;
                  } else {
                    var4 = -1;
                    break L17;
                  }
                }
                L18: {
                  if (-13 == (param1 ^ -1)) {
                    var5 = -1;
                    var4 = -1;
                    break L18;
                  } else {
                    break L18;
                  }
                }
                L19: {
                  if ((param1 ^ -1) != -14) {
                    break L19;
                  } else {
                    var5 = -1;
                    var4 = 1;
                    break L19;
                  }
                }
                L20: {
                  if (-15 == (param1 ^ -1)) {
                    var4 = -1;
                    var5 = 1;
                    break L20;
                  } else {
                    break L20;
                  }
                }
                L21: {
                  if (15 != param1) {
                    break L21;
                  } else {
                    var4 = 1;
                    var5 = 1;
                    break L21;
                  }
                }
                pd.field_a = ek.a(-125, var4 * var2, var2 * var5);
                return;
              }
            }
          }
        }
        L22: {
          L23: {
            if (var3 < 105) {
              break L23;
            } else {
              if (var3 < 120) {
                var3 = -var3 + 120;
                var2 = 8192 - var3 * var3 * 8192 / 3300;
                if (var6 == 0) {
                  break L22;
                } else {
                  break L23;
                }
              } else {
                L24: {
                  var4 = 1;
                  var5 = 0;
                  if (1 == param1) {
                    var5 = 1;
                    break L24;
                  } else {
                    break L24;
                  }
                }
                L25: {
                  if (param1 == 3) {
                    var4 = -1;
                    break L25;
                  } else {
                    break L25;
                  }
                }
                L26: {
                  if ((param1 ^ -1) == -5) {
                    var5 = 1;
                    var4 = 1;
                    break L26;
                  } else {
                    break L26;
                  }
                }
                if (param0 == -116) {
                  L27: {
                    if (param1 == 5) {
                      var4 = -1;
                      var5 = 1;
                      break L27;
                    } else {
                      break L27;
                    }
                  }
                  L28: {
                    if ((param1 ^ -1) == -7) {
                      var4 = 1;
                      var5 = -1;
                      break L28;
                    } else {
                      break L28;
                    }
                  }
                  L29: {
                    L30: {
                      if (-8 == (param1 ^ -1)) {
                        break L30;
                      } else {
                        if (-9 == (param1 ^ -1)) {
                          break L30;
                        } else {
                          break L29;
                        }
                      }
                    }
                    var5 = -1;
                    var4 = -1;
                    break L29;
                  }
                  L31: {
                    if (11 != param1) {
                      break L31;
                    } else {
                      var4 = -1;
                      break L31;
                    }
                  }
                  L32: {
                    if (-13 == (param1 ^ -1)) {
                      var5 = -1;
                      var4 = -1;
                      break L32;
                    } else {
                      break L32;
                    }
                  }
                  L33: {
                    if ((param1 ^ -1) != -14) {
                      break L33;
                    } else {
                      var5 = -1;
                      var4 = 1;
                      break L33;
                    }
                  }
                  L34: {
                    if (-15 == (param1 ^ -1)) {
                      var4 = -1;
                      var5 = 1;
                      break L34;
                    } else {
                      break L34;
                    }
                  }
                  L35: {
                    if (15 != param1) {
                      break L35;
                    } else {
                      var4 = 1;
                      var5 = 1;
                      break L35;
                    }
                  }
                  pd.field_a = ek.a(-125, var4 * var2, var2 * var5);
                  return;
                } else {
                  L36: {
                    cq.a((byte) 74, 85);
                    if (param1 == 5) {
                      var4 = -1;
                      var5 = 1;
                      break L36;
                    } else {
                      break L36;
                    }
                  }
                  L37: {
                    if ((param1 ^ -1) == -7) {
                      var4 = 1;
                      var5 = -1;
                      break L37;
                    } else {
                      break L37;
                    }
                  }
                  L38: {
                    L39: {
                      if (-8 == (param1 ^ -1)) {
                        break L39;
                      } else {
                        if (-9 == (param1 ^ -1)) {
                          break L39;
                        } else {
                          break L38;
                        }
                      }
                    }
                    var5 = -1;
                    var4 = -1;
                    break L38;
                  }
                  L40: {
                    if (11 != param1) {
                      break L40;
                    } else {
                      var4 = -1;
                      break L40;
                    }
                  }
                  L41: {
                    if (-13 == (param1 ^ -1)) {
                      var5 = -1;
                      var4 = -1;
                      break L41;
                    } else {
                      break L41;
                    }
                  }
                  L42: {
                    if ((param1 ^ -1) != -14) {
                      break L42;
                    } else {
                      var5 = -1;
                      var4 = 1;
                      break L42;
                    }
                  }
                  L43: {
                    if (-15 == (param1 ^ -1)) {
                      var4 = -1;
                      var5 = 1;
                      break L43;
                    } else {
                      break L43;
                    }
                  }
                  L44: {
                    if (15 != param1) {
                      break L44;
                    } else {
                      var4 = 1;
                      var5 = 1;
                      break L44;
                    }
                  }
                  pd.field_a = ek.a(-125, var4 * var2, var2 * var5);
                  return;
                }
              }
            }
          }
          var2 = (-40960 + var3 * 16384) / 220;
          break L22;
        }
        L45: {
          var4 = 1;
          var5 = 0;
          if (1 == param1) {
            var5 = 1;
            break L45;
          } else {
            break L45;
          }
        }
        L46: {
          if (param1 == 3) {
            var4 = -1;
            break L46;
          } else {
            break L46;
          }
        }
        L47: {
          if ((param1 ^ -1) == -5) {
            var5 = 1;
            var4 = 1;
            break L47;
          } else {
            break L47;
          }
        }
        if (param0 != -116) {
          L48: {
            cq.a((byte) 74, 85);
            if (param1 == 5) {
              var4 = -1;
              var5 = 1;
              break L48;
            } else {
              break L48;
            }
          }
          L49: {
            if ((param1 ^ -1) == -7) {
              var4 = 1;
              var5 = -1;
              break L49;
            } else {
              break L49;
            }
          }
          L50: {
            L51: {
              if (-8 == (param1 ^ -1)) {
                break L51;
              } else {
                if (-9 == (param1 ^ -1)) {
                  break L51;
                } else {
                  break L50;
                }
              }
            }
            var5 = -1;
            var4 = -1;
            break L50;
          }
          L52: {
            if (11 != param1) {
              break L52;
            } else {
              var4 = -1;
              break L52;
            }
          }
          L53: {
            if (-13 == (param1 ^ -1)) {
              var5 = -1;
              var4 = -1;
              break L53;
            } else {
              break L53;
            }
          }
          L54: {
            if ((param1 ^ -1) != -14) {
              break L54;
            } else {
              var5 = -1;
              var4 = 1;
              break L54;
            }
          }
          L55: {
            if (-15 == (param1 ^ -1)) {
              var4 = -1;
              var5 = 1;
              break L55;
            } else {
              break L55;
            }
          }
          L56: {
            if (15 != param1) {
              break L56;
            } else {
              var4 = 1;
              var5 = 1;
              break L56;
            }
          }
          pd.field_a = ek.a(-125, var4 * var2, var2 * var5);
          return;
        } else {
          L57: {
            if (param1 == 5) {
              var4 = -1;
              var5 = 1;
              break L57;
            } else {
              break L57;
            }
          }
          L58: {
            if ((param1 ^ -1) == -7) {
              var4 = 1;
              var5 = -1;
              break L58;
            } else {
              break L58;
            }
          }
          L59: {
            L60: {
              if (-8 == (param1 ^ -1)) {
                break L60;
              } else {
                if (-9 == (param1 ^ -1)) {
                  break L60;
                } else {
                  break L59;
                }
              }
            }
            var5 = -1;
            var4 = -1;
            break L59;
          }
          L61: {
            if (11 != param1) {
              break L61;
            } else {
              var4 = -1;
              break L61;
            }
          }
          L62: {
            if (-13 == (param1 ^ -1)) {
              var5 = -1;
              var4 = -1;
              break L62;
            } else {
              break L62;
            }
          }
          L63: {
            if ((param1 ^ -1) != -14) {
              break L63;
            } else {
              var5 = -1;
              var4 = 1;
              break L63;
            }
          }
          L64: {
            if (-15 == (param1 ^ -1)) {
              var4 = -1;
              var5 = 1;
              break L64;
            } else {
              break L64;
            }
          }
          L65: {
            if (15 != param1) {
              break L65;
            } else {
              var4 = 1;
              var5 = 1;
              break L65;
            }
          }
          pd.field_a = ek.a(-125, var4 * var2, var2 * var5);
          return;
        }
    }

    final static wk[] a(int param0, int param1, int param2, byte param3, int param4) {
        wk[] var5 = null;
        wk[] var6 = null;
        var6 = new wk[9];
        var5 = var6;
        wk dupTemp$4 = hl.a(false, param2, param1);
        var6[6] = dupTemp$4;
        var5[3] = dupTemp$4;
        var5[2] = dupTemp$4;
        var5[1] = dupTemp$4;
        var5[0] = dupTemp$4;
        wk dupTemp$5 = hl.a(false, param4, param1);
        var6[8] = dupTemp$5;
        var5[7] = dupTemp$5;
        var5[5] = dupTemp$5;
        if (param3 > 33) {
          if (param0 != 0) {
            var6[4] = hl.a(false, param0, 64);
            return var5;
          } else {
            return var5;
          }
        } else {
          cq.a(111);
          if (param0 == 0) {
            return var5;
          } else {
            var6[4] = hl.a(false, param0, 64);
            return var5;
          }
        }
    }

    final boolean a(int param0, int param1, int param2) {
        boolean discarded$1 = false;
        int stackIn_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_17_0 = 0;
        if (param2 >= 114) {
          if (db.a(true, this.field_y) <= param0) {
            if (db.a(true, this.field_B + this.field_y) < param0) {
              return false;
            } else {
              L0: {
                L1: {
                  if (param1 < u.a(this.field_x, (byte) 94)) {
                    break L1;
                  } else {
                    if (u.a(this.field_o + this.field_x, (byte) 94) < param1) {
                      break L1;
                    } else {
                      stackOut_16_0 = 1;
                      stackIn_18_0 = stackOut_16_0;
                      break L0;
                    }
                  }
                }
                stackOut_17_0 = 0;
                stackIn_18_0 = stackOut_17_0;
                break L0;
              }
              return stackIn_18_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          discarded$1 = this.a(106, -67, 2);
          if (db.a(true, this.field_y) <= param0) {
            if (db.a(true, this.field_B + this.field_y) >= param0) {
              if (param1 >= u.a(this.field_x, (byte) 94)) {
                if (u.a(this.field_o + this.field_x, (byte) 94) < param1) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    cq(om param0) {
        RuntimeException var2 = null;
        ne[] var3 = null;
        ne[] var4_ref_ne__ = null;
        int var4 = 0;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        lo var12 = null;
        ne var13 = null;
        sd var14 = null;
        int[] var18 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            this.field_p = param0;
            this.field_w = param0.field_J;
            this.field_v = 1073741823;
            this.field_l = false;
            this.field_k = param0.field_v;
            this.field_n = new bg(16);
            var12 = param0.a(-114);
            var3 = var12.a(115, (ha) null);
            var4_ref_ne__ = var3;
            var5 = 0;
            L1: while (true) {
              L2: {
                if (var5 >= var4_ref_ne__.length) {
                  break L2;
                } else {
                  L3: {
                    var13 = var4_ref_ne__[var5];
                    if (null == var13.field_c) {
                      break L3;
                    } else {
                      if (var13.field_c.field_O == param0.field_w) {
                        break L3;
                      } else {
                        var7 = var13.field_c.g(0);
                        if (this.field_n.a(-57, (long)var7) != null) {
                          break L3;
                        } else {
                          this.field_n.a(new tc(), (long)var7, 108);
                          break L3;
                        }
                      }
                    }
                  }
                  var5++;
                  if (var11 == 0) {
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              var4 = 0;
              L4: while (true) {
                if (var4 >= param0.field_B.length) {
                  break L0;
                } else {
                  var5 = param0.field_B[var4];
                  if (var11 == 0) {
                    L5: {
                      L6: {
                        if (var5 == -1) {
                          break L6;
                        } else {
                          var14 = param0.field_G.field_q[var5];
                          if (null == var14.field_p) {
                            break L6;
                          } else {
                            var18 = var14.field_p;
                            var8 = 0;
                            L7: while (true) {
                              if (var18.length <= var8) {
                                break L6;
                              } else {
                                var9 = var18[var8];
                                var10 = bw.field_m[var9][0];
                                if (var11 != 0) {
                                  break L5;
                                } else {
                                  L8: {
                                    if (this.field_n.a(-96, (long)var10) != null) {
                                      break L8;
                                    } else {
                                      this.field_n.a(new tc(), (long)var10, 126);
                                      break L8;
                                    }
                                  }
                                  var8++;
                                  continue L7;
                                }
                              }
                            }
                          }
                        }
                      }
                      var4++;
                      break L5;
                    }
                    continue L4;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (var2);
            stackOut_23_1 = new StringBuilder().append("cq.<init>(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L9;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L9;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
    }

    cq(int param0, String param1) {
        try {
            this.field_w = param1;
            this.field_v = 1073741823;
            this.field_k = param0;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "cq.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_F = 22;
        field_C = "Create unrated game";
        field_E = "Quick Chat game";
    }
}
