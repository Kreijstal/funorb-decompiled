/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dh {
    static cd field_d;
    static volatile int field_b;
    static int field_c;
    static String field_a;

    final static am a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        am stackIn_5_0 = null;
        am stackIn_9_0 = null;
        am stackIn_19_0 = null;
        am stackIn_23_0 = null;
        Object stackIn_26_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        am stackOut_8_0 = null;
        am stackOut_18_0 = null;
        am stackOut_22_0 = null;
        Object stackOut_25_0 = null;
        am stackOut_4_0 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param0.length();
              if (param1 > 40) {
                break L1;
              } else {
                field_b = 88;
                break L1;
              }
            }
            if (var2_int != 0) {
              if ((var2_int ^ -1) < -64) {
                stackOut_8_0 = wk.field_f;
                stackIn_9_0 = stackOut_8_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var3 = 0;
                L2: while (true) {
                  if (var2_int > var3) {
                    L3: {
                      var4 = param0.charAt(var3);
                      if (var4 == 45) {
                        L4: {
                          if (0 == var3) {
                            break L4;
                          } else {
                            if (var2_int + -1 != var3) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        stackOut_18_0 = lh.field_c;
                        stackIn_19_0 = stackOut_18_0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        if ((fb.field_i.indexOf(var4) ^ -1) == 0) {
                          stackOut_22_0 = lh.field_c;
                          stackIn_23_0 = stackOut_22_0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var3++;
                    if (var5 == 0) {
                      continue L2;
                    } else {
                      stackOut_25_0 = null;
                      stackIn_26_0 = stackOut_25_0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    return null;
                  }
                }
              }
            } else {
              stackOut_4_0 = si.field_s;
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) (var2);
            stackOut_27_1 = new StringBuilder().append("dh.C(");
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L5;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L5;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_19_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_23_0;
              } else {
                return (am) ((Object) stackIn_26_0);
              }
            }
          }
        }
    }

    final static int a(boolean param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        kd.field_a = null;
        ii.field_T = 0;
        pg.field_a = null;
        if (param0) {
          var2 = oh.field_c;
          oh.field_c = pi.field_o;
          if ((param1 ^ -1) != -52) {
            if (50 == param1) {
              lg.field_n.field_a = 5;
              pi.field_o = var2;
              lg.field_n.field_b = lg.field_n.field_b + 1;
              if (-3 < (lg.field_n.field_b ^ -1)) {
                L0: {
                  if (lg.field_n.field_b < 2) {
                    break L0;
                  } else {
                    if ((param1 ^ -1) != -51) {
                      break L0;
                    } else {
                      return 5;
                    }
                  }
                }
                if (-5 >= (lg.field_n.field_b ^ -1)) {
                  return 1;
                } else {
                  return -1;
                }
              } else {
                if (51 != param1) {
                  L1: {
                    if (lg.field_n.field_b < 2) {
                      break L1;
                    } else {
                      if ((param1 ^ -1) != -51) {
                        break L1;
                      } else {
                        return 5;
                      }
                    }
                  }
                  if (-5 >= (lg.field_n.field_b ^ -1)) {
                    return 1;
                  } else {
                    return -1;
                  }
                } else {
                  return 2;
                }
              }
            } else {
              lg.field_n.field_a = 1;
              if (var3 == 0) {
                pi.field_o = var2;
                lg.field_n.field_b = lg.field_n.field_b + 1;
                if (-3 < (lg.field_n.field_b ^ -1)) {
                  L2: {
                    if (lg.field_n.field_b < 2) {
                      break L2;
                    } else {
                      if ((param1 ^ -1) != -51) {
                        break L2;
                      } else {
                        return 5;
                      }
                    }
                  }
                  if (-5 >= (lg.field_n.field_b ^ -1)) {
                    return 1;
                  } else {
                    return -1;
                  }
                } else {
                  if (51 != param1) {
                    L3: {
                      if (lg.field_n.field_b < 2) {
                        break L3;
                      } else {
                        if ((param1 ^ -1) != -51) {
                          break L3;
                        } else {
                          return 5;
                        }
                      }
                    }
                    if (-5 >= (lg.field_n.field_b ^ -1)) {
                      return 1;
                    } else {
                      return -1;
                    }
                  } else {
                    return 2;
                  }
                }
              } else {
                lg.field_n.field_a = 5;
                pi.field_o = var2;
                lg.field_n.field_b = lg.field_n.field_b + 1;
                if (-3 < (lg.field_n.field_b ^ -1)) {
                  L4: {
                    if (lg.field_n.field_b < 2) {
                      break L4;
                    } else {
                      if ((param1 ^ -1) != -51) {
                        break L4;
                      } else {
                        return 5;
                      }
                    }
                  }
                  if (-5 >= (lg.field_n.field_b ^ -1)) {
                    return 1;
                  } else {
                    return -1;
                  }
                } else {
                  if (51 != param1) {
                    L5: {
                      if (lg.field_n.field_b < 2) {
                        break L5;
                      } else {
                        if ((param1 ^ -1) != -51) {
                          break L5;
                        } else {
                          return 5;
                        }
                      }
                    }
                    if (-5 >= (lg.field_n.field_b ^ -1)) {
                      return 1;
                    } else {
                      return -1;
                    }
                  } else {
                    return 2;
                  }
                }
              }
            }
          } else {
            lg.field_n.field_a = 2;
            if (var3 != 0) {
              if (50 == param1) {
                L6: {
                  lg.field_n.field_a = 5;
                  pi.field_o = var2;
                  lg.field_n.field_b = lg.field_n.field_b + 1;
                  if (-3 < (lg.field_n.field_b ^ -1)) {
                    break L6;
                  } else {
                    if (51 == param1) {
                      return 2;
                    } else {
                      break L6;
                    }
                  }
                }
                L7: {
                  if (lg.field_n.field_b < 2) {
                    break L7;
                  } else {
                    if ((param1 ^ -1) != -51) {
                      break L7;
                    } else {
                      return 5;
                    }
                  }
                }
                if (-5 >= (lg.field_n.field_b ^ -1)) {
                  return 1;
                } else {
                  return -1;
                }
              } else {
                lg.field_n.field_a = 1;
                if (var3 == 0) {
                  pi.field_o = var2;
                  lg.field_n.field_b = lg.field_n.field_b + 1;
                  if (-3 < (lg.field_n.field_b ^ -1)) {
                    L8: {
                      if (lg.field_n.field_b < 2) {
                        break L8;
                      } else {
                        if ((param1 ^ -1) != -51) {
                          break L8;
                        } else {
                          return 5;
                        }
                      }
                    }
                    if (-5 >= (lg.field_n.field_b ^ -1)) {
                      return 1;
                    } else {
                      return -1;
                    }
                  } else {
                    if (51 != param1) {
                      L9: {
                        if (lg.field_n.field_b < 2) {
                          break L9;
                        } else {
                          if ((param1 ^ -1) != -51) {
                            break L9;
                          } else {
                            return 5;
                          }
                        }
                      }
                      if (-5 >= (lg.field_n.field_b ^ -1)) {
                        return 1;
                      } else {
                        return -1;
                      }
                    } else {
                      return 2;
                    }
                  }
                } else {
                  L10: {
                    lg.field_n.field_a = 5;
                    pi.field_o = var2;
                    lg.field_n.field_b = lg.field_n.field_b + 1;
                    if (-3 < (lg.field_n.field_b ^ -1)) {
                      break L10;
                    } else {
                      if (51 == param1) {
                        return 2;
                      } else {
                        break L10;
                      }
                    }
                  }
                  L11: {
                    if (lg.field_n.field_b < 2) {
                      break L11;
                    } else {
                      if ((param1 ^ -1) != -51) {
                        break L11;
                      } else {
                        return 5;
                      }
                    }
                  }
                  if (-5 >= (lg.field_n.field_b ^ -1)) {
                    return 1;
                  } else {
                    return -1;
                  }
                }
              }
            } else {
              pi.field_o = var2;
              lg.field_n.field_b = lg.field_n.field_b + 1;
              if (-3 < (lg.field_n.field_b ^ -1)) {
                L12: {
                  if (lg.field_n.field_b < 2) {
                    break L12;
                  } else {
                    if ((param1 ^ -1) != -51) {
                      break L12;
                    } else {
                      return 5;
                    }
                  }
                }
                if (-5 >= (lg.field_n.field_b ^ -1)) {
                  return 1;
                } else {
                  return -1;
                }
              } else {
                if (51 != param1) {
                  L13: {
                    if (lg.field_n.field_b < 2) {
                      break L13;
                    } else {
                      if ((param1 ^ -1) != -51) {
                        break L13;
                      } else {
                        return 5;
                      }
                    }
                  }
                  if (-5 >= (lg.field_n.field_b ^ -1)) {
                    return 1;
                  } else {
                    return -1;
                  }
                } else {
                  return 2;
                }
              }
            }
          }
        } else {
          field_a = (String) null;
          var2 = oh.field_c;
          oh.field_c = pi.field_o;
          if ((param1 ^ -1) == -52) {
            lg.field_n.field_a = 2;
            if (var3 != 0) {
              L14: {
                if (50 == param1) {
                  lg.field_n.field_a = 5;
                  break L14;
                } else {
                  lg.field_n.field_a = 1;
                  if (var3 == 0) {
                    break L14;
                  } else {
                    lg.field_n.field_a = 5;
                    break L14;
                  }
                }
              }
              pi.field_o = var2;
              lg.field_n.field_b = lg.field_n.field_b + 1;
              if (-3 < (lg.field_n.field_b ^ -1)) {
                L15: {
                  if (lg.field_n.field_b < 2) {
                    break L15;
                  } else {
                    if ((param1 ^ -1) != -51) {
                      break L15;
                    } else {
                      return 5;
                    }
                  }
                }
                if (-5 >= (lg.field_n.field_b ^ -1)) {
                  return 1;
                } else {
                  return -1;
                }
              } else {
                if (51 != param1) {
                  L16: {
                    if (lg.field_n.field_b < 2) {
                      break L16;
                    } else {
                      if ((param1 ^ -1) != -51) {
                        break L16;
                      } else {
                        return 5;
                      }
                    }
                  }
                  if (-5 >= (lg.field_n.field_b ^ -1)) {
                    return 1;
                  } else {
                    return -1;
                  }
                } else {
                  return 2;
                }
              }
            } else {
              L17: {
                pi.field_o = var2;
                lg.field_n.field_b = lg.field_n.field_b + 1;
                if (-3 < (lg.field_n.field_b ^ -1)) {
                  break L17;
                } else {
                  if (51 == param1) {
                    return 2;
                  } else {
                    break L17;
                  }
                }
              }
              L18: {
                if (lg.field_n.field_b < 2) {
                  break L18;
                } else {
                  if ((param1 ^ -1) != -51) {
                    break L18;
                  } else {
                    return 5;
                  }
                }
              }
              if (-5 >= (lg.field_n.field_b ^ -1)) {
                return 1;
              } else {
                return -1;
              }
            }
          } else {
            L19: {
              if (50 == param1) {
                lg.field_n.field_a = 5;
                break L19;
              } else {
                lg.field_n.field_a = 1;
                if (var3 == 0) {
                  break L19;
                } else {
                  lg.field_n.field_a = 5;
                  break L19;
                }
              }
            }
            L20: {
              pi.field_o = var2;
              lg.field_n.field_b = lg.field_n.field_b + 1;
              if (-3 < (lg.field_n.field_b ^ -1)) {
                break L20;
              } else {
                if (51 == param1) {
                  return 2;
                } else {
                  break L20;
                }
              }
            }
            L21: {
              if (lg.field_n.field_b < 2) {
                break L21;
              } else {
                if ((param1 ^ -1) != -51) {
                  break L21;
                } else {
                  return 5;
                }
              }
            }
            if (-5 >= (lg.field_n.field_b ^ -1)) {
              return 1;
            } else {
              return -1;
            }
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_d = null;
        if (param0 != -14955) {
            dh.a(-41);
        }
    }

    static {
        field_b = -1;
        field_a = "Suggested names: ";
        field_d = new cd("usename");
    }
}
