/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dm extends wb {
    int field_p;
    static int[] field_w;
    static wc field_v;
    static int field_u;
    static km field_r;
    static String field_s;
    static int[] field_x;
    static String field_q;
    static String field_o;
    static String field_t;

    abstract Object b(byte param0);

    public static void e() {
        field_v = null;
        field_t = null;
        field_o = null;
        int var1 = -57;
        field_s = null;
        field_w = null;
        field_x = null;
        field_r = null;
        field_q = null;
    }

    final static boolean a(CharSequence param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var3 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            if (mi.a(param1 ^ -375, true, param0)) {
              L1: {
                if (param1 == -1478) {
                  break L1;
                } else {
                  field_o = null;
                  break L1;
                }
              }
              var2_int = 0;
              L2: while (true) {
                if (param0.length() <= var2_int) {
                  stackOut_12_0 = 1;
                  stackIn_13_0 = stackOut_12_0;
                  break L0;
                } else {
                  if (bn.a(-114, param0.charAt(var2_int))) {
                    var2_int++;
                    continue L2;
                  } else {
                    stackOut_9_0 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0 != 0;
                  }
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var2;
            stackOut_14_1 = new StringBuilder().append("dm.B(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param1 + 41);
        }
        return stackIn_13_0 != 0;
    }

    abstract boolean d(int param0);

    dm(int param0) {
        ((dm) this).field_p = param0;
    }

    final static char a(char param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = Virogrid.field_F ? 1 : 0;
        var2 = param0;
        if (var2 != 32) {
          if (var2 != 160) {
            if (var2 != 95) {
              if (45 != var2) {
                if (91 != var2) {
                  if (var2 != 93) {
                    if (35 != var2) {
                      if (224 != var2) {
                        if (var2 != 225) {
                          if (var2 != 226) {
                            if (var2 != 228) {
                              if (var2 != 227) {
                                if (var2 != 192) {
                                  if (var2 != 193) {
                                    if (194 != var2) {
                                      if (var2 != 196) {
                                        if (var2 != 195) {
                                          if (var2 != 232) {
                                            if (233 != var2) {
                                              if (var2 != 234) {
                                                if (var2 != 235) {
                                                  if (200 != var2) {
                                                    if (var2 != 201) {
                                                      if (var2 != 202) {
                                                        if (203 == var2) {
                                                          return 'e';
                                                        } else {
                                                          if (237 != var2) {
                                                            if (var2 != 238) {
                                                              if (239 != var2) {
                                                                if (var2 != 205) {
                                                                  if (var2 != 206) {
                                                                    if (var2 == 207) {
                                                                      return 'i';
                                                                    } else {
                                                                      if (var2 != 242) {
                                                                        if (var2 != 243) {
                                                                          if (var2 != 244) {
                                                                            if (var2 != 246) {
                                                                              L0: {
                                                                                if (var2 == 245) {
                                                                                  break L0;
                                                                                } else {
                                                                                  if (var2 != 210) {
                                                                                    if (211 == var2) {
                                                                                      break L0;
                                                                                    } else {
                                                                                      if (var2 == 212) {
                                                                                        break L0;
                                                                                      } else {
                                                                                        if (var2 != 214) {
                                                                                          if (var2 == 213) {
                                                                                            break L0;
                                                                                          } else {
                                                                                            L1: {
                                                                                              if (var2 == 249) {
                                                                                                break L1;
                                                                                              } else {
                                                                                                if (var2 != 250) {
                                                                                                  if (var2 != 251) {
                                                                                                    if (var2 == 252) {
                                                                                                      break L1;
                                                                                                    } else {
                                                                                                      if (var2 != 217) {
                                                                                                        if (var2 != 218) {
                                                                                                          if (var2 == 219) {
                                                                                                            break L1;
                                                                                                          } else {
                                                                                                            if (var2 == 220) {
                                                                                                              break L1;
                                                                                                            } else {
                                                                                                              if (var2 != 231) {
                                                                                                                if (var2 != 199) {
                                                                                                                  if (var2 == 255) {
                                                                                                                    return 'y';
                                                                                                                  } else {
                                                                                                                    if (var2 != 376) {
                                                                                                                      if (var2 != 241) {
                                                                                                                        if (var2 == 209) {
                                                                                                                          return 'n';
                                                                                                                        } else {
                                                                                                                          if (223 == var2) {
                                                                                                                            return 'b';
                                                                                                                          } else {
                                                                                                                            return Character.toLowerCase(param0);
                                                                                                                          }
                                                                                                                        }
                                                                                                                      } else {
                                                                                                                        return 'n';
                                                                                                                      }
                                                                                                                    } else {
                                                                                                                      return 'y';
                                                                                                                    }
                                                                                                                  }
                                                                                                                } else {
                                                                                                                  return 'c';
                                                                                                                }
                                                                                                              } else {
                                                                                                                return 'c';
                                                                                                              }
                                                                                                            }
                                                                                                          }
                                                                                                        } else {
                                                                                                          return 'u';
                                                                                                        }
                                                                                                      } else {
                                                                                                        return 'u';
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    return 'u';
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
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    return 'o';
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
        field_w = new int[5];
        field_s = "Play rated game";
        field_o = "Try changing the '<%0>' setting.";
        field_q = "<%0> is not a member, and cannot play with the current options.";
        field_t = "That name is not available";
    }
}
