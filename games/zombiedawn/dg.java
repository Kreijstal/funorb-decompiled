/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class dg extends IOException {
    static boolean field_a;
    static boolean field_b;

    dg(String param0) {
        super(param0);
    }

    final static boolean a(byte param0, int param1) {
        int var2 = 0;
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
        var2 = 0;
        if (!bo.field_p[82]) {
          if (!bo.field_p[86]) {
            if (16 > param1) {
              if (32 > param1) {
                L0: {
                  L1: {
                    if (param1 < 48) {
                      if (param1 < 64) {
                        if (param1 == 80) {
                          break L1;
                        } else {
                          if (83 == param1) {
                            break L1;
                          } else {
                            if (param1 == 84) {
                              break L1;
                            } else {
                              if (param1 == 85) {
                                break L1;
                              } else {
                                if (59 == param1) {
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
                        if (param1 <= 73) {
                          break L1;
                        } else {
                          L2: {
                            L3: {
                              if (param1 == 80) {
                                break L3;
                              } else {
                                if (83 == param1) {
                                  break L3;
                                } else {
                                  if (param1 == 84) {
                                    break L3;
                                  } else {
                                    if (param1 == 85) {
                                      break L3;
                                    } else {
                                      if (59 == param1) {
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
                      if (param1 <= 58) {
                        break L1;
                      } else {
                        L4: {
                          L5: {
                            if (param1 < 64) {
                              if (param1 == 80) {
                                break L5;
                              } else {
                                if (83 == param1) {
                                  break L5;
                                } else {
                                  if (param1 == 84) {
                                    break L5;
                                  } else {
                                    if (param1 == 85) {
                                      break L5;
                                    } else {
                                      if (59 == param1) {
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
                              if (param1 <= 73) {
                                break L5;
                              } else {
                                L6: {
                                  L7: {
                                    if (param1 == 80) {
                                      break L7;
                                    } else {
                                      if (83 == param1) {
                                        break L7;
                                      } else {
                                        if (param1 == 84) {
                                          break L7;
                                        } else {
                                          if (param1 == 85) {
                                            break L7;
                                          } else {
                                            if (59 == param1) {
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
                            if (83 == param1) {
                              break L9;
                            } else {
                              if (param1 == 84) {
                                break L9;
                              } else {
                                if (param1 == 85) {
                                  break L9;
                                } else {
                                  if (59 == param1) {
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
                          if (param1 <= 73) {
                            break L9;
                          } else {
                            L10: {
                              L11: {
                                if (param1 == 80) {
                                  break L11;
                                } else {
                                  if (83 == param1) {
                                    break L11;
                                  } else {
                                    if (param1 == 84) {
                                      break L11;
                                    } else {
                                      if (param1 == 85) {
                                        break L11;
                                      } else {
                                        if (59 == param1) {
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
                    if (param1 > 58) {
                      L12: {
                        L13: {
                          L14: {
                            if (param1 < 64) {
                              break L14;
                            } else {
                              if (param1 <= 73) {
                                break L13;
                              } else {
                                break L14;
                              }
                            }
                          }
                          if (param1 == 80) {
                            break L13;
                          } else {
                            if (83 == param1) {
                              break L13;
                            } else {
                              if (param1 == 84) {
                                break L13;
                              } else {
                                if (param1 == 85) {
                                  break L13;
                                } else {
                                  if (59 == param1) {
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
              if (27 < param1) {
                if (32 <= param1) {
                  L15: {
                    L16: {
                      if (param1 <= 43) {
                        break L16;
                      } else {
                        L17: {
                          if (param1 < 48) {
                            break L17;
                          } else {
                            if (param1 <= 58) {
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
                            if (param1 <= 73) {
                              break L16;
                            } else {
                              break L18;
                            }
                          }
                        }
                        if (param1 == 80) {
                          break L16;
                        } else {
                          if (83 == param1) {
                            break L16;
                          } else {
                            if (param1 == 84) {
                              break L16;
                            } else {
                              if (param1 == 85) {
                                break L16;
                              } else {
                                if (59 == param1) {
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
                          if (param1 <= 58) {
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
                          if (param1 <= 73) {
                            break L20;
                          } else {
                            break L22;
                          }
                        }
                      }
                      if (param1 == 80) {
                        break L20;
                      } else {
                        if (83 == param1) {
                          break L20;
                        } else {
                          if (param1 == 84) {
                            break L20;
                          } else {
                            if (param1 == 85) {
                              break L20;
                            } else {
                              if (59 == param1) {
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

    final static boolean a(am param0, boolean param1) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param0.k(111, 1) != 1) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("dg.B(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + false + ')');
        }
        return stackIn_5_0 != 0;
    }

    final static void a(java.awt.Canvas param0, int param1, boolean param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var4 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              if (ld.field_j < 10) {
                L2: {
                  var3_int = 0;
                  if (nd.field_b) {
                    nd.field_b = false;
                    var3_int = 1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                ja.a(jb.a((byte) -58), ud.field_c, var3_int != 0, dp.a(-103), (byte) -90);
                break L1;
              } else {
                if (!kk.a(-251)) {
                  bi.d();
                  dp.a(320, -12138, 240);
                  uh.a(40, 0, 0, param0);
                  break L1;
                } else {
                  if (fl.field_a == 0) {
                    uo.a(false, -28518, param2);
                    uh.a(-120, 0, 0, param0);
                    break L1;
                  } else {
                    am.a(param0, (byte) -94);
                    break L1;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("dg.D(");
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
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + 0 + ',' + param2 + ')');
        }
    }

    final static int a(byte param0) {
        return nl.field_s;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = false;
    }
}
