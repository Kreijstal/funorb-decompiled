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
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = HoldTheLine.field_D;
        try {
          L0: {
            var2_int = param0;
            L1: while (true) {
              if (param1.length() <= var2_int) {
                stackIn_9_0 = 0;
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
                      stackIn_6_0 = 1;
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
            stackIn_12_0 = (RuntimeException) (var2);

            stackIn_12_1 = new StringBuilder().append("t.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
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
        try {
            if (param1 >= -21) {
                t.a(10);
            }
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "t.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean a(gn param0, gn param1, byte param2, gn param3) {
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
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        RuntimeException stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        String stackIn_89_2 = null;
        StringBuilder stackIn_91_1 = null;
        StringBuilder stackIn_92_1 = null;
        String stackIn_92_2 = null;
        StringBuilder stackIn_94_1 = null;
        StringBuilder stackIn_95_1 = null;
        String stackIn_95_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            if (param0.a((byte) 78)) {
              if (param1.b("font", -121)) {
                if (param1.b("font12", -97)) {
                  if (!param1.b("logo", 51)) {
                    stackIn_12_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (param1.b("logo_large", param2 ^ 30)) {
                      if (!param1.b("flag", 64)) {
                        stackIn_19_0 = 0;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        if (!param1.b("menubar", -109)) {
                          stackIn_23_0 = 0;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          if (!param1.b("titlebar", 95)) {
                            stackIn_27_0 = 0;
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
                                                                            stackIn_74_0 = 0;
                                                                            decompiledRegionSelector0 = 17;
                                                                            break L0;
                                                                          } else {
                                                                            if (kb.a(16616, 0)) {
                                                                              if (!param1.b("halloween_zombie", param2 + -70)) {
                                                                                stackIn_80_0 = 0;
                                                                                decompiledRegionSelector0 = 18;
                                                                                break L0;
                                                                              } else {
                                                                                if (param1.b("halloween_blood", 85)) {
                                                                                  stackIn_85_0 = 1;
                                                                                  decompiledRegionSelector0 = 20;
                                                                                  break L0;
                                                                                } else {
                                                                                  stackIn_83_0 = 0;
                                                                                  decompiledRegionSelector0 = 19;
                                                                                  break L0;
                                                                                }
                                                                              }
                                                                            } else {
                                                                              return true;
                                                                            }
                                                                          }
                                                                        } else {
                                                                          stackIn_70_0 = 0;
                                                                          decompiledRegionSelector0 = 16;
                                                                          break L0;
                                                                        }
                                                                      } else {
                                                                        stackIn_67_0 = 0;
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
                                        stackIn_64_0 = 0;
                                        decompiledRegionSelector0 = 14;
                                        break L0;
                                      } else {
                                        stackIn_45_0 = 0;
                                        decompiledRegionSelector0 = 13;
                                        break L0;
                                      }
                                    } else {
                                      stackIn_42_0 = 0;
                                      decompiledRegionSelector0 = 12;
                                      break L0;
                                    }
                                  } else {
                                    stackIn_39_0 = 0;
                                    decompiledRegionSelector0 = 11;
                                    break L0;
                                  }
                                } else {
                                  stackIn_36_0 = 0;
                                  decompiledRegionSelector0 = 10;
                                  break L0;
                                }
                              } else {
                                stackIn_33_0 = 0;
                                decompiledRegionSelector0 = 9;
                                break L0;
                              }
                            } else {
                              stackIn_30_0 = 0;
                              decompiledRegionSelector0 = 8;
                              break L0;
                            }
                          }
                        }
                      }
                    } else {
                      stackIn_15_0 = 0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                } else {
                  stackIn_8_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_5_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_88_0 = (RuntimeException) (var4);

            stackIn_88_1 = new StringBuilder().append("t.A(");

            if (param0 == null) {
              stackIn_89_0 = (RuntimeException) ((Object) stackIn_88_0);
              stackIn_89_1 = (StringBuilder) ((Object) stackIn_88_1);
              stackIn_89_2 = "null";
              break L3;
            } else {
              stackIn_89_0 = (RuntimeException) ((Object) stackIn_88_0);
              stackIn_89_1 = (StringBuilder) ((Object) stackIn_88_1);
              stackIn_89_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_91_1 = ((StringBuilder) (Object) stackIn_89_1).append(stackIn_89_2).append(',');

            if (param1 == null) {
              stackIn_89_0 = (RuntimeException) ((Object) stackIn_89_0);
              stackIn_92_1 = (StringBuilder) ((Object) stackIn_91_1);
              stackIn_92_2 = "null";
              break L4;
            } else {
              stackIn_89_0 = (RuntimeException) ((Object) stackIn_89_0);
              stackIn_92_1 = (StringBuilder) ((Object) stackIn_91_1);
              stackIn_92_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_94_1 = ((StringBuilder) (Object) stackIn_92_1).append(stackIn_92_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_89_0 = (RuntimeException) ((Object) stackIn_89_0);
              stackIn_95_1 = (StringBuilder) ((Object) stackIn_94_1);
              stackIn_95_2 = "null";
              break L5;
            } else {
              stackIn_89_0 = (RuntimeException) ((Object) stackIn_89_0);
              stackIn_95_1 = (StringBuilder) ((Object) stackIn_94_1);
              stackIn_95_2 = "{...}";
              break L5;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_89_0), stackIn_95_2 + ')');
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
