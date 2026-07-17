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
          field_b = null;
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
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
        var13 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == 2) {
                break L1;
              } else {
                char discarded$2 = qf.a(67, '');
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
                  if (var7 == 2147483647) {
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
                  if (param3 <= var10) {
                    param4[param3] = param4[var6];
                    param4[var6] = var7;
                    param0[param3] = param0[var6];
                    param0[var6] = var8;
                    qf.a(param0, param1, 2, var6 + -1, param4);
                    qf.a(param0, var6 + 1, 2, param3, param4);
                    break L2;
                  } else {
                    L5: {
                      if (param4[var10] < (var9 & var10) + var7) {
                        var11 = param4[var10];
                        param4[var10] = param4[var6];
                        param4[var6] = var11;
                        var12 = param0[var10];
                        param0[var10] = param0[var6];
                        int incrementValue$3 = var6;
                        var6++;
                        param0[incrementValue$3] = var12;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    var10++;
                    continue L4;
                  }
                }
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var5;
            stackOut_16_1 = new StringBuilder().append("qf.C(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
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
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param4 == null) {
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
          throw fa.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 41);
        }
    }

    final static void a(int param0, int param1, boolean param2, byte param3, String param4) {
        try {
            int var5_int = -7 / ((param3 - 23) / 48);
            b.field_b = param1;
            sc.a(ah.field_e.field_C + ah.field_e.field_r, fh.field_h, param4, true, 320, 240, 15, (fm) (Object) ah.field_e, 10, (byte) -103, 5, param0, ah.field_e.field_C, param2, rl.field_a);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "qf.B(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 41);
        }
    }

    final static char a(int param0, char param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 != 28233) {
          qf.a(5);
          var2 = param1;
          if (var2 != 32) {
            L0: {
              if (160 != var2) {
                if (95 == var2) {
                  break L0;
                } else {
                  if (var2 != 45) {
                    L1: {
                      if (var2 != 91) {
                        if (var2 == 93) {
                          break L1;
                        } else {
                          if (var2 != 35) {
                            L2: {
                              if (var2 == 224) {
                                break L2;
                              } else {
                                if (225 == var2) {
                                  break L2;
                                } else {
                                  if (var2 != 226) {
                                    if (var2 != 228) {
                                      if (var2 == 227) {
                                        break L2;
                                      } else {
                                        if (var2 != 192) {
                                          if (var2 != 193) {
                                            if (var2 == 194) {
                                              break L2;
                                            } else {
                                              if (var2 != 196) {
                                                if (195 == var2) {
                                                  break L2;
                                                } else {
                                                  L3: {
                                                    if (var2 == 232) {
                                                      break L3;
                                                    } else {
                                                      if (var2 == 233) {
                                                        break L3;
                                                      } else {
                                                        if (var2 == 234) {
                                                          break L3;
                                                        } else {
                                                          if (var2 == 235) {
                                                            break L3;
                                                          } else {
                                                            if (var2 == 200) {
                                                              break L3;
                                                            } else {
                                                              if (var2 != 201) {
                                                                if (var2 != 202) {
                                                                  if (var2 != 203) {
                                                                    if (237 != var2) {
                                                                      if (238 == var2) {
                                                                        return 'i';
                                                                      } else {
                                                                        if (var2 != 239) {
                                                                          if (var2 != 205) {
                                                                            if (var2 != 206) {
                                                                              if (207 != var2) {
                                                                                if (var2 != 242) {
                                                                                  if (var2 != 243) {
                                                                                    if (var2 != 244) {
                                                                                      if (var2 != 246) {
                                                                                        L4: {
                                                                                          if (var2 == 245) {
                                                                                            break L4;
                                                                                          } else {
                                                                                            if (var2 == 210) {
                                                                                              break L4;
                                                                                            } else {
                                                                                              if (211 == var2) {
                                                                                                break L4;
                                                                                              } else {
                                                                                                if (212 != var2) {
                                                                                                  if (214 == var2) {
                                                                                                    break L4;
                                                                                                  } else {
                                                                                                    if (var2 == 213) {
                                                                                                      break L4;
                                                                                                    } else {
                                                                                                      L5: {
                                                                                                        if (var2 == 249) {
                                                                                                          break L5;
                                                                                                        } else {
                                                                                                          if (var2 != 250) {
                                                                                                            if (var2 == 251) {
                                                                                                              break L5;
                                                                                                            } else {
                                                                                                              if (var2 == 252) {
                                                                                                                break L5;
                                                                                                              } else {
                                                                                                                if (217 == var2) {
                                                                                                                  break L5;
                                                                                                                } else {
                                                                                                                  if (var2 == 218) {
                                                                                                                    break L5;
                                                                                                                  } else {
                                                                                                                    if (var2 == 219) {
                                                                                                                      break L5;
                                                                                                                    } else {
                                                                                                                      if (220 != var2) {
                                                                                                                        if (var2 != 231) {
                                                                                                                          if (var2 == 199) {
                                                                                                                            return 'c';
                                                                                                                          } else {
                                                                                                                            if (255 != var2) {
                                                                                                                              if (var2 == 376) {
                                                                                                                                return 'y';
                                                                                                                              } else {
                                                                                                                                if (var2 != 241) {
                                                                                                                                  if (var2 != 209) {
                                                                                                                                    if (var2 == 223) {
                                                                                                                                      return 'b';
                                                                                                                                    } else {
                                                                                                                                      return Character.toLowerCase(param1);
                                                                                                                                    }
                                                                                                                                  } else {
                                                                                                                                    return 'n';
                                                                                                                                  }
                                                                                                                                } else {
                                                                                                                                  return 'n';
                                                                                                                                }
                                                                                                                              }
                                                                                                                            } else {
                                                                                                                              return 'y';
                                                                                                                            }
                                                                                                                          }
                                                                                                                        } else {
                                                                                                                          return 'c';
                                                                                                                        }
                                                                                                                      } else {
                                                                                                                        return 'u';
                                                                                                                      }
                                                                                                                    }
                                                                                                                  }
                                                                                                                }
                                                                                                              }
                                                                                                            }
                                                                                                          } else {
                                                                                                            return 'u';
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                      return 'u';
                                                                                                    }
                                                                                                  }
                                                                                                } else {
                                                                                                  return 'o';
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                        return 'o';
                                                                                      } else {
                                                                                        return 'o';
                                                                                      }
                                                                                    } else {
                                                                                      return 'o';
                                                                                    }
                                                                                  } else {
                                                                                    return 'o';
                                                                                  }
                                                                                } else {
                                                                                  return 'o';
                                                                                }
                                                                              } else {
                                                                                return 'i';
                                                                              }
                                                                            } else {
                                                                              return 'i';
                                                                            }
                                                                          } else {
                                                                            return 'i';
                                                                          }
                                                                        } else {
                                                                          return 'i';
                                                                        }
                                                                      }
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
                                                                break L3;
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                  return 'e';
                                                }
                                              } else {
                                                break L2;
                                              }
                                            }
                                          } else {
                                            break L2;
                                          }
                                        } else {
                                          break L2;
                                        }
                                      }
                                    } else {
                                      break L2;
                                    }
                                  } else {
                                    break L2;
                                  }
                                }
                              }
                            }
                            return 'a';
                          } else {
                            break L1;
                          }
                        }
                      } else {
                        break L1;
                      }
                    }
                    return param1;
                  } else {
                    break L0;
                  }
                }
              } else {
                break L0;
              }
            }
            return '_';
          } else {
            return '_';
          }
        } else {
          var2 = param1;
          if (var2 != 32) {
            L6: {
              if (160 != var2) {
                if (95 != var2) {
                  if (var2 != 45) {
                    L7: {
                      if (var2 != 91) {
                        if (var2 != 93) {
                          if (var2 != 35) {
                            if (var2 != 224) {
                              L8: {
                                if (225 == var2) {
                                  break L8;
                                } else {
                                  if (var2 != 226) {
                                    if (var2 != 228) {
                                      if (var2 == 227) {
                                        break L8;
                                      } else {
                                        if (var2 != 192) {
                                          if (var2 != 193) {
                                            if (var2 == 194) {
                                              break L8;
                                            } else {
                                              if (var2 != 196) {
                                                if (195 == var2) {
                                                  break L8;
                                                } else {
                                                  L9: {
                                                    if (var2 == 232) {
                                                      break L9;
                                                    } else {
                                                      if (var2 == 233) {
                                                        break L9;
                                                      } else {
                                                        if (var2 == 234) {
                                                          break L9;
                                                        } else {
                                                          if (var2 == 235) {
                                                            break L9;
                                                          } else {
                                                            if (var2 == 200) {
                                                              break L9;
                                                            } else {
                                                              if (var2 != 201) {
                                                                if (var2 != 202) {
                                                                  if (var2 != 203) {
                                                                    L10: {
                                                                      if (237 != var2) {
                                                                        if (238 == var2) {
                                                                          break L10;
                                                                        } else {
                                                                          if (var2 != 239) {
                                                                            if (var2 != 205) {
                                                                              if (var2 != 206) {
                                                                                if (207 != var2) {
                                                                                  L11: {
                                                                                    if (var2 != 242) {
                                                                                      if (var2 != 243) {
                                                                                        if (var2 != 244) {
                                                                                          if (var2 != 246) {
                                                                                            if (var2 == 245) {
                                                                                              break L11;
                                                                                            } else {
                                                                                              if (var2 == 210) {
                                                                                                break L11;
                                                                                              } else {
                                                                                                if (211 == var2) {
                                                                                                  break L11;
                                                                                                } else {
                                                                                                  if (212 != var2) {
                                                                                                    if (214 == var2) {
                                                                                                      break L11;
                                                                                                    } else {
                                                                                                      if (var2 == 213) {
                                                                                                        break L11;
                                                                                                      } else {
                                                                                                        L12: {
                                                                                                          if (var2 == 249) {
                                                                                                            break L12;
                                                                                                          } else {
                                                                                                            if (var2 != 250) {
                                                                                                              if (var2 == 251) {
                                                                                                                break L12;
                                                                                                              } else {
                                                                                                                if (var2 == 252) {
                                                                                                                  break L12;
                                                                                                                } else {
                                                                                                                  if (217 == var2) {
                                                                                                                    break L12;
                                                                                                                  } else {
                                                                                                                    if (var2 == 218) {
                                                                                                                      break L12;
                                                                                                                    } else {
                                                                                                                      if (var2 == 219) {
                                                                                                                        break L12;
                                                                                                                      } else {
                                                                                                                        if (220 != var2) {
                                                                                                                          if (var2 != 231) {
                                                                                                                            if (var2 == 199) {
                                                                                                                              return 'c';
                                                                                                                            } else {
                                                                                                                              if (255 != var2) {
                                                                                                                                if (var2 == 376) {
                                                                                                                                  return 'y';
                                                                                                                                } else {
                                                                                                                                  if (var2 != 241) {
                                                                                                                                    if (var2 != 209) {
                                                                                                                                      if (var2 == 223) {
                                                                                                                                        return 'b';
                                                                                                                                      } else {
                                                                                                                                        return Character.toLowerCase(param1);
                                                                                                                                      }
                                                                                                                                    } else {
                                                                                                                                      return 'n';
                                                                                                                                    }
                                                                                                                                  } else {
                                                                                                                                    return 'n';
                                                                                                                                  }
                                                                                                                                }
                                                                                                                              } else {
                                                                                                                                return 'y';
                                                                                                                              }
                                                                                                                            }
                                                                                                                          } else {
                                                                                                                            return 'c';
                                                                                                                          }
                                                                                                                        } else {
                                                                                                                          return 'u';
                                                                                                                        }
                                                                                                                      }
                                                                                                                    }
                                                                                                                  }
                                                                                                                }
                                                                                                              }
                                                                                                            } else {
                                                                                                              return 'u';
                                                                                                            }
                                                                                                          }
                                                                                                        }
                                                                                                        return 'u';
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    break L11;
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            break L11;
                                                                                          }
                                                                                        } else {
                                                                                          break L11;
                                                                                        }
                                                                                      } else {
                                                                                        break L11;
                                                                                      }
                                                                                    } else {
                                                                                      break L11;
                                                                                    }
                                                                                  }
                                                                                  return 'o';
                                                                                } else {
                                                                                  break L10;
                                                                                }
                                                                              } else {
                                                                                break L10;
                                                                              }
                                                                            } else {
                                                                              break L10;
                                                                            }
                                                                          } else {
                                                                            break L10;
                                                                          }
                                                                        }
                                                                      } else {
                                                                        break L10;
                                                                      }
                                                                    }
                                                                    return 'i';
                                                                  } else {
                                                                    break L9;
                                                                  }
                                                                } else {
                                                                  break L9;
                                                                }
                                                              } else {
                                                                break L9;
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                  return 'e';
                                                }
                                              } else {
                                                break L8;
                                              }
                                            }
                                          } else {
                                            break L8;
                                          }
                                        } else {
                                          break L8;
                                        }
                                      }
                                    } else {
                                      break L8;
                                    }
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                              return 'a';
                            } else {
                              return 'a';
                            }
                          } else {
                            break L7;
                          }
                        } else {
                          return param1;
                        }
                      } else {
                        break L7;
                      }
                    }
                    return param1;
                  } else {
                    break L6;
                  }
                } else {
                  return '_';
                }
              } else {
                break L6;
              }
            }
            return '_';
          } else {
            return '_';
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new Random();
        field_e = "This will be an explosive surprise to your enemies.";
        field_d = "End Game";
        field_f = 0;
    }
}
