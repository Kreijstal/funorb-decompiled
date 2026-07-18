/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class no extends i {
    static int field_F;
    static String field_G;
    static String[] field_K;
    static long field_H;
    static String field_I;
    static byte[] field_J;

    final static int b(int param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        try {
          L0: {
            L1: {
              if (param1 == 15832) {
                break L1;
              } else {
                field_J = null;
                break L1;
              }
            }
            if (param0 >= 0) {
              if (param0 > 65536) {
                stackOut_14_0 = 2048 + -ve.field_T[134217728 / param0];
                stackIn_15_0 = stackOut_14_0;
                break L0;
              } else {
                stackOut_12_0 = ve.field_T[param0 >> 622369765];
                stackIn_13_0 = stackOut_12_0;
                return stackIn_13_0;
              }
            } else {
              if (param0 >= -65536) {
                stackOut_9_0 = -ve.field_T[-param0 >> -1617764283];
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0;
              } else {
                stackOut_7_0 = ve.field_T[134217728 / -param0] + -2048;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var2, "no.E(" + param0 + ',' + param1 + ')');
        }
        return stackIn_15_0;
    }

    final static void g(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              L2: {
                var1_int = -24 % ((param0 - 38) / 56);
                if (1 == ks.field_e) {
                  break L2;
                } else {
                  L3: {
                    if (ks.field_e != 2) {
                      break L3;
                    } else {
                      ps.a(-25246, false, false, false, false, false, true);
                      if (var2 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (3 != ks.field_e) {
                      break L4;
                    } else {
                      ps.a(-25246, true, false, false, false, false, true);
                      if (var2 == 0) {
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (ks.field_e != 4) {
                      break L5;
                    } else {
                      ps.a(-25246, false, false, false, true, false, false);
                      if (var2 == 0) {
                        break L1;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L6: {
                    if (ks.field_e != 5) {
                      break L6;
                    } else {
                      ps.a(-25246, false, false, false, true, false, false);
                      if (var2 == 0) {
                        break L1;
                      } else {
                        break L6;
                      }
                    }
                  }
                  L7: {
                    if (ks.field_e != 6) {
                      break L7;
                    } else {
                      ps.a(-25246, false, false, false, true, false, false);
                      if (var2 == 0) {
                        break L1;
                      } else {
                        break L7;
                      }
                    }
                  }
                  L8: {
                    if (ks.field_e != 7) {
                      break L8;
                    } else {
                      ps.a(-25246, true, true, false, false, false, true);
                      if (var2 == 0) {
                        break L1;
                      } else {
                        break L8;
                      }
                    }
                  }
                  L9: {
                    if (8 != ks.field_e) {
                      break L9;
                    } else {
                      ps.a(-25246, true, true, false, true, false, true);
                      if (var2 == 0) {
                        break L1;
                      } else {
                        break L9;
                      }
                    }
                  }
                  L10: {
                    if (ks.field_e == 9) {
                      break L10;
                    } else {
                      L11: {
                        if (ks.field_e != 10) {
                          break L11;
                        } else {
                          ps.a(-25246, false, false, false, false, true, false);
                          if (var2 == 0) {
                            break L1;
                          } else {
                            break L11;
                          }
                        }
                      }
                      L12: {
                        if (ks.field_e == 11) {
                          break L12;
                        } else {
                          L13: {
                            if (ks.field_e != 12) {
                              break L13;
                            } else {
                              ps.a(-25246, false, false, true, true, false, false);
                              if (var2 == 0) {
                                break L1;
                              } else {
                                break L13;
                              }
                            }
                          }
                          L14: {
                            if (ks.field_e == 13) {
                              break L14;
                            } else {
                              ps.a(-25246, true, true, true, true, true, true);
                              if (var2 == 0) {
                                break L1;
                              } else {
                                break L14;
                              }
                            }
                          }
                          ps.a(-25246, true, true, true, true, false, true);
                          if (var2 == 0) {
                            break L1;
                          } else {
                            break L12;
                          }
                        }
                      }
                      ps.a(-25246, true, true, true, true, false, true);
                      if (var2 == 0) {
                        break L1;
                      } else {
                        break L10;
                      }
                    }
                  }
                  ps.a(-25246, false, false, true, true, false, false);
                  if (var2 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ps.a(-25246, true, false, false, false, false, false);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var1, "no.D(" + param0 + ')');
        }
    }

    final static void a(String[] args, int param1, String param2, int param3) {
        String[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var5 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              mj.field_a = cr.field_d;
              if (param3 == -1) {
                break L1;
              } else {
                int discarded$2 = no.b(-9, -128);
                break L1;
              }
            }
            L2: {
              L3: {
                if (255 != param1) {
                  break L3;
                } else {
                  L4: {
                    if (tn.field_b >= 13) {
                      stackOut_10_0 = 0;
                      stackIn_11_0 = stackOut_10_0;
                      break L4;
                    } else {
                      stackOut_8_0 = 1;
                      stackIn_11_0 = stackOut_8_0;
                      break L4;
                    }
                  }
                  u.field_h = mf.a(stackIn_11_0 != 0, param3 ^ -42);
                  pp.a(param3 ^ -18268, (String[]) null);
                  if (var5 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L5: {
                if (param1 < 100) {
                  break L5;
                } else {
                  if (105 < param1) {
                    break L5;
                  } else {
                    var4 = args;
                    pp.a(18267, var4);
                    u.field_h = wt.a(-117, args);
                    if (var5 == 0) {
                      break L2;
                    } else {
                      break L5;
                    }
                  }
                }
              }
              u.field_h = wb.a(-124, param2, param1);
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4_ref = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var4_ref;
            stackOut_22_1 = new StringBuilder().append("no.C(");
            stackIn_25_0 = stackOut_22_0;
            stackIn_25_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (args == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L6;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_26_2 = stackOut_23_2;
              break L6;
            }
          }
          L7: {
            stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',').append(param1).append(',');
            stackIn_29_0 = stackOut_26_0;
            stackIn_29_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param2 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L7;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_30_0 = stackOut_27_0;
              stackIn_30_1 = stackOut_27_1;
              stackIn_30_2 = stackOut_27_2;
              break L7;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ',' + param3 + ')');
        }
    }

    no() {
        super(9);
        ut var1 = null;
        String var3 = null;
        try {
            var1 = kb.field_E[-1 + kb.field_E.length];
            String var2 = q.field_h[-1 + q.field_h.length];
            var3 = vo.a((byte) -18, gd.field_e[9], new String[1]);
            ((no) this).a(var3, ((no) this).field_t, var1, -117, ((no) this).field_u);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "no.<init>()");
        }
    }

    final void a(int param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            super.a(122, param1);
            if (la.a(100)) {
              return;
            } else {
              L1: {
                if (param0 > 60) {
                  break L1;
                } else {
                  field_K = null;
                  break L1;
                }
              }
              or.field_d.b(78, (byte) 113);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var3, "no.I(" + param0 + ',' + param1 + ')');
        }
    }

    final static ld a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ld stackIn_3_0 = null;
        ld stackIn_8_0 = null;
        Object stackIn_11_0 = null;
        ld stackIn_24_0 = null;
        ld stackIn_29_0 = null;
        Object stackIn_32_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        ld stackOut_7_0 = null;
        ld stackOut_28_0 = null;
        ld stackOut_23_0 = null;
        Object stackOut_31_0 = null;
        Object stackOut_10_0 = null;
        ld stackOut_2_0 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        var5 = Kickabout.field_G;
        try {
          L0: {
            var2_int = param0.length();
            if (var2_int != 0) {
              if (var2_int > 63) {
                stackOut_7_0 = st.field_j;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              } else {
                if (param1 == 134217728) {
                  var3 = 0;
                  L1: while (true) {
                    L2: {
                      if (var3 >= var2_int) {
                        break L2;
                      } else {
                        L3: {
                          var4 = param0.charAt(var3);
                          if (var4 != 45) {
                            if (-1 == qs.field_V.indexOf(var4)) {
                              stackOut_28_0 = lm.field_F;
                              stackIn_29_0 = stackOut_28_0;
                              return stackIn_29_0;
                            } else {
                              break L3;
                            }
                          } else {
                            L4: {
                              if (var3 == 0) {
                                break L4;
                              } else {
                                if (var2_int + -1 == var3) {
                                  break L4;
                                } else {
                                  break L3;
                                }
                              }
                            }
                            stackOut_23_0 = lm.field_F;
                            stackIn_24_0 = stackOut_23_0;
                            return stackIn_24_0;
                          }
                        }
                        var3++;
                        if (var5 == 0) {
                          continue L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                    stackOut_31_0 = null;
                    stackIn_32_0 = stackOut_31_0;
                    break L0;
                  }
                } else {
                  stackOut_10_0 = null;
                  stackIn_11_0 = stackOut_10_0;
                  return (ld) (Object) stackIn_11_0;
                }
              }
            } else {
              stackOut_2_0 = ld.field_b;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) var2;
            stackOut_33_1 = new StringBuilder().append("no.B(");
            stackIn_36_0 = stackOut_33_0;
            stackIn_36_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param0 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L5;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_37_0 = stackOut_34_0;
              stackIn_37_1 = stackOut_34_1;
              stackIn_37_2 = stackOut_34_2;
              break L5;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_37_0, stackIn_37_2 + ',' + param1 + ')');
        }
        return (ld) (Object) stackIn_32_0;
    }

    public static void g(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_I = null;
              field_G = null;
              field_K = null;
              if (param0 == -93) {
                break L1;
              } else {
                no.g((byte) 67);
                break L1;
              }
            }
            field_J = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var1, "no.A(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = new String[]{"Unpacking sound", "Unpacking patches", "Unpacking graphics", "Unpacking menus", "Unpacking lobby", "Unpacking 3D models", "Unpacking animations", "Initialising 3D", "Initialising game components", "Initialising menus", "Initialising HUDs", "Initialising pitch", "Initialising UI", "Initialising client", null};
        field_G = "This password contains your email address, and would be easy to guess";
        field_H = 20000000L;
        field_I = "Game full";
    }
}
