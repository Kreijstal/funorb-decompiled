/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wh {
    private fg field_d;
    static String field_i;
    private di field_h;
    static sj field_c;
    static int field_b;
    static int field_f;
    static int[] field_j;
    static di field_a;
    static int field_g;
    private di field_e;

    final static int a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        if (0 != param6) {
          var11 = lh.a(param6, (byte) -86, (long)((param4 << 16) + param1 - param3));
          var12 = lh.a(param6, (byte) -121, (long)(-(param4 << 16) + param1 - param3));
          if (param9 >= 14) {
            if (var11 > 0) {
              if (65536 - param2 >= var11) {
                if (var12 > var11) {
                  L0: {
                    var10 = param7 - -aj.a(var11, false, param8);
                    if (param0 <= param5) {
                      if (param0 > var10) {
                        break L0;
                      } else {
                        if (param5 >= var10) {
                          return param2 + var11;
                        } else {
                          L1: {
                            if (var12 <= 0) {
                              break L1;
                            } else {
                              if (-param2 + 65536 < var12) {
                                break L1;
                              } else {
                                var10 = aj.a(var12, false, param8) + param7;
                                if (param5 < param0) {
                                  if (param5 > var10) {
                                    break L1;
                                  } else {
                                    if (param0 < var10) {
                                      break L1;
                                    } else {
                                      return param2 + var12;
                                    }
                                  }
                                } else {
                                  if (var10 < param0) {
                                    break L1;
                                  } else {
                                    if (param5 < var10) {
                                      break L1;
                                    } else {
                                      return param2 + var12;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          return -1;
                        }
                      }
                    } else {
                      if (param5 > var10) {
                        break L0;
                      } else {
                        if (var10 > param0) {
                          break L0;
                        } else {
                          return param2 + var11;
                        }
                      }
                    }
                  }
                  L2: {
                    if (var12 <= 0) {
                      break L2;
                    } else {
                      if (-param2 + 65536 < var12) {
                        break L2;
                      } else {
                        var10 = aj.a(var12, false, param8) + param7;
                        if (param5 < param0) {
                          if (param5 > var10) {
                            break L2;
                          } else {
                            if (param0 < var10) {
                              break L2;
                            } else {
                              return param2 + var12;
                            }
                          }
                        } else {
                          if (var10 < param0) {
                            break L2;
                          } else {
                            if (param5 < var10) {
                              break L2;
                            } else {
                              return param2 + var12;
                            }
                          }
                        }
                      }
                    }
                  }
                  return -1;
                } else {
                  if (var12 > 0) {
                    if (-param2 + 65536 >= var12) {
                      L3: {
                        var10 = aj.a(var12, false, param8) + param7;
                        if (param5 < param0) {
                          if (param5 > var10) {
                            break L3;
                          } else {
                            if (param0 < var10) {
                              break L3;
                            } else {
                              return param2 + var12;
                            }
                          }
                        } else {
                          if (var10 < param0) {
                            break L3;
                          } else {
                            if (param5 < var10) {
                              break L3;
                            } else {
                              return param2 + var12;
                            }
                          }
                        }
                      }
                      return -1;
                    } else {
                      return -1;
                    }
                  } else {
                    return -1;
                  }
                }
              } else {
                L4: {
                  if (var12 <= 0) {
                    break L4;
                  } else {
                    if (-param2 + 65536 < var12) {
                      break L4;
                    } else {
                      var10 = aj.a(var12, false, param8) + param7;
                      if (param5 < param0) {
                        if (param5 > var10) {
                          break L4;
                        } else {
                          if (param0 < var10) {
                            break L4;
                          } else {
                            return param2 + var12;
                          }
                        }
                      } else {
                        if (var10 < param0) {
                          break L4;
                        } else {
                          if (param5 < var10) {
                            break L4;
                          } else {
                            return param2 + var12;
                          }
                        }
                      }
                    }
                  }
                }
                return -1;
              }
            } else {
              L5: {
                if (var12 <= 0) {
                  break L5;
                } else {
                  if (-param2 + 65536 < var12) {
                    break L5;
                  } else {
                    var10 = aj.a(var12, false, param8) + param7;
                    if (param5 < param0) {
                      if (param5 > var10) {
                        break L5;
                      } else {
                        if (param0 < var10) {
                          break L5;
                        } else {
                          return param2 + var12;
                        }
                      }
                    } else {
                      if (var10 < param0) {
                        break L5;
                      } else {
                        if (param5 < var10) {
                          break L5;
                        } else {
                          return param2 + var12;
                        }
                      }
                    }
                  }
                }
              }
              return -1;
            }
          } else {
            int discarded$1 = wh.a(112, 24, -32, -89, -126, -39, -3, 91, -69, 50);
            if (var11 > 0) {
              if (65536 - param2 >= var11) {
                L6: {
                  if (var12 > var11) {
                    L7: {
                      var10 = param7 - -aj.a(var11, false, param8);
                      if (param0 <= param5) {
                        if (param0 > var10) {
                          break L6;
                        } else {
                          if (param5 >= var10) {
                            break L7;
                          } else {
                            break L6;
                          }
                        }
                      } else {
                        if (param5 > var10) {
                          break L6;
                        } else {
                          if (var10 > param0) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                    return param2 + var11;
                  } else {
                    break L6;
                  }
                }
                if (var12 > 0) {
                  if (-param2 + 65536 >= var12) {
                    var10 = aj.a(var12, false, param8) + param7;
                    if (param5 < param0) {
                      if (param5 <= var10) {
                        if (param0 >= var10) {
                          return param2 + var12;
                        } else {
                          return -1;
                        }
                      } else {
                        return -1;
                      }
                    } else {
                      if (var10 >= param0) {
                        if (param5 >= var10) {
                          return param2 + var12;
                        } else {
                          return -1;
                        }
                      } else {
                        return -1;
                      }
                    }
                  } else {
                    return -1;
                  }
                } else {
                  return -1;
                }
              } else {
                if (var12 > 0) {
                  if (-param2 + 65536 >= var12) {
                    var10 = aj.a(var12, false, param8) + param7;
                    if (param5 < param0) {
                      if (param5 <= var10) {
                        if (param0 < var10) {
                          return -1;
                        } else {
                          return param2 + var12;
                        }
                      } else {
                        return -1;
                      }
                    } else {
                      if (var10 >= param0) {
                        if (param5 < var10) {
                          return -1;
                        } else {
                          return param2 + var12;
                        }
                      } else {
                        return -1;
                      }
                    }
                  } else {
                    return -1;
                  }
                } else {
                  return -1;
                }
              }
            } else {
              if (var12 > 0) {
                if (-param2 + 65536 >= var12) {
                  var10 = aj.a(var12, false, param8) + param7;
                  if (param5 < param0) {
                    if (param5 <= var10) {
                      if (param0 >= var10) {
                        return param2 + var12;
                      } else {
                        return -1;
                      }
                    } else {
                      return -1;
                    }
                  } else {
                    if (var10 >= param0) {
                      if (param5 >= var10) {
                        return param2 + var12;
                      } else {
                        return -1;
                      }
                    } else {
                      return -1;
                    }
                  }
                } else {
                  return -1;
                }
              } else {
                return -1;
              }
            }
          }
        } else {
          return -1;
        }
    }

    final ap a(int param0, int param1) {
        ap var3 = null;
        byte[] var4 = null;
        ap var5 = null;
        ap var6 = null;
        ap var7 = null;
        if (param0 > 125) {
          var3 = (ap) ((wh) this).field_d.a((long)param1, true);
          if (var3 != null) {
            return var3;
          } else {
            L0: {
              if (param1 >= 32768) {
                var4 = ((wh) this).field_h.a(96, param1 & 32767, 1);
                break L0;
              } else {
                var4 = ((wh) this).field_e.a(83, param1, 1);
                break L0;
              }
            }
            var7 = new ap();
            if (var4 == null) {
              if (param1 >= 32768) {
                var7.b(true);
                ((wh) this).field_d.a(90, (Object) (Object) var7, (long)param1);
                return var7;
              } else {
                ((wh) this).field_d.a(90, (Object) (Object) var7, (long)param1);
                return var7;
              }
            } else {
              var7.a(-20678, new ge(var4));
              if (param1 >= 32768) {
                var7.b(true);
                ((wh) this).field_d.a(90, (Object) (Object) var7, (long)param1);
                return var7;
              } else {
                ((wh) this).field_d.a(90, (Object) (Object) var7, (long)param1);
                return var7;
              }
            }
          }
        } else {
          int discarded$1 = wh.a(54, 63, 5, -67, 84, -31, 70, -27, -99, 108);
          var3 = (ap) ((wh) this).field_d.a((long)param1, true);
          if (var3 != null) {
            return var3;
          } else {
            L1: {
              if (param1 >= 32768) {
                var4 = ((wh) this).field_h.a(96, param1 & 32767, 1);
                break L1;
              } else {
                var4 = ((wh) this).field_e.a(83, param1, 1);
                break L1;
              }
            }
            var6 = new ap();
            var5 = var6;
            if (var4 != null) {
              var6.a(-20678, new ge(var4));
              if (param1 < 32768) {
                ((wh) this).field_d.a(90, (Object) (Object) var6, (long)param1);
                return var6;
              } else {
                var6.b(true);
                ((wh) this).field_d.a(90, (Object) (Object) var6, (long)param1);
                return var6;
              }
            } else {
              if (param1 >= 32768) {
                var6.b(true);
                ((wh) this).field_d.a(90, (Object) (Object) var6, (long)param1);
                return var6;
              } else {
                ((wh) this).field_d.a(90, (Object) (Object) var6, (long)param1);
                return var6;
              }
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4) {
        int var5 = 35 / ((-27 - param3) / 38);
        uc.a((byte) -106);
        qh.d(param0, param1, param2, param4);
    }

    public static void a() {
        field_c = null;
        field_a = null;
        field_i = null;
        field_j = null;
    }

    wh(int param0, di param1, di param2, si param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        ((wh) this).field_d = new fg(64);
        try {
          L0: {
            L1: {
              ((wh) this).field_e = param1;
              ((wh) this).field_h = param2;
              if (((wh) this).field_e == null) {
                break L1;
              } else {
                int discarded$4 = ((wh) this).field_e.a(false, 1);
                break L1;
              }
            }
            L2: {
              if (((wh) this).field_h == null) {
                break L2;
              } else {
                int discarded$5 = ((wh) this).field_h.a(false, 1);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("wh.<init>(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          L4: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          L5: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_g = 0;
    }
}
