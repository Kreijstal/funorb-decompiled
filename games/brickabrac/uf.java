/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class uf {
    static int field_c;
    static mf field_a;
    static boolean[] field_d;
    static int field_b;
    static jp field_e;

    public static void a(byte param0) {
        field_a = null;
        field_e = null;
        field_d = null;
    }

    final static boolean b(int param0, int param1) {
        int stackIn_24_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_101_0 = 0;
        int stackIn_112_0 = 0;
        int stackIn_125_0 = 0;
        int stackIn_136_0 = 0;
        int stackOut_135_0 = 0;
        int stackOut_124_0 = 0;
        int stackOut_123_0 = 0;
        int stackOut_111_0 = 0;
        int stackOut_100_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_110_0 = 0;
        int stackOut_134_0 = 0;
        int stackOut_85_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_84_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        if (!pe.field_l[82]) {
          if (!pe.field_l[86]) {
            if (param1 < 16) {
              if (param1 < 32) {
                L0: {
                  L1: {
                    if (param1 < 48) {
                      if (param1 < 64) {
                        if (param1 == 80) {
                          break L1;
                        } else {
                          if (param1 == 83) {
                            break L1;
                          } else {
                            if (param1 == 84) {
                              break L1;
                            } else {
                              if (85 == param1) {
                                break L1;
                              } else {
                                if (param1 == 59) {
                                  break L1;
                                } else {
                                  if (74 == param1) {
                                    break L1;
                                  } else {
                                    if (28 != param1) {
                                      stackOut_135_0 = 0;
                                      stackIn_136_0 = stackOut_135_0;
                                      break L0;
                                    } else {
                                      return true;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      } else {
                        if (73 >= param1) {
                          break L1;
                        } else {
                          L2: {
                            L3: {
                              if (param1 == 80) {
                                break L3;
                              } else {
                                if (param1 == 83) {
                                  break L3;
                                } else {
                                  if (param1 == 84) {
                                    break L3;
                                  } else {
                                    if (85 == param1) {
                                      break L3;
                                    } else {
                                      if (param1 == 59) {
                                        break L3;
                                      } else {
                                        if (74 == param1) {
                                          break L3;
                                        } else {
                                          if (28 != param1) {
                                            stackOut_124_0 = 0;
                                            stackIn_125_0 = stackOut_124_0;
                                            break L2;
                                          } else {
                                            return true;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_123_0 = 1;
                            stackIn_125_0 = stackOut_123_0;
                            break L2;
                          }
                          return stackIn_125_0 != 0;
                        }
                      }
                    } else {
                      if (58 >= param1) {
                        break L1;
                      } else {
                        L4: {
                          L5: {
                            if (param1 < 64) {
                              if (param1 == 80) {
                                break L5;
                              } else {
                                if (param1 == 83) {
                                  break L5;
                                } else {
                                  if (param1 == 84) {
                                    break L5;
                                  } else {
                                    if (85 == param1) {
                                      break L5;
                                    } else {
                                      if (param1 == 59) {
                                        break L5;
                                      } else {
                                        if (74 == param1) {
                                          break L5;
                                        } else {
                                          if (28 != param1) {
                                            stackOut_111_0 = 0;
                                            stackIn_112_0 = stackOut_111_0;
                                            break L4;
                                          } else {
                                            return true;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              if (73 >= param1) {
                                break L5;
                              } else {
                                L6: {
                                  L7: {
                                    if (param1 == 80) {
                                      break L7;
                                    } else {
                                      if (param1 == 83) {
                                        break L7;
                                      } else {
                                        if (param1 == 84) {
                                          break L7;
                                        } else {
                                          if (85 == param1) {
                                            break L7;
                                          } else {
                                            if (param1 == 59) {
                                              break L7;
                                            } else {
                                              if (74 == param1) {
                                                break L7;
                                              } else {
                                                if (28 != param1) {
                                                  stackOut_100_0 = 0;
                                                  stackIn_101_0 = stackOut_100_0;
                                                  break L6;
                                                } else {
                                                  return true;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  stackOut_99_0 = 1;
                                  stackIn_101_0 = stackOut_99_0;
                                  break L6;
                                }
                                return stackIn_101_0 != 0;
                              }
                            }
                          }
                          stackOut_110_0 = 1;
                          stackIn_112_0 = stackOut_110_0;
                          break L4;
                        }
                        return stackIn_112_0 != 0;
                      }
                    }
                  }
                  stackOut_134_0 = 1;
                  stackIn_136_0 = stackOut_134_0;
                  break L0;
                }
                return stackIn_136_0 != 0;
              } else {
                if (param1 > 43) {
                  if (param1 < 48) {
                    L8: {
                      L9: {
                        if (param1 < 64) {
                          if (param1 == 80) {
                            break L9;
                          } else {
                            if (param1 == 83) {
                              break L9;
                            } else {
                              if (param1 == 84) {
                                break L9;
                              } else {
                                if (85 == param1) {
                                  break L9;
                                } else {
                                  if (param1 == 59) {
                                    break L9;
                                  } else {
                                    if (74 == param1) {
                                      break L9;
                                    } else {
                                      if (28 != param1) {
                                        stackOut_85_0 = 0;
                                        stackIn_86_0 = stackOut_85_0;
                                        break L8;
                                      } else {
                                        return true;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          if (73 >= param1) {
                            break L9;
                          } else {
                            L10: {
                              L11: {
                                if (param1 == 80) {
                                  break L11;
                                } else {
                                  if (param1 == 83) {
                                    break L11;
                                  } else {
                                    if (param1 == 84) {
                                      break L11;
                                    } else {
                                      if (85 == param1) {
                                        break L11;
                                      } else {
                                        if (param1 == 59) {
                                          break L11;
                                        } else {
                                          if (74 == param1) {
                                            break L11;
                                          } else {
                                            if (28 != param1) {
                                              stackOut_74_0 = 0;
                                              stackIn_75_0 = stackOut_74_0;
                                              break L10;
                                            } else {
                                              return true;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              stackOut_73_0 = 1;
                              stackIn_75_0 = stackOut_73_0;
                              break L10;
                            }
                            return stackIn_75_0 != 0;
                          }
                        }
                      }
                      stackOut_84_0 = 1;
                      stackIn_86_0 = stackOut_84_0;
                      break L8;
                    }
                    return stackIn_86_0 != 0;
                  } else {
                    if (58 < param1) {
                      L12: {
                        L13: {
                          L14: {
                            if (param1 < 64) {
                              break L14;
                            } else {
                              if (73 >= param1) {
                                break L13;
                              } else {
                                break L14;
                              }
                            }
                          }
                          if (param1 == 80) {
                            break L13;
                          } else {
                            if (param1 == 83) {
                              break L13;
                            } else {
                              if (param1 == 84) {
                                break L13;
                              } else {
                                if (85 == param1) {
                                  break L13;
                                } else {
                                  if (param1 == 59) {
                                    break L13;
                                  } else {
                                    if (74 == param1) {
                                      break L13;
                                    } else {
                                      if (28 != param1) {
                                        stackOut_61_0 = 0;
                                        stackIn_62_0 = stackOut_61_0;
                                        break L12;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        stackOut_60_0 = 1;
                        stackIn_62_0 = stackOut_60_0;
                        break L12;
                      }
                      return stackIn_62_0 != 0;
                    } else {
                      return true;
                    }
                  }
                } else {
                  return true;
                }
              }
            } else {
              if (param1 > 27) {
                if (param1 >= 32) {
                  L15: {
                    L16: {
                      if (param1 <= 43) {
                        break L16;
                      } else {
                        L17: {
                          if (param1 < 48) {
                            break L17;
                          } else {
                            if (58 >= param1) {
                              break L16;
                            } else {
                              break L17;
                            }
                          }
                        }
                        L18: {
                          if (param1 < 64) {
                            break L18;
                          } else {
                            if (73 >= param1) {
                              break L16;
                            } else {
                              break L18;
                            }
                          }
                        }
                        if (param1 == 80) {
                          break L16;
                        } else {
                          if (param1 == 83) {
                            break L16;
                          } else {
                            if (param1 == 84) {
                              break L16;
                            } else {
                              if (85 == param1) {
                                break L16;
                              } else {
                                if (param1 == 59) {
                                  break L16;
                                } else {
                                  if (74 == param1) {
                                    break L16;
                                  } else {
                                    if (28 != param1) {
                                      stackOut_41_0 = 0;
                                      stackIn_42_0 = stackOut_41_0;
                                      break L15;
                                    } else {
                                      break L16;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    stackOut_40_0 = 1;
                    stackIn_42_0 = stackOut_40_0;
                    break L15;
                  }
                  return stackIn_42_0 != 0;
                } else {
                  L19: {
                    L20: {
                      L21: {
                        if (param1 < 48) {
                          break L21;
                        } else {
                          if (58 >= param1) {
                            break L20;
                          } else {
                            break L21;
                          }
                        }
                      }
                      L22: {
                        if (param1 < 64) {
                          break L22;
                        } else {
                          if (73 >= param1) {
                            break L20;
                          } else {
                            break L22;
                          }
                        }
                      }
                      if (param1 == 80) {
                        break L20;
                      } else {
                        if (param1 == 83) {
                          break L20;
                        } else {
                          if (param1 == 84) {
                            break L20;
                          } else {
                            if (85 == param1) {
                              break L20;
                            } else {
                              if (param1 == 59) {
                                break L20;
                              } else {
                                if (74 == param1) {
                                  break L20;
                                } else {
                                  if (28 != param1) {
                                    stackOut_23_0 = 0;
                                    stackIn_24_0 = stackOut_23_0;
                                    break L19;
                                  } else {
                                    break L20;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    stackOut_22_0 = 1;
                    stackIn_24_0 = stackOut_22_0;
                    break L19;
                  }
                  return stackIn_24_0 != 0;
                }
              } else {
                return true;
              }
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final static void a(int param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= param0) {
                break L0;
              } else {
                vq.a(5 + ip.field_r.a(-37880252, 2), 1273378209, ip.field_r.a(-37880252, 3) + 9);
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var2, "uf.D(" + param0 + ',' + 0 + ')');
        }
    }

    final static String a(String param0, int param1, String param2, int param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        pi var6 = null;
        int var7 = 0;
        mp var8 = null;
        CharSequence var9 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        String stackIn_9_0 = null;
        Object stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_5_0 = null;
        Object stackOut_10_0 = null;
        String stackOut_8_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            var9 = (CharSequence) (Object) param0;
            if (tk.a(var9, false)) {
              if (2 != wk.field_m) {
                stackOut_5_0 = hd.field_b;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              } else {
                var8 = jf.a(0, param2);
                var5 = 42 / ((15 - param3) / 34);
                if (var8 != null) {
                  var8.b((byte) 111);
                  var8.d(3);
                  fo.field_h = fo.field_h - 1;
                  var6 = k.field_h;
                  var6.e(-13413, param1);
                  var6.field_l = var6.field_l + 1;
                  var7 = var6.field_l;
                  var6.a(16, 3);
                  var6.a(param0, -1);
                  var6.d((byte) 117, -var7 + var6.field_l);
                  stackOut_10_0 = null;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  stackOut_8_0 = rd.a(to.field_h, new String[1], (byte) 103);
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                }
              }
            } else {
              stackOut_1_0 = om.field_Xb;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("uf.C(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L1;
            }
          }
          L2: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param1).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L2;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L2;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param3 + ')');
        }
        return (String) (Object) stackIn_11_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new boolean[64];
    }
}
