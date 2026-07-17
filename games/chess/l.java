/*
 * Decompiled by CFR-JS 0.4.0.
 */
class l extends o {
    l field_p;
    static int field_o;
    static int[] field_n;
    l field_m;
    static String field_k;
    static ci field_j;
    long field_l;

    final long a(int param0) {
        if (param0 != 0) {
            return -20L;
        }
        return ((l) this).field_l;
    }

    final static dm a(boolean param0, String param1, byte param2, String param3, long param4) {
        RuntimeException var6 = null;
        sk stackIn_5_0 = null;
        ec stackIn_7_0 = null;
        ph stackIn_11_0 = null;
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
        ec stackOut_6_0 = null;
        ph stackOut_10_0 = null;
        sk stackOut_4_0 = null;
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
            L1: {
              if (param4 != 0L) {
                break L1;
              } else {
                if (param3 != null) {
                  stackOut_6_0 = new ec(param3, param1);
                  stackIn_7_0 = stackOut_6_0;
                  return (dm) (Object) stackIn_7_0;
                } else {
                  break L1;
                }
              }
            }
            if (!param0) {
              L2: {
                if (param2 > 32) {
                  break L2;
                } else {
                  l.a(true, -31, (byte) -69, false);
                  break L2;
                }
              }
              stackOut_10_0 = new ph(param4, param1);
              stackIn_11_0 = stackOut_10_0;
              break L0;
            } else {
              stackOut_4_0 = new sk(param4, param1);
              stackIn_5_0 = stackOut_4_0;
              return (dm) (Object) stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var6;
            stackOut_12_1 = new StringBuilder().append("l.N(").append(param0).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
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
          L4: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44).append(param2).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param4 + 41);
        }
        return (dm) (Object) stackIn_11_0;
    }

    final void d(int param0) {
        if (null != ((l) this).field_m) {
          ((l) this).field_m.field_p = ((l) this).field_p;
          ((l) this).field_p.field_m = ((l) this).field_m;
          ((l) this).field_m = null;
          if (param0 != -1) {
            return;
          } else {
            ((l) this).field_p = null;
            return;
          }
        } else {
          return;
        }
    }

    final static void a(boolean param0, int param1, byte param2, boolean param3) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_39_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_44_1 = 0;
        int stackIn_58_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_63_1 = 0;
        int stackIn_77_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_82_0 = 0;
        int stackIn_82_1 = 0;
        int stackIn_95_0 = 0;
        int stackIn_96_0 = 0;
        int stackIn_97_0 = 0;
        int stackIn_98_0 = 0;
        int stackIn_99_0 = 0;
        int stackIn_100_0 = 0;
        int stackIn_100_1 = 0;
        int stackIn_112_0 = 0;
        int stackIn_113_0 = 0;
        int stackIn_114_0 = 0;
        int stackIn_115_0 = 0;
        int stackIn_116_0 = 0;
        int stackIn_117_0 = 0;
        int stackIn_117_1 = 0;
        int stackOut_111_0 = 0;
        int stackOut_110_0 = 0;
        int stackOut_108_0 = 0;
        int stackOut_112_0 = 0;
        int stackOut_113_0 = 0;
        int stackOut_114_0 = 0;
        int stackOut_115_0 = 0;
        int stackOut_115_1 = 0;
        int stackOut_116_0 = 0;
        int stackOut_116_1 = 0;
        int stackOut_94_0 = 0;
        int stackOut_93_0 = 0;
        int stackOut_91_0 = 0;
        int stackOut_95_0 = 0;
        int stackOut_96_0 = 0;
        int stackOut_97_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_98_1 = 0;
        int stackOut_99_0 = 0;
        int stackOut_99_1 = 0;
        int stackOut_76_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_79_0 = 0;
        int stackOut_80_0 = 0;
        int stackOut_80_1 = 0;
        int stackOut_81_0 = 0;
        int stackOut_81_1 = 0;
        int stackOut_57_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_61_1 = 0;
        int stackOut_62_0 = 0;
        int stackOut_62_1 = 0;
        int stackOut_37_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_42_1 = 0;
        int stackOut_43_0 = 0;
        int stackOut_43_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        var5 = Chess.field_G;
        if (param1 == -1) {
          ki.a(0, param3);
          if (param2 == -86) {
            return;
          } else {
            l.a(true, -111, (byte) 19, true);
            return;
          }
        } else {
          if (param1 == -2) {
            wb.b();
            if (param2 == -86) {
              return;
            } else {
              l.a(true, -111, (byte) 19, true);
              return;
            }
          } else {
            if (!param0) {
              if (0 <= param1) {
                if (ae.field_e.length > param1) {
                  ae.field_e[param1].d((byte) 59);
                  if (param1 != 3) {
                    if (param2 == -86) {
                      return;
                    } else {
                      l.a(true, -111, (byte) 19, true);
                      return;
                    }
                  } else {
                    L0: {
                      if (hj.field_i) {
                        if (!kn.field_L) {
                          stackOut_111_0 = 0;
                          stackIn_112_0 = stackOut_111_0;
                          break L0;
                        } else {
                          stackOut_110_0 = 1;
                          stackIn_112_0 = stackOut_110_0;
                          break L0;
                        }
                      } else {
                        stackOut_108_0 = 0;
                        stackIn_112_0 = stackOut_108_0;
                        break L0;
                      }
                    }
                    L1: {
                      L2: {
                        var4 = stackIn_112_0;
                        stackOut_112_0 = -7093;
                        stackIn_116_0 = stackOut_112_0;
                        stackIn_113_0 = stackOut_112_0;
                        if (!param3) {
                          break L2;
                        } else {
                          stackOut_113_0 = stackIn_113_0;
                          stackIn_116_0 = stackOut_113_0;
                          stackIn_114_0 = stackOut_113_0;
                          if (!ak.a(true)) {
                            break L2;
                          } else {
                            stackOut_114_0 = stackIn_114_0;
                            stackIn_116_0 = stackOut_114_0;
                            stackIn_115_0 = stackOut_114_0;
                            if (var4 != 0) {
                              break L2;
                            } else {
                              stackOut_115_0 = stackIn_115_0;
                              stackOut_115_1 = 1;
                              stackIn_117_0 = stackOut_115_0;
                              stackIn_117_1 = stackOut_115_1;
                              break L1;
                            }
                          }
                        }
                      }
                      stackOut_116_0 = stackIn_116_0;
                      stackOut_116_1 = 0;
                      stackIn_117_0 = stackOut_116_0;
                      stackIn_117_1 = stackOut_116_1;
                      break L1;
                    }
                    jb.a(stackIn_117_0, stackIn_117_1 != 0);
                    if (param2 == -86) {
                      return;
                    } else {
                      l.a(true, -111, (byte) 19, true);
                      return;
                    }
                  }
                } else {
                  if (param1 != 3) {
                    if (param2 == -86) {
                      return;
                    } else {
                      l.a(true, -111, (byte) 19, true);
                      return;
                    }
                  } else {
                    L3: {
                      if (hj.field_i) {
                        if (!kn.field_L) {
                          stackOut_94_0 = 0;
                          stackIn_95_0 = stackOut_94_0;
                          break L3;
                        } else {
                          stackOut_93_0 = 1;
                          stackIn_95_0 = stackOut_93_0;
                          break L3;
                        }
                      } else {
                        stackOut_91_0 = 0;
                        stackIn_95_0 = stackOut_91_0;
                        break L3;
                      }
                    }
                    L4: {
                      L5: {
                        var4 = stackIn_95_0;
                        stackOut_95_0 = -7093;
                        stackIn_99_0 = stackOut_95_0;
                        stackIn_96_0 = stackOut_95_0;
                        if (!param3) {
                          break L5;
                        } else {
                          stackOut_96_0 = stackIn_96_0;
                          stackIn_99_0 = stackOut_96_0;
                          stackIn_97_0 = stackOut_96_0;
                          if (!ak.a(true)) {
                            break L5;
                          } else {
                            stackOut_97_0 = stackIn_97_0;
                            stackIn_99_0 = stackOut_97_0;
                            stackIn_98_0 = stackOut_97_0;
                            if (var4 != 0) {
                              break L5;
                            } else {
                              stackOut_98_0 = stackIn_98_0;
                              stackOut_98_1 = 1;
                              stackIn_100_0 = stackOut_98_0;
                              stackIn_100_1 = stackOut_98_1;
                              break L4;
                            }
                          }
                        }
                      }
                      stackOut_99_0 = stackIn_99_0;
                      stackOut_99_1 = 0;
                      stackIn_100_0 = stackOut_99_0;
                      stackIn_100_1 = stackOut_99_1;
                      break L4;
                    }
                    jb.a(stackIn_100_0, stackIn_100_1 != 0);
                    if (param2 == -86) {
                      return;
                    } else {
                      l.a(true, -111, (byte) 19, true);
                      return;
                    }
                  }
                }
              } else {
                if (param1 != 3) {
                  if (param2 == -86) {
                    return;
                  } else {
                    l.a(true, -111, (byte) 19, true);
                    return;
                  }
                } else {
                  L6: {
                    if (hj.field_i) {
                      if (!kn.field_L) {
                        stackOut_76_0 = 0;
                        stackIn_77_0 = stackOut_76_0;
                        break L6;
                      } else {
                        stackOut_75_0 = 1;
                        stackIn_77_0 = stackOut_75_0;
                        break L6;
                      }
                    } else {
                      stackOut_73_0 = 0;
                      stackIn_77_0 = stackOut_73_0;
                      break L6;
                    }
                  }
                  L7: {
                    L8: {
                      var4 = stackIn_77_0;
                      stackOut_77_0 = -7093;
                      stackIn_81_0 = stackOut_77_0;
                      stackIn_78_0 = stackOut_77_0;
                      if (!param3) {
                        break L8;
                      } else {
                        stackOut_78_0 = stackIn_78_0;
                        stackIn_81_0 = stackOut_78_0;
                        stackIn_79_0 = stackOut_78_0;
                        if (!ak.a(true)) {
                          break L8;
                        } else {
                          stackOut_79_0 = stackIn_79_0;
                          stackIn_81_0 = stackOut_79_0;
                          stackIn_80_0 = stackOut_79_0;
                          if (var4 != 0) {
                            break L8;
                          } else {
                            stackOut_80_0 = stackIn_80_0;
                            stackOut_80_1 = 1;
                            stackIn_82_0 = stackOut_80_0;
                            stackIn_82_1 = stackOut_80_1;
                            break L7;
                          }
                        }
                      }
                    }
                    stackOut_81_0 = stackIn_81_0;
                    stackOut_81_1 = 0;
                    stackIn_82_0 = stackOut_81_0;
                    stackIn_82_1 = stackOut_81_1;
                    break L7;
                  }
                  jb.a(stackIn_82_0, stackIn_82_1 != 0);
                  if (param2 == -86) {
                    return;
                  } else {
                    l.a(true, -111, (byte) 19, true);
                    return;
                  }
                }
              }
            } else {
              ki.a(0, false);
              wb.g(0, 0, 640, 480);
              if (0 <= param1) {
                if (ae.field_e.length > param1) {
                  ae.field_e[param1].d((byte) 59);
                  if (param1 != 3) {
                    if (param2 == -86) {
                      return;
                    } else {
                      l.a(true, -111, (byte) 19, true);
                      return;
                    }
                  } else {
                    L9: {
                      if (hj.field_i) {
                        if (!kn.field_L) {
                          stackOut_57_0 = 0;
                          stackIn_58_0 = stackOut_57_0;
                          break L9;
                        } else {
                          stackOut_56_0 = 1;
                          stackIn_58_0 = stackOut_56_0;
                          break L9;
                        }
                      } else {
                        stackOut_54_0 = 0;
                        stackIn_58_0 = stackOut_54_0;
                        break L9;
                      }
                    }
                    L10: {
                      L11: {
                        var4 = stackIn_58_0;
                        stackOut_58_0 = -7093;
                        stackIn_62_0 = stackOut_58_0;
                        stackIn_59_0 = stackOut_58_0;
                        if (!param3) {
                          break L11;
                        } else {
                          stackOut_59_0 = stackIn_59_0;
                          stackIn_62_0 = stackOut_59_0;
                          stackIn_60_0 = stackOut_59_0;
                          if (!ak.a(true)) {
                            break L11;
                          } else {
                            stackOut_60_0 = stackIn_60_0;
                            stackIn_62_0 = stackOut_60_0;
                            stackIn_61_0 = stackOut_60_0;
                            if (var4 != 0) {
                              break L11;
                            } else {
                              stackOut_61_0 = stackIn_61_0;
                              stackOut_61_1 = 1;
                              stackIn_63_0 = stackOut_61_0;
                              stackIn_63_1 = stackOut_61_1;
                              break L10;
                            }
                          }
                        }
                      }
                      stackOut_62_0 = stackIn_62_0;
                      stackOut_62_1 = 0;
                      stackIn_63_0 = stackOut_62_0;
                      stackIn_63_1 = stackOut_62_1;
                      break L10;
                    }
                    jb.a(stackIn_63_0, stackIn_63_1 != 0);
                    if (param2 == -86) {
                      return;
                    } else {
                      l.a(true, -111, (byte) 19, true);
                      return;
                    }
                  }
                } else {
                  if (param1 != 3) {
                    if (param2 != -86) {
                      l.a(true, -111, (byte) 19, true);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    L12: {
                      if (hj.field_i) {
                        if (kn.field_L) {
                          stackOut_37_0 = 1;
                          stackIn_39_0 = stackOut_37_0;
                          break L12;
                        } else {
                          stackOut_36_0 = 0;
                          stackIn_39_0 = stackOut_36_0;
                          break L12;
                        }
                      } else {
                        stackOut_34_0 = 0;
                        stackIn_39_0 = stackOut_34_0;
                        break L12;
                      }
                    }
                    L13: {
                      L14: {
                        var4 = stackIn_39_0;
                        stackOut_39_0 = -7093;
                        stackIn_43_0 = stackOut_39_0;
                        stackIn_40_0 = stackOut_39_0;
                        if (!param3) {
                          break L14;
                        } else {
                          stackOut_40_0 = stackIn_40_0;
                          stackIn_43_0 = stackOut_40_0;
                          stackIn_41_0 = stackOut_40_0;
                          if (!ak.a(true)) {
                            break L14;
                          } else {
                            stackOut_41_0 = stackIn_41_0;
                            stackIn_43_0 = stackOut_41_0;
                            stackIn_42_0 = stackOut_41_0;
                            if (var4 != 0) {
                              break L14;
                            } else {
                              stackOut_42_0 = stackIn_42_0;
                              stackOut_42_1 = 1;
                              stackIn_44_0 = stackOut_42_0;
                              stackIn_44_1 = stackOut_42_1;
                              break L13;
                            }
                          }
                        }
                      }
                      stackOut_43_0 = stackIn_43_0;
                      stackOut_43_1 = 0;
                      stackIn_44_0 = stackOut_43_0;
                      stackIn_44_1 = stackOut_43_1;
                      break L13;
                    }
                    L15: {
                      jb.a(stackIn_44_0, stackIn_44_1 != 0);
                      if (param2 == -86) {
                        break L15;
                      } else {
                        l.a(true, -111, (byte) 19, true);
                        break L15;
                      }
                    }
                    return;
                  }
                }
              } else {
                if (param1 == 3) {
                  if (hj.field_i) {
                    L16: {
                      if (!kn.field_L) {
                        stackOut_21_0 = 0;
                        stackIn_22_0 = stackOut_21_0;
                        break L16;
                      } else {
                        stackOut_20_0 = 1;
                        stackIn_22_0 = stackOut_20_0;
                        break L16;
                      }
                    }
                    L17: {
                      L18: {
                        var4 = stackIn_22_0;
                        stackOut_22_0 = -7093;
                        stackIn_26_0 = stackOut_22_0;
                        stackIn_23_0 = stackOut_22_0;
                        if (!param3) {
                          break L18;
                        } else {
                          stackOut_23_0 = stackIn_23_0;
                          stackIn_26_0 = stackOut_23_0;
                          stackIn_24_0 = stackOut_23_0;
                          if (!ak.a(true)) {
                            break L18;
                          } else {
                            stackOut_24_0 = stackIn_24_0;
                            stackIn_26_0 = stackOut_24_0;
                            stackIn_25_0 = stackOut_24_0;
                            if (var4 != 0) {
                              break L18;
                            } else {
                              stackOut_25_0 = stackIn_25_0;
                              stackOut_25_1 = 1;
                              stackIn_27_0 = stackOut_25_0;
                              stackIn_27_1 = stackOut_25_1;
                              break L17;
                            }
                          }
                        }
                      }
                      stackOut_26_0 = stackIn_26_0;
                      stackOut_26_1 = 0;
                      stackIn_27_0 = stackOut_26_0;
                      stackIn_27_1 = stackOut_26_1;
                      break L17;
                    }
                    jb.a(stackIn_27_0, stackIn_27_1 != 0);
                    if (param2 != -86) {
                      l.a(true, -111, (byte) 19, true);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    L19: {
                      L20: {
                        var4 = 0;
                        stackOut_10_0 = -7093;
                        stackIn_14_0 = stackOut_10_0;
                        stackIn_11_0 = stackOut_10_0;
                        if (!param3) {
                          break L20;
                        } else {
                          stackOut_11_0 = stackIn_11_0;
                          stackIn_14_0 = stackOut_11_0;
                          stackIn_12_0 = stackOut_11_0;
                          if (!ak.a(true)) {
                            break L20;
                          } else {
                            stackOut_12_0 = stackIn_12_0;
                            stackIn_14_0 = stackOut_12_0;
                            stackIn_13_0 = stackOut_12_0;
                            if (var4 != 0) {
                              break L20;
                            } else {
                              stackOut_13_0 = stackIn_13_0;
                              stackOut_13_1 = 1;
                              stackIn_15_0 = stackOut_13_0;
                              stackIn_15_1 = stackOut_13_1;
                              break L19;
                            }
                          }
                        }
                      }
                      stackOut_14_0 = stackIn_14_0;
                      stackOut_14_1 = 0;
                      stackIn_15_0 = stackOut_14_0;
                      stackIn_15_1 = stackOut_14_1;
                      break L19;
                    }
                    jb.a(stackIn_15_0, stackIn_15_1 != 0);
                    if (param2 != -86) {
                      l.a(true, -111, (byte) 19, true);
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  if (param2 != -86) {
                    l.a(true, -111, (byte) 19, true);
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        }
    }

    final void a(long param0, byte param1) {
        if (null != ((l) this).field_m) {
          throw new RuntimeException();
        } else {
          ((l) this).field_l = param0;
          if (param1 != 71) {
            ((l) this).field_l = -17L;
            return;
          } else {
            return;
          }
        }
    }

    public static void c(byte param0) {
        field_n = null;
        field_j = null;
        if (param0 > -24) {
            l.c((byte) 50);
            field_k = null;
            return;
        }
        field_k = null;
    }

    final boolean e(int param0) {
        if (!(((l) this).field_m != null)) {
            return false;
        }
        if (param0 != -4) {
            return false;
        }
        return true;
    }

    protected l() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new int[8192];
        field_k = "White in check";
    }
}
