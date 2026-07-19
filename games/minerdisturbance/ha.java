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
        gj discarded$1 = null;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
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
        int decompiledRegionSelector0 = 0;
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
          L0: {
            var2_int = param1.length();
            if (var2_int == 0) {
              stackOut_3_0 = dh.field_d;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (64 < var2_int) {
                stackOut_7_0 = ec.field_d;
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  if (param0 == 92) {
                    break L1;
                  } else {
                    var7 = (String) null;
                    discarded$1 = ha.a(2, (String) null);
                    break L1;
                  }
                }
                if (34 != param1.charAt(0)) {
                  var3 = 0;
                  var4 = 0;
                  L2: while (true) {
                    if (var4 < var2_int) {
                      L3: {
                        var5 = param1.charAt(var4);
                        if (46 != var5) {
                          if (al.field_o.indexOf(var5) == -1) {
                            stackOut_45_0 = vh.field_f;
                            stackIn_46_0 = stackOut_45_0;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          } else {
                            var3 = 0;
                            break L3;
                          }
                        } else {
                          L4: {
                            if (-1 == (var4 ^ -1)) {
                              break L4;
                            } else {
                              if (-1 + var2_int == var4) {
                                break L4;
                              } else {
                                if (var3 != 0) {
                                  break L4;
                                } else {
                                  var3 = 1;
                                  break L3;
                                }
                              }
                            }
                          }
                          stackOut_40_0 = vh.field_f;
                          stackIn_41_0 = stackOut_40_0;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        }
                      }
                      var4++;
                      continue L2;
                    } else {
                      return null;
                    }
                  }
                } else {
                  if (param1.charAt(-1 + var2_int) == 34) {
                    var3 = 0;
                    var4 = 1;
                    L5: while (true) {
                      if (var2_int + -1 > var4) {
                        L6: {
                          var5 = param1.charAt(var4);
                          if (92 == var5) {
                            L7: {
                              if (var3 != 0) {
                                stackOut_22_0 = 0;
                                stackIn_23_0 = stackOut_22_0;
                                break L7;
                              } else {
                                stackOut_21_0 = 1;
                                stackIn_23_0 = stackOut_21_0;
                                break L7;
                              }
                            }
                            var3 = stackIn_23_0;
                            break L6;
                          } else {
                            L8: {
                              if (var5 != 34) {
                                break L8;
                              } else {
                                if (var3 == 0) {
                                  stackOut_27_0 = vh.field_f;
                                  stackIn_28_0 = stackOut_27_0;
                                  decompiledRegionSelector0 = 3;
                                  break L0;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            var3 = 0;
                            break L6;
                          }
                        }
                        var4++;
                        continue L5;
                      } else {
                        return null;
                      }
                    }
                  } else {
                    stackOut_13_0 = vh.field_f;
                    stackIn_14_0 = stackOut_13_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_50_0 = (RuntimeException) (var2);
            stackOut_50_1 = new StringBuilder().append("ha.C(").append(param0).append(',');
            stackIn_52_0 = stackOut_50_0;
            stackIn_52_1 = stackOut_50_1;
            stackIn_51_0 = stackOut_50_0;
            stackIn_51_1 = stackOut_50_1;
            if (param1 == null) {
              stackOut_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackOut_52_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackOut_52_2 = "null";
              stackIn_53_0 = stackOut_52_0;
              stackIn_53_1 = stackOut_52_1;
              stackIn_53_2 = stackOut_52_2;
              break L9;
            } else {
              stackOut_51_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackOut_51_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackOut_51_2 = "{...}";
              stackIn_53_0 = stackOut_51_0;
              stackIn_53_1 = stackOut_51_1;
              stackIn_53_2 = stackOut_51_2;
              break L9;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_53_0), stackIn_53_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_28_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_41_0;
                } else {
                  return stackIn_46_0;
                }
              }
            }
          }
        }
    }

    final static char a(int param0, char param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = MinerDisturbance.field_ab;
          if (param0 == 242) {
            break L0;
          } else {
            ha.a((byte) 76);
            break L0;
          }
        }
        L1: {
          var2 = param1;
          if (var2 != 32) {
            if (160 == var2) {
              break L1;
            } else {
              if (95 == var2) {
                break L1;
              } else {
                if (-46 != (var2 ^ -1)) {
                  L2: {
                    if (var2 != 91) {
                      if ((var2 ^ -1) == -94) {
                        break L2;
                      } else {
                        if (-36 == (var2 ^ -1)) {
                          break L2;
                        } else {
                          L3: {
                            if (-225 == (var2 ^ -1)) {
                              break L3;
                            } else {
                              if (225 == var2) {
                                break L3;
                              } else {
                                if ((var2 ^ -1) == -227) {
                                  break L3;
                                } else {
                                  if (228 == var2) {
                                    break L3;
                                  } else {
                                    if (227 != var2) {
                                      if (var2 != 192) {
                                        if (-194 == (var2 ^ -1)) {
                                          break L3;
                                        } else {
                                          if (var2 == 194) {
                                            break L3;
                                          } else {
                                            if (196 != var2) {
                                              if (var2 != 195) {
                                                L4: {
                                                  if (var2 != 232) {
                                                    if (var2 == 233) {
                                                      break L4;
                                                    } else {
                                                      if (-235 != (var2 ^ -1)) {
                                                        if (var2 != 235) {
                                                          if ((var2 ^ -1) == -201) {
                                                            break L4;
                                                          } else {
                                                            if (var2 != 201) {
                                                              if (var2 == 202) {
                                                                break L4;
                                                              } else {
                                                                if (203 != var2) {
                                                                  L5: {
                                                                    if (237 != var2) {
                                                                      if (238 != var2) {
                                                                        if (-240 == (var2 ^ -1)) {
                                                                          break L5;
                                                                        } else {
                                                                          if (-206 == (var2 ^ -1)) {
                                                                            break L5;
                                                                          } else {
                                                                            if (-207 == (var2 ^ -1)) {
                                                                              break L5;
                                                                            } else {
                                                                              if (-208 == (var2 ^ -1)) {
                                                                                break L5;
                                                                              } else {
                                                                                L6: {
                                                                                  if (var2 == 242) {
                                                                                    break L6;
                                                                                  } else {
                                                                                    if ((var2 ^ -1) == -244) {
                                                                                      break L6;
                                                                                    } else {
                                                                                      if (244 != var2) {
                                                                                        if ((var2 ^ -1) == -247) {
                                                                                          break L6;
                                                                                        } else {
                                                                                          if (var2 == 245) {
                                                                                            break L6;
                                                                                          } else {
                                                                                            if (var2 != 210) {
                                                                                              if (-212 == (var2 ^ -1)) {
                                                                                                break L6;
                                                                                              } else {
                                                                                                if (var2 != 212) {
                                                                                                  if (214 == var2) {
                                                                                                    break L6;
                                                                                                  } else {
                                                                                                    if (var2 != 213) {
                                                                                                      L7: {
                                                                                                        if ((var2 ^ -1) == -250) {
                                                                                                          break L7;
                                                                                                        } else {
                                                                                                          if (-251 == (var2 ^ -1)) {
                                                                                                            break L7;
                                                                                                          } else {
                                                                                                            if ((var2 ^ -1) != -252) {
                                                                                                              if (-253 == (var2 ^ -1)) {
                                                                                                                break L7;
                                                                                                              } else {
                                                                                                                if (var2 != 217) {
                                                                                                                  if (var2 == 218) {
                                                                                                                    break L7;
                                                                                                                  } else {
                                                                                                                    if ((var2 ^ -1) == -220) {
                                                                                                                      break L7;
                                                                                                                    } else {
                                                                                                                      if ((var2 ^ -1) == -221) {
                                                                                                                        break L7;
                                                                                                                      } else {
                                                                                                                        L8: {
                                                                                                                          if (231 != var2) {
                                                                                                                            if ((var2 ^ -1) == -200) {
                                                                                                                              break L8;
                                                                                                                            } else {
                                                                                                                              L9: {
                                                                                                                                if (255 == var2) {
                                                                                                                                  break L9;
                                                                                                                                } else {
                                                                                                                                  if (-377 != (var2 ^ -1)) {
                                                                                                                                    L10: {
                                                                                                                                      if (-242 != (var2 ^ -1)) {
                                                                                                                                        if (var2 == 209) {
                                                                                                                                          break L10;
                                                                                                                                        } else {
                                                                                                                                          if ((var2 ^ -1) != -224) {
                                                                                                                                            return Character.toLowerCase(param1);
                                                                                                                                          } else {
                                                                                                                                            return 'b';
                                                                                                                                          }
                                                                                                                                        }
                                                                                                                                      } else {
                                                                                                                                        break L10;
                                                                                                                                      }
                                                                                                                                    }
                                                                                                                                    return 'n';
                                                                                                                                  } else {
                                                                                                                                    break L9;
                                                                                                                                  }
                                                                                                                                }
                                                                                                                              }
                                                                                                                              return 'y';
                                                                                                                            }
                                                                                                                          } else {
                                                                                                                            break L8;
                                                                                                                          }
                                                                                                                        }
                                                                                                                        return 'c';
                                                                                                                      }
                                                                                                                    }
                                                                                                                  }
                                                                                                                } else {
                                                                                                                  break L7;
                                                                                                                }
                                                                                                              }
                                                                                                            } else {
                                                                                                              break L7;
                                                                                                            }
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                      return 'u';
                                                                                                    } else {
                                                                                                      break L6;
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
                                                                                      } else {
                                                                                        break L6;
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
                                                                        break L5;
                                                                      }
                                                                    } else {
                                                                      break L5;
                                                                    }
                                                                  }
                                                                  return 'i';
                                                                } else {
                                                                  break L4;
                                                                }
                                                              }
                                                            } else {
                                                              break L4;
                                                            }
                                                          }
                                                        } else {
                                                          break L4;
                                                        }
                                                      } else {
                                                        break L4;
                                                      }
                                                    }
                                                  } else {
                                                    break L4;
                                                  }
                                                }
                                                return 'e';
                                              } else {
                                                break L3;
                                              }
                                            } else {
                                              break L3;
                                            }
                                          }
                                        }
                                      } else {
                                        break L3;
                                      }
                                    } else {
                                      break L3;
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
                      break L2;
                    }
                  }
                  return param1;
                } else {
                  break L1;
                }
              }
            }
          } else {
            break L1;
          }
        }
        return '_';
    }

    public static void a(byte param0) {
        gj discarded$0 = null;
        field_d = null;
        field_c = null;
        field_a = null;
        field_f = null;
        if (param0 != 28) {
            String var2 = (String) null;
            discarded$0 = ha.a(-127, (String) null);
        }
    }

    final static int a(CharSequence param0, int param1, int param2) {
        gj discarded$2 = null;
        RuntimeException var3 = null;
        String var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == 92) {
                break L1;
              } else {
                var4 = (String) null;
                discarded$2 = ha.a(91, (String) null);
                break L1;
              }
            }
            stackOut_2_0 = pd.a(param0, true, true, param1);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("ha.D(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_f = "Create your own free Jagex account";
        field_b = -1;
    }
}
