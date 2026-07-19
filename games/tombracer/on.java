/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class on {
    private boolean field_c;
    private boolean field_a;
    static mr field_b;

    final void a(byte param0) {
        this.field_a = true;
        int var2 = -27 / ((55 - param0) / 56);
    }

    final boolean b(int param0) {
        boolean discarded$0 = false;
        if (param0 != -59) {
            discarded$0 = this.b(-10);
            return this.field_c;
        }
        return this.field_c;
    }

    public static void d(int param0) {
        if (param0 != 32) {
            return;
        }
        field_b = null;
    }

    final void c(int param0) {
        this.field_a = true;
        if (param0 > -18) {
            return;
        }
        this.field_c = true;
    }

    final static ha a(java.awt.Canvas param0, d param1, int param2, byte param3) {
        RuntimeException var4 = null;
        ha stackIn_2_0 = null;
        cka stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        cka stackOut_3_0 = null;
        ha stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param3 < -76) {
              stackOut_3_0 = new cka(param0, param1, param2);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (ha) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var4);
            stackOut_5_1 = new StringBuilder().append("on.E(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return (ha) ((Object) stackIn_4_0);
        }
    }

    final void a(int param0) {
        if (param0 != 86) {
            return;
        }
        if (!this.field_a) {
            this.field_c = false;
            this.field_a = false;
            return;
        }
        this.field_a = false;
    }

    final void b(byte param0) {
        this.field_a = false;
        this.field_c = false;
        if (param0 != 93) {
            this.field_a = true;
        }
    }

    final static String a(CharSequence param0, byte param1, boolean param2) {
        ha discarded$2 = null;
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        d var6 = null;
        String stackIn_3_0 = null;
        String stackIn_12_0 = null;
        Object stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_11_0 = null;
        Object stackOut_14_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var3 = mpa.a(-73, param2, param0);
            if (var3 == null) {
              L1: {
                if (param1 <= -37) {
                  break L1;
                } else {
                  var6 = (d) null;
                  discarded$2 = on.a((java.awt.Canvas) null, (d) null, 122, (byte) 69);
                  break L1;
                }
              }
              var4 = 0;
              L2: while (true) {
                if (var4 < param0.length()) {
                  if (!fqa.a(false, param0.charAt(var4))) {
                    stackOut_11_0 = jra.field_b;
                    stackIn_12_0 = stackOut_11_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var4++;
                    if (var5 == 0) {
                      continue L2;
                    } else {
                      stackOut_14_0 = null;
                      stackIn_15_0 = stackOut_14_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                } else {
                  return null;
                }
              }
            } else {
              stackOut_2_0 = (String) (var3);
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var3_ref);
            stackOut_16_1 = new StringBuilder().append("on.I(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0;
          } else {
            return (String) ((Object) stackIn_15_0);
          }
        }
    }

    final static boolean a(byte param0, int param1) {
        int stackIn_25_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_98_0 = 0;
        int stackIn_104_0 = 0;
        int stackIn_115_0 = 0;
        int stackIn_120_0 = 0;
        int stackIn_124_0 = 0;
        int stackIn_128_0 = 0;
        int stackIn_132_0 = 0;
        int stackIn_136_0 = 0;
        int stackIn_140_0 = 0;
        int stackIn_149_0 = 0;
        int stackIn_154_0 = 0;
        int stackIn_158_0 = 0;
        int stackIn_168_0 = 0;
        int stackIn_179_0 = 0;
        int stackIn_192_0 = 0;
        int stackIn_203_0 = 0;
        int stackOut_202_0 = 0;
        int stackOut_191_0 = 0;
        int stackOut_190_0 = 0;
        int stackOut_201_0 = 0;
        int stackOut_178_0 = 0;
        int stackOut_177_0 = 0;
        int stackOut_167_0 = 0;
        int stackOut_166_0 = 0;
        int stackOut_156_0 = 0;
        int stackOut_152_0 = 0;
        int stackOut_147_0 = 0;
        int stackOut_138_0 = 0;
        int stackOut_134_0 = 0;
        int stackOut_130_0 = 0;
        int stackOut_126_0 = 0;
        int stackOut_122_0 = 0;
        int stackOut_118_0 = 0;
        int stackOut_114_0 = 0;
        int stackOut_113_0 = 0;
        int stackOut_102_0 = 0;
        int stackOut_97_0 = 0;
        int stackOut_96_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        if (param0 == 15) {
          if (!oj.field_tb[82]) {
            if (!oj.field_tb[86]) {
              if ((param1 ^ -1) > -17) {
                if (param1 < 32) {
                  if (-49 < (param1 ^ -1)) {
                    L0: {
                      L1: {
                        if (64 > param1) {
                          if (-81 == (param1 ^ -1)) {
                            break L1;
                          } else {
                            if (param1 == 83) {
                              break L1;
                            } else {
                              if (-85 == (param1 ^ -1)) {
                                break L1;
                              } else {
                                if ((param1 ^ -1) == -86) {
                                  break L1;
                                } else {
                                  if ((param1 ^ -1) == -60) {
                                    break L1;
                                  } else {
                                    if ((param1 ^ -1) == -75) {
                                      break L1;
                                    } else {
                                      if ((param1 ^ -1) != -29) {
                                        stackOut_202_0 = 0;
                                        stackIn_203_0 = stackOut_202_0;
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
                                if (-81 == (param1 ^ -1)) {
                                  break L3;
                                } else {
                                  if (param1 == 83) {
                                    break L3;
                                  } else {
                                    if (-85 == (param1 ^ -1)) {
                                      break L3;
                                    } else {
                                      if ((param1 ^ -1) == -86) {
                                        break L3;
                                      } else {
                                        if ((param1 ^ -1) == -60) {
                                          break L3;
                                        } else {
                                          if ((param1 ^ -1) == -75) {
                                            break L3;
                                          } else {
                                            if ((param1 ^ -1) != -29) {
                                              stackOut_191_0 = 0;
                                              stackIn_192_0 = stackOut_191_0;
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
                              stackOut_190_0 = 1;
                              stackIn_192_0 = stackOut_190_0;
                              break L2;
                            }
                            return stackIn_192_0 != 0;
                          }
                        }
                      }
                      stackOut_201_0 = 1;
                      stackIn_203_0 = stackOut_201_0;
                      break L0;
                    }
                    return stackIn_203_0 != 0;
                  } else {
                    if (-59 > (param1 ^ -1)) {
                      if (64 > param1) {
                        L4: {
                          L5: {
                            if (-81 == (param1 ^ -1)) {
                              break L5;
                            } else {
                              if (param1 == 83) {
                                break L5;
                              } else {
                                if (-85 == (param1 ^ -1)) {
                                  break L5;
                                } else {
                                  if ((param1 ^ -1) == -86) {
                                    break L5;
                                  } else {
                                    if ((param1 ^ -1) == -60) {
                                      break L5;
                                    } else {
                                      if ((param1 ^ -1) == -75) {
                                        break L5;
                                      } else {
                                        if ((param1 ^ -1) != -29) {
                                          stackOut_178_0 = 0;
                                          stackIn_179_0 = stackOut_178_0;
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
                          }
                          stackOut_177_0 = 1;
                          stackIn_179_0 = stackOut_177_0;
                          break L4;
                        }
                        return stackIn_179_0 != 0;
                      } else {
                        if (73 < param1) {
                          if (-81 != (param1 ^ -1)) {
                            L6: {
                              L7: {
                                if (param1 == 83) {
                                  break L7;
                                } else {
                                  if (-85 == (param1 ^ -1)) {
                                    break L7;
                                  } else {
                                    if ((param1 ^ -1) == -86) {
                                      break L7;
                                    } else {
                                      if ((param1 ^ -1) == -60) {
                                        break L7;
                                      } else {
                                        if ((param1 ^ -1) == -75) {
                                          break L7;
                                        } else {
                                          if ((param1 ^ -1) != -29) {
                                            stackOut_167_0 = 0;
                                            stackIn_168_0 = stackOut_167_0;
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
                              stackOut_166_0 = 1;
                              stackIn_168_0 = stackOut_166_0;
                              break L6;
                            }
                            return stackIn_168_0 != 0;
                          } else {
                            stackOut_156_0 = 1;
                            stackIn_158_0 = stackOut_156_0;
                            return stackIn_158_0 != 0;
                          }
                        } else {
                          stackOut_152_0 = 1;
                          stackIn_154_0 = stackOut_152_0;
                          return stackIn_154_0 != 0;
                        }
                      }
                    } else {
                      stackOut_147_0 = 1;
                      stackIn_149_0 = stackOut_147_0;
                      return stackIn_149_0 != 0;
                    }
                  }
                } else {
                  if (-44 > (param1 ^ -1)) {
                    if (-49 < (param1 ^ -1)) {
                      if (64 > param1) {
                        if (-81 != (param1 ^ -1)) {
                          if (param1 != 83) {
                            if (-85 != (param1 ^ -1)) {
                              if ((param1 ^ -1) != -86) {
                                if ((param1 ^ -1) != -60) {
                                  if ((param1 ^ -1) != -75) {
                                    if ((param1 ^ -1) == -29) {
                                      return true;
                                    } else {
                                      return false;
                                    }
                                  } else {
                                    stackOut_138_0 = 1;
                                    stackIn_140_0 = stackOut_138_0;
                                    return stackIn_140_0 != 0;
                                  }
                                } else {
                                  stackOut_134_0 = 1;
                                  stackIn_136_0 = stackOut_134_0;
                                  return stackIn_136_0 != 0;
                                }
                              } else {
                                stackOut_130_0 = 1;
                                stackIn_132_0 = stackOut_130_0;
                                return stackIn_132_0 != 0;
                              }
                            } else {
                              stackOut_126_0 = 1;
                              stackIn_128_0 = stackOut_126_0;
                              return stackIn_128_0 != 0;
                            }
                          } else {
                            stackOut_122_0 = 1;
                            stackIn_124_0 = stackOut_122_0;
                            return stackIn_124_0 != 0;
                          }
                        } else {
                          stackOut_118_0 = 1;
                          stackIn_120_0 = stackOut_118_0;
                          return stackIn_120_0 != 0;
                        }
                      } else {
                        if (73 < param1) {
                          L8: {
                            L9: {
                              if (-81 == (param1 ^ -1)) {
                                break L9;
                              } else {
                                if (param1 == 83) {
                                  break L9;
                                } else {
                                  if (-85 == (param1 ^ -1)) {
                                    break L9;
                                  } else {
                                    if ((param1 ^ -1) == -86) {
                                      break L9;
                                    } else {
                                      if ((param1 ^ -1) == -60) {
                                        break L9;
                                      } else {
                                        if ((param1 ^ -1) == -75) {
                                          break L9;
                                        } else {
                                          if ((param1 ^ -1) != -29) {
                                            stackOut_114_0 = 0;
                                            stackIn_115_0 = stackOut_114_0;
                                            break L8;
                                          } else {
                                            break L9;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_113_0 = 1;
                            stackIn_115_0 = stackOut_113_0;
                            break L8;
                          }
                          return stackIn_115_0 != 0;
                        } else {
                          stackOut_102_0 = 1;
                          stackIn_104_0 = stackOut_102_0;
                          return stackIn_104_0 != 0;
                        }
                      }
                    } else {
                      if (-59 > (param1 ^ -1)) {
                        L10: {
                          L11: {
                            L12: {
                              if (64 > param1) {
                                break L12;
                              } else {
                                if (73 >= param1) {
                                  break L11;
                                } else {
                                  break L12;
                                }
                              }
                            }
                            if (-81 == (param1 ^ -1)) {
                              break L11;
                            } else {
                              if (param1 == 83) {
                                break L11;
                              } else {
                                if (-85 == (param1 ^ -1)) {
                                  break L11;
                                } else {
                                  if ((param1 ^ -1) == -86) {
                                    break L11;
                                  } else {
                                    if ((param1 ^ -1) == -60) {
                                      break L11;
                                    } else {
                                      if ((param1 ^ -1) == -75) {
                                        break L11;
                                      } else {
                                        if ((param1 ^ -1) != -29) {
                                          stackOut_97_0 = 0;
                                          stackIn_98_0 = stackOut_97_0;
                                          break L10;
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          stackOut_96_0 = 1;
                          stackIn_98_0 = stackOut_96_0;
                          break L10;
                        }
                        return stackIn_98_0 != 0;
                      } else {
                        stackOut_82_0 = 1;
                        stackIn_84_0 = stackOut_82_0;
                        return stackIn_84_0 != 0;
                      }
                    }
                  } else {
                    return true;
                  }
                }
              } else {
                if (27 >= param1) {
                  return true;
                } else {
                  L13: {
                    L14: {
                      L15: {
                        if (param1 < 32) {
                          break L15;
                        } else {
                          if (-44 <= (param1 ^ -1)) {
                            break L14;
                          } else {
                            break L15;
                          }
                        }
                      }
                      L16: {
                        if (-49 < (param1 ^ -1)) {
                          break L16;
                        } else {
                          if (-59 <= (param1 ^ -1)) {
                            break L14;
                          } else {
                            break L16;
                          }
                        }
                      }
                      L17: {
                        if (64 > param1) {
                          break L17;
                        } else {
                          if (73 >= param1) {
                            break L14;
                          } else {
                            break L17;
                          }
                        }
                      }
                      if (-81 == (param1 ^ -1)) {
                        break L14;
                      } else {
                        if (param1 == 83) {
                          break L14;
                        } else {
                          if (-85 == (param1 ^ -1)) {
                            break L14;
                          } else {
                            if ((param1 ^ -1) == -86) {
                              break L14;
                            } else {
                              if ((param1 ^ -1) == -60) {
                                break L14;
                              } else {
                                if ((param1 ^ -1) == -75) {
                                  break L14;
                                } else {
                                  if ((param1 ^ -1) != -29) {
                                    stackOut_73_0 = 0;
                                    stackIn_74_0 = stackOut_73_0;
                                    break L13;
                                  } else {
                                    break L14;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    stackOut_72_0 = 1;
                    stackIn_74_0 = stackOut_72_0;
                    break L13;
                  }
                  return stackIn_74_0 != 0;
                }
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          on.d(119);
          if (!oj.field_tb[82]) {
            if (!oj.field_tb[86]) {
              if ((param1 ^ -1) <= -17) {
                if (27 >= param1) {
                  return true;
                } else {
                  L18: {
                    L19: {
                      L20: {
                        if (param1 < 32) {
                          break L20;
                        } else {
                          if (-44 <= (param1 ^ -1)) {
                            break L19;
                          } else {
                            break L20;
                          }
                        }
                      }
                      L21: {
                        if (-49 < (param1 ^ -1)) {
                          break L21;
                        } else {
                          if (-59 <= (param1 ^ -1)) {
                            break L19;
                          } else {
                            break L21;
                          }
                        }
                      }
                      L22: {
                        if (64 > param1) {
                          break L22;
                        } else {
                          if (73 >= param1) {
                            break L19;
                          } else {
                            break L22;
                          }
                        }
                      }
                      if (-81 == (param1 ^ -1)) {
                        break L19;
                      } else {
                        if (param1 == 83) {
                          break L19;
                        } else {
                          if (-85 == (param1 ^ -1)) {
                            break L19;
                          } else {
                            if ((param1 ^ -1) == -86) {
                              break L19;
                            } else {
                              if ((param1 ^ -1) == -60) {
                                break L19;
                              } else {
                                if ((param1 ^ -1) == -75) {
                                  break L19;
                                } else {
                                  if ((param1 ^ -1) != -29) {
                                    stackOut_45_0 = 0;
                                    stackIn_46_0 = stackOut_45_0;
                                    break L18;
                                  } else {
                                    break L19;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    stackOut_44_0 = 1;
                    stackIn_46_0 = stackOut_44_0;
                    break L18;
                  }
                  return stackIn_46_0 != 0;
                }
              } else {
                L23: {
                  L24: {
                    L25: {
                      if (param1 < 32) {
                        break L25;
                      } else {
                        if (-44 <= (param1 ^ -1)) {
                          break L24;
                        } else {
                          break L25;
                        }
                      }
                    }
                    L26: {
                      if (-49 < (param1 ^ -1)) {
                        break L26;
                      } else {
                        if (-59 <= (param1 ^ -1)) {
                          break L24;
                        } else {
                          break L26;
                        }
                      }
                    }
                    L27: {
                      if (64 > param1) {
                        break L27;
                      } else {
                        if (73 >= param1) {
                          break L24;
                        } else {
                          break L27;
                        }
                      }
                    }
                    if (-81 == (param1 ^ -1)) {
                      break L24;
                    } else {
                      if (param1 == 83) {
                        break L24;
                      } else {
                        if (-85 == (param1 ^ -1)) {
                          break L24;
                        } else {
                          if ((param1 ^ -1) == -86) {
                            break L24;
                          } else {
                            if ((param1 ^ -1) == -60) {
                              break L24;
                            } else {
                              if ((param1 ^ -1) == -75) {
                                break L24;
                              } else {
                                if ((param1 ^ -1) != -29) {
                                  stackOut_24_0 = 0;
                                  stackIn_25_0 = stackOut_24_0;
                                  break L23;
                                } else {
                                  break L24;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  stackOut_23_0 = 1;
                  stackIn_25_0 = stackOut_23_0;
                  break L23;
                }
                return stackIn_25_0 != 0;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    static {
    }
}
