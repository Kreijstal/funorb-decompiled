/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qb {
    static mj field_c;
    static String field_d;
    static am field_a;
    static boolean field_b;

    public static void a() {
        field_c = null;
        field_a = null;
        field_d = null;
    }

    final static void a(int param0, int param1) {
        hk var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            re.field_e = param1;
            var2 = (hk) (Object) bd.field_c.a((byte) -117);
            L1: while (true) {
              if (var2 == null) {
                break L0;
              } else {
                L2: {
                  if (!var2.field_h.d(-3548)) {
                    var2.c(-19822);
                    break L2;
                  } else {
                    var2.field_g.g(re.field_e * var2.field_j / 256);
                    break L2;
                  }
                }
                var2 = (hk) (Object) bd.field_c.d((byte) 63);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw la.a((Throwable) (Object) var2_ref, "qb.D(" + 256 + 44 + param1 + 41);
        }
    }

    final static void a(int param0, le[] param1, byte param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var11 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (param4 <= 0) {
                  break L1;
                } else {
                  var5_int = param1[0].field_m;
                  var6 = param1[2].field_m;
                  var7 = param1[1].field_m;
                  param1[0].c(param3, param0);
                  param1[2].c(param4 + (param3 - var6), param0);
                  ge.b(si.field_u);
                  ge.c(param3 - -var5_int, param0, -var6 + param3 - -param4, param0 - -param1[1].field_n);
                  var10 = 29 % ((param2 - 22) / 48);
                  var8 = param3 + var5_int;
                  var9 = param4 + (param3 + -var6);
                  param3 = var8;
                  L2: while (true) {
                    if (var9 <= param3) {
                      ge.a(si.field_u);
                      break L0;
                    } else {
                      param1[1].c(param3, param0);
                      param3 = param3 + var7;
                      continue L2;
                    }
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("qb.B(").append(param0).append(44);
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
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw la.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final static char a(char param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        var2 = param0;
        if (32 != var2) {
          if (var2 != 160) {
            if (95 != var2) {
              if (var2 != 45) {
                if (var2 != 91) {
                  if (var2 != 93) {
                    if (35 != var2) {
                      if (var2 != 224) {
                        if (var2 != 225) {
                          if (var2 != 226) {
                            if (var2 != 228) {
                              if (var2 != 227) {
                                if (192 != var2) {
                                  if (var2 != 193) {
                                    if (var2 != 194) {
                                      if (var2 != 196) {
                                        if (var2 != 195) {
                                          if (var2 != 232) {
                                            if (var2 != 233) {
                                              if (var2 != 234) {
                                                if (var2 != 235) {
                                                  if (var2 != 200) {
                                                    if (var2 != 201) {
                                                      if (202 != var2) {
                                                        if (203 != var2) {
                                                          if (var2 == 237) {
                                                            return 'i';
                                                          } else {
                                                            if (var2 != 238) {
                                                              if (var2 != 239) {
                                                                if (205 != var2) {
                                                                  if (var2 != 206) {
                                                                    if (var2 != 207) {
                                                                      if (var2 != 242) {
                                                                        if (var2 != 243) {
                                                                          if (244 != var2) {
                                                                            if (var2 != 246) {
                                                                              if (var2 != 245) {
                                                                                if (var2 != 210) {
                                                                                  if (var2 != 211) {
                                                                                    if (var2 != 212) {
                                                                                      if (var2 != 214) {
                                                                                        if (var2 == 213) {
                                                                                          return 'o';
                                                                                        } else {
                                                                                          L0: {
                                                                                            if (var2 == 249) {
                                                                                              break L0;
                                                                                            } else {
                                                                                              if (var2 != 250) {
                                                                                                if (var2 == 251) {
                                                                                                  break L0;
                                                                                                } else {
                                                                                                  if (var2 != 252) {
                                                                                                    if (var2 == 217) {
                                                                                                      break L0;
                                                                                                    } else {
                                                                                                      if (218 == var2) {
                                                                                                        break L0;
                                                                                                      } else {
                                                                                                        if (var2 != 219) {
                                                                                                          if (var2 != 220) {
                                                                                                            L1: {
                                                                                                              if (var2 == 231) {
                                                                                                                break L1;
                                                                                                              } else {
                                                                                                                if (var2 == 199) {
                                                                                                                  break L1;
                                                                                                                } else {
                                                                                                                  if (var2 != 255) {
                                                                                                                    if (376 == var2) {
                                                                                                                      return 'y';
                                                                                                                    } else {
                                                                                                                      L2: {
                                                                                                                        if (var2 == 241) {
                                                                                                                          break L2;
                                                                                                                        } else {
                                                                                                                          if (var2 == 209) {
                                                                                                                            break L2;
                                                                                                                          } else {
                                                                                                                            if (var2 != 223) {
                                                                                                                              return Character.toLowerCase(param0);
                                                                                                                            } else {
                                                                                                                              return 'b';
                                                                                                                            }
                                                                                                                          }
                                                                                                                        }
                                                                                                                      }
                                                                                                                      return 'n';
                                                                                                                    }
                                                                                                                  } else {
                                                                                                                    return 'y';
                                                                                                                  }
                                                                                                                }
                                                                                                              }
                                                                                                            }
                                                                                                            return 'c';
                                                                                                          } else {
                                                                                                            return 'u';
                                                                                                          }
                                                                                                        } else {
                                                                                                          return 'u';
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    return 'u';
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                return 'u';
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                          return 'u';
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
                                                            } else {
                                                              return 'i';
                                                            }
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
                      return param0;
                    }
                  } else {
                    return param0;
                  }
                } else {
                  return param0;
                }
              } else {
                return '_';
              }
            } else {
              return '_';
            }
          } else {
            return '_';
          }
        } else {
          return '_';
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Click";
        pj discarded$0 = new pj();
        field_a = new am();
        field_b = false;
    }
}
