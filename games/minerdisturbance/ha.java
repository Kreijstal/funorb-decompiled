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
        gj stackIn_4_0 = null;
        gj stackIn_8_0 = null;
        gj stackIn_14_0 = null;
        int stackIn_23_0 = 0;
        gj stackIn_28_0 = null;
        gj stackIn_41_0 = null;
        gj stackIn_46_0 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        var6 = MinerDisturbance.field_ab;
        try {
          L0: {
            var2_int = param1.length();
            if (var2_int == 0) {
              stackIn_4_0 = dh.field_d;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (64 < var2_int) {
                stackIn_8_0 = ec.field_d;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  if (param0 == 92) {
                    break L1;
                  } else {
                    var7 = (String) null;
                    ha.a(2, (String) null);
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
                            stackIn_46_0 = vh.field_f;
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
                          stackIn_41_0 = vh.field_f;
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
                                stackIn_23_0 = 0;
                                break L7;
                              } else {
                                stackIn_23_0 = 1;
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
                                  stackIn_28_0 = vh.field_f;
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
                    stackIn_14_0 = vh.field_f;
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
            stackIn_52_0 = (RuntimeException) (var2);

            stackIn_52_1 = new StringBuilder().append("ha.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_53_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackIn_53_2 = "null";
              break L9;
            } else {
              stackIn_53_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackIn_53_2 = "{...}";
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
        int var2;
        int var3;
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
        field_d = null;
        field_c = null;
        field_a = null;
        field_f = null;
        if (param0 != 28) {
            String var2 = (String) null;
            ha.a(-127, (String) null);
        }
    }

    final static int a(CharSequence param0, int param1, int param2) {
        RuntimeException var3 = null;
        String var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == 92) {
                break L1;
              } else {
                var4 = (String) null;
                ha.a(91, (String) null);
                break L1;
              }
            }
            stackIn_3_0 = pd.a(param0, true, true, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("ha.D(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
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
