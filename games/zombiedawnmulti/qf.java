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
        int incrementValue$0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        int var13 = 0;
        var13 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == 2) {
                break L1;
              } else {
                qf.a(67, '');
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
                    stackIn_8_0 = 0;
                    break L3;
                  } else {
                    stackIn_8_0 = 1;
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
                        incrementValue$0 = var6;
                        var6++;
                        param0[incrementValue$0] = var12;
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
            stackIn_18_0 = (RuntimeException) (var5);

            stackIn_18_1 = new StringBuilder().append("qf.C(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_19_0), stackIn_22_2 + ')');
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
        int var2;
        int var3;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 != 28233) {
          qf.a(5);
          var2 = param1;
          if (-33 != (var2 ^ -1)) {
            L0: {
              if (160 != var2) {
                if (95 == var2) {
                  break L0;
                } else {
                  if ((var2 ^ -1) != -46) {
                    L1: {
                      if ((var2 ^ -1) != -92) {
                        if (var2 == 93) {
                          break L1;
                        } else {
                          if (var2 != 35) {
                            L2: {
                              if ((var2 ^ -1) == -225) {
                                break L2;
                              } else {
                                if (225 == var2) {
                                  break L2;
                                } else {
                                  if ((var2 ^ -1) != -227) {
                                    if (-229 != (var2 ^ -1)) {
                                      if (var2 == 227) {
                                        break L2;
                                      } else {
                                        if (-193 != (var2 ^ -1)) {
                                          if ((var2 ^ -1) != -194) {
                                            if (-195 == (var2 ^ -1)) {
                                              break L2;
                                            } else {
                                              if (var2 != 196) {
                                                if (195 == var2) {
                                                  break L2;
                                                } else {
                                                  L3: {
                                                    if (-233 == (var2 ^ -1)) {
                                                      break L3;
                                                    } else {
                                                      if (-234 == (var2 ^ -1)) {
                                                        break L3;
                                                      } else {
                                                        if (var2 == 234) {
                                                          break L3;
                                                        } else {
                                                          if (var2 == 235) {
                                                            break L3;
                                                          } else {
                                                            if (-201 == (var2 ^ -1)) {
                                                              break L3;
                                                            } else {
                                                              if (var2 != 201) {
                                                                if (-203 != (var2 ^ -1)) {
                                                                  if (var2 != 203) {
                                                                    if (237 != var2) {
                                                                      if (238 == var2) {
                                                                        return 'i';
                                                                      } else {
                                                                        if (var2 != 239) {
                                                                          if (-206 != (var2 ^ -1)) {
                                                                            if (-207 != (var2 ^ -1)) {
                                                                              if (207 != var2) {
                                                                                if (var2 != 242) {
                                                                                  if (var2 != 243) {
                                                                                    if (var2 != 244) {
                                                                                      if (-247 != (var2 ^ -1)) {
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
                                                                                                        if (-250 == (var2 ^ -1)) {
                                                                                                          break L5;
                                                                                                        } else {
                                                                                                          if (var2 != 250) {
                                                                                                            if (-252 == (var2 ^ -1)) {
                                                                                                              break L5;
                                                                                                            } else {
                                                                                                              if ((var2 ^ -1) == -253) {
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
                                                                                                                        if ((var2 ^ -1) != -232) {
                                                                                                                          if (var2 == 199) {
                                                                                                                            return 'c';
                                                                                                                          } else {
                                                                                                                            if (255 != var2) {
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
          if (-33 != (var2 ^ -1)) {
            L6: {
              if (160 != var2) {
                if (95 != var2) {
                  if ((var2 ^ -1) != -46) {
                    L7: {
                      if ((var2 ^ -1) != -92) {
                        if (var2 != 93) {
                          if (var2 != 35) {
                            if ((var2 ^ -1) != -225) {
                              L8: {
                                if (225 == var2) {
                                  break L8;
                                } else {
                                  if ((var2 ^ -1) != -227) {
                                    if (-229 != (var2 ^ -1)) {
                                      if (var2 == 227) {
                                        break L8;
                                      } else {
                                        if (-193 != (var2 ^ -1)) {
                                          if ((var2 ^ -1) != -194) {
                                            if (-195 == (var2 ^ -1)) {
                                              break L8;
                                            } else {
                                              if (var2 != 196) {
                                                if (195 == var2) {
                                                  break L8;
                                                } else {
                                                  L9: {
                                                    if (-233 == (var2 ^ -1)) {
                                                      break L9;
                                                    } else {
                                                      if (-234 == (var2 ^ -1)) {
                                                        break L9;
                                                      } else {
                                                        if (var2 == 234) {
                                                          break L9;
                                                        } else {
                                                          if (var2 == 235) {
                                                            break L9;
                                                          } else {
                                                            if (-201 == (var2 ^ -1)) {
                                                              break L9;
                                                            } else {
                                                              if (var2 != 201) {
                                                                if (-203 != (var2 ^ -1)) {
                                                                  if (var2 != 203) {
                                                                    L10: {
                                                                      if (237 != var2) {
                                                                        if (238 == var2) {
                                                                          break L10;
                                                                        } else {
                                                                          if (var2 != 239) {
                                                                            if (-206 != (var2 ^ -1)) {
                                                                              if (-207 != (var2 ^ -1)) {
                                                                                if (207 != var2) {
                                                                                  L11: {
                                                                                    if (var2 != 242) {
                                                                                      if (var2 != 243) {
                                                                                        if (var2 != 244) {
                                                                                          if (-247 != (var2 ^ -1)) {
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
                                                                                                          if (-250 == (var2 ^ -1)) {
                                                                                                            break L12;
                                                                                                          } else {
                                                                                                            if (var2 != 250) {
                                                                                                              if (-252 == (var2 ^ -1)) {
                                                                                                                break L12;
                                                                                                              } else {
                                                                                                                if ((var2 ^ -1) == -253) {
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
                                                                                                                          if ((var2 ^ -1) != -232) {
                                                                                                                            if (var2 == 199) {
                                                                                                                              return 'c';
                                                                                                                            } else {
                                                                                                                              if (255 != var2) {
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
        field_a = new Random();
        field_e = "This will be an explosive surprise to your enemies.";
        field_d = "End Game";
        field_f = 0;
    }
}
