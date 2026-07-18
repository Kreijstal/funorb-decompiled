/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ha {
    static String field_f;
    static int field_e;
    static ea field_a;
    static ea field_c;
    static int field_b;
    static ea field_d;
    static int field_g;

    final static gj a(int param0, String param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        gj stackIn_4_0 = null;
        gj stackIn_8_0 = null;
        gj stackIn_14_0 = null;
        int stackIn_23_0 = 0;
        gj stackIn_28_0 = null;
        gj stackIn_41_0 = null;
        gj stackIn_46_0 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        gj stackOut_3_0 = null;
        gj stackOut_7_0 = null;
        gj stackOut_45_0 = null;
        gj stackOut_40_0 = null;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        gj stackOut_27_0 = null;
        gj stackOut_13_0 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        var6 = MinerDisturbance.field_ab;
        try {
          var2_int = param1.length();
          if (var2_int == 0) {
            stackOut_3_0 = dh.field_d;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0;
          } else {
            if (64 < var2_int) {
              stackOut_7_0 = ec.field_d;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0;
            } else {
              L0: {
                if (param0 == 92) {
                  break L0;
                } else {
                  var7 = null;
                  gj discarded$1 = ha.a(2, (String) null);
                  break L0;
                }
              }
              if (34 != param1.charAt(0)) {
                var3 = 0;
                var4 = 0;
                L1: while (true) {
                  if (var4 < var2_int) {
                    L2: {
                      var5 = param1.charAt(var4);
                      if (46 != var5) {
                        if (al.field_o.indexOf(var5) == -1) {
                          stackOut_45_0 = vh.field_f;
                          stackIn_46_0 = stackOut_45_0;
                          return stackIn_46_0;
                        } else {
                          var3 = 0;
                          break L2;
                        }
                      } else {
                        L3: {
                          if (var4 == 0) {
                            break L3;
                          } else {
                            if (-1 + var2_int == var4) {
                              break L3;
                            } else {
                              if (var3 != 0) {
                                break L3;
                              } else {
                                var3 = 1;
                                break L2;
                              }
                            }
                          }
                        }
                        stackOut_40_0 = vh.field_f;
                        stackIn_41_0 = stackOut_40_0;
                        return stackIn_41_0;
                      }
                    }
                    var4++;
                    continue L1;
                  } else {
                    return null;
                  }
                }
              } else {
                if (param1.charAt(-1 + var2_int) == 34) {
                  var3 = 0;
                  var4 = 1;
                  L4: while (true) {
                    if (var2_int + -1 > var4) {
                      L5: {
                        var5 = param1.charAt(var4);
                        if (92 == var5) {
                          L6: {
                            if (var3 != 0) {
                              stackOut_22_0 = 0;
                              stackIn_23_0 = stackOut_22_0;
                              break L6;
                            } else {
                              stackOut_21_0 = 1;
                              stackIn_23_0 = stackOut_21_0;
                              break L6;
                            }
                          }
                          var3 = stackIn_23_0;
                          break L5;
                        } else {
                          L7: {
                            if (var5 != 34) {
                              break L7;
                            } else {
                              if (var3 == 0) {
                                stackOut_27_0 = vh.field_f;
                                stackIn_28_0 = stackOut_27_0;
                                return stackIn_28_0;
                              } else {
                                break L7;
                              }
                            }
                          }
                          var3 = 0;
                          break L5;
                        }
                      }
                      var4++;
                      continue L4;
                    } else {
                      return null;
                    }
                  }
                } else {
                  stackOut_13_0 = vh.field_f;
                  stackIn_14_0 = stackOut_13_0;
                  return stackIn_14_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_50_0 = (RuntimeException) var2;
            stackOut_50_1 = new StringBuilder().append("ha.C(").append(param0).append(',');
            stackIn_52_0 = stackOut_50_0;
            stackIn_52_1 = stackOut_50_1;
            stackIn_51_0 = stackOut_50_0;
            stackIn_51_1 = stackOut_50_1;
            if (param1 == null) {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "null";
              stackIn_53_0 = stackOut_52_0;
              stackIn_53_1 = stackOut_52_1;
              stackIn_53_2 = stackOut_52_2;
              break L8;
            } else {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "{...}";
              stackIn_53_0 = stackOut_51_0;
              stackIn_53_1 = stackOut_51_1;
              stackIn_53_2 = stackOut_51_2;
              break L8;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_53_0, stackIn_53_2 + ')');
        }
    }

    final static char a(int param0, char param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = MinerDisturbance.field_ab;
          var2 = param1;
          if (var2 != 32) {
            if (160 == var2) {
              break L0;
            } else {
              if (95 == var2) {
                break L0;
              } else {
                if (var2 != 45) {
                  L1: {
                    if (var2 != 91) {
                      if (var2 == 93) {
                        break L1;
                      } else {
                        if (var2 == 35) {
                          break L1;
                        } else {
                          L2: {
                            if (var2 == 224) {
                              break L2;
                            } else {
                              if (225 == var2) {
                                break L2;
                              } else {
                                if (var2 == 226) {
                                  break L2;
                                } else {
                                  if (228 == var2) {
                                    break L2;
                                  } else {
                                    if (227 != var2) {
                                      if (var2 != 192) {
                                        if (var2 == 193) {
                                          break L2;
                                        } else {
                                          if (var2 == 194) {
                                            break L2;
                                          } else {
                                            if (196 != var2) {
                                              if (var2 != 195) {
                                                L3: {
                                                  if (var2 != 232) {
                                                    if (var2 == 233) {
                                                      break L3;
                                                    } else {
                                                      if (var2 != 234) {
                                                        if (var2 != 235) {
                                                          if (var2 == 200) {
                                                            break L3;
                                                          } else {
                                                            if (var2 != 201) {
                                                              if (var2 == 202) {
                                                                break L3;
                                                              } else {
                                                                if (203 != var2) {
                                                                  L4: {
                                                                    if (237 != var2) {
                                                                      if (238 != var2) {
                                                                        if (var2 == 239) {
                                                                          break L4;
                                                                        } else {
                                                                          if (var2 == 205) {
                                                                            break L4;
                                                                          } else {
                                                                            if (var2 == 206) {
                                                                              break L4;
                                                                            } else {
                                                                              if (var2 == 207) {
                                                                                break L4;
                                                                              } else {
                                                                                L5: {
                                                                                  if (var2 == 242) {
                                                                                    break L5;
                                                                                  } else {
                                                                                    if (var2 == 243) {
                                                                                      break L5;
                                                                                    } else {
                                                                                      if (244 != var2) {
                                                                                        if (var2 == 246) {
                                                                                          break L5;
                                                                                        } else {
                                                                                          if (var2 == 245) {
                                                                                            break L5;
                                                                                          } else {
                                                                                            if (var2 != 210) {
                                                                                              if (var2 == 211) {
                                                                                                break L5;
                                                                                              } else {
                                                                                                if (var2 != 212) {
                                                                                                  if (214 == var2) {
                                                                                                    break L5;
                                                                                                  } else {
                                                                                                    if (var2 != 213) {
                                                                                                      L6: {
                                                                                                        if (var2 == 249) {
                                                                                                          break L6;
                                                                                                        } else {
                                                                                                          if (var2 == 250) {
                                                                                                            break L6;
                                                                                                          } else {
                                                                                                            if (var2 != 251) {
                                                                                                              if (var2 == 252) {
                                                                                                                break L6;
                                                                                                              } else {
                                                                                                                if (var2 != 217) {
                                                                                                                  if (var2 == 218) {
                                                                                                                    break L6;
                                                                                                                  } else {
                                                                                                                    if (var2 == 219) {
                                                                                                                      break L6;
                                                                                                                    } else {
                                                                                                                      if (var2 == 220) {
                                                                                                                        break L6;
                                                                                                                      } else {
                                                                                                                        L7: {
                                                                                                                          if (231 != var2) {
                                                                                                                            if (var2 == 199) {
                                                                                                                              break L7;
                                                                                                                            } else {
                                                                                                                              L8: {
                                                                                                                                if (255 == var2) {
                                                                                                                                  break L8;
                                                                                                                                } else {
                                                                                                                                  if (var2 != 376) {
                                                                                                                                    L9: {
                                                                                                                                      if (var2 != 241) {
                                                                                                                                        if (var2 == 209) {
                                                                                                                                          break L9;
                                                                                                                                        } else {
                                                                                                                                          if (var2 != 223) {
                                                                                                                                            return Character.toLowerCase(param1);
                                                                                                                                          } else {
                                                                                                                                            return 'b';
                                                                                                                                          }
                                                                                                                                        }
                                                                                                                                      } else {
                                                                                                                                        break L9;
                                                                                                                                      }
                                                                                                                                    }
                                                                                                                                    return 'n';
                                                                                                                                  } else {
                                                                                                                                    break L8;
                                                                                                                                  }
                                                                                                                                }
                                                                                                                              }
                                                                                                                              return 'y';
                                                                                                                            }
                                                                                                                          } else {
                                                                                                                            break L7;
                                                                                                                          }
                                                                                                                        }
                                                                                                                        return 'c';
                                                                                                                      }
                                                                                                                    }
                                                                                                                  }
                                                                                                                } else {
                                                                                                                  break L6;
                                                                                                                }
                                                                                                              }
                                                                                                            } else {
                                                                                                              break L6;
                                                                                                            }
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                      return 'u';
                                                                                                    } else {
                                                                                                      break L5;
                                                                                                    }
                                                                                                  }
                                                                                                } else {
                                                                                                  break L5;
                                                                                                }
                                                                                              }
                                                                                            } else {
                                                                                              break L5;
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        break L5;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                return 'o';
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                      } else {
                                                                        break L4;
                                                                      }
                                                                    } else {
                                                                      break L4;
                                                                    }
                                                                  }
                                                                  return 'i';
                                                                } else {
                                                                  break L3;
                                                                }
                                                              }
                                                            } else {
                                                              break L3;
                                                            }
                                                          }
                                                        } else {
                                                          break L3;
                                                        }
                                                      } else {
                                                        break L3;
                                                      }
                                                    }
                                                  } else {
                                                    break L3;
                                                  }
                                                }
                                                return 'e';
                                              } else {
                                                break L2;
                                              }
                                            } else {
                                              break L2;
                                            }
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
                            }
                          }
                          return 'a';
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
            }
          } else {
            break L0;
          }
        }
        return '_';
    }

    public static void a() {
        field_d = null;
        field_c = null;
        field_a = null;
        field_f = null;
    }

    final static int a(CharSequence param0) {
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            stackOut_0_0 = pd.a(param0, true, true, 16);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("ha.D(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + 16 + ',' + 92 + ')');
        }
        return stackIn_1_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Create your own free Jagex account";
        field_b = -1;
    }
}
