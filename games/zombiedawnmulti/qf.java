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
        field_b = null;
        field_e = null;
        field_g = null;
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
        int stackIn_6_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var13 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (param1 < param3) {
              L1: {
                var5_int = (param3 + param1) / 2;
                var6 = param1;
                var7 = param4[var5_int];
                param4[var5_int] = param4[param3];
                param4[param3] = var7;
                var8 = param0[var5_int];
                param0[var5_int] = param0[param3];
                param0[param3] = var8;
                if (var7 == 2147483647) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                }
              }
              var9 = stackIn_6_0;
              var10 = param1;
              L2: while (true) {
                if (param3 <= var10) {
                  param4[param3] = param4[var6];
                  param4[var6] = var7;
                  param0[param3] = param0[var6];
                  param0[var6] = var8;
                  qf.a(param0, param1, 2, var6 + -1, param4);
                  qf.a(param0, var6 + 1, 2, param3, param4);
                  break L0;
                } else {
                  L3: {
                    if (param4[var10] < (var9 & var10) + var7) {
                      var11 = param4[var10];
                      param4[var10] = param4[var6];
                      param4[var6] = var11;
                      var12 = param0[var10];
                      param0[var10] = param0[var6];
                      int incrementValue$1 = var6;
                      var6++;
                      param0[incrementValue$1] = var12;
                      var10++;
                      break L3;
                    } else {
                      var10++;
                      break L3;
                    }
                  }
                  var10++;
                  continue L2;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var5;
            stackOut_17_1 = new StringBuilder().append("qf.C(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          L5: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param1).append(',').append(2).append(',').append(param3).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param4 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L5;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ')');
        }
    }

    final static void a(int param0, int param1, boolean param2, byte param3, String param4) {
        try {
            int var5_int = -7;
            b.field_b = param1;
            sc.a(ah.field_e.field_C + ah.field_e.field_r, fh.field_h, param4, true, 320, 240, 15, (fm) (Object) ah.field_e, 10, (byte) -103, 5, 1, ah.field_e.field_C, true, rl.field_a);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "qf.B(" + 1 + ',' + param1 + ',' + true + ',' + 93 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static char a(int param0, char param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        var2 = param1;
        if (var2 != 32) {
          if (160 != var2) {
            if (95 != var2) {
              if (var2 != 45) {
                if (var2 != 91) {
                  if (var2 != 93) {
                    if (var2 != 35) {
                      if (var2 != 224) {
                        if (225 != var2) {
                          if (var2 != 226) {
                            if (var2 != 228) {
                              if (var2 != 227) {
                                if (var2 != 192) {
                                  if (var2 != 193) {
                                    if (var2 != 194) {
                                      if (var2 != 196) {
                                        if (195 != var2) {
                                          if (var2 != 232) {
                                            if (var2 != 233) {
                                              if (var2 != 234) {
                                                if (var2 != 235) {
                                                  if (var2 == 200) {
                                                    return 'e';
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
                                                                              if (var2 != 245) {
                                                                                if (var2 != 210) {
                                                                                  if (211 != var2) {
                                                                                    if (212 != var2) {
                                                                                      if (214 != var2) {
                                                                                        if (var2 == 213) {
                                                                                          return 'o';
                                                                                        } else {
                                                                                          if (var2 != 249) {
                                                                                            if (var2 != 250) {
                                                                                              if (var2 != 251) {
                                                                                                if (var2 != 252) {
                                                                                                  if (217 != var2) {
                                                                                                    if (var2 != 218) {
                                                                                                      if (var2 != 219) {
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
                                                                                                      } else {
                                                                                                        return 'u';
                                                                                                      }
                                                                                                    } else {
                                                                                                      return 'u';
                                                                                                    }
                                                                                                  } else {
                                                                                                    return 'u';
                                                                                                  }
                                                                                                } else {
                                                                                                  return 'u';
                                                                                                }
                                                                                              } else {
                                                                                                return 'u';
                                                                                              }
                                                                                            } else {
                                                                                              return 'u';
                                                                                            }
                                                                                          } else {
                                                                                            return 'u';
                                                                                          }
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
                                                      return 'e';
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
                      return param1;
                    }
                  } else {
                    return param1;
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
        field_a = new Random();
        field_e = "This will be an explosive surprise to your enemies.";
        field_d = "End Game";
        field_f = 0;
    }
}
