/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class t extends hl {
    static String field_k;
    static int field_n;
    static int[] field_j;
    static int field_l;
    int[] field_m;
    static uf field_i;

    final static boolean a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var4 = HoldTheLine.field_D;
        try {
          L0: {
            var2_int = param0;
            L1: while (true) {
              if (param1.length() <= var2_int) {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L2: {
                  var3 = param1.charAt(var2_int);
                  if (oe.a((char) var3, -125)) {
                    break L2;
                  } else {
                    if (ii.a(48, (char) var3)) {
                      break L2;
                    } else {
                      stackOut_5_0 = 1;
                      stackIn_6_0 = stackOut_5_0;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                }
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var2);
            stackOut_10_1 = new StringBuilder().append("t.B(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    final static void a(String param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param1 < -21) {
                break L1;
              } else {
                t.a(10);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("t.D(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final static boolean a(gn param0, gn param1, byte param2, gn param3) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_85_0 = 0;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        RuntimeException stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        String stackIn_89_2 = null;
        RuntimeException stackIn_90_0 = null;
        StringBuilder stackIn_90_1 = null;
        RuntimeException stackIn_91_0 = null;
        StringBuilder stackIn_91_1 = null;
        RuntimeException stackIn_92_0 = null;
        StringBuilder stackIn_92_1 = null;
        String stackIn_92_2 = null;
        RuntimeException stackIn_93_0 = null;
        StringBuilder stackIn_93_1 = null;
        RuntimeException stackIn_94_0 = null;
        StringBuilder stackIn_94_1 = null;
        RuntimeException stackIn_95_0 = null;
        StringBuilder stackIn_95_1 = null;
        String stackIn_95_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_79_0 = 0;
        int stackOut_84_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_86_0 = null;
        StringBuilder stackOut_86_1 = null;
        RuntimeException stackOut_88_0 = null;
        StringBuilder stackOut_88_1 = null;
        String stackOut_88_2 = null;
        RuntimeException stackOut_87_0 = null;
        StringBuilder stackOut_87_1 = null;
        String stackOut_87_2 = null;
        RuntimeException stackOut_89_0 = null;
        StringBuilder stackOut_89_1 = null;
        RuntimeException stackOut_91_0 = null;
        StringBuilder stackOut_91_1 = null;
        String stackOut_91_2 = null;
        RuntimeException stackOut_90_0 = null;
        StringBuilder stackOut_90_1 = null;
        String stackOut_90_2 = null;
        RuntimeException stackOut_92_0 = null;
        StringBuilder stackOut_92_1 = null;
        RuntimeException stackOut_94_0 = null;
        StringBuilder stackOut_94_1 = null;
        String stackOut_94_2 = null;
        RuntimeException stackOut_93_0 = null;
        StringBuilder stackOut_93_1 = null;
        String stackOut_93_2 = null;
        try {
          L0: {
            if (param0.a((byte) 78)) {
              if (param1.b("font", -121)) {
                if (param1.b("font12", -97)) {
                  if (!param1.b("logo", 51)) {
                    stackOut_11_0 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (param1.b("logo_large", param2 ^ 30)) {
                      if (!param1.b("flag", 64)) {
                        stackOut_18_0 = 0;
                        stackIn_19_0 = stackOut_18_0;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        if (!param1.b("menubar", -109)) {
                          stackOut_22_0 = 0;
                          stackIn_23_0 = stackOut_22_0;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          if (!param1.b("titlebar", 95)) {
                            stackOut_26_0 = 0;
                            stackIn_27_0 = stackOut_26_0;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          } else {
                            if (param1.b("titlebar_divleft", param2 ^ 26)) {
                              if (param1.b("titlebar_divright", param2 ^ 91)) {
                                if (param1.b("courseselect_bar", 115)) {
                                  if (param1.b("locked", -119)) {
                                    if (param1.b("loading", param2 + -227)) {
                                      if (param3.b("basic", -83)) {
                                        L1: {
                                          if (param2 == 111) {
                                            break L1;
                                          } else {
                                            field_i = (uf) null;
                                            break L1;
                                          }
                                        }
                                        L2: {
                                          if (!param1.b("keyboard_space", -98)) {
                                            break L2;
                                          } else {
                                            if (!param1.b("keyboard_esc", param2 ^ 31)) {
                                              break L2;
                                            } else {
                                              if (!param1.b("keyboard_right", 81)) {
                                                break L2;
                                              } else {
                                                if (!param1.b("keyboard_left", param2 ^ 56)) {
                                                  break L2;
                                                } else {
                                                  if (!param1.b("keyboard_down", -92)) {
                                                    break L2;
                                                  } else {
                                                    if (!param1.b("keyboard_up", -103)) {
                                                      break L2;
                                                    } else {
                                                      if (!param1.b("keyboard_enter", 53)) {
                                                        break L2;
                                                      } else {
                                                        if (!param1.b("keyboard_ctrl", param2 + 2)) {
                                                          break L2;
                                                        } else {
                                                          if (!param1.b("keyboard_alt", -109)) {
                                                            break L2;
                                                          } else {
                                                            if (!param1.b("keyboard_tab", -119)) {
                                                              break L2;
                                                            } else {
                                                              if (!param1.b("keyboard_q", 51)) {
                                                                break L2;
                                                              } else {
                                                                if (!param1.b("keyboard_a", -95)) {
                                                                  break L2;
                                                                } else {
                                                                  if (!param1.b("keyboard_x", 86)) {
                                                                    break L2;
                                                                  } else {
                                                                    if (!param1.b("keyboard_c", param2 + -226)) {
                                                                      break L2;
                                                                    } else {
                                                                      if (param1.b("frame", param2 + -191)) {
                                                                        if (param1.b("frame_textured", -111)) {
                                                                          if (!param1.b("tarmac", -95)) {
                                                                            stackOut_73_0 = 0;
                                                                            stackIn_74_0 = stackOut_73_0;
                                                                            decompiledRegionSelector0 = 17;
                                                                            break L0;
                                                                          } else {
                                                                            if (kb.a(16616, 0)) {
                                                                              if (!param1.b("halloween_zombie", param2 + -70)) {
                                                                                stackOut_79_0 = 0;
                                                                                stackIn_80_0 = stackOut_79_0;
                                                                                decompiledRegionSelector0 = 18;
                                                                                break L0;
                                                                              } else {
                                                                                if (param1.b("halloween_blood", 85)) {
                                                                                  stackOut_84_0 = 1;
                                                                                  stackIn_85_0 = stackOut_84_0;
                                                                                  decompiledRegionSelector0 = 20;
                                                                                  break L0;
                                                                                } else {
                                                                                  stackOut_82_0 = 0;
                                                                                  stackIn_83_0 = stackOut_82_0;
                                                                                  decompiledRegionSelector0 = 19;
                                                                                  break L0;
                                                                                }
                                                                              }
                                                                            } else {
                                                                              return true;
                                                                            }
                                                                          }
                                                                        } else {
                                                                          stackOut_69_0 = 0;
                                                                          stackIn_70_0 = stackOut_69_0;
                                                                          decompiledRegionSelector0 = 16;
                                                                          break L0;
                                                                        }
                                                                      } else {
                                                                        stackOut_66_0 = 0;
                                                                        stackIn_67_0 = stackOut_66_0;
                                                                        decompiledRegionSelector0 = 15;
                                                                        break L0;
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                        stackOut_63_0 = 0;
                                        stackIn_64_0 = stackOut_63_0;
                                        decompiledRegionSelector0 = 14;
                                        break L0;
                                      } else {
                                        stackOut_44_0 = 0;
                                        stackIn_45_0 = stackOut_44_0;
                                        decompiledRegionSelector0 = 13;
                                        break L0;
                                      }
                                    } else {
                                      stackOut_41_0 = 0;
                                      stackIn_42_0 = stackOut_41_0;
                                      decompiledRegionSelector0 = 12;
                                      break L0;
                                    }
                                  } else {
                                    stackOut_38_0 = 0;
                                    stackIn_39_0 = stackOut_38_0;
                                    decompiledRegionSelector0 = 11;
                                    break L0;
                                  }
                                } else {
                                  stackOut_35_0 = 0;
                                  stackIn_36_0 = stackOut_35_0;
                                  decompiledRegionSelector0 = 10;
                                  break L0;
                                }
                              } else {
                                stackOut_32_0 = 0;
                                stackIn_33_0 = stackOut_32_0;
                                decompiledRegionSelector0 = 9;
                                break L0;
                              }
                            } else {
                              stackOut_29_0 = 0;
                              stackIn_30_0 = stackOut_29_0;
                              decompiledRegionSelector0 = 8;
                              break L0;
                            }
                          }
                        }
                      }
                    } else {
                      stackOut_14_0 = 0;
                      stackIn_15_0 = stackOut_14_0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                } else {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_86_0 = (RuntimeException) (var4);
            stackOut_86_1 = new StringBuilder().append("t.A(");
            stackIn_88_0 = stackOut_86_0;
            stackIn_88_1 = stackOut_86_1;
            stackIn_87_0 = stackOut_86_0;
            stackIn_87_1 = stackOut_86_1;
            if (param0 == null) {
              stackOut_88_0 = (RuntimeException) ((Object) stackIn_88_0);
              stackOut_88_1 = (StringBuilder) ((Object) stackIn_88_1);
              stackOut_88_2 = "null";
              stackIn_89_0 = stackOut_88_0;
              stackIn_89_1 = stackOut_88_1;
              stackIn_89_2 = stackOut_88_2;
              break L3;
            } else {
              stackOut_87_0 = (RuntimeException) ((Object) stackIn_87_0);
              stackOut_87_1 = (StringBuilder) ((Object) stackIn_87_1);
              stackOut_87_2 = "{...}";
              stackIn_89_0 = stackOut_87_0;
              stackIn_89_1 = stackOut_87_1;
              stackIn_89_2 = stackOut_87_2;
              break L3;
            }
          }
          L4: {
            stackOut_89_0 = (RuntimeException) ((Object) stackIn_89_0);
            stackOut_89_1 = ((StringBuilder) (Object) stackIn_89_1).append(stackIn_89_2).append(',');
            stackIn_91_0 = stackOut_89_0;
            stackIn_91_1 = stackOut_89_1;
            stackIn_90_0 = stackOut_89_0;
            stackIn_90_1 = stackOut_89_1;
            if (param1 == null) {
              stackOut_91_0 = (RuntimeException) ((Object) stackIn_91_0);
              stackOut_91_1 = (StringBuilder) ((Object) stackIn_91_1);
              stackOut_91_2 = "null";
              stackIn_92_0 = stackOut_91_0;
              stackIn_92_1 = stackOut_91_1;
              stackIn_92_2 = stackOut_91_2;
              break L4;
            } else {
              stackOut_90_0 = (RuntimeException) ((Object) stackIn_90_0);
              stackOut_90_1 = (StringBuilder) ((Object) stackIn_90_1);
              stackOut_90_2 = "{...}";
              stackIn_92_0 = stackOut_90_0;
              stackIn_92_1 = stackOut_90_1;
              stackIn_92_2 = stackOut_90_2;
              break L4;
            }
          }
          L5: {
            stackOut_92_0 = (RuntimeException) ((Object) stackIn_92_0);
            stackOut_92_1 = ((StringBuilder) (Object) stackIn_92_1).append(stackIn_92_2).append(',').append(param2).append(',');
            stackIn_94_0 = stackOut_92_0;
            stackIn_94_1 = stackOut_92_1;
            stackIn_93_0 = stackOut_92_0;
            stackIn_93_1 = stackOut_92_1;
            if (param3 == null) {
              stackOut_94_0 = (RuntimeException) ((Object) stackIn_94_0);
              stackOut_94_1 = (StringBuilder) ((Object) stackIn_94_1);
              stackOut_94_2 = "null";
              stackIn_95_0 = stackOut_94_0;
              stackIn_95_1 = stackOut_94_1;
              stackIn_95_2 = stackOut_94_2;
              break L5;
            } else {
              stackOut_93_0 = (RuntimeException) ((Object) stackIn_93_0);
              stackOut_93_1 = (StringBuilder) ((Object) stackIn_93_1);
              stackOut_93_2 = "{...}";
              stackIn_95_0 = stackOut_93_0;
              stackIn_95_1 = stackOut_93_1;
              stackIn_95_2 = stackOut_93_2;
              break L5;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_95_0), stackIn_95_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_12_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_15_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_19_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_23_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_27_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_30_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_33_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_36_0 != 0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_39_0 != 0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_42_0 != 0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_45_0 != 0;
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return stackIn_64_0 != 0;
                                    } else {
                                      if (decompiledRegionSelector0 == 15) {
                                        return stackIn_67_0 != 0;
                                      } else {
                                        if (decompiledRegionSelector0 == 16) {
                                          return stackIn_70_0 != 0;
                                        } else {
                                          if (decompiledRegionSelector0 == 17) {
                                            return stackIn_74_0 != 0;
                                          } else {
                                            if (decompiledRegionSelector0 == 18) {
                                              return stackIn_80_0 != 0;
                                            } else {
                                              if (decompiledRegionSelector0 == 19) {
                                                return stackIn_83_0 != 0;
                                              } else {
                                                return stackIn_85_0 != 0;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    private t() throws Throwable {
        throw new Error();
    }

    public static void a(int param0) {
        field_k = null;
        field_i = null;
        field_j = null;
        if (param0 != 0) {
            field_k = (String) null;
        }
    }

    static {
        field_k = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
    }
}
