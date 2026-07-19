/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qf {
    static Random field_a;
    static pd field_c;
    static String field_g;
    static String field_d;
    static cj field_b;
    static int field_f;
    static String field_e;

    public static void a(int param0) {
        field_d = null;
        field_c = null;
        field_a = null;
        if (param0 != 241) {
          field_b = (cj) null;
          field_b = null;
          field_e = null;
          field_g = null;
          return;
        } else {
          field_b = null;
          field_e = null;
          field_g = null;
          return;
        }
    }

    final static void a(Object[] param0, int param1, int param2, int param3, int[] param4) {
        char discarded$2 = 0;
        int incrementValue$3 = 0;
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        int var13 = 0;
        int stackIn_8_0 = 0;
        int[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int[] stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var13 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == 2) {
                break L1;
              } else {
                discarded$2 = qf.a(67, '');
                break L1;
              }
            }
            L2: {
              if (param1 < param3) {
                L3: {
                  var5_int = (param3 + param1) / 2;
                  var6 = param1;
                  var7 = param4[var5_int];
                  param4[var5_int] = param4[param3];
                  param4[param3] = var7;
                  var8 = param0[var5_int];
                  param0[var5_int] = param0[param3];
                  param0[param3] = var8;
                  if ((var7 ^ -1) == -2147483648) {
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    break L3;
                  } else {
                    stackOut_6_0 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    break L3;
                  }
                }
                var9 = stackIn_8_0;
                var10 = param1;
                L4: while (true) {
                  L5: {
                    if (param3 <= var10) {
                      param4[param3] = param4[var6];
                      stackOut_15_0 = (int[]) (param4);
                      stackOut_15_1 = var6;
                      stackIn_16_0 = stackOut_15_0;
                      stackIn_16_1 = stackOut_15_1;
                      break L5;
                    } else {
                      stackOut_10_0 = (int[]) (param4);
                      stackOut_10_1 = var10;
                      stackIn_16_0 = stackOut_10_0;
                      stackIn_16_1 = stackOut_10_1;
                      stackIn_11_0 = stackOut_10_0;
                      stackIn_11_1 = stackOut_10_1;
                      if (var13 != 0) {
                        break L5;
                      } else {
                        L6: {
                          if (stackIn_11_0[stackIn_11_1] < (var9 & var10) + var7) {
                            var11 = param4[var10];
                            param4[var10] = param4[var6];
                            param4[var6] = var11;
                            var12 = param0[var10];
                            param0[var10] = param0[var6];
                            incrementValue$3 = var6;
                            var6++;
                            param0[incrementValue$3] = var12;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        var10++;
                        continue L4;
                      }
                    }
                  }
                  stackIn_16_0[stackIn_16_1] = var7;
                  param0[param3] = param0[var6];
                  param0[var6] = var8;
                  qf.a(param0, param1, 2, var6 + -1, param4);
                  qf.a(param0, var6 + 1, 2, param3, param4);
                  break L2;
                }
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var5);
            stackOut_18_1 = new StringBuilder().append("qf.C(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
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
          L8: {
            stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param4 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L8;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L8;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
    }

    final static void a(int param0, int param1, boolean param2, byte param3, String param4) {
        try {
            int var5_int = -7 / ((param3 - 23) / 48);
            b.field_b = param1;
            sc.a(ah.field_e.field_C + ah.field_e.field_r, fh.field_h, param4, true, 320, 240, 15, ah.field_e, 10, (byte) -103, 5, param0, ah.field_e.field_C, param2, rl.field_a);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "qf.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static char a(int param0, char param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param0 == 28233) {
            break L0;
          } else {
            qf.a(5);
            break L0;
          }
        }
        var2 = param1;
        if (-33 != (var2 ^ -1)) {
          L1: {
            if (160 != var2) {
              break L1;
            } else {
              if (var3 != 0) {
                break L1;
              } else {
                return '_';
              }
            }
          }
          if (95 != var2) {
            L2: {
              if ((var2 ^ -1) != -46) {
                break L2;
              } else {
                if (var3 != 0) {
                  break L2;
                } else {
                  return '_';
                }
              }
            }
            L3: {
              if ((var2 ^ -1) != -92) {
                break L3;
              } else {
                if (var3 != 0) {
                  break L3;
                } else {
                  return param1;
                }
              }
            }
            if (var2 != 93) {
              L4: {
                if (var2 != 35) {
                  break L4;
                } else {
                  if (var3 != 0) {
                    break L4;
                  } else {
                    return param1;
                  }
                }
              }
              if ((var2 ^ -1) != -225) {
                if (225 != var2) {
                  L5: {
                    if ((var2 ^ -1) != -227) {
                      break L5;
                    } else {
                      if (var3 != 0) {
                        break L5;
                      } else {
                        return 'a';
                      }
                    }
                  }
                  L6: {
                    if (-229 != (var2 ^ -1)) {
                      break L6;
                    } else {
                      if (var3 != 0) {
                        break L6;
                      } else {
                        return 'a';
                      }
                    }
                  }
                  if (var2 != 227) {
                    L7: {
                      if (-193 != (var2 ^ -1)) {
                        break L7;
                      } else {
                        if (var3 != 0) {
                          break L7;
                        } else {
                          return 'a';
                        }
                      }
                    }
                    L8: {
                      if ((var2 ^ -1) != -194) {
                        break L8;
                      } else {
                        if (var3 != 0) {
                          break L8;
                        } else {
                          return 'a';
                        }
                      }
                    }
                    if (-195 != (var2 ^ -1)) {
                      L9: {
                        if (var2 != 196) {
                          break L9;
                        } else {
                          if (var3 != 0) {
                            break L9;
                          } else {
                            return 'a';
                          }
                        }
                      }
                      if (195 != var2) {
                        if (-233 != (var2 ^ -1)) {
                          if (-234 != (var2 ^ -1)) {
                            if (var2 != 234) {
                              if (var2 != 235) {
                                if (-201 != (var2 ^ -1)) {
                                  L10: {
                                    if (var2 != 201) {
                                      break L10;
                                    } else {
                                      if (var3 != 0) {
                                        break L10;
                                      } else {
                                        return 'e';
                                      }
                                    }
                                  }
                                  L11: {
                                    if (-203 != (var2 ^ -1)) {
                                      break L11;
                                    } else {
                                      if (var3 != 0) {
                                        break L11;
                                      } else {
                                        return 'e';
                                      }
                                    }
                                  }
                                  L12: {
                                    if (var2 != 203) {
                                      break L12;
                                    } else {
                                      if (var3 != 0) {
                                        break L12;
                                      } else {
                                        return 'e';
                                      }
                                    }
                                  }
                                  L13: {
                                    if (237 != var2) {
                                      break L13;
                                    } else {
                                      if (var3 != 0) {
                                        break L13;
                                      } else {
                                        return 'i';
                                      }
                                    }
                                  }
                                  if (238 != var2) {
                                    L14: {
                                      if (var2 != 239) {
                                        break L14;
                                      } else {
                                        if (var3 != 0) {
                                          break L14;
                                        } else {
                                          return 'i';
                                        }
                                      }
                                    }
                                    L15: {
                                      L16: {
                                        if (-206 != (var2 ^ -1)) {
                                          break L16;
                                        } else {
                                          if (var3 == 0) {
                                            break L15;
                                          } else {
                                            break L16;
                                          }
                                        }
                                      }
                                      L17: {
                                        if (-207 != (var2 ^ -1)) {
                                          break L17;
                                        } else {
                                          if (var3 == 0) {
                                            break L15;
                                          } else {
                                            break L17;
                                          }
                                        }
                                      }
                                      L18: {
                                        if (207 != var2) {
                                          break L18;
                                        } else {
                                          if (var3 == 0) {
                                            break L15;
                                          } else {
                                            break L18;
                                          }
                                        }
                                      }
                                      L19: {
                                        L20: {
                                          if (var2 != 242) {
                                            break L20;
                                          } else {
                                            if (var3 == 0) {
                                              break L19;
                                            } else {
                                              break L20;
                                            }
                                          }
                                        }
                                        L21: {
                                          if (var2 != 243) {
                                            break L21;
                                          } else {
                                            if (var3 == 0) {
                                              break L19;
                                            } else {
                                              break L21;
                                            }
                                          }
                                        }
                                        L22: {
                                          if (var2 != 244) {
                                            break L22;
                                          } else {
                                            if (var3 == 0) {
                                              break L19;
                                            } else {
                                              break L22;
                                            }
                                          }
                                        }
                                        L23: {
                                          if (-247 != (var2 ^ -1)) {
                                            break L23;
                                          } else {
                                            if (var3 == 0) {
                                              break L19;
                                            } else {
                                              break L23;
                                            }
                                          }
                                        }
                                        if (var2 == 245) {
                                          break L19;
                                        } else {
                                          if (var2 == 210) {
                                            break L19;
                                          } else {
                                            if (211 == var2) {
                                              break L19;
                                            } else {
                                              L24: {
                                                if (212 != var2) {
                                                  break L24;
                                                } else {
                                                  if (var3 == 0) {
                                                    break L19;
                                                  } else {
                                                    break L24;
                                                  }
                                                }
                                              }
                                              if (214 == var2) {
                                                break L19;
                                              } else {
                                                if (var2 == 213) {
                                                  break L19;
                                                } else {
                                                  L25: {
                                                    if (-250 == (var2 ^ -1)) {
                                                      break L25;
                                                    } else {
                                                      if (var2 != 250) {
                                                        if (-252 == (var2 ^ -1)) {
                                                          break L25;
                                                        } else {
                                                          if ((var2 ^ -1) == -253) {
                                                            break L25;
                                                          } else {
                                                            if (217 == var2) {
                                                              break L25;
                                                            } else {
                                                              if (var2 == 218) {
                                                                break L25;
                                                              } else {
                                                                if (var2 == 219) {
                                                                  break L25;
                                                                } else {
                                                                  if (220 != var2) {
                                                                    L26: {
                                                                      if ((var2 ^ -1) != -232) {
                                                                        if (var2 == 199) {
                                                                          break L26;
                                                                        } else {
                                                                          L27: {
                                                                            if (255 != var2) {
                                                                              if ((var2 ^ -1) == -377) {
                                                                                break L27;
                                                                              } else {
                                                                                L28: {
                                                                                  if (var2 != 241) {
                                                                                    if ((var2 ^ -1) != -210) {
                                                                                      if (-224 == (var2 ^ -1)) {
                                                                                        return 'b';
                                                                                      } else {
                                                                                        return Character.toLowerCase(param1);
                                                                                      }
                                                                                    } else {
                                                                                      if (var3 == 0) {
                                                                                        break L28;
                                                                                      } else {
                                                                                        if (-224 == (var2 ^ -1)) {
                                                                                          return 'b';
                                                                                        } else {
                                                                                          return Character.toLowerCase(param1);
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    if (var3 == 0) {
                                                                                      break L28;
                                                                                    } else {
                                                                                      if ((var2 ^ -1) != -210) {
                                                                                        if (-224 == (var2 ^ -1)) {
                                                                                          return 'b';
                                                                                        } else {
                                                                                          return Character.toLowerCase(param1);
                                                                                        }
                                                                                      } else {
                                                                                        if (-224 == (var2 ^ -1)) {
                                                                                          return 'b';
                                                                                        } else {
                                                                                          return Character.toLowerCase(param1);
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                return 'n';
                                                                              }
                                                                            } else {
                                                                              if (var3 == 0) {
                                                                                break L27;
                                                                              } else {
                                                                                if ((var2 ^ -1) == -377) {
                                                                                  return 'y';
                                                                                } else {
                                                                                  if (var2 != 241) {
                                                                                    if ((var2 ^ -1) != -210) {
                                                                                      if (-224 == (var2 ^ -1)) {
                                                                                        return 'b';
                                                                                      } else {
                                                                                        return Character.toLowerCase(param1);
                                                                                      }
                                                                                    } else {
                                                                                      if (var3 == 0) {
                                                                                        return 'n';
                                                                                      } else {
                                                                                        if (-224 == (var2 ^ -1)) {
                                                                                          return 'b';
                                                                                        } else {
                                                                                          return Character.toLowerCase(param1);
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    if ((var2 ^ -1) != -210) {
                                                                                      if (-224 == (var2 ^ -1)) {
                                                                                        return 'b';
                                                                                      } else {
                                                                                        return Character.toLowerCase(param1);
                                                                                      }
                                                                                    } else {
                                                                                      if (-224 == (var2 ^ -1)) {
                                                                                        return 'b';
                                                                                      } else {
                                                                                        return Character.toLowerCase(param1);
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                          }
                                                                          return 'y';
                                                                        }
                                                                      } else {
                                                                        if (var3 == 0) {
                                                                          break L26;
                                                                        } else {
                                                                          if (var2 == 199) {
                                                                            return 'c';
                                                                          } else {
                                                                            if (255 != var2) {
                                                                              if ((var2 ^ -1) == -377) {
                                                                                return 'y';
                                                                              } else {
                                                                                L29: {
                                                                                  if (var2 != 241) {
                                                                                    if ((var2 ^ -1) != -210) {
                                                                                      if (-224 == (var2 ^ -1)) {
                                                                                        return 'b';
                                                                                      } else {
                                                                                        return Character.toLowerCase(param1);
                                                                                      }
                                                                                    } else {
                                                                                      if (var3 == 0) {
                                                                                        break L29;
                                                                                      } else {
                                                                                        if (-224 == (var2 ^ -1)) {
                                                                                          return 'b';
                                                                                        } else {
                                                                                          return Character.toLowerCase(param1);
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    if (var3 == 0) {
                                                                                      break L29;
                                                                                    } else {
                                                                                      if ((var2 ^ -1) != -210) {
                                                                                        if (-224 == (var2 ^ -1)) {
                                                                                          return 'b';
                                                                                        } else {
                                                                                          return Character.toLowerCase(param1);
                                                                                        }
                                                                                      } else {
                                                                                        if (-224 == (var2 ^ -1)) {
                                                                                          return 'b';
                                                                                        } else {
                                                                                          return Character.toLowerCase(param1);
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                return 'n';
                                                                              }
                                                                            } else {
                                                                              if ((var2 ^ -1) == -377) {
                                                                                return 'y';
                                                                              } else {
                                                                                L30: {
                                                                                  if (var2 != 241) {
                                                                                    break L30;
                                                                                  } else {
                                                                                    break L30;
                                                                                  }
                                                                                }
                                                                                L31: {
                                                                                  if ((var2 ^ -1) != -210) {
                                                                                    break L31;
                                                                                  } else {
                                                                                    if (var3 == 0) {
                                                                                      return 'n';
                                                                                    } else {
                                                                                      break L31;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                if (-224 == (var2 ^ -1)) {
                                                                                  return 'b';
                                                                                } else {
                                                                                  return Character.toLowerCase(param1);
                                                                                }
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                    return 'c';
                                                                  } else {
                                                                    if (var3 == 0) {
                                                                      break L25;
                                                                    } else {
                                                                      L32: {
                                                                        if ((var2 ^ -1) != -232) {
                                                                          break L32;
                                                                        } else {
                                                                          break L32;
                                                                        }
                                                                      }
                                                                      if (var2 == 199) {
                                                                        return 'c';
                                                                      } else {
                                                                        L33: {
                                                                          L34: {
                                                                            if (255 != var2) {
                                                                              break L34;
                                                                            } else {
                                                                              if (var3 == 0) {
                                                                                break L33;
                                                                              } else {
                                                                                break L34;
                                                                              }
                                                                            }
                                                                          }
                                                                          if ((var2 ^ -1) == -377) {
                                                                            break L33;
                                                                          } else {
                                                                            L35: {
                                                                              L36: {
                                                                                if (var2 != 241) {
                                                                                  break L36;
                                                                                } else {
                                                                                  if (var3 == 0) {
                                                                                    break L35;
                                                                                  } else {
                                                                                    break L36;
                                                                                  }
                                                                                }
                                                                              }
                                                                              L37: {
                                                                                if ((var2 ^ -1) != -210) {
                                                                                  break L37;
                                                                                } else {
                                                                                  if (var3 == 0) {
                                                                                    break L35;
                                                                                  } else {
                                                                                    break L37;
                                                                                  }
                                                                                }
                                                                              }
                                                                              if (-224 == (var2 ^ -1)) {
                                                                                return 'b';
                                                                              } else {
                                                                                return Character.toLowerCase(param1);
                                                                              }
                                                                            }
                                                                            return 'n';
                                                                          }
                                                                        }
                                                                        return 'y';
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      } else {
                                                        if (var3 == 0) {
                                                          break L25;
                                                        } else {
                                                          L38: {
                                                            if (-252 == (var2 ^ -1)) {
                                                              break L38;
                                                            } else {
                                                              if ((var2 ^ -1) == -253) {
                                                                break L38;
                                                              } else {
                                                                if (217 == var2) {
                                                                  break L38;
                                                                } else {
                                                                  if (var2 == 218) {
                                                                    break L38;
                                                                  } else {
                                                                    if (var2 == 219) {
                                                                      break L38;
                                                                    } else {
                                                                      L39: {
                                                                        if (220 != var2) {
                                                                          break L39;
                                                                        } else {
                                                                          break L39;
                                                                        }
                                                                      }
                                                                      L40: {
                                                                        L41: {
                                                                          if ((var2 ^ -1) != -232) {
                                                                            break L41;
                                                                          } else {
                                                                            if (var3 == 0) {
                                                                              break L40;
                                                                            } else {
                                                                              break L41;
                                                                            }
                                                                          }
                                                                        }
                                                                        if (var2 == 199) {
                                                                          break L40;
                                                                        } else {
                                                                          L42: {
                                                                            L43: {
                                                                              if (255 != var2) {
                                                                                break L43;
                                                                              } else {
                                                                                if (var3 == 0) {
                                                                                  break L42;
                                                                                } else {
                                                                                  break L43;
                                                                                }
                                                                              }
                                                                            }
                                                                            if ((var2 ^ -1) == -377) {
                                                                              break L42;
                                                                            } else {
                                                                              L44: {
                                                                                L45: {
                                                                                  if (var2 != 241) {
                                                                                    break L45;
                                                                                  } else {
                                                                                    if (var3 == 0) {
                                                                                      break L44;
                                                                                    } else {
                                                                                      break L45;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                L46: {
                                                                                  if ((var2 ^ -1) != -210) {
                                                                                    break L46;
                                                                                  } else {
                                                                                    if (var3 == 0) {
                                                                                      break L44;
                                                                                    } else {
                                                                                      break L46;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                if (-224 == (var2 ^ -1)) {
                                                                                  return 'b';
                                                                                } else {
                                                                                  return Character.toLowerCase(param1);
                                                                                }
                                                                              }
                                                                              return 'n';
                                                                            }
                                                                          }
                                                                          return 'y';
                                                                        }
                                                                      }
                                                                      return 'c';
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                          return 'u';
                                                        }
                                                      }
                                                    }
                                                  }
                                                  return 'u';
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                      return 'o';
                                    }
                                    return 'i';
                                  } else {
                                    return 'i';
                                  }
                                } else {
                                  return 'e';
                                }
                              } else {
                                return 'e';
                              }
                            } else {
                              return 'e';
                            }
                          } else {
                            return 'e';
                          }
                        } else {
                          return 'e';
                        }
                      } else {
                        return 'a';
                      }
                    } else {
                      return 'a';
                    }
                  } else {
                    return 'a';
                  }
                } else {
                  return 'a';
                }
              } else {
                return 'a';
              }
            } else {
              return param1;
            }
          } else {
            return '_';
          }
        } else {
          return '_';
        }
    }

    static {
        field_a = new Random();
        field_e = "This will be an explosive surprise to your enemies.";
        field_d = "End Game";
        field_f = 0;
    }
}
